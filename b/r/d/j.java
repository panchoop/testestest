package b.r.d;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import android.view.ViewPropertyAnimator;
import androidx.recyclerview.widget.RecyclerView;

public class j extends AnimatorListenerAdapter {
  public final k.a a;
  
  public final ViewPropertyAnimator b;
  
  public final View c;
  
  public final k d;
  
  public j(k paramk, k.a parama, ViewPropertyAnimator paramViewPropertyAnimator, View paramView) {}
  
  public void onAnimationEnd(Animator paramAnimator) {
    this.b.setListener(null);
    this.c.setAlpha(1.0F);
    this.c.setTranslationX(0.0F);
    this.c.setTranslationY(0.0F);
    this.d.d(this.a.b);
    this.d.r.remove(this.a.b);
    this.d.l();
  }
  
  public void onAnimationStart(Animator paramAnimator) {
    k k1 = this.d;
    RecyclerView.d0 d0 = this.a.b;
    if (k1 != null)
      return; 
    throw null;
  }
}


/* Location:              C:\Users\panch\Downloads\dvba_v1.1.0-dex2jar.jar!\b\r\d\j.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */