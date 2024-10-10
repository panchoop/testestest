package c.c.a.b.n;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import androidx.appcompat.widget.ActionMenuView;
import com.google.android.material.bottomappbar.BottomAppBar;

public class d extends AnimatorListenerAdapter {
  public boolean a;
  
  public final ActionMenuView b;
  
  public final int c;
  
  public final boolean d;
  
  public final BottomAppBar e;
  
  public d(BottomAppBar paramBottomAppBar, ActionMenuView paramActionMenuView, int paramInt, boolean paramBoolean) {}
  
  public void onAnimationCancel(Animator paramAnimator) {
    this.a = true;
  }
  
  public void onAnimationEnd(Animator paramAnimator) {
    if (!this.a)
      BottomAppBar.v(this.e, this.b, this.c, this.d); 
  }
}


/* Location:              C:\Users\panch\Downloads\dvba_v1.1.0-dex2jar.jar!\c\c\a\b\n\d.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */