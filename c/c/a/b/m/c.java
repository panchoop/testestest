package c.c.a.b.m;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.OverScroller;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import b.i.m.l;
import com.google.android.material.appbar.AppBarLayout;

public abstract class c<V extends View> extends e<V> {
  public Runnable d;
  
  public OverScroller e;
  
  public boolean f;
  
  public int g = -1;
  
  public int h;
  
  public int i = -1;
  
  public VelocityTracker j;
  
  public c() {}
  
  public c(Context paramContext, AttributeSet paramAttributeSet) {
    super(paramContext, paramAttributeSet);
  }
  
  public boolean A(CoordinatorLayout paramCoordinatorLayout, V paramV, MotionEvent paramMotionEvent) {
    AppBarLayout.BaseBehavior baseBehavior;
    if (this.i < 0)
      this.i = ViewConfiguration.get(paramCoordinatorLayout.getContext()).getScaledTouchSlop(); 
    int i = paramMotionEvent.getActionMasked();
    if (i != 0) {
      if (i != 1) {
        if (i != 2) {
          if (i != 3)
            velocityTracker = this.j; 
        } else {
          i = paramMotionEvent.findPointerIndex(this.g);
          if (i == -1)
            return false; 
          int k = (int)paramMotionEvent.getY(i);
          int j = this.h - k;
          i = j;
          if (!this.f) {
            int n = Math.abs(j);
            int m = this.i;
            i = j;
            if (n > m) {
              this.f = true;
              if (j > 0) {
                i = j - m;
              } else {
                i = j + m;
              } 
            } 
          } 
          if (this.f) {
            this.h = k;
            G((CoordinatorLayout)velocityTracker, paramV, i, -((AppBarLayout)paramV).getDownNestedScrollRange(), 0);
          } 
          velocityTracker = this.j;
        } 
      } else {
        VelocityTracker velocityTracker1 = this.j;
        if (velocityTracker1 != null) {
          a a;
          velocityTracker1.addMovement(paramMotionEvent);
          this.j.computeCurrentVelocity(1000);
          float f = this.j.getYVelocity(this.g);
          AppBarLayout appBarLayout = (AppBarLayout)paramV;
          i = -appBarLayout.getTotalScrollRange();
          Runnable runnable = this.d;
          if (runnable != null) {
            paramV.removeCallbacks(runnable);
            this.d = null;
          } 
          if (this.e == null)
            this.e = new OverScroller(paramV.getContext()); 
          this.e.fling(0, B(), 0, Math.round(f), 0, 0, i, 0);
          if (this.e.computeScrollOffset()) {
            a = new a(this, (CoordinatorLayout)velocityTracker, paramV);
            this.d = a;
            l.P((View)paramV, a);
          } else {
            baseBehavior = (AppBarLayout.BaseBehavior)this;
            baseBehavior.P((CoordinatorLayout)a, appBarLayout);
            if (appBarLayout.j)
              appBarLayout.c(appBarLayout.d(baseBehavior.L((CoordinatorLayout)a))); 
          } 
        } 
      } 
      this.f = false;
      this.g = -1;
      velocityTracker = this.j;
      if (velocityTracker != null) {
        velocityTracker.recycle();
        this.j = null;
      } 
    } else {
      i = (int)paramMotionEvent.getX();
      int j = (int)paramMotionEvent.getY();
      if (velocityTracker.j((View)baseBehavior, i, j) && E((V)baseBehavior)) {
        this.h = j;
        this.g = paramMotionEvent.getPointerId(0);
        if (this.j == null)
          this.j = VelocityTracker.obtain(); 
      } else {
        return false;
      } 
    } 
    VelocityTracker velocityTracker = this.j;
  }
  
  public abstract boolean E(V paramV);
  
  public abstract int F();
  
  public final int G(CoordinatorLayout paramCoordinatorLayout, V paramV, int paramInt1, int paramInt2, int paramInt3) {
    return I(paramCoordinatorLayout, paramV, F() - paramInt1, paramInt2, paramInt3);
  }
  
  public int H(CoordinatorLayout paramCoordinatorLayout, V paramV, int paramInt) {
    return I(paramCoordinatorLayout, paramV, paramInt, -2147483648, 2147483647);
  }
  
  public abstract int I(CoordinatorLayout paramCoordinatorLayout, V paramV, int paramInt1, int paramInt2, int paramInt3);
  
  public boolean j(CoordinatorLayout paramCoordinatorLayout, V paramV, MotionEvent paramMotionEvent) {
    if (this.i < 0)
      this.i = ViewConfiguration.get(paramCoordinatorLayout.getContext()).getScaledTouchSlop(); 
    if (paramMotionEvent.getAction() == 2 && this.f)
      return true; 
    int i = paramMotionEvent.getActionMasked();
    if (i != 0) {
      if (i != 1)
        if (i != 2) {
          if (i != 3)
            VelocityTracker velocityTracker1 = this.j; 
        } else {
          i = this.g;
          if (i != -1) {
            i = paramMotionEvent.findPointerIndex(i);
            if (i != -1) {
              i = (int)paramMotionEvent.getY(i);
              if (Math.abs(i - this.h) > this.i) {
                this.f = true;
                this.h = i;
              } 
            } 
          } 
          VelocityTracker velocityTracker1 = this.j;
        }  
      this.f = false;
      this.g = -1;
      velocityTracker = this.j;
      if (velocityTracker != null) {
        velocityTracker.recycle();
        this.j = null;
      } 
    } else {
      this.f = false;
      i = (int)paramMotionEvent.getX();
      int j = (int)paramMotionEvent.getY();
      if (E(paramV) && velocityTracker.j((View)paramV, i, j)) {
        this.h = j;
        this.g = paramMotionEvent.getPointerId(0);
        if (this.j == null)
          this.j = VelocityTracker.obtain(); 
      } 
    } 
    VelocityTracker velocityTracker = this.j;
  }
  
  public class a implements Runnable {
    public final CoordinatorLayout b;
    
    public final V c;
    
    public final c d;
    
    public a(c this$0, CoordinatorLayout param1CoordinatorLayout, V param1V) {
      this.b = param1CoordinatorLayout;
      this.c = param1V;
    }
    
    public void run() {
      if (this.c != null) {
        OverScroller overScroller = this.d.e;
        if (overScroller != null)
          if (overScroller.computeScrollOffset()) {
            c<V> c1 = this.d;
            c1.H(this.b, this.c, c1.e.getCurrY());
            l.P((View)this.c, this);
          } else {
            c c1 = this.d;
            CoordinatorLayout coordinatorLayout = this.b;
            V v = this.c;
            AppBarLayout.BaseBehavior baseBehavior = (AppBarLayout.BaseBehavior)c1;
            if (baseBehavior != null) {
              AppBarLayout appBarLayout = (AppBarLayout)v;
              baseBehavior.P(coordinatorLayout, appBarLayout);
              if (appBarLayout.j)
                appBarLayout.c(appBarLayout.d(baseBehavior.L(coordinatorLayout))); 
            } else {
              throw null;
            } 
          }  
      } 
    }
  }
}


/* Location:              C:\Users\panch\Downloads\dvba_v1.1.0-dex2jar.jar!\c\c\a\b\m\c.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */