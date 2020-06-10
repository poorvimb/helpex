package com.example.helpex;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.webkit.WebSettings;
import android.webkit.WebView;

import android.os.Bundle;

import android.webkit.WebView;

public class MainActivity extends AppCompatActivity {

    WebView webView;
    String content="<h1>Help</h1>\n" +         //content of the page

            "        <p>The OVGO app is a smart parking application which enables users to find out whether a parking lot is free or not. It is a user-friendly android application with attractive user interface.</p>\n" +
            "        <p><b>App Features list items:</b>\n" +
            "        <ul>\n" +
            "        <li>User can view whether a parking slot is free or not</li>\n" +
            "        <li>Colors are used to determine the vacant-'green' and occupied-'red' parking slot</li>\n" +
            "        <li>The user can also set a time after which he/she needs to be notified when the parking slots are full</li>\n" +
            "        <li>The notification is sent to the users phone in the form of a message   \n"


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        // init webView
        webView = (WebView) findViewById(R.id.simpleWebView);
        // displaying text in WebView
        webView.loadDataWithBaseURL(null, content, "text/html", "utf-8", null);//loading the page with content
        //using webView.
    }
}