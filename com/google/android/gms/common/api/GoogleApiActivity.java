package com.google.android.gms.common.api;

import android.app.Activity;
import android.app.PendingIntent;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.IntentSender;
import android.os.Bundle;
import android.os.Handler;
import android.os.Parcelable;
import android.util.Log;
import c.c.a.a.c.a;
import c.c.a.a.c.d;
import c.c.a.a.c.k.k.d;
import com.google.android.gms.common.annotation.KeepName;

@KeepName
public class GoogleApiActivity extends Activity implements DialogInterface.OnCancelListener {
  public int b = 0;
  
  public static PendingIntent a(Context paramContext, PendingIntent paramPendingIntent, int paramInt) {
    Intent intent = new Intent(paramContext, GoogleApiActivity.class);
    intent.putExtra("pending_intent", (Parcelable)paramPendingIntent);
    intent.putExtra("failing_client_id", paramInt);
    intent.putExtra("notify_manager", true);
    return PendingIntent.getActivity(paramContext, 0, intent, 134217728);
  }
  
  public void onActivityResult(int paramInt1, int paramInt2, Intent paramIntent) {
    Handler handler;
    super.onActivityResult(paramInt1, paramInt2, paramIntent);
    if (paramInt1 == 1) {
      boolean bool = getIntent().getBooleanExtra("notify_manager", true);
      this.b = 0;
      setResult(paramInt2, paramIntent);
      if (bool) {
        Handler handler1;
        d d = d.a((Context)this);
        if (paramInt2 != -1) {
          if (paramInt2 == 0) {
            a a = new a(13, null);
            paramInt1 = getIntent().getIntExtra("failing_client_id", -1);
            if (!d.c(a, paramInt1)) {
              handler1 = d.m;
              handler1.sendMessage(handler1.obtainMessage(5, paramInt1, 0, a));
            } 
          } 
        } else {
          handler = ((d)handler1).m;
          handler.sendMessage(handler.obtainMessage(3));
        } 
      } 
    } else if (paramInt1 == 2) {
      this.b = 0;
      setResult(paramInt2, (Intent)handler);
    } 
    finish();
  }
  
  public void onCancel(DialogInterface paramDialogInterface) {
    this.b = 0;
    setResult(0);
    finish();
  }
  
  public void onCreate(Bundle paramBundle) {
    super.onCreate(paramBundle);
    if (paramBundle != null)
      this.b = paramBundle.getInt("resolution"); 
    if (this.b != 1) {
      Bundle bundle = getIntent().getExtras();
      if (bundle == null) {
        String str = "Activity started without extras";
      } else {
        String str;
        PendingIntent pendingIntent = (PendingIntent)bundle.get("pending_intent");
        Integer integer = (Integer)bundle.get("error_code");
        if (pendingIntent == null && integer == null) {
          str = "Activity started without resolution";
        } else {
          if (str != null) {
            try {
              startIntentSenderForResult(str.getIntentSender(), 1, null, 0, 0, 0);
              this.b = 1;
              return;
            } catch (android.content.IntentSender.SendIntentException sendIntentException) {
              Log.e("GoogleApiActivity", "Failed to launch pendingIntent", (Throwable)sendIntentException);
            } 
          } else {
            d.d.d(this, integer.intValue(), 2, this);
            this.b = 1;
            return;
          } 
          finish();
        } 
      } 
      Log.e("GoogleApiActivity", (String)sendIntentException);
    } else {
      return;
    } 
    finish();
  }
  
  public void onSaveInstanceState(Bundle paramBundle) {
    paramBundle.putInt("resolution", this.b);
    super.onSaveInstanceState(paramBundle);
  }
}


/* Location:              C:\Users\panch\Downloads\dvba_v1.1.0-dex2jar.jar!\com\google\android\gms\common\api\GoogleApiActivity.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */