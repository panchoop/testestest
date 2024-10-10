package b.l.a;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;

public class m extends AnimatorListenerAdapter {
  public final ViewGroup a;
  
  public final View b;
  
  public final Fragment c;
  
  public final k d;
  
  public m(k paramk, ViewGroup paramViewGroup, View paramView, Fragment paramFragment) {}
  
  public void onAnimationEnd(Animator paramAnimator) {
    this.a.endViewTransition(this.b);
    paramAnimator = this.c.i();
    this.c.S(null);
    if (paramAnimator != null && this.a.indexOfChild(this.b) < 0) {
      k k1 = this.d;
      Fragment fragment = this.c;
      k1.d0(fragment, fragment.s(), 0, 0, false);
    } 
  }
}


/* Location:              C:\Users\panch\Downloads\dvba_v1.1.0-dex2jar.jar!\b\l\a\m.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */