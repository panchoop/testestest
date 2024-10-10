package b.l.a;

import android.animation.Animator;
import android.content.Context;
import android.content.res.Configuration;
import android.content.res.TypedArray;
import android.os.Bundle;
import android.os.Looper;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseArray;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AlphaAnimation;
import android.view.animation.Animation;
import android.view.animation.AnimationSet;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.Interpolator;
import android.view.animation.ScaleAnimation;
import android.view.animation.Transformation;
import androidx.activity.OnBackPressedDispatcher;
import androidx.fragment.app.Fragment;
import b.n.p;
import b.n.q;
import b.n.r;
import b.n.s;
import b.n.t;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.io.Writer;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

public final class k extends j implements LayoutInflater.Factory2 {
  public static boolean H = false;
  
  public static final Interpolator I = (Interpolator)new DecelerateInterpolator(2.5F);
  
  public static final Interpolator J = (Interpolator)new DecelerateInterpolator(1.5F);
  
  public ArrayList<Boolean> A;
  
  public ArrayList<Fragment> B;
  
  public Bundle C = null;
  
  public SparseArray<Parcelable> D = null;
  
  public ArrayList<j> E;
  
  public p F;
  
  public Runnable G = new b(this);
  
  public ArrayList<h> d;
  
  public boolean e;
  
  public int f = 0;
  
  public final ArrayList<Fragment> g = new ArrayList<Fragment>();
  
  public final HashMap<String, Fragment> h = new HashMap<String, Fragment>();
  
  public ArrayList<a> i;
  
  public ArrayList<Fragment> j;
  
  public OnBackPressedDispatcher k;
  
  public final b.a.b l = new a(this, false);
  
  public ArrayList<a> m;
  
  public ArrayList<Integer> n;
  
  public final CopyOnWriteArrayList<f> o = new CopyOnWriteArrayList<f>();
  
  public int p = 0;
  
  public i q;
  
  public f r;
  
  public Fragment s;
  
  public Fragment t;
  
  public boolean u;
  
  public boolean v;
  
  public boolean w;
  
  public boolean x;
  
  public boolean y;
  
  public ArrayList<a> z;
  
  public static d a0(float paramFloat1, float paramFloat2, float paramFloat3, float paramFloat4) {
    AnimationSet animationSet = new AnimationSet(false);
    ScaleAnimation scaleAnimation = new ScaleAnimation(paramFloat1, paramFloat2, paramFloat1, paramFloat2, 1, 0.5F, 1, 0.5F);
    scaleAnimation.setInterpolator(I);
    scaleAnimation.setDuration(220L);
    animationSet.addAnimation((Animation)scaleAnimation);
    AlphaAnimation alphaAnimation = new AlphaAnimation(paramFloat3, paramFloat4);
    alphaAnimation.setInterpolator(J);
    alphaAnimation.setDuration(220L);
    animationSet.addAnimation((Animation)alphaAnimation);
    return new d((Animation)animationSet);
  }
  
  public static int k0(int paramInt) {
    char c = ' ';
    if (paramInt != 4097)
      if (paramInt != 4099) {
        if (paramInt != 8194) {
          c = Character.MIN_VALUE;
        } else {
          c = 'ခ';
        } 
      } else {
        c = 'ဃ';
      }  
    return c;
  }
  
  public void A(Fragment paramFragment, Bundle paramBundle, boolean paramBoolean) {
    Fragment fragment = this.s;
    if (fragment != null) {
      k k1 = fragment.s;
      if (k1 instanceof k)
        k1.A(paramFragment, paramBundle, true); 
    } 
    for (f f1 : this.o) {
      if (paramBoolean && !f1.a)
        continue; 
      throw null;
    } 
  }
  
  public void B(Fragment paramFragment, boolean paramBoolean) {
    Fragment fragment = this.s;
    if (fragment != null) {
      k k1 = fragment.s;
      if (k1 instanceof k)
        k1.B(paramFragment, true); 
    } 
    for (f f1 : this.o) {
      if (paramBoolean && !f1.a)
        continue; 
      throw null;
    } 
  }
  
  public void C(Fragment paramFragment, Bundle paramBundle, boolean paramBoolean) {
    Fragment fragment = this.s;
    if (fragment != null) {
      k k1 = fragment.s;
      if (k1 instanceof k)
        k1.C(paramFragment, paramBundle, true); 
    } 
    for (f f1 : this.o) {
      if (paramBoolean && !f1.a)
        continue; 
      throw null;
    } 
  }
  
  public void D(Fragment paramFragment, boolean paramBoolean) {
    Fragment fragment = this.s;
    if (fragment != null) {
      k k1 = fragment.s;
      if (k1 instanceof k)
        k1.D(paramFragment, true); 
    } 
    for (f f1 : this.o) {
      if (paramBoolean && !f1.a)
        continue; 
      throw null;
    } 
  }
  
  public void E(Fragment paramFragment, boolean paramBoolean) {
    Fragment fragment = this.s;
    if (fragment != null) {
      k k1 = fragment.s;
      if (k1 instanceof k)
        k1.E(paramFragment, true); 
    } 
    for (f f1 : this.o) {
      if (paramBoolean && !f1.a)
        continue; 
      throw null;
    } 
  }
  
  public void F(Fragment paramFragment, View paramView, Bundle paramBundle, boolean paramBoolean) {
    Fragment fragment = this.s;
    if (fragment != null) {
      k k1 = fragment.s;
      if (k1 instanceof k)
        k1.F(paramFragment, paramView, paramBundle, true); 
    } 
    for (f f1 : this.o) {
      if (paramBoolean && !f1.a)
        continue; 
      throw null;
    } 
  }
  
  public void G(Fragment paramFragment, boolean paramBoolean) {
    Fragment fragment = this.s;
    if (fragment != null) {
      k k1 = fragment.s;
      if (k1 instanceof k)
        k1.G(paramFragment, true); 
    } 
    for (f f1 : this.o) {
      if (paramBoolean && !f1.a)
        continue; 
      throw null;
    } 
  }
  
  public boolean H(MenuItem paramMenuItem) {
    if (this.p < 1)
      return false; 
    for (byte b1 = 0; b1 < this.g.size(); b1++) {
      Fragment fragment = this.g.get(b1);
      if (fragment != null) {
        boolean bool;
        if (!fragment.z && fragment.u.H(paramMenuItem)) {
          bool = true;
        } else {
          bool = false;
        } 
        if (bool)
          return true; 
      } 
    } 
    return false;
  }
  
  public void I(Menu paramMenu) {
    if (this.p < 1)
      return; 
    for (byte b1 = 0; b1 < this.g.size(); b1++) {
      Fragment fragment = this.g.get(b1);
      if (fragment != null && !fragment.z)
        fragment.u.I(paramMenu); 
    } 
  }
  
  public final void J(Fragment paramFragment) {
    if (paramFragment != null && this.h.get(paramFragment.f) == paramFragment) {
      boolean bool = paramFragment.s.X(paramFragment);
      Boolean bool1 = paramFragment.k;
      if (bool1 == null || bool1.booleanValue() != bool) {
        paramFragment.k = Boolean.valueOf(bool);
        k k1 = paramFragment.u;
        k1.s0();
        k1.J(k1.t);
      } 
    } 
  }
  
  public void K(boolean paramBoolean) {
    int m = this.g.size();
    while (true) {
      int n = m - 1;
      if (n >= 0) {
        Fragment fragment = this.g.get(n);
        m = n;
        if (fragment != null) {
          fragment.u.K(paramBoolean);
          m = n;
        } 
        continue;
      } 
      break;
    } 
  }
  
  public boolean L(Menu paramMenu) {
    int m = this.p;
    byte b1 = 0;
    if (m < 1)
      return false; 
    boolean bool;
    for (bool = false; b1 < this.g.size(); bool = bool1) {
      Fragment fragment = this.g.get(b1);
      boolean bool1 = bool;
      if (fragment != null) {
        bool1 = bool;
        if (fragment.O(paramMenu))
          bool1 = true; 
      } 
      b1++;
    } 
    return bool;
  }
  
  public final void M(int paramInt) {
    try {
      this.e = true;
      c0(paramInt, false);
      this.e = false;
      return;
    } finally {
      this.e = false;
    } 
  }
  
  public void N(h paramh, boolean paramBoolean) {
    // Byte code:
    //   0: iload_2
    //   1: ifne -> 8
    //   4: aload_0
    //   5: invokevirtual i : ()V
    //   8: aload_0
    //   9: monitorenter
    //   10: aload_0
    //   11: getfield x : Z
    //   14: ifne -> 63
    //   17: aload_0
    //   18: getfield q : Lb/l/a/i;
    //   21: ifnonnull -> 27
    //   24: goto -> 63
    //   27: aload_0
    //   28: getfield d : Ljava/util/ArrayList;
    //   31: ifnonnull -> 47
    //   34: new java/util/ArrayList
    //   37: astore_3
    //   38: aload_3
    //   39: invokespecial <init> : ()V
    //   42: aload_0
    //   43: aload_3
    //   44: putfield d : Ljava/util/ArrayList;
    //   47: aload_0
    //   48: getfield d : Ljava/util/ArrayList;
    //   51: aload_1
    //   52: invokevirtual add : (Ljava/lang/Object;)Z
    //   55: pop
    //   56: aload_0
    //   57: invokevirtual n0 : ()V
    //   60: aload_0
    //   61: monitorexit
    //   62: return
    //   63: iload_2
    //   64: ifeq -> 70
    //   67: aload_0
    //   68: monitorexit
    //   69: return
    //   70: new java/lang/IllegalStateException
    //   73: astore_1
    //   74: aload_1
    //   75: ldc_w 'Activity has been destroyed'
    //   78: invokespecial <init> : (Ljava/lang/String;)V
    //   81: aload_1
    //   82: athrow
    //   83: astore_1
    //   84: aload_0
    //   85: monitorexit
    //   86: aload_1
    //   87: athrow
    // Exception table:
    //   from	to	target	type
    //   10	24	83	finally
    //   27	47	83	finally
    //   47	62	83	finally
    //   67	69	83	finally
    //   70	83	83	finally
    //   84	86	83	finally
  }
  
  public final void O(boolean paramBoolean) {
    if (!this.e) {
      if (this.q != null) {
        if (Looper.myLooper() == this.q.d.getLooper()) {
          if (!paramBoolean)
            i(); 
          if (this.z == null) {
            this.z = new ArrayList<a>();
            this.A = new ArrayList<Boolean>();
          } 
          this.e = true;
          try {
            R(null, null);
            return;
          } finally {
            this.e = false;
          } 
        } 
        throw new IllegalStateException("Must be called from main thread of fragment host");
      } 
      throw new IllegalStateException("Fragment host has been destroyed");
    } 
    throw new IllegalStateException("FragmentManager is already executing transactions");
  }
  
  public boolean P() {
    // Byte code:
    //   0: aload_0
    //   1: iconst_1
    //   2: invokevirtual O : (Z)V
    //   5: iconst_0
    //   6: istore #4
    //   8: aload_0
    //   9: getfield z : Ljava/util/ArrayList;
    //   12: astore #5
    //   14: aload_0
    //   15: getfield A : Ljava/util/ArrayList;
    //   18: astore #6
    //   20: aload_0
    //   21: monitorenter
    //   22: aload_0
    //   23: getfield d : Ljava/util/ArrayList;
    //   26: ifnull -> 114
    //   29: aload_0
    //   30: getfield d : Ljava/util/ArrayList;
    //   33: invokevirtual size : ()I
    //   36: ifne -> 42
    //   39: goto -> 114
    //   42: aload_0
    //   43: getfield d : Ljava/util/ArrayList;
    //   46: invokevirtual size : ()I
    //   49: istore_3
    //   50: iconst_0
    //   51: istore_2
    //   52: iconst_0
    //   53: istore_1
    //   54: iload_2
    //   55: iload_3
    //   56: if_icmpge -> 88
    //   59: iload_1
    //   60: aload_0
    //   61: getfield d : Ljava/util/ArrayList;
    //   64: iload_2
    //   65: invokevirtual get : (I)Ljava/lang/Object;
    //   68: checkcast b/l/a/k$h
    //   71: aload #5
    //   73: aload #6
    //   75: invokeinterface a : (Ljava/util/ArrayList;Ljava/util/ArrayList;)Z
    //   80: ior
    //   81: istore_1
    //   82: iinc #2, 1
    //   85: goto -> 54
    //   88: aload_0
    //   89: getfield d : Ljava/util/ArrayList;
    //   92: invokevirtual clear : ()V
    //   95: aload_0
    //   96: getfield q : Lb/l/a/i;
    //   99: getfield d : Landroid/os/Handler;
    //   102: aload_0
    //   103: getfield G : Ljava/lang/Runnable;
    //   106: invokevirtual removeCallbacks : (Ljava/lang/Runnable;)V
    //   109: aload_0
    //   110: monitorexit
    //   111: goto -> 118
    //   114: aload_0
    //   115: monitorexit
    //   116: iconst_0
    //   117: istore_1
    //   118: iload_1
    //   119: ifeq -> 158
    //   122: aload_0
    //   123: iconst_1
    //   124: putfield e : Z
    //   127: aload_0
    //   128: aload_0
    //   129: getfield z : Ljava/util/ArrayList;
    //   132: aload_0
    //   133: getfield A : Ljava/util/ArrayList;
    //   136: invokevirtual h0 : (Ljava/util/ArrayList;Ljava/util/ArrayList;)V
    //   139: aload_0
    //   140: invokevirtual j : ()V
    //   143: iconst_1
    //   144: istore #4
    //   146: goto -> 8
    //   149: astore #5
    //   151: aload_0
    //   152: invokevirtual j : ()V
    //   155: aload #5
    //   157: athrow
    //   158: aload_0
    //   159: invokevirtual s0 : ()V
    //   162: aload_0
    //   163: getfield y : Z
    //   166: ifeq -> 178
    //   169: aload_0
    //   170: iconst_0
    //   171: putfield y : Z
    //   174: aload_0
    //   175: invokevirtual q0 : ()V
    //   178: aload_0
    //   179: getfield h : Ljava/util/HashMap;
    //   182: invokevirtual values : ()Ljava/util/Collection;
    //   185: aconst_null
    //   186: invokestatic singleton : (Ljava/lang/Object;)Ljava/util/Set;
    //   189: invokeinterface removeAll : (Ljava/util/Collection;)Z
    //   194: pop
    //   195: iload #4
    //   197: ireturn
    //   198: astore #5
    //   200: aload_0
    //   201: monitorexit
    //   202: aload #5
    //   204: athrow
    // Exception table:
    //   from	to	target	type
    //   22	39	198	finally
    //   42	50	198	finally
    //   59	82	198	finally
    //   88	111	198	finally
    //   114	116	198	finally
    //   127	139	149	finally
    //   200	202	198	finally
  }
  
  public final void Q(ArrayList<a> paramArrayList, ArrayList<Boolean> paramArrayList1, int paramInt1, int paramInt2) {
    // Byte code:
    //   0: aload_1
    //   1: iload_3
    //   2: invokevirtual get : (I)Ljava/lang/Object;
    //   5: checkcast b/l/a/a
    //   8: getfield p : Z
    //   11: istore #12
    //   13: aload_0
    //   14: getfield B : Ljava/util/ArrayList;
    //   17: astore #13
    //   19: aload #13
    //   21: ifnonnull -> 38
    //   24: aload_0
    //   25: new java/util/ArrayList
    //   28: dup
    //   29: invokespecial <init> : ()V
    //   32: putfield B : Ljava/util/ArrayList;
    //   35: goto -> 43
    //   38: aload #13
    //   40: invokevirtual clear : ()V
    //   43: aload_0
    //   44: getfield B : Ljava/util/ArrayList;
    //   47: aload_0
    //   48: getfield g : Ljava/util/ArrayList;
    //   51: invokevirtual addAll : (Ljava/util/Collection;)Z
    //   54: pop
    //   55: aload_0
    //   56: getfield t : Landroidx/fragment/app/Fragment;
    //   59: astore #13
    //   61: iload_3
    //   62: istore #7
    //   64: iconst_0
    //   65: istore #8
    //   67: iload #7
    //   69: iload #4
    //   71: if_icmpge -> 758
    //   74: aload_1
    //   75: iload #7
    //   77: invokevirtual get : (I)Ljava/lang/Object;
    //   80: checkcast b/l/a/a
    //   83: astore #15
    //   85: aload_2
    //   86: iload #7
    //   88: invokevirtual get : (I)Ljava/lang/Object;
    //   91: checkcast java/lang/Boolean
    //   94: invokevirtual booleanValue : ()Z
    //   97: ifne -> 559
    //   100: aload_0
    //   101: getfield B : Ljava/util/ArrayList;
    //   104: astore #16
    //   106: iconst_0
    //   107: istore #5
    //   109: aload #13
    //   111: astore #14
    //   113: iload #5
    //   115: aload #15
    //   117: getfield a : Ljava/util/ArrayList;
    //   120: invokevirtual size : ()I
    //   123: if_icmpge -> 719
    //   126: aload #15
    //   128: getfield a : Ljava/util/ArrayList;
    //   131: iload #5
    //   133: invokevirtual get : (I)Ljava/lang/Object;
    //   136: checkcast b/l/a/r$a
    //   139: astore #17
    //   141: aload #17
    //   143: getfield a : I
    //   146: istore #6
    //   148: iload #6
    //   150: iconst_1
    //   151: if_icmpeq -> 542
    //   154: iload #6
    //   156: iconst_2
    //   157: if_icmpeq -> 301
    //   160: iload #6
    //   162: iconst_3
    //   163: if_icmpeq -> 235
    //   166: iload #6
    //   168: bipush #6
    //   170: if_icmpeq -> 235
    //   173: iload #6
    //   175: bipush #7
    //   177: if_icmpeq -> 542
    //   180: iload #6
    //   182: bipush #8
    //   184: if_icmpeq -> 198
    //   187: aload #13
    //   189: astore #14
    //   191: iload #5
    //   193: istore #6
    //   195: goto -> 514
    //   198: aload #15
    //   200: getfield a : Ljava/util/ArrayList;
    //   203: iload #5
    //   205: new b/l/a/r$a
    //   208: dup
    //   209: bipush #9
    //   211: aload #13
    //   213: invokespecial <init> : (ILandroidx/fragment/app/Fragment;)V
    //   216: invokevirtual add : (ILjava/lang/Object;)V
    //   219: iload #5
    //   221: iconst_1
    //   222: iadd
    //   223: istore #6
    //   225: aload #17
    //   227: getfield b : Landroidx/fragment/app/Fragment;
    //   230: astore #14
    //   232: goto -> 514
    //   235: aload #16
    //   237: aload #17
    //   239: getfield b : Landroidx/fragment/app/Fragment;
    //   242: invokevirtual remove : (Ljava/lang/Object;)Z
    //   245: pop
    //   246: aload #17
    //   248: getfield b : Landroidx/fragment/app/Fragment;
    //   251: astore #17
    //   253: aload #13
    //   255: astore #14
    //   257: iload #5
    //   259: istore #6
    //   261: aload #17
    //   263: aload #13
    //   265: if_acmpne -> 514
    //   268: aload #15
    //   270: getfield a : Ljava/util/ArrayList;
    //   273: iload #5
    //   275: new b/l/a/r$a
    //   278: dup
    //   279: bipush #9
    //   281: aload #17
    //   283: invokespecial <init> : (ILandroidx/fragment/app/Fragment;)V
    //   286: invokevirtual add : (ILjava/lang/Object;)V
    //   289: iload #5
    //   291: iconst_1
    //   292: iadd
    //   293: istore #6
    //   295: aconst_null
    //   296: astore #14
    //   298: goto -> 514
    //   301: aload #17
    //   303: getfield b : Landroidx/fragment/app/Fragment;
    //   306: astore #14
    //   308: aload #14
    //   310: getfield x : I
    //   313: istore #6
    //   315: aload #16
    //   317: invokevirtual size : ()I
    //   320: iconst_1
    //   321: isub
    //   322: istore #9
    //   324: iconst_0
    //   325: istore #10
    //   327: iload #9
    //   329: iflt -> 488
    //   332: aload #16
    //   334: iload #9
    //   336: invokevirtual get : (I)Ljava/lang/Object;
    //   339: checkcast androidx/fragment/app/Fragment
    //   342: astore #18
    //   344: aload #18
    //   346: getfield x : I
    //   349: iload #6
    //   351: if_icmpne -> 482
    //   354: aload #18
    //   356: aload #14
    //   358: if_acmpne -> 367
    //   361: iconst_1
    //   362: istore #10
    //   364: goto -> 482
    //   367: aload #18
    //   369: aload #13
    //   371: if_acmpne -> 404
    //   374: aload #15
    //   376: getfield a : Ljava/util/ArrayList;
    //   379: iload #5
    //   381: new b/l/a/r$a
    //   384: dup
    //   385: bipush #9
    //   387: aload #18
    //   389: invokespecial <init> : (ILandroidx/fragment/app/Fragment;)V
    //   392: invokevirtual add : (ILjava/lang/Object;)V
    //   395: iinc #5, 1
    //   398: aconst_null
    //   399: astore #13
    //   401: goto -> 404
    //   404: new b/l/a/r$a
    //   407: dup
    //   408: iconst_3
    //   409: aload #18
    //   411: invokespecial <init> : (ILandroidx/fragment/app/Fragment;)V
    //   414: astore #19
    //   416: aload #19
    //   418: aload #17
    //   420: getfield c : I
    //   423: putfield c : I
    //   426: aload #19
    //   428: aload #17
    //   430: getfield e : I
    //   433: putfield e : I
    //   436: aload #19
    //   438: aload #17
    //   440: getfield d : I
    //   443: putfield d : I
    //   446: aload #19
    //   448: aload #17
    //   450: getfield f : I
    //   453: putfield f : I
    //   456: aload #15
    //   458: getfield a : Ljava/util/ArrayList;
    //   461: iload #5
    //   463: aload #19
    //   465: invokevirtual add : (ILjava/lang/Object;)V
    //   468: aload #16
    //   470: aload #18
    //   472: invokevirtual remove : (Ljava/lang/Object;)Z
    //   475: pop
    //   476: iinc #5, 1
    //   479: goto -> 482
    //   482: iinc #9, -1
    //   485: goto -> 327
    //   488: iload #10
    //   490: ifeq -> 525
    //   493: aload #15
    //   495: getfield a : Ljava/util/ArrayList;
    //   498: iload #5
    //   500: invokevirtual remove : (I)Ljava/lang/Object;
    //   503: pop
    //   504: iload #5
    //   506: iconst_1
    //   507: isub
    //   508: istore #6
    //   510: aload #13
    //   512: astore #14
    //   514: aload #14
    //   516: astore #13
    //   518: iload #6
    //   520: istore #5
    //   522: goto -> 553
    //   525: aload #17
    //   527: iconst_1
    //   528: putfield a : I
    //   531: aload #16
    //   533: aload #14
    //   535: invokevirtual add : (Ljava/lang/Object;)Z
    //   538: pop
    //   539: goto -> 553
    //   542: aload #16
    //   544: aload #17
    //   546: getfield b : Landroidx/fragment/app/Fragment;
    //   549: invokevirtual add : (Ljava/lang/Object;)Z
    //   552: pop
    //   553: iinc #5, 1
    //   556: goto -> 109
    //   559: aload_0
    //   560: getfield B : Ljava/util/ArrayList;
    //   563: astore #16
    //   565: aload #15
    //   567: getfield a : Ljava/util/ArrayList;
    //   570: invokevirtual size : ()I
    //   573: iconst_1
    //   574: isub
    //   575: istore #5
    //   577: aload #13
    //   579: astore #14
    //   581: iload #5
    //   583: iflt -> 719
    //   586: aload #15
    //   588: getfield a : Ljava/util/ArrayList;
    //   591: iload #5
    //   593: invokevirtual get : (I)Ljava/lang/Object;
    //   596: checkcast b/l/a/r$a
    //   599: astore #14
    //   601: aload #14
    //   603: getfield a : I
    //   606: istore #6
    //   608: iload #6
    //   610: iconst_1
    //   611: if_icmpeq -> 702
    //   614: iload #6
    //   616: iconst_3
    //   617: if_icmpeq -> 688
    //   620: iload #6
    //   622: tableswitch default -> 656, 6 -> 688, 7 -> 702, 8 -> 682, 9 -> 672, 10 -> 659
    //   656: goto -> 713
    //   659: aload #14
    //   661: aload #14
    //   663: getfield g : Lb/n/d$b;
    //   666: putfield h : Lb/n/d$b;
    //   669: goto -> 713
    //   672: aload #14
    //   674: getfield b : Landroidx/fragment/app/Fragment;
    //   677: astore #13
    //   679: goto -> 713
    //   682: aconst_null
    //   683: astore #13
    //   685: goto -> 713
    //   688: aload #16
    //   690: aload #14
    //   692: getfield b : Landroidx/fragment/app/Fragment;
    //   695: invokevirtual add : (Ljava/lang/Object;)Z
    //   698: pop
    //   699: goto -> 713
    //   702: aload #16
    //   704: aload #14
    //   706: getfield b : Landroidx/fragment/app/Fragment;
    //   709: invokevirtual remove : (Ljava/lang/Object;)Z
    //   712: pop
    //   713: iinc #5, -1
    //   716: goto -> 577
    //   719: iload #8
    //   721: ifne -> 741
    //   724: aload #15
    //   726: getfield h : Z
    //   729: ifeq -> 735
    //   732: goto -> 741
    //   735: iconst_0
    //   736: istore #5
    //   738: goto -> 744
    //   741: iconst_1
    //   742: istore #5
    //   744: iinc #7, 1
    //   747: aload #14
    //   749: astore #13
    //   751: iload #5
    //   753: istore #8
    //   755: goto -> 67
    //   758: aload_0
    //   759: getfield B : Ljava/util/ArrayList;
    //   762: invokevirtual clear : ()V
    //   765: iload #12
    //   767: ifne -> 780
    //   770: aload_0
    //   771: aload_1
    //   772: aload_2
    //   773: iload_3
    //   774: iload #4
    //   776: iconst_0
    //   777: invokestatic p : (Lb/l/a/k;Ljava/util/ArrayList;Ljava/util/ArrayList;IIZ)V
    //   780: iload_3
    //   781: istore #5
    //   783: iload #5
    //   785: iload #4
    //   787: if_icmpge -> 867
    //   790: aload_1
    //   791: iload #5
    //   793: invokevirtual get : (I)Ljava/lang/Object;
    //   796: checkcast b/l/a/a
    //   799: astore #13
    //   801: aload_2
    //   802: iload #5
    //   804: invokevirtual get : (I)Ljava/lang/Object;
    //   807: checkcast java/lang/Boolean
    //   810: invokevirtual booleanValue : ()Z
    //   813: ifeq -> 850
    //   816: aload #13
    //   818: iconst_m1
    //   819: invokevirtual h : (I)V
    //   822: iload #5
    //   824: iload #4
    //   826: iconst_1
    //   827: isub
    //   828: if_icmpne -> 837
    //   831: iconst_1
    //   832: istore #11
    //   834: goto -> 840
    //   837: iconst_0
    //   838: istore #11
    //   840: aload #13
    //   842: iload #11
    //   844: invokevirtual l : (Z)V
    //   847: goto -> 861
    //   850: aload #13
    //   852: iconst_1
    //   853: invokevirtual h : (I)V
    //   856: aload #13
    //   858: invokevirtual k : ()V
    //   861: iinc #5, 1
    //   864: goto -> 783
    //   867: iload #12
    //   869: ifeq -> 1241
    //   872: new b/f/c
    //   875: dup
    //   876: invokespecial <init> : ()V
    //   879: astore #13
    //   881: aload_0
    //   882: aload #13
    //   884: invokevirtual e : (Lb/f/c;)V
    //   887: iload #4
    //   889: iconst_1
    //   890: isub
    //   891: istore #6
    //   893: iload #4
    //   895: istore #5
    //   897: iload #6
    //   899: iload_3
    //   900: if_icmplt -> 1167
    //   903: aload_1
    //   904: iload #6
    //   906: invokevirtual get : (I)Ljava/lang/Object;
    //   909: checkcast b/l/a/a
    //   912: astore #15
    //   914: aload_2
    //   915: iload #6
    //   917: invokevirtual get : (I)Ljava/lang/Object;
    //   920: checkcast java/lang/Boolean
    //   923: invokevirtual booleanValue : ()Z
    //   926: istore #11
    //   928: iconst_0
    //   929: istore #7
    //   931: iload #7
    //   933: aload #15
    //   935: getfield a : Ljava/util/ArrayList;
    //   938: invokevirtual size : ()I
    //   941: if_icmpge -> 975
    //   944: aload #15
    //   946: getfield a : Ljava/util/ArrayList;
    //   949: iload #7
    //   951: invokevirtual get : (I)Ljava/lang/Object;
    //   954: checkcast b/l/a/r$a
    //   957: invokestatic o : (Lb/l/a/r$a;)Z
    //   960: ifeq -> 969
    //   963: iconst_1
    //   964: istore #7
    //   966: goto -> 978
    //   969: iinc #7, 1
    //   972: goto -> 931
    //   975: iconst_0
    //   976: istore #7
    //   978: iload #7
    //   980: ifeq -> 1004
    //   983: aload #15
    //   985: aload_1
    //   986: iload #6
    //   988: iconst_1
    //   989: iadd
    //   990: iload #4
    //   992: invokevirtual n : (Ljava/util/ArrayList;II)Z
    //   995: ifne -> 1004
    //   998: iconst_1
    //   999: istore #7
    //   1001: goto -> 1007
    //   1004: iconst_0
    //   1005: istore #7
    //   1007: iload #7
    //   1009: ifeq -> 1161
    //   1012: aload_0
    //   1013: getfield E : Ljava/util/ArrayList;
    //   1016: ifnonnull -> 1030
    //   1019: aload_0
    //   1020: new java/util/ArrayList
    //   1023: dup
    //   1024: invokespecial <init> : ()V
    //   1027: putfield E : Ljava/util/ArrayList;
    //   1030: new b/l/a/k$j
    //   1033: dup
    //   1034: aload #15
    //   1036: iload #11
    //   1038: invokespecial <init> : (Lb/l/a/a;Z)V
    //   1041: astore #14
    //   1043: aload_0
    //   1044: getfield E : Ljava/util/ArrayList;
    //   1047: aload #14
    //   1049: invokevirtual add : (Ljava/lang/Object;)Z
    //   1052: pop
    //   1053: iconst_0
    //   1054: istore #7
    //   1056: iload #7
    //   1058: aload #15
    //   1060: getfield a : Ljava/util/ArrayList;
    //   1063: invokevirtual size : ()I
    //   1066: if_icmpge -> 1108
    //   1069: aload #15
    //   1071: getfield a : Ljava/util/ArrayList;
    //   1074: iload #7
    //   1076: invokevirtual get : (I)Ljava/lang/Object;
    //   1079: checkcast b/l/a/r$a
    //   1082: astore #16
    //   1084: aload #16
    //   1086: invokestatic o : (Lb/l/a/r$a;)Z
    //   1089: ifeq -> 1102
    //   1092: aload #16
    //   1094: getfield b : Landroidx/fragment/app/Fragment;
    //   1097: aload #14
    //   1099: invokevirtual W : (Landroidx/fragment/app/Fragment$d;)V
    //   1102: iinc #7, 1
    //   1105: goto -> 1056
    //   1108: iload #11
    //   1110: ifeq -> 1121
    //   1113: aload #15
    //   1115: invokevirtual k : ()V
    //   1118: goto -> 1127
    //   1121: aload #15
    //   1123: iconst_0
    //   1124: invokevirtual l : (Z)V
    //   1127: iinc #5, -1
    //   1130: iload #6
    //   1132: iload #5
    //   1134: if_icmpeq -> 1152
    //   1137: aload_1
    //   1138: iload #6
    //   1140: invokevirtual remove : (I)Ljava/lang/Object;
    //   1143: pop
    //   1144: aload_1
    //   1145: iload #5
    //   1147: aload #15
    //   1149: invokevirtual add : (ILjava/lang/Object;)V
    //   1152: aload_0
    //   1153: aload #13
    //   1155: invokevirtual e : (Lb/f/c;)V
    //   1158: goto -> 1161
    //   1161: iinc #6, -1
    //   1164: goto -> 897
    //   1167: aload #13
    //   1169: getfield d : I
    //   1172: istore #7
    //   1174: iconst_0
    //   1175: istore #6
    //   1177: iload #6
    //   1179: iload #7
    //   1181: if_icmpge -> 1234
    //   1184: aload #13
    //   1186: getfield c : [Ljava/lang/Object;
    //   1189: iload #6
    //   1191: aaload
    //   1192: checkcast androidx/fragment/app/Fragment
    //   1195: astore #15
    //   1197: aload #15
    //   1199: getfield l : Z
    //   1202: ifne -> 1228
    //   1205: aload #15
    //   1207: invokevirtual Q : ()Landroid/view/View;
    //   1210: astore #14
    //   1212: aload #15
    //   1214: aload #14
    //   1216: invokevirtual getAlpha : ()F
    //   1219: putfield N : F
    //   1222: aload #14
    //   1224: fconst_0
    //   1225: invokevirtual setAlpha : (F)V
    //   1228: iinc #6, 1
    //   1231: goto -> 1177
    //   1234: iload #5
    //   1236: istore #7
    //   1238: goto -> 1245
    //   1241: iload #4
    //   1243: istore #7
    //   1245: iload_3
    //   1246: istore #6
    //   1248: iload #6
    //   1250: istore #5
    //   1252: iload #7
    //   1254: iload #6
    //   1256: if_icmpeq -> 1291
    //   1259: iload #6
    //   1261: istore #5
    //   1263: iload #12
    //   1265: ifeq -> 1291
    //   1268: aload_0
    //   1269: aload_1
    //   1270: aload_2
    //   1271: iload_3
    //   1272: iload #7
    //   1274: iconst_1
    //   1275: invokestatic p : (Lb/l/a/k;Ljava/util/ArrayList;Ljava/util/ArrayList;IIZ)V
    //   1278: aload_0
    //   1279: aload_0
    //   1280: getfield p : I
    //   1283: iconst_1
    //   1284: invokevirtual c0 : (IZ)V
    //   1287: iload #6
    //   1289: istore #5
    //   1291: iload #5
    //   1293: iload #4
    //   1295: if_icmpge -> 1457
    //   1298: aload_1
    //   1299: iload #5
    //   1301: invokevirtual get : (I)Ljava/lang/Object;
    //   1304: checkcast b/l/a/a
    //   1307: astore #13
    //   1309: aload_2
    //   1310: iload #5
    //   1312: invokevirtual get : (I)Ljava/lang/Object;
    //   1315: checkcast java/lang/Boolean
    //   1318: invokevirtual booleanValue : ()Z
    //   1321: ifeq -> 1397
    //   1324: aload #13
    //   1326: getfield t : I
    //   1329: istore_3
    //   1330: iload_3
    //   1331: iflt -> 1397
    //   1334: aload_0
    //   1335: monitorenter
    //   1336: aload_0
    //   1337: getfield m : Ljava/util/ArrayList;
    //   1340: iload_3
    //   1341: aconst_null
    //   1342: invokevirtual set : (ILjava/lang/Object;)Ljava/lang/Object;
    //   1345: pop
    //   1346: aload_0
    //   1347: getfield n : Ljava/util/ArrayList;
    //   1350: ifnonnull -> 1369
    //   1353: new java/util/ArrayList
    //   1356: astore #14
    //   1358: aload #14
    //   1360: invokespecial <init> : ()V
    //   1363: aload_0
    //   1364: aload #14
    //   1366: putfield n : Ljava/util/ArrayList;
    //   1369: aload_0
    //   1370: getfield n : Ljava/util/ArrayList;
    //   1373: iload_3
    //   1374: invokestatic valueOf : (I)Ljava/lang/Integer;
    //   1377: invokevirtual add : (Ljava/lang/Object;)Z
    //   1380: pop
    //   1381: aload_0
    //   1382: monitorexit
    //   1383: aload #13
    //   1385: iconst_m1
    //   1386: putfield t : I
    //   1389: goto -> 1397
    //   1392: astore_1
    //   1393: aload_0
    //   1394: monitorexit
    //   1395: aload_1
    //   1396: athrow
    //   1397: aload #13
    //   1399: getfield q : Ljava/util/ArrayList;
    //   1402: ifnull -> 1451
    //   1405: iconst_0
    //   1406: istore_3
    //   1407: iload_3
    //   1408: aload #13
    //   1410: getfield q : Ljava/util/ArrayList;
    //   1413: invokevirtual size : ()I
    //   1416: if_icmpge -> 1442
    //   1419: aload #13
    //   1421: getfield q : Ljava/util/ArrayList;
    //   1424: iload_3
    //   1425: invokevirtual get : (I)Ljava/lang/Object;
    //   1428: checkcast java/lang/Runnable
    //   1431: invokeinterface run : ()V
    //   1436: iinc #3, 1
    //   1439: goto -> 1407
    //   1442: aload #13
    //   1444: aconst_null
    //   1445: putfield q : Ljava/util/ArrayList;
    //   1448: goto -> 1451
    //   1451: iinc #5, 1
    //   1454: goto -> 1291
    //   1457: return
    // Exception table:
    //   from	to	target	type
    //   1336	1369	1392	finally
    //   1369	1383	1392	finally
    //   1393	1395	1392	finally
  }
  
  public final void R(ArrayList<a> paramArrayList, ArrayList<Boolean> paramArrayList1) {
    // Byte code:
    //   0: aload_0
    //   1: getfield E : Ljava/util/ArrayList;
    //   4: astore #7
    //   6: aload #7
    //   8: ifnonnull -> 17
    //   11: iconst_0
    //   12: istore #4
    //   14: goto -> 24
    //   17: aload #7
    //   19: invokevirtual size : ()I
    //   22: istore #4
    //   24: iconst_0
    //   25: istore_3
    //   26: iload #4
    //   28: istore #6
    //   30: iload_3
    //   31: iload #6
    //   33: if_icmpge -> 278
    //   36: aload_0
    //   37: getfield E : Ljava/util/ArrayList;
    //   40: iload_3
    //   41: invokevirtual get : (I)Ljava/lang/Object;
    //   44: checkcast b/l/a/k$j
    //   47: astore #8
    //   49: aload_1
    //   50: ifnull -> 116
    //   53: aload #8
    //   55: getfield a : Z
    //   58: ifne -> 116
    //   61: aload_1
    //   62: aload #8
    //   64: getfield b : Lb/l/a/a;
    //   67: invokevirtual indexOf : (Ljava/lang/Object;)I
    //   70: istore #4
    //   72: iload #4
    //   74: iconst_m1
    //   75: if_icmpeq -> 116
    //   78: aload_2
    //   79: iload #4
    //   81: invokevirtual get : (I)Ljava/lang/Object;
    //   84: checkcast java/lang/Boolean
    //   87: invokevirtual booleanValue : ()Z
    //   90: ifeq -> 116
    //   93: aload_0
    //   94: getfield E : Ljava/util/ArrayList;
    //   97: iload_3
    //   98: invokevirtual remove : (I)Ljava/lang/Object;
    //   101: pop
    //   102: iload_3
    //   103: iconst_1
    //   104: isub
    //   105: istore #5
    //   107: iload #6
    //   109: iconst_1
    //   110: isub
    //   111: istore #4
    //   113: goto -> 234
    //   116: aload #8
    //   118: getfield c : I
    //   121: ifne -> 130
    //   124: iconst_1
    //   125: istore #4
    //   127: goto -> 133
    //   130: iconst_0
    //   131: istore #4
    //   133: iload #4
    //   135: ifne -> 173
    //   138: iload #6
    //   140: istore #4
    //   142: iload_3
    //   143: istore #5
    //   145: aload_1
    //   146: ifnull -> 266
    //   149: iload #6
    //   151: istore #4
    //   153: iload_3
    //   154: istore #5
    //   156: aload #8
    //   158: getfield b : Lb/l/a/a;
    //   161: aload_1
    //   162: iconst_0
    //   163: aload_1
    //   164: invokevirtual size : ()I
    //   167: invokevirtual n : (Ljava/util/ArrayList;II)Z
    //   170: ifeq -> 266
    //   173: aload_0
    //   174: getfield E : Ljava/util/ArrayList;
    //   177: iload_3
    //   178: invokevirtual remove : (I)Ljava/lang/Object;
    //   181: pop
    //   182: iload_3
    //   183: iconst_1
    //   184: isub
    //   185: istore #5
    //   187: iload #6
    //   189: iconst_1
    //   190: isub
    //   191: istore #4
    //   193: aload_1
    //   194: ifnull -> 261
    //   197: aload #8
    //   199: getfield a : Z
    //   202: ifne -> 261
    //   205: aload_1
    //   206: aload #8
    //   208: getfield b : Lb/l/a/a;
    //   211: invokevirtual indexOf : (Ljava/lang/Object;)I
    //   214: istore_3
    //   215: iload_3
    //   216: iconst_m1
    //   217: if_icmpeq -> 261
    //   220: aload_2
    //   221: iload_3
    //   222: invokevirtual get : (I)Ljava/lang/Object;
    //   225: checkcast java/lang/Boolean
    //   228: invokevirtual booleanValue : ()Z
    //   231: ifeq -> 261
    //   234: aload #8
    //   236: getfield b : Lb/l/a/a;
    //   239: astore #7
    //   241: aload #7
    //   243: getfield r : Lb/l/a/k;
    //   246: aload #7
    //   248: aload #8
    //   250: getfield a : Z
    //   253: iconst_0
    //   254: iconst_0
    //   255: invokevirtual k : (Lb/l/a/a;ZZZ)V
    //   258: goto -> 266
    //   261: aload #8
    //   263: invokevirtual a : ()V
    //   266: iload #5
    //   268: iconst_1
    //   269: iadd
    //   270: istore_3
    //   271: iload #4
    //   273: istore #6
    //   275: goto -> 30
    //   278: return
  }
  
  public Fragment S(int paramInt) {
    for (int m = this.g.size() - 1; m >= 0; m--) {
      Fragment fragment = this.g.get(m);
      if (fragment != null && fragment.w == paramInt)
        return fragment; 
    } 
    for (Fragment fragment : this.h.values()) {
      if (fragment != null && fragment.w == paramInt)
        return fragment; 
    } 
    return null;
  }
  
  public Fragment T(String paramString) {
    for (Fragment fragment : this.h.values()) {
      if (fragment != null) {
        if (!paramString.equals(fragment.f))
          fragment = fragment.u.T(paramString); 
        if (fragment != null)
          return fragment; 
      } 
    } 
    return null;
  }
  
  public final void U() {
    if (this.E != null)
      while (!this.E.isEmpty())
        ((j)this.E.remove(0)).a();  
  }
  
  public h V() {
    if (this.b == null)
      this.b = j.c; 
    if (this.b == j.c) {
      Fragment fragment = this.s;
      if (fragment != null)
        return fragment.s.V(); 
      this.b = new c(this);
    } 
    if (this.b == null)
      this.b = j.c; 
    return this.b;
  }
  
  public final boolean W(Fragment paramFragment) {
    // Byte code:
    //   0: aload_1
    //   1: getfield u : Lb/l/a/k;
    //   4: astore_1
    //   5: aload_1
    //   6: getfield h : Ljava/util/HashMap;
    //   9: invokevirtual values : ()Ljava/util/Collection;
    //   12: invokeinterface iterator : ()Ljava/util/Iterator;
    //   17: astore #6
    //   19: iconst_0
    //   20: istore #5
    //   22: iconst_0
    //   23: istore_3
    //   24: aload #6
    //   26: invokeinterface hasNext : ()Z
    //   31: ifeq -> 75
    //   34: aload #6
    //   36: invokeinterface next : ()Ljava/lang/Object;
    //   41: checkcast androidx/fragment/app/Fragment
    //   44: astore #7
    //   46: iload_3
    //   47: istore #4
    //   49: aload #7
    //   51: ifnull -> 62
    //   54: aload_1
    //   55: aload #7
    //   57: invokevirtual W : (Landroidx/fragment/app/Fragment;)Z
    //   60: istore #4
    //   62: iload #4
    //   64: istore_3
    //   65: iload #4
    //   67: ifeq -> 24
    //   70: iconst_1
    //   71: istore_2
    //   72: goto -> 77
    //   75: iconst_0
    //   76: istore_2
    //   77: iload #5
    //   79: istore_3
    //   80: iload_2
    //   81: ifeq -> 86
    //   84: iconst_1
    //   85: istore_3
    //   86: iload_3
    //   87: ireturn
  }
  
  public boolean X(Fragment paramFragment) {
    boolean bool = true;
    if (paramFragment == null)
      return true; 
    k k1 = paramFragment.s;
    if (paramFragment != k1.t || !X(k1.s))
      bool = false; 
    return bool;
  }
  
  public d Y(Fragment paramFragment, int paramInt1, boolean paramBoolean, int paramInt2) {
    // Byte code:
    //   0: aload_1
    //   1: invokevirtual n : ()I
    //   4: istore #7
    //   6: iconst_0
    //   7: istore #6
    //   9: aload_1
    //   10: iconst_0
    //   11: invokevirtual V : (I)V
    //   14: aload_1
    //   15: getfield F : Landroid/view/ViewGroup;
    //   18: astore_1
    //   19: aload_1
    //   20: ifnull -> 32
    //   23: aload_1
    //   24: invokevirtual getLayoutTransition : ()Landroid/animation/LayoutTransition;
    //   27: ifnull -> 32
    //   30: aconst_null
    //   31: areturn
    //   32: iload #7
    //   34: ifeq -> 172
    //   37: ldc_w 'anim'
    //   40: aload_0
    //   41: getfield q : Lb/l/a/i;
    //   44: getfield c : Landroid/content/Context;
    //   47: invokevirtual getResources : ()Landroid/content/res/Resources;
    //   50: iload #7
    //   52: invokevirtual getResourceTypeName : (I)Ljava/lang/String;
    //   55: invokevirtual equals : (Ljava/lang/Object;)Z
    //   58: istore #8
    //   60: iload #8
    //   62: ifeq -> 102
    //   65: aload_0
    //   66: getfield q : Lb/l/a/i;
    //   69: getfield c : Landroid/content/Context;
    //   72: iload #7
    //   74: invokestatic loadAnimation : (Landroid/content/Context;I)Landroid/view/animation/Animation;
    //   77: astore_1
    //   78: aload_1
    //   79: ifnull -> 93
    //   82: new b/l/a/k$d
    //   85: dup
    //   86: aload_1
    //   87: invokespecial <init> : (Landroid/view/animation/Animation;)V
    //   90: astore_1
    //   91: aload_1
    //   92: areturn
    //   93: iconst_1
    //   94: istore #5
    //   96: goto -> 105
    //   99: astore_1
    //   100: aload_1
    //   101: athrow
    //   102: iconst_0
    //   103: istore #5
    //   105: iload #5
    //   107: ifne -> 172
    //   110: aload_0
    //   111: getfield q : Lb/l/a/i;
    //   114: getfield c : Landroid/content/Context;
    //   117: iload #7
    //   119: invokestatic loadAnimator : (Landroid/content/Context;I)Landroid/animation/Animator;
    //   122: astore_1
    //   123: aload_1
    //   124: ifnull -> 172
    //   127: new b/l/a/k$d
    //   130: dup
    //   131: aload_1
    //   132: invokespecial <init> : (Landroid/animation/Animator;)V
    //   135: astore_1
    //   136: aload_1
    //   137: areturn
    //   138: astore_1
    //   139: iload #8
    //   141: ifne -> 170
    //   144: aload_0
    //   145: getfield q : Lb/l/a/i;
    //   148: getfield c : Landroid/content/Context;
    //   151: iload #7
    //   153: invokestatic loadAnimation : (Landroid/content/Context;I)Landroid/view/animation/Animation;
    //   156: astore_1
    //   157: aload_1
    //   158: ifnull -> 172
    //   161: new b/l/a/k$d
    //   164: dup
    //   165: aload_1
    //   166: invokespecial <init> : (Landroid/view/animation/Animation;)V
    //   169: areturn
    //   170: aload_1
    //   171: athrow
    //   172: iload_2
    //   173: ifne -> 178
    //   176: aconst_null
    //   177: areturn
    //   178: iload_2
    //   179: sipush #4097
    //   182: if_icmpeq -> 233
    //   185: iload_2
    //   186: sipush #4099
    //   189: if_icmpeq -> 218
    //   192: iload_2
    //   193: sipush #8194
    //   196: if_icmpeq -> 204
    //   199: iconst_m1
    //   200: istore_2
    //   201: goto -> 244
    //   204: iload_3
    //   205: ifeq -> 213
    //   208: iconst_3
    //   209: istore_2
    //   210: goto -> 244
    //   213: iconst_4
    //   214: istore_2
    //   215: goto -> 244
    //   218: iload_3
    //   219: ifeq -> 227
    //   222: iconst_5
    //   223: istore_2
    //   224: goto -> 244
    //   227: bipush #6
    //   229: istore_2
    //   230: goto -> 244
    //   233: iload_3
    //   234: ifeq -> 242
    //   237: iconst_1
    //   238: istore_2
    //   239: goto -> 244
    //   242: iconst_2
    //   243: istore_2
    //   244: iload_2
    //   245: ifge -> 250
    //   248: aconst_null
    //   249: areturn
    //   250: iload_2
    //   251: tableswitch default -> 288, 1 -> 397, 2 -> 387, 3 -> 377, 4 -> 367, 5 -> 334, 6 -> 301
    //   288: iload #4
    //   290: ifne -> 458
    //   293: aload_0
    //   294: getfield q : Lb/l/a/i;
    //   297: astore_1
    //   298: goto -> 407
    //   301: new android/view/animation/AlphaAnimation
    //   304: dup
    //   305: fconst_1
    //   306: fconst_0
    //   307: invokespecial <init> : (FF)V
    //   310: astore_1
    //   311: aload_1
    //   312: getstatic b/l/a/k.J : Landroid/view/animation/Interpolator;
    //   315: invokevirtual setInterpolator : (Landroid/view/animation/Interpolator;)V
    //   318: aload_1
    //   319: ldc2_w 220
    //   322: invokevirtual setDuration : (J)V
    //   325: new b/l/a/k$d
    //   328: dup
    //   329: aload_1
    //   330: invokespecial <init> : (Landroid/view/animation/Animation;)V
    //   333: areturn
    //   334: new android/view/animation/AlphaAnimation
    //   337: dup
    //   338: fconst_0
    //   339: fconst_1
    //   340: invokespecial <init> : (FF)V
    //   343: astore_1
    //   344: aload_1
    //   345: getstatic b/l/a/k.J : Landroid/view/animation/Interpolator;
    //   348: invokevirtual setInterpolator : (Landroid/view/animation/Interpolator;)V
    //   351: aload_1
    //   352: ldc2_w 220
    //   355: invokevirtual setDuration : (J)V
    //   358: new b/l/a/k$d
    //   361: dup
    //   362: aload_1
    //   363: invokespecial <init> : (Landroid/view/animation/Animation;)V
    //   366: areturn
    //   367: fconst_1
    //   368: ldc_w 1.075
    //   371: fconst_1
    //   372: fconst_0
    //   373: invokestatic a0 : (FFFF)Lb/l/a/k$d;
    //   376: areturn
    //   377: ldc_w 0.975
    //   380: fconst_1
    //   381: fconst_0
    //   382: fconst_1
    //   383: invokestatic a0 : (FFFF)Lb/l/a/k$d;
    //   386: areturn
    //   387: fconst_1
    //   388: ldc_w 0.975
    //   391: fconst_1
    //   392: fconst_0
    //   393: invokestatic a0 : (FFFF)Lb/l/a/k$d;
    //   396: areturn
    //   397: ldc_w 1.125
    //   400: fconst_1
    //   401: fconst_0
    //   402: fconst_1
    //   403: invokestatic a0 : (FFFF)Lb/l/a/k$d;
    //   406: areturn
    //   407: iload #6
    //   409: istore_2
    //   410: aload_1
    //   411: checkcast b/l/a/e$a
    //   414: getfield g : Lb/l/a/e;
    //   417: invokevirtual getWindow : ()Landroid/view/Window;
    //   420: ifnull -> 425
    //   423: iconst_1
    //   424: istore_2
    //   425: iload_2
    //   426: ifeq -> 458
    //   429: aload_0
    //   430: getfield q : Lb/l/a/i;
    //   433: checkcast b/l/a/e$a
    //   436: getfield g : Lb/l/a/e;
    //   439: invokevirtual getWindow : ()Landroid/view/Window;
    //   442: astore_1
    //   443: aload_1
    //   444: ifnonnull -> 450
    //   447: goto -> 458
    //   450: aload_1
    //   451: invokevirtual getAttributes : ()Landroid/view/WindowManager$LayoutParams;
    //   454: getfield windowAnimations : I
    //   457: istore_2
    //   458: aconst_null
    //   459: areturn
    //   460: astore_1
    //   461: goto -> 102
    // Exception table:
    //   from	to	target	type
    //   65	78	99	android/content/res/Resources$NotFoundException
    //   65	78	460	java/lang/RuntimeException
    //   82	91	99	android/content/res/Resources$NotFoundException
    //   82	91	460	java/lang/RuntimeException
    //   110	123	138	java/lang/RuntimeException
    //   127	136	138	java/lang/RuntimeException
  }
  
  public void Z(Fragment paramFragment) {
    if (this.h.get(paramFragment.f) != null)
      return; 
    this.h.put(paramFragment.f, paramFragment);
    if (paramFragment.C) {
      if (paramFragment.B) {
        if (!c())
          this.F.b.add(paramFragment); 
      } else {
        i0(paramFragment);
      } 
      paramFragment.C = false;
    } 
  }
  
  public void a(String paramString, FileDescriptor paramFileDescriptor, PrintWriter paramPrintWriter, String[] paramArrayOfString) {
    // Byte code:
    //   0: aload_1
    //   1: ldc_w '    '
    //   4: invokestatic c : (Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    //   7: astore #10
    //   9: aload_0
    //   10: getfield h : Ljava/util/HashMap;
    //   13: invokevirtual isEmpty : ()Z
    //   16: istore #8
    //   18: iconst_0
    //   19: istore #6
    //   21: iload #8
    //   23: ifne -> 946
    //   26: aload_3
    //   27: aload_1
    //   28: invokevirtual print : (Ljava/lang/String;)V
    //   31: aload_3
    //   32: ldc_w 'Active Fragments in '
    //   35: invokevirtual print : (Ljava/lang/String;)V
    //   38: aload_3
    //   39: aload_0
    //   40: invokestatic identityHashCode : (Ljava/lang/Object;)I
    //   43: invokestatic toHexString : (I)Ljava/lang/String;
    //   46: invokevirtual print : (Ljava/lang/String;)V
    //   49: aload_3
    //   50: ldc_w ':'
    //   53: invokevirtual println : (Ljava/lang/String;)V
    //   56: aload_0
    //   57: getfield h : Ljava/util/HashMap;
    //   60: invokevirtual values : ()Ljava/util/Collection;
    //   63: invokeinterface iterator : ()Ljava/util/Iterator;
    //   68: astore #11
    //   70: aload #11
    //   72: invokeinterface hasNext : ()Z
    //   77: ifeq -> 946
    //   80: aload #11
    //   82: invokeinterface next : ()Ljava/lang/Object;
    //   87: checkcast androidx/fragment/app/Fragment
    //   90: astore #12
    //   92: aload_3
    //   93: aload_1
    //   94: invokevirtual print : (Ljava/lang/String;)V
    //   97: aload_3
    //   98: aload #12
    //   100: invokevirtual println : (Ljava/lang/Object;)V
    //   103: aload #12
    //   105: ifnull -> 70
    //   108: aload_3
    //   109: aload #10
    //   111: invokevirtual print : (Ljava/lang/String;)V
    //   114: aload_3
    //   115: ldc_w 'mFragmentId=#'
    //   118: invokevirtual print : (Ljava/lang/String;)V
    //   121: aload_3
    //   122: aload #12
    //   124: getfield w : I
    //   127: invokestatic toHexString : (I)Ljava/lang/String;
    //   130: invokevirtual print : (Ljava/lang/String;)V
    //   133: aload_3
    //   134: ldc_w ' mContainerId=#'
    //   137: invokevirtual print : (Ljava/lang/String;)V
    //   140: aload_3
    //   141: aload #12
    //   143: getfield x : I
    //   146: invokestatic toHexString : (I)Ljava/lang/String;
    //   149: invokevirtual print : (Ljava/lang/String;)V
    //   152: aload_3
    //   153: ldc_w ' mTag='
    //   156: invokevirtual print : (Ljava/lang/String;)V
    //   159: aload_3
    //   160: aload #12
    //   162: getfield y : Ljava/lang/String;
    //   165: invokevirtual println : (Ljava/lang/String;)V
    //   168: aload_3
    //   169: aload #10
    //   171: invokevirtual print : (Ljava/lang/String;)V
    //   174: aload_3
    //   175: ldc_w 'mState='
    //   178: invokevirtual print : (Ljava/lang/String;)V
    //   181: aload_3
    //   182: aload #12
    //   184: getfield b : I
    //   187: invokevirtual print : (I)V
    //   190: aload_3
    //   191: ldc_w ' mWho='
    //   194: invokevirtual print : (Ljava/lang/String;)V
    //   197: aload_3
    //   198: aload #12
    //   200: getfield f : Ljava/lang/String;
    //   203: invokevirtual print : (Ljava/lang/String;)V
    //   206: aload_3
    //   207: ldc_w ' mBackStackNesting='
    //   210: invokevirtual print : (Ljava/lang/String;)V
    //   213: aload_3
    //   214: aload #12
    //   216: getfield r : I
    //   219: invokevirtual println : (I)V
    //   222: aload_3
    //   223: aload #10
    //   225: invokevirtual print : (Ljava/lang/String;)V
    //   228: aload_3
    //   229: ldc_w 'mAdded='
    //   232: invokevirtual print : (Ljava/lang/String;)V
    //   235: aload_3
    //   236: aload #12
    //   238: getfield l : Z
    //   241: invokevirtual print : (Z)V
    //   244: aload_3
    //   245: ldc_w ' mRemoving='
    //   248: invokevirtual print : (Ljava/lang/String;)V
    //   251: aload_3
    //   252: aload #12
    //   254: getfield m : Z
    //   257: invokevirtual print : (Z)V
    //   260: aload_3
    //   261: ldc_w ' mFromLayout='
    //   264: invokevirtual print : (Ljava/lang/String;)V
    //   267: aload_3
    //   268: aload #12
    //   270: getfield n : Z
    //   273: invokevirtual print : (Z)V
    //   276: aload_3
    //   277: ldc_w ' mInLayout='
    //   280: invokevirtual print : (Ljava/lang/String;)V
    //   283: aload_3
    //   284: aload #12
    //   286: getfield o : Z
    //   289: invokevirtual println : (Z)V
    //   292: aload_3
    //   293: aload #10
    //   295: invokevirtual print : (Ljava/lang/String;)V
    //   298: aload_3
    //   299: ldc_w 'mHidden='
    //   302: invokevirtual print : (Ljava/lang/String;)V
    //   305: aload_3
    //   306: aload #12
    //   308: getfield z : Z
    //   311: invokevirtual print : (Z)V
    //   314: aload_3
    //   315: ldc_w ' mDetached='
    //   318: invokevirtual print : (Ljava/lang/String;)V
    //   321: aload_3
    //   322: aload #12
    //   324: getfield A : Z
    //   327: invokevirtual print : (Z)V
    //   330: aload_3
    //   331: ldc_w ' mMenuVisible='
    //   334: invokevirtual print : (Ljava/lang/String;)V
    //   337: aload_3
    //   338: aload #12
    //   340: getfield D : Z
    //   343: invokevirtual print : (Z)V
    //   346: aload_3
    //   347: ldc_w ' mHasMenu='
    //   350: invokevirtual print : (Ljava/lang/String;)V
    //   353: aload_3
    //   354: iconst_0
    //   355: invokevirtual println : (Z)V
    //   358: aload_3
    //   359: aload #10
    //   361: invokevirtual print : (Ljava/lang/String;)V
    //   364: aload_3
    //   365: ldc_w 'mRetainInstance='
    //   368: invokevirtual print : (Ljava/lang/String;)V
    //   371: aload_3
    //   372: aload #12
    //   374: getfield B : Z
    //   377: invokevirtual print : (Z)V
    //   380: aload_3
    //   381: ldc_w ' mUserVisibleHint='
    //   384: invokevirtual print : (Ljava/lang/String;)V
    //   387: aload_3
    //   388: aload #12
    //   390: getfield J : Z
    //   393: invokevirtual println : (Z)V
    //   396: aload #12
    //   398: getfield s : Lb/l/a/k;
    //   401: ifnull -> 426
    //   404: aload_3
    //   405: aload #10
    //   407: invokevirtual print : (Ljava/lang/String;)V
    //   410: aload_3
    //   411: ldc_w 'mFragmentManager='
    //   414: invokevirtual print : (Ljava/lang/String;)V
    //   417: aload_3
    //   418: aload #12
    //   420: getfield s : Lb/l/a/k;
    //   423: invokevirtual println : (Ljava/lang/Object;)V
    //   426: aload #12
    //   428: getfield t : Lb/l/a/i;
    //   431: ifnull -> 456
    //   434: aload_3
    //   435: aload #10
    //   437: invokevirtual print : (Ljava/lang/String;)V
    //   440: aload_3
    //   441: ldc_w 'mHost='
    //   444: invokevirtual print : (Ljava/lang/String;)V
    //   447: aload_3
    //   448: aload #12
    //   450: getfield t : Lb/l/a/i;
    //   453: invokevirtual println : (Ljava/lang/Object;)V
    //   456: aload #12
    //   458: getfield v : Landroidx/fragment/app/Fragment;
    //   461: ifnull -> 486
    //   464: aload_3
    //   465: aload #10
    //   467: invokevirtual print : (Ljava/lang/String;)V
    //   470: aload_3
    //   471: ldc_w 'mParentFragment='
    //   474: invokevirtual print : (Ljava/lang/String;)V
    //   477: aload_3
    //   478: aload #12
    //   480: getfield v : Landroidx/fragment/app/Fragment;
    //   483: invokevirtual println : (Ljava/lang/Object;)V
    //   486: aload #12
    //   488: getfield g : Landroid/os/Bundle;
    //   491: ifnull -> 516
    //   494: aload_3
    //   495: aload #10
    //   497: invokevirtual print : (Ljava/lang/String;)V
    //   500: aload_3
    //   501: ldc_w 'mArguments='
    //   504: invokevirtual print : (Ljava/lang/String;)V
    //   507: aload_3
    //   508: aload #12
    //   510: getfield g : Landroid/os/Bundle;
    //   513: invokevirtual println : (Ljava/lang/Object;)V
    //   516: aload #12
    //   518: getfield c : Landroid/os/Bundle;
    //   521: ifnull -> 546
    //   524: aload_3
    //   525: aload #10
    //   527: invokevirtual print : (Ljava/lang/String;)V
    //   530: aload_3
    //   531: ldc_w 'mSavedFragmentState='
    //   534: invokevirtual print : (Ljava/lang/String;)V
    //   537: aload_3
    //   538: aload #12
    //   540: getfield c : Landroid/os/Bundle;
    //   543: invokevirtual println : (Ljava/lang/Object;)V
    //   546: aload #12
    //   548: getfield d : Landroid/util/SparseArray;
    //   551: ifnull -> 576
    //   554: aload_3
    //   555: aload #10
    //   557: invokevirtual print : (Ljava/lang/String;)V
    //   560: aload_3
    //   561: ldc_w 'mSavedViewState='
    //   564: invokevirtual print : (Ljava/lang/String;)V
    //   567: aload_3
    //   568: aload #12
    //   570: getfield d : Landroid/util/SparseArray;
    //   573: invokevirtual println : (Ljava/lang/Object;)V
    //   576: aload #12
    //   578: getfield h : Landroidx/fragment/app/Fragment;
    //   581: astore #9
    //   583: aload #9
    //   585: ifnull -> 591
    //   588: goto -> 636
    //   591: aload #12
    //   593: getfield s : Lb/l/a/k;
    //   596: astore #9
    //   598: aload #9
    //   600: ifnull -> 633
    //   603: aload #12
    //   605: getfield i : Ljava/lang/String;
    //   608: astore #13
    //   610: aload #13
    //   612: ifnull -> 633
    //   615: aload #9
    //   617: getfield h : Ljava/util/HashMap;
    //   620: aload #13
    //   622: invokevirtual get : (Ljava/lang/Object;)Ljava/lang/Object;
    //   625: checkcast androidx/fragment/app/Fragment
    //   628: astore #9
    //   630: goto -> 636
    //   633: aconst_null
    //   634: astore #9
    //   636: aload #9
    //   638: ifnull -> 676
    //   641: aload_3
    //   642: aload #10
    //   644: invokevirtual print : (Ljava/lang/String;)V
    //   647: aload_3
    //   648: ldc_w 'mTarget='
    //   651: invokevirtual print : (Ljava/lang/String;)V
    //   654: aload_3
    //   655: aload #9
    //   657: invokevirtual print : (Ljava/lang/Object;)V
    //   660: aload_3
    //   661: ldc_w ' mTargetRequestCode='
    //   664: invokevirtual print : (Ljava/lang/String;)V
    //   667: aload_3
    //   668: aload #12
    //   670: getfield j : I
    //   673: invokevirtual println : (I)V
    //   676: aload #12
    //   678: invokevirtual n : ()I
    //   681: ifeq -> 706
    //   684: aload_3
    //   685: aload #10
    //   687: invokevirtual print : (Ljava/lang/String;)V
    //   690: aload_3
    //   691: ldc_w 'mNextAnim='
    //   694: invokevirtual print : (Ljava/lang/String;)V
    //   697: aload_3
    //   698: aload #12
    //   700: invokevirtual n : ()I
    //   703: invokevirtual println : (I)V
    //   706: aload #12
    //   708: getfield F : Landroid/view/ViewGroup;
    //   711: ifnull -> 736
    //   714: aload_3
    //   715: aload #10
    //   717: invokevirtual print : (Ljava/lang/String;)V
    //   720: aload_3
    //   721: ldc_w 'mContainer='
    //   724: invokevirtual print : (Ljava/lang/String;)V
    //   727: aload_3
    //   728: aload #12
    //   730: getfield F : Landroid/view/ViewGroup;
    //   733: invokevirtual println : (Ljava/lang/Object;)V
    //   736: aload #12
    //   738: getfield G : Landroid/view/View;
    //   741: ifnull -> 766
    //   744: aload_3
    //   745: aload #10
    //   747: invokevirtual print : (Ljava/lang/String;)V
    //   750: aload_3
    //   751: ldc_w 'mView='
    //   754: invokevirtual print : (Ljava/lang/String;)V
    //   757: aload_3
    //   758: aload #12
    //   760: getfield G : Landroid/view/View;
    //   763: invokevirtual println : (Ljava/lang/Object;)V
    //   766: aload #12
    //   768: getfield H : Landroid/view/View;
    //   771: ifnull -> 796
    //   774: aload_3
    //   775: aload #10
    //   777: invokevirtual print : (Ljava/lang/String;)V
    //   780: aload_3
    //   781: ldc_w 'mInnerView='
    //   784: invokevirtual print : (Ljava/lang/String;)V
    //   787: aload_3
    //   788: aload #12
    //   790: getfield G : Landroid/view/View;
    //   793: invokevirtual println : (Ljava/lang/Object;)V
    //   796: aload #12
    //   798: invokevirtual h : ()Landroid/view/View;
    //   801: ifnull -> 848
    //   804: aload_3
    //   805: aload #10
    //   807: invokevirtual print : (Ljava/lang/String;)V
    //   810: aload_3
    //   811: ldc_w 'mAnimatingAway='
    //   814: invokevirtual print : (Ljava/lang/String;)V
    //   817: aload_3
    //   818: aload #12
    //   820: invokevirtual h : ()Landroid/view/View;
    //   823: invokevirtual println : (Ljava/lang/Object;)V
    //   826: aload_3
    //   827: aload #10
    //   829: invokevirtual print : (Ljava/lang/String;)V
    //   832: aload_3
    //   833: ldc_w 'mStateAfterAnimating='
    //   836: invokevirtual print : (Ljava/lang/String;)V
    //   839: aload_3
    //   840: aload #12
    //   842: invokevirtual s : ()I
    //   845: invokevirtual println : (I)V
    //   848: aload #12
    //   850: invokevirtual k : ()Landroid/content/Context;
    //   853: ifnull -> 870
    //   856: aload #12
    //   858: invokestatic b : (Lb/n/g;)Lb/o/a/a;
    //   861: aload #10
    //   863: aload_2
    //   864: aload_3
    //   865: aload #4
    //   867: invokevirtual a : (Ljava/lang/String;Ljava/io/FileDescriptor;Ljava/io/PrintWriter;[Ljava/lang/String;)V
    //   870: aload_3
    //   871: aload #10
    //   873: invokevirtual print : (Ljava/lang/String;)V
    //   876: new java/lang/StringBuilder
    //   879: dup
    //   880: invokespecial <init> : ()V
    //   883: astore #9
    //   885: aload #9
    //   887: ldc_w 'Child '
    //   890: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   893: pop
    //   894: aload #9
    //   896: aload #12
    //   898: getfield u : Lb/l/a/k;
    //   901: invokevirtual append : (Ljava/lang/Object;)Ljava/lang/StringBuilder;
    //   904: pop
    //   905: aload #9
    //   907: ldc_w ':'
    //   910: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   913: pop
    //   914: aload_3
    //   915: aload #9
    //   917: invokevirtual toString : ()Ljava/lang/String;
    //   920: invokevirtual println : (Ljava/lang/String;)V
    //   923: aload #12
    //   925: getfield u : Lb/l/a/k;
    //   928: aload #10
    //   930: ldc_w '  '
    //   933: invokestatic c : (Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    //   936: aload_2
    //   937: aload_3
    //   938: aload #4
    //   940: invokevirtual a : (Ljava/lang/String;Ljava/io/FileDescriptor;Ljava/io/PrintWriter;[Ljava/lang/String;)V
    //   943: goto -> 70
    //   946: aload_0
    //   947: getfield g : Ljava/util/ArrayList;
    //   950: invokevirtual size : ()I
    //   953: istore #7
    //   955: iload #7
    //   957: ifle -> 1034
    //   960: aload_3
    //   961: aload_1
    //   962: invokevirtual print : (Ljava/lang/String;)V
    //   965: aload_3
    //   966: ldc_w 'Added Fragments:'
    //   969: invokevirtual println : (Ljava/lang/String;)V
    //   972: iconst_0
    //   973: istore #5
    //   975: iload #5
    //   977: iload #7
    //   979: if_icmpge -> 1034
    //   982: aload_0
    //   983: getfield g : Ljava/util/ArrayList;
    //   986: iload #5
    //   988: invokevirtual get : (I)Ljava/lang/Object;
    //   991: checkcast androidx/fragment/app/Fragment
    //   994: astore_2
    //   995: aload_3
    //   996: aload_1
    //   997: invokevirtual print : (Ljava/lang/String;)V
    //   1000: aload_3
    //   1001: ldc_w '  #'
    //   1004: invokevirtual print : (Ljava/lang/String;)V
    //   1007: aload_3
    //   1008: iload #5
    //   1010: invokevirtual print : (I)V
    //   1013: aload_3
    //   1014: ldc_w ': '
    //   1017: invokevirtual print : (Ljava/lang/String;)V
    //   1020: aload_3
    //   1021: aload_2
    //   1022: invokevirtual toString : ()Ljava/lang/String;
    //   1025: invokevirtual println : (Ljava/lang/String;)V
    //   1028: iinc #5, 1
    //   1031: goto -> 975
    //   1034: aload_0
    //   1035: getfield j : Ljava/util/ArrayList;
    //   1038: astore_2
    //   1039: aload_2
    //   1040: ifnull -> 1128
    //   1043: aload_2
    //   1044: invokevirtual size : ()I
    //   1047: istore #7
    //   1049: iload #7
    //   1051: ifle -> 1128
    //   1054: aload_3
    //   1055: aload_1
    //   1056: invokevirtual print : (Ljava/lang/String;)V
    //   1059: aload_3
    //   1060: ldc_w 'Fragments Created Menus:'
    //   1063: invokevirtual println : (Ljava/lang/String;)V
    //   1066: iconst_0
    //   1067: istore #5
    //   1069: iload #5
    //   1071: iload #7
    //   1073: if_icmpge -> 1128
    //   1076: aload_0
    //   1077: getfield j : Ljava/util/ArrayList;
    //   1080: iload #5
    //   1082: invokevirtual get : (I)Ljava/lang/Object;
    //   1085: checkcast androidx/fragment/app/Fragment
    //   1088: astore_2
    //   1089: aload_3
    //   1090: aload_1
    //   1091: invokevirtual print : (Ljava/lang/String;)V
    //   1094: aload_3
    //   1095: ldc_w '  #'
    //   1098: invokevirtual print : (Ljava/lang/String;)V
    //   1101: aload_3
    //   1102: iload #5
    //   1104: invokevirtual print : (I)V
    //   1107: aload_3
    //   1108: ldc_w ': '
    //   1111: invokevirtual print : (Ljava/lang/String;)V
    //   1114: aload_3
    //   1115: aload_2
    //   1116: invokevirtual toString : ()Ljava/lang/String;
    //   1119: invokevirtual println : (Ljava/lang/String;)V
    //   1122: iinc #5, 1
    //   1125: goto -> 1069
    //   1128: aload_0
    //   1129: getfield i : Ljava/util/ArrayList;
    //   1132: astore_2
    //   1133: aload_2
    //   1134: ifnull -> 1230
    //   1137: aload_2
    //   1138: invokevirtual size : ()I
    //   1141: istore #7
    //   1143: iload #7
    //   1145: ifle -> 1230
    //   1148: aload_3
    //   1149: aload_1
    //   1150: invokevirtual print : (Ljava/lang/String;)V
    //   1153: aload_3
    //   1154: ldc_w 'Back Stack:'
    //   1157: invokevirtual println : (Ljava/lang/String;)V
    //   1160: iconst_0
    //   1161: istore #5
    //   1163: iload #5
    //   1165: iload #7
    //   1167: if_icmpge -> 1230
    //   1170: aload_0
    //   1171: getfield i : Ljava/util/ArrayList;
    //   1174: iload #5
    //   1176: invokevirtual get : (I)Ljava/lang/Object;
    //   1179: checkcast b/l/a/a
    //   1182: astore_2
    //   1183: aload_3
    //   1184: aload_1
    //   1185: invokevirtual print : (Ljava/lang/String;)V
    //   1188: aload_3
    //   1189: ldc_w '  #'
    //   1192: invokevirtual print : (Ljava/lang/String;)V
    //   1195: aload_3
    //   1196: iload #5
    //   1198: invokevirtual print : (I)V
    //   1201: aload_3
    //   1202: ldc_w ': '
    //   1205: invokevirtual print : (Ljava/lang/String;)V
    //   1208: aload_3
    //   1209: aload_2
    //   1210: invokevirtual toString : ()Ljava/lang/String;
    //   1213: invokevirtual println : (Ljava/lang/String;)V
    //   1216: aload_2
    //   1217: aload #10
    //   1219: aload_3
    //   1220: iconst_1
    //   1221: invokevirtual j : (Ljava/lang/String;Ljava/io/PrintWriter;Z)V
    //   1224: iinc #5, 1
    //   1227: goto -> 1163
    //   1230: aload_0
    //   1231: monitorenter
    //   1232: aload_0
    //   1233: getfield m : Ljava/util/ArrayList;
    //   1236: ifnull -> 1324
    //   1239: aload_0
    //   1240: getfield m : Ljava/util/ArrayList;
    //   1243: invokevirtual size : ()I
    //   1246: istore #7
    //   1248: iload #7
    //   1250: ifle -> 1324
    //   1253: aload_3
    //   1254: aload_1
    //   1255: invokevirtual print : (Ljava/lang/String;)V
    //   1258: aload_3
    //   1259: ldc_w 'Back Stack Indices:'
    //   1262: invokevirtual println : (Ljava/lang/String;)V
    //   1265: iconst_0
    //   1266: istore #5
    //   1268: iload #5
    //   1270: iload #7
    //   1272: if_icmpge -> 1324
    //   1275: aload_0
    //   1276: getfield m : Ljava/util/ArrayList;
    //   1279: iload #5
    //   1281: invokevirtual get : (I)Ljava/lang/Object;
    //   1284: checkcast b/l/a/a
    //   1287: astore_2
    //   1288: aload_3
    //   1289: aload_1
    //   1290: invokevirtual print : (Ljava/lang/String;)V
    //   1293: aload_3
    //   1294: ldc_w '  #'
    //   1297: invokevirtual print : (Ljava/lang/String;)V
    //   1300: aload_3
    //   1301: iload #5
    //   1303: invokevirtual print : (I)V
    //   1306: aload_3
    //   1307: ldc_w ': '
    //   1310: invokevirtual print : (Ljava/lang/String;)V
    //   1313: aload_3
    //   1314: aload_2
    //   1315: invokevirtual println : (Ljava/lang/Object;)V
    //   1318: iinc #5, 1
    //   1321: goto -> 1268
    //   1324: aload_0
    //   1325: getfield n : Ljava/util/ArrayList;
    //   1328: ifnull -> 1367
    //   1331: aload_0
    //   1332: getfield n : Ljava/util/ArrayList;
    //   1335: invokevirtual size : ()I
    //   1338: ifle -> 1367
    //   1341: aload_3
    //   1342: aload_1
    //   1343: invokevirtual print : (Ljava/lang/String;)V
    //   1346: aload_3
    //   1347: ldc_w 'mAvailBackStackIndices: '
    //   1350: invokevirtual print : (Ljava/lang/String;)V
    //   1353: aload_3
    //   1354: aload_0
    //   1355: getfield n : Ljava/util/ArrayList;
    //   1358: invokevirtual toArray : ()[Ljava/lang/Object;
    //   1361: invokestatic toString : ([Ljava/lang/Object;)Ljava/lang/String;
    //   1364: invokevirtual println : (Ljava/lang/String;)V
    //   1367: aload_0
    //   1368: monitorexit
    //   1369: aload_0
    //   1370: getfield d : Ljava/util/ArrayList;
    //   1373: astore_2
    //   1374: aload_2
    //   1375: ifnull -> 1461
    //   1378: aload_2
    //   1379: invokevirtual size : ()I
    //   1382: istore #7
    //   1384: iload #7
    //   1386: ifle -> 1461
    //   1389: aload_3
    //   1390: aload_1
    //   1391: invokevirtual print : (Ljava/lang/String;)V
    //   1394: aload_3
    //   1395: ldc_w 'Pending Actions:'
    //   1398: invokevirtual println : (Ljava/lang/String;)V
    //   1401: iload #6
    //   1403: istore #5
    //   1405: iload #5
    //   1407: iload #7
    //   1409: if_icmpge -> 1461
    //   1412: aload_0
    //   1413: getfield d : Ljava/util/ArrayList;
    //   1416: iload #5
    //   1418: invokevirtual get : (I)Ljava/lang/Object;
    //   1421: checkcast b/l/a/k$h
    //   1424: astore_2
    //   1425: aload_3
    //   1426: aload_1
    //   1427: invokevirtual print : (Ljava/lang/String;)V
    //   1430: aload_3
    //   1431: ldc_w '  #'
    //   1434: invokevirtual print : (Ljava/lang/String;)V
    //   1437: aload_3
    //   1438: iload #5
    //   1440: invokevirtual print : (I)V
    //   1443: aload_3
    //   1444: ldc_w ': '
    //   1447: invokevirtual print : (Ljava/lang/String;)V
    //   1450: aload_3
    //   1451: aload_2
    //   1452: invokevirtual println : (Ljava/lang/Object;)V
    //   1455: iinc #5, 1
    //   1458: goto -> 1405
    //   1461: aload_3
    //   1462: aload_1
    //   1463: invokevirtual print : (Ljava/lang/String;)V
    //   1466: aload_3
    //   1467: ldc_w 'FragmentManager misc state:'
    //   1470: invokevirtual println : (Ljava/lang/String;)V
    //   1473: aload_3
    //   1474: aload_1
    //   1475: invokevirtual print : (Ljava/lang/String;)V
    //   1478: aload_3
    //   1479: ldc_w '  mHost='
    //   1482: invokevirtual print : (Ljava/lang/String;)V
    //   1485: aload_3
    //   1486: aload_0
    //   1487: getfield q : Lb/l/a/i;
    //   1490: invokevirtual println : (Ljava/lang/Object;)V
    //   1493: aload_3
    //   1494: aload_1
    //   1495: invokevirtual print : (Ljava/lang/String;)V
    //   1498: aload_3
    //   1499: ldc_w '  mContainer='
    //   1502: invokevirtual print : (Ljava/lang/String;)V
    //   1505: aload_3
    //   1506: aload_0
    //   1507: getfield r : Lb/l/a/f;
    //   1510: invokevirtual println : (Ljava/lang/Object;)V
    //   1513: aload_0
    //   1514: getfield s : Landroidx/fragment/app/Fragment;
    //   1517: ifnull -> 1540
    //   1520: aload_3
    //   1521: aload_1
    //   1522: invokevirtual print : (Ljava/lang/String;)V
    //   1525: aload_3
    //   1526: ldc_w '  mParent='
    //   1529: invokevirtual print : (Ljava/lang/String;)V
    //   1532: aload_3
    //   1533: aload_0
    //   1534: getfield s : Landroidx/fragment/app/Fragment;
    //   1537: invokevirtual println : (Ljava/lang/Object;)V
    //   1540: aload_3
    //   1541: aload_1
    //   1542: invokevirtual print : (Ljava/lang/String;)V
    //   1545: aload_3
    //   1546: ldc_w '  mCurState='
    //   1549: invokevirtual print : (Ljava/lang/String;)V
    //   1552: aload_3
    //   1553: aload_0
    //   1554: getfield p : I
    //   1557: invokevirtual print : (I)V
    //   1560: aload_3
    //   1561: ldc_w ' mStateSaved='
    //   1564: invokevirtual print : (Ljava/lang/String;)V
    //   1567: aload_3
    //   1568: aload_0
    //   1569: getfield v : Z
    //   1572: invokevirtual print : (Z)V
    //   1575: aload_3
    //   1576: ldc_w ' mStopped='
    //   1579: invokevirtual print : (Ljava/lang/String;)V
    //   1582: aload_3
    //   1583: aload_0
    //   1584: getfield w : Z
    //   1587: invokevirtual print : (Z)V
    //   1590: aload_3
    //   1591: ldc_w ' mDestroyed='
    //   1594: invokevirtual print : (Ljava/lang/String;)V
    //   1597: aload_3
    //   1598: aload_0
    //   1599: getfield x : Z
    //   1602: invokevirtual println : (Z)V
    //   1605: aload_0
    //   1606: getfield u : Z
    //   1609: ifeq -> 1632
    //   1612: aload_3
    //   1613: aload_1
    //   1614: invokevirtual print : (Ljava/lang/String;)V
    //   1617: aload_3
    //   1618: ldc_w '  mNeedMenuInvalidate='
    //   1621: invokevirtual print : (Ljava/lang/String;)V
    //   1624: aload_3
    //   1625: aload_0
    //   1626: getfield u : Z
    //   1629: invokevirtual println : (Z)V
    //   1632: return
    //   1633: astore_1
    //   1634: aload_0
    //   1635: monitorexit
    //   1636: aload_1
    //   1637: athrow
    // Exception table:
    //   from	to	target	type
    //   1232	1248	1633	finally
    //   1253	1265	1633	finally
    //   1275	1318	1633	finally
    //   1324	1367	1633	finally
    //   1367	1369	1633	finally
    //   1634	1636	1633	finally
  }
  
  public Fragment b(String paramString) {
    int m = this.g.size();
    while (true) {
      int n = m - 1;
      if (n >= 0) {
        Fragment fragment = this.g.get(n);
        m = n;
        if (fragment != null) {
          m = n;
          if (paramString.equals(fragment.y))
            return fragment; 
        } 
        continue;
      } 
      for (Fragment fragment : this.h.values()) {
        if (fragment != null && paramString.equals(fragment.y))
          return fragment; 
      } 
      return null;
    } 
  }
  
  public void b0(Fragment paramFragment) {
    // Byte code:
    //   0: aload_1
    //   1: ifnonnull -> 5
    //   4: return
    //   5: aload_0
    //   6: getfield h : Ljava/util/HashMap;
    //   9: aload_1
    //   10: getfield f : Ljava/lang/String;
    //   13: invokevirtual containsKey : (Ljava/lang/Object;)Z
    //   16: ifne -> 20
    //   19: return
    //   20: aload_0
    //   21: getfield p : I
    //   24: istore #4
    //   26: iload #4
    //   28: istore_3
    //   29: aload_1
    //   30: getfield m : Z
    //   33: ifeq -> 60
    //   36: aload_1
    //   37: invokevirtual x : ()Z
    //   40: ifeq -> 53
    //   43: iload #4
    //   45: iconst_1
    //   46: invokestatic min : (II)I
    //   49: istore_3
    //   50: goto -> 60
    //   53: iload #4
    //   55: iconst_0
    //   56: invokestatic min : (II)I
    //   59: istore_3
    //   60: aload_0
    //   61: aload_1
    //   62: iload_3
    //   63: aload_1
    //   64: invokevirtual o : ()I
    //   67: aload_1
    //   68: invokevirtual p : ()I
    //   71: iconst_0
    //   72: invokevirtual d0 : (Landroidx/fragment/app/Fragment;IIIZ)V
    //   75: aload_1
    //   76: getfield G : Landroid/view/View;
    //   79: astore #8
    //   81: aload #8
    //   83: ifnull -> 345
    //   86: aload_1
    //   87: getfield F : Landroid/view/ViewGroup;
    //   90: astore #7
    //   92: aconst_null
    //   93: astore #6
    //   95: aload #6
    //   97: astore #5
    //   99: aload #7
    //   101: ifnull -> 177
    //   104: aload #8
    //   106: ifnonnull -> 116
    //   109: aload #6
    //   111: astore #5
    //   113: goto -> 177
    //   116: aload_0
    //   117: getfield g : Ljava/util/ArrayList;
    //   120: aload_1
    //   121: invokevirtual indexOf : (Ljava/lang/Object;)I
    //   124: istore_3
    //   125: iload_3
    //   126: iconst_1
    //   127: isub
    //   128: istore #4
    //   130: aload #6
    //   132: astore #5
    //   134: iload #4
    //   136: iflt -> 177
    //   139: aload_0
    //   140: getfield g : Ljava/util/ArrayList;
    //   143: iload #4
    //   145: invokevirtual get : (I)Ljava/lang/Object;
    //   148: checkcast androidx/fragment/app/Fragment
    //   151: astore #5
    //   153: iload #4
    //   155: istore_3
    //   156: aload #5
    //   158: getfield F : Landroid/view/ViewGroup;
    //   161: aload #7
    //   163: if_acmpne -> 125
    //   166: iload #4
    //   168: istore_3
    //   169: aload #5
    //   171: getfield G : Landroid/view/View;
    //   174: ifnull -> 125
    //   177: aload #5
    //   179: ifnull -> 237
    //   182: aload #5
    //   184: getfield G : Landroid/view/View;
    //   187: astore #6
    //   189: aload_1
    //   190: getfield F : Landroid/view/ViewGroup;
    //   193: astore #5
    //   195: aload #5
    //   197: aload #6
    //   199: invokevirtual indexOfChild : (Landroid/view/View;)I
    //   202: istore_3
    //   203: aload #5
    //   205: aload_1
    //   206: getfield G : Landroid/view/View;
    //   209: invokevirtual indexOfChild : (Landroid/view/View;)I
    //   212: istore #4
    //   214: iload #4
    //   216: iload_3
    //   217: if_icmpge -> 237
    //   220: aload #5
    //   222: iload #4
    //   224: invokevirtual removeViewAt : (I)V
    //   227: aload #5
    //   229: aload_1
    //   230: getfield G : Landroid/view/View;
    //   233: iload_3
    //   234: invokevirtual addView : (Landroid/view/View;I)V
    //   237: aload_1
    //   238: getfield L : Z
    //   241: ifeq -> 345
    //   244: aload_1
    //   245: getfield F : Landroid/view/ViewGroup;
    //   248: ifnull -> 345
    //   251: aload_1
    //   252: getfield N : F
    //   255: fstore_2
    //   256: fload_2
    //   257: fconst_0
    //   258: fcmpl
    //   259: ifle -> 270
    //   262: aload_1
    //   263: getfield G : Landroid/view/View;
    //   266: fload_2
    //   267: invokevirtual setAlpha : (F)V
    //   270: aload_1
    //   271: fconst_0
    //   272: putfield N : F
    //   275: aload_1
    //   276: iconst_0
    //   277: putfield L : Z
    //   280: aload_0
    //   281: aload_1
    //   282: aload_1
    //   283: invokevirtual o : ()I
    //   286: iconst_1
    //   287: aload_1
    //   288: invokevirtual p : ()I
    //   291: invokevirtual Y : (Landroidx/fragment/app/Fragment;IZI)Lb/l/a/k$d;
    //   294: astore #5
    //   296: aload #5
    //   298: ifnull -> 345
    //   301: aload #5
    //   303: getfield a : Landroid/view/animation/Animation;
    //   306: astore #6
    //   308: aload #6
    //   310: ifnull -> 325
    //   313: aload_1
    //   314: getfield G : Landroid/view/View;
    //   317: aload #6
    //   319: invokevirtual startAnimation : (Landroid/view/animation/Animation;)V
    //   322: goto -> 345
    //   325: aload #5
    //   327: getfield b : Landroid/animation/Animator;
    //   330: aload_1
    //   331: getfield G : Landroid/view/View;
    //   334: invokevirtual setTarget : (Ljava/lang/Object;)V
    //   337: aload #5
    //   339: getfield b : Landroid/animation/Animator;
    //   342: invokevirtual start : ()V
    //   345: aload_1
    //   346: getfield M : Z
    //   349: ifeq -> 582
    //   352: aload_1
    //   353: getfield G : Landroid/view/View;
    //   356: ifnull -> 557
    //   359: aload_0
    //   360: aload_1
    //   361: aload_1
    //   362: invokevirtual o : ()I
    //   365: aload_1
    //   366: getfield z : Z
    //   369: iconst_1
    //   370: ixor
    //   371: aload_1
    //   372: invokevirtual p : ()I
    //   375: invokevirtual Y : (Landroidx/fragment/app/Fragment;IZI)Lb/l/a/k$d;
    //   378: astore #5
    //   380: aload #5
    //   382: ifnull -> 490
    //   385: aload #5
    //   387: getfield b : Landroid/animation/Animator;
    //   390: astore #6
    //   392: aload #6
    //   394: ifnull -> 490
    //   397: aload #6
    //   399: aload_1
    //   400: getfield G : Landroid/view/View;
    //   403: invokevirtual setTarget : (Ljava/lang/Object;)V
    //   406: aload_1
    //   407: getfield z : Z
    //   410: ifeq -> 471
    //   413: aload_1
    //   414: invokevirtual w : ()Z
    //   417: ifeq -> 428
    //   420: aload_1
    //   421: iconst_0
    //   422: invokevirtual U : (Z)V
    //   425: goto -> 479
    //   428: aload_1
    //   429: getfield F : Landroid/view/ViewGroup;
    //   432: astore #6
    //   434: aload_1
    //   435: getfield G : Landroid/view/View;
    //   438: astore #7
    //   440: aload #6
    //   442: aload #7
    //   444: invokevirtual startViewTransition : (Landroid/view/View;)V
    //   447: aload #5
    //   449: getfield b : Landroid/animation/Animator;
    //   452: new b/l/a/n
    //   455: dup
    //   456: aload_0
    //   457: aload #6
    //   459: aload #7
    //   461: aload_1
    //   462: invokespecial <init> : (Lb/l/a/k;Landroid/view/ViewGroup;Landroid/view/View;Landroidx/fragment/app/Fragment;)V
    //   465: invokevirtual addListener : (Landroid/animation/Animator$AnimatorListener;)V
    //   468: goto -> 479
    //   471: aload_1
    //   472: getfield G : Landroid/view/View;
    //   475: iconst_0
    //   476: invokevirtual setVisibility : (I)V
    //   479: aload #5
    //   481: getfield b : Landroid/animation/Animator;
    //   484: invokevirtual start : ()V
    //   487: goto -> 557
    //   490: aload #5
    //   492: ifnull -> 515
    //   495: aload_1
    //   496: getfield G : Landroid/view/View;
    //   499: aload #5
    //   501: getfield a : Landroid/view/animation/Animation;
    //   504: invokevirtual startAnimation : (Landroid/view/animation/Animation;)V
    //   507: aload #5
    //   509: getfield a : Landroid/view/animation/Animation;
    //   512: invokevirtual start : ()V
    //   515: aload_1
    //   516: getfield z : Z
    //   519: ifeq -> 535
    //   522: aload_1
    //   523: invokevirtual w : ()Z
    //   526: ifne -> 535
    //   529: bipush #8
    //   531: istore_3
    //   532: goto -> 537
    //   535: iconst_0
    //   536: istore_3
    //   537: aload_1
    //   538: getfield G : Landroid/view/View;
    //   541: iload_3
    //   542: invokevirtual setVisibility : (I)V
    //   545: aload_1
    //   546: invokevirtual w : ()Z
    //   549: ifeq -> 557
    //   552: aload_1
    //   553: iconst_0
    //   554: invokevirtual U : (Z)V
    //   557: aload_1
    //   558: getfield l : Z
    //   561: ifeq -> 577
    //   564: aload_0
    //   565: aload_1
    //   566: invokevirtual W : (Landroidx/fragment/app/Fragment;)Z
    //   569: ifeq -> 577
    //   572: aload_0
    //   573: iconst_1
    //   574: putfield u : Z
    //   577: aload_1
    //   578: iconst_0
    //   579: putfield M : Z
    //   582: return
  }
  
  public boolean c() {
    return (this.v || this.w);
  }
  
  public void c0(int paramInt, boolean paramBoolean) {
    if (this.q != null || paramInt == 0) {
      if (!paramBoolean && paramInt == this.p)
        return; 
      this.p = paramInt;
      int m = this.g.size();
      for (paramInt = 0; paramInt < m; paramInt++)
        b0(this.g.get(paramInt)); 
      for (Fragment fragment : this.h.values()) {
        if (fragment != null && (fragment.m || fragment.A) && !fragment.L)
          b0(fragment); 
      } 
      q0();
      if (this.u) {
        i i1 = this.q;
        if (i1 != null && this.p == 4) {
          ((e.a)i1).g.p();
          this.u = false;
        } 
      } 
      return;
    } 
    throw new IllegalStateException("No activity");
  }
  
  public boolean d() {
    i();
    P();
    boolean bool = true;
    O(true);
    Fragment fragment = this.t;
    if (fragment == null || !fragment.j().d()) {
      bool = f0(this.z, this.A, null, -1, 0);
      if (bool) {
        this.e = true;
        try {
          h0(this.z, this.A);
        } finally {
          j();
        } 
      } 
      s0();
      if (this.y) {
        this.y = false;
        q0();
      } 
      this.h.values().removeAll(Collections.singleton(null));
    } 
    return bool;
  }
  
  public void d0(Fragment paramFragment, int paramInt1, int paramInt2, int paramInt3, boolean paramBoolean) {
    // Byte code:
    //   0: aload_1
    //   1: getfield l : Z
    //   4: istore #9
    //   6: iconst_1
    //   7: istore #7
    //   9: iload #9
    //   11: ifeq -> 30
    //   14: aload_1
    //   15: getfield A : Z
    //   18: ifeq -> 24
    //   21: goto -> 30
    //   24: iload_2
    //   25: istore #6
    //   27: goto -> 41
    //   30: iload_2
    //   31: istore #6
    //   33: iload_2
    //   34: iconst_1
    //   35: if_icmple -> 41
    //   38: iconst_1
    //   39: istore #6
    //   41: iload #6
    //   43: istore_2
    //   44: aload_1
    //   45: getfield m : Z
    //   48: ifeq -> 89
    //   51: aload_1
    //   52: getfield b : I
    //   55: istore #8
    //   57: iload #6
    //   59: istore_2
    //   60: iload #6
    //   62: iload #8
    //   64: if_icmple -> 89
    //   67: iload #8
    //   69: ifne -> 84
    //   72: aload_1
    //   73: invokevirtual x : ()Z
    //   76: ifeq -> 84
    //   79: iconst_1
    //   80: istore_2
    //   81: goto -> 89
    //   84: aload_1
    //   85: getfield b : I
    //   88: istore_2
    //   89: iload_2
    //   90: istore #6
    //   92: aload_1
    //   93: getfield I : Z
    //   96: ifeq -> 121
    //   99: iload_2
    //   100: istore #6
    //   102: aload_1
    //   103: getfield b : I
    //   106: iconst_3
    //   107: if_icmpge -> 121
    //   110: iload_2
    //   111: istore #6
    //   113: iload_2
    //   114: iconst_2
    //   115: if_icmple -> 121
    //   118: iconst_2
    //   119: istore #6
    //   121: aload_1
    //   122: getfield Q : Lb/n/d$b;
    //   125: astore #10
    //   127: aload #10
    //   129: getstatic b/n/d$b.d : Lb/n/d$b;
    //   132: if_acmpne -> 145
    //   135: iload #6
    //   137: iconst_1
    //   138: invokestatic min : (II)I
    //   141: istore_2
    //   142: goto -> 156
    //   145: iload #6
    //   147: aload #10
    //   149: invokevirtual ordinal : ()I
    //   152: invokestatic min : (II)I
    //   155: istore_2
    //   156: aload_1
    //   157: getfield b : I
    //   160: istore #8
    //   162: iload #8
    //   164: iload_2
    //   165: if_icmpgt -> 2000
    //   168: aload_1
    //   169: getfield n : Z
    //   172: ifeq -> 183
    //   175: aload_1
    //   176: getfield o : Z
    //   179: ifne -> 183
    //   182: return
    //   183: aload_1
    //   184: invokevirtual h : ()Landroid/view/View;
    //   187: ifnonnull -> 197
    //   190: aload_1
    //   191: invokevirtual i : ()Landroid/animation/Animator;
    //   194: ifnull -> 219
    //   197: aload_1
    //   198: aconst_null
    //   199: invokevirtual R : (Landroid/view/View;)V
    //   202: aload_1
    //   203: aconst_null
    //   204: invokevirtual S : (Landroid/animation/Animator;)V
    //   207: aload_0
    //   208: aload_1
    //   209: aload_1
    //   210: invokevirtual s : ()I
    //   213: iconst_0
    //   214: iconst_0
    //   215: iconst_1
    //   216: invokevirtual d0 : (Landroidx/fragment/app/Fragment;IIIZ)V
    //   219: aload_1
    //   220: getfield b : I
    //   223: istore #6
    //   225: iload #6
    //   227: ifeq -> 262
    //   230: iload_2
    //   231: istore #4
    //   233: iload #6
    //   235: iconst_1
    //   236: if_icmpeq -> 1103
    //   239: iload_2
    //   240: istore_3
    //   241: iload #6
    //   243: iconst_2
    //   244: if_icmpeq -> 1707
    //   247: iload_2
    //   248: istore #4
    //   250: iload #6
    //   252: iconst_3
    //   253: if_icmpeq -> 1843
    //   256: iload_2
    //   257: istore #6
    //   259: goto -> 3480
    //   262: iload_2
    //   263: istore #4
    //   265: iload_2
    //   266: ifle -> 1103
    //   269: aload_1
    //   270: getfield c : Landroid/os/Bundle;
    //   273: astore #10
    //   275: iload_2
    //   276: istore #4
    //   278: aload #10
    //   280: ifnull -> 526
    //   283: aload #10
    //   285: aload_0
    //   286: getfield q : Lb/l/a/i;
    //   289: getfield c : Landroid/content/Context;
    //   292: invokevirtual getClassLoader : ()Ljava/lang/ClassLoader;
    //   295: invokevirtual setClassLoader : (Ljava/lang/ClassLoader;)V
    //   298: aload_1
    //   299: aload_1
    //   300: getfield c : Landroid/os/Bundle;
    //   303: ldc_w 'android:view_state'
    //   306: invokevirtual getSparseParcelableArray : (Ljava/lang/String;)Landroid/util/SparseArray;
    //   309: putfield d : Landroid/util/SparseArray;
    //   312: aload_1
    //   313: getfield c : Landroid/os/Bundle;
    //   316: ldc_w 'android:target_state'
    //   319: invokevirtual getString : (Ljava/lang/String;)Ljava/lang/String;
    //   322: astore #11
    //   324: aload #11
    //   326: ifnonnull -> 335
    //   329: aconst_null
    //   330: astore #10
    //   332: goto -> 354
    //   335: aload_0
    //   336: getfield h : Ljava/util/HashMap;
    //   339: aload #11
    //   341: invokevirtual get : (Ljava/lang/Object;)Ljava/lang/Object;
    //   344: checkcast androidx/fragment/app/Fragment
    //   347: astore #10
    //   349: aload #10
    //   351: ifnull -> 470
    //   354: aload #10
    //   356: ifnull -> 369
    //   359: aload #10
    //   361: getfield f : Ljava/lang/String;
    //   364: astore #10
    //   366: goto -> 372
    //   369: aconst_null
    //   370: astore #10
    //   372: aload_1
    //   373: aload #10
    //   375: putfield i : Ljava/lang/String;
    //   378: aload #10
    //   380: ifnull -> 398
    //   383: aload_1
    //   384: aload_1
    //   385: getfield c : Landroid/os/Bundle;
    //   388: ldc_w 'android:target_req_state'
    //   391: iconst_0
    //   392: invokevirtual getInt : (Ljava/lang/String;I)I
    //   395: putfield j : I
    //   398: aload_1
    //   399: getfield e : Ljava/lang/Boolean;
    //   402: astore #10
    //   404: aload #10
    //   406: ifnull -> 426
    //   409: aload_1
    //   410: aload #10
    //   412: invokevirtual booleanValue : ()Z
    //   415: putfield J : Z
    //   418: aload_1
    //   419: aconst_null
    //   420: putfield e : Ljava/lang/Boolean;
    //   423: goto -> 441
    //   426: aload_1
    //   427: aload_1
    //   428: getfield c : Landroid/os/Bundle;
    //   431: ldc_w 'android:user_visible_hint'
    //   434: iconst_1
    //   435: invokevirtual getBoolean : (Ljava/lang/String;Z)Z
    //   438: putfield J : Z
    //   441: iload_2
    //   442: istore #4
    //   444: aload_1
    //   445: getfield J : Z
    //   448: ifne -> 526
    //   451: aload_1
    //   452: iconst_1
    //   453: putfield I : Z
    //   456: iload_2
    //   457: istore #4
    //   459: iload_2
    //   460: iconst_2
    //   461: if_icmple -> 526
    //   464: iconst_2
    //   465: istore #4
    //   467: goto -> 526
    //   470: new java/lang/StringBuilder
    //   473: dup
    //   474: invokespecial <init> : ()V
    //   477: astore_1
    //   478: aload_1
    //   479: ldc_w 'Fragment no longer exists for key '
    //   482: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   485: pop
    //   486: aload_1
    //   487: ldc_w 'android:target_state'
    //   490: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   493: pop
    //   494: aload_1
    //   495: ldc_w ': unique id '
    //   498: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   501: pop
    //   502: aload_1
    //   503: aload #11
    //   505: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   508: pop
    //   509: aload_0
    //   510: new java/lang/IllegalStateException
    //   513: dup
    //   514: aload_1
    //   515: invokevirtual toString : ()Ljava/lang/String;
    //   518: invokespecial <init> : (Ljava/lang/String;)V
    //   521: invokevirtual r0 : (Ljava/lang/RuntimeException;)V
    //   524: aconst_null
    //   525: athrow
    //   526: aload_0
    //   527: getfield q : Lb/l/a/i;
    //   530: astore #11
    //   532: aload_1
    //   533: aload #11
    //   535: putfield t : Lb/l/a/i;
    //   538: aload_0
    //   539: getfield s : Landroidx/fragment/app/Fragment;
    //   542: astore #10
    //   544: aload_1
    //   545: aload #10
    //   547: putfield v : Landroidx/fragment/app/Fragment;
    //   550: aload #10
    //   552: ifnull -> 565
    //   555: aload #10
    //   557: getfield u : Lb/l/a/k;
    //   560: astore #10
    //   562: goto -> 572
    //   565: aload #11
    //   567: getfield f : Lb/l/a/k;
    //   570: astore #10
    //   572: aload_1
    //   573: aload #10
    //   575: putfield s : Lb/l/a/k;
    //   578: aload_1
    //   579: getfield h : Landroidx/fragment/app/Fragment;
    //   582: astore #10
    //   584: aload #10
    //   586: ifnull -> 720
    //   589: aload_0
    //   590: getfield h : Ljava/util/HashMap;
    //   593: aload #10
    //   595: getfield f : Ljava/lang/String;
    //   598: invokevirtual get : (Ljava/lang/Object;)Ljava/lang/Object;
    //   601: astore #10
    //   603: aload_1
    //   604: getfield h : Landroidx/fragment/app/Fragment;
    //   607: astore #11
    //   609: aload #10
    //   611: aload #11
    //   613: if_acmpne -> 654
    //   616: aload #11
    //   618: getfield b : I
    //   621: iconst_1
    //   622: if_icmpge -> 635
    //   625: aload_0
    //   626: aload #11
    //   628: iconst_1
    //   629: iconst_0
    //   630: iconst_0
    //   631: iconst_1
    //   632: invokevirtual d0 : (Landroidx/fragment/app/Fragment;IIIZ)V
    //   635: aload_1
    //   636: aload_1
    //   637: getfield h : Landroidx/fragment/app/Fragment;
    //   640: getfield f : Ljava/lang/String;
    //   643: putfield i : Ljava/lang/String;
    //   646: aload_1
    //   647: aconst_null
    //   648: putfield h : Landroidx/fragment/app/Fragment;
    //   651: goto -> 720
    //   654: new java/lang/StringBuilder
    //   657: dup
    //   658: invokespecial <init> : ()V
    //   661: astore #10
    //   663: aload #10
    //   665: ldc_w 'Fragment '
    //   668: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   671: pop
    //   672: aload #10
    //   674: aload_1
    //   675: invokevirtual append : (Ljava/lang/Object;)Ljava/lang/StringBuilder;
    //   678: pop
    //   679: aload #10
    //   681: ldc_w ' declared target fragment '
    //   684: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   687: pop
    //   688: aload #10
    //   690: aload_1
    //   691: getfield h : Landroidx/fragment/app/Fragment;
    //   694: invokevirtual append : (Ljava/lang/Object;)Ljava/lang/StringBuilder;
    //   697: pop
    //   698: aload #10
    //   700: ldc_w ' that does not belong to this FragmentManager!'
    //   703: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   706: pop
    //   707: new java/lang/IllegalStateException
    //   710: dup
    //   711: aload #10
    //   713: invokevirtual toString : ()Ljava/lang/String;
    //   716: invokespecial <init> : (Ljava/lang/String;)V
    //   719: athrow
    //   720: aload_1
    //   721: getfield i : Ljava/lang/String;
    //   724: astore #10
    //   726: aload #10
    //   728: ifnull -> 838
    //   731: aload_0
    //   732: getfield h : Ljava/util/HashMap;
    //   735: aload #10
    //   737: invokevirtual get : (Ljava/lang/Object;)Ljava/lang/Object;
    //   740: checkcast androidx/fragment/app/Fragment
    //   743: astore #10
    //   745: aload #10
    //   747: ifnull -> 772
    //   750: aload #10
    //   752: getfield b : I
    //   755: iconst_1
    //   756: if_icmpge -> 838
    //   759: aload_0
    //   760: aload #10
    //   762: iconst_1
    //   763: iconst_0
    //   764: iconst_0
    //   765: iconst_1
    //   766: invokevirtual d0 : (Landroidx/fragment/app/Fragment;IIIZ)V
    //   769: goto -> 838
    //   772: new java/lang/StringBuilder
    //   775: dup
    //   776: invokespecial <init> : ()V
    //   779: astore #10
    //   781: aload #10
    //   783: ldc_w 'Fragment '
    //   786: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   789: pop
    //   790: aload #10
    //   792: aload_1
    //   793: invokevirtual append : (Ljava/lang/Object;)Ljava/lang/StringBuilder;
    //   796: pop
    //   797: aload #10
    //   799: ldc_w ' declared target fragment '
    //   802: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   805: pop
    //   806: aload #10
    //   808: aload_1
    //   809: getfield i : Ljava/lang/String;
    //   812: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   815: pop
    //   816: aload #10
    //   818: ldc_w ' that does not belong to this FragmentManager!'
    //   821: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   824: pop
    //   825: new java/lang/IllegalStateException
    //   828: dup
    //   829: aload #10
    //   831: invokevirtual toString : ()Ljava/lang/String;
    //   834: invokespecial <init> : (Ljava/lang/String;)V
    //   837: athrow
    //   838: aload_0
    //   839: aload_1
    //   840: aload_0
    //   841: getfield q : Lb/l/a/i;
    //   844: getfield c : Landroid/content/Context;
    //   847: iconst_0
    //   848: invokevirtual z : (Landroidx/fragment/app/Fragment;Landroid/content/Context;Z)V
    //   851: aload_1
    //   852: getfield u : Lb/l/a/k;
    //   855: aload_1
    //   856: getfield t : Lb/l/a/i;
    //   859: new b/l/a/d
    //   862: dup
    //   863: aload_1
    //   864: invokespecial <init> : (Landroidx/fragment/app/Fragment;)V
    //   867: aload_1
    //   868: invokevirtual g : (Lb/l/a/i;Lb/l/a/f;Landroidx/fragment/app/Fragment;)V
    //   871: aload_1
    //   872: iconst_0
    //   873: putfield E : Z
    //   876: aload_1
    //   877: aload_1
    //   878: getfield t : Lb/l/a/i;
    //   881: getfield c : Landroid/content/Context;
    //   884: invokevirtual z : (Landroid/content/Context;)V
    //   887: aload_1
    //   888: getfield E : Z
    //   891: ifeq -> 1085
    //   894: aload_1
    //   895: getfield v : Landroidx/fragment/app/Fragment;
    //   898: ifnonnull -> 914
    //   901: aload_0
    //   902: getfield q : Lb/l/a/i;
    //   905: checkcast b/l/a/e$a
    //   908: getfield g : Lb/l/a/e;
    //   911: invokevirtual o : ()V
    //   914: aload_0
    //   915: aload_1
    //   916: aload_0
    //   917: getfield q : Lb/l/a/i;
    //   920: getfield c : Landroid/content/Context;
    //   923: iconst_0
    //   924: invokevirtual u : (Landroidx/fragment/app/Fragment;Landroid/content/Context;Z)V
    //   927: aload_1
    //   928: getfield P : Z
    //   931: ifne -> 1035
    //   934: aload_0
    //   935: aload_1
    //   936: aload_1
    //   937: getfield c : Landroid/os/Bundle;
    //   940: iconst_0
    //   941: invokevirtual A : (Landroidx/fragment/app/Fragment;Landroid/os/Bundle;Z)V
    //   944: aload_1
    //   945: getfield c : Landroid/os/Bundle;
    //   948: astore #10
    //   950: aload_1
    //   951: getfield u : Lb/l/a/k;
    //   954: invokevirtual e0 : ()V
    //   957: aload_1
    //   958: iconst_1
    //   959: putfield b : I
    //   962: aload_1
    //   963: iconst_0
    //   964: putfield E : Z
    //   967: aload_1
    //   968: getfield U : Lb/s/b;
    //   971: aload #10
    //   973: invokevirtual a : (Landroid/os/Bundle;)V
    //   976: aload_1
    //   977: aload #10
    //   979: invokevirtual A : (Landroid/os/Bundle;)V
    //   982: aload_1
    //   983: iconst_1
    //   984: putfield P : Z
    //   987: aload_1
    //   988: getfield E : Z
    //   991: ifeq -> 1017
    //   994: aload_1
    //   995: getfield R : Lb/n/h;
    //   998: getstatic b/n/d$a.ON_CREATE : Lb/n/d$a;
    //   1001: invokevirtual d : (Lb/n/d$a;)V
    //   1004: aload_0
    //   1005: aload_1
    //   1006: aload_1
    //   1007: getfield c : Landroid/os/Bundle;
    //   1010: iconst_0
    //   1011: invokevirtual v : (Landroidx/fragment/app/Fragment;Landroid/os/Bundle;Z)V
    //   1014: goto -> 1103
    //   1017: new b/l/a/d0
    //   1020: dup
    //   1021: ldc_w 'Fragment '
    //   1024: aload_1
    //   1025: ldc_w ' did not call through to super.onCreate()'
    //   1028: invokestatic b : (Ljava/lang/String;Landroidx/fragment/app/Fragment;Ljava/lang/String;)Ljava/lang/String;
    //   1031: invokespecial <init> : (Ljava/lang/String;)V
    //   1034: athrow
    //   1035: aload_1
    //   1036: getfield c : Landroid/os/Bundle;
    //   1039: astore #10
    //   1041: aload #10
    //   1043: ifnull -> 1077
    //   1046: aload #10
    //   1048: ldc_w 'android:support:fragments'
    //   1051: invokevirtual getParcelable : (Ljava/lang/String;)Landroid/os/Parcelable;
    //   1054: astore #10
    //   1056: aload #10
    //   1058: ifnull -> 1077
    //   1061: aload_1
    //   1062: getfield u : Lb/l/a/k;
    //   1065: aload #10
    //   1067: invokevirtual j0 : (Landroid/os/Parcelable;)V
    //   1070: aload_1
    //   1071: getfield u : Lb/l/a/k;
    //   1074: invokevirtual o : ()V
    //   1077: aload_1
    //   1078: iconst_1
    //   1079: putfield b : I
    //   1082: goto -> 1103
    //   1085: new b/l/a/d0
    //   1088: dup
    //   1089: ldc_w 'Fragment '
    //   1092: aload_1
    //   1093: ldc_w ' did not call through to super.onAttach()'
    //   1096: invokestatic b : (Ljava/lang/String;Landroidx/fragment/app/Fragment;Ljava/lang/String;)Ljava/lang/String;
    //   1099: invokespecial <init> : (Ljava/lang/String;)V
    //   1102: athrow
    //   1103: iload #4
    //   1105: ifle -> 1210
    //   1108: aload_1
    //   1109: getfield n : Z
    //   1112: ifeq -> 1210
    //   1115: aload_1
    //   1116: getfield q : Z
    //   1119: ifne -> 1210
    //   1122: aload_1
    //   1123: aload_1
    //   1124: getfield c : Landroid/os/Bundle;
    //   1127: invokevirtual E : (Landroid/os/Bundle;)Landroid/view/LayoutInflater;
    //   1130: astore #10
    //   1132: aload_1
    //   1133: aload #10
    //   1135: putfield O : Landroid/view/LayoutInflater;
    //   1138: aload_1
    //   1139: aload #10
    //   1141: aconst_null
    //   1142: aload_1
    //   1143: getfield c : Landroid/os/Bundle;
    //   1146: invokevirtual M : (Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)V
    //   1149: aload_1
    //   1150: getfield G : Landroid/view/View;
    //   1153: astore #10
    //   1155: aload #10
    //   1157: ifnull -> 1205
    //   1160: aload_1
    //   1161: aload #10
    //   1163: putfield H : Landroid/view/View;
    //   1166: aload #10
    //   1168: iconst_0
    //   1169: invokevirtual setSaveFromParentEnabled : (Z)V
    //   1172: aload_1
    //   1173: getfield z : Z
    //   1176: ifeq -> 1188
    //   1179: aload_1
    //   1180: getfield G : Landroid/view/View;
    //   1183: bipush #8
    //   1185: invokevirtual setVisibility : (I)V
    //   1188: aload_0
    //   1189: aload_1
    //   1190: aload_1
    //   1191: getfield G : Landroid/view/View;
    //   1194: aload_1
    //   1195: getfield c : Landroid/os/Bundle;
    //   1198: iconst_0
    //   1199: invokevirtual F : (Landroidx/fragment/app/Fragment;Landroid/view/View;Landroid/os/Bundle;Z)V
    //   1202: goto -> 1210
    //   1205: aload_1
    //   1206: aconst_null
    //   1207: putfield H : Landroid/view/View;
    //   1210: iload #4
    //   1212: istore_3
    //   1213: iload #4
    //   1215: iconst_1
    //   1216: if_icmple -> 1707
    //   1219: aload_1
    //   1220: getfield n : Z
    //   1223: ifne -> 1538
    //   1226: aload_1
    //   1227: getfield x : I
    //   1230: istore_2
    //   1231: iload_2
    //   1232: ifeq -> 1394
    //   1235: iload_2
    //   1236: iconst_m1
    //   1237: if_icmpeq -> 1371
    //   1240: aload_0
    //   1241: getfield r : Lb/l/a/f;
    //   1244: iload_2
    //   1245: invokevirtual b : (I)Landroid/view/View;
    //   1248: checkcast android/view/ViewGroup
    //   1251: astore #11
    //   1253: aload #11
    //   1255: astore #10
    //   1257: aload #11
    //   1259: ifnonnull -> 1397
    //   1262: aload_1
    //   1263: getfield p : Z
    //   1266: ifeq -> 1276
    //   1269: aload #11
    //   1271: astore #10
    //   1273: goto -> 1397
    //   1276: aload_1
    //   1277: invokevirtual q : ()Landroid/content/res/Resources;
    //   1280: aload_1
    //   1281: getfield x : I
    //   1284: invokevirtual getResourceName : (I)Ljava/lang/String;
    //   1287: astore #10
    //   1289: goto -> 1299
    //   1292: astore #10
    //   1294: ldc_w 'unknown'
    //   1297: astore #10
    //   1299: ldc_w 'No view found for id 0x'
    //   1302: invokestatic e : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   1305: astore #11
    //   1307: aload #11
    //   1309: aload_1
    //   1310: getfield x : I
    //   1313: invokestatic toHexString : (I)Ljava/lang/String;
    //   1316: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   1319: pop
    //   1320: aload #11
    //   1322: ldc_w ' ('
    //   1325: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   1328: pop
    //   1329: aload #11
    //   1331: aload #10
    //   1333: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   1336: pop
    //   1337: aload #11
    //   1339: ldc_w ') for fragment '
    //   1342: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   1345: pop
    //   1346: aload #11
    //   1348: aload_1
    //   1349: invokevirtual append : (Ljava/lang/Object;)Ljava/lang/StringBuilder;
    //   1352: pop
    //   1353: aload_0
    //   1354: new java/lang/IllegalArgumentException
    //   1357: dup
    //   1358: aload #11
    //   1360: invokevirtual toString : ()Ljava/lang/String;
    //   1363: invokespecial <init> : (Ljava/lang/String;)V
    //   1366: invokevirtual r0 : (Ljava/lang/RuntimeException;)V
    //   1369: aconst_null
    //   1370: athrow
    //   1371: aload_0
    //   1372: new java/lang/IllegalArgumentException
    //   1375: dup
    //   1376: ldc_w 'Cannot create fragment '
    //   1379: aload_1
    //   1380: ldc_w ' for a container view with no id'
    //   1383: invokestatic b : (Ljava/lang/String;Landroidx/fragment/app/Fragment;Ljava/lang/String;)Ljava/lang/String;
    //   1386: invokespecial <init> : (Ljava/lang/String;)V
    //   1389: invokevirtual r0 : (Ljava/lang/RuntimeException;)V
    //   1392: aconst_null
    //   1393: athrow
    //   1394: aconst_null
    //   1395: astore #10
    //   1397: aload_1
    //   1398: aload #10
    //   1400: putfield F : Landroid/view/ViewGroup;
    //   1403: aload_1
    //   1404: aload_1
    //   1405: getfield c : Landroid/os/Bundle;
    //   1408: invokevirtual E : (Landroid/os/Bundle;)Landroid/view/LayoutInflater;
    //   1411: astore #11
    //   1413: aload_1
    //   1414: aload #11
    //   1416: putfield O : Landroid/view/LayoutInflater;
    //   1419: aload_1
    //   1420: aload #11
    //   1422: aload #10
    //   1424: aload_1
    //   1425: getfield c : Landroid/os/Bundle;
    //   1428: invokevirtual M : (Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)V
    //   1431: aload_1
    //   1432: getfield G : Landroid/view/View;
    //   1435: astore #11
    //   1437: aload #11
    //   1439: ifnull -> 1533
    //   1442: aload_1
    //   1443: aload #11
    //   1445: putfield H : Landroid/view/View;
    //   1448: aload #11
    //   1450: iconst_0
    //   1451: invokevirtual setSaveFromParentEnabled : (Z)V
    //   1454: aload #10
    //   1456: ifnull -> 1468
    //   1459: aload #10
    //   1461: aload_1
    //   1462: getfield G : Landroid/view/View;
    //   1465: invokevirtual addView : (Landroid/view/View;)V
    //   1468: aload_1
    //   1469: getfield z : Z
    //   1472: ifeq -> 1484
    //   1475: aload_1
    //   1476: getfield G : Landroid/view/View;
    //   1479: bipush #8
    //   1481: invokevirtual setVisibility : (I)V
    //   1484: aload_0
    //   1485: aload_1
    //   1486: aload_1
    //   1487: getfield G : Landroid/view/View;
    //   1490: aload_1
    //   1491: getfield c : Landroid/os/Bundle;
    //   1494: iconst_0
    //   1495: invokevirtual F : (Landroidx/fragment/app/Fragment;Landroid/view/View;Landroid/os/Bundle;Z)V
    //   1498: aload_1
    //   1499: getfield G : Landroid/view/View;
    //   1502: invokevirtual getVisibility : ()I
    //   1505: ifne -> 1521
    //   1508: aload_1
    //   1509: getfield F : Landroid/view/ViewGroup;
    //   1512: ifnull -> 1521
    //   1515: iconst_1
    //   1516: istore #5
    //   1518: goto -> 1524
    //   1521: iconst_0
    //   1522: istore #5
    //   1524: aload_1
    //   1525: iload #5
    //   1527: putfield L : Z
    //   1530: goto -> 1538
    //   1533: aload_1
    //   1534: aconst_null
    //   1535: putfield H : Landroid/view/View;
    //   1538: aload_1
    //   1539: getfield c : Landroid/os/Bundle;
    //   1542: astore #10
    //   1544: aload_1
    //   1545: getfield u : Lb/l/a/k;
    //   1548: invokevirtual e0 : ()V
    //   1551: aload_1
    //   1552: iconst_2
    //   1553: putfield b : I
    //   1556: aload_1
    //   1557: iconst_0
    //   1558: putfield E : Z
    //   1561: aload_1
    //   1562: aload #10
    //   1564: invokevirtual y : (Landroid/os/Bundle;)V
    //   1567: aload_1
    //   1568: getfield E : Z
    //   1571: ifeq -> 1689
    //   1574: aload_1
    //   1575: getfield u : Lb/l/a/k;
    //   1578: astore #10
    //   1580: aload #10
    //   1582: iconst_0
    //   1583: putfield v : Z
    //   1586: aload #10
    //   1588: iconst_0
    //   1589: putfield w : Z
    //   1592: aload #10
    //   1594: iconst_2
    //   1595: invokevirtual M : (I)V
    //   1598: aload_0
    //   1599: aload_1
    //   1600: aload_1
    //   1601: getfield c : Landroid/os/Bundle;
    //   1604: iconst_0
    //   1605: invokevirtual t : (Landroidx/fragment/app/Fragment;Landroid/os/Bundle;Z)V
    //   1608: aload_1
    //   1609: getfield G : Landroid/view/View;
    //   1612: ifnull -> 1678
    //   1615: aload_1
    //   1616: getfield d : Landroid/util/SparseArray;
    //   1619: astore #10
    //   1621: aload #10
    //   1623: ifnull -> 1640
    //   1626: aload_1
    //   1627: getfield H : Landroid/view/View;
    //   1630: aload #10
    //   1632: invokevirtual restoreHierarchyState : (Landroid/util/SparseArray;)V
    //   1635: aload_1
    //   1636: aconst_null
    //   1637: putfield d : Landroid/util/SparseArray;
    //   1640: aload_1
    //   1641: iconst_0
    //   1642: putfield E : Z
    //   1645: aload_1
    //   1646: iconst_1
    //   1647: putfield E : Z
    //   1650: aload_1
    //   1651: getfield G : Landroid/view/View;
    //   1654: ifnull -> 1678
    //   1657: aload_1
    //   1658: getfield S : Lb/l/a/c0;
    //   1661: astore #11
    //   1663: getstatic b/n/d$a.ON_CREATE : Lb/n/d$a;
    //   1666: astore #10
    //   1668: aload #11
    //   1670: getfield b : Lb/n/h;
    //   1673: aload #10
    //   1675: invokevirtual d : (Lb/n/d$a;)V
    //   1678: aload_1
    //   1679: aconst_null
    //   1680: putfield c : Landroid/os/Bundle;
    //   1683: iload #4
    //   1685: istore_3
    //   1686: goto -> 1707
    //   1689: new b/l/a/d0
    //   1692: dup
    //   1693: ldc_w 'Fragment '
    //   1696: aload_1
    //   1697: ldc_w ' did not call through to super.onActivityCreated()'
    //   1700: invokestatic b : (Ljava/lang/String;Landroidx/fragment/app/Fragment;Ljava/lang/String;)Ljava/lang/String;
    //   1703: invokespecial <init> : (Ljava/lang/String;)V
    //   1706: athrow
    //   1707: iload_3
    //   1708: istore #4
    //   1710: iload_3
    //   1711: iconst_2
    //   1712: if_icmple -> 1843
    //   1715: aload_1
    //   1716: getfield u : Lb/l/a/k;
    //   1719: invokevirtual e0 : ()V
    //   1722: aload_1
    //   1723: getfield u : Lb/l/a/k;
    //   1726: invokevirtual P : ()Z
    //   1729: pop
    //   1730: aload_1
    //   1731: iconst_3
    //   1732: putfield b : I
    //   1735: aload_1
    //   1736: iconst_0
    //   1737: putfield E : Z
    //   1740: aload_1
    //   1741: invokevirtual J : ()V
    //   1744: aload_1
    //   1745: getfield E : Z
    //   1748: ifeq -> 1825
    //   1751: aload_1
    //   1752: getfield R : Lb/n/h;
    //   1755: getstatic b/n/d$a.ON_START : Lb/n/d$a;
    //   1758: invokevirtual d : (Lb/n/d$a;)V
    //   1761: aload_1
    //   1762: getfield G : Landroid/view/View;
    //   1765: ifnull -> 1789
    //   1768: aload_1
    //   1769: getfield S : Lb/l/a/c0;
    //   1772: astore #11
    //   1774: getstatic b/n/d$a.ON_START : Lb/n/d$a;
    //   1777: astore #10
    //   1779: aload #11
    //   1781: getfield b : Lb/n/h;
    //   1784: aload #10
    //   1786: invokevirtual d : (Lb/n/d$a;)V
    //   1789: aload_1
    //   1790: getfield u : Lb/l/a/k;
    //   1793: astore #10
    //   1795: aload #10
    //   1797: iconst_0
    //   1798: putfield v : Z
    //   1801: aload #10
    //   1803: iconst_0
    //   1804: putfield w : Z
    //   1807: aload #10
    //   1809: iconst_3
    //   1810: invokevirtual M : (I)V
    //   1813: aload_0
    //   1814: aload_1
    //   1815: iconst_0
    //   1816: invokevirtual D : (Landroidx/fragment/app/Fragment;Z)V
    //   1819: iload_3
    //   1820: istore #4
    //   1822: goto -> 1843
    //   1825: new b/l/a/d0
    //   1828: dup
    //   1829: ldc_w 'Fragment '
    //   1832: aload_1
    //   1833: ldc_w ' did not call through to super.onStart()'
    //   1836: invokestatic b : (Ljava/lang/String;Landroidx/fragment/app/Fragment;Ljava/lang/String;)Ljava/lang/String;
    //   1839: invokespecial <init> : (Ljava/lang/String;)V
    //   1842: athrow
    //   1843: iload #4
    //   1845: istore #6
    //   1847: iload #4
    //   1849: iconst_3
    //   1850: if_icmple -> 3480
    //   1853: aload_1
    //   1854: getfield u : Lb/l/a/k;
    //   1857: invokevirtual e0 : ()V
    //   1860: aload_1
    //   1861: getfield u : Lb/l/a/k;
    //   1864: invokevirtual P : ()Z
    //   1867: pop
    //   1868: aload_1
    //   1869: iconst_4
    //   1870: putfield b : I
    //   1873: aload_1
    //   1874: iconst_0
    //   1875: putfield E : Z
    //   1878: aload_1
    //   1879: invokevirtual H : ()V
    //   1882: aload_1
    //   1883: getfield E : Z
    //   1886: ifeq -> 1982
    //   1889: aload_1
    //   1890: getfield R : Lb/n/h;
    //   1893: getstatic b/n/d$a.ON_RESUME : Lb/n/d$a;
    //   1896: invokevirtual d : (Lb/n/d$a;)V
    //   1899: aload_1
    //   1900: getfield G : Landroid/view/View;
    //   1903: ifnull -> 1927
    //   1906: aload_1
    //   1907: getfield S : Lb/l/a/c0;
    //   1910: astore #11
    //   1912: getstatic b/n/d$a.ON_RESUME : Lb/n/d$a;
    //   1915: astore #10
    //   1917: aload #11
    //   1919: getfield b : Lb/n/h;
    //   1922: aload #10
    //   1924: invokevirtual d : (Lb/n/d$a;)V
    //   1927: aload_1
    //   1928: getfield u : Lb/l/a/k;
    //   1931: astore #10
    //   1933: aload #10
    //   1935: iconst_0
    //   1936: putfield v : Z
    //   1939: aload #10
    //   1941: iconst_0
    //   1942: putfield w : Z
    //   1945: aload #10
    //   1947: iconst_4
    //   1948: invokevirtual M : (I)V
    //   1951: aload_1
    //   1952: getfield u : Lb/l/a/k;
    //   1955: invokevirtual P : ()Z
    //   1958: pop
    //   1959: aload_0
    //   1960: aload_1
    //   1961: iconst_0
    //   1962: invokevirtual B : (Landroidx/fragment/app/Fragment;Z)V
    //   1965: aload_1
    //   1966: aconst_null
    //   1967: putfield c : Landroid/os/Bundle;
    //   1970: aload_1
    //   1971: aconst_null
    //   1972: putfield d : Landroid/util/SparseArray;
    //   1975: iload #4
    //   1977: istore #6
    //   1979: goto -> 3480
    //   1982: new b/l/a/d0
    //   1985: dup
    //   1986: ldc_w 'Fragment '
    //   1989: aload_1
    //   1990: ldc_w ' did not call through to super.onResume()'
    //   1993: invokestatic b : (Ljava/lang/String;Landroidx/fragment/app/Fragment;Ljava/lang/String;)Ljava/lang/String;
    //   1996: invokespecial <init> : (Ljava/lang/String;)V
    //   1999: athrow
    //   2000: iload_2
    //   2001: istore #6
    //   2003: iload #8
    //   2005: iload_2
    //   2006: if_icmple -> 3480
    //   2009: iload #8
    //   2011: iconst_1
    //   2012: if_icmpeq -> 2727
    //   2015: iload #8
    //   2017: iconst_2
    //   2018: if_icmpeq -> 2247
    //   2021: iload #8
    //   2023: iconst_3
    //   2024: if_icmpeq -> 2138
    //   2027: iload #8
    //   2029: iconst_4
    //   2030: if_icmpeq -> 2039
    //   2033: iload_2
    //   2034: istore #6
    //   2036: goto -> 3480
    //   2039: iload_2
    //   2040: iconst_4
    //   2041: if_icmpge -> 2138
    //   2044: aload_1
    //   2045: getfield u : Lb/l/a/k;
    //   2048: iconst_3
    //   2049: invokevirtual M : (I)V
    //   2052: aload_1
    //   2053: getfield G : Landroid/view/View;
    //   2056: ifnull -> 2080
    //   2059: aload_1
    //   2060: getfield S : Lb/l/a/c0;
    //   2063: astore #11
    //   2065: getstatic b/n/d$a.ON_PAUSE : Lb/n/d$a;
    //   2068: astore #10
    //   2070: aload #11
    //   2072: getfield b : Lb/n/h;
    //   2075: aload #10
    //   2077: invokevirtual d : (Lb/n/d$a;)V
    //   2080: aload_1
    //   2081: getfield R : Lb/n/h;
    //   2084: getstatic b/n/d$a.ON_PAUSE : Lb/n/d$a;
    //   2087: invokevirtual d : (Lb/n/d$a;)V
    //   2090: aload_1
    //   2091: iconst_3
    //   2092: putfield b : I
    //   2095: aload_1
    //   2096: iconst_0
    //   2097: putfield E : Z
    //   2100: aload_1
    //   2101: invokevirtual G : ()V
    //   2104: aload_1
    //   2105: getfield E : Z
    //   2108: ifeq -> 2120
    //   2111: aload_0
    //   2112: aload_1
    //   2113: iconst_0
    //   2114: invokevirtual y : (Landroidx/fragment/app/Fragment;Z)V
    //   2117: goto -> 2138
    //   2120: new b/l/a/d0
    //   2123: dup
    //   2124: ldc_w 'Fragment '
    //   2127: aload_1
    //   2128: ldc_w ' did not call through to super.onPause()'
    //   2131: invokestatic b : (Ljava/lang/String;Landroidx/fragment/app/Fragment;Ljava/lang/String;)Ljava/lang/String;
    //   2134: invokespecial <init> : (Ljava/lang/String;)V
    //   2137: athrow
    //   2138: iload_2
    //   2139: iconst_3
    //   2140: if_icmpge -> 2247
    //   2143: aload_1
    //   2144: getfield u : Lb/l/a/k;
    //   2147: astore #10
    //   2149: aload #10
    //   2151: iconst_1
    //   2152: putfield w : Z
    //   2155: aload #10
    //   2157: iconst_2
    //   2158: invokevirtual M : (I)V
    //   2161: aload_1
    //   2162: getfield G : Landroid/view/View;
    //   2165: ifnull -> 2189
    //   2168: aload_1
    //   2169: getfield S : Lb/l/a/c0;
    //   2172: astore #10
    //   2174: getstatic b/n/d$a.ON_STOP : Lb/n/d$a;
    //   2177: astore #11
    //   2179: aload #10
    //   2181: getfield b : Lb/n/h;
    //   2184: aload #11
    //   2186: invokevirtual d : (Lb/n/d$a;)V
    //   2189: aload_1
    //   2190: getfield R : Lb/n/h;
    //   2193: getstatic b/n/d$a.ON_STOP : Lb/n/d$a;
    //   2196: invokevirtual d : (Lb/n/d$a;)V
    //   2199: aload_1
    //   2200: iconst_2
    //   2201: putfield b : I
    //   2204: aload_1
    //   2205: iconst_0
    //   2206: putfield E : Z
    //   2209: aload_1
    //   2210: invokevirtual K : ()V
    //   2213: aload_1
    //   2214: getfield E : Z
    //   2217: ifeq -> 2229
    //   2220: aload_0
    //   2221: aload_1
    //   2222: iconst_0
    //   2223: invokevirtual E : (Landroidx/fragment/app/Fragment;Z)V
    //   2226: goto -> 2247
    //   2229: new b/l/a/d0
    //   2232: dup
    //   2233: ldc_w 'Fragment '
    //   2236: aload_1
    //   2237: ldc_w ' did not call through to super.onStop()'
    //   2240: invokestatic b : (Ljava/lang/String;Landroidx/fragment/app/Fragment;Ljava/lang/String;)Ljava/lang/String;
    //   2243: invokespecial <init> : (Ljava/lang/String;)V
    //   2246: athrow
    //   2247: iload_2
    //   2248: iconst_2
    //   2249: if_icmpge -> 2727
    //   2252: aload_1
    //   2253: getfield G : Landroid/view/View;
    //   2256: ifnull -> 2289
    //   2259: aload_0
    //   2260: getfield q : Lb/l/a/i;
    //   2263: checkcast b/l/a/e$a
    //   2266: getfield g : Lb/l/a/e;
    //   2269: invokevirtual isFinishing : ()Z
    //   2272: iconst_1
    //   2273: ixor
    //   2274: ifeq -> 2289
    //   2277: aload_1
    //   2278: getfield d : Landroid/util/SparseArray;
    //   2281: ifnonnull -> 2289
    //   2284: aload_0
    //   2285: aload_1
    //   2286: invokevirtual m0 : (Landroidx/fragment/app/Fragment;)V
    //   2289: aload_1
    //   2290: getfield u : Lb/l/a/k;
    //   2293: iconst_1
    //   2294: invokevirtual M : (I)V
    //   2297: aload_1
    //   2298: getfield G : Landroid/view/View;
    //   2301: ifnull -> 2325
    //   2304: aload_1
    //   2305: getfield S : Lb/l/a/c0;
    //   2308: astore #11
    //   2310: getstatic b/n/d$a.ON_DESTROY : Lb/n/d$a;
    //   2313: astore #10
    //   2315: aload #11
    //   2317: getfield b : Lb/n/h;
    //   2320: aload #10
    //   2322: invokevirtual d : (Lb/n/d$a;)V
    //   2325: aload_1
    //   2326: iconst_1
    //   2327: putfield b : I
    //   2330: aload_1
    //   2331: iconst_0
    //   2332: putfield E : Z
    //   2335: aload_1
    //   2336: invokevirtual C : ()V
    //   2339: aload_1
    //   2340: getfield E : Z
    //   2343: ifeq -> 2709
    //   2346: aload_1
    //   2347: invokestatic b : (Lb/n/g;)Lb/o/a/a;
    //   2350: checkcast b/o/a/b
    //   2353: getfield b : Lb/o/a/b$c;
    //   2356: astore #10
    //   2358: aload #10
    //   2360: getfield b : Lb/f/i;
    //   2363: invokevirtual i : ()I
    //   2366: istore #8
    //   2368: iconst_0
    //   2369: istore #6
    //   2371: iload #6
    //   2373: iload #8
    //   2375: if_icmpge -> 2402
    //   2378: aload #10
    //   2380: getfield b : Lb/f/i;
    //   2383: iload #6
    //   2385: invokevirtual j : (I)Ljava/lang/Object;
    //   2388: checkcast b/o/a/b$a
    //   2391: getfield j : Lb/n/g;
    //   2394: astore #11
    //   2396: iinc #6, 1
    //   2399: goto -> 2371
    //   2402: aload_1
    //   2403: iconst_0
    //   2404: putfield q : Z
    //   2407: aload_0
    //   2408: aload_1
    //   2409: iconst_0
    //   2410: invokevirtual G : (Landroidx/fragment/app/Fragment;Z)V
    //   2413: aload_1
    //   2414: getfield G : Landroid/view/View;
    //   2417: astore #10
    //   2419: aload #10
    //   2421: ifnull -> 2673
    //   2424: aload_1
    //   2425: getfield F : Landroid/view/ViewGroup;
    //   2428: astore #11
    //   2430: aload #11
    //   2432: ifnull -> 2673
    //   2435: aload #11
    //   2437: aload #10
    //   2439: invokevirtual endViewTransition : (Landroid/view/View;)V
    //   2442: aload_1
    //   2443: getfield G : Landroid/view/View;
    //   2446: invokevirtual clearAnimation : ()V
    //   2449: aload_1
    //   2450: getfield v : Landroidx/fragment/app/Fragment;
    //   2453: astore #10
    //   2455: aload #10
    //   2457: ifnull -> 2468
    //   2460: aload #10
    //   2462: getfield m : Z
    //   2465: ifne -> 2673
    //   2468: aload_0
    //   2469: getfield p : I
    //   2472: ifle -> 2515
    //   2475: aload_0
    //   2476: getfield x : Z
    //   2479: ifne -> 2515
    //   2482: aload_1
    //   2483: getfield G : Landroid/view/View;
    //   2486: invokevirtual getVisibility : ()I
    //   2489: ifne -> 2515
    //   2492: aload_1
    //   2493: getfield N : F
    //   2496: fconst_0
    //   2497: fcmpl
    //   2498: iflt -> 2515
    //   2501: aload_0
    //   2502: aload_1
    //   2503: iload_3
    //   2504: iconst_0
    //   2505: iload #4
    //   2507: invokevirtual Y : (Landroidx/fragment/app/Fragment;IZI)Lb/l/a/k$d;
    //   2510: astore #10
    //   2512: goto -> 2518
    //   2515: aconst_null
    //   2516: astore #10
    //   2518: aload_1
    //   2519: fconst_0
    //   2520: putfield N : F
    //   2523: aload #10
    //   2525: ifnull -> 2662
    //   2528: aload_1
    //   2529: getfield G : Landroid/view/View;
    //   2532: astore #12
    //   2534: aload_1
    //   2535: getfield F : Landroid/view/ViewGroup;
    //   2538: astore #11
    //   2540: aload #11
    //   2542: aload #12
    //   2544: invokevirtual startViewTransition : (Landroid/view/View;)V
    //   2547: aload_1
    //   2548: invokevirtual c : ()Landroidx/fragment/app/Fragment$b;
    //   2551: iload_2
    //   2552: putfield c : I
    //   2555: aload #10
    //   2557: getfield a : Landroid/view/animation/Animation;
    //   2560: ifnull -> 2617
    //   2563: new b/l/a/k$e
    //   2566: dup
    //   2567: aload #10
    //   2569: getfield a : Landroid/view/animation/Animation;
    //   2572: aload #11
    //   2574: aload #12
    //   2576: invokespecial <init> : (Landroid/view/animation/Animation;Landroid/view/ViewGroup;Landroid/view/View;)V
    //   2579: astore #10
    //   2581: aload_1
    //   2582: aload_1
    //   2583: getfield G : Landroid/view/View;
    //   2586: invokevirtual R : (Landroid/view/View;)V
    //   2589: aload #10
    //   2591: new b/l/a/l
    //   2594: dup
    //   2595: aload_0
    //   2596: aload #11
    //   2598: aload_1
    //   2599: invokespecial <init> : (Lb/l/a/k;Landroid/view/ViewGroup;Landroidx/fragment/app/Fragment;)V
    //   2602: invokevirtual setAnimationListener : (Landroid/view/animation/Animation$AnimationListener;)V
    //   2605: aload_1
    //   2606: getfield G : Landroid/view/View;
    //   2609: aload #10
    //   2611: invokevirtual startAnimation : (Landroid/view/animation/Animation;)V
    //   2614: goto -> 2662
    //   2617: aload #10
    //   2619: getfield b : Landroid/animation/Animator;
    //   2622: astore #10
    //   2624: aload_1
    //   2625: aload #10
    //   2627: invokevirtual S : (Landroid/animation/Animator;)V
    //   2630: aload #10
    //   2632: new b/l/a/m
    //   2635: dup
    //   2636: aload_0
    //   2637: aload #11
    //   2639: aload #12
    //   2641: aload_1
    //   2642: invokespecial <init> : (Lb/l/a/k;Landroid/view/ViewGroup;Landroid/view/View;Landroidx/fragment/app/Fragment;)V
    //   2645: invokevirtual addListener : (Landroid/animation/Animator$AnimatorListener;)V
    //   2648: aload #10
    //   2650: aload_1
    //   2651: getfield G : Landroid/view/View;
    //   2654: invokevirtual setTarget : (Ljava/lang/Object;)V
    //   2657: aload #10
    //   2659: invokevirtual start : ()V
    //   2662: aload_1
    //   2663: getfield F : Landroid/view/ViewGroup;
    //   2666: aload_1
    //   2667: getfield G : Landroid/view/View;
    //   2670: invokevirtual removeView : (Landroid/view/View;)V
    //   2673: aload_1
    //   2674: aconst_null
    //   2675: putfield F : Landroid/view/ViewGroup;
    //   2678: aload_1
    //   2679: aconst_null
    //   2680: putfield G : Landroid/view/View;
    //   2683: aload_1
    //   2684: aconst_null
    //   2685: putfield S : Lb/l/a/c0;
    //   2688: aload_1
    //   2689: getfield T : Lb/n/l;
    //   2692: aconst_null
    //   2693: invokevirtual g : (Ljava/lang/Object;)V
    //   2696: aload_1
    //   2697: aconst_null
    //   2698: putfield H : Landroid/view/View;
    //   2701: aload_1
    //   2702: iconst_0
    //   2703: putfield o : Z
    //   2706: goto -> 2727
    //   2709: new b/l/a/d0
    //   2712: dup
    //   2713: ldc_w 'Fragment '
    //   2716: aload_1
    //   2717: ldc_w ' did not call through to super.onDestroyView()'
    //   2720: invokestatic b : (Ljava/lang/String;Landroidx/fragment/app/Fragment;Ljava/lang/String;)Ljava/lang/String;
    //   2723: invokespecial <init> : (Ljava/lang/String;)V
    //   2726: athrow
    //   2727: iload_2
    //   2728: istore #6
    //   2730: iload_2
    //   2731: iconst_1
    //   2732: if_icmpge -> 3480
    //   2735: aload_0
    //   2736: getfield x : Z
    //   2739: ifeq -> 2791
    //   2742: aload_1
    //   2743: invokevirtual h : ()Landroid/view/View;
    //   2746: ifnull -> 2768
    //   2749: aload_1
    //   2750: invokevirtual h : ()Landroid/view/View;
    //   2753: astore #10
    //   2755: aload_1
    //   2756: aconst_null
    //   2757: invokevirtual R : (Landroid/view/View;)V
    //   2760: aload #10
    //   2762: invokevirtual clearAnimation : ()V
    //   2765: goto -> 2791
    //   2768: aload_1
    //   2769: invokevirtual i : ()Landroid/animation/Animator;
    //   2772: ifnull -> 2791
    //   2775: aload_1
    //   2776: invokevirtual i : ()Landroid/animation/Animator;
    //   2779: astore #10
    //   2781: aload_1
    //   2782: aconst_null
    //   2783: invokevirtual S : (Landroid/animation/Animator;)V
    //   2786: aload #10
    //   2788: invokevirtual cancel : ()V
    //   2791: aload_1
    //   2792: invokevirtual h : ()Landroid/view/View;
    //   2795: ifnonnull -> 3466
    //   2798: aload_1
    //   2799: invokevirtual i : ()Landroid/animation/Animator;
    //   2802: ifnull -> 2808
    //   2805: goto -> 3466
    //   2808: aload_1
    //   2809: getfield m : Z
    //   2812: ifeq -> 2827
    //   2815: aload_1
    //   2816: invokevirtual x : ()Z
    //   2819: ifne -> 2827
    //   2822: iconst_1
    //   2823: istore_3
    //   2824: goto -> 2829
    //   2827: iconst_0
    //   2828: istore_3
    //   2829: iload_3
    //   2830: ifne -> 2855
    //   2833: aload_0
    //   2834: getfield F : Lb/l/a/p;
    //   2837: aload_1
    //   2838: invokevirtual b : (Landroidx/fragment/app/Fragment;)Z
    //   2841: ifeq -> 2847
    //   2844: goto -> 2855
    //   2847: aload_1
    //   2848: iconst_0
    //   2849: putfield b : I
    //   2852: goto -> 3057
    //   2855: aload_0
    //   2856: getfield q : Lb/l/a/i;
    //   2859: astore #10
    //   2861: aload #10
    //   2863: instanceof b/n/t
    //   2866: ifeq -> 2881
    //   2869: aload_0
    //   2870: getfield F : Lb/l/a/p;
    //   2873: getfield f : Z
    //   2876: istore #9
    //   2878: goto -> 2914
    //   2881: aload #10
    //   2883: getfield c : Landroid/content/Context;
    //   2886: astore #10
    //   2888: aload #10
    //   2890: instanceof android/app/Activity
    //   2893: ifeq -> 2911
    //   2896: aload #10
    //   2898: checkcast android/app/Activity
    //   2901: invokevirtual isChangingConfigurations : ()Z
    //   2904: iconst_1
    //   2905: ixor
    //   2906: istore #9
    //   2908: goto -> 2914
    //   2911: iconst_1
    //   2912: istore #9
    //   2914: iload_3
    //   2915: ifne -> 2923
    //   2918: iload #9
    //   2920: ifeq -> 3014
    //   2923: aload_0
    //   2924: getfield F : Lb/l/a/p;
    //   2927: astore #10
    //   2929: aload #10
    //   2931: ifnull -> 3464
    //   2934: aload #10
    //   2936: getfield c : Ljava/util/HashMap;
    //   2939: aload_1
    //   2940: getfield f : Ljava/lang/String;
    //   2943: invokevirtual get : (Ljava/lang/Object;)Ljava/lang/Object;
    //   2946: checkcast b/l/a/p
    //   2949: astore #11
    //   2951: aload #11
    //   2953: ifnull -> 2974
    //   2956: aload #11
    //   2958: invokevirtual a : ()V
    //   2961: aload #10
    //   2963: getfield c : Ljava/util/HashMap;
    //   2966: aload_1
    //   2967: getfield f : Ljava/lang/String;
    //   2970: invokevirtual remove : (Ljava/lang/Object;)Ljava/lang/Object;
    //   2973: pop
    //   2974: aload #10
    //   2976: getfield d : Ljava/util/HashMap;
    //   2979: aload_1
    //   2980: getfield f : Ljava/lang/String;
    //   2983: invokevirtual get : (Ljava/lang/Object;)Ljava/lang/Object;
    //   2986: checkcast b/n/s
    //   2989: astore #11
    //   2991: aload #11
    //   2993: ifnull -> 3014
    //   2996: aload #11
    //   2998: invokevirtual a : ()V
    //   3001: aload #10
    //   3003: getfield d : Ljava/util/HashMap;
    //   3006: aload_1
    //   3007: getfield f : Ljava/lang/String;
    //   3010: invokevirtual remove : (Ljava/lang/Object;)Ljava/lang/Object;
    //   3013: pop
    //   3014: aload_1
    //   3015: getfield u : Lb/l/a/k;
    //   3018: invokevirtual q : ()V
    //   3021: aload_1
    //   3022: getfield R : Lb/n/h;
    //   3025: getstatic b/n/d$a.ON_DESTROY : Lb/n/d$a;
    //   3028: invokevirtual d : (Lb/n/d$a;)V
    //   3031: aload_1
    //   3032: iconst_0
    //   3033: putfield b : I
    //   3036: aload_1
    //   3037: iconst_0
    //   3038: putfield E : Z
    //   3041: aload_1
    //   3042: iconst_0
    //   3043: putfield P : Z
    //   3046: aload_1
    //   3047: iconst_1
    //   3048: putfield E : Z
    //   3051: aload_0
    //   3052: aload_1
    //   3053: iconst_0
    //   3054: invokevirtual w : (Landroidx/fragment/app/Fragment;Z)V
    //   3057: aload_1
    //   3058: iconst_0
    //   3059: putfield E : Z
    //   3062: aload_1
    //   3063: invokevirtual D : ()V
    //   3066: aload_1
    //   3067: aconst_null
    //   3068: putfield O : Landroid/view/LayoutInflater;
    //   3071: aload_1
    //   3072: getfield E : Z
    //   3075: ifeq -> 3446
    //   3078: aload_1
    //   3079: getfield u : Lb/l/a/k;
    //   3082: astore #10
    //   3084: aload #10
    //   3086: getfield x : Z
    //   3089: ifne -> 3108
    //   3092: aload #10
    //   3094: invokevirtual q : ()V
    //   3097: aload_1
    //   3098: new b/l/a/k
    //   3101: dup
    //   3102: invokespecial <init> : ()V
    //   3105: putfield u : Lb/l/a/k;
    //   3108: aload_0
    //   3109: aload_1
    //   3110: iconst_0
    //   3111: invokevirtual x : (Landroidx/fragment/app/Fragment;Z)V
    //   3114: iload_2
    //   3115: istore #6
    //   3117: iload #5
    //   3119: ifne -> 3480
    //   3122: iload_3
    //   3123: ifne -> 3214
    //   3126: aload_0
    //   3127: getfield F : Lb/l/a/p;
    //   3130: aload_1
    //   3131: invokevirtual b : (Landroidx/fragment/app/Fragment;)Z
    //   3134: ifeq -> 3140
    //   3137: goto -> 3214
    //   3140: aload_1
    //   3141: aconst_null
    //   3142: putfield t : Lb/l/a/i;
    //   3145: aload_1
    //   3146: aconst_null
    //   3147: putfield v : Landroidx/fragment/app/Fragment;
    //   3150: aload_1
    //   3151: aconst_null
    //   3152: putfield s : Lb/l/a/k;
    //   3155: aload_1
    //   3156: getfield i : Ljava/lang/String;
    //   3159: astore #10
    //   3161: iload_2
    //   3162: istore #6
    //   3164: aload #10
    //   3166: ifnull -> 3480
    //   3169: aload_0
    //   3170: getfield h : Ljava/util/HashMap;
    //   3173: aload #10
    //   3175: invokevirtual get : (Ljava/lang/Object;)Ljava/lang/Object;
    //   3178: checkcast androidx/fragment/app/Fragment
    //   3181: astore #10
    //   3183: iload_2
    //   3184: istore #6
    //   3186: aload #10
    //   3188: ifnull -> 3480
    //   3191: iload_2
    //   3192: istore #6
    //   3194: aload #10
    //   3196: getfield B : Z
    //   3199: ifeq -> 3480
    //   3202: aload_1
    //   3203: aload #10
    //   3205: putfield h : Landroidx/fragment/app/Fragment;
    //   3208: iload_2
    //   3209: istore #6
    //   3211: goto -> 3480
    //   3214: aload_0
    //   3215: getfield h : Ljava/util/HashMap;
    //   3218: aload_1
    //   3219: getfield f : Ljava/lang/String;
    //   3222: invokevirtual get : (Ljava/lang/Object;)Ljava/lang/Object;
    //   3225: ifnonnull -> 3234
    //   3228: iload_2
    //   3229: istore #6
    //   3231: goto -> 3480
    //   3234: aload_0
    //   3235: getfield h : Ljava/util/HashMap;
    //   3238: invokevirtual values : ()Ljava/util/Collection;
    //   3241: invokeinterface iterator : ()Ljava/util/Iterator;
    //   3246: astore #10
    //   3248: aload #10
    //   3250: invokeinterface hasNext : ()Z
    //   3255: ifeq -> 3305
    //   3258: aload #10
    //   3260: invokeinterface next : ()Ljava/lang/Object;
    //   3265: checkcast androidx/fragment/app/Fragment
    //   3268: astore #11
    //   3270: aload #11
    //   3272: ifnull -> 3248
    //   3275: aload_1
    //   3276: getfield f : Ljava/lang/String;
    //   3279: aload #11
    //   3281: getfield i : Ljava/lang/String;
    //   3284: invokevirtual equals : (Ljava/lang/Object;)Z
    //   3287: ifeq -> 3248
    //   3290: aload #11
    //   3292: aload_1
    //   3293: putfield h : Landroidx/fragment/app/Fragment;
    //   3296: aload #11
    //   3298: aconst_null
    //   3299: putfield i : Ljava/lang/String;
    //   3302: goto -> 3248
    //   3305: aload_0
    //   3306: getfield h : Ljava/util/HashMap;
    //   3309: aload_1
    //   3310: getfield f : Ljava/lang/String;
    //   3313: aconst_null
    //   3314: invokevirtual put : (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    //   3317: pop
    //   3318: aload_0
    //   3319: aload_1
    //   3320: invokevirtual i0 : (Landroidx/fragment/app/Fragment;)V
    //   3323: aload_1
    //   3324: getfield i : Ljava/lang/String;
    //   3327: astore #10
    //   3329: aload #10
    //   3331: ifnull -> 3350
    //   3334: aload_1
    //   3335: aload_0
    //   3336: getfield h : Ljava/util/HashMap;
    //   3339: aload #10
    //   3341: invokevirtual get : (Ljava/lang/Object;)Ljava/lang/Object;
    //   3344: checkcast androidx/fragment/app/Fragment
    //   3347: putfield h : Landroidx/fragment/app/Fragment;
    //   3350: aload_1
    //   3351: invokevirtual u : ()V
    //   3354: aload_1
    //   3355: invokestatic randomUUID : ()Ljava/util/UUID;
    //   3358: invokevirtual toString : ()Ljava/lang/String;
    //   3361: putfield f : Ljava/lang/String;
    //   3364: aload_1
    //   3365: iconst_0
    //   3366: putfield l : Z
    //   3369: aload_1
    //   3370: iconst_0
    //   3371: putfield m : Z
    //   3374: aload_1
    //   3375: iconst_0
    //   3376: putfield n : Z
    //   3379: aload_1
    //   3380: iconst_0
    //   3381: putfield o : Z
    //   3384: aload_1
    //   3385: iconst_0
    //   3386: putfield p : Z
    //   3389: aload_1
    //   3390: iconst_0
    //   3391: putfield r : I
    //   3394: aload_1
    //   3395: aconst_null
    //   3396: putfield s : Lb/l/a/k;
    //   3399: aload_1
    //   3400: new b/l/a/k
    //   3403: dup
    //   3404: invokespecial <init> : ()V
    //   3407: putfield u : Lb/l/a/k;
    //   3410: aload_1
    //   3411: aconst_null
    //   3412: putfield t : Lb/l/a/i;
    //   3415: aload_1
    //   3416: iconst_0
    //   3417: putfield w : I
    //   3420: aload_1
    //   3421: iconst_0
    //   3422: putfield x : I
    //   3425: aload_1
    //   3426: aconst_null
    //   3427: putfield y : Ljava/lang/String;
    //   3430: aload_1
    //   3431: iconst_0
    //   3432: putfield z : Z
    //   3435: aload_1
    //   3436: iconst_0
    //   3437: putfield A : Z
    //   3440: iload_2
    //   3441: istore #6
    //   3443: goto -> 3480
    //   3446: new b/l/a/d0
    //   3449: dup
    //   3450: ldc_w 'Fragment '
    //   3453: aload_1
    //   3454: ldc_w ' did not call through to super.onDetach()'
    //   3457: invokestatic b : (Ljava/lang/String;Landroidx/fragment/app/Fragment;Ljava/lang/String;)Ljava/lang/String;
    //   3460: invokespecial <init> : (Ljava/lang/String;)V
    //   3463: athrow
    //   3464: aconst_null
    //   3465: athrow
    //   3466: aload_1
    //   3467: invokevirtual c : ()Landroidx/fragment/app/Fragment$b;
    //   3470: iload_2
    //   3471: putfield c : I
    //   3474: iload #7
    //   3476: istore_2
    //   3477: goto -> 3483
    //   3480: iload #6
    //   3482: istore_2
    //   3483: aload_1
    //   3484: getfield b : I
    //   3487: iload_2
    //   3488: if_icmpeq -> 3568
    //   3491: new java/lang/StringBuilder
    //   3494: dup
    //   3495: invokespecial <init> : ()V
    //   3498: astore #10
    //   3500: aload #10
    //   3502: ldc_w 'moveToState: Fragment state for '
    //   3505: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   3508: pop
    //   3509: aload #10
    //   3511: aload_1
    //   3512: invokevirtual append : (Ljava/lang/Object;)Ljava/lang/StringBuilder;
    //   3515: pop
    //   3516: aload #10
    //   3518: ldc_w ' not updated inline; expected state '
    //   3521: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   3524: pop
    //   3525: aload #10
    //   3527: iload_2
    //   3528: invokevirtual append : (I)Ljava/lang/StringBuilder;
    //   3531: pop
    //   3532: aload #10
    //   3534: ldc_w ' found '
    //   3537: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   3540: pop
    //   3541: aload #10
    //   3543: aload_1
    //   3544: getfield b : I
    //   3547: invokevirtual append : (I)Ljava/lang/StringBuilder;
    //   3550: pop
    //   3551: ldc_w 'FragmentManager'
    //   3554: aload #10
    //   3556: invokevirtual toString : ()Ljava/lang/String;
    //   3559: invokestatic w : (Ljava/lang/String;Ljava/lang/String;)I
    //   3562: pop
    //   3563: aload_1
    //   3564: iload_2
    //   3565: putfield b : I
    //   3568: return
    // Exception table:
    //   from	to	target	type
    //   1276	1289	1292	android/content/res/Resources$NotFoundException
  }
  
  public final void e(b.f.c<Fragment> paramc) {
    int m = this.p;
    if (m < 1)
      return; 
    int i1 = Math.min(m, 3);
    int n = this.g.size();
    for (m = 0; m < n; m++) {
      Fragment fragment = this.g.get(m);
      if (fragment.b < i1) {
        d0(fragment, i1, fragment.n(), fragment.o(), false);
        if (fragment.G != null && !fragment.z && fragment.L)
          paramc.add(fragment); 
      } 
    } 
  }
  
  public void e0() {
    byte b1 = 0;
    this.v = false;
    this.w = false;
    int m = this.g.size();
    while (b1 < m) {
      Fragment fragment = this.g.get(b1);
      if (fragment != null)
        fragment.u.e0(); 
      b1++;
    } 
  }
  
  public void f(Fragment paramFragment, boolean paramBoolean) {
    Z(paramFragment);
    if (!paramFragment.A)
      if (!this.g.contains(paramFragment)) {
        synchronized (this.g) {
          this.g.add(paramFragment);
          paramFragment.l = true;
          paramFragment.m = false;
          if (paramFragment.G == null)
            paramFragment.M = false; 
          if (W(paramFragment))
            this.u = true; 
          if (paramBoolean)
            d0(paramFragment, this.p, 0, 0, false); 
        } 
      } else {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Fragment already added: ");
        stringBuilder.append(paramFragment);
        throw new IllegalStateException(stringBuilder.toString());
      }  
  }
  
  public boolean f0(ArrayList<a> paramArrayList, ArrayList<Boolean> paramArrayList1, String paramString, int paramInt1, int paramInt2) {
    // Byte code:
    //   0: aload_0
    //   1: getfield i : Ljava/util/ArrayList;
    //   4: astore #8
    //   6: aload #8
    //   8: ifnonnull -> 13
    //   11: iconst_0
    //   12: ireturn
    //   13: aload_3
    //   14: ifnonnull -> 70
    //   17: iload #4
    //   19: ifge -> 70
    //   22: iload #5
    //   24: iconst_1
    //   25: iand
    //   26: ifne -> 70
    //   29: aload #8
    //   31: invokevirtual size : ()I
    //   34: iconst_1
    //   35: isub
    //   36: istore #4
    //   38: iload #4
    //   40: ifge -> 45
    //   43: iconst_0
    //   44: ireturn
    //   45: aload_1
    //   46: aload_0
    //   47: getfield i : Ljava/util/ArrayList;
    //   50: iload #4
    //   52: invokevirtual remove : (I)Ljava/lang/Object;
    //   55: invokevirtual add : (Ljava/lang/Object;)Z
    //   58: pop
    //   59: aload_2
    //   60: getstatic java/lang/Boolean.TRUE : Ljava/lang/Boolean;
    //   63: invokevirtual add : (Ljava/lang/Object;)Z
    //   66: pop
    //   67: goto -> 318
    //   70: iconst_m1
    //   71: istore #6
    //   73: aload_3
    //   74: ifnonnull -> 82
    //   77: iload #4
    //   79: iflt -> 256
    //   82: aload_0
    //   83: getfield i : Ljava/util/ArrayList;
    //   86: invokevirtual size : ()I
    //   89: iconst_1
    //   90: isub
    //   91: istore #6
    //   93: iload #6
    //   95: iflt -> 155
    //   98: aload_0
    //   99: getfield i : Ljava/util/ArrayList;
    //   102: iload #6
    //   104: invokevirtual get : (I)Ljava/lang/Object;
    //   107: checkcast b/l/a/a
    //   110: astore #8
    //   112: aload_3
    //   113: ifnull -> 131
    //   116: aload_3
    //   117: aload #8
    //   119: getfield i : Ljava/lang/String;
    //   122: invokevirtual equals : (Ljava/lang/Object;)Z
    //   125: ifeq -> 131
    //   128: goto -> 155
    //   131: iload #4
    //   133: iflt -> 149
    //   136: iload #4
    //   138: aload #8
    //   140: getfield t : I
    //   143: if_icmpne -> 149
    //   146: goto -> 155
    //   149: iinc #6, -1
    //   152: goto -> 93
    //   155: iload #6
    //   157: ifge -> 162
    //   160: iconst_0
    //   161: ireturn
    //   162: iload #6
    //   164: istore #7
    //   166: iload #5
    //   168: iconst_1
    //   169: iand
    //   170: ifeq -> 252
    //   173: iload #6
    //   175: iconst_1
    //   176: isub
    //   177: istore #5
    //   179: iload #5
    //   181: istore #7
    //   183: iload #5
    //   185: iflt -> 252
    //   188: aload_0
    //   189: getfield i : Ljava/util/ArrayList;
    //   192: iload #5
    //   194: invokevirtual get : (I)Ljava/lang/Object;
    //   197: checkcast b/l/a/a
    //   200: astore #8
    //   202: aload_3
    //   203: ifnull -> 222
    //   206: iload #5
    //   208: istore #6
    //   210: aload_3
    //   211: aload #8
    //   213: getfield i : Ljava/lang/String;
    //   216: invokevirtual equals : (Ljava/lang/Object;)Z
    //   219: ifne -> 173
    //   222: iload #5
    //   224: istore #7
    //   226: iload #4
    //   228: iflt -> 252
    //   231: iload #5
    //   233: istore #7
    //   235: iload #4
    //   237: aload #8
    //   239: getfield t : I
    //   242: if_icmpne -> 252
    //   245: iload #5
    //   247: istore #6
    //   249: goto -> 173
    //   252: iload #7
    //   254: istore #6
    //   256: iload #6
    //   258: aload_0
    //   259: getfield i : Ljava/util/ArrayList;
    //   262: invokevirtual size : ()I
    //   265: iconst_1
    //   266: isub
    //   267: if_icmpne -> 272
    //   270: iconst_0
    //   271: ireturn
    //   272: aload_0
    //   273: getfield i : Ljava/util/ArrayList;
    //   276: invokevirtual size : ()I
    //   279: iconst_1
    //   280: isub
    //   281: istore #4
    //   283: iload #4
    //   285: iload #6
    //   287: if_icmple -> 318
    //   290: aload_1
    //   291: aload_0
    //   292: getfield i : Ljava/util/ArrayList;
    //   295: iload #4
    //   297: invokevirtual remove : (I)Ljava/lang/Object;
    //   300: invokevirtual add : (Ljava/lang/Object;)Z
    //   303: pop
    //   304: aload_2
    //   305: getstatic java/lang/Boolean.TRUE : Ljava/lang/Boolean;
    //   308: invokevirtual add : (Ljava/lang/Object;)Z
    //   311: pop
    //   312: iinc #4, -1
    //   315: goto -> 283
    //   318: iconst_1
    //   319: ireturn
  }
  
  public void g(i parami, f paramf, Fragment paramFragment) {
    if (this.q == null) {
      p p1;
      this.q = parami;
      this.r = paramf;
      this.s = paramFragment;
      if (paramFragment != null)
        s0(); 
      if (parami instanceof b.a.c) {
        Fragment fragment;
        b.a.c c = (b.a.c)parami;
        this.k = c.d();
        if (paramFragment != null)
          fragment = paramFragment; 
        OnBackPressedDispatcher onBackPressedDispatcher = this.k;
        b.a.b b1 = this.l;
        if (onBackPressedDispatcher != null) {
          b.n.d d = fragment.a();
          if (((b.n.h)d).b != b.n.d.b.b) {
            OnBackPressedDispatcher.LifecycleOnBackPressedCancellable lifecycleOnBackPressedCancellable = new OnBackPressedDispatcher.LifecycleOnBackPressedCancellable(onBackPressedDispatcher, d, b1);
            b1.b.add(lifecycleOnBackPressedCancellable);
          } 
        } else {
          throw null;
        } 
      } 
      if (paramFragment != null) {
        p p3 = paramFragment.s.F;
        p p2 = p3.c.get(paramFragment.f);
        p1 = p2;
        if (p2 == null) {
          p1 = new p(p3.e);
          p3.c.put(paramFragment.f, p1);
        } 
        this.F = p1;
      } else if (p1 instanceof t) {
        s s = ((t)p1).f();
        q q = p.h;
        String str = p.class.getCanonicalName();
        if (str != null) {
          String str1 = c.a.a.a.a.c("androidx.lifecycle.ViewModelProvider.DefaultKey:", str);
          p p2 = (p)s.a.get(str1);
          if (!p.class.isInstance(p2)) {
            p p3;
            if (q instanceof r) {
              p3 = ((r)q).a(str1, p.class);
            } else {
              p3 = ((p.a)p3).a((Class)p.class);
            } 
            p p4 = s.a.put(str1, p3);
            p2 = p3;
            if (p4 != null) {
              p4.a();
              p2 = p3;
            } 
          } 
          this.F = (p)p2;
        } else {
          throw new IllegalArgumentException("Local and anonymous classes can not be ViewModels");
        } 
      } else {
        this.F = new p(false);
      } 
      return;
    } 
    throw new IllegalStateException("Already attached");
  }
  
  public void g0(Fragment paramFragment) {
    boolean bool = paramFragment.x();
    if (!paramFragment.A || (bool ^ true) != 0)
      synchronized (this.g) {
        this.g.remove(paramFragment);
        if (W(paramFragment))
          this.u = true; 
        paramFragment.l = false;
        paramFragment.m = true;
        return;
      }  
  }
  
  public void h(Fragment paramFragment) {
    if (paramFragment.A) {
      paramFragment.A = false;
      if (!paramFragment.l)
        if (!this.g.contains(paramFragment)) {
          synchronized (this.g) {
            this.g.add(paramFragment);
            paramFragment.l = true;
            if (W(paramFragment))
              this.u = true; 
          } 
        } else {
          StringBuilder stringBuilder = new StringBuilder();
          stringBuilder.append("Fragment already added: ");
          stringBuilder.append(paramFragment);
          throw new IllegalStateException(stringBuilder.toString());
        }  
    } 
  }
  
  public final void h0(ArrayList<a> paramArrayList, ArrayList<Boolean> paramArrayList1) {
    if (paramArrayList == null || paramArrayList.isEmpty())
      return; 
    if (paramArrayList1 != null && paramArrayList.size() == paramArrayList1.size()) {
      R(paramArrayList, paramArrayList1);
      int i1 = paramArrayList.size();
      int m = 0;
      int n;
      for (n = 0; m < i1; n = i2) {
        int i3 = m;
        int i2 = n;
        if (!((a)paramArrayList.get(m)).p) {
          if (n != m)
            Q(paramArrayList, paramArrayList1, n, m); 
          n = m + 1;
          i2 = n;
          if (((Boolean)paramArrayList1.get(m)).booleanValue())
            while (true) {
              i2 = n;
              if (n < i1) {
                i2 = n;
                if (((Boolean)paramArrayList1.get(n)).booleanValue()) {
                  i2 = n;
                  if (!((a)paramArrayList.get(n)).p) {
                    n++;
                    continue;
                  } 
                } 
              } 
              break;
            }  
          Q(paramArrayList, paramArrayList1, m, i2);
          i3 = i2 - 1;
        } 
        m = i3 + 1;
      } 
      if (n != i1)
        Q(paramArrayList, paramArrayList1, n, i1); 
      return;
    } 
    throw new IllegalStateException("Internal error with the back stack records");
  }
  
  public final void i() {
    if (!c())
      return; 
    throw new IllegalStateException("Can not perform this action after onSaveInstanceState");
  }
  
  public void i0(Fragment paramFragment) {
    if (c())
      return; 
    this.F.b.remove(paramFragment);
  }
  
  public final void j() {
    this.e = false;
    this.A.clear();
    this.z.clear();
  }
  
  public void j0(Parcelable paramParcelable) {
    // Byte code:
    //   0: aload_1
    //   1: ifnonnull -> 5
    //   4: return
    //   5: aload_1
    //   6: checkcast b/l/a/o
    //   9: astore #10
    //   11: aload #10
    //   13: getfield b : Ljava/util/ArrayList;
    //   16: ifnonnull -> 20
    //   19: return
    //   20: aload_0
    //   21: getfield F : Lb/l/a/p;
    //   24: getfield b : Ljava/util/HashSet;
    //   27: invokeinterface iterator : ()Ljava/util/Iterator;
    //   32: astore #12
    //   34: aload #12
    //   36: invokeinterface hasNext : ()Z
    //   41: ifeq -> 261
    //   44: aload #12
    //   46: invokeinterface next : ()Ljava/lang/Object;
    //   51: checkcast androidx/fragment/app/Fragment
    //   54: astore #11
    //   56: aload #10
    //   58: getfield b : Ljava/util/ArrayList;
    //   61: invokevirtual iterator : ()Ljava/util/Iterator;
    //   64: astore #9
    //   66: aload #9
    //   68: invokeinterface hasNext : ()Z
    //   73: ifeq -> 105
    //   76: aload #9
    //   78: invokeinterface next : ()Ljava/lang/Object;
    //   83: checkcast b/l/a/q
    //   86: astore_1
    //   87: aload_1
    //   88: getfield c : Ljava/lang/String;
    //   91: aload #11
    //   93: getfield f : Ljava/lang/String;
    //   96: invokevirtual equals : (Ljava/lang/Object;)Z
    //   99: ifeq -> 66
    //   102: goto -> 107
    //   105: aconst_null
    //   106: astore_1
    //   107: aload_1
    //   108: ifnonnull -> 140
    //   111: aload_0
    //   112: aload #11
    //   114: iconst_1
    //   115: iconst_0
    //   116: iconst_0
    //   117: iconst_0
    //   118: invokevirtual d0 : (Landroidx/fragment/app/Fragment;IIIZ)V
    //   121: aload #11
    //   123: iconst_1
    //   124: putfield m : Z
    //   127: aload_0
    //   128: aload #11
    //   130: iconst_0
    //   131: iconst_0
    //   132: iconst_0
    //   133: iconst_0
    //   134: invokevirtual d0 : (Landroidx/fragment/app/Fragment;IIIZ)V
    //   137: goto -> 34
    //   140: aload_1
    //   141: aload #11
    //   143: putfield o : Landroidx/fragment/app/Fragment;
    //   146: aload #11
    //   148: aconst_null
    //   149: putfield d : Landroid/util/SparseArray;
    //   152: aload #11
    //   154: iconst_0
    //   155: putfield r : I
    //   158: aload #11
    //   160: iconst_0
    //   161: putfield o : Z
    //   164: aload #11
    //   166: iconst_0
    //   167: putfield l : Z
    //   170: aload #11
    //   172: getfield h : Landroidx/fragment/app/Fragment;
    //   175: astore #9
    //   177: aload #9
    //   179: ifnull -> 192
    //   182: aload #9
    //   184: getfield f : Ljava/lang/String;
    //   187: astore #9
    //   189: goto -> 195
    //   192: aconst_null
    //   193: astore #9
    //   195: aload #11
    //   197: aload #9
    //   199: putfield i : Ljava/lang/String;
    //   202: aload #11
    //   204: aconst_null
    //   205: putfield h : Landroidx/fragment/app/Fragment;
    //   208: aload_1
    //   209: getfield n : Landroid/os/Bundle;
    //   212: astore #9
    //   214: aload #9
    //   216: ifnull -> 34
    //   219: aload #9
    //   221: aload_0
    //   222: getfield q : Lb/l/a/i;
    //   225: getfield c : Landroid/content/Context;
    //   228: invokevirtual getClassLoader : ()Ljava/lang/ClassLoader;
    //   231: invokevirtual setClassLoader : (Ljava/lang/ClassLoader;)V
    //   234: aload #11
    //   236: aload_1
    //   237: getfield n : Landroid/os/Bundle;
    //   240: ldc_w 'android:view_state'
    //   243: invokevirtual getSparseParcelableArray : (Ljava/lang/String;)Landroid/util/SparseArray;
    //   246: putfield d : Landroid/util/SparseArray;
    //   249: aload #11
    //   251: aload_1
    //   252: getfield n : Landroid/os/Bundle;
    //   255: putfield c : Landroid/os/Bundle;
    //   258: goto -> 34
    //   261: aload_0
    //   262: getfield h : Ljava/util/HashMap;
    //   265: invokevirtual clear : ()V
    //   268: aload #10
    //   270: getfield b : Ljava/util/ArrayList;
    //   273: invokevirtual iterator : ()Ljava/util/Iterator;
    //   276: astore #11
    //   278: aload #11
    //   280: invokeinterface hasNext : ()Z
    //   285: ifeq -> 571
    //   288: aload #11
    //   290: invokeinterface next : ()Ljava/lang/Object;
    //   295: checkcast b/l/a/q
    //   298: astore #12
    //   300: aload #12
    //   302: ifnull -> 278
    //   305: aload_0
    //   306: getfield q : Lb/l/a/i;
    //   309: getfield c : Landroid/content/Context;
    //   312: invokevirtual getClassLoader : ()Ljava/lang/ClassLoader;
    //   315: astore_1
    //   316: aload_0
    //   317: invokevirtual V : ()Lb/l/a/h;
    //   320: astore #13
    //   322: aload #12
    //   324: getfield o : Landroidx/fragment/app/Fragment;
    //   327: ifnonnull -> 538
    //   330: aload #12
    //   332: getfield k : Landroid/os/Bundle;
    //   335: astore #9
    //   337: aload #9
    //   339: ifnull -> 348
    //   342: aload #9
    //   344: aload_1
    //   345: invokevirtual setClassLoader : (Ljava/lang/ClassLoader;)V
    //   348: aload #13
    //   350: aload_1
    //   351: aload #12
    //   353: getfield b : Ljava/lang/String;
    //   356: invokevirtual a : (Ljava/lang/ClassLoader;Ljava/lang/String;)Landroidx/fragment/app/Fragment;
    //   359: astore #9
    //   361: aload #12
    //   363: aload #9
    //   365: putfield o : Landroidx/fragment/app/Fragment;
    //   368: aload #9
    //   370: aload #12
    //   372: getfield k : Landroid/os/Bundle;
    //   375: invokevirtual T : (Landroid/os/Bundle;)V
    //   378: aload #12
    //   380: getfield n : Landroid/os/Bundle;
    //   383: astore #9
    //   385: aload #9
    //   387: ifnull -> 412
    //   390: aload #9
    //   392: aload_1
    //   393: invokevirtual setClassLoader : (Ljava/lang/ClassLoader;)V
    //   396: aload #12
    //   398: getfield o : Landroidx/fragment/app/Fragment;
    //   401: astore_1
    //   402: aload #12
    //   404: getfield n : Landroid/os/Bundle;
    //   407: astore #9
    //   409: goto -> 427
    //   412: aload #12
    //   414: getfield o : Landroidx/fragment/app/Fragment;
    //   417: astore_1
    //   418: new android/os/Bundle
    //   421: dup
    //   422: invokespecial <init> : ()V
    //   425: astore #9
    //   427: aload_1
    //   428: aload #9
    //   430: putfield c : Landroid/os/Bundle;
    //   433: aload #12
    //   435: getfield o : Landroidx/fragment/app/Fragment;
    //   438: astore_1
    //   439: aload_1
    //   440: aload #12
    //   442: getfield c : Ljava/lang/String;
    //   445: putfield f : Ljava/lang/String;
    //   448: aload_1
    //   449: aload #12
    //   451: getfield d : Z
    //   454: putfield n : Z
    //   457: aload_1
    //   458: iconst_1
    //   459: putfield p : Z
    //   462: aload_1
    //   463: aload #12
    //   465: getfield e : I
    //   468: putfield w : I
    //   471: aload_1
    //   472: aload #12
    //   474: getfield f : I
    //   477: putfield x : I
    //   480: aload_1
    //   481: aload #12
    //   483: getfield g : Ljava/lang/String;
    //   486: putfield y : Ljava/lang/String;
    //   489: aload_1
    //   490: aload #12
    //   492: getfield h : Z
    //   495: putfield B : Z
    //   498: aload_1
    //   499: aload #12
    //   501: getfield i : Z
    //   504: putfield m : Z
    //   507: aload_1
    //   508: aload #12
    //   510: getfield j : Z
    //   513: putfield A : Z
    //   516: aload_1
    //   517: aload #12
    //   519: getfield l : Z
    //   522: putfield z : Z
    //   525: aload_1
    //   526: invokestatic values : ()[Lb/n/d$b;
    //   529: aload #12
    //   531: getfield m : I
    //   534: aaload
    //   535: putfield Q : Lb/n/d$b;
    //   538: aload #12
    //   540: getfield o : Landroidx/fragment/app/Fragment;
    //   543: astore_1
    //   544: aload_1
    //   545: aload_0
    //   546: putfield s : Lb/l/a/k;
    //   549: aload_0
    //   550: getfield h : Ljava/util/HashMap;
    //   553: aload_1
    //   554: getfield f : Ljava/lang/String;
    //   557: aload_1
    //   558: invokevirtual put : (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    //   561: pop
    //   562: aload #12
    //   564: aconst_null
    //   565: putfield o : Landroidx/fragment/app/Fragment;
    //   568: goto -> 278
    //   571: aload_0
    //   572: getfield g : Ljava/util/ArrayList;
    //   575: invokevirtual clear : ()V
    //   578: aload #10
    //   580: getfield c : Ljava/util/ArrayList;
    //   583: astore_1
    //   584: aload_1
    //   585: ifnull -> 765
    //   588: aload_1
    //   589: invokevirtual iterator : ()Ljava/util/Iterator;
    //   592: astore #9
    //   594: aload #9
    //   596: invokeinterface hasNext : ()Z
    //   601: ifeq -> 765
    //   604: aload #9
    //   606: invokeinterface next : ()Ljava/lang/Object;
    //   611: checkcast java/lang/String
    //   614: astore #11
    //   616: aload_0
    //   617: getfield h : Ljava/util/HashMap;
    //   620: aload #11
    //   622: invokevirtual get : (Ljava/lang/Object;)Ljava/lang/Object;
    //   625: checkcast androidx/fragment/app/Fragment
    //   628: astore_1
    //   629: aload_1
    //   630: ifnull -> 717
    //   633: aload_1
    //   634: iconst_1
    //   635: putfield l : Z
    //   638: aload_0
    //   639: getfield g : Ljava/util/ArrayList;
    //   642: aload_1
    //   643: invokevirtual contains : (Ljava/lang/Object;)Z
    //   646: ifne -> 679
    //   649: aload_0
    //   650: getfield g : Ljava/util/ArrayList;
    //   653: astore #11
    //   655: aload #11
    //   657: monitorenter
    //   658: aload_0
    //   659: getfield g : Ljava/util/ArrayList;
    //   662: aload_1
    //   663: invokevirtual add : (Ljava/lang/Object;)Z
    //   666: pop
    //   667: aload #11
    //   669: monitorexit
    //   670: goto -> 594
    //   673: astore_1
    //   674: aload #11
    //   676: monitorexit
    //   677: aload_1
    //   678: athrow
    //   679: new java/lang/StringBuilder
    //   682: dup
    //   683: invokespecial <init> : ()V
    //   686: astore #9
    //   688: aload #9
    //   690: ldc_w 'Already added '
    //   693: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   696: pop
    //   697: aload #9
    //   699: aload_1
    //   700: invokevirtual append : (Ljava/lang/Object;)Ljava/lang/StringBuilder;
    //   703: pop
    //   704: new java/lang/IllegalStateException
    //   707: dup
    //   708: aload #9
    //   710: invokevirtual toString : ()Ljava/lang/String;
    //   713: invokespecial <init> : (Ljava/lang/String;)V
    //   716: athrow
    //   717: new java/lang/StringBuilder
    //   720: dup
    //   721: invokespecial <init> : ()V
    //   724: astore_1
    //   725: aload_1
    //   726: ldc_w 'No instantiated fragment for ('
    //   729: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   732: pop
    //   733: aload_1
    //   734: aload #11
    //   736: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   739: pop
    //   740: aload_1
    //   741: ldc_w ')'
    //   744: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   747: pop
    //   748: aload_0
    //   749: new java/lang/IllegalStateException
    //   752: dup
    //   753: aload_1
    //   754: invokevirtual toString : ()Ljava/lang/String;
    //   757: invokespecial <init> : (Ljava/lang/String;)V
    //   760: invokevirtual r0 : (Ljava/lang/RuntimeException;)V
    //   763: aconst_null
    //   764: athrow
    //   765: aload #10
    //   767: getfield d : [Lb/l/a/b;
    //   770: ifnull -> 1346
    //   773: aload_0
    //   774: new java/util/ArrayList
    //   777: dup
    //   778: aload #10
    //   780: getfield d : [Lb/l/a/b;
    //   783: arraylength
    //   784: invokespecial <init> : (I)V
    //   787: putfield i : Ljava/util/ArrayList;
    //   790: iconst_0
    //   791: istore_2
    //   792: aload #10
    //   794: getfield d : [Lb/l/a/b;
    //   797: astore_1
    //   798: iload_2
    //   799: aload_1
    //   800: arraylength
    //   801: if_icmpge -> 1351
    //   804: aload_1
    //   805: iload_2
    //   806: aaload
    //   807: astore #11
    //   809: aload #11
    //   811: ifnull -> 1344
    //   814: new b/l/a/a
    //   817: dup
    //   818: aload_0
    //   819: invokespecial <init> : (Lb/l/a/k;)V
    //   822: astore #9
    //   824: iconst_0
    //   825: istore #4
    //   827: iconst_0
    //   828: istore_3
    //   829: iload #4
    //   831: aload #11
    //   833: getfield b : [I
    //   836: arraylength
    //   837: if_icmpge -> 1065
    //   840: new b/l/a/r$a
    //   843: dup
    //   844: invokespecial <init> : ()V
    //   847: astore #12
    //   849: aload #11
    //   851: getfield b : [I
    //   854: astore_1
    //   855: iload #4
    //   857: iconst_1
    //   858: iadd
    //   859: istore #6
    //   861: aload #12
    //   863: aload_1
    //   864: iload #4
    //   866: iaload
    //   867: putfield a : I
    //   870: aload #11
    //   872: getfield c : Ljava/util/ArrayList;
    //   875: iload_3
    //   876: invokevirtual get : (I)Ljava/lang/Object;
    //   879: checkcast java/lang/String
    //   882: astore_1
    //   883: aload_1
    //   884: ifnull -> 902
    //   887: aload_0
    //   888: getfield h : Ljava/util/HashMap;
    //   891: aload_1
    //   892: invokevirtual get : (Ljava/lang/Object;)Ljava/lang/Object;
    //   895: checkcast androidx/fragment/app/Fragment
    //   898: astore_1
    //   899: goto -> 904
    //   902: aconst_null
    //   903: astore_1
    //   904: aload #12
    //   906: aload_1
    //   907: putfield b : Landroidx/fragment/app/Fragment;
    //   910: aload #12
    //   912: invokestatic values : ()[Lb/n/d$b;
    //   915: aload #11
    //   917: getfield d : [I
    //   920: iload_3
    //   921: iaload
    //   922: aaload
    //   923: putfield g : Lb/n/d$b;
    //   926: aload #12
    //   928: invokestatic values : ()[Lb/n/d$b;
    //   931: aload #11
    //   933: getfield e : [I
    //   936: iload_3
    //   937: iaload
    //   938: aaload
    //   939: putfield h : Lb/n/d$b;
    //   942: aload #11
    //   944: getfield b : [I
    //   947: astore_1
    //   948: iload #6
    //   950: iconst_1
    //   951: iadd
    //   952: istore #5
    //   954: aload_1
    //   955: iload #6
    //   957: iaload
    //   958: istore #4
    //   960: aload #12
    //   962: iload #4
    //   964: putfield c : I
    //   967: iload #5
    //   969: iconst_1
    //   970: iadd
    //   971: istore #7
    //   973: aload_1
    //   974: iload #5
    //   976: iaload
    //   977: istore #6
    //   979: aload #12
    //   981: iload #6
    //   983: putfield d : I
    //   986: iload #7
    //   988: iconst_1
    //   989: iadd
    //   990: istore #5
    //   992: aload_1
    //   993: iload #7
    //   995: iaload
    //   996: istore #8
    //   998: aload #12
    //   1000: iload #8
    //   1002: putfield e : I
    //   1005: aload_1
    //   1006: iload #5
    //   1008: iaload
    //   1009: istore #7
    //   1011: aload #12
    //   1013: iload #7
    //   1015: putfield f : I
    //   1018: aload #9
    //   1020: iload #4
    //   1022: putfield b : I
    //   1025: aload #9
    //   1027: iload #6
    //   1029: putfield c : I
    //   1032: aload #9
    //   1034: iload #8
    //   1036: putfield d : I
    //   1039: aload #9
    //   1041: iload #7
    //   1043: putfield e : I
    //   1046: aload #9
    //   1048: aload #12
    //   1050: invokevirtual c : (Lb/l/a/r$a;)V
    //   1053: iinc #3, 1
    //   1056: iload #5
    //   1058: iconst_1
    //   1059: iadd
    //   1060: istore #4
    //   1062: goto -> 829
    //   1065: aload #9
    //   1067: aload #11
    //   1069: getfield f : I
    //   1072: putfield f : I
    //   1075: aload #9
    //   1077: aload #11
    //   1079: getfield g : I
    //   1082: putfield g : I
    //   1085: aload #9
    //   1087: aload #11
    //   1089: getfield h : Ljava/lang/String;
    //   1092: putfield i : Ljava/lang/String;
    //   1095: aload #9
    //   1097: aload #11
    //   1099: getfield i : I
    //   1102: putfield t : I
    //   1105: aload #9
    //   1107: iconst_1
    //   1108: putfield h : Z
    //   1111: aload #9
    //   1113: aload #11
    //   1115: getfield j : I
    //   1118: putfield j : I
    //   1121: aload #9
    //   1123: aload #11
    //   1125: getfield k : Ljava/lang/CharSequence;
    //   1128: putfield k : Ljava/lang/CharSequence;
    //   1131: aload #9
    //   1133: aload #11
    //   1135: getfield l : I
    //   1138: putfield l : I
    //   1141: aload #9
    //   1143: aload #11
    //   1145: getfield m : Ljava/lang/CharSequence;
    //   1148: putfield m : Ljava/lang/CharSequence;
    //   1151: aload #9
    //   1153: aload #11
    //   1155: getfield n : Ljava/util/ArrayList;
    //   1158: putfield n : Ljava/util/ArrayList;
    //   1161: aload #9
    //   1163: aload #11
    //   1165: getfield o : Ljava/util/ArrayList;
    //   1168: putfield o : Ljava/util/ArrayList;
    //   1171: aload #9
    //   1173: aload #11
    //   1175: getfield p : Z
    //   1178: putfield p : Z
    //   1181: aload #9
    //   1183: iconst_1
    //   1184: invokevirtual h : (I)V
    //   1187: aload_0
    //   1188: getfield i : Ljava/util/ArrayList;
    //   1191: aload #9
    //   1193: invokevirtual add : (Ljava/lang/Object;)Z
    //   1196: pop
    //   1197: aload #9
    //   1199: getfield t : I
    //   1202: istore #5
    //   1204: iload #5
    //   1206: iflt -> 1338
    //   1209: aload_0
    //   1210: monitorenter
    //   1211: aload_0
    //   1212: getfield m : Ljava/util/ArrayList;
    //   1215: ifnonnull -> 1231
    //   1218: new java/util/ArrayList
    //   1221: astore_1
    //   1222: aload_1
    //   1223: invokespecial <init> : ()V
    //   1226: aload_0
    //   1227: aload_1
    //   1228: putfield m : Ljava/util/ArrayList;
    //   1231: aload_0
    //   1232: getfield m : Ljava/util/ArrayList;
    //   1235: invokevirtual size : ()I
    //   1238: istore #4
    //   1240: iload #4
    //   1242: istore_3
    //   1243: iload #5
    //   1245: iload #4
    //   1247: if_icmpge -> 1265
    //   1250: aload_0
    //   1251: getfield m : Ljava/util/ArrayList;
    //   1254: iload #5
    //   1256: aload #9
    //   1258: invokevirtual set : (ILjava/lang/Object;)Ljava/lang/Object;
    //   1261: pop
    //   1262: goto -> 1328
    //   1265: iload_3
    //   1266: iload #5
    //   1268: if_icmpge -> 1318
    //   1271: aload_0
    //   1272: getfield m : Ljava/util/ArrayList;
    //   1275: aconst_null
    //   1276: invokevirtual add : (Ljava/lang/Object;)Z
    //   1279: pop
    //   1280: aload_0
    //   1281: getfield n : Ljava/util/ArrayList;
    //   1284: ifnonnull -> 1300
    //   1287: new java/util/ArrayList
    //   1290: astore_1
    //   1291: aload_1
    //   1292: invokespecial <init> : ()V
    //   1295: aload_0
    //   1296: aload_1
    //   1297: putfield n : Ljava/util/ArrayList;
    //   1300: aload_0
    //   1301: getfield n : Ljava/util/ArrayList;
    //   1304: iload_3
    //   1305: invokestatic valueOf : (I)Ljava/lang/Integer;
    //   1308: invokevirtual add : (Ljava/lang/Object;)Z
    //   1311: pop
    //   1312: iinc #3, 1
    //   1315: goto -> 1265
    //   1318: aload_0
    //   1319: getfield m : Ljava/util/ArrayList;
    //   1322: aload #9
    //   1324: invokevirtual add : (Ljava/lang/Object;)Z
    //   1327: pop
    //   1328: aload_0
    //   1329: monitorexit
    //   1330: goto -> 1338
    //   1333: astore_1
    //   1334: aload_0
    //   1335: monitorexit
    //   1336: aload_1
    //   1337: athrow
    //   1338: iinc #2, 1
    //   1341: goto -> 792
    //   1344: aconst_null
    //   1345: athrow
    //   1346: aload_0
    //   1347: aconst_null
    //   1348: putfield i : Ljava/util/ArrayList;
    //   1351: aload #10
    //   1353: getfield e : Ljava/lang/String;
    //   1356: astore_1
    //   1357: aload_1
    //   1358: ifnull -> 1383
    //   1361: aload_0
    //   1362: getfield h : Ljava/util/HashMap;
    //   1365: aload_1
    //   1366: invokevirtual get : (Ljava/lang/Object;)Ljava/lang/Object;
    //   1369: checkcast androidx/fragment/app/Fragment
    //   1372: astore_1
    //   1373: aload_0
    //   1374: aload_1
    //   1375: putfield t : Landroidx/fragment/app/Fragment;
    //   1378: aload_0
    //   1379: aload_1
    //   1380: invokevirtual J : (Landroidx/fragment/app/Fragment;)V
    //   1383: aload_0
    //   1384: aload #10
    //   1386: getfield f : I
    //   1389: putfield f : I
    //   1392: return
    // Exception table:
    //   from	to	target	type
    //   658	670	673	finally
    //   674	677	673	finally
    //   1211	1231	1333	finally
    //   1231	1240	1333	finally
    //   1250	1262	1333	finally
    //   1271	1300	1333	finally
    //   1300	1312	1333	finally
    //   1318	1328	1333	finally
    //   1328	1330	1333	finally
    //   1334	1336	1333	finally
  }
  
  public void k(a parama, boolean paramBoolean1, boolean paramBoolean2, boolean paramBoolean3) {
    if (paramBoolean1) {
      parama.l(paramBoolean3);
    } else {
      parama.k();
    } 
    ArrayList<a> arrayList = new ArrayList(1);
    ArrayList<Boolean> arrayList1 = new ArrayList(1);
    arrayList.add(parama);
    arrayList1.add(Boolean.valueOf(paramBoolean1));
    if (paramBoolean2)
      w.p(this, arrayList, arrayList1, 0, 1, true); 
    if (paramBoolean3)
      c0(this.p, true); 
    for (Fragment fragment : this.h.values()) {
      if (fragment != null && fragment.G != null && fragment.L && parama.m(fragment.x)) {
        float f1 = fragment.N;
        if (f1 > 0.0F)
          fragment.G.setAlpha(f1); 
        if (paramBoolean3) {
          fragment.N = 0.0F;
          continue;
        } 
        fragment.N = -1.0F;
        fragment.L = false;
      } 
    } 
  }
  
  public void l(Fragment paramFragment) {
    if (!paramFragment.A) {
      paramFragment.A = true;
      if (paramFragment.l)
        synchronized (this.g) {
          this.g.remove(paramFragment);
          if (W(paramFragment))
            this.u = true; 
          paramFragment.l = false;
        }  
    } 
  }
  
  public Parcelable l0() {
    U();
    Iterator<Fragment> iterator = this.h.values().iterator();
    while (true) {
      b[] arrayOfB;
      boolean bool1 = iterator.hasNext();
      View view2 = null;
      if (bool1) {
        Fragment fragment1 = iterator.next();
        if (fragment1 != null) {
          if (fragment1.h() != null) {
            int n = fragment1.s();
            view2 = fragment1.h();
            Animation animation = view2.getAnimation();
            if (animation != null) {
              animation.cancel();
              view2.clearAnimation();
            } 
            fragment1.R(null);
            d0(fragment1, n, 0, 0, false);
            continue;
          } 
          if (fragment1.i() != null)
            fragment1.i().end(); 
        } 
        continue;
      } 
      P();
      this.v = true;
      if (this.h.isEmpty())
        return null; 
      ArrayList<q> arrayList = new ArrayList(this.h.size());
      Iterator<Fragment> iterator1 = this.h.values().iterator();
      boolean bool = false;
      int m = 0;
      while (iterator1.hasNext()) {
        Fragment fragment1 = iterator1.next();
        if (fragment1 != null) {
          if (fragment1.s == this) {
            q q = new q(fragment1);
            arrayList.add(q);
            if (fragment1.b > 0 && q.n == null) {
              if (this.C == null)
                this.C = new Bundle(); 
              Bundle bundle2 = this.C;
              fragment1.I(bundle2);
              fragment1.U.b(bundle2);
              Parcelable parcelable = fragment1.u.l0();
              if (parcelable != null)
                bundle2.putParcelable("android:support:fragments", parcelable); 
              C(fragment1, this.C, false);
              if (!this.C.isEmpty()) {
                bundle2 = this.C;
                this.C = null;
              } else {
                bundle2 = null;
              } 
              if (fragment1.G != null)
                m0(fragment1); 
              Bundle bundle1 = bundle2;
              if (fragment1.d != null) {
                bundle1 = bundle2;
                if (bundle2 == null)
                  bundle1 = new Bundle(); 
                bundle1.putSparseParcelableArray("android:view_state", fragment1.d);
              } 
              bundle2 = bundle1;
              if (!fragment1.J) {
                bundle2 = bundle1;
                if (bundle1 == null)
                  bundle2 = new Bundle(); 
                bundle2.putBoolean("android:user_visible_hint", fragment1.J);
              } 
              q.n = bundle2;
              String str = fragment1.i;
              if (str != null) {
                Fragment fragment2 = this.h.get(str);
                if (fragment2 != null) {
                  if (q.n == null)
                    q.n = new Bundle(); 
                  Bundle bundle = q.n;
                  if (fragment2.s == this) {
                    bundle.putString("android:target_state", fragment2.f);
                    m = fragment1.j;
                    if (m != 0)
                      q.n.putInt("android:target_req_state", m); 
                  } else {
                    r0(new IllegalStateException(c.a.a.a.a.b("Fragment ", fragment2, " is not currently in the FragmentManager")));
                    throw null;
                  } 
                } else {
                  StringBuilder stringBuilder = new StringBuilder();
                  stringBuilder.append("Failure saving state: ");
                  stringBuilder.append(fragment1);
                  stringBuilder.append(" has target not in fragment manager: ");
                  stringBuilder.append(fragment1.i);
                  r0(new IllegalStateException(stringBuilder.toString()));
                  throw null;
                } 
              } 
            } else {
              q.n = fragment1.c;
            } 
            m = 1;
            continue;
          } 
          r0(new IllegalStateException(c.a.a.a.a.b("Failure saving state: active ", fragment1, " was removed from the FragmentManager")));
          throw null;
        } 
      } 
      if (m == 0)
        return null; 
      m = this.g.size();
      if (m > 0) {
        ArrayList<String> arrayList2 = new ArrayList(m);
        Iterator<Fragment> iterator2 = this.g.iterator();
        while (true) {
          ArrayList<String> arrayList3 = arrayList2;
          if (iterator2.hasNext()) {
            Fragment fragment1 = iterator2.next();
            arrayList2.add(fragment1.f);
            if (fragment1.s == this)
              continue; 
            r0(new IllegalStateException(c.a.a.a.a.b("Failure saving state: active ", fragment1, " was removed from the FragmentManager")));
            throw null;
          } 
          break;
        } 
      } else {
        iterator = null;
      } 
      ArrayList<a> arrayList1 = this.i;
      View view1 = view2;
      if (arrayList1 != null) {
        int n = arrayList1.size();
        view1 = view2;
        if (n > 0) {
          b[] arrayOfB1 = new b[n];
          m = bool;
          while (true) {
            arrayOfB = arrayOfB1;
            if (m < n) {
              arrayOfB1[m] = new b(this.i.get(m));
              m++;
              continue;
            } 
            break;
          } 
        } 
      } 
      o o = new o();
      o.b = arrayList;
      o.c = (ArrayList)iterator;
      o.d = arrayOfB;
      Fragment fragment = this.t;
      if (fragment != null)
        o.e = fragment.f; 
      o.f = this.f;
      return o;
    } 
  }
  
  public void m(Configuration paramConfiguration) {
    for (byte b1 = 0; b1 < this.g.size(); b1++) {
      Fragment fragment = this.g.get(b1);
      if (fragment != null) {
        fragment.E = true;
        fragment.u.m(paramConfiguration);
      } 
    } 
  }
  
  public void m0(Fragment paramFragment) {
    if (paramFragment.H == null)
      return; 
    SparseArray<Parcelable> sparseArray = this.D;
    if (sparseArray == null) {
      this.D = new SparseArray();
    } else {
      sparseArray.clear();
    } 
    paramFragment.H.saveHierarchyState(this.D);
    if (this.D.size() > 0) {
      paramFragment.d = this.D;
      this.D = null;
    } 
  }
  
  public boolean n(MenuItem paramMenuItem) {
    if (this.p < 1)
      return false; 
    for (byte b1 = 0; b1 < this.g.size(); b1++) {
      Fragment fragment = this.g.get(b1);
      if (fragment != null) {
        boolean bool;
        if (!fragment.z && fragment.u.n(paramMenuItem)) {
          bool = true;
        } else {
          bool = false;
        } 
        if (bool)
          return true; 
      } 
    } 
    return false;
  }
  
  public void n0() {
    // Byte code:
    //   0: aload_0
    //   1: monitorenter
    //   2: aload_0
    //   3: getfield E : Ljava/util/ArrayList;
    //   6: astore #4
    //   8: iconst_0
    //   9: istore_3
    //   10: aload #4
    //   12: ifnull -> 30
    //   15: aload_0
    //   16: getfield E : Ljava/util/ArrayList;
    //   19: invokevirtual isEmpty : ()Z
    //   22: ifne -> 30
    //   25: iconst_1
    //   26: istore_1
    //   27: goto -> 32
    //   30: iconst_0
    //   31: istore_1
    //   32: iload_3
    //   33: istore_2
    //   34: aload_0
    //   35: getfield d : Ljava/util/ArrayList;
    //   38: ifnull -> 56
    //   41: iload_3
    //   42: istore_2
    //   43: aload_0
    //   44: getfield d : Ljava/util/ArrayList;
    //   47: invokevirtual size : ()I
    //   50: iconst_1
    //   51: if_icmpne -> 56
    //   54: iconst_1
    //   55: istore_2
    //   56: iload_1
    //   57: ifne -> 64
    //   60: iload_2
    //   61: ifeq -> 97
    //   64: aload_0
    //   65: getfield q : Lb/l/a/i;
    //   68: getfield d : Landroid/os/Handler;
    //   71: aload_0
    //   72: getfield G : Ljava/lang/Runnable;
    //   75: invokevirtual removeCallbacks : (Ljava/lang/Runnable;)V
    //   78: aload_0
    //   79: getfield q : Lb/l/a/i;
    //   82: getfield d : Landroid/os/Handler;
    //   85: aload_0
    //   86: getfield G : Ljava/lang/Runnable;
    //   89: invokevirtual post : (Ljava/lang/Runnable;)Z
    //   92: pop
    //   93: aload_0
    //   94: invokevirtual s0 : ()V
    //   97: aload_0
    //   98: monitorexit
    //   99: return
    //   100: astore #4
    //   102: aload_0
    //   103: monitorexit
    //   104: aload #4
    //   106: athrow
    // Exception table:
    //   from	to	target	type
    //   2	8	100	finally
    //   15	25	100	finally
    //   34	41	100	finally
    //   43	54	100	finally
    //   64	97	100	finally
    //   97	99	100	finally
    //   102	104	100	finally
  }
  
  public void o() {
    this.v = false;
    this.w = false;
    M(1);
  }
  
  public void o0(Fragment paramFragment, b.n.d.b paramb) {
    if (this.h.get(paramFragment.f) == paramFragment && (paramFragment.t == null || paramFragment.s == this)) {
      paramFragment.Q = paramb;
      return;
    } 
    StringBuilder stringBuilder = new StringBuilder();
    stringBuilder.append("Fragment ");
    stringBuilder.append(paramFragment);
    stringBuilder.append(" is not an active fragment of FragmentManager ");
    stringBuilder.append(this);
    throw new IllegalArgumentException(stringBuilder.toString());
  }
  
  public View onCreateView(View paramView, String paramString, Context paramContext, AttributeSet paramAttributeSet) {
    boolean bool = "fragment".equals(paramString);
    paramString = null;
    if (!bool)
      return null; 
    String str2 = paramAttributeSet.getAttributeValue(null, "class");
    TypedArray typedArray = paramContext.obtainStyledAttributes(paramAttributeSet, g.a);
    int m = 0;
    String str1 = str2;
    if (str2 == null)
      str1 = typedArray.getString(0); 
    int n = typedArray.getResourceId(1, -1);
    str2 = typedArray.getString(2);
    typedArray.recycle();
    if (str1 == null || !h.b(paramContext.getClassLoader(), str1))
      return null; 
    if (paramView != null)
      m = paramView.getId(); 
    if (m != -1 || n != -1 || str2 != null) {
      String str = paramString;
      if (n != -1)
        fragment1 = S(n); 
      Fragment fragment2 = fragment1;
      if (fragment1 == null) {
        fragment2 = fragment1;
        if (str2 != null)
          fragment2 = b(str2); 
      } 
      Fragment fragment1 = fragment2;
      if (fragment2 == null) {
        fragment1 = fragment2;
        if (m != -1)
          fragment1 = S(m); 
      } 
      if (fragment1 == null) {
        int i2;
        fragment1 = V().a(paramContext.getClassLoader(), str1);
        fragment1.n = true;
        if (n != 0) {
          i2 = n;
        } else {
          i2 = m;
        } 
        fragment1.w = i2;
        fragment1.x = m;
        fragment1.y = str2;
        fragment1.o = true;
        fragment1.s = this;
        i i1 = this.q;
        fragment1.t = i1;
        Context context = i1.c;
        fragment1.F(paramAttributeSet, fragment1.c);
        f(fragment1, true);
      } else if (!fragment1.o) {
        fragment1.o = true;
        i i1 = this.q;
        fragment1.t = i1;
        Context context = i1.c;
        fragment1.F(paramAttributeSet, fragment1.c);
      } else {
        stringBuilder1 = new StringBuilder();
        stringBuilder1.append(paramAttributeSet.getPositionDescription());
        stringBuilder1.append(": Duplicate id 0x");
        stringBuilder1.append(Integer.toHexString(n));
        stringBuilder1.append(", tag ");
        stringBuilder1.append(str2);
        stringBuilder1.append(", or parent id 0x");
        stringBuilder1.append(Integer.toHexString(m));
        stringBuilder1.append(" with another fragment for ");
        stringBuilder1.append(str1);
        throw new IllegalArgumentException(stringBuilder1.toString());
      } 
      if (this.p < 1 && ((Fragment)stringBuilder1).n) {
        d0((Fragment)stringBuilder1, 1, 0, 0, false);
      } else {
        d0((Fragment)stringBuilder1, this.p, 0, 0, false);
      } 
      View view = ((Fragment)stringBuilder1).G;
      if (view != null) {
        if (n != 0)
          view.setId(n); 
        if (((Fragment)stringBuilder1).G.getTag() == null)
          ((Fragment)stringBuilder1).G.setTag(str2); 
        return ((Fragment)stringBuilder1).G;
      } 
      StringBuilder stringBuilder1 = new StringBuilder();
      stringBuilder1.append("Fragment ");
      stringBuilder1.append(str1);
      stringBuilder1.append(" did not create a view.");
      throw new IllegalStateException(stringBuilder1.toString());
    } 
    StringBuilder stringBuilder = new StringBuilder();
    stringBuilder.append(paramAttributeSet.getPositionDescription());
    stringBuilder.append(": Must specify unique android:id, android:tag, or have a parent with an id for ");
    stringBuilder.append(str1);
    throw new IllegalArgumentException(stringBuilder.toString());
  }
  
  public View onCreateView(String paramString, Context paramContext, AttributeSet paramAttributeSet) {
    return onCreateView(null, paramString, paramContext, paramAttributeSet);
  }
  
  public boolean p(Menu paramMenu, MenuInflater paramMenuInflater) {
    int m = this.p;
    boolean bool1 = false;
    if (m < 1)
      return false; 
    ArrayList<Fragment> arrayList = null;
    m = 0;
    boolean bool2;
    for (bool2 = false; m < this.g.size(); bool2 = bool) {
      Fragment fragment = this.g.get(m);
      ArrayList<Fragment> arrayList1 = arrayList;
      boolean bool = bool2;
      if (fragment != null) {
        arrayList1 = arrayList;
        bool = bool2;
        if (fragment.L(paramMenu, paramMenuInflater)) {
          arrayList1 = arrayList;
          if (arrayList == null)
            arrayList1 = new ArrayList(); 
          arrayList1.add(fragment);
          bool = true;
        } 
      } 
      m++;
      arrayList = arrayList1;
    } 
    if (this.j != null) {
      m = bool1;
      while (m < this.j.size()) {
        Fragment fragment = this.j.get(m);
        if ((arrayList != null && arrayList.contains(fragment)) || fragment != null) {
          m++;
          continue;
        } 
        throw null;
      } 
    } 
    this.j = arrayList;
    return bool2;
  }
  
  public void p0(Fragment paramFragment) {
    if (paramFragment == null || (this.h.get(paramFragment.f) == paramFragment && (paramFragment.t == null || paramFragment.s == this))) {
      Fragment fragment = this.t;
      this.t = paramFragment;
      J(fragment);
      J(this.t);
      return;
    } 
    StringBuilder stringBuilder = new StringBuilder();
    stringBuilder.append("Fragment ");
    stringBuilder.append(paramFragment);
    stringBuilder.append(" is not an active fragment of FragmentManager ");
    stringBuilder.append(this);
    throw new IllegalArgumentException(stringBuilder.toString());
  }
  
  public void q() {
    this.x = true;
    P();
    M(0);
    this.q = null;
    this.r = null;
    this.s = null;
    if (this.k != null) {
      Iterator<b.a.a> iterator = this.l.b.iterator();
      while (iterator.hasNext())
        ((b.a.a)iterator.next()).cancel(); 
      this.k = null;
    } 
  }
  
  public void q0() {
    for (Fragment fragment : this.h.values()) {
      if (fragment != null && fragment.I) {
        if (this.e) {
          this.y = true;
          continue;
        } 
        fragment.I = false;
        d0(fragment, this.p, 0, 0, false);
      } 
    } 
  }
  
  public void r() {
    for (byte b1 = 0; b1 < this.g.size(); b1++) {
      Fragment fragment = this.g.get(b1);
      if (fragment != null)
        fragment.N(); 
    } 
  }
  
  public final void r0(RuntimeException paramRuntimeException) {
    Log.e("FragmentManager", paramRuntimeException.getMessage());
    Log.e("FragmentManager", "Activity state:");
    PrintWriter printWriter = new PrintWriter((Writer)new b.i.l.a("FragmentManager"));
    i i1 = this.q;
    if (i1 != null) {
      try {
        ((e.a)i1).g.dump("  ", null, printWriter, new String[0]);
      } catch (Exception exception) {
        Log.e("FragmentManager", "Failed dumping state", exception);
      } 
    } else {
      a("  ", null, printWriter, new String[0]);
    } 
    throw paramRuntimeException;
  }
  
  public void s(boolean paramBoolean) {
    int m = this.g.size();
    while (true) {
      int n = m - 1;
      if (n >= 0) {
        Fragment fragment = this.g.get(n);
        m = n;
        if (fragment != null) {
          fragment.u.s(paramBoolean);
          m = n;
        } 
        continue;
      } 
      break;
    } 
  }
  
  public final void s0() {
    boolean bool1;
    ArrayList<h> arrayList = this.d;
    boolean bool2 = true;
    if (arrayList != null && !arrayList.isEmpty()) {
      this.l.a = true;
      return;
    } 
    b.a.b b1 = this.l;
    ArrayList<a> arrayList1 = this.i;
    if (arrayList1 != null) {
      bool1 = arrayList1.size();
    } else {
      bool1 = false;
    } 
    if (!bool1 || !X(this.s))
      bool2 = false; 
    b1.a = bool2;
  }
  
  public void t(Fragment paramFragment, Bundle paramBundle, boolean paramBoolean) {
    Fragment fragment = this.s;
    if (fragment != null) {
      k k1 = fragment.s;
      if (k1 instanceof k)
        k1.t(paramFragment, paramBundle, true); 
    } 
    for (f f1 : this.o) {
      if (paramBoolean && !f1.a)
        continue; 
      throw null;
    } 
  }
  
  public String toString() {
    i i1;
    StringBuilder stringBuilder = new StringBuilder(128);
    stringBuilder.append("FragmentManager{");
    stringBuilder.append(Integer.toHexString(System.identityHashCode(this)));
    stringBuilder.append(" in ");
    Fragment fragment = this.s;
    if (fragment == null)
      i1 = this.q; 
    a.a.a.a.a.d(i1, stringBuilder);
    stringBuilder.append("}}");
    return stringBuilder.toString();
  }
  
  public void u(Fragment paramFragment, Context paramContext, boolean paramBoolean) {
    Fragment fragment = this.s;
    if (fragment != null) {
      k k1 = fragment.s;
      if (k1 instanceof k)
        k1.u(paramFragment, paramContext, true); 
    } 
    for (f f1 : this.o) {
      if (paramBoolean && !f1.a)
        continue; 
      throw null;
    } 
  }
  
  public void v(Fragment paramFragment, Bundle paramBundle, boolean paramBoolean) {
    Fragment fragment = this.s;
    if (fragment != null) {
      k k1 = fragment.s;
      if (k1 instanceof k)
        k1.v(paramFragment, paramBundle, true); 
    } 
    for (f f1 : this.o) {
      if (paramBoolean && !f1.a)
        continue; 
      throw null;
    } 
  }
  
  public void w(Fragment paramFragment, boolean paramBoolean) {
    Fragment fragment = this.s;
    if (fragment != null) {
      k k1 = fragment.s;
      if (k1 instanceof k)
        k1.w(paramFragment, true); 
    } 
    for (f f1 : this.o) {
      if (paramBoolean && !f1.a)
        continue; 
      throw null;
    } 
  }
  
  public void x(Fragment paramFragment, boolean paramBoolean) {
    Fragment fragment = this.s;
    if (fragment != null) {
      k k1 = fragment.s;
      if (k1 instanceof k)
        k1.x(paramFragment, true); 
    } 
    for (f f1 : this.o) {
      if (paramBoolean && !f1.a)
        continue; 
      throw null;
    } 
  }
  
  public void y(Fragment paramFragment, boolean paramBoolean) {
    Fragment fragment = this.s;
    if (fragment != null) {
      k k1 = fragment.s;
      if (k1 instanceof k)
        k1.y(paramFragment, true); 
    } 
    for (f f1 : this.o) {
      if (paramBoolean && !f1.a)
        continue; 
      throw null;
    } 
  }
  
  public void z(Fragment paramFragment, Context paramContext, boolean paramBoolean) {
    Fragment fragment = this.s;
    if (fragment != null) {
      k k1 = fragment.s;
      if (k1 instanceof k)
        k1.z(paramFragment, paramContext, true); 
    } 
    for (f f1 : this.o) {
      if (paramBoolean && !f1.a)
        continue; 
      throw null;
    } 
  }
  
  public class a extends b.a.b {
    public final k c;
    
    public a(k this$0, boolean param1Boolean) {
      super(param1Boolean);
    }
  }
  
  public class b implements Runnable {
    public final k b;
    
    public b(k this$0) {}
    
    public void run() {
      this.b.P();
    }
  }
  
  public class c extends h {
    public final k b;
    
    public c(k this$0) {}
    
    public Fragment a(ClassLoader param1ClassLoader, String param1String) {
      i i = this.b.q;
      Context context = i.c;
      if (i != null)
        return Fragment.v(context, param1String, null); 
      throw null;
    }
  }
  
  public static class d {
    public final Animation a = null;
    
    public final Animator b;
    
    public d(Animator param1Animator) {
      this.b = param1Animator;
    }
    
    public d(Animation param1Animation) {
      this.b = null;
    }
  }
  
  public static class e extends AnimationSet implements Runnable {
    public final ViewGroup b;
    
    public final View c;
    
    public boolean d;
    
    public boolean e;
    
    public boolean f = true;
    
    public e(Animation param1Animation, ViewGroup param1ViewGroup, View param1View) {
      super(false);
      this.b = param1ViewGroup;
      this.c = param1View;
      addAnimation(param1Animation);
      this.b.post(this);
    }
    
    public boolean getTransformation(long param1Long, Transformation param1Transformation) {
      this.f = true;
      if (this.d)
        return this.e ^ true; 
      if (!super.getTransformation(param1Long, param1Transformation)) {
        this.d = true;
        b.i.m.k.a((View)this.b, this);
      } 
      return true;
    }
    
    public boolean getTransformation(long param1Long, Transformation param1Transformation, float param1Float) {
      this.f = true;
      if (this.d)
        return this.e ^ true; 
      if (!super.getTransformation(param1Long, param1Transformation, param1Float)) {
        this.d = true;
        b.i.m.k.a((View)this.b, this);
      } 
      return true;
    }
    
    public void run() {
      if (!this.d && this.f) {
        this.f = false;
        this.b.post(this);
      } else {
        this.b.endViewTransition(this.c);
        this.e = true;
      } 
    }
  }
  
  public static final class f {
    public final boolean a;
  }
  
  public static class g {
    public static final int[] a = new int[] { 16842755, 16842960, 16842961 };
  }
  
  public static interface h {
    boolean a(ArrayList<a> param1ArrayList, ArrayList<Boolean> param1ArrayList1);
  }
  
  public class i implements h {
    public final String a = null;
    
    public final int b;
    
    public final int c;
    
    public final k d;
    
    public i(k this$0, String param1String, int param1Int1, int param1Int2) {
      this.b = param1Int1;
      this.c = param1Int2;
    }
    
    public boolean a(ArrayList<a> param1ArrayList, ArrayList<Boolean> param1ArrayList1) {
      Fragment fragment = this.d.t;
      return (fragment != null && this.b < 0 && this.a == null && fragment.j().d()) ? false : this.d.f0(param1ArrayList, param1ArrayList1, this.a, this.b, this.c);
    }
  }
  
  public static class j implements Fragment.d {
    public final boolean a;
    
    public final a b;
    
    public int c;
    
    public j(a param1a, boolean param1Boolean) {
      this.a = param1Boolean;
      this.b = param1a;
    }
    
    public void a() {
      boolean bool;
      if (this.c > 0) {
        bool = true;
      } else {
        bool = false;
      } 
      k k = this.b.r;
      int i = k.g.size();
      for (byte b = 0; b < i; b++) {
        Fragment fragment = k.g.get(b);
        fragment.W(null);
        if (bool) {
          boolean bool1;
          Fragment.b b1 = fragment.K;
          if (b1 == null) {
            bool1 = false;
          } else {
            bool1 = b1.q;
          } 
          if (bool1)
            fragment.Y(); 
        } 
      } 
      a a1 = this.b;
      a1.r.k(a1, this.a, bool ^ true, true);
    }
  }
}


/* Location:              C:\Users\panch\Downloads\dvba_v1.1.0-dex2jar.jar!\b\l\a\k.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */