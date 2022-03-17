package com.azehaf.tp3_restapi;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.ImageView;
import android.widget.TextView;

import com.squareup.picasso.Picasso;

public class Details extends AppCompatActivity {

    TextView titleText,sourceText,dateText,descriptionText;
    ImageView imageView;
    WebView webView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_details);
        titleText = findViewById(R.id.titleText);
        sourceText = findViewById(R.id.sourceText);
        dateText = findViewById(R.id.dateText);
        descriptionText = findViewById(R.id.descriptionText);

        imageView = findViewById(R.id.imageView);

        webView = findViewById(R.id.webView);

        Intent intent = getIntent();
        String title = intent.getStringExtra("title");
        String source = intent.getStringExtra("source");
        String date = intent.getStringExtra("date");
        String description = intent.getStringExtra("description");
        String url = intent.getStringExtra("url");
        String imageURL = intent.getStringExtra("imageURL");

        titleText.setText(title);
        sourceText.setText(source);
        dateText.setText(date);
        descriptionText.setText(description);

        Picasso.with(Details.this).load(imageURL).into(imageView);

        webView.getSettings().setDomStorageEnabled(true);
        webView.getSettings().setJavaScriptEnabled(true);
        webView.getSettings().setLoadsImagesAutomatically(true);
        webView.setScrollBarStyle(View.SCROLLBARS_INSIDE_OVERLAY);
        webView.setWebViewClient(new WebViewClient());
        webView.loadUrl(url);



    }

}