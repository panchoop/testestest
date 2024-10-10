package b.b.k;

import a.a.a.a.a;
import android.app.Activity;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.os.Bundle;
import android.util.DisplayMetrics;
import android.util.Log;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import b.b.o.a;
import b.b.o.f;
import b.b.p.c1;
import b.b.p.j;
import b.b.p.n0;
import b.f.e;
import b.i.d.a;
import b.i.d.m;
import b.i.e.a;
import b.l.a.e;
import java.util.ArrayList;

public class h extends e implements i, m {
  public j n;
  
  public Resources o;
  
  public void addContentView(View paramView, ViewGroup.LayoutParams paramLayoutParams) {
    q().c(paramView, paramLayoutParams);
  }
  
  public void attachBaseContext(Context paramContext) {
    // Byte code:
    //   0: aload_0
    //   1: invokevirtual q : ()Lb/b/k/j;
    //   4: checkcast b/b/k/k
    //   7: astore #10
    //   9: aload #10
    //   11: iconst_1
    //   12: putfield J : Z
    //   15: aload #10
    //   17: getfield N : I
    //   20: istore #4
    //   22: iload #4
    //   24: bipush #-100
    //   26: if_icmpeq -> 32
    //   29: goto -> 36
    //   32: bipush #-100
    //   34: istore #4
    //   36: aload #10
    //   38: aload_1
    //   39: iload #4
    //   41: invokevirtual H : (Landroid/content/Context;I)I
    //   44: istore #4
    //   46: getstatic b/b/k/k.e0 : Z
    //   49: ifeq -> 84
    //   52: aload_1
    //   53: instanceof android/view/ContextThemeWrapper
    //   56: ifeq -> 84
    //   59: aload #10
    //   61: aload_1
    //   62: iload #4
    //   64: aconst_null
    //   65: invokevirtual v : (Landroid/content/Context;ILandroid/content/res/Configuration;)Landroid/content/res/Configuration;
    //   68: astore #8
    //   70: aload_1
    //   71: checkcast android/view/ContextThemeWrapper
    //   74: aload #8
    //   76: invokevirtual applyOverrideConfiguration : (Landroid/content/res/Configuration;)V
    //   79: goto -> 1189
    //   82: astore #8
    //   84: aload_1
    //   85: instanceof b/b/o/c
    //   88: ifeq -> 116
    //   91: aload #10
    //   93: aload_1
    //   94: iload #4
    //   96: aconst_null
    //   97: invokevirtual v : (Landroid/content/Context;ILandroid/content/res/Configuration;)Landroid/content/res/Configuration;
    //   100: astore #8
    //   102: aload_1
    //   103: checkcast b/b/o/c
    //   106: aload #8
    //   108: invokevirtual a : (Landroid/content/res/Configuration;)V
    //   111: goto -> 1189
    //   114: astore #8
    //   116: getstatic b/b/k/k.d0 : Z
    //   119: ifne -> 125
    //   122: goto -> 1189
    //   125: aload_1
    //   126: invokevirtual getPackageManager : ()Landroid/content/pm/PackageManager;
    //   129: aload_1
    //   130: invokevirtual getApplicationInfo : ()Landroid/content/pm/ApplicationInfo;
    //   133: invokevirtual getResourcesForApplication : (Landroid/content/pm/ApplicationInfo;)Landroid/content/res/Resources;
    //   136: invokevirtual getConfiguration : ()Landroid/content/res/Configuration;
    //   139: astore #12
    //   141: aload_1
    //   142: invokevirtual getResources : ()Landroid/content/res/Resources;
    //   145: invokevirtual getConfiguration : ()Landroid/content/res/Configuration;
    //   148: astore #11
    //   150: aload #12
    //   152: aload #11
    //   154: invokevirtual equals : (Landroid/content/res/Configuration;)Z
    //   157: ifne -> 980
    //   160: new android/content/res/Configuration
    //   163: dup
    //   164: invokespecial <init> : ()V
    //   167: astore #9
    //   169: aload #9
    //   171: fconst_0
    //   172: putfield fontScale : F
    //   175: aload #9
    //   177: astore #8
    //   179: aload #11
    //   181: ifnull -> 983
    //   184: aload #12
    //   186: aload #11
    //   188: invokevirtual diff : (Landroid/content/res/Configuration;)I
    //   191: ifne -> 201
    //   194: aload #9
    //   196: astore #8
    //   198: goto -> 983
    //   201: aload #12
    //   203: getfield fontScale : F
    //   206: fstore_3
    //   207: aload #11
    //   209: getfield fontScale : F
    //   212: fstore_2
    //   213: fload_3
    //   214: fload_2
    //   215: fcmpl
    //   216: ifeq -> 225
    //   219: aload #9
    //   221: fload_2
    //   222: putfield fontScale : F
    //   225: aload #12
    //   227: getfield mcc : I
    //   230: istore #5
    //   232: aload #11
    //   234: getfield mcc : I
    //   237: istore #6
    //   239: iload #5
    //   241: iload #6
    //   243: if_icmpeq -> 253
    //   246: aload #9
    //   248: iload #6
    //   250: putfield mcc : I
    //   253: aload #12
    //   255: getfield mnc : I
    //   258: istore #5
    //   260: aload #11
    //   262: getfield mnc : I
    //   265: istore #6
    //   267: iload #5
    //   269: iload #6
    //   271: if_icmpeq -> 281
    //   274: aload #9
    //   276: iload #6
    //   278: putfield mnc : I
    //   281: getstatic android/os/Build$VERSION.SDK_INT : I
    //   284: bipush #24
    //   286: if_icmplt -> 333
    //   289: aload #12
    //   291: invokevirtual getLocales : ()Landroid/os/LocaleList;
    //   294: astore #13
    //   296: aload #11
    //   298: invokevirtual getLocales : ()Landroid/os/LocaleList;
    //   301: astore #8
    //   303: aload #13
    //   305: aload #8
    //   307: invokevirtual equals : (Ljava/lang/Object;)Z
    //   310: ifne -> 359
    //   313: aload #9
    //   315: aload #8
    //   317: invokevirtual setLocales : (Landroid/os/LocaleList;)V
    //   320: aload #9
    //   322: aload #11
    //   324: getfield locale : Ljava/util/Locale;
    //   327: putfield locale : Ljava/util/Locale;
    //   330: goto -> 359
    //   333: aload #12
    //   335: getfield locale : Ljava/util/Locale;
    //   338: aload #11
    //   340: getfield locale : Ljava/util/Locale;
    //   343: invokestatic equals : (Ljava/lang/Object;Ljava/lang/Object;)Z
    //   346: ifne -> 359
    //   349: aload #9
    //   351: aload #11
    //   353: getfield locale : Ljava/util/Locale;
    //   356: putfield locale : Ljava/util/Locale;
    //   359: aload #12
    //   361: getfield touchscreen : I
    //   364: istore #5
    //   366: aload #11
    //   368: getfield touchscreen : I
    //   371: istore #6
    //   373: iload #5
    //   375: iload #6
    //   377: if_icmpeq -> 387
    //   380: aload #9
    //   382: iload #6
    //   384: putfield touchscreen : I
    //   387: aload #12
    //   389: getfield keyboard : I
    //   392: istore #5
    //   394: aload #11
    //   396: getfield keyboard : I
    //   399: istore #6
    //   401: iload #5
    //   403: iload #6
    //   405: if_icmpeq -> 415
    //   408: aload #9
    //   410: iload #6
    //   412: putfield keyboard : I
    //   415: aload #12
    //   417: getfield keyboardHidden : I
    //   420: istore #5
    //   422: aload #11
    //   424: getfield keyboardHidden : I
    //   427: istore #6
    //   429: iload #5
    //   431: iload #6
    //   433: if_icmpeq -> 443
    //   436: aload #9
    //   438: iload #6
    //   440: putfield keyboardHidden : I
    //   443: aload #12
    //   445: getfield navigation : I
    //   448: istore #6
    //   450: aload #11
    //   452: getfield navigation : I
    //   455: istore #5
    //   457: iload #6
    //   459: iload #5
    //   461: if_icmpeq -> 471
    //   464: aload #9
    //   466: iload #5
    //   468: putfield navigation : I
    //   471: aload #12
    //   473: getfield navigationHidden : I
    //   476: istore #6
    //   478: aload #11
    //   480: getfield navigationHidden : I
    //   483: istore #5
    //   485: iload #6
    //   487: iload #5
    //   489: if_icmpeq -> 499
    //   492: aload #9
    //   494: iload #5
    //   496: putfield navigationHidden : I
    //   499: aload #12
    //   501: getfield orientation : I
    //   504: istore #6
    //   506: aload #11
    //   508: getfield orientation : I
    //   511: istore #5
    //   513: iload #6
    //   515: iload #5
    //   517: if_icmpeq -> 527
    //   520: aload #9
    //   522: iload #5
    //   524: putfield orientation : I
    //   527: aload #12
    //   529: getfield screenLayout : I
    //   532: istore #5
    //   534: aload #11
    //   536: getfield screenLayout : I
    //   539: bipush #15
    //   541: iand
    //   542: istore #6
    //   544: iload #5
    //   546: bipush #15
    //   548: iand
    //   549: iload #6
    //   551: if_icmpeq -> 567
    //   554: aload #9
    //   556: aload #9
    //   558: getfield screenLayout : I
    //   561: iload #6
    //   563: ior
    //   564: putfield screenLayout : I
    //   567: aload #12
    //   569: getfield screenLayout : I
    //   572: istore #6
    //   574: aload #11
    //   576: getfield screenLayout : I
    //   579: sipush #192
    //   582: iand
    //   583: istore #5
    //   585: iload #6
    //   587: sipush #192
    //   590: iand
    //   591: iload #5
    //   593: if_icmpeq -> 609
    //   596: aload #9
    //   598: aload #9
    //   600: getfield screenLayout : I
    //   603: iload #5
    //   605: ior
    //   606: putfield screenLayout : I
    //   609: aload #12
    //   611: getfield screenLayout : I
    //   614: istore #6
    //   616: aload #11
    //   618: getfield screenLayout : I
    //   621: bipush #48
    //   623: iand
    //   624: istore #5
    //   626: iload #6
    //   628: bipush #48
    //   630: iand
    //   631: iload #5
    //   633: if_icmpeq -> 649
    //   636: aload #9
    //   638: aload #9
    //   640: getfield screenLayout : I
    //   643: iload #5
    //   645: ior
    //   646: putfield screenLayout : I
    //   649: aload #12
    //   651: getfield screenLayout : I
    //   654: istore #5
    //   656: aload #11
    //   658: getfield screenLayout : I
    //   661: sipush #768
    //   664: iand
    //   665: istore #6
    //   667: iload #5
    //   669: sipush #768
    //   672: iand
    //   673: iload #6
    //   675: if_icmpeq -> 691
    //   678: aload #9
    //   680: aload #9
    //   682: getfield screenLayout : I
    //   685: iload #6
    //   687: ior
    //   688: putfield screenLayout : I
    //   691: getstatic android/os/Build$VERSION.SDK_INT : I
    //   694: bipush #26
    //   696: if_icmplt -> 777
    //   699: aload #12
    //   701: getfield colorMode : I
    //   704: istore #5
    //   706: aload #11
    //   708: getfield colorMode : I
    //   711: iconst_3
    //   712: iand
    //   713: istore #6
    //   715: iload #5
    //   717: iconst_3
    //   718: iand
    //   719: iload #6
    //   721: if_icmpeq -> 737
    //   724: aload #9
    //   726: aload #9
    //   728: getfield colorMode : I
    //   731: iload #6
    //   733: ior
    //   734: putfield colorMode : I
    //   737: aload #12
    //   739: getfield colorMode : I
    //   742: istore #6
    //   744: aload #11
    //   746: getfield colorMode : I
    //   749: bipush #12
    //   751: iand
    //   752: istore #5
    //   754: iload #6
    //   756: bipush #12
    //   758: iand
    //   759: iload #5
    //   761: if_icmpeq -> 777
    //   764: aload #9
    //   766: aload #9
    //   768: getfield colorMode : I
    //   771: iload #5
    //   773: ior
    //   774: putfield colorMode : I
    //   777: aload #12
    //   779: getfield uiMode : I
    //   782: istore #6
    //   784: aload #11
    //   786: getfield uiMode : I
    //   789: bipush #15
    //   791: iand
    //   792: istore #5
    //   794: iload #6
    //   796: bipush #15
    //   798: iand
    //   799: iload #5
    //   801: if_icmpeq -> 817
    //   804: aload #9
    //   806: aload #9
    //   808: getfield uiMode : I
    //   811: iload #5
    //   813: ior
    //   814: putfield uiMode : I
    //   817: aload #12
    //   819: getfield uiMode : I
    //   822: istore #6
    //   824: aload #11
    //   826: getfield uiMode : I
    //   829: bipush #48
    //   831: iand
    //   832: istore #5
    //   834: iload #6
    //   836: bipush #48
    //   838: iand
    //   839: iload #5
    //   841: if_icmpeq -> 857
    //   844: aload #9
    //   846: aload #9
    //   848: getfield uiMode : I
    //   851: iload #5
    //   853: ior
    //   854: putfield uiMode : I
    //   857: aload #12
    //   859: getfield screenWidthDp : I
    //   862: istore #6
    //   864: aload #11
    //   866: getfield screenWidthDp : I
    //   869: istore #5
    //   871: iload #6
    //   873: iload #5
    //   875: if_icmpeq -> 885
    //   878: aload #9
    //   880: iload #5
    //   882: putfield screenWidthDp : I
    //   885: aload #12
    //   887: getfield screenHeightDp : I
    //   890: istore #5
    //   892: aload #11
    //   894: getfield screenHeightDp : I
    //   897: istore #6
    //   899: iload #5
    //   901: iload #6
    //   903: if_icmpeq -> 913
    //   906: aload #9
    //   908: iload #6
    //   910: putfield screenHeightDp : I
    //   913: aload #12
    //   915: getfield smallestScreenWidthDp : I
    //   918: istore #5
    //   920: aload #11
    //   922: getfield smallestScreenWidthDp : I
    //   925: istore #6
    //   927: iload #5
    //   929: iload #6
    //   931: if_icmpeq -> 941
    //   934: aload #9
    //   936: iload #6
    //   938: putfield smallestScreenWidthDp : I
    //   941: aload #12
    //   943: getfield densityDpi : I
    //   946: istore #5
    //   948: aload #11
    //   950: getfield densityDpi : I
    //   953: istore #6
    //   955: aload #9
    //   957: astore #8
    //   959: iload #5
    //   961: iload #6
    //   963: if_icmpeq -> 983
    //   966: aload #9
    //   968: iload #6
    //   970: putfield densityDpi : I
    //   973: aload #9
    //   975: astore #8
    //   977: goto -> 983
    //   980: aconst_null
    //   981: astore #8
    //   983: aload #10
    //   985: aload_1
    //   986: iload #4
    //   988: aload #8
    //   990: invokevirtual v : (Landroid/content/Context;ILandroid/content/res/Configuration;)Landroid/content/res/Configuration;
    //   993: astore #9
    //   995: new b/b/o/c
    //   998: dup
    //   999: aload_1
    //   1000: getstatic b/b/i.Theme_AppCompat_Empty : I
    //   1003: invokespecial <init> : (Landroid/content/Context;I)V
    //   1006: astore #8
    //   1008: aload #8
    //   1010: aload #9
    //   1012: invokevirtual a : (Landroid/content/res/Configuration;)V
    //   1015: aload_1
    //   1016: invokevirtual getTheme : ()Landroid/content/res/Resources$Theme;
    //   1019: astore_1
    //   1020: aload_1
    //   1021: ifnull -> 1030
    //   1024: iconst_1
    //   1025: istore #4
    //   1027: goto -> 1033
    //   1030: iconst_0
    //   1031: istore #4
    //   1033: iload #4
    //   1035: ifeq -> 1186
    //   1038: aload #8
    //   1040: invokevirtual getTheme : ()Landroid/content/res/Resources$Theme;
    //   1043: astore_1
    //   1044: getstatic android/os/Build$VERSION.SDK_INT : I
    //   1047: istore #4
    //   1049: iload #4
    //   1051: bipush #29
    //   1053: if_icmplt -> 1063
    //   1056: aload_1
    //   1057: invokevirtual rebase : ()V
    //   1060: goto -> 1186
    //   1063: iload #4
    //   1065: bipush #23
    //   1067: if_icmplt -> 1186
    //   1070: getstatic b/i/e/b/h.a : Ljava/lang/Object;
    //   1073: astore #9
    //   1075: aload #9
    //   1077: monitorenter
    //   1078: getstatic b/i/e/b/h.c : Z
    //   1081: istore #7
    //   1083: iload #7
    //   1085: ifne -> 1131
    //   1088: ldc android/content/res/Resources$Theme
    //   1090: ldc 'rebase'
    //   1092: iconst_0
    //   1093: anewarray java/lang/Class
    //   1096: invokevirtual getDeclaredMethod : (Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;
    //   1099: astore #10
    //   1101: aload #10
    //   1103: putstatic b/i/e/b/h.b : Ljava/lang/reflect/Method;
    //   1106: aload #10
    //   1108: iconst_1
    //   1109: invokevirtual setAccessible : (Z)V
    //   1112: goto -> 1127
    //   1115: astore #10
    //   1117: ldc 'ResourcesCompat'
    //   1119: ldc 'Failed to retrieve rebase() method'
    //   1121: aload #10
    //   1123: invokestatic i : (Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I
    //   1126: pop
    //   1127: iconst_1
    //   1128: putstatic b/i/e/b/h.c : Z
    //   1131: getstatic b/i/e/b/h.b : Ljava/lang/reflect/Method;
    //   1134: astore #10
    //   1136: aload #10
    //   1138: ifnull -> 1174
    //   1141: getstatic b/i/e/b/h.b : Ljava/lang/reflect/Method;
    //   1144: aload_1
    //   1145: iconst_0
    //   1146: anewarray java/lang/Object
    //   1149: invokevirtual invoke : (Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
    //   1152: pop
    //   1153: goto -> 1174
    //   1156: astore_1
    //   1157: goto -> 1161
    //   1160: astore_1
    //   1161: ldc 'ResourcesCompat'
    //   1163: ldc 'Failed to invoke rebase() method via reflection'
    //   1165: aload_1
    //   1166: invokestatic i : (Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I
    //   1169: pop
    //   1170: aconst_null
    //   1171: putstatic b/i/e/b/h.b : Ljava/lang/reflect/Method;
    //   1174: aload #9
    //   1176: monitorexit
    //   1177: goto -> 1186
    //   1180: astore_1
    //   1181: aload #9
    //   1183: monitorexit
    //   1184: aload_1
    //   1185: athrow
    //   1186: aload #8
    //   1188: astore_1
    //   1189: aload_0
    //   1190: aload_1
    //   1191: invokespecial attachBaseContext : (Landroid/content/Context;)V
    //   1194: return
    //   1195: astore_1
    //   1196: new java/lang/RuntimeException
    //   1199: dup
    //   1200: ldc_w 'Application failed to obtain resources from itself'
    //   1203: aload_1
    //   1204: invokespecial <init> : (Ljava/lang/String;Ljava/lang/Throwable;)V
    //   1207: athrow
    //   1208: astore_1
    //   1209: goto -> 1030
    // Exception table:
    //   from	to	target	type
    //   70	79	82	java/lang/IllegalStateException
    //   102	111	114	java/lang/IllegalStateException
    //   125	141	1195	android/content/pm/PackageManager$NameNotFoundException
    //   1015	1020	1208	java/lang/NullPointerException
    //   1078	1083	1180	finally
    //   1088	1112	1115	java/lang/NoSuchMethodException
    //   1088	1112	1180	finally
    //   1117	1127	1180	finally
    //   1127	1131	1180	finally
    //   1131	1136	1180	finally
    //   1141	1153	1160	java/lang/IllegalAccessException
    //   1141	1153	1156	java/lang/reflect/InvocationTargetException
    //   1141	1153	1180	finally
    //   1161	1174	1180	finally
    //   1174	1177	1180	finally
    //   1181	1184	1180	finally
  }
  
  public void b(a parama) {}
  
  public void closeOptionsMenu() {
    r();
    if (getWindow().hasFeature(0))
      super.closeOptionsMenu(); 
  }
  
  public boolean dispatchKeyEvent(KeyEvent paramKeyEvent) {
    paramKeyEvent.getKeyCode();
    r();
    return super.dispatchKeyEvent(paramKeyEvent);
  }
  
  public <T extends View> T findViewById(int paramInt) {
    k k = (k)q();
    k.z();
    return (T)k.f.findViewById(paramInt);
  }
  
  public void g(a parama) {}
  
  public MenuInflater getMenuInflater() {
    k k = (k)q();
    if (k.j == null) {
      Context context;
      k.F();
      a a = k.i;
      if (a != null) {
        context = a.d();
      } else {
        context = k.e;
      } 
      k.j = (MenuInflater)new f(context);
    } 
    return k.j;
  }
  
  public Resources getResources() {
    if (this.o == null)
      c1.a(); 
    Resources resources2 = this.o;
    Resources resources1 = resources2;
    if (resources2 == null)
      resources1 = super.getResources(); 
    return resources1;
  }
  
  public a h(a.a parama) {
    return null;
  }
  
  public void invalidateOptionsMenu() {
    q().g();
  }
  
  public Intent j() {
    return a.I((Activity)this);
  }
  
  public void onConfigurationChanged(Configuration paramConfiguration) {
    super.onConfigurationChanged(paramConfiguration);
    if (this.o != null) {
      DisplayMetrics displayMetrics = super.getResources().getDisplayMetrics();
      this.o.updateConfiguration(paramConfiguration, displayMetrics);
    } 
    null = (k)q();
    if (null.A && null.u) {
      null.F();
      a a = null.i;
      if (a != null)
        a.e(paramConfiguration); 
    } 
    j j1 = j.a();
    synchronized (null.e) {
      synchronized (j1.a) {
        e e1 = (e)null.d.get(null);
        if (e1 != null)
          e1.b(); 
        /* monitor exit ClassFileLocalVariableReferenceExpression{type=ObjectType{b/b/p/j}, name=null} */
        null.q(false);
        return;
      } 
    } 
  }
  
  public void onContentChanged() {}
  
  public void onCreate(Bundle paramBundle) {
    j j1 = q();
    j1.f();
    j1.h(paramBundle);
    super.onCreate(paramBundle);
  }
  
  public void onDestroy() {
    super.onDestroy();
    q().i();
  }
  
  public boolean onKeyDown(int paramInt, KeyEvent paramKeyEvent) {
    // Byte code:
    //   0: getstatic android/os/Build$VERSION.SDK_INT : I
    //   3: bipush #26
    //   5: if_icmpge -> 78
    //   8: aload_2
    //   9: invokevirtual isCtrlPressed : ()Z
    //   12: ifne -> 78
    //   15: aload_2
    //   16: invokevirtual getMetaState : ()I
    //   19: invokestatic metaStateHasNoModifiers : (I)Z
    //   22: ifne -> 78
    //   25: aload_2
    //   26: invokevirtual getRepeatCount : ()I
    //   29: ifne -> 78
    //   32: aload_2
    //   33: invokevirtual getKeyCode : ()I
    //   36: invokestatic isModifierKey : (I)Z
    //   39: ifne -> 78
    //   42: aload_0
    //   43: invokevirtual getWindow : ()Landroid/view/Window;
    //   46: astore #4
    //   48: aload #4
    //   50: ifnull -> 78
    //   53: aload #4
    //   55: invokevirtual getDecorView : ()Landroid/view/View;
    //   58: ifnull -> 78
    //   61: aload #4
    //   63: invokevirtual getDecorView : ()Landroid/view/View;
    //   66: aload_2
    //   67: invokevirtual dispatchKeyShortcutEvent : (Landroid/view/KeyEvent;)Z
    //   70: ifeq -> 78
    //   73: iconst_1
    //   74: istore_3
    //   75: goto -> 80
    //   78: iconst_0
    //   79: istore_3
    //   80: iload_3
    //   81: ifeq -> 86
    //   84: iconst_1
    //   85: ireturn
    //   86: aload_0
    //   87: iload_1
    //   88: aload_2
    //   89: invokespecial onKeyDown : (ILandroid/view/KeyEvent;)Z
    //   92: ireturn
  }
  
  public final boolean onMenuItemSelected(int paramInt, MenuItem paramMenuItem) {
    boolean bool1 = super.onMenuItemSelected(paramInt, paramMenuItem);
    boolean bool = true;
    if (bool1)
      return true; 
    a a = r();
    if (paramMenuItem.getItemId() == 16908332 && a != null && (a.c() & 0x4) != 0) {
      Intent intent = a.I((Activity)this);
      if (intent != null) {
        if (shouldUpRecreateTask(intent)) {
          ArrayList<Intent> arrayList = new ArrayList();
          intent = super.j();
          Intent intent1 = intent;
          if (intent == null)
            intent1 = a.I((Activity)this); 
          if (intent1 != null) {
            ComponentName componentName2 = intent1.getComponent();
            ComponentName componentName1 = componentName2;
            if (componentName2 == null)
              componentName1 = intent1.resolveActivity(getPackageManager()); 
            paramInt = arrayList.size();
            try {
              while (true) {
                Intent intent2 = a.J((Context)this, componentName1);
                if (intent2 != null) {
                  arrayList.add(paramInt, intent2);
                  ComponentName componentName = intent2.getComponent();
                  continue;
                } 
                arrayList.add(intent1);
                break;
              } 
            } catch (android.content.pm.PackageManager.NameNotFoundException nameNotFoundException) {
              Log.e("TaskStackBuilder", "Bad ComponentName while traversing activity parent metadata");
              throw new IllegalArgumentException(nameNotFoundException);
            } 
          } 
          t();
          if (!arrayList.isEmpty()) {
            Intent[] arrayOfIntent = arrayList.<Intent>toArray(new Intent[arrayList.size()]);
            arrayOfIntent[0] = (new Intent(arrayOfIntent[0])).addFlags(268484608);
            a.e((Context)this, arrayOfIntent, null);
            try {
              a.f((Activity)this);
            } catch (IllegalStateException illegalStateException) {
              finish();
            } 
          } else {
            throw new IllegalStateException("No intents added to TaskStackBuilder; cannot startActivities");
          } 
        } else {
          navigateUpTo((Intent)illegalStateException);
        } 
      } else {
        bool = false;
      } 
      return bool;
    } 
    return false;
  }
  
  public boolean onMenuOpened(int paramInt, Menu paramMenu) {
    return super.onMenuOpened(paramInt, paramMenu);
  }
  
  public void onPanelClosed(int paramInt, Menu paramMenu) {
    super.onPanelClosed(paramInt, paramMenu);
  }
  
  public void onPostCreate(Bundle paramBundle) {
    super.onPostCreate(paramBundle);
    ((k)q()).z();
  }
  
  public void onPostResume() {
    super.onPostResume();
    k k = (k)q();
    k.F();
    a a = k.i;
    if (a != null)
      a.h(true); 
  }
  
  public void onSaveInstanceState(Bundle paramBundle) {
    super.onSaveInstanceState(paramBundle);
    if ((k)q() != null)
      return; 
    throw null;
  }
  
  public void onStart() {
    super.onStart();
    k k = (k)q();
    k.L = true;
    k.p();
  }
  
  public void onStop() {
    super.onStop();
    k k = (k)q();
    k.L = false;
    k.F();
    a a = k.i;
    if (a != null)
      a.h(false); 
  }
  
  public void onTitleChanged(CharSequence paramCharSequence, int paramInt) {
    super.onTitleChanged(paramCharSequence, paramInt);
    q().o(paramCharSequence);
  }
  
  public void openOptionsMenu() {
    r();
    if (getWindow().hasFeature(0))
      super.openOptionsMenu(); 
  }
  
  public void p() {
    q().g();
  }
  
  public j q() {
    if (this.n == null)
      this.n = j.d((Activity)this, this); 
    return this.n;
  }
  
  public a r() {
    k k = (k)q();
    k.F();
    return k.i;
  }
  
  public void s() {}
  
  public void setContentView(int paramInt) {
    q().l(paramInt);
  }
  
  public void setContentView(View paramView) {
    q().m(paramView);
  }
  
  public void setContentView(View paramView, ViewGroup.LayoutParams paramLayoutParams) {
    q().n(paramView, paramLayoutParams);
  }
  
  public void setTheme(int paramInt) {
    super.setTheme(paramInt);
    ((k)q()).O = paramInt;
  }
  
  public void t() {}
}


/* Location:              C:\Users\panch\Downloads\dvba_v1.1.0-dex2jar.jar!\b\b\k\h.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */