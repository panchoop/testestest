package b.b.p;

import android.content.Context;
import android.content.res.TypedArray;
import android.database.DataSetObserver;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Handler;
import android.util.AttributeSet;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;
import android.widget.AbsListView;
import android.widget.AdapterView;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.PopupWindow;
import b.b.j;
import b.b.o.i.p;
import b.i.m.l;
import java.lang.reflect.Method;

public class k0 implements p {
  public static Method D;
  
  public static Method E;
  
  public static Method F;
  
  public Rect A;
  
  public boolean B;
  
  public PopupWindow C;
  
  public Context b;
  
  public ListAdapter c;
  
  public f0 d;
  
  public int e = -2;
  
  public int f = -2;
  
  public int g;
  
  public int h;
  
  public int i = 1002;
  
  public boolean j;
  
  public boolean k;
  
  public boolean l;
  
  public int m = 0;
  
  public boolean n = false;
  
  public boolean o = false;
  
  public int p = Integer.MAX_VALUE;
  
  public int q = 0;
  
  public DataSetObserver r;
  
  public View s;
  
  public AdapterView.OnItemClickListener t;
  
  public final e u = new e(this);
  
  public final d v = new d(this);
  
  public final c w = new c(this);
  
  public final a x = new a(this);
  
  public final Handler y;
  
  public final Rect z = new Rect();
  
  static {
    if (Build.VERSION.SDK_INT <= 28) {
      try {
        D = PopupWindow.class.getDeclaredMethod("setClipToScreenEnabled", new Class[] { boolean.class });
      } catch (NoSuchMethodException noSuchMethodException) {
        Log.i("ListPopupWindow", "Could not find method setClipToScreenEnabled() on PopupWindow. Oh well.");
      } 
      try {
        F = PopupWindow.class.getDeclaredMethod("setEpicenterBounds", new Class[] { Rect.class });
      } catch (NoSuchMethodException noSuchMethodException) {
        Log.i("ListPopupWindow", "Could not find method setEpicenterBounds(Rect) on PopupWindow. Oh well.");
      } 
    } 
    if (Build.VERSION.SDK_INT <= 23)
      try {
        E = PopupWindow.class.getDeclaredMethod("getMaxAvailableHeight", new Class[] { View.class, int.class, boolean.class });
      } catch (NoSuchMethodException noSuchMethodException) {
        Log.i("ListPopupWindow", "Could not find method getMaxAvailableHeight(View, int, boolean) on PopupWindow. Oh well.");
      }  
  }
  
  public k0(Context paramContext, AttributeSet paramAttributeSet, int paramInt1, int paramInt2) {
    this.b = paramContext;
    this.y = new Handler(paramContext.getMainLooper());
    TypedArray typedArray = paramContext.obtainStyledAttributes(paramAttributeSet, j.ListPopupWindow, paramInt1, paramInt2);
    this.g = typedArray.getDimensionPixelOffset(j.ListPopupWindow_android_dropDownHorizontalOffset, 0);
    int i = typedArray.getDimensionPixelOffset(j.ListPopupWindow_android_dropDownVerticalOffset, 0);
    this.h = i;
    if (i != 0)
      this.j = true; 
    typedArray.recycle();
    p p1 = new p(paramContext, paramAttributeSet, paramInt1, paramInt2);
    this.C = p1;
    p1.setInputMethodMode(1);
  }
  
  public boolean a() {
    return this.C.isShowing();
  }
  
  public void c(int paramInt) {
    this.g = paramInt;
  }
  
  public int d() {
    return this.g;
  }
  
  public void dismiss() {
    this.C.dismiss();
    this.C.setContentView(null);
    this.d = null;
    this.y.removeCallbacks(this.u);
  }
  
  public ListView e() {
    return this.d;
  }
  
  public void i() {
    // Byte code:
    //   0: aload_0
    //   1: getfield d : Lb/b/p/f0;
    //   4: astore #7
    //   6: iconst_1
    //   7: istore #6
    //   9: aload #7
    //   11: ifnonnull -> 116
    //   14: aload_0
    //   15: aload_0
    //   16: getfield b : Landroid/content/Context;
    //   19: aload_0
    //   20: getfield B : Z
    //   23: iconst_1
    //   24: ixor
    //   25: invokevirtual q : (Landroid/content/Context;Z)Lb/b/p/f0;
    //   28: astore #7
    //   30: aload_0
    //   31: aload #7
    //   33: putfield d : Lb/b/p/f0;
    //   36: aload #7
    //   38: aload_0
    //   39: getfield c : Landroid/widget/ListAdapter;
    //   42: invokevirtual setAdapter : (Landroid/widget/ListAdapter;)V
    //   45: aload_0
    //   46: getfield d : Lb/b/p/f0;
    //   49: aload_0
    //   50: getfield t : Landroid/widget/AdapterView$OnItemClickListener;
    //   53: invokevirtual setOnItemClickListener : (Landroid/widget/AdapterView$OnItemClickListener;)V
    //   56: aload_0
    //   57: getfield d : Lb/b/p/f0;
    //   60: iconst_1
    //   61: invokevirtual setFocusable : (Z)V
    //   64: aload_0
    //   65: getfield d : Lb/b/p/f0;
    //   68: iconst_1
    //   69: invokevirtual setFocusableInTouchMode : (Z)V
    //   72: aload_0
    //   73: getfield d : Lb/b/p/f0;
    //   76: new b/b/p/j0
    //   79: dup
    //   80: aload_0
    //   81: invokespecial <init> : (Lb/b/p/k0;)V
    //   84: invokevirtual setOnItemSelectedListener : (Landroid/widget/AdapterView$OnItemSelectedListener;)V
    //   87: aload_0
    //   88: getfield d : Lb/b/p/f0;
    //   91: aload_0
    //   92: getfield w : Lb/b/p/k0$c;
    //   95: invokevirtual setOnScrollListener : (Landroid/widget/AbsListView$OnScrollListener;)V
    //   98: aload_0
    //   99: getfield d : Lb/b/p/f0;
    //   102: astore #7
    //   104: aload_0
    //   105: getfield C : Landroid/widget/PopupWindow;
    //   108: aload #7
    //   110: invokevirtual setContentView : (Landroid/view/View;)V
    //   113: goto -> 128
    //   116: aload_0
    //   117: getfield C : Landroid/widget/PopupWindow;
    //   120: invokevirtual getContentView : ()Landroid/view/View;
    //   123: checkcast android/view/ViewGroup
    //   126: astore #7
    //   128: aload_0
    //   129: getfield C : Landroid/widget/PopupWindow;
    //   132: invokevirtual getBackground : ()Landroid/graphics/drawable/Drawable;
    //   135: astore #7
    //   137: aload #7
    //   139: ifnull -> 192
    //   142: aload #7
    //   144: aload_0
    //   145: getfield z : Landroid/graphics/Rect;
    //   148: invokevirtual getPadding : (Landroid/graphics/Rect;)Z
    //   151: pop
    //   152: aload_0
    //   153: getfield z : Landroid/graphics/Rect;
    //   156: astore #7
    //   158: aload #7
    //   160: getfield top : I
    //   163: istore_2
    //   164: aload #7
    //   166: getfield bottom : I
    //   169: iload_2
    //   170: iadd
    //   171: istore_1
    //   172: iload_1
    //   173: istore_3
    //   174: aload_0
    //   175: getfield j : Z
    //   178: ifne -> 201
    //   181: aload_0
    //   182: iload_2
    //   183: ineg
    //   184: putfield h : I
    //   187: iload_1
    //   188: istore_3
    //   189: goto -> 201
    //   192: aload_0
    //   193: getfield z : Landroid/graphics/Rect;
    //   196: invokevirtual setEmpty : ()V
    //   199: iconst_0
    //   200: istore_3
    //   201: aload_0
    //   202: getfield C : Landroid/widget/PopupWindow;
    //   205: invokevirtual getInputMethodMode : ()I
    //   208: iconst_2
    //   209: if_icmpne -> 218
    //   212: iconst_1
    //   213: istore #5
    //   215: goto -> 221
    //   218: iconst_0
    //   219: istore #5
    //   221: aload_0
    //   222: getfield s : Landroid/view/View;
    //   225: astore #7
    //   227: aload_0
    //   228: getfield h : I
    //   231: istore_2
    //   232: getstatic android/os/Build$VERSION.SDK_INT : I
    //   235: bipush #23
    //   237: if_icmpgt -> 318
    //   240: getstatic b/b/p/k0.E : Ljava/lang/reflect/Method;
    //   243: astore #8
    //   245: aload #8
    //   247: ifnull -> 304
    //   250: aload #8
    //   252: aload_0
    //   253: getfield C : Landroid/widget/PopupWindow;
    //   256: iconst_3
    //   257: anewarray java/lang/Object
    //   260: dup
    //   261: iconst_0
    //   262: aload #7
    //   264: aastore
    //   265: dup
    //   266: iconst_1
    //   267: iload_2
    //   268: invokestatic valueOf : (I)Ljava/lang/Integer;
    //   271: aastore
    //   272: dup
    //   273: iconst_2
    //   274: iload #5
    //   276: invokestatic valueOf : (Z)Ljava/lang/Boolean;
    //   279: aastore
    //   280: invokevirtual invoke : (Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
    //   283: checkcast java/lang/Integer
    //   286: invokevirtual intValue : ()I
    //   289: istore_1
    //   290: goto -> 331
    //   293: astore #8
    //   295: ldc 'ListPopupWindow'
    //   297: ldc_w 'Could not call getMaxAvailableHeightMethod(View, int, boolean) on PopupWindow. Using the public version.'
    //   300: invokestatic i : (Ljava/lang/String;Ljava/lang/String;)I
    //   303: pop
    //   304: aload_0
    //   305: getfield C : Landroid/widget/PopupWindow;
    //   308: aload #7
    //   310: iload_2
    //   311: invokevirtual getMaxAvailableHeight : (Landroid/view/View;I)I
    //   314: istore_1
    //   315: goto -> 331
    //   318: aload_0
    //   319: getfield C : Landroid/widget/PopupWindow;
    //   322: aload #7
    //   324: iload_2
    //   325: iload #5
    //   327: invokevirtual getMaxAvailableHeight : (Landroid/view/View;IZ)I
    //   330: istore_1
    //   331: aload_0
    //   332: getfield n : Z
    //   335: ifne -> 507
    //   338: aload_0
    //   339: getfield e : I
    //   342: iconst_m1
    //   343: if_icmpne -> 349
    //   346: goto -> 507
    //   349: aload_0
    //   350: getfield f : I
    //   353: istore_2
    //   354: iload_2
    //   355: bipush #-2
    //   357: if_icmpeq -> 410
    //   360: ldc_w 1073741824
    //   363: istore #4
    //   365: iload_2
    //   366: iconst_m1
    //   367: if_icmpeq -> 373
    //   370: goto -> 449
    //   373: aload_0
    //   374: getfield b : Landroid/content/Context;
    //   377: invokevirtual getResources : ()Landroid/content/res/Resources;
    //   380: invokevirtual getDisplayMetrics : ()Landroid/util/DisplayMetrics;
    //   383: getfield widthPixels : I
    //   386: istore_2
    //   387: aload_0
    //   388: getfield z : Landroid/graphics/Rect;
    //   391: astore #7
    //   393: iload_2
    //   394: aload #7
    //   396: getfield left : I
    //   399: aload #7
    //   401: getfield right : I
    //   404: iadd
    //   405: isub
    //   406: istore_2
    //   407: goto -> 449
    //   410: aload_0
    //   411: getfield b : Landroid/content/Context;
    //   414: invokevirtual getResources : ()Landroid/content/res/Resources;
    //   417: invokevirtual getDisplayMetrics : ()Landroid/util/DisplayMetrics;
    //   420: getfield widthPixels : I
    //   423: istore_2
    //   424: aload_0
    //   425: getfield z : Landroid/graphics/Rect;
    //   428: astore #7
    //   430: iload_2
    //   431: aload #7
    //   433: getfield left : I
    //   436: aload #7
    //   438: getfield right : I
    //   441: iadd
    //   442: isub
    //   443: istore_2
    //   444: ldc_w -2147483648
    //   447: istore #4
    //   449: iload_2
    //   450: iload #4
    //   452: invokestatic makeMeasureSpec : (II)I
    //   455: istore_2
    //   456: aload_0
    //   457: getfield d : Lb/b/p/f0;
    //   460: iload_2
    //   461: iload_1
    //   462: iconst_0
    //   463: isub
    //   464: iconst_m1
    //   465: invokevirtual a : (III)I
    //   468: istore_2
    //   469: iload_2
    //   470: ifle -> 498
    //   473: aload_0
    //   474: getfield d : Lb/b/p/f0;
    //   477: invokevirtual getPaddingTop : ()I
    //   480: istore_1
    //   481: aload_0
    //   482: getfield d : Lb/b/p/f0;
    //   485: invokevirtual getPaddingBottom : ()I
    //   488: iload_1
    //   489: iadd
    //   490: iload_3
    //   491: iadd
    //   492: iconst_0
    //   493: iadd
    //   494: istore_1
    //   495: goto -> 500
    //   498: iconst_0
    //   499: istore_1
    //   500: iload_2
    //   501: iload_1
    //   502: iadd
    //   503: istore_1
    //   504: goto -> 511
    //   507: iload_1
    //   508: iload_3
    //   509: iadd
    //   510: istore_1
    //   511: aload_0
    //   512: getfield C : Landroid/widget/PopupWindow;
    //   515: invokevirtual getInputMethodMode : ()I
    //   518: iconst_2
    //   519: if_icmpne -> 527
    //   522: iconst_1
    //   523: istore_3
    //   524: goto -> 529
    //   527: iconst_0
    //   528: istore_3
    //   529: aload_0
    //   530: getfield C : Landroid/widget/PopupWindow;
    //   533: aload_0
    //   534: getfield i : I
    //   537: invokestatic x0 : (Landroid/widget/PopupWindow;I)V
    //   540: aload_0
    //   541: getfield C : Landroid/widget/PopupWindow;
    //   544: invokevirtual isShowing : ()Z
    //   547: ifeq -> 803
    //   550: aload_0
    //   551: getfield s : Landroid/view/View;
    //   554: invokestatic D : (Landroid/view/View;)Z
    //   557: ifne -> 561
    //   560: return
    //   561: aload_0
    //   562: getfield f : I
    //   565: istore #4
    //   567: iload #4
    //   569: iconst_m1
    //   570: if_icmpne -> 578
    //   573: iconst_m1
    //   574: istore_2
    //   575: goto -> 596
    //   578: iload #4
    //   580: istore_2
    //   581: iload #4
    //   583: bipush #-2
    //   585: if_icmpne -> 596
    //   588: aload_0
    //   589: getfield s : Landroid/view/View;
    //   592: invokevirtual getWidth : ()I
    //   595: istore_2
    //   596: aload_0
    //   597: getfield e : I
    //   600: istore #4
    //   602: iload #4
    //   604: iconst_m1
    //   605: if_icmpne -> 697
    //   608: iload_3
    //   609: ifeq -> 615
    //   612: goto -> 617
    //   615: iconst_m1
    //   616: istore_1
    //   617: iload_3
    //   618: ifeq -> 659
    //   621: aload_0
    //   622: getfield C : Landroid/widget/PopupWindow;
    //   625: astore #7
    //   627: aload_0
    //   628: getfield f : I
    //   631: iconst_m1
    //   632: if_icmpne -> 640
    //   635: iconst_m1
    //   636: istore_3
    //   637: goto -> 642
    //   640: iconst_0
    //   641: istore_3
    //   642: aload #7
    //   644: iload_3
    //   645: invokevirtual setWidth : (I)V
    //   648: aload_0
    //   649: getfield C : Landroid/widget/PopupWindow;
    //   652: iconst_0
    //   653: invokevirtual setHeight : (I)V
    //   656: goto -> 710
    //   659: aload_0
    //   660: getfield C : Landroid/widget/PopupWindow;
    //   663: astore #7
    //   665: aload_0
    //   666: getfield f : I
    //   669: iconst_m1
    //   670: if_icmpne -> 678
    //   673: iconst_m1
    //   674: istore_3
    //   675: goto -> 680
    //   678: iconst_0
    //   679: istore_3
    //   680: aload #7
    //   682: iload_3
    //   683: invokevirtual setWidth : (I)V
    //   686: aload_0
    //   687: getfield C : Landroid/widget/PopupWindow;
    //   690: iconst_m1
    //   691: invokevirtual setHeight : (I)V
    //   694: goto -> 710
    //   697: iload #4
    //   699: bipush #-2
    //   701: if_icmpne -> 707
    //   704: goto -> 710
    //   707: iload #4
    //   709: istore_1
    //   710: aload_0
    //   711: getfield C : Landroid/widget/PopupWindow;
    //   714: astore #7
    //   716: aload_0
    //   717: getfield o : Z
    //   720: ifne -> 737
    //   723: aload_0
    //   724: getfield n : Z
    //   727: ifne -> 737
    //   730: iload #6
    //   732: istore #5
    //   734: goto -> 740
    //   737: iconst_0
    //   738: istore #5
    //   740: aload #7
    //   742: iload #5
    //   744: invokevirtual setOutsideTouchable : (Z)V
    //   747: aload_0
    //   748: getfield C : Landroid/widget/PopupWindow;
    //   751: astore #8
    //   753: aload_0
    //   754: getfield s : Landroid/view/View;
    //   757: astore #7
    //   759: aload_0
    //   760: getfield g : I
    //   763: istore #4
    //   765: aload_0
    //   766: getfield h : I
    //   769: istore_3
    //   770: iload_2
    //   771: ifge -> 779
    //   774: iconst_m1
    //   775: istore_2
    //   776: goto -> 779
    //   779: iload_1
    //   780: ifge -> 788
    //   783: iconst_m1
    //   784: istore_1
    //   785: goto -> 788
    //   788: aload #8
    //   790: aload #7
    //   792: iload #4
    //   794: iload_3
    //   795: iload_2
    //   796: iload_1
    //   797: invokevirtual update : (Landroid/view/View;IIII)V
    //   800: goto -> 1162
    //   803: aload_0
    //   804: getfield f : I
    //   807: istore_3
    //   808: iload_3
    //   809: iconst_m1
    //   810: if_icmpne -> 818
    //   813: iconst_m1
    //   814: istore_2
    //   815: goto -> 834
    //   818: iload_3
    //   819: istore_2
    //   820: iload_3
    //   821: bipush #-2
    //   823: if_icmpne -> 834
    //   826: aload_0
    //   827: getfield s : Landroid/view/View;
    //   830: invokevirtual getWidth : ()I
    //   833: istore_2
    //   834: aload_0
    //   835: getfield e : I
    //   838: istore_3
    //   839: iload_3
    //   840: iconst_m1
    //   841: if_icmpne -> 849
    //   844: iconst_m1
    //   845: istore_1
    //   846: goto -> 860
    //   849: iload_3
    //   850: bipush #-2
    //   852: if_icmpne -> 858
    //   855: goto -> 860
    //   858: iload_3
    //   859: istore_1
    //   860: aload_0
    //   861: getfield C : Landroid/widget/PopupWindow;
    //   864: iload_2
    //   865: invokevirtual setWidth : (I)V
    //   868: aload_0
    //   869: getfield C : Landroid/widget/PopupWindow;
    //   872: iload_1
    //   873: invokevirtual setHeight : (I)V
    //   876: getstatic android/os/Build$VERSION.SDK_INT : I
    //   879: bipush #28
    //   881: if_icmpgt -> 931
    //   884: getstatic b/b/p/k0.D : Ljava/lang/reflect/Method;
    //   887: astore #7
    //   889: aload #7
    //   891: ifnull -> 939
    //   894: aload #7
    //   896: aload_0
    //   897: getfield C : Landroid/widget/PopupWindow;
    //   900: iconst_1
    //   901: anewarray java/lang/Object
    //   904: dup
    //   905: iconst_0
    //   906: getstatic java/lang/Boolean.TRUE : Ljava/lang/Boolean;
    //   909: aastore
    //   910: invokevirtual invoke : (Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
    //   913: pop
    //   914: goto -> 939
    //   917: astore #7
    //   919: ldc 'ListPopupWindow'
    //   921: ldc_w 'Could not call setClipToScreenEnabled() on PopupWindow. Oh well.'
    //   924: invokestatic i : (Ljava/lang/String;Ljava/lang/String;)I
    //   927: pop
    //   928: goto -> 939
    //   931: aload_0
    //   932: getfield C : Landroid/widget/PopupWindow;
    //   935: iconst_1
    //   936: invokevirtual setIsClippedToScreen : (Z)V
    //   939: aload_0
    //   940: getfield C : Landroid/widget/PopupWindow;
    //   943: astore #7
    //   945: aload_0
    //   946: getfield o : Z
    //   949: ifne -> 965
    //   952: aload_0
    //   953: getfield n : Z
    //   956: ifne -> 965
    //   959: iconst_1
    //   960: istore #5
    //   962: goto -> 968
    //   965: iconst_0
    //   966: istore #5
    //   968: aload #7
    //   970: iload #5
    //   972: invokevirtual setOutsideTouchable : (Z)V
    //   975: aload_0
    //   976: getfield C : Landroid/widget/PopupWindow;
    //   979: aload_0
    //   980: getfield v : Lb/b/p/k0$d;
    //   983: invokevirtual setTouchInterceptor : (Landroid/view/View$OnTouchListener;)V
    //   986: aload_0
    //   987: getfield l : Z
    //   990: ifeq -> 1004
    //   993: aload_0
    //   994: getfield C : Landroid/widget/PopupWindow;
    //   997: aload_0
    //   998: getfield k : Z
    //   1001: invokestatic q0 : (Landroid/widget/PopupWindow;Z)V
    //   1004: getstatic android/os/Build$VERSION.SDK_INT : I
    //   1007: bipush #28
    //   1009: if_icmpgt -> 1062
    //   1012: getstatic b/b/p/k0.F : Ljava/lang/reflect/Method;
    //   1015: astore #7
    //   1017: aload #7
    //   1019: ifnull -> 1073
    //   1022: aload #7
    //   1024: aload_0
    //   1025: getfield C : Landroid/widget/PopupWindow;
    //   1028: iconst_1
    //   1029: anewarray java/lang/Object
    //   1032: dup
    //   1033: iconst_0
    //   1034: aload_0
    //   1035: getfield A : Landroid/graphics/Rect;
    //   1038: aastore
    //   1039: invokevirtual invoke : (Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
    //   1042: pop
    //   1043: goto -> 1073
    //   1046: astore #7
    //   1048: ldc 'ListPopupWindow'
    //   1050: ldc_w 'Could not invoke setEpicenterBounds on PopupWindow'
    //   1053: aload #7
    //   1055: invokestatic e : (Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I
    //   1058: pop
    //   1059: goto -> 1073
    //   1062: aload_0
    //   1063: getfield C : Landroid/widget/PopupWindow;
    //   1066: aload_0
    //   1067: getfield A : Landroid/graphics/Rect;
    //   1070: invokevirtual setEpicenterBounds : (Landroid/graphics/Rect;)V
    //   1073: aload_0
    //   1074: getfield C : Landroid/widget/PopupWindow;
    //   1077: aload_0
    //   1078: getfield s : Landroid/view/View;
    //   1081: aload_0
    //   1082: getfield g : I
    //   1085: aload_0
    //   1086: getfield h : I
    //   1089: aload_0
    //   1090: getfield m : I
    //   1093: invokevirtual showAsDropDown : (Landroid/view/View;III)V
    //   1096: aload_0
    //   1097: getfield d : Lb/b/p/f0;
    //   1100: iconst_m1
    //   1101: invokevirtual setSelection : (I)V
    //   1104: aload_0
    //   1105: getfield B : Z
    //   1108: ifeq -> 1121
    //   1111: aload_0
    //   1112: getfield d : Lb/b/p/f0;
    //   1115: invokevirtual isInTouchMode : ()Z
    //   1118: ifeq -> 1143
    //   1121: aload_0
    //   1122: getfield d : Lb/b/p/f0;
    //   1125: astore #7
    //   1127: aload #7
    //   1129: ifnull -> 1143
    //   1132: aload #7
    //   1134: iconst_1
    //   1135: invokevirtual setListSelectionHidden : (Z)V
    //   1138: aload #7
    //   1140: invokevirtual requestLayout : ()V
    //   1143: aload_0
    //   1144: getfield B : Z
    //   1147: ifne -> 1162
    //   1150: aload_0
    //   1151: getfield y : Landroid/os/Handler;
    //   1154: aload_0
    //   1155: getfield x : Lb/b/p/k0$a;
    //   1158: invokevirtual post : (Ljava/lang/Runnable;)Z
    //   1161: pop
    //   1162: return
    // Exception table:
    //   from	to	target	type
    //   250	290	293	java/lang/Exception
    //   894	914	917	java/lang/Exception
    //   1022	1043	1046	java/lang/Exception
  }
  
  public int j() {
    return !this.j ? 0 : this.h;
  }
  
  public void l(Drawable paramDrawable) {
    this.C.setBackgroundDrawable(paramDrawable);
  }
  
  public void m(int paramInt) {
    this.h = paramInt;
    this.j = true;
  }
  
  public Drawable n() {
    return this.C.getBackground();
  }
  
  public void o(ListAdapter paramListAdapter) {
    DataSetObserver dataSetObserver = this.r;
    if (dataSetObserver == null) {
      this.r = new b(this);
    } else {
      ListAdapter listAdapter = this.c;
      if (listAdapter != null)
        listAdapter.unregisterDataSetObserver(dataSetObserver); 
    } 
    this.c = paramListAdapter;
    if (paramListAdapter != null)
      paramListAdapter.registerDataSetObserver(this.r); 
    f0 f01 = this.d;
    if (f01 != null)
      f01.setAdapter(this.c); 
  }
  
  public f0 q(Context paramContext, boolean paramBoolean) {
    return new f0(paramContext, paramBoolean);
  }
  
  public void r(int paramInt) {
    Drawable drawable = this.C.getBackground();
    if (drawable != null) {
      drawable.getPadding(this.z);
      Rect rect = this.z;
      this.f = rect.left + rect.right + paramInt;
    } else {
      this.f = paramInt;
    } 
  }
  
  public void s(boolean paramBoolean) {
    this.B = paramBoolean;
    this.C.setFocusable(paramBoolean);
  }
  
  public class a implements Runnable {
    public final k0 b;
    
    public a(k0 this$0) {}
    
    public void run() {
      f0 f0 = this.b.d;
      if (f0 != null) {
        f0.setListSelectionHidden(true);
        f0.requestLayout();
      } 
    }
  }
  
  public class b extends DataSetObserver {
    public final k0 a;
    
    public b(k0 this$0) {}
    
    public void onChanged() {
      if (this.a.a())
        this.a.i(); 
    }
    
    public void onInvalidated() {
      this.a.dismiss();
    }
  }
  
  public class c implements AbsListView.OnScrollListener {
    public final k0 a;
    
    public c(k0 this$0) {}
    
    public void onScroll(AbsListView param1AbsListView, int param1Int1, int param1Int2, int param1Int3) {}
    
    public void onScrollStateChanged(AbsListView param1AbsListView, int param1Int) {
      boolean bool = true;
      if (param1Int == 1) {
        if (this.a.C.getInputMethodMode() == 2) {
          param1Int = bool;
        } else {
          param1Int = 0;
        } 
        if (param1Int == 0 && this.a.C.getContentView() != null) {
          k0 k01 = this.a;
          k01.y.removeCallbacks(k01.u);
          this.a.u.run();
        } 
      } 
    }
  }
  
  public class d implements View.OnTouchListener {
    public final k0 b;
    
    public d(k0 this$0) {}
    
    public boolean onTouch(View param1View, MotionEvent param1MotionEvent) {
      int k = param1MotionEvent.getAction();
      int j = (int)param1MotionEvent.getX();
      int i = (int)param1MotionEvent.getY();
      if (k == 0) {
        PopupWindow popupWindow = this.b.C;
        if (popupWindow != null && popupWindow.isShowing() && j >= 0 && j < this.b.C.getWidth() && i >= 0 && i < this.b.C.getHeight()) {
          k0 k01 = this.b;
          k01.y.postDelayed(k01.u, 250L);
          return false;
        } 
      } 
      if (k == 1) {
        k0 k01 = this.b;
        k01.y.removeCallbacks(k01.u);
      } 
      return false;
    }
  }
  
  public class e implements Runnable {
    public final k0 b;
    
    public e(k0 this$0) {}
    
    public void run() {
      f0 f0 = this.b.d;
      if (f0 != null && l.D((View)f0) && this.b.d.getCount() > this.b.d.getChildCount()) {
        int i = this.b.d.getChildCount();
        k0 k01 = this.b;
        if (i <= k01.p) {
          k01.C.setInputMethodMode(2);
          this.b.i();
        } 
      } 
    }
  }
}


/* Location:              C:\Users\panch\Downloads\dvba_v1.1.0-dex2jar.jar!\b\b\p\k0.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */