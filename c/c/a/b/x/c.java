package c.c.a.b.x;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import com.google.android.material.floatingactionbutton.FloatingActionButton;

public class c extends AnimatorListenerAdapter {
  public boolean a;
  
  public final boolean b;
  
  public final e.f c;
  
  public final e d;
  
  public c(e parame, boolean paramBoolean, e.f paramf) {}
  
  public void onAnimationCancel(Animator paramAnimator) {
    this.a = true;
  }
  
  public void onAnimationEnd(Animator paramAnimator) {
    e e1 = this.d;
    e1.p = 0;
    e1.k = null;
    if (!this.a) {
      byte b;
      FloatingActionButton floatingActionButton = e1.t;
      if (this.b) {
        b = 8;
      } else {
        b = 4;
      } 
      floatingActionButton.b(b, this.b);
      e.f f1 = this.c;
      if (f1 != null) {
        f1 = f1;
        ((b)f1).a.a(((b)f1).b);
      } 
    } 
  }
  
  public void onAnimationStart(Animator paramAnimator) {
    this.d.t.b(0, this.b);
    e e1 = this.d;
    e1.p = 1;
    e1.k = paramAnimator;
    this.a = false;
  }
}


/* Location:              C:\Users\panch\Downloads\dvba_v1.1.0-dex2jar.jar!\c\c\a\b\x\c.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */