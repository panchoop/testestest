package c.c.a.b.d0;

import android.annotation.TargetApi;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import android.graphics.Outline;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.PorterDuffXfermode;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Region;
import android.graphics.Xfermode;
import android.graphics.drawable.Drawable;
import b.i.f.k.a;
import c.c.a.a.c.l.q;
import java.util.Objects;

public class g extends Drawable implements a, n {
  public static final Paint w = new Paint(1);
  
  public b b;
  
  public final m.f[] c = new m.f[4];
  
  public final m.f[] d = new m.f[4];
  
  public boolean e;
  
  public final Matrix f = new Matrix();
  
  public final Path g = new Path();
  
  public final Path h = new Path();
  
  public final RectF i = new RectF();
  
  public final RectF j = new RectF();
  
  public final Region k = new Region();
  
  public final Region l = new Region();
  
  public j m;
  
  public final Paint n = new Paint(1);
  
  public final Paint o = new Paint(1);
  
  public final c.c.a.b.c0.a p = new c.c.a.b.c0.a();
  
  public final k.a q;
  
  public final k r = new k();
  
  public PorterDuffColorFilter s;
  
  public PorterDuffColorFilter t;
  
  public Rect u;
  
  public final RectF v = new RectF();
  
  public g() {
    this(new j());
  }
  
  public g(b paramb) {
    this.b = paramb;
    this.o.setStyle(Paint.Style.STROKE);
    this.n.setStyle(Paint.Style.FILL);
    w.setColor(-1);
    w.setXfermode((Xfermode)new PorterDuffXfermode(PorterDuff.Mode.DST_OUT));
    w();
    v(getState());
    this.q = new a(this);
  }
  
  public g(j paramj) {
    this(new b(paramj, null));
  }
  
  public static g f(Context paramContext, float paramFloat) {
    int i = q.W(paramContext, c.c.a.b.b.colorSurface, g.class.getSimpleName());
    g g1 = new g();
    g1.b.b = new c.c.a.b.v.a(paramContext);
    g1.x();
    g1.q(ColorStateList.valueOf(i));
    b b1 = g1.b;
    if (b1.o != paramFloat) {
      b1.o = paramFloat;
      g1.x();
    } 
    return g1;
  }
  
  public final void b(RectF paramRectF, Path paramPath) {
    c(paramRectF, paramPath);
    if (this.b.j != 1.0F) {
      this.f.reset();
      Matrix matrix = this.f;
      float f1 = this.b.j;
      matrix.setScale(f1, f1, paramRectF.width() / 2.0F, paramRectF.height() / 2.0F);
      paramPath.transform(this.f);
    } 
    paramPath.computeBounds(this.v, true);
  }
  
  public final void c(RectF paramRectF, Path paramPath) {
    k k1 = this.r;
    b b1 = this.b;
    k1.a(b1.a, b1.k, paramRectF, this.q, paramPath);
  }
  
  public final PorterDuffColorFilter d(ColorStateList paramColorStateList, PorterDuff.Mode paramMode, Paint paramPaint, boolean paramBoolean) {
    if (paramColorStateList == null || paramMode == null) {
      if (paramBoolean) {
        int i2 = paramPaint.getColor();
        int i1 = e(i2);
        if (i1 != i2)
          return new PorterDuffColorFilter(i1, PorterDuff.Mode.SRC_IN); 
      } 
      return null;
    } 
    int m = paramColorStateList.getColorForState(getState(), 0);
    int i = m;
    if (paramBoolean)
      i = e(m); 
    return new PorterDuffColorFilter(i, paramMode);
  }
  
  public void draw(Canvas paramCanvas) {
    // Byte code:
    //   0: aload_0
    //   1: getfield n : Landroid/graphics/Paint;
    //   4: aload_0
    //   5: getfield s : Landroid/graphics/PorterDuffColorFilter;
    //   8: invokevirtual setColorFilter : (Landroid/graphics/ColorFilter;)Landroid/graphics/ColorFilter;
    //   11: pop
    //   12: aload_0
    //   13: getfield n : Landroid/graphics/Paint;
    //   16: invokevirtual getAlpha : ()I
    //   19: istore #6
    //   21: aload_0
    //   22: getfield n : Landroid/graphics/Paint;
    //   25: astore #13
    //   27: aload_0
    //   28: getfield b : Lc/c/a/b/d0/g$b;
    //   31: getfield m : I
    //   34: istore #4
    //   36: aload #13
    //   38: iload #4
    //   40: iload #4
    //   42: bipush #7
    //   44: iushr
    //   45: iadd
    //   46: iload #6
    //   48: imul
    //   49: bipush #8
    //   51: iushr
    //   52: invokevirtual setAlpha : (I)V
    //   55: aload_0
    //   56: getfield o : Landroid/graphics/Paint;
    //   59: aload_0
    //   60: getfield t : Landroid/graphics/PorterDuffColorFilter;
    //   63: invokevirtual setColorFilter : (Landroid/graphics/ColorFilter;)Landroid/graphics/ColorFilter;
    //   66: pop
    //   67: aload_0
    //   68: getfield o : Landroid/graphics/Paint;
    //   71: aload_0
    //   72: getfield b : Lc/c/a/b/d0/g$b;
    //   75: getfield l : F
    //   78: invokevirtual setStrokeWidth : (F)V
    //   81: aload_0
    //   82: getfield o : Landroid/graphics/Paint;
    //   85: invokevirtual getAlpha : ()I
    //   88: istore #7
    //   90: aload_0
    //   91: getfield o : Landroid/graphics/Paint;
    //   94: astore #13
    //   96: aload_0
    //   97: getfield b : Lc/c/a/b/d0/g$b;
    //   100: getfield m : I
    //   103: istore #4
    //   105: aload #13
    //   107: iload #4
    //   109: iload #4
    //   111: bipush #7
    //   113: iushr
    //   114: iadd
    //   115: iload #7
    //   117: imul
    //   118: bipush #8
    //   120: iushr
    //   121: invokevirtual setAlpha : (I)V
    //   124: aload_0
    //   125: getfield e : Z
    //   128: istore #12
    //   130: iconst_0
    //   131: istore #5
    //   133: iload #12
    //   135: ifeq -> 377
    //   138: aload_0
    //   139: invokevirtual l : ()F
    //   142: fneg
    //   143: fstore_2
    //   144: aload_0
    //   145: getfield b : Lc/c/a/b/d0/g$b;
    //   148: getfield a : Lc/c/a/b/d0/j;
    //   151: astore #15
    //   153: aload #15
    //   155: ifnull -> 375
    //   158: new c/c/a/b/d0/j$b
    //   161: dup
    //   162: aload #15
    //   164: invokespecial <init> : (Lc/c/a/b/d0/j;)V
    //   167: astore #14
    //   169: aload #15
    //   171: getfield e : Lc/c/a/b/d0/c;
    //   174: astore #13
    //   176: aload #13
    //   178: instanceof c/c/a/b/d0/h
    //   181: ifeq -> 187
    //   184: goto -> 199
    //   187: new c/c/a/b/d0/b
    //   190: dup
    //   191: fload_2
    //   192: aload #13
    //   194: invokespecial <init> : (FLc/c/a/b/d0/c;)V
    //   197: astore #13
    //   199: aload #14
    //   201: aload #13
    //   203: putfield e : Lc/c/a/b/d0/c;
    //   206: aload #15
    //   208: getfield f : Lc/c/a/b/d0/c;
    //   211: astore #13
    //   213: aload #13
    //   215: instanceof c/c/a/b/d0/h
    //   218: ifeq -> 224
    //   221: goto -> 236
    //   224: new c/c/a/b/d0/b
    //   227: dup
    //   228: fload_2
    //   229: aload #13
    //   231: invokespecial <init> : (FLc/c/a/b/d0/c;)V
    //   234: astore #13
    //   236: aload #14
    //   238: aload #13
    //   240: putfield f : Lc/c/a/b/d0/c;
    //   243: aload #15
    //   245: getfield h : Lc/c/a/b/d0/c;
    //   248: astore #13
    //   250: aload #13
    //   252: instanceof c/c/a/b/d0/h
    //   255: ifeq -> 261
    //   258: goto -> 273
    //   261: new c/c/a/b/d0/b
    //   264: dup
    //   265: fload_2
    //   266: aload #13
    //   268: invokespecial <init> : (FLc/c/a/b/d0/c;)V
    //   271: astore #13
    //   273: aload #14
    //   275: aload #13
    //   277: putfield h : Lc/c/a/b/d0/c;
    //   280: aload #15
    //   282: getfield g : Lc/c/a/b/d0/c;
    //   285: astore #13
    //   287: aload #13
    //   289: instanceof c/c/a/b/d0/h
    //   292: ifeq -> 298
    //   295: goto -> 310
    //   298: new c/c/a/b/d0/b
    //   301: dup
    //   302: fload_2
    //   303: aload #13
    //   305: invokespecial <init> : (FLc/c/a/b/d0/c;)V
    //   308: astore #13
    //   310: aload #14
    //   312: aload #13
    //   314: putfield g : Lc/c/a/b/d0/c;
    //   317: aload #14
    //   319: invokevirtual a : ()Lc/c/a/b/d0/j;
    //   322: astore #13
    //   324: aload_0
    //   325: aload #13
    //   327: putfield m : Lc/c/a/b/d0/j;
    //   330: aload_0
    //   331: getfield r : Lc/c/a/b/d0/k;
    //   334: aload #13
    //   336: aload_0
    //   337: getfield b : Lc/c/a/b/d0/g$b;
    //   340: getfield k : F
    //   343: aload_0
    //   344: invokevirtual i : ()Landroid/graphics/RectF;
    //   347: aconst_null
    //   348: aload_0
    //   349: getfield h : Landroid/graphics/Path;
    //   352: invokevirtual a : (Lc/c/a/b/d0/j;FLandroid/graphics/RectF;Lc/c/a/b/d0/k$a;Landroid/graphics/Path;)V
    //   355: aload_0
    //   356: aload_0
    //   357: invokevirtual h : ()Landroid/graphics/RectF;
    //   360: aload_0
    //   361: getfield g : Landroid/graphics/Path;
    //   364: invokevirtual b : (Landroid/graphics/RectF;Landroid/graphics/Path;)V
    //   367: aload_0
    //   368: iconst_0
    //   369: putfield e : Z
    //   372: goto -> 377
    //   375: aconst_null
    //   376: athrow
    //   377: aload_0
    //   378: getfield b : Lc/c/a/b/d0/g$b;
    //   381: astore #13
    //   383: aload #13
    //   385: getfield q : I
    //   388: istore #4
    //   390: iload #4
    //   392: iconst_1
    //   393: if_icmpeq -> 455
    //   396: aload #13
    //   398: getfield r : I
    //   401: ifle -> 455
    //   404: iload #4
    //   406: iconst_2
    //   407: if_icmpeq -> 449
    //   410: aload #13
    //   412: getfield a : Lc/c/a/b/d0/j;
    //   415: aload_0
    //   416: invokevirtual h : ()Landroid/graphics/RectF;
    //   419: invokevirtual d : (Landroid/graphics/RectF;)Z
    //   422: ifne -> 441
    //   425: aload_0
    //   426: getfield g : Landroid/graphics/Path;
    //   429: invokevirtual isConvex : ()Z
    //   432: ifne -> 441
    //   435: iconst_1
    //   436: istore #4
    //   438: goto -> 444
    //   441: iconst_0
    //   442: istore #4
    //   444: iload #4
    //   446: ifeq -> 455
    //   449: iconst_1
    //   450: istore #4
    //   452: goto -> 458
    //   455: iconst_0
    //   456: istore #4
    //   458: iload #4
    //   460: ifeq -> 833
    //   463: aload_1
    //   464: invokevirtual save : ()I
    //   467: pop
    //   468: aload_0
    //   469: invokevirtual j : ()I
    //   472: istore #8
    //   474: aload_0
    //   475: invokevirtual k : ()I
    //   478: istore #4
    //   480: aload_1
    //   481: iload #8
    //   483: i2f
    //   484: iload #4
    //   486: i2f
    //   487: invokevirtual translate : (FF)V
    //   490: aload_0
    //   491: getfield v : Landroid/graphics/RectF;
    //   494: invokevirtual width : ()F
    //   497: aload_0
    //   498: invokevirtual getBounds : ()Landroid/graphics/Rect;
    //   501: invokevirtual width : ()I
    //   504: i2f
    //   505: fsub
    //   506: f2i
    //   507: istore #11
    //   509: aload_0
    //   510: getfield v : Landroid/graphics/RectF;
    //   513: invokevirtual height : ()F
    //   516: aload_0
    //   517: invokevirtual getBounds : ()Landroid/graphics/Rect;
    //   520: invokevirtual height : ()I
    //   523: i2f
    //   524: fsub
    //   525: f2i
    //   526: istore #10
    //   528: aload_0
    //   529: getfield v : Landroid/graphics/RectF;
    //   532: invokevirtual width : ()F
    //   535: f2i
    //   536: istore #4
    //   538: aload_0
    //   539: getfield b : Lc/c/a/b/d0/g$b;
    //   542: getfield r : I
    //   545: istore #9
    //   547: aload_0
    //   548: getfield v : Landroid/graphics/RectF;
    //   551: invokevirtual height : ()F
    //   554: f2i
    //   555: istore #8
    //   557: iload #9
    //   559: iconst_2
    //   560: imul
    //   561: iload #4
    //   563: iadd
    //   564: iload #11
    //   566: iadd
    //   567: aload_0
    //   568: getfield b : Lc/c/a/b/d0/g$b;
    //   571: getfield r : I
    //   574: iconst_2
    //   575: imul
    //   576: iload #8
    //   578: iadd
    //   579: iload #10
    //   581: iadd
    //   582: getstatic android/graphics/Bitmap$Config.ARGB_8888 : Landroid/graphics/Bitmap$Config;
    //   585: invokestatic createBitmap : (IILandroid/graphics/Bitmap$Config;)Landroid/graphics/Bitmap;
    //   588: astore #13
    //   590: new android/graphics/Canvas
    //   593: dup
    //   594: aload #13
    //   596: invokespecial <init> : (Landroid/graphics/Bitmap;)V
    //   599: astore #14
    //   601: aload_0
    //   602: invokevirtual getBounds : ()Landroid/graphics/Rect;
    //   605: getfield left : I
    //   608: aload_0
    //   609: getfield b : Lc/c/a/b/d0/g$b;
    //   612: getfield r : I
    //   615: isub
    //   616: iload #11
    //   618: isub
    //   619: i2f
    //   620: fstore_2
    //   621: aload_0
    //   622: invokevirtual getBounds : ()Landroid/graphics/Rect;
    //   625: getfield top : I
    //   628: aload_0
    //   629: getfield b : Lc/c/a/b/d0/g$b;
    //   632: getfield r : I
    //   635: isub
    //   636: iload #10
    //   638: isub
    //   639: i2f
    //   640: fstore_3
    //   641: aload #14
    //   643: fload_2
    //   644: fneg
    //   645: fload_3
    //   646: fneg
    //   647: invokevirtual translate : (FF)V
    //   650: aload_0
    //   651: getfield b : Lc/c/a/b/d0/g$b;
    //   654: getfield s : I
    //   657: ifeq -> 676
    //   660: aload #14
    //   662: aload_0
    //   663: getfield g : Landroid/graphics/Path;
    //   666: aload_0
    //   667: getfield p : Lc/c/a/b/c0/a;
    //   670: getfield a : Landroid/graphics/Paint;
    //   673: invokevirtual drawPath : (Landroid/graphics/Path;Landroid/graphics/Paint;)V
    //   676: iconst_0
    //   677: istore #4
    //   679: iload #4
    //   681: iconst_4
    //   682: if_icmpge -> 767
    //   685: aload_0
    //   686: getfield c : [Lc/c/a/b/d0/m$f;
    //   689: iload #4
    //   691: aaload
    //   692: astore #15
    //   694: aload_0
    //   695: getfield p : Lc/c/a/b/c0/a;
    //   698: astore #16
    //   700: aload_0
    //   701: getfield b : Lc/c/a/b/d0/g$b;
    //   704: getfield r : I
    //   707: istore #8
    //   709: aload #15
    //   711: getstatic c/c/a/b/d0/m$f.a : Landroid/graphics/Matrix;
    //   714: aload #16
    //   716: iload #8
    //   718: aload #14
    //   720: invokevirtual a : (Landroid/graphics/Matrix;Lc/c/a/b/c0/a;ILandroid/graphics/Canvas;)V
    //   723: aload_0
    //   724: getfield d : [Lc/c/a/b/d0/m$f;
    //   727: iload #4
    //   729: aaload
    //   730: astore #15
    //   732: aload_0
    //   733: getfield p : Lc/c/a/b/c0/a;
    //   736: astore #16
    //   738: aload_0
    //   739: getfield b : Lc/c/a/b/d0/g$b;
    //   742: getfield r : I
    //   745: istore #8
    //   747: aload #15
    //   749: getstatic c/c/a/b/d0/m$f.a : Landroid/graphics/Matrix;
    //   752: aload #16
    //   754: iload #8
    //   756: aload #14
    //   758: invokevirtual a : (Landroid/graphics/Matrix;Lc/c/a/b/c0/a;ILandroid/graphics/Canvas;)V
    //   761: iinc #4, 1
    //   764: goto -> 679
    //   767: aload_0
    //   768: invokevirtual j : ()I
    //   771: istore #4
    //   773: aload_0
    //   774: invokevirtual k : ()I
    //   777: istore #8
    //   779: aload #14
    //   781: iload #4
    //   783: ineg
    //   784: i2f
    //   785: iload #8
    //   787: ineg
    //   788: i2f
    //   789: invokevirtual translate : (FF)V
    //   792: aload #14
    //   794: aload_0
    //   795: getfield g : Landroid/graphics/Path;
    //   798: getstatic c/c/a/b/d0/g.w : Landroid/graphics/Paint;
    //   801: invokevirtual drawPath : (Landroid/graphics/Path;Landroid/graphics/Paint;)V
    //   804: aload #14
    //   806: iload #4
    //   808: i2f
    //   809: iload #8
    //   811: i2f
    //   812: invokevirtual translate : (FF)V
    //   815: aload_1
    //   816: aload #13
    //   818: fload_2
    //   819: fload_3
    //   820: aconst_null
    //   821: invokevirtual drawBitmap : (Landroid/graphics/Bitmap;FFLandroid/graphics/Paint;)V
    //   824: aload #13
    //   826: invokevirtual recycle : ()V
    //   829: aload_1
    //   830: invokevirtual restore : ()V
    //   833: aload_0
    //   834: getfield b : Lc/c/a/b/d0/g$b;
    //   837: getfield v : Landroid/graphics/Paint$Style;
    //   840: astore #13
    //   842: aload #13
    //   844: getstatic android/graphics/Paint$Style.FILL_AND_STROKE : Landroid/graphics/Paint$Style;
    //   847: if_acmpeq -> 862
    //   850: iload #5
    //   852: istore #4
    //   854: aload #13
    //   856: getstatic android/graphics/Paint$Style.FILL : Landroid/graphics/Paint$Style;
    //   859: if_acmpne -> 865
    //   862: iconst_1
    //   863: istore #4
    //   865: iload #4
    //   867: ifeq -> 894
    //   870: aload_0
    //   871: aload_1
    //   872: aload_0
    //   873: getfield n : Landroid/graphics/Paint;
    //   876: aload_0
    //   877: getfield g : Landroid/graphics/Path;
    //   880: aload_0
    //   881: getfield b : Lc/c/a/b/d0/g$b;
    //   884: getfield a : Lc/c/a/b/d0/j;
    //   887: aload_0
    //   888: invokevirtual h : ()Landroid/graphics/RectF;
    //   891: invokevirtual g : (Landroid/graphics/Canvas;Landroid/graphics/Paint;Landroid/graphics/Path;Lc/c/a/b/d0/j;Landroid/graphics/RectF;)V
    //   894: aload_0
    //   895: invokevirtual n : ()Z
    //   898: ifeq -> 922
    //   901: aload_0
    //   902: aload_1
    //   903: aload_0
    //   904: getfield o : Landroid/graphics/Paint;
    //   907: aload_0
    //   908: getfield h : Landroid/graphics/Path;
    //   911: aload_0
    //   912: getfield m : Lc/c/a/b/d0/j;
    //   915: aload_0
    //   916: invokevirtual i : ()Landroid/graphics/RectF;
    //   919: invokevirtual g : (Landroid/graphics/Canvas;Landroid/graphics/Paint;Landroid/graphics/Path;Lc/c/a/b/d0/j;Landroid/graphics/RectF;)V
    //   922: aload_0
    //   923: getfield n : Landroid/graphics/Paint;
    //   926: iload #6
    //   928: invokevirtual setAlpha : (I)V
    //   931: aload_0
    //   932: getfield o : Landroid/graphics/Paint;
    //   935: iload #7
    //   937: invokevirtual setAlpha : (I)V
    //   940: return
  }
  
  public final int e(int paramInt) {
    b b1 = this.b;
    float f1 = b1.o + b1.p + b1.n;
    c.c.a.b.v.a a1 = b1.b;
    int i = paramInt;
    if (a1 != null) {
      i = paramInt;
      if (a1.a) {
        int m;
        if (b.i.f.a.c(paramInt, 255) == a1.c) {
          m = 1;
        } else {
          m = 0;
        } 
        i = paramInt;
        if (m) {
          float f4 = a1.d;
          float f3 = 0.0F;
          float f2 = f3;
          if (f4 > 0.0F)
            if (f1 <= 0.0F) {
              f2 = f3;
            } else {
              f2 = Math.min(((float)Math.log1p((f1 / f4)) * 4.5F + 2.0F) / 100.0F, 1.0F);
            }  
          m = Color.alpha(paramInt);
          i = b.i.f.a.c(q.K(b.i.f.a.c(paramInt, 255), a1.b, f2), m);
        } 
      } 
    } 
    return i;
  }
  
  public final void g(Canvas paramCanvas, Paint paramPaint, Path paramPath, j paramj, RectF paramRectF) {
    if (paramj.d(paramRectF)) {
      float f1 = paramj.f.a(paramRectF);
      paramCanvas.drawRoundRect(paramRectF, f1, f1, paramPaint);
    } else {
      paramCanvas.drawPath(paramPath, paramPaint);
    } 
  }
  
  public Drawable.ConstantState getConstantState() {
    return this.b;
  }
  
  public int getOpacity() {
    return -3;
  }
  
  @TargetApi(21)
  public void getOutline(Outline paramOutline) {
    b b1 = this.b;
    if (b1.q == 2)
      return; 
    if (b1.a.d(h())) {
      float f1 = m();
      paramOutline.setRoundRect(getBounds(), f1);
      return;
    } 
    b(h(), this.g);
    if (this.g.isConvex())
      paramOutline.setConvexPath(this.g); 
  }
  
  public boolean getPadding(Rect paramRect) {
    Rect rect = this.u;
    if (rect != null) {
      paramRect.set(rect);
      return true;
    } 
    return super.getPadding(paramRect);
  }
  
  public Region getTransparentRegion() {
    Rect rect = getBounds();
    this.k.set(rect);
    b(h(), this.g);
    this.l.setPath(this.g, this.k);
    this.k.op(this.l, Region.Op.DIFFERENCE);
    return this.k;
  }
  
  public RectF h() {
    Rect rect = getBounds();
    this.i.set(rect.left, rect.top, rect.right, rect.bottom);
    return this.i;
  }
  
  public final RectF i() {
    RectF rectF = h();
    float f1 = l();
    this.j.set(rectF.left + f1, rectF.top + f1, rectF.right - f1, rectF.bottom - f1);
    return this.j;
  }
  
  public void invalidateSelf() {
    this.e = true;
    super.invalidateSelf();
  }
  
  public boolean isStateful() {
    if (!super.isStateful()) {
      ColorStateList colorStateList = this.b.g;
      if (colorStateList == null || !colorStateList.isStateful()) {
        colorStateList = this.b.f;
        if (colorStateList == null || !colorStateList.isStateful()) {
          colorStateList = this.b.e;
          if (colorStateList == null || !colorStateList.isStateful()) {
            colorStateList = this.b.d;
            return (colorStateList != null && colorStateList.isStateful());
          } 
        } 
      } 
    } 
    return true;
  }
  
  public int j() {
    b b1 = this.b;
    double d = b1.s;
    return (int)(Math.sin(Math.toRadians(b1.t)) * d);
  }
  
  public int k() {
    b b1 = this.b;
    double d = b1.s;
    return (int)(Math.cos(Math.toRadians(b1.t)) * d);
  }
  
  public final float l() {
    return n() ? (this.o.getStrokeWidth() / 2.0F) : 0.0F;
  }
  
  public float m() {
    return this.b.a.e.a(h());
  }
  
  public Drawable mutate() {
    this.b = new b(this.b);
    return this;
  }
  
  public final boolean n() {
    boolean bool;
    Paint.Style style = this.b.v;
    if ((style == Paint.Style.FILL_AND_STROKE || style == Paint.Style.STROKE) && this.o.getStrokeWidth() > 0.0F) {
      bool = true;
    } else {
      bool = false;
    } 
    return bool;
  }
  
  public void o(Context paramContext) {
    this.b.b = new c.c.a.b.v.a(paramContext);
    x();
  }
  
  public void onBoundsChange(Rect paramRect) {
    this.e = true;
    super.onBoundsChange(paramRect);
  }
  
  public boolean onStateChange(int[] paramArrayOfint) {
    boolean bool2 = v(paramArrayOfint);
    boolean bool1 = w();
    if (bool2 || bool1) {
      bool1 = true;
    } else {
      bool1 = false;
    } 
    if (bool1)
      invalidateSelf(); 
    return bool1;
  }
  
  public void p(float paramFloat) {
    b b1 = this.b;
    if (b1.o != paramFloat) {
      b1.o = paramFloat;
      x();
    } 
  }
  
  public void q(ColorStateList paramColorStateList) {
    b b1 = this.b;
    if (b1.d != paramColorStateList) {
      b1.d = paramColorStateList;
      onStateChange(getState());
    } 
  }
  
  public void r(float paramFloat) {
    b b1 = this.b;
    if (b1.k != paramFloat) {
      b1.k = paramFloat;
      this.e = true;
      invalidateSelf();
    } 
  }
  
  public void s(float paramFloat, int paramInt) {
    this.b.l = paramFloat;
    invalidateSelf();
    u(ColorStateList.valueOf(paramInt));
  }
  
  public void setAlpha(int paramInt) {
    b b1 = this.b;
    if (b1.m != paramInt) {
      b1.m = paramInt;
      super.invalidateSelf();
    } 
  }
  
  public void setColorFilter(ColorFilter paramColorFilter) {
    this.b.c = paramColorFilter;
    super.invalidateSelf();
  }
  
  public void setShapeAppearanceModel(j paramj) {
    this.b.a = paramj;
    invalidateSelf();
  }
  
  public void setTint(int paramInt) {
    setTintList(ColorStateList.valueOf(paramInt));
  }
  
  public void setTintList(ColorStateList paramColorStateList) {
    this.b.g = paramColorStateList;
    w();
    super.invalidateSelf();
  }
  
  public void setTintMode(PorterDuff.Mode paramMode) {
    b b1 = this.b;
    if (b1.h != paramMode) {
      b1.h = paramMode;
      w();
      super.invalidateSelf();
    } 
  }
  
  public void t(float paramFloat, ColorStateList paramColorStateList) {
    this.b.l = paramFloat;
    invalidateSelf();
    u(paramColorStateList);
  }
  
  public void u(ColorStateList paramColorStateList) {
    b b1 = this.b;
    if (b1.e != paramColorStateList) {
      b1.e = paramColorStateList;
      onStateChange(getState());
    } 
  }
  
  public final boolean v(int[] paramArrayOfint) {
    // Byte code:
    //   0: aload_0
    //   1: getfield b : Lc/c/a/b/d0/g$b;
    //   4: getfield d : Landroid/content/res/ColorStateList;
    //   7: astore #6
    //   9: iconst_1
    //   10: istore #5
    //   12: aload #6
    //   14: ifnull -> 57
    //   17: aload_0
    //   18: getfield n : Landroid/graphics/Paint;
    //   21: invokevirtual getColor : ()I
    //   24: istore_2
    //   25: aload_0
    //   26: getfield b : Lc/c/a/b/d0/g$b;
    //   29: getfield d : Landroid/content/res/ColorStateList;
    //   32: aload_1
    //   33: iload_2
    //   34: invokevirtual getColorForState : ([II)I
    //   37: istore_3
    //   38: iload_2
    //   39: iload_3
    //   40: if_icmpeq -> 57
    //   43: aload_0
    //   44: getfield n : Landroid/graphics/Paint;
    //   47: iload_3
    //   48: invokevirtual setColor : (I)V
    //   51: iconst_1
    //   52: istore #4
    //   54: goto -> 60
    //   57: iconst_0
    //   58: istore #4
    //   60: aload_0
    //   61: getfield b : Lc/c/a/b/d0/g$b;
    //   64: getfield e : Landroid/content/res/ColorStateList;
    //   67: ifnull -> 111
    //   70: aload_0
    //   71: getfield o : Landroid/graphics/Paint;
    //   74: invokevirtual getColor : ()I
    //   77: istore_2
    //   78: aload_0
    //   79: getfield b : Lc/c/a/b/d0/g$b;
    //   82: getfield e : Landroid/content/res/ColorStateList;
    //   85: aload_1
    //   86: iload_2
    //   87: invokevirtual getColorForState : ([II)I
    //   90: istore_3
    //   91: iload_2
    //   92: iload_3
    //   93: if_icmpeq -> 111
    //   96: aload_0
    //   97: getfield o : Landroid/graphics/Paint;
    //   100: iload_3
    //   101: invokevirtual setColor : (I)V
    //   104: iload #5
    //   106: istore #4
    //   108: goto -> 111
    //   111: iload #4
    //   113: ireturn
  }
  
  public final boolean w() {
    PorterDuffColorFilter porterDuffColorFilter2 = this.s;
    PorterDuffColorFilter porterDuffColorFilter1 = this.t;
    b b2 = this.b;
    ColorStateList colorStateList = b2.g;
    PorterDuff.Mode mode = b2.h;
    Paint paint = this.n;
    boolean bool2 = true;
    this.s = d(colorStateList, mode, paint, true);
    b b1 = this.b;
    this.t = d(b1.f, b1.h, this.o, false);
    b1 = this.b;
    if (b1.u)
      this.p.a(b1.g.getColorForState(getState(), 0)); 
    boolean bool1 = bool2;
    if (Objects.equals(porterDuffColorFilter2, this.s))
      if (!Objects.equals(porterDuffColorFilter1, this.t)) {
        bool1 = bool2;
      } else {
        bool1 = false;
      }  
    return bool1;
  }
  
  public final void x() {
    b b1 = this.b;
    float f1 = b1.o + b1.p;
    b1.r = (int)Math.ceil((0.75F * f1));
    this.b.s = (int)Math.ceil((f1 * 0.25F));
    w();
    super.invalidateSelf();
  }
  
  public class a implements k.a {
    public final g a;
    
    public a(g this$0) {}
  }
  
  public static final class b extends Drawable.ConstantState {
    public j a;
    
    public c.c.a.b.v.a b;
    
    public ColorFilter c;
    
    public ColorStateList d = null;
    
    public ColorStateList e = null;
    
    public ColorStateList f = null;
    
    public ColorStateList g = null;
    
    public PorterDuff.Mode h = PorterDuff.Mode.SRC_IN;
    
    public Rect i = null;
    
    public float j = 1.0F;
    
    public float k = 1.0F;
    
    public float l;
    
    public int m = 255;
    
    public float n = 0.0F;
    
    public float o = 0.0F;
    
    public float p = 0.0F;
    
    public int q = 0;
    
    public int r = 0;
    
    public int s = 0;
    
    public int t = 0;
    
    public boolean u = false;
    
    public Paint.Style v = Paint.Style.FILL_AND_STROKE;
    
    public b(b param1b) {
      this.a = param1b.a;
      this.b = param1b.b;
      this.l = param1b.l;
      this.c = param1b.c;
      this.d = param1b.d;
      this.e = param1b.e;
      this.h = param1b.h;
      this.g = param1b.g;
      this.m = param1b.m;
      this.j = param1b.j;
      this.s = param1b.s;
      this.q = param1b.q;
      this.u = param1b.u;
      this.k = param1b.k;
      this.n = param1b.n;
      this.o = param1b.o;
      this.p = param1b.p;
      this.r = param1b.r;
      this.t = param1b.t;
      this.f = param1b.f;
      this.v = param1b.v;
      if (param1b.i != null)
        this.i = new Rect(param1b.i); 
    }
    
    public b(j param1j, c.c.a.b.v.a param1a) {
      this.a = param1j;
      this.b = null;
    }
    
    public int getChangingConfigurations() {
      return 0;
    }
    
    public Drawable newDrawable() {
      g g = new g(this);
      g.e = true;
      return g;
    }
  }
}


/* Location:              C:\Users\panch\Downloads\dvba_v1.1.0-dex2jar.jar!\c\c\a\b\d0\g.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */