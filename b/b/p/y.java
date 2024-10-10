package b.b.p;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.util.TypedValue;
import android.widget.TextView;
import b.b.j;
import b.i.e.b.g;
import java.lang.ref.WeakReference;
import java.util.Arrays;

public class y {
  public final TextView a;
  
  public v0 b;
  
  public v0 c;
  
  public v0 d;
  
  public v0 e;
  
  public v0 f;
  
  public v0 g;
  
  public v0 h;
  
  public final a0 i;
  
  public int j = 0;
  
  public int k = -1;
  
  public Typeface l;
  
  public boolean m;
  
  public y(TextView paramTextView) {
    this.a = paramTextView;
    this.i = new a0(this.a);
  }
  
  public static v0 c(Context paramContext, j paramj, int paramInt) {
    ColorStateList colorStateList = paramj.d(paramContext, paramInt);
    if (colorStateList != null) {
      v0 v01 = new v0();
      v01.d = true;
      v01.a = colorStateList;
      return v01;
    } 
    return null;
  }
  
  public final void a(Drawable paramDrawable, v0 paramv0) {
    if (paramDrawable != null && paramv0 != null)
      j.f(paramDrawable, paramv0, this.a.getDrawableState()); 
  }
  
  public void b() {
    if (this.b != null || this.c != null || this.d != null || this.e != null) {
      Drawable[] arrayOfDrawable = this.a.getCompoundDrawables();
      a(arrayOfDrawable[0], this.b);
      a(arrayOfDrawable[1], this.c);
      a(arrayOfDrawable[2], this.d);
      a(arrayOfDrawable[3], this.e);
    } 
    if (this.f != null || this.g != null) {
      Drawable[] arrayOfDrawable = this.a.getCompoundDrawablesRelative();
      a(arrayOfDrawable[0], this.f);
      a(arrayOfDrawable[2], this.g);
    } 
  }
  
  public boolean d() {
    boolean bool;
    a0 a01 = this.i;
    if (a01.i() && a01.a != 0) {
      bool = true;
    } else {
      bool = false;
    } 
    return bool;
  }
  
  @SuppressLint({"NewApi"})
  public void e(AttributeSet paramAttributeSet, int paramInt) {
    // Byte code:
    //   0: aload_0
    //   1: getfield a : Landroid/widget/TextView;
    //   4: invokevirtual getContext : ()Landroid/content/Context;
    //   7: astore #20
    //   9: invokestatic a : ()Lb/b/p/j;
    //   12: astore #21
    //   14: aload #20
    //   16: aload_1
    //   17: getstatic b/b/j.AppCompatTextHelper : [I
    //   20: iload_2
    //   21: iconst_0
    //   22: invokestatic q : (Landroid/content/Context;Landroid/util/AttributeSet;[III)Lb/b/p/x0;
    //   25: astore #12
    //   27: aload_0
    //   28: getfield a : Landroid/widget/TextView;
    //   31: astore #13
    //   33: aload #13
    //   35: aload #13
    //   37: invokevirtual getContext : ()Landroid/content/Context;
    //   40: getstatic b/b/j.AppCompatTextHelper : [I
    //   43: aload_1
    //   44: aload #12
    //   46: getfield b : Landroid/content/res/TypedArray;
    //   49: iload_2
    //   50: iconst_0
    //   51: invokestatic V : (Landroid/view/View;Landroid/content/Context;[ILandroid/util/AttributeSet;Landroid/content/res/TypedArray;II)V
    //   54: aload #12
    //   56: getstatic b/b/j.AppCompatTextHelper_android_textAppearance : I
    //   59: iconst_m1
    //   60: invokevirtual l : (II)I
    //   63: istore #7
    //   65: aload #12
    //   67: getstatic b/b/j.AppCompatTextHelper_android_drawableLeft : I
    //   70: invokevirtual o : (I)Z
    //   73: ifeq -> 96
    //   76: aload_0
    //   77: aload #20
    //   79: aload #21
    //   81: aload #12
    //   83: getstatic b/b/j.AppCompatTextHelper_android_drawableLeft : I
    //   86: iconst_0
    //   87: invokevirtual l : (II)I
    //   90: invokestatic c : (Landroid/content/Context;Lb/b/p/j;I)Lb/b/p/v0;
    //   93: putfield b : Lb/b/p/v0;
    //   96: aload #12
    //   98: getstatic b/b/j.AppCompatTextHelper_android_drawableTop : I
    //   101: invokevirtual o : (I)Z
    //   104: ifeq -> 127
    //   107: aload_0
    //   108: aload #20
    //   110: aload #21
    //   112: aload #12
    //   114: getstatic b/b/j.AppCompatTextHelper_android_drawableTop : I
    //   117: iconst_0
    //   118: invokevirtual l : (II)I
    //   121: invokestatic c : (Landroid/content/Context;Lb/b/p/j;I)Lb/b/p/v0;
    //   124: putfield c : Lb/b/p/v0;
    //   127: aload #12
    //   129: getstatic b/b/j.AppCompatTextHelper_android_drawableRight : I
    //   132: invokevirtual o : (I)Z
    //   135: ifeq -> 158
    //   138: aload_0
    //   139: aload #20
    //   141: aload #21
    //   143: aload #12
    //   145: getstatic b/b/j.AppCompatTextHelper_android_drawableRight : I
    //   148: iconst_0
    //   149: invokevirtual l : (II)I
    //   152: invokestatic c : (Landroid/content/Context;Lb/b/p/j;I)Lb/b/p/v0;
    //   155: putfield d : Lb/b/p/v0;
    //   158: aload #12
    //   160: getstatic b/b/j.AppCompatTextHelper_android_drawableBottom : I
    //   163: invokevirtual o : (I)Z
    //   166: ifeq -> 189
    //   169: aload_0
    //   170: aload #20
    //   172: aload #21
    //   174: aload #12
    //   176: getstatic b/b/j.AppCompatTextHelper_android_drawableBottom : I
    //   179: iconst_0
    //   180: invokevirtual l : (II)I
    //   183: invokestatic c : (Landroid/content/Context;Lb/b/p/j;I)Lb/b/p/v0;
    //   186: putfield e : Lb/b/p/v0;
    //   189: aload #12
    //   191: getstatic b/b/j.AppCompatTextHelper_android_drawableStart : I
    //   194: invokevirtual o : (I)Z
    //   197: ifeq -> 220
    //   200: aload_0
    //   201: aload #20
    //   203: aload #21
    //   205: aload #12
    //   207: getstatic b/b/j.AppCompatTextHelper_android_drawableStart : I
    //   210: iconst_0
    //   211: invokevirtual l : (II)I
    //   214: invokestatic c : (Landroid/content/Context;Lb/b/p/j;I)Lb/b/p/v0;
    //   217: putfield f : Lb/b/p/v0;
    //   220: aload #12
    //   222: getstatic b/b/j.AppCompatTextHelper_android_drawableEnd : I
    //   225: invokevirtual o : (I)Z
    //   228: ifeq -> 251
    //   231: aload_0
    //   232: aload #20
    //   234: aload #21
    //   236: aload #12
    //   238: getstatic b/b/j.AppCompatTextHelper_android_drawableEnd : I
    //   241: iconst_0
    //   242: invokevirtual l : (II)I
    //   245: invokestatic c : (Landroid/content/Context;Lb/b/p/j;I)Lb/b/p/v0;
    //   248: putfield g : Lb/b/p/v0;
    //   251: aload #12
    //   253: getfield b : Landroid/content/res/TypedArray;
    //   256: invokevirtual recycle : ()V
    //   259: aload_0
    //   260: getfield a : Landroid/widget/TextView;
    //   263: invokevirtual getTransformationMethod : ()Landroid/text/method/TransformationMethod;
    //   266: instanceof android/text/method/PasswordTransformationMethod
    //   269: istore #11
    //   271: iload #7
    //   273: iconst_m1
    //   274: if_icmpeq -> 527
    //   277: new b/b/p/x0
    //   280: dup
    //   281: aload #20
    //   283: aload #20
    //   285: iload #7
    //   287: getstatic b/b/j.TextAppearance : [I
    //   290: invokevirtual obtainStyledAttributes : (I[I)Landroid/content/res/TypedArray;
    //   293: invokespecial <init> : (Landroid/content/Context;Landroid/content/res/TypedArray;)V
    //   296: astore #16
    //   298: iload #11
    //   300: ifne -> 331
    //   303: aload #16
    //   305: getstatic b/b/j.TextAppearance_textAllCaps : I
    //   308: invokevirtual o : (I)Z
    //   311: ifeq -> 331
    //   314: aload #16
    //   316: getstatic b/b/j.TextAppearance_textAllCaps : I
    //   319: iconst_0
    //   320: invokevirtual a : (IZ)Z
    //   323: istore #9
    //   325: iconst_1
    //   326: istore #7
    //   328: goto -> 337
    //   331: iconst_0
    //   332: istore #9
    //   334: iconst_0
    //   335: istore #7
    //   337: aload_0
    //   338: aload #20
    //   340: aload #16
    //   342: invokevirtual l : (Landroid/content/Context;Lb/b/p/x0;)V
    //   345: getstatic android/os/Build$VERSION.SDK_INT : I
    //   348: bipush #23
    //   350: if_icmpge -> 437
    //   353: aload #16
    //   355: getstatic b/b/j.TextAppearance_android_textColor : I
    //   358: invokevirtual o : (I)Z
    //   361: ifeq -> 377
    //   364: aload #16
    //   366: getstatic b/b/j.TextAppearance_android_textColor : I
    //   369: invokevirtual c : (I)Landroid/content/res/ColorStateList;
    //   372: astore #13
    //   374: goto -> 380
    //   377: aconst_null
    //   378: astore #13
    //   380: aload #16
    //   382: getstatic b/b/j.TextAppearance_android_textColorHint : I
    //   385: invokevirtual o : (I)Z
    //   388: ifeq -> 404
    //   391: aload #16
    //   393: getstatic b/b/j.TextAppearance_android_textColorHint : I
    //   396: invokevirtual c : (I)Landroid/content/res/ColorStateList;
    //   399: astore #17
    //   401: goto -> 407
    //   404: aconst_null
    //   405: astore #17
    //   407: aload #16
    //   409: getstatic b/b/j.TextAppearance_android_textColorLink : I
    //   412: invokevirtual o : (I)Z
    //   415: ifeq -> 431
    //   418: aload #16
    //   420: getstatic b/b/j.TextAppearance_android_textColorLink : I
    //   423: invokevirtual c : (I)Landroid/content/res/ColorStateList;
    //   426: astore #12
    //   428: goto -> 446
    //   431: aconst_null
    //   432: astore #12
    //   434: goto -> 446
    //   437: aconst_null
    //   438: astore #13
    //   440: aconst_null
    //   441: astore #12
    //   443: aconst_null
    //   444: astore #17
    //   446: aload #16
    //   448: getstatic b/b/j.TextAppearance_textLocale : I
    //   451: invokevirtual o : (I)Z
    //   454: ifeq -> 470
    //   457: aload #16
    //   459: getstatic b/b/j.TextAppearance_textLocale : I
    //   462: invokevirtual m : (I)Ljava/lang/String;
    //   465: astore #15
    //   467: goto -> 473
    //   470: aconst_null
    //   471: astore #15
    //   473: getstatic android/os/Build$VERSION.SDK_INT : I
    //   476: bipush #26
    //   478: if_icmplt -> 505
    //   481: aload #16
    //   483: getstatic b/b/j.TextAppearance_fontVariationSettings : I
    //   486: invokevirtual o : (I)Z
    //   489: ifeq -> 505
    //   492: aload #16
    //   494: getstatic b/b/j.TextAppearance_fontVariationSettings : I
    //   497: invokevirtual m : (I)Ljava/lang/String;
    //   500: astore #14
    //   502: goto -> 508
    //   505: aconst_null
    //   506: astore #14
    //   508: aload #16
    //   510: getfield b : Landroid/content/res/TypedArray;
    //   513: invokevirtual recycle : ()V
    //   516: aload #12
    //   518: astore #16
    //   520: aload #17
    //   522: astore #12
    //   524: goto -> 548
    //   527: iconst_0
    //   528: istore #9
    //   530: aconst_null
    //   531: astore #14
    //   533: iconst_0
    //   534: istore #7
    //   536: aconst_null
    //   537: astore #13
    //   539: aconst_null
    //   540: astore #16
    //   542: aconst_null
    //   543: astore #15
    //   545: aconst_null
    //   546: astore #12
    //   548: new b/b/p/x0
    //   551: dup
    //   552: aload #20
    //   554: aload #20
    //   556: aload_1
    //   557: getstatic b/b/j.TextAppearance : [I
    //   560: iload_2
    //   561: iconst_0
    //   562: invokevirtual obtainStyledAttributes : (Landroid/util/AttributeSet;[III)Landroid/content/res/TypedArray;
    //   565: invokespecial <init> : (Landroid/content/Context;Landroid/content/res/TypedArray;)V
    //   568: astore #22
    //   570: iload #9
    //   572: istore #10
    //   574: iload #7
    //   576: istore #8
    //   578: iload #11
    //   580: ifne -> 616
    //   583: iload #9
    //   585: istore #10
    //   587: iload #7
    //   589: istore #8
    //   591: aload #22
    //   593: getstatic b/b/j.TextAppearance_textAllCaps : I
    //   596: invokevirtual o : (I)Z
    //   599: ifeq -> 616
    //   602: aload #22
    //   604: getstatic b/b/j.TextAppearance_textAllCaps : I
    //   607: iconst_0
    //   608: invokevirtual a : (IZ)Z
    //   611: istore #10
    //   613: iconst_1
    //   614: istore #8
    //   616: aload #13
    //   618: astore #18
    //   620: aload #16
    //   622: astore #19
    //   624: aload #12
    //   626: astore #17
    //   628: getstatic android/os/Build$VERSION.SDK_INT : I
    //   631: bipush #23
    //   633: if_icmpge -> 719
    //   636: aload #22
    //   638: getstatic b/b/j.TextAppearance_android_textColor : I
    //   641: invokevirtual o : (I)Z
    //   644: ifeq -> 657
    //   647: aload #22
    //   649: getstatic b/b/j.TextAppearance_android_textColor : I
    //   652: invokevirtual c : (I)Landroid/content/res/ColorStateList;
    //   655: astore #13
    //   657: aload #22
    //   659: getstatic b/b/j.TextAppearance_android_textColorHint : I
    //   662: invokevirtual o : (I)Z
    //   665: ifeq -> 678
    //   668: aload #22
    //   670: getstatic b/b/j.TextAppearance_android_textColorHint : I
    //   673: invokevirtual c : (I)Landroid/content/res/ColorStateList;
    //   676: astore #12
    //   678: aload #13
    //   680: astore #18
    //   682: aload #16
    //   684: astore #19
    //   686: aload #12
    //   688: astore #17
    //   690: aload #22
    //   692: getstatic b/b/j.TextAppearance_android_textColorLink : I
    //   695: invokevirtual o : (I)Z
    //   698: ifeq -> 719
    //   701: aload #22
    //   703: getstatic b/b/j.TextAppearance_android_textColorLink : I
    //   706: invokevirtual c : (I)Landroid/content/res/ColorStateList;
    //   709: astore #19
    //   711: aload #12
    //   713: astore #17
    //   715: aload #13
    //   717: astore #18
    //   719: aload #22
    //   721: getstatic b/b/j.TextAppearance_textLocale : I
    //   724: invokevirtual o : (I)Z
    //   727: ifeq -> 740
    //   730: aload #22
    //   732: getstatic b/b/j.TextAppearance_textLocale : I
    //   735: invokevirtual m : (I)Ljava/lang/String;
    //   738: astore #15
    //   740: aload #14
    //   742: astore #12
    //   744: getstatic android/os/Build$VERSION.SDK_INT : I
    //   747: bipush #26
    //   749: if_icmplt -> 777
    //   752: aload #14
    //   754: astore #12
    //   756: aload #22
    //   758: getstatic b/b/j.TextAppearance_fontVariationSettings : I
    //   761: invokevirtual o : (I)Z
    //   764: ifeq -> 777
    //   767: aload #22
    //   769: getstatic b/b/j.TextAppearance_fontVariationSettings : I
    //   772: invokevirtual m : (I)Ljava/lang/String;
    //   775: astore #12
    //   777: getstatic android/os/Build$VERSION.SDK_INT : I
    //   780: bipush #28
    //   782: if_icmplt -> 820
    //   785: aload #22
    //   787: getstatic b/b/j.TextAppearance_android_textSize : I
    //   790: invokevirtual o : (I)Z
    //   793: ifeq -> 820
    //   796: aload #22
    //   798: getstatic b/b/j.TextAppearance_android_textSize : I
    //   801: iconst_m1
    //   802: invokevirtual f : (II)I
    //   805: ifne -> 820
    //   808: aload_0
    //   809: getfield a : Landroid/widget/TextView;
    //   812: iconst_0
    //   813: fconst_0
    //   814: invokevirtual setTextSize : (IF)V
    //   817: goto -> 820
    //   820: aload_0
    //   821: aload #20
    //   823: aload #22
    //   825: invokevirtual l : (Landroid/content/Context;Lb/b/p/x0;)V
    //   828: aload #22
    //   830: getfield b : Landroid/content/res/TypedArray;
    //   833: invokevirtual recycle : ()V
    //   836: aload #18
    //   838: ifnull -> 850
    //   841: aload_0
    //   842: getfield a : Landroid/widget/TextView;
    //   845: aload #18
    //   847: invokevirtual setTextColor : (Landroid/content/res/ColorStateList;)V
    //   850: aload #17
    //   852: ifnull -> 864
    //   855: aload_0
    //   856: getfield a : Landroid/widget/TextView;
    //   859: aload #17
    //   861: invokevirtual setHintTextColor : (Landroid/content/res/ColorStateList;)V
    //   864: aload #19
    //   866: ifnull -> 878
    //   869: aload_0
    //   870: getfield a : Landroid/widget/TextView;
    //   873: aload #19
    //   875: invokevirtual setLinkTextColor : (Landroid/content/res/ColorStateList;)V
    //   878: iload #11
    //   880: ifne -> 897
    //   883: iload #8
    //   885: ifeq -> 897
    //   888: aload_0
    //   889: getfield a : Landroid/widget/TextView;
    //   892: iload #10
    //   894: invokevirtual setAllCaps : (Z)V
    //   897: aload_0
    //   898: getfield l : Landroid/graphics/Typeface;
    //   901: astore #13
    //   903: aload #13
    //   905: ifnull -> 941
    //   908: aload_0
    //   909: getfield k : I
    //   912: iconst_m1
    //   913: if_icmpne -> 932
    //   916: aload_0
    //   917: getfield a : Landroid/widget/TextView;
    //   920: aload #13
    //   922: aload_0
    //   923: getfield j : I
    //   926: invokevirtual setTypeface : (Landroid/graphics/Typeface;I)V
    //   929: goto -> 941
    //   932: aload_0
    //   933: getfield a : Landroid/widget/TextView;
    //   936: aload #13
    //   938: invokevirtual setTypeface : (Landroid/graphics/Typeface;)V
    //   941: aload #12
    //   943: ifnull -> 956
    //   946: aload_0
    //   947: getfield a : Landroid/widget/TextView;
    //   950: aload #12
    //   952: invokevirtual setFontVariationSettings : (Ljava/lang/String;)Z
    //   955: pop
    //   956: aload #15
    //   958: ifnull -> 1014
    //   961: getstatic android/os/Build$VERSION.SDK_INT : I
    //   964: bipush #24
    //   966: if_icmplt -> 984
    //   969: aload_0
    //   970: getfield a : Landroid/widget/TextView;
    //   973: aload #15
    //   975: invokestatic forLanguageTags : (Ljava/lang/String;)Landroid/os/LocaleList;
    //   978: invokevirtual setTextLocales : (Landroid/os/LocaleList;)V
    //   981: goto -> 1014
    //   984: aload #15
    //   986: iconst_0
    //   987: aload #15
    //   989: bipush #44
    //   991: invokevirtual indexOf : (I)I
    //   994: invokevirtual substring : (II)Ljava/lang/String;
    //   997: astore #12
    //   999: aload_0
    //   1000: getfield a : Landroid/widget/TextView;
    //   1003: aload #12
    //   1005: invokestatic forLanguageTag : (Ljava/lang/String;)Ljava/util/Locale;
    //   1008: invokevirtual setTextLocale : (Ljava/util/Locale;)V
    //   1011: goto -> 1014
    //   1014: aload_0
    //   1015: getfield i : Lb/b/p/a0;
    //   1018: astore #12
    //   1020: aload #12
    //   1022: getfield j : Landroid/content/Context;
    //   1025: aload_1
    //   1026: getstatic b/b/j.AppCompatTextView : [I
    //   1029: iload_2
    //   1030: iconst_0
    //   1031: invokevirtual obtainStyledAttributes : (Landroid/util/AttributeSet;[III)Landroid/content/res/TypedArray;
    //   1034: astore #13
    //   1036: aload #12
    //   1038: getfield i : Landroid/widget/TextView;
    //   1041: astore #14
    //   1043: aload #14
    //   1045: aload #14
    //   1047: invokevirtual getContext : ()Landroid/content/Context;
    //   1050: getstatic b/b/j.AppCompatTextView : [I
    //   1053: aload_1
    //   1054: aload #13
    //   1056: iload_2
    //   1057: iconst_0
    //   1058: invokestatic V : (Landroid/view/View;Landroid/content/Context;[ILandroid/util/AttributeSet;Landroid/content/res/TypedArray;II)V
    //   1061: aload #13
    //   1063: getstatic b/b/j.AppCompatTextView_autoSizeTextType : I
    //   1066: invokevirtual hasValue : (I)Z
    //   1069: ifeq -> 1086
    //   1072: aload #12
    //   1074: aload #13
    //   1076: getstatic b/b/j.AppCompatTextView_autoSizeTextType : I
    //   1079: iconst_0
    //   1080: invokevirtual getInt : (II)I
    //   1083: putfield a : I
    //   1086: aload #13
    //   1088: getstatic b/b/j.AppCompatTextView_autoSizeStepGranularity : I
    //   1091: invokevirtual hasValue : (I)Z
    //   1094: ifeq -> 1112
    //   1097: aload #13
    //   1099: getstatic b/b/j.AppCompatTextView_autoSizeStepGranularity : I
    //   1102: ldc_w -1.0
    //   1105: invokevirtual getDimension : (IF)F
    //   1108: fstore_3
    //   1109: goto -> 1116
    //   1112: ldc_w -1.0
    //   1115: fstore_3
    //   1116: aload #13
    //   1118: getstatic b/b/j.AppCompatTextView_autoSizeMinTextSize : I
    //   1121: invokevirtual hasValue : (I)Z
    //   1124: ifeq -> 1143
    //   1127: aload #13
    //   1129: getstatic b/b/j.AppCompatTextView_autoSizeMinTextSize : I
    //   1132: ldc_w -1.0
    //   1135: invokevirtual getDimension : (IF)F
    //   1138: fstore #4
    //   1140: goto -> 1148
    //   1143: ldc_w -1.0
    //   1146: fstore #4
    //   1148: aload #13
    //   1150: getstatic b/b/j.AppCompatTextView_autoSizeMaxTextSize : I
    //   1153: invokevirtual hasValue : (I)Z
    //   1156: ifeq -> 1175
    //   1159: aload #13
    //   1161: getstatic b/b/j.AppCompatTextView_autoSizeMaxTextSize : I
    //   1164: ldc_w -1.0
    //   1167: invokevirtual getDimension : (IF)F
    //   1170: fstore #5
    //   1172: goto -> 1180
    //   1175: ldc_w -1.0
    //   1178: fstore #5
    //   1180: aload #13
    //   1182: getstatic b/b/j.AppCompatTextView_autoSizePresetSizes : I
    //   1185: invokevirtual hasValue : (I)Z
    //   1188: ifeq -> 1282
    //   1191: aload #13
    //   1193: getstatic b/b/j.AppCompatTextView_autoSizePresetSizes : I
    //   1196: iconst_0
    //   1197: invokevirtual getResourceId : (II)I
    //   1200: istore_2
    //   1201: iload_2
    //   1202: ifle -> 1282
    //   1205: aload #13
    //   1207: invokevirtual getResources : ()Landroid/content/res/Resources;
    //   1210: iload_2
    //   1211: invokevirtual obtainTypedArray : (I)Landroid/content/res/TypedArray;
    //   1214: astore #14
    //   1216: aload #14
    //   1218: invokevirtual length : ()I
    //   1221: istore #7
    //   1223: iload #7
    //   1225: newarray int
    //   1227: astore #15
    //   1229: iload #7
    //   1231: ifle -> 1277
    //   1234: iconst_0
    //   1235: istore_2
    //   1236: iload_2
    //   1237: iload #7
    //   1239: if_icmpge -> 1259
    //   1242: aload #15
    //   1244: iload_2
    //   1245: aload #14
    //   1247: iload_2
    //   1248: iconst_m1
    //   1249: invokevirtual getDimensionPixelSize : (II)I
    //   1252: iastore
    //   1253: iinc #2, 1
    //   1256: goto -> 1236
    //   1259: aload #12
    //   1261: aload #12
    //   1263: aload #15
    //   1265: invokevirtual b : ([I)[I
    //   1268: putfield f : [I
    //   1271: aload #12
    //   1273: invokevirtual h : ()Z
    //   1276: pop
    //   1277: aload #14
    //   1279: invokevirtual recycle : ()V
    //   1282: aload #13
    //   1284: invokevirtual recycle : ()V
    //   1287: aload #12
    //   1289: invokevirtual i : ()Z
    //   1292: ifeq -> 1407
    //   1295: aload #12
    //   1297: getfield a : I
    //   1300: iconst_1
    //   1301: if_icmpne -> 1413
    //   1304: aload #12
    //   1306: getfield g : Z
    //   1309: ifne -> 1398
    //   1312: aload #12
    //   1314: getfield j : Landroid/content/Context;
    //   1317: invokevirtual getResources : ()Landroid/content/res/Resources;
    //   1320: invokevirtual getDisplayMetrics : ()Landroid/util/DisplayMetrics;
    //   1323: astore #13
    //   1325: fload #4
    //   1327: fstore #6
    //   1329: fload #4
    //   1331: ldc_w -1.0
    //   1334: fcmpl
    //   1335: ifne -> 1349
    //   1338: iconst_2
    //   1339: ldc_w 12.0
    //   1342: aload #13
    //   1344: invokestatic applyDimension : (IFLandroid/util/DisplayMetrics;)F
    //   1347: fstore #6
    //   1349: fload #5
    //   1351: fstore #4
    //   1353: fload #5
    //   1355: ldc_w -1.0
    //   1358: fcmpl
    //   1359: ifne -> 1373
    //   1362: iconst_2
    //   1363: ldc_w 112.0
    //   1366: aload #13
    //   1368: invokestatic applyDimension : (IFLandroid/util/DisplayMetrics;)F
    //   1371: fstore #4
    //   1373: fload_3
    //   1374: fstore #5
    //   1376: fload_3
    //   1377: ldc_w -1.0
    //   1380: fcmpl
    //   1381: ifne -> 1387
    //   1384: fconst_1
    //   1385: fstore #5
    //   1387: aload #12
    //   1389: fload #6
    //   1391: fload #4
    //   1393: fload #5
    //   1395: invokevirtual j : (FFF)V
    //   1398: aload #12
    //   1400: invokevirtual g : ()Z
    //   1403: pop
    //   1404: goto -> 1413
    //   1407: aload #12
    //   1409: iconst_0
    //   1410: putfield a : I
    //   1413: getstatic b/i/n/b.a : Z
    //   1416: ifeq -> 1512
    //   1419: aload_0
    //   1420: getfield i : Lb/b/p/a0;
    //   1423: astore #12
    //   1425: aload #12
    //   1427: getfield a : I
    //   1430: ifeq -> 1512
    //   1433: aload #12
    //   1435: getfield f : [I
    //   1438: astore #12
    //   1440: aload #12
    //   1442: arraylength
    //   1443: ifle -> 1512
    //   1446: aload_0
    //   1447: getfield a : Landroid/widget/TextView;
    //   1450: invokevirtual getAutoSizeStepGranularity : ()I
    //   1453: i2f
    //   1454: ldc_w -1.0
    //   1457: fcmpl
    //   1458: ifeq -> 1502
    //   1461: aload_0
    //   1462: getfield a : Landroid/widget/TextView;
    //   1465: aload_0
    //   1466: getfield i : Lb/b/p/a0;
    //   1469: getfield d : F
    //   1472: invokestatic round : (F)I
    //   1475: aload_0
    //   1476: getfield i : Lb/b/p/a0;
    //   1479: getfield e : F
    //   1482: invokestatic round : (F)I
    //   1485: aload_0
    //   1486: getfield i : Lb/b/p/a0;
    //   1489: getfield c : F
    //   1492: invokestatic round : (F)I
    //   1495: iconst_0
    //   1496: invokevirtual setAutoSizeTextTypeUniformWithConfiguration : (IIII)V
    //   1499: goto -> 1512
    //   1502: aload_0
    //   1503: getfield a : Landroid/widget/TextView;
    //   1506: aload #12
    //   1508: iconst_0
    //   1509: invokevirtual setAutoSizeTextTypeUniformWithPresetSizes : ([II)V
    //   1512: aload #20
    //   1514: aload_1
    //   1515: getstatic b/b/j.AppCompatTextView : [I
    //   1518: invokevirtual obtainStyledAttributes : (Landroid/util/AttributeSet;[I)Landroid/content/res/TypedArray;
    //   1521: astore #17
    //   1523: aload #17
    //   1525: getstatic b/b/j.AppCompatTextView_drawableLeftCompat : I
    //   1528: iconst_m1
    //   1529: invokevirtual getResourceId : (II)I
    //   1532: istore_2
    //   1533: iload_2
    //   1534: iconst_m1
    //   1535: if_icmpeq -> 1551
    //   1538: aload #21
    //   1540: aload #20
    //   1542: iload_2
    //   1543: invokevirtual b : (Landroid/content/Context;I)Landroid/graphics/drawable/Drawable;
    //   1546: astore #14
    //   1548: goto -> 1554
    //   1551: aconst_null
    //   1552: astore #14
    //   1554: aload #17
    //   1556: getstatic b/b/j.AppCompatTextView_drawableTopCompat : I
    //   1559: iconst_m1
    //   1560: invokevirtual getResourceId : (II)I
    //   1563: istore_2
    //   1564: iload_2
    //   1565: iconst_m1
    //   1566: if_icmpeq -> 1582
    //   1569: aload #21
    //   1571: aload #20
    //   1573: iload_2
    //   1574: invokevirtual b : (Landroid/content/Context;I)Landroid/graphics/drawable/Drawable;
    //   1577: astore #12
    //   1579: goto -> 1585
    //   1582: aconst_null
    //   1583: astore #12
    //   1585: aload #17
    //   1587: getstatic b/b/j.AppCompatTextView_drawableRightCompat : I
    //   1590: iconst_m1
    //   1591: invokevirtual getResourceId : (II)I
    //   1594: istore_2
    //   1595: iload_2
    //   1596: iconst_m1
    //   1597: if_icmpeq -> 1613
    //   1600: aload #21
    //   1602: aload #20
    //   1604: iload_2
    //   1605: invokevirtual b : (Landroid/content/Context;I)Landroid/graphics/drawable/Drawable;
    //   1608: astore #13
    //   1610: goto -> 1616
    //   1613: aconst_null
    //   1614: astore #13
    //   1616: aload #17
    //   1618: getstatic b/b/j.AppCompatTextView_drawableBottomCompat : I
    //   1621: iconst_m1
    //   1622: invokevirtual getResourceId : (II)I
    //   1625: istore_2
    //   1626: iload_2
    //   1627: iconst_m1
    //   1628: if_icmpeq -> 1643
    //   1631: aload #21
    //   1633: aload #20
    //   1635: iload_2
    //   1636: invokevirtual b : (Landroid/content/Context;I)Landroid/graphics/drawable/Drawable;
    //   1639: astore_1
    //   1640: goto -> 1645
    //   1643: aconst_null
    //   1644: astore_1
    //   1645: aload #17
    //   1647: getstatic b/b/j.AppCompatTextView_drawableStartCompat : I
    //   1650: iconst_m1
    //   1651: invokevirtual getResourceId : (II)I
    //   1654: istore_2
    //   1655: iload_2
    //   1656: iconst_m1
    //   1657: if_icmpeq -> 1673
    //   1660: aload #21
    //   1662: aload #20
    //   1664: iload_2
    //   1665: invokevirtual b : (Landroid/content/Context;I)Landroid/graphics/drawable/Drawable;
    //   1668: astore #16
    //   1670: goto -> 1676
    //   1673: aconst_null
    //   1674: astore #16
    //   1676: aload #17
    //   1678: getstatic b/b/j.AppCompatTextView_drawableEndCompat : I
    //   1681: iconst_m1
    //   1682: invokevirtual getResourceId : (II)I
    //   1685: istore_2
    //   1686: iload_2
    //   1687: iconst_m1
    //   1688: if_icmpeq -> 1704
    //   1691: aload #21
    //   1693: aload #20
    //   1695: iload_2
    //   1696: invokevirtual b : (Landroid/content/Context;I)Landroid/graphics/drawable/Drawable;
    //   1699: astore #15
    //   1701: goto -> 1707
    //   1704: aconst_null
    //   1705: astore #15
    //   1707: aload #16
    //   1709: ifnonnull -> 1908
    //   1712: aload #15
    //   1714: ifnull -> 1720
    //   1717: goto -> 1908
    //   1720: aload #14
    //   1722: ifnonnull -> 1739
    //   1725: aload #12
    //   1727: ifnonnull -> 1739
    //   1730: aload #13
    //   1732: ifnonnull -> 1739
    //   1735: aload_1
    //   1736: ifnull -> 1989
    //   1739: aload_0
    //   1740: getfield a : Landroid/widget/TextView;
    //   1743: invokevirtual getCompoundDrawablesRelative : ()[Landroid/graphics/drawable/Drawable;
    //   1746: astore #15
    //   1748: aload #15
    //   1750: iconst_0
    //   1751: aaload
    //   1752: ifnonnull -> 1849
    //   1755: aload #15
    //   1757: iconst_2
    //   1758: aaload
    //   1759: ifnull -> 1765
    //   1762: goto -> 1849
    //   1765: aload_0
    //   1766: getfield a : Landroid/widget/TextView;
    //   1769: invokevirtual getCompoundDrawables : ()[Landroid/graphics/drawable/Drawable;
    //   1772: astore #16
    //   1774: aload_0
    //   1775: getfield a : Landroid/widget/TextView;
    //   1778: astore #15
    //   1780: aload #14
    //   1782: ifnull -> 1788
    //   1785: goto -> 1794
    //   1788: aload #16
    //   1790: iconst_0
    //   1791: aaload
    //   1792: astore #14
    //   1794: aload #12
    //   1796: ifnull -> 1802
    //   1799: goto -> 1808
    //   1802: aload #16
    //   1804: iconst_1
    //   1805: aaload
    //   1806: astore #12
    //   1808: aload #13
    //   1810: ifnull -> 1816
    //   1813: goto -> 1822
    //   1816: aload #16
    //   1818: iconst_2
    //   1819: aaload
    //   1820: astore #13
    //   1822: aload_1
    //   1823: ifnull -> 1829
    //   1826: goto -> 1834
    //   1829: aload #16
    //   1831: iconst_3
    //   1832: aaload
    //   1833: astore_1
    //   1834: aload #15
    //   1836: aload #14
    //   1838: aload #12
    //   1840: aload #13
    //   1842: aload_1
    //   1843: invokevirtual setCompoundDrawablesWithIntrinsicBounds : (Landroid/graphics/drawable/Drawable;Landroid/graphics/drawable/Drawable;Landroid/graphics/drawable/Drawable;Landroid/graphics/drawable/Drawable;)V
    //   1846: goto -> 1989
    //   1849: aload_0
    //   1850: getfield a : Landroid/widget/TextView;
    //   1853: astore #13
    //   1855: aload #15
    //   1857: iconst_0
    //   1858: aaload
    //   1859: astore #14
    //   1861: aload #12
    //   1863: ifnull -> 1869
    //   1866: goto -> 1875
    //   1869: aload #15
    //   1871: iconst_1
    //   1872: aaload
    //   1873: astore #12
    //   1875: aload #15
    //   1877: iconst_2
    //   1878: aaload
    //   1879: astore #16
    //   1881: aload_1
    //   1882: ifnull -> 1888
    //   1885: goto -> 1893
    //   1888: aload #15
    //   1890: iconst_3
    //   1891: aaload
    //   1892: astore_1
    //   1893: aload #13
    //   1895: aload #14
    //   1897: aload #12
    //   1899: aload #16
    //   1901: aload_1
    //   1902: invokevirtual setCompoundDrawablesRelativeWithIntrinsicBounds : (Landroid/graphics/drawable/Drawable;Landroid/graphics/drawable/Drawable;Landroid/graphics/drawable/Drawable;Landroid/graphics/drawable/Drawable;)V
    //   1905: goto -> 1989
    //   1908: aload_0
    //   1909: getfield a : Landroid/widget/TextView;
    //   1912: invokevirtual getCompoundDrawablesRelative : ()[Landroid/graphics/drawable/Drawable;
    //   1915: astore #14
    //   1917: aload_0
    //   1918: getfield a : Landroid/widget/TextView;
    //   1921: astore #13
    //   1923: aload #16
    //   1925: ifnull -> 1931
    //   1928: goto -> 1937
    //   1931: aload #14
    //   1933: iconst_0
    //   1934: aaload
    //   1935: astore #16
    //   1937: aload #12
    //   1939: ifnull -> 1945
    //   1942: goto -> 1951
    //   1945: aload #14
    //   1947: iconst_1
    //   1948: aaload
    //   1949: astore #12
    //   1951: aload #15
    //   1953: ifnull -> 1959
    //   1956: goto -> 1965
    //   1959: aload #14
    //   1961: iconst_2
    //   1962: aaload
    //   1963: astore #15
    //   1965: aload_1
    //   1966: ifnull -> 1972
    //   1969: goto -> 1977
    //   1972: aload #14
    //   1974: iconst_3
    //   1975: aaload
    //   1976: astore_1
    //   1977: aload #13
    //   1979: aload #16
    //   1981: aload #12
    //   1983: aload #15
    //   1985: aload_1
    //   1986: invokevirtual setCompoundDrawablesRelativeWithIntrinsicBounds : (Landroid/graphics/drawable/Drawable;Landroid/graphics/drawable/Drawable;Landroid/graphics/drawable/Drawable;Landroid/graphics/drawable/Drawable;)V
    //   1989: aload #17
    //   1991: getstatic b/b/j.AppCompatTextView_drawableTint : I
    //   1994: invokevirtual hasValue : (I)Z
    //   1997: ifeq -> 2102
    //   2000: getstatic b/b/j.AppCompatTextView_drawableTint : I
    //   2003: istore #7
    //   2005: aload #17
    //   2007: iload #7
    //   2009: invokevirtual hasValue : (I)Z
    //   2012: ifeq -> 2042
    //   2015: aload #17
    //   2017: iload #7
    //   2019: iconst_0
    //   2020: invokevirtual getResourceId : (II)I
    //   2023: istore_2
    //   2024: iload_2
    //   2025: ifeq -> 2042
    //   2028: aload #20
    //   2030: iload_2
    //   2031: invokestatic a : (Landroid/content/Context;I)Landroid/content/res/ColorStateList;
    //   2034: astore_1
    //   2035: aload_1
    //   2036: ifnull -> 2042
    //   2039: goto -> 2050
    //   2042: aload #17
    //   2044: iload #7
    //   2046: invokevirtual getColorStateList : (I)Landroid/content/res/ColorStateList;
    //   2049: astore_1
    //   2050: aload_0
    //   2051: getfield a : Landroid/widget/TextView;
    //   2054: astore #12
    //   2056: aload #12
    //   2058: ifnull -> 2100
    //   2061: getstatic android/os/Build$VERSION.SDK_INT : I
    //   2064: bipush #24
    //   2066: if_icmplt -> 2078
    //   2069: aload #12
    //   2071: aload_1
    //   2072: invokevirtual setCompoundDrawableTintList : (Landroid/content/res/ColorStateList;)V
    //   2075: goto -> 2102
    //   2078: aload #12
    //   2080: instanceof b/i/n/e
    //   2083: ifeq -> 2102
    //   2086: aload #12
    //   2088: checkcast b/i/n/e
    //   2091: aload_1
    //   2092: invokeinterface setSupportCompoundDrawablesTintList : (Landroid/content/res/ColorStateList;)V
    //   2097: goto -> 2102
    //   2100: aconst_null
    //   2101: athrow
    //   2102: aload #17
    //   2104: getstatic b/b/j.AppCompatTextView_drawableTintMode : I
    //   2107: invokevirtual hasValue : (I)Z
    //   2110: ifeq -> 2177
    //   2113: aload #17
    //   2115: getstatic b/b/j.AppCompatTextView_drawableTintMode : I
    //   2118: iconst_m1
    //   2119: invokevirtual getInt : (II)I
    //   2122: aconst_null
    //   2123: invokestatic c : (ILandroid/graphics/PorterDuff$Mode;)Landroid/graphics/PorterDuff$Mode;
    //   2126: astore #12
    //   2128: aload_0
    //   2129: getfield a : Landroid/widget/TextView;
    //   2132: astore_1
    //   2133: aload_1
    //   2134: ifnull -> 2175
    //   2137: getstatic android/os/Build$VERSION.SDK_INT : I
    //   2140: bipush #24
    //   2142: if_icmplt -> 2154
    //   2145: aload_1
    //   2146: aload #12
    //   2148: invokevirtual setCompoundDrawableTintMode : (Landroid/graphics/PorterDuff$Mode;)V
    //   2151: goto -> 2177
    //   2154: aload_1
    //   2155: instanceof b/i/n/e
    //   2158: ifeq -> 2177
    //   2161: aload_1
    //   2162: checkcast b/i/n/e
    //   2165: aload #12
    //   2167: invokeinterface setSupportCompoundDrawablesTintMode : (Landroid/graphics/PorterDuff$Mode;)V
    //   2172: goto -> 2177
    //   2175: aconst_null
    //   2176: athrow
    //   2177: aload #17
    //   2179: getstatic b/b/j.AppCompatTextView_firstBaselineToTopHeight : I
    //   2182: iconst_m1
    //   2183: invokevirtual getDimensionPixelSize : (II)I
    //   2186: istore_2
    //   2187: aload #17
    //   2189: getstatic b/b/j.AppCompatTextView_lastBaselineToBottomHeight : I
    //   2192: iconst_m1
    //   2193: invokevirtual getDimensionPixelSize : (II)I
    //   2196: istore #7
    //   2198: aload #17
    //   2200: getstatic b/b/j.AppCompatTextView_lineHeight : I
    //   2203: iconst_m1
    //   2204: invokevirtual getDimensionPixelSize : (II)I
    //   2207: istore #8
    //   2209: aload #17
    //   2211: invokevirtual recycle : ()V
    //   2214: iload_2
    //   2215: iconst_m1
    //   2216: if_icmpeq -> 2227
    //   2219: aload_0
    //   2220: getfield a : Landroid/widget/TextView;
    //   2223: iload_2
    //   2224: invokestatic m0 : (Landroid/widget/TextView;I)V
    //   2227: iload #7
    //   2229: iconst_m1
    //   2230: if_icmpeq -> 2242
    //   2233: aload_0
    //   2234: getfield a : Landroid/widget/TextView;
    //   2237: iload #7
    //   2239: invokestatic n0 : (Landroid/widget/TextView;I)V
    //   2242: iload #8
    //   2244: iconst_m1
    //   2245: if_icmpeq -> 2257
    //   2248: aload_0
    //   2249: getfield a : Landroid/widget/TextView;
    //   2252: iload #8
    //   2254: invokestatic p0 : (Landroid/widget/TextView;I)V
    //   2257: return
  }
  
  public void f(Context paramContext, int paramInt) {
    x0 x0 = new x0(paramContext, paramContext.obtainStyledAttributes(paramInt, j.TextAppearance));
    if (x0.o(j.TextAppearance_textAllCaps)) {
      boolean bool = x0.a(j.TextAppearance_textAllCaps, false);
      this.a.setAllCaps(bool);
    } 
    if (Build.VERSION.SDK_INT < 23 && x0.o(j.TextAppearance_android_textColor)) {
      ColorStateList colorStateList = x0.c(j.TextAppearance_android_textColor);
      if (colorStateList != null)
        this.a.setTextColor(colorStateList); 
    } 
    if (x0.o(j.TextAppearance_android_textSize) && x0.f(j.TextAppearance_android_textSize, -1) == 0)
      this.a.setTextSize(0, 0.0F); 
    l(paramContext, x0);
    if (Build.VERSION.SDK_INT >= 26 && x0.o(j.TextAppearance_fontVariationSettings)) {
      String str = x0.m(j.TextAppearance_fontVariationSettings);
      if (str != null)
        this.a.setFontVariationSettings(str); 
    } 
    x0.b.recycle();
    Typeface typeface = this.l;
    if (typeface != null)
      this.a.setTypeface(typeface, this.j); 
  }
  
  public void g(int paramInt1, int paramInt2, int paramInt3, int paramInt4) {
    a0 a01 = this.i;
    if (a01.i()) {
      DisplayMetrics displayMetrics = a01.j.getResources().getDisplayMetrics();
      a01.j(TypedValue.applyDimension(paramInt4, paramInt1, displayMetrics), TypedValue.applyDimension(paramInt4, paramInt2, displayMetrics), TypedValue.applyDimension(paramInt4, paramInt3, displayMetrics));
      if (a01.g())
        a01.a(); 
    } 
  }
  
  public void h(int[] paramArrayOfint, int paramInt) {
    a0 a01 = this.i;
    if (a01.i()) {
      int i = paramArrayOfint.length;
      byte b = 0;
      if (i > 0) {
        int[] arrayOfInt1;
        int[] arrayOfInt2 = new int[i];
        if (paramInt == 0) {
          arrayOfInt1 = Arrays.copyOf(paramArrayOfint, i);
        } else {
          DisplayMetrics displayMetrics = a01.j.getResources().getDisplayMetrics();
          while (true) {
            arrayOfInt1 = arrayOfInt2;
            if (b < i) {
              arrayOfInt2[b] = Math.round(TypedValue.applyDimension(paramInt, paramArrayOfint[b], displayMetrics));
              b++;
              continue;
            } 
            break;
          } 
        } 
        a01.f = a01.b(arrayOfInt1);
        if (!a01.h()) {
          StringBuilder stringBuilder = c.a.a.a.a.e("None of the preset sizes is valid: ");
          stringBuilder.append(Arrays.toString(paramArrayOfint));
          throw new IllegalArgumentException(stringBuilder.toString());
        } 
      } else {
        a01.g = false;
      } 
      if (a01.g())
        a01.a(); 
    } 
  }
  
  public void i(int paramInt) {
    a0 a01 = this.i;
    if (a01.i())
      if (paramInt != 0) {
        if (paramInt == 1) {
          DisplayMetrics displayMetrics = a01.j.getResources().getDisplayMetrics();
          a01.j(TypedValue.applyDimension(2, 12.0F, displayMetrics), TypedValue.applyDimension(2, 112.0F, displayMetrics), 1.0F);
          if (a01.g())
            a01.a(); 
        } else {
          StringBuilder stringBuilder = new StringBuilder();
          stringBuilder.append("Unknown auto-size text type: ");
          stringBuilder.append(paramInt);
          throw new IllegalArgumentException(stringBuilder.toString());
        } 
      } else {
        a01.a = 0;
        a01.d = -1.0F;
        a01.e = -1.0F;
        a01.c = -1.0F;
        a01.f = new int[0];
        a01.b = false;
      }  
  }
  
  public void j(ColorStateList paramColorStateList) {
    boolean bool;
    if (this.h == null)
      this.h = new v0(); 
    v0 v02 = this.h;
    v02.a = paramColorStateList;
    if (paramColorStateList != null) {
      bool = true;
    } else {
      bool = false;
    } 
    v02.d = bool;
    v0 v01 = this.h;
    this.b = v01;
    this.c = v01;
    this.d = v01;
    this.e = v01;
    this.f = v01;
    this.g = v01;
  }
  
  public void k(PorterDuff.Mode paramMode) {
    boolean bool;
    if (this.h == null)
      this.h = new v0(); 
    v0 v02 = this.h;
    v02.b = paramMode;
    if (paramMode != null) {
      bool = true;
    } else {
      bool = false;
    } 
    v02.c = bool;
    v0 v01 = this.h;
    this.b = v01;
    this.c = v01;
    this.d = v01;
    this.e = v01;
    this.f = v01;
    this.g = v01;
  }
  
  public final void l(Context paramContext, x0 paramx0) {
    this.j = paramx0.j(j.TextAppearance_android_textStyle, this.j);
    int i = Build.VERSION.SDK_INT;
    boolean bool = false;
    if (i >= 28) {
      i = paramx0.j(j.TextAppearance_android_textFontWeight, -1);
      this.k = i;
      if (i != -1)
        this.j = this.j & 0x2 | 0x0; 
    } 
    if (paramx0.o(j.TextAppearance_android_fontFamily) || paramx0.o(j.TextAppearance_fontFamily)) {
      this.l = null;
      if (paramx0.o(j.TextAppearance_fontFamily)) {
        i = j.TextAppearance_fontFamily;
      } else {
        i = j.TextAppearance_android_fontFamily;
      } 
      int j = this.k;
      int k = this.j;
      if (!paramContext.isRestricted()) {
        a a = new a(this, j, k, new WeakReference<TextView>(this.a));
        try {
          boolean bool1;
          Typeface typeface = paramx0.i(i, this.j, a);
          if (typeface != null) {
            Typeface typeface1 = typeface;
            if (Build.VERSION.SDK_INT >= 28) {
              typeface1 = typeface;
              if (this.k != -1) {
                typeface1 = Typeface.create(typeface, 0);
                j = this.k;
                if ((this.j & 0x2) != 0) {
                  bool1 = true;
                } else {
                  bool1 = false;
                } 
                typeface1 = Typeface.create(typeface1, j, bool1);
              } 
            } 
            this.l = typeface1;
          } 
          if (this.l == null) {
            bool1 = true;
          } else {
            bool1 = false;
          } 
          this.m = bool1;
        } catch (UnsupportedOperationException|android.content.res.Resources.NotFoundException unsupportedOperationException) {}
      } 
      if (this.l == null) {
        String str = paramx0.m(i);
        if (str != null) {
          Typeface typeface;
          if (Build.VERSION.SDK_INT >= 28 && this.k != -1) {
            typeface = Typeface.create(str, 0);
            i = this.k;
            boolean bool1 = bool;
            if ((this.j & 0x2) != 0)
              bool1 = true; 
            typeface = Typeface.create(typeface, i, bool1);
          } else {
            typeface = Typeface.create((String)typeface, this.j);
          } 
          this.l = typeface;
        } 
      } 
      return;
    } 
    if (paramx0.o(j.TextAppearance_android_typeface)) {
      Typeface typeface;
      this.m = false;
      i = paramx0.j(j.TextAppearance_android_typeface, 1);
      if (i != 1) {
        if (i != 2) {
          if (i != 3)
            return; 
          typeface = Typeface.MONOSPACE;
        } else {
          typeface = Typeface.SERIF;
        } 
      } else {
        typeface = Typeface.SANS_SERIF;
      } 
      this.l = typeface;
    } 
  }
  
  public class a extends g {
    public final int a;
    
    public final int b;
    
    public final WeakReference c;
    
    public final y d;
    
    public a(y this$0, int param1Int1, int param1Int2, WeakReference param1WeakReference) {}
    
    public void c(int param1Int) {}
    
    public void d(Typeface param1Typeface) {
      Typeface typeface = param1Typeface;
      if (Build.VERSION.SDK_INT >= 28) {
        int i = this.a;
        typeface = param1Typeface;
        if (i != -1) {
          boolean bool;
          if ((this.b & 0x2) != 0) {
            bool = true;
          } else {
            bool = false;
          } 
          typeface = Typeface.create(param1Typeface, i, bool);
        } 
      } 
      y y1 = this.d;
      WeakReference<TextView> weakReference = this.c;
      if (y1.m) {
        y1.l = typeface;
        TextView textView = weakReference.get();
        if (textView != null)
          textView.setTypeface(typeface, y1.j); 
      } 
    }
  }
}


/* Location:              C:\Users\panch\Downloads\dvba_v1.1.0-dex2jar.jar!\b\b\p\y.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */