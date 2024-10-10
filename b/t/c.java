package b.t;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ObjectAnimator;
import android.view.View;
import android.view.ViewGroup;
import b.i.m.l;

public class c extends d0 {
  public c(int paramInt) {
    if ((paramInt & 0xFFFFFFFC) == 0) {
      this.J = paramInt;
      return;
    } 
    throw new IllegalArgumentException("Only MODE_IN and MODE_OUT flags are allowed");
  }
  
  public Animator K(ViewGroup paramViewGroup, View paramView, q paramq1, q paramq2) {
    float f;
    v.a.c(paramView);
    Float float_ = (Float)paramq1.a.get("android:fade:transitionAlpha");
    if (float_ != null) {
      f = float_.floatValue();
    } else {
      f = 1.0F;
    } 
    return L(paramView, f, 0.0F);
  }
  
  public final Animator L(View paramView, float paramFloat1, float paramFloat2) {
    if (paramFloat1 == paramFloat2)
      return null; 
    v.a.e(paramView, paramFloat1);
    ObjectAnimator objectAnimator = ObjectAnimator.ofFloat(paramView, v.b, new float[] { paramFloat2 });
    objectAnimator.addListener((Animator.AnimatorListener)new b(paramView));
    a(new a(this, paramView));
    return (Animator)objectAnimator;
  }
  
  public void h(q paramq) {
    I(paramq);
    paramq.a.put("android:fade:transitionAlpha", Float.valueOf(v.b(paramq.b)));
  }
  
  public class a extends l {
    public final View a;
    
    public a(c this$0, View param1View) {}
    
    public void c(i param1i) {
      View view = this.a;
      v.a.e(view, 1.0F);
      view = this.a;
      v.a.a(view);
      param1i.w(this);
    }
  }
  
  public static class b extends AnimatorListenerAdapter {
    public final View a;
    
    public boolean b = false;
    
    public b(View param1View) {
      this.a = param1View;
    }
    
    public void onAnimationEnd(Animator param1Animator) {
      View view = this.a;
      v.a.e(view, 1.0F);
      if (this.b)
        this.a.setLayerType(0, null); 
    }
    
    public void onAnimationStart(Animator param1Animator) {
      if (l.B(this.a) && this.a.getLayerType() == 0) {
        this.b = true;
        this.a.setLayerType(2, null);
      } 
    }
  }
}


/* Location:              C:\Users\panch\Downloads\dvba_v1.1.0-dex2jar.jar!\b\t\c.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */