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
import b.r.d.o;
import b.r.d.t;
import b.r.d.y;
import java.util.List;

public class LinearLayoutManager extends RecyclerView.o implements RecyclerView.z.b {
  public int A = -1;
  
  public int B = Integer.MIN_VALUE;
  
  public d C = null;
  
  public final a D = new a();
  
  public final b E = new b();
  
  public int F = 2;
  
  public int[] G = new int[2];
  
  public int s = 1;
  
  public c t;
  
  public t u;
  
  public boolean v;
  
  public boolean w = false;
  
  public boolean x = false;
  
  public boolean y = false;
  
  public boolean z = true;
  
  public LinearLayoutManager(int paramInt, boolean paramBoolean) {
    A1(paramInt);
    d(null);
    if (paramBoolean != this.w) {
      this.w = paramBoolean;
      I0();
    } 
  }
  
  public LinearLayoutManager(Context paramContext) {
    this(1, false);
  }
  
  public LinearLayoutManager(Context paramContext, AttributeSet paramAttributeSet, int paramInt1, int paramInt2) {
    RecyclerView.o.d d1 = RecyclerView.o.Q(paramContext, paramAttributeSet, paramInt1, paramInt2);
    A1(d1.a);
    boolean bool = d1.c;
    d(null);
    if (bool != this.w) {
      this.w = bool;
      I0();
    } 
    B1(d1.d);
  }
  
  public void A1(int paramInt) {
    if (paramInt == 0 || paramInt == 1) {
      d(null);
      if (paramInt != this.s || this.u == null) {
        t t1 = t.a(this, paramInt);
        this.u = t1;
        this.D.a = t1;
        this.s = paramInt;
        I0();
      } 
      return;
    } 
    StringBuilder stringBuilder = new StringBuilder();
    stringBuilder.append("invalid orientation:");
    stringBuilder.append(paramInt);
    throw new IllegalArgumentException(stringBuilder.toString());
  }
  
  public void B1(boolean paramBoolean) {
    d(null);
    if (this.y == paramBoolean)
      return; 
    this.y = paramBoolean;
    I0();
  }
  
  public final void C1(int paramInt1, int paramInt2, boolean paramBoolean, RecyclerView.a0 parama0) {
    this.t.m = x1();
    this.t.f = paramInt1;
    int[] arrayOfInt = this.G;
    boolean bool1 = false;
    arrayOfInt[0] = 0;
    boolean bool2 = true;
    boolean bool3 = true;
    arrayOfInt[1] = 0;
    X0(parama0, arrayOfInt);
    int j = Math.max(0, this.G[0]);
    int i = Math.max(0, this.G[1]);
    if (paramInt1 == 1)
      bool1 = true; 
    c c1 = this.t;
    if (bool1) {
      paramInt1 = i;
    } else {
      paramInt1 = j;
    } 
    c1.h = paramInt1;
    c1 = this.t;
    if (bool1)
      i = j; 
    c1.i = i;
    if (bool1) {
      c1 = this.t;
      paramInt1 = c1.h;
      c1.h = this.u.h() + paramInt1;
      View view = q1();
      c c2 = this.t;
      paramInt1 = bool3;
      if (this.x)
        paramInt1 = -1; 
      c2.e = paramInt1;
      c c3 = this.t;
      paramInt1 = P(view);
      c2 = this.t;
      c3.d = paramInt1 + c2.e;
      c2.b = this.u.b(view);
      paramInt1 = this.u.b(view) - this.u.g();
    } else {
      View view = r1();
      c c2 = this.t;
      paramInt1 = c2.h;
      c2.h = this.u.k() + paramInt1;
      c2 = this.t;
      if (this.x) {
        paramInt1 = bool2;
      } else {
        paramInt1 = -1;
      } 
      c2.e = paramInt1;
      c c3 = this.t;
      paramInt1 = P(view);
      c2 = this.t;
      c3.d = paramInt1 + c2.e;
      c2.b = this.u.e(view);
      paramInt1 = -this.u.e(view) + this.u.k();
    } 
    c1 = this.t;
    c1.c = paramInt2;
    if (paramBoolean)
      c1.c = paramInt2 - paramInt1; 
    this.t.g = paramInt1;
  }
  
  public final void D1(int paramInt1, int paramInt2) {
    boolean bool;
    this.t.c = this.u.g() - paramInt2;
    c c1 = this.t;
    if (this.x) {
      bool = true;
    } else {
      bool = true;
    } 
    c1.e = bool;
    c1 = this.t;
    c1.d = paramInt1;
    c1.f = 1;
    c1.b = paramInt2;
    c1.g = Integer.MIN_VALUE;
  }
  
  public final void E1(int paramInt1, int paramInt2) {
    this.t.c = paramInt2 - this.u.k();
    c c1 = this.t;
    c1.d = paramInt1;
    if (this.x) {
      paramInt1 = 1;
    } else {
      paramInt1 = -1;
    } 
    c1.e = paramInt1;
    c1 = this.t;
    c1.f = -1;
    c1.b = paramInt2;
    c1.g = Integer.MIN_VALUE;
  }
  
  public int J0(int paramInt, RecyclerView.v paramv, RecyclerView.a0 parama0) {
    return (this.s == 1) ? 0 : z1(paramInt, paramv, parama0);
  }
  
  public void K0(int paramInt) {
    this.A = paramInt;
    this.B = Integer.MIN_VALUE;
    d d1 = this.C;
    if (d1 != null)
      d1.b = -1; 
    I0();
  }
  
  public int L0(int paramInt, RecyclerView.v paramv, RecyclerView.a0 parama0) {
    return (this.s == 0) ? 0 : z1(paramInt, paramv, parama0);
  }
  
  public boolean S0() {
    int i = this.p;
    null = true;
    if (i != 1073741824 && this.o != 1073741824) {
      int j = y();
      i = 0;
      while (true) {
        if (i < j) {
          ViewGroup.LayoutParams layoutParams = x(i).getLayoutParams();
          if (layoutParams.width < 0 && layoutParams.height < 0) {
            i = 1;
            break;
          } 
          i++;
          continue;
        } 
        i = 0;
        break;
      } 
      if (i != 0)
        return null; 
    } 
    return false;
  }
  
  public boolean U() {
    return true;
  }
  
  public void U0(RecyclerView paramRecyclerView, RecyclerView.a0 parama0, int paramInt) {
    o o1 = new o(paramRecyclerView.getContext());
    ((RecyclerView.z)o1).a = paramInt;
    V0((RecyclerView.z)o1);
  }
  
  public boolean W0() {
    boolean bool;
    if (this.C == null && this.v == this.y) {
      bool = true;
    } else {
      bool = false;
    } 
    return bool;
  }
  
  public void X0(RecyclerView.a0 parama0, int[] paramArrayOfint) {
    int i;
    int j;
    boolean bool;
    if (parama0.a != -1) {
      i = 1;
    } else {
      i = 0;
    } 
    if (i) {
      i = this.u.l();
    } else {
      i = 0;
    } 
    if (this.t.f == -1) {
      j = 0;
      bool = i;
    } else {
      bool = false;
      j = i;
    } 
    paramArrayOfint[0] = bool;
    paramArrayOfint[1] = j;
  }
  
  public void Y0(RecyclerView.a0 parama0, c paramc, RecyclerView.o.c paramc1) {
    int i = paramc.d;
    if (i >= 0 && i < parama0.b()) {
      int j = Math.max(0, paramc.g);
      ((m.b)paramc1).a(i, j);
    } 
  }
  
  public final int Z0(RecyclerView.a0 parama0) {
    if (y() == 0)
      return 0; 
    d1();
    return a.a.a.a.a.l(parama0, this.u, h1(this.z ^ true, true), g1(this.z ^ true, true), this, this.z);
  }
  
  public PointF a(int paramInt) {
    if (y() == 0)
      return null; 
    boolean bool1 = false;
    int i = P(x(0));
    boolean bool = true;
    if (paramInt < i)
      bool1 = true; 
    paramInt = bool;
    if (bool1 != this.x)
      paramInt = -1; 
    return (this.s == 0) ? new PointF(paramInt, 0.0F) : new PointF(0.0F, paramInt);
  }
  
  public final int a1(RecyclerView.a0 parama0) {
    if (y() == 0)
      return 0; 
    d1();
    return a.a.a.a.a.m(parama0, this.u, h1(this.z ^ true, true), g1(this.z ^ true, true), this, this.z, this.x);
  }
  
  public final int b1(RecyclerView.a0 parama0) {
    if (y() == 0)
      return 0; 
    d1();
    return a.a.a.a.a.n(parama0, this.u, h1(this.z ^ true, true), g1(this.z ^ true, true), this, this.z);
  }
  
  public int c1(int paramInt) {
    int i = -1;
    boolean bool1 = true;
    boolean bool2 = true;
    if (paramInt != 1) {
      if (paramInt != 2) {
        if (paramInt != 17) {
          if (paramInt != 33) {
            if (paramInt != 66) {
              if (paramInt != 130)
                return Integer.MIN_VALUE; 
              if (this.s == 1) {
                paramInt = bool2;
              } else {
                paramInt = Integer.MIN_VALUE;
              } 
              return paramInt;
            } 
            if (this.s == 0) {
              paramInt = bool1;
            } else {
              paramInt = Integer.MIN_VALUE;
            } 
            return paramInt;
          } 
          if (this.s != 1)
            i = Integer.MIN_VALUE; 
          return i;
        } 
        if (this.s != 0)
          i = Integer.MIN_VALUE; 
        return i;
      } 
      return (this.s == 1) ? 1 : (s1() ? -1 : 1);
    } 
    return (this.s == 1) ? -1 : (s1() ? 1 : -1);
  }
  
  public void d(String paramString) {
    if (this.C == null) {
      RecyclerView recyclerView = this.b;
      if (recyclerView != null)
        recyclerView.assertNotInLayoutOrScroll(paramString); 
    } 
  }
  
  public void d1() {
    if (this.t == null)
      this.t = new c(); 
  }
  
  public boolean e() {
    boolean bool;
    if (this.s == 0) {
      bool = true;
    } else {
      bool = false;
    } 
    return bool;
  }
  
  public int e1(RecyclerView.v paramv, c paramc, RecyclerView.a0 parama0, boolean paramBoolean) {
    int j = paramc.c;
    int i = paramc.g;
    if (i != Integer.MIN_VALUE) {
      if (j < 0)
        paramc.g = i + j; 
      v1(paramv, paramc);
    } 
    i = paramc.c + paramc.h;
    b b1 = this.E;
    while (true) {
      while (true)
        break; 
      if (paramBoolean) {
        Object object = SYNTHETIC_LOCAL_VARIABLE_6;
        if (b1.d)
          break; 
      } 
    } 
    return j - paramc.c;
  }
  
  public boolean f() {
    int i = this.s;
    boolean bool = true;
    if (i != 1)
      bool = false; 
    return bool;
  }
  
  public void f0(RecyclerView paramRecyclerView, RecyclerView.v paramv) {
    e0();
  }
  
  public final View f1(RecyclerView.v paramv, RecyclerView.a0 parama0) {
    return n1(paramv, parama0, 0, y(), parama0.b());
  }
  
  public View g0(View paramView, int paramInt, RecyclerView.v paramv, RecyclerView.a0 parama0) {
    View view1;
    View view2;
    y1();
    if (y() == 0)
      return null; 
    paramInt = c1(paramInt);
    if (paramInt == Integer.MIN_VALUE)
      return null; 
    d1();
    C1(paramInt, (int)(this.u.l() * 0.33333334F), false, parama0);
    c c1 = this.t;
    c1.g = Integer.MIN_VALUE;
    c1.a = false;
    e1(paramv, c1, parama0, true);
    if (paramInt == -1) {
      if (this.x) {
        view1 = l1(y() - 1, -1);
      } else {
        view1 = l1(0, y());
      } 
    } else if (this.x) {
      view1 = l1(0, y());
    } else {
      view1 = l1(y() - 1, -1);
    } 
    if (paramInt == -1) {
      view2 = r1();
    } else {
      view2 = q1();
    } 
    return view2.hasFocusable() ? ((view1 == null) ? null : view2) : view1;
  }
  
  public View g1(boolean paramBoolean1, boolean paramBoolean2) {
    if (this.x) {
      boolean bool = false;
      int j = y();
      return m1(bool, j, paramBoolean1, paramBoolean2);
    } 
    int i = y() - 1;
    byte b1 = -1;
    return m1(i, b1, paramBoolean1, paramBoolean2);
  }
  
  public void h0(AccessibilityEvent paramAccessibilityEvent) {
    RecyclerView.v v = this.b.mRecycler;
    i0(paramAccessibilityEvent);
    if (y() > 0) {
      paramAccessibilityEvent.setFromIndex(i1());
      paramAccessibilityEvent.setToIndex(k1());
    } 
  }
  
  public View h1(boolean paramBoolean1, boolean paramBoolean2) {
    if (this.x) {
      int j = y() - 1;
      byte b1 = -1;
      return m1(j, b1, paramBoolean1, paramBoolean2);
    } 
    boolean bool = false;
    int i = y();
    return m1(bool, i, paramBoolean1, paramBoolean2);
  }
  
  public void i(int paramInt1, int paramInt2, RecyclerView.a0 parama0, RecyclerView.o.c paramc) {
    if (this.s != 0)
      paramInt1 = paramInt2; 
    if (y() != 0 && paramInt1 != 0) {
      d1();
      if (paramInt1 > 0) {
        paramInt2 = 1;
      } else {
        paramInt2 = -1;
      } 
      C1(paramInt2, Math.abs(paramInt1), true, parama0);
      Y0(parama0, this.t, paramc);
    } 
  }
  
  public int i1() {
    int i;
    View view = m1(0, y(), false, true);
    if (view == null) {
      i = -1;
    } else {
      i = P(view);
    } 
    return i;
  }
  
  public void j(int paramInt, RecyclerView.o.c paramc) {
    int i;
    boolean bool;
    d d1 = this.C;
    byte b1 = -1;
    if (d1 != null && d1.c()) {
      d1 = this.C;
      bool = d1.d;
      i = d1.b;
    } else {
      y1();
      boolean bool1 = this.x;
      int j = this.A;
      i = j;
      bool = bool1;
      if (j == -1)
        if (bool1) {
          i = paramInt - 1;
          bool = bool1;
        } else {
          i = 0;
          bool = bool1;
        }  
    } 
    if (!bool)
      b1 = 1; 
    for (byte b2 = 0; b2 < this.F && i >= 0 && i < paramInt; b2++) {
      ((m.b)paramc).a(i, 0);
      i += b1;
    } 
  }
  
  public final View j1(RecyclerView.v paramv, RecyclerView.a0 parama0) {
    return n1(paramv, parama0, y() - 1, -1, parama0.b());
  }
  
  public int k(RecyclerView.a0 parama0) {
    return Z0(parama0);
  }
  
  public int k1() {
    int j = y();
    int i = -1;
    View view = m1(j - 1, -1, false, true);
    if (view != null)
      i = P(view); 
    return i;
  }
  
  public int l(RecyclerView.a0 parama0) {
    return a1(parama0);
  }
  
  public View l1(int paramInt1, int paramInt2) {
    char c1;
    char c2;
    y y;
    d1();
    if (paramInt2 > paramInt1) {
      c1 = '\001';
    } else if (paramInt2 < paramInt1) {
      c1 = '￿';
    } else {
      c1 = Character.MIN_VALUE;
    } 
    if (!c1)
      return x(paramInt1); 
    if (this.u.e(x(paramInt1)) < this.u.k()) {
      c2 = '䄄';
      c1 = '䀄';
    } else {
      c2 = '၁';
      c1 = 'ခ';
    } 
    if (this.s == 0) {
      y = this.e;
    } else {
      y = this.f;
    } 
    return y.a(paramInt1, paramInt2, c2, c1);
  }
  
  public int m(RecyclerView.a0 parama0) {
    return b1(parama0);
  }
  
  public View m1(int paramInt1, int paramInt2, boolean paramBoolean1, boolean paramBoolean2) {
    char c1;
    y y;
    d1();
    char c2 = 'ŀ';
    if (paramBoolean1) {
      c1 = '怃';
    } else {
      c1 = 'ŀ';
    } 
    if (!paramBoolean2)
      c2 = Character.MIN_VALUE; 
    if (this.s == 0) {
      y = this.e;
    } else {
      y = this.f;
    } 
    return y.a(paramInt1, paramInt2, c1, c2);
  }
  
  public int n(RecyclerView.a0 parama0) {
    return Z0(parama0);
  }
  
  public View n1(RecyclerView.v paramv, RecyclerView.a0 parama0, int paramInt1, int paramInt2, int paramInt3) {
    View view;
    RecyclerView.v v1;
    byte b1;
    d1();
    int j = this.u.k();
    int i = this.u.g();
    if (paramInt2 > paramInt1) {
      b1 = 1;
    } else {
      b1 = -1;
    } 
    parama0 = null;
    for (paramv = null; paramInt1 != paramInt2; paramv = v2) {
      View view1;
      View view2 = x(paramInt1);
      int k = P(view2);
      RecyclerView.a0 a01 = parama0;
      RecyclerView.v v2 = paramv;
      if (k >= 0) {
        a01 = parama0;
        v2 = paramv;
        if (k < paramInt3)
          if (((RecyclerView.p)view2.getLayoutParams()).c()) {
            a01 = parama0;
            v2 = paramv;
            if (paramv == null) {
              View view3 = view2;
              a01 = parama0;
            } 
          } else if (this.u.e(view2) >= i || this.u.b(view2) < j) {
            a01 = parama0;
            v2 = paramv;
            if (parama0 == null) {
              view1 = view2;
              v2 = paramv;
            } 
          } else {
            return view2;
          }  
      } 
      paramInt1 += b1;
      view = view1;
    } 
    if (view == null)
      v1 = paramv; 
    return (View)v1;
  }
  
  public int o(RecyclerView.a0 parama0) {
    return a1(parama0);
  }
  
  public final int o1(int paramInt, RecyclerView.v paramv, RecyclerView.a0 parama0, boolean paramBoolean) {
    int i = this.u.g() - paramInt;
    if (i > 0) {
      i = -z1(-i, paramv, parama0);
      if (paramBoolean) {
        paramInt = this.u.g() - paramInt + i;
        if (paramInt > 0) {
          this.u.p(paramInt);
          return paramInt + i;
        } 
      } 
      return i;
    } 
    return 0;
  }
  
  public int p(RecyclerView.a0 parama0) {
    return b1(parama0);
  }
  
  public final int p1(int paramInt, RecyclerView.v paramv, RecyclerView.a0 parama0, boolean paramBoolean) {
    int i = paramInt - this.u.k();
    if (i > 0) {
      int j = -z1(i, paramv, parama0);
      i = j;
      if (paramBoolean) {
        paramInt = paramInt + j - this.u.k();
        i = j;
        if (paramInt > 0) {
          this.u.p(-paramInt);
          i = j - paramInt;
        } 
      } 
      return i;
    } 
    return 0;
  }
  
  public final View q1() {
    int i;
    if (this.x) {
      i = 0;
    } else {
      i = y() - 1;
    } 
    return x(i);
  }
  
  public final View r1() {
    boolean bool;
    if (this.x) {
      bool = y() - 1;
    } else {
      bool = false;
    } 
    return x(bool);
  }
  
  public void s0(RecyclerView.v paramv, RecyclerView.a0 parama0) {
    // Byte code:
    //   0: aload_0
    //   1: getfield C : Landroidx/recyclerview/widget/LinearLayoutManager$d;
    //   4: ifnonnull -> 15
    //   7: aload_0
    //   8: getfield A : I
    //   11: iconst_m1
    //   12: if_icmpeq -> 28
    //   15: aload_2
    //   16: invokevirtual b : ()I
    //   19: ifne -> 28
    //   22: aload_0
    //   23: aload_1
    //   24: invokevirtual C0 : (Landroidx/recyclerview/widget/RecyclerView$v;)V
    //   27: return
    //   28: aload_0
    //   29: getfield C : Landroidx/recyclerview/widget/LinearLayoutManager$d;
    //   32: astore #13
    //   34: aload #13
    //   36: ifnull -> 58
    //   39: aload #13
    //   41: invokevirtual c : ()Z
    //   44: ifeq -> 58
    //   47: aload_0
    //   48: aload_0
    //   49: getfield C : Landroidx/recyclerview/widget/LinearLayoutManager$d;
    //   52: getfield b : I
    //   55: putfield A : I
    //   58: aload_0
    //   59: invokevirtual d1 : ()V
    //   62: aload_0
    //   63: getfield t : Landroidx/recyclerview/widget/LinearLayoutManager$c;
    //   66: iconst_0
    //   67: putfield a : Z
    //   70: aload_0
    //   71: invokevirtual y1 : ()V
    //   74: aload_0
    //   75: invokevirtual H : ()Landroid/view/View;
    //   78: astore #13
    //   80: aload_0
    //   81: getfield D : Landroidx/recyclerview/widget/LinearLayoutManager$a;
    //   84: getfield e : Z
    //   87: ifeq -> 169
    //   90: aload_0
    //   91: getfield A : I
    //   94: iconst_m1
    //   95: if_icmpne -> 169
    //   98: aload_0
    //   99: getfield C : Landroidx/recyclerview/widget/LinearLayoutManager$d;
    //   102: ifnull -> 108
    //   105: goto -> 169
    //   108: aload #13
    //   110: ifnull -> 987
    //   113: aload_0
    //   114: getfield u : Lb/r/d/t;
    //   117: aload #13
    //   119: invokevirtual e : (Landroid/view/View;)I
    //   122: aload_0
    //   123: getfield u : Lb/r/d/t;
    //   126: invokevirtual g : ()I
    //   129: if_icmpge -> 151
    //   132: aload_0
    //   133: getfield u : Lb/r/d/t;
    //   136: aload #13
    //   138: invokevirtual b : (Landroid/view/View;)I
    //   141: aload_0
    //   142: getfield u : Lb/r/d/t;
    //   145: invokevirtual k : ()I
    //   148: if_icmpgt -> 987
    //   151: aload_0
    //   152: getfield D : Landroidx/recyclerview/widget/LinearLayoutManager$a;
    //   155: aload #13
    //   157: aload_0
    //   158: aload #13
    //   160: invokevirtual P : (Landroid/view/View;)I
    //   163: invokevirtual c : (Landroid/view/View;I)V
    //   166: goto -> 987
    //   169: aload_0
    //   170: getfield D : Landroidx/recyclerview/widget/LinearLayoutManager$a;
    //   173: invokevirtual d : ()V
    //   176: aload_0
    //   177: getfield D : Landroidx/recyclerview/widget/LinearLayoutManager$a;
    //   180: astore #14
    //   182: aload #14
    //   184: aload_0
    //   185: getfield x : Z
    //   188: aload_0
    //   189: getfield y : Z
    //   192: ixor
    //   193: putfield d : Z
    //   196: aload_2
    //   197: getfield g : Z
    //   200: ifne -> 646
    //   203: aload_0
    //   204: getfield A : I
    //   207: istore_3
    //   208: iload_3
    //   209: iconst_m1
    //   210: if_icmpne -> 216
    //   213: goto -> 646
    //   216: iload_3
    //   217: iflt -> 635
    //   220: iload_3
    //   221: aload_2
    //   222: invokevirtual b : ()I
    //   225: if_icmplt -> 231
    //   228: goto -> 635
    //   231: aload #14
    //   233: aload_0
    //   234: getfield A : I
    //   237: putfield b : I
    //   240: aload_0
    //   241: getfield C : Landroidx/recyclerview/widget/LinearLayoutManager$d;
    //   244: astore #13
    //   246: aload #13
    //   248: ifnull -> 320
    //   251: aload #13
    //   253: invokevirtual c : ()Z
    //   256: ifeq -> 320
    //   259: aload_0
    //   260: getfield C : Landroidx/recyclerview/widget/LinearLayoutManager$d;
    //   263: getfield d : Z
    //   266: istore #12
    //   268: aload #14
    //   270: iload #12
    //   272: putfield d : Z
    //   275: iload #12
    //   277: ifeq -> 300
    //   280: aload_0
    //   281: getfield u : Lb/r/d/t;
    //   284: invokevirtual g : ()I
    //   287: istore_3
    //   288: aload_0
    //   289: getfield C : Landroidx/recyclerview/widget/LinearLayoutManager$d;
    //   292: getfield c : I
    //   295: istore #4
    //   297: goto -> 597
    //   300: aload_0
    //   301: getfield u : Lb/r/d/t;
    //   304: invokevirtual k : ()I
    //   307: istore_3
    //   308: aload_0
    //   309: getfield C : Landroidx/recyclerview/widget/LinearLayoutManager$d;
    //   312: getfield c : I
    //   315: istore #4
    //   317: goto -> 619
    //   320: aload_0
    //   321: getfield B : I
    //   324: ldc -2147483648
    //   326: if_icmpne -> 565
    //   329: aload_0
    //   330: aload_0
    //   331: getfield A : I
    //   334: invokevirtual t : (I)Landroid/view/View;
    //   337: astore #13
    //   339: aload #13
    //   341: ifnull -> 498
    //   344: aload_0
    //   345: getfield u : Lb/r/d/t;
    //   348: aload #13
    //   350: invokevirtual c : (Landroid/view/View;)I
    //   353: aload_0
    //   354: getfield u : Lb/r/d/t;
    //   357: invokevirtual l : ()I
    //   360: if_icmple -> 366
    //   363: goto -> 557
    //   366: aload_0
    //   367: getfield u : Lb/r/d/t;
    //   370: aload #13
    //   372: invokevirtual e : (Landroid/view/View;)I
    //   375: aload_0
    //   376: getfield u : Lb/r/d/t;
    //   379: invokevirtual k : ()I
    //   382: isub
    //   383: ifge -> 407
    //   386: aload #14
    //   388: aload_0
    //   389: getfield u : Lb/r/d/t;
    //   392: invokevirtual k : ()I
    //   395: putfield c : I
    //   398: aload #14
    //   400: iconst_0
    //   401: putfield d : Z
    //   404: goto -> 630
    //   407: aload_0
    //   408: getfield u : Lb/r/d/t;
    //   411: invokevirtual g : ()I
    //   414: aload_0
    //   415: getfield u : Lb/r/d/t;
    //   418: aload #13
    //   420: invokevirtual b : (Landroid/view/View;)I
    //   423: isub
    //   424: ifge -> 448
    //   427: aload #14
    //   429: aload_0
    //   430: getfield u : Lb/r/d/t;
    //   433: invokevirtual g : ()I
    //   436: putfield c : I
    //   439: aload #14
    //   441: iconst_1
    //   442: putfield d : Z
    //   445: goto -> 630
    //   448: aload #14
    //   450: getfield d : Z
    //   453: ifeq -> 479
    //   456: aload_0
    //   457: getfield u : Lb/r/d/t;
    //   460: aload #13
    //   462: invokevirtual b : (Landroid/view/View;)I
    //   465: istore_3
    //   466: aload_0
    //   467: getfield u : Lb/r/d/t;
    //   470: invokevirtual m : ()I
    //   473: iload_3
    //   474: iadd
    //   475: istore_3
    //   476: goto -> 489
    //   479: aload_0
    //   480: getfield u : Lb/r/d/t;
    //   483: aload #13
    //   485: invokevirtual e : (Landroid/view/View;)I
    //   488: istore_3
    //   489: aload #14
    //   491: iload_3
    //   492: putfield c : I
    //   495: goto -> 630
    //   498: aload_0
    //   499: invokevirtual y : ()I
    //   502: ifle -> 557
    //   505: aload_0
    //   506: aload_0
    //   507: iconst_0
    //   508: invokevirtual x : (I)Landroid/view/View;
    //   511: invokevirtual P : (Landroid/view/View;)I
    //   514: istore_3
    //   515: aload_0
    //   516: getfield A : I
    //   519: iload_3
    //   520: if_icmpge -> 529
    //   523: iconst_1
    //   524: istore #12
    //   526: goto -> 532
    //   529: iconst_0
    //   530: istore #12
    //   532: iload #12
    //   534: aload_0
    //   535: getfield x : Z
    //   538: if_icmpne -> 547
    //   541: iconst_1
    //   542: istore #12
    //   544: goto -> 550
    //   547: iconst_0
    //   548: istore #12
    //   550: aload #14
    //   552: iload #12
    //   554: putfield d : Z
    //   557: aload #14
    //   559: invokevirtual a : ()V
    //   562: goto -> 630
    //   565: aload_0
    //   566: getfield x : Z
    //   569: istore #12
    //   571: aload #14
    //   573: iload #12
    //   575: putfield d : Z
    //   578: iload #12
    //   580: ifeq -> 605
    //   583: aload_0
    //   584: getfield u : Lb/r/d/t;
    //   587: invokevirtual g : ()I
    //   590: istore_3
    //   591: aload_0
    //   592: getfield B : I
    //   595: istore #4
    //   597: iload_3
    //   598: iload #4
    //   600: isub
    //   601: istore_3
    //   602: goto -> 624
    //   605: aload_0
    //   606: getfield u : Lb/r/d/t;
    //   609: invokevirtual k : ()I
    //   612: istore_3
    //   613: aload_0
    //   614: getfield B : I
    //   617: istore #4
    //   619: iload_3
    //   620: iload #4
    //   622: iadd
    //   623: istore_3
    //   624: aload #14
    //   626: iload_3
    //   627: putfield c : I
    //   630: iconst_1
    //   631: istore_3
    //   632: goto -> 648
    //   635: aload_0
    //   636: iconst_m1
    //   637: putfield A : I
    //   640: aload_0
    //   641: ldc -2147483648
    //   643: putfield B : I
    //   646: iconst_0
    //   647: istore_3
    //   648: iload_3
    //   649: ifeq -> 655
    //   652: goto -> 979
    //   655: aload_0
    //   656: invokevirtual y : ()I
    //   659: ifne -> 665
    //   662: goto -> 940
    //   665: aload_0
    //   666: invokevirtual H : ()Landroid/view/View;
    //   669: astore #13
    //   671: aload #13
    //   673: ifnull -> 741
    //   676: aload #13
    //   678: invokevirtual getLayoutParams : ()Landroid/view/ViewGroup$LayoutParams;
    //   681: checkcast androidx/recyclerview/widget/RecyclerView$p
    //   684: astore #15
    //   686: aload #15
    //   688: invokevirtual c : ()Z
    //   691: ifne -> 719
    //   694: aload #15
    //   696: invokevirtual a : ()I
    //   699: iflt -> 719
    //   702: aload #15
    //   704: invokevirtual a : ()I
    //   707: aload_2
    //   708: invokevirtual b : ()I
    //   711: if_icmpge -> 719
    //   714: iconst_1
    //   715: istore_3
    //   716: goto -> 721
    //   719: iconst_0
    //   720: istore_3
    //   721: iload_3
    //   722: ifeq -> 741
    //   725: aload #14
    //   727: aload #13
    //   729: aload_0
    //   730: aload #13
    //   732: invokevirtual P : (Landroid/view/View;)I
    //   735: invokevirtual c : (Landroid/view/View;I)V
    //   738: goto -> 935
    //   741: aload_0
    //   742: getfield v : Z
    //   745: aload_0
    //   746: getfield y : Z
    //   749: if_icmpeq -> 755
    //   752: goto -> 940
    //   755: aload #14
    //   757: getfield d : Z
    //   760: ifeq -> 792
    //   763: aload_0
    //   764: getfield x : Z
    //   767: ifeq -> 781
    //   770: aload_0
    //   771: aload_1
    //   772: aload_2
    //   773: invokevirtual f1 : (Landroidx/recyclerview/widget/RecyclerView$v;Landroidx/recyclerview/widget/RecyclerView$a0;)Landroid/view/View;
    //   776: astore #13
    //   778: goto -> 818
    //   781: aload_0
    //   782: aload_1
    //   783: aload_2
    //   784: invokevirtual j1 : (Landroidx/recyclerview/widget/RecyclerView$v;Landroidx/recyclerview/widget/RecyclerView$a0;)Landroid/view/View;
    //   787: astore #13
    //   789: goto -> 818
    //   792: aload_0
    //   793: getfield x : Z
    //   796: ifeq -> 810
    //   799: aload_0
    //   800: aload_1
    //   801: aload_2
    //   802: invokevirtual j1 : (Landroidx/recyclerview/widget/RecyclerView$v;Landroidx/recyclerview/widget/RecyclerView$a0;)Landroid/view/View;
    //   805: astore #13
    //   807: goto -> 818
    //   810: aload_0
    //   811: aload_1
    //   812: aload_2
    //   813: invokevirtual f1 : (Landroidx/recyclerview/widget/RecyclerView$v;Landroidx/recyclerview/widget/RecyclerView$a0;)Landroid/view/View;
    //   816: astore #13
    //   818: aload #13
    //   820: ifnull -> 940
    //   823: aload #14
    //   825: aload #13
    //   827: aload_0
    //   828: aload #13
    //   830: invokevirtual P : (Landroid/view/View;)I
    //   833: invokevirtual b : (Landroid/view/View;I)V
    //   836: aload_2
    //   837: getfield g : Z
    //   840: ifne -> 935
    //   843: aload_0
    //   844: invokevirtual W0 : ()Z
    //   847: ifeq -> 935
    //   850: aload_0
    //   851: getfield u : Lb/r/d/t;
    //   854: aload #13
    //   856: invokevirtual e : (Landroid/view/View;)I
    //   859: aload_0
    //   860: getfield u : Lb/r/d/t;
    //   863: invokevirtual g : ()I
    //   866: if_icmpge -> 896
    //   869: aload_0
    //   870: getfield u : Lb/r/d/t;
    //   873: aload #13
    //   875: invokevirtual b : (Landroid/view/View;)I
    //   878: aload_0
    //   879: getfield u : Lb/r/d/t;
    //   882: invokevirtual k : ()I
    //   885: if_icmpge -> 891
    //   888: goto -> 896
    //   891: iconst_0
    //   892: istore_3
    //   893: goto -> 898
    //   896: iconst_1
    //   897: istore_3
    //   898: iload_3
    //   899: ifeq -> 935
    //   902: aload #14
    //   904: getfield d : Z
    //   907: ifeq -> 921
    //   910: aload_0
    //   911: getfield u : Lb/r/d/t;
    //   914: invokevirtual g : ()I
    //   917: istore_3
    //   918: goto -> 929
    //   921: aload_0
    //   922: getfield u : Lb/r/d/t;
    //   925: invokevirtual k : ()I
    //   928: istore_3
    //   929: aload #14
    //   931: iload_3
    //   932: putfield c : I
    //   935: iconst_1
    //   936: istore_3
    //   937: goto -> 942
    //   940: iconst_0
    //   941: istore_3
    //   942: iload_3
    //   943: ifeq -> 949
    //   946: goto -> 979
    //   949: aload #14
    //   951: invokevirtual a : ()V
    //   954: aload_0
    //   955: getfield y : Z
    //   958: ifeq -> 971
    //   961: aload_2
    //   962: invokevirtual b : ()I
    //   965: iconst_1
    //   966: isub
    //   967: istore_3
    //   968: goto -> 973
    //   971: iconst_0
    //   972: istore_3
    //   973: aload #14
    //   975: iload_3
    //   976: putfield b : I
    //   979: aload_0
    //   980: getfield D : Landroidx/recyclerview/widget/LinearLayoutManager$a;
    //   983: iconst_1
    //   984: putfield e : Z
    //   987: aload_0
    //   988: getfield t : Landroidx/recyclerview/widget/LinearLayoutManager$c;
    //   991: astore #13
    //   993: aload #13
    //   995: getfield k : I
    //   998: iflt -> 1006
    //   1001: iconst_1
    //   1002: istore_3
    //   1003: goto -> 1008
    //   1006: iconst_m1
    //   1007: istore_3
    //   1008: aload #13
    //   1010: iload_3
    //   1011: putfield f : I
    //   1014: aload_0
    //   1015: getfield G : [I
    //   1018: astore #13
    //   1020: aload #13
    //   1022: iconst_0
    //   1023: iconst_0
    //   1024: iastore
    //   1025: aload #13
    //   1027: iconst_1
    //   1028: iconst_0
    //   1029: iastore
    //   1030: aload_0
    //   1031: aload_2
    //   1032: aload #13
    //   1034: invokevirtual X0 : (Landroidx/recyclerview/widget/RecyclerView$a0;[I)V
    //   1037: iconst_0
    //   1038: aload_0
    //   1039: getfield G : [I
    //   1042: iconst_0
    //   1043: iaload
    //   1044: invokestatic max : (II)I
    //   1047: istore_3
    //   1048: aload_0
    //   1049: getfield u : Lb/r/d/t;
    //   1052: invokevirtual k : ()I
    //   1055: iload_3
    //   1056: iadd
    //   1057: istore #5
    //   1059: iconst_0
    //   1060: aload_0
    //   1061: getfield G : [I
    //   1064: iconst_1
    //   1065: iaload
    //   1066: invokestatic max : (II)I
    //   1069: istore_3
    //   1070: aload_0
    //   1071: getfield u : Lb/r/d/t;
    //   1074: invokevirtual h : ()I
    //   1077: iload_3
    //   1078: iadd
    //   1079: istore #6
    //   1081: iload #5
    //   1083: istore_3
    //   1084: iload #6
    //   1086: istore #4
    //   1088: aload_2
    //   1089: getfield g : Z
    //   1092: ifeq -> 1238
    //   1095: aload_0
    //   1096: getfield A : I
    //   1099: istore #7
    //   1101: iload #5
    //   1103: istore_3
    //   1104: iload #6
    //   1106: istore #4
    //   1108: iload #7
    //   1110: iconst_m1
    //   1111: if_icmpeq -> 1238
    //   1114: iload #5
    //   1116: istore_3
    //   1117: iload #6
    //   1119: istore #4
    //   1121: aload_0
    //   1122: getfield B : I
    //   1125: ldc -2147483648
    //   1127: if_icmpeq -> 1238
    //   1130: aload_0
    //   1131: iload #7
    //   1133: invokevirtual t : (I)Landroid/view/View;
    //   1136: astore #13
    //   1138: iload #5
    //   1140: istore_3
    //   1141: iload #6
    //   1143: istore #4
    //   1145: aload #13
    //   1147: ifnull -> 1238
    //   1150: aload_0
    //   1151: getfield x : Z
    //   1154: ifeq -> 1184
    //   1157: aload_0
    //   1158: getfield u : Lb/r/d/t;
    //   1161: invokevirtual g : ()I
    //   1164: aload_0
    //   1165: getfield u : Lb/r/d/t;
    //   1168: aload #13
    //   1170: invokevirtual b : (Landroid/view/View;)I
    //   1173: isub
    //   1174: istore_3
    //   1175: aload_0
    //   1176: getfield B : I
    //   1179: istore #4
    //   1181: goto -> 1208
    //   1184: aload_0
    //   1185: getfield u : Lb/r/d/t;
    //   1188: aload #13
    //   1190: invokevirtual e : (Landroid/view/View;)I
    //   1193: aload_0
    //   1194: getfield u : Lb/r/d/t;
    //   1197: invokevirtual k : ()I
    //   1200: isub
    //   1201: istore #4
    //   1203: aload_0
    //   1204: getfield B : I
    //   1207: istore_3
    //   1208: iload_3
    //   1209: iload #4
    //   1211: isub
    //   1212: istore_3
    //   1213: iload_3
    //   1214: ifle -> 1229
    //   1217: iload #5
    //   1219: iload_3
    //   1220: iadd
    //   1221: istore_3
    //   1222: iload #6
    //   1224: istore #4
    //   1226: goto -> 1238
    //   1229: iload #6
    //   1231: iload_3
    //   1232: isub
    //   1233: istore #4
    //   1235: iload #5
    //   1237: istore_3
    //   1238: aload_0
    //   1239: getfield D : Landroidx/recyclerview/widget/LinearLayoutManager$a;
    //   1242: getfield d : Z
    //   1245: ifeq -> 1258
    //   1248: aload_0
    //   1249: getfield x : Z
    //   1252: ifeq -> 1265
    //   1255: goto -> 1271
    //   1258: aload_0
    //   1259: getfield x : Z
    //   1262: ifeq -> 1271
    //   1265: iconst_m1
    //   1266: istore #5
    //   1268: goto -> 1274
    //   1271: iconst_1
    //   1272: istore #5
    //   1274: aload_0
    //   1275: aload_1
    //   1276: aload_2
    //   1277: aload_0
    //   1278: getfield D : Landroidx/recyclerview/widget/LinearLayoutManager$a;
    //   1281: iload #5
    //   1283: invokevirtual u1 : (Landroidx/recyclerview/widget/RecyclerView$v;Landroidx/recyclerview/widget/RecyclerView$a0;Landroidx/recyclerview/widget/LinearLayoutManager$a;I)V
    //   1286: aload_0
    //   1287: aload_1
    //   1288: invokevirtual q : (Landroidx/recyclerview/widget/RecyclerView$v;)V
    //   1291: aload_0
    //   1292: getfield t : Landroidx/recyclerview/widget/LinearLayoutManager$c;
    //   1295: aload_0
    //   1296: invokevirtual x1 : ()Z
    //   1299: putfield m : Z
    //   1302: aload_0
    //   1303: getfield t : Landroidx/recyclerview/widget/LinearLayoutManager$c;
    //   1306: astore #13
    //   1308: aload #13
    //   1310: aload_2
    //   1311: getfield g : Z
    //   1314: putfield j : Z
    //   1317: aload #13
    //   1319: iconst_0
    //   1320: putfield i : I
    //   1323: aload_0
    //   1324: getfield D : Landroidx/recyclerview/widget/LinearLayoutManager$a;
    //   1327: astore #13
    //   1329: aload #13
    //   1331: getfield d : Z
    //   1334: ifeq -> 1550
    //   1337: aload_0
    //   1338: aload #13
    //   1340: getfield b : I
    //   1343: aload #13
    //   1345: getfield c : I
    //   1348: invokevirtual E1 : (II)V
    //   1351: aload_0
    //   1352: getfield t : Landroidx/recyclerview/widget/LinearLayoutManager$c;
    //   1355: astore #13
    //   1357: aload #13
    //   1359: iload_3
    //   1360: putfield h : I
    //   1363: aload_0
    //   1364: aload_1
    //   1365: aload #13
    //   1367: aload_2
    //   1368: iconst_0
    //   1369: invokevirtual e1 : (Landroidx/recyclerview/widget/RecyclerView$v;Landroidx/recyclerview/widget/LinearLayoutManager$c;Landroidx/recyclerview/widget/RecyclerView$a0;Z)I
    //   1372: pop
    //   1373: aload_0
    //   1374: getfield t : Landroidx/recyclerview/widget/LinearLayoutManager$c;
    //   1377: astore #13
    //   1379: aload #13
    //   1381: getfield b : I
    //   1384: istore #5
    //   1386: aload #13
    //   1388: getfield d : I
    //   1391: istore #7
    //   1393: aload #13
    //   1395: getfield c : I
    //   1398: istore #6
    //   1400: iload #4
    //   1402: istore_3
    //   1403: iload #6
    //   1405: ifle -> 1414
    //   1408: iload #4
    //   1410: iload #6
    //   1412: iadd
    //   1413: istore_3
    //   1414: aload_0
    //   1415: getfield D : Landroidx/recyclerview/widget/LinearLayoutManager$a;
    //   1418: astore #13
    //   1420: aload_0
    //   1421: aload #13
    //   1423: getfield b : I
    //   1426: aload #13
    //   1428: getfield c : I
    //   1431: invokevirtual D1 : (II)V
    //   1434: aload_0
    //   1435: getfield t : Landroidx/recyclerview/widget/LinearLayoutManager$c;
    //   1438: astore #13
    //   1440: aload #13
    //   1442: iload_3
    //   1443: putfield h : I
    //   1446: aload #13
    //   1448: aload #13
    //   1450: getfield d : I
    //   1453: aload #13
    //   1455: getfield e : I
    //   1458: iadd
    //   1459: putfield d : I
    //   1462: aload_0
    //   1463: aload_1
    //   1464: aload #13
    //   1466: aload_2
    //   1467: iconst_0
    //   1468: invokevirtual e1 : (Landroidx/recyclerview/widget/RecyclerView$v;Landroidx/recyclerview/widget/LinearLayoutManager$c;Landroidx/recyclerview/widget/RecyclerView$a0;Z)I
    //   1471: pop
    //   1472: aload_0
    //   1473: getfield t : Landroidx/recyclerview/widget/LinearLayoutManager$c;
    //   1476: astore #13
    //   1478: aload #13
    //   1480: getfield b : I
    //   1483: istore #6
    //   1485: aload #13
    //   1487: getfield c : I
    //   1490: istore #8
    //   1492: iload #5
    //   1494: istore #4
    //   1496: iload #6
    //   1498: istore_3
    //   1499: iload #8
    //   1501: ifle -> 1762
    //   1504: aload_0
    //   1505: iload #7
    //   1507: iload #5
    //   1509: invokevirtual E1 : (II)V
    //   1512: aload_0
    //   1513: getfield t : Landroidx/recyclerview/widget/LinearLayoutManager$c;
    //   1516: astore #13
    //   1518: aload #13
    //   1520: iload #8
    //   1522: putfield h : I
    //   1525: aload_0
    //   1526: aload_1
    //   1527: aload #13
    //   1529: aload_2
    //   1530: iconst_0
    //   1531: invokevirtual e1 : (Landroidx/recyclerview/widget/RecyclerView$v;Landroidx/recyclerview/widget/LinearLayoutManager$c;Landroidx/recyclerview/widget/RecyclerView$a0;Z)I
    //   1534: pop
    //   1535: aload_0
    //   1536: getfield t : Landroidx/recyclerview/widget/LinearLayoutManager$c;
    //   1539: getfield b : I
    //   1542: istore #4
    //   1544: iload #6
    //   1546: istore_3
    //   1547: goto -> 1762
    //   1550: aload_0
    //   1551: aload #13
    //   1553: getfield b : I
    //   1556: aload #13
    //   1558: getfield c : I
    //   1561: invokevirtual D1 : (II)V
    //   1564: aload_0
    //   1565: getfield t : Landroidx/recyclerview/widget/LinearLayoutManager$c;
    //   1568: astore #13
    //   1570: aload #13
    //   1572: iload #4
    //   1574: putfield h : I
    //   1577: aload_0
    //   1578: aload_1
    //   1579: aload #13
    //   1581: aload_2
    //   1582: iconst_0
    //   1583: invokevirtual e1 : (Landroidx/recyclerview/widget/RecyclerView$v;Landroidx/recyclerview/widget/LinearLayoutManager$c;Landroidx/recyclerview/widget/RecyclerView$a0;Z)I
    //   1586: pop
    //   1587: aload_0
    //   1588: getfield t : Landroidx/recyclerview/widget/LinearLayoutManager$c;
    //   1591: astore #13
    //   1593: aload #13
    //   1595: getfield b : I
    //   1598: istore #5
    //   1600: aload #13
    //   1602: getfield d : I
    //   1605: istore #7
    //   1607: aload #13
    //   1609: getfield c : I
    //   1612: istore #6
    //   1614: iload_3
    //   1615: istore #4
    //   1617: iload #6
    //   1619: ifle -> 1628
    //   1622: iload_3
    //   1623: iload #6
    //   1625: iadd
    //   1626: istore #4
    //   1628: aload_0
    //   1629: getfield D : Landroidx/recyclerview/widget/LinearLayoutManager$a;
    //   1632: astore #13
    //   1634: aload_0
    //   1635: aload #13
    //   1637: getfield b : I
    //   1640: aload #13
    //   1642: getfield c : I
    //   1645: invokevirtual E1 : (II)V
    //   1648: aload_0
    //   1649: getfield t : Landroidx/recyclerview/widget/LinearLayoutManager$c;
    //   1652: astore #13
    //   1654: aload #13
    //   1656: iload #4
    //   1658: putfield h : I
    //   1661: aload #13
    //   1663: aload #13
    //   1665: getfield d : I
    //   1668: aload #13
    //   1670: getfield e : I
    //   1673: iadd
    //   1674: putfield d : I
    //   1677: aload_0
    //   1678: aload_1
    //   1679: aload #13
    //   1681: aload_2
    //   1682: iconst_0
    //   1683: invokevirtual e1 : (Landroidx/recyclerview/widget/RecyclerView$v;Landroidx/recyclerview/widget/LinearLayoutManager$c;Landroidx/recyclerview/widget/RecyclerView$a0;Z)I
    //   1686: pop
    //   1687: aload_0
    //   1688: getfield t : Landroidx/recyclerview/widget/LinearLayoutManager$c;
    //   1691: astore #13
    //   1693: aload #13
    //   1695: getfield b : I
    //   1698: istore #6
    //   1700: aload #13
    //   1702: getfield c : I
    //   1705: istore #8
    //   1707: iload #6
    //   1709: istore #4
    //   1711: iload #5
    //   1713: istore_3
    //   1714: iload #8
    //   1716: ifle -> 1762
    //   1719: aload_0
    //   1720: iload #7
    //   1722: iload #5
    //   1724: invokevirtual D1 : (II)V
    //   1727: aload_0
    //   1728: getfield t : Landroidx/recyclerview/widget/LinearLayoutManager$c;
    //   1731: astore #13
    //   1733: aload #13
    //   1735: iload #8
    //   1737: putfield h : I
    //   1740: aload_0
    //   1741: aload_1
    //   1742: aload #13
    //   1744: aload_2
    //   1745: iconst_0
    //   1746: invokevirtual e1 : (Landroidx/recyclerview/widget/RecyclerView$v;Landroidx/recyclerview/widget/LinearLayoutManager$c;Landroidx/recyclerview/widget/RecyclerView$a0;Z)I
    //   1749: pop
    //   1750: aload_0
    //   1751: getfield t : Landroidx/recyclerview/widget/LinearLayoutManager$c;
    //   1754: getfield b : I
    //   1757: istore_3
    //   1758: iload #6
    //   1760: istore #4
    //   1762: iload #4
    //   1764: istore #6
    //   1766: iload_3
    //   1767: istore #5
    //   1769: aload_0
    //   1770: invokevirtual y : ()I
    //   1773: ifle -> 1870
    //   1776: aload_0
    //   1777: getfield x : Z
    //   1780: aload_0
    //   1781: getfield y : Z
    //   1784: ixor
    //   1785: ifeq -> 1824
    //   1788: aload_0
    //   1789: iload_3
    //   1790: aload_1
    //   1791: aload_2
    //   1792: iconst_1
    //   1793: invokevirtual o1 : (ILandroidx/recyclerview/widget/RecyclerView$v;Landroidx/recyclerview/widget/RecyclerView$a0;Z)I
    //   1796: istore #6
    //   1798: iload #4
    //   1800: iload #6
    //   1802: iadd
    //   1803: istore #5
    //   1805: iload_3
    //   1806: iload #6
    //   1808: iadd
    //   1809: istore #4
    //   1811: aload_0
    //   1812: iload #5
    //   1814: aload_1
    //   1815: aload_2
    //   1816: iconst_0
    //   1817: invokevirtual p1 : (ILandroidx/recyclerview/widget/RecyclerView$v;Landroidx/recyclerview/widget/RecyclerView$a0;Z)I
    //   1820: istore_3
    //   1821: goto -> 1858
    //   1824: aload_0
    //   1825: iload #4
    //   1827: aload_1
    //   1828: aload_2
    //   1829: iconst_1
    //   1830: invokevirtual p1 : (ILandroidx/recyclerview/widget/RecyclerView$v;Landroidx/recyclerview/widget/RecyclerView$a0;Z)I
    //   1833: istore #6
    //   1835: iload #4
    //   1837: iload #6
    //   1839: iadd
    //   1840: istore #5
    //   1842: iload_3
    //   1843: iload #6
    //   1845: iadd
    //   1846: istore #4
    //   1848: aload_0
    //   1849: iload #4
    //   1851: aload_1
    //   1852: aload_2
    //   1853: iconst_0
    //   1854: invokevirtual o1 : (ILandroidx/recyclerview/widget/RecyclerView$v;Landroidx/recyclerview/widget/RecyclerView$a0;Z)I
    //   1857: istore_3
    //   1858: iload #5
    //   1860: iload_3
    //   1861: iadd
    //   1862: istore #6
    //   1864: iload #4
    //   1866: iload_3
    //   1867: iadd
    //   1868: istore #5
    //   1870: aload_2
    //   1871: getfield k : Z
    //   1874: ifeq -> 2174
    //   1877: aload_0
    //   1878: invokevirtual y : ()I
    //   1881: ifeq -> 2174
    //   1884: aload_2
    //   1885: getfield g : Z
    //   1888: ifne -> 2174
    //   1891: aload_0
    //   1892: invokevirtual W0 : ()Z
    //   1895: ifne -> 1901
    //   1898: goto -> 2174
    //   1901: aload_1
    //   1902: getfield d : Ljava/util/List;
    //   1905: astore #14
    //   1907: aload #14
    //   1909: invokeinterface size : ()I
    //   1914: istore #10
    //   1916: aload_0
    //   1917: aload_0
    //   1918: iconst_0
    //   1919: invokevirtual x : (I)Landroid/view/View;
    //   1922: invokevirtual P : (Landroid/view/View;)I
    //   1925: istore #9
    //   1927: iconst_0
    //   1928: istore_3
    //   1929: iconst_0
    //   1930: istore #7
    //   1932: iconst_0
    //   1933: istore #4
    //   1935: iload_3
    //   1936: iload #10
    //   1938: if_icmpge -> 2045
    //   1941: aload #14
    //   1943: iload_3
    //   1944: invokeinterface get : (I)Ljava/lang/Object;
    //   1949: checkcast androidx/recyclerview/widget/RecyclerView$d0
    //   1952: astore #13
    //   1954: aload #13
    //   1956: invokevirtual m : ()Z
    //   1959: ifeq -> 1965
    //   1962: goto -> 2039
    //   1965: aload #13
    //   1967: invokevirtual f : ()I
    //   1970: iload #9
    //   1972: if_icmpge -> 1981
    //   1975: iconst_1
    //   1976: istore #12
    //   1978: goto -> 1984
    //   1981: iconst_0
    //   1982: istore #12
    //   1984: iload #12
    //   1986: aload_0
    //   1987: getfield x : Z
    //   1990: if_icmpeq -> 1999
    //   1993: iconst_m1
    //   1994: istore #8
    //   1996: goto -> 2002
    //   1999: iconst_1
    //   2000: istore #8
    //   2002: aload_0
    //   2003: getfield u : Lb/r/d/t;
    //   2006: aload #13
    //   2008: getfield a : Landroid/view/View;
    //   2011: invokevirtual c : (Landroid/view/View;)I
    //   2014: istore #11
    //   2016: iload #8
    //   2018: iconst_m1
    //   2019: if_icmpne -> 2032
    //   2022: iload #7
    //   2024: iload #11
    //   2026: iadd
    //   2027: istore #7
    //   2029: goto -> 2039
    //   2032: iload #4
    //   2034: iload #11
    //   2036: iadd
    //   2037: istore #4
    //   2039: iinc #3, 1
    //   2042: goto -> 1935
    //   2045: aload_0
    //   2046: getfield t : Landroidx/recyclerview/widget/LinearLayoutManager$c;
    //   2049: aload #14
    //   2051: putfield l : Ljava/util/List;
    //   2054: iload #7
    //   2056: ifle -> 2110
    //   2059: aload_0
    //   2060: aload_0
    //   2061: aload_0
    //   2062: invokevirtual r1 : ()Landroid/view/View;
    //   2065: invokevirtual P : (Landroid/view/View;)I
    //   2068: iload #6
    //   2070: invokevirtual E1 : (II)V
    //   2073: aload_0
    //   2074: getfield t : Landroidx/recyclerview/widget/LinearLayoutManager$c;
    //   2077: astore #13
    //   2079: aload #13
    //   2081: iload #7
    //   2083: putfield h : I
    //   2086: aload #13
    //   2088: iconst_0
    //   2089: putfield c : I
    //   2092: aload #13
    //   2094: aconst_null
    //   2095: invokevirtual a : (Landroid/view/View;)V
    //   2098: aload_0
    //   2099: aload_1
    //   2100: aload_0
    //   2101: getfield t : Landroidx/recyclerview/widget/LinearLayoutManager$c;
    //   2104: aload_2
    //   2105: iconst_0
    //   2106: invokevirtual e1 : (Landroidx/recyclerview/widget/RecyclerView$v;Landroidx/recyclerview/widget/LinearLayoutManager$c;Landroidx/recyclerview/widget/RecyclerView$a0;Z)I
    //   2109: pop
    //   2110: iload #4
    //   2112: ifle -> 2166
    //   2115: aload_0
    //   2116: aload_0
    //   2117: aload_0
    //   2118: invokevirtual q1 : ()Landroid/view/View;
    //   2121: invokevirtual P : (Landroid/view/View;)I
    //   2124: iload #5
    //   2126: invokevirtual D1 : (II)V
    //   2129: aload_0
    //   2130: getfield t : Landroidx/recyclerview/widget/LinearLayoutManager$c;
    //   2133: astore #13
    //   2135: aload #13
    //   2137: iload #4
    //   2139: putfield h : I
    //   2142: aload #13
    //   2144: iconst_0
    //   2145: putfield c : I
    //   2148: aload #13
    //   2150: aconst_null
    //   2151: invokevirtual a : (Landroid/view/View;)V
    //   2154: aload_0
    //   2155: aload_1
    //   2156: aload_0
    //   2157: getfield t : Landroidx/recyclerview/widget/LinearLayoutManager$c;
    //   2160: aload_2
    //   2161: iconst_0
    //   2162: invokevirtual e1 : (Landroidx/recyclerview/widget/RecyclerView$v;Landroidx/recyclerview/widget/LinearLayoutManager$c;Landroidx/recyclerview/widget/RecyclerView$a0;Z)I
    //   2165: pop
    //   2166: aload_0
    //   2167: getfield t : Landroidx/recyclerview/widget/LinearLayoutManager$c;
    //   2170: aconst_null
    //   2171: putfield l : Ljava/util/List;
    //   2174: aload_2
    //   2175: getfield g : Z
    //   2178: ifne -> 2197
    //   2181: aload_0
    //   2182: getfield u : Lb/r/d/t;
    //   2185: astore_1
    //   2186: aload_1
    //   2187: aload_1
    //   2188: invokevirtual l : ()I
    //   2191: putfield b : I
    //   2194: goto -> 2204
    //   2197: aload_0
    //   2198: getfield D : Landroidx/recyclerview/widget/LinearLayoutManager$a;
    //   2201: invokevirtual d : ()V
    //   2204: aload_0
    //   2205: aload_0
    //   2206: getfield y : Z
    //   2209: putfield v : Z
    //   2212: return
  }
  
  public boolean s1() {
    int i = I();
    boolean bool = true;
    if (i != 1)
      bool = false; 
    return bool;
  }
  
  public View t(int paramInt) {
    int i = y();
    if (i == 0)
      return null; 
    int j = paramInt - P(x(0));
    if (j >= 0 && j < i) {
      View view = x(j);
      if (P(view) == paramInt)
        return view; 
    } 
    return super.t(paramInt);
  }
  
  public void t0(RecyclerView.a0 parama0) {
    this.C = null;
    this.A = -1;
    this.B = Integer.MIN_VALUE;
    this.D.d();
  }
  
  public void t1(RecyclerView.v paramv, RecyclerView.a0 parama0, c paramc, b paramb) {
    View view = paramc.c(paramv);
    if (view == null) {
      paramb.b = true;
      return;
    } 
    RecyclerView.p p2 = (RecyclerView.p)view.getLayoutParams();
    if (paramc.l == null) {
      boolean bool1;
      boolean bool2 = this.x;
      if (paramc.f == -1) {
        bool1 = true;
      } else {
        bool1 = false;
      } 
      if (bool2 == bool1) {
        c(view, -1, false);
      } else {
        c(view, 0, false);
      } 
    } else {
      boolean bool1;
      boolean bool2 = this.x;
      if (paramc.f == -1) {
        bool1 = true;
      } else {
        bool1 = false;
      } 
      if (bool2 == bool1) {
        c(view, -1, true);
      } else {
        c(view, 0, true);
      } 
    } 
    RecyclerView.p p1 = (RecyclerView.p)view.getLayoutParams();
    Rect rect = this.b.getItemDecorInsetsForChild(view);
    int i2 = rect.left;
    int m = rect.right;
    int i = rect.top;
    int j = rect.bottom;
    int n = this.q;
    int k = this.o;
    int i1 = M();
    k = RecyclerView.o.z(n, k, N() + i1 + p1.leftMargin + p1.rightMargin + i2 + m + 0, p1.width, super.e());
    n = this.r;
    m = this.p;
    i1 = O();
    i = RecyclerView.o.z(n, m, L() + i1 + p1.topMargin + p1.bottomMargin + i + j + 0, p1.height, super.f());
    if (R0(view, k, i, p1))
      view.measure(k, i); 
    paramb.a = this.u.c(view);
    if (this.s == 1) {
      if (s1()) {
        i = this.q - N();
        m = i - this.u.d(view);
      } else {
        m = M();
        i = this.u.d(view) + m;
      } 
      k = paramc.f;
      j = paramc.b;
      if (k == -1) {
        i1 = paramb.a;
        k = j;
        n = i;
        i = j - i1;
        j = n;
      } else {
        i1 = paramb.a;
        n = j;
        k = i;
        i1 += j;
        i = n;
        j = k;
        k = i1;
      } 
    } else {
      m = O();
      k = this.u.d(view) + m;
      j = paramc.f;
      i = paramc.b;
      if (j == -1) {
        i1 = paramb.a;
        j = i;
        n = m;
        m = i - i1;
        i = n;
      } else {
        j = paramb.a;
        j += i;
        n = i;
        i = m;
        m = n;
      } 
    } 
    Y(view, m, i, j, k);
    if (p2.c() || p2.b())
      paramb.c = true; 
    paramb.d = view.hasFocusable();
  }
  
  public RecyclerView.p u() {
    return new RecyclerView.p(-2, -2);
  }
  
  public void u1(RecyclerView.v paramv, RecyclerView.a0 parama0, a parama, int paramInt) {}
  
  public final void v1(RecyclerView.v paramv, c paramc) {
    if (paramc.a && !paramc.m) {
      int j = paramc.g;
      int i = paramc.i;
      if (paramc.f == -1) {
        int k = y();
        if (j >= 0) {
          j = this.u.f() - j + i;
          if (this.x) {
            for (i = 0; i < k; i++) {
              View view = x(i);
              if (this.u.e(view) < j || this.u.o(view) < j) {
                w1(paramv, 0, i);
                break;
              } 
            } 
          } else {
            for (i = --k; i >= 0; i--) {
              View view = x(i);
              if (this.u.e(view) < j || this.u.o(view) < j) {
                w1(paramv, k, i);
                break;
              } 
            } 
          } 
        } 
      } else if (j >= 0) {
        j -= i;
        int k = y();
        if (this.x) {
          for (i = --k; i >= 0; i--) {
            View view = x(i);
            if (this.u.b(view) > j || this.u.n(view) > j) {
              w1(paramv, k, i);
              break;
            } 
          } 
        } else {
          for (i = 0; i < k; i++) {
            View view = x(i);
            if (this.u.b(view) > j || this.u.n(view) > j) {
              w1(paramv, 0, i);
              break;
            } 
          } 
        } 
      } 
    } 
  }
  
  public final void w1(RecyclerView.v paramv, int paramInt1, int paramInt2) {
    if (paramInt1 == paramInt2)
      return; 
    int i = paramInt1;
    if (paramInt2 > paramInt1) {
      while (--paramInt2 >= paramInt1) {
        F0(paramInt2, paramv);
        paramInt2--;
      } 
    } else {
      while (i > paramInt2) {
        F0(i, paramv);
        i--;
      } 
    } 
  }
  
  public void x0(Parcelable paramParcelable) {
    if (paramParcelable instanceof d) {
      this.C = (d)paramParcelable;
      I0();
    } 
  }
  
  public boolean x1() {
    boolean bool;
    if (this.u.i() == 0 && this.u.f() == 0) {
      bool = true;
    } else {
      bool = false;
    } 
    return bool;
  }
  
  public Parcelable y0() {
    d d1 = this.C;
    if (d1 != null)
      return new d(d1); 
    d1 = new d();
    if (y() > 0) {
      d1();
      int i = this.v ^ this.x;
      d1.d = i;
      if (i != 0) {
        View view = q1();
        d1.c = this.u.g() - this.u.b(view);
        d1.b = P(view);
      } else {
        View view = r1();
        d1.b = P(view);
        d1.c = this.u.e(view) - this.u.k();
      } 
    } else {
      d1.b = -1;
    } 
    return d1;
  }
  
  public final void y1() {
    int i;
    if (this.s == 1 || !s1()) {
      boolean bool = this.w;
    } else {
      i = this.w ^ true;
    } 
    this.x = i;
  }
  
  public int z1(int paramInt, RecyclerView.v paramv, RecyclerView.a0 parama0) {
    byte b1;
    if (y() == 0 || paramInt == 0)
      return 0; 
    d1();
    this.t.a = true;
    if (paramInt > 0) {
      b1 = 1;
    } else {
      b1 = -1;
    } 
    int i = Math.abs(paramInt);
    C1(b1, i, true, parama0);
    c c1 = this.t;
    int j = c1.g;
    j = e1(paramv, c1, parama0, false) + j;
    if (j < 0)
      return 0; 
    if (i > j)
      paramInt = b1 * j; 
    this.u.p(-paramInt);
    this.t.k = paramInt;
    return paramInt;
  }
  
  public static class a {
    public t a;
    
    public int b;
    
    public int c;
    
    public boolean d;
    
    public boolean e;
    
    public a() {
      d();
    }
    
    public void a() {
      int i;
      if (this.d) {
        i = this.a.g();
      } else {
        i = this.a.k();
      } 
      this.c = i;
    }
    
    public void b(View param1View, int param1Int) {
      if (this.d) {
        int i = this.a.b(param1View);
        this.c = this.a.m() + i;
      } else {
        this.c = this.a.e(param1View);
      } 
      this.b = param1Int;
    }
    
    public void c(View param1View, int param1Int) {
      int i = this.a.m();
      if (i >= 0) {
        b(param1View, param1Int);
        return;
      } 
      this.b = param1Int;
      if (this.d) {
        param1Int = this.a.g() - i - this.a.b(param1View);
        this.c = this.a.g() - param1Int;
        if (param1Int > 0) {
          int k = this.a.c(param1View);
          int j = this.c;
          i = this.a.k();
          j = j - k - Math.min(this.a.e(param1View) - i, 0) + i;
          if (j < 0) {
            i = this.c;
            param1Int = Math.min(param1Int, -j) + i;
          } else {
            return;
          } 
        } else {
          return;
        } 
      } else {
        int j = this.a.e(param1View);
        param1Int = j - this.a.k();
        this.c = j;
        if (param1Int > 0) {
          int n = this.a.c(param1View);
          int m = this.a.g();
          int k = this.a.b(param1View);
          i = this.a.g() - Math.min(0, m - i - k) - n + j;
          if (i < 0) {
            param1Int = this.c - Math.min(param1Int, -i);
          } else {
            return;
          } 
        } else {
          return;
        } 
      } 
      this.c = param1Int;
    }
    
    public void d() {
      this.b = -1;
      this.c = Integer.MIN_VALUE;
      this.d = false;
      this.e = false;
    }
    
    public String toString() {
      StringBuilder stringBuilder = c.a.a.a.a.e("AnchorInfo{mPosition=");
      stringBuilder.append(this.b);
      stringBuilder.append(", mCoordinate=");
      stringBuilder.append(this.c);
      stringBuilder.append(", mLayoutFromEnd=");
      stringBuilder.append(this.d);
      stringBuilder.append(", mValid=");
      stringBuilder.append(this.e);
      stringBuilder.append('}');
      return stringBuilder.toString();
    }
  }
  
  public static class b {
    public int a;
    
    public boolean b;
    
    public boolean c;
    
    public boolean d;
  }
  
  public static class c {
    public boolean a = true;
    
    public int b;
    
    public int c;
    
    public int d;
    
    public int e;
    
    public int f;
    
    public int g;
    
    public int h = 0;
    
    public int i = 0;
    
    public boolean j;
    
    public int k;
    
    public List<RecyclerView.d0> l = null;
    
    public boolean m;
    
    public void a(View param1View) {
      View view2;
      int k = this.l.size();
      View view1 = null;
      int j = Integer.MAX_VALUE;
      int i = 0;
      while (true) {
        view2 = view1;
        if (i < k) {
          View view = ((RecyclerView.d0)this.l.get(i)).a;
          RecyclerView.p p = (RecyclerView.p)view.getLayoutParams();
          view2 = view1;
          int m = j;
          if (view != param1View)
            if (p.c()) {
              view2 = view1;
              m = j;
            } else {
              int n = (p.a() - this.d) * this.e;
              if (n < 0) {
                view2 = view1;
                m = j;
              } else {
                view2 = view1;
                m = j;
                if (n < j) {
                  view1 = view;
                  if (n == 0) {
                    view2 = view1;
                    break;
                  } 
                  m = n;
                  view2 = view1;
                } 
              } 
            }  
          i++;
          view1 = view2;
          j = m;
          continue;
        } 
        break;
      } 
      if (view2 == null) {
        i = -1;
      } else {
        i = ((RecyclerView.p)view2.getLayoutParams()).a();
      } 
      this.d = i;
    }
    
    public boolean b(RecyclerView.a0 param1a0) {
      boolean bool;
      int i = this.d;
      if (i >= 0 && i < param1a0.b()) {
        bool = true;
      } else {
        bool = false;
      } 
      return bool;
    }
    
    public View c(RecyclerView.v param1v) {
      List<RecyclerView.d0> list = this.l;
      byte b = 0;
      if (list != null) {
        int i = list.size();
        while (true) {
          if (b < i) {
            View view1 = ((RecyclerView.d0)this.l.get(b)).a;
            RecyclerView.p p = (RecyclerView.p)view1.getLayoutParams();
            if (!p.c() && this.d == p.a()) {
              a(view1);
              break;
            } 
            b++;
            continue;
          } 
          param1v = null;
          break;
        } 
        return (View)param1v;
      } 
      View view = (param1v.k(this.d, false, Long.MAX_VALUE)).a;
      this.d += this.e;
      return view;
    }
  }
  
  @SuppressLint({"BanParcelableUsage"})
  public static class d implements Parcelable {
    public static final Parcelable.Creator<d> CREATOR = new a();
    
    public int b;
    
    public int c;
    
    public boolean d;
    
    public d() {}
    
    public d(Parcel param1Parcel) {
      this.b = param1Parcel.readInt();
      this.c = param1Parcel.readInt();
      int i = param1Parcel.readInt();
      boolean bool = true;
      if (i != 1)
        bool = false; 
      this.d = bool;
    }
    
    public d(d param1d) {
      this.b = param1d.b;
      this.c = param1d.c;
      this.d = param1d.d;
    }
    
    public boolean c() {
      boolean bool;
      if (this.b >= 0) {
        bool = true;
      } else {
        bool = false;
      } 
      return bool;
    }
    
    public int describeContents() {
      return 0;
    }
    
    public void writeToParcel(Parcel param1Parcel, int param1Int) {
      param1Parcel.writeInt(this.b);
      param1Parcel.writeInt(this.c);
      param1Parcel.writeInt(this.d);
    }
    
    public static final class a implements Parcelable.Creator<d> {
      public Object createFromParcel(Parcel param2Parcel) {
        return new LinearLayoutManager.d(param2Parcel);
      }
      
      public Object[] newArray(int param2Int) {
        return (Object[])new LinearLayoutManager.d[param2Int];
      }
    }
  }
  
  public static final class a implements Parcelable.Creator<d> {
    public Object createFromParcel(Parcel param1Parcel) {
      return new LinearLayoutManager.d(param1Parcel);
    }
    
    public Object[] newArray(int param1Int) {
      return (Object[])new LinearLayoutManager.d[param1Int];
    }
  }
}


/* Location:              C:\Users\panch\Downloads\dvba_v1.1.0-dex2jar.jar!\androidx\recyclerview\widget\LinearLayoutManager.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */