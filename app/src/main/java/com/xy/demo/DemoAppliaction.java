package com.xy.demo;

import android.app.Application;

import com.bun.miitmdid.core.JLibrary;

public class DemoAppliaction extends Application {
    private final MiitHelper helper = new MiitHelper();

    @Override
    public void onCreate() {
        super.onCreate();
        JLibrary.InitEntry(this.getApplicationContext());
        helper.getDeviceIds(this.getApplicationContext());
    }
}
