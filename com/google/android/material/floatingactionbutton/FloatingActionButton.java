package com.google.android.material.floatingactionbutton;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.ColorFilter;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.coordinatorlayout.widget.CoordinatorLayout.d;
import b.b.p.j;
import b.i.m.l;
import c.c.a.b.d;
import c.c.a.b.d0.j;
import c.c.a.b.d0.n;
import c.c.a.b.k;
import c.c.a.b.l.g;
import c.c.a.b.l.j;
import c.c.a.b.w.a;
import c.c.a.b.x.d;
import c.c.a.b.x.e;
import c.c.a.b.x.g;
import c.c.a.b.x.h;
import c.c.a.b.y.d;
import c.c.a.b.y.j;
import com.google.android.material.appbar.AppBarLayout;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

@d(FloatingActionButton.Behavior.class)
public class FloatingActionButton extends j implements a, n {
  public ColorStateList c;
  
  public PorterDuff.Mode d;
  
  public ColorStateList e;
  
  public PorterDuff.Mode f;
  
  public ColorStateList g;
  
  public int h;
  
  public int i;
  
  public int j;
  
  public boolean k;
  
  public final Rect l;
  
  public e m;
  
  private e getImpl() {
    if (this.m == null)
      this.m = (e)new h(this, new b(this)); 
    return this.m;
  }
  
  public static int m(int paramInt1, int paramInt2) {
    int i = View.MeasureSpec.getMode(paramInt2);
    paramInt2 = View.MeasureSpec.getSize(paramInt2);
    if (i != Integer.MIN_VALUE) {
      if (i != 0)
        if (i == 1073741824) {
          paramInt1 = paramInt2;
        } else {
          throw new IllegalArgumentException();
        }  
    } else {
      paramInt1 = Math.min(paramInt1, paramInt2);
    } 
    return paramInt1;
  }
  
  public boolean a() {
    throw null;
  }
  
  public void d(Animator.AnimatorListener paramAnimatorListener) {
    e e1 = getImpl();
    if (e1.r == null)
      e1.r = new ArrayList(); 
    e1.r.add(null);
  }
  
  public void drawableStateChanged() {
    super.drawableStateChanged();
    getImpl().i(getDrawableState());
  }
  
  public void e(Animator.AnimatorListener paramAnimatorListener) {
    e e1 = getImpl();
    if (e1.q == null)
      e1.q = new ArrayList(); 
    e1.q.add(paramAnimatorListener);
  }
  
  public void f(j<? extends FloatingActionButton> paramj) {
    e e1 = getImpl();
    c<FloatingActionButton> c = new c<FloatingActionButton>(this, null);
    if (e1.s == null)
      e1.s = new ArrayList(); 
    e1.s.add(c);
  }
  
  @Deprecated
  public boolean g(Rect paramRect) {
    if (!l.E((View)this))
      return false; 
    paramRect.set(0, 0, getWidth(), getHeight());
    throw null;
  }
  
  public ColorStateList getBackgroundTintList() {
    return this.c;
  }
  
  public PorterDuff.Mode getBackgroundTintMode() {
    return this.d;
  }
  
  public float getCompatElevation() {
    return getImpl().c();
  }
  
  public float getCompatHoveredFocusedTranslationZ() {
    return (getImpl()).f;
  }
  
  public float getCompatPressedTranslationZ() {
    return (getImpl()).g;
  }
  
  public Drawable getContentBackground() {
    if (getImpl() != null)
      return null; 
    throw null;
  }
  
  public int getCustomSize() {
    return this.i;
  }
  
  public int getExpandedComponentIdHint() {
    throw null;
  }
  
  public g getHideMotionSpec() {
    return (getImpl()).m;
  }
  
  @Deprecated
  public int getRippleColor() {
    boolean bool;
    ColorStateList colorStateList = this.g;
    if (colorStateList != null) {
      bool = colorStateList.getDefaultColor();
    } else {
      bool = false;
    } 
    return bool;
  }
  
  public ColorStateList getRippleColorStateList() {
    return this.g;
  }
  
  public j getShapeAppearanceModel() {
    j j1 = (getImpl()).a;
    a.a.a.a.a.g(j1);
    return j1;
  }
  
  public g getShowMotionSpec() {
    return (getImpl()).l;
  }
  
  public int getSize() {
    return this.h;
  }
  
  public int getSizeDimension() {
    return h(this.h);
  }
  
  public ColorStateList getSupportBackgroundTintList() {
    return getBackgroundTintList();
  }
  
  public PorterDuff.Mode getSupportBackgroundTintMode() {
    return getBackgroundTintMode();
  }
  
  public ColorStateList getSupportImageTintList() {
    return this.e;
  }
  
  public PorterDuff.Mode getSupportImageTintMode() {
    return this.f;
  }
  
  public boolean getUseCompatPadding() {
    return this.k;
  }
  
  public final int h(int paramInt) {
    int i = this.i;
    if (i != 0)
      return i; 
    Resources resources = getResources();
    if (paramInt != -1) {
      if (paramInt != 1) {
        paramInt = d.design_fab_size_normal;
        return resources.getDimensionPixelSize(paramInt);
      } 
      paramInt = d.design_fab_size_mini;
      return resources.getDimensionPixelSize(paramInt);
    } 
    if (Math.max((resources.getConfiguration()).screenWidthDp, (resources.getConfiguration()).screenHeightDp) < 470) {
      paramInt = h(1);
    } else {
      paramInt = h(0);
    } 
    return paramInt;
  }
  
  public void i(a parama, boolean paramBoolean) {
    c.c.a.b.x.b b;
    e e1 = getImpl();
    if (parama == null) {
      parama = null;
    } else {
      b = new c.c.a.b.x.b(this, parama);
    } 
    if (!e1.e()) {
      Iterator<Animator.AnimatorListener> iterator;
      Animator animator = e1.k;
      if (animator != null)
        animator.cancel(); 
      if (e1.q()) {
        g g = e1.m;
        if (g == null) {
          if (e1.j == null)
            e1.j = g.b(e1.t.getContext(), c.c.a.b.a.design_fab_hide_motion_spec); 
          g = e1.j;
          a.a.a.a.a.g(g);
        } 
        AnimatorSet animatorSet = e1.a(g, 0.0F, 0.0F, 0.0F);
        animatorSet.addListener((Animator.AnimatorListener)new c.c.a.b.x.c(e1, paramBoolean, (e.f)b));
        ArrayList arrayList = e1.r;
        if (arrayList != null) {
          iterator = arrayList.iterator();
          while (iterator.hasNext())
            animatorSet.addListener(iterator.next()); 
        } 
        animatorSet.start();
      } else {
        byte b1;
        FloatingActionButton floatingActionButton = e1.t;
        if (paramBoolean) {
          b1 = 8;
        } else {
          b1 = 4;
        } 
        floatingActionButton.b(b1, paramBoolean);
        if (iterator != null)
          ((c.c.a.b.x.b)iterator).a.a(((c.c.a.b.x.b)iterator).b); 
      } 
    } 
  }
  
  public boolean j() {
    return getImpl().e();
  }
  
  public void jumpDrawablesToCurrentState() {
    super.jumpDrawablesToCurrentState();
    getImpl().g();
  }
  
  public boolean k() {
    return getImpl().f();
  }
  
  public final void l() {
    Drawable drawable = getDrawable();
    if (drawable == null)
      return; 
    ColorStateList colorStateList = this.e;
    if (colorStateList == null) {
      a.a.a.a.a.k(drawable);
      return;
    } 
    int i = colorStateList.getColorForState(getDrawableState(), 0);
    PorterDuff.Mode mode2 = this.f;
    PorterDuff.Mode mode1 = mode2;
    if (mode2 == null)
      mode1 = PorterDuff.Mode.SRC_IN; 
    drawable.mutate().setColorFilter((ColorFilter)j.c(i, mode1));
  }
  
  public void n(a parama, boolean paramBoolean) {
    c.c.a.b.x.b b;
    e e1 = getImpl();
    if (parama == null) {
      parama = null;
    } else {
      b = new c.c.a.b.x.b(this, parama);
    } 
    if (!e1.f()) {
      Iterator<Animator.AnimatorListener> iterator;
      Animator animator = e1.k;
      if (animator != null)
        animator.cancel(); 
      if (e1.q()) {
        if (e1.t.getVisibility() != 0) {
          e1.t.setAlpha(0.0F);
          e1.t.setScaleY(0.0F);
          e1.t.setScaleX(0.0F);
          e1.n(0.0F);
        } 
        g g = e1.l;
        if (g == null) {
          if (e1.i == null)
            e1.i = g.b(e1.t.getContext(), c.c.a.b.a.design_fab_show_motion_spec); 
          g = e1.i;
          a.a.a.a.a.g(g);
        } 
        AnimatorSet animatorSet = e1.a(g, 1.0F, 1.0F, 1.0F);
        animatorSet.addListener((Animator.AnimatorListener)new d(e1, paramBoolean, (e.f)b));
        ArrayList arrayList = e1.q;
        if (arrayList != null) {
          iterator = arrayList.iterator();
          while (iterator.hasNext())
            animatorSet.addListener(iterator.next()); 
        } 
        animatorSet.start();
      } else {
        e1.t.b(0, paramBoolean);
        e1.t.setAlpha(1.0F);
        e1.t.setScaleY(1.0F);
        e1.t.setScaleX(1.0F);
        e1.n(1.0F);
        if (iterator != null)
          ((c.c.a.b.x.b)iterator).a.b(((c.c.a.b.x.b)iterator).b); 
      } 
    } 
  }
  
  public void onAttachedToWindow() {
    super.onAttachedToWindow();
    e e1 = getImpl();
    if (e1.m()) {
      ViewTreeObserver viewTreeObserver = e1.t.getViewTreeObserver();
      if (e1.z == null)
        e1.z = (ViewTreeObserver.OnPreDrawListener)new g(e1); 
      viewTreeObserver.addOnPreDrawListener(e1.z);
    } 
  }
  
  public void onDetachedFromWindow() {
    super.onDetachedFromWindow();
    e e1 = getImpl();
    ViewTreeObserver viewTreeObserver = e1.t.getViewTreeObserver();
    ViewTreeObserver.OnPreDrawListener onPreDrawListener = e1.z;
    if (onPreDrawListener != null) {
      viewTreeObserver.removeOnPreDrawListener(onPreDrawListener);
      e1.z = null;
    } 
  }
  
  public void onMeasure(int paramInt1, int paramInt2) {
    int i = getSizeDimension();
    this.j = (i + 0) / 2;
    getImpl().t();
    Math.min(m(i, paramInt1), m(i, paramInt2));
    throw null;
  }
  
  public void onRestoreInstanceState(Parcelable paramParcelable) {
    if (!(paramParcelable instanceof c.c.a.b.f0.a)) {
      super.onRestoreInstanceState(paramParcelable);
      return;
    } 
    c.c.a.b.f0.a a1 = (c.c.a.b.f0.a)paramParcelable;
    super.onRestoreInstanceState(((b.k.a.a)a1).b);
    Object object = a1.d.getOrDefault("expandableWidgetHelper", null);
    a.a.a.a.a.g(object);
    object = object;
    throw null;
  }
  
  public Parcelable onSaveInstanceState() {
    if (super.onSaveInstanceState() == null)
      new Bundle(); 
    b.k.a.a a1 = b.k.a.a.c;
    throw null;
  }
  
  public boolean onTouchEvent(MotionEvent paramMotionEvent) {
    if (paramMotionEvent.getAction() == 0)
      g(null); 
    return super.onTouchEvent(paramMotionEvent);
  }
  
  public void setBackgroundColor(int paramInt) {
    Log.i("FloatingActionButton", "Setting a custom background is not supported.");
  }
  
  public void setBackgroundDrawable(Drawable paramDrawable) {
    Log.i("FloatingActionButton", "Setting a custom background is not supported.");
  }
  
  public void setBackgroundResource(int paramInt) {
    Log.i("FloatingActionButton", "Setting a custom background is not supported.");
  }
  
  public void setBackgroundTintList(ColorStateList paramColorStateList) {
    if (this.c != paramColorStateList) {
      this.c = paramColorStateList;
      if (getImpl() == null)
        throw null; 
    } 
  }
  
  public void setBackgroundTintMode(PorterDuff.Mode paramMode) {
    if (this.d != paramMode) {
      this.d = paramMode;
      if (getImpl() == null)
        throw null; 
    } 
  }
  
  public void setCompatElevation(float paramFloat) {
    e e1 = getImpl();
    if (e1.e != paramFloat) {
      e1.e = paramFloat;
      e1.j(paramFloat, e1.f, e1.g);
    } 
  }
  
  public void setCompatElevationResource(int paramInt) {
    setCompatElevation(getResources().getDimension(paramInt));
  }
  
  public void setCompatHoveredFocusedTranslationZ(float paramFloat) {
    e e1 = getImpl();
    if (e1.f != paramFloat) {
      e1.f = paramFloat;
      e1.j(e1.e, paramFloat, e1.g);
    } 
  }
  
  public void setCompatHoveredFocusedTranslationZResource(int paramInt) {
    setCompatHoveredFocusedTranslationZ(getResources().getDimension(paramInt));
  }
  
  public void setCompatPressedTranslationZ(float paramFloat) {
    e e1 = getImpl();
    if (e1.g != paramFloat) {
      e1.g = paramFloat;
      e1.j(e1.e, e1.f, paramFloat);
    } 
  }
  
  public void setCompatPressedTranslationZResource(int paramInt) {
    setCompatPressedTranslationZ(getResources().getDimension(paramInt));
  }
  
  public void setCustomSize(int paramInt) {
    if (paramInt >= 0) {
      if (paramInt != this.i) {
        this.i = paramInt;
        requestLayout();
      } 
      return;
    } 
    throw new IllegalArgumentException("Custom size must be non-negative");
  }
  
  public void setElevation(float paramFloat) {
    super.setElevation(paramFloat);
    if (getImpl() != null)
      return; 
    throw null;
  }
  
  public void setEnsureMinTouchTargetSize(boolean paramBoolean) {
    if (paramBoolean != (getImpl()).c) {
      (getImpl()).c = paramBoolean;
      requestLayout();
    } 
  }
  
  public void setExpandedComponentIdHint(int paramInt) {
    throw null;
  }
  
  public void setHideMotionSpec(g paramg) {
    (getImpl()).m = paramg;
  }
  
  public void setHideMotionSpecResource(int paramInt) {
    setHideMotionSpec(g.b(getContext(), paramInt));
  }
  
  public void setImageDrawable(Drawable paramDrawable) {
    if (getDrawable() != paramDrawable) {
      super.setImageDrawable(paramDrawable);
      e e1 = getImpl();
      e1.n(e1.o);
      if (this.e != null)
        l(); 
    } 
  }
  
  public void setImageResource(int paramInt) {
    throw null;
  }
  
  public void setRippleColor(int paramInt) {
    setRippleColor(ColorStateList.valueOf(paramInt));
  }
  
  public void setRippleColor(ColorStateList paramColorStateList) {
    if (this.g != paramColorStateList) {
      this.g = paramColorStateList;
      getImpl().o(this.g);
    } 
  }
  
  public void setScaleX(float paramFloat) {
    super.setScaleX(paramFloat);
    getImpl().k();
  }
  
  public void setScaleY(float paramFloat) {
    super.setScaleY(paramFloat);
    getImpl().k();
  }
  
  public void setShadowPaddingEnabled(boolean paramBoolean) {
    e e1 = getImpl();
    e1.d = paramBoolean;
    e1.t();
  }
  
  public void setShapeAppearanceModel(j paramj) {
    (getImpl()).a = paramj;
  }
  
  public void setShowMotionSpec(g paramg) {
    (getImpl()).l = paramg;
  }
  
  public void setShowMotionSpecResource(int paramInt) {
    setShowMotionSpec(g.b(getContext(), paramInt));
  }
  
  public void setSize(int paramInt) {
    this.i = 0;
    if (paramInt != this.h) {
      this.h = paramInt;
      requestLayout();
    } 
  }
  
  public void setSupportBackgroundTintList(ColorStateList paramColorStateList) {
    setBackgroundTintList(paramColorStateList);
  }
  
  public void setSupportBackgroundTintMode(PorterDuff.Mode paramMode) {
    setBackgroundTintMode(paramMode);
  }
  
  public void setSupportImageTintList(ColorStateList paramColorStateList) {
    if (this.e != paramColorStateList) {
      this.e = paramColorStateList;
      l();
    } 
  }
  
  public void setSupportImageTintMode(PorterDuff.Mode paramMode) {
    if (this.f != paramMode) {
      this.f = paramMode;
      l();
    } 
  }
  
  public void setTranslationX(float paramFloat) {
    super.setTranslationX(paramFloat);
    getImpl().l();
  }
  
  public void setTranslationY(float paramFloat) {
    super.setTranslationY(paramFloat);
    getImpl().l();
  }
  
  public void setTranslationZ(float paramFloat) {
    super.setTranslationZ(paramFloat);
    getImpl().l();
  }
  
  public void setUseCompatPadding(boolean paramBoolean) {
    if (this.k != paramBoolean) {
      this.k = paramBoolean;
      getImpl().h();
    } 
  }
  
  public void setVisibility(int paramInt) {
    super.setVisibility(paramInt);
  }
  
  public static class BaseBehavior<T extends FloatingActionButton> extends CoordinatorLayout.c<T> {
    public Rect a;
    
    public boolean b;
    
    public BaseBehavior() {
      this.b = true;
    }
    
    public BaseBehavior(Context param1Context, AttributeSet param1AttributeSet) {
      super(param1Context, param1AttributeSet);
      TypedArray typedArray = param1Context.obtainStyledAttributes(param1AttributeSet, k.FloatingActionButton_Behavior_Layout);
      this.b = typedArray.getBoolean(k.FloatingActionButton_Behavior_Layout_behavior_autoHide, true);
      typedArray.recycle();
    }
    
    public boolean B(FloatingActionButton param1FloatingActionButton, Rect param1Rect) {
      Rect rect = param1FloatingActionButton.l;
      param1Rect.set(param1FloatingActionButton.getLeft() + rect.left, param1FloatingActionButton.getTop() + rect.top, param1FloatingActionButton.getRight() - rect.right, param1FloatingActionButton.getBottom() - rect.bottom);
      return true;
    }
    
    public final boolean C(View param1View, FloatingActionButton param1FloatingActionButton) {
      CoordinatorLayout.f f = (CoordinatorLayout.f)param1FloatingActionButton.getLayoutParams();
      return !this.b ? false : ((f.f != param1View.getId()) ? false : (!(param1FloatingActionButton.getUserSetVisibility() != 0)));
    }
    
    public final boolean D(CoordinatorLayout param1CoordinatorLayout, AppBarLayout param1AppBarLayout, FloatingActionButton param1FloatingActionButton) {
      if (!C((View)param1AppBarLayout, param1FloatingActionButton))
        return false; 
      if (this.a == null)
        this.a = new Rect(); 
      Rect rect = this.a;
      d.a((ViewGroup)param1CoordinatorLayout, (View)param1AppBarLayout, rect);
      if (rect.bottom <= param1AppBarLayout.getMinimumHeightForVisibleOverlappingContent()) {
        param1FloatingActionButton.i(null, false);
      } else {
        param1FloatingActionButton.n(null, false);
      } 
      return true;
    }
    
    public final boolean E(View param1View, FloatingActionButton param1FloatingActionButton) {
      if (!C(param1View, param1FloatingActionButton))
        return false; 
      CoordinatorLayout.f f = (CoordinatorLayout.f)param1FloatingActionButton.getLayoutParams();
      if (param1View.getTop() < param1FloatingActionButton.getHeight() / 2 + ((ViewGroup.MarginLayoutParams)f).topMargin) {
        param1FloatingActionButton.i(null, false);
      } else {
        param1FloatingActionButton.n(null, false);
      } 
      return true;
    }
    
    public void f(CoordinatorLayout.f param1f) {
      if (param1f.h == 0)
        param1f.h = 80; 
    }
    
    public boolean g(CoordinatorLayout param1CoordinatorLayout, View param1View1, View param1View2) {
      FloatingActionButton floatingActionButton = (FloatingActionButton)param1View1;
      if (param1View2 instanceof AppBarLayout) {
        D(param1CoordinatorLayout, (AppBarLayout)param1View2, floatingActionButton);
      } else {
        boolean bool;
        ViewGroup.LayoutParams layoutParams = param1View2.getLayoutParams();
        if (layoutParams instanceof CoordinatorLayout.f) {
          bool = ((CoordinatorLayout.f)layoutParams).a instanceof com.google.android.material.bottomsheet.BottomSheetBehavior;
        } else {
          bool = false;
        } 
        if (bool)
          E(param1View2, floatingActionButton); 
      } 
      return false;
    }
    
    public boolean k(CoordinatorLayout param1CoordinatorLayout, View param1View, int param1Int) {
      FloatingActionButton floatingActionButton = (FloatingActionButton)param1View;
      List<View> list = param1CoordinatorLayout.d((View)floatingActionButton);
      int i = list.size();
      for (byte b = 0; b < i; b++) {
        View view = list.get(b);
        if (view instanceof AppBarLayout) {
          if (D(param1CoordinatorLayout, (AppBarLayout)view, floatingActionButton))
            break; 
        } else {
          boolean bool;
          ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
          if (layoutParams instanceof CoordinatorLayout.f) {
            bool = ((CoordinatorLayout.f)layoutParams).a instanceof com.google.android.material.bottomsheet.BottomSheetBehavior;
          } else {
            bool = false;
          } 
          if (bool && E(view, floatingActionButton))
            break; 
        } 
      } 
      param1CoordinatorLayout.q((View)floatingActionButton, param1Int);
      return true;
    }
  }
  
  public static class Behavior extends BaseBehavior<FloatingActionButton> {
    public Behavior() {}
    
    public Behavior(Context param1Context, AttributeSet param1AttributeSet) {
      super(param1Context, param1AttributeSet);
    }
  }
  
  public static abstract class a {
    public void a(FloatingActionButton param1FloatingActionButton) {}
    
    public void b(FloatingActionButton param1FloatingActionButton) {}
  }
  
  public class b implements c.c.a.b.c0.b {
    public final FloatingActionButton a;
    
    public b(FloatingActionButton this$0) {}
  }
  
  public class c<T extends FloatingActionButton> implements e.e {
    public final j<T> a;
    
    public final FloatingActionButton b;
    
    public c(FloatingActionButton this$0, j<T> param1j) {
      this.a = param1j;
    }
    
    public void a() {
      this.a.a((View)this.b);
    }
    
    public void b() {
      this.a.b((View)this.b);
    }
    
    public boolean equals(Object param1Object) {
      boolean bool;
      if (param1Object instanceof c && ((c)param1Object).a.equals(this.a)) {
        bool = true;
      } else {
        bool = false;
      } 
      return bool;
    }
    
    public int hashCode() {
      return this.a.hashCode();
    }
  }
}


/* Location:              C:\Users\panch\Downloads\dvba_v1.1.0-dex2jar.jar!\com\google\android\material\floatingactionbutton\FloatingActionButton.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */