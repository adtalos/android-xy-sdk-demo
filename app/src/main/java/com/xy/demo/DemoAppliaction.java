package com.xy.demo;

import android.app.Application;
import android.content.pm.ActivityInfo;

import com.bun.miitmdid.core.JLibrary;
import com.xy.sdk.Controller;
import com.xy.sdk.LandingPageActivity;
import com.xy.sdk.SDK;

public class DemoAppliaction extends Application {
    private final MsaHelper helper = new MsaHelper();
    // 开屏广告
    private final Controller splash = new Controller("5C3DD65A809B08A2D6CF3DEFBC7E09C7", Controller.SPLASH);

    @Override
    public void onCreate() {
        super.onCreate();
        try {
            JLibrary.InitEntry(this.getApplicationContext());
            helper.getDeviceIds(this.getApplicationContext());

            // 设置广告落地页显示导航按钮工具栏
            LandingPageActivity.setDisplayActionBarEnabled(true);

            // 设置广告落地页是否使用换页动画效果
            LandingPageActivity.setAnimationEnabled(true);

            // 设置广告落地页是否全屏显示
            LandingPageActivity.setFullScreenEnabled(true);

            // 设置广告落地页显示方向
            LandingPageActivity.setOrientation(ActivityInfo.SCREEN_ORIENTATION_PORTRAIT);
            // 设置开屏广告事件（非必须）
            splash.setListener(DemoListener.instance);
            splash.setVideoListener(DemoListener.instance);
            splash.setDefaultCustomListener(DemoListener.instance);

            // 显示开屏广告
            splash.show();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
