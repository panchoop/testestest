package com.google.android.material.transformation;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewTreeObserver;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import b.i.m.l;
import java.util.List;

public abstract class ExpandableBehavior extends CoordinatorLayout.c<View> {
  public int a = 0;
  
  public ExpandableBehavior() {}
  
  public ExpandableBehavior(Context paramContext, AttributeSet paramAttributeSet) {
    super(paramContext, paramAttributeSet);
  }
  
  public final boolean B(boolean paramBoolean) {
    boolean bool2 = false;
    boolean bool1 = false;
    if (paramBoolean) {
      int i = this.a;
      if (i != 0) {
        paramBoolean = bool1;
        return (i == 2) ? true : paramBoolean;
      } 
    } else {
      paramBoolean = bool2;
      if (this.a == 1)
        paramBoolean = true; 
      return paramBoolean;
    } 
    return true;
  }
  
  public abstract boolean C(View paramView1, View paramView2, boolean paramBoolean1, boolean paramBoolean2);
  
  public boolean g(CoordinatorLayout paramCoordinatorLayout, View paramView1, View paramView2) {
    c.c.a.b.w.a a = (c.c.a.b.w.a)paramView2;
    if (B(a.a())) {
      byte b;
      if (a.a()) {
        b = 1;
      } else {
        b = 2;
      } 
      this.a = b;
      return C((View)a, paramView1, a.a(), true);
    } 
    return false;
  }
  
  public boolean k(CoordinatorLayout paramCoordinatorLayout, View paramView, int paramInt) {
    if (!l.E(paramView)) {
      List<View> list = paramCoordinatorLayout.d(paramView);
      int i = list.size();
      paramInt = 0;
      while (true) {
        if (paramInt < i) {
          View view = list.get(paramInt);
          if (d(paramCoordinatorLayout, paramView, view)) {
            c.c.a.b.w.a a = (c.c.a.b.w.a)view;
            break;
          } 
          paramInt++;
          continue;
        } 
        paramCoordinatorLayout = null;
        break;
      } 
      if (paramCoordinatorLayout != null && B(paramCoordinatorLayout.a())) {
        if (paramCoordinatorLayout.a()) {
          paramInt = 1;
        } else {
          paramInt = 2;
        } 
        this.a = paramInt;
        paramView.getViewTreeObserver().addOnPreDrawListener(new a(this, paramView, paramInt, (c.c.a.b.w.a)paramCoordinatorLayout));
      } 
    } 
    return false;
  }
  
  public class a implements ViewTreeObserver.OnPreDrawListener {
    public final View b;
    
    public final int c;
    
    public final c.c.a.b.w.a d;
    
    public final ExpandableBehavior e;
    
    public a(ExpandableBehavior this$0, View param1View, int param1Int, c.c.a.b.w.a param1a) {}
    
    public boolean onPreDraw() {
      this.b.getViewTreeObserver().removeOnPreDrawListener(this);
      ExpandableBehavior expandableBehavior = this.e;
      if (expandableBehavior.a == this.c) {
        c.c.a.b.w.a a1 = this.d;
        expandableBehavior.C((View)a1, this.b, a1.a(), false);
      } 
      return false;
    }
  }
}


/* Location:              C:\Users\panch\Downloads\dvba_v1.1.0-dex2jar.jar!\com\google\android\material\transformation\ExpandableBehavior.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */