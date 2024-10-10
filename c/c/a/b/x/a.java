package c.c.a.b.x;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton;

public class a extends AnimatorListenerAdapter {
  public boolean a;
  
  public final i b;
  
  public final ExtendedFloatingActionButton.c c;
  
  public a(ExtendedFloatingActionButton paramExtendedFloatingActionButton, i parami) {}
  
  public void onAnimationCancel(Animator paramAnimator) {
    this.a = true;
    this.b.e();
  }
  
  public void onAnimationEnd(Animator paramAnimator) {
    this.b.d();
    if (!this.a)
      this.b.a(null); 
  }
  
  public void onAnimationStart(Animator paramAnimator) {
    this.b.onAnimationStart(paramAnimator);
    this.a = false;
  }
}


/* Location:              C:\Users\panch\Downloads\dvba_v1.1.0-dex2jar.jar!\c\c\a\b\x\a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */