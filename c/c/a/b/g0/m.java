package c.c.a.b.g0;

import android.animation.ValueAnimator;

public class m implements ValueAnimator.AnimatorUpdateListener {
  public final h a;
  
  public m(h paramh) {}
  
  public void onAnimationUpdate(ValueAnimator paramValueAnimator) {
    float f = ((Float)paramValueAnimator.getAnimatedValue()).floatValue();
    this.a.c.setAlpha(f);
  }
}


/* Location:              C:\Users\panch\Downloads\dvba_v1.1.0-dex2jar.jar!\c\c\a\b\g0\m.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */