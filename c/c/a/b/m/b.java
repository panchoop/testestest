package c.c.a.b.m;

import android.animation.ValueAnimator;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.google.android.material.appbar.AppBarLayout;

public class b implements ValueAnimator.AnimatorUpdateListener {
  public final CoordinatorLayout a;
  
  public final AppBarLayout b;
  
  public final AppBarLayout.BaseBehavior c;
  
  public b(AppBarLayout.BaseBehavior paramBaseBehavior, CoordinatorLayout paramCoordinatorLayout, AppBarLayout paramAppBarLayout) {}
  
  public void onAnimationUpdate(ValueAnimator paramValueAnimator) {
    this.c.H(this.a, this.b, ((Integer)paramValueAnimator.getAnimatedValue()).intValue());
  }
}


/* Location:              C:\Users\panch\Downloads\dvba_v1.1.0-dex2jar.jar!\c\c\a\b\m\b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */