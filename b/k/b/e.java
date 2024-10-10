package b.k.b;

import android.content.Context;
import android.util.Log;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.animation.Interpolator;
import android.widget.OverScroller;
import b.i.m.l;
import java.util.Arrays;

public class e {
  public static final Interpolator v = new a();
  
  public int a;
  
  public int b;
  
  public int c = -1;
  
  public float[] d;
  
  public float[] e;
  
  public float[] f;
  
  public float[] g;
  
  public int[] h;
  
  public int[] i;
  
  public int[] j;
  
  public int k;
  
  public VelocityTracker l;
  
  public float m;
  
  public float n;
  
  public int o;
  
  public OverScroller p;
  
  public final c q;
  
  public View r;
  
  public boolean s;
  
  public final ViewGroup t;
  
  public final Runnable u = new b(this);
  
  public e(Context paramContext, ViewGroup paramViewGroup, c paramc) {
    if (paramc != null) {
      this.t = paramViewGroup;
      this.q = paramc;
      ViewConfiguration viewConfiguration = ViewConfiguration.get(paramContext);
      this.o = (int)((paramContext.getResources().getDisplayMetrics()).density * 20.0F + 0.5F);
      this.b = viewConfiguration.getScaledTouchSlop();
      this.m = viewConfiguration.getScaledMaximumFlingVelocity();
      this.n = viewConfiguration.getScaledMinimumFlingVelocity();
      this.p = new OverScroller(paramContext, v);
      return;
    } 
    throw new IllegalArgumentException("Callback may not be null");
  }
  
  public void a() {
    this.c = -1;
    float[] arrayOfFloat = this.d;
    if (arrayOfFloat != null) {
      Arrays.fill(arrayOfFloat, 0.0F);
      Arrays.fill(this.e, 0.0F);
      Arrays.fill(this.f, 0.0F);
      Arrays.fill(this.g, 0.0F);
      Arrays.fill(this.h, 0);
      Arrays.fill(this.i, 0);
      Arrays.fill(this.j, 0);
      this.k = 0;
    } 
    VelocityTracker velocityTracker = this.l;
    if (velocityTracker != null) {
      velocityTracker.recycle();
      this.l = null;
    } 
  }
  
  public void b(View paramView, int paramInt) {
    if (paramView.getParent() == this.t) {
      this.r = paramView;
      this.c = paramInt;
      this.q.e(paramView, paramInt);
      s(1);
      return;
    } 
    StringBuilder stringBuilder = c.a.a.a.a.e("captureChildView: parameter must be a descendant of the ViewDragHelper's tracked parent view (");
    stringBuilder.append(this.t);
    stringBuilder.append(")");
    throw new IllegalArgumentException(stringBuilder.toString());
  }
  
  public final boolean c(float paramFloat1, float paramFloat2, int paramInt1, int paramInt2) {
    paramFloat1 = Math.abs(paramFloat1);
    paramFloat2 = Math.abs(paramFloat2);
    int i = this.h[paramInt1];
    boolean bool2 = false;
    boolean bool1 = bool2;
    if ((i & paramInt2) == paramInt2) {
      bool1 = bool2;
      if ((0x0 & paramInt2) != 0) {
        bool1 = bool2;
        if ((this.j[paramInt1] & paramInt2) != paramInt2) {
          bool1 = bool2;
          if ((this.i[paramInt1] & paramInt2) != paramInt2) {
            i = this.b;
            if (paramFloat1 <= i && paramFloat2 <= i) {
              bool1 = bool2;
            } else {
              if (paramFloat1 >= paramFloat2 * 0.5F || this.q != null) {
                bool1 = bool2;
                if ((this.i[paramInt1] & paramInt2) == 0) {
                  bool1 = bool2;
                  if (paramFloat1 > this.b)
                    bool1 = true; 
                } 
                return bool1;
              } 
              throw null;
            } 
          } 
        } 
      } 
    } 
    return bool1;
  }
  
  public final boolean d(View paramView, float paramFloat1, float paramFloat2) {
    int i;
    boolean bool1;
    boolean bool2 = false;
    boolean bool3 = false;
    boolean bool4 = false;
    if (paramView == null)
      return false; 
    if (this.q.c(paramView) > 0) {
      i = 1;
    } else {
      i = 0;
    } 
    if (this.q.d(paramView) > 0) {
      bool1 = true;
    } else {
      bool1 = false;
    } 
    if (i && bool1) {
      i = this.b;
      bool2 = bool4;
      if (paramFloat2 * paramFloat2 + paramFloat1 * paramFloat1 > (i * i))
        bool2 = true; 
      return bool2;
    } 
    if (i != 0) {
      if (Math.abs(paramFloat1) > this.b)
        bool2 = true; 
      return bool2;
    } 
    bool2 = bool3;
    if (bool1) {
      bool2 = bool3;
      if (Math.abs(paramFloat2) > this.b)
        bool2 = true; 
    } 
    return bool2;
  }
  
  public final float e(float paramFloat1, float paramFloat2, float paramFloat3) {
    float f = Math.abs(paramFloat1);
    if (f < paramFloat2)
      return 0.0F; 
    if (f > paramFloat3) {
      if (paramFloat1 <= 0.0F)
        paramFloat3 = -paramFloat3; 
      return paramFloat3;
    } 
    return paramFloat1;
  }
  
  public final int f(int paramInt1, int paramInt2, int paramInt3) {
    int i = Math.abs(paramInt1);
    if (i < paramInt2)
      return 0; 
    if (i > paramInt3) {
      if (paramInt1 <= 0)
        paramInt3 = -paramInt3; 
      return paramInt3;
    } 
    return paramInt1;
  }
  
  public final void g(int paramInt) {
    if (this.d != null) {
      int j = this.k;
      boolean bool = true;
      int i = 1 << paramInt;
      if ((j & i) == 0)
        bool = false; 
      if (bool) {
        this.d[paramInt] = 0.0F;
        this.e[paramInt] = 0.0F;
        this.f[paramInt] = 0.0F;
        this.g[paramInt] = 0.0F;
        this.h[paramInt] = 0;
        this.i[paramInt] = 0;
        this.j[paramInt] = 0;
        this.k &= i ^ 0xFFFFFFFF;
      } 
    } 
  }
  
  public final int h(int paramInt1, int paramInt2, int paramInt3) {
    if (paramInt1 == 0)
      return 0; 
    int i = this.t.getWidth();
    int j = i / 2;
    float f2 = Math.min(1.0F, Math.abs(paramInt1) / i);
    float f1 = j;
    f2 = (float)Math.sin(((f2 - 0.5F) * 0.47123894F));
    paramInt2 = Math.abs(paramInt2);
    if (paramInt2 > 0) {
      paramInt1 = Math.round(Math.abs((f2 * f1 + f1) / paramInt2) * 1000.0F) * 4;
    } else {
      paramInt1 = (int)((Math.abs(paramInt1) / paramInt3 + 1.0F) * 256.0F);
    } 
    return Math.min(paramInt1, 600);
  }
  
  public boolean i(boolean paramBoolean) {
    int i = this.a;
    boolean bool = false;
    if (i == 2) {
      boolean bool2 = this.p.computeScrollOffset();
      i = this.p.getCurrX();
      int k = this.p.getCurrY();
      int m = i - this.r.getLeft();
      int j = k - this.r.getTop();
      if (m != 0)
        l.J(this.r, m); 
      if (j != 0)
        l.K(this.r, j); 
      if (m != 0 || j != 0)
        this.q.g(this.r, i, k, m, j); 
      boolean bool1 = bool2;
      if (bool2) {
        bool1 = bool2;
        if (i == this.p.getFinalX()) {
          bool1 = bool2;
          if (k == this.p.getFinalY()) {
            this.p.abortAnimation();
            bool1 = false;
          } 
        } 
      } 
      if (!bool1)
        if (paramBoolean) {
          this.t.post(this.u);
        } else {
          s(0);
        }  
    } 
    paramBoolean = bool;
    if (this.a == 2)
      paramBoolean = true; 
    return paramBoolean;
  }
  
  public final void j(float paramFloat1, float paramFloat2) {
    this.s = true;
    this.q.h(this.r, paramFloat1, paramFloat2);
    this.s = false;
    if (this.a == 1)
      s(0); 
  }
  
  public View k(int paramInt1, int paramInt2) {
    int i = this.t.getChildCount() - 1;
    while (i >= 0) {
      ViewGroup viewGroup = this.t;
      if (this.q != null) {
        View view = viewGroup.getChildAt(i);
        if (paramInt1 >= view.getLeft() && paramInt1 < view.getRight() && paramInt2 >= view.getTop() && paramInt2 < view.getBottom())
          return view; 
        i--;
        continue;
      } 
      throw null;
    } 
    return null;
  }
  
  public final boolean l(int paramInt1, int paramInt2, int paramInt3, int paramInt4) {
    int j = this.r.getLeft();
    int i = this.r.getTop();
    paramInt1 -= j;
    paramInt2 -= i;
    if (paramInt1 == 0 && paramInt2 == 0) {
      this.p.abortAnimation();
      s(0);
      return false;
    } 
    View view = this.r;
    paramInt3 = f(paramInt3, (int)this.n, (int)this.m);
    paramInt4 = f(paramInt4, (int)this.n, (int)this.m);
    int m = Math.abs(paramInt1);
    int i3 = Math.abs(paramInt2);
    int k = Math.abs(paramInt3);
    int n = Math.abs(paramInt4);
    int i1 = k + n;
    int i2 = m + i3;
    if (paramInt3 != 0) {
      f2 = k;
      f1 = i1;
    } else {
      f2 = m;
      f1 = i2;
    } 
    float f3 = f2 / f1;
    if (paramInt4 != 0) {
      f1 = n;
      f2 = i1;
    } else {
      f1 = i3;
      f2 = i2;
    } 
    float f2 = f1 / f2;
    paramInt3 = h(paramInt1, paramInt3, this.q.c(view));
    paramInt4 = h(paramInt2, paramInt4, this.q.d(view));
    float f1 = paramInt3;
    paramInt3 = (int)(paramInt4 * f2 + f1 * f3);
    this.p.startScroll(j, i, paramInt1, paramInt2, paramInt3);
    s(2);
    return true;
  }
  
  public final boolean m(int paramInt) {
    boolean bool;
    if ((this.k & 1 << paramInt) != 0) {
      bool = true;
    } else {
      bool = false;
    } 
    if (!bool) {
      StringBuilder stringBuilder = new StringBuilder();
      stringBuilder.append("Ignoring pointerId=");
      stringBuilder.append(paramInt);
      stringBuilder.append(" because ACTION_DOWN was not received ");
      stringBuilder.append("for this pointer before ACTION_MOVE. It likely happened because ");
      stringBuilder.append(" ViewDragHelper did not receive all the events in the event stream.");
      Log.e("ViewDragHelper", stringBuilder.toString());
      return false;
    } 
    return true;
  }
  
  public void n(MotionEvent paramMotionEvent) {
    // Byte code:
    //   0: aload_1
    //   1: invokevirtual getActionMasked : ()I
    //   4: istore #10
    //   6: aload_1
    //   7: invokevirtual getActionIndex : ()I
    //   10: istore #9
    //   12: iload #10
    //   14: ifne -> 21
    //   17: aload_0
    //   18: invokevirtual a : ()V
    //   21: aload_0
    //   22: getfield l : Landroid/view/VelocityTracker;
    //   25: ifnonnull -> 35
    //   28: aload_0
    //   29: invokestatic obtain : ()Landroid/view/VelocityTracker;
    //   32: putfield l : Landroid/view/VelocityTracker;
    //   35: aload_0
    //   36: getfield l : Landroid/view/VelocityTracker;
    //   39: aload_1
    //   40: invokevirtual addMovement : (Landroid/view/MotionEvent;)V
    //   43: iconst_0
    //   44: istore #7
    //   46: iconst_0
    //   47: istore #8
    //   49: iconst_0
    //   50: istore #6
    //   52: iload #10
    //   54: ifeq -> 822
    //   57: iload #10
    //   59: iconst_1
    //   60: if_icmpeq -> 803
    //   63: iload #10
    //   65: iconst_2
    //   66: if_icmpeq -> 425
    //   69: iload #10
    //   71: iconst_3
    //   72: if_icmpeq -> 408
    //   75: iload #10
    //   77: iconst_5
    //   78: if_icmpeq -> 234
    //   81: iload #10
    //   83: bipush #6
    //   85: if_icmpeq -> 91
    //   88: goto -> 888
    //   91: aload_1
    //   92: iload #9
    //   94: invokevirtual getPointerId : (I)I
    //   97: istore #7
    //   99: aload_0
    //   100: getfield a : I
    //   103: iconst_1
    //   104: if_icmpne -> 225
    //   107: iload #7
    //   109: aload_0
    //   110: getfield c : I
    //   113: if_icmpne -> 225
    //   116: aload_1
    //   117: invokevirtual getPointerCount : ()I
    //   120: istore #8
    //   122: iload #6
    //   124: iload #8
    //   126: if_icmpge -> 212
    //   129: aload_1
    //   130: iload #6
    //   132: invokevirtual getPointerId : (I)I
    //   135: istore #9
    //   137: iload #9
    //   139: aload_0
    //   140: getfield c : I
    //   143: if_icmpne -> 149
    //   146: goto -> 206
    //   149: aload_1
    //   150: iload #6
    //   152: invokevirtual getX : (I)F
    //   155: fstore_3
    //   156: aload_1
    //   157: iload #6
    //   159: invokevirtual getY : (I)F
    //   162: fstore_2
    //   163: aload_0
    //   164: fload_3
    //   165: f2i
    //   166: fload_2
    //   167: f2i
    //   168: invokevirtual k : (II)Landroid/view/View;
    //   171: astore #14
    //   173: aload_0
    //   174: getfield r : Landroid/view/View;
    //   177: astore #13
    //   179: aload #14
    //   181: aload #13
    //   183: if_acmpne -> 206
    //   186: aload_0
    //   187: aload #13
    //   189: iload #9
    //   191: invokevirtual v : (Landroid/view/View;I)Z
    //   194: ifeq -> 206
    //   197: aload_0
    //   198: getfield c : I
    //   201: istore #6
    //   203: goto -> 215
    //   206: iinc #6, 1
    //   209: goto -> 122
    //   212: iconst_m1
    //   213: istore #6
    //   215: iload #6
    //   217: iconst_m1
    //   218: if_icmpne -> 225
    //   221: aload_0
    //   222: invokevirtual o : ()V
    //   225: aload_0
    //   226: iload #7
    //   228: invokevirtual g : (I)V
    //   231: goto -> 888
    //   234: aload_1
    //   235: iload #9
    //   237: invokevirtual getPointerId : (I)I
    //   240: istore #8
    //   242: aload_1
    //   243: iload #9
    //   245: invokevirtual getX : (I)F
    //   248: fstore_3
    //   249: aload_1
    //   250: iload #9
    //   252: invokevirtual getY : (I)F
    //   255: fstore_2
    //   256: aload_0
    //   257: fload_3
    //   258: fload_2
    //   259: iload #8
    //   261: invokevirtual q : (FFI)V
    //   264: aload_0
    //   265: getfield a : I
    //   268: ifne -> 310
    //   271: aload_0
    //   272: aload_0
    //   273: fload_3
    //   274: f2i
    //   275: fload_2
    //   276: f2i
    //   277: invokevirtual k : (II)Landroid/view/View;
    //   280: iload #8
    //   282: invokevirtual v : (Landroid/view/View;I)Z
    //   285: pop
    //   286: aload_0
    //   287: getfield h : [I
    //   290: iload #8
    //   292: iaload
    //   293: iconst_0
    //   294: iand
    //   295: ifeq -> 888
    //   298: aload_0
    //   299: getfield q : Lb/k/b/e$c;
    //   302: ifnull -> 308
    //   305: goto -> 888
    //   308: aconst_null
    //   309: athrow
    //   310: fload_3
    //   311: f2i
    //   312: istore #10
    //   314: fload_2
    //   315: f2i
    //   316: istore #9
    //   318: aload_0
    //   319: getfield r : Landroid/view/View;
    //   322: astore_1
    //   323: aload_1
    //   324: ifnonnull -> 334
    //   327: iload #7
    //   329: istore #6
    //   331: goto -> 389
    //   334: iload #7
    //   336: istore #6
    //   338: iload #10
    //   340: aload_1
    //   341: invokevirtual getLeft : ()I
    //   344: if_icmplt -> 389
    //   347: iload #7
    //   349: istore #6
    //   351: iload #10
    //   353: aload_1
    //   354: invokevirtual getRight : ()I
    //   357: if_icmpge -> 389
    //   360: iload #7
    //   362: istore #6
    //   364: iload #9
    //   366: aload_1
    //   367: invokevirtual getTop : ()I
    //   370: if_icmplt -> 389
    //   373: iload #7
    //   375: istore #6
    //   377: iload #9
    //   379: aload_1
    //   380: invokevirtual getBottom : ()I
    //   383: if_icmpge -> 389
    //   386: iconst_1
    //   387: istore #6
    //   389: iload #6
    //   391: ifeq -> 888
    //   394: aload_0
    //   395: aload_0
    //   396: getfield r : Landroid/view/View;
    //   399: iload #8
    //   401: invokevirtual v : (Landroid/view/View;I)Z
    //   404: pop
    //   405: goto -> 888
    //   408: aload_0
    //   409: getfield a : I
    //   412: iconst_1
    //   413: if_icmpne -> 815
    //   416: aload_0
    //   417: fconst_0
    //   418: fconst_0
    //   419: invokevirtual j : (FF)V
    //   422: goto -> 815
    //   425: aload_0
    //   426: getfield a : I
    //   429: iconst_1
    //   430: if_icmpne -> 666
    //   433: aload_0
    //   434: aload_0
    //   435: getfield c : I
    //   438: invokevirtual m : (I)Z
    //   441: ifne -> 447
    //   444: goto -> 888
    //   447: aload_1
    //   448: aload_0
    //   449: getfield c : I
    //   452: invokevirtual findPointerIndex : (I)I
    //   455: istore #6
    //   457: aload_1
    //   458: iload #6
    //   460: invokevirtual getX : (I)F
    //   463: fstore_3
    //   464: aload_1
    //   465: iload #6
    //   467: invokevirtual getY : (I)F
    //   470: fstore_2
    //   471: aload_0
    //   472: getfield f : [F
    //   475: astore #13
    //   477: aload_0
    //   478: getfield c : I
    //   481: istore #6
    //   483: fload_3
    //   484: aload #13
    //   486: iload #6
    //   488: faload
    //   489: fsub
    //   490: f2i
    //   491: istore #9
    //   493: fload_2
    //   494: aload_0
    //   495: getfield g : [F
    //   498: iload #6
    //   500: faload
    //   501: fsub
    //   502: f2i
    //   503: istore #10
    //   505: aload_0
    //   506: getfield r : Landroid/view/View;
    //   509: invokevirtual getLeft : ()I
    //   512: iload #9
    //   514: iadd
    //   515: istore #7
    //   517: aload_0
    //   518: getfield r : Landroid/view/View;
    //   521: invokevirtual getTop : ()I
    //   524: iload #10
    //   526: iadd
    //   527: istore #8
    //   529: aload_0
    //   530: getfield r : Landroid/view/View;
    //   533: invokevirtual getLeft : ()I
    //   536: istore #11
    //   538: aload_0
    //   539: getfield r : Landroid/view/View;
    //   542: invokevirtual getTop : ()I
    //   545: istore #12
    //   547: iload #7
    //   549: istore #6
    //   551: iload #9
    //   553: ifeq -> 585
    //   556: aload_0
    //   557: getfield q : Lb/k/b/e$c;
    //   560: aload_0
    //   561: getfield r : Landroid/view/View;
    //   564: iload #7
    //   566: iload #9
    //   568: invokevirtual a : (Landroid/view/View;II)I
    //   571: istore #6
    //   573: aload_0
    //   574: getfield r : Landroid/view/View;
    //   577: iload #6
    //   579: iload #11
    //   581: isub
    //   582: invokestatic J : (Landroid/view/View;I)V
    //   585: iload #8
    //   587: istore #7
    //   589: iload #10
    //   591: ifeq -> 623
    //   594: aload_0
    //   595: getfield q : Lb/k/b/e$c;
    //   598: aload_0
    //   599: getfield r : Landroid/view/View;
    //   602: iload #8
    //   604: iload #10
    //   606: invokevirtual b : (Landroid/view/View;II)I
    //   609: istore #7
    //   611: aload_0
    //   612: getfield r : Landroid/view/View;
    //   615: iload #7
    //   617: iload #12
    //   619: isub
    //   620: invokestatic K : (Landroid/view/View;I)V
    //   623: iload #9
    //   625: ifne -> 633
    //   628: iload #10
    //   630: ifeq -> 658
    //   633: aload_0
    //   634: getfield q : Lb/k/b/e$c;
    //   637: aload_0
    //   638: getfield r : Landroid/view/View;
    //   641: iload #6
    //   643: iload #7
    //   645: iload #6
    //   647: iload #11
    //   649: isub
    //   650: iload #7
    //   652: iload #12
    //   654: isub
    //   655: invokevirtual g : (Landroid/view/View;IIII)V
    //   658: aload_0
    //   659: aload_1
    //   660: invokevirtual r : (Landroid/view/MotionEvent;)V
    //   663: goto -> 888
    //   666: aload_1
    //   667: invokevirtual getPointerCount : ()I
    //   670: istore #7
    //   672: iload #8
    //   674: istore #6
    //   676: iload #6
    //   678: iload #7
    //   680: if_icmpge -> 658
    //   683: aload_1
    //   684: iload #6
    //   686: invokevirtual getPointerId : (I)I
    //   689: istore #8
    //   691: aload_0
    //   692: iload #8
    //   694: invokevirtual m : (I)Z
    //   697: ifne -> 703
    //   700: goto -> 797
    //   703: aload_1
    //   704: iload #6
    //   706: invokevirtual getX : (I)F
    //   709: fstore #5
    //   711: aload_1
    //   712: iload #6
    //   714: invokevirtual getY : (I)F
    //   717: fstore_2
    //   718: fload #5
    //   720: aload_0
    //   721: getfield d : [F
    //   724: iload #8
    //   726: faload
    //   727: fsub
    //   728: fstore_3
    //   729: fload_2
    //   730: aload_0
    //   731: getfield e : [F
    //   734: iload #8
    //   736: faload
    //   737: fsub
    //   738: fstore #4
    //   740: aload_0
    //   741: fload_3
    //   742: fload #4
    //   744: iload #8
    //   746: invokevirtual p : (FFI)V
    //   749: aload_0
    //   750: getfield a : I
    //   753: iconst_1
    //   754: if_icmpne -> 760
    //   757: goto -> 658
    //   760: aload_0
    //   761: fload #5
    //   763: f2i
    //   764: fload_2
    //   765: f2i
    //   766: invokevirtual k : (II)Landroid/view/View;
    //   769: astore #13
    //   771: aload_0
    //   772: aload #13
    //   774: fload_3
    //   775: fload #4
    //   777: invokevirtual d : (Landroid/view/View;FF)Z
    //   780: ifeq -> 797
    //   783: aload_0
    //   784: aload #13
    //   786: iload #8
    //   788: invokevirtual v : (Landroid/view/View;I)Z
    //   791: ifeq -> 797
    //   794: goto -> 658
    //   797: iinc #6, 1
    //   800: goto -> 676
    //   803: aload_0
    //   804: getfield a : I
    //   807: iconst_1
    //   808: if_icmpne -> 815
    //   811: aload_0
    //   812: invokevirtual o : ()V
    //   815: aload_0
    //   816: invokevirtual a : ()V
    //   819: goto -> 888
    //   822: aload_1
    //   823: invokevirtual getX : ()F
    //   826: fstore_3
    //   827: aload_1
    //   828: invokevirtual getY : ()F
    //   831: fstore_2
    //   832: aload_1
    //   833: iconst_0
    //   834: invokevirtual getPointerId : (I)I
    //   837: istore #6
    //   839: aload_0
    //   840: fload_3
    //   841: f2i
    //   842: fload_2
    //   843: f2i
    //   844: invokevirtual k : (II)Landroid/view/View;
    //   847: astore_1
    //   848: aload_0
    //   849: fload_3
    //   850: fload_2
    //   851: iload #6
    //   853: invokevirtual q : (FFI)V
    //   856: aload_0
    //   857: aload_1
    //   858: iload #6
    //   860: invokevirtual v : (Landroid/view/View;I)Z
    //   863: pop
    //   864: aload_0
    //   865: getfield h : [I
    //   868: iload #6
    //   870: iaload
    //   871: iconst_0
    //   872: iand
    //   873: ifeq -> 888
    //   876: aload_0
    //   877: getfield q : Lb/k/b/e$c;
    //   880: ifnull -> 886
    //   883: goto -> 888
    //   886: aconst_null
    //   887: athrow
    //   888: return
  }
  
  public final void o() {
    this.l.computeCurrentVelocity(1000, this.m);
    j(e(this.l.getXVelocity(this.c), this.n, this.m), e(this.l.getYVelocity(this.c), this.n, this.m));
  }
  
  public final void p(float paramFloat1, float paramFloat2, int paramInt) {
    int i = 1;
    if (!c(paramFloat1, paramFloat2, paramInt, 1))
      i = 0; 
    int j = i;
    if (c(paramFloat2, paramFloat1, paramInt, 4))
      j = i | 0x4; 
    i = j;
    if (c(paramFloat1, paramFloat2, paramInt, 2))
      i = j | 0x2; 
    j = i;
    if (c(paramFloat2, paramFloat1, paramInt, 8))
      j = i | 0x8; 
    if (j != 0) {
      int[] arrayOfInt = this.i;
      arrayOfInt[paramInt] = arrayOfInt[paramInt] | j;
      if (this.q == null)
        throw null; 
    } 
  }
  
  public final void q(float paramFloat1, float paramFloat2, int paramInt) {
    float[] arrayOfFloat = this.d;
    int j = 0;
    if (arrayOfFloat == null || arrayOfFloat.length <= paramInt) {
      int n = paramInt + 1;
      float[] arrayOfFloat2 = new float[n];
      float[] arrayOfFloat3 = new float[n];
      float[] arrayOfFloat4 = new float[n];
      float[] arrayOfFloat1 = new float[n];
      int[] arrayOfInt3 = new int[n];
      int[] arrayOfInt2 = new int[n];
      int[] arrayOfInt1 = new int[n];
      float[] arrayOfFloat5 = this.d;
      if (arrayOfFloat5 != null) {
        System.arraycopy(arrayOfFloat5, 0, arrayOfFloat2, 0, arrayOfFloat5.length);
        arrayOfFloat5 = this.e;
        System.arraycopy(arrayOfFloat5, 0, arrayOfFloat3, 0, arrayOfFloat5.length);
        arrayOfFloat5 = this.f;
        System.arraycopy(arrayOfFloat5, 0, arrayOfFloat4, 0, arrayOfFloat5.length);
        arrayOfFloat5 = this.g;
        System.arraycopy(arrayOfFloat5, 0, arrayOfFloat1, 0, arrayOfFloat5.length);
        int[] arrayOfInt4 = this.h;
        System.arraycopy(arrayOfInt4, 0, arrayOfInt3, 0, arrayOfInt4.length);
        arrayOfInt4 = this.i;
        System.arraycopy(arrayOfInt4, 0, arrayOfInt2, 0, arrayOfInt4.length);
        arrayOfInt4 = this.j;
        System.arraycopy(arrayOfInt4, 0, arrayOfInt1, 0, arrayOfInt4.length);
      } 
      this.d = arrayOfFloat2;
      this.e = arrayOfFloat3;
      this.f = arrayOfFloat4;
      this.g = arrayOfFloat1;
      this.h = arrayOfInt3;
      this.i = arrayOfInt2;
      this.j = arrayOfInt1;
    } 
    arrayOfFloat = this.d;
    this.f[paramInt] = paramFloat1;
    arrayOfFloat[paramInt] = paramFloat1;
    arrayOfFloat = this.e;
    this.g[paramInt] = paramFloat2;
    arrayOfFloat[paramInt] = paramFloat2;
    int[] arrayOfInt = this.h;
    int m = (int)paramFloat1;
    int k = (int)paramFloat2;
    if (m < this.t.getLeft() + this.o)
      j = 1; 
    int i = j;
    if (k < this.t.getTop() + this.o)
      i = j | 0x4; 
    j = i;
    if (m > this.t.getRight() - this.o)
      j = i | 0x2; 
    i = j;
    if (k > this.t.getBottom() - this.o)
      i = j | 0x8; 
    arrayOfInt[paramInt] = i;
    this.k |= 1 << paramInt;
  }
  
  public final void r(MotionEvent paramMotionEvent) {
    int i = paramMotionEvent.getPointerCount();
    for (byte b = 0; b < i; b++) {
      int j = paramMotionEvent.getPointerId(b);
      if (m(j)) {
        float f1 = paramMotionEvent.getX(b);
        float f2 = paramMotionEvent.getY(b);
        this.f[j] = f1;
        this.g[j] = f2;
      } 
    } 
  }
  
  public void s(int paramInt) {
    this.t.removeCallbacks(this.u);
    if (this.a != paramInt) {
      this.a = paramInt;
      this.q.f(paramInt);
      if (this.a == 0)
        this.r = null; 
    } 
  }
  
  public boolean t(int paramInt1, int paramInt2) {
    if (this.s)
      return l(paramInt1, paramInt2, (int)this.l.getXVelocity(this.c), (int)this.l.getYVelocity(this.c)); 
    throw new IllegalStateException("Cannot settleCapturedViewAt outside of a call to Callback#onViewReleased");
  }
  
  public boolean u(MotionEvent paramMotionEvent) {
    // Byte code:
    //   0: aload_1
    //   1: invokevirtual getActionMasked : ()I
    //   4: istore #7
    //   6: aload_1
    //   7: invokevirtual getActionIndex : ()I
    //   10: istore #6
    //   12: iload #7
    //   14: ifne -> 21
    //   17: aload_0
    //   18: invokevirtual a : ()V
    //   21: aload_0
    //   22: getfield l : Landroid/view/VelocityTracker;
    //   25: ifnonnull -> 35
    //   28: aload_0
    //   29: invokestatic obtain : ()Landroid/view/VelocityTracker;
    //   32: putfield l : Landroid/view/VelocityTracker;
    //   35: aload_0
    //   36: getfield l : Landroid/view/VelocityTracker;
    //   39: aload_1
    //   40: invokevirtual addMovement : (Landroid/view/MotionEvent;)V
    //   43: iconst_1
    //   44: istore #16
    //   46: iload #7
    //   48: ifeq -> 507
    //   51: iload #7
    //   53: iconst_1
    //   54: if_icmpeq -> 500
    //   57: iload #7
    //   59: iconst_2
    //   60: if_icmpeq -> 197
    //   63: iload #7
    //   65: iconst_3
    //   66: if_icmpeq -> 500
    //   69: iload #7
    //   71: iconst_5
    //   72: if_icmpeq -> 98
    //   75: iload #7
    //   77: bipush #6
    //   79: if_icmpeq -> 85
    //   82: goto -> 504
    //   85: aload_0
    //   86: aload_1
    //   87: iload #6
    //   89: invokevirtual getPointerId : (I)I
    //   92: invokevirtual g : (I)V
    //   95: goto -> 504
    //   98: aload_1
    //   99: iload #6
    //   101: invokevirtual getPointerId : (I)I
    //   104: istore #7
    //   106: aload_1
    //   107: iload #6
    //   109: invokevirtual getX : (I)F
    //   112: fstore_3
    //   113: aload_1
    //   114: iload #6
    //   116: invokevirtual getY : (I)F
    //   119: fstore_2
    //   120: aload_0
    //   121: fload_3
    //   122: fload_2
    //   123: iload #7
    //   125: invokevirtual q : (FFI)V
    //   128: aload_0
    //   129: getfield a : I
    //   132: istore #6
    //   134: iload #6
    //   136: ifne -> 163
    //   139: aload_0
    //   140: getfield h : [I
    //   143: iload #7
    //   145: iaload
    //   146: iconst_0
    //   147: iand
    //   148: ifeq -> 504
    //   151: aload_0
    //   152: getfield q : Lb/k/b/e$c;
    //   155: ifnull -> 161
    //   158: goto -> 504
    //   161: aconst_null
    //   162: athrow
    //   163: iload #6
    //   165: iconst_2
    //   166: if_icmpne -> 504
    //   169: aload_0
    //   170: fload_3
    //   171: f2i
    //   172: fload_2
    //   173: f2i
    //   174: invokevirtual k : (II)Landroid/view/View;
    //   177: astore_1
    //   178: aload_1
    //   179: aload_0
    //   180: getfield r : Landroid/view/View;
    //   183: if_acmpne -> 504
    //   186: aload_0
    //   187: aload_1
    //   188: iload #7
    //   190: invokevirtual v : (Landroid/view/View;I)Z
    //   193: pop
    //   194: goto -> 504
    //   197: aload_0
    //   198: getfield d : [F
    //   201: ifnull -> 504
    //   204: aload_0
    //   205: getfield e : [F
    //   208: ifnonnull -> 214
    //   211: goto -> 504
    //   214: aload_1
    //   215: invokevirtual getPointerCount : ()I
    //   218: istore #8
    //   220: iconst_0
    //   221: istore #6
    //   223: iload #6
    //   225: iload #8
    //   227: if_icmpge -> 492
    //   230: aload_1
    //   231: iload #6
    //   233: invokevirtual getPointerId : (I)I
    //   236: istore #9
    //   238: aload_0
    //   239: iload #9
    //   241: invokevirtual m : (I)Z
    //   244: ifne -> 250
    //   247: goto -> 486
    //   250: aload_1
    //   251: iload #6
    //   253: invokevirtual getX : (I)F
    //   256: fstore #4
    //   258: aload_1
    //   259: iload #6
    //   261: invokevirtual getY : (I)F
    //   264: fstore_3
    //   265: fload #4
    //   267: aload_0
    //   268: getfield d : [F
    //   271: iload #9
    //   273: faload
    //   274: fsub
    //   275: fstore_2
    //   276: fload_3
    //   277: aload_0
    //   278: getfield e : [F
    //   281: iload #9
    //   283: faload
    //   284: fsub
    //   285: fstore #5
    //   287: aload_0
    //   288: fload #4
    //   290: f2i
    //   291: fload_3
    //   292: f2i
    //   293: invokevirtual k : (II)Landroid/view/View;
    //   296: astore #17
    //   298: aload #17
    //   300: ifnull -> 321
    //   303: aload_0
    //   304: aload #17
    //   306: fload_2
    //   307: fload #5
    //   309: invokevirtual d : (Landroid/view/View;FF)Z
    //   312: ifeq -> 321
    //   315: iconst_1
    //   316: istore #7
    //   318: goto -> 324
    //   321: iconst_0
    //   322: istore #7
    //   324: iload #7
    //   326: ifeq -> 447
    //   329: aload #17
    //   331: invokevirtual getLeft : ()I
    //   334: istore #10
    //   336: fload_2
    //   337: f2i
    //   338: istore #11
    //   340: aload_0
    //   341: getfield q : Lb/k/b/e$c;
    //   344: aload #17
    //   346: iload #10
    //   348: iload #11
    //   350: iadd
    //   351: iload #11
    //   353: invokevirtual a : (Landroid/view/View;II)I
    //   356: istore #11
    //   358: aload #17
    //   360: invokevirtual getTop : ()I
    //   363: istore #12
    //   365: fload #5
    //   367: f2i
    //   368: istore #13
    //   370: aload_0
    //   371: getfield q : Lb/k/b/e$c;
    //   374: aload #17
    //   376: iload #12
    //   378: iload #13
    //   380: iadd
    //   381: iload #13
    //   383: invokevirtual b : (Landroid/view/View;II)I
    //   386: istore #13
    //   388: aload_0
    //   389: getfield q : Lb/k/b/e$c;
    //   392: aload #17
    //   394: invokevirtual c : (Landroid/view/View;)I
    //   397: istore #15
    //   399: aload_0
    //   400: getfield q : Lb/k/b/e$c;
    //   403: aload #17
    //   405: invokevirtual d : (Landroid/view/View;)I
    //   408: istore #14
    //   410: iload #15
    //   412: ifeq -> 427
    //   415: iload #15
    //   417: ifle -> 447
    //   420: iload #11
    //   422: iload #10
    //   424: if_icmpne -> 447
    //   427: iload #14
    //   429: ifeq -> 492
    //   432: iload #14
    //   434: ifle -> 447
    //   437: iload #13
    //   439: iload #12
    //   441: if_icmpne -> 447
    //   444: goto -> 492
    //   447: aload_0
    //   448: fload_2
    //   449: fload #5
    //   451: iload #9
    //   453: invokevirtual p : (FFI)V
    //   456: aload_0
    //   457: getfield a : I
    //   460: iconst_1
    //   461: if_icmpne -> 467
    //   464: goto -> 492
    //   467: iload #7
    //   469: ifeq -> 486
    //   472: aload_0
    //   473: aload #17
    //   475: iload #9
    //   477: invokevirtual v : (Landroid/view/View;I)Z
    //   480: ifeq -> 486
    //   483: goto -> 492
    //   486: iinc #6, 1
    //   489: goto -> 223
    //   492: aload_0
    //   493: aload_1
    //   494: invokevirtual r : (Landroid/view/MotionEvent;)V
    //   497: goto -> 504
    //   500: aload_0
    //   501: invokevirtual a : ()V
    //   504: goto -> 589
    //   507: aload_1
    //   508: invokevirtual getX : ()F
    //   511: fstore_2
    //   512: aload_1
    //   513: invokevirtual getY : ()F
    //   516: fstore_3
    //   517: aload_1
    //   518: iconst_0
    //   519: invokevirtual getPointerId : (I)I
    //   522: istore #6
    //   524: aload_0
    //   525: fload_2
    //   526: fload_3
    //   527: iload #6
    //   529: invokevirtual q : (FFI)V
    //   532: aload_0
    //   533: fload_2
    //   534: f2i
    //   535: fload_3
    //   536: f2i
    //   537: invokevirtual k : (II)Landroid/view/View;
    //   540: astore_1
    //   541: aload_1
    //   542: aload_0
    //   543: getfield r : Landroid/view/View;
    //   546: if_acmpne -> 565
    //   549: aload_0
    //   550: getfield a : I
    //   553: iconst_2
    //   554: if_icmpne -> 565
    //   557: aload_0
    //   558: aload_1
    //   559: iload #6
    //   561: invokevirtual v : (Landroid/view/View;I)Z
    //   564: pop
    //   565: aload_0
    //   566: getfield h : [I
    //   569: iload #6
    //   571: iaload
    //   572: iconst_0
    //   573: iand
    //   574: ifeq -> 589
    //   577: aload_0
    //   578: getfield q : Lb/k/b/e$c;
    //   581: ifnull -> 587
    //   584: goto -> 589
    //   587: aconst_null
    //   588: athrow
    //   589: aload_0
    //   590: getfield a : I
    //   593: iconst_1
    //   594: if_icmpne -> 600
    //   597: goto -> 603
    //   600: iconst_0
    //   601: istore #16
    //   603: iload #16
    //   605: ireturn
  }
  
  public boolean v(View paramView, int paramInt) {
    if (paramView == this.r && this.c == paramInt)
      return true; 
    if (paramView != null && this.q.i(paramView, paramInt)) {
      this.c = paramInt;
      b(paramView, paramInt);
      return true;
    } 
    return false;
  }
  
  public static final class a implements Interpolator {
    public float getInterpolation(float param1Float) {
      param1Float--;
      return param1Float * param1Float * param1Float * param1Float * param1Float + 1.0F;
    }
  }
  
  public class b implements Runnable {
    public final e b;
    
    public b(e this$0) {}
    
    public void run() {
      this.b.s(0);
    }
  }
  
  public static abstract class c {
    public abstract int a(View param1View, int param1Int1, int param1Int2);
    
    public abstract int b(View param1View, int param1Int1, int param1Int2);
    
    public int c(View param1View) {
      return 0;
    }
    
    public int d(View param1View) {
      return 0;
    }
    
    public void e(View param1View, int param1Int) {}
    
    public abstract void f(int param1Int);
    
    public abstract void g(View param1View, int param1Int1, int param1Int2, int param1Int3, int param1Int4);
    
    public abstract void h(View param1View, float param1Float1, float param1Float2);
    
    public abstract boolean i(View param1View, int param1Int);
  }
}


/* Location:              C:\Users\panch\Downloads\dvba_v1.1.0-dex2jar.jar!\b\k\b\e.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */