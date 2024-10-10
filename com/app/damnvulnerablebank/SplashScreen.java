package com.app.damnvulnerablebank;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;
import android.widget.TextView;
import b.b.k.h;

public class SplashScreen extends h {
  public ImageView p;
  
  public TextView q;
  
  public Animation r;
  
  public Animation s;
  
  public void onCreate(Bundle paramBundle) {
    super.onCreate(paramBundle);
    requestWindowFeature(1);
    getWindow().setFlags(1024, 1024);
    setContentView(2131558511);
    this.p = (ImageView)findViewById(2131361881);
    this.q = (TextView)findViewById(2131362104);
    this.r = AnimationUtils.loadAnimation((Context)this, 2130772000);
    this.s = AnimationUtils.loadAnimation((Context)this, 2130771980);
    this.p.setAnimation(this.r);
    this.q.setAnimation(this.s);
    (new Handler()).postDelayed(new a(this), 3000L);
  }
  
  public class a implements Runnable {
    public final SplashScreen b;
    
    public a(SplashScreen this$0) {}
    
    public void run() {
      Intent intent = new Intent(this.b.getApplicationContext(), MainActivity.class);
      this.b.startActivity(intent);
      this.b.finish();
    }
  }
}


/* Location:              C:\Users\panch\Downloads\dvba_v1.1.0-dex2jar.jar!\com\app\damnvulnerablebank\SplashScreen.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */