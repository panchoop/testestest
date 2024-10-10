package b.b.o.i;

import android.content.DialogInterface;
import android.view.KeyEvent;
import android.view.MenuItem;
import android.view.View;
import android.view.Window;
import b.b.k.g;

public class h implements DialogInterface.OnKeyListener, DialogInterface.OnClickListener, DialogInterface.OnDismissListener, m.a {
  public g b;
  
  public g c;
  
  public e d;
  
  public h(g paramg) {
    this.b = paramg;
  }
  
  public void b(g paramg, boolean paramBoolean) {
    if (paramBoolean || paramg == this.b) {
      g g1 = this.c;
      if (g1 != null)
        g1.dismiss(); 
    } 
  }
  
  public boolean c(g paramg) {
    return false;
  }
  
  public void onClick(DialogInterface paramDialogInterface, int paramInt) {
    this.b.r((MenuItem)((e.a)this.d.a()).b(paramInt), 0);
  }
  
  public void onDismiss(DialogInterface paramDialogInterface) {
    e e1 = this.d;
    g g1 = this.b;
    m.a a1 = e1.i;
    if (a1 != null)
      a1.b(g1, true); 
  }
  
  public boolean onKey(DialogInterface paramDialogInterface, int paramInt, KeyEvent paramKeyEvent) {
    if (paramInt == 82 || paramInt == 4) {
      KeyEvent.DispatcherState dispatcherState;
      if (paramKeyEvent.getAction() == 0 && paramKeyEvent.getRepeatCount() == 0) {
        Window window = this.c.getWindow();
        if (window != null) {
          View view = window.getDecorView();
          if (view != null) {
            dispatcherState = view.getKeyDispatcherState();
            if (dispatcherState != null) {
              dispatcherState.startTracking(paramKeyEvent, this);
              return true;
            } 
          } 
        } 
      } else if (paramKeyEvent.getAction() == 1 && !paramKeyEvent.isCanceled()) {
        Window window = this.c.getWindow();
        if (window != null) {
          View view = window.getDecorView();
          if (view != null) {
            KeyEvent.DispatcherState dispatcherState1 = view.getKeyDispatcherState();
            if (dispatcherState1 != null && dispatcherState1.isTracking(paramKeyEvent)) {
              this.b.c(true);
              dispatcherState.dismiss();
              return true;
            } 
          } 
        } 
      } 
    } 
    return this.b.performShortcut(paramInt, paramKeyEvent, 0);
  }
}


/* Location:              C:\Users\panch\Downloads\dvba_v1.1.0-dex2jar.jar!\b\b\o\i\h.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */