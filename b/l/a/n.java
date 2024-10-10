package b.l.a;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;

public class n extends AnimatorListenerAdapter {
  public final ViewGroup a;
  
  public final View b;
  
  public final Fragment c;
  
  public n(k paramk, ViewGroup paramViewGroup, View paramView, Fragment paramFragment) {}
  
  public void onAnimationEnd(Animator paramAnimator) {
    this.a.endViewTransition(this.b);
    paramAnimator.removeListener((Animator.AnimatorListener)this);
    Fragment fragment = this.c;
    View view = fragment.G;
    if (view != null && fragment.z)
      view.setVisibility(8); 
  }
}


/* Location:              C:\Users\panch\Downloads\dvba_v1.1.0-dex2jar.jar!\b\l\a\n.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */