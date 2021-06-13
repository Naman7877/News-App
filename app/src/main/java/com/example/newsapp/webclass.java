package com.example.newsapp;

import android.view.KeyEvent;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class webclass extends WebViewClient {
    @Override
    public boolean shouldOverrideUrlLoading(WebView view, String url) {
        view.loadUrl(url);
        return true;
    }
}
