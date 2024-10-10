package com.google.android.material.transformation;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;

public abstract class ExpandableTransformationBehavior extends ExpandableBehavior {
  public AnimatorSet b;
  
  public ExpandableTransformationBehavior() {}
  
  public ExpandableTransformationBehavior(Context paramContext, AttributeSet paramAttributeSet) {
    super(paramContext, paramAttributeSet);
  }
  
  public boolean C(View paramView1, View paramView2, boolean paramBoolean1, boolean paramBoolean2) {
    boolean bool;
    if (this.b != null) {
      bool = true;
    } else {
      bool = false;
    } 
    if (bool)
      this.b.cancel(); 
    AnimatorSet animatorSet = D(paramView1, paramView2, paramBoolean1, bool);
    this.b = animatorSet;
    animatorSet.addListener((Animator.AnimatorListener)new a(this));
    this.b.start();
    if (!paramBoolean2)
      this.b.end(); 
    return true;
  }
  
  public abstract AnimatorSet D(View paramView1, View paramView2, boolean paramBoolean1, boolean paramBoolean2);
  
  public class a extends AnimatorListenerAdapter {
    public final ExpandableTransformationBehavior a;
    
    public a(ExpandableTransformationBehavior this$0) {}
    
    public void onAnimationEnd(Animator param1Animator) {
      this.a.b = null;
    }
  }
}


/* Location:              C:\Users\panch\Downloads\dvba_v1.1.0-dex2jar.jar!\com\google\android\material\transformation\ExpandableTransformationBehavior.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */