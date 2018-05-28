package com.hongyun.cordova.livecloud.app;

import android.app.Application;
import android.content.Context;
import android.support.multidex.MultiDex;

import com.duanqu.qupai.jni.ApplicationGlue;

/**
 * Created by administrator on 2016/6/13.
 */
public class App extends Application {

    @Override
    protected void attachBaseContext(Context base) {
        super.attachBaseContext(base);
        MultiDex.install(this);
    }

    @Override
    public void onCreate() {
        super.onCreate();
        System.loadLibrary("gnustl_shared");
//        System.loadLibrary("ijkffmpeg");//目前使用微博的ijkffmpeg会出现1K再换wifi不重连的情况
        System.loadLibrary("qupai-media-thirdparty");
//        System.loadLibrary("alivc-media-jni");
        System.loadLibrary("qupai-media-jni");
        ApplicationGlue.initialize(this);
    }
}
