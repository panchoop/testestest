package c.c.a.b.m;

import android.animation.ValueAnimator;
import c.c.a.b.d0.g;
import com.google.android.material.appbar.AppBarLayout;

public class a implements ValueAnimator.AnimatorUpdateListener {
  public final g a;
  
  public a(AppBarLayout paramAppBarLayout, g paramg) {}
  
  public void onAnimationUpdate(ValueAnimator paramValueAnimator) {
    this.a.p(((Float)paramValueAnimator.getAnimatedValue()).floatValue());
  }
}


/* Location:              C:\Users\panch\Downloads\dvba_v1.1.0-dex2jar.jar!\c\c\a\b\m\a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */