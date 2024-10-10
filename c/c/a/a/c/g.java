package c.c.a.a.c;

import android.content.Context;
import java.util.concurrent.atomic.AtomicBoolean;

public class g {
  @Deprecated
  public static final int a = 12451000;
  
  public static final AtomicBoolean b = new AtomicBoolean();
  
  public static final AtomicBoolean c = new AtomicBoolean();
  
  @Deprecated
  public static String a(int paramInt) {
    return a.i(paramInt);
  }
  
  @Deprecated
  public static int b(Context paramContext, int paramInt) {
    // Byte code:
    //   0: aload_0
    //   1: invokevirtual getResources : ()Landroid/content/res/Resources;
    //   4: getstatic c/c/a/a/c/i.common_google_play_services_unknown_issue : I
    //   7: invokevirtual getString : (I)Ljava/lang/String;
    //   10: pop
    //   11: goto -> 24
    //   14: astore #6
    //   16: ldc 'GooglePlayServicesUtil'
    //   18: ldc 'The Google Play services resources were not found. Check your project configuration to ensure that the resources are included.'
    //   20: invokestatic e : (Ljava/lang/String;Ljava/lang/String;)I
    //   23: pop
    //   24: ldc 'com.google.android.gms'
    //   26: aload_0
    //   27: invokevirtual getPackageName : ()Ljava/lang/String;
    //   30: invokevirtual equals : (Ljava/lang/Object;)Z
    //   33: istore #5
    //   35: iconst_1
    //   36: istore #4
    //   38: iload #5
    //   40: ifne -> 240
    //   43: getstatic c/c/a/a/c/g.c : Ljava/util/concurrent/atomic/AtomicBoolean;
    //   46: invokevirtual get : ()Z
    //   49: ifne -> 240
    //   52: getstatic c/c/a/a/c/l/i0.a : Ljava/lang/Object;
    //   55: astore #6
    //   57: aload #6
    //   59: monitorenter
    //   60: getstatic c/c/a/a/c/l/i0.b : Z
    //   63: ifeq -> 69
    //   66: goto -> 147
    //   69: iconst_1
    //   70: putstatic c/c/a/a/c/l/i0.b : Z
    //   73: aload_0
    //   74: invokevirtual getPackageName : ()Ljava/lang/String;
    //   77: astore #8
    //   79: aload_0
    //   80: invokestatic a : (Landroid/content/Context;)Lc/c/a/a/c/p/a;
    //   83: astore #7
    //   85: aload #7
    //   87: getfield a : Landroid/content/Context;
    //   90: invokevirtual getPackageManager : ()Landroid/content/pm/PackageManager;
    //   93: aload #8
    //   95: sipush #128
    //   98: invokevirtual getApplicationInfo : (Ljava/lang/String;I)Landroid/content/pm/ApplicationInfo;
    //   101: getfield metaData : Landroid/os/Bundle;
    //   104: astore #7
    //   106: aload #7
    //   108: ifnonnull -> 114
    //   111: goto -> 147
    //   114: aload #7
    //   116: ldc 'com.google.app.id'
    //   118: invokevirtual getString : (Ljava/lang/String;)Ljava/lang/String;
    //   121: pop
    //   122: aload #7
    //   124: ldc 'com.google.android.gms.version'
    //   126: invokevirtual getInt : (Ljava/lang/String;)I
    //   129: putstatic c/c/a/a/c/l/i0.c : I
    //   132: goto -> 147
    //   135: astore #7
    //   137: ldc 'MetadataValueReader'
    //   139: ldc 'This should never happen.'
    //   141: aload #7
    //   143: invokestatic wtf : (Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I
    //   146: pop
    //   147: aload #6
    //   149: monitorexit
    //   150: getstatic c/c/a/a/c/l/i0.c : I
    //   153: istore_2
    //   154: iload_2
    //   155: ifeq -> 224
    //   158: iload_2
    //   159: ldc 12451000
    //   161: if_icmpne -> 167
    //   164: goto -> 240
    //   167: new java/lang/StringBuilder
    //   170: dup
    //   171: sipush #320
    //   174: invokespecial <init> : (I)V
    //   177: astore_0
    //   178: aload_0
    //   179: ldc 'The meta-data tag in your app's AndroidManifest.xml does not have the right value.  Expected '
    //   181: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   184: pop
    //   185: aload_0
    //   186: ldc 12451000
    //   188: invokevirtual append : (I)Ljava/lang/StringBuilder;
    //   191: pop
    //   192: aload_0
    //   193: ldc ' but found '
    //   195: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   198: pop
    //   199: aload_0
    //   200: iload_2
    //   201: invokevirtual append : (I)Ljava/lang/StringBuilder;
    //   204: pop
    //   205: aload_0
    //   206: ldc '.  You must have the following declaration within the <application> element:     <meta-data android:name="com.google.android.gms.version" android:value="@integer/google_play_services_version" />'
    //   208: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   211: pop
    //   212: new java/lang/IllegalStateException
    //   215: dup
    //   216: aload_0
    //   217: invokevirtual toString : ()Ljava/lang/String;
    //   220: invokespecial <init> : (Ljava/lang/String;)V
    //   223: athrow
    //   224: new java/lang/IllegalStateException
    //   227: dup
    //   228: ldc 'A required meta-data tag in your app's AndroidManifest.xml does not exist.  You must have the following declaration within the <application> element:     <meta-data android:name="com.google.android.gms.version" android:value="@integer/google_play_services_version" />'
    //   230: invokespecial <init> : (Ljava/lang/String;)V
    //   233: athrow
    //   234: astore_0
    //   235: aload #6
    //   237: monitorexit
    //   238: aload_0
    //   239: athrow
    //   240: aload_0
    //   241: invokestatic J : (Landroid/content/Context;)Z
    //   244: ifne -> 311
    //   247: getstatic c/c/a/a/c/l/q.c : Ljava/lang/Boolean;
    //   250: ifnonnull -> 297
    //   253: aload_0
    //   254: invokevirtual getPackageManager : ()Landroid/content/pm/PackageManager;
    //   257: ldc 'android.hardware.type.iot'
    //   259: invokevirtual hasSystemFeature : (Ljava/lang/String;)Z
    //   262: ifne -> 286
    //   265: aload_0
    //   266: invokevirtual getPackageManager : ()Landroid/content/pm/PackageManager;
    //   269: ldc 'android.hardware.type.embedded'
    //   271: invokevirtual hasSystemFeature : (Ljava/lang/String;)Z
    //   274: ifeq -> 280
    //   277: goto -> 286
    //   280: iconst_0
    //   281: istore #5
    //   283: goto -> 289
    //   286: iconst_1
    //   287: istore #5
    //   289: iload #5
    //   291: invokestatic valueOf : (Z)Ljava/lang/Boolean;
    //   294: putstatic c/c/a/a/c/l/q.c : Ljava/lang/Boolean;
    //   297: getstatic c/c/a/a/c/l/q.c : Ljava/lang/Boolean;
    //   300: invokevirtual booleanValue : ()Z
    //   303: ifne -> 311
    //   306: iconst_1
    //   307: istore_2
    //   308: goto -> 313
    //   311: iconst_0
    //   312: istore_2
    //   313: iload_1
    //   314: iflt -> 323
    //   317: iconst_1
    //   318: istore #5
    //   320: goto -> 326
    //   323: iconst_0
    //   324: istore #5
    //   326: iload #5
    //   328: invokestatic b : (Z)V
    //   331: aload_0
    //   332: invokevirtual getPackageManager : ()Landroid/content/pm/PackageManager;
    //   335: astore #7
    //   337: aconst_null
    //   338: astore #6
    //   340: iload_2
    //   341: ifeq -> 366
    //   344: aload #7
    //   346: ldc 'com.android.vending'
    //   348: sipush #8256
    //   351: invokevirtual getPackageInfo : (Ljava/lang/String;I)Landroid/content/pm/PackageInfo;
    //   354: astore #6
    //   356: goto -> 366
    //   359: astore_0
    //   360: ldc 'Google Play Store is missing.'
    //   362: astore_0
    //   363: goto -> 500
    //   366: aload #7
    //   368: ldc 'com.google.android.gms'
    //   370: bipush #64
    //   372: invokevirtual getPackageInfo : (Ljava/lang/String;I)Landroid/content/pm/PackageInfo;
    //   375: astore #8
    //   377: aload_0
    //   378: invokestatic f : (Ljava/lang/Object;)Ljava/lang/Object;
    //   381: pop
    //   382: ldc c/c/a/a/c/h
    //   384: monitorenter
    //   385: getstatic c/c/a/a/c/h.a : Lc/c/a/a/c/h;
    //   388: ifnonnull -> 446
    //   391: ldc c/c/a/a/c/s
    //   393: monitorenter
    //   394: getstatic c/c/a/a/c/s.a : Landroid/content/Context;
    //   397: ifnonnull -> 410
    //   400: aload_0
    //   401: invokevirtual getApplicationContext : ()Landroid/content/Context;
    //   404: putstatic c/c/a/a/c/s.a : Landroid/content/Context;
    //   407: goto -> 418
    //   410: ldc 'GoogleCertificates'
    //   412: ldc 'GoogleCertificates has been initialized already'
    //   414: invokestatic w : (Ljava/lang/String;Ljava/lang/String;)I
    //   417: pop
    //   418: ldc c/c/a/a/c/s
    //   420: monitorexit
    //   421: new c/c/a/a/c/h
    //   424: astore #9
    //   426: aload #9
    //   428: aload_0
    //   429: invokespecial <init> : (Landroid/content/Context;)V
    //   432: aload #9
    //   434: putstatic c/c/a/a/c/h.a : Lc/c/a/a/c/h;
    //   437: goto -> 446
    //   440: astore_0
    //   441: ldc c/c/a/a/c/s
    //   443: monitorexit
    //   444: aload_0
    //   445: athrow
    //   446: ldc c/c/a/a/c/h
    //   448: monitorexit
    //   449: aload #8
    //   451: iconst_1
    //   452: invokestatic b : (Landroid/content/pm/PackageInfo;Z)Z
    //   455: ifne -> 464
    //   458: ldc 'Google Play services signature invalid.'
    //   460: astore_0
    //   461: goto -> 500
    //   464: iload_2
    //   465: ifeq -> 513
    //   468: aload #6
    //   470: iconst_1
    //   471: invokestatic b : (Landroid/content/pm/PackageInfo;Z)Z
    //   474: ifeq -> 497
    //   477: aload #6
    //   479: getfield signatures : [Landroid/content/pm/Signature;
    //   482: iconst_0
    //   483: aaload
    //   484: aload #8
    //   486: getfield signatures : [Landroid/content/pm/Signature;
    //   489: iconst_0
    //   490: aaload
    //   491: invokevirtual equals : (Ljava/lang/Object;)Z
    //   494: ifne -> 513
    //   497: ldc 'Google Play Store signature invalid.'
    //   499: astore_0
    //   500: ldc 'GooglePlayServicesUtil'
    //   502: aload_0
    //   503: invokestatic w : (Ljava/lang/String;Ljava/lang/String;)I
    //   506: pop
    //   507: bipush #9
    //   509: istore_1
    //   510: goto -> 691
    //   513: aload #8
    //   515: getfield versionCode : I
    //   518: istore_2
    //   519: iconst_m1
    //   520: istore_3
    //   521: iload_2
    //   522: iconst_m1
    //   523: if_icmpne -> 531
    //   526: iconst_m1
    //   527: istore_2
    //   528: goto -> 537
    //   531: iload_2
    //   532: sipush #1000
    //   535: idiv
    //   536: istore_2
    //   537: iload_1
    //   538: iconst_m1
    //   539: if_icmpne -> 545
    //   542: goto -> 551
    //   545: iload_1
    //   546: sipush #1000
    //   549: idiv
    //   550: istore_3
    //   551: iload_2
    //   552: iload_3
    //   553: if_icmpge -> 613
    //   556: aload #8
    //   558: getfield versionCode : I
    //   561: istore_2
    //   562: new java/lang/StringBuilder
    //   565: dup
    //   566: bipush #77
    //   568: invokespecial <init> : (I)V
    //   571: astore_0
    //   572: aload_0
    //   573: ldc 'Google Play services out of date.  Requires '
    //   575: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   578: pop
    //   579: aload_0
    //   580: iload_1
    //   581: invokevirtual append : (I)Ljava/lang/StringBuilder;
    //   584: pop
    //   585: aload_0
    //   586: ldc ' but found '
    //   588: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   591: pop
    //   592: aload_0
    //   593: iload_2
    //   594: invokevirtual append : (I)Ljava/lang/StringBuilder;
    //   597: pop
    //   598: ldc 'GooglePlayServicesUtil'
    //   600: aload_0
    //   601: invokevirtual toString : ()Ljava/lang/String;
    //   604: invokestatic w : (Ljava/lang/String;Ljava/lang/String;)I
    //   607: pop
    //   608: iconst_2
    //   609: istore_1
    //   610: goto -> 691
    //   613: aload #8
    //   615: getfield applicationInfo : Landroid/content/pm/ApplicationInfo;
    //   618: astore #6
    //   620: aload #6
    //   622: astore_0
    //   623: aload #6
    //   625: ifnonnull -> 656
    //   628: aload #7
    //   630: ldc 'com.google.android.gms'
    //   632: iconst_0
    //   633: invokevirtual getApplicationInfo : (Ljava/lang/String;I)Landroid/content/pm/ApplicationInfo;
    //   636: astore_0
    //   637: goto -> 656
    //   640: astore_0
    //   641: ldc 'GooglePlayServicesUtil'
    //   643: ldc 'Google Play services missing when getting application info.'
    //   645: aload_0
    //   646: invokestatic wtf : (Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I
    //   649: pop
    //   650: iload #4
    //   652: istore_1
    //   653: goto -> 691
    //   656: aload_0
    //   657: getfield enabled : Z
    //   660: ifne -> 668
    //   663: iconst_3
    //   664: istore_1
    //   665: goto -> 691
    //   668: iconst_0
    //   669: istore_1
    //   670: goto -> 691
    //   673: astore_0
    //   674: ldc c/c/a/a/c/h
    //   676: monitorexit
    //   677: aload_0
    //   678: athrow
    //   679: astore_0
    //   680: ldc 'GooglePlayServicesUtil'
    //   682: ldc 'Google Play services is missing.'
    //   684: invokestatic w : (Ljava/lang/String;Ljava/lang/String;)I
    //   687: pop
    //   688: iload #4
    //   690: istore_1
    //   691: iload_1
    //   692: ireturn
    // Exception table:
    //   from	to	target	type
    //   0	11	14	finally
    //   60	66	234	finally
    //   69	85	234	finally
    //   85	106	135	android/content/pm/PackageManager$NameNotFoundException
    //   85	106	234	finally
    //   114	132	135	android/content/pm/PackageManager$NameNotFoundException
    //   114	132	234	finally
    //   137	147	234	finally
    //   147	150	234	finally
    //   235	238	234	finally
    //   344	356	359	android/content/pm/PackageManager$NameNotFoundException
    //   366	377	679	android/content/pm/PackageManager$NameNotFoundException
    //   385	394	673	finally
    //   394	407	440	finally
    //   410	418	440	finally
    //   418	437	673	finally
    //   441	446	673	finally
    //   446	449	673	finally
    //   628	637	640	android/content/pm/PackageManager$NameNotFoundException
    //   674	677	673	finally
  }
  
  @Deprecated
  public static boolean c(int paramInt) {
    return !(paramInt != 1 && paramInt != 2 && paramInt != 3 && paramInt != 9);
  }
}


/* Location:              C:\Users\panch\Downloads\dvba_v1.1.0-dex2jar.jar!\c\c\a\a\c\g.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */