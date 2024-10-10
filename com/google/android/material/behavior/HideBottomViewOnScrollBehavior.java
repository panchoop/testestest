package com.google.android.material.behavior;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.TimeInterpolator;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewPropertyAnimator;
import androidx.coordinatorlayout.widget.CoordinatorLayout;

public class HideBottomViewOnScrollBehavior<V extends View> extends CoordinatorLayout.c<V> {
  public int a = 0;
  
  public int b = 2;
  
  public int c = 0;
  
  public ViewPropertyAnimator d;
  
  public HideBottomViewOnScrollBehavior() {}
  
  public HideBottomViewOnScrollBehavior(Context paramContext, AttributeSet paramAttributeSet) {
    super(paramContext, paramAttributeSet);
  }
  
  public final void B(V paramV, int paramInt, long paramLong, TimeInterpolator paramTimeInterpolator) {
    this.d = paramV.animate().translationY(paramInt).setInterpolator(paramTimeInterpolator).setDuration(paramLong).setListener((Animator.AnimatorListener)new a(this));
  }
  
  public boolean k(CoordinatorLayout paramCoordinatorLayout, V paramV, int paramInt) {
    ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams)paramV.getLayoutParams();
    this.a = paramV.getMeasuredHeight() + marginLayoutParams.bottomMargin;
    return false;
  }
  
  public void q(CoordinatorLayout paramCoordinatorLayout, V paramV, View paramView, int paramInt1, int paramInt2, int paramInt3, int paramInt4) {
    if (paramInt2 > 0) {
      if (this.b != 1) {
        ViewPropertyAnimator viewPropertyAnimator = this.d;
        if (viewPropertyAnimator != null) {
          viewPropertyAnimator.cancel();
          paramV.clearAnimation();
        } 
        this.b = 1;
        B(paramV, this.a + this.c, 175L, c.c.a.b.l.a.c);
      } 
    } else if (paramInt2 < 0 && this.b != 2) {
      ViewPropertyAnimator viewPropertyAnimator = this.d;
      if (viewPropertyAnimator != null) {
        viewPropertyAnimator.cancel();
        paramV.clearAnimation();
      } 
      this.b = 2;
      B(paramV, 0, 225L, c.c.a.b.l.a.d);
    } 
  }
  
  public boolean w(CoordinatorLayout paramCoordinatorLayout, V paramV, View paramView1, View paramView2, int paramInt) {
    boolean bool;
    if (paramInt == 2) {
      bool = true;
    } else {
      bool = false;
    } 
    return bool;
  }
  
  public class a extends AnimatorListenerAdapter {
    public final HideBottomViewOnScrollBehavior a;
    
    public a(HideBottomViewOnScrollBehavior this$0) {}
    
    public void onAnimationEnd(Animator param1Animator) {
      this.a.d = null;
    }
  }
}


/* Location:              C:\Users\panch\Downloads\dvba_v1.1.0-dex2jar.jar!\com\google\android\material\behavior\HideBottomViewOnScrollBehavior.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */