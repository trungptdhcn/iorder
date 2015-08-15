package com.gmc.iorder.base;

import android.app.Application;

/**
 * Created by Trung on 5/30/2015.
 */
public class MyApplication extends Application
{

    @Override
    public void onCreate()
    {
        super.onCreate();
        FontsOverride.setDefaultFont(this, "SERIF", "mangatb.ttf");
//        FontsOverride.setDefaultFont(this, "MONOSPACE", "droidsans-bold.ttf");
    }
}
