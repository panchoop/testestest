package c.c.a.b.h0;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import com.google.android.material.transformation.FabTransformationBehavior;

public class c extends AnimatorListenerAdapter {
  public final c.c.a.b.t.c a;
  
  public c(FabTransformationBehavior paramFabTransformationBehavior, c.c.a.b.t.c paramc) {}
  
  public void onAnimationEnd(Animator paramAnimator) {
    c.c.a.b.t.c.e e = this.a.getRevealInfo();
    e.c = Float.MAX_VALUE;
    this.a.setRevealInfo(e);
  }
}


/* Location:              C:\Users\panch\Downloads\dvba_v1.1.0-dex2jar.jar!\c\c\a\b\h0\c.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */