package com.example.and1;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebResourceRequest;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;

import androidx.fragment.app.Fragment;

public class InternetFragment2 extends Fragment {

    WebView internetView;
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        System.out.println("Internet");
        View view = inflater.inflate(R.layout.internet_fragment2, container, false);
        internetView =  view.findViewById(R.id.internetId);
     internetView.setScrollBarStyle(View.SCROLLBARS_INSIDE_OVERLAY);
        internetView.setWebViewClient(new WebViewClient() {
            @Override
            public boolean shouldOverrideUrlLoading(WebView view, WebResourceRequest request) {
                view.loadUrl(request.getUrl().toString());
                return false;
            }
        });
        internetView.loadUrl("https://www.google.com");
        return view;
    }

}