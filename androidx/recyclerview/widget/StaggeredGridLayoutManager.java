package androidx.recyclerview.widget;

import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.PointF;
import android.graphics.Rect;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import b.r.d.m;
import b.r.d.n;
import b.r.d.o;
import b.r.d.t;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.BitSet;
import java.util.List;

public class StaggeredGridLayoutManager extends RecyclerView.o implements RecyclerView.z.b {
  public boolean A;
  
  public BitSet B;
  
  public int C;
  
  public int D;
  
  public d E;
  
  public int F;
  
  public boolean G;
  
  public boolean H;
  
  public e I;
  
  public int J;
  
  public final Rect K;
  
  public final b L;
  
  public boolean M;
  
  public boolean N;
  
  public int[] O;
  
  public final Runnable P;
  
  public int s = -1;
  
  public f[] t;
  
  public t u;
  
  public t v;
  
  public int w;
  
  public int x;
  
  public final n y;
  
  public boolean z;
  
  public StaggeredGridLayoutManager(Context paramContext, AttributeSet paramAttributeSet, int paramInt1, int paramInt2) {
    boolean bool = false;
    this.z = false;
    this.A = false;
    this.C = -1;
    this.D = Integer.MIN_VALUE;
    this.E = new d();
    this.F = 2;
    this.K = new Rect();
    this.L = new b(this);
    this.M = false;
    this.N = true;
    this.P = new a(this);
    RecyclerView.o.d d1 = RecyclerView.o.Q(paramContext, paramAttributeSet, paramInt1, paramInt2);
    paramInt1 = d1.a;
    if (paramInt1 == 0 || paramInt1 == 1) {
      d(null);
      if (paramInt1 != this.w) {
        this.w = paramInt1;
        t t1 = this.u;
        this.u = this.v;
        this.v = t1;
        I0();
      } 
      paramInt1 = d1.b;
      d(null);
      if (paramInt1 != this.s) {
        this.E.b();
        I0();
        this.s = paramInt1;
        this.B = new BitSet(this.s);
        this.t = new f[this.s];
        for (paramInt1 = bool; paramInt1 < this.s; paramInt1++)
          this.t[paramInt1] = new f(this, paramInt1); 
        I0();
      } 
      boolean bool1 = d1.c;
      d(null);
      e e1 = this.I;
      if (e1 != null && e1.i != bool1)
        e1.i = bool1; 
      this.z = bool1;
      I0();
      this.y = new n();
      this.u = t.a(this, this.w);
      this.v = t.a(this, 1 - this.w);
      return;
    } 
    throw new IllegalArgumentException("invalid orientation.");
  }
  
  public int A(RecyclerView.v paramv, RecyclerView.a0 parama0) {
    return (this.w == 1) ? this.s : super.A(paramv, parama0);
  }
  
  public final void A1(f paramf, int paramInt1, int paramInt2) {
    int i = paramf.d;
    if (paramInt1 == -1) {
      paramInt1 = paramf.b;
      if (paramInt1 == Integer.MIN_VALUE) {
        paramf.c();
        paramInt1 = paramf.b;
      } 
      if (paramInt1 + i <= paramInt2) {
        this.B.set(paramf.e, false);
        return;
      } 
    } else {
      paramInt1 = paramf.c;
      if (paramInt1 == Integer.MIN_VALUE) {
        paramf.b();
        paramInt1 = paramf.c;
      } 
      if (paramInt1 - i >= paramInt2) {
        this.B.set(paramf.e, false);
        return;
      } 
    } 
  }
  
  public final int B1(int paramInt1, int paramInt2, int paramInt3) {
    if (paramInt2 == 0 && paramInt3 == 0)
      return paramInt1; 
    int i = View.MeasureSpec.getMode(paramInt1);
    return (i == Integer.MIN_VALUE || i == 1073741824) ? View.MeasureSpec.makeMeasureSpec(Math.max(0, View.MeasureSpec.getSize(paramInt1) - paramInt2 - paramInt3), i) : paramInt1;
  }
  
  public int J0(int paramInt, RecyclerView.v paramv, RecyclerView.a0 parama0) {
    return w1(paramInt, paramv, parama0);
  }
  
  public void K0(int paramInt) {
    e e1 = this.I;
    if (e1 != null && e1.b != paramInt) {
      e1.e = null;
      e1.d = 0;
      e1.b = -1;
      e1.c = -1;
    } 
    this.C = paramInt;
    this.D = Integer.MIN_VALUE;
    I0();
  }
  
  public int L0(int paramInt, RecyclerView.v paramv, RecyclerView.a0 parama0) {
    return w1(paramInt, paramv, parama0);
  }
  
  public void O0(Rect paramRect, int paramInt1, int paramInt2) {
    int i = M();
    i = N() + i;
    int j = O();
    j = L() + j;
    if (this.w == 1) {
      paramInt2 = RecyclerView.o.h(paramInt2, paramRect.height() + j, J());
      i = RecyclerView.o.h(paramInt1, this.x * this.s + i, K());
      paramInt1 = paramInt2;
      paramInt2 = i;
    } else {
      paramInt1 = RecyclerView.o.h(paramInt1, paramRect.width() + i, K());
      i = RecyclerView.o.h(paramInt2, this.x * this.s + j, J());
      paramInt2 = paramInt1;
      paramInt1 = i;
    } 
    RecyclerView.access$300(this.b, paramInt2, paramInt1);
  }
  
  public int R(RecyclerView.v paramv, RecyclerView.a0 parama0) {
    return (this.w == 0) ? this.s : super.R(paramv, parama0);
  }
  
  public boolean U() {
    boolean bool;
    if (this.F != 0) {
      bool = true;
    } else {
      bool = false;
    } 
    return bool;
  }
  
  public void U0(RecyclerView paramRecyclerView, RecyclerView.a0 parama0, int paramInt) {
    o o1 = new o(paramRecyclerView.getContext());
    ((RecyclerView.z)o1).a = paramInt;
    V0((RecyclerView.z)o1);
  }
  
  public boolean W0() {
    boolean bool;
    if (this.I == null) {
      bool = true;
    } else {
      bool = false;
    } 
    return bool;
  }
  
  public final int X0(int paramInt) {
    boolean bool;
    int i = y();
    byte b1 = -1;
    if (i == 0) {
      if (this.A)
        b1 = 1; 
      return b1;
    } 
    if (paramInt < h1()) {
      bool = true;
    } else {
      bool = false;
    } 
    if (bool == this.A)
      b1 = 1; 
    return b1;
  }
  
  public boolean Y0() {
    int i;
    int j;
    byte b1;
    if (y() == 0 || this.F == 0 || !this.i)
      return false; 
    if (this.A) {
      i = i1();
      j = h1();
    } else {
      i = h1();
      j = i1();
    } 
    if (i == 0 && m1() != null) {
      this.E.b();
      this.h = true;
      I0();
      return true;
    } 
    if (!this.M)
      return false; 
    if (this.A) {
      b1 = -1;
    } else {
      b1 = 1;
    } 
    d d1 = this.E;
    d.a a2 = d1.e(i, ++j, b1, true);
    if (a2 == null) {
      this.M = false;
      this.E.d(j);
      return false;
    } 
    d.a a1 = this.E.e(i, a2.b, b1 * -1, true);
    if (a1 == null) {
      this.E.d(a2.b);
      this.h = true;
      I0();
      return true;
    } 
    this.E.d(a1.b + 1);
    this.h = true;
    I0();
    return true;
  }
  
  public void Z(int paramInt) {
    RecyclerView recyclerView = this.b;
    if (recyclerView != null)
      recyclerView.offsetChildrenHorizontal(paramInt); 
    for (byte b1 = 0; b1 < this.s; b1++) {
      f f1 = this.t[b1];
      int i = f1.b;
      if (i != Integer.MIN_VALUE)
        f1.b = i + paramInt; 
      i = f1.c;
      if (i != Integer.MIN_VALUE)
        f1.c = i + paramInt; 
    } 
  }
  
  public final int Z0(RecyclerView.a0 parama0) {
    return (y() == 0) ? 0 : a.a.a.a.a.l(parama0, this.u, e1(this.N ^ true), d1(this.N ^ true), this, this.N);
  }
  
  public PointF a(int paramInt) {
    paramInt = X0(paramInt);
    PointF pointF = new PointF();
    if (paramInt == 0)
      return null; 
    if (this.w == 0) {
      pointF.x = paramInt;
      pointF.y = 0.0F;
    } else {
      pointF.x = 0.0F;
      pointF.y = paramInt;
    } 
    return pointF;
  }
  
  public void a0(int paramInt) {
    RecyclerView recyclerView = this.b;
    if (recyclerView != null)
      recyclerView.offsetChildrenVertical(paramInt); 
    for (byte b1 = 0; b1 < this.s; b1++) {
      f f1 = this.t[b1];
      int i = f1.b;
      if (i != Integer.MIN_VALUE)
        f1.b = i + paramInt; 
      i = f1.c;
      if (i != Integer.MIN_VALUE)
        f1.c = i + paramInt; 
    } 
  }
  
  public final int a1(RecyclerView.a0 parama0) {
    return (y() == 0) ? 0 : a.a.a.a.a.m(parama0, this.u, e1(this.N ^ true), d1(this.N ^ true), this, this.N, this.A);
  }
  
  public final int b1(RecyclerView.a0 parama0) {
    return (y() == 0) ? 0 : a.a.a.a.a.n(parama0, this.u, e1(this.N ^ true), d1(this.N ^ true), this, this.N);
  }
  
  public final int c1(RecyclerView.v paramv, n paramn, RecyclerView.a0 parama0) {
    int j;
    int k;
    this.B.set(0, this.s, true);
    if (this.y.i) {
      if (paramn.e == 1) {
        j = Integer.MAX_VALUE;
      } else {
        j = Integer.MIN_VALUE;
      } 
    } else {
      int m;
      if (paramn.e == 1) {
        m = paramn.g + paramn.b;
      } else {
        m = paramn.f - paramn.b;
      } 
      j = m;
    } 
    y1(paramn.e, j);
    if (this.A) {
      k = this.u.g();
    } else {
      k = this.u.k();
    } 
    int i = 0;
    while (true) {
      int i1;
      View view;
      int m = paramn.c;
      if (m >= 0 && m < parama0.b()) {
        m = 1;
      } else {
        m = 0;
      } 
      if (m != 0 && (this.y.i || !this.B.isEmpty())) {
        f f1;
        view = (paramv.k(paramn.c, false, Long.MAX_VALUE)).a;
        paramn.c += paramn.d;
        c c = (c)view.getLayoutParams();
        int i4 = c.a();
        int[] arrayOfInt = this.E.a;
        if (arrayOfInt == null || i4 >= arrayOfInt.length) {
          i = -1;
        } else {
          i = arrayOfInt[i4];
        } 
        if (i == -1) {
          m = 1;
        } else {
          m = 0;
        } 
        if (m != 0) {
          if (c.f) {
            f1 = this.t[0];
          } else {
            byte b1;
            int i5;
            f f2;
            if (q1(paramn.e)) {
              i = this.s - 1;
              i5 = -1;
              b1 = -1;
            } else {
              i5 = this.s;
              i = 0;
              b1 = 1;
            } 
            int i6 = paramn.e;
            int[] arrayOfInt1 = null;
            arrayOfInt = null;
            if (i6 == 1) {
              int i7 = this.u.k();
              i6 = Integer.MAX_VALUE;
              while (true) {
                arrayOfInt1 = arrayOfInt;
                if (i != i5) {
                  f2 = this.t[i];
                  int i9 = f2.h(i7);
                  int i8 = i6;
                  if (i9 < i6) {
                    f f3 = f2;
                    i8 = i9;
                  } 
                  i += b1;
                  i6 = i8;
                  continue;
                } 
                break;
              } 
            } else {
              int i7 = this.u.g();
              i6 = Integer.MIN_VALUE;
              f f3 = f2;
              while (true) {
                f2 = f3;
                if (i != i5) {
                  f2 = this.t[i];
                  int i9 = f2.k(i7);
                  int i8 = i6;
                  if (i9 > i6) {
                    f3 = f2;
                    i8 = i9;
                  } 
                  i += b1;
                  i6 = i8;
                  continue;
                } 
                break;
              } 
            } 
            f1 = f2;
          } 
          d d1 = this.E;
          d1.c(i4);
          d1.a[i4] = f1.e;
        } else {
          f1 = this.t[i];
        } 
        c.e = f1;
        if (paramn.e == 1) {
          c(view, -1, false);
        } else {
          c(view, 0, false);
        } 
        if (c.f) {
          if (this.w == 1) {
            i = this.J;
          } else {
            int i5 = this.q;
            int i6 = this.o;
            i = M();
            o1(view, RecyclerView.o.z(i5, i6, N() + i, c.width, true), this.J, false);
            if (paramn.e == 1) {
              if (c.f) {
                i = j1(k);
              } else {
                i = f1.h(k);
              } 
              i6 = this.u.c(view);
              if (m != 0 && c.f) {
                d.a a = new d.a();
                a.d = new int[this.s];
                for (i5 = 0; i5 < this.s; i5++)
                  a.d[i5] = i - this.t[i5].h(i); 
                a.c = -1;
                a.b = i4;
                this.E.a(a);
              } 
              i5 = i;
              i6 += i;
            } else {
              if (c.f) {
                i = k1(k);
              } else {
                i = f1.k(k);
              } 
              int i7 = this.u.c(view);
              if (m != 0 && c.f) {
                d.a a = new d.a();
                a.d = new int[this.s];
                for (i5 = 0; i5 < this.s; i5++)
                  a.d[i5] = this.t[i5].k(i) - i; 
                a.c = 1;
                a.b = i4;
                this.E.a(a);
              } 
              i6 = i;
              i5 = i - i7;
            } 
          } 
        } else if (this.w == 1) {
          i = RecyclerView.o.z(this.x, this.o, 0, c.width, false);
        } else {
          int i6 = this.q;
          int i5 = this.o;
          i = M();
          i = RecyclerView.o.z(i6, i5, N() + i, c.width, true);
          i5 = RecyclerView.o.z(this.x, this.p, 0, c.height, false);
          o1(view, i, i5, false);
        } 
        i1 = this.r;
        int i3 = this.p;
        int i2 = O();
        i1 = RecyclerView.o.z(i1, i3, L() + i2, c.height, true);
      } else {
        break;
      } 
      o1(view, i, i1, false);
    } 
    if (i == 0)
      s1(paramv, this.y); 
    if (this.y.e == -1) {
      i = k1(this.u.k());
      i = this.u.k() - i;
    } else {
      i = j1(this.u.g()) - this.u.g();
    } 
    if (i > 0) {
      i = Math.min(paramn.b, i);
    } else {
      i = 0;
    } 
    return i;
  }
  
  public void d(String paramString) {
    if (this.I == null) {
      RecyclerView recyclerView = this.b;
      if (recyclerView != null)
        recyclerView.assertNotInLayoutOrScroll(paramString); 
    } 
  }
  
  public View d1(boolean paramBoolean) {
    int j = this.u.k();
    int k = this.u.g();
    int i = y() - 1;
    View view;
    for (view = null; i >= 0; view = view1) {
      View view2 = x(i);
      int m = this.u.e(view2);
      int i1 = this.u.b(view2);
      View view1 = view;
      if (i1 > j)
        if (m >= k) {
          view1 = view;
        } else {
          if (i1 <= k || !paramBoolean)
            return view2; 
          view1 = view;
          if (view == null)
            view1 = view2; 
        }  
      i--;
    } 
    return view;
  }
  
  public boolean e() {
    boolean bool;
    if (this.w == 0) {
      bool = true;
    } else {
      bool = false;
    } 
    return bool;
  }
  
  public View e1(boolean paramBoolean) {
    int j = this.u.k();
    int k = this.u.g();
    int i = y();
    View view = null;
    byte b1 = 0;
    while (b1 < i) {
      View view2 = x(b1);
      int m = this.u.e(view2);
      View view1 = view;
      if (this.u.b(view2) > j)
        if (m >= k) {
          view1 = view;
        } else {
          if (m >= j || !paramBoolean)
            return view2; 
          view1 = view;
          if (view == null)
            view1 = view2; 
        }  
      b1++;
      view = view1;
    } 
    return view;
  }
  
  public boolean f() {
    int i = this.w;
    boolean bool = true;
    if (i != 1)
      bool = false; 
    return bool;
  }
  
  public void f0(RecyclerView paramRecyclerView, RecyclerView.v paramv) {
    e0();
    Runnable runnable = this.P;
    RecyclerView recyclerView = this.b;
    if (recyclerView != null)
      recyclerView.removeCallbacks(runnable); 
    for (byte b1 = 0; b1 < this.s; b1++)
      this.t[b1].d(); 
    paramRecyclerView.requestLayout();
  }
  
  public final void f1(RecyclerView.v paramv, RecyclerView.a0 parama0, boolean paramBoolean) {
    int i = j1(-2147483648);
    if (i == Integer.MIN_VALUE)
      return; 
    i = this.u.g() - i;
    if (i > 0) {
      i -= -w1(-i, paramv, parama0);
      if (paramBoolean && i > 0)
        this.u.p(i); 
    } 
  }
  
  public boolean g(RecyclerView.p paramp) {
    return paramp instanceof c;
  }
  
  public View g0(View paramView, int paramInt, RecyclerView.v paramv, RecyclerView.a0 parama0) {
    // Byte code:
    //   0: aload_0
    //   1: invokevirtual y : ()I
    //   4: ifne -> 9
    //   7: aconst_null
    //   8: areturn
    //   9: aload_0
    //   10: aload_1
    //   11: invokevirtual s : (Landroid/view/View;)Landroid/view/View;
    //   14: astore_1
    //   15: aload_1
    //   16: ifnonnull -> 21
    //   19: aconst_null
    //   20: areturn
    //   21: aload_0
    //   22: invokevirtual v1 : ()V
    //   25: iload_2
    //   26: iconst_1
    //   27: if_icmpeq -> 136
    //   30: iload_2
    //   31: iconst_2
    //   32: if_icmpeq -> 115
    //   35: iload_2
    //   36: bipush #17
    //   38: if_icmpeq -> 105
    //   41: iload_2
    //   42: bipush #33
    //   44: if_icmpeq -> 92
    //   47: iload_2
    //   48: bipush #66
    //   50: if_icmpeq -> 82
    //   53: iload_2
    //   54: sipush #130
    //   57: if_icmpeq -> 63
    //   60: goto -> 76
    //   63: aload_0
    //   64: getfield w : I
    //   67: iconst_1
    //   68: if_icmpne -> 76
    //   71: iconst_1
    //   72: istore_2
    //   73: goto -> 157
    //   76: ldc -2147483648
    //   78: istore_2
    //   79: goto -> 157
    //   82: aload_0
    //   83: getfield w : I
    //   86: ifne -> 76
    //   89: goto -> 71
    //   92: aload_0
    //   93: getfield w : I
    //   96: iconst_1
    //   97: if_icmpne -> 76
    //   100: iconst_m1
    //   101: istore_2
    //   102: goto -> 157
    //   105: aload_0
    //   106: getfield w : I
    //   109: ifne -> 76
    //   112: goto -> 100
    //   115: aload_0
    //   116: getfield w : I
    //   119: iconst_1
    //   120: if_icmpne -> 126
    //   123: goto -> 71
    //   126: aload_0
    //   127: invokevirtual n1 : ()Z
    //   130: ifeq -> 71
    //   133: goto -> 144
    //   136: aload_0
    //   137: getfield w : I
    //   140: iconst_1
    //   141: if_icmpne -> 147
    //   144: goto -> 112
    //   147: aload_0
    //   148: invokevirtual n1 : ()Z
    //   151: ifeq -> 100
    //   154: goto -> 71
    //   157: iload_2
    //   158: ldc -2147483648
    //   160: if_icmpne -> 165
    //   163: aconst_null
    //   164: areturn
    //   165: aload_1
    //   166: invokevirtual getLayoutParams : ()Landroid/view/ViewGroup$LayoutParams;
    //   169: checkcast androidx/recyclerview/widget/StaggeredGridLayoutManager$c
    //   172: astore #10
    //   174: aload #10
    //   176: getfield f : Z
    //   179: istore #8
    //   181: aload #10
    //   183: getfield e : Landroidx/recyclerview/widget/StaggeredGridLayoutManager$f;
    //   186: astore #10
    //   188: iload_2
    //   189: iconst_1
    //   190: if_icmpne -> 202
    //   193: aload_0
    //   194: invokevirtual i1 : ()I
    //   197: istore #5
    //   199: goto -> 208
    //   202: aload_0
    //   203: invokevirtual h1 : ()I
    //   206: istore #5
    //   208: aload_0
    //   209: iload #5
    //   211: aload #4
    //   213: invokevirtual z1 : (ILandroidx/recyclerview/widget/RecyclerView$a0;)V
    //   216: aload_0
    //   217: iload_2
    //   218: invokevirtual x1 : (I)V
    //   221: aload_0
    //   222: getfield y : Lb/r/d/n;
    //   225: astore #11
    //   227: aload #11
    //   229: aload #11
    //   231: getfield d : I
    //   234: iload #5
    //   236: iadd
    //   237: putfield c : I
    //   240: aload #11
    //   242: aload_0
    //   243: getfield u : Lb/r/d/t;
    //   246: invokevirtual l : ()I
    //   249: i2f
    //   250: ldc_w 0.33333334
    //   253: fmul
    //   254: f2i
    //   255: putfield b : I
    //   258: aload_0
    //   259: getfield y : Lb/r/d/n;
    //   262: astore #11
    //   264: aload #11
    //   266: iconst_1
    //   267: putfield h : Z
    //   270: iconst_0
    //   271: istore #7
    //   273: aload #11
    //   275: iconst_0
    //   276: putfield a : Z
    //   279: aload_0
    //   280: aload_3
    //   281: aload #11
    //   283: aload #4
    //   285: invokevirtual c1 : (Landroidx/recyclerview/widget/RecyclerView$v;Lb/r/d/n;Landroidx/recyclerview/widget/RecyclerView$a0;)I
    //   288: pop
    //   289: aload_0
    //   290: aload_0
    //   291: getfield A : Z
    //   294: putfield G : Z
    //   297: iload #8
    //   299: ifne -> 322
    //   302: aload #10
    //   304: iload #5
    //   306: iload_2
    //   307: invokevirtual i : (II)Landroid/view/View;
    //   310: astore_3
    //   311: aload_3
    //   312: ifnull -> 322
    //   315: aload_3
    //   316: aload_1
    //   317: if_acmpeq -> 322
    //   320: aload_3
    //   321: areturn
    //   322: aload_0
    //   323: iload_2
    //   324: invokevirtual q1 : (I)Z
    //   327: ifeq -> 374
    //   330: aload_0
    //   331: getfield s : I
    //   334: iconst_1
    //   335: isub
    //   336: istore #6
    //   338: iload #6
    //   340: iflt -> 417
    //   343: aload_0
    //   344: getfield t : [Landroidx/recyclerview/widget/StaggeredGridLayoutManager$f;
    //   347: iload #6
    //   349: aaload
    //   350: iload #5
    //   352: iload_2
    //   353: invokevirtual i : (II)Landroid/view/View;
    //   356: astore_3
    //   357: aload_3
    //   358: ifnull -> 368
    //   361: aload_3
    //   362: aload_1
    //   363: if_acmpeq -> 368
    //   366: aload_3
    //   367: areturn
    //   368: iinc #6, -1
    //   371: goto -> 338
    //   374: iconst_0
    //   375: istore #6
    //   377: iload #6
    //   379: aload_0
    //   380: getfield s : I
    //   383: if_icmpge -> 417
    //   386: aload_0
    //   387: getfield t : [Landroidx/recyclerview/widget/StaggeredGridLayoutManager$f;
    //   390: iload #6
    //   392: aaload
    //   393: iload #5
    //   395: iload_2
    //   396: invokevirtual i : (II)Landroid/view/View;
    //   399: astore_3
    //   400: aload_3
    //   401: ifnull -> 411
    //   404: aload_3
    //   405: aload_1
    //   406: if_acmpeq -> 411
    //   409: aload_3
    //   410: areturn
    //   411: iinc #6, 1
    //   414: goto -> 377
    //   417: aload_0
    //   418: getfield z : Z
    //   421: istore #9
    //   423: iload_2
    //   424: iconst_m1
    //   425: if_icmpne -> 434
    //   428: iconst_1
    //   429: istore #5
    //   431: goto -> 437
    //   434: iconst_0
    //   435: istore #5
    //   437: iload #9
    //   439: iconst_1
    //   440: ixor
    //   441: iload #5
    //   443: if_icmpne -> 452
    //   446: iconst_1
    //   447: istore #5
    //   449: goto -> 455
    //   452: iconst_0
    //   453: istore #5
    //   455: iload #8
    //   457: ifne -> 500
    //   460: iload #5
    //   462: ifeq -> 475
    //   465: aload #10
    //   467: invokevirtual e : ()I
    //   470: istore #6
    //   472: goto -> 482
    //   475: aload #10
    //   477: invokevirtual f : ()I
    //   480: istore #6
    //   482: aload_0
    //   483: iload #6
    //   485: invokevirtual t : (I)Landroid/view/View;
    //   488: astore_3
    //   489: aload_3
    //   490: ifnull -> 500
    //   493: aload_3
    //   494: aload_1
    //   495: if_acmpeq -> 500
    //   498: aload_3
    //   499: areturn
    //   500: iload #7
    //   502: istore #6
    //   504: aload_0
    //   505: iload_2
    //   506: invokevirtual q1 : (I)Z
    //   509: ifeq -> 588
    //   512: aload_0
    //   513: getfield s : I
    //   516: iconst_1
    //   517: isub
    //   518: istore_2
    //   519: iload_2
    //   520: iflt -> 649
    //   523: iload_2
    //   524: aload #10
    //   526: getfield e : I
    //   529: if_icmpne -> 535
    //   532: goto -> 582
    //   535: aload_0
    //   536: getfield t : [Landroidx/recyclerview/widget/StaggeredGridLayoutManager$f;
    //   539: astore_3
    //   540: iload #5
    //   542: ifeq -> 556
    //   545: aload_3
    //   546: iload_2
    //   547: aaload
    //   548: invokevirtual e : ()I
    //   551: istore #6
    //   553: goto -> 564
    //   556: aload_3
    //   557: iload_2
    //   558: aaload
    //   559: invokevirtual f : ()I
    //   562: istore #6
    //   564: aload_0
    //   565: iload #6
    //   567: invokevirtual t : (I)Landroid/view/View;
    //   570: astore_3
    //   571: aload_3
    //   572: ifnull -> 582
    //   575: aload_3
    //   576: aload_1
    //   577: if_acmpeq -> 582
    //   580: aload_3
    //   581: areturn
    //   582: iinc #2, -1
    //   585: goto -> 519
    //   588: iload #6
    //   590: aload_0
    //   591: getfield s : I
    //   594: if_icmpge -> 649
    //   597: aload_0
    //   598: getfield t : [Landroidx/recyclerview/widget/StaggeredGridLayoutManager$f;
    //   601: astore_3
    //   602: iload #5
    //   604: ifeq -> 618
    //   607: aload_3
    //   608: iload #6
    //   610: aaload
    //   611: invokevirtual e : ()I
    //   614: istore_2
    //   615: goto -> 626
    //   618: aload_3
    //   619: iload #6
    //   621: aaload
    //   622: invokevirtual f : ()I
    //   625: istore_2
    //   626: aload_0
    //   627: iload_2
    //   628: invokevirtual t : (I)Landroid/view/View;
    //   631: astore_3
    //   632: aload_3
    //   633: ifnull -> 643
    //   636: aload_3
    //   637: aload_1
    //   638: if_acmpeq -> 643
    //   641: aload_3
    //   642: areturn
    //   643: iinc #6, 1
    //   646: goto -> 588
    //   649: aconst_null
    //   650: areturn
  }
  
  public final void g1(RecyclerView.v paramv, RecyclerView.a0 parama0, boolean paramBoolean) {
    int i = k1(2147483647);
    if (i == Integer.MAX_VALUE)
      return; 
    i -= this.u.k();
    if (i > 0) {
      i -= w1(i, paramv, parama0);
      if (paramBoolean && i > 0)
        this.u.p(-i); 
    } 
  }
  
  public void h0(AccessibilityEvent paramAccessibilityEvent) {
    RecyclerView.v v = this.b.mRecycler;
    i0(paramAccessibilityEvent);
    if (y() > 0) {
      View view2 = e1(false);
      View view1 = d1(false);
      if (view2 != null && view1 != null) {
        int i = P(view2);
        int j = P(view1);
        if (i < j) {
          paramAccessibilityEvent.setFromIndex(i);
          paramAccessibilityEvent.setToIndex(j);
        } else {
          paramAccessibilityEvent.setFromIndex(j);
          paramAccessibilityEvent.setToIndex(i);
        } 
      } 
    } 
  }
  
  public int h1() {
    int j = y();
    int i = 0;
    if (j != 0)
      i = P(x(0)); 
    return i;
  }
  
  public void i(int paramInt1, int paramInt2, RecyclerView.a0 parama0, RecyclerView.o.c paramc) {
    if (this.w != 0)
      paramInt1 = paramInt2; 
    if (y() != 0 && paramInt1 != 0) {
      r1(paramInt1, parama0);
      int[] arrayOfInt = this.O;
      if (arrayOfInt == null || arrayOfInt.length < this.s)
        this.O = new int[this.s]; 
      paramInt2 = 0;
      for (paramInt1 = 0; paramInt2 < this.s; paramInt1 = i) {
        int j;
        n n1 = this.y;
        if (n1.d == -1) {
          j = n1.f;
          i = this.t[paramInt2].k(j);
        } else {
          j = this.t[paramInt2].h(n1.g);
          i = this.y.g;
        } 
        j -= i;
        int i = paramInt1;
        if (j >= 0) {
          this.O[paramInt1] = j;
          i = paramInt1 + 1;
        } 
        paramInt2++;
      } 
      Arrays.sort(this.O, 0, paramInt1);
      paramInt2 = 0;
      while (paramInt2 < paramInt1) {
        int i = this.y.c;
        if (i >= 0 && i < parama0.b()) {
          i = 1;
        } else {
          i = 0;
        } 
        if (i != 0) {
          int j = this.y.c;
          i = this.O[paramInt2];
          ((m.b)paramc).a(j, i);
          n n1 = this.y;
          n1.c += n1.d;
          paramInt2++;
        } 
      } 
    } 
  }
  
  public int i1() {
    int i = y();
    if (i == 0) {
      i = 0;
    } else {
      i = P(x(i - 1));
    } 
    return i;
  }
  
  public final int j1(int paramInt) {
    int i = this.t[0].h(paramInt);
    byte b1 = 1;
    while (b1 < this.s) {
      int k = this.t[b1].h(paramInt);
      int j = i;
      if (k > i)
        j = k; 
      b1++;
      i = j;
    } 
    return i;
  }
  
  public int k(RecyclerView.a0 parama0) {
    return Z0(parama0);
  }
  
  public void k0(RecyclerView.v paramv, RecyclerView.a0 parama0, View paramView, b.i.m.v.b paramb) {
    b.i.m.v.b.c c;
    ViewGroup.LayoutParams layoutParams = paramView.getLayoutParams();
    if (!(layoutParams instanceof c)) {
      j0(paramView, paramb);
      return;
    } 
    c c1 = (c)layoutParams;
    if (this.w == 0) {
      int i;
      boolean bool;
      f f1 = c1.e;
      if (f1 == null) {
        i = -1;
      } else {
        i = f1.e;
      } 
      if (c1.f) {
        bool = this.s;
      } else {
        bool = true;
      } 
      c = b.i.m.v.b.c.a(i, bool, -1, -1, false, false);
    } else {
      int i;
      boolean bool;
      f f1 = ((c)c).e;
      if (f1 == null) {
        i = -1;
      } else {
        i = f1.e;
      } 
      if (((c)c).f) {
        bool = this.s;
      } else {
        bool = true;
      } 
      c = b.i.m.v.b.c.a(-1, -1, i, bool, false, false);
    } 
    paramb.j(c);
  }
  
  public final int k1(int paramInt) {
    int i = this.t[0].k(paramInt);
    byte b1 = 1;
    while (b1 < this.s) {
      int k = this.t[b1].k(paramInt);
      int j = i;
      if (k < i)
        j = k; 
      b1++;
      i = j;
    } 
    return i;
  }
  
  public int l(RecyclerView.a0 parama0) {
    return a1(parama0);
  }
  
  public final void l1(int paramInt1, int paramInt2, int paramInt3) {
    if (this.A) {
      int j = i1();
    } else {
      int j = h1();
    } 
    if (paramInt3 == 8) {
      if (paramInt1 < paramInt2) {
        int j = paramInt2 + 1;
      } else {
        int j = paramInt1 + 1;
        int k = paramInt2;
        this.E.g(k);
      } 
    } else {
      int j = paramInt1 + paramInt2;
    } 
    int i = paramInt1;
    this.E.g(i);
  }
  
  public int m(RecyclerView.a0 parama0) {
    return b1(parama0);
  }
  
  public void m0(RecyclerView paramRecyclerView, int paramInt1, int paramInt2) {
    l1(paramInt1, paramInt2, 1);
  }
  
  public View m1() {
    // Byte code:
    //   0: aload_0
    //   1: invokevirtual y : ()I
    //   4: iconst_1
    //   5: isub
    //   6: istore_1
    //   7: new java/util/BitSet
    //   10: dup
    //   11: aload_0
    //   12: getfield s : I
    //   15: invokespecial <init> : (I)V
    //   18: astore #10
    //   20: aload #10
    //   22: iconst_0
    //   23: aload_0
    //   24: getfield s : I
    //   27: iconst_1
    //   28: invokevirtual set : (IIZ)V
    //   31: aload_0
    //   32: getfield w : I
    //   35: iconst_1
    //   36: if_icmpne -> 51
    //   39: aload_0
    //   40: invokevirtual n1 : ()Z
    //   43: ifeq -> 51
    //   46: iconst_1
    //   47: istore_2
    //   48: goto -> 53
    //   51: iconst_m1
    //   52: istore_2
    //   53: aload_0
    //   54: getfield A : Z
    //   57: ifeq -> 65
    //   60: iconst_m1
    //   61: istore_3
    //   62: goto -> 71
    //   65: iload_1
    //   66: iconst_1
    //   67: iadd
    //   68: istore_3
    //   69: iconst_0
    //   70: istore_1
    //   71: iload_1
    //   72: iload_3
    //   73: if_icmpge -> 82
    //   76: iconst_1
    //   77: istore #4
    //   79: goto -> 85
    //   82: iconst_m1
    //   83: istore #4
    //   85: iload_1
    //   86: iload_3
    //   87: if_icmpeq -> 501
    //   90: aload_0
    //   91: iload_1
    //   92: invokevirtual x : (I)Landroid/view/View;
    //   95: astore #8
    //   97: aload #8
    //   99: invokevirtual getLayoutParams : ()Landroid/view/ViewGroup$LayoutParams;
    //   102: checkcast androidx/recyclerview/widget/StaggeredGridLayoutManager$c
    //   105: astore #9
    //   107: aload #10
    //   109: aload #9
    //   111: getfield e : Landroidx/recyclerview/widget/StaggeredGridLayoutManager$f;
    //   114: getfield e : I
    //   117: invokevirtual get : (I)Z
    //   120: ifeq -> 298
    //   123: aload #9
    //   125: getfield e : Landroidx/recyclerview/widget/StaggeredGridLayoutManager$f;
    //   128: astore #11
    //   130: aload_0
    //   131: getfield A : Z
    //   134: ifeq -> 202
    //   137: aload #11
    //   139: getfield c : I
    //   142: istore #5
    //   144: iload #5
    //   146: ldc -2147483648
    //   148: if_icmpeq -> 154
    //   151: goto -> 166
    //   154: aload #11
    //   156: invokevirtual b : ()V
    //   159: aload #11
    //   161: getfield c : I
    //   164: istore #5
    //   166: iload #5
    //   168: aload_0
    //   169: getfield u : Lb/r/d/t;
    //   172: invokevirtual g : ()I
    //   175: if_icmpge -> 274
    //   178: aload #11
    //   180: getfield a : Ljava/util/ArrayList;
    //   183: astore #7
    //   185: aload #7
    //   187: aload #7
    //   189: invokevirtual size : ()I
    //   192: iconst_1
    //   193: isub
    //   194: invokevirtual get : (I)Ljava/lang/Object;
    //   197: astore #7
    //   199: goto -> 254
    //   202: aload #11
    //   204: getfield b : I
    //   207: istore #5
    //   209: iload #5
    //   211: ldc -2147483648
    //   213: if_icmpeq -> 219
    //   216: goto -> 231
    //   219: aload #11
    //   221: invokevirtual c : ()V
    //   224: aload #11
    //   226: getfield b : I
    //   229: istore #5
    //   231: iload #5
    //   233: aload_0
    //   234: getfield u : Lb/r/d/t;
    //   237: invokevirtual k : ()I
    //   240: if_icmple -> 274
    //   243: aload #11
    //   245: getfield a : Ljava/util/ArrayList;
    //   248: iconst_0
    //   249: invokevirtual get : (I)Ljava/lang/Object;
    //   252: astore #7
    //   254: aload #11
    //   256: aload #7
    //   258: checkcast android/view/View
    //   261: invokevirtual j : (Landroid/view/View;)Landroidx/recyclerview/widget/StaggeredGridLayoutManager$c;
    //   264: getfield f : Z
    //   267: iconst_1
    //   268: ixor
    //   269: istore #5
    //   271: goto -> 277
    //   274: iconst_0
    //   275: istore #5
    //   277: iload #5
    //   279: ifeq -> 285
    //   282: aload #8
    //   284: areturn
    //   285: aload #10
    //   287: aload #9
    //   289: getfield e : Landroidx/recyclerview/widget/StaggeredGridLayoutManager$f;
    //   292: getfield e : I
    //   295: invokevirtual clear : (I)V
    //   298: aload #9
    //   300: getfield f : Z
    //   303: ifeq -> 309
    //   306: goto -> 493
    //   309: iload_1
    //   310: iload #4
    //   312: iadd
    //   313: istore #5
    //   315: iload #5
    //   317: iload_3
    //   318: if_icmpeq -> 493
    //   321: aload_0
    //   322: iload #5
    //   324: invokevirtual x : (I)Landroid/view/View;
    //   327: astore #7
    //   329: aload_0
    //   330: getfield A : Z
    //   333: ifeq -> 378
    //   336: aload_0
    //   337: getfield u : Lb/r/d/t;
    //   340: aload #8
    //   342: invokevirtual b : (Landroid/view/View;)I
    //   345: istore #5
    //   347: aload_0
    //   348: getfield u : Lb/r/d/t;
    //   351: aload #7
    //   353: invokevirtual b : (Landroid/view/View;)I
    //   356: istore #6
    //   358: iload #5
    //   360: iload #6
    //   362: if_icmpge -> 368
    //   365: aload #8
    //   367: areturn
    //   368: iload #5
    //   370: iload #6
    //   372: if_icmpne -> 423
    //   375: goto -> 417
    //   378: aload_0
    //   379: getfield u : Lb/r/d/t;
    //   382: aload #8
    //   384: invokevirtual e : (Landroid/view/View;)I
    //   387: istore #6
    //   389: aload_0
    //   390: getfield u : Lb/r/d/t;
    //   393: aload #7
    //   395: invokevirtual e : (Landroid/view/View;)I
    //   398: istore #5
    //   400: iload #6
    //   402: iload #5
    //   404: if_icmple -> 410
    //   407: aload #8
    //   409: areturn
    //   410: iload #6
    //   412: iload #5
    //   414: if_icmpne -> 423
    //   417: iconst_1
    //   418: istore #5
    //   420: goto -> 426
    //   423: iconst_0
    //   424: istore #5
    //   426: iload #5
    //   428: ifeq -> 493
    //   431: aload #7
    //   433: invokevirtual getLayoutParams : ()Landroid/view/ViewGroup$LayoutParams;
    //   436: checkcast androidx/recyclerview/widget/StaggeredGridLayoutManager$c
    //   439: astore #7
    //   441: aload #9
    //   443: getfield e : Landroidx/recyclerview/widget/StaggeredGridLayoutManager$f;
    //   446: getfield e : I
    //   449: aload #7
    //   451: getfield e : Landroidx/recyclerview/widget/StaggeredGridLayoutManager$f;
    //   454: getfield e : I
    //   457: isub
    //   458: ifge -> 467
    //   461: iconst_1
    //   462: istore #5
    //   464: goto -> 470
    //   467: iconst_0
    //   468: istore #5
    //   470: iload_2
    //   471: ifge -> 480
    //   474: iconst_1
    //   475: istore #6
    //   477: goto -> 483
    //   480: iconst_0
    //   481: istore #6
    //   483: iload #5
    //   485: iload #6
    //   487: if_icmpeq -> 493
    //   490: aload #8
    //   492: areturn
    //   493: iload_1
    //   494: iload #4
    //   496: iadd
    //   497: istore_1
    //   498: goto -> 85
    //   501: aconst_null
    //   502: areturn
  }
  
  public int n(RecyclerView.a0 parama0) {
    return Z0(parama0);
  }
  
  public void n0(RecyclerView paramRecyclerView) {
    this.E.b();
    I0();
  }
  
  public boolean n1() {
    int i = I();
    boolean bool = true;
    if (i != 1)
      bool = false; 
    return bool;
  }
  
  public int o(RecyclerView.a0 parama0) {
    return a1(parama0);
  }
  
  public void o0(RecyclerView paramRecyclerView, int paramInt1, int paramInt2, int paramInt3) {
    l1(paramInt1, paramInt2, 8);
  }
  
  public final void o1(View paramView, int paramInt1, int paramInt2, boolean paramBoolean) {
    Rect rect1 = this.K;
    RecyclerView recyclerView = this.b;
    if (recyclerView == null) {
      rect1.set(0, 0, 0, 0);
    } else {
      rect1.set(recyclerView.getItemDecorInsetsForChild(paramView));
    } 
    c c = (c)paramView.getLayoutParams();
    int i = c.leftMargin;
    Rect rect2 = this.K;
    paramInt1 = B1(paramInt1, i + rect2.left, c.rightMargin + rect2.right);
    i = c.topMargin;
    rect2 = this.K;
    paramInt2 = B1(paramInt2, i + rect2.top, c.bottomMargin + rect2.bottom);
    if (paramBoolean) {
      paramBoolean = T0(paramView, paramInt1, paramInt2, c);
    } else {
      paramBoolean = R0(paramView, paramInt1, paramInt2, c);
    } 
    if (paramBoolean)
      paramView.measure(paramInt1, paramInt2); 
  }
  
  public int p(RecyclerView.a0 parama0) {
    return b1(parama0);
  }
  
  public void p0(RecyclerView paramRecyclerView, int paramInt1, int paramInt2) {
    l1(paramInt1, paramInt2, 2);
  }
  
  public final void p1(RecyclerView.v paramv, RecyclerView.a0 parama0, boolean paramBoolean) {
    // Byte code:
    //   0: aload_0
    //   1: getfield L : Landroidx/recyclerview/widget/StaggeredGridLayoutManager$b;
    //   4: astore #14
    //   6: aload_0
    //   7: getfield I : Landroidx/recyclerview/widget/StaggeredGridLayoutManager$e;
    //   10: ifnonnull -> 21
    //   13: aload_0
    //   14: getfield C : I
    //   17: iconst_m1
    //   18: if_icmpeq -> 39
    //   21: aload_2
    //   22: invokevirtual b : ()I
    //   25: ifne -> 39
    //   28: aload_0
    //   29: aload_1
    //   30: invokevirtual C0 : (Landroidx/recyclerview/widget/RecyclerView$v;)V
    //   33: aload #14
    //   35: invokevirtual b : ()V
    //   38: return
    //   39: aload #14
    //   41: getfield e : Z
    //   44: istore #13
    //   46: iconst_1
    //   47: istore #9
    //   49: iload #13
    //   51: ifeq -> 78
    //   54: aload_0
    //   55: getfield C : I
    //   58: iconst_m1
    //   59: if_icmpne -> 78
    //   62: aload_0
    //   63: getfield I : Landroidx/recyclerview/widget/StaggeredGridLayoutManager$e;
    //   66: ifnull -> 72
    //   69: goto -> 78
    //   72: iconst_0
    //   73: istore #7
    //   75: goto -> 81
    //   78: iconst_1
    //   79: istore #7
    //   81: iload #7
    //   83: ifeq -> 1092
    //   86: aload #14
    //   88: invokevirtual b : ()V
    //   91: aload_0
    //   92: getfield I : Landroidx/recyclerview/widget/StaggeredGridLayoutManager$e;
    //   95: astore #15
    //   97: aload #15
    //   99: ifnull -> 438
    //   102: aload #15
    //   104: getfield d : I
    //   107: istore #6
    //   109: iload #6
    //   111: ifle -> 277
    //   114: iload #6
    //   116: aload_0
    //   117: getfield s : I
    //   120: if_icmpne -> 237
    //   123: iconst_0
    //   124: istore #6
    //   126: iload #6
    //   128: aload_0
    //   129: getfield s : I
    //   132: if_icmpge -> 277
    //   135: aload_0
    //   136: getfield t : [Landroidx/recyclerview/widget/StaggeredGridLayoutManager$f;
    //   139: iload #6
    //   141: aaload
    //   142: invokevirtual d : ()V
    //   145: aload_0
    //   146: getfield I : Landroidx/recyclerview/widget/StaggeredGridLayoutManager$e;
    //   149: astore #15
    //   151: aload #15
    //   153: getfield e : [I
    //   156: iload #6
    //   158: iaload
    //   159: istore #10
    //   161: iload #10
    //   163: istore #8
    //   165: iload #10
    //   167: ldc -2147483648
    //   169: if_icmpeq -> 208
    //   172: aload #15
    //   174: getfield j : Z
    //   177: ifeq -> 192
    //   180: aload_0
    //   181: getfield u : Lb/r/d/t;
    //   184: invokevirtual g : ()I
    //   187: istore #8
    //   189: goto -> 201
    //   192: aload_0
    //   193: getfield u : Lb/r/d/t;
    //   196: invokevirtual k : ()I
    //   199: istore #8
    //   201: iload #10
    //   203: iload #8
    //   205: iadd
    //   206: istore #8
    //   208: aload_0
    //   209: getfield t : [Landroidx/recyclerview/widget/StaggeredGridLayoutManager$f;
    //   212: iload #6
    //   214: aaload
    //   215: astore #15
    //   217: aload #15
    //   219: iload #8
    //   221: putfield b : I
    //   224: aload #15
    //   226: iload #8
    //   228: putfield c : I
    //   231: iinc #6, 1
    //   234: goto -> 126
    //   237: aload #15
    //   239: aconst_null
    //   240: putfield e : [I
    //   243: aload #15
    //   245: iconst_0
    //   246: putfield d : I
    //   249: aload #15
    //   251: iconst_0
    //   252: putfield f : I
    //   255: aload #15
    //   257: aconst_null
    //   258: putfield g : [I
    //   261: aload #15
    //   263: aconst_null
    //   264: putfield h : Ljava/util/List;
    //   267: aload #15
    //   269: aload #15
    //   271: getfield c : I
    //   274: putfield b : I
    //   277: aload_0
    //   278: getfield I : Landroidx/recyclerview/widget/StaggeredGridLayoutManager$e;
    //   281: astore #15
    //   283: aload_0
    //   284: aload #15
    //   286: getfield k : Z
    //   289: putfield H : Z
    //   292: aload #15
    //   294: getfield i : Z
    //   297: istore #13
    //   299: aload_0
    //   300: aconst_null
    //   301: invokevirtual d : (Ljava/lang/String;)V
    //   304: aload_0
    //   305: getfield I : Landroidx/recyclerview/widget/StaggeredGridLayoutManager$e;
    //   308: astore #15
    //   310: aload #15
    //   312: ifnull -> 332
    //   315: aload #15
    //   317: getfield i : Z
    //   320: iload #13
    //   322: if_icmpeq -> 332
    //   325: aload #15
    //   327: iload #13
    //   329: putfield i : Z
    //   332: aload_0
    //   333: iload #13
    //   335: putfield z : Z
    //   338: aload_0
    //   339: invokevirtual I0 : ()V
    //   342: aload_0
    //   343: invokevirtual v1 : ()V
    //   346: aload_0
    //   347: getfield I : Landroidx/recyclerview/widget/StaggeredGridLayoutManager$e;
    //   350: astore #15
    //   352: aload #15
    //   354: getfield b : I
    //   357: istore #6
    //   359: iload #6
    //   361: iconst_m1
    //   362: if_icmpeq -> 381
    //   365: aload_0
    //   366: iload #6
    //   368: putfield C : I
    //   371: aload #15
    //   373: getfield j : Z
    //   376: istore #13
    //   378: goto -> 387
    //   381: aload_0
    //   382: getfield A : Z
    //   385: istore #13
    //   387: aload #14
    //   389: iload #13
    //   391: putfield c : Z
    //   394: aload_0
    //   395: getfield I : Landroidx/recyclerview/widget/StaggeredGridLayoutManager$e;
    //   398: astore #16
    //   400: aload #16
    //   402: getfield f : I
    //   405: iconst_1
    //   406: if_icmple -> 451
    //   409: aload_0
    //   410: getfield E : Landroidx/recyclerview/widget/StaggeredGridLayoutManager$d;
    //   413: astore #15
    //   415: aload #15
    //   417: aload #16
    //   419: getfield g : [I
    //   422: putfield a : [I
    //   425: aload #15
    //   427: aload #16
    //   429: getfield h : Ljava/util/List;
    //   432: putfield b : Ljava/util/List;
    //   435: goto -> 451
    //   438: aload_0
    //   439: invokevirtual v1 : ()V
    //   442: aload #14
    //   444: aload_0
    //   445: getfield A : Z
    //   448: putfield c : Z
    //   451: aload_2
    //   452: getfield g : Z
    //   455: ifne -> 932
    //   458: aload_0
    //   459: getfield C : I
    //   462: istore #6
    //   464: iload #6
    //   466: iconst_m1
    //   467: if_icmpne -> 473
    //   470: goto -> 932
    //   473: iload #6
    //   475: iflt -> 921
    //   478: iload #6
    //   480: aload_2
    //   481: invokevirtual b : ()I
    //   484: if_icmplt -> 490
    //   487: goto -> 921
    //   490: aload_0
    //   491: getfield I : Landroidx/recyclerview/widget/StaggeredGridLayoutManager$e;
    //   494: astore #15
    //   496: aload #15
    //   498: ifnull -> 541
    //   501: aload #15
    //   503: getfield b : I
    //   506: iconst_m1
    //   507: if_icmpeq -> 541
    //   510: aload #15
    //   512: getfield d : I
    //   515: iconst_1
    //   516: if_icmpge -> 522
    //   519: goto -> 541
    //   522: aload #14
    //   524: ldc -2147483648
    //   526: putfield b : I
    //   529: aload #14
    //   531: aload_0
    //   532: getfield C : I
    //   535: putfield a : I
    //   538: goto -> 915
    //   541: aload_0
    //   542: aload_0
    //   543: getfield C : I
    //   546: invokevirtual t : (I)Landroid/view/View;
    //   549: astore #15
    //   551: aload #15
    //   553: ifnull -> 799
    //   556: aload_0
    //   557: getfield A : Z
    //   560: ifeq -> 572
    //   563: aload_0
    //   564: invokevirtual i1 : ()I
    //   567: istore #6
    //   569: goto -> 578
    //   572: aload_0
    //   573: invokevirtual h1 : ()I
    //   576: istore #6
    //   578: aload #14
    //   580: iload #6
    //   582: putfield a : I
    //   585: aload_0
    //   586: getfield D : I
    //   589: ldc -2147483648
    //   591: if_icmpeq -> 665
    //   594: aload #14
    //   596: getfield c : Z
    //   599: ifeq -> 630
    //   602: aload_0
    //   603: getfield u : Lb/r/d/t;
    //   606: invokevirtual g : ()I
    //   609: aload_0
    //   610: getfield D : I
    //   613: isub
    //   614: istore #8
    //   616: aload_0
    //   617: getfield u : Lb/r/d/t;
    //   620: aload #15
    //   622: invokevirtual b : (Landroid/view/View;)I
    //   625: istore #6
    //   627: goto -> 655
    //   630: aload_0
    //   631: getfield u : Lb/r/d/t;
    //   634: invokevirtual k : ()I
    //   637: aload_0
    //   638: getfield D : I
    //   641: iadd
    //   642: istore #8
    //   644: aload_0
    //   645: getfield u : Lb/r/d/t;
    //   648: aload #15
    //   650: invokevirtual e : (Landroid/view/View;)I
    //   653: istore #6
    //   655: iload #8
    //   657: iload #6
    //   659: isub
    //   660: istore #6
    //   662: goto -> 779
    //   665: aload_0
    //   666: getfield u : Lb/r/d/t;
    //   669: aload #15
    //   671: invokevirtual c : (Landroid/view/View;)I
    //   674: aload_0
    //   675: getfield u : Lb/r/d/t;
    //   678: invokevirtual l : ()I
    //   681: if_icmple -> 716
    //   684: aload #14
    //   686: getfield c : Z
    //   689: ifeq -> 704
    //   692: aload_0
    //   693: getfield u : Lb/r/d/t;
    //   696: invokevirtual g : ()I
    //   699: istore #6
    //   701: goto -> 745
    //   704: aload_0
    //   705: getfield u : Lb/r/d/t;
    //   708: invokevirtual k : ()I
    //   711: istore #6
    //   713: goto -> 745
    //   716: aload_0
    //   717: getfield u : Lb/r/d/t;
    //   720: aload #15
    //   722: invokevirtual e : (Landroid/view/View;)I
    //   725: aload_0
    //   726: getfield u : Lb/r/d/t;
    //   729: invokevirtual k : ()I
    //   732: isub
    //   733: istore #6
    //   735: iload #6
    //   737: ifge -> 755
    //   740: iload #6
    //   742: ineg
    //   743: istore #6
    //   745: aload #14
    //   747: iload #6
    //   749: putfield b : I
    //   752: goto -> 915
    //   755: aload_0
    //   756: getfield u : Lb/r/d/t;
    //   759: invokevirtual g : ()I
    //   762: aload_0
    //   763: getfield u : Lb/r/d/t;
    //   766: aload #15
    //   768: invokevirtual b : (Landroid/view/View;)I
    //   771: isub
    //   772: istore #6
    //   774: iload #6
    //   776: ifge -> 789
    //   779: aload #14
    //   781: iload #6
    //   783: putfield b : I
    //   786: goto -> 915
    //   789: aload #14
    //   791: ldc -2147483648
    //   793: putfield b : I
    //   796: goto -> 915
    //   799: aload_0
    //   800: getfield C : I
    //   803: istore #8
    //   805: aload #14
    //   807: iload #8
    //   809: putfield a : I
    //   812: aload_0
    //   813: getfield D : I
    //   816: istore #6
    //   818: iload #6
    //   820: ldc -2147483648
    //   822: if_icmpne -> 859
    //   825: aload_0
    //   826: iload #8
    //   828: invokevirtual X0 : (I)I
    //   831: iconst_1
    //   832: if_icmpne -> 841
    //   835: iconst_1
    //   836: istore #13
    //   838: goto -> 844
    //   841: iconst_0
    //   842: istore #13
    //   844: aload #14
    //   846: iload #13
    //   848: putfield c : Z
    //   851: aload #14
    //   853: invokevirtual a : ()V
    //   856: goto -> 909
    //   859: aload #14
    //   861: getfield c : Z
    //   864: ifeq -> 886
    //   867: aload #14
    //   869: getfield g : Landroidx/recyclerview/widget/StaggeredGridLayoutManager;
    //   872: getfield u : Lb/r/d/t;
    //   875: invokevirtual g : ()I
    //   878: iload #6
    //   880: isub
    //   881: istore #6
    //   883: goto -> 902
    //   886: aload #14
    //   888: getfield g : Landroidx/recyclerview/widget/StaggeredGridLayoutManager;
    //   891: getfield u : Lb/r/d/t;
    //   894: invokevirtual k : ()I
    //   897: iload #6
    //   899: iadd
    //   900: istore #6
    //   902: aload #14
    //   904: iload #6
    //   906: putfield b : I
    //   909: aload #14
    //   911: iconst_1
    //   912: putfield d : Z
    //   915: iconst_1
    //   916: istore #6
    //   918: goto -> 935
    //   921: aload_0
    //   922: iconst_m1
    //   923: putfield C : I
    //   926: aload_0
    //   927: ldc -2147483648
    //   929: putfield D : I
    //   932: iconst_0
    //   933: istore #6
    //   935: iload #6
    //   937: ifeq -> 943
    //   940: goto -> 1086
    //   943: aload_0
    //   944: getfield G : Z
    //   947: istore #13
    //   949: aload_2
    //   950: invokevirtual b : ()I
    //   953: istore #11
    //   955: iload #13
    //   957: ifeq -> 1016
    //   960: aload_0
    //   961: invokevirtual y : ()I
    //   964: istore #6
    //   966: iload #6
    //   968: iconst_1
    //   969: isub
    //   970: istore #10
    //   972: iload #10
    //   974: iflt -> 1069
    //   977: aload_0
    //   978: aload_0
    //   979: iload #10
    //   981: invokevirtual x : (I)Landroid/view/View;
    //   984: invokevirtual P : (Landroid/view/View;)I
    //   987: istore #8
    //   989: iload #10
    //   991: istore #6
    //   993: iload #8
    //   995: iflt -> 966
    //   998: iload #10
    //   1000: istore #6
    //   1002: iload #8
    //   1004: iload #11
    //   1006: if_icmpge -> 966
    //   1009: iload #8
    //   1011: istore #6
    //   1013: goto -> 1072
    //   1016: aload_0
    //   1017: invokevirtual y : ()I
    //   1020: istore #10
    //   1022: iconst_0
    //   1023: istore #6
    //   1025: iload #6
    //   1027: iload #10
    //   1029: if_icmpge -> 1069
    //   1032: aload_0
    //   1033: aload_0
    //   1034: iload #6
    //   1036: invokevirtual x : (I)Landroid/view/View;
    //   1039: invokevirtual P : (Landroid/view/View;)I
    //   1042: istore #8
    //   1044: iload #8
    //   1046: iflt -> 1063
    //   1049: iload #8
    //   1051: iload #11
    //   1053: if_icmpge -> 1063
    //   1056: iload #8
    //   1058: istore #6
    //   1060: goto -> 1072
    //   1063: iinc #6, 1
    //   1066: goto -> 1025
    //   1069: iconst_0
    //   1070: istore #6
    //   1072: aload #14
    //   1074: iload #6
    //   1076: putfield a : I
    //   1079: aload #14
    //   1081: ldc -2147483648
    //   1083: putfield b : I
    //   1086: aload #14
    //   1088: iconst_1
    //   1089: putfield e : Z
    //   1092: aload_0
    //   1093: getfield I : Landroidx/recyclerview/widget/StaggeredGridLayoutManager$e;
    //   1096: ifnonnull -> 1143
    //   1099: aload_0
    //   1100: getfield C : I
    //   1103: iconst_m1
    //   1104: if_icmpne -> 1143
    //   1107: aload #14
    //   1109: getfield c : Z
    //   1112: aload_0
    //   1113: getfield G : Z
    //   1116: if_icmpne -> 1130
    //   1119: aload_0
    //   1120: invokevirtual n1 : ()Z
    //   1123: aload_0
    //   1124: getfield H : Z
    //   1127: if_icmpeq -> 1143
    //   1130: aload_0
    //   1131: getfield E : Landroidx/recyclerview/widget/StaggeredGridLayoutManager$d;
    //   1134: invokevirtual b : ()V
    //   1137: aload #14
    //   1139: iconst_1
    //   1140: putfield d : Z
    //   1143: aload_0
    //   1144: invokevirtual y : ()I
    //   1147: ifle -> 1571
    //   1150: aload_0
    //   1151: getfield I : Landroidx/recyclerview/widget/StaggeredGridLayoutManager$e;
    //   1154: astore #15
    //   1156: aload #15
    //   1158: ifnull -> 1170
    //   1161: aload #15
    //   1163: getfield d : I
    //   1166: iconst_1
    //   1167: if_icmpge -> 1571
    //   1170: aload #14
    //   1172: getfield d : Z
    //   1175: ifeq -> 1243
    //   1178: iconst_0
    //   1179: istore #6
    //   1181: iload #6
    //   1183: aload_0
    //   1184: getfield s : I
    //   1187: if_icmpge -> 1571
    //   1190: aload_0
    //   1191: getfield t : [Landroidx/recyclerview/widget/StaggeredGridLayoutManager$f;
    //   1194: iload #6
    //   1196: aaload
    //   1197: invokevirtual d : ()V
    //   1200: aload #14
    //   1202: getfield b : I
    //   1205: istore #7
    //   1207: iload #7
    //   1209: ldc -2147483648
    //   1211: if_icmpeq -> 1237
    //   1214: aload_0
    //   1215: getfield t : [Landroidx/recyclerview/widget/StaggeredGridLayoutManager$f;
    //   1218: iload #6
    //   1220: aaload
    //   1221: astore #15
    //   1223: aload #15
    //   1225: iload #7
    //   1227: putfield b : I
    //   1230: aload #15
    //   1232: iload #7
    //   1234: putfield c : I
    //   1237: iinc #6, 1
    //   1240: goto -> 1181
    //   1243: iload #7
    //   1245: ifne -> 1319
    //   1248: aload_0
    //   1249: getfield L : Landroidx/recyclerview/widget/StaggeredGridLayoutManager$b;
    //   1252: getfield f : [I
    //   1255: ifnonnull -> 1261
    //   1258: goto -> 1319
    //   1261: iconst_0
    //   1262: istore #6
    //   1264: iload #6
    //   1266: aload_0
    //   1267: getfield s : I
    //   1270: if_icmpge -> 1571
    //   1273: aload_0
    //   1274: getfield t : [Landroidx/recyclerview/widget/StaggeredGridLayoutManager$f;
    //   1277: iload #6
    //   1279: aaload
    //   1280: astore #15
    //   1282: aload #15
    //   1284: invokevirtual d : ()V
    //   1287: aload_0
    //   1288: getfield L : Landroidx/recyclerview/widget/StaggeredGridLayoutManager$b;
    //   1291: getfield f : [I
    //   1294: iload #6
    //   1296: iaload
    //   1297: istore #7
    //   1299: aload #15
    //   1301: iload #7
    //   1303: putfield b : I
    //   1306: aload #15
    //   1308: iload #7
    //   1310: putfield c : I
    //   1313: iinc #6, 1
    //   1316: goto -> 1264
    //   1319: iconst_0
    //   1320: istore #7
    //   1322: iload #7
    //   1324: aload_0
    //   1325: getfield s : I
    //   1328: if_icmpge -> 1477
    //   1331: aload_0
    //   1332: getfield t : [Landroidx/recyclerview/widget/StaggeredGridLayoutManager$f;
    //   1335: iload #7
    //   1337: aaload
    //   1338: astore #15
    //   1340: aload_0
    //   1341: getfield A : Z
    //   1344: istore #13
    //   1346: aload #14
    //   1348: getfield b : I
    //   1351: istore #10
    //   1353: iload #13
    //   1355: ifeq -> 1370
    //   1358: aload #15
    //   1360: ldc -2147483648
    //   1362: invokevirtual h : (I)I
    //   1365: istore #6
    //   1367: goto -> 1379
    //   1370: aload #15
    //   1372: ldc -2147483648
    //   1374: invokevirtual k : (I)I
    //   1377: istore #6
    //   1379: aload #15
    //   1381: invokevirtual d : ()V
    //   1384: iload #6
    //   1386: ldc -2147483648
    //   1388: if_icmpne -> 1394
    //   1391: goto -> 1471
    //   1394: iload #13
    //   1396: ifeq -> 1415
    //   1399: iload #6
    //   1401: aload #15
    //   1403: getfield f : Landroidx/recyclerview/widget/StaggeredGridLayoutManager;
    //   1406: getfield u : Lb/r/d/t;
    //   1409: invokevirtual g : ()I
    //   1412: if_icmplt -> 1471
    //   1415: iload #13
    //   1417: ifne -> 1439
    //   1420: iload #6
    //   1422: aload #15
    //   1424: getfield f : Landroidx/recyclerview/widget/StaggeredGridLayoutManager;
    //   1427: getfield u : Lb/r/d/t;
    //   1430: invokevirtual k : ()I
    //   1433: if_icmple -> 1439
    //   1436: goto -> 1471
    //   1439: iload #6
    //   1441: istore #8
    //   1443: iload #10
    //   1445: ldc -2147483648
    //   1447: if_icmpeq -> 1457
    //   1450: iload #6
    //   1452: iload #10
    //   1454: iadd
    //   1455: istore #8
    //   1457: aload #15
    //   1459: iload #8
    //   1461: putfield c : I
    //   1464: aload #15
    //   1466: iload #8
    //   1468: putfield b : I
    //   1471: iinc #7, 1
    //   1474: goto -> 1322
    //   1477: aload_0
    //   1478: getfield L : Landroidx/recyclerview/widget/StaggeredGridLayoutManager$b;
    //   1481: astore #16
    //   1483: aload_0
    //   1484: getfield t : [Landroidx/recyclerview/widget/StaggeredGridLayoutManager$f;
    //   1487: astore #17
    //   1489: aload #16
    //   1491: ifnull -> 1569
    //   1494: aload #17
    //   1496: arraylength
    //   1497: istore #7
    //   1499: aload #16
    //   1501: getfield f : [I
    //   1504: astore #15
    //   1506: aload #15
    //   1508: ifnull -> 1519
    //   1511: aload #15
    //   1513: arraylength
    //   1514: iload #7
    //   1516: if_icmpge -> 1535
    //   1519: aload #16
    //   1521: aload #16
    //   1523: getfield g : Landroidx/recyclerview/widget/StaggeredGridLayoutManager;
    //   1526: getfield t : [Landroidx/recyclerview/widget/StaggeredGridLayoutManager$f;
    //   1529: arraylength
    //   1530: newarray int
    //   1532: putfield f : [I
    //   1535: iconst_0
    //   1536: istore #6
    //   1538: iload #6
    //   1540: iload #7
    //   1542: if_icmpge -> 1571
    //   1545: aload #16
    //   1547: getfield f : [I
    //   1550: iload #6
    //   1552: aload #17
    //   1554: iload #6
    //   1556: aaload
    //   1557: ldc -2147483648
    //   1559: invokevirtual k : (I)I
    //   1562: iastore
    //   1563: iinc #6, 1
    //   1566: goto -> 1538
    //   1569: aconst_null
    //   1570: athrow
    //   1571: aload_0
    //   1572: aload_1
    //   1573: invokevirtual q : (Landroidx/recyclerview/widget/RecyclerView$v;)V
    //   1576: aload_0
    //   1577: getfield y : Lb/r/d/n;
    //   1580: iconst_0
    //   1581: putfield a : Z
    //   1584: aload_0
    //   1585: iconst_0
    //   1586: putfield M : Z
    //   1589: aload_0
    //   1590: getfield v : Lb/r/d/t;
    //   1593: invokevirtual l : ()I
    //   1596: istore #6
    //   1598: aload_0
    //   1599: iload #6
    //   1601: aload_0
    //   1602: getfield s : I
    //   1605: idiv
    //   1606: putfield x : I
    //   1609: aload_0
    //   1610: iload #6
    //   1612: aload_0
    //   1613: getfield v : Lb/r/d/t;
    //   1616: invokevirtual i : ()I
    //   1619: invokestatic makeMeasureSpec : (II)I
    //   1622: putfield J : I
    //   1625: aload_0
    //   1626: aload #14
    //   1628: getfield a : I
    //   1631: aload_2
    //   1632: invokevirtual z1 : (ILandroidx/recyclerview/widget/RecyclerView$a0;)V
    //   1635: aload #14
    //   1637: getfield c : Z
    //   1640: ifeq -> 1667
    //   1643: aload_0
    //   1644: iconst_m1
    //   1645: invokevirtual x1 : (I)V
    //   1648: aload_0
    //   1649: aload_1
    //   1650: aload_0
    //   1651: getfield y : Lb/r/d/n;
    //   1654: aload_2
    //   1655: invokevirtual c1 : (Landroidx/recyclerview/widget/RecyclerView$v;Lb/r/d/n;Landroidx/recyclerview/widget/RecyclerView$a0;)I
    //   1658: pop
    //   1659: aload_0
    //   1660: iconst_1
    //   1661: invokevirtual x1 : (I)V
    //   1664: goto -> 1688
    //   1667: aload_0
    //   1668: iconst_1
    //   1669: invokevirtual x1 : (I)V
    //   1672: aload_0
    //   1673: aload_1
    //   1674: aload_0
    //   1675: getfield y : Lb/r/d/n;
    //   1678: aload_2
    //   1679: invokevirtual c1 : (Landroidx/recyclerview/widget/RecyclerView$v;Lb/r/d/n;Landroidx/recyclerview/widget/RecyclerView$a0;)I
    //   1682: pop
    //   1683: aload_0
    //   1684: iconst_m1
    //   1685: invokevirtual x1 : (I)V
    //   1688: aload_0
    //   1689: getfield y : Lb/r/d/n;
    //   1692: astore #15
    //   1694: aload #15
    //   1696: aload #14
    //   1698: getfield a : I
    //   1701: aload #15
    //   1703: getfield d : I
    //   1706: iadd
    //   1707: putfield c : I
    //   1710: aload_0
    //   1711: aload_1
    //   1712: aload #15
    //   1714: aload_2
    //   1715: invokevirtual c1 : (Landroidx/recyclerview/widget/RecyclerView$v;Lb/r/d/n;Landroidx/recyclerview/widget/RecyclerView$a0;)I
    //   1718: pop
    //   1719: aload_0
    //   1720: getfield v : Lb/r/d/t;
    //   1723: invokevirtual i : ()I
    //   1726: ldc 1073741824
    //   1728: if_icmpne -> 1734
    //   1731: goto -> 2067
    //   1734: fconst_0
    //   1735: fstore #4
    //   1737: aload_0
    //   1738: invokevirtual y : ()I
    //   1741: istore #8
    //   1743: iconst_0
    //   1744: istore #6
    //   1746: iload #6
    //   1748: iload #8
    //   1750: if_icmpge -> 1812
    //   1753: aload_0
    //   1754: iload #6
    //   1756: invokevirtual x : (I)Landroid/view/View;
    //   1759: astore #15
    //   1761: aload_0
    //   1762: getfield v : Lb/r/d/t;
    //   1765: aload #15
    //   1767: invokevirtual c : (Landroid/view/View;)I
    //   1770: i2f
    //   1771: fstore #5
    //   1773: fload #5
    //   1775: fload #4
    //   1777: fcmpg
    //   1778: ifge -> 1784
    //   1781: goto -> 1804
    //   1784: aload #15
    //   1786: invokevirtual getLayoutParams : ()Landroid/view/ViewGroup$LayoutParams;
    //   1789: checkcast androidx/recyclerview/widget/StaggeredGridLayoutManager$c
    //   1792: ifnull -> 1810
    //   1795: fload #4
    //   1797: fload #5
    //   1799: invokestatic max : (FF)F
    //   1802: fstore #4
    //   1804: iinc #6, 1
    //   1807: goto -> 1746
    //   1810: aconst_null
    //   1811: athrow
    //   1812: aload_0
    //   1813: getfield x : I
    //   1816: istore #10
    //   1818: fload #4
    //   1820: aload_0
    //   1821: getfield s : I
    //   1824: i2f
    //   1825: fmul
    //   1826: invokestatic round : (F)I
    //   1829: istore #7
    //   1831: iload #7
    //   1833: istore #6
    //   1835: aload_0
    //   1836: getfield v : Lb/r/d/t;
    //   1839: invokevirtual i : ()I
    //   1842: ldc -2147483648
    //   1844: if_icmpne -> 1861
    //   1847: iload #7
    //   1849: aload_0
    //   1850: getfield v : Lb/r/d/t;
    //   1853: invokevirtual l : ()I
    //   1856: invokestatic min : (II)I
    //   1859: istore #6
    //   1861: aload_0
    //   1862: iload #6
    //   1864: aload_0
    //   1865: getfield s : I
    //   1868: idiv
    //   1869: putfield x : I
    //   1872: aload_0
    //   1873: iload #6
    //   1875: aload_0
    //   1876: getfield v : Lb/r/d/t;
    //   1879: invokevirtual i : ()I
    //   1882: invokestatic makeMeasureSpec : (II)I
    //   1885: putfield J : I
    //   1888: aload_0
    //   1889: getfield x : I
    //   1892: iload #10
    //   1894: if_icmpne -> 1900
    //   1897: goto -> 2067
    //   1900: iconst_0
    //   1901: istore #6
    //   1903: iload #6
    //   1905: iload #8
    //   1907: if_icmpge -> 2067
    //   1910: aload_0
    //   1911: iload #6
    //   1913: invokevirtual x : (I)Landroid/view/View;
    //   1916: astore #16
    //   1918: aload #16
    //   1920: invokevirtual getLayoutParams : ()Landroid/view/ViewGroup$LayoutParams;
    //   1923: checkcast androidx/recyclerview/widget/StaggeredGridLayoutManager$c
    //   1926: astore #15
    //   1928: aload #15
    //   1930: getfield f : Z
    //   1933: ifeq -> 1939
    //   1936: goto -> 2061
    //   1939: aload_0
    //   1940: invokevirtual n1 : ()Z
    //   1943: ifeq -> 2003
    //   1946: aload_0
    //   1947: getfield w : I
    //   1950: iconst_1
    //   1951: if_icmpne -> 2003
    //   1954: aload_0
    //   1955: getfield s : I
    //   1958: istore #11
    //   1960: aload #15
    //   1962: getfield e : Landroidx/recyclerview/widget/StaggeredGridLayoutManager$f;
    //   1965: getfield e : I
    //   1968: istore #7
    //   1970: aload #16
    //   1972: iload #11
    //   1974: iconst_1
    //   1975: isub
    //   1976: iload #7
    //   1978: isub
    //   1979: ineg
    //   1980: aload_0
    //   1981: getfield x : I
    //   1984: imul
    //   1985: iload #11
    //   1987: iconst_1
    //   1988: isub
    //   1989: iload #7
    //   1991: isub
    //   1992: ineg
    //   1993: iload #10
    //   1995: imul
    //   1996: isub
    //   1997: invokevirtual offsetLeftAndRight : (I)V
    //   2000: goto -> 2061
    //   2003: aload #15
    //   2005: getfield e : Landroidx/recyclerview/widget/StaggeredGridLayoutManager$f;
    //   2008: getfield e : I
    //   2011: istore #11
    //   2013: aload_0
    //   2014: getfield x : I
    //   2017: istore #12
    //   2019: aload_0
    //   2020: getfield w : I
    //   2023: istore #7
    //   2025: iload #12
    //   2027: iload #11
    //   2029: imul
    //   2030: iload #11
    //   2032: iload #10
    //   2034: imul
    //   2035: isub
    //   2036: istore #11
    //   2038: iload #7
    //   2040: iconst_1
    //   2041: if_icmpne -> 2054
    //   2044: aload #16
    //   2046: iload #11
    //   2048: invokevirtual offsetLeftAndRight : (I)V
    //   2051: goto -> 2061
    //   2054: aload #16
    //   2056: iload #11
    //   2058: invokevirtual offsetTopAndBottom : (I)V
    //   2061: iinc #6, 1
    //   2064: goto -> 1903
    //   2067: aload_0
    //   2068: invokevirtual y : ()I
    //   2071: ifle -> 2112
    //   2074: aload_0
    //   2075: getfield A : Z
    //   2078: ifeq -> 2098
    //   2081: aload_0
    //   2082: aload_1
    //   2083: aload_2
    //   2084: iconst_1
    //   2085: invokevirtual f1 : (Landroidx/recyclerview/widget/RecyclerView$v;Landroidx/recyclerview/widget/RecyclerView$a0;Z)V
    //   2088: aload_0
    //   2089: aload_1
    //   2090: aload_2
    //   2091: iconst_0
    //   2092: invokevirtual g1 : (Landroidx/recyclerview/widget/RecyclerView$v;Landroidx/recyclerview/widget/RecyclerView$a0;Z)V
    //   2095: goto -> 2112
    //   2098: aload_0
    //   2099: aload_1
    //   2100: aload_2
    //   2101: iconst_1
    //   2102: invokevirtual g1 : (Landroidx/recyclerview/widget/RecyclerView$v;Landroidx/recyclerview/widget/RecyclerView$a0;Z)V
    //   2105: aload_0
    //   2106: aload_1
    //   2107: aload_2
    //   2108: iconst_0
    //   2109: invokevirtual f1 : (Landroidx/recyclerview/widget/RecyclerView$v;Landroidx/recyclerview/widget/RecyclerView$a0;Z)V
    //   2112: iload_3
    //   2113: ifeq -> 2204
    //   2116: aload_2
    //   2117: getfield g : Z
    //   2120: ifne -> 2204
    //   2123: aload_0
    //   2124: getfield F : I
    //   2127: ifeq -> 2157
    //   2130: aload_0
    //   2131: invokevirtual y : ()I
    //   2134: ifle -> 2157
    //   2137: aload_0
    //   2138: getfield M : Z
    //   2141: ifne -> 2151
    //   2144: aload_0
    //   2145: invokevirtual m1 : ()Landroid/view/View;
    //   2148: ifnull -> 2157
    //   2151: iconst_1
    //   2152: istore #6
    //   2154: goto -> 2160
    //   2157: iconst_0
    //   2158: istore #6
    //   2160: iload #6
    //   2162: ifeq -> 2204
    //   2165: aload_0
    //   2166: getfield P : Ljava/lang/Runnable;
    //   2169: astore #15
    //   2171: aload_0
    //   2172: getfield b : Landroidx/recyclerview/widget/RecyclerView;
    //   2175: astore #16
    //   2177: aload #16
    //   2179: ifnull -> 2190
    //   2182: aload #16
    //   2184: aload #15
    //   2186: invokevirtual removeCallbacks : (Ljava/lang/Runnable;)Z
    //   2189: pop
    //   2190: aload_0
    //   2191: invokevirtual Y0 : ()Z
    //   2194: ifeq -> 2204
    //   2197: iload #9
    //   2199: istore #6
    //   2201: goto -> 2207
    //   2204: iconst_0
    //   2205: istore #6
    //   2207: aload_2
    //   2208: getfield g : Z
    //   2211: ifeq -> 2221
    //   2214: aload_0
    //   2215: getfield L : Landroidx/recyclerview/widget/StaggeredGridLayoutManager$b;
    //   2218: invokevirtual b : ()V
    //   2221: aload_0
    //   2222: aload #14
    //   2224: getfield c : Z
    //   2227: putfield G : Z
    //   2230: aload_0
    //   2231: aload_0
    //   2232: invokevirtual n1 : ()Z
    //   2235: putfield H : Z
    //   2238: iload #6
    //   2240: ifeq -> 2257
    //   2243: aload_0
    //   2244: getfield L : Landroidx/recyclerview/widget/StaggeredGridLayoutManager$b;
    //   2247: invokevirtual b : ()V
    //   2250: aload_0
    //   2251: aload_1
    //   2252: aload_2
    //   2253: iconst_0
    //   2254: invokevirtual p1 : (Landroidx/recyclerview/widget/RecyclerView$v;Landroidx/recyclerview/widget/RecyclerView$a0;Z)V
    //   2257: return
  }
  
  public final boolean q1(int paramInt) {
    boolean bool;
    int i = this.w;
    boolean bool1 = true;
    boolean bool2 = true;
    if (i == 0) {
      if (paramInt == -1) {
        bool = true;
      } else {
        bool = false;
      } 
      if (bool != this.A) {
        bool = bool2;
      } else {
        bool = false;
      } 
      return bool;
    } 
    if (paramInt == -1) {
      bool = true;
    } else {
      bool = false;
    } 
    if (bool == this.A) {
      bool = true;
    } else {
      bool = false;
    } 
    if (bool == n1()) {
      bool = bool1;
    } else {
      bool = false;
    } 
    return bool;
  }
  
  public void r0(RecyclerView paramRecyclerView, int paramInt1, int paramInt2, Object paramObject) {
    l1(paramInt1, paramInt2, 4);
  }
  
  public void r1(int paramInt, RecyclerView.a0 parama0) {
    byte b1;
    int i;
    if (paramInt > 0) {
      i = i1();
      b1 = 1;
    } else {
      i = h1();
      b1 = -1;
    } 
    this.y.a = true;
    z1(i, parama0);
    x1(b1);
    n n1 = this.y;
    n1.c = i + n1.d;
    n1.b = Math.abs(paramInt);
  }
  
  public void s0(RecyclerView.v paramv, RecyclerView.a0 parama0) {
    p1(paramv, parama0, true);
  }
  
  public final void s1(RecyclerView.v paramv, n paramn) {
    // Byte code:
    //   0: aload_2
    //   1: getfield a : Z
    //   4: ifeq -> 276
    //   7: aload_2
    //   8: getfield i : Z
    //   11: ifeq -> 17
    //   14: goto -> 276
    //   17: aload_2
    //   18: getfield b : I
    //   21: ifne -> 60
    //   24: aload_2
    //   25: getfield e : I
    //   28: iconst_m1
    //   29: if_icmpne -> 46
    //   32: aload_2
    //   33: getfield g : I
    //   36: istore_3
    //   37: aload_0
    //   38: aload_1
    //   39: iload_3
    //   40: invokevirtual t1 : (Landroidx/recyclerview/widget/RecyclerView$v;I)V
    //   43: goto -> 276
    //   46: aload_2
    //   47: getfield f : I
    //   50: istore_3
    //   51: aload_0
    //   52: aload_1
    //   53: iload_3
    //   54: invokevirtual u1 : (Landroidx/recyclerview/widget/RecyclerView$v;I)V
    //   57: goto -> 276
    //   60: aload_2
    //   61: getfield e : I
    //   64: istore #5
    //   66: iconst_1
    //   67: istore_3
    //   68: iconst_1
    //   69: istore #4
    //   71: iload #5
    //   73: iconst_m1
    //   74: if_icmpne -> 175
    //   77: aload_2
    //   78: getfield f : I
    //   81: istore #7
    //   83: aload_0
    //   84: getfield t : [Landroidx/recyclerview/widget/StaggeredGridLayoutManager$f;
    //   87: iconst_0
    //   88: aaload
    //   89: iload #7
    //   91: invokevirtual k : (I)I
    //   94: istore #5
    //   96: iload #4
    //   98: istore_3
    //   99: iload_3
    //   100: aload_0
    //   101: getfield s : I
    //   104: if_icmpge -> 145
    //   107: aload_0
    //   108: getfield t : [Landroidx/recyclerview/widget/StaggeredGridLayoutManager$f;
    //   111: iload_3
    //   112: aaload
    //   113: iload #7
    //   115: invokevirtual k : (I)I
    //   118: istore #6
    //   120: iload #5
    //   122: istore #4
    //   124: iload #6
    //   126: iload #5
    //   128: if_icmple -> 135
    //   131: iload #6
    //   133: istore #4
    //   135: iinc #3, 1
    //   138: iload #4
    //   140: istore #5
    //   142: goto -> 99
    //   145: iload #7
    //   147: iload #5
    //   149: isub
    //   150: istore_3
    //   151: iload_3
    //   152: ifge -> 158
    //   155: goto -> 32
    //   158: aload_2
    //   159: getfield g : I
    //   162: iload_3
    //   163: aload_2
    //   164: getfield b : I
    //   167: invokestatic min : (II)I
    //   170: isub
    //   171: istore_3
    //   172: goto -> 37
    //   175: aload_2
    //   176: getfield g : I
    //   179: istore #7
    //   181: aload_0
    //   182: getfield t : [Landroidx/recyclerview/widget/StaggeredGridLayoutManager$f;
    //   185: iconst_0
    //   186: aaload
    //   187: iload #7
    //   189: invokevirtual h : (I)I
    //   192: istore #4
    //   194: iload_3
    //   195: aload_0
    //   196: getfield s : I
    //   199: if_icmpge -> 240
    //   202: aload_0
    //   203: getfield t : [Landroidx/recyclerview/widget/StaggeredGridLayoutManager$f;
    //   206: iload_3
    //   207: aaload
    //   208: iload #7
    //   210: invokevirtual h : (I)I
    //   213: istore #6
    //   215: iload #4
    //   217: istore #5
    //   219: iload #6
    //   221: iload #4
    //   223: if_icmpge -> 230
    //   226: iload #6
    //   228: istore #5
    //   230: iinc #3, 1
    //   233: iload #5
    //   235: istore #4
    //   237: goto -> 194
    //   240: iload #4
    //   242: aload_2
    //   243: getfield g : I
    //   246: isub
    //   247: istore_3
    //   248: iload_3
    //   249: ifge -> 255
    //   252: goto -> 46
    //   255: aload_2
    //   256: getfield f : I
    //   259: istore #4
    //   261: iload_3
    //   262: aload_2
    //   263: getfield b : I
    //   266: invokestatic min : (II)I
    //   269: iload #4
    //   271: iadd
    //   272: istore_3
    //   273: goto -> 51
    //   276: return
  }
  
  public void t0(RecyclerView.a0 parama0) {
    this.C = -1;
    this.D = Integer.MIN_VALUE;
    this.I = null;
    this.L.b();
  }
  
  public final void t1(RecyclerView.v paramv, int paramInt) {
    int i = y() - 1;
    while (i >= 0) {
      View view = x(i);
      if (this.u.e(view) >= paramInt && this.u.o(view) >= paramInt) {
        c c = (c)view.getLayoutParams();
        if (c.f) {
          byte b1;
          byte b3 = 0;
          byte b2 = 0;
          while (true) {
            b1 = b3;
            if (b2 < this.s) {
              if ((this.t[b2]).a.size() == 1)
                return; 
              b2++;
              continue;
            } 
            break;
          } 
          while (b1 < this.s) {
            this.t[b1].l();
            b1++;
          } 
        } else {
          if (c.e.a.size() == 1)
            return; 
          c.e.l();
        } 
        E0(view, paramv);
        i--;
      } 
    } 
  }
  
  public RecyclerView.p u() {
    return (this.w == 0) ? new c(-2, -1) : new c(-1, -2);
  }
  
  public final void u1(RecyclerView.v paramv, int paramInt) {
    while (y() > 0) {
      byte b1 = 0;
      View view = x(0);
      if (this.u.b(view) <= paramInt && this.u.n(view) <= paramInt) {
        c c = (c)view.getLayoutParams();
        if (c.f) {
          byte b2;
          byte b3 = 0;
          while (true) {
            b2 = b1;
            if (b3 < this.s) {
              if ((this.t[b3]).a.size() == 1)
                return; 
              b3++;
              continue;
            } 
            break;
          } 
          while (b2 < this.s) {
            this.t[b2].m();
            b2++;
          } 
        } else {
          if (c.e.a.size() == 1)
            return; 
          c.e.m();
        } 
        E0(view, paramv);
      } 
    } 
  }
  
  public RecyclerView.p v(Context paramContext, AttributeSet paramAttributeSet) {
    return new c(paramContext, paramAttributeSet);
  }
  
  public final void v1() {
    int i;
    if (this.w == 1 || !n1()) {
      boolean bool = this.z;
    } else {
      i = this.z ^ true;
    } 
    this.A = i;
  }
  
  public RecyclerView.p w(ViewGroup.LayoutParams paramLayoutParams) {
    return (paramLayoutParams instanceof ViewGroup.MarginLayoutParams) ? new c((ViewGroup.MarginLayoutParams)paramLayoutParams) : new c(paramLayoutParams);
  }
  
  public int w1(int paramInt, RecyclerView.v paramv, RecyclerView.a0 parama0) {
    if (y() == 0 || paramInt == 0)
      return 0; 
    r1(paramInt, parama0);
    int i = c1(paramv, this.y, parama0);
    if (this.y.b >= i)
      if (paramInt < 0) {
        paramInt = -i;
      } else {
        paramInt = i;
      }  
    this.u.p(-paramInt);
    this.G = this.A;
    n n1 = this.y;
    n1.b = 0;
    s1(paramv, n1);
    return paramInt;
  }
  
  public void x0(Parcelable paramParcelable) {
    if (paramParcelable instanceof e) {
      this.I = (e)paramParcelable;
      I0();
    } 
  }
  
  public final void x1(int paramInt) {
    boolean bool1;
    n n1 = this.y;
    n1.e = paramInt;
    boolean bool2 = this.A;
    boolean bool = true;
    if (paramInt == -1) {
      bool1 = true;
    } else {
      bool1 = false;
    } 
    if (bool2 == bool1) {
      paramInt = bool;
    } else {
      paramInt = -1;
    } 
    n1.d = paramInt;
  }
  
  public Parcelable y0() {
    // Byte code:
    //   0: aload_0
    //   1: getfield I : Landroidx/recyclerview/widget/StaggeredGridLayoutManager$e;
    //   4: astore #4
    //   6: aload #4
    //   8: ifnull -> 21
    //   11: new androidx/recyclerview/widget/StaggeredGridLayoutManager$e
    //   14: dup
    //   15: aload #4
    //   17: invokespecial <init> : (Landroidx/recyclerview/widget/StaggeredGridLayoutManager$e;)V
    //   20: areturn
    //   21: new androidx/recyclerview/widget/StaggeredGridLayoutManager$e
    //   24: dup
    //   25: invokespecial <init> : ()V
    //   28: astore #5
    //   30: aload #5
    //   32: aload_0
    //   33: getfield z : Z
    //   36: putfield i : Z
    //   39: aload #5
    //   41: aload_0
    //   42: getfield G : Z
    //   45: putfield j : Z
    //   48: aload #5
    //   50: aload_0
    //   51: getfield H : Z
    //   54: putfield k : Z
    //   57: aload_0
    //   58: getfield E : Landroidx/recyclerview/widget/StaggeredGridLayoutManager$d;
    //   61: astore #4
    //   63: iconst_0
    //   64: istore_2
    //   65: aload #4
    //   67: ifnull -> 110
    //   70: aload #4
    //   72: getfield a : [I
    //   75: astore #6
    //   77: aload #6
    //   79: ifnull -> 110
    //   82: aload #5
    //   84: aload #6
    //   86: putfield g : [I
    //   89: aload #5
    //   91: aload #6
    //   93: arraylength
    //   94: putfield f : I
    //   97: aload #5
    //   99: aload #4
    //   101: getfield b : Ljava/util/List;
    //   104: putfield h : Ljava/util/List;
    //   107: goto -> 116
    //   110: aload #5
    //   112: iconst_0
    //   113: putfield f : I
    //   116: aload_0
    //   117: invokevirtual y : ()I
    //   120: istore_1
    //   121: iconst_m1
    //   122: istore_3
    //   123: iload_1
    //   124: ifle -> 311
    //   127: aload_0
    //   128: getfield G : Z
    //   131: ifeq -> 142
    //   134: aload_0
    //   135: invokevirtual i1 : ()I
    //   138: istore_1
    //   139: goto -> 147
    //   142: aload_0
    //   143: invokevirtual h1 : ()I
    //   146: istore_1
    //   147: aload #5
    //   149: iload_1
    //   150: putfield b : I
    //   153: aload_0
    //   154: getfield A : Z
    //   157: ifeq -> 170
    //   160: aload_0
    //   161: iconst_1
    //   162: invokevirtual d1 : (Z)Landroid/view/View;
    //   165: astore #4
    //   167: goto -> 177
    //   170: aload_0
    //   171: iconst_1
    //   172: invokevirtual e1 : (Z)Landroid/view/View;
    //   175: astore #4
    //   177: aload #4
    //   179: ifnonnull -> 187
    //   182: iload_3
    //   183: istore_1
    //   184: goto -> 194
    //   187: aload_0
    //   188: aload #4
    //   190: invokevirtual P : (Landroid/view/View;)I
    //   193: istore_1
    //   194: aload #5
    //   196: iload_1
    //   197: putfield c : I
    //   200: aload_0
    //   201: getfield s : I
    //   204: istore_1
    //   205: aload #5
    //   207: iload_1
    //   208: putfield d : I
    //   211: aload #5
    //   213: iload_1
    //   214: newarray int
    //   216: putfield e : [I
    //   219: iload_2
    //   220: aload_0
    //   221: getfield s : I
    //   224: if_icmpge -> 329
    //   227: aload_0
    //   228: getfield G : Z
    //   231: ifeq -> 265
    //   234: aload_0
    //   235: getfield t : [Landroidx/recyclerview/widget/StaggeredGridLayoutManager$f;
    //   238: iload_2
    //   239: aaload
    //   240: ldc -2147483648
    //   242: invokevirtual h : (I)I
    //   245: istore_3
    //   246: iload_3
    //   247: istore_1
    //   248: iload_3
    //   249: ldc -2147483648
    //   251: if_icmpeq -> 297
    //   254: aload_0
    //   255: getfield u : Lb/r/d/t;
    //   258: invokevirtual g : ()I
    //   261: istore_1
    //   262: goto -> 293
    //   265: aload_0
    //   266: getfield t : [Landroidx/recyclerview/widget/StaggeredGridLayoutManager$f;
    //   269: iload_2
    //   270: aaload
    //   271: ldc -2147483648
    //   273: invokevirtual k : (I)I
    //   276: istore_3
    //   277: iload_3
    //   278: istore_1
    //   279: iload_3
    //   280: ldc -2147483648
    //   282: if_icmpeq -> 297
    //   285: aload_0
    //   286: getfield u : Lb/r/d/t;
    //   289: invokevirtual k : ()I
    //   292: istore_1
    //   293: iload_3
    //   294: iload_1
    //   295: isub
    //   296: istore_1
    //   297: aload #5
    //   299: getfield e : [I
    //   302: iload_2
    //   303: iload_1
    //   304: iastore
    //   305: iinc #2, 1
    //   308: goto -> 219
    //   311: aload #5
    //   313: iconst_m1
    //   314: putfield b : I
    //   317: aload #5
    //   319: iconst_m1
    //   320: putfield c : I
    //   323: aload #5
    //   325: iconst_0
    //   326: putfield d : I
    //   329: aload #5
    //   331: areturn
  }
  
  public final void y1(int paramInt1, int paramInt2) {
    for (byte b1 = 0; b1 < this.s; b1++) {
      if (!(this.t[b1]).a.isEmpty())
        A1(this.t[b1], paramInt1, paramInt2); 
    } 
  }
  
  public void z0(int paramInt) {
    if (paramInt == 0)
      Y0(); 
  }
  
  public final void z1(int paramInt, RecyclerView.a0 parama0) {
    // Byte code:
    //   0: aload_0
    //   1: getfield y : Lb/r/d/n;
    //   4: astore #8
    //   6: iconst_0
    //   7: istore #6
    //   9: aload #8
    //   11: iconst_0
    //   12: putfield b : I
    //   15: aload #8
    //   17: iload_1
    //   18: putfield c : I
    //   21: aload_0
    //   22: getfield g : Landroidx/recyclerview/widget/RecyclerView$z;
    //   25: astore #8
    //   27: aload #8
    //   29: ifnull -> 45
    //   32: aload #8
    //   34: getfield e : Z
    //   37: ifeq -> 45
    //   40: iconst_1
    //   41: istore_3
    //   42: goto -> 47
    //   45: iconst_0
    //   46: istore_3
    //   47: iload_3
    //   48: ifeq -> 112
    //   51: aload_2
    //   52: getfield a : I
    //   55: istore_3
    //   56: iload_3
    //   57: iconst_m1
    //   58: if_icmpeq -> 112
    //   61: aload_0
    //   62: getfield A : Z
    //   65: istore #7
    //   67: iload_3
    //   68: iload_1
    //   69: if_icmpge -> 78
    //   72: iconst_1
    //   73: istore #5
    //   75: goto -> 81
    //   78: iconst_0
    //   79: istore #5
    //   81: iload #7
    //   83: iload #5
    //   85: if_icmpne -> 99
    //   88: aload_0
    //   89: getfield u : Lb/r/d/t;
    //   92: invokevirtual l : ()I
    //   95: istore_1
    //   96: goto -> 114
    //   99: aload_0
    //   100: getfield u : Lb/r/d/t;
    //   103: invokevirtual l : ()I
    //   106: istore_3
    //   107: iconst_0
    //   108: istore_1
    //   109: goto -> 116
    //   112: iconst_0
    //   113: istore_1
    //   114: iconst_0
    //   115: istore_3
    //   116: aload_0
    //   117: getfield b : Landroidx/recyclerview/widget/RecyclerView;
    //   120: astore_2
    //   121: aload_2
    //   122: ifnull -> 138
    //   125: aload_2
    //   126: getfield mClipToPadding : Z
    //   129: ifeq -> 138
    //   132: iconst_1
    //   133: istore #4
    //   135: goto -> 141
    //   138: iconst_0
    //   139: istore #4
    //   141: iload #4
    //   143: ifeq -> 181
    //   146: aload_0
    //   147: getfield y : Lb/r/d/n;
    //   150: aload_0
    //   151: getfield u : Lb/r/d/t;
    //   154: invokevirtual k : ()I
    //   157: iload_3
    //   158: isub
    //   159: putfield f : I
    //   162: aload_0
    //   163: getfield y : Lb/r/d/n;
    //   166: aload_0
    //   167: getfield u : Lb/r/d/t;
    //   170: invokevirtual g : ()I
    //   173: iload_1
    //   174: iadd
    //   175: putfield g : I
    //   178: goto -> 206
    //   181: aload_0
    //   182: getfield y : Lb/r/d/n;
    //   185: aload_0
    //   186: getfield u : Lb/r/d/t;
    //   189: invokevirtual f : ()I
    //   192: iload_1
    //   193: iadd
    //   194: putfield g : I
    //   197: aload_0
    //   198: getfield y : Lb/r/d/n;
    //   201: iload_3
    //   202: ineg
    //   203: putfield f : I
    //   206: aload_0
    //   207: getfield y : Lb/r/d/n;
    //   210: astore_2
    //   211: aload_2
    //   212: iconst_0
    //   213: putfield h : Z
    //   216: aload_2
    //   217: iconst_1
    //   218: putfield a : Z
    //   221: iload #6
    //   223: istore #5
    //   225: aload_0
    //   226: getfield u : Lb/r/d/t;
    //   229: invokevirtual i : ()I
    //   232: ifne -> 252
    //   235: iload #6
    //   237: istore #5
    //   239: aload_0
    //   240: getfield u : Lb/r/d/t;
    //   243: invokevirtual f : ()I
    //   246: ifne -> 252
    //   249: iconst_1
    //   250: istore #5
    //   252: aload_2
    //   253: iload #5
    //   255: putfield i : Z
    //   258: return
  }
  
  public class a implements Runnable {
    public final StaggeredGridLayoutManager b;
    
    public a(StaggeredGridLayoutManager this$0) {}
    
    public void run() {
      this.b.Y0();
    }
  }
  
  public class b {
    public int a;
    
    public int b;
    
    public boolean c;
    
    public boolean d;
    
    public boolean e;
    
    public int[] f;
    
    public final StaggeredGridLayoutManager g;
    
    public b(StaggeredGridLayoutManager this$0) {
      b();
    }
    
    public void a() {
      int i;
      if (this.c) {
        i = this.g.u.g();
      } else {
        i = this.g.u.k();
      } 
      this.b = i;
    }
    
    public void b() {
      this.a = -1;
      this.b = Integer.MIN_VALUE;
      this.c = false;
      this.d = false;
      this.e = false;
      int[] arrayOfInt = this.f;
      if (arrayOfInt != null)
        Arrays.fill(arrayOfInt, -1); 
    }
  }
  
  public static class c extends RecyclerView.p {
    public StaggeredGridLayoutManager.f e;
    
    public boolean f;
    
    public c(int param1Int1, int param1Int2) {
      super(param1Int1, param1Int2);
    }
    
    public c(Context param1Context, AttributeSet param1AttributeSet) {
      super(param1Context, param1AttributeSet);
    }
    
    public c(ViewGroup.LayoutParams param1LayoutParams) {
      super(param1LayoutParams);
    }
    
    public c(ViewGroup.MarginLayoutParams param1MarginLayoutParams) {
      super(param1MarginLayoutParams);
    }
  }
  
  public static class d {
    public int[] a;
    
    public List<a> b;
    
    public void a(a param1a) {
      if (this.b == null)
        this.b = new ArrayList<a>(); 
      int i = this.b.size();
      for (byte b = 0; b < i; b++) {
        a a1 = this.b.get(b);
        if (a1.b == param1a.b)
          this.b.remove(b); 
        if (a1.b >= param1a.b) {
          this.b.add(b, param1a);
          return;
        } 
      } 
      this.b.add(param1a);
    }
    
    public void b() {
      int[] arrayOfInt = this.a;
      if (arrayOfInt != null)
        Arrays.fill(arrayOfInt, -1); 
      this.b = null;
    }
    
    public void c(int param1Int) {
      int[] arrayOfInt = this.a;
      if (arrayOfInt == null) {
        arrayOfInt = new int[Math.max(param1Int, 10) + 1];
        this.a = arrayOfInt;
        Arrays.fill(arrayOfInt, -1);
      } else if (param1Int >= arrayOfInt.length) {
        int i;
        for (i = arrayOfInt.length; i <= param1Int; i *= 2);
        int[] arrayOfInt1 = new int[i];
        this.a = arrayOfInt1;
        System.arraycopy(arrayOfInt, 0, arrayOfInt1, 0, arrayOfInt.length);
        arrayOfInt1 = this.a;
        Arrays.fill(arrayOfInt1, arrayOfInt.length, arrayOfInt1.length, -1);
      } 
    }
    
    public int d(int param1Int) {
      List<a> list = this.b;
      if (list != null)
        for (int i = list.size() - 1; i >= 0; i--) {
          if (((a)this.b.get(i)).b >= param1Int)
            this.b.remove(i); 
        }  
      return g(param1Int);
    }
    
    public a e(int param1Int1, int param1Int2, int param1Int3, boolean param1Boolean) {
      List<a> list = this.b;
      if (list == null)
        return null; 
      int i = list.size();
      for (byte b = 0; b < i; b++) {
        a a = this.b.get(b);
        int j = a.b;
        if (j >= param1Int2)
          return null; 
        if (j >= param1Int1 && (param1Int3 == 0 || a.c == param1Int3 || (param1Boolean && a.e)))
          return a; 
      } 
      return null;
    }
    
    public a f(int param1Int) {
      List<a> list = this.b;
      if (list == null)
        return null; 
      for (int i = list.size() - 1; i >= 0; i--) {
        a a = this.b.get(i);
        if (a.b == param1Int)
          return a; 
      } 
      return null;
    }
    
    public int g(int param1Int) {
      // Byte code:
      //   0: aload_0
      //   1: getfield a : [I
      //   4: astore #4
      //   6: aload #4
      //   8: ifnonnull -> 13
      //   11: iconst_m1
      //   12: ireturn
      //   13: iload_1
      //   14: aload #4
      //   16: arraylength
      //   17: if_icmplt -> 22
      //   20: iconst_m1
      //   21: ireturn
      //   22: aload_0
      //   23: getfield b : Ljava/util/List;
      //   26: ifnonnull -> 34
      //   29: iconst_m1
      //   30: istore_2
      //   31: goto -> 143
      //   34: aload_0
      //   35: iload_1
      //   36: invokevirtual f : (I)Landroidx/recyclerview/widget/StaggeredGridLayoutManager$d$a;
      //   39: astore #4
      //   41: aload #4
      //   43: ifnull -> 58
      //   46: aload_0
      //   47: getfield b : Ljava/util/List;
      //   50: aload #4
      //   52: invokeinterface remove : (Ljava/lang/Object;)Z
      //   57: pop
      //   58: aload_0
      //   59: getfield b : Ljava/util/List;
      //   62: invokeinterface size : ()I
      //   67: istore_3
      //   68: iconst_0
      //   69: istore_2
      //   70: iload_2
      //   71: iload_3
      //   72: if_icmpge -> 104
      //   75: aload_0
      //   76: getfield b : Ljava/util/List;
      //   79: iload_2
      //   80: invokeinterface get : (I)Ljava/lang/Object;
      //   85: checkcast androidx/recyclerview/widget/StaggeredGridLayoutManager$d$a
      //   88: getfield b : I
      //   91: iload_1
      //   92: if_icmplt -> 98
      //   95: goto -> 106
      //   98: iinc #2, 1
      //   101: goto -> 70
      //   104: iconst_m1
      //   105: istore_2
      //   106: iload_2
      //   107: iconst_m1
      //   108: if_icmpeq -> 29
      //   111: aload_0
      //   112: getfield b : Ljava/util/List;
      //   115: iload_2
      //   116: invokeinterface get : (I)Ljava/lang/Object;
      //   121: checkcast androidx/recyclerview/widget/StaggeredGridLayoutManager$d$a
      //   124: astore #4
      //   126: aload_0
      //   127: getfield b : Ljava/util/List;
      //   130: iload_2
      //   131: invokeinterface remove : (I)Ljava/lang/Object;
      //   136: pop
      //   137: aload #4
      //   139: getfield b : I
      //   142: istore_2
      //   143: iload_2
      //   144: iconst_m1
      //   145: if_icmpne -> 170
      //   148: aload_0
      //   149: getfield a : [I
      //   152: astore #4
      //   154: aload #4
      //   156: iload_1
      //   157: aload #4
      //   159: arraylength
      //   160: iconst_m1
      //   161: invokestatic fill : ([IIII)V
      //   164: aload_0
      //   165: getfield a : [I
      //   168: arraylength
      //   169: ireturn
      //   170: aload_0
      //   171: getfield a : [I
      //   174: astore #4
      //   176: iinc #2, 1
      //   179: aload #4
      //   181: iload_1
      //   182: iload_2
      //   183: iconst_m1
      //   184: invokestatic fill : ([IIII)V
      //   187: iload_2
      //   188: ireturn
    }
    
    public void h(int param1Int1, int param1Int2) {
      int[] arrayOfInt = this.a;
      if (arrayOfInt != null && param1Int1 < arrayOfInt.length) {
        int i = param1Int1 + param1Int2;
        c(i);
        arrayOfInt = this.a;
        System.arraycopy(arrayOfInt, param1Int1, arrayOfInt, i, arrayOfInt.length - param1Int1 - param1Int2);
        Arrays.fill(this.a, param1Int1, i, -1);
        List<a> list = this.b;
        if (list != null)
          for (i = list.size() - 1; i >= 0; i--) {
            a a = this.b.get(i);
            int j = a.b;
            if (j >= param1Int1)
              a.b = j + param1Int2; 
          }  
      } 
    }
    
    public void i(int param1Int1, int param1Int2) {
      int[] arrayOfInt = this.a;
      if (arrayOfInt != null && param1Int1 < arrayOfInt.length) {
        int i = param1Int1 + param1Int2;
        c(i);
        arrayOfInt = this.a;
        System.arraycopy(arrayOfInt, i, arrayOfInt, param1Int1, arrayOfInt.length - param1Int1 - param1Int2);
        arrayOfInt = this.a;
        Arrays.fill(arrayOfInt, arrayOfInt.length - param1Int2, arrayOfInt.length, -1);
        List<a> list = this.b;
        if (list != null)
          for (int j = list.size() - 1; j >= 0; j--) {
            a a = this.b.get(j);
            int k = a.b;
            if (k >= param1Int1)
              if (k < i) {
                this.b.remove(j);
              } else {
                a.b = k - param1Int2;
              }  
          }  
      } 
    }
    
    @SuppressLint({"BanParcelableUsage"})
    public static class a implements Parcelable {
      public static final Parcelable.Creator<a> CREATOR = new a();
      
      public int b;
      
      public int c;
      
      public int[] d;
      
      public boolean e;
      
      public a() {}
      
      public a(Parcel param2Parcel) {
        this.b = param2Parcel.readInt();
        this.c = param2Parcel.readInt();
        int i = param2Parcel.readInt();
        boolean bool = true;
        if (i != 1)
          bool = false; 
        this.e = bool;
        i = param2Parcel.readInt();
        if (i > 0) {
          int[] arrayOfInt = new int[i];
          this.d = arrayOfInt;
          param2Parcel.readIntArray(arrayOfInt);
        } 
      }
      
      public int describeContents() {
        return 0;
      }
      
      public String toString() {
        StringBuilder stringBuilder = c.a.a.a.a.e("FullSpanItem{mPosition=");
        stringBuilder.append(this.b);
        stringBuilder.append(", mGapDir=");
        stringBuilder.append(this.c);
        stringBuilder.append(", mHasUnwantedGapAfter=");
        stringBuilder.append(this.e);
        stringBuilder.append(", mGapPerSpan=");
        stringBuilder.append(Arrays.toString(this.d));
        stringBuilder.append('}');
        return stringBuilder.toString();
      }
      
      public void writeToParcel(Parcel param2Parcel, int param2Int) {
        param2Parcel.writeInt(this.b);
        param2Parcel.writeInt(this.c);
        param2Parcel.writeInt(this.e);
        int[] arrayOfInt = this.d;
        if (arrayOfInt != null && arrayOfInt.length > 0) {
          param2Parcel.writeInt(arrayOfInt.length);
          param2Parcel.writeIntArray(this.d);
        } else {
          param2Parcel.writeInt(0);
        } 
      }
      
      public static final class a implements Parcelable.Creator<a> {
        public Object createFromParcel(Parcel param3Parcel) {
          return new StaggeredGridLayoutManager.d.a(param3Parcel);
        }
        
        public Object[] newArray(int param3Int) {
          return (Object[])new StaggeredGridLayoutManager.d.a[param3Int];
        }
      }
    }
    
    public static final class a implements Parcelable.Creator<a> {
      public Object createFromParcel(Parcel param2Parcel) {
        return new StaggeredGridLayoutManager.d.a(param2Parcel);
      }
      
      public Object[] newArray(int param2Int) {
        return (Object[])new StaggeredGridLayoutManager.d.a[param2Int];
      }
    }
  }
  
  @SuppressLint({"BanParcelableUsage"})
  public static class a implements Parcelable {
    public static final Parcelable.Creator<a> CREATOR = new a();
    
    public int b;
    
    public int c;
    
    public int[] d;
    
    public boolean e;
    
    public a() {}
    
    public a(Parcel param1Parcel) {
      this.b = param1Parcel.readInt();
      this.c = param1Parcel.readInt();
      int i = param1Parcel.readInt();
      boolean bool = true;
      if (i != 1)
        bool = false; 
      this.e = bool;
      i = param1Parcel.readInt();
      if (i > 0) {
        int[] arrayOfInt = new int[i];
        this.d = arrayOfInt;
        param1Parcel.readIntArray(arrayOfInt);
      } 
    }
    
    public int describeContents() {
      return 0;
    }
    
    public String toString() {
      StringBuilder stringBuilder = c.a.a.a.a.e("FullSpanItem{mPosition=");
      stringBuilder.append(this.b);
      stringBuilder.append(", mGapDir=");
      stringBuilder.append(this.c);
      stringBuilder.append(", mHasUnwantedGapAfter=");
      stringBuilder.append(this.e);
      stringBuilder.append(", mGapPerSpan=");
      stringBuilder.append(Arrays.toString(this.d));
      stringBuilder.append('}');
      return stringBuilder.toString();
    }
    
    public void writeToParcel(Parcel param1Parcel, int param1Int) {
      param1Parcel.writeInt(this.b);
      param1Parcel.writeInt(this.c);
      param1Parcel.writeInt(this.e);
      int[] arrayOfInt = this.d;
      if (arrayOfInt != null && arrayOfInt.length > 0) {
        param1Parcel.writeInt(arrayOfInt.length);
        param1Parcel.writeIntArray(this.d);
      } else {
        param1Parcel.writeInt(0);
      } 
    }
    
    public static final class a implements Parcelable.Creator<a> {
      public Object createFromParcel(Parcel param3Parcel) {
        return new StaggeredGridLayoutManager.d.a(param3Parcel);
      }
      
      public Object[] newArray(int param3Int) {
        return (Object[])new StaggeredGridLayoutManager.d.a[param3Int];
      }
    }
  }
  
  public static final class a implements Parcelable.Creator<d.a> {
    public Object createFromParcel(Parcel param1Parcel) {
      return new StaggeredGridLayoutManager.d.a(param1Parcel);
    }
    
    public Object[] newArray(int param1Int) {
      return (Object[])new StaggeredGridLayoutManager.d.a[param1Int];
    }
  }
  
  @SuppressLint({"BanParcelableUsage"})
  public static class e implements Parcelable {
    public static final Parcelable.Creator<e> CREATOR = new a();
    
    public int b;
    
    public int c;
    
    public int d;
    
    public int[] e;
    
    public int f;
    
    public int[] g;
    
    public List<StaggeredGridLayoutManager.d.a> h;
    
    public boolean i;
    
    public boolean j;
    
    public boolean k;
    
    public e() {}
    
    public e(Parcel param1Parcel) {
      this.b = param1Parcel.readInt();
      this.c = param1Parcel.readInt();
      int i = param1Parcel.readInt();
      this.d = i;
      if (i > 0) {
        int[] arrayOfInt = new int[i];
        this.e = arrayOfInt;
        param1Parcel.readIntArray(arrayOfInt);
      } 
      i = param1Parcel.readInt();
      this.f = i;
      if (i > 0) {
        int[] arrayOfInt = new int[i];
        this.g = arrayOfInt;
        param1Parcel.readIntArray(arrayOfInt);
      } 
      i = param1Parcel.readInt();
      boolean bool2 = false;
      if (i == 1) {
        bool1 = true;
      } else {
        bool1 = false;
      } 
      this.i = bool1;
      if (param1Parcel.readInt() == 1) {
        bool1 = true;
      } else {
        bool1 = false;
      } 
      this.j = bool1;
      boolean bool1 = bool2;
      if (param1Parcel.readInt() == 1)
        bool1 = true; 
      this.k = bool1;
      this.h = param1Parcel.readArrayList(StaggeredGridLayoutManager.d.a.class.getClassLoader());
    }
    
    public e(e param1e) {
      this.d = param1e.d;
      this.b = param1e.b;
      this.c = param1e.c;
      this.e = param1e.e;
      this.f = param1e.f;
      this.g = param1e.g;
      this.i = param1e.i;
      this.j = param1e.j;
      this.k = param1e.k;
      this.h = param1e.h;
    }
    
    public int describeContents() {
      return 0;
    }
    
    public void writeToParcel(Parcel param1Parcel, int param1Int) {
      param1Parcel.writeInt(this.b);
      param1Parcel.writeInt(this.c);
      param1Parcel.writeInt(this.d);
      if (this.d > 0)
        param1Parcel.writeIntArray(this.e); 
      param1Parcel.writeInt(this.f);
      if (this.f > 0)
        param1Parcel.writeIntArray(this.g); 
      param1Parcel.writeInt(this.i);
      param1Parcel.writeInt(this.j);
      param1Parcel.writeInt(this.k);
      param1Parcel.writeList(this.h);
    }
    
    public static final class a implements Parcelable.Creator<e> {
      public Object createFromParcel(Parcel param2Parcel) {
        return new StaggeredGridLayoutManager.e(param2Parcel);
      }
      
      public Object[] newArray(int param2Int) {
        return (Object[])new StaggeredGridLayoutManager.e[param2Int];
      }
    }
  }
  
  public static final class a implements Parcelable.Creator<e> {
    public Object createFromParcel(Parcel param1Parcel) {
      return new StaggeredGridLayoutManager.e(param1Parcel);
    }
    
    public Object[] newArray(int param1Int) {
      return (Object[])new StaggeredGridLayoutManager.e[param1Int];
    }
  }
  
  public class f {
    public ArrayList<View> a = new ArrayList<View>();
    
    public int b = Integer.MIN_VALUE;
    
    public int c = Integer.MIN_VALUE;
    
    public int d = 0;
    
    public final int e;
    
    public final StaggeredGridLayoutManager f;
    
    public f(StaggeredGridLayoutManager this$0, int param1Int) {
      this.e = param1Int;
    }
    
    public void a(View param1View) {
      StaggeredGridLayoutManager.c c = j(param1View);
      c.e = this;
      this.a.add(param1View);
      this.c = Integer.MIN_VALUE;
      if (this.a.size() == 1)
        this.b = Integer.MIN_VALUE; 
      if (c.c() || c.b()) {
        int i = this.d;
        this.d = this.f.u.c(param1View) + i;
      } 
    }
    
    public void b() {
      ArrayList<View> arrayList = this.a;
      View view = arrayList.get(arrayList.size() - 1);
      StaggeredGridLayoutManager.c c = j(view);
      this.c = this.f.u.b(view);
      if (c.f) {
        StaggeredGridLayoutManager.d.a a = this.f.E.f(c.a());
        if (a != null && a.c == 1) {
          int j = this.c;
          int i = this.e;
          int[] arrayOfInt = a.d;
          if (arrayOfInt == null) {
            i = 0;
          } else {
            i = arrayOfInt[i];
          } 
          this.c = j + i;
        } 
      } 
    }
    
    public void c() {
      ArrayList<View> arrayList = this.a;
      int i = 0;
      View view = arrayList.get(0);
      StaggeredGridLayoutManager.c c = j(view);
      this.b = this.f.u.e(view);
      if (c.f) {
        StaggeredGridLayoutManager.d.a a = this.f.E.f(c.a());
        if (a != null && a.c == -1) {
          int j = this.b;
          int k = this.e;
          int[] arrayOfInt = a.d;
          if (arrayOfInt != null)
            i = arrayOfInt[k]; 
          this.b = j - i;
        } 
      } 
    }
    
    public void d() {
      this.a.clear();
      this.b = Integer.MIN_VALUE;
      this.c = Integer.MIN_VALUE;
      this.d = 0;
    }
    
    public int e() {
      boolean bool;
      int i;
      if (this.f.z) {
        bool = this.a.size() - 1;
        i = -1;
      } else {
        bool = false;
        i = this.a.size();
      } 
      return g(bool, i, true);
    }
    
    public int f() {
      int i;
      byte b;
      if (this.f.z) {
        i = 0;
        b = this.a.size();
      } else {
        i = this.a.size() - 1;
        b = -1;
      } 
      return g(i, b, true);
    }
    
    public int g(int param1Int1, int param1Int2, boolean param1Boolean) {
      byte b1;
      int i;
      int j = this.f.u.k();
      int k = this.f.u.g();
      byte b2 = -1;
      if (param1Int2 > param1Int1) {
        b1 = 1;
      } else {
        b1 = -1;
      } 
      while (true) {
        i = b2;
        if (param1Int1 != param1Int2) {
          View view = this.a.get(param1Int1);
          int m = this.f.u.e(view);
          int n = this.f.u.b(view);
          boolean bool = false;
          if (param1Boolean ? (m <= k) : (m < k)) {
            i = 1;
          } else {
            i = 0;
          } 
          if (param1Boolean ? (n >= j) : (n > j))
            bool = true; 
          if (i != 0 && bool && (m < j || n > k)) {
            i = this.f.P(view);
            break;
          } 
          param1Int1 += b1;
          continue;
        } 
        break;
      } 
      return i;
    }
    
    public int h(int param1Int) {
      int i = this.c;
      if (i != Integer.MIN_VALUE)
        return i; 
      if (this.a.size() == 0)
        return param1Int; 
      b();
      return this.c;
    }
    
    public View i(int param1Int1, int param1Int2) {
      // Byte code:
      //   0: aconst_null
      //   1: astore #4
      //   3: aconst_null
      //   4: astore #5
      //   6: iload_2
      //   7: iconst_m1
      //   8: if_icmpne -> 130
      //   11: aload_0
      //   12: getfield a : Ljava/util/ArrayList;
      //   15: invokevirtual size : ()I
      //   18: istore_3
      //   19: iconst_0
      //   20: istore_2
      //   21: aload #5
      //   23: astore #4
      //   25: aload #4
      //   27: astore #5
      //   29: iload_2
      //   30: iload_3
      //   31: if_icmpge -> 244
      //   34: aload_0
      //   35: getfield a : Ljava/util/ArrayList;
      //   38: iload_2
      //   39: invokevirtual get : (I)Ljava/lang/Object;
      //   42: checkcast android/view/View
      //   45: astore #6
      //   47: aload_0
      //   48: getfield f : Landroidx/recyclerview/widget/StaggeredGridLayoutManager;
      //   51: astore #7
      //   53: aload #7
      //   55: getfield z : Z
      //   58: ifeq -> 76
      //   61: aload #4
      //   63: astore #5
      //   65: aload #7
      //   67: aload #6
      //   69: invokevirtual P : (Landroid/view/View;)I
      //   72: iload_1
      //   73: if_icmple -> 244
      //   76: aload_0
      //   77: getfield f : Landroidx/recyclerview/widget/StaggeredGridLayoutManager;
      //   80: astore #5
      //   82: aload #5
      //   84: getfield z : Z
      //   87: ifne -> 108
      //   90: aload #5
      //   92: aload #6
      //   94: invokevirtual P : (Landroid/view/View;)I
      //   97: iload_1
      //   98: if_icmplt -> 108
      //   101: aload #4
      //   103: astore #5
      //   105: goto -> 244
      //   108: aload #4
      //   110: astore #5
      //   112: aload #6
      //   114: invokevirtual hasFocusable : ()Z
      //   117: ifeq -> 244
      //   120: iinc #2, 1
      //   123: aload #6
      //   125: astore #4
      //   127: goto -> 25
      //   130: aload_0
      //   131: getfield a : Ljava/util/ArrayList;
      //   134: invokevirtual size : ()I
      //   137: iconst_1
      //   138: isub
      //   139: istore_2
      //   140: aload #4
      //   142: astore #5
      //   144: iload_2
      //   145: iflt -> 244
      //   148: aload_0
      //   149: getfield a : Ljava/util/ArrayList;
      //   152: iload_2
      //   153: invokevirtual get : (I)Ljava/lang/Object;
      //   156: checkcast android/view/View
      //   159: astore #6
      //   161: aload_0
      //   162: getfield f : Landroidx/recyclerview/widget/StaggeredGridLayoutManager;
      //   165: astore #7
      //   167: aload #7
      //   169: getfield z : Z
      //   172: ifeq -> 190
      //   175: aload #4
      //   177: astore #5
      //   179: aload #7
      //   181: aload #6
      //   183: invokevirtual P : (Landroid/view/View;)I
      //   186: iload_1
      //   187: if_icmpge -> 244
      //   190: aload_0
      //   191: getfield f : Landroidx/recyclerview/widget/StaggeredGridLayoutManager;
      //   194: astore #5
      //   196: aload #5
      //   198: getfield z : Z
      //   201: ifne -> 222
      //   204: aload #5
      //   206: aload #6
      //   208: invokevirtual P : (Landroid/view/View;)I
      //   211: iload_1
      //   212: if_icmpgt -> 222
      //   215: aload #4
      //   217: astore #5
      //   219: goto -> 244
      //   222: aload #4
      //   224: astore #5
      //   226: aload #6
      //   228: invokevirtual hasFocusable : ()Z
      //   231: ifeq -> 244
      //   234: iinc #2, -1
      //   237: aload #6
      //   239: astore #4
      //   241: goto -> 140
      //   244: aload #5
      //   246: areturn
    }
    
    public StaggeredGridLayoutManager.c j(View param1View) {
      return (StaggeredGridLayoutManager.c)param1View.getLayoutParams();
    }
    
    public int k(int param1Int) {
      int i = this.b;
      if (i != Integer.MIN_VALUE)
        return i; 
      if (this.a.size() == 0)
        return param1Int; 
      c();
      return this.b;
    }
    
    public void l() {
      int i = this.a.size();
      View view = this.a.remove(i - 1);
      StaggeredGridLayoutManager.c c = j(view);
      c.e = null;
      if (c.c() || c.b())
        this.d -= this.f.u.c(view); 
      if (i == 1)
        this.b = Integer.MIN_VALUE; 
      this.c = Integer.MIN_VALUE;
    }
    
    public void m() {
      View view = this.a.remove(0);
      StaggeredGridLayoutManager.c c = j(view);
      c.e = null;
      if (this.a.size() == 0)
        this.c = Integer.MIN_VALUE; 
      if (c.c() || c.b())
        this.d -= this.f.u.c(view); 
      this.b = Integer.MIN_VALUE;
    }
    
    public void n(View param1View) {
      StaggeredGridLayoutManager.c c = j(param1View);
      c.e = this;
      this.a.add(0, param1View);
      this.b = Integer.MIN_VALUE;
      if (this.a.size() == 1)
        this.c = Integer.MIN_VALUE; 
      if (c.c() || c.b()) {
        int i = this.d;
        this.d = this.f.u.c(param1View) + i;
      } 
    }
  }
}


/* Location:              C:\Users\panch\Downloads\dvba_v1.1.0-dex2jar.jar!\androidx\recyclerview\widget\StaggeredGridLayoutManager.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */