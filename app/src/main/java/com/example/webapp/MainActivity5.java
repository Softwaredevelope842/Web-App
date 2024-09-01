package com.example.webapp;

import android.content.Intent;
import android.os.Bundle;
import android.webkit.WebView;
import android.webkit.WebViewClient;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity5 extends AppCompatActivity {
    WebView webView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main5);

        Intent intent = getIntent();
        String url = intent.getStringExtra("Url");
        webView = findViewById(R.id.Microsoftweb);
        String data="<html><body><h1>Software</html></body></h1>";
        webView.loadData(data,"text/html","UTF-8");
        webView.loadUrl(url);
        //  webView.loadUrl("https://www.justdial.com/jdmart/Bangalore/Microsoft-Corporation-India-Pvt-Ltd-Marathahalli-Bellandur/080PXX80-XX80-180824185912-K5P5_BZDET/catalogue");
        WebViewClient webViewClient = new WebViewClient();
        webView.getSettings().setJavaScriptEnabled(true);
        webView.getSettings().setLoadsImagesAutomatically(true);
        webView.setWebViewClient(webViewClient);


    }
}