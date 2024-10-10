package androidx.biometric;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import b.b.k.h;
import b.d.b;
import b.d.m;
import b.d.o;
import b.l.a.e;
import java.util.concurrent.Executor;

@SuppressLint({"SyntheticAccessor"})
public class DeviceCredentialHandlerActivity extends h {
  public boolean p;
  
  public void onActivityResult(int paramInt1, int paramInt2, Intent paramIntent) {
    super.onActivityResult(paramInt1, paramInt2, paramIntent);
    u(paramInt2);
  }
  
  public void onCreate(Bundle paramBundle) {
    b b = b.a();
    int i = b.a;
    boolean bool = true;
    if (i != 0) {
      setTheme(i);
      getTheme().applyStyle(o.TransparentStyle, true);
    } 
    super.onCreate(paramBundle);
    if (paramBundle == null || !paramBundle.getBoolean("did_change_configuration", false))
      bool = false; 
    this.p = bool;
    if (!bool) {
      b.i = 0;
    } else {
      this.p = false;
    } 
    setTitle(null);
    setContentView(m.device_credential_handler_activity);
    Executor executor = b.e;
    if (executor != null) {
      BiometricPrompt.b b1 = b.f;
      if (b1 == null) {
        Log.e("DeviceCredentialHandler", "onCreate: Executor and/or callback was null!");
        finish();
        return;
      } 
      (new BiometricPrompt((e)this, executor, b1)).b(new BiometricPrompt.e(getIntent().getBundleExtra("prompt_info_bundle")));
      return;
    } 
    Log.e("DeviceCredentialHandler", "onCreate: Executor and/or callback was null!");
    finish();
  }
  
  public void onPause() {
    super.onPause();
    b b = b.j;
    if (isChangingConfigurations() && b != null) {
      if (b.i == 0)
        b.i = 1; 
      this.p = true;
    } 
  }
  
  public void onSaveInstanceState(Bundle paramBundle) {
    super.onSaveInstanceState(paramBundle);
    paramBundle.putBoolean("did_change_configuration", this.p);
  }
  
  public void u(int paramInt) {
    b b = b.j;
    if (b == null) {
      Log.e("DeviceCredentialHandler", "onActivityResult: Bridge or callback was null!");
    } else {
      if (paramInt == -1) {
        b.h = 1;
      } else {
        b.h = 2;
      } 
      b.g = false;
      b.i = 2;
    } 
    finish();
  }
}


/* Location:              C:\Users\panch\Downloads\dvba_v1.1.0-dex2jar.jar!\androidx\biometric\DeviceCredentialHandlerActivity.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */