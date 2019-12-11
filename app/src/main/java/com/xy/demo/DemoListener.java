package com.xy.demo;

import android.util.Log;

import com.xy.sdk.DefaultCustomListener;
import com.xy.sdk.Listener;
import com.xy.sdk.VideoController;
import com.xy.sdk.VideoListener;

public class DemoListener implements Listener, VideoListener, DefaultCustomListener {
    public static final DemoListener instance = new DemoListener();

    @Override
    public void onRendered() {
        Log.d("DemoListener", "onRendered");
    }

    @Override
    public void onImpressionFinished() {
        Log.d("DemoListener", "onImpressionFinished");
    }

    @Override
    public void onImpressionFailed() {
        Log.d("DemoListener", "onImpressionFailed");
    }

    @Override
    public void onImpressionReceivedError(int errorCode, String description) {
        Log.d("DemoListener", "onImpressionReceivedError: " + errorCode + ":" + description);
    }

    @Override
    public void onLoaded() {
        Log.d("DemoListener", "onLoaded");
    }

    @Override
    public void onFailedToLoad(Exception e) {
        Log.d("DemoListener", "onFailedToLoad:" + Log.getStackTraceString(e));
    }

    @Override
    public void onOpened() {
        Log.d("DemoListener", "onOpened");
    }

    @Override
    public void onClicked() {
        Log.d("DemoListener", "onClicked");
    }

    @Override
    public void onLeftApplication() {
        Log.d("DemoListener", "onLeftApplication");
    }

    @Override
    public void onClosed() {
        Log.d("DemoListener", "onClosed");
    }

    @Override
    public void onVideoLoad(VideoController.Metadata metadata) {
        Log.d("DemoListener", "VideoLoad: " + metadata.getDuration());
    }

    @Override
    public void onVideoStart() {
        Log.d("DemoListener", "onVideoStart");
    }

    @Override
    public void onVideoPlay() {
        Log.d("DemoListener", "onVideoPlay");
    }

    @Override
    public void onVideoPause() {
        Log.d("DemoListener", "onVideoPause");
    }

    @Override
    public void onVideoEnd() {
        Log.d("DemoListener", "onVideoEnd");
    }

    @Override
    public void onVideoVolumeChange(double volume, boolean muted) {
        Log.d("DemoListener", "onVideoVolumeChange: " + volume + ", " + (muted ? "muted" : "unmuted"));
    }

    @Override
    public void onVideoTimeUpdate(double currentTime, double duration) {
        Log.d("DemoListener", "onVideoTimeUpdate: " + (currentTime / duration) * 100 + "%");
    }

    @Override
    public void onVideoError() {
        Log.d("DemoListener", "onVideoError");
    }

    @Override
    public void onVideoBreak() {
        Log.d("DemoListener", "onVideoBreak");
    }

    @Override
    public void on(String name, String value) {
        Log.d("DemoListener", "onCustomEvent: " + name + ", value: " + value);
    }
}
