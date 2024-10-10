package androidx.appcompat.widget;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.Configuration;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.AttributeSet;
import android.view.Menu;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewPropertyAnimator;
import android.view.Window;
import android.view.WindowInsets;
import android.widget.OverScroller;
import b.b.f;
import b.b.k.u;
import b.b.o.g;
import b.b.o.i.m;
import b.b.p.c0;
import b.b.p.d0;
import b.i.m.g;
import b.i.m.h;
import b.i.m.i;
import b.i.m.l;
import b.i.m.u;

@SuppressLint({"UnknownNullness"})
public class ActionBarOverlayLayout extends ViewGroup implements c0, g, h {
  public static final int[] G = new int[] { b.b.a.actionBarSize, 16842841 };
  
  public OverScroller A;
  
  public ViewPropertyAnimator B;
  
  public final AnimatorListenerAdapter C;
  
  public final Runnable D;
  
  public final Runnable E;
  
  public final i F;
  
  public int b;
  
  public int c = 0;
  
  public ContentFrameLayout d;
  
  public ActionBarContainer e;
  
  public d0 f;
  
  public Drawable g;
  
  public boolean h;
  
  public boolean i;
  
  public boolean j;
  
  public boolean k;
  
  public boolean l;
  
  public int m;
  
  public int n;
  
  public final Rect o = new Rect();
  
  public final Rect p = new Rect();
  
  public final Rect q = new Rect();
  
  public final Rect r = new Rect();
  
  public final Rect s = new Rect();
  
  public final Rect t = new Rect();
  
  public final Rect u = new Rect();
  
  public u v;
  
  public u w;
  
  public u x;
  
  public u y;
  
  public d z;
  
  public ActionBarOverlayLayout(Context paramContext, AttributeSet paramAttributeSet) {
    super(paramContext, paramAttributeSet);
    u u1 = u.b;
    this.v = u1;
    this.w = u1;
    this.x = u1;
    this.y = u1;
    this.C = new a(this);
    this.D = new b(this);
    this.E = new c(this);
    r(paramContext);
    this.F = new i();
  }
  
  public boolean a() {
    s();
    return this.f.a();
  }
  
  public void b(Menu paramMenu, m.a parama) {
    s();
    this.f.b(paramMenu, parama);
  }
  
  public boolean c() {
    s();
    return this.f.c();
  }
  
  public boolean checkLayoutParams(ViewGroup.LayoutParams paramLayoutParams) {
    return paramLayoutParams instanceof e;
  }
  
  public void d() {
    s();
    this.f.d();
  }
  
  public void draw(Canvas paramCanvas) {
    super.draw(paramCanvas);
    if (this.g != null && !this.h) {
      byte b;
      if (this.e.getVisibility() == 0) {
        float f = this.e.getBottom();
        b = (int)(this.e.getTranslationY() + f + 0.5F);
      } else {
        b = 0;
      } 
      this.g.setBounds(0, b, getWidth(), this.g.getIntrinsicHeight() + b);
      this.g.draw(paramCanvas);
    } 
  }
  
  public boolean e() {
    s();
    return this.f.e();
  }
  
  public boolean f() {
    s();
    return this.f.f();
  }
  
  public boolean fitSystemWindows(Rect paramRect) {
    return super.fitSystemWindows(paramRect);
  }
  
  public boolean g() {
    s();
    return this.f.g();
  }
  
  public ViewGroup.LayoutParams generateDefaultLayoutParams() {
    return (ViewGroup.LayoutParams)new e(-1, -1);
  }
  
  public ViewGroup.LayoutParams generateLayoutParams(AttributeSet paramAttributeSet) {
    return (ViewGroup.LayoutParams)new e(getContext(), paramAttributeSet);
  }
  
  public ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams paramLayoutParams) {
    return (ViewGroup.LayoutParams)new e(paramLayoutParams);
  }
  
  public int getActionBarHideOffset() {
    boolean bool;
    ActionBarContainer actionBarContainer = this.e;
    if (actionBarContainer != null) {
      bool = -((int)actionBarContainer.getTranslationY());
    } else {
      bool = false;
    } 
    return bool;
  }
  
  public int getNestedScrollAxes() {
    return this.F.a();
  }
  
  public CharSequence getTitle() {
    s();
    return this.f.getTitle();
  }
  
  public void h(int paramInt) {
    s();
    if (paramInt != 2) {
      if (paramInt != 5) {
        if (paramInt == 109)
          setOverlayMode(true); 
      } else {
        this.f.r();
      } 
    } else {
      this.f.l();
    } 
  }
  
  public void i(View paramView1, View paramView2, int paramInt1, int paramInt2) {
    if (paramInt2 == 0)
      onNestedScrollAccepted(paramView1, paramView2, paramInt1); 
  }
  
  public void j() {
    s();
    this.f.h();
  }
  
  public void k(View paramView, int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5, int[] paramArrayOfint) {
    if (paramInt5 == 0)
      onNestedScroll(paramView, paramInt1, paramInt2, paramInt3, paramInt4); 
  }
  
  public void l(View paramView, int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5) {
    if (paramInt5 == 0)
      onNestedScroll(paramView, paramInt1, paramInt2, paramInt3, paramInt4); 
  }
  
  public void m(View paramView, int paramInt) {
    if (paramInt == 0)
      onStopNestedScroll(paramView); 
  }
  
  public void n(View paramView, int paramInt1, int paramInt2, int[] paramArrayOfint, int paramInt3) {
    if (paramInt3 == 0)
      onNestedPreScroll(paramView, paramInt1, paramInt2, paramArrayOfint); 
  }
  
  public boolean o(View paramView1, View paramView2, int paramInt1, int paramInt2) {
    boolean bool;
    if (paramInt2 == 0 && onStartNestedScroll(paramView1, paramView2, paramInt1)) {
      bool = true;
    } else {
      bool = false;
    } 
    return bool;
  }
  
  public WindowInsets onApplyWindowInsets(WindowInsets paramWindowInsets) {
    s();
    if (paramWindowInsets != null) {
      u u1 = new u(paramWindowInsets);
      Rect rect = new Rect(u1.b(), u1.d(), u1.c(), u1.a());
      boolean bool1 = p((View)this.e, rect, true, true, false, true);
      l.d((View)this, u1, this.o);
      rect = this.o;
      int m = rect.left;
      int n = rect.top;
      int k = rect.right;
      int j = rect.bottom;
      u u2 = u1.a.g(m, n, k, j);
      this.v = u2;
      boolean bool2 = this.w.equals(u2);
      boolean bool = true;
      if (!bool2) {
        this.w = this.v;
        bool1 = true;
      } 
      if (!this.p.equals(this.o)) {
        this.p.set(this.o);
        bool1 = bool;
      } 
      if (bool1)
        requestLayout(); 
      return ((u1.a.a()).a.c()).a.b().g();
    } 
    throw null;
  }
  
  public void onConfigurationChanged(Configuration paramConfiguration) {
    super.onConfigurationChanged(paramConfiguration);
    r(getContext());
    l.U((View)this);
  }
  
  public void onDetachedFromWindow() {
    super.onDetachedFromWindow();
    q();
  }
  
  public void onLayout(boolean paramBoolean, int paramInt1, int paramInt2, int paramInt3, int paramInt4) {
    paramInt4 = getChildCount();
    paramInt2 = getPaddingLeft();
    paramInt3 = getPaddingTop();
    for (paramInt1 = 0; paramInt1 < paramInt4; paramInt1++) {
      View view = getChildAt(paramInt1);
      if (view.getVisibility() != 8) {
        e e = (e)view.getLayoutParams();
        int k = view.getMeasuredWidth();
        int j = view.getMeasuredHeight();
        int n = e.leftMargin + paramInt2;
        int m = e.topMargin + paramInt3;
        view.layout(n, m, k + n, j + m);
      } 
    } 
  }
  
  public void onMeasure(int paramInt1, int paramInt2) {
    s();
    measureChildWithMargins((View)this.e, paramInt1, 0, paramInt2, 0);
    e e2 = (e)this.e.getLayoutParams();
    int i2 = Math.max(0, this.e.getMeasuredWidth() + e2.leftMargin + e2.rightMargin);
    int i1 = Math.max(0, this.e.getMeasuredHeight() + e2.topMargin + e2.bottomMargin);
    int n = View.combineMeasuredStates(0, this.e.getMeasuredState());
    if ((l.y((View)this) & 0x100) != 0) {
      k = 1;
    } else {
      k = 0;
    } 
    if (k) {
      int i3 = this.b;
      j = i3;
      if (this.j) {
        j = i3;
        if (this.e.getTabContainer() != null)
          j = i3 + this.b; 
      } 
    } else if (this.e.getVisibility() != 8) {
      j = this.e.getMeasuredHeight();
    } else {
      j = 0;
    } 
    this.q.set(this.o);
    u u1 = this.v;
    this.x = u1;
    if (!this.i && !k) {
      Rect rect = this.q;
      rect.top += j;
      rect.bottom += 0;
      u1 = u1.a.g(0, j, 0, 0);
    } else {
      u.b b;
      u.a a;
      b.i.f.b b1 = b.i.f.b.a(this.x.b(), this.x.d() + j, this.x.c(), this.x.a() + 0);
      u1 = this.x;
      if (Build.VERSION.SDK_INT >= 29) {
        b = new u.b(u1);
      } else {
        a = new u.a((u)b);
      } 
      a.c(b1);
      u1 = a.a();
    } 
    this.x = u1;
    p((View)this.d, this.q, true, true, true, true);
    if (!this.y.equals(this.x)) {
      u u2 = this.x;
      this.y = u2;
      ContentFrameLayout contentFrameLayout = this.d;
      WindowInsets windowInsets = u2.g();
      if (windowInsets != null && !contentFrameLayout.dispatchApplyWindowInsets(windowInsets).equals(windowInsets))
        new u(windowInsets); 
    } 
    measureChildWithMargins((View)this.d, paramInt1, 0, paramInt2, 0);
    e e1 = (e)this.d.getLayoutParams();
    int j = Math.max(i2, this.d.getMeasuredWidth() + e1.leftMargin + e1.rightMargin);
    i1 = Math.max(i1, this.d.getMeasuredHeight() + e1.topMargin + e1.bottomMargin);
    int m = View.combineMeasuredStates(n, this.d.getMeasuredState());
    int k = getPaddingLeft();
    n = getPaddingRight();
    i2 = getPaddingTop();
    i1 = Math.max(getPaddingBottom() + i2 + i1, getSuggestedMinimumHeight());
    setMeasuredDimension(View.resolveSizeAndState(Math.max(n + k + j, getSuggestedMinimumWidth()), paramInt1, m), View.resolveSizeAndState(i1, paramInt2, m << 16));
  }
  
  public boolean onNestedFling(View paramView, float paramFloat1, float paramFloat2, boolean paramBoolean) {
    boolean bool1 = this.k;
    boolean bool = false;
    if (!bool1 || !paramBoolean)
      return false; 
    this.A.fling(0, 0, 0, (int)paramFloat2, 0, 0, -2147483648, 2147483647);
    if (this.A.getFinalY() > this.e.getHeight())
      bool = true; 
    if (bool) {
      q();
      this.E.run();
    } else {
      q();
      this.D.run();
    } 
    this.l = true;
    return true;
  }
  
  public boolean onNestedPreFling(View paramView, float paramFloat1, float paramFloat2) {
    return false;
  }
  
  public void onNestedPreScroll(View paramView, int paramInt1, int paramInt2, int[] paramArrayOfint) {}
  
  public void onNestedScroll(View paramView, int paramInt1, int paramInt2, int paramInt3, int paramInt4) {
    paramInt1 = this.m + paramInt2;
    this.m = paramInt1;
    setActionBarHideOffset(paramInt1);
  }
  
  public void onNestedScrollAccepted(View paramView1, View paramView2, int paramInt) {
    this.F.a = paramInt;
    this.m = getActionBarHideOffset();
    q();
    d d1 = this.z;
    if (d1 != null) {
      u u1 = (u)d1;
      g g1 = u1.u;
      if (g1 != null) {
        g1.a();
        u1.u = null;
      } 
    } 
  }
  
  public boolean onStartNestedScroll(View paramView1, View paramView2, int paramInt) {
    return ((paramInt & 0x2) == 0 || this.e.getVisibility() != 0) ? false : this.k;
  }
  
  public void onStopNestedScroll(View paramView) {
    if (this.k && !this.l)
      if (this.m <= this.e.getHeight()) {
        q();
        postDelayed(this.D, 600L);
      } else {
        q();
        postDelayed(this.E, 600L);
      }  
    d d1 = this.z;
    if (d1 == null || (u)d1 != null)
      return; 
    throw null;
  }
  
  public void onWindowSystemUiVisibilityChanged(int paramInt) {
    boolean bool1;
    boolean bool2;
    super.onWindowSystemUiVisibilityChanged(paramInt);
    s();
    int j = this.n;
    this.n = paramInt;
    if ((paramInt & 0x4) == 0) {
      bool1 = true;
    } else {
      bool1 = false;
    } 
    if ((paramInt & 0x100) != 0) {
      bool2 = true;
    } else {
      bool2 = false;
    } 
    d d1 = this.z;
    if (d1 != null) {
      u u1;
      ((u)d1).p = bool2 ^ true;
      if (bool1 || !bool2) {
        u1 = (u)this.z;
        if (u1.r) {
          u1.r = false;
          u1.n(true);
        } 
      } else {
        u1 = u1;
        if (!u1.r) {
          u1.r = true;
          u1.n(true);
        } 
      } 
    } 
    if (((j ^ paramInt) & 0x100) != 0 && this.z != null)
      l.U((View)this); 
  }
  
  public void onWindowVisibilityChanged(int paramInt) {
    super.onWindowVisibilityChanged(paramInt);
    this.c = paramInt;
    d d1 = this.z;
    if (d1 != null)
      ((u)d1).o = paramInt; 
  }
  
  public final boolean p(View paramView, Rect paramRect, boolean paramBoolean1, boolean paramBoolean2, boolean paramBoolean3, boolean paramBoolean4) {
    // Byte code:
    //   0: aload_1
    //   1: invokevirtual getLayoutParams : ()Landroid/view/ViewGroup$LayoutParams;
    //   4: checkcast androidx/appcompat/widget/ActionBarOverlayLayout$e
    //   7: astore_1
    //   8: iconst_1
    //   9: istore #10
    //   11: iload_3
    //   12: ifeq -> 46
    //   15: aload_1
    //   16: getfield leftMargin : I
    //   19: istore #8
    //   21: aload_2
    //   22: getfield left : I
    //   25: istore #7
    //   27: iload #8
    //   29: iload #7
    //   31: if_icmpeq -> 46
    //   34: aload_1
    //   35: iload #7
    //   37: putfield leftMargin : I
    //   40: iconst_1
    //   41: istore #9
    //   43: goto -> 49
    //   46: iconst_0
    //   47: istore #9
    //   49: iload #9
    //   51: istore_3
    //   52: iload #4
    //   54: ifeq -> 87
    //   57: aload_1
    //   58: getfield topMargin : I
    //   61: istore #7
    //   63: aload_2
    //   64: getfield top : I
    //   67: istore #8
    //   69: iload #9
    //   71: istore_3
    //   72: iload #7
    //   74: iload #8
    //   76: if_icmpeq -> 87
    //   79: aload_1
    //   80: iload #8
    //   82: putfield topMargin : I
    //   85: iconst_1
    //   86: istore_3
    //   87: iload_3
    //   88: istore #4
    //   90: iload #6
    //   92: ifeq -> 126
    //   95: aload_1
    //   96: getfield rightMargin : I
    //   99: istore #7
    //   101: aload_2
    //   102: getfield right : I
    //   105: istore #8
    //   107: iload_3
    //   108: istore #4
    //   110: iload #7
    //   112: iload #8
    //   114: if_icmpeq -> 126
    //   117: aload_1
    //   118: iload #8
    //   120: putfield rightMargin : I
    //   123: iconst_1
    //   124: istore #4
    //   126: iload #5
    //   128: ifeq -> 162
    //   131: aload_1
    //   132: getfield bottomMargin : I
    //   135: istore #8
    //   137: aload_2
    //   138: getfield bottom : I
    //   141: istore #7
    //   143: iload #8
    //   145: iload #7
    //   147: if_icmpeq -> 162
    //   150: aload_1
    //   151: iload #7
    //   153: putfield bottomMargin : I
    //   156: iload #10
    //   158: istore_3
    //   159: goto -> 165
    //   162: iload #4
    //   164: istore_3
    //   165: iload_3
    //   166: ireturn
  }
  
  public void q() {
    removeCallbacks(this.D);
    removeCallbacks(this.E);
    ViewPropertyAnimator viewPropertyAnimator = this.B;
    if (viewPropertyAnimator != null)
      viewPropertyAnimator.cancel(); 
  }
  
  public final void r(Context paramContext) {
    TypedArray typedArray = getContext().getTheme().obtainStyledAttributes(G);
    boolean bool2 = false;
    this.b = typedArray.getDimensionPixelSize(0, 0);
    Drawable drawable = typedArray.getDrawable(1);
    this.g = drawable;
    if (drawable == null) {
      bool1 = true;
    } else {
      bool1 = false;
    } 
    setWillNotDraw(bool1);
    typedArray.recycle();
    boolean bool1 = bool2;
    if ((paramContext.getApplicationInfo()).targetSdkVersion < 19)
      bool1 = true; 
    this.h = bool1;
    this.A = new OverScroller(paramContext);
  }
  
  public void s() {
    if (this.d == null) {
      d0 d01;
      this.d = (ContentFrameLayout)findViewById(f.action_bar_activity_content);
      this.e = (ActionBarContainer)findViewById(f.action_bar_container);
      View view = findViewById(f.action_bar);
      if (view instanceof d0) {
        d01 = (d0)view;
      } else if (d01 instanceof Toolbar) {
        d01 = ((Toolbar)d01).getWrapper();
      } else {
        StringBuilder stringBuilder = c.a.a.a.a.e("Can't make a decor toolbar out of ");
        stringBuilder.append(d01.getClass().getSimpleName());
        throw new IllegalStateException(stringBuilder.toString());
      } 
      this.f = d01;
    } 
  }
  
  public void setActionBarHideOffset(int paramInt) {
    q();
    paramInt = Math.max(0, Math.min(paramInt, this.e.getHeight()));
    this.e.setTranslationY(-paramInt);
  }
  
  public void setActionBarVisibilityCallback(d paramd) {
    this.z = paramd;
    if (getWindowToken() != null) {
      paramd = this.z;
      int j = this.c;
      ((u)paramd).o = j;
      j = this.n;
      if (j != 0) {
        onWindowSystemUiVisibilityChanged(j);
        l.U((View)this);
      } 
    } 
  }
  
  public void setHasNonEmbeddedTabs(boolean paramBoolean) {
    this.j = paramBoolean;
  }
  
  public void setHideOnContentScrollEnabled(boolean paramBoolean) {
    if (paramBoolean != this.k) {
      this.k = paramBoolean;
      if (!paramBoolean) {
        q();
        setActionBarHideOffset(0);
      } 
    } 
  }
  
  public void setIcon(int paramInt) {
    s();
    this.f.setIcon(paramInt);
  }
  
  public void setIcon(Drawable paramDrawable) {
    s();
    this.f.setIcon(paramDrawable);
  }
  
  public void setLogo(int paramInt) {
    s();
    this.f.n(paramInt);
  }
  
  public void setOverlayMode(boolean paramBoolean) {
    this.i = paramBoolean;
    if (paramBoolean && (getContext().getApplicationInfo()).targetSdkVersion < 19) {
      paramBoolean = true;
    } else {
      paramBoolean = false;
    } 
    this.h = paramBoolean;
  }
  
  public void setShowingForActionMode(boolean paramBoolean) {}
  
  public void setUiOptions(int paramInt) {}
  
  public void setWindowCallback(Window.Callback paramCallback) {
    s();
    this.f.setWindowCallback(paramCallback);
  }
  
  public void setWindowTitle(CharSequence paramCharSequence) {
    s();
    this.f.setWindowTitle(paramCharSequence);
  }
  
  public boolean shouldDelayChildPressedState() {
    return false;
  }
  
  public class a extends AnimatorListenerAdapter {
    public final ActionBarOverlayLayout a;
    
    public a(ActionBarOverlayLayout this$0) {}
    
    public void onAnimationCancel(Animator param1Animator) {
      ActionBarOverlayLayout actionBarOverlayLayout = this.a;
      actionBarOverlayLayout.B = null;
      actionBarOverlayLayout.l = false;
    }
    
    public void onAnimationEnd(Animator param1Animator) {
      ActionBarOverlayLayout actionBarOverlayLayout = this.a;
      actionBarOverlayLayout.B = null;
      actionBarOverlayLayout.l = false;
    }
  }
  
  public class b implements Runnable {
    public final ActionBarOverlayLayout b;
    
    public b(ActionBarOverlayLayout this$0) {}
    
    public void run() {
      this.b.q();
      ActionBarOverlayLayout actionBarOverlayLayout = this.b;
      actionBarOverlayLayout.B = actionBarOverlayLayout.e.animate().translationY(0.0F).setListener((Animator.AnimatorListener)this.b.C);
    }
  }
  
  public class c implements Runnable {
    public final ActionBarOverlayLayout b;
    
    public c(ActionBarOverlayLayout this$0) {}
    
    public void run() {
      this.b.q();
      ActionBarOverlayLayout actionBarOverlayLayout = this.b;
      actionBarOverlayLayout.B = actionBarOverlayLayout.e.animate().translationY(-this.b.e.getHeight()).setListener((Animator.AnimatorListener)this.b.C);
    }
  }
  
  public static interface d {}
  
  public static class e extends ViewGroup.MarginLayoutParams {
    public e(int param1Int1, int param1Int2) {
      super(param1Int1, param1Int2);
    }
    
    public e(Context param1Context, AttributeSet param1AttributeSet) {
      super(param1Context, param1AttributeSet);
    }
    
    public e(ViewGroup.LayoutParams param1LayoutParams) {
      super(param1LayoutParams);
    }
  }
}


/* Location:              C:\Users\panch\Downloads\dvba_v1.1.0-dex2jar.jar!\androidx\appcompat\widget\ActionBarOverlayLayout.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */