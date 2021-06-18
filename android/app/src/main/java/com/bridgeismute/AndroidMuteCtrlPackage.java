package com.bridgeismute;

import androidx.annotation.NonNull;

import com.facebook.react.ReactPackage;
import com.facebook.react.bridge.NativeModule;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.uimanager.ViewManager;

import java.util.ArrayList;
import java.util.List;

public class AndroidMuteCtrlPackage implements ReactPackage {
    @NonNull
    @org.jetbrains.annotations.NotNull
    @Override
    public List<NativeModule> createNativeModules(@NonNull @org.jetbrains.annotations.NotNull ReactApplicationContext reactContext) {
        List<NativeModule> modules = new ArrayList<>();
        modules.add(new AndroidMuteCtrlBridge(reactContext));
        return modules;
    }

    @NonNull
    @org.jetbrains.annotations.NotNull
    @Override
    public List<ViewManager> createViewManagers(@NonNull @org.jetbrains.annotations.NotNull ReactApplicationContext reactContext) {
        return null;
    }
}
