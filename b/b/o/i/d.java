package b.b.o.i;

import android.content.Context;
import android.content.res.Resources;
import android.os.Handler;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewTreeObserver;
import android.widget.HeaderViewListAdapter;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.PopupWindow;
import b.b.g;
import b.b.p.f0;
import b.b.p.k0;
import b.b.p.l0;
import b.b.p.m0;
import b.i.m.l;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public final class d extends k implements m, View.OnKeyListener, PopupWindow.OnDismissListener {
  public static final int C = g.abc_cascading_menu_item_layout;
  
  public PopupWindow.OnDismissListener A;
  
  public boolean B;
  
  public final Context c;
  
  public final int d;
  
  public final int e;
  
  public final int f;
  
  public final boolean g;
  
  public final Handler h;
  
  public final List<g> i = new ArrayList<g>();
  
  public final List<d> j = new ArrayList<d>();
  
  public final ViewTreeObserver.OnGlobalLayoutListener k = new a(this);
  
  public final View.OnAttachStateChangeListener l = new b(this);
  
  public final l0 m = new c(this);
  
  public int n;
  
  public int o;
  
  public View p;
  
  public View q;
  
  public int r;
  
  public boolean s;
  
  public boolean t;
  
  public int u;
  
  public int v;
  
  public boolean w;
  
  public boolean x;
  
  public m.a y;
  
  public ViewTreeObserver z;
  
  public d(Context paramContext, View paramView, int paramInt1, int paramInt2, boolean paramBoolean) {
    boolean bool = false;
    this.n = 0;
    this.o = 0;
    this.c = paramContext;
    this.p = paramView;
    this.e = paramInt1;
    this.f = paramInt2;
    this.g = paramBoolean;
    this.w = false;
    if (l.r(paramView) == 1) {
      paramInt1 = bool;
    } else {
      paramInt1 = 1;
    } 
    this.r = paramInt1;
    Resources resources = paramContext.getResources();
    this.d = Math.max((resources.getDisplayMetrics()).widthPixels / 2, resources.getDimensionPixelSize(b.b.d.abc_config_prefDialogWidth));
    this.h = new Handler();
  }
  
  public boolean a() {
    int i = this.j.size();
    boolean bool2 = false;
    boolean bool1 = bool2;
    if (i > 0) {
      bool1 = bool2;
      if (((d)this.j.get(0)).a.a())
        bool1 = true; 
    } 
    return bool1;
  }
  
  public void b(g paramg, boolean paramBoolean) {
    // Byte code:
    //   0: aload_0
    //   1: getfield j : Ljava/util/List;
    //   4: invokeinterface size : ()I
    //   9: istore #4
    //   11: iconst_0
    //   12: istore_3
    //   13: iload_3
    //   14: iload #4
    //   16: if_icmpge -> 48
    //   19: aload_1
    //   20: aload_0
    //   21: getfield j : Ljava/util/List;
    //   24: iload_3
    //   25: invokeinterface get : (I)Ljava/lang/Object;
    //   30: checkcast b/b/o/i/d$d
    //   33: getfield b : Lb/b/o/i/g;
    //   36: if_acmpne -> 42
    //   39: goto -> 50
    //   42: iinc #3, 1
    //   45: goto -> 13
    //   48: iconst_m1
    //   49: istore_3
    //   50: iload_3
    //   51: ifge -> 55
    //   54: return
    //   55: iload_3
    //   56: iconst_1
    //   57: iadd
    //   58: istore #4
    //   60: iload #4
    //   62: aload_0
    //   63: getfield j : Ljava/util/List;
    //   66: invokeinterface size : ()I
    //   71: if_icmpge -> 95
    //   74: aload_0
    //   75: getfield j : Ljava/util/List;
    //   78: iload #4
    //   80: invokeinterface get : (I)Ljava/lang/Object;
    //   85: checkcast b/b/o/i/d$d
    //   88: getfield b : Lb/b/o/i/g;
    //   91: iconst_0
    //   92: invokevirtual c : (Z)V
    //   95: aload_0
    //   96: getfield j : Ljava/util/List;
    //   99: iload_3
    //   100: invokeinterface remove : (I)Ljava/lang/Object;
    //   105: checkcast b/b/o/i/d$d
    //   108: astore #6
    //   110: aload #6
    //   112: getfield b : Lb/b/o/i/g;
    //   115: aload_0
    //   116: invokevirtual u : (Lb/b/o/i/m;)V
    //   119: aload_0
    //   120: getfield B : Z
    //   123: ifeq -> 172
    //   126: aload #6
    //   128: getfield a : Lb/b/p/m0;
    //   131: astore #5
    //   133: aload #5
    //   135: ifnull -> 170
    //   138: getstatic android/os/Build$VERSION.SDK_INT : I
    //   141: bipush #23
    //   143: if_icmplt -> 155
    //   146: aload #5
    //   148: getfield C : Landroid/widget/PopupWindow;
    //   151: aconst_null
    //   152: invokevirtual setExitTransition : (Landroid/transition/Transition;)V
    //   155: aload #6
    //   157: getfield a : Lb/b/p/m0;
    //   160: getfield C : Landroid/widget/PopupWindow;
    //   163: iconst_0
    //   164: invokevirtual setAnimationStyle : (I)V
    //   167: goto -> 172
    //   170: aconst_null
    //   171: athrow
    //   172: aload #6
    //   174: getfield a : Lb/b/p/m0;
    //   177: invokevirtual dismiss : ()V
    //   180: aload_0
    //   181: getfield j : Ljava/util/List;
    //   184: invokeinterface size : ()I
    //   189: istore #4
    //   191: iload #4
    //   193: ifle -> 219
    //   196: aload_0
    //   197: getfield j : Ljava/util/List;
    //   200: iload #4
    //   202: iconst_1
    //   203: isub
    //   204: invokeinterface get : (I)Ljava/lang/Object;
    //   209: checkcast b/b/o/i/d$d
    //   212: getfield c : I
    //   215: istore_3
    //   216: goto -> 237
    //   219: aload_0
    //   220: getfield p : Landroid/view/View;
    //   223: invokestatic r : (Landroid/view/View;)I
    //   226: iconst_1
    //   227: if_icmpne -> 235
    //   230: iconst_0
    //   231: istore_3
    //   232: goto -> 237
    //   235: iconst_1
    //   236: istore_3
    //   237: aload_0
    //   238: iload_3
    //   239: putfield r : I
    //   242: iload #4
    //   244: ifne -> 326
    //   247: aload_0
    //   248: invokevirtual dismiss : ()V
    //   251: aload_0
    //   252: getfield y : Lb/b/o/i/m$a;
    //   255: astore #5
    //   257: aload #5
    //   259: ifnull -> 271
    //   262: aload #5
    //   264: aload_1
    //   265: iconst_1
    //   266: invokeinterface b : (Lb/b/o/i/g;Z)V
    //   271: aload_0
    //   272: getfield z : Landroid/view/ViewTreeObserver;
    //   275: astore_1
    //   276: aload_1
    //   277: ifnull -> 303
    //   280: aload_1
    //   281: invokevirtual isAlive : ()Z
    //   284: ifeq -> 298
    //   287: aload_0
    //   288: getfield z : Landroid/view/ViewTreeObserver;
    //   291: aload_0
    //   292: getfield k : Landroid/view/ViewTreeObserver$OnGlobalLayoutListener;
    //   295: invokevirtual removeGlobalOnLayoutListener : (Landroid/view/ViewTreeObserver$OnGlobalLayoutListener;)V
    //   298: aload_0
    //   299: aconst_null
    //   300: putfield z : Landroid/view/ViewTreeObserver;
    //   303: aload_0
    //   304: getfield q : Landroid/view/View;
    //   307: aload_0
    //   308: getfield l : Landroid/view/View$OnAttachStateChangeListener;
    //   311: invokevirtual removeOnAttachStateChangeListener : (Landroid/view/View$OnAttachStateChangeListener;)V
    //   314: aload_0
    //   315: getfield A : Landroid/widget/PopupWindow$OnDismissListener;
    //   318: invokeinterface onDismiss : ()V
    //   323: goto -> 350
    //   326: iload_2
    //   327: ifeq -> 350
    //   330: aload_0
    //   331: getfield j : Ljava/util/List;
    //   334: iconst_0
    //   335: invokeinterface get : (I)Ljava/lang/Object;
    //   340: checkcast b/b/o/i/d$d
    //   343: getfield b : Lb/b/o/i/g;
    //   346: iconst_0
    //   347: invokevirtual c : (Z)V
    //   350: return
  }
  
  public void d(m.a parama) {
    this.y = parama;
  }
  
  public void dismiss() {
    int i = this.j.size();
    if (i > 0) {
      d[] arrayOfD = this.j.<d>toArray(new d[i]);
      while (--i >= 0) {
        d d1 = arrayOfD[i];
        if (d1.a.a())
          d1.a.dismiss(); 
        i--;
      } 
    } 
  }
  
  public ListView e() {
    f0 f0;
    if (this.j.isEmpty()) {
      f0 = null;
    } else {
      List<d> list = this.j;
      f0 = ((k0)((d)list.get(list.size() - 1)).a).d;
    } 
    return (ListView)f0;
  }
  
  public boolean f(r paramr) {
    for (d d1 : this.j) {
      if (paramr == d1.b) {
        ((k0)d1.a).d.requestFocus();
        return true;
      } 
    } 
    if (paramr.hasVisibleItems()) {
      paramr.b(this, this.c);
      if (a()) {
        w(paramr);
      } else {
        this.i.add(paramr);
      } 
      m.a a1 = this.y;
      if (a1 != null)
        a1.c(paramr); 
      return true;
    } 
    return false;
  }
  
  public boolean g() {
    return false;
  }
  
  public void h(boolean paramBoolean) {
    Iterator<d> iterator = this.j.iterator();
    while (iterator.hasNext()) {
      ListAdapter listAdapter2 = ((k0)((d)iterator.next()).a).d.getAdapter();
      ListAdapter listAdapter1 = listAdapter2;
      if (listAdapter2 instanceof HeaderViewListAdapter)
        listAdapter1 = ((HeaderViewListAdapter)listAdapter2).getWrappedAdapter(); 
      ((f)listAdapter1).notifyDataSetChanged();
    } 
  }
  
  public void i() {
    if (a())
      return; 
    Iterator<g> iterator = this.i.iterator();
    while (iterator.hasNext())
      w(iterator.next()); 
    this.i.clear();
    View view = this.p;
    this.q = view;
    if (view != null) {
      boolean bool;
      if (this.z == null) {
        bool = true;
      } else {
        bool = false;
      } 
      ViewTreeObserver viewTreeObserver = this.q.getViewTreeObserver();
      this.z = viewTreeObserver;
      if (bool)
        viewTreeObserver.addOnGlobalLayoutListener(this.k); 
      this.q.addOnAttachStateChangeListener(this.l);
    } 
  }
  
  public void l(g paramg) {
    paramg.b(this, this.c);
    if (a()) {
      w(paramg);
    } else {
      this.i.add(paramg);
    } 
  }
  
  public boolean m() {
    return false;
  }
  
  public void o(View paramView) {
    if (this.p != paramView) {
      this.p = paramView;
      this.o = Gravity.getAbsoluteGravity(this.n, l.r(paramView));
    } 
  }
  
  public void onDismiss() {
    // Byte code:
    //   0: aload_0
    //   1: getfield j : Ljava/util/List;
    //   4: invokeinterface size : ()I
    //   9: istore_2
    //   10: iconst_0
    //   11: istore_1
    //   12: iload_1
    //   13: iload_2
    //   14: if_icmpge -> 50
    //   17: aload_0
    //   18: getfield j : Ljava/util/List;
    //   21: iload_1
    //   22: invokeinterface get : (I)Ljava/lang/Object;
    //   27: checkcast b/b/o/i/d$d
    //   30: astore_3
    //   31: aload_3
    //   32: getfield a : Lb/b/p/m0;
    //   35: invokevirtual a : ()Z
    //   38: ifne -> 44
    //   41: goto -> 52
    //   44: iinc #1, 1
    //   47: goto -> 12
    //   50: aconst_null
    //   51: astore_3
    //   52: aload_3
    //   53: ifnull -> 64
    //   56: aload_3
    //   57: getfield b : Lb/b/o/i/g;
    //   60: iconst_0
    //   61: invokevirtual c : (Z)V
    //   64: return
  }
  
  public boolean onKey(View paramView, int paramInt, KeyEvent paramKeyEvent) {
    if (paramKeyEvent.getAction() == 1 && paramInt == 82) {
      dismiss();
      return true;
    } 
    return false;
  }
  
  public void p(boolean paramBoolean) {
    this.w = paramBoolean;
  }
  
  public void q(int paramInt) {
    if (this.n != paramInt) {
      this.n = paramInt;
      this.o = Gravity.getAbsoluteGravity(paramInt, l.r(this.p));
    } 
  }
  
  public void r(int paramInt) {
    this.s = true;
    this.u = paramInt;
  }
  
  public void s(PopupWindow.OnDismissListener paramOnDismissListener) {
    this.A = paramOnDismissListener;
  }
  
  public void t(boolean paramBoolean) {
    this.x = paramBoolean;
  }
  
  public void u(int paramInt) {
    this.t = true;
    this.v = paramInt;
  }
  
  public final void w(g paramg) {
    // Byte code:
    //   0: aload_0
    //   1: getfield c : Landroid/content/Context;
    //   4: invokestatic from : (Landroid/content/Context;)Landroid/view/LayoutInflater;
    //   7: astore #10
    //   9: new b/b/o/i/f
    //   12: dup
    //   13: aload_1
    //   14: aload #10
    //   16: aload_0
    //   17: getfield g : Z
    //   20: getstatic b/b/o/i/d.C : I
    //   23: invokespecial <init> : (Lb/b/o/i/g;Landroid/view/LayoutInflater;ZI)V
    //   26: astore #6
    //   28: aload_0
    //   29: invokevirtual a : ()Z
    //   32: ifne -> 51
    //   35: aload_0
    //   36: getfield w : Z
    //   39: ifeq -> 51
    //   42: aload #6
    //   44: iconst_1
    //   45: putfield d : Z
    //   48: goto -> 67
    //   51: aload_0
    //   52: invokevirtual a : ()Z
    //   55: ifeq -> 67
    //   58: aload #6
    //   60: aload_1
    //   61: invokestatic v : (Lb/b/o/i/g;)Z
    //   64: putfield d : Z
    //   67: aload_0
    //   68: getfield c : Landroid/content/Context;
    //   71: astore #7
    //   73: aload_0
    //   74: getfield d : I
    //   77: istore_2
    //   78: aconst_null
    //   79: astore #8
    //   81: aload #6
    //   83: aconst_null
    //   84: aload #7
    //   86: iload_2
    //   87: invokestatic n : (Landroid/widget/ListAdapter;Landroid/view/ViewGroup;Landroid/content/Context;I)I
    //   90: istore_3
    //   91: new b/b/p/m0
    //   94: dup
    //   95: aload_0
    //   96: getfield c : Landroid/content/Context;
    //   99: aconst_null
    //   100: aload_0
    //   101: getfield e : I
    //   104: aload_0
    //   105: getfield f : I
    //   108: invokespecial <init> : (Landroid/content/Context;Landroid/util/AttributeSet;II)V
    //   111: astore #9
    //   113: aload #9
    //   115: aload_0
    //   116: getfield m : Lb/b/p/l0;
    //   119: putfield G : Lb/b/p/l0;
    //   122: aload #9
    //   124: aload_0
    //   125: putfield t : Landroid/widget/AdapterView$OnItemClickListener;
    //   128: aload #9
    //   130: getfield C : Landroid/widget/PopupWindow;
    //   133: aload_0
    //   134: invokevirtual setOnDismissListener : (Landroid/widget/PopupWindow$OnDismissListener;)V
    //   137: aload #9
    //   139: aload_0
    //   140: getfield p : Landroid/view/View;
    //   143: putfield s : Landroid/view/View;
    //   146: aload #9
    //   148: aload_0
    //   149: getfield o : I
    //   152: putfield m : I
    //   155: aload #9
    //   157: iconst_1
    //   158: invokevirtual s : (Z)V
    //   161: aload #9
    //   163: getfield C : Landroid/widget/PopupWindow;
    //   166: iconst_2
    //   167: invokevirtual setInputMethodMode : (I)V
    //   170: aload #9
    //   172: aload #6
    //   174: invokevirtual o : (Landroid/widget/ListAdapter;)V
    //   177: aload #9
    //   179: iload_3
    //   180: invokevirtual r : (I)V
    //   183: aload #9
    //   185: aload_0
    //   186: getfield o : I
    //   189: putfield m : I
    //   192: aload_0
    //   193: getfield j : Ljava/util/List;
    //   196: invokeinterface size : ()I
    //   201: ifle -> 475
    //   204: aload_0
    //   205: getfield j : Ljava/util/List;
    //   208: astore #6
    //   210: aload #6
    //   212: aload #6
    //   214: invokeinterface size : ()I
    //   219: iconst_1
    //   220: isub
    //   221: invokeinterface get : (I)Ljava/lang/Object;
    //   226: checkcast b/b/o/i/d$d
    //   229: astore #6
    //   231: aload #6
    //   233: getfield b : Lb/b/o/i/g;
    //   236: astore #11
    //   238: aload #11
    //   240: invokevirtual size : ()I
    //   243: istore #4
    //   245: iconst_0
    //   246: istore_2
    //   247: iload_2
    //   248: iload #4
    //   250: if_icmpge -> 291
    //   253: aload #11
    //   255: iload_2
    //   256: invokevirtual getItem : (I)Landroid/view/MenuItem;
    //   259: astore #7
    //   261: aload #7
    //   263: invokeinterface hasSubMenu : ()Z
    //   268: ifeq -> 285
    //   271: aload_1
    //   272: aload #7
    //   274: invokeinterface getSubMenu : ()Landroid/view/SubMenu;
    //   279: if_acmpne -> 285
    //   282: goto -> 294
    //   285: iinc #2, 1
    //   288: goto -> 247
    //   291: aconst_null
    //   292: astore #7
    //   294: aload #7
    //   296: ifnonnull -> 310
    //   299: aload #6
    //   301: astore #7
    //   303: aload #8
    //   305: astore #6
    //   307: goto -> 481
    //   310: aload #6
    //   312: getfield a : Lb/b/p/m0;
    //   315: getfield d : Lb/b/p/f0;
    //   318: astore #11
    //   320: aload #11
    //   322: invokevirtual getAdapter : ()Landroid/widget/ListAdapter;
    //   325: astore #8
    //   327: aload #8
    //   329: instanceof android/widget/HeaderViewListAdapter
    //   332: ifeq -> 362
    //   335: aload #8
    //   337: checkcast android/widget/HeaderViewListAdapter
    //   340: astore #8
    //   342: aload #8
    //   344: invokevirtual getHeadersCount : ()I
    //   347: istore #4
    //   349: aload #8
    //   351: invokevirtual getWrappedAdapter : ()Landroid/widget/ListAdapter;
    //   354: checkcast b/b/o/i/f
    //   357: astore #8
    //   359: goto -> 372
    //   362: aload #8
    //   364: checkcast b/b/o/i/f
    //   367: astore #8
    //   369: iconst_0
    //   370: istore #4
    //   372: aload #8
    //   374: invokevirtual getCount : ()I
    //   377: istore #5
    //   379: iconst_0
    //   380: istore_2
    //   381: iload_2
    //   382: iload #5
    //   384: if_icmpge -> 407
    //   387: aload #7
    //   389: aload #8
    //   391: iload_2
    //   392: invokevirtual b : (I)Lb/b/o/i/i;
    //   395: if_acmpne -> 401
    //   398: goto -> 409
    //   401: iinc #2, 1
    //   404: goto -> 381
    //   407: iconst_m1
    //   408: istore_2
    //   409: iload_2
    //   410: iconst_m1
    //   411: if_icmpne -> 421
    //   414: aload #6
    //   416: astore #7
    //   418: goto -> 478
    //   421: iload_2
    //   422: iload #4
    //   424: iadd
    //   425: aload #11
    //   427: invokevirtual getFirstVisiblePosition : ()I
    //   430: isub
    //   431: istore_2
    //   432: aload #6
    //   434: astore #7
    //   436: iload_2
    //   437: iflt -> 478
    //   440: iload_2
    //   441: aload #11
    //   443: invokevirtual getChildCount : ()I
    //   446: if_icmplt -> 456
    //   449: aload #6
    //   451: astore #7
    //   453: goto -> 478
    //   456: aload #11
    //   458: iload_2
    //   459: invokevirtual getChildAt : (I)Landroid/view/View;
    //   462: astore #8
    //   464: aload #6
    //   466: astore #7
    //   468: aload #8
    //   470: astore #6
    //   472: goto -> 481
    //   475: aconst_null
    //   476: astore #7
    //   478: aconst_null
    //   479: astore #6
    //   481: aload #6
    //   483: ifnull -> 900
    //   486: getstatic android/os/Build$VERSION.SDK_INT : I
    //   489: bipush #28
    //   491: if_icmpgt -> 543
    //   494: getstatic b/b/p/m0.H : Ljava/lang/reflect/Method;
    //   497: astore #8
    //   499: aload #8
    //   501: ifnull -> 552
    //   504: aload #8
    //   506: aload #9
    //   508: getfield C : Landroid/widget/PopupWindow;
    //   511: iconst_1
    //   512: anewarray java/lang/Object
    //   515: dup
    //   516: iconst_0
    //   517: getstatic java/lang/Boolean.FALSE : Ljava/lang/Boolean;
    //   520: aastore
    //   521: invokevirtual invoke : (Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
    //   524: pop
    //   525: goto -> 552
    //   528: astore #8
    //   530: ldc_w 'MenuPopupWindow'
    //   533: ldc_w 'Could not invoke setTouchModal() on PopupWindow. Oh well.'
    //   536: invokestatic i : (Ljava/lang/String;Ljava/lang/String;)I
    //   539: pop
    //   540: goto -> 552
    //   543: aload #9
    //   545: getfield C : Landroid/widget/PopupWindow;
    //   548: iconst_0
    //   549: invokevirtual setTouchModal : (Z)V
    //   552: getstatic android/os/Build$VERSION.SDK_INT : I
    //   555: bipush #23
    //   557: if_icmplt -> 569
    //   560: aload #9
    //   562: getfield C : Landroid/widget/PopupWindow;
    //   565: aconst_null
    //   566: invokevirtual setEnterTransition : (Landroid/transition/Transition;)V
    //   569: aload_0
    //   570: getfield j : Ljava/util/List;
    //   573: astore #8
    //   575: aload #8
    //   577: aload #8
    //   579: invokeinterface size : ()I
    //   584: iconst_1
    //   585: isub
    //   586: invokeinterface get : (I)Ljava/lang/Object;
    //   591: checkcast b/b/o/i/d$d
    //   594: getfield a : Lb/b/p/m0;
    //   597: getfield d : Lb/b/p/f0;
    //   600: astore #12
    //   602: iconst_2
    //   603: newarray int
    //   605: astore #11
    //   607: aload #12
    //   609: aload #11
    //   611: invokevirtual getLocationOnScreen : ([I)V
    //   614: new android/graphics/Rect
    //   617: dup
    //   618: invokespecial <init> : ()V
    //   621: astore #8
    //   623: aload_0
    //   624: getfield q : Landroid/view/View;
    //   627: aload #8
    //   629: invokevirtual getWindowVisibleDisplayFrame : (Landroid/graphics/Rect;)V
    //   632: aload_0
    //   633: getfield r : I
    //   636: iconst_1
    //   637: if_icmpne -> 665
    //   640: aload #11
    //   642: iconst_0
    //   643: iaload
    //   644: istore_2
    //   645: aload #12
    //   647: invokevirtual getWidth : ()I
    //   650: iload_2
    //   651: iadd
    //   652: iload_3
    //   653: iadd
    //   654: aload #8
    //   656: getfield right : I
    //   659: if_icmple -> 674
    //   662: goto -> 680
    //   665: aload #11
    //   667: iconst_0
    //   668: iaload
    //   669: iload_3
    //   670: isub
    //   671: ifge -> 680
    //   674: iconst_1
    //   675: istore #4
    //   677: goto -> 683
    //   680: iconst_0
    //   681: istore #4
    //   683: iload #4
    //   685: iconst_1
    //   686: if_icmpne -> 694
    //   689: iconst_1
    //   690: istore_2
    //   691: goto -> 696
    //   694: iconst_0
    //   695: istore_2
    //   696: aload_0
    //   697: iload #4
    //   699: putfield r : I
    //   702: getstatic android/os/Build$VERSION.SDK_INT : I
    //   705: bipush #26
    //   707: if_icmplt -> 726
    //   710: aload #9
    //   712: aload #6
    //   714: putfield s : Landroid/view/View;
    //   717: iconst_0
    //   718: istore #4
    //   720: iconst_0
    //   721: istore #5
    //   723: goto -> 823
    //   726: iconst_2
    //   727: newarray int
    //   729: astore #11
    //   731: aload_0
    //   732: getfield p : Landroid/view/View;
    //   735: aload #11
    //   737: invokevirtual getLocationOnScreen : ([I)V
    //   740: iconst_2
    //   741: newarray int
    //   743: astore #8
    //   745: aload #6
    //   747: aload #8
    //   749: invokevirtual getLocationOnScreen : ([I)V
    //   752: aload_0
    //   753: getfield o : I
    //   756: bipush #7
    //   758: iand
    //   759: iconst_5
    //   760: if_icmpne -> 801
    //   763: aload #11
    //   765: iconst_0
    //   766: iaload
    //   767: istore #4
    //   769: aload #11
    //   771: iconst_0
    //   772: aload_0
    //   773: getfield p : Landroid/view/View;
    //   776: invokevirtual getWidth : ()I
    //   779: iload #4
    //   781: iadd
    //   782: iastore
    //   783: aload #8
    //   785: iconst_0
    //   786: iaload
    //   787: istore #4
    //   789: aload #8
    //   791: iconst_0
    //   792: aload #6
    //   794: invokevirtual getWidth : ()I
    //   797: iload #4
    //   799: iadd
    //   800: iastore
    //   801: aload #8
    //   803: iconst_0
    //   804: iaload
    //   805: aload #11
    //   807: iconst_0
    //   808: iaload
    //   809: isub
    //   810: istore #5
    //   812: aload #8
    //   814: iconst_1
    //   815: iaload
    //   816: aload #11
    //   818: iconst_1
    //   819: iaload
    //   820: isub
    //   821: istore #4
    //   823: aload_0
    //   824: getfield o : I
    //   827: iconst_5
    //   828: iand
    //   829: iconst_5
    //   830: if_icmpne -> 849
    //   833: iload_2
    //   834: ifeq -> 840
    //   837: goto -> 859
    //   840: aload #6
    //   842: invokevirtual getWidth : ()I
    //   845: istore_3
    //   846: goto -> 867
    //   849: iload_2
    //   850: ifeq -> 867
    //   853: aload #6
    //   855: invokevirtual getWidth : ()I
    //   858: istore_3
    //   859: iload #5
    //   861: iload_3
    //   862: iadd
    //   863: istore_2
    //   864: goto -> 872
    //   867: iload #5
    //   869: iload_3
    //   870: isub
    //   871: istore_2
    //   872: aload #9
    //   874: iload_2
    //   875: putfield g : I
    //   878: aload #9
    //   880: iconst_1
    //   881: putfield l : Z
    //   884: aload #9
    //   886: iconst_1
    //   887: putfield k : Z
    //   890: aload #9
    //   892: iload #4
    //   894: invokevirtual m : (I)V
    //   897: goto -> 967
    //   900: aload_0
    //   901: getfield s : Z
    //   904: ifeq -> 916
    //   907: aload #9
    //   909: aload_0
    //   910: getfield u : I
    //   913: putfield g : I
    //   916: aload_0
    //   917: getfield t : Z
    //   920: ifeq -> 932
    //   923: aload #9
    //   925: aload_0
    //   926: getfield v : I
    //   929: invokevirtual m : (I)V
    //   932: aload_0
    //   933: getfield b : Landroid/graphics/Rect;
    //   936: astore #6
    //   938: aload #6
    //   940: ifnull -> 957
    //   943: new android/graphics/Rect
    //   946: dup
    //   947: aload #6
    //   949: invokespecial <init> : (Landroid/graphics/Rect;)V
    //   952: astore #6
    //   954: goto -> 960
    //   957: aconst_null
    //   958: astore #6
    //   960: aload #9
    //   962: aload #6
    //   964: putfield A : Landroid/graphics/Rect;
    //   967: new b/b/o/i/d$d
    //   970: dup
    //   971: aload #9
    //   973: aload_1
    //   974: aload_0
    //   975: getfield r : I
    //   978: invokespecial <init> : (Lb/b/p/m0;Lb/b/o/i/g;I)V
    //   981: astore #6
    //   983: aload_0
    //   984: getfield j : Ljava/util/List;
    //   987: aload #6
    //   989: invokeinterface add : (Ljava/lang/Object;)Z
    //   994: pop
    //   995: aload #9
    //   997: invokevirtual i : ()V
    //   1000: aload #9
    //   1002: getfield d : Lb/b/p/f0;
    //   1005: astore #6
    //   1007: aload #6
    //   1009: aload_0
    //   1010: invokevirtual setOnKeyListener : (Landroid/view/View$OnKeyListener;)V
    //   1013: aload #7
    //   1015: ifnonnull -> 1090
    //   1018: aload_0
    //   1019: getfield x : Z
    //   1022: ifeq -> 1090
    //   1025: aload_1
    //   1026: getfield m : Ljava/lang/CharSequence;
    //   1029: ifnull -> 1090
    //   1032: aload #10
    //   1034: getstatic b/b/g.abc_popup_menu_header_item_layout : I
    //   1037: aload #6
    //   1039: iconst_0
    //   1040: invokevirtual inflate : (ILandroid/view/ViewGroup;Z)Landroid/view/View;
    //   1043: checkcast android/widget/FrameLayout
    //   1046: astore #8
    //   1048: aload #8
    //   1050: ldc_w 16908310
    //   1053: invokevirtual findViewById : (I)Landroid/view/View;
    //   1056: checkcast android/widget/TextView
    //   1059: astore #7
    //   1061: aload #8
    //   1063: iconst_0
    //   1064: invokevirtual setEnabled : (Z)V
    //   1067: aload #7
    //   1069: aload_1
    //   1070: getfield m : Ljava/lang/CharSequence;
    //   1073: invokevirtual setText : (Ljava/lang/CharSequence;)V
    //   1076: aload #6
    //   1078: aload #8
    //   1080: aconst_null
    //   1081: iconst_0
    //   1082: invokevirtual addHeaderView : (Landroid/view/View;Ljava/lang/Object;Z)V
    //   1085: aload #9
    //   1087: invokevirtual i : ()V
    //   1090: return
    // Exception table:
    //   from	to	target	type
    //   504	525	528	java/lang/Exception
  }
  
  public class a implements ViewTreeObserver.OnGlobalLayoutListener {
    public final d b;
    
    public a(d this$0) {}
    
    public void onGlobalLayout() {
      if (this.b.a() && this.b.j.size() > 0 && !((k0)((d.d)this.b.j.get(0)).a).B) {
        View view = this.b.q;
        if (view == null || !view.isShown()) {
          this.b.dismiss();
          return;
        } 
        Iterator<d.d> iterator = this.b.j.iterator();
        while (iterator.hasNext())
          ((d.d)iterator.next()).a.i(); 
      } 
    }
  }
  
  public class b implements View.OnAttachStateChangeListener {
    public final d b;
    
    public b(d this$0) {}
    
    public void onViewAttachedToWindow(View param1View) {}
    
    public void onViewDetachedFromWindow(View param1View) {
      ViewTreeObserver viewTreeObserver = this.b.z;
      if (viewTreeObserver != null) {
        if (!viewTreeObserver.isAlive())
          this.b.z = param1View.getViewTreeObserver(); 
        d d1 = this.b;
        d1.z.removeGlobalOnLayoutListener(d1.k);
      } 
      param1View.removeOnAttachStateChangeListener(this);
    }
  }
  
  public class c implements l0 {
    public final d b;
    
    public c(d this$0) {}
    
    public void g(g param1g, MenuItem param1MenuItem) {
      // Byte code:
      //   0: aload_0
      //   1: getfield b : Lb/b/o/i/d;
      //   4: getfield h : Landroid/os/Handler;
      //   7: astore #8
      //   9: aconst_null
      //   10: astore #7
      //   12: aload #8
      //   14: aconst_null
      //   15: invokevirtual removeCallbacksAndMessages : (Ljava/lang/Object;)V
      //   18: aload_0
      //   19: getfield b : Lb/b/o/i/d;
      //   22: getfield j : Ljava/util/List;
      //   25: invokeinterface size : ()I
      //   30: istore #4
      //   32: iconst_0
      //   33: istore_3
      //   34: iload_3
      //   35: iload #4
      //   37: if_icmpge -> 72
      //   40: aload_1
      //   41: aload_0
      //   42: getfield b : Lb/b/o/i/d;
      //   45: getfield j : Ljava/util/List;
      //   48: iload_3
      //   49: invokeinterface get : (I)Ljava/lang/Object;
      //   54: checkcast b/b/o/i/d$d
      //   57: getfield b : Lb/b/o/i/g;
      //   60: if_acmpne -> 66
      //   63: goto -> 74
      //   66: iinc #3, 1
      //   69: goto -> 34
      //   72: iconst_m1
      //   73: istore_3
      //   74: iload_3
      //   75: iconst_m1
      //   76: if_icmpne -> 80
      //   79: return
      //   80: iinc #3, 1
      //   83: iload_3
      //   84: aload_0
      //   85: getfield b : Lb/b/o/i/d;
      //   88: getfield j : Ljava/util/List;
      //   91: invokeinterface size : ()I
      //   96: if_icmpge -> 117
      //   99: aload_0
      //   100: getfield b : Lb/b/o/i/d;
      //   103: getfield j : Ljava/util/List;
      //   106: iload_3
      //   107: invokeinterface get : (I)Ljava/lang/Object;
      //   112: checkcast b/b/o/i/d$d
      //   115: astore #7
      //   117: new b/b/o/i/d$c$a
      //   120: dup
      //   121: aload_0
      //   122: aload #7
      //   124: aload_2
      //   125: aload_1
      //   126: invokespecial <init> : (Lb/b/o/i/d$c;Lb/b/o/i/d$d;Landroid/view/MenuItem;Lb/b/o/i/g;)V
      //   129: astore_2
      //   130: invokestatic uptimeMillis : ()J
      //   133: lstore #5
      //   135: aload_0
      //   136: getfield b : Lb/b/o/i/d;
      //   139: getfield h : Landroid/os/Handler;
      //   142: aload_2
      //   143: aload_1
      //   144: lload #5
      //   146: ldc2_w 200
      //   149: ladd
      //   150: invokevirtual postAtTime : (Ljava/lang/Runnable;Ljava/lang/Object;J)Z
      //   153: pop
      //   154: return
    }
    
    public void k(g param1g, MenuItem param1MenuItem) {
      this.b.h.removeCallbacksAndMessages(param1g);
    }
    
    public class a implements Runnable {
      public final d.d b;
      
      public final MenuItem c;
      
      public final g d;
      
      public final d.c e;
      
      public a(d.c this$0, d.d param2d, MenuItem param2MenuItem, g param2g) {}
      
      public void run() {
        d.d d1 = this.b;
        if (d1 != null) {
          this.e.b.B = true;
          d1.b.c(false);
          this.e.b.B = false;
        } 
        if (this.c.isEnabled() && this.c.hasSubMenu())
          this.d.r(this.c, 4); 
      }
    }
  }
  
  public class a implements Runnable {
    public final d.d b;
    
    public final MenuItem c;
    
    public final g d;
    
    public final d.c e;
    
    public a(d this$0, d.d param1d, MenuItem param1MenuItem, g param1g) {}
    
    public void run() {
      d.d d1 = this.b;
      if (d1 != null) {
        this.e.b.B = true;
        d1.b.c(false);
        this.e.b.B = false;
      } 
      if (this.c.isEnabled() && this.c.hasSubMenu())
        this.d.r(this.c, 4); 
    }
  }
  
  public static class d {
    public final m0 a;
    
    public final g b;
    
    public final int c;
    
    public d(m0 param1m0, g param1g, int param1Int) {
      this.a = param1m0;
      this.b = param1g;
      this.c = param1Int;
    }
  }
}


/* Location:              C:\Users\panch\Downloads\dvba_v1.1.0-dex2jar.jar!\b\b\o\i\d.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */