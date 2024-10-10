package b.b.p;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.util.SparseBooleanArray;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import androidx.appcompat.view.menu.ActionMenuItemView;
import androidx.appcompat.widget.ActionMenuView;
import b.b.g;
import b.b.o.i.b;
import b.b.o.i.g;
import b.b.o.i.i;
import b.b.o.i.k;
import b.b.o.i.l;
import b.b.o.i.m;
import b.b.o.i.n;
import b.b.o.i.p;
import b.b.o.i.r;
import java.util.ArrayList;

public class c extends b {
  public d j;
  
  public Drawable k;
  
  public boolean l;
  
  public boolean m;
  
  public boolean n;
  
  public int o;
  
  public int p;
  
  public int q;
  
  public boolean r;
  
  public int s;
  
  public final SparseBooleanArray t = new SparseBooleanArray();
  
  public e u;
  
  public a v;
  
  public c w;
  
  public b x;
  
  public final f y = new f(this);
  
  public int z;
  
  public c(Context paramContext) {
    super(paramContext, g.abc_action_menu_layout, g.abc_action_menu_item_layout);
  }
  
  public View a(i parami, View paramView, ViewGroup paramViewGroup) {
    boolean bool;
    View view = parami.getActionView();
    if (view == null || parami.f())
      view = super.a(parami, paramView, paramViewGroup); 
    if (parami.C) {
      bool = true;
    } else {
      bool = false;
    } 
    view.setVisibility(bool);
    ActionMenuView actionMenuView = (ActionMenuView)paramViewGroup;
    ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
    if (!actionMenuView.checkLayoutParams(layoutParams))
      view.setLayoutParams((ViewGroup.LayoutParams)actionMenuView.s(layoutParams)); 
    return view;
  }
  
  public void b(g paramg, boolean paramBoolean) {
    e();
    m.a a1 = this.f;
    if (a1 != null)
      a1.b(paramg, paramBoolean); 
  }
  
  public boolean e() {
    return i() | l();
  }
  
  public boolean f(r paramr) {
    boolean bool = paramr.hasVisibleItems();
    boolean bool1 = false;
    if (!bool)
      return false; 
    r r1 = paramr;
    while (true) {
      View view;
      g g = r1.A;
      if (g != this.d) {
        r1 = (r)g;
        continue;
      } 
      i i1 = r1.B;
      ViewGroup viewGroup = (ViewGroup)this.i;
      g = null;
      if (viewGroup == null) {
        g g1 = g;
      } else {
        int m = viewGroup.getChildCount();
        byte b1 = 0;
        while (true) {
          g g1 = g;
          if (b1 < m) {
            view = viewGroup.getChildAt(b1);
            if (view instanceof n.a && ((n.a)view).getItemData() == i1)
              break; 
            b1++;
            continue;
          } 
          break;
        } 
      } 
      if (view == null)
        return false; 
      int i = paramr.B.a;
      int j = paramr.size();
      i = 0;
      while (true) {
        bool = bool1;
        if (i < j) {
          MenuItem menuItem = paramr.getItem(i);
          if (menuItem.isVisible() && menuItem.getIcon() != null) {
            bool = true;
            break;
          } 
          i++;
          continue;
        } 
        break;
      } 
      a a1 = new a(this, this.c, paramr, view);
      this.v = a1;
      a1.h = bool;
      k k = a1.j;
      if (k != null)
        k.p(bool); 
      if (this.v.f()) {
        super.f(paramr);
        return true;
      } 
      throw new IllegalStateException("MenuPopupHelper cannot be used without an anchor");
    } 
  }
  
  public boolean g() {
    // Byte code:
    //   0: aload_0
    //   1: getfield d : Lb/b/o/i/g;
    //   4: astore #14
    //   6: aload #14
    //   8: ifnull -> 28
    //   11: aload #14
    //   13: invokevirtual l : ()Ljava/util/ArrayList;
    //   16: astore #14
    //   18: aload #14
    //   20: invokevirtual size : ()I
    //   23: istore #6
    //   25: goto -> 34
    //   28: aconst_null
    //   29: astore #14
    //   31: iconst_0
    //   32: istore #6
    //   34: aload_0
    //   35: getfield q : I
    //   38: istore_1
    //   39: aload_0
    //   40: getfield p : I
    //   43: istore #8
    //   45: iconst_0
    //   46: iconst_0
    //   47: invokestatic makeMeasureSpec : (II)I
    //   50: istore #9
    //   52: aload_0
    //   53: getfield i : Lb/b/o/i/n;
    //   56: checkcast android/view/ViewGroup
    //   59: astore #15
    //   61: iconst_0
    //   62: istore_3
    //   63: iconst_0
    //   64: istore #5
    //   66: iconst_0
    //   67: istore #4
    //   69: iconst_0
    //   70: istore_2
    //   71: iload_3
    //   72: iload #6
    //   74: if_icmpge -> 186
    //   77: aload #14
    //   79: iload_3
    //   80: invokevirtual get : (I)Ljava/lang/Object;
    //   83: checkcast b/b/o/i/i
    //   86: astore #16
    //   88: aload #16
    //   90: getfield y : I
    //   93: iconst_2
    //   94: iand
    //   95: iconst_2
    //   96: if_icmpne -> 105
    //   99: iconst_1
    //   100: istore #7
    //   102: goto -> 108
    //   105: iconst_0
    //   106: istore #7
    //   108: iload #7
    //   110: ifeq -> 119
    //   113: iinc #2, 1
    //   116: goto -> 153
    //   119: aload #16
    //   121: getfield y : I
    //   124: iconst_1
    //   125: iand
    //   126: iconst_1
    //   127: if_icmpne -> 136
    //   130: iconst_1
    //   131: istore #7
    //   133: goto -> 139
    //   136: iconst_0
    //   137: istore #7
    //   139: iload #7
    //   141: ifeq -> 150
    //   144: iinc #4, 1
    //   147: goto -> 153
    //   150: iconst_1
    //   151: istore #5
    //   153: iload_1
    //   154: istore #7
    //   156: aload_0
    //   157: getfield r : Z
    //   160: ifeq -> 177
    //   163: iload_1
    //   164: istore #7
    //   166: aload #16
    //   168: getfield C : Z
    //   171: ifeq -> 177
    //   174: iconst_0
    //   175: istore #7
    //   177: iinc #3, 1
    //   180: iload #7
    //   182: istore_1
    //   183: goto -> 71
    //   186: iload_1
    //   187: istore_3
    //   188: aload_0
    //   189: getfield m : Z
    //   192: ifeq -> 214
    //   195: iload #5
    //   197: ifne -> 210
    //   200: iload_1
    //   201: istore_3
    //   202: iload #4
    //   204: iload_2
    //   205: iadd
    //   206: iload_1
    //   207: if_icmple -> 214
    //   210: iload_1
    //   211: iconst_1
    //   212: isub
    //   213: istore_3
    //   214: iload_3
    //   215: iload_2
    //   216: isub
    //   217: istore_1
    //   218: aload_0
    //   219: getfield t : Landroid/util/SparseBooleanArray;
    //   222: astore #16
    //   224: aload #16
    //   226: invokevirtual clear : ()V
    //   229: iconst_0
    //   230: istore #7
    //   232: iconst_0
    //   233: istore_2
    //   234: iload #8
    //   236: istore #5
    //   238: iload #7
    //   240: iload #6
    //   242: if_icmpge -> 632
    //   245: aload #14
    //   247: iload #7
    //   249: invokevirtual get : (I)Ljava/lang/Object;
    //   252: checkcast b/b/o/i/i
    //   255: astore #17
    //   257: aload #17
    //   259: getfield y : I
    //   262: iconst_2
    //   263: iand
    //   264: iconst_2
    //   265: if_icmpne -> 273
    //   268: iconst_1
    //   269: istore_3
    //   270: goto -> 275
    //   273: iconst_0
    //   274: istore_3
    //   275: iload_3
    //   276: ifeq -> 348
    //   279: aload_0
    //   280: aload #17
    //   282: aconst_null
    //   283: aload #15
    //   285: invokevirtual a : (Lb/b/o/i/i;Landroid/view/View;Landroid/view/ViewGroup;)Landroid/view/View;
    //   288: astore #18
    //   290: aload #18
    //   292: iload #9
    //   294: iload #9
    //   296: invokevirtual measure : (II)V
    //   299: aload #18
    //   301: invokevirtual getMeasuredWidth : ()I
    //   304: istore #8
    //   306: iload #5
    //   308: iload #8
    //   310: isub
    //   311: istore #4
    //   313: iload_2
    //   314: istore_3
    //   315: iload_2
    //   316: ifne -> 322
    //   319: iload #8
    //   321: istore_3
    //   322: aload #17
    //   324: getfield b : I
    //   327: istore_2
    //   328: iload_2
    //   329: ifeq -> 339
    //   332: aload #16
    //   334: iload_2
    //   335: iconst_1
    //   336: invokevirtual put : (IZ)V
    //   339: aload #17
    //   341: iconst_1
    //   342: invokevirtual k : (Z)V
    //   345: goto -> 607
    //   348: aload #17
    //   350: getfield y : I
    //   353: iconst_1
    //   354: iand
    //   355: iconst_1
    //   356: if_icmpne -> 364
    //   359: iconst_1
    //   360: istore_3
    //   361: goto -> 366
    //   364: iconst_0
    //   365: istore_3
    //   366: iload_3
    //   367: ifeq -> 612
    //   370: aload #17
    //   372: getfield b : I
    //   375: istore #10
    //   377: aload #16
    //   379: iload #10
    //   381: invokevirtual get : (I)Z
    //   384: istore #13
    //   386: iload_1
    //   387: ifgt -> 395
    //   390: iload #13
    //   392: ifeq -> 406
    //   395: iload #5
    //   397: ifle -> 406
    //   400: iconst_1
    //   401: istore #11
    //   403: goto -> 409
    //   406: iconst_0
    //   407: istore #11
    //   409: iload #5
    //   411: istore #4
    //   413: iload_2
    //   414: istore_3
    //   415: iload #11
    //   417: istore #12
    //   419: iload #11
    //   421: ifeq -> 487
    //   424: aload_0
    //   425: aload #17
    //   427: aconst_null
    //   428: aload #15
    //   430: invokevirtual a : (Lb/b/o/i/i;Landroid/view/View;Landroid/view/ViewGroup;)Landroid/view/View;
    //   433: astore #18
    //   435: aload #18
    //   437: iload #9
    //   439: iload #9
    //   441: invokevirtual measure : (II)V
    //   444: aload #18
    //   446: invokevirtual getMeasuredWidth : ()I
    //   449: istore #8
    //   451: iload #5
    //   453: iload #8
    //   455: isub
    //   456: istore #4
    //   458: iload_2
    //   459: istore_3
    //   460: iload_2
    //   461: ifne -> 467
    //   464: iload #8
    //   466: istore_3
    //   467: iload #4
    //   469: iload_3
    //   470: iadd
    //   471: ifle -> 479
    //   474: iconst_1
    //   475: istore_2
    //   476: goto -> 481
    //   479: iconst_0
    //   480: istore_2
    //   481: iload #11
    //   483: iload_2
    //   484: iand
    //   485: istore #12
    //   487: iload #12
    //   489: ifeq -> 510
    //   492: iload #10
    //   494: ifeq -> 510
    //   497: aload #16
    //   499: iload #10
    //   501: iconst_1
    //   502: invokevirtual put : (IZ)V
    //   505: iload_1
    //   506: istore_2
    //   507: goto -> 589
    //   510: iload_1
    //   511: istore_2
    //   512: iload #13
    //   514: ifeq -> 589
    //   517: aload #16
    //   519: iload #10
    //   521: iconst_0
    //   522: invokevirtual put : (IZ)V
    //   525: iconst_0
    //   526: istore #5
    //   528: iload_1
    //   529: istore_2
    //   530: iload #5
    //   532: iload #7
    //   534: if_icmpge -> 589
    //   537: aload #14
    //   539: iload #5
    //   541: invokevirtual get : (I)Ljava/lang/Object;
    //   544: checkcast b/b/o/i/i
    //   547: astore #18
    //   549: iload_1
    //   550: istore_2
    //   551: aload #18
    //   553: getfield b : I
    //   556: iload #10
    //   558: if_icmpne -> 581
    //   561: iload_1
    //   562: istore_2
    //   563: aload #18
    //   565: invokevirtual g : ()Z
    //   568: ifeq -> 575
    //   571: iload_1
    //   572: iconst_1
    //   573: iadd
    //   574: istore_2
    //   575: aload #18
    //   577: iconst_0
    //   578: invokevirtual k : (Z)V
    //   581: iinc #5, 1
    //   584: iload_2
    //   585: istore_1
    //   586: goto -> 528
    //   589: iload_2
    //   590: istore_1
    //   591: iload #12
    //   593: ifeq -> 600
    //   596: iload_2
    //   597: iconst_1
    //   598: isub
    //   599: istore_1
    //   600: aload #17
    //   602: iload #12
    //   604: invokevirtual k : (Z)V
    //   607: iload_3
    //   608: istore_2
    //   609: goto -> 622
    //   612: aload #17
    //   614: iconst_0
    //   615: invokevirtual k : (Z)V
    //   618: iload #5
    //   620: istore #4
    //   622: iinc #7, 1
    //   625: iload #4
    //   627: istore #5
    //   629: goto -> 238
    //   632: iconst_1
    //   633: ireturn
  }
  
  public void h(boolean paramBoolean) {
    ActionMenuView actionMenuView;
    super.h(paramBoolean);
    ((View)this.i).requestLayout();
    g g = this.d;
    byte b1 = 0;
    if (g != null) {
      g.i();
      ArrayList arrayList = g.i;
      int j = arrayList.size();
      for (byte b2 = 0; b2 < j; b2++)
        b.i.m.b b3 = ((i)arrayList.get(b2)).A; 
    } 
    g = this.d;
    if (g != null) {
      g.i();
      ArrayList arrayList = g.j;
    } else {
      g = null;
    } 
    int i = b1;
    if (this.m) {
      i = b1;
      if (g != null) {
        int j = g.size();
        if (j == 1) {
          i = ((i)g.get(0)).C ^ true;
        } else {
          i = b1;
          if (j > 0)
            i = 1; 
        } 
      } 
    } 
    d d1 = this.j;
    if (i != 0) {
      if (d1 == null)
        this.j = new d(this, this.b); 
      ViewGroup viewGroup = (ViewGroup)this.j.getParent();
      if (viewGroup != this.i) {
        if (viewGroup != null)
          viewGroup.removeView((View)this.j); 
        actionMenuView = (ActionMenuView)this.i;
        d d2 = this.j;
        ActionMenuView.c c1 = actionMenuView.r();
        c1.c = true;
        actionMenuView.addView((View)d2, (ViewGroup.LayoutParams)c1);
      } 
    } else if (actionMenuView != null) {
      ViewParent viewParent = actionMenuView.getParent();
      n n = this.i;
      if (viewParent == n)
        ((ViewGroup)n).removeView((View)this.j); 
    } 
    ((ActionMenuView)this.i).setOverflowReserved(this.m);
  }
  
  public boolean i() {
    c c1 = this.w;
    if (c1 != null) {
      n n = this.i;
      if (n != null) {
        ((View)n).removeCallbacks(c1);
        this.w = null;
        return true;
      } 
    } 
    e e1 = this.u;
    if (e1 != null) {
      if (e1.b())
        e1.j.dismiss(); 
      return true;
    } 
    return false;
  }
  
  public void j(Context paramContext, g paramg) {
    this.c = paramContext;
    LayoutInflater.from(paramContext);
    this.d = paramg;
    Resources resources = paramContext.getResources();
    if (!this.n)
      this.m = true; 
    int j = (paramContext.getResources().getDisplayMetrics()).widthPixels;
    int i = 2;
    this.o = j / 2;
    Configuration configuration = paramContext.getResources().getConfiguration();
    j = configuration.screenWidthDp;
    int k = configuration.screenHeightDp;
    if (configuration.smallestScreenWidthDp > 600 || j > 600 || (j > 960 && k > 720) || (j > 720 && k > 960)) {
      i = 5;
    } else if (j >= 500 || (j > 640 && k > 480) || (j > 480 && k > 640)) {
      i = 4;
    } else if (j >= 360) {
      i = 3;
    } 
    this.q = i;
    i = this.o;
    if (this.m) {
      if (this.j == null) {
        d d1 = new d(this, this.b);
        this.j = d1;
        if (this.l) {
          d1.setImageDrawable(this.k);
          this.k = null;
          this.l = false;
        } 
        j = View.MeasureSpec.makeMeasureSpec(0, 0);
        this.j.measure(j, j);
      } 
      i -= this.j.getMeasuredWidth();
    } else {
      this.j = null;
    } 
    this.p = i;
    this.s = (int)((resources.getDisplayMetrics()).density * 56.0F);
  }
  
  public boolean l() {
    a a1 = this.v;
    if (a1 != null) {
      if (a1.b())
        a1.j.dismiss(); 
      return true;
    } 
    return false;
  }
  
  public boolean m() {
    boolean bool;
    e e1 = this.u;
    if (e1 != null && e1.b()) {
      bool = true;
    } else {
      bool = false;
    } 
    return bool;
  }
  
  public boolean n() {
    if (this.m && !m()) {
      g g = this.d;
      if (g != null && this.i != null && this.w == null) {
        g.i();
        if (!g.j.isEmpty()) {
          c c1 = new c(this, new e(this, this.c, this.d, (View)this.j, true));
          this.w = c1;
          ((View)this.i).post(c1);
          return true;
        } 
      } 
    } 
    return false;
  }
  
  public class a extends l {
    public final c m;
    
    public a(c this$0, Context param1Context, r param1r, View param1View) {
      super(param1Context, (g)param1r, param1View, false, b.b.a.actionOverflowMenuStyle, 0);
      if (!param1r.B.g()) {
        View view;
        c.d d2 = this$0.j;
        c.d d1 = d2;
        if (d2 == null)
          view = (View)this$0.i; 
        this.f = view;
      } 
      d(this$0.y);
    }
    
    public void c() {
      c c1 = this.m;
      c1.v = null;
      c1.z = 0;
      super.c();
    }
  }
  
  public class b extends ActionMenuItemView.b {
    public final c a;
    
    public b(c this$0) {}
  }
  
  public class c implements Runnable {
    public c.e b;
    
    public final c c;
    
    public c(c this$0, c.e param1e) {
      this.b = param1e;
    }
    
    public void run() {
      g g = this.c.d;
      if (g != null) {
        g.a a = g.e;
        if (a != null)
          a.a(g); 
      } 
      View view = (View)this.c.i;
      if (view != null && view.getWindowToken() != null && this.b.f())
        this.c.u = this.b; 
      this.c.w = null;
    }
  }
  
  public class d extends n implements ActionMenuView.a {
    public final c d;
    
    public d(c this$0, Context param1Context) {
      super(param1Context, null, b.b.a.actionOverflowButtonStyle);
      setClickable(true);
      setFocusable(true);
      setVisibility(0);
      setEnabled(true);
      a.a.a.a.a.w0((View)this, getContentDescription());
      setOnTouchListener(new a(this, (View)this, this$0));
    }
    
    public boolean a() {
      return false;
    }
    
    public boolean b() {
      return false;
    }
    
    public boolean performClick() {
      if (super.performClick())
        return true; 
      playSoundEffect(0);
      this.d.n();
      return true;
    }
    
    public boolean setFrame(int param1Int1, int param1Int2, int param1Int3, int param1Int4) {
      boolean bool = super.setFrame(param1Int1, param1Int2, param1Int3, param1Int4);
      Drawable drawable1 = getDrawable();
      Drawable drawable2 = getBackground();
      if (drawable1 != null && drawable2 != null) {
        int i = getWidth();
        param1Int4 = getHeight();
        param1Int1 = Math.max(i, param1Int4) / 2;
        int k = getPaddingLeft();
        int j = getPaddingRight();
        param1Int3 = getPaddingTop();
        param1Int2 = getPaddingBottom();
        i = (i + k - j) / 2;
        param1Int2 = (param1Int4 + param1Int3 - param1Int2) / 2;
        drawable2.setHotspotBounds(i - param1Int1, param1Int2 - param1Int1, i + param1Int1, param1Int2 + param1Int1);
      } 
      return bool;
    }
    
    public class a extends h0 {
      public final c.d k;
      
      public a(c.d this$0, View param2View, c param2c) {
        super(param2View);
      }
      
      public p b() {
        c.e e = this.k.d.u;
        return (p)((e == null) ? null : e.a());
      }
      
      public boolean c() {
        this.k.d.n();
        return true;
      }
      
      public boolean d() {
        c c = this.k.d;
        if (c.w != null)
          return false; 
        c.i();
        return true;
      }
    }
  }
  
  public class a extends h0 {
    public final c.d k;
    
    public a(c this$0, View param1View, c param1c) {
      super(param1View);
    }
    
    public p b() {
      c.e e = this.k.d.u;
      return (p)((e == null) ? null : e.a());
    }
    
    public boolean c() {
      this.k.d.n();
      return true;
    }
    
    public boolean d() {
      c c = this.k.d;
      if (c.w != null)
        return false; 
      c.i();
      return true;
    }
  }
  
  public class e extends l {
    public final c m;
    
    public e(c this$0, Context param1Context, g param1g, View param1View, boolean param1Boolean) {
      super(param1Context, param1g, param1View, param1Boolean, b.b.a.actionOverflowMenuStyle, 0);
      this.g = 8388613;
      d(this$0.y);
    }
    
    public void c() {
      g g = this.m.d;
      if (g != null)
        g.c(true); 
      this.m.u = null;
      super.c();
    }
  }
  
  public class f implements m.a {
    public final c b;
    
    public f(c this$0) {}
    
    public void b(g param1g, boolean param1Boolean) {
      if (param1g instanceof r)
        param1g.k().c(false); 
      m.a a1 = this.b.f;
      if (a1 != null)
        a1.b(param1g, param1Boolean); 
    }
    
    public boolean c(g param1g) {
      c c1 = this.b;
      g g1 = c1.d;
      boolean bool = false;
      if (param1g == g1)
        return false; 
      int i = ((r)param1g).B.a;
      m.a a1 = c1.f;
      if (a1 != null)
        bool = a1.c(param1g); 
      return bool;
    }
  }
}


/* Location:              C:\Users\panch\Downloads\dvba_v1.1.0-dex2jar.jar!\b\b\p\c.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */