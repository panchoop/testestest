package c.c.a.b.g0;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

public class l extends AnimatorListenerAdapter {
  public final h a;
  
  public l(h paramh) {}
  
  public void onAnimationEnd(Animator paramAnimator) {
    h h1 = this.a;
    h1.c.setChecked(h1.h);
    this.a.n.start();
  }
}


/* Location:              C:\Users\panch\Downloads\dvba_v1.1.0-dex2jar.jar!\c\c\a\b\g0\l.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */