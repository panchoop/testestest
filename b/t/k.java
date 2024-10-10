package b.t;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

public class k extends AnimatorListenerAdapter {
  public final i a;
  
  public k(i parami) {}
  
  public void onAnimationEnd(Animator paramAnimator) {
    this.a.n();
    paramAnimator.removeListener((Animator.AnimatorListener)this);
  }
}


/* Location:              C:\Users\panch\Downloads\dvba_v1.1.0-dex2jar.jar!\b\t\k.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */