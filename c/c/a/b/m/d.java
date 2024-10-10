package c.c.a.b.m;

import a.a.a.a.a;
import android.content.Context;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.Gravity;
import android.view.View;
import android.view.ViewGroup;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import b.i.m.l;
import b.i.m.u;
import com.google.android.material.appbar.AppBarLayout;
import java.util.List;

public abstract class d extends e<View> {
  public final Rect d = new Rect();
  
  public final Rect e = new Rect();
  
  public int f = 0;
  
  public int g;
  
  public d() {}
  
  public d(Context paramContext, AttributeSet paramAttributeSet) {
    super(paramContext, paramAttributeSet);
  }
  
  public void C(CoordinatorLayout paramCoordinatorLayout, View paramView, int paramInt) {
    Rect rect;
    List list = paramCoordinatorLayout.d(paramView);
    AppBarLayout appBarLayout = ((AppBarLayout.ScrollingViewBehavior)this).F(list);
    if (appBarLayout != null) {
      CoordinatorLayout.f f = (CoordinatorLayout.f)paramView.getLayoutParams();
      Rect rect1 = this.d;
      int i2 = paramCoordinatorLayout.getPaddingLeft();
      int m = ((ViewGroup.MarginLayoutParams)f).leftMargin;
      int k = appBarLayout.getBottom();
      int i1 = ((ViewGroup.MarginLayoutParams)f).topMargin;
      int i3 = paramCoordinatorLayout.getWidth();
      int n = paramCoordinatorLayout.getPaddingRight();
      int j = ((ViewGroup.MarginLayoutParams)f).rightMargin;
      int i = paramCoordinatorLayout.getHeight();
      rect1.set(i2 + m, k + i1, i3 - n - j, appBarLayout.getBottom() + i - paramCoordinatorLayout.getPaddingBottom() - ((ViewGroup.MarginLayoutParams)f).bottomMargin);
      u u = paramCoordinatorLayout.getLastWindowInsets();
      if (u != null && l.o((View)paramCoordinatorLayout) && !paramView.getFitsSystemWindows()) {
        i = rect1.left;
        rect1.left = u.b() + i;
        rect1.right -= u.c();
      } 
      rect = this.e;
      i = f.c;
      if (i == 0)
        i = 8388659; 
      Gravity.apply(i, paramView.getMeasuredWidth(), paramView.getMeasuredHeight(), rect1, rect, paramInt);
      paramInt = E((View)appBarLayout);
      paramView.layout(rect.left, rect.top - paramInt, rect.right, rect.bottom - paramInt);
      paramInt = rect.top - appBarLayout.getBottom();
    } else {
      rect.q(paramView, paramInt);
      paramInt = 0;
    } 
    this.f = paramInt;
  }
  
  public final int E(View paramView) {
    int j = this.g;
    int i = 0;
    if (j != 0) {
      boolean bool = paramView instanceof AppBarLayout;
      float f2 = 0.0F;
      float f1 = f2;
      if (bool) {
        AppBarLayout appBarLayout = (AppBarLayout)paramView;
        j = appBarLayout.getTotalScrollRange();
        int k = appBarLayout.getDownNestedPreScrollRange();
        CoordinatorLayout.c c = ((CoordinatorLayout.f)appBarLayout.getLayoutParams()).a;
        if (c instanceof AppBarLayout.BaseBehavior) {
          i = ((AppBarLayout.BaseBehavior)c).F();
        } else {
          i = 0;
        } 
        if (k != 0 && j + i <= k) {
          f1 = f2;
        } else {
          j -= k;
          f1 = f2;
          if (j != 0)
            f1 = 1.0F + i / j; 
        } 
      } 
      i = this.g;
      i = a.j((int)(f1 * i), 0, i);
    } 
    return i;
  }
  
  public boolean l(CoordinatorLayout paramCoordinatorLayout, View paramView, int paramInt1, int paramInt2, int paramInt3, int paramInt4) {
    int i = (paramView.getLayoutParams()).height;
    if (i == -1 || i == -2) {
      List list = paramCoordinatorLayout.d(paramView);
      AppBarLayout appBarLayout = ((AppBarLayout.ScrollingViewBehavior)this).F(list);
      if (appBarLayout != null) {
        int j = View.MeasureSpec.getSize(paramInt3);
        if (j > 0) {
          paramInt3 = j;
          if (l.o((View)appBarLayout)) {
            u u = paramCoordinatorLayout.getLastWindowInsets();
            paramInt3 = j;
            if (u != null) {
              paramInt3 = u.d();
              paramInt3 = j + u.a() + paramInt3;
            } 
          } 
        } else {
          paramInt3 = paramCoordinatorLayout.getHeight();
        } 
        int m = appBarLayout.getTotalScrollRange();
        int k = appBarLayout.getMeasuredHeight();
        if (i == -1) {
          j = 1073741824;
        } else {
          j = Integer.MIN_VALUE;
        } 
        paramCoordinatorLayout.r(paramView, paramInt1, paramInt2, View.MeasureSpec.makeMeasureSpec(paramInt3 + m - k, j), paramInt4);
        return true;
      } 
    } 
    return false;
  }
}


/* Location:              C:\Users\panch\Downloads\dvba_v1.1.0-dex2jar.jar!\c\c\a\b\m\d.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */