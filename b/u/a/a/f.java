package b.u.a.a;

import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.XmlResourceParser;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PathMeasure;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Rect;
import android.graphics.Shader;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.AttributeSet;
import android.util.Log;
import android.util.Xml;
import java.io.IOException;
import java.util.ArrayList;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

public class f extends e {
  public static final PorterDuff.Mode k = PorterDuff.Mode.SRC_IN;
  
  public h c = new h();
  
  public PorterDuffColorFilter d;
  
  public ColorFilter e;
  
  public boolean f;
  
  public boolean g = true;
  
  public final float[] h = new float[9];
  
  public final Matrix i = new Matrix();
  
  public final Rect j = new Rect();
  
  public f() {}
  
  public f(h paramh) {
    this.d = d(paramh.c, paramh.d);
  }
  
  public static int a(int paramInt, float paramFloat) {
    return paramInt & 0xFFFFFF | (int)(Color.alpha(paramInt) * paramFloat) << 24;
  }
  
  public static f b(Resources paramResources, int paramInt, Resources.Theme paramTheme) {
    if (Build.VERSION.SDK_INT >= 24) {
      f f1 = new f();
      f1.b = paramResources.getDrawable(paramInt, paramTheme);
      new i(f1.b.getConstantState());
      return f1;
    } 
    try {
      XmlResourceParser xmlResourceParser = paramResources.getXml(paramInt);
      AttributeSet attributeSet = Xml.asAttributeSet((XmlPullParser)xmlResourceParser);
      while (true) {
        paramInt = xmlResourceParser.next();
        if (paramInt != 2 && paramInt != 1)
          continue; 
        break;
      } 
      if (paramInt == 2)
        return c(paramResources, (XmlPullParser)xmlResourceParser, attributeSet, paramTheme); 
      XmlPullParserException xmlPullParserException = new XmlPullParserException();
      this("No start tag found");
      throw xmlPullParserException;
    } catch (XmlPullParserException xmlPullParserException) {
    
    } catch (IOException iOException) {}
    Log.e("VectorDrawableCompat", "parser error", iOException);
    return null;
  }
  
  public static f c(Resources paramResources, XmlPullParser paramXmlPullParser, AttributeSet paramAttributeSet, Resources.Theme paramTheme) {
    f f1 = new f();
    f1.inflate(paramResources, paramXmlPullParser, paramAttributeSet, paramTheme);
    return f1;
  }
  
  public boolean canApplyTheme() {
    Drawable drawable = this.b;
    if (drawable != null)
      drawable.canApplyTheme(); 
    return false;
  }
  
  public PorterDuffColorFilter d(ColorStateList paramColorStateList, PorterDuff.Mode paramMode) {
    return (paramColorStateList == null || paramMode == null) ? null : new PorterDuffColorFilter(paramColorStateList.getColorForState(getState(), 0), paramMode);
  }
  
  public void draw(Canvas paramCanvas) {
    // Byte code:
    //   0: aload_0
    //   1: getfield b : Landroid/graphics/drawable/Drawable;
    //   4: astore #11
    //   6: aload #11
    //   8: ifnull -> 18
    //   11: aload #11
    //   13: aload_1
    //   14: invokevirtual draw : (Landroid/graphics/Canvas;)V
    //   17: return
    //   18: aload_0
    //   19: aload_0
    //   20: getfield j : Landroid/graphics/Rect;
    //   23: invokevirtual copyBounds : (Landroid/graphics/Rect;)V
    //   26: aload_0
    //   27: getfield j : Landroid/graphics/Rect;
    //   30: invokevirtual width : ()I
    //   33: ifle -> 680
    //   36: aload_0
    //   37: getfield j : Landroid/graphics/Rect;
    //   40: invokevirtual height : ()I
    //   43: ifgt -> 49
    //   46: goto -> 680
    //   49: aload_0
    //   50: getfield e : Landroid/graphics/ColorFilter;
    //   53: astore #12
    //   55: aload #12
    //   57: astore #11
    //   59: aload #12
    //   61: ifnonnull -> 70
    //   64: aload_0
    //   65: getfield d : Landroid/graphics/PorterDuffColorFilter;
    //   68: astore #11
    //   70: aload_1
    //   71: aload_0
    //   72: getfield i : Landroid/graphics/Matrix;
    //   75: invokevirtual getMatrix : (Landroid/graphics/Matrix;)V
    //   78: aload_0
    //   79: getfield i : Landroid/graphics/Matrix;
    //   82: aload_0
    //   83: getfield h : [F
    //   86: invokevirtual getValues : ([F)V
    //   89: aload_0
    //   90: getfield h : [F
    //   93: astore #12
    //   95: iconst_0
    //   96: istore #7
    //   98: aload #12
    //   100: iconst_0
    //   101: faload
    //   102: invokestatic abs : (F)F
    //   105: fstore_2
    //   106: aload_0
    //   107: getfield h : [F
    //   110: iconst_4
    //   111: faload
    //   112: invokestatic abs : (F)F
    //   115: fstore_3
    //   116: aload_0
    //   117: getfield h : [F
    //   120: iconst_1
    //   121: faload
    //   122: invokestatic abs : (F)F
    //   125: fstore #5
    //   127: aload_0
    //   128: getfield h : [F
    //   131: iconst_3
    //   132: faload
    //   133: invokestatic abs : (F)F
    //   136: fstore #4
    //   138: fload #5
    //   140: fconst_0
    //   141: fcmpl
    //   142: ifne -> 152
    //   145: fload #4
    //   147: fconst_0
    //   148: fcmpl
    //   149: ifeq -> 156
    //   152: fconst_1
    //   153: fstore_2
    //   154: fconst_1
    //   155: fstore_3
    //   156: aload_0
    //   157: getfield j : Landroid/graphics/Rect;
    //   160: invokevirtual width : ()I
    //   163: i2f
    //   164: fload_2
    //   165: fmul
    //   166: f2i
    //   167: istore #8
    //   169: aload_0
    //   170: getfield j : Landroid/graphics/Rect;
    //   173: invokevirtual height : ()I
    //   176: i2f
    //   177: fload_3
    //   178: fmul
    //   179: f2i
    //   180: istore #6
    //   182: sipush #2048
    //   185: iload #8
    //   187: invokestatic min : (II)I
    //   190: istore #9
    //   192: sipush #2048
    //   195: iload #6
    //   197: invokestatic min : (II)I
    //   200: istore #10
    //   202: iload #9
    //   204: ifle -> 680
    //   207: iload #10
    //   209: ifgt -> 215
    //   212: goto -> 680
    //   215: aload_1
    //   216: invokevirtual save : ()I
    //   219: istore #8
    //   221: aload_0
    //   222: getfield j : Landroid/graphics/Rect;
    //   225: astore #12
    //   227: aload_1
    //   228: aload #12
    //   230: getfield left : I
    //   233: i2f
    //   234: aload #12
    //   236: getfield top : I
    //   239: i2f
    //   240: invokevirtual translate : (FF)V
    //   243: aload_0
    //   244: invokevirtual isAutoMirrored : ()Z
    //   247: ifeq -> 264
    //   250: aload_0
    //   251: invokestatic B : (Landroid/graphics/drawable/Drawable;)I
    //   254: iconst_1
    //   255: if_icmpne -> 264
    //   258: iconst_1
    //   259: istore #6
    //   261: goto -> 267
    //   264: iconst_0
    //   265: istore #6
    //   267: iload #6
    //   269: ifeq -> 292
    //   272: aload_1
    //   273: aload_0
    //   274: getfield j : Landroid/graphics/Rect;
    //   277: invokevirtual width : ()I
    //   280: i2f
    //   281: fconst_0
    //   282: invokevirtual translate : (FF)V
    //   285: aload_1
    //   286: ldc -1.0
    //   288: fconst_1
    //   289: invokevirtual scale : (FF)V
    //   292: aload_0
    //   293: getfield j : Landroid/graphics/Rect;
    //   296: iconst_0
    //   297: iconst_0
    //   298: invokevirtual offsetTo : (II)V
    //   301: aload_0
    //   302: getfield c : Lb/u/a/a/f$h;
    //   305: astore #13
    //   307: aload #13
    //   309: getfield f : Landroid/graphics/Bitmap;
    //   312: astore #12
    //   314: aload #12
    //   316: ifnull -> 356
    //   319: iload #9
    //   321: aload #12
    //   323: invokevirtual getWidth : ()I
    //   326: if_icmpne -> 348
    //   329: iload #10
    //   331: aload #13
    //   333: getfield f : Landroid/graphics/Bitmap;
    //   336: invokevirtual getHeight : ()I
    //   339: if_icmpne -> 348
    //   342: iconst_1
    //   343: istore #6
    //   345: goto -> 351
    //   348: iconst_0
    //   349: istore #6
    //   351: iload #6
    //   353: ifne -> 377
    //   356: aload #13
    //   358: iload #9
    //   360: iload #10
    //   362: getstatic android/graphics/Bitmap$Config.ARGB_8888 : Landroid/graphics/Bitmap$Config;
    //   365: invokestatic createBitmap : (IILandroid/graphics/Bitmap$Config;)Landroid/graphics/Bitmap;
    //   368: putfield f : Landroid/graphics/Bitmap;
    //   371: aload #13
    //   373: iconst_1
    //   374: putfield k : Z
    //   377: aload_0
    //   378: getfield g : Z
    //   381: ifne -> 398
    //   384: aload_0
    //   385: getfield c : Lb/u/a/a/f$h;
    //   388: iload #9
    //   390: iload #10
    //   392: invokevirtual b : (II)V
    //   395: goto -> 547
    //   398: aload_0
    //   399: getfield c : Lb/u/a/a/f$h;
    //   402: astore #12
    //   404: aload #12
    //   406: getfield k : Z
    //   409: ifne -> 473
    //   412: aload #12
    //   414: getfield g : Landroid/content/res/ColorStateList;
    //   417: aload #12
    //   419: getfield c : Landroid/content/res/ColorStateList;
    //   422: if_acmpne -> 473
    //   425: aload #12
    //   427: getfield h : Landroid/graphics/PorterDuff$Mode;
    //   430: aload #12
    //   432: getfield d : Landroid/graphics/PorterDuff$Mode;
    //   435: if_acmpne -> 473
    //   438: aload #12
    //   440: getfield j : Z
    //   443: aload #12
    //   445: getfield e : Z
    //   448: if_icmpne -> 473
    //   451: aload #12
    //   453: getfield i : I
    //   456: aload #12
    //   458: getfield b : Lb/u/a/a/f$g;
    //   461: invokevirtual getRootAlpha : ()I
    //   464: if_icmpne -> 473
    //   467: iconst_1
    //   468: istore #6
    //   470: goto -> 476
    //   473: iconst_0
    //   474: istore #6
    //   476: iload #6
    //   478: ifne -> 547
    //   481: aload_0
    //   482: getfield c : Lb/u/a/a/f$h;
    //   485: iload #9
    //   487: iload #10
    //   489: invokevirtual b : (II)V
    //   492: aload_0
    //   493: getfield c : Lb/u/a/a/f$h;
    //   496: astore #12
    //   498: aload #12
    //   500: aload #12
    //   502: getfield c : Landroid/content/res/ColorStateList;
    //   505: putfield g : Landroid/content/res/ColorStateList;
    //   508: aload #12
    //   510: aload #12
    //   512: getfield d : Landroid/graphics/PorterDuff$Mode;
    //   515: putfield h : Landroid/graphics/PorterDuff$Mode;
    //   518: aload #12
    //   520: aload #12
    //   522: getfield b : Lb/u/a/a/f$g;
    //   525: invokevirtual getRootAlpha : ()I
    //   528: putfield i : I
    //   531: aload #12
    //   533: aload #12
    //   535: getfield e : Z
    //   538: putfield j : Z
    //   541: aload #12
    //   543: iconst_0
    //   544: putfield k : Z
    //   547: aload_0
    //   548: getfield c : Lb/u/a/a/f$h;
    //   551: astore #13
    //   553: aload_0
    //   554: getfield j : Landroid/graphics/Rect;
    //   557: astore #12
    //   559: iload #7
    //   561: istore #6
    //   563: aload #13
    //   565: getfield b : Lb/u/a/a/f$g;
    //   568: invokevirtual getRootAlpha : ()I
    //   571: sipush #255
    //   574: if_icmpge -> 580
    //   577: iconst_1
    //   578: istore #6
    //   580: iload #6
    //   582: ifne -> 596
    //   585: aload #11
    //   587: ifnonnull -> 596
    //   590: aconst_null
    //   591: astore #11
    //   593: goto -> 660
    //   596: aload #13
    //   598: getfield l : Landroid/graphics/Paint;
    //   601: ifnonnull -> 626
    //   604: new android/graphics/Paint
    //   607: dup
    //   608: invokespecial <init> : ()V
    //   611: astore #14
    //   613: aload #13
    //   615: aload #14
    //   617: putfield l : Landroid/graphics/Paint;
    //   620: aload #14
    //   622: iconst_1
    //   623: invokevirtual setFilterBitmap : (Z)V
    //   626: aload #13
    //   628: getfield l : Landroid/graphics/Paint;
    //   631: aload #13
    //   633: getfield b : Lb/u/a/a/f$g;
    //   636: invokevirtual getRootAlpha : ()I
    //   639: invokevirtual setAlpha : (I)V
    //   642: aload #13
    //   644: getfield l : Landroid/graphics/Paint;
    //   647: aload #11
    //   649: invokevirtual setColorFilter : (Landroid/graphics/ColorFilter;)Landroid/graphics/ColorFilter;
    //   652: pop
    //   653: aload #13
    //   655: getfield l : Landroid/graphics/Paint;
    //   658: astore #11
    //   660: aload_1
    //   661: aload #13
    //   663: getfield f : Landroid/graphics/Bitmap;
    //   666: aconst_null
    //   667: aload #12
    //   669: aload #11
    //   671: invokevirtual drawBitmap : (Landroid/graphics/Bitmap;Landroid/graphics/Rect;Landroid/graphics/Rect;Landroid/graphics/Paint;)V
    //   674: aload_1
    //   675: iload #8
    //   677: invokevirtual restoreToCount : (I)V
    //   680: return
  }
  
  public int getAlpha() {
    Drawable drawable = this.b;
    return (drawable != null) ? drawable.getAlpha() : this.c.b.getRootAlpha();
  }
  
  public int getChangingConfigurations() {
    Drawable drawable = this.b;
    return (drawable != null) ? drawable.getChangingConfigurations() : (super.getChangingConfigurations() | this.c.getChangingConfigurations());
  }
  
  public ColorFilter getColorFilter() {
    Drawable drawable = this.b;
    return (drawable != null) ? drawable.getColorFilter() : this.e;
  }
  
  public Drawable.ConstantState getConstantState() {
    if (this.b != null && Build.VERSION.SDK_INT >= 24)
      return new i(this.b.getConstantState()); 
    this.c.a = getChangingConfigurations();
    return this.c;
  }
  
  public int getIntrinsicHeight() {
    Drawable drawable = this.b;
    return (drawable != null) ? drawable.getIntrinsicHeight() : (int)this.c.b.j;
  }
  
  public int getIntrinsicWidth() {
    Drawable drawable = this.b;
    return (drawable != null) ? drawable.getIntrinsicWidth() : (int)this.c.b.i;
  }
  
  public int getOpacity() {
    Drawable drawable = this.b;
    return (drawable != null) ? drawable.getOpacity() : -3;
  }
  
  public void inflate(Resources paramResources, XmlPullParser paramXmlPullParser, AttributeSet paramAttributeSet) {
    Drawable drawable = this.b;
    if (drawable != null) {
      drawable.inflate(paramResources, paramXmlPullParser, paramAttributeSet);
      return;
    } 
    inflate(paramResources, paramXmlPullParser, paramAttributeSet, null);
  }
  
  public void inflate(Resources paramResources, XmlPullParser paramXmlPullParser, AttributeSet paramAttributeSet, Resources.Theme paramTheme) {
    // Byte code:
    //   0: aload_0
    //   1: getfield b : Landroid/graphics/drawable/Drawable;
    //   4: astore #11
    //   6: aload #11
    //   8: ifnull -> 22
    //   11: aload #11
    //   13: aload_1
    //   14: aload_2
    //   15: aload_3
    //   16: aload #4
    //   18: invokevirtual inflate : (Landroid/content/res/Resources;Lorg/xmlpull/v1/XmlPullParser;Landroid/util/AttributeSet;Landroid/content/res/Resources$Theme;)V
    //   21: return
    //   22: aload_0
    //   23: getfield c : Lb/u/a/a/f$h;
    //   26: astore #15
    //   28: aload #15
    //   30: new b/u/a/a/f$g
    //   33: dup
    //   34: invokespecial <init> : ()V
    //   37: putfield b : Lb/u/a/a/f$g;
    //   40: aload_1
    //   41: aload #4
    //   43: aload_3
    //   44: getstatic b/u/a/a/a.a : [I
    //   47: invokestatic a0 : (Landroid/content/res/Resources;Landroid/content/res/Resources$Theme;Landroid/util/AttributeSet;[I)Landroid/content/res/TypedArray;
    //   50: astore #13
    //   52: aload_0
    //   53: getfield c : Lb/u/a/a/f$h;
    //   56: astore #16
    //   58: aload #16
    //   60: getfield b : Lb/u/a/a/f$g;
    //   63: astore #14
    //   65: aload #13
    //   67: aload_2
    //   68: ldc_w 'tintMode'
    //   71: bipush #6
    //   73: iconst_m1
    //   74: invokestatic F : (Landroid/content/res/TypedArray;Lorg/xmlpull/v1/XmlPullParser;Ljava/lang/String;II)I
    //   77: istore #6
    //   79: getstatic android/graphics/PorterDuff$Mode.SRC_IN : Landroid/graphics/PorterDuff$Mode;
    //   82: astore #12
    //   84: iload #6
    //   86: iconst_3
    //   87: if_icmpeq -> 175
    //   90: aload #12
    //   92: astore #11
    //   94: iload #6
    //   96: iconst_5
    //   97: if_icmpeq -> 180
    //   100: iload #6
    //   102: bipush #9
    //   104: if_icmpeq -> 167
    //   107: iload #6
    //   109: tableswitch default -> 136, 14 -> 159, 15 -> 151, 16 -> 143
    //   136: aload #12
    //   138: astore #11
    //   140: goto -> 180
    //   143: getstatic android/graphics/PorterDuff$Mode.ADD : Landroid/graphics/PorterDuff$Mode;
    //   146: astore #11
    //   148: goto -> 180
    //   151: getstatic android/graphics/PorterDuff$Mode.SCREEN : Landroid/graphics/PorterDuff$Mode;
    //   154: astore #11
    //   156: goto -> 180
    //   159: getstatic android/graphics/PorterDuff$Mode.MULTIPLY : Landroid/graphics/PorterDuff$Mode;
    //   162: astore #11
    //   164: goto -> 180
    //   167: getstatic android/graphics/PorterDuff$Mode.SRC_ATOP : Landroid/graphics/PorterDuff$Mode;
    //   170: astore #11
    //   172: goto -> 180
    //   175: getstatic android/graphics/PorterDuff$Mode.SRC_OVER : Landroid/graphics/PorterDuff$Mode;
    //   178: astore #11
    //   180: aload #16
    //   182: aload #11
    //   184: putfield d : Landroid/graphics/PorterDuff$Mode;
    //   187: aload_2
    //   188: ldc_w 'tint'
    //   191: invokestatic N : (Lorg/xmlpull/v1/XmlPullParser;Ljava/lang/String;)Z
    //   194: ifeq -> 356
    //   197: new android/util/TypedValue
    //   200: dup
    //   201: invokespecial <init> : ()V
    //   204: astore #11
    //   206: aload #13
    //   208: iconst_1
    //   209: aload #11
    //   211: invokevirtual getValue : (ILandroid/util/TypedValue;)Z
    //   214: pop
    //   215: aload #11
    //   217: getfield type : I
    //   220: istore #6
    //   222: iload #6
    //   224: iconst_2
    //   225: if_icmpeq -> 307
    //   228: iload #6
    //   230: bipush #28
    //   232: if_icmplt -> 255
    //   235: iload #6
    //   237: bipush #31
    //   239: if_icmpgt -> 255
    //   242: aload #11
    //   244: getfield data : I
    //   247: invokestatic valueOf : (I)Landroid/content/res/ColorStateList;
    //   250: astore #11
    //   252: goto -> 359
    //   255: aload #13
    //   257: invokevirtual getResources : ()Landroid/content/res/Resources;
    //   260: astore #11
    //   262: aload #13
    //   264: iconst_1
    //   265: iconst_0
    //   266: invokevirtual getResourceId : (II)I
    //   269: istore #6
    //   271: aload #11
    //   273: aload #11
    //   275: iload #6
    //   277: invokevirtual getXml : (I)Landroid/content/res/XmlResourceParser;
    //   280: aload #4
    //   282: invokestatic s : (Landroid/content/res/Resources;Lorg/xmlpull/v1/XmlPullParser;Landroid/content/res/Resources$Theme;)Landroid/content/res/ColorStateList;
    //   285: astore #11
    //   287: goto -> 359
    //   290: astore #11
    //   292: ldc_w 'CSLCompat'
    //   295: ldc_w 'Failed to inflate ColorStateList.'
    //   298: aload #11
    //   300: invokestatic e : (Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I
    //   303: pop
    //   304: goto -> 356
    //   307: new java/lang/StringBuilder
    //   310: dup
    //   311: invokespecial <init> : ()V
    //   314: astore_1
    //   315: aload_1
    //   316: ldc_w 'Failed to resolve attribute at index '
    //   319: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   322: pop
    //   323: aload_1
    //   324: iconst_1
    //   325: invokevirtual append : (I)Ljava/lang/StringBuilder;
    //   328: pop
    //   329: aload_1
    //   330: ldc_w ': '
    //   333: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   336: pop
    //   337: aload_1
    //   338: aload #11
    //   340: invokevirtual append : (Ljava/lang/Object;)Ljava/lang/StringBuilder;
    //   343: pop
    //   344: new java/lang/UnsupportedOperationException
    //   347: dup
    //   348: aload_1
    //   349: invokevirtual toString : ()Ljava/lang/String;
    //   352: invokespecial <init> : (Ljava/lang/String;)V
    //   355: athrow
    //   356: aconst_null
    //   357: astore #11
    //   359: aload #11
    //   361: ifnull -> 371
    //   364: aload #16
    //   366: aload #11
    //   368: putfield c : Landroid/content/res/ColorStateList;
    //   371: aload #16
    //   373: getfield e : Z
    //   376: istore #10
    //   378: aload_2
    //   379: ldc_w 'autoMirrored'
    //   382: invokestatic N : (Lorg/xmlpull/v1/XmlPullParser;Ljava/lang/String;)Z
    //   385: ifne -> 391
    //   388: goto -> 401
    //   391: aload #13
    //   393: iconst_5
    //   394: iload #10
    //   396: invokevirtual getBoolean : (IZ)Z
    //   399: istore #10
    //   401: aload #16
    //   403: iload #10
    //   405: putfield e : Z
    //   408: aload #14
    //   410: aload #13
    //   412: aload_2
    //   413: ldc_w 'viewportWidth'
    //   416: bipush #7
    //   418: aload #14
    //   420: getfield k : F
    //   423: invokestatic E : (Landroid/content/res/TypedArray;Lorg/xmlpull/v1/XmlPullParser;Ljava/lang/String;IF)F
    //   426: putfield k : F
    //   429: aload #13
    //   431: aload_2
    //   432: ldc_w 'viewportHeight'
    //   435: bipush #8
    //   437: aload #14
    //   439: getfield l : F
    //   442: invokestatic E : (Landroid/content/res/TypedArray;Lorg/xmlpull/v1/XmlPullParser;Ljava/lang/String;IF)F
    //   445: fstore #5
    //   447: aload #14
    //   449: fload #5
    //   451: putfield l : F
    //   454: aload #14
    //   456: getfield k : F
    //   459: fconst_0
    //   460: fcmpg
    //   461: ifle -> 1888
    //   464: fload #5
    //   466: fconst_0
    //   467: fcmpg
    //   468: ifle -> 1850
    //   471: aload #14
    //   473: aload #13
    //   475: iconst_3
    //   476: aload #14
    //   478: getfield i : F
    //   481: invokevirtual getDimension : (IF)F
    //   484: putfield i : F
    //   487: aload #13
    //   489: iconst_2
    //   490: aload #14
    //   492: getfield j : F
    //   495: invokevirtual getDimension : (IF)F
    //   498: fstore #5
    //   500: aload #14
    //   502: fload #5
    //   504: putfield j : F
    //   507: aload #14
    //   509: getfield i : F
    //   512: fconst_0
    //   513: fcmpg
    //   514: ifle -> 1812
    //   517: fload #5
    //   519: fconst_0
    //   520: fcmpg
    //   521: ifle -> 1774
    //   524: aload #14
    //   526: aload #13
    //   528: aload_2
    //   529: ldc_w 'alpha'
    //   532: iconst_4
    //   533: aload #14
    //   535: invokevirtual getAlpha : ()F
    //   538: invokestatic E : (Landroid/content/res/TypedArray;Lorg/xmlpull/v1/XmlPullParser;Ljava/lang/String;IF)F
    //   541: invokevirtual setAlpha : (F)V
    //   544: aload #13
    //   546: iconst_0
    //   547: invokevirtual getString : (I)Ljava/lang/String;
    //   550: astore #11
    //   552: aload #11
    //   554: ifnull -> 577
    //   557: aload #14
    //   559: aload #11
    //   561: putfield n : Ljava/lang/String;
    //   564: aload #14
    //   566: getfield p : Lb/f/a;
    //   569: aload #11
    //   571: aload #14
    //   573: invokevirtual put : (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    //   576: pop
    //   577: aload #13
    //   579: invokevirtual recycle : ()V
    //   582: aload #15
    //   584: aload_0
    //   585: invokevirtual getChangingConfigurations : ()I
    //   588: putfield a : I
    //   591: aload #15
    //   593: iconst_1
    //   594: putfield k : Z
    //   597: aload_0
    //   598: getfield c : Lb/u/a/a/f$h;
    //   601: astore #16
    //   603: aload #16
    //   605: getfield b : Lb/u/a/a/f$g;
    //   608: astore #11
    //   610: new java/util/ArrayDeque
    //   613: dup
    //   614: invokespecial <init> : ()V
    //   617: astore #12
    //   619: aload #12
    //   621: aload #11
    //   623: getfield h : Lb/u/a/a/f$d;
    //   626: invokevirtual push : (Ljava/lang/Object;)V
    //   629: aload_2
    //   630: invokeinterface getEventType : ()I
    //   635: istore #9
    //   637: aload_2
    //   638: invokeinterface getDepth : ()I
    //   643: iconst_1
    //   644: iadd
    //   645: istore #7
    //   647: iconst_1
    //   648: istore #6
    //   650: iload #9
    //   652: iconst_1
    //   653: if_icmpeq -> 1739
    //   656: aload_2
    //   657: invokeinterface getDepth : ()I
    //   662: iload #7
    //   664: if_icmpge -> 673
    //   667: iload #9
    //   669: iconst_3
    //   670: if_icmpeq -> 1739
    //   673: iload #9
    //   675: iconst_2
    //   676: if_icmpne -> 1665
    //   679: aload_2
    //   680: invokeinterface getName : ()Ljava/lang/String;
    //   685: astore #17
    //   687: aload #12
    //   689: invokevirtual peek : ()Ljava/lang/Object;
    //   692: checkcast b/u/a/a/f$d
    //   695: astore #14
    //   697: ldc_w 'path'
    //   700: aload #17
    //   702: invokevirtual equals : (Ljava/lang/Object;)Z
    //   705: ifeq -> 1204
    //   708: new b/u/a/a/f$c
    //   711: dup
    //   712: invokespecial <init> : ()V
    //   715: astore #17
    //   717: aload_1
    //   718: aload #4
    //   720: aload_3
    //   721: getstatic b/u/a/a/a.c : [I
    //   724: invokestatic a0 : (Landroid/content/res/Resources;Landroid/content/res/Resources$Theme;Landroid/util/AttributeSet;[I)Landroid/content/res/TypedArray;
    //   727: astore #18
    //   729: aload #17
    //   731: aconst_null
    //   732: putfield e : [I
    //   735: aload_2
    //   736: ldc_w 'pathData'
    //   739: invokestatic N : (Lorg/xmlpull/v1/XmlPullParser;Ljava/lang/String;)Z
    //   742: ifne -> 748
    //   745: goto -> 1131
    //   748: aload #18
    //   750: iconst_0
    //   751: invokevirtual getString : (I)Ljava/lang/String;
    //   754: astore #13
    //   756: aload #13
    //   758: ifnull -> 768
    //   761: aload #17
    //   763: aload #13
    //   765: putfield b : Ljava/lang/String;
    //   768: aload #18
    //   770: iconst_2
    //   771: invokevirtual getString : (I)Ljava/lang/String;
    //   774: astore #13
    //   776: aload #13
    //   778: ifnull -> 791
    //   781: aload #17
    //   783: aload #13
    //   785: invokestatic v : (Ljava/lang/String;)[Lb/i/f/c;
    //   788: putfield a : [Lb/i/f/c;
    //   791: aload #17
    //   793: aload #18
    //   795: aload_2
    //   796: aload #4
    //   798: ldc_w 'fillColor'
    //   801: iconst_1
    //   802: iconst_0
    //   803: invokestatic D : (Landroid/content/res/TypedArray;Lorg/xmlpull/v1/XmlPullParser;Landroid/content/res/Resources$Theme;Ljava/lang/String;II)Lb/i/e/b/a;
    //   806: putfield h : Lb/i/e/b/a;
    //   809: aload #17
    //   811: aload #18
    //   813: aload_2
    //   814: ldc_w 'fillAlpha'
    //   817: bipush #12
    //   819: aload #17
    //   821: getfield j : F
    //   824: invokestatic E : (Landroid/content/res/TypedArray;Lorg/xmlpull/v1/XmlPullParser;Ljava/lang/String;IF)F
    //   827: putfield j : F
    //   830: aload #18
    //   832: aload_2
    //   833: ldc_w 'strokeLineCap'
    //   836: bipush #8
    //   838: iconst_m1
    //   839: invokestatic F : (Landroid/content/res/TypedArray;Lorg/xmlpull/v1/XmlPullParser;Ljava/lang/String;II)I
    //   842: istore #6
    //   844: aload #17
    //   846: getfield n : Landroid/graphics/Paint$Cap;
    //   849: astore #13
    //   851: iload #6
    //   853: ifeq -> 887
    //   856: iload #6
    //   858: iconst_1
    //   859: if_icmpeq -> 879
    //   862: iload #6
    //   864: iconst_2
    //   865: if_icmpeq -> 871
    //   868: goto -> 892
    //   871: getstatic android/graphics/Paint$Cap.SQUARE : Landroid/graphics/Paint$Cap;
    //   874: astore #13
    //   876: goto -> 892
    //   879: getstatic android/graphics/Paint$Cap.ROUND : Landroid/graphics/Paint$Cap;
    //   882: astore #13
    //   884: goto -> 892
    //   887: getstatic android/graphics/Paint$Cap.BUTT : Landroid/graphics/Paint$Cap;
    //   890: astore #13
    //   892: aload #17
    //   894: aload #13
    //   896: putfield n : Landroid/graphics/Paint$Cap;
    //   899: aload #18
    //   901: aload_2
    //   902: ldc_w 'strokeLineJoin'
    //   905: bipush #9
    //   907: iconst_m1
    //   908: invokestatic F : (Landroid/content/res/TypedArray;Lorg/xmlpull/v1/XmlPullParser;Ljava/lang/String;II)I
    //   911: istore #6
    //   913: aload #17
    //   915: getfield o : Landroid/graphics/Paint$Join;
    //   918: astore #13
    //   920: iload #6
    //   922: ifeq -> 956
    //   925: iload #6
    //   927: iconst_1
    //   928: if_icmpeq -> 948
    //   931: iload #6
    //   933: iconst_2
    //   934: if_icmpeq -> 940
    //   937: goto -> 961
    //   940: getstatic android/graphics/Paint$Join.BEVEL : Landroid/graphics/Paint$Join;
    //   943: astore #13
    //   945: goto -> 961
    //   948: getstatic android/graphics/Paint$Join.ROUND : Landroid/graphics/Paint$Join;
    //   951: astore #13
    //   953: goto -> 961
    //   956: getstatic android/graphics/Paint$Join.MITER : Landroid/graphics/Paint$Join;
    //   959: astore #13
    //   961: aload #17
    //   963: aload #13
    //   965: putfield o : Landroid/graphics/Paint$Join;
    //   968: aload #17
    //   970: aload #18
    //   972: aload_2
    //   973: ldc_w 'strokeMiterLimit'
    //   976: bipush #10
    //   978: aload #17
    //   980: getfield p : F
    //   983: invokestatic E : (Landroid/content/res/TypedArray;Lorg/xmlpull/v1/XmlPullParser;Ljava/lang/String;IF)F
    //   986: putfield p : F
    //   989: aload #17
    //   991: aload #18
    //   993: aload_2
    //   994: aload #4
    //   996: ldc_w 'strokeColor'
    //   999: iconst_3
    //   1000: iconst_0
    //   1001: invokestatic D : (Landroid/content/res/TypedArray;Lorg/xmlpull/v1/XmlPullParser;Landroid/content/res/Resources$Theme;Ljava/lang/String;II)Lb/i/e/b/a;
    //   1004: putfield f : Lb/i/e/b/a;
    //   1007: aload #17
    //   1009: aload #18
    //   1011: aload_2
    //   1012: ldc_w 'strokeAlpha'
    //   1015: bipush #11
    //   1017: aload #17
    //   1019: getfield i : F
    //   1022: invokestatic E : (Landroid/content/res/TypedArray;Lorg/xmlpull/v1/XmlPullParser;Ljava/lang/String;IF)F
    //   1025: putfield i : F
    //   1028: aload #17
    //   1030: aload #18
    //   1032: aload_2
    //   1033: ldc_w 'strokeWidth'
    //   1036: iconst_4
    //   1037: aload #17
    //   1039: getfield g : F
    //   1042: invokestatic E : (Landroid/content/res/TypedArray;Lorg/xmlpull/v1/XmlPullParser;Ljava/lang/String;IF)F
    //   1045: putfield g : F
    //   1048: aload #17
    //   1050: aload #18
    //   1052: aload_2
    //   1053: ldc_w 'trimPathEnd'
    //   1056: bipush #6
    //   1058: aload #17
    //   1060: getfield l : F
    //   1063: invokestatic E : (Landroid/content/res/TypedArray;Lorg/xmlpull/v1/XmlPullParser;Ljava/lang/String;IF)F
    //   1066: putfield l : F
    //   1069: aload #17
    //   1071: aload #18
    //   1073: aload_2
    //   1074: ldc_w 'trimPathOffset'
    //   1077: bipush #7
    //   1079: aload #17
    //   1081: getfield m : F
    //   1084: invokestatic E : (Landroid/content/res/TypedArray;Lorg/xmlpull/v1/XmlPullParser;Ljava/lang/String;IF)F
    //   1087: putfield m : F
    //   1090: aload #17
    //   1092: aload #18
    //   1094: aload_2
    //   1095: ldc_w 'trimPathStart'
    //   1098: iconst_5
    //   1099: aload #17
    //   1101: getfield k : F
    //   1104: invokestatic E : (Landroid/content/res/TypedArray;Lorg/xmlpull/v1/XmlPullParser;Ljava/lang/String;IF)F
    //   1107: putfield k : F
    //   1110: aload #17
    //   1112: aload #18
    //   1114: aload_2
    //   1115: ldc_w 'fillType'
    //   1118: bipush #13
    //   1120: aload #17
    //   1122: getfield c : I
    //   1125: invokestatic F : (Landroid/content/res/TypedArray;Lorg/xmlpull/v1/XmlPullParser;Ljava/lang/String;II)I
    //   1128: putfield c : I
    //   1131: aload #18
    //   1133: invokevirtual recycle : ()V
    //   1136: aload #14
    //   1138: getfield b : Ljava/util/ArrayList;
    //   1141: aload #17
    //   1143: invokevirtual add : (Ljava/lang/Object;)Z
    //   1146: pop
    //   1147: aload #17
    //   1149: invokevirtual getPathName : ()Ljava/lang/String;
    //   1152: ifnull -> 1174
    //   1155: aload #11
    //   1157: getfield p : Lb/f/a;
    //   1160: aload #17
    //   1162: invokevirtual getPathName : ()Ljava/lang/String;
    //   1165: aload #17
    //   1167: invokevirtual put : (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    //   1170: pop
    //   1171: goto -> 1174
    //   1174: aload #11
    //   1176: astore #13
    //   1178: aload #16
    //   1180: aload #16
    //   1182: getfield a : I
    //   1185: aload #17
    //   1187: getfield d : I
    //   1190: ior
    //   1191: putfield a : I
    //   1194: aload #12
    //   1196: astore #13
    //   1198: iconst_0
    //   1199: istore #6
    //   1201: goto -> 1650
    //   1204: aload #11
    //   1206: astore #13
    //   1208: ldc_w 'clip-path'
    //   1211: aload #17
    //   1213: invokevirtual equals : (Ljava/lang/Object;)Z
    //   1216: ifeq -> 1375
    //   1219: new b/u/a/a/f$b
    //   1222: dup
    //   1223: invokespecial <init> : ()V
    //   1226: astore #17
    //   1228: aload_2
    //   1229: ldc_w 'pathData'
    //   1232: invokestatic N : (Lorg/xmlpull/v1/XmlPullParser;Ljava/lang/String;)Z
    //   1235: ifne -> 1241
    //   1238: goto -> 1317
    //   1241: aload_1
    //   1242: aload #4
    //   1244: aload_3
    //   1245: getstatic b/u/a/a/a.d : [I
    //   1248: invokestatic a0 : (Landroid/content/res/Resources;Landroid/content/res/Resources$Theme;Landroid/util/AttributeSet;[I)Landroid/content/res/TypedArray;
    //   1251: astore #18
    //   1253: aload #18
    //   1255: iconst_0
    //   1256: invokevirtual getString : (I)Ljava/lang/String;
    //   1259: astore #19
    //   1261: aload #19
    //   1263: ifnull -> 1273
    //   1266: aload #17
    //   1268: aload #19
    //   1270: putfield b : Ljava/lang/String;
    //   1273: aload #18
    //   1275: iconst_1
    //   1276: invokevirtual getString : (I)Ljava/lang/String;
    //   1279: astore #19
    //   1281: aload #19
    //   1283: ifnull -> 1296
    //   1286: aload #17
    //   1288: aload #19
    //   1290: invokestatic v : (Ljava/lang/String;)[Lb/i/f/c;
    //   1293: putfield a : [Lb/i/f/c;
    //   1296: aload #17
    //   1298: aload #18
    //   1300: aload_2
    //   1301: ldc_w 'fillType'
    //   1304: iconst_2
    //   1305: iconst_0
    //   1306: invokestatic F : (Landroid/content/res/TypedArray;Lorg/xmlpull/v1/XmlPullParser;Ljava/lang/String;II)I
    //   1309: putfield c : I
    //   1312: aload #18
    //   1314: invokevirtual recycle : ()V
    //   1317: aload #14
    //   1319: getfield b : Ljava/util/ArrayList;
    //   1322: aload #17
    //   1324: invokevirtual add : (Ljava/lang/Object;)Z
    //   1327: pop
    //   1328: aload #17
    //   1330: invokevirtual getPathName : ()Ljava/lang/String;
    //   1333: ifnull -> 1352
    //   1336: aload #13
    //   1338: getfield p : Lb/f/a;
    //   1341: aload #17
    //   1343: invokevirtual getPathName : ()Ljava/lang/String;
    //   1346: aload #17
    //   1348: invokevirtual put : (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    //   1351: pop
    //   1352: aload #16
    //   1354: getfield a : I
    //   1357: istore #8
    //   1359: aload #16
    //   1361: aload #17
    //   1363: getfield d : I
    //   1366: iload #8
    //   1368: ior
    //   1369: putfield a : I
    //   1372: goto -> 1646
    //   1375: ldc_w 'group'
    //   1378: aload #17
    //   1380: invokevirtual equals : (Ljava/lang/Object;)Z
    //   1383: ifeq -> 1646
    //   1386: new b/u/a/a/f$d
    //   1389: dup
    //   1390: invokespecial <init> : ()V
    //   1393: astore #17
    //   1395: aload_1
    //   1396: aload #4
    //   1398: aload_3
    //   1399: getstatic b/u/a/a/a.b : [I
    //   1402: invokestatic a0 : (Landroid/content/res/Resources;Landroid/content/res/Resources$Theme;Landroid/util/AttributeSet;[I)Landroid/content/res/TypedArray;
    //   1405: astore #18
    //   1407: aload #17
    //   1409: aconst_null
    //   1410: putfield l : [I
    //   1413: aload #17
    //   1415: aload #18
    //   1417: aload_2
    //   1418: ldc_w 'rotation'
    //   1421: iconst_5
    //   1422: aload #17
    //   1424: getfield c : F
    //   1427: invokestatic E : (Landroid/content/res/TypedArray;Lorg/xmlpull/v1/XmlPullParser;Ljava/lang/String;IF)F
    //   1430: putfield c : F
    //   1433: aload #17
    //   1435: aload #18
    //   1437: iconst_1
    //   1438: aload #17
    //   1440: getfield d : F
    //   1443: invokevirtual getFloat : (IF)F
    //   1446: putfield d : F
    //   1449: aload #17
    //   1451: aload #18
    //   1453: iconst_2
    //   1454: aload #17
    //   1456: getfield e : F
    //   1459: invokevirtual getFloat : (IF)F
    //   1462: putfield e : F
    //   1465: aload #17
    //   1467: aload #18
    //   1469: aload_2
    //   1470: ldc_w 'scaleX'
    //   1473: iconst_3
    //   1474: aload #17
    //   1476: getfield f : F
    //   1479: invokestatic E : (Landroid/content/res/TypedArray;Lorg/xmlpull/v1/XmlPullParser;Ljava/lang/String;IF)F
    //   1482: putfield f : F
    //   1485: aload #17
    //   1487: aload #18
    //   1489: aload_2
    //   1490: ldc_w 'scaleY'
    //   1493: iconst_4
    //   1494: aload #17
    //   1496: getfield g : F
    //   1499: invokestatic E : (Landroid/content/res/TypedArray;Lorg/xmlpull/v1/XmlPullParser;Ljava/lang/String;IF)F
    //   1502: putfield g : F
    //   1505: aload #17
    //   1507: aload #18
    //   1509: aload_2
    //   1510: ldc_w 'translateX'
    //   1513: bipush #6
    //   1515: aload #17
    //   1517: getfield h : F
    //   1520: invokestatic E : (Landroid/content/res/TypedArray;Lorg/xmlpull/v1/XmlPullParser;Ljava/lang/String;IF)F
    //   1523: putfield h : F
    //   1526: aload #17
    //   1528: aload #18
    //   1530: aload_2
    //   1531: ldc_w 'translateY'
    //   1534: bipush #7
    //   1536: aload #17
    //   1538: getfield i : F
    //   1541: invokestatic E : (Landroid/content/res/TypedArray;Lorg/xmlpull/v1/XmlPullParser;Ljava/lang/String;IF)F
    //   1544: putfield i : F
    //   1547: aload #18
    //   1549: iconst_0
    //   1550: invokevirtual getString : (I)Ljava/lang/String;
    //   1553: astore #19
    //   1555: aload #19
    //   1557: ifnull -> 1567
    //   1560: aload #17
    //   1562: aload #19
    //   1564: putfield m : Ljava/lang/String;
    //   1567: aload #17
    //   1569: invokevirtual c : ()V
    //   1572: aload #18
    //   1574: invokevirtual recycle : ()V
    //   1577: aload #14
    //   1579: getfield b : Ljava/util/ArrayList;
    //   1582: aload #17
    //   1584: invokevirtual add : (Ljava/lang/Object;)Z
    //   1587: pop
    //   1588: aload #12
    //   1590: astore #14
    //   1592: aload #14
    //   1594: aload #17
    //   1596: invokevirtual push : (Ljava/lang/Object;)V
    //   1599: aload #17
    //   1601: invokevirtual getGroupName : ()Ljava/lang/String;
    //   1604: ifnull -> 1623
    //   1607: aload #13
    //   1609: getfield p : Lb/f/a;
    //   1612: aload #17
    //   1614: invokevirtual getGroupName : ()Ljava/lang/String;
    //   1617: aload #17
    //   1619: invokevirtual put : (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    //   1622: pop
    //   1623: aload #16
    //   1625: getfield a : I
    //   1628: istore #8
    //   1630: aload #16
    //   1632: aload #17
    //   1634: getfield k : I
    //   1637: iload #8
    //   1639: ior
    //   1640: putfield a : I
    //   1643: goto -> 1650
    //   1646: aload #12
    //   1648: astore #13
    //   1650: aload #11
    //   1652: astore #13
    //   1654: aload #12
    //   1656: astore #13
    //   1658: iload #6
    //   1660: istore #8
    //   1662: goto -> 1720
    //   1665: aload #11
    //   1667: astore #13
    //   1669: aload #12
    //   1671: astore #13
    //   1673: iload #6
    //   1675: istore #8
    //   1677: iload #9
    //   1679: iconst_3
    //   1680: if_icmpne -> 1720
    //   1683: aload #12
    //   1685: astore #13
    //   1687: iload #6
    //   1689: istore #8
    //   1691: ldc_w 'group'
    //   1694: aload_2
    //   1695: invokeinterface getName : ()Ljava/lang/String;
    //   1700: invokevirtual equals : (Ljava/lang/Object;)Z
    //   1703: ifeq -> 1720
    //   1706: aload #12
    //   1708: invokevirtual pop : ()Ljava/lang/Object;
    //   1711: pop
    //   1712: iload #6
    //   1714: istore #8
    //   1716: aload #12
    //   1718: astore #13
    //   1720: aload_2
    //   1721: invokeinterface next : ()I
    //   1726: istore #9
    //   1728: aload #13
    //   1730: astore #12
    //   1732: iload #8
    //   1734: istore #6
    //   1736: goto -> 650
    //   1739: iload #6
    //   1741: ifne -> 1763
    //   1744: aload_0
    //   1745: aload_0
    //   1746: aload #15
    //   1748: getfield c : Landroid/content/res/ColorStateList;
    //   1751: aload #15
    //   1753: getfield d : Landroid/graphics/PorterDuff$Mode;
    //   1756: invokevirtual d : (Landroid/content/res/ColorStateList;Landroid/graphics/PorterDuff$Mode;)Landroid/graphics/PorterDuffColorFilter;
    //   1759: putfield d : Landroid/graphics/PorterDuffColorFilter;
    //   1762: return
    //   1763: new org/xmlpull/v1/XmlPullParserException
    //   1766: dup
    //   1767: ldc_w 'no path defined'
    //   1770: invokespecial <init> : (Ljava/lang/String;)V
    //   1773: athrow
    //   1774: new java/lang/StringBuilder
    //   1777: dup
    //   1778: invokespecial <init> : ()V
    //   1781: astore_1
    //   1782: aload_1
    //   1783: aload #13
    //   1785: invokevirtual getPositionDescription : ()Ljava/lang/String;
    //   1788: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   1791: pop
    //   1792: aload_1
    //   1793: ldc_w '<vector> tag requires height > 0'
    //   1796: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   1799: pop
    //   1800: new org/xmlpull/v1/XmlPullParserException
    //   1803: dup
    //   1804: aload_1
    //   1805: invokevirtual toString : ()Ljava/lang/String;
    //   1808: invokespecial <init> : (Ljava/lang/String;)V
    //   1811: athrow
    //   1812: new java/lang/StringBuilder
    //   1815: dup
    //   1816: invokespecial <init> : ()V
    //   1819: astore_1
    //   1820: aload_1
    //   1821: aload #13
    //   1823: invokevirtual getPositionDescription : ()Ljava/lang/String;
    //   1826: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   1829: pop
    //   1830: aload_1
    //   1831: ldc_w '<vector> tag requires width > 0'
    //   1834: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   1837: pop
    //   1838: new org/xmlpull/v1/XmlPullParserException
    //   1841: dup
    //   1842: aload_1
    //   1843: invokevirtual toString : ()Ljava/lang/String;
    //   1846: invokespecial <init> : (Ljava/lang/String;)V
    //   1849: athrow
    //   1850: new java/lang/StringBuilder
    //   1853: dup
    //   1854: invokespecial <init> : ()V
    //   1857: astore_1
    //   1858: aload_1
    //   1859: aload #13
    //   1861: invokevirtual getPositionDescription : ()Ljava/lang/String;
    //   1864: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   1867: pop
    //   1868: aload_1
    //   1869: ldc_w '<vector> tag requires viewportHeight > 0'
    //   1872: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   1875: pop
    //   1876: new org/xmlpull/v1/XmlPullParserException
    //   1879: dup
    //   1880: aload_1
    //   1881: invokevirtual toString : ()Ljava/lang/String;
    //   1884: invokespecial <init> : (Ljava/lang/String;)V
    //   1887: athrow
    //   1888: new java/lang/StringBuilder
    //   1891: dup
    //   1892: invokespecial <init> : ()V
    //   1895: astore_1
    //   1896: aload_1
    //   1897: aload #13
    //   1899: invokevirtual getPositionDescription : ()Ljava/lang/String;
    //   1902: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   1905: pop
    //   1906: aload_1
    //   1907: ldc_w '<vector> tag requires viewportWidth > 0'
    //   1910: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   1913: pop
    //   1914: new org/xmlpull/v1/XmlPullParserException
    //   1917: dup
    //   1918: aload_1
    //   1919: invokevirtual toString : ()Ljava/lang/String;
    //   1922: invokespecial <init> : (Ljava/lang/String;)V
    //   1925: athrow
    // Exception table:
    //   from	to	target	type
    //   271	287	290	java/lang/Exception
  }
  
  public void invalidateSelf() {
    Drawable drawable = this.b;
    if (drawable != null) {
      drawable.invalidateSelf();
      return;
    } 
    super.invalidateSelf();
  }
  
  public boolean isAutoMirrored() {
    Drawable drawable = this.b;
    return (drawable != null) ? drawable.isAutoMirrored() : this.c.e;
  }
  
  public boolean isStateful() {
    // Byte code:
    //   0: aload_0
    //   1: getfield b : Landroid/graphics/drawable/Drawable;
    //   4: astore_2
    //   5: aload_2
    //   6: ifnull -> 14
    //   9: aload_2
    //   10: invokevirtual isStateful : ()Z
    //   13: ireturn
    //   14: aload_0
    //   15: invokespecial isStateful : ()Z
    //   18: ifne -> 64
    //   21: aload_0
    //   22: getfield c : Lb/u/a/a/f$h;
    //   25: astore_2
    //   26: aload_2
    //   27: ifnull -> 59
    //   30: aload_2
    //   31: invokevirtual a : ()Z
    //   34: ifne -> 64
    //   37: aload_0
    //   38: getfield c : Lb/u/a/a/f$h;
    //   41: getfield c : Landroid/content/res/ColorStateList;
    //   44: astore_2
    //   45: aload_2
    //   46: ifnull -> 59
    //   49: aload_2
    //   50: invokevirtual isStateful : ()Z
    //   53: ifeq -> 59
    //   56: goto -> 64
    //   59: iconst_0
    //   60: istore_1
    //   61: goto -> 66
    //   64: iconst_1
    //   65: istore_1
    //   66: iload_1
    //   67: ireturn
  }
  
  public Drawable mutate() {
    Drawable drawable = this.b;
    if (drawable != null) {
      drawable.mutate();
      return this;
    } 
    if (!this.f && super.mutate() == this) {
      this.c = new h(this.c);
      this.f = true;
    } 
    return this;
  }
  
  public void onBoundsChange(Rect paramRect) {
    Drawable drawable = this.b;
    if (drawable != null)
      drawable.setBounds(paramRect); 
  }
  
  public boolean onStateChange(int[] paramArrayOfint) {
    Drawable drawable = this.b;
    if (drawable != null)
      return drawable.setState(paramArrayOfint); 
    boolean bool2 = false;
    h h1 = this.c;
    ColorStateList colorStateList = h1.c;
    boolean bool = true;
    boolean bool1 = bool2;
    if (colorStateList != null) {
      PorterDuff.Mode mode = h1.d;
      bool1 = bool2;
      if (mode != null) {
        this.d = d(colorStateList, mode);
        invalidateSelf();
        bool1 = true;
      } 
    } 
    if (h1.a()) {
      bool2 = h1.b.h.b(paramArrayOfint);
      h1.k |= bool2;
      if (bool2) {
        invalidateSelf();
        bool1 = bool;
      } 
    } 
    return bool1;
  }
  
  public void scheduleSelf(Runnable paramRunnable, long paramLong) {
    Drawable drawable = this.b;
    if (drawable != null) {
      drawable.scheduleSelf(paramRunnable, paramLong);
      return;
    } 
    super.scheduleSelf(paramRunnable, paramLong);
  }
  
  public void setAlpha(int paramInt) {
    Drawable drawable = this.b;
    if (drawable != null) {
      drawable.setAlpha(paramInt);
      return;
    } 
    if (this.c.b.getRootAlpha() != paramInt) {
      this.c.b.setRootAlpha(paramInt);
      invalidateSelf();
    } 
  }
  
  public void setAutoMirrored(boolean paramBoolean) {
    Drawable drawable = this.b;
    if (drawable != null) {
      drawable.setAutoMirrored(paramBoolean);
      return;
    } 
    this.c.e = paramBoolean;
  }
  
  public void setColorFilter(ColorFilter paramColorFilter) {
    Drawable drawable = this.b;
    if (drawable != null) {
      drawable.setColorFilter(paramColorFilter);
      return;
    } 
    this.e = paramColorFilter;
    invalidateSelf();
  }
  
  public void setTint(int paramInt) {
    Drawable drawable = this.b;
    if (drawable != null) {
      a.a.a.a.a.t0(drawable, paramInt);
      return;
    } 
    setTintList(ColorStateList.valueOf(paramInt));
  }
  
  public void setTintList(ColorStateList paramColorStateList) {
    Drawable drawable = this.b;
    if (drawable != null) {
      a.a.a.a.a.u0(drawable, paramColorStateList);
      return;
    } 
    h h1 = this.c;
    if (h1.c != paramColorStateList) {
      h1.c = paramColorStateList;
      this.d = d(paramColorStateList, h1.d);
      invalidateSelf();
    } 
  }
  
  public void setTintMode(PorterDuff.Mode paramMode) {
    Drawable drawable = this.b;
    if (drawable != null) {
      a.a.a.a.a.v0(drawable, paramMode);
      return;
    } 
    h h1 = this.c;
    if (h1.d != paramMode) {
      h1.d = paramMode;
      this.d = d(h1.c, paramMode);
      invalidateSelf();
    } 
  }
  
  public boolean setVisible(boolean paramBoolean1, boolean paramBoolean2) {
    Drawable drawable = this.b;
    return (drawable != null) ? drawable.setVisible(paramBoolean1, paramBoolean2) : super.setVisible(paramBoolean1, paramBoolean2);
  }
  
  public void unscheduleSelf(Runnable paramRunnable) {
    Drawable drawable = this.b;
    if (drawable != null) {
      drawable.unscheduleSelf(paramRunnable);
      return;
    } 
    super.unscheduleSelf(paramRunnable);
  }
  
  public static class b extends f {
    public b() {}
    
    public b(b param1b) {
      super(param1b);
    }
    
    public boolean c() {
      return true;
    }
  }
  
  public static class c extends f {
    public int[] e;
    
    public b.i.e.b.a f;
    
    public float g = 0.0F;
    
    public b.i.e.b.a h;
    
    public float i = 1.0F;
    
    public float j = 1.0F;
    
    public float k = 0.0F;
    
    public float l = 1.0F;
    
    public float m = 0.0F;
    
    public Paint.Cap n = Paint.Cap.BUTT;
    
    public Paint.Join o = Paint.Join.MITER;
    
    public float p = 4.0F;
    
    public c() {}
    
    public c(c param1c) {
      super(param1c);
      this.e = param1c.e;
      this.f = param1c.f;
      this.g = param1c.g;
      this.i = param1c.i;
      this.h = param1c.h;
      this.c = param1c.c;
      this.j = param1c.j;
      this.k = param1c.k;
      this.l = param1c.l;
      this.m = param1c.m;
      this.n = param1c.n;
      this.o = param1c.o;
      this.p = param1c.p;
    }
    
    public boolean a() {
      return (this.h.c() || this.f.c());
    }
    
    public boolean b(int[] param1ArrayOfint) {
      boolean bool = this.h.d(param1ArrayOfint);
      return this.f.d(param1ArrayOfint) | bool;
    }
    
    public float getFillAlpha() {
      return this.j;
    }
    
    public int getFillColor() {
      return this.h.c;
    }
    
    public float getStrokeAlpha() {
      return this.i;
    }
    
    public int getStrokeColor() {
      return this.f.c;
    }
    
    public float getStrokeWidth() {
      return this.g;
    }
    
    public float getTrimPathEnd() {
      return this.l;
    }
    
    public float getTrimPathOffset() {
      return this.m;
    }
    
    public float getTrimPathStart() {
      return this.k;
    }
    
    public void setFillAlpha(float param1Float) {
      this.j = param1Float;
    }
    
    public void setFillColor(int param1Int) {
      this.h.c = param1Int;
    }
    
    public void setStrokeAlpha(float param1Float) {
      this.i = param1Float;
    }
    
    public void setStrokeColor(int param1Int) {
      this.f.c = param1Int;
    }
    
    public void setStrokeWidth(float param1Float) {
      this.g = param1Float;
    }
    
    public void setTrimPathEnd(float param1Float) {
      this.l = param1Float;
    }
    
    public void setTrimPathOffset(float param1Float) {
      this.m = param1Float;
    }
    
    public void setTrimPathStart(float param1Float) {
      this.k = param1Float;
    }
  }
  
  public static class d extends e {
    public final Matrix a = new Matrix();
    
    public final ArrayList<f.e> b = new ArrayList<f.e>();
    
    public float c = 0.0F;
    
    public float d = 0.0F;
    
    public float e = 0.0F;
    
    public float f = 1.0F;
    
    public float g = 1.0F;
    
    public float h = 0.0F;
    
    public float i = 0.0F;
    
    public final Matrix j = new Matrix();
    
    public int k;
    
    public int[] l;
    
    public String m = null;
    
    public d() {
      super(null);
    }
    
    public d(d param1d, b.f.a<String, Object> param1a) {
      super(null);
      this.c = param1d.c;
      this.d = param1d.d;
      this.e = param1d.e;
      this.f = param1d.f;
      this.g = param1d.g;
      this.h = param1d.h;
      this.i = param1d.i;
      this.l = param1d.l;
      String str = param1d.m;
      this.m = str;
      this.k = param1d.k;
      if (str != null)
        param1a.put(str, this); 
      this.j.set(param1d.j);
      ArrayList<f.e> arrayList = param1d.b;
      for (byte b = 0; b < arrayList.size(); b++) {
        param1d = (d)arrayList.get(b);
        if (param1d instanceof d) {
          param1d = param1d;
          this.b.add(new d(param1d, param1a));
        } else {
          f.c c;
          f.b b1;
          if (param1d instanceof f.c) {
            c = new f.c((f.c)param1d);
          } else if (c instanceof f.b) {
            b1 = new f.b((f.b)c);
          } else {
            throw new IllegalStateException("Unknown object in the tree!");
          } 
          this.b.add(b1);
          String str1 = b1.b;
          if (str1 != null)
            param1a.put(str1, b1); 
        } 
      } 
    }
    
    public boolean a() {
      for (byte b = 0; b < this.b.size(); b++) {
        if (((f.e)this.b.get(b)).a())
          return true; 
      } 
      return false;
    }
    
    public boolean b(int[] param1ArrayOfint) {
      byte b = 0;
      boolean bool = false;
      while (b < this.b.size()) {
        bool |= ((f.e)this.b.get(b)).b(param1ArrayOfint);
        b++;
      } 
      return bool;
    }
    
    public final void c() {
      this.j.reset();
      this.j.postTranslate(-this.d, -this.e);
      this.j.postScale(this.f, this.g);
      this.j.postRotate(this.c, 0.0F, 0.0F);
      this.j.postTranslate(this.h + this.d, this.i + this.e);
    }
    
    public String getGroupName() {
      return this.m;
    }
    
    public Matrix getLocalMatrix() {
      return this.j;
    }
    
    public float getPivotX() {
      return this.d;
    }
    
    public float getPivotY() {
      return this.e;
    }
    
    public float getRotation() {
      return this.c;
    }
    
    public float getScaleX() {
      return this.f;
    }
    
    public float getScaleY() {
      return this.g;
    }
    
    public float getTranslateX() {
      return this.h;
    }
    
    public float getTranslateY() {
      return this.i;
    }
    
    public void setPivotX(float param1Float) {
      if (param1Float != this.d) {
        this.d = param1Float;
        c();
      } 
    }
    
    public void setPivotY(float param1Float) {
      if (param1Float != this.e) {
        this.e = param1Float;
        c();
      } 
    }
    
    public void setRotation(float param1Float) {
      if (param1Float != this.c) {
        this.c = param1Float;
        c();
      } 
    }
    
    public void setScaleX(float param1Float) {
      if (param1Float != this.f) {
        this.f = param1Float;
        c();
      } 
    }
    
    public void setScaleY(float param1Float) {
      if (param1Float != this.g) {
        this.g = param1Float;
        c();
      } 
    }
    
    public void setTranslateX(float param1Float) {
      if (param1Float != this.h) {
        this.h = param1Float;
        c();
      } 
    }
    
    public void setTranslateY(float param1Float) {
      if (param1Float != this.i) {
        this.i = param1Float;
        c();
      } 
    }
  }
  
  public static abstract class e {
    public e() {}
    
    public e(f.a param1a) {}
    
    public boolean a() {
      return false;
    }
    
    public boolean b(int[] param1ArrayOfint) {
      return false;
    }
  }
  
  public static abstract class f extends e {
    public b.i.f.c[] a = null;
    
    public String b;
    
    public int c = 0;
    
    public int d;
    
    public f() {
      super(null);
    }
    
    public f(f param1f) {
      super(null);
      this.b = param1f.b;
      this.d = param1f.d;
      this.a = a.a.a.a.a.x(param1f.a);
    }
    
    public boolean c() {
      return false;
    }
    
    public b.i.f.c[] getPathData() {
      return this.a;
    }
    
    public String getPathName() {
      return this.b;
    }
    
    public void setPathData(b.i.f.c[] param1ArrayOfc) {
      if (!a.a.a.a.a.e(this.a, param1ArrayOfc)) {
        this.a = a.a.a.a.a.x(param1ArrayOfc);
      } else {
        b.i.f.c[] arrayOfC = this.a;
        for (byte b = 0; b < param1ArrayOfc.length; b++) {
          (arrayOfC[b]).a = (param1ArrayOfc[b]).a;
          for (byte b1 = 0; b1 < (param1ArrayOfc[b]).b.length; b1++)
            (arrayOfC[b]).b[b1] = (param1ArrayOfc[b]).b[b1]; 
        } 
      } 
    }
  }
  
  public static class g {
    public static final Matrix q = new Matrix();
    
    public final Path a;
    
    public final Path b;
    
    public final Matrix c = new Matrix();
    
    public Paint d;
    
    public Paint e;
    
    public PathMeasure f;
    
    public int g;
    
    public final f.d h;
    
    public float i = 0.0F;
    
    public float j = 0.0F;
    
    public float k = 0.0F;
    
    public float l = 0.0F;
    
    public int m = 255;
    
    public String n = null;
    
    public Boolean o = null;
    
    public final b.f.a<String, Object> p;
    
    public g() {
      this.p = new b.f.a();
      this.h = new f.d();
      this.a = new Path();
      this.b = new Path();
    }
    
    public g(g param1g) {
      b.f.a<String, Object> a1 = new b.f.a();
      this.p = a1;
      this.h = new f.d(param1g.h, a1);
      this.a = new Path(param1g.a);
      this.b = new Path(param1g.b);
      this.i = param1g.i;
      this.j = param1g.j;
      this.k = param1g.k;
      this.l = param1g.l;
      this.g = param1g.g;
      this.m = param1g.m;
      this.n = param1g.n;
      String str = param1g.n;
      if (str != null)
        this.p.put(str, this); 
      this.o = param1g.o;
    }
    
    public final void a(f.d param1d, Matrix param1Matrix, Canvas param1Canvas, int param1Int1, int param1Int2, ColorFilter param1ColorFilter) {
      g g2 = this;
      param1d.a.set(param1Matrix);
      param1d.a.preConcat(param1d.j);
      param1Canvas.save();
      byte b = 0;
      g g1 = g2;
      while (b < param1d.b.size()) {
        f.e e = param1d.b.get(b);
        if (e instanceof f.d) {
          a((f.d)e, param1d.a, param1Canvas, param1Int1, param1Int2, param1ColorFilter);
        } else if (e instanceof f.f) {
          f.f f = (f.f)e;
          float f1 = param1Int1 / g1.k;
          float f3 = param1Int2 / g1.l;
          float f2 = Math.min(f1, f3);
          Matrix matrix = param1d.a;
          g1.c.set(matrix);
          g1.c.postScale(f1, f3);
          float[] arrayOfFloat = new float[4];
          arrayOfFloat[0] = 0.0F;
          arrayOfFloat[1] = 1.0F;
          arrayOfFloat[2] = 1.0F;
          arrayOfFloat[3] = 0.0F;
          matrix.mapVectors(arrayOfFloat);
          float f7 = (float)Math.hypot(arrayOfFloat[0], arrayOfFloat[1]);
          float f6 = (float)Math.hypot(arrayOfFloat[2], arrayOfFloat[3]);
          float f5 = arrayOfFloat[0];
          f1 = arrayOfFloat[1];
          f3 = arrayOfFloat[2];
          float f4 = arrayOfFloat[3];
          f6 = Math.max(f7, f6);
          if (f6 > 0.0F) {
            f1 = Math.abs(f5 * f4 - f1 * f3) / f6;
          } else {
            f1 = 0.0F;
          } 
          if (f1 == 0.0F) {
            g g3 = this;
          } else {
            g g3 = this;
            Path path = g3.a;
            if (f != null) {
              path.reset();
              b.i.f.c[] arrayOfC = f.a;
              if (arrayOfC != null)
                b.i.f.c.b(arrayOfC, path); 
              Path path1 = g3.a;
              g3.b.reset();
              if (f.c()) {
                Path.FillType fillType;
                Path path2 = g3.b;
                if (f.c == 0) {
                  fillType = Path.FillType.WINDING;
                } else {
                  fillType = Path.FillType.EVEN_ODD;
                } 
                path2.setFillType(fillType);
                g3.b.addPath(path1, g3.c);
                param1Canvas.clipPath(g3.b);
                g g4 = g3;
              } else {
                boolean bool;
                f = f;
                if (((f.c)f).k != 0.0F || ((f.c)f).l != 1.0F) {
                  f6 = ((f.c)f).k;
                  f5 = ((f.c)f).m;
                  f4 = ((f.c)f).l;
                  if (g3.f == null)
                    g3.f = new PathMeasure(); 
                  g3.f.setPath(g3.a, false);
                  f3 = g3.f.getLength();
                  f6 = (f6 + f5) % 1.0F * f3;
                  f4 = (f4 + f5) % 1.0F * f3;
                  path1.reset();
                  if (f6 > f4) {
                    g3.f.getSegment(f6, f3, path1, true);
                    g3.f.getSegment(0.0F, f4, path1, true);
                  } else {
                    g3.f.getSegment(f6, f4, path1, true);
                  } 
                  path1.rLineTo(0.0F, 0.0F);
                } 
                g3.b.addPath(path1, g3.c);
                b.i.e.b.a a1 = ((f.c)f).h;
                if (a1.b() || a1.c != 0) {
                  bool = true;
                } else {
                  bool = false;
                } 
                if (bool) {
                  Shader shader;
                  Path.FillType fillType;
                  a1 = ((f.c)f).h;
                  if (g3.e == null) {
                    Paint paint1 = new Paint(1);
                    g3.e = paint1;
                    paint1.setStyle(Paint.Style.FILL);
                  } 
                  Paint paint = g3.e;
                  if (a1.b()) {
                    shader = a1.a;
                    shader.setLocalMatrix(g3.c);
                    paint.setShader(shader);
                    paint.setAlpha(Math.round(((f.c)f).j * 255.0F));
                  } else {
                    paint.setShader(null);
                    paint.setAlpha(255);
                    paint.setColor(f.a(((b.i.e.b.a)shader).c, ((f.c)f).j));
                  } 
                  paint.setColorFilter(param1ColorFilter);
                  Path path2 = g3.b;
                  if (f.c == 0) {
                    fillType = Path.FillType.WINDING;
                  } else {
                    fillType = Path.FillType.EVEN_ODD;
                  } 
                  path2.setFillType(fillType);
                  param1Canvas.drawPath(g3.b, paint);
                } 
                a1 = ((f.c)f).f;
                if (a1.b() || a1.c != 0) {
                  bool = true;
                } else {
                  bool = false;
                } 
                g g4 = g3;
                if (bool) {
                  Shader shader;
                  b.i.e.b.a a2 = ((f.c)f).f;
                  if (g3.d == null) {
                    Paint paint1 = new Paint(1);
                    g3.d = paint1;
                    paint1.setStyle(Paint.Style.STROKE);
                  } 
                  Paint paint = g3.d;
                  Paint.Join join = ((f.c)f).o;
                  if (join != null)
                    paint.setStrokeJoin(join); 
                  Paint.Cap cap = ((f.c)f).n;
                  if (cap != null)
                    paint.setStrokeCap(cap); 
                  paint.setStrokeMiter(((f.c)f).p);
                  if (a2.b()) {
                    shader = a2.a;
                    shader.setLocalMatrix(g3.c);
                    paint.setShader(shader);
                    paint.setAlpha(Math.round(((f.c)f).i * 255.0F));
                  } else {
                    paint.setShader(null);
                    paint.setAlpha(255);
                    paint.setColor(f.a(((b.i.e.b.a)shader).c, ((f.c)f).i));
                  } 
                  paint.setColorFilter(param1ColorFilter);
                  paint.setStrokeWidth(((f.c)f).g * f1 * f2);
                  param1Canvas.drawPath(g3.b, paint);
                  g g5 = g3;
                } 
              } 
            } else {
              throw null;
            } 
          } 
        } 
        b++;
      } 
      param1Canvas.restore();
    }
    
    public float getAlpha() {
      return getRootAlpha() / 255.0F;
    }
    
    public int getRootAlpha() {
      return this.m;
    }
    
    public void setAlpha(float param1Float) {
      setRootAlpha((int)(param1Float * 255.0F));
    }
    
    public void setRootAlpha(int param1Int) {
      this.m = param1Int;
    }
  }
  
  public static class h extends Drawable.ConstantState {
    public int a;
    
    public f.g b;
    
    public ColorStateList c = null;
    
    public PorterDuff.Mode d = f.k;
    
    public boolean e;
    
    public Bitmap f;
    
    public ColorStateList g;
    
    public PorterDuff.Mode h;
    
    public int i;
    
    public boolean j;
    
    public boolean k;
    
    public Paint l;
    
    public h() {
      this.b = new f.g();
    }
    
    public h(h param1h) {
      if (param1h != null) {
        this.a = param1h.a;
        f.g g1 = new f.g(param1h.b);
        this.b = g1;
        if (param1h.b.e != null)
          g1.e = new Paint(param1h.b.e); 
        if (param1h.b.d != null)
          this.b.d = new Paint(param1h.b.d); 
        this.c = param1h.c;
        this.d = param1h.d;
        this.e = param1h.e;
      } 
    }
    
    public boolean a() {
      f.g g1 = this.b;
      if (g1.o == null)
        g1.o = Boolean.valueOf(g1.h.a()); 
      return g1.o.booleanValue();
    }
    
    public void b(int param1Int1, int param1Int2) {
      this.f.eraseColor(0);
      Canvas canvas = new Canvas(this.f);
      f.g g1 = this.b;
      g1.a(g1.h, f.g.q, canvas, param1Int1, param1Int2, null);
    }
    
    public int getChangingConfigurations() {
      return this.a;
    }
    
    public Drawable newDrawable() {
      return new f(this);
    }
    
    public Drawable newDrawable(Resources param1Resources) {
      return new f(this);
    }
  }
  
  public static class i extends Drawable.ConstantState {
    public final Drawable.ConstantState a;
    
    public i(Drawable.ConstantState param1ConstantState) {
      this.a = param1ConstantState;
    }
    
    public boolean canApplyTheme() {
      return this.a.canApplyTheme();
    }
    
    public int getChangingConfigurations() {
      return this.a.getChangingConfigurations();
    }
    
    public Drawable newDrawable() {
      f f = new f();
      f.b = this.a.newDrawable();
      return f;
    }
    
    public Drawable newDrawable(Resources param1Resources) {
      f f = new f();
      f.b = this.a.newDrawable(param1Resources);
      return f;
    }
    
    public Drawable newDrawable(Resources param1Resources, Resources.Theme param1Theme) {
      f f = new f();
      f.b = this.a.newDrawable(param1Resources, param1Theme);
      return f;
    }
  }
}


/* Location:              C:\Users\panch\Downloads\dvba_v1.1.0-dex2jar.jar!\\\u\a\a\f.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */