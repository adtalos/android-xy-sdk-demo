package com.xy.demo;

import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

import com.xy.sdk.Controller;
import com.xy.sdk.LandingPageActivity;
import com.xy.sdk.SDK;

public class MainActivity extends AppCompatActivity {

    // 开屏广告
    private final Controller splash = new Controller("5C3DD65A809B08A2D6CF3DEFBC7E09C7", Controller.SPLASH);
    // 插屏广告
    private final Controller interstitial = new Controller("2EF810225D10260506CBB704C96C5325", Controller.INTERSTITIAL);
    // 激励视频广告
    private final Controller rewardedVideo = new Controller("527E187C5DEA600C35309759469ADAA8", Controller.REWARDED_VIDEO);

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        // 请求广告 SDK 需要的权限
        SDK.requestPermissions(this);

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

        Button bannerTestButton = findViewById(R.id.banner_test_button);
        bannerTestButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent();
                intent.setClass(MainActivity.this, BannerActivity.class);
                startActivity(intent);
            }
        });

        Button nativeTestButton = findViewById(R.id.native_test_button);
        nativeTestButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent();
                intent.setClass(MainActivity.this, NativeActivity.class);
                startActivity(intent);
            }
        });
        
        // 设置插屏广告事件（非必须）
        interstitial.setListener(DemoListener.instance);
        interstitial.setVideoListener(DemoListener.instance);
        interstitial.setDefaultCustomListener(DemoListener.instance);

        // 设置插屏广告以非沉浸模式显示（根据 app 需要设置）
        interstitial.setImmersiveMode(false);

        Button interstitialTestButton = findViewById(R.id.interstitial_test_button);
        interstitialTestButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // 显示插屏广告
                interstitial.show();
            }
        });

        // 设置激励视频广告事件（非必须）
        rewardedVideo.setListener(DemoListener.instance);
        rewardedVideo.setVideoListener(DemoListener.instance);
        rewardedVideo.setDefaultCustomListener(DemoListener.instance);

        Button rewardedVideoTestButton = findViewById(R.id.rewarded_video_test_button);
        rewardedVideoTestButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // 显示激励视频广告
                rewardedVideo.show();
            }
        });

    }
}
