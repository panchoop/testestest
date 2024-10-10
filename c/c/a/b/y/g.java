package c.c.a.b.y;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import java.util.ArrayList;

public final class g {
  public final ArrayList<b> a = new ArrayList<b>();
  
  public b b = null;
  
  public ValueAnimator c = null;
  
  public final Animator.AnimatorListener d = (Animator.AnimatorListener)new a(this);
  
  public void a(int[] paramArrayOfint, ValueAnimator paramValueAnimator) {
    b b1 = new b(paramArrayOfint, paramValueAnimator);
    paramValueAnimator.addListener(this.d);
    this.a.add(b1);
  }
  
  public class a extends AnimatorListenerAdapter {
    public final g a;
    
    public a(g this$0) {}
    
    public void onAnimationEnd(Animator param1Animator) {
      g g1 = this.a;
      if (g1.c == param1Animator)
        g1.c = null; 
    }
  }
  
  public static class b {
    public final int[] a;
    
    public final ValueAnimator b;
    
    public b(int[] param1ArrayOfint, ValueAnimator param1ValueAnimator) {
      this.a = param1ArrayOfint;
      this.b = param1ValueAnimator;
    }
  }
}


/* Location:              C:\Users\panch\Downloads\dvba_v1.1.0-dex2jar.jar!\c\c\a\b\y\g.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */