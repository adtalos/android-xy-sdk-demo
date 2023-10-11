package com.xy.demo;

import android.os.Bundle;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import com.xy.sdk.SDK;

public class BannerActivity extends AppCompatActivity {
    private com.xy.sdk.View topBannerView;
    private com.xy.sdk.View bottomBannerView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_banner);
        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        // 获取横幅广告
        topBannerView = findViewById(R.id.top_banner_view);
        // 设置定时轮转模式开启
        topBannerView.setCarouselModeEnabled(true);
        // 设置轮转动画开启
        topBannerView.setAnimationEnabled(true);
        // 设置事件
        topBannerView.setListener(DemoListener.instance);

        bottomBannerView = findViewById(R.id.bottom_banner_view);
        bottomBannerView.setListener(DemoListener.instance);
        // 手动加载广告
        bottomBannerView.load("96753DCF925E8DC7C105B3D3ED1138EA");
        TextView textContent = findViewById(R.id.text_content);
        textContent.setText("oaid: " + SDK.getOAID());
    }

    @Override
    protected void onDestroy() {
        topBannerView.destroy();
        bottomBannerView.destroy();
        super.onDestroy();
    }

    @Override
    protected void onPause() {
        topBannerView.pause();
        bottomBannerView.pause();
        super.onPause();
    }

    @Override
    protected void onResume() {
        topBannerView.resume();
        bottomBannerView.resume();
        super.onResume();
    }
}
