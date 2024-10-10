package com.app.damnvulnerablebank;

import android.app.Activity;
import android.os.Bundle;
import android.webkit.WebChromeClient;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import b.b.k.h;
import c.b.a.x;

public class CurrencyRates extends h {
  public String p;
  
  public void onCreate(Bundle paramBundle) {
    WebView webView;
    String str;
    super.onCreate(paramBundle);
    setContentView(2131558432);
    if (getIntent().getExtras() == null) {
      webView = (WebView)findViewById(2131362017);
      webView.getSettings().setJavaScriptEnabled(true);
      webView.setWebChromeClient(new WebChromeClient());
      webView.setWebViewClient((WebViewClient)new x((Activity)this));
      str = "https://www.xe.com/";
    } else {
      this.p = getIntent().getData().getQueryParameter("url");
      webView = (WebView)findViewById(2131362017);
      webView.getSettings().setJavaScriptEnabled(true);
      webView.setWebChromeClient(new WebChromeClient());
      webView.setWebViewClient((WebViewClient)new x((Activity)this));
      str = this.p;
    } 
    webView.loadUrl(str);
  }
}


/* Location:              C:\Users\panch\Downloads\dvba_v1.1.0-dex2jar.jar!\com\app\damnvulnerablebank\CurrencyRates.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */