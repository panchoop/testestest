package b.r.d;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import android.view.ViewPropertyAnimator;
import androidx.recyclerview.widget.RecyclerView;

public class h extends AnimatorListenerAdapter {
  public final RecyclerView.d0 a;
  
  public final int b;
  
  public final View c;
  
  public final int d;
  
  public final ViewPropertyAnimator e;
  
  public final k f;
  
  public h(k paramk, RecyclerView.d0 paramd0, int paramInt1, View paramView, int paramInt2, ViewPropertyAnimator paramViewPropertyAnimator) {}
  
  public void onAnimationCancel(Animator paramAnimator) {
    if (this.b != 0)
      this.c.setTranslationX(0.0F); 
    if (this.d != 0)
      this.c.setTranslationY(0.0F); 
  }
  
  public void onAnimationEnd(Animator paramAnimator) {
    this.e.setListener(null);
    this.f.d(this.a);
    this.f.p.remove(this.a);
    this.f.l();
  }
  
  public void onAnimationStart(Animator paramAnimator) {
    if (this.f != null)
      return; 
    throw null;
  }
}


/* Location:              C:\Users\panch\Downloads\dvba_v1.1.0-dex2jar.jar!\b\r\d\h.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */