package b.b.k;

import android.app.Activity;
import android.app.UiModeManager;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.pm.PackageManager;
import android.content.res.Configuration;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.location.LocationManager;
import android.os.Build;
import android.os.Bundle;
import android.os.PowerManager;
import android.text.TextUtils;
import android.util.AndroidRuntimeException;
import android.util.AttributeSet;
import android.util.Log;
import android.util.TypedValue;
import android.view.ActionMode;
import android.view.KeyEvent;
import android.view.KeyboardShortcutGroup;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.Window;
import android.view.WindowManager;
import android.widget.FrameLayout;
import android.widget.PopupWindow;
import android.widget.TextView;
import androidx.appcompat.widget.ActionBarContextView;
import androidx.appcompat.widget.ContentFrameLayout;
import b.b.o.i.g;
import b.b.o.i.m;
import b.b.p.c0;
import b.b.p.c1;
import b.b.p.d1;
import b.b.p.x0;
import b.i.m.l;
import b.i.m.q;
import b.i.m.r;
import b.i.m.s;
import b.i.m.u;
import java.lang.ref.WeakReference;
import java.util.List;

public class k extends j implements g.a, LayoutInflater.Factory2 {
  public static final b.f.h<String, Integer> a0 = new b.f.h();
  
  public static final boolean b0 = false;
  
  public static final int[] c0 = new int[] { 16842836 };
  
  public static final boolean d0 = "robolectric".equals(Build.FINGERPRINT) ^ true;
  
  public static final boolean e0 = true;
  
  public static boolean f0;
  
  public boolean A;
  
  public boolean B;
  
  public boolean C;
  
  public boolean D;
  
  public boolean E;
  
  public boolean F;
  
  public j[] G;
  
  public j H;
  
  public boolean I;
  
  public boolean J;
  
  public boolean K;
  
  public boolean L;
  
  public boolean M;
  
  public int N = -100;
  
  public int O;
  
  public boolean P;
  
  public boolean Q;
  
  public g R;
  
  public g S;
  
  public boolean T;
  
  public int U;
  
  public final Runnable V = new b(this);
  
  public boolean W;
  
  public Rect X;
  
  public Rect Y;
  
  public r Z;
  
  public final Object d;
  
  public final Context e;
  
  public Window f;
  
  public e g;
  
  public final i h;
  
  public a i;
  
  public MenuInflater j;
  
  public CharSequence k;
  
  public c0 l;
  
  public c m;
  
  public k n;
  
  public b.b.o.a o;
  
  public ActionBarContextView p;
  
  public PopupWindow q;
  
  public Runnable r;
  
  public q s = null;
  
  public boolean t = true;
  
  public boolean u;
  
  public ViewGroup v;
  
  public TextView w;
  
  public View x;
  
  public boolean y;
  
  public boolean z;
  
  static {
    if (b0 && !f0) {
      Thread.setDefaultUncaughtExceptionHandler(new a(Thread.getDefaultUncaughtExceptionHandler()));
      f0 = true;
    } 
  }
  
  public k(Context paramContext, Window paramWindow, i parami, Object paramObject) {
    this.e = paramContext;
    this.h = parami;
    this.d = paramObject;
    if (this.N == -100 && paramObject instanceof android.app.Dialog) {
      while (true) {
        if (paramContext != null) {
          h h1;
          if (paramContext instanceof h) {
            h1 = (h)paramContext;
            break;
          } 
          if (h1 instanceof ContextWrapper) {
            Context context = ((ContextWrapper)h1).getBaseContext();
            continue;
          } 
        } 
        paramContext = null;
        break;
      } 
      if (paramContext != null)
        this.N = ((k)paramContext.q()).N; 
    } 
    if (this.N == -100) {
      Integer integer = (Integer)a0.getOrDefault(this.d.getClass().getName(), null);
      if (integer != null) {
        this.N = integer.intValue();
        a0.remove(this.d.getClass().getName());
      } 
    } 
    if (paramWindow != null)
      r(paramWindow); 
    b.b.p.j.e();
  }
  
  public final void A() {
    if (this.f == null) {
      Object object = this.d;
      if (object instanceof Activity)
        r(((Activity)object).getWindow()); 
    } 
    if (this.f != null)
      return; 
    throw new IllegalStateException("We have not been given a Window");
  }
  
  public j B(Menu paramMenu) {
    byte b1;
    j[] arrayOfJ = this.G;
    byte b2 = 0;
    if (arrayOfJ != null) {
      b1 = arrayOfJ.length;
    } else {
      b1 = 0;
    } 
    while (b2 < b1) {
      j j1 = arrayOfJ[b2];
      if (j1 != null && j1.h == paramMenu)
        return j1; 
      b2++;
    } 
    return null;
  }
  
  public final g C(Context paramContext) {
    if (this.R == null) {
      if (t.d == null) {
        paramContext = paramContext.getApplicationContext();
        t.d = new t(paramContext, (LocationManager)paramContext.getSystemService("location"));
      } 
      this.R = new h(this, t.d);
    } 
    return this.R;
  }
  
  public j D(int paramInt) {
    // Byte code:
    //   0: aload_0
    //   1: getfield G : [Lb/b/k/k$j;
    //   4: astore_3
    //   5: aload_3
    //   6: ifnull -> 17
    //   9: aload_3
    //   10: astore_2
    //   11: aload_3
    //   12: arraylength
    //   13: iload_1
    //   14: if_icmpgt -> 42
    //   17: iload_1
    //   18: iconst_1
    //   19: iadd
    //   20: anewarray b/b/k/k$j
    //   23: astore_2
    //   24: aload_3
    //   25: ifnull -> 37
    //   28: aload_3
    //   29: iconst_0
    //   30: aload_2
    //   31: iconst_0
    //   32: aload_3
    //   33: arraylength
    //   34: invokestatic arraycopy : (Ljava/lang/Object;ILjava/lang/Object;II)V
    //   37: aload_0
    //   38: aload_2
    //   39: putfield G : [Lb/b/k/k$j;
    //   42: aload_2
    //   43: iload_1
    //   44: aaload
    //   45: astore #4
    //   47: aload #4
    //   49: astore_3
    //   50: aload #4
    //   52: ifnonnull -> 68
    //   55: new b/b/k/k$j
    //   58: dup
    //   59: iload_1
    //   60: invokespecial <init> : (I)V
    //   63: astore_3
    //   64: aload_2
    //   65: iload_1
    //   66: aload_3
    //   67: aastore
    //   68: aload_3
    //   69: areturn
  }
  
  public final Window.Callback E() {
    return this.f.getCallback();
  }
  
  public final void F() {
    // Byte code:
    //   0: aload_0
    //   1: invokevirtual z : ()V
    //   4: aload_0
    //   5: getfield A : Z
    //   8: ifeq -> 102
    //   11: aload_0
    //   12: getfield i : Lb/b/k/a;
    //   15: ifnull -> 21
    //   18: goto -> 102
    //   21: aload_0
    //   22: getfield d : Ljava/lang/Object;
    //   25: astore_1
    //   26: aload_1
    //   27: instanceof android/app/Activity
    //   30: ifeq -> 60
    //   33: new b/b/k/u
    //   36: dup
    //   37: aload_0
    //   38: getfield d : Ljava/lang/Object;
    //   41: checkcast android/app/Activity
    //   44: aload_0
    //   45: getfield B : Z
    //   48: invokespecial <init> : (Landroid/app/Activity;Z)V
    //   51: astore_1
    //   52: aload_0
    //   53: aload_1
    //   54: putfield i : Lb/b/k/a;
    //   57: goto -> 85
    //   60: aload_1
    //   61: instanceof android/app/Dialog
    //   64: ifeq -> 85
    //   67: new b/b/k/u
    //   70: dup
    //   71: aload_0
    //   72: getfield d : Ljava/lang/Object;
    //   75: checkcast android/app/Dialog
    //   78: invokespecial <init> : (Landroid/app/Dialog;)V
    //   81: astore_1
    //   82: goto -> 52
    //   85: aload_0
    //   86: getfield i : Lb/b/k/a;
    //   89: astore_1
    //   90: aload_1
    //   91: ifnull -> 102
    //   94: aload_1
    //   95: aload_0
    //   96: getfield W : Z
    //   99: invokevirtual g : (Z)V
    //   102: return
  }
  
  public final void G(int paramInt) {
    this.U = 1 << paramInt | this.U;
    if (!this.T) {
      l.P(this.f.getDecorView(), this.V);
      this.T = true;
    } 
  }
  
  public int H(Context paramContext, int paramInt) {
    if (paramInt != -100) {
      if (paramInt != -1) {
        g g1;
        if (paramInt != 0) {
          if (paramInt != 1 && paramInt != 2) {
            if (paramInt == 3) {
              if (this.S == null)
                this.S = new f(this, paramContext); 
              g1 = this.S;
              return g1.c();
            } 
            throw new IllegalStateException("Unknown value set for night mode. Please use one of the MODE_NIGHT values from AppCompatDelegate.");
          } 
        } else {
          if (Build.VERSION.SDK_INT >= 23 && ((UiModeManager)g1.getApplicationContext().getSystemService(UiModeManager.class)).getNightMode() == 0)
            return -1; 
          g1 = C((Context)g1);
          return g1.c();
        } 
      } 
      return paramInt;
    } 
    return -1;
  }
  
  public final void I(j paramj, KeyEvent paramKeyEvent) {
    // Byte code:
    //   0: aload_1
    //   1: getfield m : Z
    //   4: ifne -> 852
    //   7: aload_0
    //   8: getfield M : Z
    //   11: ifeq -> 17
    //   14: goto -> 852
    //   17: aload_1
    //   18: getfield a : I
    //   21: ifne -> 56
    //   24: aload_0
    //   25: getfield e : Landroid/content/Context;
    //   28: invokevirtual getResources : ()Landroid/content/res/Resources;
    //   31: invokevirtual getConfiguration : ()Landroid/content/res/Configuration;
    //   34: getfield screenLayout : I
    //   37: bipush #15
    //   39: iand
    //   40: iconst_4
    //   41: if_icmpne -> 49
    //   44: iconst_1
    //   45: istore_3
    //   46: goto -> 51
    //   49: iconst_0
    //   50: istore_3
    //   51: iload_3
    //   52: ifeq -> 56
    //   55: return
    //   56: aload_0
    //   57: invokevirtual E : ()Landroid/view/Window$Callback;
    //   60: astore #4
    //   62: aload #4
    //   64: ifnull -> 92
    //   67: aload #4
    //   69: aload_1
    //   70: getfield a : I
    //   73: aload_1
    //   74: getfield h : Lb/b/o/i/g;
    //   77: invokeinterface onMenuOpened : (ILandroid/view/Menu;)Z
    //   82: ifne -> 92
    //   85: aload_0
    //   86: aload_1
    //   87: iconst_1
    //   88: invokevirtual u : (Lb/b/k/k$j;Z)V
    //   91: return
    //   92: aload_0
    //   93: getfield e : Landroid/content/Context;
    //   96: ldc_w 'window'
    //   99: invokevirtual getSystemService : (Ljava/lang/String;)Ljava/lang/Object;
    //   102: checkcast android/view/WindowManager
    //   105: astore #6
    //   107: aload #6
    //   109: ifnonnull -> 113
    //   112: return
    //   113: aload_0
    //   114: aload_1
    //   115: aload_2
    //   116: invokevirtual K : (Lb/b/k/k$j;Landroid/view/KeyEvent;)Z
    //   119: ifne -> 123
    //   122: return
    //   123: aload_1
    //   124: getfield e : Landroid/view/ViewGroup;
    //   127: ifnull -> 171
    //   130: aload_1
    //   131: getfield o : Z
    //   134: ifeq -> 140
    //   137: goto -> 171
    //   140: aload_1
    //   141: getfield g : Landroid/view/View;
    //   144: astore_2
    //   145: aload_2
    //   146: ifnull -> 784
    //   149: aload_2
    //   150: invokevirtual getLayoutParams : ()Landroid/view/ViewGroup$LayoutParams;
    //   153: astore_2
    //   154: aload_2
    //   155: ifnull -> 784
    //   158: aload_2
    //   159: getfield width : I
    //   162: iconst_m1
    //   163: if_icmpne -> 784
    //   166: iconst_m1
    //   167: istore_3
    //   168: goto -> 787
    //   171: aload_1
    //   172: getfield e : Landroid/view/ViewGroup;
    //   175: astore_2
    //   176: aconst_null
    //   177: astore #5
    //   179: aload_2
    //   180: ifnonnull -> 396
    //   183: aload_0
    //   184: invokevirtual F : ()V
    //   187: aload_0
    //   188: getfield i : Lb/b/k/a;
    //   191: astore_2
    //   192: aload_2
    //   193: ifnull -> 204
    //   196: aload_2
    //   197: invokevirtual d : ()Landroid/content/Context;
    //   200: astore_2
    //   201: goto -> 206
    //   204: aconst_null
    //   205: astore_2
    //   206: aload_2
    //   207: astore #4
    //   209: aload_2
    //   210: ifnonnull -> 219
    //   213: aload_0
    //   214: getfield e : Landroid/content/Context;
    //   217: astore #4
    //   219: new android/util/TypedValue
    //   222: dup
    //   223: invokespecial <init> : ()V
    //   226: astore #7
    //   228: aload #4
    //   230: invokevirtual getResources : ()Landroid/content/res/Resources;
    //   233: invokevirtual newTheme : ()Landroid/content/res/Resources$Theme;
    //   236: astore_2
    //   237: aload_2
    //   238: aload #4
    //   240: invokevirtual getTheme : ()Landroid/content/res/Resources$Theme;
    //   243: invokevirtual setTo : (Landroid/content/res/Resources$Theme;)V
    //   246: aload_2
    //   247: getstatic b/b/a.actionBarPopupTheme : I
    //   250: aload #7
    //   252: iconst_1
    //   253: invokevirtual resolveAttribute : (ILandroid/util/TypedValue;Z)Z
    //   256: pop
    //   257: aload #7
    //   259: getfield resourceId : I
    //   262: istore_3
    //   263: iload_3
    //   264: ifeq -> 273
    //   267: aload_2
    //   268: iload_3
    //   269: iconst_1
    //   270: invokevirtual applyStyle : (IZ)V
    //   273: aload_2
    //   274: getstatic b/b/a.panelMenuListTheme : I
    //   277: aload #7
    //   279: iconst_1
    //   280: invokevirtual resolveAttribute : (ILandroid/util/TypedValue;Z)Z
    //   283: pop
    //   284: aload #7
    //   286: getfield resourceId : I
    //   289: istore_3
    //   290: iload_3
    //   291: ifeq -> 297
    //   294: goto -> 301
    //   297: getstatic b/b/i.Theme_AppCompat_CompactMenu : I
    //   300: istore_3
    //   301: aload_2
    //   302: iload_3
    //   303: iconst_1
    //   304: invokevirtual applyStyle : (IZ)V
    //   307: new b/b/o/c
    //   310: dup
    //   311: aload #4
    //   313: iconst_0
    //   314: invokespecial <init> : (Landroid/content/Context;I)V
    //   317: astore #4
    //   319: aload #4
    //   321: invokevirtual getTheme : ()Landroid/content/res/Resources$Theme;
    //   324: aload_2
    //   325: invokevirtual setTo : (Landroid/content/res/Resources$Theme;)V
    //   328: aload_1
    //   329: aload #4
    //   331: putfield j : Landroid/content/Context;
    //   334: aload #4
    //   336: getstatic b/b/j.AppCompatTheme : [I
    //   339: invokevirtual obtainStyledAttributes : ([I)Landroid/content/res/TypedArray;
    //   342: astore_2
    //   343: aload_1
    //   344: aload_2
    //   345: getstatic b/b/j.AppCompatTheme_panelBackground : I
    //   348: iconst_0
    //   349: invokevirtual getResourceId : (II)I
    //   352: putfield b : I
    //   355: aload_1
    //   356: aload_2
    //   357: getstatic b/b/j.AppCompatTheme_android_windowAnimationStyle : I
    //   360: iconst_0
    //   361: invokevirtual getResourceId : (II)I
    //   364: putfield d : I
    //   367: aload_2
    //   368: invokevirtual recycle : ()V
    //   371: aload_1
    //   372: new b/b/k/k$i
    //   375: dup
    //   376: aload_0
    //   377: aload_1
    //   378: getfield j : Landroid/content/Context;
    //   381: invokespecial <init> : (Lb/b/k/k;Landroid/content/Context;)V
    //   384: putfield e : Landroid/view/ViewGroup;
    //   387: aload_1
    //   388: bipush #81
    //   390: putfield c : I
    //   393: goto -> 417
    //   396: aload_1
    //   397: getfield o : Z
    //   400: ifeq -> 417
    //   403: aload_2
    //   404: invokevirtual getChildCount : ()I
    //   407: ifle -> 417
    //   410: aload_1
    //   411: getfield e : Landroid/view/ViewGroup;
    //   414: invokevirtual removeAllViews : ()V
    //   417: aload_1
    //   418: getfield g : Landroid/view/View;
    //   421: astore_2
    //   422: aload_2
    //   423: ifnull -> 434
    //   426: aload_1
    //   427: aload_2
    //   428: putfield f : Landroid/view/View;
    //   431: goto -> 622
    //   434: aload_1
    //   435: getfield h : Lb/b/o/i/g;
    //   438: ifnonnull -> 444
    //   441: goto -> 627
    //   444: aload_0
    //   445: getfield n : Lb/b/k/k$k;
    //   448: ifnonnull -> 463
    //   451: aload_0
    //   452: new b/b/k/k$k
    //   455: dup
    //   456: aload_0
    //   457: invokespecial <init> : (Lb/b/k/k;)V
    //   460: putfield n : Lb/b/k/k$k;
    //   463: aload_0
    //   464: getfield n : Lb/b/k/k$k;
    //   467: astore #4
    //   469: aload_1
    //   470: getfield h : Lb/b/o/i/g;
    //   473: ifnonnull -> 482
    //   476: aload #5
    //   478: astore_2
    //   479: goto -> 613
    //   482: aload_1
    //   483: getfield i : Lb/b/o/i/e;
    //   486: ifnonnull -> 532
    //   489: new b/b/o/i/e
    //   492: dup
    //   493: aload_1
    //   494: getfield j : Landroid/content/Context;
    //   497: getstatic b/b/g.abc_list_menu_item_layout : I
    //   500: invokespecial <init> : (Landroid/content/Context;I)V
    //   503: astore_2
    //   504: aload_1
    //   505: aload_2
    //   506: putfield i : Lb/b/o/i/e;
    //   509: aload_2
    //   510: aload #4
    //   512: putfield i : Lb/b/o/i/m$a;
    //   515: aload_1
    //   516: getfield h : Lb/b/o/i/g;
    //   519: astore #4
    //   521: aload #4
    //   523: aload_2
    //   524: aload #4
    //   526: getfield a : Landroid/content/Context;
    //   529: invokevirtual b : (Lb/b/o/i/m;Landroid/content/Context;)V
    //   532: aload_1
    //   533: getfield i : Lb/b/o/i/e;
    //   536: astore_2
    //   537: aload_1
    //   538: getfield e : Landroid/view/ViewGroup;
    //   541: astore #4
    //   543: aload_2
    //   544: getfield e : Landroidx/appcompat/view/menu/ExpandedMenuView;
    //   547: ifnonnull -> 608
    //   550: aload_2
    //   551: aload_2
    //   552: getfield c : Landroid/view/LayoutInflater;
    //   555: getstatic b/b/g.abc_expanded_menu_layout : I
    //   558: aload #4
    //   560: iconst_0
    //   561: invokevirtual inflate : (ILandroid/view/ViewGroup;Z)Landroid/view/View;
    //   564: checkcast androidx/appcompat/view/menu/ExpandedMenuView
    //   567: putfield e : Landroidx/appcompat/view/menu/ExpandedMenuView;
    //   570: aload_2
    //   571: getfield j : Lb/b/o/i/e$a;
    //   574: ifnonnull -> 589
    //   577: aload_2
    //   578: new b/b/o/i/e$a
    //   581: dup
    //   582: aload_2
    //   583: invokespecial <init> : (Lb/b/o/i/e;)V
    //   586: putfield j : Lb/b/o/i/e$a;
    //   589: aload_2
    //   590: getfield e : Landroidx/appcompat/view/menu/ExpandedMenuView;
    //   593: aload_2
    //   594: getfield j : Lb/b/o/i/e$a;
    //   597: invokevirtual setAdapter : (Landroid/widget/ListAdapter;)V
    //   600: aload_2
    //   601: getfield e : Landroidx/appcompat/view/menu/ExpandedMenuView;
    //   604: aload_2
    //   605: invokevirtual setOnItemClickListener : (Landroid/widget/AdapterView$OnItemClickListener;)V
    //   608: aload_2
    //   609: getfield e : Landroidx/appcompat/view/menu/ExpandedMenuView;
    //   612: astore_2
    //   613: aload_1
    //   614: aload_2
    //   615: putfield f : Landroid/view/View;
    //   618: aload_2
    //   619: ifnull -> 627
    //   622: iconst_1
    //   623: istore_3
    //   624: goto -> 629
    //   627: iconst_0
    //   628: istore_3
    //   629: iload_3
    //   630: ifeq -> 847
    //   633: aload_1
    //   634: getfield f : Landroid/view/View;
    //   637: ifnonnull -> 643
    //   640: goto -> 674
    //   643: aload_1
    //   644: getfield g : Landroid/view/View;
    //   647: ifnull -> 653
    //   650: goto -> 669
    //   653: aload_1
    //   654: getfield i : Lb/b/o/i/e;
    //   657: invokevirtual a : ()Landroid/widget/ListAdapter;
    //   660: checkcast b/b/o/i/e$a
    //   663: invokevirtual getCount : ()I
    //   666: ifle -> 674
    //   669: iconst_1
    //   670: istore_3
    //   671: goto -> 676
    //   674: iconst_0
    //   675: istore_3
    //   676: iload_3
    //   677: ifne -> 683
    //   680: goto -> 847
    //   683: aload_1
    //   684: getfield f : Landroid/view/View;
    //   687: invokevirtual getLayoutParams : ()Landroid/view/ViewGroup$LayoutParams;
    //   690: astore #4
    //   692: aload #4
    //   694: astore_2
    //   695: aload #4
    //   697: ifnonnull -> 712
    //   700: new android/view/ViewGroup$LayoutParams
    //   703: dup
    //   704: bipush #-2
    //   706: bipush #-2
    //   708: invokespecial <init> : (II)V
    //   711: astore_2
    //   712: aload_1
    //   713: getfield b : I
    //   716: istore_3
    //   717: aload_1
    //   718: getfield e : Landroid/view/ViewGroup;
    //   721: iload_3
    //   722: invokevirtual setBackgroundResource : (I)V
    //   725: aload_1
    //   726: getfield f : Landroid/view/View;
    //   729: invokevirtual getParent : ()Landroid/view/ViewParent;
    //   732: astore #4
    //   734: aload #4
    //   736: instanceof android/view/ViewGroup
    //   739: ifeq -> 754
    //   742: aload #4
    //   744: checkcast android/view/ViewGroup
    //   747: aload_1
    //   748: getfield f : Landroid/view/View;
    //   751: invokevirtual removeView : (Landroid/view/View;)V
    //   754: aload_1
    //   755: getfield e : Landroid/view/ViewGroup;
    //   758: aload_1
    //   759: getfield f : Landroid/view/View;
    //   762: aload_2
    //   763: invokevirtual addView : (Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V
    //   766: aload_1
    //   767: getfield f : Landroid/view/View;
    //   770: invokevirtual hasFocus : ()Z
    //   773: ifne -> 784
    //   776: aload_1
    //   777: getfield f : Landroid/view/View;
    //   780: invokevirtual requestFocus : ()Z
    //   783: pop
    //   784: bipush #-2
    //   786: istore_3
    //   787: aload_1
    //   788: iconst_0
    //   789: putfield l : Z
    //   792: new android/view/WindowManager$LayoutParams
    //   795: dup
    //   796: iload_3
    //   797: bipush #-2
    //   799: iconst_0
    //   800: iconst_0
    //   801: sipush #1002
    //   804: ldc_w 8519680
    //   807: bipush #-3
    //   809: invokespecial <init> : (IIIIIII)V
    //   812: astore_2
    //   813: aload_2
    //   814: aload_1
    //   815: getfield c : I
    //   818: putfield gravity : I
    //   821: aload_2
    //   822: aload_1
    //   823: getfield d : I
    //   826: putfield windowAnimations : I
    //   829: aload #6
    //   831: aload_1
    //   832: getfield e : Landroid/view/ViewGroup;
    //   835: aload_2
    //   836: invokeinterface addView : (Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V
    //   841: aload_1
    //   842: iconst_1
    //   843: putfield m : Z
    //   846: return
    //   847: aload_1
    //   848: iconst_1
    //   849: putfield o : Z
    //   852: return
  }
  
  public final boolean J(j paramj, int paramInt1, KeyEvent paramKeyEvent, int paramInt2) {
    // Byte code:
    //   0: aload_3
    //   1: invokevirtual isSystem : ()Z
    //   4: istore #5
    //   6: iconst_0
    //   7: istore #6
    //   9: iload #5
    //   11: ifeq -> 16
    //   14: iconst_0
    //   15: ireturn
    //   16: aload_1
    //   17: getfield k : Z
    //   20: ifne -> 36
    //   23: iload #6
    //   25: istore #5
    //   27: aload_0
    //   28: aload_1
    //   29: aload_3
    //   30: invokevirtual K : (Lb/b/k/k$j;Landroid/view/KeyEvent;)Z
    //   33: ifeq -> 62
    //   36: aload_1
    //   37: getfield h : Lb/b/o/i/g;
    //   40: astore #7
    //   42: iload #6
    //   44: istore #5
    //   46: aload #7
    //   48: ifnull -> 62
    //   51: aload #7
    //   53: iload_2
    //   54: aload_3
    //   55: iload #4
    //   57: invokevirtual performShortcut : (ILandroid/view/KeyEvent;I)Z
    //   60: istore #5
    //   62: iload #5
    //   64: ifeq -> 87
    //   67: iload #4
    //   69: iconst_1
    //   70: iand
    //   71: ifne -> 87
    //   74: aload_0
    //   75: getfield l : Lb/b/p/c0;
    //   78: ifnonnull -> 87
    //   81: aload_0
    //   82: aload_1
    //   83: iconst_1
    //   84: invokevirtual u : (Lb/b/k/k$j;Z)V
    //   87: iload #5
    //   89: ireturn
  }
  
  public final boolean K(j paramj, KeyEvent paramKeyEvent) {
    // Byte code:
    //   0: aload_0
    //   1: getfield M : Z
    //   4: ifeq -> 9
    //   7: iconst_0
    //   8: ireturn
    //   9: aload_1
    //   10: getfield k : Z
    //   13: ifeq -> 18
    //   16: iconst_1
    //   17: ireturn
    //   18: aload_0
    //   19: getfield H : Lb/b/k/k$j;
    //   22: astore #6
    //   24: aload #6
    //   26: ifnull -> 42
    //   29: aload #6
    //   31: aload_1
    //   32: if_acmpeq -> 42
    //   35: aload_0
    //   36: aload #6
    //   38: iconst_0
    //   39: invokevirtual u : (Lb/b/k/k$j;Z)V
    //   42: aload_0
    //   43: invokevirtual E : ()Landroid/view/Window$Callback;
    //   46: astore #9
    //   48: aload #9
    //   50: ifnull -> 68
    //   53: aload_1
    //   54: aload #9
    //   56: aload_1
    //   57: getfield a : I
    //   60: invokeinterface onCreatePanelView : (I)Landroid/view/View;
    //   65: putfield g : Landroid/view/View;
    //   68: aload_1
    //   69: getfield a : I
    //   72: istore_3
    //   73: iload_3
    //   74: ifeq -> 91
    //   77: iload_3
    //   78: bipush #108
    //   80: if_icmpne -> 86
    //   83: goto -> 91
    //   86: iconst_0
    //   87: istore_3
    //   88: goto -> 93
    //   91: iconst_1
    //   92: istore_3
    //   93: iload_3
    //   94: ifeq -> 115
    //   97: aload_0
    //   98: getfield l : Lb/b/p/c0;
    //   101: astore #6
    //   103: aload #6
    //   105: ifnull -> 115
    //   108: aload #6
    //   110: invokeinterface d : ()V
    //   115: aload_1
    //   116: getfield g : Landroid/view/View;
    //   119: ifnonnull -> 636
    //   122: aload_1
    //   123: getfield h : Lb/b/o/i/g;
    //   126: ifnull -> 136
    //   129: aload_1
    //   130: getfield p : Z
    //   133: ifeq -> 496
    //   136: aload_1
    //   137: getfield h : Lb/b/o/i/g;
    //   140: ifnonnull -> 388
    //   143: aload_0
    //   144: getfield e : Landroid/content/Context;
    //   147: astore #8
    //   149: aload_1
    //   150: getfield a : I
    //   153: istore #4
    //   155: iload #4
    //   157: ifeq -> 171
    //   160: aload #8
    //   162: astore #6
    //   164: iload #4
    //   166: bipush #108
    //   168: if_icmpne -> 356
    //   171: aload #8
    //   173: astore #6
    //   175: aload_0
    //   176: getfield l : Lb/b/p/c0;
    //   179: ifnull -> 356
    //   182: new android/util/TypedValue
    //   185: dup
    //   186: invokespecial <init> : ()V
    //   189: astore #10
    //   191: aload #8
    //   193: invokevirtual getTheme : ()Landroid/content/res/Resources$Theme;
    //   196: astore #11
    //   198: aload #11
    //   200: getstatic b/b/a.actionBarTheme : I
    //   203: aload #10
    //   205: iconst_1
    //   206: invokevirtual resolveAttribute : (ILandroid/util/TypedValue;Z)Z
    //   209: pop
    //   210: aload #10
    //   212: getfield resourceId : I
    //   215: ifeq -> 261
    //   218: aload #8
    //   220: invokevirtual getResources : ()Landroid/content/res/Resources;
    //   223: invokevirtual newTheme : ()Landroid/content/res/Resources$Theme;
    //   226: astore #6
    //   228: aload #6
    //   230: aload #11
    //   232: invokevirtual setTo : (Landroid/content/res/Resources$Theme;)V
    //   235: aload #6
    //   237: aload #10
    //   239: getfield resourceId : I
    //   242: iconst_1
    //   243: invokevirtual applyStyle : (IZ)V
    //   246: aload #6
    //   248: getstatic b/b/a.actionBarWidgetTheme : I
    //   251: aload #10
    //   253: iconst_1
    //   254: invokevirtual resolveAttribute : (ILandroid/util/TypedValue;Z)Z
    //   257: pop
    //   258: goto -> 276
    //   261: aload #11
    //   263: getstatic b/b/a.actionBarWidgetTheme : I
    //   266: aload #10
    //   268: iconst_1
    //   269: invokevirtual resolveAttribute : (ILandroid/util/TypedValue;Z)Z
    //   272: pop
    //   273: aconst_null
    //   274: astore #6
    //   276: aload #6
    //   278: astore #7
    //   280: aload #10
    //   282: getfield resourceId : I
    //   285: ifeq -> 325
    //   288: aload #6
    //   290: astore #7
    //   292: aload #6
    //   294: ifnonnull -> 314
    //   297: aload #8
    //   299: invokevirtual getResources : ()Landroid/content/res/Resources;
    //   302: invokevirtual newTheme : ()Landroid/content/res/Resources$Theme;
    //   305: astore #7
    //   307: aload #7
    //   309: aload #11
    //   311: invokevirtual setTo : (Landroid/content/res/Resources$Theme;)V
    //   314: aload #7
    //   316: aload #10
    //   318: getfield resourceId : I
    //   321: iconst_1
    //   322: invokevirtual applyStyle : (IZ)V
    //   325: aload #8
    //   327: astore #6
    //   329: aload #7
    //   331: ifnull -> 356
    //   334: new b/b/o/c
    //   337: dup
    //   338: aload #8
    //   340: iconst_0
    //   341: invokespecial <init> : (Landroid/content/Context;I)V
    //   344: astore #6
    //   346: aload #6
    //   348: invokevirtual getTheme : ()Landroid/content/res/Resources$Theme;
    //   351: aload #7
    //   353: invokevirtual setTo : (Landroid/content/res/Resources$Theme;)V
    //   356: new b/b/o/i/g
    //   359: dup
    //   360: aload #6
    //   362: invokespecial <init> : (Landroid/content/Context;)V
    //   365: astore #6
    //   367: aload #6
    //   369: aload_0
    //   370: putfield e : Lb/b/o/i/g$a;
    //   373: aload_1
    //   374: aload #6
    //   376: invokevirtual a : (Lb/b/o/i/g;)V
    //   379: aload_1
    //   380: getfield h : Lb/b/o/i/g;
    //   383: ifnonnull -> 388
    //   386: iconst_0
    //   387: ireturn
    //   388: iload_3
    //   389: ifeq -> 435
    //   392: aload_0
    //   393: getfield l : Lb/b/p/c0;
    //   396: ifnull -> 435
    //   399: aload_0
    //   400: getfield m : Lb/b/k/k$c;
    //   403: ifnonnull -> 418
    //   406: aload_0
    //   407: new b/b/k/k$c
    //   410: dup
    //   411: aload_0
    //   412: invokespecial <init> : (Lb/b/k/k;)V
    //   415: putfield m : Lb/b/k/k$c;
    //   418: aload_0
    //   419: getfield l : Lb/b/p/c0;
    //   422: aload_1
    //   423: getfield h : Lb/b/o/i/g;
    //   426: aload_0
    //   427: getfield m : Lb/b/k/k$c;
    //   430: invokeinterface b : (Landroid/view/Menu;Lb/b/o/i/m$a;)V
    //   435: aload_1
    //   436: getfield h : Lb/b/o/i/g;
    //   439: invokevirtual z : ()V
    //   442: aload #9
    //   444: aload_1
    //   445: getfield a : I
    //   448: aload_1
    //   449: getfield h : Lb/b/o/i/g;
    //   452: invokeinterface onCreatePanelMenu : (ILandroid/view/Menu;)Z
    //   457: ifne -> 491
    //   460: aload_1
    //   461: aconst_null
    //   462: invokevirtual a : (Lb/b/o/i/g;)V
    //   465: iload_3
    //   466: ifeq -> 489
    //   469: aload_0
    //   470: getfield l : Lb/b/p/c0;
    //   473: astore_1
    //   474: aload_1
    //   475: ifnull -> 489
    //   478: aload_1
    //   479: aconst_null
    //   480: aload_0
    //   481: getfield m : Lb/b/k/k$c;
    //   484: invokeinterface b : (Landroid/view/Menu;Lb/b/o/i/m$a;)V
    //   489: iconst_0
    //   490: ireturn
    //   491: aload_1
    //   492: iconst_0
    //   493: putfield p : Z
    //   496: aload_1
    //   497: getfield h : Lb/b/o/i/g;
    //   500: invokevirtual z : ()V
    //   503: aload_1
    //   504: getfield q : Landroid/os/Bundle;
    //   507: astore #6
    //   509: aload #6
    //   511: ifnull -> 528
    //   514: aload_1
    //   515: getfield h : Lb/b/o/i/g;
    //   518: aload #6
    //   520: invokevirtual v : (Landroid/os/Bundle;)V
    //   523: aload_1
    //   524: aconst_null
    //   525: putfield q : Landroid/os/Bundle;
    //   528: aload #9
    //   530: iconst_0
    //   531: aload_1
    //   532: getfield g : Landroid/view/View;
    //   535: aload_1
    //   536: getfield h : Lb/b/o/i/g;
    //   539: invokeinterface onPreparePanel : (ILandroid/view/View;Landroid/view/Menu;)Z
    //   544: ifne -> 580
    //   547: iload_3
    //   548: ifeq -> 571
    //   551: aload_0
    //   552: getfield l : Lb/b/p/c0;
    //   555: astore_2
    //   556: aload_2
    //   557: ifnull -> 571
    //   560: aload_2
    //   561: aconst_null
    //   562: aload_0
    //   563: getfield m : Lb/b/k/k$c;
    //   566: invokeinterface b : (Landroid/view/Menu;Lb/b/o/i/m$a;)V
    //   571: aload_1
    //   572: getfield h : Lb/b/o/i/g;
    //   575: invokevirtual y : ()V
    //   578: iconst_0
    //   579: ireturn
    //   580: aload_2
    //   581: ifnull -> 592
    //   584: aload_2
    //   585: invokevirtual getDeviceId : ()I
    //   588: istore_3
    //   589: goto -> 594
    //   592: iconst_m1
    //   593: istore_3
    //   594: iload_3
    //   595: invokestatic load : (I)Landroid/view/KeyCharacterMap;
    //   598: invokevirtual getKeyboardType : ()I
    //   601: iconst_1
    //   602: if_icmpeq -> 611
    //   605: iconst_1
    //   606: istore #5
    //   608: goto -> 614
    //   611: iconst_0
    //   612: istore #5
    //   614: aload_1
    //   615: iload #5
    //   617: putfield n : Z
    //   620: aload_1
    //   621: getfield h : Lb/b/o/i/g;
    //   624: iload #5
    //   626: invokevirtual setQwertyMode : (Z)V
    //   629: aload_1
    //   630: getfield h : Lb/b/o/i/g;
    //   633: invokevirtual y : ()V
    //   636: aload_1
    //   637: iconst_1
    //   638: putfield k : Z
    //   641: aload_1
    //   642: iconst_0
    //   643: putfield l : Z
    //   646: aload_0
    //   647: aload_1
    //   648: putfield H : Lb/b/k/k$j;
    //   651: iconst_1
    //   652: ireturn
  }
  
  public final boolean L() {
    if (this.u) {
      ViewGroup viewGroup = this.v;
      if (viewGroup != null && l.E((View)viewGroup))
        return true; 
    } 
    return false;
  }
  
  public final void M() {
    if (!this.u)
      return; 
    throw new AndroidRuntimeException("Window feature must be requested before adding content");
  }
  
  public final int N(u paramu, Rect paramRect) {
    int m;
    int n;
    boolean bool1;
    boolean bool2 = false;
    if (paramu != null) {
      m = paramu.d();
    } else if (paramRect != null) {
      m = paramRect.top;
    } else {
      m = 0;
    } 
    ActionBarContextView actionBarContextView = this.p;
    if (actionBarContextView != null && actionBarContextView.getLayoutParams() instanceof ViewGroup.MarginLayoutParams) {
      boolean bool;
      ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams)this.p.getLayoutParams();
      boolean bool3 = this.p.isShown();
      int i1 = 1;
      bool1 = true;
      if (bool3) {
        int i2;
        if (this.X == null) {
          this.X = new Rect();
          this.Y = new Rect();
        } 
        Rect rect2 = this.X;
        Rect rect1 = this.Y;
        if (paramu == null) {
          rect2.set(paramRect);
        } else {
          rect2.set(paramu.b(), paramu.d(), paramu.c(), paramu.a());
        } 
        d1.a((View)this.v, rect2, rect1);
        int i3 = rect2.top;
        bool = rect2.left;
        int i4 = rect2.right;
        paramu = l.w((View)this.v);
        if (paramu == null) {
          i2 = 0;
        } else {
          i2 = paramu.b();
        } 
        if (paramu == null) {
          i1 = 0;
        } else {
          i1 = paramu.c();
        } 
        if (marginLayoutParams.topMargin != i3 || marginLayoutParams.leftMargin != bool || marginLayoutParams.rightMargin != i4) {
          marginLayoutParams.topMargin = i3;
          marginLayoutParams.leftMargin = bool;
          marginLayoutParams.rightMargin = i4;
          bool = true;
        } else {
          bool = false;
        } 
        if (i3 > 0 && this.x == null) {
          View view1 = new View(this.e);
          this.x = view1;
          view1.setVisibility(8);
          FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, marginLayoutParams.topMargin, 51);
          layoutParams.leftMargin = i2;
          layoutParams.rightMargin = i1;
          this.v.addView(this.x, -1, (ViewGroup.LayoutParams)layoutParams);
        } else {
          View view1 = this.x;
          if (view1 != null) {
            ViewGroup.MarginLayoutParams marginLayoutParams1 = (ViewGroup.MarginLayoutParams)view1.getLayoutParams();
            if (marginLayoutParams1.height != marginLayoutParams.topMargin || marginLayoutParams1.leftMargin != i2 || marginLayoutParams1.rightMargin != i1) {
              marginLayoutParams1.height = marginLayoutParams.topMargin;
              marginLayoutParams1.leftMargin = i2;
              marginLayoutParams1.rightMargin = i1;
              this.x.setLayoutParams((ViewGroup.LayoutParams)marginLayoutParams1);
            } 
          } 
        } 
        if (this.x != null) {
          i2 = 1;
        } else {
          i2 = 0;
        } 
        if (i2 != 0 && this.x.getVisibility() != 0) {
          Context context;
          View view1 = this.x;
          if ((l.y(view1) & 0x2000) != 0) {
            i1 = bool1;
          } else {
            i1 = 0;
          } 
          if (i1 != 0) {
            context = this.e;
            i1 = b.b.c.abc_decor_view_status_guard_light;
          } else {
            context = this.e;
            i1 = b.b.c.abc_decor_view_status_guard;
          } 
          view1.setBackgroundColor(b.i.e.a.a(context, i1));
        } 
        i1 = m;
        if (!this.C) {
          i1 = m;
          if (i2 != 0)
            i1 = 0; 
        } 
        m = i1;
        i1 = bool;
        bool = i2;
      } else if (marginLayoutParams.topMargin != 0) {
        marginLayoutParams.topMargin = 0;
        bool = false;
      } else {
        bool = false;
        i1 = 0;
      } 
      n = m;
      bool1 = bool;
      if (i1 != 0) {
        this.p.setLayoutParams((ViewGroup.LayoutParams)marginLayoutParams);
        n = m;
        bool1 = bool;
      } 
    } else {
      bool1 = false;
      n = m;
    } 
    View view = this.x;
    if (view != null) {
      if (bool1) {
        m = bool2;
      } else {
        m = 8;
      } 
      view.setVisibility(m);
    } 
    return n;
  }
  
  public void a(g paramg) {
    c0 c01 = this.l;
    if (c01 != null && c01.f() && (!ViewConfiguration.get(this.e).hasPermanentMenuKey() || this.l.c())) {
      Window.Callback callback = E();
      if (this.l.e()) {
        this.l.g();
        if (!this.M)
          callback.onPanelClosed(108, (Menu)(D(0)).h); 
      } else if (callback != null && !this.M) {
        if (this.T && (0x1 & this.U) != 0) {
          this.f.getDecorView().removeCallbacks(this.V);
          this.V.run();
        } 
        j j1 = D(0);
        g g1 = j1.h;
        if (g1 != null && !j1.p && callback.onPreparePanel(0, j1.g, (Menu)g1)) {
          callback.onMenuOpened(108, (Menu)j1.h);
          this.l.a();
        } 
      } 
    } else {
      j j1 = D(0);
      j1.o = true;
      u(j1, false);
      I(j1, null);
    } 
  }
  
  public boolean b(g paramg, MenuItem paramMenuItem) {
    Window.Callback callback = E();
    if (callback != null && !this.M) {
      j j1 = B((Menu)paramg.k());
      if (j1 != null)
        return callback.onMenuItemSelected(j1.a, paramMenuItem); 
    } 
    return false;
  }
  
  public void c(View paramView, ViewGroup.LayoutParams paramLayoutParams) {
    z();
    ((ViewGroup)this.v.findViewById(16908290)).addView(paramView, paramLayoutParams);
    this.g.b.onContentChanged();
  }
  
  public void f() {
    LayoutInflater layoutInflater = LayoutInflater.from(this.e);
    if (layoutInflater.getFactory() == null) {
      layoutInflater.setFactory2(this);
    } else if (!(layoutInflater.getFactory2() instanceof k)) {
      Log.i("AppCompatDelegate", "The Activity's LayoutInflater already has a Factory installed so we can not install AppCompat's");
    } 
  }
  
  public void g() {
    F();
    a a1 = this.i;
    G(0);
  }
  
  public void h(Bundle paramBundle) {
    this.J = true;
    q(false);
    A();
    Object object = this.d;
    if (object instanceof Activity) {
      paramBundle = null;
      try {
        object = object;
        try {
          object = a.a.a.a.a.K((Context)object, object.getComponentName());
          null = object;
        } catch (android.content.pm.PackageManager.NameNotFoundException nameNotFoundException) {
          object = new IllegalArgumentException();
          super((Throwable)nameNotFoundException);
          throw object;
        } 
      } catch (IllegalArgumentException illegalArgumentException) {}
      if (null != null) {
        null = this.i;
        if (null == null) {
          this.W = true;
        } else {
          null.g(true);
        } 
      } 
      synchronized (j.c) {
        j.j(this);
        b.f.c<WeakReference<j>> c1 = j.b;
        object = new WeakReference();
        super((T)this);
        c1.add(object);
      } 
    } 
    this.K = true;
  }
  
  public void i() {
    // Byte code:
    //   0: aload_0
    //   1: getfield d : Ljava/lang/Object;
    //   4: instanceof android/app/Activity
    //   7: ifeq -> 30
    //   10: getstatic b/b/k/j.c : Ljava/lang/Object;
    //   13: astore_1
    //   14: aload_1
    //   15: monitorenter
    //   16: aload_0
    //   17: invokestatic j : (Lb/b/k/j;)V
    //   20: aload_1
    //   21: monitorexit
    //   22: goto -> 30
    //   25: astore_2
    //   26: aload_1
    //   27: monitorexit
    //   28: aload_2
    //   29: athrow
    //   30: aload_0
    //   31: getfield T : Z
    //   34: ifeq -> 52
    //   37: aload_0
    //   38: getfield f : Landroid/view/Window;
    //   41: invokevirtual getDecorView : ()Landroid/view/View;
    //   44: aload_0
    //   45: getfield V : Ljava/lang/Runnable;
    //   48: invokevirtual removeCallbacks : (Ljava/lang/Runnable;)Z
    //   51: pop
    //   52: aload_0
    //   53: iconst_0
    //   54: putfield L : Z
    //   57: aload_0
    //   58: iconst_1
    //   59: putfield M : Z
    //   62: aload_0
    //   63: getfield N : I
    //   66: bipush #-100
    //   68: if_icmpeq -> 120
    //   71: aload_0
    //   72: getfield d : Ljava/lang/Object;
    //   75: astore_1
    //   76: aload_1
    //   77: instanceof android/app/Activity
    //   80: ifeq -> 120
    //   83: aload_1
    //   84: checkcast android/app/Activity
    //   87: invokevirtual isChangingConfigurations : ()Z
    //   90: ifeq -> 120
    //   93: getstatic b/b/k/k.a0 : Lb/f/h;
    //   96: aload_0
    //   97: getfield d : Ljava/lang/Object;
    //   100: invokevirtual getClass : ()Ljava/lang/Class;
    //   103: invokevirtual getName : ()Ljava/lang/String;
    //   106: aload_0
    //   107: getfield N : I
    //   110: invokestatic valueOf : (I)Ljava/lang/Integer;
    //   113: invokevirtual put : (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    //   116: pop
    //   117: goto -> 137
    //   120: getstatic b/b/k/k.a0 : Lb/f/h;
    //   123: aload_0
    //   124: getfield d : Ljava/lang/Object;
    //   127: invokevirtual getClass : ()Ljava/lang/Class;
    //   130: invokevirtual getName : ()Ljava/lang/String;
    //   133: invokevirtual remove : (Ljava/lang/Object;)Ljava/lang/Object;
    //   136: pop
    //   137: aload_0
    //   138: getfield i : Lb/b/k/a;
    //   141: astore_1
    //   142: aload_1
    //   143: ifnull -> 155
    //   146: aload_1
    //   147: ifnull -> 153
    //   150: goto -> 155
    //   153: aconst_null
    //   154: athrow
    //   155: aload_0
    //   156: getfield R : Lb/b/k/k$g;
    //   159: astore_1
    //   160: aload_1
    //   161: ifnull -> 168
    //   164: aload_1
    //   165: invokevirtual a : ()V
    //   168: aload_0
    //   169: getfield S : Lb/b/k/k$g;
    //   172: astore_1
    //   173: aload_1
    //   174: ifnull -> 181
    //   177: aload_1
    //   178: invokevirtual a : ()V
    //   181: return
    // Exception table:
    //   from	to	target	type
    //   16	22	25	finally
    //   26	28	25	finally
  }
  
  public boolean k(int paramInt) {
    int m;
    if (paramInt == 8) {
      Log.i("AppCompatDelegate", "You should now use the AppCompatDelegate.FEATURE_SUPPORT_ACTION_BAR id when requesting this feature.");
      m = 108;
    } else {
      m = paramInt;
      if (paramInt == 9) {
        Log.i("AppCompatDelegate", "You should now use the AppCompatDelegate.FEATURE_SUPPORT_ACTION_BAR_OVERLAY id when requesting this feature.");
        m = 109;
      } 
    } 
    if (this.E && m == 108)
      return false; 
    if (this.A && m == 1)
      this.A = false; 
    if (m != 1) {
      if (m != 2) {
        if (m != 5) {
          if (m != 10) {
            if (m != 108) {
              if (m != 109)
                return this.f.requestFeature(m); 
              M();
              this.B = true;
              return true;
            } 
            M();
            this.A = true;
            return true;
          } 
          M();
          this.C = true;
          return true;
        } 
        M();
        this.z = true;
        return true;
      } 
      M();
      this.y = true;
      return true;
    } 
    M();
    this.E = true;
    return true;
  }
  
  public void l(int paramInt) {
    z();
    ViewGroup viewGroup = (ViewGroup)this.v.findViewById(16908290);
    viewGroup.removeAllViews();
    LayoutInflater.from(this.e).inflate(paramInt, viewGroup);
    this.g.b.onContentChanged();
  }
  
  public void m(View paramView) {
    z();
    ViewGroup viewGroup = (ViewGroup)this.v.findViewById(16908290);
    viewGroup.removeAllViews();
    viewGroup.addView(paramView);
    this.g.b.onContentChanged();
  }
  
  public void n(View paramView, ViewGroup.LayoutParams paramLayoutParams) {
    z();
    ViewGroup viewGroup = (ViewGroup)this.v.findViewById(16908290);
    viewGroup.removeAllViews();
    viewGroup.addView(paramView, paramLayoutParams);
    this.g.b.onContentChanged();
  }
  
  public final void o(CharSequence paramCharSequence) {
    this.k = paramCharSequence;
    c0 c01 = this.l;
    if (c01 != null) {
      c01.setWindowTitle(paramCharSequence);
    } else {
      a a1 = this.i;
      if (a1 != null) {
        a1.i(paramCharSequence);
      } else {
        TextView textView = this.w;
        if (textView != null)
          textView.setText(paramCharSequence); 
      } 
    } 
  }
  
  public final View onCreateView(View paramView, String paramString, Context paramContext, AttributeSet paramAttributeSet) {
    r r1;
    if (this.Z == null) {
      String str = this.e.obtainStyledAttributes(b.b.j.AppCompatTheme).getString(b.b.j.AppCompatTheme_viewInflaterClass);
      if (str == null) {
        r1 = new r();
      } else {
        try {
          this.Z = Class.forName((String)r1).getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
        } finally {
          Exception exception = null;
          StringBuilder stringBuilder = new StringBuilder();
          stringBuilder.append("Failed to instantiate custom view inflater ");
          stringBuilder.append((String)r1);
          stringBuilder.append(". Falling back to default.");
          Log.i("AppCompatDelegate", stringBuilder.toString(), exception);
          r1 = new r();
        } 
        r1 = this.Z;
        c1.a();
        return r1.createView(paramView, paramString, paramContext, paramAttributeSet, false, false, true, false);
      } 
    } else {
      r1 = this.Z;
      c1.a();
      return r1.createView(paramView, paramString, paramContext, paramAttributeSet, false, false, true, false);
    } 
    this.Z = r1;
  }
  
  public View onCreateView(String paramString, Context paramContext, AttributeSet paramAttributeSet) {
    return onCreateView(null, paramString, paramContext, paramAttributeSet);
  }
  
  public boolean p() {
    return q(true);
  }
  
  public final boolean q(boolean paramBoolean) {
    // Byte code:
    //   0: aload_0
    //   1: getfield M : Z
    //   4: istore #6
    //   6: iconst_0
    //   7: istore #4
    //   9: iload #6
    //   11: ifeq -> 16
    //   14: iconst_0
    //   15: ireturn
    //   16: aload_0
    //   17: getfield N : I
    //   20: istore_3
    //   21: iload_3
    //   22: bipush #-100
    //   24: if_icmpeq -> 30
    //   27: goto -> 33
    //   30: bipush #-100
    //   32: istore_3
    //   33: aload_0
    //   34: aload_0
    //   35: getfield e : Landroid/content/Context;
    //   38: iload_3
    //   39: invokevirtual H : (Landroid/content/Context;I)I
    //   42: istore_2
    //   43: aload_0
    //   44: getfield e : Landroid/content/Context;
    //   47: astore #11
    //   49: aconst_null
    //   50: astore #9
    //   52: aconst_null
    //   53: astore #8
    //   55: aconst_null
    //   56: astore #10
    //   58: aload_0
    //   59: aload #11
    //   61: iload_2
    //   62: aconst_null
    //   63: invokevirtual v : (Landroid/content/Context;ILandroid/content/res/Configuration;)Landroid/content/res/Configuration;
    //   66: astore #11
    //   68: aload_0
    //   69: getfield Q : Z
    //   72: istore #6
    //   74: iconst_1
    //   75: istore #7
    //   77: iload #6
    //   79: ifne -> 229
    //   82: aload_0
    //   83: getfield d : Ljava/lang/Object;
    //   86: instanceof android/app/Activity
    //   89: ifeq -> 229
    //   92: aload_0
    //   93: getfield e : Landroid/content/Context;
    //   96: invokevirtual getPackageManager : ()Landroid/content/pm/PackageManager;
    //   99: astore #13
    //   101: aload #13
    //   103: ifnonnull -> 112
    //   106: iconst_0
    //   107: istore #6
    //   109: goto -> 240
    //   112: getstatic android/os/Build$VERSION.SDK_INT : I
    //   115: bipush #29
    //   117: if_icmplt -> 127
    //   120: ldc_w 269221888
    //   123: istore_2
    //   124: goto -> 144
    //   127: getstatic android/os/Build$VERSION.SDK_INT : I
    //   130: bipush #24
    //   132: if_icmplt -> 142
    //   135: ldc_w 786432
    //   138: istore_2
    //   139: goto -> 144
    //   142: iconst_0
    //   143: istore_2
    //   144: new android/content/ComponentName
    //   147: astore #12
    //   149: aload #12
    //   151: aload_0
    //   152: getfield e : Landroid/content/Context;
    //   155: aload_0
    //   156: getfield d : Ljava/lang/Object;
    //   159: invokevirtual getClass : ()Ljava/lang/Class;
    //   162: invokespecial <init> : (Landroid/content/Context;Ljava/lang/Class;)V
    //   165: aload #13
    //   167: aload #12
    //   169: iload_2
    //   170: invokevirtual getActivityInfo : (Landroid/content/ComponentName;I)Landroid/content/pm/ActivityInfo;
    //   173: astore #12
    //   175: aload #12
    //   177: ifnull -> 198
    //   180: aload #12
    //   182: getfield configChanges : I
    //   185: sipush #512
    //   188: iand
    //   189: ifeq -> 198
    //   192: iconst_1
    //   193: istore #6
    //   195: goto -> 201
    //   198: iconst_0
    //   199: istore #6
    //   201: aload_0
    //   202: iload #6
    //   204: putfield P : Z
    //   207: goto -> 229
    //   210: astore #12
    //   212: ldc_w 'AppCompatDelegate'
    //   215: ldc_w 'Exception while getting ActivityInfo'
    //   218: aload #12
    //   220: invokestatic d : (Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I
    //   223: pop
    //   224: aload_0
    //   225: iconst_0
    //   226: putfield P : Z
    //   229: aload_0
    //   230: iconst_1
    //   231: putfield Q : Z
    //   234: aload_0
    //   235: getfield P : Z
    //   238: istore #6
    //   240: aload_0
    //   241: getfield e : Landroid/content/Context;
    //   244: invokevirtual getResources : ()Landroid/content/res/Resources;
    //   247: invokevirtual getConfiguration : ()Landroid/content/res/Configuration;
    //   250: getfield uiMode : I
    //   253: bipush #48
    //   255: iand
    //   256: istore_2
    //   257: aload #11
    //   259: getfield uiMode : I
    //   262: bipush #48
    //   264: iand
    //   265: istore #5
    //   267: iload_2
    //   268: iload #5
    //   270: if_icmpeq -> 342
    //   273: iload_1
    //   274: ifeq -> 342
    //   277: iload #6
    //   279: ifne -> 342
    //   282: aload_0
    //   283: getfield J : Z
    //   286: ifeq -> 342
    //   289: getstatic b/b/k/k.d0 : Z
    //   292: ifne -> 302
    //   295: aload_0
    //   296: getfield K : Z
    //   299: ifeq -> 342
    //   302: aload_0
    //   303: getfield d : Ljava/lang/Object;
    //   306: astore #11
    //   308: aload #11
    //   310: instanceof android/app/Activity
    //   313: ifeq -> 342
    //   316: aload #11
    //   318: checkcast android/app/Activity
    //   321: invokevirtual isChild : ()Z
    //   324: ifne -> 342
    //   327: aload_0
    //   328: getfield d : Ljava/lang/Object;
    //   331: checkcast android/app/Activity
    //   334: invokestatic h : (Landroid/app/Activity;)V
    //   337: iconst_1
    //   338: istore_1
    //   339: goto -> 344
    //   342: iconst_0
    //   343: istore_1
    //   344: iload_1
    //   345: ifne -> 998
    //   348: iload_2
    //   349: iload #5
    //   351: if_icmpeq -> 998
    //   354: aload_0
    //   355: getfield e : Landroid/content/Context;
    //   358: invokevirtual getResources : ()Landroid/content/res/Resources;
    //   361: astore #12
    //   363: new android/content/res/Configuration
    //   366: dup
    //   367: aload #12
    //   369: invokevirtual getConfiguration : ()Landroid/content/res/Configuration;
    //   372: invokespecial <init> : (Landroid/content/res/Configuration;)V
    //   375: astore #11
    //   377: aload #11
    //   379: iload #5
    //   381: aload #12
    //   383: invokevirtual getConfiguration : ()Landroid/content/res/Configuration;
    //   386: getfield uiMode : I
    //   389: bipush #-49
    //   391: iand
    //   392: ior
    //   393: putfield uiMode : I
    //   396: aload #12
    //   398: aload #11
    //   400: aconst_null
    //   401: invokevirtual updateConfiguration : (Landroid/content/res/Configuration;Landroid/util/DisplayMetrics;)V
    //   404: getstatic android/os/Build$VERSION.SDK_INT : I
    //   407: istore_2
    //   408: iload_2
    //   409: bipush #26
    //   411: if_icmpge -> 855
    //   414: iload_2
    //   415: bipush #28
    //   417: if_icmplt -> 423
    //   420: goto -> 855
    //   423: iload_2
    //   424: bipush #24
    //   426: if_icmplt -> 636
    //   429: getstatic a/a/a/a/a.h : Z
    //   432: ifne -> 478
    //   435: ldc_w android/content/res/Resources
    //   438: ldc_w 'mResourcesImpl'
    //   441: invokevirtual getDeclaredField : (Ljava/lang/String;)Ljava/lang/reflect/Field;
    //   444: astore #8
    //   446: aload #8
    //   448: putstatic a/a/a/a/a.g : Ljava/lang/reflect/Field;
    //   451: aload #8
    //   453: iconst_1
    //   454: invokevirtual setAccessible : (Z)V
    //   457: goto -> 474
    //   460: astore #8
    //   462: ldc_w 'ResourcesFlusher'
    //   465: ldc_w 'Could not retrieve Resources#mResourcesImpl field'
    //   468: aload #8
    //   470: invokestatic e : (Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I
    //   473: pop
    //   474: iconst_1
    //   475: putstatic a/a/a/a/a.h : Z
    //   478: getstatic a/a/a/a/a.g : Ljava/lang/reflect/Field;
    //   481: astore #8
    //   483: aload #8
    //   485: ifnonnull -> 491
    //   488: goto -> 855
    //   491: aload #8
    //   493: aload #12
    //   495: invokevirtual get : (Ljava/lang/Object;)Ljava/lang/Object;
    //   498: astore #8
    //   500: goto -> 520
    //   503: astore #8
    //   505: ldc_w 'ResourcesFlusher'
    //   508: ldc_w 'Could not retrieve value from Resources#mResourcesImpl'
    //   511: aload #8
    //   513: invokestatic e : (Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I
    //   516: pop
    //   517: aconst_null
    //   518: astore #8
    //   520: aload #8
    //   522: ifnonnull -> 528
    //   525: goto -> 855
    //   528: getstatic a/a/a/a/a.b : Z
    //   531: ifne -> 579
    //   534: aload #8
    //   536: invokevirtual getClass : ()Ljava/lang/Class;
    //   539: ldc_w 'mDrawableCache'
    //   542: invokevirtual getDeclaredField : (Ljava/lang/String;)Ljava/lang/reflect/Field;
    //   545: astore #9
    //   547: aload #9
    //   549: putstatic a/a/a/a/a.a : Ljava/lang/reflect/Field;
    //   552: aload #9
    //   554: iconst_1
    //   555: invokevirtual setAccessible : (Z)V
    //   558: goto -> 575
    //   561: astore #9
    //   563: ldc_w 'ResourcesFlusher'
    //   566: ldc_w 'Could not retrieve ResourcesImpl#mDrawableCache field'
    //   569: aload #9
    //   571: invokestatic e : (Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I
    //   574: pop
    //   575: iconst_1
    //   576: putstatic a/a/a/a/a.b : Z
    //   579: getstatic a/a/a/a/a.a : Ljava/lang/reflect/Field;
    //   582: astore #12
    //   584: aload #10
    //   586: astore #9
    //   588: aload #12
    //   590: ifnull -> 623
    //   593: aload #12
    //   595: aload #8
    //   597: invokevirtual get : (Ljava/lang/Object;)Ljava/lang/Object;
    //   600: astore #9
    //   602: goto -> 623
    //   605: astore #8
    //   607: ldc_w 'ResourcesFlusher'
    //   610: ldc_w 'Could not retrieve value from ResourcesImpl#mDrawableCache'
    //   613: aload #8
    //   615: invokestatic e : (Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I
    //   618: pop
    //   619: aload #10
    //   621: astore #9
    //   623: aload #9
    //   625: ifnull -> 855
    //   628: aload #9
    //   630: invokestatic z : (Ljava/lang/Object;)V
    //   633: goto -> 855
    //   636: iload_2
    //   637: bipush #23
    //   639: if_icmplt -> 751
    //   642: getstatic a/a/a/a/a.b : Z
    //   645: ifne -> 691
    //   648: ldc_w android/content/res/Resources
    //   651: ldc_w 'mDrawableCache'
    //   654: invokevirtual getDeclaredField : (Ljava/lang/String;)Ljava/lang/reflect/Field;
    //   657: astore #8
    //   659: aload #8
    //   661: putstatic a/a/a/a/a.a : Ljava/lang/reflect/Field;
    //   664: aload #8
    //   666: iconst_1
    //   667: invokevirtual setAccessible : (Z)V
    //   670: goto -> 687
    //   673: astore #8
    //   675: ldc_w 'ResourcesFlusher'
    //   678: ldc_w 'Could not retrieve Resources#mDrawableCache field'
    //   681: aload #8
    //   683: invokestatic e : (Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I
    //   686: pop
    //   687: iconst_1
    //   688: putstatic a/a/a/a/a.b : Z
    //   691: getstatic a/a/a/a/a.a : Ljava/lang/reflect/Field;
    //   694: astore #10
    //   696: aload #9
    //   698: astore #8
    //   700: aload #10
    //   702: ifnull -> 735
    //   705: aload #10
    //   707: aload #12
    //   709: invokevirtual get : (Ljava/lang/Object;)Ljava/lang/Object;
    //   712: astore #8
    //   714: goto -> 735
    //   717: astore #8
    //   719: ldc_w 'ResourcesFlusher'
    //   722: ldc_w 'Could not retrieve value from Resources#mDrawableCache'
    //   725: aload #8
    //   727: invokestatic e : (Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I
    //   730: pop
    //   731: aload #9
    //   733: astore #8
    //   735: aload #8
    //   737: ifnonnull -> 743
    //   740: goto -> 855
    //   743: aload #8
    //   745: invokestatic z : (Ljava/lang/Object;)V
    //   748: goto -> 855
    //   751: getstatic a/a/a/a/a.b : Z
    //   754: ifne -> 800
    //   757: ldc_w android/content/res/Resources
    //   760: ldc_w 'mDrawableCache'
    //   763: invokevirtual getDeclaredField : (Ljava/lang/String;)Ljava/lang/reflect/Field;
    //   766: astore #9
    //   768: aload #9
    //   770: putstatic a/a/a/a/a.a : Ljava/lang/reflect/Field;
    //   773: aload #9
    //   775: iconst_1
    //   776: invokevirtual setAccessible : (Z)V
    //   779: goto -> 796
    //   782: astore #9
    //   784: ldc_w 'ResourcesFlusher'
    //   787: ldc_w 'Could not retrieve Resources#mDrawableCache field'
    //   790: aload #9
    //   792: invokestatic e : (Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I
    //   795: pop
    //   796: iconst_1
    //   797: putstatic a/a/a/a/a.b : Z
    //   800: getstatic a/a/a/a/a.a : Ljava/lang/reflect/Field;
    //   803: astore #9
    //   805: aload #9
    //   807: ifnull -> 855
    //   810: aload #9
    //   812: aload #12
    //   814: invokevirtual get : (Ljava/lang/Object;)Ljava/lang/Object;
    //   817: checkcast java/util/Map
    //   820: astore #9
    //   822: aload #9
    //   824: astore #8
    //   826: goto -> 843
    //   829: astore #9
    //   831: ldc_w 'ResourcesFlusher'
    //   834: ldc_w 'Could not retrieve value from Resources#mDrawableCache'
    //   837: aload #9
    //   839: invokestatic e : (Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I
    //   842: pop
    //   843: aload #8
    //   845: ifnull -> 855
    //   848: aload #8
    //   850: invokeinterface clear : ()V
    //   855: aload_0
    //   856: getfield O : I
    //   859: istore_2
    //   860: iload_2
    //   861: ifeq -> 895
    //   864: aload_0
    //   865: getfield e : Landroid/content/Context;
    //   868: iload_2
    //   869: invokevirtual setTheme : (I)V
    //   872: getstatic android/os/Build$VERSION.SDK_INT : I
    //   875: bipush #23
    //   877: if_icmplt -> 895
    //   880: aload_0
    //   881: getfield e : Landroid/content/Context;
    //   884: invokevirtual getTheme : ()Landroid/content/res/Resources$Theme;
    //   887: aload_0
    //   888: getfield O : I
    //   891: iconst_1
    //   892: invokevirtual applyStyle : (IZ)V
    //   895: iload #7
    //   897: istore_1
    //   898: iload #6
    //   900: ifeq -> 998
    //   903: aload_0
    //   904: getfield d : Ljava/lang/Object;
    //   907: astore #8
    //   909: iload #7
    //   911: istore_1
    //   912: aload #8
    //   914: instanceof android/app/Activity
    //   917: ifeq -> 998
    //   920: aload #8
    //   922: checkcast android/app/Activity
    //   925: astore #8
    //   927: aload #8
    //   929: instanceof b/n/g
    //   932: ifeq -> 975
    //   935: iload #4
    //   937: istore_2
    //   938: aload #8
    //   940: checkcast b/n/g
    //   943: invokeinterface a : ()Lb/n/d;
    //   948: checkcast b/n/h
    //   951: getfield b : Lb/n/d$b;
    //   954: getstatic b/n/d$b.e : Lb/n/d$b;
    //   957: invokevirtual compareTo : (Ljava/lang/Enum;)I
    //   960: iflt -> 965
    //   963: iconst_1
    //   964: istore_2
    //   965: iload #7
    //   967: istore_1
    //   968: iload_2
    //   969: ifeq -> 998
    //   972: goto -> 985
    //   975: iload #7
    //   977: istore_1
    //   978: aload_0
    //   979: getfield L : Z
    //   982: ifeq -> 998
    //   985: aload #8
    //   987: aload #11
    //   989: invokevirtual onConfigurationChanged : (Landroid/content/res/Configuration;)V
    //   992: iload #7
    //   994: istore_1
    //   995: goto -> 998
    //   998: iload_1
    //   999: ifeq -> 1024
    //   1002: aload_0
    //   1003: getfield d : Ljava/lang/Object;
    //   1006: astore #8
    //   1008: aload #8
    //   1010: instanceof b/b/k/h
    //   1013: ifeq -> 1024
    //   1016: aload #8
    //   1018: checkcast b/b/k/h
    //   1021: invokevirtual s : ()V
    //   1024: iload_3
    //   1025: ifne -> 1042
    //   1028: aload_0
    //   1029: aload_0
    //   1030: getfield e : Landroid/content/Context;
    //   1033: invokevirtual C : (Landroid/content/Context;)Lb/b/k/k$g;
    //   1036: invokevirtual e : ()V
    //   1039: goto -> 1058
    //   1042: aload_0
    //   1043: getfield R : Lb/b/k/k$g;
    //   1046: astore #8
    //   1048: aload #8
    //   1050: ifnull -> 1058
    //   1053: aload #8
    //   1055: invokevirtual a : ()V
    //   1058: iload_3
    //   1059: iconst_3
    //   1060: if_icmpne -> 1100
    //   1063: aload_0
    //   1064: getfield e : Landroid/content/Context;
    //   1067: astore #8
    //   1069: aload_0
    //   1070: getfield S : Lb/b/k/k$g;
    //   1073: ifnonnull -> 1090
    //   1076: aload_0
    //   1077: new b/b/k/k$f
    //   1080: dup
    //   1081: aload_0
    //   1082: aload #8
    //   1084: invokespecial <init> : (Lb/b/k/k;Landroid/content/Context;)V
    //   1087: putfield S : Lb/b/k/k$g;
    //   1090: aload_0
    //   1091: getfield S : Lb/b/k/k$g;
    //   1094: invokevirtual e : ()V
    //   1097: goto -> 1116
    //   1100: aload_0
    //   1101: getfield S : Lb/b/k/k$g;
    //   1104: astore #8
    //   1106: aload #8
    //   1108: ifnull -> 1116
    //   1111: aload #8
    //   1113: invokevirtual a : ()V
    //   1116: iload_1
    //   1117: ireturn
    // Exception table:
    //   from	to	target	type
    //   112	120	210	android/content/pm/PackageManager$NameNotFoundException
    //   127	135	210	android/content/pm/PackageManager$NameNotFoundException
    //   144	175	210	android/content/pm/PackageManager$NameNotFoundException
    //   180	192	210	android/content/pm/PackageManager$NameNotFoundException
    //   201	207	210	android/content/pm/PackageManager$NameNotFoundException
    //   435	457	460	java/lang/NoSuchFieldException
    //   491	500	503	java/lang/IllegalAccessException
    //   534	558	561	java/lang/NoSuchFieldException
    //   593	602	605	java/lang/IllegalAccessException
    //   648	670	673	java/lang/NoSuchFieldException
    //   705	714	717	java/lang/IllegalAccessException
    //   757	779	782	java/lang/NoSuchFieldException
    //   810	822	829	java/lang/IllegalAccessException
  }
  
  public final void r(Window paramWindow) {
    if (this.f == null) {
      Window.Callback callback = paramWindow.getCallback();
      if (!(callback instanceof e)) {
        e e1 = new e(this, callback);
        this.g = e1;
        paramWindow.setCallback((Window.Callback)e1);
        x0 x0 = x0.p(this.e, null, c0);
        Drawable drawable = x0.h(0);
        if (drawable != null)
          paramWindow.setBackgroundDrawable(drawable); 
        x0.b.recycle();
        this.f = paramWindow;
        return;
      } 
      throw new IllegalStateException("AppCompat has already installed itself into the Window");
    } 
    throw new IllegalStateException("AppCompat has already installed itself into the Window");
  }
  
  public void s(int paramInt, j paramj, Menu paramMenu) {
    g g1;
    Menu menu = paramMenu;
    if (paramMenu == null) {
      menu = paramMenu;
      if (paramj != null)
        g1 = paramj.h; 
    } 
    if (paramj != null && !paramj.m)
      return; 
    if (!this.M)
      this.g.b.onPanelClosed(paramInt, (Menu)g1); 
  }
  
  public void t(g paramg) {
    if (this.F)
      return; 
    this.F = true;
    this.l.j();
    Window.Callback callback = E();
    if (callback != null && !this.M)
      callback.onPanelClosed(108, (Menu)paramg); 
    this.F = false;
  }
  
  public void u(j paramj, boolean paramBoolean) {
    if (paramBoolean && paramj.a == 0) {
      c0 c01 = this.l;
      if (c01 != null && c01.e()) {
        t(paramj.h);
        return;
      } 
    } 
    WindowManager windowManager = (WindowManager)this.e.getSystemService("window");
    if (windowManager != null && paramj.m) {
      ViewGroup viewGroup = paramj.e;
      if (viewGroup != null) {
        windowManager.removeView((View)viewGroup);
        if (paramBoolean)
          s(paramj.a, paramj, null); 
      } 
    } 
    paramj.k = false;
    paramj.l = false;
    paramj.m = false;
    paramj.f = null;
    paramj.o = true;
    if (this.H == paramj)
      this.H = null; 
  }
  
  public final Configuration v(Context paramContext, int paramInt, Configuration paramConfiguration) {
    if (paramInt != 1) {
      if (paramInt != 2) {
        paramInt = (paramContext.getApplicationContext().getResources().getConfiguration()).uiMode & 0x30;
      } else {
        paramInt = 32;
      } 
    } else {
      paramInt = 16;
    } 
    Configuration configuration = new Configuration();
    configuration.fontScale = 0.0F;
    if (paramConfiguration != null)
      configuration.setTo(paramConfiguration); 
    configuration.uiMode = paramInt | configuration.uiMode & 0xFFFFFFCF;
    return configuration;
  }
  
  public boolean w(KeyEvent paramKeyEvent) {
    // Byte code:
    //   0: aload_0
    //   1: getfield d : Ljava/lang/Object;
    //   4: astore #7
    //   6: aload #7
    //   8: instanceof b/i/m/d$a
    //   11: istore #5
    //   13: iconst_1
    //   14: istore #6
    //   16: iconst_1
    //   17: istore #4
    //   19: iload #5
    //   21: ifne -> 32
    //   24: aload #7
    //   26: instanceof b/b/k/q
    //   29: ifeq -> 57
    //   32: aload_0
    //   33: getfield f : Landroid/view/Window;
    //   36: invokevirtual getDecorView : ()Landroid/view/View;
    //   39: astore #7
    //   41: aload #7
    //   43: ifnull -> 57
    //   46: aload #7
    //   48: aload_1
    //   49: invokestatic f : (Landroid/view/View;Landroid/view/KeyEvent;)Z
    //   52: ifeq -> 57
    //   55: iconst_1
    //   56: ireturn
    //   57: aload_1
    //   58: invokevirtual getKeyCode : ()I
    //   61: bipush #82
    //   63: if_icmpne -> 84
    //   66: aload_0
    //   67: getfield g : Lb/b/k/k$e;
    //   70: getfield b : Landroid/view/Window$Callback;
    //   73: aload_1
    //   74: invokeinterface dispatchKeyEvent : (Landroid/view/KeyEvent;)Z
    //   79: ifeq -> 84
    //   82: iconst_1
    //   83: ireturn
    //   84: aload_1
    //   85: invokevirtual getKeyCode : ()I
    //   88: istore_3
    //   89: aload_1
    //   90: invokevirtual getAction : ()I
    //   93: ifne -> 101
    //   96: iconst_1
    //   97: istore_2
    //   98: goto -> 103
    //   101: iconst_0
    //   102: istore_2
    //   103: iload_2
    //   104: ifeq -> 195
    //   107: iload_3
    //   108: iconst_4
    //   109: if_icmpeq -> 166
    //   112: iload_3
    //   113: bipush #82
    //   115: if_icmpeq -> 121
    //   118: goto -> 189
    //   121: iload #6
    //   123: istore #5
    //   125: aload_1
    //   126: invokevirtual getRepeatCount : ()I
    //   129: ifne -> 571
    //   132: aload_0
    //   133: iconst_0
    //   134: invokevirtual D : (I)Lb/b/k/k$j;
    //   137: astore #7
    //   139: iload #6
    //   141: istore #5
    //   143: aload #7
    //   145: getfield m : Z
    //   148: ifne -> 571
    //   151: aload_0
    //   152: aload #7
    //   154: aload_1
    //   155: invokevirtual K : (Lb/b/k/k$j;Landroid/view/KeyEvent;)Z
    //   158: pop
    //   159: iload #6
    //   161: istore #5
    //   163: goto -> 571
    //   166: aload_1
    //   167: invokevirtual getFlags : ()I
    //   170: sipush #128
    //   173: iand
    //   174: ifeq -> 180
    //   177: goto -> 183
    //   180: iconst_0
    //   181: istore #4
    //   183: aload_0
    //   184: iload #4
    //   186: putfield I : Z
    //   189: iconst_0
    //   190: istore #5
    //   192: goto -> 571
    //   195: iload_3
    //   196: iconst_4
    //   197: if_icmpeq -> 474
    //   200: iload_3
    //   201: bipush #82
    //   203: if_icmpeq -> 209
    //   206: goto -> 189
    //   209: aload_0
    //   210: getfield o : Lb/b/o/a;
    //   213: ifnull -> 223
    //   216: iload #6
    //   218: istore #5
    //   220: goto -> 571
    //   223: aload_0
    //   224: iconst_0
    //   225: invokevirtual D : (I)Lb/b/k/k$j;
    //   228: astore #7
    //   230: aload_0
    //   231: getfield l : Lb/b/p/c0;
    //   234: astore #8
    //   236: aload #8
    //   238: ifnull -> 321
    //   241: aload #8
    //   243: invokeinterface f : ()Z
    //   248: ifeq -> 321
    //   251: aload_0
    //   252: getfield e : Landroid/content/Context;
    //   255: invokestatic get : (Landroid/content/Context;)Landroid/view/ViewConfiguration;
    //   258: invokevirtual hasPermanentMenuKey : ()Z
    //   261: ifne -> 321
    //   264: aload_0
    //   265: getfield l : Lb/b/p/c0;
    //   268: invokeinterface e : ()Z
    //   273: ifne -> 307
    //   276: aload_0
    //   277: getfield M : Z
    //   280: ifne -> 395
    //   283: aload_0
    //   284: aload #7
    //   286: aload_1
    //   287: invokevirtual K : (Lb/b/k/k$j;Landroid/view/KeyEvent;)Z
    //   290: ifeq -> 395
    //   293: aload_0
    //   294: getfield l : Lb/b/p/c0;
    //   297: invokeinterface a : ()Z
    //   302: istore #4
    //   304: goto -> 415
    //   307: aload_0
    //   308: getfield l : Lb/b/p/c0;
    //   311: invokeinterface g : ()Z
    //   316: istore #4
    //   318: goto -> 415
    //   321: aload #7
    //   323: getfield m : Z
    //   326: ifne -> 401
    //   329: aload #7
    //   331: getfield l : Z
    //   334: ifeq -> 340
    //   337: goto -> 401
    //   340: aload #7
    //   342: getfield k : Z
    //   345: ifeq -> 395
    //   348: aload #7
    //   350: getfield p : Z
    //   353: ifeq -> 374
    //   356: aload #7
    //   358: iconst_0
    //   359: putfield k : Z
    //   362: aload_0
    //   363: aload #7
    //   365: aload_1
    //   366: invokevirtual K : (Lb/b/k/k$j;Landroid/view/KeyEvent;)Z
    //   369: istore #4
    //   371: goto -> 377
    //   374: iconst_1
    //   375: istore #4
    //   377: iload #4
    //   379: ifeq -> 395
    //   382: aload_0
    //   383: aload #7
    //   385: aload_1
    //   386: invokevirtual I : (Lb/b/k/k$j;Landroid/view/KeyEvent;)V
    //   389: iconst_1
    //   390: istore #4
    //   392: goto -> 415
    //   395: iconst_0
    //   396: istore #4
    //   398: goto -> 415
    //   401: aload #7
    //   403: getfield m : Z
    //   406: istore #4
    //   408: aload_0
    //   409: aload #7
    //   411: iconst_1
    //   412: invokevirtual u : (Lb/b/k/k$j;Z)V
    //   415: iload #6
    //   417: istore #5
    //   419: iload #4
    //   421: ifeq -> 571
    //   424: aload_0
    //   425: getfield e : Landroid/content/Context;
    //   428: invokevirtual getApplicationContext : ()Landroid/content/Context;
    //   431: ldc_w 'audio'
    //   434: invokevirtual getSystemService : (Ljava/lang/String;)Ljava/lang/Object;
    //   437: checkcast android/media/AudioManager
    //   440: astore_1
    //   441: aload_1
    //   442: ifnull -> 457
    //   445: aload_1
    //   446: iconst_0
    //   447: invokevirtual playSoundEffect : (I)V
    //   450: iload #6
    //   452: istore #5
    //   454: goto -> 571
    //   457: ldc_w 'AppCompatDelegate'
    //   460: ldc_w 'Couldn't get audio manager'
    //   463: invokestatic w : (Ljava/lang/String;Ljava/lang/String;)I
    //   466: pop
    //   467: iload #6
    //   469: istore #5
    //   471: goto -> 571
    //   474: aload_0
    //   475: getfield I : Z
    //   478: istore #4
    //   480: aload_0
    //   481: iconst_0
    //   482: putfield I : Z
    //   485: aload_0
    //   486: iconst_0
    //   487: invokevirtual D : (I)Lb/b/k/k$j;
    //   490: astore_1
    //   491: aload_1
    //   492: getfield m : Z
    //   495: ifeq -> 520
    //   498: iload #6
    //   500: istore #5
    //   502: iload #4
    //   504: ifne -> 571
    //   507: aload_0
    //   508: aload_1
    //   509: iconst_1
    //   510: invokevirtual u : (Lb/b/k/k$j;Z)V
    //   513: iload #6
    //   515: istore #5
    //   517: goto -> 571
    //   520: aload_0
    //   521: getfield o : Lb/b/o/a;
    //   524: astore_1
    //   525: aload_1
    //   526: ifnull -> 536
    //   529: aload_1
    //   530: invokevirtual c : ()V
    //   533: goto -> 556
    //   536: aload_0
    //   537: invokevirtual F : ()V
    //   540: aload_0
    //   541: getfield i : Lb/b/k/a;
    //   544: astore_1
    //   545: aload_1
    //   546: ifnull -> 561
    //   549: aload_1
    //   550: invokevirtual a : ()Z
    //   553: ifeq -> 561
    //   556: iconst_1
    //   557: istore_2
    //   558: goto -> 563
    //   561: iconst_0
    //   562: istore_2
    //   563: iload_2
    //   564: ifeq -> 189
    //   567: iload #6
    //   569: istore #5
    //   571: iload #5
    //   573: ireturn
  }
  
  public void x(int paramInt) {
    j j1 = D(paramInt);
    if (j1.h != null) {
      Bundle bundle = new Bundle();
      j1.h.w(bundle);
      if (bundle.size() > 0)
        j1.q = bundle; 
      j1.h.z();
      j1.h.clear();
    } 
    j1.p = true;
    j1.o = true;
    if ((paramInt == 108 || paramInt == 0) && this.l != null) {
      j j2 = D(0);
      j2.k = false;
      K(j2, null);
    } 
  }
  
  public void y() {
    q q1 = this.s;
    if (q1 != null)
      q1.b(); 
  }
  
  public final void z() {
    if (!this.u) {
      Object object;
      TypedArray typedArray = this.e.obtainStyledAttributes(b.b.j.AppCompatTheme);
      if (typedArray.hasValue(b.b.j.AppCompatTheme_windowActionBar)) {
        ViewGroup viewGroup;
        if (typedArray.getBoolean(b.b.j.AppCompatTheme_windowNoTitle, false)) {
          k(1);
        } else if (typedArray.getBoolean(b.b.j.AppCompatTheme_windowActionBar, false)) {
          k(108);
        } 
        if (typedArray.getBoolean(b.b.j.AppCompatTheme_windowActionBarOverlay, false))
          k(109); 
        if (typedArray.getBoolean(b.b.j.AppCompatTheme_windowActionModeOverlay, false))
          k(10); 
        this.D = typedArray.getBoolean(b.b.j.AppCompatTheme_android_windowIsFloating, false);
        typedArray.recycle();
        A();
        this.f.getDecorView();
        LayoutInflater layoutInflater = LayoutInflater.from(this.e);
        if (!this.E) {
          if (this.D) {
            viewGroup = (ViewGroup)layoutInflater.inflate(b.b.g.abc_dialog_title_material, null);
            this.B = false;
            this.A = false;
          } else if (this.A) {
            Context context;
            TypedValue typedValue = new TypedValue();
            this.e.getTheme().resolveAttribute(b.b.a.actionBarTheme, typedValue, true);
            if (typedValue.resourceId != 0) {
              b.b.o.c c1 = new b.b.o.c(this.e, typedValue.resourceId);
            } else {
              context = this.e;
            } 
            ViewGroup viewGroup1 = (ViewGroup)LayoutInflater.from(context).inflate(b.b.g.abc_screen_toolbar, null);
            c0 c01 = (c0)viewGroup1.findViewById(b.b.f.decor_content_parent);
            this.l = c01;
            c01.setWindowCallback(E());
            if (this.B)
              this.l.h(109); 
            if (this.y)
              this.l.h(2); 
            viewGroup = viewGroup1;
            if (this.z) {
              this.l.h(5);
              viewGroup = viewGroup1;
            } 
          } else {
            layoutInflater = null;
          } 
        } else {
          int m;
          if (this.C) {
            m = b.b.g.abc_screen_simple_overlay_action_mode;
          } else {
            m = b.b.g.abc_screen_simple;
          } 
          viewGroup = (ViewGroup)layoutInflater.inflate(m, null);
        } 
        if (viewGroup != null) {
          l.e0((View)viewGroup, new l(this));
          if (this.l == null)
            this.w = (TextView)viewGroup.findViewById(b.b.f.title); 
          d1.c((View)viewGroup);
          ContentFrameLayout contentFrameLayout = (ContentFrameLayout)viewGroup.findViewById(b.b.f.action_bar_activity_content);
          ViewGroup viewGroup1 = (ViewGroup)this.f.findViewById(16908290);
          if (viewGroup1 != null) {
            while (viewGroup1.getChildCount() > 0) {
              View view1 = viewGroup1.getChildAt(0);
              viewGroup1.removeViewAt(0);
              contentFrameLayout.addView(view1);
            } 
            viewGroup1.setId(-1);
            contentFrameLayout.setId(16908290);
            if (viewGroup1 instanceof FrameLayout)
              ((FrameLayout)viewGroup1).setForeground(null); 
          } 
          this.f.setContentView((View)viewGroup);
          contentFrameLayout.setAttachListener(new n(this));
          this.v = viewGroup;
          object = this.d;
          if (object instanceof Activity) {
            object = ((Activity)object).getTitle();
          } else {
            object = this.k;
          } 
          if (!TextUtils.isEmpty((CharSequence)object)) {
            c0 c01 = this.l;
            if (c01 != null) {
              c01.setWindowTitle((CharSequence)object);
            } else {
              a a1 = this.i;
              if (a1 != null) {
                a1.i((CharSequence)object);
              } else {
                TextView textView = this.w;
                if (textView != null)
                  textView.setText((CharSequence)object); 
              } 
            } 
          } 
          object = this.v.findViewById(16908290);
          View view = this.f.getDecorView();
          int m = view.getPaddingLeft();
          int i2 = view.getPaddingTop();
          int i1 = view.getPaddingRight();
          int n = view.getPaddingBottom();
          ((ContentFrameLayout)object).h.set(m, i2, i1, n);
          if (l.E((View)object))
            object.requestLayout(); 
          TypedArray typedArray1 = this.e.obtainStyledAttributes(b.b.j.AppCompatTheme);
          typedArray1.getValue(b.b.j.AppCompatTheme_windowMinWidthMajor, object.getMinWidthMajor());
          typedArray1.getValue(b.b.j.AppCompatTheme_windowMinWidthMinor, object.getMinWidthMinor());
          if (typedArray1.hasValue(b.b.j.AppCompatTheme_windowFixedWidthMajor))
            typedArray1.getValue(b.b.j.AppCompatTheme_windowFixedWidthMajor, object.getFixedWidthMajor()); 
          if (typedArray1.hasValue(b.b.j.AppCompatTheme_windowFixedWidthMinor))
            typedArray1.getValue(b.b.j.AppCompatTheme_windowFixedWidthMinor, object.getFixedWidthMinor()); 
          if (typedArray1.hasValue(b.b.j.AppCompatTheme_windowFixedHeightMajor))
            typedArray1.getValue(b.b.j.AppCompatTheme_windowFixedHeightMajor, object.getFixedHeightMajor()); 
          if (typedArray1.hasValue(b.b.j.AppCompatTheme_windowFixedHeightMinor))
            typedArray1.getValue(b.b.j.AppCompatTheme_windowFixedHeightMinor, object.getFixedHeightMinor()); 
          typedArray1.recycle();
          object.requestLayout();
          this.u = true;
          object = D(0);
          if (!this.M && ((j)object).h == null)
            G(108); 
        } else {
          object = c.a.a.a.a.e("AppCompat does not support the current theme features: { windowActionBar: ");
          object.append(this.A);
          object.append(", windowActionBarOverlay: ");
          object.append(this.B);
          object.append(", android:windowIsFloating: ");
          object.append(this.D);
          object.append(", windowActionModeOverlay: ");
          object.append(this.C);
          object.append(", windowNoTitle: ");
          object.append(this.E);
          object.append(" }");
          throw new IllegalArgumentException(object.toString());
        } 
      } else {
        object.recycle();
        throw new IllegalStateException("You need to use a Theme.AppCompat theme (or descendant) with this activity.");
      } 
    } 
  }
  
  public class a implements Thread.UncaughtExceptionHandler {
    public final Thread.UncaughtExceptionHandler a;
    
    public a(k this$0) {}
    
    public void uncaughtException(Thread param1Thread, Throwable param1Throwable) {
      // Byte code:
      //   0: aload_2
      //   1: instanceof android/content/res/Resources$NotFoundException
      //   4: istore #5
      //   6: iconst_0
      //   7: istore #4
      //   9: iload #4
      //   11: istore_3
      //   12: iload #5
      //   14: ifeq -> 56
      //   17: aload_2
      //   18: invokevirtual getMessage : ()Ljava/lang/String;
      //   21: astore #6
      //   23: iload #4
      //   25: istore_3
      //   26: aload #6
      //   28: ifnull -> 56
      //   31: aload #6
      //   33: ldc 'drawable'
      //   35: invokevirtual contains : (Ljava/lang/CharSequence;)Z
      //   38: ifne -> 54
      //   41: iload #4
      //   43: istore_3
      //   44: aload #6
      //   46: ldc 'Drawable'
      //   48: invokevirtual contains : (Ljava/lang/CharSequence;)Z
      //   51: ifeq -> 56
      //   54: iconst_1
      //   55: istore_3
      //   56: iload_3
      //   57: ifeq -> 135
      //   60: new java/lang/StringBuilder
      //   63: dup
      //   64: invokespecial <init> : ()V
      //   67: astore #6
      //   69: aload #6
      //   71: aload_2
      //   72: invokevirtual getMessage : ()Ljava/lang/String;
      //   75: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
      //   78: pop
      //   79: aload #6
      //   81: ldc '. If the resource you are trying to use is a vector resource, you may be referencing it in an unsupported way. See AppCompatDelegate.setCompatVectorFromResourcesEnabled() for more info.'
      //   83: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
      //   86: pop
      //   87: new android/content/res/Resources$NotFoundException
      //   90: dup
      //   91: aload #6
      //   93: invokevirtual toString : ()Ljava/lang/String;
      //   96: invokespecial <init> : (Ljava/lang/String;)V
      //   99: astore #6
      //   101: aload #6
      //   103: aload_2
      //   104: invokevirtual getCause : ()Ljava/lang/Throwable;
      //   107: invokevirtual initCause : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      //   110: pop
      //   111: aload #6
      //   113: aload_2
      //   114: invokevirtual getStackTrace : ()[Ljava/lang/StackTraceElement;
      //   117: invokevirtual setStackTrace : ([Ljava/lang/StackTraceElement;)V
      //   120: aload_0
      //   121: getfield a : Ljava/lang/Thread$UncaughtExceptionHandler;
      //   124: aload_1
      //   125: aload #6
      //   127: invokeinterface uncaughtException : (Ljava/lang/Thread;Ljava/lang/Throwable;)V
      //   132: goto -> 146
      //   135: aload_0
      //   136: getfield a : Ljava/lang/Thread$UncaughtExceptionHandler;
      //   139: aload_1
      //   140: aload_2
      //   141: invokeinterface uncaughtException : (Ljava/lang/Thread;Ljava/lang/Throwable;)V
      //   146: return
    }
  }
  
  public class b implements Runnable {
    public final k b;
    
    public b(k this$0) {}
    
    public void run() {
      k k1 = this.b;
      if ((k1.U & 0x1) != 0)
        k1.x(0); 
      k1 = this.b;
      if ((k1.U & 0x1000) != 0)
        k1.x(108); 
      k1 = this.b;
      k1.T = false;
      k1.U = 0;
    }
  }
  
  public final class c implements m.a {
    public final k b;
    
    public c(k this$0) {}
    
    public void b(g param1g, boolean param1Boolean) {
      this.b.t(param1g);
    }
    
    public boolean c(g param1g) {
      Window.Callback callback = this.b.E();
      if (callback != null)
        callback.onMenuOpened(108, (Menu)param1g); 
      return true;
    }
  }
  
  public class d implements b.b.o.a.a {
    public b.b.o.a.a a;
    
    public final k b;
    
    public d(k this$0, b.b.o.a.a param1a) {
      this.a = param1a;
    }
    
    public boolean a(b.b.o.a param1a, Menu param1Menu) {
      l.U((View)this.b.v);
      return this.a.a(param1a, param1Menu);
    }
    
    public void b(b.b.o.a param1a) {
      this.a.b(param1a);
      k k2 = this.b;
      if (k2.q != null)
        k2.f.getDecorView().removeCallbacks(this.b.r); 
      k2 = this.b;
      if (k2.p != null) {
        k2.y();
        k k4 = this.b;
        q q1 = l.a((View)k4.p);
        q1.a(0.0F);
        k4.s = q1;
        q q2 = this.b.s;
        a a1 = new a(this);
        View view = q2.a.get();
        if (view != null)
          q2.e(view, (r)a1); 
      } 
      k k3 = this.b;
      i i = k3.h;
      if (i != null)
        i.g(k3.o); 
      k k1 = this.b;
      k1.o = null;
      l.U((View)k1.v);
    }
    
    public boolean c(b.b.o.a param1a, MenuItem param1MenuItem) {
      return this.a.c(param1a, param1MenuItem);
    }
    
    public boolean d(b.b.o.a param1a, Menu param1Menu) {
      return this.a.d(param1a, param1Menu);
    }
    
    public class a extends s {
      public final k.d a;
      
      public a(k.d this$0) {}
      
      public void a(View param2View) {
        this.a.b.p.setVisibility(8);
        k k = this.a.b;
        PopupWindow popupWindow = k.q;
        if (popupWindow != null) {
          popupWindow.dismiss();
        } else if (k.p.getParent() instanceof View) {
          l.U((View)this.a.b.p.getParent());
        } 
        this.a.b.p.removeAllViews();
        this.a.b.s.d(null);
        k = this.a.b;
        k.s = null;
        l.U((View)k.v);
      }
    }
  }
  
  public class a extends s {
    public final k.d a;
    
    public a(k this$0) {}
    
    public void a(View param1View) {
      this.a.b.p.setVisibility(8);
      k k = this.a.b;
      PopupWindow popupWindow = k.q;
      if (popupWindow != null) {
        popupWindow.dismiss();
      } else if (k.p.getParent() instanceof View) {
        l.U((View)this.a.b.p.getParent());
      } 
      this.a.b.p.removeAllViews();
      this.a.b.s.d(null);
      k = this.a.b;
      k.s = null;
      l.U((View)k.v);
    }
  }
  
  public class e extends b.b.o.h {
    public final k c;
    
    public e(k this$0, Window.Callback param1Callback) {
      super(param1Callback);
    }
    
    public final ActionMode a(ActionMode.Callback param1Callback) {
      // Byte code:
      //   0: new b/b/o/e$a
      //   3: dup
      //   4: aload_0
      //   5: getfield c : Lb/b/k/k;
      //   8: getfield e : Landroid/content/Context;
      //   11: aload_1
      //   12: invokespecial <init> : (Landroid/content/Context;Landroid/view/ActionMode$Callback;)V
      //   15: astore #5
      //   17: aload_0
      //   18: getfield c : Lb/b/k/k;
      //   21: astore #6
      //   23: aload #6
      //   25: ifnull -> 835
      //   28: aload #6
      //   30: getfield o : Lb/b/o/a;
      //   33: astore_1
      //   34: aload_1
      //   35: ifnull -> 42
      //   38: aload_1
      //   39: invokevirtual c : ()V
      //   42: new b/b/k/k$d
      //   45: dup
      //   46: aload #6
      //   48: aload #5
      //   50: invokespecial <init> : (Lb/b/k/k;Lb/b/o/a$a;)V
      //   53: astore #7
      //   55: aload #6
      //   57: invokevirtual F : ()V
      //   60: aload #6
      //   62: getfield i : Lb/b/k/a;
      //   65: astore_1
      //   66: aload_1
      //   67: ifnull -> 107
      //   70: aload_1
      //   71: aload #7
      //   73: invokevirtual j : (Lb/b/o/a$a;)Lb/b/o/a;
      //   76: astore_1
      //   77: aload #6
      //   79: aload_1
      //   80: putfield o : Lb/b/o/a;
      //   83: aload_1
      //   84: ifnull -> 107
      //   87: aload #6
      //   89: getfield h : Lb/b/k/i;
      //   92: astore #4
      //   94: aload #4
      //   96: ifnull -> 107
      //   99: aload #4
      //   101: aload_1
      //   102: invokeinterface b : (Lb/b/o/a;)V
      //   107: aload #6
      //   109: getfield o : Lb/b/o/a;
      //   112: ifnonnull -> 816
      //   115: aload #6
      //   117: invokevirtual y : ()V
      //   120: aload #6
      //   122: getfield o : Lb/b/o/a;
      //   125: astore_1
      //   126: aload_1
      //   127: ifnull -> 134
      //   130: aload_1
      //   131: invokevirtual c : ()V
      //   134: aload #6
      //   136: getfield h : Lb/b/k/i;
      //   139: astore_1
      //   140: aload_1
      //   141: ifnull -> 164
      //   144: aload #6
      //   146: getfield M : Z
      //   149: ifne -> 164
      //   152: aload_1
      //   153: aload #7
      //   155: invokeinterface h : (Lb/b/o/a$a;)Lb/b/o/a;
      //   160: astore_1
      //   161: goto -> 166
      //   164: aconst_null
      //   165: astore_1
      //   166: aload_1
      //   167: ifnull -> 179
      //   170: aload #6
      //   172: aload_1
      //   173: putfield o : Lb/b/o/a;
      //   176: goto -> 776
      //   179: aload #6
      //   181: getfield p : Landroidx/appcompat/widget/ActionBarContextView;
      //   184: astore_1
      //   185: iconst_1
      //   186: istore_3
      //   187: aload_1
      //   188: ifnonnull -> 510
      //   191: aload #6
      //   193: getfield D : Z
      //   196: ifeq -> 427
      //   199: new android/util/TypedValue
      //   202: dup
      //   203: invokespecial <init> : ()V
      //   206: astore #4
      //   208: aload #6
      //   210: getfield e : Landroid/content/Context;
      //   213: invokevirtual getTheme : ()Landroid/content/res/Resources$Theme;
      //   216: astore_1
      //   217: aload_1
      //   218: getstatic b/b/a.actionBarTheme : I
      //   221: aload #4
      //   223: iconst_1
      //   224: invokevirtual resolveAttribute : (ILandroid/util/TypedValue;Z)Z
      //   227: pop
      //   228: aload #4
      //   230: getfield resourceId : I
      //   233: ifeq -> 292
      //   236: aload #6
      //   238: getfield e : Landroid/content/Context;
      //   241: invokevirtual getResources : ()Landroid/content/res/Resources;
      //   244: invokevirtual newTheme : ()Landroid/content/res/Resources$Theme;
      //   247: astore #8
      //   249: aload #8
      //   251: aload_1
      //   252: invokevirtual setTo : (Landroid/content/res/Resources$Theme;)V
      //   255: aload #8
      //   257: aload #4
      //   259: getfield resourceId : I
      //   262: iconst_1
      //   263: invokevirtual applyStyle : (IZ)V
      //   266: new b/b/o/c
      //   269: dup
      //   270: aload #6
      //   272: getfield e : Landroid/content/Context;
      //   275: iconst_0
      //   276: invokespecial <init> : (Landroid/content/Context;I)V
      //   279: astore_1
      //   280: aload_1
      //   281: invokevirtual getTheme : ()Landroid/content/res/Resources$Theme;
      //   284: aload #8
      //   286: invokevirtual setTo : (Landroid/content/res/Resources$Theme;)V
      //   289: goto -> 298
      //   292: aload #6
      //   294: getfield e : Landroid/content/Context;
      //   297: astore_1
      //   298: aload #6
      //   300: new androidx/appcompat/widget/ActionBarContextView
      //   303: dup
      //   304: aload_1
      //   305: aconst_null
      //   306: invokespecial <init> : (Landroid/content/Context;Landroid/util/AttributeSet;)V
      //   309: putfield p : Landroidx/appcompat/widget/ActionBarContextView;
      //   312: new android/widget/PopupWindow
      //   315: dup
      //   316: aload_1
      //   317: aconst_null
      //   318: getstatic b/b/a.actionModePopupWindowStyle : I
      //   321: invokespecial <init> : (Landroid/content/Context;Landroid/util/AttributeSet;I)V
      //   324: astore #8
      //   326: aload #6
      //   328: aload #8
      //   330: putfield q : Landroid/widget/PopupWindow;
      //   333: aload #8
      //   335: iconst_2
      //   336: invokestatic x0 : (Landroid/widget/PopupWindow;I)V
      //   339: aload #6
      //   341: getfield q : Landroid/widget/PopupWindow;
      //   344: aload #6
      //   346: getfield p : Landroidx/appcompat/widget/ActionBarContextView;
      //   349: invokevirtual setContentView : (Landroid/view/View;)V
      //   352: aload #6
      //   354: getfield q : Landroid/widget/PopupWindow;
      //   357: iconst_m1
      //   358: invokevirtual setWidth : (I)V
      //   361: aload_1
      //   362: invokevirtual getTheme : ()Landroid/content/res/Resources$Theme;
      //   365: getstatic b/b/a.actionBarSize : I
      //   368: aload #4
      //   370: iconst_1
      //   371: invokevirtual resolveAttribute : (ILandroid/util/TypedValue;Z)Z
      //   374: pop
      //   375: aload #4
      //   377: getfield data : I
      //   380: aload_1
      //   381: invokevirtual getResources : ()Landroid/content/res/Resources;
      //   384: invokevirtual getDisplayMetrics : ()Landroid/util/DisplayMetrics;
      //   387: invokestatic complexToDimensionPixelSize : (ILandroid/util/DisplayMetrics;)I
      //   390: istore_2
      //   391: aload #6
      //   393: getfield p : Landroidx/appcompat/widget/ActionBarContextView;
      //   396: iload_2
      //   397: invokevirtual setContentHeight : (I)V
      //   400: aload #6
      //   402: getfield q : Landroid/widget/PopupWindow;
      //   405: bipush #-2
      //   407: invokevirtual setHeight : (I)V
      //   410: aload #6
      //   412: new b/b/k/o
      //   415: dup
      //   416: aload #6
      //   418: invokespecial <init> : (Lb/b/k/k;)V
      //   421: putfield r : Ljava/lang/Runnable;
      //   424: goto -> 510
      //   427: aload #6
      //   429: getfield v : Landroid/view/ViewGroup;
      //   432: getstatic b/b/f.action_mode_bar_stub : I
      //   435: invokevirtual findViewById : (I)Landroid/view/View;
      //   438: checkcast androidx/appcompat/widget/ViewStubCompat
      //   441: astore #8
      //   443: aload #8
      //   445: ifnull -> 510
      //   448: aload #6
      //   450: invokevirtual F : ()V
      //   453: aload #6
      //   455: getfield i : Lb/b/k/a;
      //   458: astore_1
      //   459: aload_1
      //   460: ifnull -> 471
      //   463: aload_1
      //   464: invokevirtual d : ()Landroid/content/Context;
      //   467: astore_1
      //   468: goto -> 473
      //   471: aconst_null
      //   472: astore_1
      //   473: aload_1
      //   474: astore #4
      //   476: aload_1
      //   477: ifnonnull -> 487
      //   480: aload #6
      //   482: getfield e : Landroid/content/Context;
      //   485: astore #4
      //   487: aload #8
      //   489: aload #4
      //   491: invokestatic from : (Landroid/content/Context;)Landroid/view/LayoutInflater;
      //   494: invokevirtual setLayoutInflater : (Landroid/view/LayoutInflater;)V
      //   497: aload #6
      //   499: aload #8
      //   501: invokevirtual a : ()Landroid/view/View;
      //   504: checkcast androidx/appcompat/widget/ActionBarContextView
      //   507: putfield p : Landroidx/appcompat/widget/ActionBarContextView;
      //   510: aload #6
      //   512: getfield p : Landroidx/appcompat/widget/ActionBarContextView;
      //   515: ifnull -> 776
      //   518: aload #6
      //   520: invokevirtual y : ()V
      //   523: aload #6
      //   525: getfield p : Landroidx/appcompat/widget/ActionBarContextView;
      //   528: invokevirtual h : ()V
      //   531: aload #6
      //   533: getfield p : Landroidx/appcompat/widget/ActionBarContextView;
      //   536: invokevirtual getContext : ()Landroid/content/Context;
      //   539: astore #4
      //   541: aload #6
      //   543: getfield p : Landroidx/appcompat/widget/ActionBarContextView;
      //   546: astore_1
      //   547: aload #6
      //   549: getfield q : Landroid/widget/PopupWindow;
      //   552: ifnonnull -> 558
      //   555: goto -> 560
      //   558: iconst_0
      //   559: istore_3
      //   560: new b/b/o/d
      //   563: dup
      //   564: aload #4
      //   566: aload_1
      //   567: aload #7
      //   569: iload_3
      //   570: invokespecial <init> : (Landroid/content/Context;Landroidx/appcompat/widget/ActionBarContextView;Lb/b/o/a$a;Z)V
      //   573: astore_1
      //   574: aload #7
      //   576: aload_1
      //   577: aload_1
      //   578: getfield i : Lb/b/o/i/g;
      //   581: invokevirtual d : (Lb/b/o/a;Landroid/view/Menu;)Z
      //   584: ifeq -> 770
      //   587: aload_1
      //   588: invokevirtual i : ()V
      //   591: aload #6
      //   593: getfield p : Landroidx/appcompat/widget/ActionBarContextView;
      //   596: aload_1
      //   597: invokevirtual f : (Lb/b/o/a;)V
      //   600: aload #6
      //   602: aload_1
      //   603: putfield o : Lb/b/o/a;
      //   606: aload #6
      //   608: invokevirtual L : ()Z
      //   611: ifeq -> 686
      //   614: aload #6
      //   616: getfield p : Landroidx/appcompat/widget/ActionBarContextView;
      //   619: fconst_0
      //   620: invokevirtual setAlpha : (F)V
      //   623: aload #6
      //   625: getfield p : Landroidx/appcompat/widget/ActionBarContextView;
      //   628: invokestatic a : (Landroid/view/View;)Lb/i/m/q;
      //   631: astore #4
      //   633: aload #4
      //   635: fconst_1
      //   636: invokevirtual a : (F)Lb/i/m/q;
      //   639: pop
      //   640: aload #6
      //   642: aload #4
      //   644: putfield s : Lb/i/m/q;
      //   647: new b/b/k/p
      //   650: dup
      //   651: aload #6
      //   653: invokespecial <init> : (Lb/b/k/k;)V
      //   656: astore_1
      //   657: aload #4
      //   659: getfield a : Ljava/lang/ref/WeakReference;
      //   662: invokevirtual get : ()Ljava/lang/Object;
      //   665: checkcast android/view/View
      //   668: astore #7
      //   670: aload #7
      //   672: ifnull -> 742
      //   675: aload #4
      //   677: aload #7
      //   679: aload_1
      //   680: invokevirtual e : (Landroid/view/View;Lb/i/m/r;)V
      //   683: goto -> 742
      //   686: aload #6
      //   688: getfield p : Landroidx/appcompat/widget/ActionBarContextView;
      //   691: fconst_1
      //   692: invokevirtual setAlpha : (F)V
      //   695: aload #6
      //   697: getfield p : Landroidx/appcompat/widget/ActionBarContextView;
      //   700: iconst_0
      //   701: invokevirtual setVisibility : (I)V
      //   704: aload #6
      //   706: getfield p : Landroidx/appcompat/widget/ActionBarContextView;
      //   709: bipush #32
      //   711: invokevirtual sendAccessibilityEvent : (I)V
      //   714: aload #6
      //   716: getfield p : Landroidx/appcompat/widget/ActionBarContextView;
      //   719: invokevirtual getParent : ()Landroid/view/ViewParent;
      //   722: instanceof android/view/View
      //   725: ifeq -> 742
      //   728: aload #6
      //   730: getfield p : Landroidx/appcompat/widget/ActionBarContextView;
      //   733: invokevirtual getParent : ()Landroid/view/ViewParent;
      //   736: checkcast android/view/View
      //   739: invokevirtual requestApplyInsets : ()V
      //   742: aload #6
      //   744: getfield q : Landroid/widget/PopupWindow;
      //   747: ifnull -> 776
      //   750: aload #6
      //   752: getfield f : Landroid/view/Window;
      //   755: invokevirtual getDecorView : ()Landroid/view/View;
      //   758: aload #6
      //   760: getfield r : Ljava/lang/Runnable;
      //   763: invokevirtual post : (Ljava/lang/Runnable;)Z
      //   766: pop
      //   767: goto -> 776
      //   770: aload #6
      //   772: aconst_null
      //   773: putfield o : Lb/b/o/a;
      //   776: aload #6
      //   778: getfield o : Lb/b/o/a;
      //   781: astore_1
      //   782: aload_1
      //   783: ifnull -> 806
      //   786: aload #6
      //   788: getfield h : Lb/b/k/i;
      //   791: astore #4
      //   793: aload #4
      //   795: ifnull -> 806
      //   798: aload #4
      //   800: aload_1
      //   801: invokeinterface b : (Lb/b/o/a;)V
      //   806: aload #6
      //   808: aload #6
      //   810: getfield o : Lb/b/o/a;
      //   813: putfield o : Lb/b/o/a;
      //   816: aload #6
      //   818: getfield o : Lb/b/o/a;
      //   821: astore_1
      //   822: aload_1
      //   823: ifnull -> 833
      //   826: aload #5
      //   828: aload_1
      //   829: invokevirtual e : (Lb/b/o/a;)Landroid/view/ActionMode;
      //   832: areturn
      //   833: aconst_null
      //   834: areturn
      //   835: aconst_null
      //   836: athrow
      //   837: astore_1
      //   838: goto -> 164
      // Exception table:
      //   from	to	target	type
      //   152	161	837	java/lang/AbstractMethodError
    }
    
    public boolean dispatchKeyEvent(KeyEvent param1KeyEvent) {
      return (this.c.w(param1KeyEvent) || this.b.dispatchKeyEvent(param1KeyEvent));
    }
    
    public boolean dispatchKeyShortcutEvent(KeyEvent param1KeyEvent) {
      // Byte code:
      //   0: aload_0
      //   1: getfield b : Landroid/view/Window$Callback;
      //   4: aload_1
      //   5: invokeinterface dispatchKeyShortcutEvent : (Landroid/view/KeyEvent;)Z
      //   10: istore #4
      //   12: iconst_0
      //   13: istore_3
      //   14: iload #4
      //   16: ifne -> 168
      //   19: aload_0
      //   20: getfield c : Lb/b/k/k;
      //   23: astore #5
      //   25: aload_1
      //   26: invokevirtual getKeyCode : ()I
      //   29: istore_2
      //   30: aload #5
      //   32: invokevirtual F : ()V
      //   35: aload #5
      //   37: getfield i : Lb/b/k/a;
      //   40: astore #6
      //   42: aload #6
      //   44: ifnull -> 62
      //   47: aload #6
      //   49: iload_2
      //   50: aload_1
      //   51: invokevirtual f : (ILandroid/view/KeyEvent;)Z
      //   54: ifeq -> 62
      //   57: iconst_1
      //   58: istore_2
      //   59: goto -> 164
      //   62: aload #5
      //   64: getfield H : Lb/b/k/k$j;
      //   67: astore #6
      //   69: aload #6
      //   71: ifnull -> 108
      //   74: aload #5
      //   76: aload #6
      //   78: aload_1
      //   79: invokevirtual getKeyCode : ()I
      //   82: aload_1
      //   83: iconst_1
      //   84: invokevirtual J : (Lb/b/k/k$j;ILandroid/view/KeyEvent;I)Z
      //   87: ifeq -> 108
      //   90: aload #5
      //   92: getfield H : Lb/b/k/k$j;
      //   95: astore_1
      //   96: aload_1
      //   97: ifnull -> 57
      //   100: aload_1
      //   101: iconst_1
      //   102: putfield l : Z
      //   105: goto -> 57
      //   108: aload #5
      //   110: getfield H : Lb/b/k/k$j;
      //   113: ifnonnull -> 162
      //   116: aload #5
      //   118: iconst_0
      //   119: invokevirtual D : (I)Lb/b/k/k$j;
      //   122: astore #6
      //   124: aload #5
      //   126: aload #6
      //   128: aload_1
      //   129: invokevirtual K : (Lb/b/k/k$j;Landroid/view/KeyEvent;)Z
      //   132: pop
      //   133: aload #5
      //   135: aload #6
      //   137: aload_1
      //   138: invokevirtual getKeyCode : ()I
      //   141: aload_1
      //   142: iconst_1
      //   143: invokevirtual J : (Lb/b/k/k$j;ILandroid/view/KeyEvent;I)Z
      //   146: istore #4
      //   148: aload #6
      //   150: iconst_0
      //   151: putfield k : Z
      //   154: iload #4
      //   156: ifeq -> 162
      //   159: goto -> 57
      //   162: iconst_0
      //   163: istore_2
      //   164: iload_2
      //   165: ifeq -> 170
      //   168: iconst_1
      //   169: istore_3
      //   170: iload_3
      //   171: ireturn
    }
    
    public void onContentChanged() {}
    
    public boolean onCreatePanelMenu(int param1Int, Menu param1Menu) {
      return (param1Int == 0 && !(param1Menu instanceof g)) ? false : this.b.onCreatePanelMenu(param1Int, param1Menu);
    }
    
    public boolean onMenuOpened(int param1Int, Menu param1Menu) {
      this.b.onMenuOpened(param1Int, param1Menu);
      k k1 = this.c;
      if (k1 != null) {
        if (param1Int == 108) {
          k1.F();
          a a = k1.i;
          if (a != null)
            a.b(true); 
        } 
        return true;
      } 
      throw null;
    }
    
    public void onPanelClosed(int param1Int, Menu param1Menu) {
      this.b.onPanelClosed(param1Int, param1Menu);
      k k1 = this.c;
      if (k1 != null) {
        if (param1Int == 108) {
          k1.F();
          a a = k1.i;
          if (a != null)
            a.b(false); 
        } else if (param1Int == 0) {
          k.j j = k1.D(param1Int);
          if (j.m)
            k1.u(j, false); 
        } 
        return;
      } 
      throw null;
    }
    
    public boolean onPreparePanel(int param1Int, View param1View, Menu param1Menu) {
      Object object;
      if (param1Menu instanceof g) {
        object = param1Menu;
      } else {
        object = null;
      } 
      if (param1Int == 0 && object == null)
        return false; 
      if (object != null)
        ((g)object).y = true; 
      boolean bool = this.b.onPreparePanel(param1Int, param1View, param1Menu);
      if (object != null)
        ((g)object).y = false; 
      return bool;
    }
    
    public void onProvideKeyboardShortcuts(List<KeyboardShortcutGroup> param1List, Menu param1Menu, int param1Int) {
      g g = (this.c.D(0)).h;
      if (g != null) {
        this.b.onProvideKeyboardShortcuts(param1List, (Menu)g, param1Int);
      } else {
        this.b.onProvideKeyboardShortcuts(param1List, param1Menu, param1Int);
      } 
    }
    
    public ActionMode onWindowStartingActionMode(ActionMode.Callback param1Callback) {
      return (Build.VERSION.SDK_INT >= 23) ? null : (this.c.t ? a(param1Callback) : this.b.onWindowStartingActionMode(param1Callback));
    }
    
    public ActionMode onWindowStartingActionMode(ActionMode.Callback param1Callback, int param1Int) {
      return (!this.c.t || param1Int != 0) ? this.b.onWindowStartingActionMode(param1Callback, param1Int) : a(param1Callback);
    }
  }
  
  public class f extends g {
    public final PowerManager c;
    
    public final k d;
    
    public f(k this$0, Context param1Context) {
      super(this$0);
      this.c = (PowerManager)param1Context.getApplicationContext().getSystemService("power");
    }
    
    public IntentFilter b() {
      IntentFilter intentFilter = new IntentFilter();
      intentFilter.addAction("android.os.action.POWER_SAVE_MODE_CHANGED");
      return intentFilter;
    }
    
    public int c() {
      boolean bool;
      if (this.c.isPowerSaveMode()) {
        bool = true;
      } else {
        bool = true;
      } 
      return bool;
    }
    
    public void d() {
      this.d.p();
    }
  }
  
  public abstract class g {
    public BroadcastReceiver a;
    
    public final k b;
    
    public g(k this$0) {}
    
    public void a() {
      BroadcastReceiver broadcastReceiver = this.a;
      if (broadcastReceiver != null) {
        try {
          this.b.e.unregisterReceiver(broadcastReceiver);
        } catch (IllegalArgumentException illegalArgumentException) {}
        this.a = null;
      } 
    }
    
    public abstract IntentFilter b();
    
    public abstract int c();
    
    public abstract void d();
    
    public void e() {
      a();
      IntentFilter intentFilter = b();
      if (intentFilter != null && intentFilter.countActions() != 0) {
        if (this.a == null)
          this.a = new a(this); 
        this.b.e.registerReceiver(this.a, intentFilter);
      } 
    }
    
    public class a extends BroadcastReceiver {
      public final k.g a;
      
      public a(k.g this$0) {}
      
      public void onReceive(Context param2Context, Intent param2Intent) {
        this.a.d();
      }
    }
  }
  
  public class a extends BroadcastReceiver {
    public final k.g a;
    
    public a(k this$0) {}
    
    public void onReceive(Context param1Context, Intent param1Intent) {
      this.a.d();
    }
  }
  
  public class h extends g {
    public final t c;
    
    public final k d;
    
    public h(k this$0, t param1t) {
      super(this$0);
      this.c = param1t;
    }
    
    public IntentFilter b() {
      IntentFilter intentFilter = new IntentFilter();
      intentFilter.addAction("android.intent.action.TIME_SET");
      intentFilter.addAction("android.intent.action.TIMEZONE_CHANGED");
      intentFilter.addAction("android.intent.action.TIME_TICK");
      return intentFilter;
    }
    
    public int c() {
      // Byte code:
      //   0: aload_0
      //   1: getfield c : Lb/b/k/t;
      //   4: astore #17
      //   6: aload #17
      //   8: getfield c : Lb/b/k/t$a;
      //   11: astore #16
      //   13: aload #16
      //   15: getfield b : J
      //   18: lstore_3
      //   19: invokestatic currentTimeMillis : ()J
      //   22: lstore #5
      //   24: iconst_0
      //   25: istore #12
      //   27: iconst_0
      //   28: istore #11
      //   30: iconst_1
      //   31: istore_2
      //   32: lload_3
      //   33: lload #5
      //   35: lcmp
      //   36: ifle -> 44
      //   39: iconst_1
      //   40: istore_1
      //   41: goto -> 46
      //   44: iconst_0
      //   45: istore_1
      //   46: iload_1
      //   47: ifeq -> 60
      //   50: aload #16
      //   52: getfield a : Z
      //   55: istore #11
      //   57: goto -> 411
      //   60: aload #17
      //   62: getfield a : Landroid/content/Context;
      //   65: ldc 'android.permission.ACCESS_COARSE_LOCATION'
      //   67: invokestatic i : (Landroid/content/Context;Ljava/lang/String;)I
      //   70: istore_1
      //   71: aconst_null
      //   72: astore #14
      //   74: iload_1
      //   75: ifne -> 90
      //   78: aload #17
      //   80: ldc 'network'
      //   82: invokevirtual a : (Ljava/lang/String;)Landroid/location/Location;
      //   85: astore #13
      //   87: goto -> 93
      //   90: aconst_null
      //   91: astore #13
      //   93: aload #17
      //   95: getfield a : Landroid/content/Context;
      //   98: ldc 'android.permission.ACCESS_FINE_LOCATION'
      //   100: invokestatic i : (Landroid/content/Context;Ljava/lang/String;)I
      //   103: ifne -> 115
      //   106: aload #17
      //   108: ldc 'gps'
      //   110: invokevirtual a : (Ljava/lang/String;)Landroid/location/Location;
      //   113: astore #14
      //   115: aload #14
      //   117: ifnull -> 146
      //   120: aload #13
      //   122: ifnull -> 146
      //   125: aload #13
      //   127: astore #15
      //   129: aload #14
      //   131: invokevirtual getTime : ()J
      //   134: aload #13
      //   136: invokevirtual getTime : ()J
      //   139: lcmp
      //   140: ifle -> 159
      //   143: goto -> 155
      //   146: aload #13
      //   148: astore #15
      //   150: aload #14
      //   152: ifnull -> 159
      //   155: aload #14
      //   157: astore #15
      //   159: aload #15
      //   161: ifnull -> 375
      //   164: aload #17
      //   166: getfield c : Lb/b/k/t$a;
      //   169: astore #13
      //   171: invokestatic currentTimeMillis : ()J
      //   174: lstore #7
      //   176: getstatic b/b/k/s.d : Lb/b/k/s;
      //   179: ifnonnull -> 192
      //   182: new b/b/k/s
      //   185: dup
      //   186: invokespecial <init> : ()V
      //   189: putstatic b/b/k/s.d : Lb/b/k/s;
      //   192: getstatic b/b/k/s.d : Lb/b/k/s;
      //   195: astore #14
      //   197: aload #14
      //   199: lload #7
      //   201: ldc2_w 86400000
      //   204: lsub
      //   205: aload #15
      //   207: invokevirtual getLatitude : ()D
      //   210: aload #15
      //   212: invokevirtual getLongitude : ()D
      //   215: invokevirtual a : (JDD)V
      //   218: aload #14
      //   220: lload #7
      //   222: aload #15
      //   224: invokevirtual getLatitude : ()D
      //   227: aload #15
      //   229: invokevirtual getLongitude : ()D
      //   232: invokevirtual a : (JDD)V
      //   235: aload #14
      //   237: getfield c : I
      //   240: iconst_1
      //   241: if_icmpne -> 247
      //   244: iconst_1
      //   245: istore #11
      //   247: aload #14
      //   249: getfield b : J
      //   252: lstore #5
      //   254: aload #14
      //   256: getfield a : J
      //   259: lstore_3
      //   260: aload #14
      //   262: lload #7
      //   264: ldc2_w 86400000
      //   267: ladd
      //   268: aload #15
      //   270: invokevirtual getLatitude : ()D
      //   273: aload #15
      //   275: invokevirtual getLongitude : ()D
      //   278: invokevirtual a : (JDD)V
      //   281: aload #14
      //   283: getfield b : J
      //   286: lstore #9
      //   288: lload #5
      //   290: ldc2_w -1
      //   293: lcmp
      //   294: ifeq -> 352
      //   297: lload_3
      //   298: ldc2_w -1
      //   301: lcmp
      //   302: ifne -> 308
      //   305: goto -> 352
      //   308: lload #7
      //   310: lload_3
      //   311: lcmp
      //   312: ifle -> 323
      //   315: lload #9
      //   317: lconst_0
      //   318: ladd
      //   319: lstore_3
      //   320: goto -> 343
      //   323: lload #7
      //   325: lload #5
      //   327: lcmp
      //   328: ifle -> 338
      //   331: lload_3
      //   332: lconst_0
      //   333: ladd
      //   334: lstore_3
      //   335: goto -> 343
      //   338: lload #5
      //   340: lconst_0
      //   341: ladd
      //   342: lstore_3
      //   343: lload_3
      //   344: ldc2_w 60000
      //   347: ladd
      //   348: lstore_3
      //   349: goto -> 359
      //   352: ldc2_w 43200000
      //   355: lload #7
      //   357: ladd
      //   358: lstore_3
      //   359: aload #13
      //   361: iload #11
      //   363: putfield a : Z
      //   366: aload #13
      //   368: lload_3
      //   369: putfield b : J
      //   372: goto -> 50
      //   375: ldc 'TwilightManager'
      //   377: ldc 'Could not get last known location. This is probably because the app does not have any location permissions. Falling back to hardcoded sunrise/sunset values.'
      //   379: invokestatic i : (Ljava/lang/String;Ljava/lang/String;)I
      //   382: pop
      //   383: invokestatic getInstance : ()Ljava/util/Calendar;
      //   386: bipush #11
      //   388: invokevirtual get : (I)I
      //   391: istore_1
      //   392: iload_1
      //   393: bipush #6
      //   395: if_icmplt -> 408
      //   398: iload #12
      //   400: istore #11
      //   402: iload_1
      //   403: bipush #22
      //   405: if_icmplt -> 411
      //   408: iconst_1
      //   409: istore #11
      //   411: iload_2
      //   412: istore_1
      //   413: iload #11
      //   415: ifeq -> 420
      //   418: iconst_2
      //   419: istore_1
      //   420: iload_1
      //   421: ireturn
    }
    
    public void d() {
      this.d.p();
    }
  }
  
  public class i extends ContentFrameLayout {
    public final k j;
    
    public i(k this$0, Context param1Context) {
      super(param1Context, null);
    }
    
    public boolean dispatchKeyEvent(KeyEvent param1KeyEvent) {
      return (this.j.w(param1KeyEvent) || super.dispatchKeyEvent(param1KeyEvent));
    }
    
    public boolean onInterceptTouchEvent(MotionEvent param1MotionEvent) {
      k k1;
      if (param1MotionEvent.getAction() == 0) {
        int m = (int)param1MotionEvent.getX();
        int j = (int)param1MotionEvent.getY();
        if (m < -5 || j < -5 || m > getWidth() + 5 || j > getHeight() + 5) {
          j = 1;
        } else {
          j = 0;
        } 
        if (j != 0) {
          k1 = this.j;
          k1.u(k1.D(0), true);
          return true;
        } 
      } 
      return super.onInterceptTouchEvent((MotionEvent)k1);
    }
    
    public void setBackgroundResource(int param1Int) {
      setBackgroundDrawable(b.b.l.a.a.b(getContext(), param1Int));
    }
  }
  
  public static final class j {
    public int a;
    
    public int b;
    
    public int c;
    
    public int d;
    
    public ViewGroup e;
    
    public View f;
    
    public View g;
    
    public g h;
    
    public b.b.o.i.e i;
    
    public Context j;
    
    public boolean k;
    
    public boolean l;
    
    public boolean m;
    
    public boolean n;
    
    public boolean o;
    
    public boolean p;
    
    public Bundle q;
    
    public j(int param1Int) {
      this.a = param1Int;
      this.o = false;
    }
    
    public void a(g param1g) {
      g g1 = this.h;
      if (param1g == g1)
        return; 
      if (g1 != null)
        g1.u((m)this.i); 
      this.h = param1g;
      if (param1g != null) {
        b.b.o.i.e e1 = this.i;
        if (e1 != null)
          param1g.b((m)e1, param1g.a); 
      } 
    }
  }
  
  public final class k implements m.a {
    public final k b;
    
    public k(k this$0) {}
    
    public void b(g param1g, boolean param1Boolean) {
      boolean bool;
      g g1 = param1g.k();
      if (g1 != param1g) {
        bool = true;
      } else {
        bool = false;
      } 
      k k1 = this.b;
      if (bool)
        param1g = g1; 
      k.j j = k1.B((Menu)param1g);
      if (j != null)
        if (bool) {
          this.b.s(j.a, j, (Menu)g1);
          this.b.u(j, true);
        } else {
          this.b.u(j, param1Boolean);
        }  
    }
    
    public boolean c(g param1g) {
      if (param1g == param1g.k()) {
        k k1 = this.b;
        if (k1.A) {
          Window.Callback callback = k1.E();
          if (callback != null && !this.b.M)
            callback.onMenuOpened(108, (Menu)param1g); 
        } 
      } 
      return true;
    }
  }
}


/* Location:              C:\Users\panch\Downloads\dvba_v1.1.0-dex2jar.jar!\b\b\k\k.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */