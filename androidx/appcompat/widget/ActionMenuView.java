package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.Configuration;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.ContextThemeWrapper;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewDebug.ExportedProperty;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import androidx.appcompat.view.menu.ActionMenuItemView;
import b.b.o.i.g;
import b.b.o.i.i;
import b.b.o.i.m;
import b.b.o.i.n;
import b.b.p.d1;
import b.b.p.i0;

public class ActionMenuView extends i0 implements g.b, n {
  public int A;
  
  public e B;
  
  public g q;
  
  public Context r;
  
  public int s;
  
  public boolean t;
  
  public b.b.p.c u;
  
  public m.a v;
  
  public g.a w;
  
  public boolean x;
  
  public int y;
  
  public int z;
  
  public ActionMenuView(Context paramContext, AttributeSet paramAttributeSet) {
    super(paramContext, paramAttributeSet);
    setBaselineAligned(false);
    float f = (paramContext.getResources().getDisplayMetrics()).density;
    this.z = (int)(56.0F * f);
    this.A = (int)(f * 4.0F);
    this.r = paramContext;
    this.s = 0;
  }
  
  public static int u(View paramView, int paramInt1, int paramInt2, int paramInt3, int paramInt4) {
    ActionMenuItemView actionMenuItemView;
    c c1 = (c)paramView.getLayoutParams();
    int i = View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(paramInt3) - paramInt4, View.MeasureSpec.getMode(paramInt3));
    if (paramView instanceof ActionMenuItemView) {
      actionMenuItemView = (ActionMenuItemView)paramView;
    } else {
      actionMenuItemView = null;
    } 
    boolean bool2 = false;
    if (actionMenuItemView != null && actionMenuItemView.d()) {
      paramInt3 = 1;
    } else {
      paramInt3 = 0;
    } 
    paramInt4 = 2;
    if (paramInt2 > 0 && (paramInt3 == 0 || paramInt2 >= 2)) {
      paramView.measure(View.MeasureSpec.makeMeasureSpec(paramInt2 * paramInt1, -2147483648), i);
      int k = paramView.getMeasuredWidth();
      int j = k / paramInt1;
      paramInt2 = j;
      if (k % paramInt1 != 0)
        paramInt2 = j + 1; 
      if (paramInt3 != 0 && paramInt2 < 2)
        paramInt2 = paramInt4; 
    } else {
      paramInt2 = 0;
    } 
    boolean bool1 = bool2;
    if (!c1.c) {
      bool1 = bool2;
      if (paramInt3 != 0)
        bool1 = true; 
    } 
    c1.f = bool1;
    c1.d = paramInt2;
    paramView.measure(View.MeasureSpec.makeMeasureSpec(paramInt1 * paramInt2, 1073741824), i);
    return paramInt2;
  }
  
  public boolean b(i parami) {
    return this.q.s((MenuItem)parami, null, 0);
  }
  
  public boolean checkLayoutParams(ViewGroup.LayoutParams paramLayoutParams) {
    return paramLayoutParams instanceof c;
  }
  
  public void d(g paramg) {
    this.q = paramg;
  }
  
  public boolean dispatchPopulateAccessibilityEvent(AccessibilityEvent paramAccessibilityEvent) {
    return false;
  }
  
  public ViewGroup.LayoutParams generateLayoutParams(AttributeSet paramAttributeSet) {
    return (ViewGroup.LayoutParams)new c(getContext(), paramAttributeSet);
  }
  
  public Menu getMenu() {
    if (this.q == null) {
      Context context = getContext();
      g g1 = new g(context);
      this.q = g1;
      g1.e = new d(this);
      b.b.p.c c2 = new b.b.p.c(context);
      this.u = c2;
      c2.m = true;
      c2.n = true;
      m.a a1 = this.v;
      if (a1 == null)
        a1 = new b(); 
      ((b.b.o.i.b)c2).f = a1;
      this.q.b((m)this.u, this.r);
      b.b.p.c c1 = this.u;
      ((b.b.o.i.b)c1).i = this;
      this.q = ((b.b.o.i.b)c1).d;
    } 
    return (Menu)this.q;
  }
  
  public Drawable getOverflowIcon() {
    getMenu();
    b.b.p.c c1 = this.u;
    b.b.p.c.d d = c1.j;
    if (d != null) {
      Drawable drawable = d.getDrawable();
    } else if (c1.l) {
      Drawable drawable = c1.k;
    } else {
      d = null;
    } 
    return (Drawable)d;
  }
  
  public int getPopupTheme() {
    return this.s;
  }
  
  public int getWindowAnimations() {
    return 0;
  }
  
  public i0.a j(AttributeSet paramAttributeSet) {
    return new c(getContext(), paramAttributeSet);
  }
  
  public void onConfigurationChanged(Configuration paramConfiguration) {
    super.onConfigurationChanged(paramConfiguration);
    b.b.p.c c1 = this.u;
    if (c1 != null) {
      c1.h(false);
      if (this.u.m()) {
        this.u.i();
        this.u.n();
      } 
    } 
  }
  
  public void onDetachedFromWindow() {
    super.onDetachedFromWindow();
    b.b.p.c c1 = this.u;
    if (c1 != null)
      c1.e(); 
  }
  
  public void onLayout(boolean paramBoolean, int paramInt1, int paramInt2, int paramInt3, int paramInt4) {
    if (!this.x) {
      super.onLayout(paramBoolean, paramInt1, paramInt2, paramInt3, paramInt4);
      return;
    } 
    int j = getChildCount();
    int i = (paramInt4 - paramInt2) / 2;
    int k = getDividerWidth();
    int m = paramInt3 - paramInt1;
    paramInt1 = m - getPaddingRight() - getPaddingLeft();
    paramBoolean = d1.b((View)this);
    paramInt3 = 0;
    paramInt4 = 0;
    paramInt2 = 0;
    while (paramInt3 < j) {
      View view = getChildAt(paramInt3);
      if (view.getVisibility() != 8) {
        c c1 = (c)view.getLayoutParams();
        if (c1.c) {
          int i2;
          int i1 = view.getMeasuredWidth();
          paramInt4 = i1;
          if (t(paramInt3))
            paramInt4 = i1 + k; 
          int i3 = view.getMeasuredHeight();
          if (paramBoolean) {
            i1 = getPaddingLeft() + ((ViewGroup.MarginLayoutParams)c1).leftMargin;
            i2 = i1 + paramInt4;
          } else {
            i2 = getWidth() - getPaddingRight() - ((ViewGroup.MarginLayoutParams)c1).rightMargin;
            i1 = i2 - paramInt4;
          } 
          int i4 = i - i3 / 2;
          view.layout(i1, i4, i2, i3 + i4);
          paramInt1 -= paramInt4;
          paramInt4 = 1;
        } else {
          paramInt1 -= view.getMeasuredWidth() + ((ViewGroup.MarginLayoutParams)c1).leftMargin + ((ViewGroup.MarginLayoutParams)c1).rightMargin;
          t(paramInt3);
          paramInt2++;
        } 
      } 
      paramInt3++;
    } 
    if (j == 1 && paramInt4 == 0) {
      View view = getChildAt(0);
      paramInt1 = view.getMeasuredWidth();
      paramInt2 = view.getMeasuredHeight();
      paramInt3 = m / 2 - paramInt1 / 2;
      paramInt4 = i - paramInt2 / 2;
      view.layout(paramInt3, paramInt4, paramInt1 + paramInt3, paramInt2 + paramInt4);
      return;
    } 
    paramInt2 -= paramInt4 ^ 0x1;
    if (paramInt2 > 0) {
      paramInt1 /= paramInt2;
    } else {
      paramInt1 = 0;
    } 
    paramInt4 = Math.max(0, paramInt1);
    if (paramBoolean) {
      paramInt2 = getWidth() - getPaddingRight();
      paramInt1 = 0;
      while (paramInt1 < j) {
        View view = getChildAt(paramInt1);
        c c1 = (c)view.getLayoutParams();
        paramInt3 = paramInt2;
        if (view.getVisibility() != 8)
          if (c1.c) {
            paramInt3 = paramInt2;
          } else {
            paramInt2 -= ((ViewGroup.MarginLayoutParams)c1).rightMargin;
            int i1 = view.getMeasuredWidth();
            paramInt3 = view.getMeasuredHeight();
            int i2 = i - paramInt3 / 2;
            view.layout(paramInt2 - i1, i2, paramInt2, paramInt3 + i2);
            paramInt3 = paramInt2 - i1 + ((ViewGroup.MarginLayoutParams)c1).leftMargin + paramInt4;
          }  
        paramInt1++;
        paramInt2 = paramInt3;
      } 
    } else {
      paramInt2 = getPaddingLeft();
      paramInt1 = 0;
      while (paramInt1 < j) {
        View view = getChildAt(paramInt1);
        c c1 = (c)view.getLayoutParams();
        paramInt3 = paramInt2;
        if (view.getVisibility() != 8)
          if (c1.c) {
            paramInt3 = paramInt2;
          } else {
            int i1 = paramInt2 + ((ViewGroup.MarginLayoutParams)c1).leftMargin;
            int i2 = view.getMeasuredWidth();
            paramInt3 = view.getMeasuredHeight();
            paramInt2 = i - paramInt3 / 2;
            view.layout(i1, paramInt2, i1 + i2, paramInt3 + paramInt2);
            paramInt3 = i2 + ((ViewGroup.MarginLayoutParams)c1).rightMargin + paramInt4 + i1;
          }  
        paramInt1++;
        paramInt2 = paramInt3;
      } 
    } 
  }
  
  public void onMeasure(int paramInt1, int paramInt2) {
    // Byte code:
    //   0: aload_0
    //   1: getfield x : Z
    //   4: istore #33
    //   6: iload_1
    //   7: invokestatic getMode : (I)I
    //   10: ldc 1073741824
    //   12: if_icmpne -> 21
    //   15: iconst_1
    //   16: istore #32
    //   18: goto -> 24
    //   21: iconst_0
    //   22: istore #32
    //   24: aload_0
    //   25: iload #32
    //   27: putfield x : Z
    //   30: iload #33
    //   32: iload #32
    //   34: if_icmpeq -> 42
    //   37: aload_0
    //   38: iconst_0
    //   39: putfield y : I
    //   42: iload_1
    //   43: invokestatic getSize : (I)I
    //   46: istore #6
    //   48: aload_0
    //   49: getfield x : Z
    //   52: ifeq -> 87
    //   55: aload_0
    //   56: getfield q : Lb/b/o/i/g;
    //   59: astore #34
    //   61: aload #34
    //   63: ifnull -> 87
    //   66: iload #6
    //   68: aload_0
    //   69: getfield y : I
    //   72: if_icmpeq -> 87
    //   75: aload_0
    //   76: iload #6
    //   78: putfield y : I
    //   81: aload #34
    //   83: iconst_1
    //   84: invokevirtual q : (Z)V
    //   87: aload_0
    //   88: invokevirtual getChildCount : ()I
    //   91: istore #7
    //   93: aload_0
    //   94: getfield x : Z
    //   97: ifeq -> 1320
    //   100: iload #7
    //   102: ifle -> 1320
    //   105: iload_2
    //   106: invokestatic getMode : (I)I
    //   109: istore #20
    //   111: iload_1
    //   112: invokestatic getSize : (I)I
    //   115: istore #7
    //   117: iload_2
    //   118: invokestatic getSize : (I)I
    //   121: istore #6
    //   123: aload_0
    //   124: invokevirtual getPaddingLeft : ()I
    //   127: istore_1
    //   128: aload_0
    //   129: invokevirtual getPaddingRight : ()I
    //   132: istore #8
    //   134: aload_0
    //   135: invokevirtual getPaddingTop : ()I
    //   138: istore #9
    //   140: aload_0
    //   141: invokevirtual getPaddingBottom : ()I
    //   144: iload #9
    //   146: iadd
    //   147: istore #14
    //   149: iload_2
    //   150: iload #14
    //   152: bipush #-2
    //   154: invokestatic getChildMeasureSpec : (III)I
    //   157: istore #21
    //   159: iload #7
    //   161: iload #8
    //   163: iload_1
    //   164: iadd
    //   165: isub
    //   166: istore #10
    //   168: aload_0
    //   169: getfield z : I
    //   172: istore_2
    //   173: iload #10
    //   175: iload_2
    //   176: idiv
    //   177: istore_1
    //   178: iload_1
    //   179: ifne -> 192
    //   182: aload_0
    //   183: iload #10
    //   185: iconst_0
    //   186: invokevirtual setMeasuredDimension : (II)V
    //   189: goto -> 1368
    //   192: iload #10
    //   194: iload_2
    //   195: irem
    //   196: iload_1
    //   197: idiv
    //   198: iload_2
    //   199: iadd
    //   200: istore #22
    //   202: aload_0
    //   203: invokevirtual getChildCount : ()I
    //   206: istore #23
    //   208: iconst_0
    //   209: istore #12
    //   211: iconst_0
    //   212: istore #8
    //   214: iconst_0
    //   215: istore #11
    //   217: iconst_0
    //   218: istore_2
    //   219: iconst_0
    //   220: istore #13
    //   222: iconst_0
    //   223: istore #7
    //   225: lconst_0
    //   226: lstore #24
    //   228: iload #13
    //   230: iload #23
    //   232: if_icmpge -> 487
    //   235: aload_0
    //   236: iload #13
    //   238: invokevirtual getChildAt : (I)Landroid/view/View;
    //   241: astore #35
    //   243: aload #35
    //   245: invokevirtual getVisibility : ()I
    //   248: bipush #8
    //   250: if_icmpne -> 256
    //   253: goto -> 481
    //   256: aload #35
    //   258: instanceof androidx/appcompat/view/menu/ActionMenuItemView
    //   261: istore #32
    //   263: iinc #12, 1
    //   266: iload #32
    //   268: ifeq -> 291
    //   271: aload_0
    //   272: getfield A : I
    //   275: istore #9
    //   277: aload #35
    //   279: iload #9
    //   281: iconst_0
    //   282: iload #9
    //   284: iconst_0
    //   285: invokevirtual setPadding : (IIII)V
    //   288: goto -> 291
    //   291: aload #35
    //   293: invokevirtual getLayoutParams : ()Landroid/view/ViewGroup$LayoutParams;
    //   296: checkcast androidx/appcompat/widget/ActionMenuView$c
    //   299: astore #34
    //   301: aload #34
    //   303: iconst_0
    //   304: putfield h : Z
    //   307: aload #34
    //   309: iconst_0
    //   310: putfield e : I
    //   313: aload #34
    //   315: iconst_0
    //   316: putfield d : I
    //   319: aload #34
    //   321: iconst_0
    //   322: putfield f : Z
    //   325: aload #34
    //   327: iconst_0
    //   328: putfield leftMargin : I
    //   331: aload #34
    //   333: iconst_0
    //   334: putfield rightMargin : I
    //   337: iload #32
    //   339: ifeq -> 359
    //   342: aload #35
    //   344: checkcast androidx/appcompat/view/menu/ActionMenuItemView
    //   347: invokevirtual d : ()Z
    //   350: ifeq -> 359
    //   353: iconst_1
    //   354: istore #32
    //   356: goto -> 362
    //   359: iconst_0
    //   360: istore #32
    //   362: aload #34
    //   364: iload #32
    //   366: putfield g : Z
    //   369: aload #34
    //   371: getfield c : Z
    //   374: ifeq -> 383
    //   377: iconst_1
    //   378: istore #9
    //   380: goto -> 386
    //   383: iload_1
    //   384: istore #9
    //   386: aload #35
    //   388: iload #22
    //   390: iload #9
    //   392: iload #21
    //   394: iload #14
    //   396: invokestatic u : (Landroid/view/View;IIII)I
    //   399: istore #15
    //   401: iload #11
    //   403: iload #15
    //   405: invokestatic max : (II)I
    //   408: istore #11
    //   410: iload_2
    //   411: istore #9
    //   413: aload #34
    //   415: getfield f : Z
    //   418: ifeq -> 426
    //   421: iload_2
    //   422: iconst_1
    //   423: iadd
    //   424: istore #9
    //   426: aload #34
    //   428: getfield c : Z
    //   431: ifeq -> 437
    //   434: iconst_1
    //   435: istore #7
    //   437: iload_1
    //   438: iload #15
    //   440: isub
    //   441: istore_1
    //   442: iload #8
    //   444: aload #35
    //   446: invokevirtual getMeasuredHeight : ()I
    //   449: invokestatic max : (II)I
    //   452: istore #8
    //   454: lload #24
    //   456: lstore #26
    //   458: iload #15
    //   460: iconst_1
    //   461: if_icmpne -> 474
    //   464: lload #24
    //   466: iconst_1
    //   467: iload #13
    //   469: ishl
    //   470: i2l
    //   471: lor
    //   472: lstore #26
    //   474: lload #26
    //   476: lstore #24
    //   478: iload #9
    //   480: istore_2
    //   481: iinc #13, 1
    //   484: goto -> 228
    //   487: iload #7
    //   489: ifeq -> 504
    //   492: iload #12
    //   494: iconst_2
    //   495: if_icmpne -> 504
    //   498: iconst_1
    //   499: istore #9
    //   501: goto -> 507
    //   504: iconst_0
    //   505: istore #9
    //   507: iconst_0
    //   508: istore #15
    //   510: iload_2
    //   511: istore #14
    //   513: iload_1
    //   514: istore #13
    //   516: iload #15
    //   518: istore_2
    //   519: iload #8
    //   521: istore_1
    //   522: iload #14
    //   524: ifle -> 843
    //   527: iload #13
    //   529: ifle -> 843
    //   532: ldc_w 2147483647
    //   535: istore #15
    //   537: iconst_0
    //   538: istore #17
    //   540: iconst_0
    //   541: istore #16
    //   543: lconst_0
    //   544: lstore #28
    //   546: iload_2
    //   547: istore #8
    //   549: iload #17
    //   551: iload #23
    //   553: if_icmpge -> 674
    //   556: aload_0
    //   557: iload #17
    //   559: invokevirtual getChildAt : (I)Landroid/view/View;
    //   562: invokevirtual getLayoutParams : ()Landroid/view/ViewGroup$LayoutParams;
    //   565: checkcast androidx/appcompat/widget/ActionMenuView$c
    //   568: astore #34
    //   570: aload #34
    //   572: getfield f : Z
    //   575: ifne -> 592
    //   578: iload #15
    //   580: istore #18
    //   582: iload #16
    //   584: istore_2
    //   585: lload #28
    //   587: lstore #26
    //   589: goto -> 657
    //   592: aload #34
    //   594: getfield d : I
    //   597: istore #19
    //   599: iload #19
    //   601: iload #15
    //   603: if_icmpge -> 621
    //   606: lconst_1
    //   607: iload #17
    //   609: lshl
    //   610: lstore #26
    //   612: iload #19
    //   614: istore #18
    //   616: iconst_1
    //   617: istore_2
    //   618: goto -> 657
    //   621: iload #15
    //   623: istore #18
    //   625: iload #16
    //   627: istore_2
    //   628: lload #28
    //   630: lstore #26
    //   632: iload #19
    //   634: iload #15
    //   636: if_icmpne -> 657
    //   639: iload #16
    //   641: iconst_1
    //   642: iadd
    //   643: istore_2
    //   644: lload #28
    //   646: lconst_1
    //   647: iload #17
    //   649: lshl
    //   650: lor
    //   651: lstore #26
    //   653: iload #15
    //   655: istore #18
    //   657: iinc #17, 1
    //   660: iload #18
    //   662: istore #15
    //   664: iload_2
    //   665: istore #16
    //   667: lload #26
    //   669: lstore #28
    //   671: goto -> 549
    //   674: iload_1
    //   675: istore_2
    //   676: iload #8
    //   678: istore_1
    //   679: lload #24
    //   681: lload #28
    //   683: lor
    //   684: lstore #24
    //   686: iload #16
    //   688: iload #13
    //   690: if_icmple -> 696
    //   693: goto -> 851
    //   696: iconst_0
    //   697: istore_1
    //   698: iload_1
    //   699: iload #23
    //   701: if_icmpge -> 836
    //   704: aload_0
    //   705: iload_1
    //   706: invokevirtual getChildAt : (I)Landroid/view/View;
    //   709: astore #34
    //   711: aload #34
    //   713: invokevirtual getLayoutParams : ()Landroid/view/ViewGroup$LayoutParams;
    //   716: checkcast androidx/appcompat/widget/ActionMenuView$c
    //   719: astore #35
    //   721: iconst_1
    //   722: iload_1
    //   723: ishl
    //   724: i2l
    //   725: lstore #30
    //   727: lload #28
    //   729: lload #30
    //   731: land
    //   732: lconst_0
    //   733: lcmp
    //   734: ifne -> 767
    //   737: lload #24
    //   739: lstore #26
    //   741: aload #35
    //   743: getfield d : I
    //   746: iload #15
    //   748: iconst_1
    //   749: iadd
    //   750: if_icmpne -> 760
    //   753: lload #24
    //   755: lload #30
    //   757: lor
    //   758: lstore #26
    //   760: lload #26
    //   762: lstore #24
    //   764: goto -> 830
    //   767: iload #9
    //   769: ifeq -> 809
    //   772: aload #35
    //   774: getfield g : Z
    //   777: ifeq -> 809
    //   780: iload #13
    //   782: iconst_1
    //   783: if_icmpne -> 809
    //   786: aload_0
    //   787: getfield A : I
    //   790: istore #8
    //   792: aload #34
    //   794: iload #8
    //   796: iload #22
    //   798: iadd
    //   799: iconst_0
    //   800: iload #8
    //   802: iconst_0
    //   803: invokevirtual setPadding : (IIII)V
    //   806: goto -> 809
    //   809: aload #35
    //   811: aload #35
    //   813: getfield d : I
    //   816: iconst_1
    //   817: iadd
    //   818: putfield d : I
    //   821: aload #35
    //   823: iconst_1
    //   824: putfield h : Z
    //   827: iinc #13, -1
    //   830: iinc #1, 1
    //   833: goto -> 698
    //   836: iload_2
    //   837: istore_1
    //   838: iconst_1
    //   839: istore_2
    //   840: goto -> 522
    //   843: iload_2
    //   844: istore #8
    //   846: iload_1
    //   847: istore_2
    //   848: iload #8
    //   850: istore_1
    //   851: iload #7
    //   853: ifne -> 868
    //   856: iload #12
    //   858: iconst_1
    //   859: if_icmpne -> 868
    //   862: iconst_1
    //   863: istore #7
    //   865: goto -> 871
    //   868: iconst_0
    //   869: istore #7
    //   871: iload_1
    //   872: istore #8
    //   874: iload #13
    //   876: ifle -> 1224
    //   879: iload_1
    //   880: istore #8
    //   882: lload #24
    //   884: lconst_0
    //   885: lcmp
    //   886: ifeq -> 1224
    //   889: iload #13
    //   891: iload #12
    //   893: iconst_1
    //   894: isub
    //   895: if_icmplt -> 912
    //   898: iload #7
    //   900: ifne -> 912
    //   903: iload_1
    //   904: istore #8
    //   906: iload #11
    //   908: iconst_1
    //   909: if_icmple -> 1224
    //   912: lload #24
    //   914: invokestatic bitCount : (J)I
    //   917: i2f
    //   918: fstore #5
    //   920: fload #5
    //   922: fstore #4
    //   924: iload #7
    //   926: ifne -> 1018
    //   929: fload #5
    //   931: fstore_3
    //   932: lload #24
    //   934: lconst_1
    //   935: land
    //   936: lconst_0
    //   937: lcmp
    //   938: ifeq -> 968
    //   941: fload #5
    //   943: fstore_3
    //   944: aload_0
    //   945: iconst_0
    //   946: invokevirtual getChildAt : (I)Landroid/view/View;
    //   949: invokevirtual getLayoutParams : ()Landroid/view/ViewGroup$LayoutParams;
    //   952: checkcast androidx/appcompat/widget/ActionMenuView$c
    //   955: getfield g : Z
    //   958: ifne -> 968
    //   961: fload #5
    //   963: ldc_w 0.5
    //   966: fsub
    //   967: fstore_3
    //   968: iload #23
    //   970: iconst_1
    //   971: isub
    //   972: istore #7
    //   974: fload_3
    //   975: fstore #4
    //   977: lload #24
    //   979: iconst_1
    //   980: iload #7
    //   982: ishl
    //   983: i2l
    //   984: land
    //   985: lconst_0
    //   986: lcmp
    //   987: ifeq -> 1018
    //   990: fload_3
    //   991: fstore #4
    //   993: aload_0
    //   994: iload #7
    //   996: invokevirtual getChildAt : (I)Landroid/view/View;
    //   999: invokevirtual getLayoutParams : ()Landroid/view/ViewGroup$LayoutParams;
    //   1002: checkcast androidx/appcompat/widget/ActionMenuView$c
    //   1005: getfield g : Z
    //   1008: ifne -> 1018
    //   1011: fload_3
    //   1012: ldc_w 0.5
    //   1015: fsub
    //   1016: fstore #4
    //   1018: fload #4
    //   1020: fconst_0
    //   1021: fcmpl
    //   1022: ifle -> 1040
    //   1025: iload #13
    //   1027: iload #22
    //   1029: imul
    //   1030: i2f
    //   1031: fload #4
    //   1033: fdiv
    //   1034: f2i
    //   1035: istore #7
    //   1037: goto -> 1043
    //   1040: iconst_0
    //   1041: istore #7
    //   1043: iconst_0
    //   1044: istore #9
    //   1046: iload_1
    //   1047: istore #8
    //   1049: iload #9
    //   1051: iload #23
    //   1053: if_icmpge -> 1224
    //   1056: lload #24
    //   1058: iconst_1
    //   1059: iload #9
    //   1061: ishl
    //   1062: i2l
    //   1063: land
    //   1064: lconst_0
    //   1065: lcmp
    //   1066: ifne -> 1075
    //   1069: iload_1
    //   1070: istore #8
    //   1072: goto -> 1215
    //   1075: aload_0
    //   1076: iload #9
    //   1078: invokevirtual getChildAt : (I)Landroid/view/View;
    //   1081: astore #34
    //   1083: aload #34
    //   1085: invokevirtual getLayoutParams : ()Landroid/view/ViewGroup$LayoutParams;
    //   1088: checkcast androidx/appcompat/widget/ActionMenuView$c
    //   1091: astore #35
    //   1093: aload #34
    //   1095: instanceof androidx/appcompat/view/menu/ActionMenuItemView
    //   1098: ifeq -> 1140
    //   1101: aload #35
    //   1103: iload #7
    //   1105: putfield e : I
    //   1108: aload #35
    //   1110: iconst_1
    //   1111: putfield h : Z
    //   1114: iload #9
    //   1116: ifne -> 1137
    //   1119: aload #35
    //   1121: getfield g : Z
    //   1124: ifne -> 1137
    //   1127: aload #35
    //   1129: iload #7
    //   1131: ineg
    //   1132: iconst_2
    //   1133: idiv
    //   1134: putfield leftMargin : I
    //   1137: goto -> 1171
    //   1140: aload #35
    //   1142: getfield c : Z
    //   1145: ifeq -> 1177
    //   1148: aload #35
    //   1150: iload #7
    //   1152: putfield e : I
    //   1155: aload #35
    //   1157: iconst_1
    //   1158: putfield h : Z
    //   1161: aload #35
    //   1163: iload #7
    //   1165: ineg
    //   1166: iconst_2
    //   1167: idiv
    //   1168: putfield rightMargin : I
    //   1171: iconst_1
    //   1172: istore #8
    //   1174: goto -> 1215
    //   1177: iload #9
    //   1179: ifeq -> 1191
    //   1182: aload #35
    //   1184: iload #7
    //   1186: iconst_2
    //   1187: idiv
    //   1188: putfield leftMargin : I
    //   1191: iload_1
    //   1192: istore #8
    //   1194: iload #9
    //   1196: iload #23
    //   1198: iconst_1
    //   1199: isub
    //   1200: if_icmpeq -> 1215
    //   1203: aload #35
    //   1205: iload #7
    //   1207: iconst_2
    //   1208: idiv
    //   1209: putfield rightMargin : I
    //   1212: iload_1
    //   1213: istore #8
    //   1215: iinc #9, 1
    //   1218: iload #8
    //   1220: istore_1
    //   1221: goto -> 1046
    //   1224: iload #8
    //   1226: ifeq -> 1297
    //   1229: iconst_0
    //   1230: istore_1
    //   1231: iload_1
    //   1232: iload #23
    //   1234: if_icmpge -> 1297
    //   1237: aload_0
    //   1238: iload_1
    //   1239: invokevirtual getChildAt : (I)Landroid/view/View;
    //   1242: astore #34
    //   1244: aload #34
    //   1246: invokevirtual getLayoutParams : ()Landroid/view/ViewGroup$LayoutParams;
    //   1249: checkcast androidx/appcompat/widget/ActionMenuView$c
    //   1252: astore #35
    //   1254: aload #35
    //   1256: getfield h : Z
    //   1259: ifne -> 1265
    //   1262: goto -> 1291
    //   1265: aload #34
    //   1267: aload #35
    //   1269: getfield d : I
    //   1272: iload #22
    //   1274: imul
    //   1275: aload #35
    //   1277: getfield e : I
    //   1280: iadd
    //   1281: ldc 1073741824
    //   1283: invokestatic makeMeasureSpec : (II)I
    //   1286: iload #21
    //   1288: invokevirtual measure : (II)V
    //   1291: iinc #1, 1
    //   1294: goto -> 1231
    //   1297: iload #20
    //   1299: ldc 1073741824
    //   1301: if_icmpeq -> 1307
    //   1304: goto -> 1310
    //   1307: iload #6
    //   1309: istore_2
    //   1310: aload_0
    //   1311: iload #10
    //   1313: iload_2
    //   1314: invokevirtual setMeasuredDimension : (II)V
    //   1317: goto -> 1368
    //   1320: iconst_0
    //   1321: istore #6
    //   1323: iload #6
    //   1325: iload #7
    //   1327: if_icmpge -> 1362
    //   1330: aload_0
    //   1331: iload #6
    //   1333: invokevirtual getChildAt : (I)Landroid/view/View;
    //   1336: invokevirtual getLayoutParams : ()Landroid/view/ViewGroup$LayoutParams;
    //   1339: checkcast androidx/appcompat/widget/ActionMenuView$c
    //   1342: astore #34
    //   1344: aload #34
    //   1346: iconst_0
    //   1347: putfield rightMargin : I
    //   1350: aload #34
    //   1352: iconst_0
    //   1353: putfield leftMargin : I
    //   1356: iinc #6, 1
    //   1359: goto -> 1323
    //   1362: aload_0
    //   1363: iload_1
    //   1364: iload_2
    //   1365: invokespecial onMeasure : (II)V
    //   1368: return
  }
  
  public c r() {
    c c1 = new c(-2, -2);
    c1.b = 16;
    return c1;
  }
  
  public c s(ViewGroup.LayoutParams paramLayoutParams) {
    if (paramLayoutParams != null) {
      c c1;
      if (paramLayoutParams instanceof c) {
        c1 = new c((c)paramLayoutParams);
      } else {
        c1 = new c((ViewGroup.LayoutParams)c1);
      } 
      if (c1.b <= 0)
        c1.b = 16; 
      return c1;
    } 
    return r();
  }
  
  public void setExpandedActionViewsExclusive(boolean paramBoolean) {
    this.u.r = paramBoolean;
  }
  
  public void setOnMenuItemClickListener(e parame) {
    this.B = parame;
  }
  
  public void setOverflowIcon(Drawable paramDrawable) {
    getMenu();
    b.b.p.c c1 = this.u;
    b.b.p.c.d d = c1.j;
    if (d != null) {
      d.setImageDrawable(paramDrawable);
    } else {
      c1.l = true;
      c1.k = paramDrawable;
    } 
  }
  
  public void setOverflowReserved(boolean paramBoolean) {
    this.t = paramBoolean;
  }
  
  public void setPopupTheme(int paramInt) {
    if (this.s != paramInt) {
      this.s = paramInt;
      if (paramInt == 0) {
        this.r = getContext();
      } else {
        this.r = (Context)new ContextThemeWrapper(getContext(), paramInt);
      } 
    } 
  }
  
  public void setPresenter(b.b.p.c paramc) {
    this.u = paramc;
    ((b.b.o.i.b)paramc).i = this;
    this.q = ((b.b.o.i.b)paramc).d;
  }
  
  public boolean t(int paramInt) {
    boolean bool;
    int j = 0;
    if (paramInt == 0)
      return false; 
    View view1 = getChildAt(paramInt - 1);
    View view2 = getChildAt(paramInt);
    int i = j;
    if (paramInt < getChildCount()) {
      i = j;
      if (view1 instanceof a)
        i = false | ((a)view1).b(); 
    } 
    j = i;
    if (paramInt > 0) {
      j = i;
      if (view2 instanceof a)
        bool = i | ((a)view2).a(); 
    } 
    return bool;
  }
  
  public static interface a {
    boolean a();
    
    boolean b();
  }
  
  public static class b implements m.a {
    public void b(g param1g, boolean param1Boolean) {}
    
    public boolean c(g param1g) {
      return false;
    }
  }
  
  public static class c extends i0.a {
    @ExportedProperty
    public boolean c;
    
    @ExportedProperty
    public int d;
    
    @ExportedProperty
    public int e;
    
    @ExportedProperty
    public boolean f;
    
    @ExportedProperty
    public boolean g;
    
    public boolean h;
    
    public c(int param1Int1, int param1Int2) {
      super(param1Int1, param1Int2);
      this.c = false;
    }
    
    public c(Context param1Context, AttributeSet param1AttributeSet) {
      super(param1Context, param1AttributeSet);
    }
    
    public c(ViewGroup.LayoutParams param1LayoutParams) {
      super(param1LayoutParams);
    }
    
    public c(c param1c) {
      super((ViewGroup.LayoutParams)param1c);
      this.c = param1c.c;
    }
  }
  
  public class d implements g.a {
    public final ActionMenuView b;
    
    public d(ActionMenuView this$0) {}
    
    public void a(g param1g) {
      g.a a1 = this.b.w;
      if (a1 != null)
        a1.a(param1g); 
    }
    
    public boolean b(g param1g, MenuItem param1MenuItem) {
      ActionMenuView.e e = this.b.B;
      boolean bool2 = false;
      boolean bool1 = bool2;
      if (e != null) {
        boolean bool;
        Toolbar.f f = ((Toolbar.a)e).a.H;
        if (f != null) {
          bool = f.onMenuItemClick(param1MenuItem);
        } else {
          bool = false;
        } 
        bool1 = bool2;
        if (bool)
          bool1 = true; 
      } 
      return bool1;
    }
  }
  
  public static interface e {}
}


/* Location:              C:\Users\panch\Downloads\dvba_v1.1.0-dex2jar.jar!\androidx\appcompat\widget\ActionMenuView.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */