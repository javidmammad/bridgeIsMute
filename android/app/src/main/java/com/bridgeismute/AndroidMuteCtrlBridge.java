package com.bridgeismute;

import com.facebook.react.bridge.Callback;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;

public  class AndroidMuteCtrlBridge extends ReactContextBaseJavaModule {
    private static ReactApplicationContext reactContext;

    AndroidMuteCtrlBridge(ReactApplicationContext context){
        super(context);
        reactContext = context;
    }

    @ReactMethod
    public void isMuted(Callback reactFunc){
        AndroidMuteCtrl androidMuteCtrl = new AndroidMuteCtrl(reactContext);
        boolean bool = androidMuteCtrl.isMuted();
        reactFunc.invoke(bool);
    }

    @Override
    public  String getName() {
        return "AndroidMuteCtrlBridge";
    }
};
