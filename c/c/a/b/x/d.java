package c.c.a.b.x;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

public class d extends AnimatorListenerAdapter {
  public final boolean a;
  
  public final e.f b;
  
  public final e c;
  
  public d(e parame, boolean paramBoolean, e.f paramf) {}
  
  public void onAnimationEnd(Animator paramAnimator) {
    e e1 = this.c;
    e1.p = 0;
    e1.k = null;
    e.f f1 = this.b;
    if (f1 != null) {
      f1 = f1;
      ((b)f1).a.b(((b)f1).b);
    } 
  }
  
  public void onAnimationStart(Animator paramAnimator) {
    this.c.t.b(0, this.a);
    e e1 = this.c;
    e1.p = 2;
    e1.k = paramAnimator;
  }
}


/* Location:              C:\Users\panch\Downloads\dvba_v1.1.0-dex2jar.jar!\c\c\a\b\x\d.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */