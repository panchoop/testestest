package androidx.recyclerview.widget;

import android.content.Context;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseIntArray;
import android.view.View;
import android.view.ViewGroup;
import b.r.d.m;
import java.util.Arrays;

public class GridLayoutManager extends LinearLayoutManager {
  public boolean H = false;
  
  public int I = -1;
  
  public int[] J;
  
  public View[] K;
  
  public final SparseIntArray L = new SparseIntArray();
  
  public final SparseIntArray M = new SparseIntArray();
  
  public c N = new a();
  
  public final Rect O = new Rect();
  
  public GridLayoutManager(Context paramContext, int paramInt1, int paramInt2, boolean paramBoolean) {
    super(paramInt2, paramBoolean);
    N1(paramInt1);
  }
  
  public GridLayoutManager(Context paramContext, AttributeSet paramAttributeSet, int paramInt1, int paramInt2) {
    super(paramContext, paramAttributeSet, paramInt1, paramInt2);
    N1((RecyclerView.o.Q(paramContext, paramAttributeSet, paramInt1, paramInt2)).b);
  }
  
  public int A(RecyclerView.v paramv, RecyclerView.a0 parama0) {
    return (this.s == 1) ? this.I : ((parama0.b() < 1) ? 0 : (I1(paramv, parama0, parama0.b() - 1) + 1));
  }
  
  public void B1(boolean paramBoolean) {
    if (!paramBoolean) {
      d(null);
      if (this.y) {
        this.y = false;
        I0();
      } 
      return;
    } 
    throw new UnsupportedOperationException("GridLayoutManager does not support stack from end. Consider using reverse layout");
  }
  
  public final void F1(int paramInt) {
    // Byte code:
    //   0: aload_0
    //   1: getfield J : [I
    //   4: astore #9
    //   6: aload_0
    //   7: getfield I : I
    //   10: istore #6
    //   12: iconst_1
    //   13: istore_3
    //   14: aload #9
    //   16: ifnull -> 45
    //   19: aload #9
    //   21: arraylength
    //   22: iload #6
    //   24: iconst_1
    //   25: iadd
    //   26: if_icmpne -> 45
    //   29: aload #9
    //   31: astore #8
    //   33: aload #9
    //   35: aload #9
    //   37: arraylength
    //   38: iconst_1
    //   39: isub
    //   40: iaload
    //   41: iload_1
    //   42: if_icmpeq -> 53
    //   45: iload #6
    //   47: iconst_1
    //   48: iadd
    //   49: newarray int
    //   51: astore #8
    //   53: iconst_0
    //   54: istore #4
    //   56: aload #8
    //   58: iconst_0
    //   59: iconst_0
    //   60: iastore
    //   61: iload_1
    //   62: iload #6
    //   64: idiv
    //   65: istore #5
    //   67: iload_1
    //   68: iload #6
    //   70: irem
    //   71: istore #7
    //   73: iconst_0
    //   74: istore_2
    //   75: iload #4
    //   77: istore_1
    //   78: iload_3
    //   79: iload #6
    //   81: if_icmpgt -> 136
    //   84: iload_1
    //   85: iload #7
    //   87: iadd
    //   88: istore_1
    //   89: iload_1
    //   90: ifle -> 116
    //   93: iload #6
    //   95: iload_1
    //   96: isub
    //   97: iload #7
    //   99: if_icmpge -> 116
    //   102: iload #5
    //   104: iconst_1
    //   105: iadd
    //   106: istore #4
    //   108: iload_1
    //   109: iload #6
    //   111: isub
    //   112: istore_1
    //   113: goto -> 120
    //   116: iload #5
    //   118: istore #4
    //   120: iload_2
    //   121: iload #4
    //   123: iadd
    //   124: istore_2
    //   125: aload #8
    //   127: iload_3
    //   128: iload_2
    //   129: iastore
    //   130: iinc #3, 1
    //   133: goto -> 78
    //   136: aload_0
    //   137: aload #8
    //   139: putfield J : [I
    //   142: return
  }
  
  public final void G1() {
    View[] arrayOfView = this.K;
    if (arrayOfView == null || arrayOfView.length != this.I)
      this.K = new View[this.I]; 
  }
  
  public int H1(int paramInt1, int paramInt2) {
    if (this.s == 1 && s1()) {
      int[] arrayOfInt1 = this.J;
      int i = this.I;
      return arrayOfInt1[i - paramInt1] - arrayOfInt1[i - paramInt1 - paramInt2];
    } 
    int[] arrayOfInt = this.J;
    return arrayOfInt[paramInt2 + paramInt1] - arrayOfInt[paramInt1];
  }
  
  public final int I1(RecyclerView.v paramv, RecyclerView.a0 parama0, int paramInt) {
    if (!parama0.g)
      return this.N.a(paramInt, this.I); 
    int i = paramv.c(paramInt);
    if (i == -1) {
      StringBuilder stringBuilder = new StringBuilder();
      stringBuilder.append("Cannot find span size for pre layout position. ");
      stringBuilder.append(paramInt);
      Log.w("GridLayoutManager", stringBuilder.toString());
      return 0;
    } 
    return this.N.a(i, this.I);
  }
  
  public int J0(int paramInt, RecyclerView.v paramv, RecyclerView.a0 parama0) {
    O1();
    G1();
    if (this.s == 1) {
      paramInt = 0;
    } else {
      paramInt = z1(paramInt, paramv, parama0);
    } 
    return paramInt;
  }
  
  public final int J1(RecyclerView.v paramv, RecyclerView.a0 parama0, int paramInt) {
    if (!parama0.g)
      return this.N.b(paramInt, this.I); 
    int i = this.M.get(paramInt, -1);
    if (i != -1)
      return i; 
    i = paramv.c(paramInt);
    if (i == -1) {
      StringBuilder stringBuilder = new StringBuilder();
      stringBuilder.append("Cannot find span size for pre layout position. It is not cached, not in the adapter. Pos:");
      stringBuilder.append(paramInt);
      Log.w("GridLayoutManager", stringBuilder.toString());
      return 0;
    } 
    return this.N.b(i, this.I);
  }
  
  public final int K1(RecyclerView.v paramv, RecyclerView.a0 parama0, int paramInt) {
    if (!parama0.g) {
      if ((a)this.N != null)
        return 1; 
      throw null;
    } 
    int i = this.L.get(paramInt, -1);
    if (i != -1)
      return i; 
    if (paramv.c(paramInt) == -1) {
      StringBuilder stringBuilder = new StringBuilder();
      stringBuilder.append("Cannot find span size for pre layout position. It is not cached, not in the adapter. Pos:");
      stringBuilder.append(paramInt);
      Log.w("GridLayoutManager", stringBuilder.toString());
      return 1;
    } 
    if ((a)this.N != null)
      return 1; 
    throw null;
  }
  
  public int L0(int paramInt, RecyclerView.v paramv, RecyclerView.a0 parama0) {
    O1();
    G1();
    if (this.s == 0) {
      paramInt = 0;
    } else {
      paramInt = z1(paramInt, paramv, parama0);
    } 
    return paramInt;
  }
  
  public final void L1(View paramView, int paramInt, boolean paramBoolean) {
    b b = (b)paramView.getLayoutParams();
    Rect rect = b.b;
    int j = rect.top + rect.bottom + b.topMargin + b.bottomMargin;
    int i = rect.left + rect.right + b.leftMargin + b.rightMargin;
    int k = H1(b.e, b.f);
    if (this.s == 1) {
      i = RecyclerView.o.z(k, paramInt, i, b.width, false);
      paramInt = RecyclerView.o.z(this.u.l(), this.p, j, b.height, true);
    } else {
      paramInt = RecyclerView.o.z(k, paramInt, j, b.height, false);
      i = RecyclerView.o.z(this.u.l(), this.o, i, b.width, true);
    } 
    M1(paramView, i, paramInt, paramBoolean);
  }
  
  public final void M1(View paramView, int paramInt1, int paramInt2, boolean paramBoolean) {
    RecyclerView.p p = (RecyclerView.p)paramView.getLayoutParams();
    if (paramBoolean) {
      paramBoolean = T0(paramView, paramInt1, paramInt2, p);
    } else {
      paramBoolean = R0(paramView, paramInt1, paramInt2, p);
    } 
    if (paramBoolean)
      paramView.measure(paramInt1, paramInt2); 
  }
  
  public void N1(int paramInt) {
    if (paramInt == this.I)
      return; 
    this.H = true;
    if (paramInt >= 1) {
      this.I = paramInt;
      this.N.a.clear();
      I0();
      return;
    } 
    StringBuilder stringBuilder = new StringBuilder();
    stringBuilder.append("Span count should be at least 1. Provided ");
    stringBuilder.append(paramInt);
    throw new IllegalArgumentException(stringBuilder.toString());
  }
  
  public void O0(Rect paramRect, int paramInt1, int paramInt2) {
    int[] arrayOfInt;
    if (this.J == null)
      super.O0(paramRect, paramInt1, paramInt2); 
    int i = M();
    i = N() + i;
    int j = O();
    j = L() + j;
    if (this.s == 1) {
      paramInt2 = RecyclerView.o.h(paramInt2, paramRect.height() + j, J());
      arrayOfInt = this.J;
      paramInt1 = RecyclerView.o.h(paramInt1, arrayOfInt[arrayOfInt.length - 1] + i, K());
    } else {
      paramInt1 = RecyclerView.o.h(paramInt1, arrayOfInt.width() + i, K());
      arrayOfInt = this.J;
      paramInt2 = RecyclerView.o.h(paramInt2, arrayOfInt[arrayOfInt.length - 1] + j, J());
    } 
    RecyclerView.access$300(this.b, paramInt1, paramInt2);
  }
  
  public final void O1() {
    int i;
    int j;
    if (this.s == 1) {
      j = this.q - N();
      i = M();
    } else {
      j = this.r - L();
      i = O();
    } 
    F1(j - i);
  }
  
  public int R(RecyclerView.v paramv, RecyclerView.a0 parama0) {
    return (this.s == 0) ? this.I : ((parama0.b() < 1) ? 0 : (I1(paramv, parama0, parama0.b() - 1) + 1));
  }
  
  public boolean W0() {
    boolean bool;
    if (this.C == null && !this.H) {
      bool = true;
    } else {
      bool = false;
    } 
    return bool;
  }
  
  public void Y0(RecyclerView.a0 parama0, LinearLayoutManager.c paramc, RecyclerView.o.c paramc1) {
    int i = this.I;
    byte b = 0;
    while (b < this.I && paramc.b(parama0) && i > 0) {
      int j = paramc.d;
      int k = Math.max(0, paramc.g);
      ((m.b)paramc1).a(j, k);
      if ((a)this.N != null) {
        i--;
        paramc.d += paramc.e;
        b++;
        continue;
      } 
      throw null;
    } 
  }
  
  public boolean g(RecyclerView.p paramp) {
    return paramp instanceof b;
  }
  
  public View g0(View paramView, int paramInt, RecyclerView.v paramv, RecyclerView.a0 parama0) {
    // Byte code:
    //   0: aload_0
    //   1: aload_1
    //   2: invokevirtual s : (Landroid/view/View;)Landroid/view/View;
    //   5: astore #21
    //   7: aconst_null
    //   8: astore #20
    //   10: aload #21
    //   12: ifnonnull -> 17
    //   15: aconst_null
    //   16: areturn
    //   17: aload #21
    //   19: invokevirtual getLayoutParams : ()Landroid/view/ViewGroup$LayoutParams;
    //   22: checkcast androidx/recyclerview/widget/GridLayoutManager$b
    //   25: astore #22
    //   27: aload #22
    //   29: getfield e : I
    //   32: istore #14
    //   34: aload #22
    //   36: getfield f : I
    //   39: iload #14
    //   41: iadd
    //   42: istore #15
    //   44: aload_0
    //   45: aload_1
    //   46: iload_2
    //   47: aload_3
    //   48: aload #4
    //   50: invokespecial g0 : (Landroid/view/View;ILandroidx/recyclerview/widget/RecyclerView$v;Landroidx/recyclerview/widget/RecyclerView$a0;)Landroid/view/View;
    //   53: ifnonnull -> 58
    //   56: aconst_null
    //   57: areturn
    //   58: aload_0
    //   59: iload_2
    //   60: invokevirtual c1 : (I)I
    //   63: iconst_1
    //   64: if_icmpne -> 73
    //   67: iconst_1
    //   68: istore #19
    //   70: goto -> 76
    //   73: iconst_0
    //   74: istore #19
    //   76: iload #19
    //   78: aload_0
    //   79: getfield x : Z
    //   82: if_icmpeq -> 90
    //   85: iconst_1
    //   86: istore_2
    //   87: goto -> 92
    //   90: iconst_0
    //   91: istore_2
    //   92: iload_2
    //   93: ifeq -> 112
    //   96: aload_0
    //   97: invokevirtual y : ()I
    //   100: iconst_1
    //   101: isub
    //   102: istore #5
    //   104: iconst_m1
    //   105: istore_2
    //   106: iconst_m1
    //   107: istore #6
    //   109: goto -> 123
    //   112: aload_0
    //   113: invokevirtual y : ()I
    //   116: istore_2
    //   117: iconst_0
    //   118: istore #5
    //   120: iconst_1
    //   121: istore #6
    //   123: aload_0
    //   124: getfield s : I
    //   127: iconst_1
    //   128: if_icmpne -> 144
    //   131: aload_0
    //   132: invokevirtual s1 : ()Z
    //   135: ifeq -> 144
    //   138: iconst_1
    //   139: istore #7
    //   141: goto -> 147
    //   144: iconst_0
    //   145: istore #7
    //   147: aload_0
    //   148: aload_3
    //   149: aload #4
    //   151: iload #5
    //   153: invokevirtual I1 : (Landroidx/recyclerview/widget/RecyclerView$v;Landroidx/recyclerview/widget/RecyclerView$a0;I)I
    //   156: istore #16
    //   158: iconst_0
    //   159: istore #13
    //   161: iconst_m1
    //   162: istore #12
    //   164: iconst_0
    //   165: istore #11
    //   167: iconst_m1
    //   168: istore #10
    //   170: aconst_null
    //   171: astore_1
    //   172: iload_2
    //   173: istore #8
    //   175: iload #5
    //   177: istore #9
    //   179: iload #13
    //   181: istore_2
    //   182: iload #9
    //   184: iload #8
    //   186: if_icmpeq -> 550
    //   189: aload_0
    //   190: aload_3
    //   191: aload #4
    //   193: iload #9
    //   195: invokevirtual I1 : (Landroidx/recyclerview/widget/RecyclerView$v;Landroidx/recyclerview/widget/RecyclerView$a0;I)I
    //   198: istore #5
    //   200: aload_0
    //   201: iload #9
    //   203: invokevirtual x : (I)Landroid/view/View;
    //   206: astore #22
    //   208: aload #22
    //   210: aload #21
    //   212: if_acmpne -> 218
    //   215: goto -> 550
    //   218: aload #22
    //   220: invokevirtual hasFocusable : ()Z
    //   223: ifeq -> 244
    //   226: iload #5
    //   228: iload #16
    //   230: if_icmpeq -> 244
    //   233: aload #20
    //   235: ifnull -> 241
    //   238: goto -> 550
    //   241: goto -> 540
    //   244: aload #22
    //   246: invokevirtual getLayoutParams : ()Landroid/view/ViewGroup$LayoutParams;
    //   249: checkcast androidx/recyclerview/widget/GridLayoutManager$b
    //   252: astore #23
    //   254: aload #23
    //   256: getfield e : I
    //   259: istore #17
    //   261: aload #23
    //   263: getfield f : I
    //   266: iload #17
    //   268: iadd
    //   269: istore #18
    //   271: aload #22
    //   273: invokevirtual hasFocusable : ()Z
    //   276: ifeq -> 296
    //   279: iload #17
    //   281: iload #14
    //   283: if_icmpne -> 296
    //   286: iload #18
    //   288: iload #15
    //   290: if_icmpne -> 296
    //   293: aload #22
    //   295: areturn
    //   296: aload #22
    //   298: invokevirtual hasFocusable : ()Z
    //   301: ifeq -> 309
    //   304: aload #20
    //   306: ifnull -> 321
    //   309: aload #22
    //   311: invokevirtual hasFocusable : ()Z
    //   314: ifne -> 327
    //   317: aload_1
    //   318: ifnonnull -> 327
    //   321: iconst_1
    //   322: istore #5
    //   324: goto -> 461
    //   327: iload #17
    //   329: iload #14
    //   331: invokestatic max : (II)I
    //   334: istore #5
    //   336: iload #18
    //   338: iload #15
    //   340: invokestatic min : (II)I
    //   343: iload #5
    //   345: isub
    //   346: istore #5
    //   348: aload #22
    //   350: invokevirtual hasFocusable : ()Z
    //   353: ifeq -> 397
    //   356: iload #5
    //   358: iload_2
    //   359: if_icmple -> 365
    //   362: goto -> 321
    //   365: iload #5
    //   367: iload_2
    //   368: if_icmpne -> 458
    //   371: iload #17
    //   373: iload #10
    //   375: if_icmple -> 384
    //   378: iconst_1
    //   379: istore #5
    //   381: goto -> 387
    //   384: iconst_0
    //   385: istore #5
    //   387: iload #7
    //   389: iload #5
    //   391: if_icmpne -> 458
    //   394: goto -> 362
    //   397: aload #20
    //   399: ifnonnull -> 458
    //   402: aload_0
    //   403: aload #22
    //   405: iconst_0
    //   406: invokevirtual X : (Landroid/view/View;Z)Z
    //   409: ifeq -> 458
    //   412: iload #5
    //   414: iload #11
    //   416: if_icmple -> 425
    //   419: iconst_1
    //   420: istore #5
    //   422: goto -> 461
    //   425: iload #5
    //   427: iload #11
    //   429: if_icmpne -> 458
    //   432: iload #17
    //   434: iload #12
    //   436: if_icmple -> 445
    //   439: iconst_1
    //   440: istore #5
    //   442: goto -> 448
    //   445: iconst_0
    //   446: istore #5
    //   448: iload #7
    //   450: iload #5
    //   452: if_icmpne -> 458
    //   455: goto -> 419
    //   458: iconst_0
    //   459: istore #5
    //   461: iload_2
    //   462: istore #13
    //   464: iload #5
    //   466: ifeq -> 540
    //   469: aload #22
    //   471: invokevirtual hasFocusable : ()Z
    //   474: ifeq -> 507
    //   477: aload #23
    //   479: getfield e : I
    //   482: istore #10
    //   484: iload #18
    //   486: iload #15
    //   488: invokestatic min : (II)I
    //   491: iload #17
    //   493: iload #14
    //   495: invokestatic max : (II)I
    //   498: isub
    //   499: istore_2
    //   500: aload #22
    //   502: astore #20
    //   504: goto -> 540
    //   507: aload #23
    //   509: getfield e : I
    //   512: istore #12
    //   514: iload #18
    //   516: iload #15
    //   518: invokestatic min : (II)I
    //   521: iload #17
    //   523: iload #14
    //   525: invokestatic max : (II)I
    //   528: isub
    //   529: istore #11
    //   531: aload #22
    //   533: astore_1
    //   534: iload #13
    //   536: istore_2
    //   537: goto -> 540
    //   540: iload #9
    //   542: iload #6
    //   544: iadd
    //   545: istore #9
    //   547: goto -> 182
    //   550: aload #20
    //   552: ifnull -> 558
    //   555: goto -> 561
    //   558: aload_1
    //   559: astore #20
    //   561: aload #20
    //   563: areturn
  }
  
  public void k0(RecyclerView.v paramv, RecyclerView.a0 parama0, View paramView, b.i.m.v.b paramb) {
    boolean bool;
    int j;
    int k;
    ViewGroup.LayoutParams layoutParams = paramView.getLayoutParams();
    if (!(layoutParams instanceof b)) {
      j0(paramView, paramb);
      return;
    } 
    b b1 = (b)layoutParams;
    int i = I1(paramv, parama0, b1.a());
    if (this.s == 0) {
      int m = b1.e;
      bool = b1.f;
      k = 1;
      j = i;
      i = m;
    } else {
      bool = true;
      j = b1.e;
      k = b1.f;
    } 
    paramb.j(b.i.m.v.b.c.a(i, bool, j, k, false, false));
  }
  
  public int l(RecyclerView.a0 parama0) {
    return a1(parama0);
  }
  
  public int m(RecyclerView.a0 parama0) {
    return b1(parama0);
  }
  
  public void m0(RecyclerView paramRecyclerView, int paramInt1, int paramInt2) {
    this.N.a.clear();
    this.N.b.clear();
  }
  
  public void n0(RecyclerView paramRecyclerView) {
    this.N.a.clear();
    this.N.b.clear();
  }
  
  public View n1(RecyclerView.v paramv, RecyclerView.a0 parama0, int paramInt1, int paramInt2, int paramInt3) {
    byte b;
    d1();
    int i = this.u.k();
    int j = this.u.g();
    if (paramInt2 > paramInt1) {
      b = 1;
    } else {
      b = -1;
    } 
    View view2 = null;
    View view1;
    for (view1 = null; paramInt1 != paramInt2; view1 = view4) {
      View view5 = x(paramInt1);
      int k = P(view5);
      View view3 = view2;
      View view4 = view1;
      if (k >= 0) {
        view3 = view2;
        view4 = view1;
        if (k < paramInt3)
          if (J1(paramv, parama0, k) != 0) {
            view3 = view2;
            view4 = view1;
          } else if (((RecyclerView.p)view5.getLayoutParams()).c()) {
            view3 = view2;
            view4 = view1;
            if (view1 == null) {
              view4 = view5;
              view3 = view2;
            } 
          } else if (this.u.e(view5) >= j || this.u.b(view5) < i) {
            view3 = view2;
            view4 = view1;
            if (view2 == null) {
              view3 = view5;
              view4 = view1;
            } 
          } else {
            return view5;
          }  
      } 
      paramInt1 += b;
      view2 = view3;
    } 
    if (view2 == null)
      view2 = view1; 
    return view2;
  }
  
  public int o(RecyclerView.a0 parama0) {
    return a1(parama0);
  }
  
  public void o0(RecyclerView paramRecyclerView, int paramInt1, int paramInt2, int paramInt3) {
    this.N.a.clear();
    this.N.b.clear();
  }
  
  public int p(RecyclerView.a0 parama0) {
    return b1(parama0);
  }
  
  public void p0(RecyclerView paramRecyclerView, int paramInt1, int paramInt2) {
    this.N.a.clear();
    this.N.b.clear();
  }
  
  public void r0(RecyclerView paramRecyclerView, int paramInt1, int paramInt2, Object paramObject) {
    this.N.a.clear();
    this.N.b.clear();
  }
  
  public void s0(RecyclerView.v paramv, RecyclerView.a0 parama0) {
    if (parama0.g) {
      int i = y();
      for (byte b = 0; b < i; b++) {
        b b1 = (b)x(b).getLayoutParams();
        int j = b1.a();
        this.L.put(j, b1.f);
        this.M.put(j, b1.e);
      } 
    } 
    super.s0(paramv, parama0);
    this.L.clear();
    this.M.clear();
  }
  
  public void t0(RecyclerView.a0 parama0) {
    this.C = null;
    this.A = -1;
    this.B = Integer.MIN_VALUE;
    this.D.d();
    this.H = false;
  }
  
  public void t1(RecyclerView.v paramv, RecyclerView.a0 parama0, LinearLayoutManager.c paramc, LinearLayoutManager.b paramb) {
    StringBuilder stringBuilder;
    int k;
    int m;
    int i2;
    int i3 = this.u.j();
    if (i3 != 1073741824) {
      k = 1;
    } else {
      k = 0;
    } 
    if (y() > 0) {
      m = this.J[this.I];
    } else {
      m = 0;
    } 
    if (k)
      O1(); 
    if (paramc.e == 1) {
      n = 1;
    } else {
      n = 0;
    } 
    int i = this.I;
    if (!n)
      i = J1(paramv, parama0, paramc.d) + K1(paramv, parama0, paramc.d); 
    byte b1 = 0;
    while (b1 < this.I && paramc.b(parama0) && i > 0) {
      i1 = paramc.d;
      j = K1(paramv, parama0, i1);
      if (j <= this.I) {
        i -= j;
        if (i < 0)
          break; 
        View view = paramc.c(paramv);
        if (view == null)
          break; 
        this.K[b1] = view;
        b1++;
        continue;
      } 
      stringBuilder = new StringBuilder();
      stringBuilder.append("Item at position ");
      stringBuilder.append(i1);
      stringBuilder.append(" requires ");
      stringBuilder.append(j);
      stringBuilder.append(" spans but GridLayoutManager has only ");
      stringBuilder.append(this.I);
      stringBuilder.append(" spans.");
      throw new IllegalArgumentException(stringBuilder.toString());
    } 
    if (b1 == 0) {
      paramb.b = true;
      return;
    } 
    if (n) {
      i1 = b1;
      i = 0;
      j = 0;
      i2 = 1;
    } else {
      i = b1 - 1;
      i1 = -1;
      j = 0;
      i2 = -1;
    } 
    while (i != i1) {
      View view = this.K[i];
      b b2 = (b)view.getLayoutParams();
      int i4 = K1((RecyclerView.v)stringBuilder, parama0, P(view));
      b2.f = i4;
      b2.e = j;
      j += i4;
      i += i2;
    } 
    float f = 0.0F;
    int i1 = 0;
    for (i = 0; i1 < b1; i = j) {
      View view = this.K[i1];
      if (paramc.l == null) {
        if (n) {
          b(view);
        } else {
          c(view, 0, false);
        } 
      } else if (n) {
        c(view, -1, true);
      } else {
        c(view, 0, true);
      } 
      Rect rect = this.O;
      RecyclerView recyclerView = this.b;
      if (recyclerView == null) {
        rect.set(0, 0, 0, 0);
      } else {
        rect.set(recyclerView.getItemDecorInsetsForChild(view));
      } 
      L1(view, i3, false);
      i2 = this.u.c(view);
      j = i;
      if (i2 > i)
        j = i2; 
      b b2 = (b)view.getLayoutParams();
      float f2 = this.u.d(view) * 1.0F / b2.f;
      float f1 = f;
      if (f2 > f)
        f1 = f2; 
      i1++;
      f = f1;
    } 
    int j = i;
    if (k) {
      F1(Math.max(Math.round(f * this.I), m));
      k = 0;
      i = 0;
      while (true) {
        j = i;
        if (k < b1) {
          View view = this.K[k];
          L1(view, 1073741824, true);
          m = this.u.c(view);
          j = i;
          if (m > i)
            j = m; 
          k++;
          i = j;
          continue;
        } 
        break;
      } 
    } 
    for (i = 0; i < b1; i++) {
      View view = this.K[i];
      if (this.u.c(view) != j) {
        b b2 = (b)view.getLayoutParams();
        Rect rect = b2.b;
        k = rect.top + rect.bottom + b2.topMargin + b2.bottomMargin;
        m = rect.left + rect.right + b2.leftMargin + b2.rightMargin;
        n = H1(b2.e, b2.f);
        if (this.s == 1) {
          m = RecyclerView.o.z(n, 1073741824, m, b2.width, false);
          k = View.MeasureSpec.makeMeasureSpec(j - k, 1073741824);
        } else {
          m = View.MeasureSpec.makeMeasureSpec(j - m, 1073741824);
          k = RecyclerView.o.z(n, 1073741824, k, b2.height, false);
        } 
        M1(view, m, k, true);
      } 
    } 
    paramb.a = j;
    if (this.s == 1) {
      if (paramc.f == -1) {
        k = paramc.b;
        i = k - j;
        j = k;
      } else {
        i = paramc.b;
        j += i;
      } 
      k = 0;
      m = 0;
    } else {
      if (paramc.f == -1) {
        i = paramc.b;
        j = i - j;
      } else {
        k = paramc.b;
        i = j + k;
        j = k;
      } 
      i1 = 0;
      k = i;
      n = 0;
      m = j;
      i = i1;
      j = n;
    } 
    int n = 0;
    while (true) {
      View view;
      if (n < b1) {
        view = this.K[n];
        b b2 = (b)view.getLayoutParams();
        if (this.s == 1) {
          if (s1()) {
            k = M() + this.J[this.I - b2.e];
            m = k - this.u.d(view);
          } else {
            k = M() + this.J[b2.e];
            m = this.u.d(view);
            i1 = k;
            k = m + k;
            m = j;
            j = i;
            i = i1;
            Y(view, i, j, k, m);
          } 
        } else {
          i = O();
          i = this.J[b2.e] + i;
          j = this.u.d(view) + i;
        } 
        i1 = j;
        j = i;
        i = m;
        m = i1;
      } else {
        break;
      } 
      Y(view, i, j, k, m);
    } 
    Arrays.fill((Object[])this.K, (Object)null);
  }
  
  public RecyclerView.p u() {
    return (this.s == 0) ? new b(-2, -1) : new b(-1, -2);
  }
  
  public void u1(RecyclerView.v paramv, RecyclerView.a0 parama0, LinearLayoutManager.a parama, int paramInt) {
    O1();
    if (parama0.b() > 0 && !parama0.g) {
      if (paramInt == 1) {
        paramInt = 1;
      } else {
        paramInt = 0;
      } 
      int i = J1(paramv, parama0, parama.b);
      if (paramInt != 0) {
        while (i > 0) {
          paramInt = parama.b;
          if (paramInt > 0) {
            parama.b = --paramInt;
            i = J1(paramv, parama0, paramInt);
          } 
        } 
      } else {
        int j = parama0.b();
        paramInt = parama.b;
        while (paramInt < j - 1) {
          int m = paramInt + 1;
          int k = J1(paramv, parama0, m);
          if (k > i) {
            paramInt = m;
            i = k;
          } 
        } 
        parama.b = paramInt;
      } 
    } 
    G1();
  }
  
  public RecyclerView.p v(Context paramContext, AttributeSet paramAttributeSet) {
    return new b(paramContext, paramAttributeSet);
  }
  
  public RecyclerView.p w(ViewGroup.LayoutParams paramLayoutParams) {
    return (paramLayoutParams instanceof ViewGroup.MarginLayoutParams) ? new b((ViewGroup.MarginLayoutParams)paramLayoutParams) : new b(paramLayoutParams);
  }
  
  public static final class a extends c {}
  
  public static class b extends RecyclerView.p {
    public int e = -1;
    
    public int f = 0;
    
    public b(int param1Int1, int param1Int2) {
      super(param1Int1, param1Int2);
    }
    
    public b(Context param1Context, AttributeSet param1AttributeSet) {
      super(param1Context, param1AttributeSet);
    }
    
    public b(ViewGroup.LayoutParams param1LayoutParams) {
      super(param1LayoutParams);
    }
    
    public b(ViewGroup.MarginLayoutParams param1MarginLayoutParams) {
      super(param1MarginLayoutParams);
    }
  }
  
  public static abstract class c {
    public final SparseIntArray a = new SparseIntArray();
    
    public final SparseIntArray b = new SparseIntArray();
    
    public boolean c = false;
    
    public boolean d = false;
    
    public int a(int param1Int1, int param1Int2) {
      if (!this.d)
        return c(param1Int1, param1Int2); 
      int i = this.b.get(param1Int1, -1);
      if (i != -1)
        return i; 
      param1Int2 = c(param1Int1, param1Int2);
      this.b.put(param1Int1, param1Int2);
      return param1Int2;
    }
    
    public int b(int param1Int1, int param1Int2) {
      if (!this.c)
        return param1Int1 % param1Int2; 
      int i = this.a.get(param1Int1, -1);
      if (i != -1)
        return i; 
      param1Int2 = param1Int1 % param1Int2;
      this.a.put(param1Int1, param1Int2);
      return param1Int2;
    }
    
    public int c(int param1Int1, int param1Int2) {
      // Byte code:
      //   0: aload_0
      //   1: getfield d : Z
      //   4: ifeq -> 156
      //   7: aload_0
      //   8: getfield b : Landroid/util/SparseIntArray;
      //   11: astore #9
      //   13: aload #9
      //   15: invokevirtual size : ()I
      //   18: iconst_1
      //   19: isub
      //   20: istore #4
      //   22: iconst_0
      //   23: istore_3
      //   24: iload_3
      //   25: iload #4
      //   27: if_icmpgt -> 66
      //   30: iload_3
      //   31: iload #4
      //   33: iadd
      //   34: iconst_1
      //   35: iushr
      //   36: istore #5
      //   38: aload #9
      //   40: iload #5
      //   42: invokevirtual keyAt : (I)I
      //   45: iload_1
      //   46: if_icmpge -> 57
      //   49: iload #5
      //   51: iconst_1
      //   52: iadd
      //   53: istore_3
      //   54: goto -> 24
      //   57: iload #5
      //   59: iconst_1
      //   60: isub
      //   61: istore #4
      //   63: goto -> 24
      //   66: iinc #3, -1
      //   69: iload_3
      //   70: iflt -> 92
      //   73: iload_3
      //   74: aload #9
      //   76: invokevirtual size : ()I
      //   79: if_icmpge -> 92
      //   82: aload #9
      //   84: iload_3
      //   85: invokevirtual keyAt : (I)I
      //   88: istore_3
      //   89: goto -> 94
      //   92: iconst_m1
      //   93: istore_3
      //   94: iload_3
      //   95: iconst_m1
      //   96: if_icmpeq -> 156
      //   99: aload_0
      //   100: getfield b : Landroid/util/SparseIntArray;
      //   103: iload_3
      //   104: invokevirtual get : (I)I
      //   107: istore #7
      //   109: iload_3
      //   110: iconst_1
      //   111: iadd
      //   112: istore #6
      //   114: aload_0
      //   115: iload_3
      //   116: iload_2
      //   117: invokevirtual b : (II)I
      //   120: iconst_1
      //   121: iadd
      //   122: istore #8
      //   124: iload #8
      //   126: istore #4
      //   128: iload #7
      //   130: istore_3
      //   131: iload #6
      //   133: istore #5
      //   135: iload #8
      //   137: iload_2
      //   138: if_icmpne -> 164
      //   141: iload #7
      //   143: iconst_1
      //   144: iadd
      //   145: istore_3
      //   146: iconst_0
      //   147: istore #4
      //   149: iload #6
      //   151: istore #5
      //   153: goto -> 164
      //   156: iconst_0
      //   157: istore #4
      //   159: iconst_0
      //   160: istore_3
      //   161: iconst_0
      //   162: istore #5
      //   164: iload #5
      //   166: iload_1
      //   167: if_icmpge -> 223
      //   170: iload #4
      //   172: iconst_1
      //   173: iadd
      //   174: istore #7
      //   176: iload #7
      //   178: iload_2
      //   179: if_icmpne -> 193
      //   182: iload_3
      //   183: iconst_1
      //   184: iadd
      //   185: istore #6
      //   187: iconst_0
      //   188: istore #4
      //   190: goto -> 214
      //   193: iload #7
      //   195: istore #4
      //   197: iload_3
      //   198: istore #6
      //   200: iload #7
      //   202: iload_2
      //   203: if_icmple -> 214
      //   206: iload_3
      //   207: iconst_1
      //   208: iadd
      //   209: istore #6
      //   211: iconst_1
      //   212: istore #4
      //   214: iinc #5, 1
      //   217: iload #6
      //   219: istore_3
      //   220: goto -> 164
      //   223: iload_3
      //   224: istore_1
      //   225: iload #4
      //   227: iconst_1
      //   228: iadd
      //   229: iload_2
      //   230: if_icmple -> 237
      //   233: iload_3
      //   234: iconst_1
      //   235: iadd
      //   236: istore_1
      //   237: iload_1
      //   238: ireturn
    }
  }
}


/* Location:              C:\Users\panch\Downloads\dvba_v1.1.0-dex2jar.jar!\androidx\recyclerview\widget\GridLayoutManager.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */