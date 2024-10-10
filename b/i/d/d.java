package b.i.d;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.View;
import android.view.Window;
import b.i.m.d;
import b.i.m.l;
import b.n.g;
import b.n.h;
import b.n.o;

public class d extends Activity implements g, d.a {
  public h b = new h(this);
  
  public boolean dispatchKeyEvent(KeyEvent paramKeyEvent) {
    View view = getWindow().getDecorView();
    return (view != null && l.f(view, paramKeyEvent)) ? true : d.a(this, view, (Window.Callback)this, paramKeyEvent);
  }
  
  public boolean dispatchKeyShortcutEvent(KeyEvent paramKeyEvent) {
    View view = getWindow().getDecorView();
    return (view != null && l.f(view, paramKeyEvent)) ? true : super.dispatchKeyShortcutEvent(paramKeyEvent);
  }
  
  public boolean i(KeyEvent paramKeyEvent) {
    return super.dispatchKeyEvent(paramKeyEvent);
  }
  
  @SuppressLint({"RestrictedApi"})
  public void onCreate(Bundle paramBundle) {
    super.onCreate(paramBundle);
    o.b(this);
  }
  
  public void onSaveInstanceState(Bundle paramBundle) {
    this.b.f(b.n.d.b.d);
    super.onSaveInstanceState(paramBundle);
  }
}


/* Location:              C:\Users\panch\Downloads\dvba_v1.1.0-dex2jar.jar!\b\i\d\d.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */