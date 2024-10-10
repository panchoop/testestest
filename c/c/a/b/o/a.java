package c.c.a.b.o;

import android.animation.ValueAnimator;
import c.c.a.b.d0.g;
import com.google.android.material.bottomsheet.BottomSheetBehavior;

public class a implements ValueAnimator.AnimatorUpdateListener {
  public final BottomSheetBehavior a;
  
  public a(BottomSheetBehavior paramBottomSheetBehavior) {}
  
  public void onAnimationUpdate(ValueAnimator paramValueAnimator) {
    float f = ((Float)paramValueAnimator.getAnimatedValue()).floatValue();
    g g = this.a.h;
    if (g != null)
      g.r(f); 
  }
}


/* Location:              C:\Users\panch\Downloads\dvba_v1.1.0-dex2jar.jar!\c\c\a\b\o\a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */