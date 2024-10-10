package b.i.m;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import android.view.View;
import b.b.k.u;
import java.lang.ref.WeakReference;

public final class q {
  public WeakReference<View> a;
  
  public Runnable b = null;
  
  public Runnable c = null;
  
  public int d = -1;
  
  public q(View paramView) {
    this.a = new WeakReference<View>(paramView);
  }
  
  public q a(float paramFloat) {
    View view = this.a.get();
    if (view != null)
      view.animate().alpha(paramFloat); 
    return this;
  }
  
  public void b() {
    View view = this.a.get();
    if (view != null)
      view.animate().cancel(); 
  }
  
  public q c(long paramLong) {
    View view = this.a.get();
    if (view != null)
      view.animate().setDuration(paramLong); 
    return this;
  }
  
  public q d(r paramr) {
    View view = this.a.get();
    if (view != null)
      e(view, paramr); 
    return this;
  }
  
  public final void e(View paramView, r paramr) {
    if (paramr != null) {
      paramView.animate().setListener((Animator.AnimatorListener)new a(this, paramr, paramView));
    } else {
      paramView.animate().setListener(null);
    } 
  }
  
  public q f(t paramt) {
    View view = this.a.get();
    if (view != null) {
      b b = null;
      if (paramt != null)
        b = new b(this, paramt, view); 
      view.animate().setUpdateListener(b);
    } 
    return this;
  }
  
  public q g(float paramFloat) {
    View view = this.a.get();
    if (view != null)
      view.animate().translationY(paramFloat); 
    return this;
  }
  
  public class a extends AnimatorListenerAdapter {
    public final r a;
    
    public final View b;
    
    public a(q this$0, r param1r, View param1View) {}
    
    public void onAnimationCancel(Animator param1Animator) {
      this.a.c(this.b);
    }
    
    public void onAnimationEnd(Animator param1Animator) {
      this.a.a(this.b);
    }
    
    public void onAnimationStart(Animator param1Animator) {
      this.a.b(this.b);
    }
  }
  
  public class b implements ValueAnimator.AnimatorUpdateListener {
    public final t a;
    
    public final View b;
    
    public b(q this$0, t param1t, View param1View) {}
    
    public void onAnimationUpdate(ValueAnimator param1ValueAnimator) {
      ((View)((u.c)this.a).a.d.getParent()).invalidate();
    }
  }
}


/* Location:              C:\Users\panch\Downloads\dvba_v1.1.0-dex2jar.jar!\b\i\m\q.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */