package c.c.a.b.n;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import com.google.android.material.bottomappbar.BottomAppBar;

public class c extends AnimatorListenerAdapter {
  public final BottomAppBar a;
  
  public c(BottomAppBar paramBottomAppBar) {}
  
  public void onAnimationEnd(Animator paramAnimator) {
    BottomAppBar.y(this.a);
    this.a.P = null;
  }
  
  public void onAnimationStart(Animator paramAnimator) {
    BottomAppBar bottomAppBar = this.a;
    bottomAppBar.T++;
  }
}


/* Location:              C:\Users\panch\Downloads\dvba_v1.1.0-dex2jar.jar!\c\c\a\b\n\c.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */