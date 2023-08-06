import 'dart:io';

import 'package:flutter/material.dart';
import 'dart:async';
import 'package:flutter/services.dart';
import 'package:pax_sdk/PaxSdkPlugin.g.dart';
import 'package:pax_sdk/pax_sdk.dart';

void main() {
  runApp(const MyApp());
}

class MyApp extends StatefulWidget {
  const MyApp({Key? key}) : super(key: key);

  @override
  State<MyApp> createState() => _MyAppState();
}

class _MyAppState extends State<MyApp> {
  String _platformVersion = 'Unknown';

  @override
  void initState() {
    super.initState();
    initPlatformState();
  }

  // Platform messages are asynchronous, so we initialize in an async method.
  Future<void> initPlatformState() async {
    String platformVersion;
    // Platform messages may fail, so we use a try/catch PlatformException.
    // We also handle the message potentially returning null.
    try {
      platformVersion =
          await PaxSdk.platformVersion ?? 'Unknown platform version';
    } on PlatformException {
      platformVersion = 'Failed to get platform version.';
    }

    // If the widget was removed from the tree while the asynchronous platform
    // message was in flight, we want to discard the reply rather than calling
    // setState to update our non-existent appearance.
    if (!mounted) return;

    setState(() {
      _platformVersion = platformVersion;
    });
  }

  @override
  Widget build(BuildContext context) {
    return MaterialApp(
      home: Scaffold(
        appBar: AppBar(
          title: const Text('Plugin example app'),
        ),
        body: Scaffold(
          body: Center(
            child: Text('Running on: $_platformVersion\n'),
          ),
          floatingActionButton: (Row(
            children: [
              const Spacer(),
              FloatingActionButton(onPressed: () async{
                PrinterRequest printRequest = PrinterRequest(
                  formatPrintStr: generateReceipt(new PaymentResponse()),
                  cutMode: -1,
                );
                ProcessResult processResult = await PaxPosApi().print(printRequest);
                print(processResult);
              },
              child: const Icon(Icons.print)),
              const Spacer(),
              FloatingActionButton(onPressed: () async{
                PaymentRequest paymentRequest = PaymentRequest(
                  Amount: "1000",
                  ContinuousScreen: "0",
                  TenderType: 1,
                  TransType: 2,
                  ECRRefNum: "1"
                );
                PaymentResponse paymentResponse = await PaxPosApi().charge(paymentRequest);
                print(paymentResponse);
              },
                  child: const Icon(Icons.credit_card)),
              const Spacer(),
              FloatingActionButton(onPressed: () async {
                ScanResult scanResult = await PaxPosApi().Scan();
                print(scanResult);
              },
                  child: const Icon(Icons.camera_alt)),
              const Spacer(),
              FloatingActionButton(onPressed: () async{
                ScanResult scanResult = await PaxPosApi().ScanHW();
                print(scanResult);
              },
              child: const Icon(Icons.scanner),),

            ],
          )),
        ),
      ),
    );
  }

  String generateReceipt(PaymentResponse pr){
    return "\\L Date: ${pr == null? getDate(): pr.Timestamp} \\R Time:${getTime()} \n"
        "\c";
  }

  String getDate(){
    return "${DateTime.now().day}/${DateTime.now().month}/${DateTime.now().year}";
  }

  String getTime(){
    return "${DateTime.now().hour} : ${DateTime.now().minute}";
  }
}
