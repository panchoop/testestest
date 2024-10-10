package b.r.d;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import android.view.ViewPropertyAnimator;
import androidx.recyclerview.widget.RecyclerView;

public class f extends AnimatorListenerAdapter {
  public final RecyclerView.d0 a;
  
  public final ViewPropertyAnimator b;
  
  public final View c;
  
  public final k d;
  
  public f(k paramk, RecyclerView.d0 paramd0, ViewPropertyAnimator paramViewPropertyAnimator, View paramView) {}
  
  public void onAnimationEnd(Animator paramAnimator) {
    this.b.setListener(null);
    this.c.setAlpha(1.0F);
    this.d.d(this.a);
    this.d.q.remove(this.a);
    this.d.l();
  }
  
  public void onAnimationStart(Animator paramAnimator) {
    if (this.d != null)
      return; 
    throw null;
  }
}


/* Location:              C:\Users\panch\Downloads\dvba_v1.1.0-dex2jar.jar!\b\r\d\f.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */