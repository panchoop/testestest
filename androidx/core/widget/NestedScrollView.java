package androidx.core.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.FocusFinder;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityEvent;
import android.view.animation.AnimationUtils;
import android.widget.EdgeEffect;
import android.widget.FrameLayout;
import android.widget.OverScroller;
import android.widget.ScrollView;
import androidx.appcompat.app.AlertController;
import b.i.m.e;
import b.i.m.f;
import b.i.m.h;
import b.i.m.i;
import b.i.m.l;

public class NestedScrollView extends FrameLayout implements h, e {
  public static final a B = new a();
  
  public static final int[] C = new int[] { 16843130 };
  
  public b A;
  
  public long b;
  
  public final Rect c = new Rect();
  
  public OverScroller d = new OverScroller(getContext());
  
  public EdgeEffect e;
  
  public EdgeEffect f;
  
  public int g;
  
  public boolean h = true;
  
  public boolean i = false;
  
  public View j = null;
  
  public boolean k = false;
  
  public VelocityTracker l;
  
  public boolean m;
  
  public boolean n = true;
  
  public int o;
  
  public int p;
  
  public int q;
  
  public int r = -1;
  
  public final int[] s = new int[2];
  
  public final int[] t = new int[2];
  
  public int u;
  
  public int v;
  
  public c w;
  
  public final i x;
  
  public final f y;
  
  public float z;
  
  public NestedScrollView(Context paramContext, AttributeSet paramAttributeSet) {
    super(paramContext, paramAttributeSet, 0);
    setFocusable(true);
    setDescendantFocusability(262144);
    setWillNotDraw(false);
    ViewConfiguration viewConfiguration = ViewConfiguration.get(getContext());
    this.o = viewConfiguration.getScaledTouchSlop();
    this.p = viewConfiguration.getScaledMinimumFlingVelocity();
    this.q = viewConfiguration.getScaledMaximumFlingVelocity();
    TypedArray typedArray = paramContext.obtainStyledAttributes(paramAttributeSet, C, 0, 0);
    setFillViewport(typedArray.getBoolean(0, false));
    typedArray.recycle();
    this.x = new i();
    this.y = new f((View)this);
    setNestedScrollingEnabled(true);
    l.W((View)this, B);
  }
  
  public static int c(int paramInt1, int paramInt2, int paramInt3) {
    return (paramInt2 >= paramInt3 || paramInt1 < 0) ? 0 : ((paramInt2 + paramInt1 > paramInt3) ? (paramInt3 - paramInt2) : paramInt1);
  }
  
  private float getVerticalScrollFactorCompat() {
    if (this.z == 0.0F) {
      TypedValue typedValue = new TypedValue();
      Context context = getContext();
      if (context.getTheme().resolveAttribute(16842829, typedValue, true)) {
        this.z = typedValue.getDimension(context.getResources().getDisplayMetrics());
      } else {
        throw new IllegalStateException("Expected theme to define listPreferredItemHeight.");
      } 
    } 
    return this.z;
  }
  
  public static boolean s(View paramView1, View paramView2) {
    boolean bool = true;
    if (paramView1 == paramView2)
      return true; 
    ViewParent viewParent = paramView1.getParent();
    if (!(viewParent instanceof ViewGroup) || !s((View)viewParent, paramView2))
      bool = false; 
    return bool;
  }
  
  public final void A(View paramView) {
    paramView.getDrawingRect(this.c);
    offsetDescendantRectToMyCoords(paramView, this.c);
    int j = d(this.c);
    if (j != 0)
      scrollBy(0, j); 
  }
  
  public final void B(int paramInt1, int paramInt2, int paramInt3, boolean paramBoolean) {
    if (getChildCount() == 0)
      return; 
    if (AnimationUtils.currentAnimationTimeMillis() - this.b > 250L) {
      View view = getChildAt(0);
      FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams)view.getLayoutParams();
      int j = view.getHeight();
      int k = layoutParams.topMargin;
      int i1 = layoutParams.bottomMargin;
      int m = getHeight();
      int n = getPaddingTop();
      int i2 = getPaddingBottom();
      paramInt1 = getScrollY();
      paramInt2 = Math.max(0, Math.min(paramInt2 + paramInt1, Math.max(0, j + k + i1 - m - n - i2)));
      this.d.startScroll(getScrollX(), paramInt1, 0, paramInt2 - paramInt1, paramInt3);
      y(paramBoolean);
    } else {
      if (!this.d.isFinished())
        a(); 
      scrollBy(paramInt1, paramInt2);
    } 
    this.b = AnimationUtils.currentAnimationTimeMillis();
  }
  
  public boolean C(int paramInt1, int paramInt2) {
    return this.y.h(paramInt1, paramInt2);
  }
  
  public void D(int paramInt) {
    this.y.i(paramInt);
  }
  
  public final void a() {
    this.d.abortAnimation();
    this.y.i(1);
  }
  
  public void addView(View paramView) {
    if (getChildCount() <= 0) {
      super.addView(paramView);
      return;
    } 
    throw new IllegalStateException("ScrollView can host only one direct child");
  }
  
  public void addView(View paramView, int paramInt) {
    if (getChildCount() <= 0) {
      super.addView(paramView, paramInt);
      return;
    } 
    throw new IllegalStateException("ScrollView can host only one direct child");
  }
  
  public void addView(View paramView, int paramInt, ViewGroup.LayoutParams paramLayoutParams) {
    if (getChildCount() <= 0) {
      super.addView(paramView, paramInt, paramLayoutParams);
      return;
    } 
    throw new IllegalStateException("ScrollView can host only one direct child");
  }
  
  public void addView(View paramView, ViewGroup.LayoutParams paramLayoutParams) {
    if (getChildCount() <= 0) {
      super.addView(paramView, paramLayoutParams);
      return;
    } 
    throw new IllegalStateException("ScrollView can host only one direct child");
  }
  
  public boolean b(int paramInt) {
    View view2 = findFocus();
    View view1 = view2;
    if (view2 == this)
      view1 = null; 
    view2 = FocusFinder.getInstance().findNextFocus((ViewGroup)this, view1, paramInt);
    int j = getMaxScrollAmount();
    if (view2 != null && t(view2, j, getHeight())) {
      view2.getDrawingRect(this.c);
      offsetDescendantRectToMyCoords(view2, this.c);
      f(d(this.c));
      view2.requestFocus(paramInt);
    } else {
      int k;
      if (paramInt == 33 && getScrollY() < j) {
        k = getScrollY();
      } else {
        k = j;
        if (paramInt == 130) {
          k = j;
          if (getChildCount() > 0) {
            view2 = getChildAt(0);
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams)view2.getLayoutParams();
            k = view2.getBottom();
            int m = layoutParams.bottomMargin;
            int n = getScrollY();
            k = Math.min(k + m - getHeight() + n - getPaddingBottom(), j);
          } 
        } 
      } 
      if (k == 0)
        return false; 
      if (paramInt != 130)
        k = -k; 
      f(k);
    } 
    if (view1 != null && view1.isFocused() && (t(view1, 0, getHeight()) ^ true) != 0) {
      paramInt = getDescendantFocusability();
      setDescendantFocusability(131072);
      requestFocus();
      setDescendantFocusability(paramInt);
    } 
    return true;
  }
  
  public int computeHorizontalScrollExtent() {
    return super.computeHorizontalScrollExtent();
  }
  
  public int computeHorizontalScrollOffset() {
    return super.computeHorizontalScrollOffset();
  }
  
  public int computeHorizontalScrollRange() {
    return super.computeHorizontalScrollRange();
  }
  
  public void computeScroll() {
    // Byte code:
    //   0: aload_0
    //   1: getfield d : Landroid/widget/OverScroller;
    //   4: invokevirtual isFinished : ()Z
    //   7: ifeq -> 11
    //   10: return
    //   11: aload_0
    //   12: getfield d : Landroid/widget/OverScroller;
    //   15: invokevirtual computeScrollOffset : ()Z
    //   18: pop
    //   19: aload_0
    //   20: getfield d : Landroid/widget/OverScroller;
    //   23: invokevirtual getCurrY : ()I
    //   26: istore_2
    //   27: iload_2
    //   28: aload_0
    //   29: getfield v : I
    //   32: isub
    //   33: istore_1
    //   34: aload_0
    //   35: iload_2
    //   36: putfield v : I
    //   39: aload_0
    //   40: getfield t : [I
    //   43: astore #6
    //   45: iconst_0
    //   46: istore_3
    //   47: aload #6
    //   49: iconst_1
    //   50: iconst_0
    //   51: iastore
    //   52: aload_0
    //   53: iconst_0
    //   54: iload_1
    //   55: aload #6
    //   57: aconst_null
    //   58: iconst_1
    //   59: invokevirtual e : (II[I[II)Z
    //   62: pop
    //   63: iload_1
    //   64: aload_0
    //   65: getfield t : [I
    //   68: iconst_1
    //   69: iaload
    //   70: isub
    //   71: istore_2
    //   72: aload_0
    //   73: invokevirtual getScrollRange : ()I
    //   76: istore #4
    //   78: iload_2
    //   79: istore_1
    //   80: iload_2
    //   81: ifeq -> 160
    //   84: aload_0
    //   85: invokevirtual getScrollY : ()I
    //   88: istore_1
    //   89: aload_0
    //   90: iconst_0
    //   91: iload_2
    //   92: aload_0
    //   93: invokevirtual getScrollX : ()I
    //   96: iload_1
    //   97: iconst_0
    //   98: iload #4
    //   100: iconst_0
    //   101: iconst_0
    //   102: invokevirtual w : (IIIIIIII)Z
    //   105: pop
    //   106: aload_0
    //   107: invokevirtual getScrollY : ()I
    //   110: iload_1
    //   111: isub
    //   112: istore_1
    //   113: iload_2
    //   114: iload_1
    //   115: isub
    //   116: istore_2
    //   117: aload_0
    //   118: getfield t : [I
    //   121: astore #7
    //   123: aload #7
    //   125: iconst_1
    //   126: iconst_0
    //   127: iastore
    //   128: aload_0
    //   129: getfield s : [I
    //   132: astore #6
    //   134: aload_0
    //   135: getfield y : Lb/i/m/f;
    //   138: iconst_0
    //   139: iload_1
    //   140: iconst_0
    //   141: iload_2
    //   142: aload #6
    //   144: iconst_1
    //   145: aload #7
    //   147: invokevirtual e : (IIII[II[I)Z
    //   150: pop
    //   151: iload_2
    //   152: aload_0
    //   153: getfield t : [I
    //   156: iconst_1
    //   157: iaload
    //   158: isub
    //   159: istore_1
    //   160: iload_1
    //   161: ifeq -> 256
    //   164: aload_0
    //   165: invokevirtual getOverScrollMode : ()I
    //   168: istore #5
    //   170: iload #5
    //   172: ifeq -> 190
    //   175: iload_3
    //   176: istore_2
    //   177: iload #5
    //   179: iconst_1
    //   180: if_icmpne -> 192
    //   183: iload_3
    //   184: istore_2
    //   185: iload #4
    //   187: ifle -> 192
    //   190: iconst_1
    //   191: istore_2
    //   192: iload_2
    //   193: ifeq -> 252
    //   196: aload_0
    //   197: invokevirtual h : ()V
    //   200: iload_1
    //   201: ifge -> 223
    //   204: aload_0
    //   205: getfield e : Landroid/widget/EdgeEffect;
    //   208: invokevirtual isFinished : ()Z
    //   211: ifeq -> 252
    //   214: aload_0
    //   215: getfield e : Landroid/widget/EdgeEffect;
    //   218: astore #6
    //   220: goto -> 239
    //   223: aload_0
    //   224: getfield f : Landroid/widget/EdgeEffect;
    //   227: invokevirtual isFinished : ()Z
    //   230: ifeq -> 252
    //   233: aload_0
    //   234: getfield f : Landroid/widget/EdgeEffect;
    //   237: astore #6
    //   239: aload #6
    //   241: aload_0
    //   242: getfield d : Landroid/widget/OverScroller;
    //   245: invokevirtual getCurrVelocity : ()F
    //   248: f2i
    //   249: invokevirtual onAbsorb : (I)V
    //   252: aload_0
    //   253: invokevirtual a : ()V
    //   256: aload_0
    //   257: getfield d : Landroid/widget/OverScroller;
    //   260: invokevirtual isFinished : ()Z
    //   263: ifne -> 273
    //   266: aload_0
    //   267: invokestatic O : (Landroid/view/View;)V
    //   270: goto -> 281
    //   273: aload_0
    //   274: getfield y : Lb/i/m/f;
    //   277: iconst_1
    //   278: invokevirtual i : (I)V
    //   281: return
  }
  
  public int computeVerticalScrollExtent() {
    return super.computeVerticalScrollExtent();
  }
  
  public int computeVerticalScrollOffset() {
    return Math.max(0, super.computeVerticalScrollOffset());
  }
  
  public int computeVerticalScrollRange() {
    int k = getChildCount();
    int j = getHeight() - getPaddingBottom() - getPaddingTop();
    if (k == 0)
      return j; 
    View view = getChildAt(0);
    FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams)view.getLayoutParams();
    k = view.getBottom() + layoutParams.bottomMargin;
    int m = getScrollY();
    int n = Math.max(0, k - j);
    if (m < 0) {
      j = k - m;
    } else {
      j = k;
      if (m > n)
        j = k + m - n; 
    } 
    return j;
  }
  
  public int d(Rect paramRect) {
    int j = getChildCount();
    boolean bool = false;
    if (j == 0)
      return 0; 
    int i1 = getHeight();
    j = getScrollY();
    int n = j + i1;
    int m = getVerticalFadingEdgeLength();
    int k = j;
    if (paramRect.top > 0)
      k = j + m; 
    View view = getChildAt(0);
    FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams)view.getLayoutParams();
    if (paramRect.bottom < view.getHeight() + layoutParams.topMargin + layoutParams.bottomMargin) {
      m = n - m;
    } else {
      m = n;
    } 
    if (paramRect.bottom > m && paramRect.top > k) {
      if (paramRect.height() > i1) {
        j = paramRect.top - k;
      } else {
        j = paramRect.bottom - m;
      } 
      j = Math.min(j + 0, view.getBottom() + layoutParams.bottomMargin - n);
    } else {
      j = bool;
      if (paramRect.top < k) {
        j = bool;
        if (paramRect.bottom < m) {
          if (paramRect.height() > i1) {
            j = 0 - m - paramRect.bottom;
          } else {
            j = 0 - k - paramRect.top;
          } 
          j = Math.max(j, -getScrollY());
        } 
      } 
    } 
    return j;
  }
  
  public boolean dispatchKeyEvent(KeyEvent paramKeyEvent) {
    return (super.dispatchKeyEvent(paramKeyEvent) || j(paramKeyEvent));
  }
  
  public boolean dispatchNestedFling(float paramFloat1, float paramFloat2, boolean paramBoolean) {
    return this.y.a(paramFloat1, paramFloat2, paramBoolean);
  }
  
  public boolean dispatchNestedPreFling(float paramFloat1, float paramFloat2) {
    return this.y.b(paramFloat1, paramFloat2);
  }
  
  public boolean dispatchNestedPreScroll(int paramInt1, int paramInt2, int[] paramArrayOfint1, int[] paramArrayOfint2) {
    return e(paramInt1, paramInt2, paramArrayOfint1, paramArrayOfint2, 0);
  }
  
  public boolean dispatchNestedScroll(int paramInt1, int paramInt2, int paramInt3, int paramInt4, int[] paramArrayOfint) {
    return this.y.d(paramInt1, paramInt2, paramInt3, paramInt4, paramArrayOfint);
  }
  
  public void draw(Canvas paramCanvas) {
    super.draw(paramCanvas);
    if (this.e != null) {
      int j = getScrollY();
      boolean bool = this.e.isFinished();
      byte b1 = 0;
      if (!bool) {
        boolean bool1;
        int i3 = paramCanvas.save();
        int k = getWidth();
        int i2 = getHeight();
        int i1 = Math.min(0, j);
        if (getClipToPadding()) {
          bool1 = getPaddingLeft();
          k -= getPaddingRight() + bool1;
          bool1 = getPaddingLeft() + 0;
        } else {
          bool1 = false;
        } 
        int n = i2;
        int m = i1;
        if (getClipToPadding()) {
          m = getPaddingTop();
          n = i2 - getPaddingBottom() + m;
          m = i1 + getPaddingTop();
        } 
        paramCanvas.translate(bool1, m);
        this.e.setSize(k, n);
        if (this.e.draw(paramCanvas))
          l.O((View)this); 
        paramCanvas.restoreToCount(i3);
      } 
      if (!this.f.isFinished()) {
        int i4 = paramCanvas.save();
        int n = getWidth();
        int i2 = getHeight();
        int i3 = Math.max(getScrollRange(), j) + i2;
        int m = b1;
        int k = n;
        if (getClipToPadding()) {
          k = getPaddingLeft();
          k = n - getPaddingRight() + k;
          m = 0 + getPaddingLeft();
        } 
        int i1 = i3;
        n = i2;
        if (getClipToPadding()) {
          n = getPaddingTop();
          n = i2 - getPaddingBottom() + n;
          i1 = i3 - getPaddingBottom();
        } 
        paramCanvas.translate((m - k), i1);
        paramCanvas.rotate(180.0F, k, 0.0F);
        this.f.setSize(k, n);
        if (this.f.draw(paramCanvas))
          l.O((View)this); 
        paramCanvas.restoreToCount(i4);
      } 
    } 
  }
  
  public boolean e(int paramInt1, int paramInt2, int[] paramArrayOfint1, int[] paramArrayOfint2, int paramInt3) {
    return this.y.c(paramInt1, paramInt2, paramArrayOfint1, paramArrayOfint2, paramInt3);
  }
  
  public final void f(int paramInt) {
    if (paramInt != 0)
      if (this.n) {
        B(0, paramInt, 250, false);
      } else {
        scrollBy(0, paramInt);
      }  
  }
  
  public final void g() {
    this.k = false;
    x();
    this.y.i(0);
    EdgeEffect edgeEffect = this.e;
    if (edgeEffect != null) {
      edgeEffect.onRelease();
      this.f.onRelease();
    } 
  }
  
  public float getBottomFadingEdgeStrength() {
    if (getChildCount() == 0)
      return 0.0F; 
    View view = getChildAt(0);
    FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams)view.getLayoutParams();
    int j = getVerticalFadingEdgeLength();
    int k = getHeight();
    int m = getPaddingBottom();
    k = view.getBottom() + layoutParams.bottomMargin - getScrollY() - k - m;
    return (k < j) ? (k / j) : 1.0F;
  }
  
  public int getMaxScrollAmount() {
    return (int)(getHeight() * 0.5F);
  }
  
  public int getNestedScrollAxes() {
    return this.x.a();
  }
  
  public int getScrollRange() {
    int k = getChildCount();
    int j = 0;
    if (k > 0) {
      View view = getChildAt(0);
      FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams)view.getLayoutParams();
      j = Math.max(0, view.getHeight() + layoutParams.topMargin + layoutParams.bottomMargin - getHeight() - getPaddingTop() - getPaddingBottom());
    } 
    return j;
  }
  
  public float getTopFadingEdgeStrength() {
    if (getChildCount() == 0)
      return 0.0F; 
    int k = getVerticalFadingEdgeLength();
    int j = getScrollY();
    return (j < k) ? (j / k) : 1.0F;
  }
  
  public final void h() {
    if (getOverScrollMode() != 2) {
      if (this.e == null) {
        Context context = getContext();
        this.e = new EdgeEffect(context);
        this.f = new EdgeEffect(context);
      } 
    } else {
      this.e = null;
      this.f = null;
    } 
  }
  
  public boolean hasNestedScrollingParent() {
    return r(0);
  }
  
  public void i(View paramView1, View paramView2, int paramInt1, int paramInt2) {
    i i1 = this.x;
    if (paramInt2 == 1) {
      i1.b = paramInt1;
    } else {
      i1.a = paramInt1;
    } 
    C(2, paramInt2);
  }
  
  public boolean isNestedScrollingEnabled() {
    return this.y.d;
  }
  
  public boolean j(KeyEvent paramKeyEvent) {
    // Byte code:
    //   0: aload_0
    //   1: getfield c : Landroid/graphics/Rect;
    //   4: invokevirtual setEmpty : ()V
    //   7: aload_0
    //   8: invokevirtual getChildCount : ()I
    //   11: istore_2
    //   12: iconst_1
    //   13: istore #6
    //   15: iconst_0
    //   16: istore #7
    //   18: iload_2
    //   19: ifle -> 78
    //   22: aload_0
    //   23: iconst_0
    //   24: invokevirtual getChildAt : (I)Landroid/view/View;
    //   27: astore #9
    //   29: aload #9
    //   31: invokevirtual getLayoutParams : ()Landroid/view/ViewGroup$LayoutParams;
    //   34: checkcast android/widget/FrameLayout$LayoutParams
    //   37: astore #8
    //   39: aload #9
    //   41: invokevirtual getHeight : ()I
    //   44: aload #8
    //   46: getfield topMargin : I
    //   49: iadd
    //   50: aload #8
    //   52: getfield bottomMargin : I
    //   55: iadd
    //   56: aload_0
    //   57: invokevirtual getHeight : ()I
    //   60: aload_0
    //   61: invokevirtual getPaddingTop : ()I
    //   64: isub
    //   65: aload_0
    //   66: invokevirtual getPaddingBottom : ()I
    //   69: isub
    //   70: if_icmple -> 78
    //   73: iconst_1
    //   74: istore_2
    //   75: goto -> 80
    //   78: iconst_0
    //   79: istore_2
    //   80: iload_2
    //   81: ifne -> 158
    //   84: aload_0
    //   85: invokevirtual isFocused : ()Z
    //   88: ifeq -> 156
    //   91: aload_1
    //   92: invokevirtual getKeyCode : ()I
    //   95: iconst_4
    //   96: if_icmpeq -> 156
    //   99: aload_0
    //   100: invokevirtual findFocus : ()Landroid/view/View;
    //   103: astore #8
    //   105: aload #8
    //   107: astore_1
    //   108: aload #8
    //   110: aload_0
    //   111: if_acmpne -> 116
    //   114: aconst_null
    //   115: astore_1
    //   116: invokestatic getInstance : ()Landroid/view/FocusFinder;
    //   119: aload_0
    //   120: aload_1
    //   121: sipush #130
    //   124: invokevirtual findNextFocus : (Landroid/view/ViewGroup;Landroid/view/View;I)Landroid/view/View;
    //   127: astore_1
    //   128: aload_1
    //   129: ifnull -> 150
    //   132: aload_1
    //   133: aload_0
    //   134: if_acmpeq -> 150
    //   137: aload_1
    //   138: sipush #130
    //   141: invokevirtual requestFocus : (I)Z
    //   144: ifeq -> 150
    //   147: goto -> 153
    //   150: iconst_0
    //   151: istore #6
    //   153: iload #6
    //   155: ireturn
    //   156: iconst_0
    //   157: ireturn
    //   158: iload #7
    //   160: istore #6
    //   162: aload_1
    //   163: invokevirtual getAction : ()I
    //   166: ifne -> 454
    //   169: aload_1
    //   170: invokevirtual getKeyCode : ()I
    //   173: istore_3
    //   174: bipush #33
    //   176: istore_2
    //   177: iload_3
    //   178: bipush #19
    //   180: if_icmpeq -> 428
    //   183: iload_3
    //   184: bipush #20
    //   186: if_icmpeq -> 397
    //   189: iload_3
    //   190: bipush #62
    //   192: if_icmpeq -> 202
    //   195: iload #7
    //   197: istore #6
    //   199: goto -> 454
    //   202: aload_1
    //   203: invokevirtual isShiftPressed : ()Z
    //   206: ifeq -> 212
    //   209: goto -> 216
    //   212: sipush #130
    //   215: istore_2
    //   216: iload_2
    //   217: sipush #130
    //   220: if_icmpne -> 228
    //   223: iconst_1
    //   224: istore_3
    //   225: goto -> 230
    //   228: iconst_0
    //   229: istore_3
    //   230: aload_0
    //   231: invokevirtual getHeight : ()I
    //   234: istore #4
    //   236: iload_3
    //   237: ifeq -> 326
    //   240: aload_0
    //   241: getfield c : Landroid/graphics/Rect;
    //   244: aload_0
    //   245: invokevirtual getScrollY : ()I
    //   248: iload #4
    //   250: iadd
    //   251: putfield top : I
    //   254: aload_0
    //   255: invokevirtual getChildCount : ()I
    //   258: istore_3
    //   259: iload_3
    //   260: ifle -> 359
    //   263: aload_0
    //   264: iload_3
    //   265: iconst_1
    //   266: isub
    //   267: invokevirtual getChildAt : (I)Landroid/view/View;
    //   270: astore_1
    //   271: aload_1
    //   272: invokevirtual getLayoutParams : ()Landroid/view/ViewGroup$LayoutParams;
    //   275: checkcast android/widget/FrameLayout$LayoutParams
    //   278: astore #8
    //   280: aload_1
    //   281: invokevirtual getBottom : ()I
    //   284: istore #5
    //   286: aload #8
    //   288: getfield bottomMargin : I
    //   291: istore_3
    //   292: aload_0
    //   293: invokevirtual getPaddingBottom : ()I
    //   296: iload #5
    //   298: iload_3
    //   299: iadd
    //   300: iadd
    //   301: istore_3
    //   302: aload_0
    //   303: getfield c : Landroid/graphics/Rect;
    //   306: astore_1
    //   307: aload_1
    //   308: getfield top : I
    //   311: iload #4
    //   313: iadd
    //   314: iload_3
    //   315: if_icmple -> 359
    //   318: iload_3
    //   319: iload #4
    //   321: isub
    //   322: istore_3
    //   323: goto -> 354
    //   326: aload_0
    //   327: getfield c : Landroid/graphics/Rect;
    //   330: aload_0
    //   331: invokevirtual getScrollY : ()I
    //   334: iload #4
    //   336: isub
    //   337: putfield top : I
    //   340: aload_0
    //   341: getfield c : Landroid/graphics/Rect;
    //   344: astore_1
    //   345: aload_1
    //   346: getfield top : I
    //   349: ifge -> 359
    //   352: iconst_0
    //   353: istore_3
    //   354: aload_1
    //   355: iload_3
    //   356: putfield top : I
    //   359: aload_0
    //   360: getfield c : Landroid/graphics/Rect;
    //   363: astore_1
    //   364: aload_1
    //   365: getfield top : I
    //   368: istore_3
    //   369: iload #4
    //   371: iload_3
    //   372: iadd
    //   373: istore #4
    //   375: aload_1
    //   376: iload #4
    //   378: putfield bottom : I
    //   381: aload_0
    //   382: iload_2
    //   383: iload_3
    //   384: iload #4
    //   386: invokevirtual z : (III)Z
    //   389: pop
    //   390: iload #7
    //   392: istore #6
    //   394: goto -> 454
    //   397: aload_1
    //   398: invokevirtual isAltPressed : ()Z
    //   401: ifne -> 416
    //   404: aload_0
    //   405: sipush #130
    //   408: invokevirtual b : (I)Z
    //   411: istore #6
    //   413: goto -> 454
    //   416: aload_0
    //   417: sipush #130
    //   420: invokevirtual q : (I)Z
    //   423: istore #6
    //   425: goto -> 454
    //   428: aload_1
    //   429: invokevirtual isAltPressed : ()Z
    //   432: ifne -> 446
    //   435: aload_0
    //   436: bipush #33
    //   438: invokevirtual b : (I)Z
    //   441: istore #6
    //   443: goto -> 454
    //   446: aload_0
    //   447: bipush #33
    //   449: invokevirtual q : (I)Z
    //   452: istore #6
    //   454: iload #6
    //   456: ireturn
  }
  
  public void k(View paramView, int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5, int[] paramArrayOfint) {
    u(paramInt4, paramInt5, paramArrayOfint);
  }
  
  public void l(View paramView, int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5) {
    u(paramInt4, paramInt5, null);
  }
  
  public void m(View paramView, int paramInt) {
    i i1 = this.x;
    if (paramInt == 1) {
      i1.b = 0;
    } else {
      i1.a = 0;
    } 
    this.y.i(paramInt);
  }
  
  public void measureChild(View paramView, int paramInt1, int paramInt2) {
    ViewGroup.LayoutParams layoutParams = paramView.getLayoutParams();
    paramInt2 = getPaddingLeft();
    paramView.measure(FrameLayout.getChildMeasureSpec(paramInt1, getPaddingRight() + paramInt2, layoutParams.width), View.MeasureSpec.makeMeasureSpec(0, 0));
  }
  
  public void measureChildWithMargins(View paramView, int paramInt1, int paramInt2, int paramInt3, int paramInt4) {
    ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams)paramView.getLayoutParams();
    paramInt3 = getPaddingLeft();
    paramView.measure(FrameLayout.getChildMeasureSpec(paramInt1, getPaddingRight() + paramInt3 + marginLayoutParams.leftMargin + marginLayoutParams.rightMargin + paramInt2, marginLayoutParams.width), View.MeasureSpec.makeMeasureSpec(marginLayoutParams.topMargin + marginLayoutParams.bottomMargin, 0));
  }
  
  public void n(View paramView, int paramInt1, int paramInt2, int[] paramArrayOfint, int paramInt3) {
    e(paramInt1, paramInt2, paramArrayOfint, null, paramInt3);
  }
  
  public boolean o(View paramView1, View paramView2, int paramInt1, int paramInt2) {
    boolean bool;
    if ((paramInt1 & 0x2) != 0) {
      bool = true;
    } else {
      bool = false;
    } 
    return bool;
  }
  
  public void onAttachedToWindow() {
    super.onAttachedToWindow();
    this.i = false;
  }
  
  public boolean onGenericMotionEvent(MotionEvent paramMotionEvent) {
    if ((paramMotionEvent.getSource() & 0x2) != 0 && paramMotionEvent.getAction() == 8 && !this.k) {
      float f1 = paramMotionEvent.getAxisValue(9);
      if (f1 != 0.0F) {
        int k = (int)(f1 * getVerticalScrollFactorCompat());
        int j = getScrollRange();
        int m = getScrollY();
        k = m - k;
        if (k < 0) {
          j = 0;
        } else if (k <= j) {
          j = k;
        } 
        if (j != m) {
          super.scrollTo(getScrollX(), j);
          return true;
        } 
      } 
    } 
    return false;
  }
  
  public boolean onInterceptTouchEvent(MotionEvent paramMotionEvent) {
    // Byte code:
    //   0: aload_1
    //   1: invokevirtual getAction : ()I
    //   4: istore_2
    //   5: iload_2
    //   6: iconst_2
    //   7: if_icmpne -> 19
    //   10: aload_0
    //   11: getfield k : Z
    //   14: ifeq -> 19
    //   17: iconst_1
    //   18: ireturn
    //   19: iload_2
    //   20: sipush #255
    //   23: iand
    //   24: istore_2
    //   25: iload_2
    //   26: ifeq -> 271
    //   29: iload_2
    //   30: iconst_1
    //   31: if_icmpeq -> 217
    //   34: iload_2
    //   35: iconst_2
    //   36: if_icmpeq -> 61
    //   39: iload_2
    //   40: iconst_3
    //   41: if_icmpeq -> 217
    //   44: iload_2
    //   45: bipush #6
    //   47: if_icmpeq -> 53
    //   50: goto -> 444
    //   53: aload_0
    //   54: aload_1
    //   55: invokevirtual v : (Landroid/view/MotionEvent;)V
    //   58: goto -> 444
    //   61: aload_0
    //   62: getfield r : I
    //   65: istore_2
    //   66: iload_2
    //   67: iconst_m1
    //   68: if_icmpne -> 74
    //   71: goto -> 444
    //   74: aload_1
    //   75: iload_2
    //   76: invokevirtual findPointerIndex : (I)I
    //   79: istore_3
    //   80: iload_3
    //   81: iconst_m1
    //   82: if_icmpne -> 129
    //   85: new java/lang/StringBuilder
    //   88: dup
    //   89: invokespecial <init> : ()V
    //   92: astore_1
    //   93: aload_1
    //   94: ldc_w 'Invalid pointerId='
    //   97: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   100: pop
    //   101: aload_1
    //   102: iload_2
    //   103: invokevirtual append : (I)Ljava/lang/StringBuilder;
    //   106: pop
    //   107: aload_1
    //   108: ldc_w ' in onInterceptTouchEvent'
    //   111: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   114: pop
    //   115: ldc_w 'NestedScrollView'
    //   118: aload_1
    //   119: invokevirtual toString : ()Ljava/lang/String;
    //   122: invokestatic e : (Ljava/lang/String;Ljava/lang/String;)I
    //   125: pop
    //   126: goto -> 444
    //   129: aload_1
    //   130: iload_3
    //   131: invokevirtual getY : (I)F
    //   134: f2i
    //   135: istore_2
    //   136: iload_2
    //   137: aload_0
    //   138: getfield g : I
    //   141: isub
    //   142: invokestatic abs : (I)I
    //   145: aload_0
    //   146: getfield o : I
    //   149: if_icmple -> 444
    //   152: iconst_2
    //   153: aload_0
    //   154: invokevirtual getNestedScrollAxes : ()I
    //   157: iand
    //   158: ifne -> 444
    //   161: aload_0
    //   162: iconst_1
    //   163: putfield k : Z
    //   166: aload_0
    //   167: iload_2
    //   168: putfield g : I
    //   171: aload_0
    //   172: getfield l : Landroid/view/VelocityTracker;
    //   175: ifnonnull -> 185
    //   178: aload_0
    //   179: invokestatic obtain : ()Landroid/view/VelocityTracker;
    //   182: putfield l : Landroid/view/VelocityTracker;
    //   185: aload_0
    //   186: getfield l : Landroid/view/VelocityTracker;
    //   189: aload_1
    //   190: invokevirtual addMovement : (Landroid/view/MotionEvent;)V
    //   193: aload_0
    //   194: iconst_0
    //   195: putfield u : I
    //   198: aload_0
    //   199: invokevirtual getParent : ()Landroid/view/ViewParent;
    //   202: astore_1
    //   203: aload_1
    //   204: ifnull -> 444
    //   207: aload_1
    //   208: iconst_1
    //   209: invokeinterface requestDisallowInterceptTouchEvent : (Z)V
    //   214: goto -> 444
    //   217: aload_0
    //   218: iconst_0
    //   219: putfield k : Z
    //   222: aload_0
    //   223: iconst_m1
    //   224: putfield r : I
    //   227: aload_0
    //   228: invokevirtual x : ()V
    //   231: aload_0
    //   232: getfield d : Landroid/widget/OverScroller;
    //   235: aload_0
    //   236: invokevirtual getScrollX : ()I
    //   239: aload_0
    //   240: invokevirtual getScrollY : ()I
    //   243: iconst_0
    //   244: iconst_0
    //   245: iconst_0
    //   246: aload_0
    //   247: invokevirtual getScrollRange : ()I
    //   250: invokevirtual springBack : (IIIIII)Z
    //   253: ifeq -> 260
    //   256: aload_0
    //   257: invokestatic O : (Landroid/view/View;)V
    //   260: aload_0
    //   261: getfield y : Lb/i/m/f;
    //   264: iconst_0
    //   265: invokevirtual i : (I)V
    //   268: goto -> 444
    //   271: aload_1
    //   272: invokevirtual getY : ()F
    //   275: f2i
    //   276: istore_3
    //   277: aload_1
    //   278: invokevirtual getX : ()F
    //   281: f2i
    //   282: istore #4
    //   284: aload_0
    //   285: invokevirtual getChildCount : ()I
    //   288: ifle -> 350
    //   291: aload_0
    //   292: invokevirtual getScrollY : ()I
    //   295: istore_2
    //   296: aload_0
    //   297: iconst_0
    //   298: invokevirtual getChildAt : (I)Landroid/view/View;
    //   301: astore #5
    //   303: iload_3
    //   304: aload #5
    //   306: invokevirtual getTop : ()I
    //   309: iload_2
    //   310: isub
    //   311: if_icmplt -> 350
    //   314: iload_3
    //   315: aload #5
    //   317: invokevirtual getBottom : ()I
    //   320: iload_2
    //   321: isub
    //   322: if_icmpge -> 350
    //   325: iload #4
    //   327: aload #5
    //   329: invokevirtual getLeft : ()I
    //   332: if_icmplt -> 350
    //   335: iload #4
    //   337: aload #5
    //   339: invokevirtual getRight : ()I
    //   342: if_icmpge -> 350
    //   345: iconst_1
    //   346: istore_2
    //   347: goto -> 352
    //   350: iconst_0
    //   351: istore_2
    //   352: iload_2
    //   353: ifne -> 368
    //   356: aload_0
    //   357: iconst_0
    //   358: putfield k : Z
    //   361: aload_0
    //   362: invokevirtual x : ()V
    //   365: goto -> 444
    //   368: aload_0
    //   369: iload_3
    //   370: putfield g : I
    //   373: aload_0
    //   374: aload_1
    //   375: iconst_0
    //   376: invokevirtual getPointerId : (I)I
    //   379: putfield r : I
    //   382: aload_0
    //   383: getfield l : Landroid/view/VelocityTracker;
    //   386: astore #5
    //   388: aload #5
    //   390: ifnonnull -> 403
    //   393: aload_0
    //   394: invokestatic obtain : ()Landroid/view/VelocityTracker;
    //   397: putfield l : Landroid/view/VelocityTracker;
    //   400: goto -> 408
    //   403: aload #5
    //   405: invokevirtual clear : ()V
    //   408: aload_0
    //   409: getfield l : Landroid/view/VelocityTracker;
    //   412: aload_1
    //   413: invokevirtual addMovement : (Landroid/view/MotionEvent;)V
    //   416: aload_0
    //   417: getfield d : Landroid/widget/OverScroller;
    //   420: invokevirtual computeScrollOffset : ()Z
    //   423: pop
    //   424: aload_0
    //   425: aload_0
    //   426: getfield d : Landroid/widget/OverScroller;
    //   429: invokevirtual isFinished : ()Z
    //   432: iconst_1
    //   433: ixor
    //   434: putfield k : Z
    //   437: aload_0
    //   438: iconst_2
    //   439: iconst_0
    //   440: invokevirtual C : (II)Z
    //   443: pop
    //   444: aload_0
    //   445: getfield k : Z
    //   448: ireturn
  }
  
  public void onLayout(boolean paramBoolean, int paramInt1, int paramInt2, int paramInt3, int paramInt4) {
    super.onLayout(paramBoolean, paramInt1, paramInt2, paramInt3, paramInt4);
    paramInt1 = 0;
    this.h = false;
    View view = this.j;
    if (view != null && s(view, (View)this))
      A(this.j); 
    this.j = null;
    if (!this.i) {
      if (this.w != null) {
        scrollTo(getScrollX(), this.w.b);
        this.w = null;
      } 
      if (getChildCount() > 0) {
        View view1 = getChildAt(0);
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams)view1.getLayoutParams();
        paramInt1 = view1.getMeasuredHeight() + layoutParams.topMargin + layoutParams.bottomMargin;
      } 
      int j = getPaddingTop();
      int k = getPaddingBottom();
      paramInt3 = getScrollY();
      paramInt1 = c(paramInt3, paramInt4 - paramInt2 - j - k, paramInt1);
      if (paramInt1 != paramInt3)
        scrollTo(getScrollX(), paramInt1); 
    } 
    scrollTo(getScrollX(), getScrollY());
    this.i = true;
  }
  
  public void onMeasure(int paramInt1, int paramInt2) {
    super.onMeasure(paramInt1, paramInt2);
    if (!this.m)
      return; 
    if (View.MeasureSpec.getMode(paramInt2) == 0)
      return; 
    if (getChildCount() > 0) {
      View view = getChildAt(0);
      FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams)view.getLayoutParams();
      int j = view.getMeasuredHeight();
      paramInt2 = getMeasuredHeight() - getPaddingTop() - getPaddingBottom() - layoutParams.topMargin - layoutParams.bottomMargin;
      if (j < paramInt2) {
        j = getPaddingLeft();
        view.measure(FrameLayout.getChildMeasureSpec(paramInt1, getPaddingRight() + j + layoutParams.leftMargin + layoutParams.rightMargin, layoutParams.width), View.MeasureSpec.makeMeasureSpec(paramInt2, 1073741824));
      } 
    } 
  }
  
  public boolean onNestedFling(View paramView, float paramFloat1, float paramFloat2, boolean paramBoolean) {
    if (!paramBoolean) {
      dispatchNestedFling(0.0F, paramFloat2, true);
      p((int)paramFloat2);
      return true;
    } 
    return false;
  }
  
  public boolean onNestedPreFling(View paramView, float paramFloat1, float paramFloat2) {
    return dispatchNestedPreFling(paramFloat1, paramFloat2);
  }
  
  public void onNestedPreScroll(View paramView, int paramInt1, int paramInt2, int[] paramArrayOfint) {
    e(paramInt1, paramInt2, paramArrayOfint, null, 0);
  }
  
  public void onNestedScroll(View paramView, int paramInt1, int paramInt2, int paramInt3, int paramInt4) {
    u(paramInt4, 0, null);
  }
  
  public void onNestedScrollAccepted(View paramView1, View paramView2, int paramInt) {
    this.x.a = paramInt;
    C(2, 0);
  }
  
  public void onOverScrolled(int paramInt1, int paramInt2, boolean paramBoolean1, boolean paramBoolean2) {
    super.scrollTo(paramInt1, paramInt2);
  }
  
  public boolean onRequestFocusInDescendants(int paramInt, Rect paramRect) {
    int j;
    View view;
    if (paramInt == 2) {
      j = 130;
    } else {
      j = paramInt;
      if (paramInt == 1)
        j = 33; 
    } 
    FocusFinder focusFinder = FocusFinder.getInstance();
    if (paramRect == null) {
      view = focusFinder.findNextFocus((ViewGroup)this, null, j);
    } else {
      view = view.findNextFocusFromRect((ViewGroup)this, paramRect, j);
    } 
    return (view == null) ? false : (((true ^ t(view, 0, getHeight())) != 0) ? false : view.requestFocus(j, paramRect));
  }
  
  public void onRestoreInstanceState(Parcelable paramParcelable) {
    if (!(paramParcelable instanceof c)) {
      super.onRestoreInstanceState(paramParcelable);
      return;
    } 
    c c1 = (c)paramParcelable;
    super.onRestoreInstanceState(c1.getSuperState());
    this.w = c1;
    requestLayout();
  }
  
  public Parcelable onSaveInstanceState() {
    c c1 = new c(super.onSaveInstanceState());
    c1.b = getScrollY();
    return (Parcelable)c1;
  }
  
  public void onScrollChanged(int paramInt1, int paramInt2, int paramInt3, int paramInt4) {
    super.onScrollChanged(paramInt1, paramInt2, paramInt3, paramInt4);
    b b1 = this.A;
    if (b1 != null) {
      b.b.k.b b2 = (b.b.k.b)b1;
      AlertController.c((View)this, b2.a, b2.b);
    } 
  }
  
  public void onSizeChanged(int paramInt1, int paramInt2, int paramInt3, int paramInt4) {
    super.onSizeChanged(paramInt1, paramInt2, paramInt3, paramInt4);
    View view = findFocus();
    if (view != null && this != view && t(view, 0, paramInt4)) {
      view.getDrawingRect(this.c);
      offsetDescendantRectToMyCoords(view, this.c);
      f(d(this.c));
    } 
  }
  
  public boolean onStartNestedScroll(View paramView1, View paramView2, int paramInt) {
    boolean bool;
    if ((paramInt & 0x2) != 0) {
      bool = true;
    } else {
      bool = false;
    } 
    return bool;
  }
  
  public void onStopNestedScroll(View paramView) {
    this.x.a = 0;
    D(0);
  }
  
  public boolean onTouchEvent(MotionEvent paramMotionEvent) {
    // Byte code:
    //   0: aload_0
    //   1: getfield l : Landroid/view/VelocityTracker;
    //   4: ifnonnull -> 14
    //   7: aload_0
    //   8: invokestatic obtain : ()Landroid/view/VelocityTracker;
    //   11: putfield l : Landroid/view/VelocityTracker;
    //   14: aload_1
    //   15: invokevirtual getActionMasked : ()I
    //   18: istore_3
    //   19: iload_3
    //   20: ifne -> 28
    //   23: aload_0
    //   24: iconst_0
    //   25: putfield u : I
    //   28: aload_1
    //   29: invokestatic obtain : (Landroid/view/MotionEvent;)Landroid/view/MotionEvent;
    //   32: astore #10
    //   34: aload #10
    //   36: fconst_0
    //   37: aload_0
    //   38: getfield u : I
    //   41: i2f
    //   42: invokevirtual offsetLocation : (FF)V
    //   45: iload_3
    //   46: ifeq -> 821
    //   49: iload_3
    //   50: iconst_1
    //   51: if_icmpeq -> 711
    //   54: iload_3
    //   55: iconst_2
    //   56: if_icmpeq -> 172
    //   59: iload_3
    //   60: iconst_3
    //   61: if_icmpeq -> 130
    //   64: iload_3
    //   65: iconst_5
    //   66: if_icmpeq -> 103
    //   69: iload_3
    //   70: bipush #6
    //   72: if_icmpeq -> 78
    //   75: goto -> 910
    //   78: aload_0
    //   79: aload_1
    //   80: invokevirtual v : (Landroid/view/MotionEvent;)V
    //   83: aload_0
    //   84: aload_1
    //   85: aload_1
    //   86: aload_0
    //   87: getfield r : I
    //   90: invokevirtual findPointerIndex : (I)I
    //   93: invokevirtual getY : (I)F
    //   96: f2i
    //   97: putfield g : I
    //   100: goto -> 910
    //   103: aload_1
    //   104: invokevirtual getActionIndex : ()I
    //   107: istore_3
    //   108: aload_0
    //   109: aload_1
    //   110: iload_3
    //   111: invokevirtual getY : (I)F
    //   114: f2i
    //   115: putfield g : I
    //   118: aload_0
    //   119: aload_1
    //   120: iload_3
    //   121: invokevirtual getPointerId : (I)I
    //   124: putfield r : I
    //   127: goto -> 910
    //   130: aload_0
    //   131: getfield k : Z
    //   134: ifeq -> 809
    //   137: aload_0
    //   138: invokevirtual getChildCount : ()I
    //   141: ifle -> 809
    //   144: aload_0
    //   145: getfield d : Landroid/widget/OverScroller;
    //   148: aload_0
    //   149: invokevirtual getScrollX : ()I
    //   152: aload_0
    //   153: invokevirtual getScrollY : ()I
    //   156: iconst_0
    //   157: iconst_0
    //   158: iconst_0
    //   159: aload_0
    //   160: invokevirtual getScrollRange : ()I
    //   163: invokevirtual springBack : (IIIIII)Z
    //   166: ifeq -> 809
    //   169: goto -> 805
    //   172: aload_1
    //   173: aload_0
    //   174: getfield r : I
    //   177: invokevirtual findPointerIndex : (I)I
    //   180: istore #5
    //   182: iload #5
    //   184: iconst_m1
    //   185: if_icmpne -> 226
    //   188: ldc_w 'Invalid pointerId='
    //   191: invokestatic e : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   194: astore_1
    //   195: aload_1
    //   196: aload_0
    //   197: getfield r : I
    //   200: invokevirtual append : (I)Ljava/lang/StringBuilder;
    //   203: pop
    //   204: aload_1
    //   205: ldc_w ' in onTouchEvent'
    //   208: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   211: pop
    //   212: ldc_w 'NestedScrollView'
    //   215: aload_1
    //   216: invokevirtual toString : ()Ljava/lang/String;
    //   219: invokestatic e : (Ljava/lang/String;Ljava/lang/String;)I
    //   222: pop
    //   223: goto -> 910
    //   226: aload_1
    //   227: iload #5
    //   229: invokevirtual getY : (I)F
    //   232: f2i
    //   233: istore #6
    //   235: aload_0
    //   236: getfield g : I
    //   239: iload #6
    //   241: isub
    //   242: istore #4
    //   244: iload #4
    //   246: istore_3
    //   247: aload_0
    //   248: getfield k : Z
    //   251: ifne -> 316
    //   254: iload #4
    //   256: istore_3
    //   257: iload #4
    //   259: invokestatic abs : (I)I
    //   262: aload_0
    //   263: getfield o : I
    //   266: if_icmple -> 316
    //   269: aload_0
    //   270: invokevirtual getParent : ()Landroid/view/ViewParent;
    //   273: astore #11
    //   275: aload #11
    //   277: ifnull -> 288
    //   280: aload #11
    //   282: iconst_1
    //   283: invokeinterface requestDisallowInterceptTouchEvent : (Z)V
    //   288: aload_0
    //   289: iconst_1
    //   290: putfield k : Z
    //   293: aload_0
    //   294: getfield o : I
    //   297: istore_3
    //   298: iload #4
    //   300: ifle -> 311
    //   303: iload #4
    //   305: iload_3
    //   306: isub
    //   307: istore_3
    //   308: goto -> 316
    //   311: iload #4
    //   313: iload_3
    //   314: iadd
    //   315: istore_3
    //   316: iload_3
    //   317: istore #4
    //   319: aload_0
    //   320: getfield k : Z
    //   323: ifeq -> 910
    //   326: iload #4
    //   328: istore_3
    //   329: aload_0
    //   330: iconst_0
    //   331: iload #4
    //   333: aload_0
    //   334: getfield t : [I
    //   337: aload_0
    //   338: getfield s : [I
    //   341: iconst_0
    //   342: invokevirtual e : (II[I[II)Z
    //   345: ifeq -> 373
    //   348: iload #4
    //   350: aload_0
    //   351: getfield t : [I
    //   354: iconst_1
    //   355: iaload
    //   356: isub
    //   357: istore_3
    //   358: aload_0
    //   359: aload_0
    //   360: getfield u : I
    //   363: aload_0
    //   364: getfield s : [I
    //   367: iconst_1
    //   368: iaload
    //   369: iadd
    //   370: putfield u : I
    //   373: aload_0
    //   374: iload #6
    //   376: aload_0
    //   377: getfield s : [I
    //   380: iconst_1
    //   381: iaload
    //   382: isub
    //   383: putfield g : I
    //   386: aload_0
    //   387: invokevirtual getScrollY : ()I
    //   390: istore #7
    //   392: aload_0
    //   393: invokevirtual getScrollRange : ()I
    //   396: istore #6
    //   398: aload_0
    //   399: invokevirtual getOverScrollMode : ()I
    //   402: istore #4
    //   404: iload #4
    //   406: ifeq -> 429
    //   409: iload #4
    //   411: iconst_1
    //   412: if_icmpne -> 423
    //   415: iload #6
    //   417: ifle -> 423
    //   420: goto -> 429
    //   423: iconst_0
    //   424: istore #4
    //   426: goto -> 432
    //   429: iconst_1
    //   430: istore #4
    //   432: aload_0
    //   433: iconst_0
    //   434: iload_3
    //   435: iconst_0
    //   436: aload_0
    //   437: invokevirtual getScrollY : ()I
    //   440: iconst_0
    //   441: iload #6
    //   443: iconst_0
    //   444: iconst_0
    //   445: invokevirtual w : (IIIIIIII)Z
    //   448: ifeq -> 466
    //   451: aload_0
    //   452: iconst_0
    //   453: invokevirtual r : (I)Z
    //   456: ifne -> 466
    //   459: aload_0
    //   460: getfield l : Landroid/view/VelocityTracker;
    //   463: invokevirtual clear : ()V
    //   466: aload_0
    //   467: invokevirtual getScrollY : ()I
    //   470: iload #7
    //   472: isub
    //   473: istore #8
    //   475: aload_0
    //   476: getfield t : [I
    //   479: astore #11
    //   481: aload #11
    //   483: iconst_1
    //   484: iconst_0
    //   485: iastore
    //   486: aload_0
    //   487: getfield s : [I
    //   490: astore #12
    //   492: aload_0
    //   493: getfield y : Lb/i/m/f;
    //   496: iconst_0
    //   497: iload #8
    //   499: iconst_0
    //   500: iload_3
    //   501: iload #8
    //   503: isub
    //   504: aload #12
    //   506: iconst_0
    //   507: aload #11
    //   509: invokevirtual e : (IIII[II[I)Z
    //   512: pop
    //   513: aload_0
    //   514: getfield g : I
    //   517: istore #8
    //   519: aload_0
    //   520: getfield s : [I
    //   523: astore #11
    //   525: aload_0
    //   526: iload #8
    //   528: aload #11
    //   530: iconst_1
    //   531: iaload
    //   532: isub
    //   533: putfield g : I
    //   536: aload_0
    //   537: aload_0
    //   538: getfield u : I
    //   541: aload #11
    //   543: iconst_1
    //   544: iaload
    //   545: iadd
    //   546: putfield u : I
    //   549: iload #4
    //   551: ifeq -> 910
    //   554: iload_3
    //   555: aload_0
    //   556: getfield t : [I
    //   559: iconst_1
    //   560: iaload
    //   561: isub
    //   562: istore_3
    //   563: aload_0
    //   564: invokevirtual h : ()V
    //   567: iload #7
    //   569: iload_3
    //   570: iadd
    //   571: istore #4
    //   573: iload #4
    //   575: ifge -> 623
    //   578: aload_0
    //   579: getfield e : Landroid/widget/EdgeEffect;
    //   582: iload_3
    //   583: i2f
    //   584: aload_0
    //   585: invokevirtual getHeight : ()I
    //   588: i2f
    //   589: fdiv
    //   590: aload_1
    //   591: iload #5
    //   593: invokevirtual getX : (I)F
    //   596: aload_0
    //   597: invokevirtual getWidth : ()I
    //   600: i2f
    //   601: fdiv
    //   602: invokevirtual onPull : (FF)V
    //   605: aload_0
    //   606: getfield f : Landroid/widget/EdgeEffect;
    //   609: invokevirtual isFinished : ()Z
    //   612: ifne -> 678
    //   615: aload_0
    //   616: getfield f : Landroid/widget/EdgeEffect;
    //   619: astore_1
    //   620: goto -> 674
    //   623: iload #4
    //   625: iload #6
    //   627: if_icmple -> 678
    //   630: aload_0
    //   631: getfield f : Landroid/widget/EdgeEffect;
    //   634: iload_3
    //   635: i2f
    //   636: aload_0
    //   637: invokevirtual getHeight : ()I
    //   640: i2f
    //   641: fdiv
    //   642: fconst_1
    //   643: aload_1
    //   644: iload #5
    //   646: invokevirtual getX : (I)F
    //   649: aload_0
    //   650: invokevirtual getWidth : ()I
    //   653: i2f
    //   654: fdiv
    //   655: fsub
    //   656: invokevirtual onPull : (FF)V
    //   659: aload_0
    //   660: getfield e : Landroid/widget/EdgeEffect;
    //   663: invokevirtual isFinished : ()Z
    //   666: ifne -> 678
    //   669: aload_0
    //   670: getfield e : Landroid/widget/EdgeEffect;
    //   673: astore_1
    //   674: aload_1
    //   675: invokevirtual onRelease : ()V
    //   678: aload_0
    //   679: getfield e : Landroid/widget/EdgeEffect;
    //   682: astore_1
    //   683: aload_1
    //   684: ifnull -> 910
    //   687: aload_1
    //   688: invokevirtual isFinished : ()Z
    //   691: ifeq -> 704
    //   694: aload_0
    //   695: getfield f : Landroid/widget/EdgeEffect;
    //   698: invokevirtual isFinished : ()Z
    //   701: ifne -> 910
    //   704: aload_0
    //   705: invokestatic O : (Landroid/view/View;)V
    //   708: goto -> 910
    //   711: aload_0
    //   712: getfield l : Landroid/view/VelocityTracker;
    //   715: astore_1
    //   716: aload_1
    //   717: sipush #1000
    //   720: aload_0
    //   721: getfield q : I
    //   724: i2f
    //   725: invokevirtual computeCurrentVelocity : (IF)V
    //   728: aload_1
    //   729: aload_0
    //   730: getfield r : I
    //   733: invokevirtual getYVelocity : (I)F
    //   736: f2i
    //   737: istore_3
    //   738: iload_3
    //   739: invokestatic abs : (I)I
    //   742: aload_0
    //   743: getfield p : I
    //   746: if_icmplt -> 780
    //   749: iload_3
    //   750: ineg
    //   751: istore_3
    //   752: iload_3
    //   753: i2f
    //   754: fstore_2
    //   755: aload_0
    //   756: fconst_0
    //   757: fload_2
    //   758: invokevirtual dispatchNestedPreFling : (FF)Z
    //   761: ifne -> 809
    //   764: aload_0
    //   765: fconst_0
    //   766: fload_2
    //   767: iconst_1
    //   768: invokevirtual dispatchNestedFling : (FFZ)Z
    //   771: pop
    //   772: aload_0
    //   773: iload_3
    //   774: invokevirtual p : (I)V
    //   777: goto -> 809
    //   780: aload_0
    //   781: getfield d : Landroid/widget/OverScroller;
    //   784: aload_0
    //   785: invokevirtual getScrollX : ()I
    //   788: aload_0
    //   789: invokevirtual getScrollY : ()I
    //   792: iconst_0
    //   793: iconst_0
    //   794: iconst_0
    //   795: aload_0
    //   796: invokevirtual getScrollRange : ()I
    //   799: invokevirtual springBack : (IIIIII)Z
    //   802: ifeq -> 809
    //   805: aload_0
    //   806: invokestatic O : (Landroid/view/View;)V
    //   809: aload_0
    //   810: iconst_m1
    //   811: putfield r : I
    //   814: aload_0
    //   815: invokevirtual g : ()V
    //   818: goto -> 910
    //   821: aload_0
    //   822: invokevirtual getChildCount : ()I
    //   825: ifne -> 830
    //   828: iconst_0
    //   829: ireturn
    //   830: aload_0
    //   831: getfield d : Landroid/widget/OverScroller;
    //   834: invokevirtual isFinished : ()Z
    //   837: iconst_1
    //   838: ixor
    //   839: istore #9
    //   841: aload_0
    //   842: iload #9
    //   844: putfield k : Z
    //   847: iload #9
    //   849: ifeq -> 871
    //   852: aload_0
    //   853: invokevirtual getParent : ()Landroid/view/ViewParent;
    //   856: astore #11
    //   858: aload #11
    //   860: ifnull -> 871
    //   863: aload #11
    //   865: iconst_1
    //   866: invokeinterface requestDisallowInterceptTouchEvent : (Z)V
    //   871: aload_0
    //   872: getfield d : Landroid/widget/OverScroller;
    //   875: invokevirtual isFinished : ()Z
    //   878: ifne -> 885
    //   881: aload_0
    //   882: invokevirtual a : ()V
    //   885: aload_0
    //   886: aload_1
    //   887: invokevirtual getY : ()F
    //   890: f2i
    //   891: putfield g : I
    //   894: aload_0
    //   895: aload_1
    //   896: iconst_0
    //   897: invokevirtual getPointerId : (I)I
    //   900: putfield r : I
    //   903: aload_0
    //   904: iconst_2
    //   905: iconst_0
    //   906: invokevirtual C : (II)Z
    //   909: pop
    //   910: aload_0
    //   911: getfield l : Landroid/view/VelocityTracker;
    //   914: astore_1
    //   915: aload_1
    //   916: ifnull -> 925
    //   919: aload_1
    //   920: aload #10
    //   922: invokevirtual addMovement : (Landroid/view/MotionEvent;)V
    //   925: aload #10
    //   927: invokevirtual recycle : ()V
    //   930: iconst_1
    //   931: ireturn
  }
  
  public void p(int paramInt) {
    if (getChildCount() > 0) {
      this.d.fling(getScrollX(), getScrollY(), 0, paramInt, 0, 0, -2147483648, 2147483647, 0, 0);
      y(true);
    } 
  }
  
  public boolean q(int paramInt) {
    int j;
    if (paramInt == 130) {
      j = 1;
    } else {
      j = 0;
    } 
    int k = getHeight();
    Rect rect = this.c;
    rect.top = 0;
    rect.bottom = k;
    if (j) {
      j = getChildCount();
      if (j > 0) {
        View view = getChildAt(j - 1);
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams)view.getLayoutParams();
        rect = this.c;
        int m = view.getBottom();
        j = layoutParams.bottomMargin;
        rect.bottom = getPaddingBottom() + m + j;
        rect = this.c;
        rect.top = rect.bottom - k;
      } 
    } 
    rect = this.c;
    return z(paramInt, rect.top, rect.bottom);
  }
  
  public boolean r(int paramInt) {
    boolean bool;
    if (this.y.f(paramInt) != null) {
      bool = true;
    } else {
      bool = false;
    } 
    return bool;
  }
  
  public void requestChildFocus(View paramView1, View paramView2) {
    if (!this.h) {
      A(paramView2);
    } else {
      this.j = paramView2;
    } 
    super.requestChildFocus(paramView1, paramView2);
  }
  
  public boolean requestChildRectangleOnScreen(View paramView, Rect paramRect, boolean paramBoolean) {
    boolean bool;
    paramRect.offset(paramView.getLeft() - paramView.getScrollX(), paramView.getTop() - paramView.getScrollY());
    int j = d(paramRect);
    if (j != 0) {
      bool = true;
    } else {
      bool = false;
    } 
    if (bool)
      if (paramBoolean) {
        scrollBy(0, j);
      } else {
        B(0, j, 250, false);
      }  
    return bool;
  }
  
  public void requestDisallowInterceptTouchEvent(boolean paramBoolean) {
    if (paramBoolean)
      x(); 
    super.requestDisallowInterceptTouchEvent(paramBoolean);
  }
  
  public void requestLayout() {
    this.h = true;
    super.requestLayout();
  }
  
  public void scrollTo(int paramInt1, int paramInt2) {
    if (getChildCount() > 0) {
      View view = getChildAt(0);
      FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams)view.getLayoutParams();
      int i6 = getWidth();
      int i5 = getPaddingLeft();
      int i7 = getPaddingRight();
      int i3 = view.getWidth();
      int i4 = layoutParams.leftMargin;
      int i8 = layoutParams.rightMargin;
      int i2 = getHeight();
      int n = getPaddingTop();
      int k = getPaddingBottom();
      int m = view.getHeight();
      int j = layoutParams.topMargin;
      int i1 = layoutParams.bottomMargin;
      paramInt1 = c(paramInt1, i6 - i5 - i7, i3 + i4 + i8);
      paramInt2 = c(paramInt2, i2 - n - k, m + j + i1);
      if (paramInt1 != getScrollX() || paramInt2 != getScrollY())
        super.scrollTo(paramInt1, paramInt2); 
    } 
  }
  
  public void setFillViewport(boolean paramBoolean) {
    if (paramBoolean != this.m) {
      this.m = paramBoolean;
      requestLayout();
    } 
  }
  
  public void setNestedScrollingEnabled(boolean paramBoolean) {
    f f1 = this.y;
    if (f1.d)
      l.i0(f1.c); 
    f1.d = paramBoolean;
  }
  
  public void setOnScrollChangeListener(b paramb) {
    this.A = paramb;
  }
  
  public void setSmoothScrollingEnabled(boolean paramBoolean) {
    this.n = paramBoolean;
  }
  
  public boolean shouldDelayChildPressedState() {
    return true;
  }
  
  public boolean startNestedScroll(int paramInt) {
    return this.y.h(paramInt, 0);
  }
  
  public void stopNestedScroll() {
    this.y.i(0);
  }
  
  public final boolean t(View paramView, int paramInt1, int paramInt2) {
    boolean bool;
    paramView.getDrawingRect(this.c);
    offsetDescendantRectToMyCoords(paramView, this.c);
    if (this.c.bottom + paramInt1 >= getScrollY() && this.c.top - paramInt1 <= getScrollY() + paramInt2) {
      bool = true;
    } else {
      bool = false;
    } 
    return bool;
  }
  
  public final void u(int paramInt1, int paramInt2, int[] paramArrayOfint) {
    int j = getScrollY();
    scrollBy(0, paramInt1);
    j = getScrollY() - j;
    if (paramArrayOfint != null)
      paramArrayOfint[1] = paramArrayOfint[1] + j; 
    this.y.e(0, j, 0, paramInt1 - j, null, paramInt2, paramArrayOfint);
  }
  
  public final void v(MotionEvent paramMotionEvent) {
    int j = paramMotionEvent.getActionIndex();
    if (paramMotionEvent.getPointerId(j) == this.r) {
      if (j == 0) {
        j = 1;
      } else {
        j = 0;
      } 
      this.g = (int)paramMotionEvent.getY(j);
      this.r = paramMotionEvent.getPointerId(j);
      VelocityTracker velocityTracker = this.l;
      if (velocityTracker != null)
        velocityTracker.clear(); 
    } 
  }
  
  public boolean w(int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5, int paramInt6, int paramInt7, int paramInt8) {
    // Byte code:
    //   0: aload_0
    //   1: invokevirtual getOverScrollMode : ()I
    //   4: istore #11
    //   6: aload_0
    //   7: invokevirtual computeHorizontalScrollRange : ()I
    //   10: istore #10
    //   12: aload_0
    //   13: invokevirtual computeHorizontalScrollExtent : ()I
    //   16: istore #9
    //   18: iconst_0
    //   19: istore #14
    //   21: iload #10
    //   23: iload #9
    //   25: if_icmple -> 34
    //   28: iconst_1
    //   29: istore #9
    //   31: goto -> 37
    //   34: iconst_0
    //   35: istore #9
    //   37: aload_0
    //   38: invokevirtual computeVerticalScrollRange : ()I
    //   41: aload_0
    //   42: invokevirtual computeVerticalScrollExtent : ()I
    //   45: if_icmple -> 54
    //   48: iconst_1
    //   49: istore #10
    //   51: goto -> 57
    //   54: iconst_0
    //   55: istore #10
    //   57: iload #11
    //   59: ifeq -> 82
    //   62: iload #11
    //   64: iconst_1
    //   65: if_icmpne -> 76
    //   68: iload #9
    //   70: ifeq -> 76
    //   73: goto -> 82
    //   76: iconst_0
    //   77: istore #9
    //   79: goto -> 85
    //   82: iconst_1
    //   83: istore #9
    //   85: iload #11
    //   87: ifeq -> 110
    //   90: iload #11
    //   92: iconst_1
    //   93: if_icmpne -> 104
    //   96: iload #10
    //   98: ifeq -> 104
    //   101: goto -> 110
    //   104: iconst_0
    //   105: istore #10
    //   107: goto -> 113
    //   110: iconst_1
    //   111: istore #10
    //   113: iload_3
    //   114: iload_1
    //   115: iadd
    //   116: istore_3
    //   117: iload #9
    //   119: ifne -> 127
    //   122: iconst_0
    //   123: istore_1
    //   124: goto -> 130
    //   127: iload #7
    //   129: istore_1
    //   130: iload #4
    //   132: iload_2
    //   133: iadd
    //   134: istore #4
    //   136: iload #10
    //   138: ifne -> 146
    //   141: iconst_0
    //   142: istore_2
    //   143: goto -> 149
    //   146: iload #8
    //   148: istore_2
    //   149: iload_1
    //   150: ineg
    //   151: istore #7
    //   153: iload_1
    //   154: iload #5
    //   156: iadd
    //   157: istore_1
    //   158: iload_2
    //   159: ineg
    //   160: istore #5
    //   162: iload_2
    //   163: iload #6
    //   165: iadd
    //   166: istore #6
    //   168: iload_3
    //   169: iload_1
    //   170: if_icmple -> 181
    //   173: iconst_1
    //   174: istore #12
    //   176: iload_1
    //   177: istore_2
    //   178: goto -> 198
    //   181: iload_3
    //   182: iload #7
    //   184: if_icmpge -> 193
    //   187: iload #7
    //   189: istore_1
    //   190: goto -> 173
    //   193: iconst_0
    //   194: istore #12
    //   196: iload_3
    //   197: istore_2
    //   198: iload #4
    //   200: iload #6
    //   202: if_icmple -> 214
    //   205: iload #6
    //   207: istore_1
    //   208: iconst_1
    //   209: istore #13
    //   211: goto -> 233
    //   214: iload #4
    //   216: iload #5
    //   218: if_icmpge -> 227
    //   221: iload #5
    //   223: istore_1
    //   224: goto -> 208
    //   227: iconst_0
    //   228: istore #13
    //   230: iload #4
    //   232: istore_1
    //   233: iload #13
    //   235: ifeq -> 263
    //   238: aload_0
    //   239: iconst_1
    //   240: invokevirtual r : (I)Z
    //   243: ifne -> 263
    //   246: aload_0
    //   247: getfield d : Landroid/widget/OverScroller;
    //   250: iload_2
    //   251: iload_1
    //   252: iconst_0
    //   253: iconst_0
    //   254: iconst_0
    //   255: aload_0
    //   256: invokevirtual getScrollRange : ()I
    //   259: invokevirtual springBack : (IIIIII)Z
    //   262: pop
    //   263: aload_0
    //   264: iload_2
    //   265: iload_1
    //   266: iload #12
    //   268: iload #13
    //   270: invokevirtual onOverScrolled : (IIZZ)V
    //   273: iload #12
    //   275: ifne -> 287
    //   278: iload #14
    //   280: istore #12
    //   282: iload #13
    //   284: ifeq -> 290
    //   287: iconst_1
    //   288: istore #12
    //   290: iload #12
    //   292: ireturn
  }
  
  public final void x() {
    VelocityTracker velocityTracker = this.l;
    if (velocityTracker != null) {
      velocityTracker.recycle();
      this.l = null;
    } 
  }
  
  public final void y(boolean paramBoolean) {
    if (paramBoolean) {
      C(2, 1);
    } else {
      this.y.i(1);
    } 
    this.v = getScrollY();
    l.O((View)this);
  }
  
  public final boolean z(int paramInt1, int paramInt2, int paramInt3) {
    // Byte code:
    //   0: aload_0
    //   1: invokevirtual getHeight : ()I
    //   4: istore #4
    //   6: aload_0
    //   7: invokevirtual getScrollY : ()I
    //   10: istore #10
    //   12: iload #4
    //   14: iload #10
    //   16: iadd
    //   17: istore #11
    //   19: iload_1
    //   20: bipush #33
    //   22: if_icmpne -> 31
    //   25: iconst_1
    //   26: istore #6
    //   28: goto -> 34
    //   31: iconst_0
    //   32: istore #6
    //   34: aload_0
    //   35: iconst_2
    //   36: invokevirtual getFocusables : (I)Ljava/util/ArrayList;
    //   39: astore #18
    //   41: aload #18
    //   43: invokeinterface size : ()I
    //   48: istore #12
    //   50: aconst_null
    //   51: astore #16
    //   53: iconst_0
    //   54: istore #7
    //   56: iconst_0
    //   57: istore #8
    //   59: iload #7
    //   61: iload #12
    //   63: if_icmpge -> 282
    //   66: aload #18
    //   68: iload #7
    //   70: invokeinterface get : (I)Ljava/lang/Object;
    //   75: checkcast android/view/View
    //   78: astore #17
    //   80: aload #17
    //   82: invokevirtual getTop : ()I
    //   85: istore #13
    //   87: aload #17
    //   89: invokevirtual getBottom : ()I
    //   92: istore #9
    //   94: aload #16
    //   96: astore #15
    //   98: iload #8
    //   100: istore #5
    //   102: iload_2
    //   103: iload #9
    //   105: if_icmpge -> 268
    //   108: aload #16
    //   110: astore #15
    //   112: iload #8
    //   114: istore #5
    //   116: iload #13
    //   118: iload_3
    //   119: if_icmpge -> 268
    //   122: iload_2
    //   123: iload #13
    //   125: if_icmpge -> 140
    //   128: iload #9
    //   130: iload_3
    //   131: if_icmpge -> 140
    //   134: iconst_1
    //   135: istore #4
    //   137: goto -> 143
    //   140: iconst_0
    //   141: istore #4
    //   143: aload #16
    //   145: ifnonnull -> 159
    //   148: aload #17
    //   150: astore #15
    //   152: iload #4
    //   154: istore #5
    //   156: goto -> 268
    //   159: iload #6
    //   161: ifeq -> 174
    //   164: iload #13
    //   166: aload #16
    //   168: invokevirtual getTop : ()I
    //   171: if_icmplt -> 189
    //   174: iload #6
    //   176: ifne -> 195
    //   179: iload #9
    //   181: aload #16
    //   183: invokevirtual getBottom : ()I
    //   186: if_icmple -> 195
    //   189: iconst_1
    //   190: istore #9
    //   192: goto -> 198
    //   195: iconst_0
    //   196: istore #9
    //   198: iload #8
    //   200: ifeq -> 232
    //   203: aload #16
    //   205: astore #15
    //   207: iload #8
    //   209: istore #5
    //   211: iload #4
    //   213: ifeq -> 268
    //   216: aload #16
    //   218: astore #15
    //   220: iload #8
    //   222: istore #5
    //   224: iload #9
    //   226: ifeq -> 268
    //   229: goto -> 260
    //   232: iload #4
    //   234: ifeq -> 247
    //   237: aload #17
    //   239: astore #15
    //   241: iconst_1
    //   242: istore #5
    //   244: goto -> 268
    //   247: aload #16
    //   249: astore #15
    //   251: iload #8
    //   253: istore #5
    //   255: iload #9
    //   257: ifeq -> 268
    //   260: aload #17
    //   262: astore #15
    //   264: iload #8
    //   266: istore #5
    //   268: iinc #7, 1
    //   271: aload #15
    //   273: astore #16
    //   275: iload #5
    //   277: istore #8
    //   279: goto -> 59
    //   282: aload #16
    //   284: astore #15
    //   286: aload #16
    //   288: ifnonnull -> 294
    //   291: aload_0
    //   292: astore #15
    //   294: iload_2
    //   295: iload #10
    //   297: if_icmplt -> 312
    //   300: iload_3
    //   301: iload #11
    //   303: if_icmpgt -> 312
    //   306: iconst_0
    //   307: istore #14
    //   309: goto -> 338
    //   312: iload #6
    //   314: ifeq -> 325
    //   317: iload_2
    //   318: iload #10
    //   320: isub
    //   321: istore_2
    //   322: goto -> 330
    //   325: iload_3
    //   326: iload #11
    //   328: isub
    //   329: istore_2
    //   330: aload_0
    //   331: iload_2
    //   332: invokevirtual f : (I)V
    //   335: iconst_1
    //   336: istore #14
    //   338: aload #15
    //   340: aload_0
    //   341: invokevirtual findFocus : ()Landroid/view/View;
    //   344: if_acmpeq -> 354
    //   347: aload #15
    //   349: iload_1
    //   350: invokevirtual requestFocus : (I)Z
    //   353: pop
    //   354: iload #14
    //   356: ireturn
  }
  
  public static class a extends b.i.m.a {
    public void c(View param1View, AccessibilityEvent param1AccessibilityEvent) {
      boolean bool;
      this.a.onInitializeAccessibilityEvent(param1View, param1AccessibilityEvent);
      NestedScrollView nestedScrollView = (NestedScrollView)param1View;
      param1AccessibilityEvent.setClassName(ScrollView.class.getName());
      if (nestedScrollView.getScrollRange() > 0) {
        bool = true;
      } else {
        bool = false;
      } 
      param1AccessibilityEvent.setScrollable(bool);
      param1AccessibilityEvent.setScrollX(nestedScrollView.getScrollX());
      param1AccessibilityEvent.setScrollY(nestedScrollView.getScrollY());
      param1AccessibilityEvent.setMaxScrollX(nestedScrollView.getScrollX());
      param1AccessibilityEvent.setMaxScrollY(nestedScrollView.getScrollRange());
    }
    
    public void d(View param1View, b.i.m.v.b param1b) {
      this.a.onInitializeAccessibilityNodeInfo(param1View, param1b.a);
      NestedScrollView nestedScrollView = (NestedScrollView)param1View;
      String str = ScrollView.class.getName();
      param1b.a.setClassName(str);
      if (nestedScrollView.isEnabled()) {
        int i = nestedScrollView.getScrollRange();
        if (i > 0) {
          param1b.a.setScrollable(true);
          if (nestedScrollView.getScrollY() > 0) {
            param1b.a(b.i.m.v.b.a.g);
            param1b.a(b.i.m.v.b.a.k);
          } 
          if (nestedScrollView.getScrollY() < i) {
            param1b.a(b.i.m.v.b.a.f);
            param1b.a(b.i.m.v.b.a.l);
          } 
        } 
      } 
    }
    
    public boolean g(View param1View, int param1Int, Bundle param1Bundle) {
      if (super.g(param1View, param1Int, param1Bundle))
        return true; 
      NestedScrollView nestedScrollView = (NestedScrollView)param1View;
      if (!nestedScrollView.isEnabled())
        return false; 
      if (param1Int != 4096)
        if (param1Int != 8192 && param1Int != 16908344) {
          if (param1Int != 16908346)
            return false; 
        } else {
          int k = nestedScrollView.getHeight();
          param1Int = nestedScrollView.getPaddingBottom();
          int m = nestedScrollView.getPaddingTop();
          param1Int = Math.max(nestedScrollView.getScrollY() - k - param1Int - m, 0);
          if (param1Int == nestedScrollView.getScrollY())
            return false; 
          nestedScrollView.B(0 - nestedScrollView.getScrollX(), param1Int - nestedScrollView.getScrollY(), 250, true);
          return true;
        }  
      param1Int = nestedScrollView.getHeight();
      int j = nestedScrollView.getPaddingBottom();
      int i = nestedScrollView.getPaddingTop();
      param1Int = Math.min(nestedScrollView.getScrollY() + param1Int - j - i, nestedScrollView.getScrollRange());
      if (param1Int == nestedScrollView.getScrollY())
        return false; 
      nestedScrollView.B(0 - nestedScrollView.getScrollX(), param1Int - nestedScrollView.getScrollY(), 250, true);
      return true;
    }
  }
  
  public static interface b {}
  
  public static class c extends View.BaseSavedState {
    public static final Parcelable.Creator<c> CREATOR = new a();
    
    public int b;
    
    public c(Parcel param1Parcel) {
      super(param1Parcel);
      this.b = param1Parcel.readInt();
    }
    
    public c(Parcelable param1Parcelable) {
      super(param1Parcelable);
    }
    
    public String toString() {
      StringBuilder stringBuilder = c.a.a.a.a.e("HorizontalScrollView.SavedState{");
      stringBuilder.append(Integer.toHexString(System.identityHashCode(this)));
      stringBuilder.append(" scrollPosition=");
      stringBuilder.append(this.b);
      stringBuilder.append("}");
      return stringBuilder.toString();
    }
    
    public void writeToParcel(Parcel param1Parcel, int param1Int) {
      super.writeToParcel(param1Parcel, param1Int);
      param1Parcel.writeInt(this.b);
    }
    
    public class a implements Parcelable.Creator<c> {
      public Object createFromParcel(Parcel param2Parcel) {
        return new NestedScrollView.c(param2Parcel);
      }
      
      public Object[] newArray(int param2Int) {
        return (Object[])new NestedScrollView.c[param2Int];
      }
    }
  }
  
  public class a implements Parcelable.Creator<c> {
    public Object createFromParcel(Parcel param1Parcel) {
      return new NestedScrollView.c(param1Parcel);
    }
    
    public Object[] newArray(int param1Int) {
      return (Object[])new NestedScrollView.c[param1Int];
    }
  }
}


/* Location:              C:\Users\panch\Downloads\dvba_v1.1.0-dex2jar.jar!\androidx\core\widget\NestedScrollView.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */