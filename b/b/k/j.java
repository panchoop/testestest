package b.b.k;

import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import b.f.c;
import b.f.g;
import java.lang.ref.WeakReference;
import java.util.Iterator;

public abstract class j {
  public static final c<WeakReference<j>> b = new c();
  
  public static final Object c = new Object();
  
  public static j d(Activity paramActivity, i parami) {
    return new k((Context)paramActivity, null, parami, paramActivity);
  }
  
  public static j e(Dialog paramDialog, i parami) {
    return new k(paramDialog.getContext(), paramDialog.getWindow(), parami, paramDialog);
  }
  
  public static void j(j paramj) {
    synchronized (c) {
      Iterator iterator = b.iterator();
      while (true) {
        g.a<WeakReference<j>> a = (g.a)iterator;
        if (a.hasNext()) {
          j j1 = ((WeakReference<j>)a.next()).get();
          if (j1 == paramj || j1 == null)
            a.remove(); 
          continue;
        } 
        return;
      } 
    } 
  }
  
  public abstract void c(View paramView, ViewGroup.LayoutParams paramLayoutParams);
  
  public abstract void f();
  
  public abstract void g();
  
  public abstract void h(Bundle paramBundle);
  
  public abstract void i();
  
  public abstract boolean k(int paramInt);
  
  public abstract void l(int paramInt);
  
  public abstract void m(View paramView);
  
  public abstract void n(View paramView, ViewGroup.LayoutParams paramLayoutParams);
  
  public abstract void o(CharSequence paramCharSequence);
}


/* Location:              C:\Users\panch\Downloads\dvba_v1.1.0-dex2jar.jar!\b\b\k\j.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */