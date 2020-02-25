package com.arsltech.developer.mysqlloginregistration.ui.yourcars;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.navigation.fragment.NavHostFragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;

import com.arsltech.developer.mysqlloginregistration.R;
import com.arsltech.developer.mysqlloginregistration.ui.home.HomeFragment;
import com.arsltech.developer.mysqlloginregistration.ui.home.HomeFragmentDirections;
import com.arsltech.developer.mysqlloginregistration.ui.home.HomeViewModel;


public class add_your_vehicles extends Fragment {
    private HomeViewModel homeViewModel;
    private WebView mWebView;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View v=inflater.inflate(R.layout.fragment_add_your_vehi, container, false);
        mWebView = (WebView) v.findViewById(R.id.webview);
        mWebView.loadUrl("http://192.168.100.129:80/Surii/webview/vehicles_view.php");

        // Enable Javascript
        WebSettings webSettings = mWebView.getSettings();
        webSettings.setJavaScriptEnabled(true);

        // Force links and redirects to open in the WebView instead of in a browser
        mWebView.setWebViewClient(new WebViewClient());

        return v;
    }



}
