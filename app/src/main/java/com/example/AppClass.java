package com.example;

import android.app.Application;
import android.webkit.WebView;

public class AppClass extends Application {
    @Override
    public void onCreate() {
        super.onCreate();
        try {
            new WebView(this).destroy();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
