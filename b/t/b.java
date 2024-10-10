package b.t;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.graphics.PointF;
import android.graphics.Rect;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.util.Property;
import android.view.View;
import android.view.ViewGroup;
import b.i.m.l;

public class b extends i {
  public static final String[] M = new String[] { "android:changeBounds:bounds", "android:changeBounds:clip", "android:changeBounds:parent", "android:changeBounds:windowX", "android:changeBounds:windowY" };
  
  public static final Property<Drawable, PointF> N = new b(PointF.class, "boundsOrigin");
  
  public static final Property<k, PointF> O = new c(PointF.class, "topLeft");
  
  public static final Property<k, PointF> P = new d(PointF.class, "bottomRight");
  
  public static final Property<View, PointF> Q = new e(PointF.class, "bottomRight");
  
  public static final Property<View, PointF> R = new f(PointF.class, "topLeft");
  
  public static final Property<View, PointF> S = new g(PointF.class, "position");
  
  public static g T = new g();
  
  public int[] J = new int[2];
  
  public boolean K = false;
  
  public boolean L = false;
  
  public final void I(q paramq) {
    View view = paramq.b;
    if (l.E(view) || view.getWidth() != 0 || view.getHeight() != 0) {
      paramq.a.put("android:changeBounds:bounds", new Rect(view.getLeft(), view.getTop(), view.getRight(), view.getBottom()));
      paramq.a.put("android:changeBounds:parent", paramq.b.getParent());
      if (this.L) {
        paramq.b.getLocationInWindow(this.J);
        paramq.a.put("android:changeBounds:windowX", Integer.valueOf(this.J[0]));
        paramq.a.put("android:changeBounds:windowY", Integer.valueOf(this.J[1]));
      } 
      if (this.K)
        paramq.a.put("android:changeBounds:clip", view.getClipBounds()); 
    } 
  }
  
  public void e(q paramq) {
    I(paramq);
  }
  
  public void h(q paramq) {
    I(paramq);
  }
  
  public Animator l(ViewGroup paramViewGroup, q paramq1, q paramq2) {
    // Byte code:
    //   0: aload_2
    //   1: ifnull -> 1137
    //   4: aload_3
    //   5: ifnonnull -> 11
    //   8: goto -> 1137
    //   11: aload_2
    //   12: getfield a : Ljava/util/Map;
    //   15: astore #19
    //   17: aload_3
    //   18: getfield a : Ljava/util/Map;
    //   21: astore #20
    //   23: aload #19
    //   25: ldc 'android:changeBounds:parent'
    //   27: invokeinterface get : (Ljava/lang/Object;)Ljava/lang/Object;
    //   32: checkcast android/view/ViewGroup
    //   35: astore #19
    //   37: aload #20
    //   39: ldc 'android:changeBounds:parent'
    //   41: invokeinterface get : (Ljava/lang/Object;)Ljava/lang/Object;
    //   46: checkcast android/view/ViewGroup
    //   49: astore #21
    //   51: aload #19
    //   53: ifnull -> 1135
    //   56: aload #21
    //   58: ifnonnull -> 64
    //   61: goto -> 1135
    //   64: aload_3
    //   65: getfield b : Landroid/view/View;
    //   68: astore #20
    //   70: aload_0
    //   71: getfield L : Z
    //   74: ifeq -> 120
    //   77: aload_0
    //   78: aload #19
    //   80: iconst_1
    //   81: invokevirtual o : (Landroid/view/View;Z)Lb/t/q;
    //   84: astore #22
    //   86: aload #22
    //   88: ifnonnull -> 101
    //   91: aload #19
    //   93: aload #21
    //   95: if_acmpne -> 114
    //   98: goto -> 120
    //   101: aload #21
    //   103: aload #22
    //   105: getfield b : Landroid/view/View;
    //   108: if_acmpne -> 114
    //   111: goto -> 120
    //   114: iconst_0
    //   115: istore #5
    //   117: goto -> 123
    //   120: iconst_1
    //   121: istore #5
    //   123: iload #5
    //   125: ifeq -> 884
    //   128: aload_2
    //   129: getfield a : Ljava/util/Map;
    //   132: ldc 'android:changeBounds:bounds'
    //   134: invokeinterface get : (Ljava/lang/Object;)Ljava/lang/Object;
    //   139: checkcast android/graphics/Rect
    //   142: astore_1
    //   143: aload_3
    //   144: getfield a : Ljava/util/Map;
    //   147: ldc 'android:changeBounds:bounds'
    //   149: invokeinterface get : (Ljava/lang/Object;)Ljava/lang/Object;
    //   154: checkcast android/graphics/Rect
    //   157: astore #19
    //   159: aload_1
    //   160: getfield left : I
    //   163: istore #15
    //   165: aload #19
    //   167: getfield left : I
    //   170: istore #7
    //   172: aload_1
    //   173: getfield top : I
    //   176: istore #18
    //   178: aload #19
    //   180: getfield top : I
    //   183: istore #12
    //   185: aload_1
    //   186: getfield right : I
    //   189: istore #10
    //   191: aload #19
    //   193: getfield right : I
    //   196: istore #14
    //   198: aload_1
    //   199: getfield bottom : I
    //   202: istore #9
    //   204: aload #19
    //   206: getfield bottom : I
    //   209: istore #17
    //   211: iload #10
    //   213: iload #15
    //   215: isub
    //   216: istore #8
    //   218: iload #9
    //   220: iload #18
    //   222: isub
    //   223: istore #16
    //   225: iload #14
    //   227: iload #7
    //   229: isub
    //   230: istore #13
    //   232: iload #17
    //   234: iload #12
    //   236: isub
    //   237: istore #11
    //   239: aload_2
    //   240: getfield a : Ljava/util/Map;
    //   243: ldc 'android:changeBounds:clip'
    //   245: invokeinterface get : (Ljava/lang/Object;)Ljava/lang/Object;
    //   250: checkcast android/graphics/Rect
    //   253: astore_2
    //   254: aload_3
    //   255: getfield a : Ljava/util/Map;
    //   258: ldc 'android:changeBounds:clip'
    //   260: invokeinterface get : (Ljava/lang/Object;)Ljava/lang/Object;
    //   265: checkcast android/graphics/Rect
    //   268: astore #19
    //   270: iload #8
    //   272: ifeq -> 280
    //   275: iload #16
    //   277: ifne -> 290
    //   280: iload #13
    //   282: ifeq -> 343
    //   285: iload #11
    //   287: ifeq -> 343
    //   290: iload #15
    //   292: iload #7
    //   294: if_icmpne -> 313
    //   297: iload #18
    //   299: iload #12
    //   301: if_icmpeq -> 307
    //   304: goto -> 313
    //   307: iconst_0
    //   308: istore #6
    //   310: goto -> 316
    //   313: iconst_1
    //   314: istore #6
    //   316: iload #10
    //   318: iload #14
    //   320: if_icmpne -> 334
    //   323: iload #6
    //   325: istore #5
    //   327: iload #9
    //   329: iload #17
    //   331: if_icmpeq -> 346
    //   334: iload #6
    //   336: iconst_1
    //   337: iadd
    //   338: istore #5
    //   340: goto -> 346
    //   343: iconst_0
    //   344: istore #5
    //   346: aload_2
    //   347: ifnull -> 359
    //   350: aload_2
    //   351: aload #19
    //   353: invokevirtual equals : (Ljava/lang/Object;)Z
    //   356: ifeq -> 376
    //   359: iload #5
    //   361: istore #6
    //   363: aload_2
    //   364: ifnonnull -> 382
    //   367: iload #5
    //   369: istore #6
    //   371: aload #19
    //   373: ifnull -> 382
    //   376: iload #5
    //   378: iconst_1
    //   379: iadd
    //   380: istore #6
    //   382: iload #6
    //   384: ifle -> 977
    //   387: aload_0
    //   388: getfield K : Z
    //   391: ifne -> 643
    //   394: aload #20
    //   396: iload #15
    //   398: iload #18
    //   400: iload #10
    //   402: iload #9
    //   404: invokestatic d : (Landroid/view/View;IIII)V
    //   407: iload #6
    //   409: iconst_2
    //   410: if_icmpne -> 564
    //   413: iload #8
    //   415: iload #13
    //   417: if_icmpne -> 454
    //   420: iload #16
    //   422: iload #11
    //   424: if_icmpne -> 454
    //   427: aload_0
    //   428: getfield F : Lb/t/e;
    //   431: iload #15
    //   433: i2f
    //   434: iload #18
    //   436: i2f
    //   437: iload #7
    //   439: i2f
    //   440: iload #12
    //   442: i2f
    //   443: invokevirtual a : (FFFF)Landroid/graphics/Path;
    //   446: astore_1
    //   447: getstatic b/t/b.S : Landroid/util/Property;
    //   450: astore_2
    //   451: goto -> 632
    //   454: new b/t/b$k
    //   457: dup
    //   458: aload #20
    //   460: invokespecial <init> : (Landroid/view/View;)V
    //   463: astore_2
    //   464: aload_0
    //   465: getfield F : Lb/t/e;
    //   468: iload #15
    //   470: i2f
    //   471: iload #18
    //   473: i2f
    //   474: iload #7
    //   476: i2f
    //   477: iload #12
    //   479: i2f
    //   480: invokevirtual a : (FFFF)Landroid/graphics/Path;
    //   483: astore_1
    //   484: aload_2
    //   485: getstatic b/t/b.O : Landroid/util/Property;
    //   488: aload_1
    //   489: invokestatic b0 : (Ljava/lang/Object;Landroid/util/Property;Landroid/graphics/Path;)Landroid/animation/ObjectAnimator;
    //   492: astore_3
    //   493: aload_0
    //   494: getfield F : Lb/t/e;
    //   497: iload #10
    //   499: i2f
    //   500: iload #9
    //   502: i2f
    //   503: iload #14
    //   505: i2f
    //   506: iload #17
    //   508: i2f
    //   509: invokevirtual a : (FFFF)Landroid/graphics/Path;
    //   512: astore_1
    //   513: aload_2
    //   514: getstatic b/t/b.P : Landroid/util/Property;
    //   517: aload_1
    //   518: invokestatic b0 : (Ljava/lang/Object;Landroid/util/Property;Landroid/graphics/Path;)Landroid/animation/ObjectAnimator;
    //   521: astore #19
    //   523: new android/animation/AnimatorSet
    //   526: dup
    //   527: invokespecial <init> : ()V
    //   530: astore_1
    //   531: aload_1
    //   532: iconst_2
    //   533: anewarray android/animation/Animator
    //   536: dup
    //   537: iconst_0
    //   538: aload_3
    //   539: aastore
    //   540: dup
    //   541: iconst_1
    //   542: aload #19
    //   544: aastore
    //   545: invokevirtual playTogether : ([Landroid/animation/Animator;)V
    //   548: aload_1
    //   549: new b/t/b$h
    //   552: dup
    //   553: aload_0
    //   554: aload_2
    //   555: invokespecial <init> : (Lb/t/b;Lb/t/b$k;)V
    //   558: invokevirtual addListener : (Landroid/animation/Animator$AnimatorListener;)V
    //   561: goto -> 843
    //   564: iload #15
    //   566: iload #7
    //   568: if_icmpne -> 608
    //   571: iload #18
    //   573: iload #12
    //   575: if_icmpeq -> 581
    //   578: goto -> 608
    //   581: aload_0
    //   582: getfield F : Lb/t/e;
    //   585: iload #10
    //   587: i2f
    //   588: iload #9
    //   590: i2f
    //   591: iload #14
    //   593: i2f
    //   594: iload #17
    //   596: i2f
    //   597: invokevirtual a : (FFFF)Landroid/graphics/Path;
    //   600: astore_1
    //   601: getstatic b/t/b.Q : Landroid/util/Property;
    //   604: astore_2
    //   605: goto -> 632
    //   608: aload_0
    //   609: getfield F : Lb/t/e;
    //   612: iload #15
    //   614: i2f
    //   615: iload #18
    //   617: i2f
    //   618: iload #7
    //   620: i2f
    //   621: iload #12
    //   623: i2f
    //   624: invokevirtual a : (FFFF)Landroid/graphics/Path;
    //   627: astore_1
    //   628: getstatic b/t/b.R : Landroid/util/Property;
    //   631: astore_2
    //   632: aload #20
    //   634: aload_2
    //   635: aload_1
    //   636: invokestatic b0 : (Ljava/lang/Object;Landroid/util/Property;Landroid/graphics/Path;)Landroid/animation/ObjectAnimator;
    //   639: astore_1
    //   640: goto -> 843
    //   643: aload #20
    //   645: iload #15
    //   647: iload #18
    //   649: iload #8
    //   651: iload #13
    //   653: invokestatic max : (II)I
    //   656: iload #15
    //   658: iadd
    //   659: iload #16
    //   661: iload #11
    //   663: invokestatic max : (II)I
    //   666: iload #18
    //   668: iadd
    //   669: invokestatic d : (Landroid/view/View;IIII)V
    //   672: iload #15
    //   674: iload #7
    //   676: if_icmpne -> 694
    //   679: iload #18
    //   681: iload #12
    //   683: if_icmpeq -> 689
    //   686: goto -> 694
    //   689: aconst_null
    //   690: astore_1
    //   691: goto -> 724
    //   694: aload_0
    //   695: getfield F : Lb/t/e;
    //   698: iload #15
    //   700: i2f
    //   701: iload #18
    //   703: i2f
    //   704: iload #7
    //   706: i2f
    //   707: iload #12
    //   709: i2f
    //   710: invokevirtual a : (FFFF)Landroid/graphics/Path;
    //   713: astore_1
    //   714: aload #20
    //   716: getstatic b/t/b.S : Landroid/util/Property;
    //   719: aload_1
    //   720: invokestatic b0 : (Ljava/lang/Object;Landroid/util/Property;Landroid/graphics/Path;)Landroid/animation/ObjectAnimator;
    //   723: astore_1
    //   724: aload_2
    //   725: ifnonnull -> 745
    //   728: new android/graphics/Rect
    //   731: dup
    //   732: iconst_0
    //   733: iconst_0
    //   734: iload #8
    //   736: iload #16
    //   738: invokespecial <init> : (IIII)V
    //   741: astore_2
    //   742: goto -> 745
    //   745: aload #19
    //   747: ifnonnull -> 767
    //   750: new android/graphics/Rect
    //   753: dup
    //   754: iconst_0
    //   755: iconst_0
    //   756: iload #13
    //   758: iload #11
    //   760: invokespecial <init> : (IIII)V
    //   763: astore_3
    //   764: goto -> 770
    //   767: aload #19
    //   769: astore_3
    //   770: aload_2
    //   771: aload_3
    //   772: invokevirtual equals : (Ljava/lang/Object;)Z
    //   775: ifne -> 835
    //   778: aload #20
    //   780: aload_2
    //   781: invokestatic a0 : (Landroid/view/View;Landroid/graphics/Rect;)V
    //   784: aload #20
    //   786: ldc_w 'clipBounds'
    //   789: getstatic b/t/b.T : Lb/t/g;
    //   792: iconst_2
    //   793: anewarray java/lang/Object
    //   796: dup
    //   797: iconst_0
    //   798: aload_2
    //   799: aastore
    //   800: dup
    //   801: iconst_1
    //   802: aload_3
    //   803: aastore
    //   804: invokestatic ofObject : (Ljava/lang/Object;Ljava/lang/String;Landroid/animation/TypeEvaluator;[Ljava/lang/Object;)Landroid/animation/ObjectAnimator;
    //   807: astore_2
    //   808: aload_2
    //   809: new b/t/b$i
    //   812: dup
    //   813: aload_0
    //   814: aload #20
    //   816: aload #19
    //   818: iload #7
    //   820: iload #12
    //   822: iload #14
    //   824: iload #17
    //   826: invokespecial <init> : (Lb/t/b;Landroid/view/View;Landroid/graphics/Rect;IIII)V
    //   829: invokevirtual addListener : (Landroid/animation/Animator$AnimatorListener;)V
    //   832: goto -> 837
    //   835: aconst_null
    //   836: astore_2
    //   837: aload_1
    //   838: aload_2
    //   839: invokestatic b : (Landroid/animation/Animator;Landroid/animation/Animator;)Landroid/animation/Animator;
    //   842: astore_1
    //   843: aload #20
    //   845: invokevirtual getParent : ()Landroid/view/ViewParent;
    //   848: instanceof android/view/ViewGroup
    //   851: ifeq -> 882
    //   854: aload #20
    //   856: invokevirtual getParent : ()Landroid/view/ViewParent;
    //   859: checkcast android/view/ViewGroup
    //   862: astore_2
    //   863: aload_2
    //   864: iconst_1
    //   865: invokestatic a : (Landroid/view/ViewGroup;Z)V
    //   868: aload_0
    //   869: new b/t/b$j
    //   872: dup
    //   873: aload_0
    //   874: aload_2
    //   875: invokespecial <init> : (Lb/t/b;Landroid/view/ViewGroup;)V
    //   878: invokevirtual a : (Lb/t/i$d;)Lb/t/i;
    //   881: pop
    //   882: aload_1
    //   883: areturn
    //   884: aload_2
    //   885: getfield a : Ljava/util/Map;
    //   888: ldc 'android:changeBounds:windowX'
    //   890: invokeinterface get : (Ljava/lang/Object;)Ljava/lang/Object;
    //   895: checkcast java/lang/Integer
    //   898: invokevirtual intValue : ()I
    //   901: istore #6
    //   903: aload_2
    //   904: getfield a : Ljava/util/Map;
    //   907: ldc 'android:changeBounds:windowY'
    //   909: invokeinterface get : (Ljava/lang/Object;)Ljava/lang/Object;
    //   914: checkcast java/lang/Integer
    //   917: invokevirtual intValue : ()I
    //   920: istore #5
    //   922: aload_3
    //   923: getfield a : Ljava/util/Map;
    //   926: ldc 'android:changeBounds:windowX'
    //   928: invokeinterface get : (Ljava/lang/Object;)Ljava/lang/Object;
    //   933: checkcast java/lang/Integer
    //   936: invokevirtual intValue : ()I
    //   939: istore #8
    //   941: aload_3
    //   942: getfield a : Ljava/util/Map;
    //   945: ldc 'android:changeBounds:windowY'
    //   947: invokeinterface get : (Ljava/lang/Object;)Ljava/lang/Object;
    //   952: checkcast java/lang/Integer
    //   955: invokevirtual intValue : ()I
    //   958: istore #7
    //   960: iload #6
    //   962: iload #8
    //   964: if_icmpne -> 979
    //   967: iload #5
    //   969: iload #7
    //   971: if_icmpeq -> 977
    //   974: goto -> 979
    //   977: aconst_null
    //   978: areturn
    //   979: aload_1
    //   980: aload_0
    //   981: getfield J : [I
    //   984: invokevirtual getLocationInWindow : ([I)V
    //   987: aload #20
    //   989: invokevirtual getWidth : ()I
    //   992: aload #20
    //   994: invokevirtual getHeight : ()I
    //   997: getstatic android/graphics/Bitmap$Config.ARGB_8888 : Landroid/graphics/Bitmap$Config;
    //   1000: invokestatic createBitmap : (IILandroid/graphics/Bitmap$Config;)Landroid/graphics/Bitmap;
    //   1003: astore_2
    //   1004: aload #20
    //   1006: new android/graphics/Canvas
    //   1009: dup
    //   1010: aload_2
    //   1011: invokespecial <init> : (Landroid/graphics/Bitmap;)V
    //   1014: invokevirtual draw : (Landroid/graphics/Canvas;)V
    //   1017: new android/graphics/drawable/BitmapDrawable
    //   1020: dup
    //   1021: aload_2
    //   1022: invokespecial <init> : (Landroid/graphics/Bitmap;)V
    //   1025: astore_2
    //   1026: aload #20
    //   1028: invokestatic b : (Landroid/view/View;)F
    //   1031: fstore #4
    //   1033: getstatic b/t/v.a : Lb/t/b0;
    //   1036: aload #20
    //   1038: fconst_0
    //   1039: invokevirtual e : (Landroid/view/View;F)V
    //   1042: aload_1
    //   1043: invokevirtual getOverlay : ()Landroid/view/ViewOverlay;
    //   1046: aload_2
    //   1047: invokevirtual add : (Landroid/graphics/drawable/Drawable;)V
    //   1050: aload_0
    //   1051: getfield F : Lb/t/e;
    //   1054: astore #19
    //   1056: aload_0
    //   1057: getfield J : [I
    //   1060: astore_3
    //   1061: aload #19
    //   1063: iload #6
    //   1065: aload_3
    //   1066: iconst_0
    //   1067: iaload
    //   1068: isub
    //   1069: i2f
    //   1070: iload #5
    //   1072: aload_3
    //   1073: iconst_1
    //   1074: iaload
    //   1075: isub
    //   1076: i2f
    //   1077: iload #8
    //   1079: aload_3
    //   1080: iconst_0
    //   1081: iaload
    //   1082: isub
    //   1083: i2f
    //   1084: iload #7
    //   1086: aload_3
    //   1087: iconst_1
    //   1088: iaload
    //   1089: isub
    //   1090: i2f
    //   1091: invokevirtual a : (FFFF)Landroid/graphics/Path;
    //   1094: astore_3
    //   1095: aload_2
    //   1096: iconst_1
    //   1097: anewarray android/animation/PropertyValuesHolder
    //   1100: dup
    //   1101: iconst_0
    //   1102: getstatic b/t/b.N : Landroid/util/Property;
    //   1105: aconst_null
    //   1106: aload_3
    //   1107: invokestatic ofObject : (Landroid/util/Property;Landroid/animation/TypeConverter;Landroid/graphics/Path;)Landroid/animation/PropertyValuesHolder;
    //   1110: aastore
    //   1111: invokestatic ofPropertyValuesHolder : (Ljava/lang/Object;[Landroid/animation/PropertyValuesHolder;)Landroid/animation/ObjectAnimator;
    //   1114: astore_3
    //   1115: aload_3
    //   1116: new b/t/b$a
    //   1119: dup
    //   1120: aload_0
    //   1121: aload_1
    //   1122: aload_2
    //   1123: aload #20
    //   1125: fload #4
    //   1127: invokespecial <init> : (Lb/t/b;Landroid/view/ViewGroup;Landroid/graphics/drawable/BitmapDrawable;Landroid/view/View;F)V
    //   1130: invokevirtual addListener : (Landroid/animation/Animator$AnimatorListener;)V
    //   1133: aload_3
    //   1134: areturn
    //   1135: aconst_null
    //   1136: areturn
    //   1137: aconst_null
    //   1138: areturn
  }
  
  public String[] q() {
    return M;
  }
  
  public class a extends AnimatorListenerAdapter {
    public final ViewGroup a;
    
    public final BitmapDrawable b;
    
    public final View c;
    
    public final float d;
    
    public a(b this$0, ViewGroup param1ViewGroup, BitmapDrawable param1BitmapDrawable, View param1View, float param1Float) {}
    
    public void onAnimationEnd(Animator param1Animator) {
      u u = v.a((View)this.a);
      BitmapDrawable bitmapDrawable = this.b;
      ((t)u).a.remove((Drawable)bitmapDrawable);
      View view = this.c;
      float f = this.d;
      v.a.e(view, f);
    }
  }
  
  public static final class b extends Property<Drawable, PointF> {
    public Rect a = new Rect();
    
    public b(Class param1Class, String param1String) {
      super(param1Class, param1String);
    }
    
    public Object get(Object param1Object) {
      ((Drawable)param1Object).copyBounds(this.a);
      param1Object = this.a;
      return new PointF(((Rect)param1Object).left, ((Rect)param1Object).top);
    }
    
    public void set(Object param1Object1, Object param1Object2) {
      param1Object1 = param1Object1;
      param1Object2 = param1Object2;
      param1Object1.copyBounds(this.a);
      this.a.offsetTo(Math.round(((PointF)param1Object2).x), Math.round(((PointF)param1Object2).y));
      param1Object1.setBounds(this.a);
    }
  }
  
  public static final class c extends Property<k, PointF> {
    public c(Class param1Class, String param1String) {
      super(param1Class, param1String);
    }
    
    public Object get(Object param1Object) {
      param1Object = param1Object;
      return null;
    }
    
    public void set(Object param1Object1, Object param1Object2) {
      param1Object1 = param1Object1;
      param1Object2 = param1Object2;
      if (param1Object1 != null) {
        ((b.k)param1Object1).a = Math.round(((PointF)param1Object2).x);
        int i = Math.round(((PointF)param1Object2).y);
        ((b.k)param1Object1).b = i;
        int j = ((b.k)param1Object1).f + 1;
        ((b.k)param1Object1).f = j;
        if (j == ((b.k)param1Object1).g) {
          v.d(((b.k)param1Object1).e, ((b.k)param1Object1).a, i, ((b.k)param1Object1).c, ((b.k)param1Object1).d);
          ((b.k)param1Object1).f = 0;
          ((b.k)param1Object1).g = 0;
        } 
        return;
      } 
      throw null;
    }
  }
  
  public static final class d extends Property<k, PointF> {
    public d(Class param1Class, String param1String) {
      super(param1Class, param1String);
    }
    
    public Object get(Object param1Object) {
      param1Object = param1Object;
      return null;
    }
    
    public void set(Object param1Object1, Object param1Object2) {
      param1Object1 = param1Object1;
      param1Object2 = param1Object2;
      if (param1Object1 != null) {
        ((b.k)param1Object1).c = Math.round(((PointF)param1Object2).x);
        int j = Math.round(((PointF)param1Object2).y);
        ((b.k)param1Object1).d = j;
        int i = ((b.k)param1Object1).g + 1;
        ((b.k)param1Object1).g = i;
        if (((b.k)param1Object1).f == i) {
          v.d(((b.k)param1Object1).e, ((b.k)param1Object1).a, ((b.k)param1Object1).b, ((b.k)param1Object1).c, j);
          ((b.k)param1Object1).f = 0;
          ((b.k)param1Object1).g = 0;
        } 
        return;
      } 
      throw null;
    }
  }
  
  public static final class e extends Property<View, PointF> {
    public e(Class param1Class, String param1String) {
      super(param1Class, param1String);
    }
    
    public Object get(Object param1Object) {
      param1Object = param1Object;
      return null;
    }
    
    public void set(Object param1Object1, Object param1Object2) {
      param1Object1 = param1Object1;
      param1Object2 = param1Object2;
      v.d((View)param1Object1, param1Object1.getLeft(), param1Object1.getTop(), Math.round(((PointF)param1Object2).x), Math.round(((PointF)param1Object2).y));
    }
  }
  
  public static final class f extends Property<View, PointF> {
    public f(Class param1Class, String param1String) {
      super(param1Class, param1String);
    }
    
    public Object get(Object param1Object) {
      param1Object = param1Object;
      return null;
    }
    
    public void set(Object param1Object1, Object param1Object2) {
      param1Object1 = param1Object1;
      param1Object2 = param1Object2;
      v.d((View)param1Object1, Math.round(((PointF)param1Object2).x), Math.round(((PointF)param1Object2).y), param1Object1.getRight(), param1Object1.getBottom());
    }
  }
  
  public static final class g extends Property<View, PointF> {
    public g(Class param1Class, String param1String) {
      super(param1Class, param1String);
    }
    
    public Object get(Object param1Object) {
      param1Object = param1Object;
      return null;
    }
    
    public void set(Object param1Object1, Object param1Object2) {
      param1Object1 = param1Object1;
      param1Object2 = param1Object2;
      int i = Math.round(((PointF)param1Object2).x);
      int j = Math.round(((PointF)param1Object2).y);
      v.d((View)param1Object1, i, j, param1Object1.getWidth() + i, param1Object1.getHeight() + j);
    }
  }
  
  public class h extends AnimatorListenerAdapter {
    public final b.k a;
    
    public b.k mViewBounds = this.a;
    
    public h(b this$0, b.k param1k) {}
  }
  
  public class i extends AnimatorListenerAdapter {
    public boolean a;
    
    public final View b;
    
    public final Rect c;
    
    public final int d;
    
    public final int e;
    
    public final int f;
    
    public final int g;
    
    public i(b this$0, View param1View, Rect param1Rect, int param1Int1, int param1Int2, int param1Int3, int param1Int4) {}
    
    public void onAnimationCancel(Animator param1Animator) {
      this.a = true;
    }
    
    public void onAnimationEnd(Animator param1Animator) {
      if (!this.a) {
        l.a0(this.b, this.c);
        v.d(this.b, this.d, this.e, this.f, this.g);
      } 
    }
  }
  
  public class j extends l {
    public boolean a = false;
    
    public final ViewGroup b;
    
    public j(b this$0, ViewGroup param1ViewGroup) {}
    
    public void b(i param1i) {
      s.a(this.b, false);
      this.a = true;
    }
    
    public void c(i param1i) {
      if (!this.a)
        s.a(this.b, false); 
      param1i.w(this);
    }
    
    public void d(i param1i) {
      s.a(this.b, false);
    }
    
    public void e(i param1i) {
      s.a(this.b, true);
    }
  }
  
  public static class k {
    public int a;
    
    public int b;
    
    public int c;
    
    public int d;
    
    public View e;
    
    public int f;
    
    public int g;
    
    public k(View param1View) {
      this.e = param1View;
    }
  }
}


/* Location:              C:\Users\panch\Downloads\dvba_v1.1.0-dex2jar.jar!\b\t\b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */