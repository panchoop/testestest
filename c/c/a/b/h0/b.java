package c.c.a.b.h0;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.graphics.drawable.Drawable;
import c.c.a.b.t.c;
import com.google.android.material.transformation.FabTransformationBehavior;

public class b extends AnimatorListenerAdapter {
  public final c a;
  
  public final Drawable b;
  
  public b(FabTransformationBehavior paramFabTransformationBehavior, c paramc, Drawable paramDrawable) {}
  
  public void onAnimationEnd(Animator paramAnimator) {
    this.a.setCircularRevealOverlayDrawable(null);
  }
  
  public void onAnimationStart(Animator paramAnimator) {
    this.a.setCircularRevealOverlayDrawable(this.b);
  }
}


/* Location:              C:\Users\panch\Downloads\dvba_v1.1.0-dex2jar.jar!\c\c\a\b\h0\b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */