package c.c.a.b.g0;

import android.animation.ValueAnimator;

public class e implements ValueAnimator.AnimatorUpdateListener {
  public final a a;
  
  public e(a parama) {}
  
  public void onAnimationUpdate(ValueAnimator paramValueAnimator) {
    float f = ((Float)paramValueAnimator.getAnimatedValue()).floatValue();
    this.a.c.setScaleX(f);
    this.a.c.setScaleY(f);
  }
}


/* Location:              C:\Users\panch\Downloads\dvba_v1.1.0-dex2jar.jar!\c\c\a\b\g0\e.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */