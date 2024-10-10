package b.r.d;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import android.view.ViewPropertyAnimator;
import androidx.recyclerview.widget.RecyclerView;

public class g extends AnimatorListenerAdapter {
  public final RecyclerView.d0 a;
  
  public final View b;
  
  public final ViewPropertyAnimator c;
  
  public final k d;
  
  public g(k paramk, RecyclerView.d0 paramd0, View paramView, ViewPropertyAnimator paramViewPropertyAnimator) {}
  
  public void onAnimationCancel(Animator paramAnimator) {
    this.b.setAlpha(1.0F);
  }
  
  public void onAnimationEnd(Animator paramAnimator) {
    this.c.setListener(null);
    this.d.d(this.a);
    this.d.o.remove(this.a);
    this.d.l();
  }
  
  public void onAnimationStart(Animator paramAnimator) {
    if (this.d != null)
      return; 
    throw null;
  }
}


/* Location:              C:\Users\panch\Downloads\dvba_v1.1.0-dex2jar.jar!\b\r\d\g.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */