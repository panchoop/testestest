package b.t;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import b.f.a;

public class j extends AnimatorListenerAdapter {
  public final a a;
  
  public final i b;
  
  public j(i parami, a parama) {}
  
  public void onAnimationEnd(Animator paramAnimator) {
    this.a.remove(paramAnimator);
    this.b.x.remove(paramAnimator);
  }
  
  public void onAnimationStart(Animator paramAnimator) {
    this.b.x.add(paramAnimator);
  }
}


/* Location:              C:\Users\panch\Downloads\dvba_v1.1.0-dex2jar.jar!\b\t\j.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */