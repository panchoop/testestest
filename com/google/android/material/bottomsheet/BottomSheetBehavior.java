package com.google.android.material.bottomsheet;

import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.drawable.Drawable;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import b.i.m.l;
import c.c.a.b.d0.g;
import c.c.a.b.d0.j;
import c.c.a.b.j;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class BottomSheetBehavior<V extends View> extends CoordinatorLayout.c<V> {
  public static final int K = j.Widget_Design_BottomSheet_Modal;
  
  public int A;
  
  public WeakReference<V> B;
  
  public WeakReference<View> C;
  
  public final ArrayList<d> D = new ArrayList<d>();
  
  public VelocityTracker E;
  
  public int F;
  
  public int G;
  
  public boolean H;
  
  public Map<View, Integer> I;
  
  public final b.k.b.e.c J = new b(this);
  
  public int a = 0;
  
  public boolean b = true;
  
  public float c;
  
  public int d;
  
  public boolean e;
  
  public int f;
  
  public boolean g;
  
  public g h;
  
  public j i;
  
  public boolean j;
  
  public f k = null;
  
  public ValueAnimator l;
  
  public int m;
  
  public int n;
  
  public int o;
  
  public float p = 0.5F;
  
  public int q;
  
  public float r = -1.0F;
  
  public boolean s;
  
  public boolean t;
  
  public int u = 4;
  
  public b.k.b.e v;
  
  public boolean w;
  
  public int x;
  
  public boolean y;
  
  public int z;
  
  public BottomSheetBehavior() {}
  
  public BottomSheetBehavior(Context paramContext, AttributeSet paramAttributeSet) {
    // Byte code:
    //   0: aload_0
    //   1: aload_1
    //   2: aload_2
    //   3: invokespecial <init> : (Landroid/content/Context;Landroid/util/AttributeSet;)V
    //   6: aload_0
    //   7: iconst_0
    //   8: putfield a : I
    //   11: aload_0
    //   12: iconst_1
    //   13: putfield b : Z
    //   16: aload_0
    //   17: aconst_null
    //   18: putfield k : Lcom/google/android/material/bottomsheet/BottomSheetBehavior$f;
    //   21: aload_0
    //   22: ldc 0.5
    //   24: putfield p : F
    //   27: aload_0
    //   28: ldc -1.0
    //   30: putfield r : F
    //   33: aload_0
    //   34: iconst_4
    //   35: putfield u : I
    //   38: aload_0
    //   39: new java/util/ArrayList
    //   42: dup
    //   43: invokespecial <init> : ()V
    //   46: putfield D : Ljava/util/ArrayList;
    //   49: aload_0
    //   50: new com/google/android/material/bottomsheet/BottomSheetBehavior$b
    //   53: dup
    //   54: aload_0
    //   55: invokespecial <init> : (Lcom/google/android/material/bottomsheet/BottomSheetBehavior;)V
    //   58: putfield J : Lb/k/b/e$c;
    //   61: aload_1
    //   62: aload_2
    //   63: getstatic c/c/a/b/k.BottomSheetBehavior_Layout : [I
    //   66: invokevirtual obtainStyledAttributes : (Landroid/util/AttributeSet;[I)Landroid/content/res/TypedArray;
    //   69: astore #6
    //   71: aload_0
    //   72: aload #6
    //   74: getstatic c/c/a/b/k.BottomSheetBehavior_Layout_shapeAppearance : I
    //   77: invokevirtual hasValue : (I)Z
    //   80: putfield g : Z
    //   83: aload #6
    //   85: getstatic c/c/a/b/k.BottomSheetBehavior_Layout_backgroundTint : I
    //   88: invokevirtual hasValue : (I)Z
    //   91: istore #5
    //   93: iload #5
    //   95: ifeq -> 118
    //   98: aload_0
    //   99: aload_1
    //   100: aload_2
    //   101: iload #5
    //   103: aload_1
    //   104: aload #6
    //   106: getstatic c/c/a/b/k.BottomSheetBehavior_Layout_backgroundTint : I
    //   109: invokestatic z : (Landroid/content/Context;Landroid/content/res/TypedArray;I)Landroid/content/res/ColorStateList;
    //   112: invokevirtual E : (Landroid/content/Context;Landroid/util/AttributeSet;ZLandroid/content/res/ColorStateList;)V
    //   115: goto -> 127
    //   118: aload_0
    //   119: aload_1
    //   120: aload_2
    //   121: iload #5
    //   123: aconst_null
    //   124: invokevirtual E : (Landroid/content/Context;Landroid/util/AttributeSet;ZLandroid/content/res/ColorStateList;)V
    //   127: iconst_2
    //   128: newarray float
    //   130: dup
    //   131: iconst_0
    //   132: fconst_0
    //   133: fastore
    //   134: dup
    //   135: iconst_1
    //   136: fconst_1
    //   137: fastore
    //   138: invokestatic ofFloat : ([F)Landroid/animation/ValueAnimator;
    //   141: astore_2
    //   142: aload_0
    //   143: aload_2
    //   144: putfield l : Landroid/animation/ValueAnimator;
    //   147: aload_2
    //   148: ldc2_w 500
    //   151: invokevirtual setDuration : (J)Landroid/animation/ValueAnimator;
    //   154: pop
    //   155: aload_0
    //   156: getfield l : Landroid/animation/ValueAnimator;
    //   159: new c/c/a/b/o/a
    //   162: dup
    //   163: aload_0
    //   164: invokespecial <init> : (Lcom/google/android/material/bottomsheet/BottomSheetBehavior;)V
    //   167: invokevirtual addUpdateListener : (Landroid/animation/ValueAnimator$AnimatorUpdateListener;)V
    //   170: aload_0
    //   171: aload #6
    //   173: getstatic c/c/a/b/k.BottomSheetBehavior_Layout_android_elevation : I
    //   176: ldc -1.0
    //   178: invokevirtual getDimension : (IF)F
    //   181: putfield r : F
    //   184: aload #6
    //   186: getstatic c/c/a/b/k.BottomSheetBehavior_Layout_behavior_peekHeight : I
    //   189: invokevirtual peekValue : (I)Landroid/util/TypedValue;
    //   192: astore_2
    //   193: aload_2
    //   194: ifnull -> 212
    //   197: aload_2
    //   198: getfield data : I
    //   201: istore #4
    //   203: iload #4
    //   205: iconst_m1
    //   206: if_icmpne -> 212
    //   209: goto -> 223
    //   212: aload #6
    //   214: getstatic c/c/a/b/k.BottomSheetBehavior_Layout_behavior_peekHeight : I
    //   217: iconst_m1
    //   218: invokevirtual getDimensionPixelSize : (II)I
    //   221: istore #4
    //   223: aload_0
    //   224: iload #4
    //   226: invokevirtual I : (I)V
    //   229: aload #6
    //   231: getstatic c/c/a/b/k.BottomSheetBehavior_Layout_behavior_hideable : I
    //   234: iconst_0
    //   235: invokevirtual getBoolean : (IZ)Z
    //   238: istore #5
    //   240: aload_0
    //   241: getfield s : Z
    //   244: iload #5
    //   246: if_icmpeq -> 277
    //   249: aload_0
    //   250: iload #5
    //   252: putfield s : Z
    //   255: iload #5
    //   257: ifne -> 273
    //   260: aload_0
    //   261: getfield u : I
    //   264: iconst_5
    //   265: if_icmpne -> 273
    //   268: aload_0
    //   269: iconst_4
    //   270: invokevirtual J : (I)V
    //   273: aload_0
    //   274: invokevirtual P : ()V
    //   277: aload #6
    //   279: getstatic c/c/a/b/k.BottomSheetBehavior_Layout_behavior_fitToContents : I
    //   282: iconst_1
    //   283: invokevirtual getBoolean : (IZ)Z
    //   286: istore #5
    //   288: aload_0
    //   289: getfield b : Z
    //   292: iload #5
    //   294: if_icmpne -> 300
    //   297: goto -> 355
    //   300: aload_0
    //   301: iload #5
    //   303: putfield b : Z
    //   306: aload_0
    //   307: getfield B : Ljava/lang/ref/WeakReference;
    //   310: ifnull -> 317
    //   313: aload_0
    //   314: invokevirtual D : ()V
    //   317: aload_0
    //   318: getfield b : Z
    //   321: ifeq -> 339
    //   324: aload_0
    //   325: getfield u : I
    //   328: bipush #6
    //   330: if_icmpne -> 339
    //   333: iconst_3
    //   334: istore #4
    //   336: goto -> 345
    //   339: aload_0
    //   340: getfield u : I
    //   343: istore #4
    //   345: aload_0
    //   346: iload #4
    //   348: invokevirtual K : (I)V
    //   351: aload_0
    //   352: invokevirtual P : ()V
    //   355: aload_0
    //   356: aload #6
    //   358: getstatic c/c/a/b/k.BottomSheetBehavior_Layout_behavior_skipCollapsed : I
    //   361: iconst_0
    //   362: invokevirtual getBoolean : (IZ)Z
    //   365: putfield t : Z
    //   368: aload_0
    //   369: aload #6
    //   371: getstatic c/c/a/b/k.BottomSheetBehavior_Layout_behavior_saveFlags : I
    //   374: iconst_0
    //   375: invokevirtual getInt : (II)I
    //   378: putfield a : I
    //   381: aload #6
    //   383: getstatic c/c/a/b/k.BottomSheetBehavior_Layout_behavior_halfExpandedRatio : I
    //   386: ldc 0.5
    //   388: invokevirtual getFloat : (IF)F
    //   391: fstore_3
    //   392: fload_3
    //   393: fconst_0
    //   394: fcmpg
    //   395: ifle -> 460
    //   398: fload_3
    //   399: fconst_1
    //   400: fcmpl
    //   401: ifge -> 460
    //   404: aload_0
    //   405: fload_3
    //   406: putfield p : F
    //   409: aload #6
    //   411: getstatic c/c/a/b/k.BottomSheetBehavior_Layout_behavior_expandedOffset : I
    //   414: iconst_0
    //   415: invokevirtual getInt : (II)I
    //   418: istore #4
    //   420: iload #4
    //   422: iflt -> 449
    //   425: aload_0
    //   426: iload #4
    //   428: putfield m : I
    //   431: aload #6
    //   433: invokevirtual recycle : ()V
    //   436: aload_0
    //   437: aload_1
    //   438: invokestatic get : (Landroid/content/Context;)Landroid/view/ViewConfiguration;
    //   441: invokevirtual getScaledMaximumFlingVelocity : ()I
    //   444: i2f
    //   445: putfield c : F
    //   448: return
    //   449: new java/lang/IllegalArgumentException
    //   452: dup
    //   453: ldc_w 'offset must be greater than or equal to 0'
    //   456: invokespecial <init> : (Ljava/lang/String;)V
    //   459: athrow
    //   460: new java/lang/IllegalArgumentException
    //   463: dup
    //   464: ldc_w 'ratio must be a float value between 0 and 1'
    //   467: invokespecial <init> : (Ljava/lang/String;)V
    //   470: athrow
  }
  
  public boolean A(CoordinatorLayout paramCoordinatorLayout, V paramV, MotionEvent paramMotionEvent) {
    if (!paramV.isShown())
      return false; 
    int i = paramMotionEvent.getActionMasked();
    if (this.u == 1 && i == 0)
      return true; 
    b.k.b.e e1 = this.v;
    if (e1 != null)
      e1.n(paramMotionEvent); 
    if (i == 0) {
      this.F = -1;
      VelocityTracker velocityTracker = this.E;
      if (velocityTracker != null) {
        velocityTracker.recycle();
        this.E = null;
      } 
    } 
    if (this.E == null)
      this.E = VelocityTracker.obtain(); 
    this.E.addMovement(paramMotionEvent);
    if (i == 2 && !this.w) {
      float f1 = Math.abs(this.G - paramMotionEvent.getY());
      e1 = this.v;
      if (f1 > e1.b)
        e1.b((View)paramV, paramMotionEvent.getPointerId(paramMotionEvent.getActionIndex())); 
    } 
    return this.w ^ true;
  }
  
  public final void C(V paramV, b.i.m.v.b.a parama, int paramInt) {
    l.T((View)paramV, parama, null, new c(this, paramInt));
  }
  
  public final void D() {
    int i;
    if (this.e) {
      i = Math.max(this.f, this.A - this.z * 9 / 16);
    } else {
      i = this.d;
    } 
    if (this.b) {
      this.q = Math.max(this.A - i, this.n);
    } else {
      this.q = this.A - i;
    } 
  }
  
  public final void E(Context paramContext, AttributeSet paramAttributeSet, boolean paramBoolean, ColorStateList paramColorStateList) {
    if (this.g) {
      this.i = j.b(paramContext, paramAttributeSet, c.c.a.b.b.bottomSheetStyle, K).a();
      g g1 = new g(this.i);
      this.h = g1;
      g1.b.b = new c.c.a.b.v.a(paramContext);
      g1.x();
      if (paramBoolean && paramColorStateList != null) {
        this.h.q(paramColorStateList);
      } else {
        TypedValue typedValue = new TypedValue();
        paramContext.getTheme().resolveAttribute(16842801, typedValue, true);
        this.h.setTint(typedValue.data);
      } 
    } 
  }
  
  public void F(int paramInt) {
    View view = (View)this.B.get();
    if (view != null && !this.D.isEmpty()) {
      float f1;
      float f2;
      int i = this.q;
      if (paramInt > i) {
        f1 = (i - paramInt);
        f2 = (this.A - i);
      } else {
        f1 = (i - paramInt);
        f2 = (i - H());
      } 
      f1 /= f2;
      for (paramInt = 0; paramInt < this.D.size(); paramInt++)
        ((d)this.D.get(paramInt)).a(view, f1); 
    } 
  }
  
  public View G(View paramView) {
    if (l.F(paramView))
      return paramView; 
    if (paramView instanceof ViewGroup) {
      ViewGroup viewGroup = (ViewGroup)paramView;
      byte b = 0;
      int i = viewGroup.getChildCount();
      while (b < i) {
        View view = G(viewGroup.getChildAt(b));
        if (view != null)
          return view; 
        b++;
      } 
    } 
    return null;
  }
  
  public final int H() {
    int i;
    if (this.b) {
      i = this.n;
    } else {
      i = this.m;
    } 
    return i;
  }
  
  public void I(int paramInt) {
    // Byte code:
    //   0: iconst_1
    //   1: istore_2
    //   2: iload_1
    //   3: iconst_m1
    //   4: if_icmpne -> 24
    //   7: aload_0
    //   8: getfield e : Z
    //   11: ifne -> 42
    //   14: aload_0
    //   15: iconst_1
    //   16: putfield e : Z
    //   19: iload_2
    //   20: istore_1
    //   21: goto -> 63
    //   24: aload_0
    //   25: getfield e : Z
    //   28: ifne -> 47
    //   31: aload_0
    //   32: getfield d : I
    //   35: iload_1
    //   36: if_icmpeq -> 42
    //   39: goto -> 47
    //   42: iconst_0
    //   43: istore_1
    //   44: goto -> 63
    //   47: aload_0
    //   48: iconst_0
    //   49: putfield e : Z
    //   52: aload_0
    //   53: iconst_0
    //   54: iload_1
    //   55: invokestatic max : (II)I
    //   58: putfield d : I
    //   61: iload_2
    //   62: istore_1
    //   63: iload_1
    //   64: ifeq -> 105
    //   67: aload_0
    //   68: getfield B : Ljava/lang/ref/WeakReference;
    //   71: ifnull -> 105
    //   74: aload_0
    //   75: invokevirtual D : ()V
    //   78: aload_0
    //   79: getfield u : I
    //   82: iconst_4
    //   83: if_icmpne -> 105
    //   86: aload_0
    //   87: getfield B : Ljava/lang/ref/WeakReference;
    //   90: invokevirtual get : ()Ljava/lang/Object;
    //   93: checkcast android/view/View
    //   96: astore_3
    //   97: aload_3
    //   98: ifnull -> 105
    //   101: aload_3
    //   102: invokevirtual requestLayout : ()V
    //   105: return
  }
  
  public void J(int paramInt) {
    if (paramInt == this.u)
      return; 
    if (this.B == null) {
      if (paramInt == 4 || paramInt == 3 || paramInt == 6 || (this.s && paramInt == 5))
        this.u = paramInt; 
      return;
    } 
    M(paramInt);
  }
  
  public void K(int paramInt) {
    if (this.u == paramInt)
      return; 
    this.u = paramInt;
    WeakReference<V> weakReference = this.B;
    if (weakReference == null)
      return; 
    View view = (View)weakReference.get();
    if (view == null)
      return; 
    byte b = 0;
    if (paramInt == 6 || paramInt == 3) {
      R(true);
    } else if (paramInt == 5 || paramInt == 4) {
      R(false);
    } 
    Q(paramInt);
    while (b < this.D.size()) {
      ((d)this.D.get(b)).b(view, paramInt);
      b++;
    } 
    P();
  }
  
  public void L(View paramView, int paramInt) {
    StringBuilder stringBuilder;
    int i;
    if (paramInt == 4) {
      i = this.q;
    } else if (paramInt == 6) {
      i = this.o;
      if (this.b) {
        int k = this.n;
        if (i <= k) {
          i = k;
          paramInt = 3;
        } 
      } 
    } else if (paramInt == 3) {
      i = H();
    } else if (this.s && paramInt == 5) {
      i = this.A;
    } else {
      stringBuilder = new StringBuilder();
      stringBuilder.append("Illegal state argument: ");
      stringBuilder.append(paramInt);
      throw new IllegalArgumentException(stringBuilder.toString());
    } 
    O((View)stringBuilder, paramInt, i, false);
  }
  
  public final void M(int paramInt) {
    View view = (View)this.B.get();
    if (view == null)
      return; 
    ViewParent viewParent = view.getParent();
    if (viewParent != null && viewParent.isLayoutRequested() && l.D(view)) {
      view.post(new a(this, view, paramInt));
    } else {
      L(view, paramInt);
    } 
  }
  
  public boolean N(View paramView, float paramFloat) {
    boolean bool1 = this.t;
    boolean bool = true;
    if (bool1)
      return true; 
    if (paramView.getTop() < this.q)
      return false; 
    if (Math.abs(paramFloat * 0.1F + paramView.getTop() - this.q) / this.d <= 0.5F)
      bool = false; 
    return bool;
  }
  
  public void O(View paramView, int paramInt1, int paramInt2, boolean paramBoolean) {
    if (paramBoolean) {
      paramBoolean = this.v.t(paramView.getLeft(), paramInt2);
    } else {
      b.k.b.e e1 = this.v;
      int i = paramView.getLeft();
      e1.r = paramView;
      e1.c = -1;
      boolean bool = e1.l(i, paramInt2, 0, 0);
      paramBoolean = bool;
      if (!bool) {
        paramBoolean = bool;
        if (e1.a == 0) {
          paramBoolean = bool;
          if (e1.r != null) {
            e1.r = null;
            paramBoolean = bool;
          } 
        } 
      } 
    } 
    if (paramBoolean) {
      K(2);
      Q(paramInt1);
      if (this.k == null)
        this.k = new f(this, paramView, paramInt1); 
      f f1 = this.k;
      paramBoolean = f1.c;
      f1.d = paramInt1;
      if (!paramBoolean) {
        l.P(paramView, f1);
        this.k.c = true;
      } 
    } else {
      K(paramInt1);
    } 
  }
  
  public final void P() {
    WeakReference<V> weakReference = this.B;
    if (weakReference == null)
      return; 
    View view = (View)weakReference.get();
    if (view == null)
      return; 
    l.R(view, 524288);
    l.R(view, 262144);
    l.R(view, 1048576);
    if (this.s && this.u != 5)
      C((V)view, b.i.m.v.b.a.j, 5); 
    int i = this.u;
    byte b = 6;
    if (i != 3) {
      if (i != 4) {
        if (i == 6) {
          C((V)view, b.i.m.v.b.a.i, 4);
          C((V)view, b.i.m.v.b.a.h, 3);
        } 
      } else {
        if (this.b)
          b = 3; 
        b.i.m.v.b.a a = b.i.m.v.b.a.h;
        C((V)view, a, b);
      } 
    } else {
      if (this.b)
        b = 4; 
      b.i.m.v.b.a a = b.i.m.v.b.a.i;
      C((V)view, a, b);
    } 
  }
  
  public final void Q(int paramInt) {
    boolean bool;
    if (paramInt == 2)
      return; 
    if (paramInt == 3) {
      bool = true;
    } else {
      bool = false;
    } 
    if (this.j != bool) {
      this.j = bool;
      if (this.h != null) {
        ValueAnimator valueAnimator = this.l;
        if (valueAnimator != null)
          if (valueAnimator.isRunning()) {
            this.l.reverse();
          } else {
            float f1;
            if (bool) {
              f1 = 0.0F;
            } else {
              f1 = 1.0F;
            } 
            this.l.setFloatValues(new float[] { 1.0F - f1, f1 });
            this.l.start();
          }  
      } 
    } 
  }
  
  public final void R(boolean paramBoolean) {
    WeakReference<V> weakReference = this.B;
    if (weakReference == null)
      return; 
    ViewParent viewParent = ((View)weakReference.get()).getParent();
    if (!(viewParent instanceof CoordinatorLayout))
      return; 
    CoordinatorLayout coordinatorLayout = (CoordinatorLayout)viewParent;
    int i = coordinatorLayout.getChildCount();
    if (paramBoolean)
      if (this.I == null) {
        this.I = new HashMap<View, Integer>(i);
      } else {
        return;
      }  
    for (byte b = 0; b < i; b++) {
      byte b1;
      View view = coordinatorLayout.getChildAt(b);
      if (view == this.B.get())
        continue; 
      Map<View, Integer> map = this.I;
      if (!paramBoolean) {
        if (map != null && map.containsKey(view)) {
          b1 = ((Integer)this.I.get(view)).intValue();
        } else {
          continue;
        } 
      } else {
        map.put(view, Integer.valueOf(view.getImportantForAccessibility()));
        b1 = 4;
      } 
      l.d0(view, b1);
      continue;
    } 
    if (!paramBoolean)
      this.I = null; 
  }
  
  public void f(CoordinatorLayout.f paramf) {
    this.B = null;
    this.v = null;
  }
  
  public void i() {
    this.B = null;
    this.v = null;
  }
  
  public boolean j(CoordinatorLayout paramCoordinatorLayout, V paramV, MotionEvent paramMotionEvent) {
    View view;
    boolean bool = paramV.isShown();
    boolean bool1 = false;
    if (!bool) {
      this.w = true;
      return false;
    } 
    int i = paramMotionEvent.getActionMasked();
    V v = null;
    if (i == 0) {
      this.F = -1;
      VelocityTracker velocityTracker = this.E;
      if (velocityTracker != null) {
        velocityTracker.recycle();
        this.E = null;
      } 
    } 
    if (this.E == null)
      this.E = VelocityTracker.obtain(); 
    this.E.addMovement(paramMotionEvent);
    if (i != 0) {
      if (i == 1 || i == 3) {
        this.H = false;
        this.F = -1;
        if (this.w) {
          this.w = false;
          return false;
        } 
      } 
    } else {
      int k = (int)paramMotionEvent.getX();
      this.G = (int)paramMotionEvent.getY();
      if (this.u != 2) {
        WeakReference<View> weakReference1 = this.C;
        if (weakReference1 != null) {
          View view1 = weakReference1.get();
        } else {
          weakReference1 = null;
        } 
        if (weakReference1 != null && paramCoordinatorLayout.j((View)weakReference1, k, this.G)) {
          this.F = paramMotionEvent.getPointerId(paramMotionEvent.getActionIndex());
          this.H = true;
        } 
      } 
      if (this.F == -1 && !paramCoordinatorLayout.j((View)paramV, k, this.G)) {
        bool = true;
      } else {
        bool = false;
      } 
      this.w = bool;
    } 
    if (!this.w) {
      b.k.b.e e1 = this.v;
      if (e1 != null && e1.u(paramMotionEvent))
        return true; 
    } 
    WeakReference<View> weakReference = this.C;
    paramV = v;
    if (weakReference != null)
      view = weakReference.get(); 
    bool = bool1;
    if (i == 2) {
      bool = bool1;
      if (view != null) {
        bool = bool1;
        if (!this.w) {
          bool = bool1;
          if (this.u != 1) {
            bool = bool1;
            if (!paramCoordinatorLayout.j(view, (int)paramMotionEvent.getX(), (int)paramMotionEvent.getY())) {
              bool = bool1;
              if (this.v != null) {
                bool = bool1;
                if (Math.abs(this.G - paramMotionEvent.getY()) > this.v.b)
                  bool = true; 
              } 
            } 
          } 
        } 
      } 
    } 
    return bool;
  }
  
  public boolean k(CoordinatorLayout paramCoordinatorLayout, V paramV, int paramInt) {
    if (l.o((View)paramCoordinatorLayout) && !paramV.getFitsSystemWindows())
      paramV.setFitsSystemWindows(true); 
    if (this.B == null) {
      this.f = paramCoordinatorLayout.getResources().getDimensionPixelSize(c.c.a.b.d.design_bottom_sheet_peek_height_min);
      this.B = new WeakReference<V>(paramV);
      if (this.g) {
        g g2 = this.h;
        if (g2 != null)
          paramV.setBackground((Drawable)g2); 
      } 
      g g1 = this.h;
      if (g1 != null) {
        boolean bool;
        float f3 = this.r;
        float f2 = f3;
        if (f3 == -1.0F)
          f2 = paramV.getElevation(); 
        g1.p(f2);
        if (this.u == 3) {
          bool = true;
        } else {
          bool = false;
        } 
        this.j = bool;
        g1 = this.h;
        if (bool) {
          f2 = 0.0F;
        } else {
          f2 = 1.0F;
        } 
        g1.r(f2);
      } 
      P();
      if (paramV.getImportantForAccessibility() == 0)
        paramV.setImportantForAccessibility(1); 
    } 
    if (this.v == null) {
      b.k.b.e.c c1 = this.J;
      this.v = new b.k.b.e(paramCoordinatorLayout.getContext(), (ViewGroup)paramCoordinatorLayout, c1);
    } 
    int i = paramV.getTop();
    paramCoordinatorLayout.q((View)paramV, paramInt);
    this.z = paramCoordinatorLayout.getWidth();
    paramInt = paramCoordinatorLayout.getHeight();
    this.A = paramInt;
    this.n = Math.max(0, paramInt - paramV.getHeight());
    float f1 = this.A;
    this.o = (int)((1.0F - this.p) * f1);
    D();
    paramInt = this.u;
    if (paramInt == 3) {
      paramInt = H();
    } else if (paramInt == 6) {
      paramInt = this.o;
    } else if (this.s && paramInt == 5) {
      paramInt = this.A;
    } else {
      paramInt = this.u;
      if (paramInt == 4) {
        paramInt = this.q;
      } else {
        if (paramInt == 1 || paramInt == 2)
          l.K((View)paramV, i - paramV.getTop()); 
        this.C = new WeakReference<View>(G((View)paramV));
        return true;
      } 
    } 
    l.K((View)paramV, paramInt);
    this.C = new WeakReference<View>(G((View)paramV));
    return true;
  }
  
  public boolean n(CoordinatorLayout paramCoordinatorLayout, V paramV, View paramView, float paramFloat1, float paramFloat2) {
    WeakReference<View> weakReference = this.C;
    boolean bool2 = false;
    boolean bool1 = bool2;
    if (weakReference != null) {
      bool1 = bool2;
      if (paramView == weakReference.get())
        if (this.u == 3) {
          bool1 = bool2;
        } else {
          bool1 = true;
        }  
    } 
    return bool1;
  }
  
  public void p(CoordinatorLayout paramCoordinatorLayout, V paramV, View paramView, int paramInt1, int paramInt2, int[] paramArrayOfint, int paramInt3) {
    // Byte code:
    //   0: iload #7
    //   2: iconst_1
    //   3: if_icmpne -> 7
    //   6: return
    //   7: aload_0
    //   8: getfield C : Ljava/lang/ref/WeakReference;
    //   11: astore_1
    //   12: aload_1
    //   13: ifnull -> 27
    //   16: aload_1
    //   17: invokevirtual get : ()Ljava/lang/Object;
    //   20: checkcast android/view/View
    //   23: astore_1
    //   24: goto -> 29
    //   27: aconst_null
    //   28: astore_1
    //   29: aload_3
    //   30: aload_1
    //   31: if_acmpeq -> 35
    //   34: return
    //   35: aload_2
    //   36: invokevirtual getTop : ()I
    //   39: istore #8
    //   41: iload #8
    //   43: iload #5
    //   45: isub
    //   46: istore #4
    //   48: iload #5
    //   50: ifle -> 97
    //   53: iload #4
    //   55: aload_0
    //   56: invokevirtual H : ()I
    //   59: if_icmpge -> 88
    //   62: aload #6
    //   64: iconst_1
    //   65: iload #8
    //   67: aload_0
    //   68: invokevirtual H : ()I
    //   71: isub
    //   72: iastore
    //   73: aload_2
    //   74: aload #6
    //   76: iconst_1
    //   77: iaload
    //   78: ineg
    //   79: invokestatic K : (Landroid/view/View;I)V
    //   82: iconst_3
    //   83: istore #4
    //   85: goto -> 154
    //   88: aload #6
    //   90: iconst_1
    //   91: iload #5
    //   93: iastore
    //   94: goto -> 169
    //   97: iload #5
    //   99: ifge -> 181
    //   102: aload_3
    //   103: iconst_m1
    //   104: invokevirtual canScrollVertically : (I)Z
    //   107: ifne -> 181
    //   110: aload_0
    //   111: getfield q : I
    //   114: istore #7
    //   116: iload #4
    //   118: iload #7
    //   120: if_icmple -> 163
    //   123: aload_0
    //   124: getfield s : Z
    //   127: ifeq -> 133
    //   130: goto -> 163
    //   133: aload #6
    //   135: iconst_1
    //   136: iload #8
    //   138: iload #7
    //   140: isub
    //   141: iastore
    //   142: aload_2
    //   143: aload #6
    //   145: iconst_1
    //   146: iaload
    //   147: ineg
    //   148: invokestatic K : (Landroid/view/View;I)V
    //   151: iconst_4
    //   152: istore #4
    //   154: aload_0
    //   155: iload #4
    //   157: invokevirtual K : (I)V
    //   160: goto -> 181
    //   163: aload #6
    //   165: iconst_1
    //   166: iload #5
    //   168: iastore
    //   169: aload_2
    //   170: iload #5
    //   172: ineg
    //   173: invokestatic K : (Landroid/view/View;I)V
    //   176: aload_0
    //   177: iconst_1
    //   178: invokevirtual K : (I)V
    //   181: aload_0
    //   182: aload_2
    //   183: invokevirtual getTop : ()I
    //   186: invokevirtual F : (I)V
    //   189: aload_0
    //   190: iload #5
    //   192: putfield x : I
    //   195: aload_0
    //   196: iconst_1
    //   197: putfield y : Z
    //   200: return
  }
  
  public void r(CoordinatorLayout paramCoordinatorLayout, V paramV, View paramView, int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5, int[] paramArrayOfint) {}
  
  public void u(CoordinatorLayout paramCoordinatorLayout, V paramV, Parcelable paramParcelable) {
    e e1 = (e)paramParcelable;
    int i = this.a;
    if (i != 0) {
      if (i == -1 || (i & 0x1) == 1)
        this.d = e1.e; 
      i = this.a;
      if (i == -1 || (i & 0x2) == 2)
        this.b = e1.f; 
      i = this.a;
      if (i == -1 || (i & 0x4) == 4)
        this.s = e1.g; 
      i = this.a;
      if (i == -1 || (i & 0x8) == 8)
        this.t = e1.h; 
    } 
    i = e1.d;
    if (i == 1 || i == 2) {
      this.u = 4;
      return;
    } 
    this.u = i;
  }
  
  public Parcelable v(CoordinatorLayout paramCoordinatorLayout, V paramV) {
    return (Parcelable)new e((Parcelable)View.BaseSavedState.EMPTY_STATE, this);
  }
  
  public boolean x(CoordinatorLayout paramCoordinatorLayout, V paramV, View paramView1, View paramView2, int paramInt1, int paramInt2) {
    boolean bool = false;
    this.x = 0;
    this.y = false;
    if ((paramInt1 & 0x2) != 0)
      bool = true; 
    return bool;
  }
  
  public void z(CoordinatorLayout paramCoordinatorLayout, V paramV, View paramView, int paramInt) {
    // Byte code:
    //   0: aload_2
    //   1: invokevirtual getTop : ()I
    //   4: istore #7
    //   6: aload_0
    //   7: invokevirtual H : ()I
    //   10: istore #4
    //   12: iconst_3
    //   13: istore #6
    //   15: iload #7
    //   17: iload #4
    //   19: if_icmpne -> 28
    //   22: aload_0
    //   23: iconst_3
    //   24: invokevirtual K : (I)V
    //   27: return
    //   28: aload_0
    //   29: getfield C : Ljava/lang/ref/WeakReference;
    //   32: astore_1
    //   33: aload_1
    //   34: ifnull -> 328
    //   37: aload_3
    //   38: aload_1
    //   39: invokevirtual get : ()Ljava/lang/Object;
    //   42: if_acmpne -> 328
    //   45: aload_0
    //   46: getfield y : Z
    //   49: ifne -> 55
    //   52: goto -> 328
    //   55: aload_0
    //   56: getfield x : I
    //   59: ifle -> 71
    //   62: aload_0
    //   63: invokevirtual H : ()I
    //   66: istore #4
    //   68: goto -> 313
    //   71: aload_0
    //   72: getfield s : Z
    //   75: ifeq -> 139
    //   78: aload_0
    //   79: getfield E : Landroid/view/VelocityTracker;
    //   82: astore_1
    //   83: aload_1
    //   84: ifnonnull -> 93
    //   87: fconst_0
    //   88: fstore #5
    //   90: goto -> 117
    //   93: aload_1
    //   94: sipush #1000
    //   97: aload_0
    //   98: getfield c : F
    //   101: invokevirtual computeCurrentVelocity : (IF)V
    //   104: aload_0
    //   105: getfield E : Landroid/view/VelocityTracker;
    //   108: aload_0
    //   109: getfield F : I
    //   112: invokevirtual getYVelocity : (I)F
    //   115: fstore #5
    //   117: aload_0
    //   118: aload_2
    //   119: fload #5
    //   121: invokevirtual N : (Landroid/view/View;F)Z
    //   124: ifeq -> 139
    //   127: aload_0
    //   128: getfield A : I
    //   131: istore #4
    //   133: iconst_5
    //   134: istore #6
    //   136: goto -> 313
    //   139: aload_0
    //   140: getfield x : I
    //   143: ifne -> 252
    //   146: aload_2
    //   147: invokevirtual getTop : ()I
    //   150: istore #7
    //   152: aload_0
    //   153: getfield b : Z
    //   156: ifeq -> 191
    //   159: iload #7
    //   161: aload_0
    //   162: getfield n : I
    //   165: isub
    //   166: invokestatic abs : (I)I
    //   169: iload #7
    //   171: aload_0
    //   172: getfield q : I
    //   175: isub
    //   176: invokestatic abs : (I)I
    //   179: if_icmpge -> 304
    //   182: aload_0
    //   183: getfield n : I
    //   186: istore #4
    //   188: goto -> 313
    //   191: aload_0
    //   192: getfield o : I
    //   195: istore #4
    //   197: iload #7
    //   199: iload #4
    //   201: if_icmpge -> 228
    //   204: iload #7
    //   206: iload #7
    //   208: aload_0
    //   209: getfield q : I
    //   212: isub
    //   213: invokestatic abs : (I)I
    //   216: if_icmpge -> 291
    //   219: aload_0
    //   220: getfield m : I
    //   223: istore #4
    //   225: goto -> 313
    //   228: iload #7
    //   230: iload #4
    //   232: isub
    //   233: invokestatic abs : (I)I
    //   236: iload #7
    //   238: aload_0
    //   239: getfield q : I
    //   242: isub
    //   243: invokestatic abs : (I)I
    //   246: if_icmpge -> 304
    //   249: goto -> 291
    //   252: aload_0
    //   253: getfield b : Z
    //   256: ifeq -> 262
    //   259: goto -> 304
    //   262: aload_2
    //   263: invokevirtual getTop : ()I
    //   266: istore #4
    //   268: iload #4
    //   270: aload_0
    //   271: getfield o : I
    //   274: isub
    //   275: invokestatic abs : (I)I
    //   278: iload #4
    //   280: aload_0
    //   281: getfield q : I
    //   284: isub
    //   285: invokestatic abs : (I)I
    //   288: if_icmpge -> 304
    //   291: aload_0
    //   292: getfield o : I
    //   295: istore #4
    //   297: bipush #6
    //   299: istore #6
    //   301: goto -> 313
    //   304: aload_0
    //   305: getfield q : I
    //   308: istore #4
    //   310: iconst_4
    //   311: istore #6
    //   313: aload_0
    //   314: aload_2
    //   315: iload #6
    //   317: iload #4
    //   319: iconst_0
    //   320: invokevirtual O : (Landroid/view/View;IIZ)V
    //   323: aload_0
    //   324: iconst_0
    //   325: putfield y : Z
    //   328: return
  }
  
  public class a implements Runnable {
    public final View b;
    
    public final int c;
    
    public final BottomSheetBehavior d;
    
    public a(BottomSheetBehavior this$0, View param1View, int param1Int) {}
    
    public void run() {
      this.d.L(this.b, this.c);
    }
  }
  
  public class b extends b.k.b.e.c {
    public final BottomSheetBehavior a;
    
    public b(BottomSheetBehavior this$0) {}
    
    public int a(View param1View, int param1Int1, int param1Int2) {
      return param1View.getLeft();
    }
    
    public int b(View param1View, int param1Int1, int param1Int2) {
      int i = BottomSheetBehavior.B(this.a);
      BottomSheetBehavior bottomSheetBehavior = this.a;
      if (bottomSheetBehavior.s) {
        param1Int2 = bottomSheetBehavior.A;
      } else {
        param1Int2 = bottomSheetBehavior.q;
      } 
      return a.a.a.a.a.j(param1Int1, i, param1Int2);
    }
    
    public int d(View param1View) {
      BottomSheetBehavior bottomSheetBehavior = this.a;
      return bottomSheetBehavior.s ? bottomSheetBehavior.A : bottomSheetBehavior.q;
    }
    
    public void f(int param1Int) {
      if (param1Int == 1)
        this.a.K(1); 
    }
    
    public void g(View param1View, int param1Int1, int param1Int2, int param1Int3, int param1Int4) {
      this.a.F(param1Int2);
    }
    
    public void h(View param1View, float param1Float1, float param1Float2) {
      // Byte code:
      //   0: iconst_4
      //   1: istore #4
      //   3: fload_3
      //   4: fconst_0
      //   5: fcmpg
      //   6: ifge -> 75
      //   9: aload_0
      //   10: getfield a : Lcom/google/android/material/bottomsheet/BottomSheetBehavior;
      //   13: astore #7
      //   15: aload #7
      //   17: getfield b : Z
      //   20: ifeq -> 36
      //   23: aload #7
      //   25: getfield n : I
      //   28: istore #5
      //   30: iconst_3
      //   31: istore #4
      //   33: goto -> 370
      //   36: aload_1
      //   37: invokevirtual getTop : ()I
      //   40: istore #4
      //   42: aload_0
      //   43: getfield a : Lcom/google/android/material/bottomsheet/BottomSheetBehavior;
      //   46: astore #7
      //   48: aload #7
      //   50: getfield o : I
      //   53: istore #5
      //   55: iload #4
      //   57: iload #5
      //   59: if_icmple -> 65
      //   62: goto -> 229
      //   65: aload #7
      //   67: getfield m : I
      //   70: istore #5
      //   72: goto -> 30
      //   75: aload_0
      //   76: getfield a : Lcom/google/android/material/bottomsheet/BottomSheetBehavior;
      //   79: astore #7
      //   81: aload #7
      //   83: getfield s : Z
      //   86: ifeq -> 140
      //   89: aload #7
      //   91: aload_1
      //   92: fload_3
      //   93: invokevirtual N : (Landroid/view/View;F)Z
      //   96: ifeq -> 140
      //   99: aload_1
      //   100: invokevirtual getTop : ()I
      //   103: aload_0
      //   104: getfield a : Lcom/google/android/material/bottomsheet/BottomSheetBehavior;
      //   107: getfield q : I
      //   110: if_icmpgt -> 125
      //   113: fload_2
      //   114: invokestatic abs : (F)F
      //   117: fload_3
      //   118: invokestatic abs : (F)F
      //   121: fcmpg
      //   122: ifge -> 140
      //   125: aload_0
      //   126: getfield a : Lcom/google/android/material/bottomsheet/BottomSheetBehavior;
      //   129: getfield A : I
      //   132: istore #5
      //   134: iconst_5
      //   135: istore #4
      //   137: goto -> 370
      //   140: fload_3
      //   141: fconst_0
      //   142: fcmpl
      //   143: ifeq -> 245
      //   146: fload_2
      //   147: invokestatic abs : (F)F
      //   150: fload_3
      //   151: invokestatic abs : (F)F
      //   154: fcmpl
      //   155: ifle -> 161
      //   158: goto -> 245
      //   161: aload_0
      //   162: getfield a : Lcom/google/android/material/bottomsheet/BottomSheetBehavior;
      //   165: astore #7
      //   167: aload #7
      //   169: getfield b : Z
      //   172: ifeq -> 185
      //   175: aload #7
      //   177: getfield q : I
      //   180: istore #5
      //   182: goto -> 370
      //   185: aload_1
      //   186: invokevirtual getTop : ()I
      //   189: istore #5
      //   191: iload #5
      //   193: aload_0
      //   194: getfield a : Lcom/google/android/material/bottomsheet/BottomSheetBehavior;
      //   197: getfield o : I
      //   200: isub
      //   201: invokestatic abs : (I)I
      //   204: iload #5
      //   206: aload_0
      //   207: getfield a : Lcom/google/android/material/bottomsheet/BottomSheetBehavior;
      //   210: getfield q : I
      //   213: isub
      //   214: invokestatic abs : (I)I
      //   217: if_icmpge -> 236
      //   220: aload_0
      //   221: getfield a : Lcom/google/android/material/bottomsheet/BottomSheetBehavior;
      //   224: getfield o : I
      //   227: istore #5
      //   229: bipush #6
      //   231: istore #4
      //   233: goto -> 370
      //   236: aload_0
      //   237: getfield a : Lcom/google/android/material/bottomsheet/BottomSheetBehavior;
      //   240: astore #7
      //   242: goto -> 175
      //   245: aload_1
      //   246: invokevirtual getTop : ()I
      //   249: istore #5
      //   251: aload_0
      //   252: getfield a : Lcom/google/android/material/bottomsheet/BottomSheetBehavior;
      //   255: astore #7
      //   257: aload #7
      //   259: getfield b : Z
      //   262: ifeq -> 301
      //   265: iload #5
      //   267: aload #7
      //   269: getfield n : I
      //   272: isub
      //   273: invokestatic abs : (I)I
      //   276: iload #5
      //   278: aload_0
      //   279: getfield a : Lcom/google/android/material/bottomsheet/BottomSheetBehavior;
      //   282: getfield q : I
      //   285: isub
      //   286: invokestatic abs : (I)I
      //   289: if_icmpge -> 236
      //   292: aload_0
      //   293: getfield a : Lcom/google/android/material/bottomsheet/BottomSheetBehavior;
      //   296: astore #7
      //   298: goto -> 23
      //   301: aload #7
      //   303: getfield o : I
      //   306: istore #6
      //   308: iload #5
      //   310: iload #6
      //   312: if_icmpge -> 343
      //   315: iload #5
      //   317: iload #5
      //   319: aload #7
      //   321: getfield q : I
      //   324: isub
      //   325: invokestatic abs : (I)I
      //   328: if_icmpge -> 220
      //   331: aload_0
      //   332: getfield a : Lcom/google/android/material/bottomsheet/BottomSheetBehavior;
      //   335: getfield m : I
      //   338: istore #5
      //   340: goto -> 30
      //   343: iload #5
      //   345: iload #6
      //   347: isub
      //   348: invokestatic abs : (I)I
      //   351: iload #5
      //   353: aload_0
      //   354: getfield a : Lcom/google/android/material/bottomsheet/BottomSheetBehavior;
      //   357: getfield q : I
      //   360: isub
      //   361: invokestatic abs : (I)I
      //   364: if_icmpge -> 236
      //   367: goto -> 220
      //   370: aload_0
      //   371: getfield a : Lcom/google/android/material/bottomsheet/BottomSheetBehavior;
      //   374: aload_1
      //   375: iload #4
      //   377: iload #5
      //   379: iconst_1
      //   380: invokevirtual O : (Landroid/view/View;IIZ)V
      //   383: return
    }
    
    public boolean i(View param1View, int param1Int) {
      BottomSheetBehavior bottomSheetBehavior = this.a;
      int i = bottomSheetBehavior.u;
      boolean bool2 = false;
      if (i == 1)
        return false; 
      if (bottomSheetBehavior.H)
        return false; 
      if (i == 3 && bottomSheetBehavior.F == param1Int) {
        WeakReference<View> weakReference1 = bottomSheetBehavior.C;
        if (weakReference1 != null) {
          View view = weakReference1.get();
        } else {
          weakReference1 = null;
        } 
        if (weakReference1 != null && weakReference1.canScrollVertically(-1))
          return false; 
      } 
      WeakReference<View> weakReference = this.a.B;
      boolean bool1 = bool2;
      if (weakReference != null) {
        bool1 = bool2;
        if (weakReference.get() == param1View)
          bool1 = true; 
      } 
      return bool1;
    }
  }
  
  public class c implements b.i.m.v.d {
    public final int a;
    
    public final BottomSheetBehavior b;
    
    public c(BottomSheetBehavior this$0, int param1Int) {}
  }
  
  public static abstract class d {
    public abstract void a(View param1View, float param1Float);
    
    public abstract void b(View param1View, int param1Int);
  }
  
  public static class e extends b.k.a.a {
    public static final Parcelable.Creator<e> CREATOR = (Parcelable.Creator<e>)new a();
    
    public final int d;
    
    public int e;
    
    public boolean f;
    
    public boolean g;
    
    public boolean h;
    
    public e(Parcel param1Parcel, ClassLoader param1ClassLoader) {
      super(param1Parcel, param1ClassLoader);
      this.d = param1Parcel.readInt();
      this.e = param1Parcel.readInt();
      int i = param1Parcel.readInt();
      boolean bool2 = false;
      if (i == 1) {
        bool1 = true;
      } else {
        bool1 = false;
      } 
      this.f = bool1;
      if (param1Parcel.readInt() == 1) {
        bool1 = true;
      } else {
        bool1 = false;
      } 
      this.g = bool1;
      boolean bool1 = bool2;
      if (param1Parcel.readInt() == 1)
        bool1 = true; 
      this.h = bool1;
    }
    
    public e(Parcelable param1Parcelable, BottomSheetBehavior<?> param1BottomSheetBehavior) {
      super(param1Parcelable);
      this.d = param1BottomSheetBehavior.u;
      this.e = param1BottomSheetBehavior.d;
      this.f = param1BottomSheetBehavior.b;
      this.g = param1BottomSheetBehavior.s;
      this.h = param1BottomSheetBehavior.t;
    }
    
    public void writeToParcel(Parcel param1Parcel, int param1Int) {
      param1Parcel.writeParcelable(this.b, param1Int);
      param1Parcel.writeInt(this.d);
      param1Parcel.writeInt(this.e);
      param1Parcel.writeInt(this.f);
      param1Parcel.writeInt(this.g);
      param1Parcel.writeInt(this.h);
    }
    
    public static final class a implements Parcelable.ClassLoaderCreator<e> {
      public Object createFromParcel(Parcel param2Parcel) {
        return new BottomSheetBehavior.e(param2Parcel, null);
      }
      
      public Object createFromParcel(Parcel param2Parcel, ClassLoader param2ClassLoader) {
        return new BottomSheetBehavior.e(param2Parcel, param2ClassLoader);
      }
      
      public Object[] newArray(int param2Int) {
        return (Object[])new BottomSheetBehavior.e[param2Int];
      }
    }
  }
  
  public static final class a implements Parcelable.ClassLoaderCreator<e> {
    public Object createFromParcel(Parcel param1Parcel) {
      return new BottomSheetBehavior.e(param1Parcel, null);
    }
    
    public Object createFromParcel(Parcel param1Parcel, ClassLoader param1ClassLoader) {
      return new BottomSheetBehavior.e(param1Parcel, param1ClassLoader);
    }
    
    public Object[] newArray(int param1Int) {
      return (Object[])new BottomSheetBehavior.e[param1Int];
    }
  }
  
  public class f implements Runnable {
    public final View b;
    
    public boolean c;
    
    public int d;
    
    public final BottomSheetBehavior e;
    
    public f(BottomSheetBehavior this$0, View param1View, int param1Int) {
      this.b = param1View;
      this.d = param1Int;
    }
    
    public void run() {
      b.k.b.e e = this.e.v;
      if (e != null && e.i(true)) {
        l.P(this.b, this);
      } else {
        this.e.K(this.d);
      } 
      this.c = false;
    }
  }
}


/* Location:              C:\Users\panch\Downloads\dvba_v1.1.0-dex2jar.jar!\com\google\android\material\bottomsheet\BottomSheetBehavior.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */