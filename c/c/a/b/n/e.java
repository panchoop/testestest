package c.c.a.b.n;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import com.google.android.material.bottomappbar.BottomAppBar;
import com.google.android.material.floatingactionbutton.FloatingActionButton;

public class e extends AnimatorListenerAdapter {
  public final BottomAppBar a;
  
  public e(BottomAppBar paramBottomAppBar) {}
  
  public void onAnimationStart(Animator paramAnimator) {
    this.a.W.onAnimationStart(paramAnimator);
    FloatingActionButton floatingActionButton = this.a.B();
    if (floatingActionButton != null)
      floatingActionButton.setTranslationX(BottomAppBar.w(this.a)); 
  }
}


/* Location:              C:\Users\panch\Downloads\dvba_v1.1.0-dex2jar.jar!\c\c\a\b\n\e.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */