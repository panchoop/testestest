package com.google.android.material.floatingactionbutton;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.Property;
import android.view.View;
import android.view.ViewGroup;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import b.i.m.l;
import c.c.a.b.k;
import c.c.a.b.l.g;
import c.c.a.b.x.i;
import c.c.a.b.y.d;
import com.google.android.material.appbar.AppBarLayout;
import com.google.android.material.button.MaterialButton;
import java.util.Iterator;
import java.util.List;

public class ExtendedFloatingActionButton extends MaterialButton implements CoordinatorLayout.b {
  public final Rect s;
  
  public final i t;
  
  public final i u;
  
  public final i v;
  
  public final i w;
  
  public boolean x;
  
  static {
    new a(Float.class, "width");
    new b(Float.class, "height");
  }
  
  public static void e(ExtendedFloatingActionButton paramExtendedFloatingActionButton, i parami) {
    if (paramExtendedFloatingActionButton != null) {
      if (!parami.c()) {
        boolean bool;
        if (l.E((View)paramExtendedFloatingActionButton) && !paramExtendedFloatingActionButton.isInEditMode()) {
          bool = true;
        } else {
          bool = false;
        } 
        if (!bool) {
          parami.g();
          parami.a(null);
        } else {
          paramExtendedFloatingActionButton.measure(0, 0);
          AnimatorSet animatorSet = parami.b();
          animatorSet.addListener((Animator.AnimatorListener)new c.c.a.b.x.a(paramExtendedFloatingActionButton, parami));
          Iterator<Animator.AnimatorListener> iterator = parami.f().iterator();
          while (iterator.hasNext())
            animatorSet.addListener(iterator.next()); 
          animatorSet.start();
        } 
      } 
      return;
    } 
    throw null;
  }
  
  public CoordinatorLayout.c<ExtendedFloatingActionButton> getBehavior() {
    return null;
  }
  
  public int getCollapsedSize() {
    int j = Math.min(l.v((View)this), getPaddingEnd());
    return getIconSize() + j * 2;
  }
  
  public g getExtendMotionSpec() {
    throw null;
  }
  
  public g getHideMotionSpec() {
    throw null;
  }
  
  public g getShowMotionSpec() {
    throw null;
  }
  
  public g getShrinkMotionSpec() {
    throw null;
  }
  
  public void onAttachedToWindow() {
    super.onAttachedToWindow();
    if (!this.x || !TextUtils.isEmpty(getText()) || getIcon() == null)
      return; 
    this.x = false;
    throw null;
  }
  
  public void setExtendMotionSpec(g paramg) {
    throw null;
  }
  
  public void setExtendMotionSpecResource(int paramInt) {
    setExtendMotionSpec(g.b(getContext(), paramInt));
  }
  
  public void setExtended(boolean paramBoolean) {
    if (this.x == paramBoolean)
      return; 
    throw new NullPointerException();
  }
  
  public void setHideMotionSpec(g paramg) {
    throw null;
  }
  
  public void setHideMotionSpecResource(int paramInt) {
    setHideMotionSpec(g.b(getContext(), paramInt));
  }
  
  public void setShowMotionSpec(g paramg) {
    throw null;
  }
  
  public void setShowMotionSpecResource(int paramInt) {
    setShowMotionSpec(g.b(getContext(), paramInt));
  }
  
  public void setShrinkMotionSpec(g paramg) {
    throw null;
  }
  
  public void setShrinkMotionSpecResource(int paramInt) {
    setShrinkMotionSpec(g.b(getContext(), paramInt));
  }
  
  public static class ExtendedFloatingActionButtonBehavior<T extends ExtendedFloatingActionButton> extends CoordinatorLayout.c<T> {
    public Rect a;
    
    public boolean b;
    
    public boolean c;
    
    public ExtendedFloatingActionButtonBehavior() {
      this.b = false;
      this.c = true;
    }
    
    public ExtendedFloatingActionButtonBehavior(Context param1Context, AttributeSet param1AttributeSet) {
      super(param1Context, param1AttributeSet);
      TypedArray typedArray = param1Context.obtainStyledAttributes(param1AttributeSet, k.ExtendedFloatingActionButton_Behavior_Layout);
      this.b = typedArray.getBoolean(k.ExtendedFloatingActionButton_Behavior_Layout_behavior_autoHide, false);
      this.c = typedArray.getBoolean(k.ExtendedFloatingActionButton_Behavior_Layout_behavior_autoShrink, true);
      typedArray.recycle();
    }
    
    public boolean B(ExtendedFloatingActionButton param1ExtendedFloatingActionButton, Rect param1Rect) {
      Rect rect = param1ExtendedFloatingActionButton.s;
      param1Rect.set(param1ExtendedFloatingActionButton.getLeft() + rect.left, param1ExtendedFloatingActionButton.getTop() + rect.top, param1ExtendedFloatingActionButton.getRight() - rect.right, param1ExtendedFloatingActionButton.getBottom() - rect.bottom);
      return true;
    }
    
    public final boolean C(View param1View, ExtendedFloatingActionButton param1ExtendedFloatingActionButton) {
      CoordinatorLayout.f f = (CoordinatorLayout.f)param1ExtendedFloatingActionButton.getLayoutParams();
      return (!this.b && !this.c) ? false : (!(f.f != param1View.getId()));
    }
    
    public final boolean D(CoordinatorLayout param1CoordinatorLayout, AppBarLayout param1AppBarLayout, ExtendedFloatingActionButton param1ExtendedFloatingActionButton) {
      if (!C((View)param1AppBarLayout, param1ExtendedFloatingActionButton))
        return false; 
      if (this.a == null)
        this.a = new Rect(); 
      Rect rect = this.a;
      d.a((ViewGroup)param1CoordinatorLayout, (View)param1AppBarLayout, rect);
      if (rect.bottom <= param1AppBarLayout.getMinimumHeightForVisibleOverlappingContent()) {
        i i;
        if (this.c) {
          i = param1ExtendedFloatingActionButton.t;
        } else {
          i = param1ExtendedFloatingActionButton.w;
        } 
        ExtendedFloatingActionButton.e(param1ExtendedFloatingActionButton, i);
      } else {
        i i;
        if (this.c) {
          i = param1ExtendedFloatingActionButton.u;
        } else {
          i = param1ExtendedFloatingActionButton.v;
        } 
        ExtendedFloatingActionButton.e(param1ExtendedFloatingActionButton, i);
      } 
      return true;
    }
    
    public final boolean E(View param1View, ExtendedFloatingActionButton param1ExtendedFloatingActionButton) {
      if (!C(param1View, param1ExtendedFloatingActionButton))
        return false; 
      CoordinatorLayout.f f = (CoordinatorLayout.f)param1ExtendedFloatingActionButton.getLayoutParams();
      if (param1View.getTop() < param1ExtendedFloatingActionButton.getHeight() / 2 + ((ViewGroup.MarginLayoutParams)f).topMargin) {
        i i;
        if (this.c) {
          i = param1ExtendedFloatingActionButton.t;
        } else {
          i = param1ExtendedFloatingActionButton.w;
        } 
        ExtendedFloatingActionButton.e(param1ExtendedFloatingActionButton, i);
      } else {
        i i;
        if (this.c) {
          i = param1ExtendedFloatingActionButton.u;
        } else {
          i = param1ExtendedFloatingActionButton.v;
        } 
        ExtendedFloatingActionButton.e(param1ExtendedFloatingActionButton, i);
      } 
      return true;
    }
    
    public void f(CoordinatorLayout.f param1f) {
      if (param1f.h == 0)
        param1f.h = 80; 
    }
    
    public boolean g(CoordinatorLayout param1CoordinatorLayout, View param1View1, View param1View2) {
      ExtendedFloatingActionButton extendedFloatingActionButton = (ExtendedFloatingActionButton)param1View1;
      if (param1View2 instanceof AppBarLayout) {
        D(param1CoordinatorLayout, (AppBarLayout)param1View2, extendedFloatingActionButton);
      } else {
        boolean bool;
        ViewGroup.LayoutParams layoutParams = param1View2.getLayoutParams();
        if (layoutParams instanceof CoordinatorLayout.f) {
          bool = ((CoordinatorLayout.f)layoutParams).a instanceof com.google.android.material.bottomsheet.BottomSheetBehavior;
        } else {
          bool = false;
        } 
        if (bool)
          E(param1View2, extendedFloatingActionButton); 
      } 
      return false;
    }
    
    public boolean k(CoordinatorLayout param1CoordinatorLayout, View param1View, int param1Int) {
      ExtendedFloatingActionButton extendedFloatingActionButton = (ExtendedFloatingActionButton)param1View;
      List<View> list = param1CoordinatorLayout.d((View)extendedFloatingActionButton);
      int i = list.size();
      for (byte b = 0; b < i; b++) {
        View view = list.get(b);
        if (view instanceof AppBarLayout) {
          if (D(param1CoordinatorLayout, (AppBarLayout)view, extendedFloatingActionButton))
            break; 
        } else {
          boolean bool;
          ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
          if (layoutParams instanceof CoordinatorLayout.f) {
            bool = ((CoordinatorLayout.f)layoutParams).a instanceof com.google.android.material.bottomsheet.BottomSheetBehavior;
          } else {
            bool = false;
          } 
          if (bool && E(view, extendedFloatingActionButton))
            break; 
        } 
      } 
      param1CoordinatorLayout.q((View)extendedFloatingActionButton, param1Int);
      return true;
    }
  }
  
  public static final class a extends Property<View, Float> {
    public a(Class param1Class, String param1String) {
      super(param1Class, param1String);
    }
    
    public Object get(Object param1Object) {
      return Float.valueOf((((View)param1Object).getLayoutParams()).width);
    }
    
    public void set(Object param1Object1, Object param1Object2) {
      param1Object1 = param1Object1;
      param1Object2 = param1Object2;
      (param1Object1.getLayoutParams()).width = param1Object2.intValue();
      param1Object1.requestLayout();
    }
  }
  
  public static final class b extends Property<View, Float> {
    public b(Class param1Class, String param1String) {
      super(param1Class, param1String);
    }
    
    public Object get(Object param1Object) {
      return Float.valueOf((((View)param1Object).getLayoutParams()).height);
    }
    
    public void set(Object param1Object1, Object param1Object2) {
      param1Object1 = param1Object1;
      param1Object2 = param1Object2;
      (param1Object1.getLayoutParams()).height = param1Object2.intValue();
      param1Object1.requestLayout();
    }
  }
  
  public static abstract class c {}
}


/* Location:              C:\Users\panch\Downloads\dvba_v1.1.0-dex2jar.jar!\com\google\android\material\floatingactionbutton\ExtendedFloatingActionButton.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */