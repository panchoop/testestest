package b.i.m;

import android.view.View;
import android.view.ViewTreeObserver;

public final class k implements ViewTreeObserver.OnPreDrawListener, View.OnAttachStateChangeListener {
  public final View b;
  
  public ViewTreeObserver c;
  
  public final Runnable d;
  
  public k(View paramView, Runnable paramRunnable) {
    this.b = paramView;
    this.c = paramView.getViewTreeObserver();
    this.d = paramRunnable;
  }
  
  public static k a(View paramView, Runnable paramRunnable) {
    if (paramView != null) {
      k k1 = new k(paramView, paramRunnable);
      paramView.getViewTreeObserver().addOnPreDrawListener(k1);
      paramView.addOnAttachStateChangeListener(k1);
      return k1;
    } 
    throw new NullPointerException("view == null");
  }
  
  public void b() {
    ViewTreeObserver viewTreeObserver;
    if (this.c.isAlive()) {
      viewTreeObserver = this.c;
    } else {
      viewTreeObserver = this.b.getViewTreeObserver();
    } 
    viewTreeObserver.removeOnPreDrawListener(this);
    this.b.removeOnAttachStateChangeListener(this);
  }
  
  public boolean onPreDraw() {
    b();
    this.d.run();
    return true;
  }
  
  public void onViewAttachedToWindow(View paramView) {
    this.c = paramView.getViewTreeObserver();
  }
  
  public void onViewDetachedFromWindow(View paramView) {
    b();
  }
}


/* Location:              C:\Users\panch\Downloads\dvba_v1.1.0-dex2jar.jar!\b\i\m\k.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */