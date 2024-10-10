package com.google.android.material.chip;

import android.annotation.TargetApi;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.InsetDrawable;
import android.graphics.drawable.RippleDrawable;
import android.os.Bundle;
import android.text.TextPaint;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.Log;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.PointerIcon;
import android.view.View;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.TextView;
import b.b.p.g;
import b.i.m.l;
import c.c.a.a.c.l.q;
import c.c.a.b.a0.d;
import c.c.a.b.d0.g;
import c.c.a.b.d0.j;
import c.c.a.b.d0.n;
import c.c.a.b.i;
import c.c.a.b.l.g;
import c.c.a.b.s.b;
import java.lang.ref.WeakReference;
import java.util.List;

public class Chip extends g implements b.a, n {
  public static final Rect u = new Rect();
  
  public static final int[] v = new int[] { 16842913 };
  
  public static final int[] w = new int[] { 16842911 };
  
  public b e;
  
  public InsetDrawable f;
  
  public RippleDrawable g;
  
  public View.OnClickListener h;
  
  public CompoundButton.OnCheckedChangeListener i;
  
  public boolean j;
  
  public boolean k;
  
  public boolean l;
  
  public boolean m;
  
  public boolean n;
  
  public int o;
  
  public int p;
  
  public final b q;
  
  public final Rect r;
  
  public final RectF s;
  
  public final d t;
  
  public Chip(Context paramContext, AttributeSet paramAttributeSet) {
    // Byte code:
    //   0: getstatic c/c/a/b/b.chipStyle : I
    //   3: istore #4
    //   5: aload_0
    //   6: aload_1
    //   7: aload_2
    //   8: iload #4
    //   10: invokespecial <init> : (Landroid/content/Context;Landroid/util/AttributeSet;I)V
    //   13: aload_0
    //   14: new android/graphics/Rect
    //   17: dup
    //   18: invokespecial <init> : ()V
    //   21: putfield r : Landroid/graphics/Rect;
    //   24: aload_0
    //   25: new android/graphics/RectF
    //   28: dup
    //   29: invokespecial <init> : ()V
    //   32: putfield s : Landroid/graphics/RectF;
    //   35: aload_0
    //   36: new com/google/android/material/chip/Chip$a
    //   39: dup
    //   40: aload_0
    //   41: invokespecial <init> : (Lcom/google/android/material/chip/Chip;)V
    //   44: putfield t : Lc/c/a/b/a0/d;
    //   47: aload_2
    //   48: ifnonnull -> 54
    //   51: goto -> 211
    //   54: aload_2
    //   55: ldc 'http://schemas.android.com/apk/res/android'
    //   57: ldc 'background'
    //   59: invokeinterface getAttributeValue : (Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    //   64: ifnull -> 75
    //   67: ldc 'Chip'
    //   69: ldc 'Do not set the background; Chip manages its own background drawable.'
    //   71: invokestatic w : (Ljava/lang/String;Ljava/lang/String;)I
    //   74: pop
    //   75: aload_2
    //   76: ldc 'http://schemas.android.com/apk/res/android'
    //   78: ldc 'drawableLeft'
    //   80: invokeinterface getAttributeValue : (Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    //   85: ifnonnull -> 1374
    //   88: aload_2
    //   89: ldc 'http://schemas.android.com/apk/res/android'
    //   91: ldc 'drawableStart'
    //   93: invokeinterface getAttributeValue : (Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    //   98: ifnonnull -> 1363
    //   101: aload_2
    //   102: ldc 'http://schemas.android.com/apk/res/android'
    //   104: ldc 'drawableEnd'
    //   106: invokeinterface getAttributeValue : (Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    //   111: ifnonnull -> 1352
    //   114: aload_2
    //   115: ldc 'http://schemas.android.com/apk/res/android'
    //   117: ldc 'drawableRight'
    //   119: invokeinterface getAttributeValue : (Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    //   124: ifnonnull -> 1341
    //   127: aload_2
    //   128: ldc 'http://schemas.android.com/apk/res/android'
    //   130: ldc 'singleLine'
    //   132: iconst_1
    //   133: invokeinterface getAttributeBooleanValue : (Ljava/lang/String;Ljava/lang/String;Z)Z
    //   138: ifeq -> 1330
    //   141: aload_2
    //   142: ldc 'http://schemas.android.com/apk/res/android'
    //   144: ldc 'lines'
    //   146: iconst_1
    //   147: invokeinterface getAttributeIntValue : (Ljava/lang/String;Ljava/lang/String;I)I
    //   152: iconst_1
    //   153: if_icmpne -> 1330
    //   156: aload_2
    //   157: ldc 'http://schemas.android.com/apk/res/android'
    //   159: ldc 'minLines'
    //   161: iconst_1
    //   162: invokeinterface getAttributeIntValue : (Ljava/lang/String;Ljava/lang/String;I)I
    //   167: iconst_1
    //   168: if_icmpne -> 1330
    //   171: aload_2
    //   172: ldc 'http://schemas.android.com/apk/res/android'
    //   174: ldc 'maxLines'
    //   176: iconst_1
    //   177: invokeinterface getAttributeIntValue : (Ljava/lang/String;Ljava/lang/String;I)I
    //   182: iconst_1
    //   183: if_icmpne -> 1330
    //   186: aload_2
    //   187: ldc 'http://schemas.android.com/apk/res/android'
    //   189: ldc 'gravity'
    //   191: ldc 8388627
    //   193: invokeinterface getAttributeIntValue : (Ljava/lang/String;Ljava/lang/String;I)I
    //   198: ldc 8388627
    //   200: if_icmpeq -> 211
    //   203: ldc 'Chip'
    //   205: ldc 'Chip text must be vertically center and start aligned'
    //   207: invokestatic w : (Ljava/lang/String;Ljava/lang/String;)I
    //   210: pop
    //   211: getstatic c/c/a/b/j.Widget_MaterialComponents_Chip_Action : I
    //   214: istore #5
    //   216: new c/c/a/b/s/b
    //   219: dup
    //   220: aload_1
    //   221: aload_2
    //   222: iload #4
    //   224: iload #5
    //   226: invokespecial <init> : (Landroid/content/Context;Landroid/util/AttributeSet;II)V
    //   229: astore #8
    //   231: aload #8
    //   233: getfield d0 : Landroid/content/Context;
    //   236: aload_2
    //   237: getstatic c/c/a/b/k.Chip : [I
    //   240: iload #4
    //   242: iload #5
    //   244: iconst_0
    //   245: newarray int
    //   247: invokestatic e : (Landroid/content/Context;Landroid/util/AttributeSet;[III[I)Landroid/content/res/TypedArray;
    //   250: astore #9
    //   252: aload #8
    //   254: aload #9
    //   256: getstatic c/c/a/b/k.Chip_shapeAppearance : I
    //   259: invokevirtual hasValue : (I)Z
    //   262: putfield F0 : Z
    //   265: aload #8
    //   267: getfield d0 : Landroid/content/Context;
    //   270: aload #9
    //   272: getstatic c/c/a/b/k.Chip_chipSurfaceColor : I
    //   275: invokestatic z : (Landroid/content/Context;Landroid/content/res/TypedArray;I)Landroid/content/res/ColorStateList;
    //   278: astore #7
    //   280: aload #8
    //   282: getfield x : Landroid/content/res/ColorStateList;
    //   285: aload #7
    //   287: if_acmpeq -> 308
    //   290: aload #8
    //   292: aload #7
    //   294: putfield x : Landroid/content/res/ColorStateList;
    //   297: aload #8
    //   299: aload #8
    //   301: invokevirtual getState : ()[I
    //   304: invokevirtual onStateChange : ([I)Z
    //   307: pop
    //   308: aload #8
    //   310: aload #8
    //   312: getfield d0 : Landroid/content/Context;
    //   315: aload #9
    //   317: getstatic c/c/a/b/k.Chip_chipBackgroundColor : I
    //   320: invokestatic z : (Landroid/content/Context;Landroid/content/res/TypedArray;I)Landroid/content/res/ColorStateList;
    //   323: invokevirtual N : (Landroid/content/res/ColorStateList;)V
    //   326: aload #8
    //   328: aload #9
    //   330: getstatic c/c/a/b/k.Chip_chipMinHeight : I
    //   333: fconst_0
    //   334: invokevirtual getDimension : (IF)F
    //   337: invokevirtual U : (F)V
    //   340: aload #9
    //   342: getstatic c/c/a/b/k.Chip_chipCornerRadius : I
    //   345: invokevirtual hasValue : (I)Z
    //   348: ifeq -> 365
    //   351: aload #8
    //   353: aload #9
    //   355: getstatic c/c/a/b/k.Chip_chipCornerRadius : I
    //   358: fconst_0
    //   359: invokevirtual getDimension : (IF)F
    //   362: invokevirtual O : (F)V
    //   365: aload #8
    //   367: aload #8
    //   369: getfield d0 : Landroid/content/Context;
    //   372: aload #9
    //   374: getstatic c/c/a/b/k.Chip_chipStrokeColor : I
    //   377: invokestatic z : (Landroid/content/Context;Landroid/content/res/TypedArray;I)Landroid/content/res/ColorStateList;
    //   380: invokevirtual W : (Landroid/content/res/ColorStateList;)V
    //   383: aload #8
    //   385: aload #9
    //   387: getstatic c/c/a/b/k.Chip_chipStrokeWidth : I
    //   390: fconst_0
    //   391: invokevirtual getDimension : (IF)F
    //   394: invokevirtual X : (F)V
    //   397: aload #8
    //   399: aload #8
    //   401: getfield d0 : Landroid/content/Context;
    //   404: aload #9
    //   406: getstatic c/c/a/b/k.Chip_rippleColor : I
    //   409: invokestatic z : (Landroid/content/Context;Landroid/content/res/TypedArray;I)Landroid/content/res/ColorStateList;
    //   412: invokevirtual h0 : (Landroid/content/res/ColorStateList;)V
    //   415: aload #8
    //   417: aload #9
    //   419: getstatic c/c/a/b/k.Chip_android_text : I
    //   422: invokevirtual getText : (I)Ljava/lang/CharSequence;
    //   425: invokevirtual i0 : (Ljava/lang/CharSequence;)V
    //   428: aload #8
    //   430: getfield d0 : Landroid/content/Context;
    //   433: astore #7
    //   435: getstatic c/c/a/b/k.Chip_android_textAppearance : I
    //   438: istore #5
    //   440: aload #9
    //   442: iload #5
    //   444: invokevirtual hasValue : (I)Z
    //   447: ifeq -> 481
    //   450: aload #9
    //   452: iload #5
    //   454: iconst_0
    //   455: invokevirtual getResourceId : (II)I
    //   458: istore #5
    //   460: iload #5
    //   462: ifeq -> 481
    //   465: new c/c/a/b/a0/b
    //   468: dup
    //   469: aload #7
    //   471: iload #5
    //   473: invokespecial <init> : (Landroid/content/Context;I)V
    //   476: astore #7
    //   478: goto -> 484
    //   481: aconst_null
    //   482: astore #7
    //   484: aload #8
    //   486: aload #7
    //   488: invokevirtual j0 : (Lc/c/a/b/a0/b;)V
    //   491: aload #9
    //   493: getstatic c/c/a/b/k.Chip_android_ellipsize : I
    //   496: iconst_0
    //   497: invokevirtual getInt : (II)I
    //   500: istore #5
    //   502: iload #5
    //   504: iconst_1
    //   505: if_icmpeq -> 539
    //   508: iload #5
    //   510: iconst_2
    //   511: if_icmpeq -> 531
    //   514: iload #5
    //   516: iconst_3
    //   517: if_icmpeq -> 523
    //   520: goto -> 551
    //   523: getstatic android/text/TextUtils$TruncateAt.END : Landroid/text/TextUtils$TruncateAt;
    //   526: astore #7
    //   528: goto -> 544
    //   531: getstatic android/text/TextUtils$TruncateAt.MIDDLE : Landroid/text/TextUtils$TruncateAt;
    //   534: astore #7
    //   536: goto -> 544
    //   539: getstatic android/text/TextUtils$TruncateAt.START : Landroid/text/TextUtils$TruncateAt;
    //   542: astore #7
    //   544: aload #8
    //   546: aload #7
    //   548: putfield C0 : Landroid/text/TextUtils$TruncateAt;
    //   551: aload #8
    //   553: aload #9
    //   555: getstatic c/c/a/b/k.Chip_chipIconVisible : I
    //   558: iconst_0
    //   559: invokevirtual getBoolean : (IZ)Z
    //   562: invokevirtual T : (Z)V
    //   565: aload_2
    //   566: ifnull -> 613
    //   569: aload_2
    //   570: ldc_w 'http://schemas.android.com/apk/res-auto'
    //   573: ldc_w 'chipIconEnabled'
    //   576: invokeinterface getAttributeValue : (Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    //   581: ifnull -> 613
    //   584: aload_2
    //   585: ldc_w 'http://schemas.android.com/apk/res-auto'
    //   588: ldc_w 'chipIconVisible'
    //   591: invokeinterface getAttributeValue : (Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    //   596: ifnonnull -> 613
    //   599: aload #8
    //   601: aload #9
    //   603: getstatic c/c/a/b/k.Chip_chipIconEnabled : I
    //   606: iconst_0
    //   607: invokevirtual getBoolean : (IZ)Z
    //   610: invokevirtual T : (Z)V
    //   613: aload #8
    //   615: aload #8
    //   617: getfield d0 : Landroid/content/Context;
    //   620: aload #9
    //   622: getstatic c/c/a/b/k.Chip_chipIcon : I
    //   625: invokestatic C : (Landroid/content/Context;Landroid/content/res/TypedArray;I)Landroid/graphics/drawable/Drawable;
    //   628: invokevirtual Q : (Landroid/graphics/drawable/Drawable;)V
    //   631: aload #9
    //   633: getstatic c/c/a/b/k.Chip_chipIconTint : I
    //   636: invokevirtual hasValue : (I)Z
    //   639: ifeq -> 660
    //   642: aload #8
    //   644: aload #8
    //   646: getfield d0 : Landroid/content/Context;
    //   649: aload #9
    //   651: getstatic c/c/a/b/k.Chip_chipIconTint : I
    //   654: invokestatic z : (Landroid/content/Context;Landroid/content/res/TypedArray;I)Landroid/content/res/ColorStateList;
    //   657: invokevirtual S : (Landroid/content/res/ColorStateList;)V
    //   660: aload #8
    //   662: aload #9
    //   664: getstatic c/c/a/b/k.Chip_chipIconSize : I
    //   667: fconst_0
    //   668: invokevirtual getDimension : (IF)F
    //   671: invokevirtual R : (F)V
    //   674: aload #8
    //   676: aload #9
    //   678: getstatic c/c/a/b/k.Chip_closeIconVisible : I
    //   681: iconst_0
    //   682: invokevirtual getBoolean : (IZ)Z
    //   685: invokevirtual e0 : (Z)V
    //   688: aload_2
    //   689: ifnull -> 736
    //   692: aload_2
    //   693: ldc_w 'http://schemas.android.com/apk/res-auto'
    //   696: ldc_w 'closeIconEnabled'
    //   699: invokeinterface getAttributeValue : (Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    //   704: ifnull -> 736
    //   707: aload_2
    //   708: ldc_w 'http://schemas.android.com/apk/res-auto'
    //   711: ldc_w 'closeIconVisible'
    //   714: invokeinterface getAttributeValue : (Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    //   719: ifnonnull -> 736
    //   722: aload #8
    //   724: aload #9
    //   726: getstatic c/c/a/b/k.Chip_closeIconEnabled : I
    //   729: iconst_0
    //   730: invokevirtual getBoolean : (IZ)Z
    //   733: invokevirtual e0 : (Z)V
    //   736: aload #8
    //   738: aload #8
    //   740: getfield d0 : Landroid/content/Context;
    //   743: aload #9
    //   745: getstatic c/c/a/b/k.Chip_closeIcon : I
    //   748: invokestatic C : (Landroid/content/Context;Landroid/content/res/TypedArray;I)Landroid/graphics/drawable/Drawable;
    //   751: invokevirtual Y : (Landroid/graphics/drawable/Drawable;)V
    //   754: aload #8
    //   756: aload #8
    //   758: getfield d0 : Landroid/content/Context;
    //   761: aload #9
    //   763: getstatic c/c/a/b/k.Chip_closeIconTint : I
    //   766: invokestatic z : (Landroid/content/Context;Landroid/content/res/TypedArray;I)Landroid/content/res/ColorStateList;
    //   769: invokevirtual d0 : (Landroid/content/res/ColorStateList;)V
    //   772: aload #8
    //   774: aload #9
    //   776: getstatic c/c/a/b/k.Chip_closeIconSize : I
    //   779: fconst_0
    //   780: invokevirtual getDimension : (IF)F
    //   783: invokevirtual a0 : (F)V
    //   786: aload #8
    //   788: aload #9
    //   790: getstatic c/c/a/b/k.Chip_android_checkable : I
    //   793: iconst_0
    //   794: invokevirtual getBoolean : (IZ)Z
    //   797: invokevirtual K : (Z)V
    //   800: aload #8
    //   802: aload #9
    //   804: getstatic c/c/a/b/k.Chip_checkedIconVisible : I
    //   807: iconst_0
    //   808: invokevirtual getBoolean : (IZ)Z
    //   811: invokevirtual M : (Z)V
    //   814: aload_2
    //   815: ifnull -> 862
    //   818: aload_2
    //   819: ldc_w 'http://schemas.android.com/apk/res-auto'
    //   822: ldc_w 'checkedIconEnabled'
    //   825: invokeinterface getAttributeValue : (Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    //   830: ifnull -> 862
    //   833: aload_2
    //   834: ldc_w 'http://schemas.android.com/apk/res-auto'
    //   837: ldc_w 'checkedIconVisible'
    //   840: invokeinterface getAttributeValue : (Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    //   845: ifnonnull -> 862
    //   848: aload #8
    //   850: aload #9
    //   852: getstatic c/c/a/b/k.Chip_checkedIconEnabled : I
    //   855: iconst_0
    //   856: invokevirtual getBoolean : (IZ)Z
    //   859: invokevirtual M : (Z)V
    //   862: aload #8
    //   864: aload #8
    //   866: getfield d0 : Landroid/content/Context;
    //   869: aload #9
    //   871: getstatic c/c/a/b/k.Chip_checkedIcon : I
    //   874: invokestatic C : (Landroid/content/Context;Landroid/content/res/TypedArray;I)Landroid/graphics/drawable/Drawable;
    //   877: invokevirtual L : (Landroid/graphics/drawable/Drawable;)V
    //   880: aload #8
    //   882: aload #8
    //   884: getfield d0 : Landroid/content/Context;
    //   887: aload #9
    //   889: getstatic c/c/a/b/k.Chip_showMotionSpec : I
    //   892: invokestatic a : (Landroid/content/Context;Landroid/content/res/TypedArray;I)Lc/c/a/b/l/g;
    //   895: putfield T : Lc/c/a/b/l/g;
    //   898: aload #8
    //   900: aload #8
    //   902: getfield d0 : Landroid/content/Context;
    //   905: aload #9
    //   907: getstatic c/c/a/b/k.Chip_hideMotionSpec : I
    //   910: invokestatic a : (Landroid/content/Context;Landroid/content/res/TypedArray;I)Lc/c/a/b/l/g;
    //   913: putfield U : Lc/c/a/b/l/g;
    //   916: aload #8
    //   918: aload #9
    //   920: getstatic c/c/a/b/k.Chip_chipStartPadding : I
    //   923: fconst_0
    //   924: invokevirtual getDimension : (IF)F
    //   927: invokevirtual V : (F)V
    //   930: aload #8
    //   932: aload #9
    //   934: getstatic c/c/a/b/k.Chip_iconStartPadding : I
    //   937: fconst_0
    //   938: invokevirtual getDimension : (IF)F
    //   941: invokevirtual g0 : (F)V
    //   944: aload #8
    //   946: aload #9
    //   948: getstatic c/c/a/b/k.Chip_iconEndPadding : I
    //   951: fconst_0
    //   952: invokevirtual getDimension : (IF)F
    //   955: invokevirtual f0 : (F)V
    //   958: aload #8
    //   960: aload #9
    //   962: getstatic c/c/a/b/k.Chip_textStartPadding : I
    //   965: fconst_0
    //   966: invokevirtual getDimension : (IF)F
    //   969: invokevirtual l0 : (F)V
    //   972: aload #8
    //   974: aload #9
    //   976: getstatic c/c/a/b/k.Chip_textEndPadding : I
    //   979: fconst_0
    //   980: invokevirtual getDimension : (IF)F
    //   983: invokevirtual k0 : (F)V
    //   986: aload #8
    //   988: aload #9
    //   990: getstatic c/c/a/b/k.Chip_closeIconStartPadding : I
    //   993: fconst_0
    //   994: invokevirtual getDimension : (IF)F
    //   997: invokevirtual b0 : (F)V
    //   1000: aload #8
    //   1002: aload #9
    //   1004: getstatic c/c/a/b/k.Chip_closeIconEndPadding : I
    //   1007: fconst_0
    //   1008: invokevirtual getDimension : (IF)F
    //   1011: invokevirtual Z : (F)V
    //   1014: aload #8
    //   1016: aload #9
    //   1018: getstatic c/c/a/b/k.Chip_chipEndPadding : I
    //   1021: fconst_0
    //   1022: invokevirtual getDimension : (IF)F
    //   1025: invokevirtual P : (F)V
    //   1028: aload #8
    //   1030: aload #9
    //   1032: getstatic c/c/a/b/k.Chip_android_maxWidth : I
    //   1035: ldc_w 2147483647
    //   1038: invokevirtual getDimensionPixelSize : (II)I
    //   1041: putfield E0 : I
    //   1044: aload #9
    //   1046: invokevirtual recycle : ()V
    //   1049: aload_1
    //   1050: aload_2
    //   1051: getstatic c/c/a/b/k.Chip : [I
    //   1054: iload #4
    //   1056: getstatic c/c/a/b/j.Widget_MaterialComponents_Chip_Action : I
    //   1059: iconst_0
    //   1060: newarray int
    //   1062: invokestatic e : (Landroid/content/Context;Landroid/util/AttributeSet;[III[I)Landroid/content/res/TypedArray;
    //   1065: astore #9
    //   1067: aload_0
    //   1068: aload #9
    //   1070: getstatic c/c/a/b/k.Chip_ensureMinTouchTargetSize : I
    //   1073: iconst_0
    //   1074: invokevirtual getBoolean : (IZ)Z
    //   1077: putfield n : Z
    //   1080: aload_0
    //   1081: invokevirtual getContext : ()Landroid/content/Context;
    //   1084: invokevirtual getResources : ()Landroid/content/res/Resources;
    //   1087: astore #7
    //   1089: iconst_1
    //   1090: bipush #48
    //   1092: i2f
    //   1093: aload #7
    //   1095: invokevirtual getDisplayMetrics : ()Landroid/util/DisplayMetrics;
    //   1098: invokestatic applyDimension : (IFLandroid/util/DisplayMetrics;)F
    //   1101: f2d
    //   1102: invokestatic ceil : (D)D
    //   1105: d2f
    //   1106: fstore_3
    //   1107: aload_0
    //   1108: aload #9
    //   1110: getstatic c/c/a/b/k.Chip_chipMinTouchTargetSize : I
    //   1113: fload_3
    //   1114: invokevirtual getDimension : (IF)F
    //   1117: f2d
    //   1118: invokestatic ceil : (D)D
    //   1121: d2i
    //   1122: putfield p : I
    //   1125: aload #9
    //   1127: invokevirtual recycle : ()V
    //   1130: aload_0
    //   1131: aload #8
    //   1133: invokevirtual setChipDrawable : (Lc/c/a/b/s/b;)V
    //   1136: aload #8
    //   1138: aload_0
    //   1139: invokevirtual getElevation : ()F
    //   1142: invokevirtual p : (F)V
    //   1145: aload_1
    //   1146: aload_2
    //   1147: getstatic c/c/a/b/k.Chip : [I
    //   1150: iload #4
    //   1152: getstatic c/c/a/b/j.Widget_MaterialComponents_Chip_Action : I
    //   1155: iconst_0
    //   1156: newarray int
    //   1158: invokestatic e : (Landroid/content/Context;Landroid/util/AttributeSet;[III[I)Landroid/content/res/TypedArray;
    //   1161: astore_2
    //   1162: getstatic android/os/Build$VERSION.SDK_INT : I
    //   1165: bipush #23
    //   1167: if_icmpge -> 1182
    //   1170: aload_0
    //   1171: aload_1
    //   1172: aload_2
    //   1173: getstatic c/c/a/b/k.Chip_android_textColor : I
    //   1176: invokestatic z : (Landroid/content/Context;Landroid/content/res/TypedArray;I)Landroid/content/res/ColorStateList;
    //   1179: invokevirtual setTextColor : (Landroid/content/res/ColorStateList;)V
    //   1182: aload_2
    //   1183: getstatic c/c/a/b/k.Chip_shapeAppearance : I
    //   1186: invokevirtual hasValue : (I)Z
    //   1189: istore #6
    //   1191: aload_2
    //   1192: invokevirtual recycle : ()V
    //   1195: new com/google/android/material/chip/Chip$b
    //   1198: dup
    //   1199: aload_0
    //   1200: aload_0
    //   1201: invokespecial <init> : (Lcom/google/android/material/chip/Chip;Lcom/google/android/material/chip/Chip;)V
    //   1204: astore_1
    //   1205: aload_0
    //   1206: aload_1
    //   1207: putfield q : Lcom/google/android/material/chip/Chip$b;
    //   1210: getstatic android/os/Build$VERSION.SDK_INT : I
    //   1213: bipush #24
    //   1215: if_icmplt -> 1226
    //   1218: aload_0
    //   1219: aload_1
    //   1220: invokestatic W : (Landroid/view/View;Lb/i/m/a;)V
    //   1223: goto -> 1230
    //   1226: aload_0
    //   1227: invokevirtual i : ()V
    //   1230: iload #6
    //   1232: ifne -> 1247
    //   1235: aload_0
    //   1236: new c/c/a/b/s/a
    //   1239: dup
    //   1240: aload_0
    //   1241: invokespecial <init> : (Lcom/google/android/material/chip/Chip;)V
    //   1244: invokevirtual setOutlineProvider : (Landroid/view/ViewOutlineProvider;)V
    //   1247: aload_0
    //   1248: aload_0
    //   1249: getfield j : Z
    //   1252: invokevirtual setChecked : (Z)V
    //   1255: aload_0
    //   1256: aload #8
    //   1258: getfield E : Ljava/lang/CharSequence;
    //   1261: invokevirtual setText : (Ljava/lang/CharSequence;)V
    //   1264: aload_0
    //   1265: aload #8
    //   1267: getfield C0 : Landroid/text/TextUtils$TruncateAt;
    //   1270: invokevirtual setEllipsize : (Landroid/text/TextUtils$TruncateAt;)V
    //   1273: aload_0
    //   1274: iconst_0
    //   1275: invokevirtual setIncludeFontPadding : (Z)V
    //   1278: aload_0
    //   1279: invokevirtual l : ()V
    //   1282: aload_0
    //   1283: getfield e : Lc/c/a/b/s/b;
    //   1286: getfield D0 : Z
    //   1289: ifne -> 1296
    //   1292: aload_0
    //   1293: invokevirtual setSingleLine : ()V
    //   1296: aload_0
    //   1297: ldc 8388627
    //   1299: invokevirtual setGravity : (I)V
    //   1302: aload_0
    //   1303: invokevirtual k : ()V
    //   1306: aload_0
    //   1307: getfield n : Z
    //   1310: ifeq -> 1321
    //   1313: aload_0
    //   1314: aload_0
    //   1315: getfield p : I
    //   1318: invokevirtual setMinHeight : (I)V
    //   1321: aload_0
    //   1322: aload_0
    //   1323: invokevirtual getLayoutDirection : ()I
    //   1326: putfield o : I
    //   1329: return
    //   1330: new java/lang/UnsupportedOperationException
    //   1333: dup
    //   1334: ldc_w 'Chip does not support multi-line text'
    //   1337: invokespecial <init> : (Ljava/lang/String;)V
    //   1340: athrow
    //   1341: new java/lang/UnsupportedOperationException
    //   1344: dup
    //   1345: ldc_w 'Please set end drawable using R.attr#closeIcon.'
    //   1348: invokespecial <init> : (Ljava/lang/String;)V
    //   1351: athrow
    //   1352: new java/lang/UnsupportedOperationException
    //   1355: dup
    //   1356: ldc_w 'Please set end drawable using R.attr#closeIcon.'
    //   1359: invokespecial <init> : (Ljava/lang/String;)V
    //   1362: athrow
    //   1363: new java/lang/UnsupportedOperationException
    //   1366: dup
    //   1367: ldc_w 'Please set start drawable using R.attr#chipIcon.'
    //   1370: invokespecial <init> : (Ljava/lang/String;)V
    //   1373: athrow
    //   1374: new java/lang/UnsupportedOperationException
    //   1377: dup
    //   1378: ldc_w 'Please set left drawable using R.attr#chipIcon.'
    //   1381: invokespecial <init> : (Ljava/lang/String;)V
    //   1384: athrow
  }
  
  private RectF getCloseIconTouchBounds() {
    this.s.setEmpty();
    if (f()) {
      b b1 = this.e;
      RectF rectF = this.s;
      b1.C(b1.getBounds(), rectF);
    } 
    return this.s;
  }
  
  private Rect getCloseIconTouchBoundsInt() {
    RectF rectF = getCloseIconTouchBounds();
    this.r.set((int)rectF.left, (int)rectF.top, (int)rectF.right, (int)rectF.bottom);
    return this.r;
  }
  
  private c.c.a.b.a0.b getTextAppearance() {
    b b1 = this.e;
    if (b1 != null) {
      c.c.a.b.a0.b b2 = b1.k0.f;
    } else {
      b1 = null;
    } 
    return (c.c.a.b.a0.b)b1;
  }
  
  private void setCloseIconHovered(boolean paramBoolean) {
    if (this.l != paramBoolean) {
      this.l = paramBoolean;
      refreshDrawableState();
    } 
  }
  
  private void setCloseIconPressed(boolean paramBoolean) {
    if (this.k != paramBoolean) {
      this.k = paramBoolean;
      refreshDrawableState();
    } 
  }
  
  public void a() {
    e(this.p);
    boolean bool = c.c.a.b.b0.a.a;
    j();
    k();
    requestLayout();
    invalidateOutline();
  }
  
  public boolean dispatchHoverEvent(MotionEvent paramMotionEvent) {
    // Byte code:
    //   0: aload_1
    //   1: invokevirtual getAction : ()I
    //   4: istore #4
    //   6: iconst_0
    //   7: istore #6
    //   9: iload #4
    //   11: bipush #10
    //   13: if_icmpne -> 138
    //   16: ldc_w b/k/b/a
    //   19: ldc_w 'm'
    //   22: invokevirtual getDeclaredField : (Ljava/lang/String;)Ljava/lang/reflect/Field;
    //   25: astore #7
    //   27: aload #7
    //   29: iconst_1
    //   30: invokevirtual setAccessible : (Z)V
    //   33: aload #7
    //   35: aload_0
    //   36: getfield q : Lcom/google/android/material/chip/Chip$b;
    //   39: invokevirtual get : (Ljava/lang/Object;)Ljava/lang/Object;
    //   42: checkcast java/lang/Integer
    //   45: invokevirtual intValue : ()I
    //   48: ldc_w -2147483648
    //   51: if_icmpeq -> 138
    //   54: ldc_w b/k/b/a
    //   57: ldc_w 't'
    //   60: iconst_1
    //   61: anewarray java/lang/Class
    //   64: dup
    //   65: iconst_0
    //   66: getstatic java/lang/Integer.TYPE : Ljava/lang/Class;
    //   69: aastore
    //   70: invokevirtual getDeclaredMethod : (Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;
    //   73: astore #7
    //   75: aload #7
    //   77: iconst_1
    //   78: invokevirtual setAccessible : (Z)V
    //   81: aload #7
    //   83: aload_0
    //   84: getfield q : Lcom/google/android/material/chip/Chip$b;
    //   87: iconst_1
    //   88: anewarray java/lang/Object
    //   91: dup
    //   92: iconst_0
    //   93: ldc_w -2147483648
    //   96: invokestatic valueOf : (I)Ljava/lang/Integer;
    //   99: aastore
    //   100: invokevirtual invoke : (Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
    //   103: pop
    //   104: iconst_1
    //   105: istore #4
    //   107: goto -> 141
    //   110: astore #7
    //   112: goto -> 127
    //   115: astore #7
    //   117: goto -> 127
    //   120: astore #7
    //   122: goto -> 127
    //   125: astore #7
    //   127: ldc 'Chip'
    //   129: ldc_w 'Unable to send Accessibility Exit event'
    //   132: aload #7
    //   134: invokestatic e : (Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I
    //   137: pop
    //   138: iconst_0
    //   139: istore #4
    //   141: iload #4
    //   143: ifne -> 389
    //   146: aload_0
    //   147: getfield q : Lcom/google/android/material/chip/Chip$b;
    //   150: astore #7
    //   152: aload #7
    //   154: getfield h : Landroid/view/accessibility/AccessibilityManager;
    //   157: invokevirtual isEnabled : ()Z
    //   160: ifeq -> 373
    //   163: aload #7
    //   165: getfield h : Landroid/view/accessibility/AccessibilityManager;
    //   168: invokevirtual isTouchExplorationEnabled : ()Z
    //   171: ifne -> 177
    //   174: goto -> 373
    //   177: aload_1
    //   178: invokevirtual getAction : ()I
    //   181: istore #4
    //   183: iload #4
    //   185: bipush #7
    //   187: if_icmpeq -> 267
    //   190: iload #4
    //   192: bipush #9
    //   194: if_icmpeq -> 267
    //   197: iload #4
    //   199: bipush #10
    //   201: if_icmpeq -> 207
    //   204: goto -> 373
    //   207: aload #7
    //   209: getfield m : I
    //   212: istore #4
    //   214: iload #4
    //   216: ldc_w -2147483648
    //   219: if_icmpeq -> 373
    //   222: iload #4
    //   224: ldc_w -2147483648
    //   227: if_icmpne -> 233
    //   230: goto -> 367
    //   233: aload #7
    //   235: ldc_w -2147483648
    //   238: putfield m : I
    //   241: aload #7
    //   243: ldc_w -2147483648
    //   246: sipush #128
    //   249: invokevirtual s : (II)Z
    //   252: pop
    //   253: aload #7
    //   255: iload #4
    //   257: sipush #256
    //   260: invokevirtual s : (II)Z
    //   263: pop
    //   264: goto -> 367
    //   267: aload_1
    //   268: invokevirtual getX : ()F
    //   271: fstore_3
    //   272: aload_1
    //   273: invokevirtual getY : ()F
    //   276: fstore_2
    //   277: aload #7
    //   279: getfield q : Lcom/google/android/material/chip/Chip;
    //   282: invokestatic b : (Lcom/google/android/material/chip/Chip;)Z
    //   285: ifeq -> 310
    //   288: aload #7
    //   290: getfield q : Lcom/google/android/material/chip/Chip;
    //   293: invokestatic c : (Lcom/google/android/material/chip/Chip;)Landroid/graphics/RectF;
    //   296: fload_3
    //   297: fload_2
    //   298: invokevirtual contains : (FF)Z
    //   301: ifeq -> 310
    //   304: iconst_1
    //   305: istore #4
    //   307: goto -> 313
    //   310: iconst_0
    //   311: istore #4
    //   313: aload #7
    //   315: getfield m : I
    //   318: istore #5
    //   320: iload #5
    //   322: iload #4
    //   324: if_icmpne -> 330
    //   327: goto -> 359
    //   330: aload #7
    //   332: iload #4
    //   334: putfield m : I
    //   337: aload #7
    //   339: iload #4
    //   341: sipush #128
    //   344: invokevirtual s : (II)Z
    //   347: pop
    //   348: aload #7
    //   350: iload #5
    //   352: sipush #256
    //   355: invokevirtual s : (II)Z
    //   358: pop
    //   359: iload #4
    //   361: ldc_w -2147483648
    //   364: if_icmpeq -> 373
    //   367: iconst_1
    //   368: istore #4
    //   370: goto -> 376
    //   373: iconst_0
    //   374: istore #4
    //   376: iload #4
    //   378: ifne -> 389
    //   381: aload_0
    //   382: aload_1
    //   383: invokespecial dispatchHoverEvent : (Landroid/view/MotionEvent;)Z
    //   386: ifeq -> 392
    //   389: iconst_1
    //   390: istore #6
    //   392: iload #6
    //   394: ireturn
    // Exception table:
    //   from	to	target	type
    //   16	104	125	java/lang/NoSuchMethodException
    //   16	104	120	java/lang/IllegalAccessException
    //   16	104	115	java/lang/reflect/InvocationTargetException
    //   16	104	110	java/lang/NoSuchFieldException
  }
  
  public boolean dispatchKeyEvent(KeyEvent paramKeyEvent) {
    b b1 = this.q;
    if (b1 != null) {
      int i = paramKeyEvent.getAction();
      boolean bool2 = false;
      byte b2 = 0;
      boolean bool1 = bool2;
      if (i != 1) {
        int j = paramKeyEvent.getKeyCode();
        if (j != 61) {
          i = 66;
          if (j != 66) {
            switch (j) {
              default:
                bool1 = bool2;
                break;
              case 19:
              case 20:
              case 21:
              case 22:
                bool1 = bool2;
                if (paramKeyEvent.hasNoModifiers()) {
                  if (j != 19) {
                    if (j != 21) {
                      if (j != 22)
                        i = 130; 
                    } else {
                      i = 17;
                    } 
                  } else {
                    i = 33;
                  } 
                  j = paramKeyEvent.getRepeatCount();
                  for (bool1 = false; b2 < j + 1 && b1.n(i, null); bool1 = true)
                    b2++; 
                } 
                break;
              case 23:
                bool1 = bool2;
                if (paramKeyEvent.hasNoModifiers()) {
                  bool1 = bool2;
                  if (paramKeyEvent.getRepeatCount() == 0) {
                    i = b1.l;
                    if (i != Integer.MIN_VALUE)
                      b1.p(i, 16, null); 
                    bool1 = true;
                  } 
                } 
                break;
            } 
          } else {
          
          } 
        } else if (paramKeyEvent.hasNoModifiers()) {
          bool1 = b1.n(2, null);
        } else {
          bool1 = bool2;
          if (paramKeyEvent.hasModifiers(1))
            bool1 = b1.n(1, null); 
        } 
      } 
      return (bool1 && this.q.l != Integer.MIN_VALUE) ? true : super.dispatchKeyEvent(paramKeyEvent);
    } 
    throw null;
  }
  
  public void drawableStateChanged() {
    super.drawableStateChanged();
    b b1 = this.e;
    boolean bool2 = false;
    boolean bool = false;
    boolean bool1 = bool2;
    if (b1 != null) {
      bool1 = bool2;
      if (b.H(b1.L)) {
        b1 = this.e;
        boolean bool4 = isEnabled();
        boolean bool3 = bool4;
        if (this.m)
          i = bool4 + 1; 
        int j = i;
        if (this.l)
          j = i + 1; 
        int i = j;
        if (this.k)
          i = j + 1; 
        j = i;
        if (isChecked())
          j = i + 1; 
        int[] arrayOfInt = new int[j];
        j = bool;
        if (isEnabled()) {
          arrayOfInt[0] = 16842910;
          j = 1;
        } 
        i = j;
        if (this.m) {
          arrayOfInt[j] = 16842908;
          i = j + 1;
        } 
        j = i;
        if (this.l) {
          arrayOfInt[i] = 16843623;
          j = i + 1;
        } 
        i = j;
        if (this.k) {
          arrayOfInt[j] = 16842919;
          i = j + 1;
        } 
        if (isChecked())
          arrayOfInt[i] = 16842913; 
        bool1 = b1.c0(arrayOfInt);
      } 
    } 
    if (bool1)
      invalidate(); 
  }
  
  public boolean e(int paramInt) {
    this.p = paramInt;
    if (!this.n) {
      h();
      return false;
    } 
    int j = Math.max(0, paramInt - (int)this.e.z);
    int i = Math.max(0, paramInt - this.e.getIntrinsicWidth());
    if (i <= 0 && j <= 0) {
      h();
      return false;
    } 
    if (i > 0) {
      i /= 2;
    } else {
      i = 0;
    } 
    if (j > 0) {
      j /= 2;
    } else {
      j = 0;
    } 
    if (this.f != null) {
      Rect rect = new Rect();
      this.f.getPadding(rect);
      if (rect.top == j && rect.bottom == j && rect.left == i && rect.right == i)
        return true; 
    } 
    if (getMinHeight() != paramInt)
      setMinHeight(paramInt); 
    if (getMinWidth() != paramInt)
      setMinWidth(paramInt); 
    this.f = new InsetDrawable((Drawable)this.e, i, j, i, j);
    return true;
  }
  
  public final boolean f() {
    boolean bool;
    b b1 = this.e;
    if (b1 != null && b1.F() != null) {
      bool = true;
    } else {
      bool = false;
    } 
    return bool;
  }
  
  public boolean g() {
    boolean bool;
    b b1 = this.e;
    if (b1 != null && b1.Q) {
      bool = true;
    } else {
      bool = false;
    } 
    return bool;
  }
  
  public Drawable getBackgroundDrawable() {
    b b1;
    InsetDrawable insetDrawable2 = this.f;
    InsetDrawable insetDrawable1 = insetDrawable2;
    if (insetDrawable2 == null)
      b1 = this.e; 
    return (Drawable)b1;
  }
  
  public Drawable getCheckedIcon() {
    b b1 = this.e;
    if (b1 != null) {
      Drawable drawable = b1.S;
    } else {
      b1 = null;
    } 
    return (Drawable)b1;
  }
  
  public ColorStateList getChipBackgroundColor() {
    b b1 = this.e;
    if (b1 != null) {
      ColorStateList colorStateList = b1.y;
    } else {
      b1 = null;
    } 
    return (ColorStateList)b1;
  }
  
  public float getChipCornerRadius() {
    float f;
    b b1 = this.e;
    if (b1 != null) {
      f = b1.E();
    } else {
      f = 0.0F;
    } 
    return f;
  }
  
  public Drawable getChipDrawable() {
    return (Drawable)this.e;
  }
  
  public float getChipEndPadding() {
    float f;
    b b1 = this.e;
    if (b1 != null) {
      f = b1.c0;
    } else {
      f = 0.0F;
    } 
    return f;
  }
  
  public Drawable getChipIcon() {
    null = this.e;
    if (null != null) {
      Drawable drawable = null.G;
      if (drawable != null) {
        Drawable drawable1 = drawable;
        if (drawable instanceof b.i.f.k.b)
          drawable1 = ((b.i.f.k.b)drawable).a(); 
        return drawable1;
      } 
    } 
    return null;
  }
  
  public float getChipIconSize() {
    float f;
    b b1 = this.e;
    if (b1 != null) {
      f = b1.I;
    } else {
      f = 0.0F;
    } 
    return f;
  }
  
  public ColorStateList getChipIconTint() {
    b b1 = this.e;
    if (b1 != null) {
      ColorStateList colorStateList = b1.H;
    } else {
      b1 = null;
    } 
    return (ColorStateList)b1;
  }
  
  public float getChipMinHeight() {
    float f;
    b b1 = this.e;
    if (b1 != null) {
      f = b1.z;
    } else {
      f = 0.0F;
    } 
    return f;
  }
  
  public float getChipStartPadding() {
    float f;
    b b1 = this.e;
    if (b1 != null) {
      f = b1.V;
    } else {
      f = 0.0F;
    } 
    return f;
  }
  
  public ColorStateList getChipStrokeColor() {
    b b1 = this.e;
    if (b1 != null) {
      ColorStateList colorStateList = b1.B;
    } else {
      b1 = null;
    } 
    return (ColorStateList)b1;
  }
  
  public float getChipStrokeWidth() {
    float f;
    b b1 = this.e;
    if (b1 != null) {
      f = b1.C;
    } else {
      f = 0.0F;
    } 
    return f;
  }
  
  @Deprecated
  public CharSequence getChipText() {
    return getText();
  }
  
  public Drawable getCloseIcon() {
    b b1 = this.e;
    if (b1 != null) {
      Drawable drawable = b1.F();
    } else {
      b1 = null;
    } 
    return (Drawable)b1;
  }
  
  public CharSequence getCloseIconContentDescription() {
    b b1 = this.e;
    if (b1 != null) {
      CharSequence charSequence = b1.P;
    } else {
      b1 = null;
    } 
    return (CharSequence)b1;
  }
  
  public float getCloseIconEndPadding() {
    float f;
    b b1 = this.e;
    if (b1 != null) {
      f = b1.b0;
    } else {
      f = 0.0F;
    } 
    return f;
  }
  
  public float getCloseIconSize() {
    float f;
    b b1 = this.e;
    if (b1 != null) {
      f = b1.O;
    } else {
      f = 0.0F;
    } 
    return f;
  }
  
  public float getCloseIconStartPadding() {
    float f;
    b b1 = this.e;
    if (b1 != null) {
      f = b1.a0;
    } else {
      f = 0.0F;
    } 
    return f;
  }
  
  public ColorStateList getCloseIconTint() {
    b b1 = this.e;
    if (b1 != null) {
      ColorStateList colorStateList = b1.N;
    } else {
      b1 = null;
    } 
    return (ColorStateList)b1;
  }
  
  public TextUtils.TruncateAt getEllipsize() {
    b b1 = this.e;
    if (b1 != null) {
      TextUtils.TruncateAt truncateAt = b1.C0;
    } else {
      b1 = null;
    } 
    return (TextUtils.TruncateAt)b1;
  }
  
  public void getFocusedRect(Rect paramRect) {
    b b1 = this.q;
    if (b1.l == 1 || b1.k == 1) {
      paramRect.set(getCloseIconTouchBoundsInt());
      return;
    } 
    super.getFocusedRect(paramRect);
  }
  
  public g getHideMotionSpec() {
    b b1 = this.e;
    if (b1 != null) {
      g g1 = b1.U;
    } else {
      b1 = null;
    } 
    return (g)b1;
  }
  
  public float getIconEndPadding() {
    float f;
    b b1 = this.e;
    if (b1 != null) {
      f = b1.X;
    } else {
      f = 0.0F;
    } 
    return f;
  }
  
  public float getIconStartPadding() {
    float f;
    b b1 = this.e;
    if (b1 != null) {
      f = b1.W;
    } else {
      f = 0.0F;
    } 
    return f;
  }
  
  public ColorStateList getRippleColor() {
    b b1 = this.e;
    if (b1 != null) {
      ColorStateList colorStateList = b1.D;
    } else {
      b1 = null;
    } 
    return (ColorStateList)b1;
  }
  
  public j getShapeAppearanceModel() {
    return ((g)this.e).b.a;
  }
  
  public g getShowMotionSpec() {
    b b1 = this.e;
    if (b1 != null) {
      g g1 = b1.T;
    } else {
      b1 = null;
    } 
    return (g)b1;
  }
  
  public float getTextEndPadding() {
    float f;
    b b1 = this.e;
    if (b1 != null) {
      f = b1.Z;
    } else {
      f = 0.0F;
    } 
    return f;
  }
  
  public float getTextStartPadding() {
    float f;
    b b1 = this.e;
    if (b1 != null) {
      f = b1.Y;
    } else {
      f = 0.0F;
    } 
    return f;
  }
  
  public final void h() {
    if (this.f != null) {
      this.f = null;
      setMinWidth(0);
      setMinHeight((int)getChipMinHeight());
      boolean bool = c.c.a.b.b0.a.a;
      j();
    } 
  }
  
  public final void i() {
    // Byte code:
    //   0: getstatic android/os/Build$VERSION.SDK_INT : I
    //   3: bipush #24
    //   5: if_icmplt -> 9
    //   8: return
    //   9: aload_0
    //   10: invokevirtual f : ()Z
    //   13: ifeq -> 51
    //   16: aload_0
    //   17: getfield e : Lc/c/a/b/s/b;
    //   20: astore_2
    //   21: aload_2
    //   22: ifnull -> 37
    //   25: aload_2
    //   26: getfield K : Z
    //   29: ifeq -> 37
    //   32: iconst_1
    //   33: istore_1
    //   34: goto -> 39
    //   37: iconst_0
    //   38: istore_1
    //   39: iload_1
    //   40: ifeq -> 51
    //   43: aload_0
    //   44: getfield q : Lcom/google/android/material/chip/Chip$b;
    //   47: astore_2
    //   48: goto -> 53
    //   51: aconst_null
    //   52: astore_2
    //   53: aload_0
    //   54: aload_2
    //   55: invokestatic W : (Landroid/view/View;Lb/i/m/a;)V
    //   58: return
  }
  
  public final void j() {
    this.g = new RippleDrawable(c.c.a.b.b0.a.a(this.e.D), getBackgroundDrawable(), null);
    this.e.m0(false);
    l.Z((View)this, (Drawable)this.g);
  }
  
  public final void k() {
    if (!TextUtils.isEmpty(getText())) {
      b b1 = this.e;
      if (b1 != null) {
        float f2 = b1.c0;
        float f1 = b1.Z;
        int i = (int)(b1.D() + f2 + f1);
        b1 = this.e;
        f1 = b1.V;
        f2 = b1.Y;
        l.f0((View)this, (int)(b1.A() + f1 + f2), getPaddingTop(), i, getPaddingBottom());
      } 
    } 
  }
  
  public final void l() {
    TextPaint textPaint = getPaint();
    b b2 = this.e;
    if (b2 != null)
      textPaint.drawableState = b2.getState(); 
    c.c.a.b.a0.b b1 = getTextAppearance();
    if (b1 != null)
      b1.c(getContext(), textPaint, this.t); 
  }
  
  public void onAttachedToWindow() {
    super.onAttachedToWindow();
    q.Y((View)this, (g)this.e);
  }
  
  public int[] onCreateDrawableState(int paramInt) {
    int[] arrayOfInt = super.onCreateDrawableState(paramInt + 2);
    if (isChecked())
      CheckBox.mergeDrawableStates(arrayOfInt, v); 
    if (g())
      CheckBox.mergeDrawableStates(arrayOfInt, w); 
    return arrayOfInt;
  }
  
  public void onFocusChanged(boolean paramBoolean, int paramInt, Rect paramRect) {
    super.onFocusChanged(paramBoolean, paramInt, paramRect);
    b b1 = this.q;
    int i = b1.l;
    if (i != Integer.MIN_VALUE)
      b1.k(i); 
    if (paramBoolean)
      b1.n(paramInt, paramRect); 
  }
  
  public boolean onHoverEvent(MotionEvent paramMotionEvent) {
    boolean bool;
    int i = paramMotionEvent.getActionMasked();
    if (i != 7) {
      if (i != 10)
        return super.onHoverEvent(paramMotionEvent); 
      bool = false;
    } else {
      bool = getCloseIconTouchBounds().contains(paramMotionEvent.getX(), paramMotionEvent.getY());
    } 
    setCloseIconHovered(bool);
    return super.onHoverEvent(paramMotionEvent);
  }
  
  public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo paramAccessibilityNodeInfo) {
    String str;
    super.onInitializeAccessibilityNodeInfo(paramAccessibilityNodeInfo);
    if (g() || isClickable()) {
      if (g()) {
        str = "android.widget.CompoundButton";
      } else {
        str = "android.widget.Button";
      } 
    } else {
      str = "android.view.View";
    } 
    paramAccessibilityNodeInfo.setClassName(str);
    paramAccessibilityNodeInfo.setCheckable(g());
    paramAccessibilityNodeInfo.setClickable(isClickable());
  }
  
  @TargetApi(24)
  public PointerIcon onResolvePointerIcon(MotionEvent paramMotionEvent, int paramInt) {
    return (getCloseIconTouchBounds().contains(paramMotionEvent.getX(), paramMotionEvent.getY()) && isEnabled()) ? PointerIcon.getSystemIcon(getContext(), 1002) : null;
  }
  
  @TargetApi(17)
  public void onRtlPropertiesChanged(int paramInt) {
    super.onRtlPropertiesChanged(paramInt);
    if (this.o != paramInt) {
      this.o = paramInt;
      k();
    } 
  }
  
  public boolean onTouchEvent(MotionEvent paramMotionEvent) {
    // Byte code:
    //   0: aload_1
    //   1: invokevirtual getActionMasked : ()I
    //   4: istore_2
    //   5: aload_0
    //   6: invokespecial getCloseIconTouchBounds : ()Landroid/graphics/RectF;
    //   9: aload_1
    //   10: invokevirtual getX : ()F
    //   13: aload_1
    //   14: invokevirtual getY : ()F
    //   17: invokevirtual contains : (FF)Z
    //   20: istore #4
    //   22: iconst_0
    //   23: istore_3
    //   24: iload_2
    //   25: ifeq -> 122
    //   28: iload_2
    //   29: iconst_1
    //   30: if_icmpeq -> 66
    //   33: iload_2
    //   34: iconst_2
    //   35: if_icmpeq -> 46
    //   38: iload_2
    //   39: iconst_3
    //   40: if_icmpeq -> 112
    //   43: goto -> 137
    //   46: aload_0
    //   47: getfield k : Z
    //   50: ifeq -> 137
    //   53: iload #4
    //   55: ifne -> 132
    //   58: aload_0
    //   59: iconst_0
    //   60: invokespecial setCloseIconPressed : (Z)V
    //   63: goto -> 132
    //   66: aload_0
    //   67: getfield k : Z
    //   70: ifeq -> 112
    //   73: aload_0
    //   74: iconst_0
    //   75: invokevirtual playSoundEffect : (I)V
    //   78: aload_0
    //   79: getfield h : Landroid/view/View$OnClickListener;
    //   82: astore #5
    //   84: aload #5
    //   86: ifnull -> 97
    //   89: aload #5
    //   91: aload_0
    //   92: invokeinterface onClick : (Landroid/view/View;)V
    //   97: aload_0
    //   98: getfield q : Lcom/google/android/material/chip/Chip$b;
    //   101: iconst_1
    //   102: iconst_1
    //   103: invokevirtual s : (II)Z
    //   106: pop
    //   107: iconst_1
    //   108: istore_2
    //   109: goto -> 114
    //   112: iconst_0
    //   113: istore_2
    //   114: aload_0
    //   115: iconst_0
    //   116: invokespecial setCloseIconPressed : (Z)V
    //   119: goto -> 139
    //   122: iload #4
    //   124: ifeq -> 137
    //   127: aload_0
    //   128: iconst_1
    //   129: invokespecial setCloseIconPressed : (Z)V
    //   132: iconst_1
    //   133: istore_2
    //   134: goto -> 139
    //   137: iconst_0
    //   138: istore_2
    //   139: iload_2
    //   140: ifne -> 151
    //   143: aload_0
    //   144: aload_1
    //   145: invokespecial onTouchEvent : (Landroid/view/MotionEvent;)Z
    //   148: ifeq -> 153
    //   151: iconst_1
    //   152: istore_3
    //   153: iload_3
    //   154: ireturn
  }
  
  public void setBackground(Drawable paramDrawable) {
    if (paramDrawable != getBackgroundDrawable() && paramDrawable != this.g) {
      Log.w("Chip", "Do not set the background; Chip manages its own background drawable.");
    } else {
      super.setBackground(paramDrawable);
    } 
  }
  
  public void setBackgroundColor(int paramInt) {
    Log.w("Chip", "Do not set the background color; Chip manages its own background drawable.");
  }
  
  public void setBackgroundDrawable(Drawable paramDrawable) {
    if (paramDrawable != getBackgroundDrawable() && paramDrawable != this.g) {
      Log.w("Chip", "Do not set the background drawable; Chip manages its own background drawable.");
    } else {
      super.setBackgroundDrawable(paramDrawable);
    } 
  }
  
  public void setBackgroundResource(int paramInt) {
    Log.w("Chip", "Do not set the background resource; Chip manages its own background drawable.");
  }
  
  public void setBackgroundTintList(ColorStateList paramColorStateList) {
    Log.w("Chip", "Do not set the background tint list; Chip manages its own background drawable.");
  }
  
  public void setBackgroundTintMode(PorterDuff.Mode paramMode) {
    Log.w("Chip", "Do not set the background tint mode; Chip manages its own background drawable.");
  }
  
  public void setCheckable(boolean paramBoolean) {
    b b1 = this.e;
    if (b1 != null)
      b1.K(paramBoolean); 
  }
  
  public void setCheckableResource(int paramInt) {
    b b1 = this.e;
    if (b1 != null)
      b1.K(b1.d0.getResources().getBoolean(paramInt)); 
  }
  
  public void setChecked(boolean paramBoolean) {
    b b1 = this.e;
    if (b1 == null) {
      this.j = paramBoolean;
    } else if (b1.Q) {
      boolean bool = isChecked();
      super.setChecked(paramBoolean);
      if (bool != paramBoolean) {
        CompoundButton.OnCheckedChangeListener onCheckedChangeListener = this.i;
        if (onCheckedChangeListener != null)
          onCheckedChangeListener.onCheckedChanged((CompoundButton)this, paramBoolean); 
      } 
    } 
  }
  
  public void setCheckedIcon(Drawable paramDrawable) {
    b b1 = this.e;
    if (b1 != null)
      b1.L(paramDrawable); 
  }
  
  @Deprecated
  public void setCheckedIconEnabled(boolean paramBoolean) {
    setCheckedIconVisible(paramBoolean);
  }
  
  @Deprecated
  public void setCheckedIconEnabledResource(int paramInt) {
    setCheckedIconVisible(paramInt);
  }
  
  public void setCheckedIconResource(int paramInt) {
    b b1 = this.e;
    if (b1 != null)
      b1.L(b.b.l.a.a.b(b1.d0, paramInt)); 
  }
  
  public void setCheckedIconVisible(int paramInt) {
    b b1 = this.e;
    if (b1 != null)
      b1.M(b1.d0.getResources().getBoolean(paramInt)); 
  }
  
  public void setCheckedIconVisible(boolean paramBoolean) {
    b b1 = this.e;
    if (b1 != null)
      b1.M(paramBoolean); 
  }
  
  public void setChipBackgroundColor(ColorStateList paramColorStateList) {
    b b1 = this.e;
    if (b1 != null && b1.y != paramColorStateList) {
      b1.y = paramColorStateList;
      b1.onStateChange(b1.getState());
    } 
  }
  
  public void setChipBackgroundColorResource(int paramInt) {
    b b1 = this.e;
    if (b1 != null)
      b1.N(b.b.l.a.a.a(b1.d0, paramInt)); 
  }
  
  @Deprecated
  public void setChipCornerRadius(float paramFloat) {
    b b1 = this.e;
    if (b1 != null)
      b1.O(paramFloat); 
  }
  
  @Deprecated
  public void setChipCornerRadiusResource(int paramInt) {
    b b1 = this.e;
    if (b1 != null)
      b1.O(b1.d0.getResources().getDimension(paramInt)); 
  }
  
  public void setChipDrawable(b paramb) {
    b b1 = this.e;
    if (b1 != paramb) {
      if (b1 != null)
        b1.B0 = new WeakReference(null); 
      this.e = paramb;
      paramb.D0 = false;
      if (paramb != null) {
        paramb.B0 = new WeakReference<Chip>(this);
        e(this.p);
        boolean bool = c.c.a.b.b0.a.a;
        j();
      } else {
        throw null;
      } 
    } 
  }
  
  public void setChipEndPadding(float paramFloat) {
    b b1 = this.e;
    if (b1 != null && b1.c0 != paramFloat) {
      b1.c0 = paramFloat;
      b1.invalidateSelf();
      b1.I();
    } 
  }
  
  public void setChipEndPaddingResource(int paramInt) {
    b b1 = this.e;
    if (b1 != null)
      b1.P(b1.d0.getResources().getDimension(paramInt)); 
  }
  
  public void setChipIcon(Drawable paramDrawable) {
    b b1 = this.e;
    if (b1 != null)
      b1.Q(paramDrawable); 
  }
  
  @Deprecated
  public void setChipIconEnabled(boolean paramBoolean) {
    setChipIconVisible(paramBoolean);
  }
  
  @Deprecated
  public void setChipIconEnabledResource(int paramInt) {
    setChipIconVisible(paramInt);
  }
  
  public void setChipIconResource(int paramInt) {
    b b1 = this.e;
    if (b1 != null)
      b1.Q(b.b.l.a.a.b(b1.d0, paramInt)); 
  }
  
  public void setChipIconSize(float paramFloat) {
    b b1 = this.e;
    if (b1 != null)
      b1.R(paramFloat); 
  }
  
  public void setChipIconSizeResource(int paramInt) {
    b b1 = this.e;
    if (b1 != null)
      b1.R(b1.d0.getResources().getDimension(paramInt)); 
  }
  
  public void setChipIconTint(ColorStateList paramColorStateList) {
    b b1 = this.e;
    if (b1 != null)
      b1.S(paramColorStateList); 
  }
  
  public void setChipIconTintResource(int paramInt) {
    b b1 = this.e;
    if (b1 != null)
      b1.S(b.b.l.a.a.a(b1.d0, paramInt)); 
  }
  
  public void setChipIconVisible(int paramInt) {
    b b1 = this.e;
    if (b1 != null)
      b1.T(b1.d0.getResources().getBoolean(paramInt)); 
  }
  
  public void setChipIconVisible(boolean paramBoolean) {
    b b1 = this.e;
    if (b1 != null)
      b1.T(paramBoolean); 
  }
  
  public void setChipMinHeight(float paramFloat) {
    b b1 = this.e;
    if (b1 != null && b1.z != paramFloat) {
      b1.z = paramFloat;
      b1.invalidateSelf();
      b1.I();
    } 
  }
  
  public void setChipMinHeightResource(int paramInt) {
    b b1 = this.e;
    if (b1 != null)
      b1.U(b1.d0.getResources().getDimension(paramInt)); 
  }
  
  public void setChipStartPadding(float paramFloat) {
    b b1 = this.e;
    if (b1 != null && b1.V != paramFloat) {
      b1.V = paramFloat;
      b1.invalidateSelf();
      b1.I();
    } 
  }
  
  public void setChipStartPaddingResource(int paramInt) {
    b b1 = this.e;
    if (b1 != null)
      b1.V(b1.d0.getResources().getDimension(paramInt)); 
  }
  
  public void setChipStrokeColor(ColorStateList paramColorStateList) {
    b b1 = this.e;
    if (b1 != null)
      b1.W(paramColorStateList); 
  }
  
  public void setChipStrokeColorResource(int paramInt) {
    b b1 = this.e;
    if (b1 != null)
      b1.W(b.b.l.a.a.a(b1.d0, paramInt)); 
  }
  
  public void setChipStrokeWidth(float paramFloat) {
    b b1 = this.e;
    if (b1 != null)
      b1.X(paramFloat); 
  }
  
  public void setChipStrokeWidthResource(int paramInt) {
    b b1 = this.e;
    if (b1 != null)
      b1.X(b1.d0.getResources().getDimension(paramInt)); 
  }
  
  @Deprecated
  public void setChipText(CharSequence paramCharSequence) {
    setText(paramCharSequence);
  }
  
  @Deprecated
  public void setChipTextResource(int paramInt) {
    setText(getResources().getString(paramInt));
  }
  
  public void setCloseIcon(Drawable paramDrawable) {
    b b1 = this.e;
    if (b1 != null)
      b1.Y(paramDrawable); 
    i();
  }
  
  public void setCloseIconContentDescription(CharSequence paramCharSequence) {
    // Byte code:
    //   0: aload_0
    //   1: getfield e : Lc/c/a/b/s/b;
    //   4: astore #9
    //   6: aload #9
    //   8: ifnull -> 387
    //   11: aload #9
    //   13: getfield P : Ljava/lang/CharSequence;
    //   16: aload_1
    //   17: if_acmpeq -> 387
    //   20: invokestatic c : ()Lb/i/k/a;
    //   23: astore #10
    //   25: aload #10
    //   27: getfield c : Lb/i/k/c;
    //   30: astore #6
    //   32: aload_1
    //   33: ifnonnull -> 41
    //   36: aconst_null
    //   37: astore_1
    //   38: goto -> 376
    //   41: aload_1
    //   42: invokeinterface length : ()I
    //   47: istore_3
    //   48: aload #6
    //   50: checkcast b/i/k/d$c
    //   53: aload_1
    //   54: iconst_0
    //   55: iload_3
    //   56: invokevirtual b : (Ljava/lang/CharSequence;II)Z
    //   59: istore #5
    //   61: new android/text/SpannableStringBuilder
    //   64: dup
    //   65: invokespecial <init> : ()V
    //   68: astore #7
    //   70: aload #10
    //   72: getfield b : I
    //   75: iconst_2
    //   76: iand
    //   77: ifeq -> 85
    //   80: iconst_1
    //   81: istore_3
    //   82: goto -> 87
    //   85: iconst_0
    //   86: istore_3
    //   87: ldc_w ''
    //   90: astore #8
    //   92: iload_3
    //   93: ifeq -> 205
    //   96: iload #5
    //   98: ifeq -> 109
    //   101: getstatic b/i/k/d.b : Lb/i/k/c;
    //   104: astore #6
    //   106: goto -> 114
    //   109: getstatic b/i/k/d.a : Lb/i/k/c;
    //   112: astore #6
    //   114: aload_1
    //   115: invokeinterface length : ()I
    //   120: istore_3
    //   121: aload #6
    //   123: checkcast b/i/k/d$c
    //   126: aload_1
    //   127: iconst_0
    //   128: iload_3
    //   129: invokevirtual b : (Ljava/lang/CharSequence;II)Z
    //   132: istore #4
    //   134: aload #10
    //   136: getfield a : Z
    //   139: ifne -> 163
    //   142: iload #4
    //   144: ifne -> 155
    //   147: aload_1
    //   148: invokestatic a : (Ljava/lang/CharSequence;)I
    //   151: iconst_1
    //   152: if_icmpne -> 163
    //   155: getstatic b/i/k/a.e : Ljava/lang/String;
    //   158: astore #6
    //   160: goto -> 197
    //   163: aload #10
    //   165: getfield a : Z
    //   168: ifeq -> 192
    //   171: iload #4
    //   173: ifeq -> 184
    //   176: aload_1
    //   177: invokestatic a : (Ljava/lang/CharSequence;)I
    //   180: iconst_m1
    //   181: if_icmpne -> 192
    //   184: getstatic b/i/k/a.f : Ljava/lang/String;
    //   187: astore #6
    //   189: goto -> 197
    //   192: ldc_w ''
    //   195: astore #6
    //   197: aload #7
    //   199: aload #6
    //   201: invokevirtual append : (Ljava/lang/CharSequence;)Landroid/text/SpannableStringBuilder;
    //   204: pop
    //   205: iload #5
    //   207: aload #10
    //   209: getfield a : Z
    //   212: if_icmpeq -> 257
    //   215: iload #5
    //   217: ifeq -> 227
    //   220: sipush #8235
    //   223: istore_2
    //   224: goto -> 231
    //   227: sipush #8234
    //   230: istore_2
    //   231: aload #7
    //   233: iload_2
    //   234: invokevirtual append : (C)Landroid/text/SpannableStringBuilder;
    //   237: pop
    //   238: aload #7
    //   240: aload_1
    //   241: invokevirtual append : (Ljava/lang/CharSequence;)Landroid/text/SpannableStringBuilder;
    //   244: pop
    //   245: aload #7
    //   247: sipush #8236
    //   250: invokevirtual append : (C)Landroid/text/SpannableStringBuilder;
    //   253: pop
    //   254: goto -> 264
    //   257: aload #7
    //   259: aload_1
    //   260: invokevirtual append : (Ljava/lang/CharSequence;)Landroid/text/SpannableStringBuilder;
    //   263: pop
    //   264: iload #5
    //   266: ifeq -> 277
    //   269: getstatic b/i/k/d.b : Lb/i/k/c;
    //   272: astore #6
    //   274: goto -> 282
    //   277: getstatic b/i/k/d.a : Lb/i/k/c;
    //   280: astore #6
    //   282: aload_1
    //   283: invokeinterface length : ()I
    //   288: istore_3
    //   289: aload #6
    //   291: checkcast b/i/k/d$c
    //   294: aload_1
    //   295: iconst_0
    //   296: iload_3
    //   297: invokevirtual b : (Ljava/lang/CharSequence;II)Z
    //   300: istore #4
    //   302: aload #10
    //   304: getfield a : Z
    //   307: ifne -> 331
    //   310: iload #4
    //   312: ifne -> 323
    //   315: aload_1
    //   316: invokestatic b : (Ljava/lang/CharSequence;)I
    //   319: iconst_1
    //   320: if_icmpne -> 331
    //   323: getstatic b/i/k/a.e : Ljava/lang/String;
    //   326: astore #6
    //   328: goto -> 365
    //   331: aload #8
    //   333: astore #6
    //   335: aload #10
    //   337: getfield a : Z
    //   340: ifeq -> 365
    //   343: iload #4
    //   345: ifeq -> 360
    //   348: aload #8
    //   350: astore #6
    //   352: aload_1
    //   353: invokestatic b : (Ljava/lang/CharSequence;)I
    //   356: iconst_m1
    //   357: if_icmpne -> 365
    //   360: getstatic b/i/k/a.f : Ljava/lang/String;
    //   363: astore #6
    //   365: aload #7
    //   367: aload #6
    //   369: invokevirtual append : (Ljava/lang/CharSequence;)Landroid/text/SpannableStringBuilder;
    //   372: pop
    //   373: aload #7
    //   375: astore_1
    //   376: aload #9
    //   378: aload_1
    //   379: putfield P : Ljava/lang/CharSequence;
    //   382: aload #9
    //   384: invokevirtual invalidateSelf : ()V
    //   387: return
  }
  
  @Deprecated
  public void setCloseIconEnabled(boolean paramBoolean) {
    setCloseIconVisible(paramBoolean);
  }
  
  @Deprecated
  public void setCloseIconEnabledResource(int paramInt) {
    setCloseIconVisible(paramInt);
  }
  
  public void setCloseIconEndPadding(float paramFloat) {
    b b1 = this.e;
    if (b1 != null)
      b1.Z(paramFloat); 
  }
  
  public void setCloseIconEndPaddingResource(int paramInt) {
    b b1 = this.e;
    if (b1 != null)
      b1.Z(b1.d0.getResources().getDimension(paramInt)); 
  }
  
  public void setCloseIconResource(int paramInt) {
    b b1 = this.e;
    if (b1 != null)
      b1.Y(b.b.l.a.a.b(b1.d0, paramInt)); 
    i();
  }
  
  public void setCloseIconSize(float paramFloat) {
    b b1 = this.e;
    if (b1 != null)
      b1.a0(paramFloat); 
  }
  
  public void setCloseIconSizeResource(int paramInt) {
    b b1 = this.e;
    if (b1 != null)
      b1.a0(b1.d0.getResources().getDimension(paramInt)); 
  }
  
  public void setCloseIconStartPadding(float paramFloat) {
    b b1 = this.e;
    if (b1 != null)
      b1.b0(paramFloat); 
  }
  
  public void setCloseIconStartPaddingResource(int paramInt) {
    b b1 = this.e;
    if (b1 != null)
      b1.b0(b1.d0.getResources().getDimension(paramInt)); 
  }
  
  public void setCloseIconTint(ColorStateList paramColorStateList) {
    b b1 = this.e;
    if (b1 != null)
      b1.d0(paramColorStateList); 
  }
  
  public void setCloseIconTintResource(int paramInt) {
    b b1 = this.e;
    if (b1 != null)
      b1.d0(b.b.l.a.a.a(b1.d0, paramInt)); 
  }
  
  public void setCloseIconVisible(int paramInt) {
    setCloseIconVisible(getResources().getBoolean(paramInt));
  }
  
  public void setCloseIconVisible(boolean paramBoolean) {
    b b1 = this.e;
    if (b1 != null)
      b1.e0(paramBoolean); 
    i();
  }
  
  public void setCompoundDrawables(Drawable paramDrawable1, Drawable paramDrawable2, Drawable paramDrawable3, Drawable paramDrawable4) {
    if (paramDrawable1 == null) {
      if (paramDrawable3 == null) {
        super.setCompoundDrawables(paramDrawable1, paramDrawable2, paramDrawable3, paramDrawable4);
        return;
      } 
      throw new UnsupportedOperationException("Please set end drawable using R.attr#closeIcon.");
    } 
    throw new UnsupportedOperationException("Please set start drawable using R.attr#chipIcon.");
  }
  
  public void setCompoundDrawablesRelative(Drawable paramDrawable1, Drawable paramDrawable2, Drawable paramDrawable3, Drawable paramDrawable4) {
    if (paramDrawable1 == null) {
      if (paramDrawable3 == null) {
        super.setCompoundDrawablesRelative(paramDrawable1, paramDrawable2, paramDrawable3, paramDrawable4);
        return;
      } 
      throw new UnsupportedOperationException("Please set end drawable using R.attr#closeIcon.");
    } 
    throw new UnsupportedOperationException("Please set start drawable using R.attr#chipIcon.");
  }
  
  public void setCompoundDrawablesRelativeWithIntrinsicBounds(int paramInt1, int paramInt2, int paramInt3, int paramInt4) {
    if (paramInt1 == 0) {
      if (paramInt3 == 0) {
        super.setCompoundDrawablesRelativeWithIntrinsicBounds(paramInt1, paramInt2, paramInt3, paramInt4);
        return;
      } 
      throw new UnsupportedOperationException("Please set end drawable using R.attr#closeIcon.");
    } 
    throw new UnsupportedOperationException("Please set start drawable using R.attr#chipIcon.");
  }
  
  public void setCompoundDrawablesRelativeWithIntrinsicBounds(Drawable paramDrawable1, Drawable paramDrawable2, Drawable paramDrawable3, Drawable paramDrawable4) {
    if (paramDrawable1 == null) {
      if (paramDrawable3 == null) {
        super.setCompoundDrawablesRelativeWithIntrinsicBounds(paramDrawable1, paramDrawable2, paramDrawable3, paramDrawable4);
        return;
      } 
      throw new UnsupportedOperationException("Please set end drawable using R.attr#closeIcon.");
    } 
    throw new UnsupportedOperationException("Please set start drawable using R.attr#chipIcon.");
  }
  
  public void setCompoundDrawablesWithIntrinsicBounds(int paramInt1, int paramInt2, int paramInt3, int paramInt4) {
    if (paramInt1 == 0) {
      if (paramInt3 == 0) {
        super.setCompoundDrawablesWithIntrinsicBounds(paramInt1, paramInt2, paramInt3, paramInt4);
        return;
      } 
      throw new UnsupportedOperationException("Please set end drawable using R.attr#closeIcon.");
    } 
    throw new UnsupportedOperationException("Please set start drawable using R.attr#chipIcon.");
  }
  
  public void setCompoundDrawablesWithIntrinsicBounds(Drawable paramDrawable1, Drawable paramDrawable2, Drawable paramDrawable3, Drawable paramDrawable4) {
    if (paramDrawable1 == null) {
      if (paramDrawable3 == null) {
        super.setCompoundDrawablesWithIntrinsicBounds(paramDrawable1, paramDrawable2, paramDrawable3, paramDrawable4);
        return;
      } 
      throw new UnsupportedOperationException("Please set right drawable using R.attr#closeIcon.");
    } 
    throw new UnsupportedOperationException("Please set left drawable using R.attr#chipIcon.");
  }
  
  public void setElevation(float paramFloat) {
    super.setElevation(paramFloat);
    b b1 = this.e;
    if (b1 != null) {
      g.b b2 = ((g)b1).b;
      if (b2.o != paramFloat) {
        b2.o = paramFloat;
        b1.x();
      } 
    } 
  }
  
  public void setEllipsize(TextUtils.TruncateAt paramTruncateAt) {
    if (this.e == null)
      return; 
    if (paramTruncateAt != TextUtils.TruncateAt.MARQUEE) {
      super.setEllipsize(paramTruncateAt);
      b b1 = this.e;
      if (b1 != null)
        b1.C0 = paramTruncateAt; 
      return;
    } 
    throw new UnsupportedOperationException("Text within a chip are not allowed to scroll.");
  }
  
  public void setEnsureMinTouchTargetSize(boolean paramBoolean) {
    this.n = paramBoolean;
    e(this.p);
  }
  
  public void setGravity(int paramInt) {
    if (paramInt != 8388627) {
      Log.w("Chip", "Chip text must be vertically center and start aligned");
    } else {
      super.setGravity(paramInt);
    } 
  }
  
  public void setHideMotionSpec(g paramg) {
    b b1 = this.e;
    if (b1 != null)
      b1.U = paramg; 
  }
  
  public void setHideMotionSpecResource(int paramInt) {
    b b1 = this.e;
    if (b1 != null)
      b1.U = g.b(b1.d0, paramInt); 
  }
  
  public void setIconEndPadding(float paramFloat) {
    b b1 = this.e;
    if (b1 != null)
      b1.f0(paramFloat); 
  }
  
  public void setIconEndPaddingResource(int paramInt) {
    b b1 = this.e;
    if (b1 != null)
      b1.f0(b1.d0.getResources().getDimension(paramInt)); 
  }
  
  public void setIconStartPadding(float paramFloat) {
    b b1 = this.e;
    if (b1 != null)
      b1.g0(paramFloat); 
  }
  
  public void setIconStartPaddingResource(int paramInt) {
    b b1 = this.e;
    if (b1 != null)
      b1.g0(b1.d0.getResources().getDimension(paramInt)); 
  }
  
  public void setLayoutDirection(int paramInt) {
    if (this.e == null)
      return; 
    super.setLayoutDirection(paramInt);
  }
  
  public void setLines(int paramInt) {
    if (paramInt <= 1) {
      super.setLines(paramInt);
      return;
    } 
    throw new UnsupportedOperationException("Chip does not support multi-line text");
  }
  
  public void setMaxLines(int paramInt) {
    if (paramInt <= 1) {
      super.setMaxLines(paramInt);
      return;
    } 
    throw new UnsupportedOperationException("Chip does not support multi-line text");
  }
  
  public void setMaxWidth(int paramInt) {
    super.setMaxWidth(paramInt);
    b b1 = this.e;
    if (b1 != null)
      b1.E0 = paramInt; 
  }
  
  public void setMinLines(int paramInt) {
    if (paramInt <= 1) {
      super.setMinLines(paramInt);
      return;
    } 
    throw new UnsupportedOperationException("Chip does not support multi-line text");
  }
  
  public void setOnCheckedChangeListenerInternal(CompoundButton.OnCheckedChangeListener paramOnCheckedChangeListener) {
    this.i = paramOnCheckedChangeListener;
  }
  
  public void setOnCloseIconClickListener(View.OnClickListener paramOnClickListener) {
    this.h = paramOnClickListener;
  }
  
  public void setRippleColor(ColorStateList paramColorStateList) {
    b b1 = this.e;
    if (b1 != null)
      b1.h0(paramColorStateList); 
    if (!this.e.z0)
      j(); 
  }
  
  public void setRippleColorResource(int paramInt) {
    b b1 = this.e;
    if (b1 != null) {
      b1.h0(b.b.l.a.a.a(b1.d0, paramInt));
      if (!this.e.z0)
        j(); 
    } 
  }
  
  public void setShapeAppearanceModel(j paramj) {
    b b1 = this.e;
    ((g)b1).b.a = paramj;
    b1.invalidateSelf();
  }
  
  public void setShowMotionSpec(g paramg) {
    b b1 = this.e;
    if (b1 != null)
      b1.T = paramg; 
  }
  
  public void setShowMotionSpecResource(int paramInt) {
    b b1 = this.e;
    if (b1 != null)
      b1.T = g.b(b1.d0, paramInt); 
  }
  
  public void setSingleLine(boolean paramBoolean) {
    if (paramBoolean) {
      super.setSingleLine(paramBoolean);
      return;
    } 
    throw new UnsupportedOperationException("Chip does not support multi-line text");
  }
  
  public void setText(CharSequence paramCharSequence, TextView.BufferType paramBufferType) {
    if (this.e == null)
      return; 
    CharSequence charSequence = paramCharSequence;
    if (paramCharSequence == null)
      charSequence = ""; 
    if (this.e.D0) {
      paramCharSequence = null;
    } else {
      paramCharSequence = charSequence;
    } 
    super.setText(paramCharSequence, paramBufferType);
    b b1 = this.e;
    if (b1 != null)
      b1.i0(charSequence); 
  }
  
  public void setTextAppearance(int paramInt) {
    super.setTextAppearance(paramInt);
    b b1 = this.e;
    if (b1 != null)
      b1.j0(new c.c.a.b.a0.b(b1.d0, paramInt)); 
    l();
  }
  
  public void setTextAppearance(Context paramContext, int paramInt) {
    super.setTextAppearance(paramContext, paramInt);
    b b1 = this.e;
    if (b1 != null)
      b1.j0(new c.c.a.b.a0.b(b1.d0, paramInt)); 
    l();
  }
  
  public void setTextAppearance(c.c.a.b.a0.b paramb) {
    b b1 = this.e;
    if (b1 != null)
      b1.j0(paramb); 
    l();
  }
  
  public void setTextAppearanceResource(int paramInt) {
    setTextAppearance(getContext(), paramInt);
  }
  
  public void setTextEndPadding(float paramFloat) {
    b b1 = this.e;
    if (b1 != null && b1.Z != paramFloat) {
      b1.Z = paramFloat;
      b1.invalidateSelf();
      b1.I();
    } 
  }
  
  public void setTextEndPaddingResource(int paramInt) {
    b b1 = this.e;
    if (b1 != null)
      b1.k0(b1.d0.getResources().getDimension(paramInt)); 
  }
  
  public void setTextStartPadding(float paramFloat) {
    b b1 = this.e;
    if (b1 != null && b1.Y != paramFloat) {
      b1.Y = paramFloat;
      b1.invalidateSelf();
      b1.I();
    } 
  }
  
  public void setTextStartPaddingResource(int paramInt) {
    b b1 = this.e;
    if (b1 != null)
      b1.l0(b1.d0.getResources().getDimension(paramInt)); 
  }
  
  public class a extends d {
    public final Chip a;
    
    public a(Chip this$0) {}
    
    public void a(int param1Int) {}
    
    public void b(Typeface param1Typeface, boolean param1Boolean) {
      CharSequence charSequence;
      Chip chip = this.a;
      b b = chip.e;
      if (b.D0) {
        charSequence = b.E;
      } else {
        charSequence = chip.getText();
      } 
      chip.setText(charSequence);
      this.a.requestLayout();
      this.a.invalidate();
    }
  }
  
  public class b extends b.k.b.a {
    public final Chip q;
    
    public b(Chip this$0, Chip param1Chip1) {
      super((View)param1Chip1);
    }
    
    public void m(List<Integer> param1List) {
      boolean bool = false;
      param1List.add(Integer.valueOf(0));
      if (Chip.b(this.q)) {
        b b1 = this.q.e;
        boolean bool1 = bool;
        if (b1 != null) {
          bool1 = bool;
          if (b1.K)
            bool1 = true; 
        } 
        if (bool1)
          param1List.add(Integer.valueOf(1)); 
      } 
    }
    
    public boolean p(int param1Int1, int param1Int2, Bundle param1Bundle) {
      boolean bool2 = false;
      boolean bool3 = false;
      boolean bool1 = bool2;
      if (param1Int2 == 16) {
        if (param1Int1 == 0)
          return this.q.performClick(); 
        bool1 = bool2;
        if (param1Int1 == 1) {
          Chip chip = this.q;
          chip.playSoundEffect(0);
          View.OnClickListener onClickListener = chip.h;
          bool1 = bool3;
          if (onClickListener != null) {
            onClickListener.onClick((View)chip);
            bool1 = true;
          } 
          chip.q.s(1, 1);
        } 
      } 
      return bool1;
    }
    
    public void q(int param1Int, b.i.m.v.b param1b) {
      String str = "";
      if (param1Int == 1) {
        CharSequence charSequence1;
        CharSequence charSequence2 = this.q.getCloseIconContentDescription();
        if (charSequence2 != null) {
          charSequence1 = charSequence2;
        } else {
          charSequence2 = this.q.getText();
          Context context = this.q.getContext();
          param1Int = i.mtrl_chip_close_icon_content_description;
          if (!TextUtils.isEmpty(charSequence2))
            charSequence1 = charSequence2; 
          charSequence1 = context.getString(param1Int, new Object[] { charSequence1 }).trim();
        } 
        param1b.a.setContentDescription(charSequence1);
        Rect rect = Chip.d(this.q);
        param1b.a.setBoundsInParent(rect);
        param1b.a(b.i.m.v.b.a.e);
        boolean bool = this.q.isEnabled();
        param1b.a.setEnabled(bool);
      } else {
        param1b.a.setContentDescription("");
        Rect rect = Chip.u;
        param1b.a.setBoundsInParent(rect);
      } 
    }
  }
}


/* Location:              C:\Users\panch\Downloads\dvba_v1.1.0-dex2jar.jar!\com\google\android\material\chip\Chip.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */