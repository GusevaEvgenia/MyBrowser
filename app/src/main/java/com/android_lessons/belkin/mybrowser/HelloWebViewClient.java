package com.android_lessons.belkin.mybrowser;

import android.webkit.WebView;
import android.webkit.WebViewClient;

/**
 * Created by Belkin on 07.04.2015.
 */
public class HelloWebViewClient extends WebViewClient
{
    @Override
    public boolean shouldOverrideUrlLoading(WebView view, String url)
    {
        view.loadUrl(url);
        return true;
    }
}