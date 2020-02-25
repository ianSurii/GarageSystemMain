package com.arsltech.developer.mysqlloginregistration.ui.home;

import android.app.AlertDialog;
import android.app.ProgressDialog;
import android.content.Intent;
import android.os.Bundle;
import android.os.Message;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProviders;
import androidx.navigation.fragment.NavHostFragment;

import com.android.volley.Request;
import com.android.volley.RequestQueue;
import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.StringRequest;
import com.android.volley.toolbox.Volley;
import com.arsltech.developer.mysqlloginregistration.LoginActivity;
import com.arsltech.developer.mysqlloginregistration.R;
import com.arsltech.developer.mysqlloginregistration.RegistrationActivity;

import java.util.HashMap;
import java.util.Map;

public class HomeSecondFragment extends Fragment {
    private WebView mWebView;

//    @Override
//    public void onDestroy() {
//        super.onDestroy();
//        try {
//
//        }catch (Exception ex){
//            AlertDialog(Sh)
//        }
//    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View v=inflater.inflate(R.layout.booking, container, false);
        mWebView = (WebView) v.findViewById(R.id.webview);
        mWebView.loadUrl("http://192.168.100.129:80/Surii/webview/add_web.php");

        // Enable Javascript
        WebSettings webSettings = mWebView.getSettings();
        webSettings.setJavaScriptEnabled(true);

        // Force links and redirects to open in the WebView instead of in a browser
        mWebView.setWebViewClient(new WebViewClient());

        return v;
    }

}
