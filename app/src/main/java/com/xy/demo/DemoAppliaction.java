package com.xy.demo;

import android.app.Application;

import com.bun.miitmdid.core.JLibrary;

public class DemoAppliaction extends Application {
    private final MsaHelper helper = new MsaHelper();

    @Override
    public void onCreate() {
        super.onCreate();
        try {
            JLibrary.InitEntry(this.getApplicationContext());
            helper.getDeviceIds(this.getApplicationContext());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
