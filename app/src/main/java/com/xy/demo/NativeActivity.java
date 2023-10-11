package com.xy.demo;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

public class NativeActivity extends AppCompatActivity {

    private com.xy.sdk.View nativeView;
    private com.xy.sdk.View nativeView1;
    private com.xy.sdk.View nativeView2;
    private com.xy.sdk.View nativeView3;
    private com.xy.sdk.View nativeView4;
    private com.xy.sdk.View nativeView5;
    private com.xy.sdk.View nativeView6;
    private com.xy.sdk.View nativeView7;
    private com.xy.sdk.View nativeView8;
    private com.xy.sdk.View nativeView9;
    private com.xy.sdk.View nativeView10;
    private com.xy.sdk.View nativeView11;
    private com.xy.sdk.View nativeView12;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_native);
        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        nativeView = findViewById(R.id.native_view);
        nativeView.setListener(DemoListener.instance);
        nativeView.getVideoController().setVideoListener(DemoListener.instance);
        nativeView1 = findViewById(R.id.native_view1);
        nativeView1.setListener(DemoListener.instance);
        nativeView1.getVideoController().setVideoListener(DemoListener.instance);
        nativeView2 = findViewById(R.id.native_view2);
        nativeView2.setListener(DemoListener.instance);
        nativeView2.getVideoController().setVideoListener(DemoListener.instance);
        nativeView3 = findViewById(R.id.native_view3);
        nativeView3.setListener(DemoListener.instance);
        nativeView3.getVideoController().setVideoListener(DemoListener.instance);
        nativeView4 = findViewById(R.id.native_view4);
        nativeView4.setListener(DemoListener.instance);
        nativeView4.getVideoController().setVideoListener(DemoListener.instance);
        nativeView5 = findViewById(R.id.native_view5);
        nativeView5.setListener(DemoListener.instance);
        nativeView5.getVideoController().setVideoListener(DemoListener.instance);
        nativeView6 = findViewById(R.id.native_view6);
        nativeView6.setListener(DemoListener.instance);
        nativeView6.getVideoController().setVideoListener(DemoListener.instance);
        nativeView7 = findViewById(R.id.native_view7);
        nativeView7.setListener(DemoListener.instance);
        nativeView7.getVideoController().setVideoListener(DemoListener.instance);
        nativeView8 = findViewById(R.id.native_view8);
        nativeView8.setListener(DemoListener.instance);
        nativeView8.getVideoController().setVideoListener(DemoListener.instance);
        nativeView9 = findViewById(R.id.native_view9);
        nativeView9.setListener(DemoListener.instance);
        nativeView9.getVideoController().setVideoListener(DemoListener.instance);
        nativeView10 = findViewById(R.id.native_view10);
        nativeView10.setListener(DemoListener.instance);
        nativeView10.getVideoController().setVideoListener(DemoListener.instance);
        nativeView11 = findViewById(R.id.native_view11);
        nativeView11.setListener(DemoListener.instance);
        nativeView11.getVideoController().setVideoListener(DemoListener.instance);
        nativeView12 = findViewById(R.id.native_view12);
        nativeView12.setListener(DemoListener.instance);
        nativeView12.getVideoController().setVideoListener(DemoListener.instance);
    }

    @Override
    protected void onDestroy() {
        nativeView.destroy();
        nativeView1.destroy();
        nativeView2.destroy();
        nativeView3.destroy();
        nativeView4.destroy();
        nativeView5.destroy();
        nativeView6.destroy();
        nativeView7.destroy();
        nativeView8.destroy();
        nativeView9.destroy();
        nativeView10.destroy();
        nativeView11.destroy();
        nativeView12.destroy();
        super.onDestroy();
    }

    @Override
    protected void onPause() {
        nativeView.pause();
        nativeView1.pause();
        nativeView2.pause();
        nativeView3.pause();
        nativeView4.pause();
        nativeView5.pause();
        nativeView6.pause();
        nativeView7.pause();
        nativeView8.pause();
        nativeView9.pause();
        nativeView10.pause();
        nativeView11.pause();
        nativeView12.pause();
        super.onPause();
    }

    @Override
    protected void onResume() {
        nativeView.resume();
        nativeView1.resume();
        nativeView2.resume();
        nativeView3.resume();
        nativeView4.resume();
        nativeView5.resume();
        nativeView6.resume();
        nativeView7.resume();
        nativeView8.resume();
        nativeView9.resume();
        nativeView10.resume();
        nativeView11.resume();
        nativeView12.resume();
        super.onResume();
    }
}
