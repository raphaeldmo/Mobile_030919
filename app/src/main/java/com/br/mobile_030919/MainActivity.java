package com.br.mobile_030919;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void goURL (View v){
        EditText txtURL = findViewById(R.id.txtURL);
        WebView webView = findViewById(R.id.webView);


        //quando apertar o botao "IR"" ele vai executar essa linha de comando
        webView.getSettings().setJavaScriptEnabled(true);

        webView.setWebViewClient(new WebViewClient()); // instacia pq ele representa o browser interno, tem que instanciar ele
        webView.loadUrl("https://" + txtURL.getText().toString()); // vai pegar o text da caixinha
    }
}
