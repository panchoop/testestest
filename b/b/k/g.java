package b.b.k;

import android.content.Context;
import android.content.DialogInterface;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.util.TypedValue;
import android.view.ContextThemeWrapper;
import android.view.KeyEvent;
import android.view.View;
import android.widget.ImageView;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.TextView;
import androidx.appcompat.app.AlertController;
import androidx.core.widget.NestedScrollView;

public class g extends q implements DialogInterface {
  public final AlertController d = new AlertController(getContext(), this, getWindow());
  
  public g(Context paramContext, int paramInt) {
    super(paramContext, d(paramContext, paramInt));
  }
  
  public static int d(Context paramContext, int paramInt) {
    if ((paramInt >>> 24 & 0xFF) >= 1)
      return paramInt; 
    TypedValue typedValue = new TypedValue();
    paramContext.getTheme().resolveAttribute(b.b.a.alertDialogTheme, typedValue, true);
    return typedValue.resourceId;
  }
  
  public void onCreate(Bundle paramBundle) {
    // Byte code:
    //   0: aload_0
    //   1: aload_1
    //   2: invokespecial onCreate : (Landroid/os/Bundle;)V
    //   5: aload_0
    //   6: getfield d : Landroidx/appcompat/app/AlertController;
    //   9: astore #13
    //   11: aload #13
    //   13: getfield K : I
    //   16: istore_2
    //   17: iload_2
    //   18: ifne -> 24
    //   21: goto -> 36
    //   24: aload #13
    //   26: getfield Q : I
    //   29: iconst_1
    //   30: if_icmpne -> 36
    //   33: goto -> 42
    //   36: aload #13
    //   38: getfield J : I
    //   41: istore_2
    //   42: aload #13
    //   44: getfield b : Lb/b/k/q;
    //   47: iload_2
    //   48: invokevirtual setContentView : (I)V
    //   51: aload #13
    //   53: getfield c : Landroid/view/Window;
    //   56: getstatic b/b/f.parentPanel : I
    //   59: invokevirtual findViewById : (I)Landroid/view/View;
    //   62: astore_1
    //   63: aload_1
    //   64: getstatic b/b/f.topPanel : I
    //   67: invokevirtual findViewById : (I)Landroid/view/View;
    //   70: astore #12
    //   72: aload_1
    //   73: getstatic b/b/f.contentPanel : I
    //   76: invokevirtual findViewById : (I)Landroid/view/View;
    //   79: astore #14
    //   81: aload_1
    //   82: getstatic b/b/f.buttonPanel : I
    //   85: invokevirtual findViewById : (I)Landroid/view/View;
    //   88: astore #15
    //   90: aload_1
    //   91: getstatic b/b/f.customPanel : I
    //   94: invokevirtual findViewById : (I)Landroid/view/View;
    //   97: checkcast android/view/ViewGroup
    //   100: astore #10
    //   102: aload #13
    //   104: getfield h : Landroid/view/View;
    //   107: astore_1
    //   108: aconst_null
    //   109: astore #11
    //   111: iconst_0
    //   112: istore #7
    //   114: aload_1
    //   115: ifnull -> 121
    //   118: goto -> 154
    //   121: aload #13
    //   123: getfield i : I
    //   126: ifeq -> 152
    //   129: aload #13
    //   131: getfield a : Landroid/content/Context;
    //   134: invokestatic from : (Landroid/content/Context;)Landroid/view/LayoutInflater;
    //   137: aload #13
    //   139: getfield i : I
    //   142: aload #10
    //   144: iconst_0
    //   145: invokevirtual inflate : (ILandroid/view/ViewGroup;Z)Landroid/view/View;
    //   148: astore_1
    //   149: goto -> 154
    //   152: aconst_null
    //   153: astore_1
    //   154: aload_1
    //   155: ifnull -> 163
    //   158: iconst_1
    //   159: istore_2
    //   160: goto -> 165
    //   163: iconst_0
    //   164: istore_2
    //   165: iload_2
    //   166: ifeq -> 176
    //   169: aload_1
    //   170: invokestatic a : (Landroid/view/View;)Z
    //   173: ifne -> 188
    //   176: aload #13
    //   178: getfield c : Landroid/view/Window;
    //   181: ldc 131072
    //   183: ldc 131072
    //   185: invokevirtual setFlags : (II)V
    //   188: iload_2
    //   189: ifeq -> 279
    //   192: aload #13
    //   194: getfield c : Landroid/view/Window;
    //   197: getstatic b/b/f.custom : I
    //   200: invokevirtual findViewById : (I)Landroid/view/View;
    //   203: checkcast android/widget/FrameLayout
    //   206: astore #16
    //   208: aload #16
    //   210: aload_1
    //   211: new android/view/ViewGroup$LayoutParams
    //   214: dup
    //   215: iconst_m1
    //   216: iconst_m1
    //   217: invokespecial <init> : (II)V
    //   220: invokevirtual addView : (Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V
    //   223: aload #13
    //   225: getfield n : Z
    //   228: ifeq -> 256
    //   231: aload #16
    //   233: aload #13
    //   235: getfield j : I
    //   238: aload #13
    //   240: getfield k : I
    //   243: aload #13
    //   245: getfield l : I
    //   248: aload #13
    //   250: getfield m : I
    //   253: invokevirtual setPadding : (IIII)V
    //   256: aload #13
    //   258: getfield g : Landroid/widget/ListView;
    //   261: ifnull -> 286
    //   264: aload #10
    //   266: invokevirtual getLayoutParams : ()Landroid/view/ViewGroup$LayoutParams;
    //   269: checkcast b/b/p/i0$a
    //   272: fconst_0
    //   273: putfield a : F
    //   276: goto -> 286
    //   279: aload #10
    //   281: bipush #8
    //   283: invokevirtual setVisibility : (I)V
    //   286: aload #10
    //   288: getstatic b/b/f.topPanel : I
    //   291: invokevirtual findViewById : (I)Landroid/view/View;
    //   294: astore #17
    //   296: aload #10
    //   298: getstatic b/b/f.contentPanel : I
    //   301: invokevirtual findViewById : (I)Landroid/view/View;
    //   304: astore #16
    //   306: aload #10
    //   308: getstatic b/b/f.buttonPanel : I
    //   311: invokevirtual findViewById : (I)Landroid/view/View;
    //   314: astore_1
    //   315: aload #13
    //   317: aload #17
    //   319: aload #12
    //   321: invokevirtual d : (Landroid/view/View;Landroid/view/View;)Landroid/view/ViewGroup;
    //   324: astore #12
    //   326: aload #13
    //   328: aload #16
    //   330: aload #14
    //   332: invokevirtual d : (Landroid/view/View;Landroid/view/View;)Landroid/view/ViewGroup;
    //   335: astore #14
    //   337: aload #13
    //   339: aload_1
    //   340: aload #15
    //   342: invokevirtual d : (Landroid/view/View;Landroid/view/View;)Landroid/view/ViewGroup;
    //   345: astore #15
    //   347: aload #13
    //   349: getfield c : Landroid/view/Window;
    //   352: getstatic b/b/f.scrollView : I
    //   355: invokevirtual findViewById : (I)Landroid/view/View;
    //   358: checkcast androidx/core/widget/NestedScrollView
    //   361: astore_1
    //   362: aload #13
    //   364: aload_1
    //   365: putfield A : Landroidx/core/widget/NestedScrollView;
    //   368: aload_1
    //   369: iconst_0
    //   370: invokevirtual setFocusable : (Z)V
    //   373: aload #13
    //   375: getfield A : Landroidx/core/widget/NestedScrollView;
    //   378: iconst_0
    //   379: invokevirtual setNestedScrollingEnabled : (Z)V
    //   382: aload #14
    //   384: ldc 16908299
    //   386: invokevirtual findViewById : (I)Landroid/view/View;
    //   389: checkcast android/widget/TextView
    //   392: astore_1
    //   393: aload #13
    //   395: aload_1
    //   396: putfield F : Landroid/widget/TextView;
    //   399: aload_1
    //   400: ifnonnull -> 406
    //   403: goto -> 510
    //   406: aload #13
    //   408: getfield f : Ljava/lang/CharSequence;
    //   411: astore #16
    //   413: aload #16
    //   415: ifnull -> 427
    //   418: aload_1
    //   419: aload #16
    //   421: invokevirtual setText : (Ljava/lang/CharSequence;)V
    //   424: goto -> 510
    //   427: aload_1
    //   428: bipush #8
    //   430: invokevirtual setVisibility : (I)V
    //   433: aload #13
    //   435: getfield A : Landroidx/core/widget/NestedScrollView;
    //   438: aload #13
    //   440: getfield F : Landroid/widget/TextView;
    //   443: invokevirtual removeView : (Landroid/view/View;)V
    //   446: aload #13
    //   448: getfield g : Landroid/widget/ListView;
    //   451: ifnull -> 503
    //   454: aload #13
    //   456: getfield A : Landroidx/core/widget/NestedScrollView;
    //   459: invokevirtual getParent : ()Landroid/view/ViewParent;
    //   462: checkcast android/view/ViewGroup
    //   465: astore_1
    //   466: aload_1
    //   467: aload #13
    //   469: getfield A : Landroidx/core/widget/NestedScrollView;
    //   472: invokevirtual indexOfChild : (Landroid/view/View;)I
    //   475: istore_2
    //   476: aload_1
    //   477: iload_2
    //   478: invokevirtual removeViewAt : (I)V
    //   481: aload_1
    //   482: aload #13
    //   484: getfield g : Landroid/widget/ListView;
    //   487: iload_2
    //   488: new android/view/ViewGroup$LayoutParams
    //   491: dup
    //   492: iconst_m1
    //   493: iconst_m1
    //   494: invokespecial <init> : (II)V
    //   497: invokevirtual addView : (Landroid/view/View;ILandroid/view/ViewGroup$LayoutParams;)V
    //   500: goto -> 510
    //   503: aload #14
    //   505: bipush #8
    //   507: invokevirtual setVisibility : (I)V
    //   510: aload #15
    //   512: ldc 16908313
    //   514: invokevirtual findViewById : (I)Landroid/view/View;
    //   517: checkcast android/widget/Button
    //   520: astore_1
    //   521: aload #13
    //   523: aload_1
    //   524: putfield o : Landroid/widget/Button;
    //   527: aload_1
    //   528: aload #13
    //   530: getfield S : Landroid/view/View$OnClickListener;
    //   533: invokevirtual setOnClickListener : (Landroid/view/View$OnClickListener;)V
    //   536: aload #13
    //   538: getfield p : Ljava/lang/CharSequence;
    //   541: invokestatic isEmpty : (Ljava/lang/CharSequence;)Z
    //   544: ifeq -> 570
    //   547: aload #13
    //   549: getfield r : Landroid/graphics/drawable/Drawable;
    //   552: ifnonnull -> 570
    //   555: aload #13
    //   557: getfield o : Landroid/widget/Button;
    //   560: bipush #8
    //   562: invokevirtual setVisibility : (I)V
    //   565: iconst_0
    //   566: istore_2
    //   567: goto -> 634
    //   570: aload #13
    //   572: getfield o : Landroid/widget/Button;
    //   575: aload #13
    //   577: getfield p : Ljava/lang/CharSequence;
    //   580: invokevirtual setText : (Ljava/lang/CharSequence;)V
    //   583: aload #13
    //   585: getfield r : Landroid/graphics/drawable/Drawable;
    //   588: astore_1
    //   589: aload_1
    //   590: ifnull -> 623
    //   593: aload #13
    //   595: getfield d : I
    //   598: istore_2
    //   599: aload_1
    //   600: iconst_0
    //   601: iconst_0
    //   602: iload_2
    //   603: iload_2
    //   604: invokevirtual setBounds : (IIII)V
    //   607: aload #13
    //   609: getfield o : Landroid/widget/Button;
    //   612: aload #13
    //   614: getfield r : Landroid/graphics/drawable/Drawable;
    //   617: aconst_null
    //   618: aconst_null
    //   619: aconst_null
    //   620: invokevirtual setCompoundDrawables : (Landroid/graphics/drawable/Drawable;Landroid/graphics/drawable/Drawable;Landroid/graphics/drawable/Drawable;Landroid/graphics/drawable/Drawable;)V
    //   623: aload #13
    //   625: getfield o : Landroid/widget/Button;
    //   628: iconst_0
    //   629: invokevirtual setVisibility : (I)V
    //   632: iconst_1
    //   633: istore_2
    //   634: aload #15
    //   636: ldc_w 16908314
    //   639: invokevirtual findViewById : (I)Landroid/view/View;
    //   642: checkcast android/widget/Button
    //   645: astore_1
    //   646: aload #13
    //   648: aload_1
    //   649: putfield s : Landroid/widget/Button;
    //   652: aload_1
    //   653: aload #13
    //   655: getfield S : Landroid/view/View$OnClickListener;
    //   658: invokevirtual setOnClickListener : (Landroid/view/View$OnClickListener;)V
    //   661: aload #13
    //   663: getfield t : Ljava/lang/CharSequence;
    //   666: invokestatic isEmpty : (Ljava/lang/CharSequence;)Z
    //   669: ifeq -> 693
    //   672: aload #13
    //   674: getfield v : Landroid/graphics/drawable/Drawable;
    //   677: ifnonnull -> 693
    //   680: aload #13
    //   682: getfield s : Landroid/widget/Button;
    //   685: bipush #8
    //   687: invokevirtual setVisibility : (I)V
    //   690: goto -> 759
    //   693: aload #13
    //   695: getfield s : Landroid/widget/Button;
    //   698: aload #13
    //   700: getfield t : Ljava/lang/CharSequence;
    //   703: invokevirtual setText : (Ljava/lang/CharSequence;)V
    //   706: aload #13
    //   708: getfield v : Landroid/graphics/drawable/Drawable;
    //   711: astore_1
    //   712: aload_1
    //   713: ifnull -> 746
    //   716: aload #13
    //   718: getfield d : I
    //   721: istore_3
    //   722: aload_1
    //   723: iconst_0
    //   724: iconst_0
    //   725: iload_3
    //   726: iload_3
    //   727: invokevirtual setBounds : (IIII)V
    //   730: aload #13
    //   732: getfield s : Landroid/widget/Button;
    //   735: aload #13
    //   737: getfield v : Landroid/graphics/drawable/Drawable;
    //   740: aconst_null
    //   741: aconst_null
    //   742: aconst_null
    //   743: invokevirtual setCompoundDrawables : (Landroid/graphics/drawable/Drawable;Landroid/graphics/drawable/Drawable;Landroid/graphics/drawable/Drawable;Landroid/graphics/drawable/Drawable;)V
    //   746: aload #13
    //   748: getfield s : Landroid/widget/Button;
    //   751: iconst_0
    //   752: invokevirtual setVisibility : (I)V
    //   755: iload_2
    //   756: iconst_2
    //   757: ior
    //   758: istore_2
    //   759: aload #15
    //   761: ldc_w 16908315
    //   764: invokevirtual findViewById : (I)Landroid/view/View;
    //   767: checkcast android/widget/Button
    //   770: astore_1
    //   771: aload #13
    //   773: aload_1
    //   774: putfield w : Landroid/widget/Button;
    //   777: aload_1
    //   778: aload #13
    //   780: getfield S : Landroid/view/View$OnClickListener;
    //   783: invokevirtual setOnClickListener : (Landroid/view/View$OnClickListener;)V
    //   786: aload #13
    //   788: getfield x : Ljava/lang/CharSequence;
    //   791: invokestatic isEmpty : (Ljava/lang/CharSequence;)Z
    //   794: ifeq -> 818
    //   797: aload #13
    //   799: getfield z : Landroid/graphics/drawable/Drawable;
    //   802: ifnonnull -> 818
    //   805: aload #13
    //   807: getfield w : Landroid/widget/Button;
    //   810: bipush #8
    //   812: invokevirtual setVisibility : (I)V
    //   815: goto -> 884
    //   818: aload #13
    //   820: getfield w : Landroid/widget/Button;
    //   823: aload #13
    //   825: getfield x : Ljava/lang/CharSequence;
    //   828: invokevirtual setText : (Ljava/lang/CharSequence;)V
    //   831: aload #13
    //   833: getfield z : Landroid/graphics/drawable/Drawable;
    //   836: astore_1
    //   837: aload_1
    //   838: ifnull -> 871
    //   841: aload #13
    //   843: getfield d : I
    //   846: istore_3
    //   847: aload_1
    //   848: iconst_0
    //   849: iconst_0
    //   850: iload_3
    //   851: iload_3
    //   852: invokevirtual setBounds : (IIII)V
    //   855: aload #13
    //   857: getfield w : Landroid/widget/Button;
    //   860: aload #13
    //   862: getfield z : Landroid/graphics/drawable/Drawable;
    //   865: aconst_null
    //   866: aconst_null
    //   867: aconst_null
    //   868: invokevirtual setCompoundDrawables : (Landroid/graphics/drawable/Drawable;Landroid/graphics/drawable/Drawable;Landroid/graphics/drawable/Drawable;Landroid/graphics/drawable/Drawable;)V
    //   871: aload #13
    //   873: getfield w : Landroid/widget/Button;
    //   876: iconst_0
    //   877: invokevirtual setVisibility : (I)V
    //   880: iload_2
    //   881: iconst_4
    //   882: ior
    //   883: istore_2
    //   884: aload #13
    //   886: getfield a : Landroid/content/Context;
    //   889: astore #16
    //   891: new android/util/TypedValue
    //   894: dup
    //   895: invokespecial <init> : ()V
    //   898: astore_1
    //   899: aload #16
    //   901: invokevirtual getTheme : ()Landroid/content/res/Resources$Theme;
    //   904: getstatic b/b/a.alertDialogCenterButtons : I
    //   907: aload_1
    //   908: iconst_1
    //   909: invokevirtual resolveAttribute : (ILandroid/util/TypedValue;Z)Z
    //   912: pop
    //   913: aload_1
    //   914: getfield data : I
    //   917: ifeq -> 925
    //   920: iconst_1
    //   921: istore_3
    //   922: goto -> 927
    //   925: iconst_0
    //   926: istore_3
    //   927: iload_3
    //   928: ifeq -> 976
    //   931: iload_2
    //   932: iconst_1
    //   933: if_icmpne -> 945
    //   936: aload #13
    //   938: getfield o : Landroid/widget/Button;
    //   941: astore_1
    //   942: goto -> 970
    //   945: iload_2
    //   946: iconst_2
    //   947: if_icmpne -> 959
    //   950: aload #13
    //   952: getfield s : Landroid/widget/Button;
    //   955: astore_1
    //   956: goto -> 970
    //   959: iload_2
    //   960: iconst_4
    //   961: if_icmpne -> 976
    //   964: aload #13
    //   966: getfield w : Landroid/widget/Button;
    //   969: astore_1
    //   970: aload #13
    //   972: aload_1
    //   973: invokevirtual b : (Landroid/widget/Button;)V
    //   976: iload_2
    //   977: ifeq -> 985
    //   980: iconst_1
    //   981: istore_2
    //   982: goto -> 987
    //   985: iconst_0
    //   986: istore_2
    //   987: iload_2
    //   988: ifne -> 998
    //   991: aload #15
    //   993: bipush #8
    //   995: invokevirtual setVisibility : (I)V
    //   998: aload #13
    //   1000: getfield G : Landroid/view/View;
    //   1003: ifnull -> 1048
    //   1006: new android/view/ViewGroup$LayoutParams
    //   1009: dup
    //   1010: iconst_m1
    //   1011: bipush #-2
    //   1013: invokespecial <init> : (II)V
    //   1016: astore_1
    //   1017: aload #12
    //   1019: aload #13
    //   1021: getfield G : Landroid/view/View;
    //   1024: iconst_0
    //   1025: aload_1
    //   1026: invokevirtual addView : (Landroid/view/View;ILandroid/view/ViewGroup$LayoutParams;)V
    //   1029: aload #13
    //   1031: getfield c : Landroid/view/Window;
    //   1034: getstatic b/b/f.title_template : I
    //   1037: invokevirtual findViewById : (I)Landroid/view/View;
    //   1040: bipush #8
    //   1042: invokevirtual setVisibility : (I)V
    //   1045: goto -> 1248
    //   1048: aload #13
    //   1050: aload #13
    //   1052: getfield c : Landroid/view/Window;
    //   1055: ldc_w 16908294
    //   1058: invokevirtual findViewById : (I)Landroid/view/View;
    //   1061: checkcast android/widget/ImageView
    //   1064: putfield D : Landroid/widget/ImageView;
    //   1067: aload #13
    //   1069: getfield e : Ljava/lang/CharSequence;
    //   1072: invokestatic isEmpty : (Ljava/lang/CharSequence;)Z
    //   1075: iconst_1
    //   1076: ixor
    //   1077: ifeq -> 1215
    //   1080: aload #13
    //   1082: getfield P : Z
    //   1085: ifeq -> 1215
    //   1088: aload #13
    //   1090: getfield c : Landroid/view/Window;
    //   1093: getstatic b/b/f.alertTitle : I
    //   1096: invokevirtual findViewById : (I)Landroid/view/View;
    //   1099: checkcast android/widget/TextView
    //   1102: astore_1
    //   1103: aload #13
    //   1105: aload_1
    //   1106: putfield E : Landroid/widget/TextView;
    //   1109: aload_1
    //   1110: aload #13
    //   1112: getfield e : Ljava/lang/CharSequence;
    //   1115: invokevirtual setText : (Ljava/lang/CharSequence;)V
    //   1118: aload #13
    //   1120: getfield B : I
    //   1123: istore_2
    //   1124: iload_2
    //   1125: ifeq -> 1140
    //   1128: aload #13
    //   1130: getfield D : Landroid/widget/ImageView;
    //   1133: iload_2
    //   1134: invokevirtual setImageResource : (I)V
    //   1137: goto -> 1248
    //   1140: aload #13
    //   1142: getfield C : Landroid/graphics/drawable/Drawable;
    //   1145: astore_1
    //   1146: aload_1
    //   1147: ifnull -> 1162
    //   1150: aload #13
    //   1152: getfield D : Landroid/widget/ImageView;
    //   1155: aload_1
    //   1156: invokevirtual setImageDrawable : (Landroid/graphics/drawable/Drawable;)V
    //   1159: goto -> 1248
    //   1162: aload #13
    //   1164: getfield E : Landroid/widget/TextView;
    //   1167: aload #13
    //   1169: getfield D : Landroid/widget/ImageView;
    //   1172: invokevirtual getPaddingLeft : ()I
    //   1175: aload #13
    //   1177: getfield D : Landroid/widget/ImageView;
    //   1180: invokevirtual getPaddingTop : ()I
    //   1183: aload #13
    //   1185: getfield D : Landroid/widget/ImageView;
    //   1188: invokevirtual getPaddingRight : ()I
    //   1191: aload #13
    //   1193: getfield D : Landroid/widget/ImageView;
    //   1196: invokevirtual getPaddingBottom : ()I
    //   1199: invokevirtual setPadding : (IIII)V
    //   1202: aload #13
    //   1204: getfield D : Landroid/widget/ImageView;
    //   1207: bipush #8
    //   1209: invokevirtual setVisibility : (I)V
    //   1212: goto -> 1248
    //   1215: aload #13
    //   1217: getfield c : Landroid/view/Window;
    //   1220: getstatic b/b/f.title_template : I
    //   1223: invokevirtual findViewById : (I)Landroid/view/View;
    //   1226: bipush #8
    //   1228: invokevirtual setVisibility : (I)V
    //   1231: aload #13
    //   1233: getfield D : Landroid/widget/ImageView;
    //   1236: bipush #8
    //   1238: invokevirtual setVisibility : (I)V
    //   1241: aload #12
    //   1243: bipush #8
    //   1245: invokevirtual setVisibility : (I)V
    //   1248: aload #10
    //   1250: invokevirtual getVisibility : ()I
    //   1253: bipush #8
    //   1255: if_icmpeq -> 1263
    //   1258: iconst_1
    //   1259: istore_2
    //   1260: goto -> 1265
    //   1263: iconst_0
    //   1264: istore_2
    //   1265: aload #12
    //   1267: ifnull -> 1285
    //   1270: aload #12
    //   1272: invokevirtual getVisibility : ()I
    //   1275: bipush #8
    //   1277: if_icmpeq -> 1285
    //   1280: iconst_1
    //   1281: istore_3
    //   1282: goto -> 1287
    //   1285: iconst_0
    //   1286: istore_3
    //   1287: aload #15
    //   1289: invokevirtual getVisibility : ()I
    //   1292: bipush #8
    //   1294: if_icmpeq -> 1303
    //   1297: iconst_1
    //   1298: istore #4
    //   1300: goto -> 1306
    //   1303: iconst_0
    //   1304: istore #4
    //   1306: iload #4
    //   1308: ifne -> 1329
    //   1311: aload #14
    //   1313: getstatic b/b/f.textSpacerNoButtons : I
    //   1316: invokevirtual findViewById : (I)Landroid/view/View;
    //   1319: astore_1
    //   1320: aload_1
    //   1321: ifnull -> 1329
    //   1324: aload_1
    //   1325: iconst_0
    //   1326: invokevirtual setVisibility : (I)V
    //   1329: iload_3
    //   1330: ifeq -> 1388
    //   1333: aload #13
    //   1335: getfield A : Landroidx/core/widget/NestedScrollView;
    //   1338: astore_1
    //   1339: aload_1
    //   1340: ifnull -> 1348
    //   1343: aload_1
    //   1344: iconst_1
    //   1345: invokevirtual setClipToPadding : (Z)V
    //   1348: aload #13
    //   1350: getfield f : Ljava/lang/CharSequence;
    //   1353: ifnonnull -> 1372
    //   1356: aload #13
    //   1358: getfield g : Landroid/widget/ListView;
    //   1361: ifnull -> 1367
    //   1364: goto -> 1372
    //   1367: aconst_null
    //   1368: astore_1
    //   1369: goto -> 1381
    //   1372: aload #12
    //   1374: getstatic b/b/f.titleDividerNoCustom : I
    //   1377: invokevirtual findViewById : (I)Landroid/view/View;
    //   1380: astore_1
    //   1381: aload_1
    //   1382: ifnull -> 1406
    //   1385: goto -> 1401
    //   1388: aload #14
    //   1390: getstatic b/b/f.textSpacerNoTitle : I
    //   1393: invokevirtual findViewById : (I)Landroid/view/View;
    //   1396: astore_1
    //   1397: aload_1
    //   1398: ifnull -> 1406
    //   1401: aload_1
    //   1402: iconst_0
    //   1403: invokevirtual setVisibility : (I)V
    //   1406: aload #13
    //   1408: getfield g : Landroid/widget/ListView;
    //   1411: astore_1
    //   1412: aload_1
    //   1413: instanceof androidx/appcompat/app/AlertController$RecycleListView
    //   1416: ifeq -> 1505
    //   1419: aload_1
    //   1420: checkcast androidx/appcompat/app/AlertController$RecycleListView
    //   1423: astore_1
    //   1424: aload_1
    //   1425: ifnull -> 1503
    //   1428: iload #4
    //   1430: ifeq -> 1437
    //   1433: iload_3
    //   1434: ifne -> 1505
    //   1437: aload_1
    //   1438: invokevirtual getPaddingLeft : ()I
    //   1441: istore #8
    //   1443: iload_3
    //   1444: ifeq -> 1456
    //   1447: aload_1
    //   1448: invokevirtual getPaddingTop : ()I
    //   1451: istore #5
    //   1453: goto -> 1462
    //   1456: aload_1
    //   1457: getfield b : I
    //   1460: istore #5
    //   1462: aload_1
    //   1463: invokevirtual getPaddingRight : ()I
    //   1466: istore #9
    //   1468: iload #4
    //   1470: ifeq -> 1482
    //   1473: aload_1
    //   1474: invokevirtual getPaddingBottom : ()I
    //   1477: istore #6
    //   1479: goto -> 1488
    //   1482: aload_1
    //   1483: getfield c : I
    //   1486: istore #6
    //   1488: aload_1
    //   1489: iload #8
    //   1491: iload #5
    //   1493: iload #9
    //   1495: iload #6
    //   1497: invokevirtual setPadding : (IIII)V
    //   1500: goto -> 1505
    //   1503: aconst_null
    //   1504: athrow
    //   1505: iload_2
    //   1506: ifne -> 1796
    //   1509: aload #13
    //   1511: getfield g : Landroid/widget/ListView;
    //   1514: astore #10
    //   1516: aload #10
    //   1518: ifnull -> 1524
    //   1521: goto -> 1531
    //   1524: aload #13
    //   1526: getfield A : Landroidx/core/widget/NestedScrollView;
    //   1529: astore #10
    //   1531: aload #10
    //   1533: ifnull -> 1796
    //   1536: iload #7
    //   1538: istore_2
    //   1539: iload #4
    //   1541: ifeq -> 1546
    //   1544: iconst_2
    //   1545: istore_2
    //   1546: iload_3
    //   1547: iload_2
    //   1548: ior
    //   1549: istore_2
    //   1550: aload #13
    //   1552: getfield c : Landroid/view/Window;
    //   1555: getstatic b/b/f.scrollIndicatorUp : I
    //   1558: invokevirtual findViewById : (I)Landroid/view/View;
    //   1561: astore #12
    //   1563: aload #13
    //   1565: getfield c : Landroid/view/Window;
    //   1568: getstatic b/b/f.scrollIndicatorDown : I
    //   1571: invokevirtual findViewById : (I)Landroid/view/View;
    //   1574: astore_1
    //   1575: getstatic android/os/Build$VERSION.SDK_INT : I
    //   1578: bipush #23
    //   1580: if_icmplt -> 1609
    //   1583: aload #10
    //   1585: iload_2
    //   1586: iconst_3
    //   1587: invokestatic g0 : (Landroid/view/View;II)V
    //   1590: aload #12
    //   1592: ifnull -> 1602
    //   1595: aload #14
    //   1597: aload #12
    //   1599: invokevirtual removeView : (Landroid/view/View;)V
    //   1602: aload_1
    //   1603: ifnull -> 1796
    //   1606: goto -> 1790
    //   1609: aload #12
    //   1611: astore #10
    //   1613: aload #12
    //   1615: ifnull -> 1638
    //   1618: aload #12
    //   1620: astore #10
    //   1622: iload_2
    //   1623: iconst_1
    //   1624: iand
    //   1625: ifne -> 1638
    //   1628: aload #14
    //   1630: aload #12
    //   1632: invokevirtual removeView : (Landroid/view/View;)V
    //   1635: aconst_null
    //   1636: astore #10
    //   1638: aload_1
    //   1639: ifnull -> 1660
    //   1642: iload_2
    //   1643: iconst_2
    //   1644: iand
    //   1645: ifne -> 1660
    //   1648: aload #14
    //   1650: aload_1
    //   1651: invokevirtual removeView : (Landroid/view/View;)V
    //   1654: aload #11
    //   1656: astore_1
    //   1657: goto -> 1660
    //   1660: aload #10
    //   1662: ifnonnull -> 1669
    //   1665: aload_1
    //   1666: ifnull -> 1796
    //   1669: aload #13
    //   1671: getfield f : Ljava/lang/CharSequence;
    //   1674: ifnull -> 1721
    //   1677: aload #13
    //   1679: getfield A : Landroidx/core/widget/NestedScrollView;
    //   1682: new b/b/k/b
    //   1685: dup
    //   1686: aload #13
    //   1688: aload #10
    //   1690: aload_1
    //   1691: invokespecial <init> : (Landroidx/appcompat/app/AlertController;Landroid/view/View;Landroid/view/View;)V
    //   1694: invokevirtual setOnScrollChangeListener : (Landroidx/core/widget/NestedScrollView$b;)V
    //   1697: aload #13
    //   1699: getfield A : Landroidx/core/widget/NestedScrollView;
    //   1702: new b/b/k/c
    //   1705: dup
    //   1706: aload #13
    //   1708: aload #10
    //   1710: aload_1
    //   1711: invokespecial <init> : (Landroidx/appcompat/app/AlertController;Landroid/view/View;Landroid/view/View;)V
    //   1714: invokevirtual post : (Ljava/lang/Runnable;)Z
    //   1717: pop
    //   1718: goto -> 1796
    //   1721: aload #13
    //   1723: getfield g : Landroid/widget/ListView;
    //   1726: astore #11
    //   1728: aload #11
    //   1730: ifnull -> 1774
    //   1733: aload #11
    //   1735: new b/b/k/d
    //   1738: dup
    //   1739: aload #13
    //   1741: aload #10
    //   1743: aload_1
    //   1744: invokespecial <init> : (Landroidx/appcompat/app/AlertController;Landroid/view/View;Landroid/view/View;)V
    //   1747: invokevirtual setOnScrollListener : (Landroid/widget/AbsListView$OnScrollListener;)V
    //   1750: aload #13
    //   1752: getfield g : Landroid/widget/ListView;
    //   1755: new b/b/k/e
    //   1758: dup
    //   1759: aload #13
    //   1761: aload #10
    //   1763: aload_1
    //   1764: invokespecial <init> : (Landroidx/appcompat/app/AlertController;Landroid/view/View;Landroid/view/View;)V
    //   1767: invokevirtual post : (Ljava/lang/Runnable;)Z
    //   1770: pop
    //   1771: goto -> 1796
    //   1774: aload #10
    //   1776: ifnull -> 1786
    //   1779: aload #14
    //   1781: aload #10
    //   1783: invokevirtual removeView : (Landroid/view/View;)V
    //   1786: aload_1
    //   1787: ifnull -> 1796
    //   1790: aload #14
    //   1792: aload_1
    //   1793: invokevirtual removeView : (Landroid/view/View;)V
    //   1796: aload #13
    //   1798: getfield g : Landroid/widget/ListView;
    //   1801: astore_1
    //   1802: aload_1
    //   1803: ifnull -> 1846
    //   1806: aload #13
    //   1808: getfield H : Landroid/widget/ListAdapter;
    //   1811: astore #10
    //   1813: aload #10
    //   1815: ifnull -> 1846
    //   1818: aload_1
    //   1819: aload #10
    //   1821: invokevirtual setAdapter : (Landroid/widget/ListAdapter;)V
    //   1824: aload #13
    //   1826: getfield I : I
    //   1829: istore_2
    //   1830: iload_2
    //   1831: iconst_m1
    //   1832: if_icmple -> 1846
    //   1835: aload_1
    //   1836: iload_2
    //   1837: iconst_1
    //   1838: invokevirtual setItemChecked : (IZ)V
    //   1841: aload_1
    //   1842: iload_2
    //   1843: invokevirtual setSelection : (I)V
    //   1846: return
  }
  
  public boolean onKeyDown(int paramInt, KeyEvent paramKeyEvent) {
    boolean bool;
    NestedScrollView nestedScrollView = this.d.A;
    if (nestedScrollView != null && nestedScrollView.j(paramKeyEvent)) {
      bool = true;
    } else {
      bool = false;
    } 
    return bool ? true : super.onKeyDown(paramInt, paramKeyEvent);
  }
  
  public boolean onKeyUp(int paramInt, KeyEvent paramKeyEvent) {
    boolean bool;
    NestedScrollView nestedScrollView = this.d.A;
    if (nestedScrollView != null && nestedScrollView.j(paramKeyEvent)) {
      bool = true;
    } else {
      bool = false;
    } 
    return bool ? true : super.onKeyUp(paramInt, paramKeyEvent);
  }
  
  public void setTitle(CharSequence paramCharSequence) {
    super.setTitle(paramCharSequence);
    AlertController alertController = this.d;
    alertController.e = paramCharSequence;
    TextView textView = alertController.E;
    if (textView != null)
      textView.setText(paramCharSequence); 
  }
  
  public static class a {
    public final AlertController.b a;
    
    public final int b;
    
    public a(Context param1Context) {
      this.a = new AlertController.b((Context)new ContextThemeWrapper(param1Context, g.d(param1Context, i)));
      this.b = i;
    }
    
    public g a() {
      g g = new g(this.a.a, this.b);
      AlertController.b b1 = this.a;
      AlertController alertController = g.d;
      View view2 = b1.g;
      if (view2 != null) {
        alertController.G = view2;
      } else {
        CharSequence charSequence = b1.f;
        if (charSequence != null) {
          alertController.e = charSequence;
          TextView textView = alertController.E;
          if (textView != null)
            textView.setText(charSequence); 
        } 
        Drawable drawable = b1.d;
        if (drawable != null) {
          alertController.C = drawable;
          alertController.B = 0;
          ImageView imageView = alertController.D;
          if (imageView != null) {
            imageView.setVisibility(0);
            alertController.D.setImageDrawable(drawable);
          } 
        } 
        int i = b1.c;
        if (i != 0)
          alertController.f(i); 
        i = b1.e;
        if (i != 0)
          if (alertController != null) {
            TypedValue typedValue = new TypedValue();
            alertController.a.getTheme().resolveAttribute(i, typedValue, true);
            alertController.f(typedValue.resourceId);
          } else {
            throw null;
          }  
      } 
      CharSequence charSequence2 = b1.h;
      if (charSequence2 != null) {
        alertController.f = charSequence2;
        TextView textView = alertController.F;
        if (textView != null)
          textView.setText(charSequence2); 
      } 
      CharSequence charSequence1 = b1.i;
      if (charSequence1 != null)
        alertController.e(-1, charSequence1, b1.j, null, null); 
      charSequence1 = b1.k;
      if (charSequence1 != null)
        alertController.e(-2, charSequence1, b1.l, null, null); 
      if (b1.q != null) {
        int i;
        AlertController.d d;
        AlertController.RecycleListView recycleListView = (AlertController.RecycleListView)b1.b.inflate(alertController.L, null);
        if (b1.v) {
          i = alertController.N;
        } else {
          i = alertController.O;
        } 
        ListAdapter listAdapter = b1.q;
        if (listAdapter == null)
          d = new AlertController.d(b1.a, i, 16908308, null); 
        alertController.H = (ListAdapter)d;
        alertController.I = b1.w;
        if (b1.r != null)
          recycleListView.setOnItemClickListener(new f(b1, alertController)); 
        if (b1.v)
          recycleListView.setChoiceMode(1); 
        alertController.g = (ListView)recycleListView;
      } 
      View view1 = b1.t;
      if (view1 != null) {
        if (b1.u) {
          alertController.h = view1;
          alertController.i = 0;
          alertController.n = true;
          alertController.j = 0;
          alertController.k = 0;
          alertController.l = 0;
          alertController.m = 0;
        } else {
          alertController.h = view1;
          alertController.i = 0;
          alertController.n = false;
        } 
      } else {
        int i = b1.s;
        if (i != 0) {
          alertController.h = null;
          alertController.i = i;
          alertController.n = false;
        } 
      } 
      g.setCancelable(this.a.m);
      if (this.a.m)
        g.setCanceledOnTouchOutside(true); 
      g.setOnCancelListener(this.a.n);
      g.setOnDismissListener(this.a.o);
      DialogInterface.OnKeyListener onKeyListener = this.a.p;
      if (onKeyListener != null)
        g.setOnKeyListener(onKeyListener); 
      return g;
    }
  }
}


/* Location:              C:\Users\panch\Downloads\dvba_v1.1.0-dex2jar.jar!\b\b\k\g.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */