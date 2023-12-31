
import 'dart:async';

import 'package:flutter/services.dart';

class PaxSdk {
  static const MethodChannel _channel = MethodChannel('pax_sdk');

  static Future<String?> get platformVersion async {
    final String? version = await _channel.invokeMethod('getPlatformVersion');
    return version;
  }
}
