package com.xy.demo;

import android.content.Intent;
import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

import com.xy.sdk.Controller;
import com.xy.sdk.LandingPageActivity;
import com.xy.sdk.SDK;

public class MainActivity extends AppCompatActivity {

    // 插屏广告
    private final Controller interstitial = new Controller("C28BE5F062F476CC0C73C4F0ED333A72", Controller.INTERSTITIAL);
    // 激励视频广告
    private final Controller rewardedVideo = new Controller("527E187C5DEA600C35309759469ADAA8", Controller.REWARDED_VIDEO);

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        // 请求广告 SDK 需要的权限
        SDK.requestPermissions(this);

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
