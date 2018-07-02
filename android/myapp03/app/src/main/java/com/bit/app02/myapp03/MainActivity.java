package com.bit.app02.myapp03;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.webkit.WebChromeClient;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ProgressBar;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{
    String url="https://getbootstrap.com/docs/4.1/getting-started/introduction/";
    private WebView webview;
    private EditText txtBox;
    private Button btn;
    private ProgressBar progressBar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        webview=findViewById(R.id.web_view);
        progressBar=findViewById(R.id.progressBar);
        webview.loadUrl(url);
        webview.setWebViewClient(new WebViewClient());
        webview.setWebChromeClient(new WebChromeClient(){
            @Override
            public void onProgressChanged(WebView view, int newProgress) {
                super.onProgressChanged(view, newProgress);
                progressBar.setProgress(newProgress);
                if(newProgress==100){
                    progressBar.setVisibility(View.GONE);
                }else{
                    progressBar.setVisibility(View.VISIBLE);
                }

            }
        });
        webview.getSettings().setJavaScriptEnabled(true);

        txtBox=findViewById(R.id.url_text);
        btn=findViewById(R.id.url_go);
        btn.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        String url=txtBox.getText().toString();
        if(!url.startsWith("https://"))url="https://"+url;
        webview.loadUrl(url);

    }

}
