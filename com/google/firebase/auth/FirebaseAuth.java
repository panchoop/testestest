package com.google.firebase.auth;

import android.text.TextUtils;
import android.util.Log;
import androidx.annotation.Keep;
import c.c.a.a.c.l.q;
import c.c.a.a.f.c.a1;
import c.c.b.h.c0.a.g;
import c.c.b.h.d0.b;
import c.c.b.h.d0.c0;
import c.c.b.h.d0.f;
import c.c.b.h.d0.j;
import c.c.b.h.d0.o;
import c.c.b.h.d0.p;
import c.c.b.h.d0.q;
import c.c.b.h.d0.r;
import c.c.b.h.j0;
import c.c.b.h.k0;
import c.c.b.h.o;
import com.google.android.gms.common.api.Status;
import java.util.List;

public class FirebaseAuth implements b {
  public c.c.b.b a;
  
  public final List<b> b;
  
  public final List<c.c.b.h.d0.a> c;
  
  public List<a> d;
  
  public g e;
  
  public o f;
  
  public final Object g;
  
  public String h;
  
  public final p i;
  
  public final j j;
  
  public o k;
  
  public q l;
  
  public FirebaseAuth(c.c.b.b paramb) {
    // Byte code:
    //   0: aload_1
    //   1: invokevirtual a : ()V
    //   4: aload_1
    //   5: getfield c : Lc/c/b/f;
    //   8: getfield a : Ljava/lang/String;
    //   11: astore #4
    //   13: aload #4
    //   15: invokestatic d : (Ljava/lang/String;)Ljava/lang/String;
    //   18: pop
    //   19: new c/c/b/h/c0/a/t0
    //   22: dup
    //   23: aload #4
    //   25: aconst_null
    //   26: invokespecial <init> : (Ljava/lang/String;Lc/c/b/h/c0/a/r0;)V
    //   29: astore #4
    //   31: aload_1
    //   32: invokevirtual a : ()V
    //   35: aload_1
    //   36: getfield a : Landroid/content/Context;
    //   39: aload #4
    //   41: invokestatic a : (Landroid/content/Context;Lc/c/b/h/c0/a/t0;)Lc/c/b/h/c0/a/g;
    //   44: astore #5
    //   46: aload_1
    //   47: invokevirtual a : ()V
    //   50: new c/c/b/h/d0/p
    //   53: dup
    //   54: aload_1
    //   55: getfield a : Landroid/content/Context;
    //   58: aload_1
    //   59: invokevirtual e : ()Ljava/lang/String;
    //   62: invokespecial <init> : (Landroid/content/Context;Ljava/lang/String;)V
    //   65: astore #6
    //   67: getstatic c/c/b/h/d0/j.b : Lc/c/b/h/d0/j;
    //   70: astore #4
    //   72: aload_0
    //   73: invokespecial <init> : ()V
    //   76: aload_0
    //   77: new java/lang/Object
    //   80: dup
    //   81: invokespecial <init> : ()V
    //   84: putfield g : Ljava/lang/Object;
    //   87: aload_1
    //   88: invokestatic f : (Ljava/lang/Object;)Ljava/lang/Object;
    //   91: pop
    //   92: aload_0
    //   93: aload_1
    //   94: putfield a : Lc/c/b/b;
    //   97: aload #5
    //   99: invokestatic f : (Ljava/lang/Object;)Ljava/lang/Object;
    //   102: pop
    //   103: aload_0
    //   104: aload #5
    //   106: putfield e : Lc/c/b/h/c0/a/g;
    //   109: aload #6
    //   111: invokestatic f : (Ljava/lang/Object;)Ljava/lang/Object;
    //   114: pop
    //   115: aload_0
    //   116: aload #6
    //   118: putfield i : Lc/c/b/h/d0/p;
    //   121: aload #4
    //   123: invokestatic f : (Ljava/lang/Object;)Ljava/lang/Object;
    //   126: pop
    //   127: aload_0
    //   128: aload #4
    //   130: putfield j : Lc/c/b/h/d0/j;
    //   133: aload_0
    //   134: new java/util/concurrent/CopyOnWriteArrayList
    //   137: dup
    //   138: invokespecial <init> : ()V
    //   141: putfield b : Ljava/util/List;
    //   144: aload_0
    //   145: new java/util/concurrent/CopyOnWriteArrayList
    //   148: dup
    //   149: invokespecial <init> : ()V
    //   152: putfield c : Ljava/util/List;
    //   155: aload_0
    //   156: new java/util/concurrent/CopyOnWriteArrayList
    //   159: dup
    //   160: invokespecial <init> : ()V
    //   163: putfield d : Ljava/util/List;
    //   166: aload_0
    //   167: getstatic c/c/b/h/d0/q.b : Lc/c/b/h/d0/q;
    //   170: putfield l : Lc/c/b/h/d0/q;
    //   173: aload_0
    //   174: getfield i : Lc/c/b/h/d0/p;
    //   177: astore_1
    //   178: aload_1
    //   179: getfield c : Landroid/content/SharedPreferences;
    //   182: ldc 'com.google.firebase.auth.FIREBASE_USER'
    //   184: aconst_null
    //   185: invokeinterface getString : (Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    //   190: astore #5
    //   192: aload #5
    //   194: invokestatic isEmpty : (Ljava/lang/CharSequence;)Z
    //   197: ifeq -> 203
    //   200: goto -> 250
    //   203: new org/json/JSONObject
    //   206: astore #4
    //   208: aload #4
    //   210: aload #5
    //   212: invokespecial <init> : (Ljava/lang/String;)V
    //   215: aload #4
    //   217: ldc 'type'
    //   219: invokevirtual has : (Ljava/lang/String;)Z
    //   222: ifeq -> 250
    //   225: ldc 'com.google.firebase.auth.internal.DefaultFirebaseUser'
    //   227: aload #4
    //   229: ldc 'type'
    //   231: invokevirtual optString : (Ljava/lang/String;)Ljava/lang/String;
    //   234: invokevirtual equalsIgnoreCase : (Ljava/lang/String;)Z
    //   237: ifeq -> 250
    //   240: aload_1
    //   241: aload #4
    //   243: invokevirtual a : (Lorg/json/JSONObject;)Lc/c/b/h/d0/c0;
    //   246: astore_1
    //   247: goto -> 252
    //   250: aconst_null
    //   251: astore_1
    //   252: aload_0
    //   253: aload_1
    //   254: putfield f : Lc/c/b/h/o;
    //   257: iconst_0
    //   258: istore_2
    //   259: aload_1
    //   260: ifnull -> 344
    //   263: aload_0
    //   264: getfield i : Lc/c/b/h/d0/p;
    //   267: astore #4
    //   269: aload #4
    //   271: ifnull -> 342
    //   274: aload_1
    //   275: invokestatic f : (Ljava/lang/Object;)Ljava/lang/Object;
    //   278: pop
    //   279: aload #4
    //   281: getfield c : Landroid/content/SharedPreferences;
    //   284: ldc 'com.google.firebase.auth.GET_TOKEN_RESPONSE.%s'
    //   286: iconst_1
    //   287: anewarray java/lang/Object
    //   290: dup
    //   291: iconst_0
    //   292: aload_1
    //   293: getfield c : Lc/c/b/h/d0/z;
    //   296: getfield b : Ljava/lang/String;
    //   299: aastore
    //   300: invokestatic format : (Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;
    //   303: aconst_null
    //   304: invokeinterface getString : (Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    //   309: astore_1
    //   310: aload_1
    //   311: ifnull -> 322
    //   314: aload_1
    //   315: invokestatic h : (Ljava/lang/String;)Lc/c/a/a/f/c/a1;
    //   318: astore_1
    //   319: goto -> 324
    //   322: aconst_null
    //   323: astore_1
    //   324: aload_1
    //   325: ifnull -> 344
    //   328: aload_0
    //   329: aload_0
    //   330: getfield f : Lc/c/b/h/o;
    //   333: aload_1
    //   334: iconst_0
    //   335: iconst_0
    //   336: invokevirtual b : (Lc/c/b/h/o;Lc/c/a/a/f/c/a1;ZZ)V
    //   339: goto -> 344
    //   342: aconst_null
    //   343: athrow
    //   344: aload_0
    //   345: getfield j : Lc/c/b/h/d0/j;
    //   348: getfield a : Lc/c/b/h/d0/n;
    //   351: ifnull -> 1991
    //   354: aload_0
    //   355: invokestatic f : (Ljava/lang/Object;)Ljava/lang/Object;
    //   358: pop
    //   359: aload_0
    //   360: getfield a : Lc/c/b/b;
    //   363: astore_1
    //   364: aload_1
    //   365: invokevirtual a : ()V
    //   368: aload_1
    //   369: getfield a : Landroid/content/Context;
    //   372: ldc 'com.google.firebase.auth.internal.ProcessDeathHelper'
    //   374: iconst_0
    //   375: invokevirtual getSharedPreferences : (Ljava/lang/String;I)Landroid/content/SharedPreferences;
    //   378: astore #4
    //   380: aload #4
    //   382: ldc 'firebaseAppName'
    //   384: ldc ''
    //   386: invokeinterface getString : (Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    //   391: astore #5
    //   393: aload_0
    //   394: getfield a : Lc/c/b/b;
    //   397: astore_1
    //   398: aload_1
    //   399: invokevirtual a : ()V
    //   402: aload_1
    //   403: getfield b : Ljava/lang/String;
    //   406: aload #5
    //   408: invokevirtual equals : (Ljava/lang/Object;)Z
    //   411: ifne -> 417
    //   414: goto -> 1990
    //   417: aload #4
    //   419: ldc 'verifyAssertionRequest'
    //   421: invokeinterface contains : (Ljava/lang/String;)Z
    //   426: ifeq -> 1920
    //   429: aload #4
    //   431: ldc 'verifyAssertionRequest'
    //   433: ldc ''
    //   435: invokeinterface getString : (Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    //   440: astore_1
    //   441: getstatic c/c/a/a/f/c/n1.CREATOR : Landroid/os/Parcelable$Creator;
    //   444: astore #5
    //   446: aload_1
    //   447: ifnonnull -> 455
    //   450: aconst_null
    //   451: astore_1
    //   452: goto -> 462
    //   455: aload_1
    //   456: bipush #10
    //   458: invokestatic decode : (Ljava/lang/String;I)[B
    //   461: astore_1
    //   462: aload_1
    //   463: aload #5
    //   465: invokestatic s : ([BLandroid/os/Parcelable$Creator;)Lc/c/a/a/c/l/u/c;
    //   468: checkcast c/c/a/a/f/c/n1
    //   471: astore_1
    //   472: aload #4
    //   474: ldc 'operation'
    //   476: ldc ''
    //   478: invokeinterface getString : (Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    //   483: astore #8
    //   485: aload #4
    //   487: ldc 'tenantId'
    //   489: aconst_null
    //   490: invokeinterface getString : (Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    //   495: astore #7
    //   497: aload #4
    //   499: ldc 'firebaseUserUid'
    //   501: ldc ''
    //   503: invokeinterface getString : (Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    //   508: astore #6
    //   510: aload #4
    //   512: ldc 'timestamp'
    //   514: lconst_0
    //   515: invokeinterface getLong : (Ljava/lang/String;J)J
    //   520: pop2
    //   521: aload #7
    //   523: ifnull -> 565
    //   526: aload #7
    //   528: invokestatic d : (Ljava/lang/String;)Ljava/lang/String;
    //   531: pop
    //   532: aload_0
    //   533: getfield g : Ljava/lang/Object;
    //   536: astore #5
    //   538: aload #5
    //   540: monitorenter
    //   541: aload_0
    //   542: aload #7
    //   544: putfield h : Ljava/lang/String;
    //   547: aload #5
    //   549: monitorexit
    //   550: aload_1
    //   551: aload #7
    //   553: putfield o : Ljava/lang/String;
    //   556: goto -> 565
    //   559: astore_1
    //   560: aload #5
    //   562: monitorexit
    //   563: aload_1
    //   564: athrow
    //   565: aload #8
    //   567: invokevirtual hashCode : ()I
    //   570: istore_3
    //   571: iload_3
    //   572: ldc -1843829902
    //   574: if_icmpeq -> 620
    //   577: iload_3
    //   578: ldc -286760092
    //   580: if_icmpeq -> 605
    //   583: iload_3
    //   584: ldc 1731327805
    //   586: if_icmpeq -> 592
    //   589: goto -> 635
    //   592: aload #8
    //   594: ldc 'com.google.firebase.auth.internal.SIGN_IN'
    //   596: invokevirtual equals : (Ljava/lang/Object;)Z
    //   599: ifeq -> 635
    //   602: goto -> 637
    //   605: aload #8
    //   607: ldc 'com.google.firebase.auth.internal.LINK'
    //   609: invokevirtual equals : (Ljava/lang/Object;)Z
    //   612: ifeq -> 635
    //   615: iconst_1
    //   616: istore_2
    //   617: goto -> 637
    //   620: aload #8
    //   622: ldc 'com.google.firebase.auth.internal.REAUTHENTICATE'
    //   624: invokevirtual equals : (Ljava/lang/Object;)Z
    //   627: ifeq -> 635
    //   630: iconst_2
    //   631: istore_2
    //   632: goto -> 637
    //   635: iconst_m1
    //   636: istore_2
    //   637: iload_2
    //   638: ifeq -> 1497
    //   641: iload_2
    //   642: iconst_1
    //   643: if_icmpeq -> 1192
    //   646: iload_2
    //   647: iconst_2
    //   648: if_icmpeq -> 654
    //   651: goto -> 1910
    //   654: aload_0
    //   655: getfield f : Lc/c/b/h/o;
    //   658: checkcast c/c/b/h/d0/c0
    //   661: getfield c : Lc/c/b/h/d0/z;
    //   664: getfield b : Ljava/lang/String;
    //   667: aload #6
    //   669: invokevirtual equals : (Ljava/lang/Object;)Z
    //   672: ifeq -> 1910
    //   675: aload_0
    //   676: getfield f : Lc/c/b/h/o;
    //   679: astore #5
    //   681: aload_1
    //   682: invokestatic i : (Lc/c/a/a/f/c/n1;)Lc/c/b/h/g0;
    //   685: astore_1
    //   686: aload #5
    //   688: invokestatic f : (Ljava/lang/Object;)Ljava/lang/Object;
    //   691: pop
    //   692: aload_1
    //   693: invokestatic f : (Ljava/lang/Object;)Ljava/lang/Object;
    //   696: pop
    //   697: aload_1
    //   698: invokevirtual h : ()Lc/c/b/h/b;
    //   701: astore #7
    //   703: aload #7
    //   705: instanceof c/c/b/h/c
    //   708: ifeq -> 984
    //   711: aload #7
    //   713: checkcast c/c/b/h/c
    //   716: astore #6
    //   718: aload #6
    //   720: getfield c : Ljava/lang/String;
    //   723: invokestatic isEmpty : (Ljava/lang/CharSequence;)Z
    //   726: ifne -> 736
    //   729: ldc_w 'password'
    //   732: astore_1
    //   733: goto -> 740
    //   736: ldc_w 'emailLink'
    //   739: astore_1
    //   740: ldc_w 'password'
    //   743: aload_1
    //   744: invokevirtual equals : (Ljava/lang/Object;)Z
    //   747: ifeq -> 863
    //   750: aload_0
    //   751: getfield e : Lc/c/b/h/c0/a/g;
    //   754: astore #7
    //   756: aload_0
    //   757: getfield a : Lc/c/b/b;
    //   760: astore_1
    //   761: aload #6
    //   763: getfield b : Ljava/lang/String;
    //   766: astore #8
    //   768: aload #6
    //   770: getfield c : Ljava/lang/String;
    //   773: astore #10
    //   775: aload #5
    //   777: invokevirtual h : ()Ljava/lang/String;
    //   780: astore #9
    //   782: new com/google/firebase/auth/FirebaseAuth$d
    //   785: dup
    //   786: aload_0
    //   787: invokespecial <init> : (Lcom/google/firebase/auth/FirebaseAuth;)V
    //   790: astore #6
    //   792: aload #7
    //   794: ifnull -> 861
    //   797: new c/c/b/h/c0/a/w
    //   800: dup
    //   801: aload #8
    //   803: aload #10
    //   805: aload #9
    //   807: invokespecial <init> : (Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V
    //   810: astore #8
    //   812: aload #8
    //   814: aload_1
    //   815: invokevirtual c : (Lc/c/b/b;)Lc/c/b/h/c0/a/u0;
    //   818: pop
    //   819: aload #8
    //   821: aload #5
    //   823: invokevirtual d : (Lc/c/b/h/o;)Lc/c/b/h/c0/a/u0;
    //   826: pop
    //   827: aload #8
    //   829: aload #6
    //   831: invokevirtual f : (Ljava/lang/Object;)Lc/c/b/h/c0/a/u0;
    //   834: pop
    //   835: aload #8
    //   837: aload #6
    //   839: invokevirtual e : (Lc/c/b/h/d0/f;)Lc/c/b/h/c0/a/u0;
    //   842: pop
    //   843: aload #7
    //   845: aload #7
    //   847: aload #8
    //   849: invokevirtual d : (Lc/c/b/h/c0/a/f;)Lc/c/a/a/h/d;
    //   852: aload #8
    //   854: invokevirtual e : (Lc/c/a/a/h/d;Lc/c/b/h/c0/a/f;)Lc/c/a/a/h/d;
    //   857: pop
    //   858: goto -> 1910
    //   861: aconst_null
    //   862: athrow
    //   863: aload_0
    //   864: aload #6
    //   866: getfield d : Ljava/lang/String;
    //   869: invokevirtual c : (Ljava/lang/String;)Z
    //   872: ifeq -> 896
    //   875: new com/google/android/gms/common/api/Status
    //   878: dup
    //   879: sipush #17072
    //   882: aconst_null
    //   883: invokespecial <init> : (ILjava/lang/String;)V
    //   886: invokestatic a : (Lcom/google/android/gms/common/api/Status;)Lc/c/b/c;
    //   889: invokestatic w : (Ljava/lang/Exception;)Lc/c/a/a/h/d;
    //   892: pop
    //   893: goto -> 1910
    //   896: aload_0
    //   897: getfield e : Lc/c/b/h/c0/a/g;
    //   900: astore #7
    //   902: aload_0
    //   903: getfield a : Lc/c/b/b;
    //   906: astore_1
    //   907: new com/google/firebase/auth/FirebaseAuth$d
    //   910: dup
    //   911: aload_0
    //   912: invokespecial <init> : (Lcom/google/firebase/auth/FirebaseAuth;)V
    //   915: astore #8
    //   917: aload #7
    //   919: ifnull -> 982
    //   922: new c/c/b/h/c0/a/u
    //   925: dup
    //   926: aload #6
    //   928: invokespecial <init> : (Lc/c/b/h/c;)V
    //   931: astore #6
    //   933: aload #6
    //   935: aload_1
    //   936: invokevirtual c : (Lc/c/b/b;)Lc/c/b/h/c0/a/u0;
    //   939: pop
    //   940: aload #6
    //   942: aload #5
    //   944: invokevirtual d : (Lc/c/b/h/o;)Lc/c/b/h/c0/a/u0;
    //   947: pop
    //   948: aload #6
    //   950: aload #8
    //   952: invokevirtual f : (Ljava/lang/Object;)Lc/c/b/h/c0/a/u0;
    //   955: pop
    //   956: aload #6
    //   958: aload #8
    //   960: invokevirtual e : (Lc/c/b/h/d0/f;)Lc/c/b/h/c0/a/u0;
    //   963: pop
    //   964: aload #7
    //   966: aload #7
    //   968: aload #6
    //   970: invokevirtual d : (Lc/c/b/h/c0/a/f;)Lc/c/a/a/h/d;
    //   973: aload #6
    //   975: invokevirtual e : (Lc/c/a/a/h/d;Lc/c/b/h/c0/a/f;)Lc/c/a/a/h/d;
    //   978: pop
    //   979: goto -> 1910
    //   982: aconst_null
    //   983: athrow
    //   984: aload #7
    //   986: instanceof c/c/b/h/w
    //   989: ifeq -> 1095
    //   992: aload_0
    //   993: getfield e : Lc/c/b/h/c0/a/g;
    //   996: astore #6
    //   998: aload_0
    //   999: getfield a : Lc/c/b/b;
    //   1002: astore_1
    //   1003: aload #7
    //   1005: checkcast c/c/b/h/w
    //   1008: astore #8
    //   1010: aload_0
    //   1011: getfield h : Ljava/lang/String;
    //   1014: astore #9
    //   1016: new com/google/firebase/auth/FirebaseAuth$d
    //   1019: dup
    //   1020: aload_0
    //   1021: invokespecial <init> : (Lcom/google/firebase/auth/FirebaseAuth;)V
    //   1024: astore #7
    //   1026: aload #6
    //   1028: ifnull -> 1093
    //   1031: new c/c/b/h/c0/a/y
    //   1034: dup
    //   1035: aload #8
    //   1037: aload #9
    //   1039: invokespecial <init> : (Lc/c/b/h/w;Ljava/lang/String;)V
    //   1042: astore #8
    //   1044: aload #8
    //   1046: aload_1
    //   1047: invokevirtual c : (Lc/c/b/b;)Lc/c/b/h/c0/a/u0;
    //   1050: pop
    //   1051: aload #8
    //   1053: aload #5
    //   1055: invokevirtual d : (Lc/c/b/h/o;)Lc/c/b/h/c0/a/u0;
    //   1058: pop
    //   1059: aload #8
    //   1061: aload #7
    //   1063: invokevirtual f : (Ljava/lang/Object;)Lc/c/b/h/c0/a/u0;
    //   1066: pop
    //   1067: aload #8
    //   1069: aload #7
    //   1071: invokevirtual e : (Lc/c/b/h/d0/f;)Lc/c/b/h/c0/a/u0;
    //   1074: pop
    //   1075: aload #6
    //   1077: aload #6
    //   1079: aload #8
    //   1081: invokevirtual d : (Lc/c/b/h/c0/a/f;)Lc/c/a/a/h/d;
    //   1084: aload #8
    //   1086: invokevirtual e : (Lc/c/a/a/h/d;Lc/c/b/h/c0/a/f;)Lc/c/a/a/h/d;
    //   1089: pop
    //   1090: goto -> 1910
    //   1093: aconst_null
    //   1094: athrow
    //   1095: aload_0
    //   1096: getfield e : Lc/c/b/h/c0/a/g;
    //   1099: astore #8
    //   1101: aload_0
    //   1102: getfield a : Lc/c/b/b;
    //   1105: astore_1
    //   1106: aload #5
    //   1108: invokevirtual h : ()Ljava/lang/String;
    //   1111: astore #9
    //   1113: new com/google/firebase/auth/FirebaseAuth$d
    //   1116: dup
    //   1117: aload_0
    //   1118: invokespecial <init> : (Lcom/google/firebase/auth/FirebaseAuth;)V
    //   1121: astore #6
    //   1123: aload #8
    //   1125: ifnull -> 1190
    //   1128: new c/c/b/h/c0/a/s
    //   1131: dup
    //   1132: aload #7
    //   1134: aload #9
    //   1136: invokespecial <init> : (Lc/c/b/h/b;Ljava/lang/String;)V
    //   1139: astore #7
    //   1141: aload #7
    //   1143: aload_1
    //   1144: invokevirtual c : (Lc/c/b/b;)Lc/c/b/h/c0/a/u0;
    //   1147: pop
    //   1148: aload #7
    //   1150: aload #5
    //   1152: invokevirtual d : (Lc/c/b/h/o;)Lc/c/b/h/c0/a/u0;
    //   1155: pop
    //   1156: aload #7
    //   1158: aload #6
    //   1160: invokevirtual f : (Ljava/lang/Object;)Lc/c/b/h/c0/a/u0;
    //   1163: pop
    //   1164: aload #7
    //   1166: aload #6
    //   1168: invokevirtual e : (Lc/c/b/h/d0/f;)Lc/c/b/h/c0/a/u0;
    //   1171: pop
    //   1172: aload #8
    //   1174: aload #8
    //   1176: aload #7
    //   1178: invokevirtual d : (Lc/c/b/h/c0/a/f;)Lc/c/a/a/h/d;
    //   1181: aload #7
    //   1183: invokevirtual e : (Lc/c/a/a/h/d;Lc/c/b/h/c0/a/f;)Lc/c/a/a/h/d;
    //   1186: pop
    //   1187: goto -> 1910
    //   1190: aconst_null
    //   1191: athrow
    //   1192: aload_0
    //   1193: getfield f : Lc/c/b/h/o;
    //   1196: checkcast c/c/b/h/d0/c0
    //   1199: getfield c : Lc/c/b/h/d0/z;
    //   1202: getfield b : Ljava/lang/String;
    //   1205: aload #6
    //   1207: invokevirtual equals : (Ljava/lang/Object;)Z
    //   1210: ifeq -> 1910
    //   1213: aload_0
    //   1214: getfield f : Lc/c/b/h/o;
    //   1217: astore #5
    //   1219: aload_1
    //   1220: invokestatic i : (Lc/c/a/a/f/c/n1;)Lc/c/b/h/g0;
    //   1223: astore_1
    //   1224: aload_1
    //   1225: invokestatic f : (Ljava/lang/Object;)Ljava/lang/Object;
    //   1228: pop
    //   1229: aload #5
    //   1231: invokestatic f : (Ljava/lang/Object;)Ljava/lang/Object;
    //   1234: pop
    //   1235: aload_0
    //   1236: getfield e : Lc/c/b/h/c0/a/g;
    //   1239: astore #7
    //   1241: aload_0
    //   1242: getfield a : Lc/c/b/b;
    //   1245: astore #6
    //   1247: aload_1
    //   1248: invokevirtual h : ()Lc/c/b/h/b;
    //   1251: astore #9
    //   1253: new com/google/firebase/auth/FirebaseAuth$d
    //   1256: dup
    //   1257: aload_0
    //   1258: invokespecial <init> : (Lcom/google/firebase/auth/FirebaseAuth;)V
    //   1261: astore #8
    //   1263: aload #7
    //   1265: ifnull -> 1495
    //   1268: aload #6
    //   1270: invokestatic f : (Ljava/lang/Object;)Ljava/lang/Object;
    //   1273: pop
    //   1274: aload #9
    //   1276: invokestatic f : (Ljava/lang/Object;)Ljava/lang/Object;
    //   1279: pop
    //   1280: aload #5
    //   1282: invokestatic f : (Ljava/lang/Object;)Ljava/lang/Object;
    //   1285: pop
    //   1286: aload #8
    //   1288: invokestatic f : (Ljava/lang/Object;)Ljava/lang/Object;
    //   1291: pop
    //   1292: aload #5
    //   1294: checkcast c/c/b/h/d0/c0
    //   1297: getfield g : Ljava/util/List;
    //   1300: astore_1
    //   1301: aload_1
    //   1302: ifnull -> 1343
    //   1305: aload_1
    //   1306: aload #9
    //   1308: checkcast c/c/b/h/g0
    //   1311: getfield b : Ljava/lang/String;
    //   1314: invokeinterface contains : (Ljava/lang/Object;)Z
    //   1319: ifeq -> 1343
    //   1322: new com/google/android/gms/common/api/Status
    //   1325: dup
    //   1326: sipush #17015
    //   1329: aconst_null
    //   1330: invokespecial <init> : (ILjava/lang/String;)V
    //   1333: invokestatic a : (Lcom/google/android/gms/common/api/Status;)Lc/c/b/c;
    //   1336: invokestatic w : (Ljava/lang/Exception;)Lc/c/a/a/h/d;
    //   1339: pop
    //   1340: goto -> 1910
    //   1343: aload #9
    //   1345: instanceof c/c/b/h/c
    //   1348: ifeq -> 1393
    //   1351: aload #9
    //   1353: checkcast c/c/b/h/c
    //   1356: astore_1
    //   1357: iconst_1
    //   1358: aload_1
    //   1359: getfield d : Ljava/lang/String;
    //   1362: invokestatic isEmpty : (Ljava/lang/CharSequence;)Z
    //   1365: ixor
    //   1366: ifne -> 1381
    //   1369: new c/c/b/h/c0/a/j
    //   1372: dup
    //   1373: aload_1
    //   1374: invokespecial <init> : (Lc/c/b/h/c;)V
    //   1377: astore_1
    //   1378: goto -> 1451
    //   1381: new c/c/b/h/c0/a/p
    //   1384: dup
    //   1385: aload_1
    //   1386: invokespecial <init> : (Lc/c/b/h/c;)V
    //   1389: astore_1
    //   1390: goto -> 1451
    //   1393: aload #9
    //   1395: instanceof c/c/b/h/w
    //   1398: ifeq -> 1417
    //   1401: new c/c/b/h/c0/a/n
    //   1404: dup
    //   1405: aload #9
    //   1407: checkcast c/c/b/h/w
    //   1410: invokespecial <init> : (Lc/c/b/h/w;)V
    //   1413: astore_1
    //   1414: goto -> 1451
    //   1417: aload #6
    //   1419: invokestatic f : (Ljava/lang/Object;)Ljava/lang/Object;
    //   1422: pop
    //   1423: aload #9
    //   1425: invokestatic f : (Ljava/lang/Object;)Ljava/lang/Object;
    //   1428: pop
    //   1429: aload #5
    //   1431: invokestatic f : (Ljava/lang/Object;)Ljava/lang/Object;
    //   1434: pop
    //   1435: aload #8
    //   1437: invokestatic f : (Ljava/lang/Object;)Ljava/lang/Object;
    //   1440: pop
    //   1441: new c/c/b/h/c0/a/l
    //   1444: dup
    //   1445: aload #9
    //   1447: invokespecial <init> : (Lc/c/b/h/b;)V
    //   1450: astore_1
    //   1451: aload_1
    //   1452: aload #6
    //   1454: invokevirtual c : (Lc/c/b/b;)Lc/c/b/h/c0/a/u0;
    //   1457: pop
    //   1458: aload_1
    //   1459: aload #5
    //   1461: invokevirtual d : (Lc/c/b/h/o;)Lc/c/b/h/c0/a/u0;
    //   1464: pop
    //   1465: aload_1
    //   1466: aload #8
    //   1468: invokevirtual f : (Ljava/lang/Object;)Lc/c/b/h/c0/a/u0;
    //   1471: pop
    //   1472: aload_1
    //   1473: aload #8
    //   1475: invokevirtual e : (Lc/c/b/h/d0/f;)Lc/c/b/h/c0/a/u0;
    //   1478: pop
    //   1479: aload #7
    //   1481: aload #7
    //   1483: aload_1
    //   1484: invokevirtual d : (Lc/c/b/h/c0/a/f;)Lc/c/a/a/h/d;
    //   1487: aload_1
    //   1488: invokevirtual e : (Lc/c/a/a/h/d;Lc/c/b/h/c0/a/f;)Lc/c/a/a/h/d;
    //   1491: pop
    //   1492: goto -> 1910
    //   1495: aconst_null
    //   1496: athrow
    //   1497: aload_1
    //   1498: invokestatic i : (Lc/c/a/a/f/c/n1;)Lc/c/b/h/g0;
    //   1501: astore_1
    //   1502: aload_1
    //   1503: invokestatic f : (Ljava/lang/Object;)Ljava/lang/Object;
    //   1506: pop
    //   1507: aload_1
    //   1508: invokevirtual h : ()Lc/c/b/h/b;
    //   1511: astore #8
    //   1513: aload #8
    //   1515: instanceof c/c/b/h/c
    //   1518: ifeq -> 1740
    //   1521: aload #8
    //   1523: checkcast c/c/b/h/c
    //   1526: astore #6
    //   1528: iconst_1
    //   1529: aload #6
    //   1531: getfield d : Ljava/lang/String;
    //   1534: invokestatic isEmpty : (Ljava/lang/CharSequence;)Z
    //   1537: ixor
    //   1538: ifne -> 1637
    //   1541: aload_0
    //   1542: getfield e : Lc/c/b/h/c0/a/g;
    //   1545: astore #5
    //   1547: aload_0
    //   1548: getfield a : Lc/c/b/b;
    //   1551: astore_1
    //   1552: aload #6
    //   1554: getfield b : Ljava/lang/String;
    //   1557: astore #7
    //   1559: aload #6
    //   1561: getfield c : Ljava/lang/String;
    //   1564: astore #9
    //   1566: aload_0
    //   1567: getfield h : Ljava/lang/String;
    //   1570: astore #8
    //   1572: new com/google/firebase/auth/FirebaseAuth$c
    //   1575: dup
    //   1576: aload_0
    //   1577: invokespecial <init> : (Lcom/google/firebase/auth/FirebaseAuth;)V
    //   1580: astore #6
    //   1582: aload #5
    //   1584: ifnull -> 1635
    //   1587: new c/c/b/h/c0/a/c0
    //   1590: dup
    //   1591: aload #7
    //   1593: aload #9
    //   1595: aload #8
    //   1597: invokespecial <init> : (Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V
    //   1600: astore #7
    //   1602: aload #7
    //   1604: aload_1
    //   1605: invokevirtual c : (Lc/c/b/b;)Lc/c/b/h/c0/a/u0;
    //   1608: pop
    //   1609: aload #7
    //   1611: aload #6
    //   1613: invokevirtual f : (Ljava/lang/Object;)Lc/c/b/h/c0/a/u0;
    //   1616: pop
    //   1617: aload #5
    //   1619: aload #5
    //   1621: aload #7
    //   1623: invokevirtual d : (Lc/c/b/h/c0/a/f;)Lc/c/a/a/h/d;
    //   1626: aload #7
    //   1628: invokevirtual e : (Lc/c/a/a/h/d;Lc/c/b/h/c0/a/f;)Lc/c/a/a/h/d;
    //   1631: pop
    //   1632: goto -> 1910
    //   1635: aconst_null
    //   1636: athrow
    //   1637: aload_0
    //   1638: aload #6
    //   1640: getfield d : Ljava/lang/String;
    //   1643: invokevirtual c : (Ljava/lang/String;)Z
    //   1646: ifeq -> 1670
    //   1649: new com/google/android/gms/common/api/Status
    //   1652: dup
    //   1653: sipush #17072
    //   1656: aconst_null
    //   1657: invokespecial <init> : (ILjava/lang/String;)V
    //   1660: invokestatic a : (Lcom/google/android/gms/common/api/Status;)Lc/c/b/c;
    //   1663: invokestatic w : (Ljava/lang/Exception;)Lc/c/a/a/h/d;
    //   1666: pop
    //   1667: goto -> 1910
    //   1670: aload_0
    //   1671: getfield e : Lc/c/b/h/c0/a/g;
    //   1674: astore_1
    //   1675: aload_0
    //   1676: getfield a : Lc/c/b/b;
    //   1679: astore #5
    //   1681: new com/google/firebase/auth/FirebaseAuth$c
    //   1684: dup
    //   1685: aload_0
    //   1686: invokespecial <init> : (Lcom/google/firebase/auth/FirebaseAuth;)V
    //   1689: astore #7
    //   1691: aload_1
    //   1692: ifnull -> 1738
    //   1695: new c/c/b/h/c0/a/d0
    //   1698: dup
    //   1699: aload #6
    //   1701: invokespecial <init> : (Lc/c/b/h/c;)V
    //   1704: astore #6
    //   1706: aload #6
    //   1708: aload #5
    //   1710: invokevirtual c : (Lc/c/b/b;)Lc/c/b/h/c0/a/u0;
    //   1713: pop
    //   1714: aload #6
    //   1716: aload #7
    //   1718: invokevirtual f : (Ljava/lang/Object;)Lc/c/b/h/c0/a/u0;
    //   1721: pop
    //   1722: aload_1
    //   1723: aload_1
    //   1724: aload #6
    //   1726: invokevirtual d : (Lc/c/b/h/c0/a/f;)Lc/c/a/a/h/d;
    //   1729: aload #6
    //   1731: invokevirtual e : (Lc/c/a/a/h/d;Lc/c/b/h/c0/a/f;)Lc/c/a/a/h/d;
    //   1734: pop
    //   1735: goto -> 1910
    //   1738: aconst_null
    //   1739: athrow
    //   1740: aload #8
    //   1742: instanceof c/c/b/h/w
    //   1745: ifeq -> 1835
    //   1748: aload #8
    //   1750: checkcast c/c/b/h/w
    //   1753: astore #8
    //   1755: aload_0
    //   1756: getfield e : Lc/c/b/h/c0/a/g;
    //   1759: astore #6
    //   1761: aload_0
    //   1762: getfield a : Lc/c/b/b;
    //   1765: astore_1
    //   1766: aload_0
    //   1767: getfield h : Ljava/lang/String;
    //   1770: astore #7
    //   1772: new com/google/firebase/auth/FirebaseAuth$c
    //   1775: dup
    //   1776: aload_0
    //   1777: invokespecial <init> : (Lcom/google/firebase/auth/FirebaseAuth;)V
    //   1780: astore #5
    //   1782: aload #6
    //   1784: ifnull -> 1833
    //   1787: new c/c/b/h/c0/a/f0
    //   1790: dup
    //   1791: aload #8
    //   1793: aload #7
    //   1795: invokespecial <init> : (Lc/c/b/h/w;Ljava/lang/String;)V
    //   1798: astore #7
    //   1800: aload #7
    //   1802: aload_1
    //   1803: invokevirtual c : (Lc/c/b/b;)Lc/c/b/h/c0/a/u0;
    //   1806: pop
    //   1807: aload #7
    //   1809: aload #5
    //   1811: invokevirtual f : (Ljava/lang/Object;)Lc/c/b/h/c0/a/u0;
    //   1814: pop
    //   1815: aload #6
    //   1817: aload #6
    //   1819: aload #7
    //   1821: invokevirtual d : (Lc/c/b/h/c0/a/f;)Lc/c/a/a/h/d;
    //   1824: aload #7
    //   1826: invokevirtual e : (Lc/c/a/a/h/d;Lc/c/b/h/c0/a/f;)Lc/c/a/a/h/d;
    //   1829: pop
    //   1830: goto -> 1910
    //   1833: aconst_null
    //   1834: athrow
    //   1835: aload_0
    //   1836: getfield e : Lc/c/b/h/c0/a/g;
    //   1839: astore #5
    //   1841: aload_0
    //   1842: getfield a : Lc/c/b/b;
    //   1845: astore #6
    //   1847: aload_0
    //   1848: getfield h : Ljava/lang/String;
    //   1851: astore #7
    //   1853: new com/google/firebase/auth/FirebaseAuth$c
    //   1856: dup
    //   1857: aload_0
    //   1858: invokespecial <init> : (Lcom/google/firebase/auth/FirebaseAuth;)V
    //   1861: astore_1
    //   1862: aload #5
    //   1864: ifnull -> 1918
    //   1867: new c/c/b/h/c0/a/a0
    //   1870: dup
    //   1871: aload #8
    //   1873: aload #7
    //   1875: invokespecial <init> : (Lc/c/b/h/b;Ljava/lang/String;)V
    //   1878: astore #7
    //   1880: aload #7
    //   1882: aload #6
    //   1884: invokevirtual c : (Lc/c/b/b;)Lc/c/b/h/c0/a/u0;
    //   1887: pop
    //   1888: aload #7
    //   1890: aload_1
    //   1891: invokevirtual f : (Ljava/lang/Object;)Lc/c/b/h/c0/a/u0;
    //   1894: pop
    //   1895: aload #5
    //   1897: aload #5
    //   1899: aload #7
    //   1901: invokevirtual d : (Lc/c/b/h/c0/a/f;)Lc/c/a/a/h/d;
    //   1904: aload #7
    //   1906: invokevirtual e : (Lc/c/a/a/h/d;Lc/c/b/h/c0/a/f;)Lc/c/a/a/h/d;
    //   1909: pop
    //   1910: aload #4
    //   1912: invokestatic c : (Landroid/content/SharedPreferences;)V
    //   1915: goto -> 1990
    //   1918: aconst_null
    //   1919: athrow
    //   1920: aload #4
    //   1922: ldc_w 'statusCode'
    //   1925: invokeinterface contains : (Ljava/lang/String;)Z
    //   1930: ifeq -> 1990
    //   1933: new com/google/android/gms/common/api/Status
    //   1936: dup
    //   1937: aload #4
    //   1939: ldc_w 'statusCode'
    //   1942: sipush #17062
    //   1945: invokeinterface getInt : (Ljava/lang/String;I)I
    //   1950: aload #4
    //   1952: ldc_w 'statusMessage'
    //   1955: ldc ''
    //   1957: invokeinterface getString : (Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    //   1962: invokespecial <init> : (ILjava/lang/String;)V
    //   1965: astore_1
    //   1966: aload #4
    //   1968: ldc 'timestamp'
    //   1970: lconst_0
    //   1971: invokeinterface getLong : (Ljava/lang/String;J)J
    //   1976: pop2
    //   1977: aload #4
    //   1979: invokestatic c : (Landroid/content/SharedPreferences;)V
    //   1982: aload_1
    //   1983: invokestatic a : (Lcom/google/android/gms/common/api/Status;)Lc/c/b/c;
    //   1986: invokestatic w : (Ljava/lang/Exception;)Lc/c/a/a/h/d;
    //   1989: pop
    //   1990: return
    //   1991: aconst_null
    //   1992: athrow
    //   1993: astore_1
    //   1994: goto -> 250
    // Exception table:
    //   from	to	target	type
    //   203	247	1993	java/lang/Exception
    //   541	550	559	finally
    //   560	563	559	finally
  }
  
  @Keep
  public static FirebaseAuth getInstance() {
    c.c.b.b b1 = c.c.b.b.c();
    b1.a();
    return (FirebaseAuth)b1.d.a(FirebaseAuth.class);
  }
  
  @Keep
  public static FirebaseAuth getInstance(c.c.b.b paramb) {
    paramb.a();
    return (FirebaseAuth)paramb.d.a(FirebaseAuth.class);
  }
  
  public void a() {
    o o2 = this.f;
    if (o2 != null) {
      p p1 = this.i;
      q.f(o2);
      String str = String.format("com.google.firebase.auth.GET_TOKEN_RESPONSE.%s", new Object[] { ((c0)o2).c.b });
      p1.c.edit().remove(str).apply();
      this.f = null;
    } 
    this.i.c.edit().remove("com.google.firebase.auth.FIREBASE_USER").apply();
    d(null);
    e(null);
    o o1 = this.k;
    if (o1 != null) {
      c.c.b.h.d0.c c = o1.b;
      c.f.removeCallbacks(c.g);
    } 
  }
  
  public final void b(o paramo, a1 parama1, boolean paramBoolean1, boolean paramBoolean2) {
    // Byte code:
    //   0: aload_1
    //   1: invokestatic f : (Ljava/lang/Object;)Ljava/lang/Object;
    //   4: pop
    //   5: aload_2
    //   6: invokestatic f : (Ljava/lang/Object;)Ljava/lang/Object;
    //   9: pop
    //   10: aload_0
    //   11: getfield f : Lc/c/b/h/o;
    //   14: astore #13
    //   16: iconst_0
    //   17: istore #8
    //   19: aload #13
    //   21: ifnull -> 57
    //   24: aload_1
    //   25: checkcast c/c/b/h/d0/c0
    //   28: getfield c : Lc/c/b/h/d0/z;
    //   31: getfield b : Ljava/lang/String;
    //   34: aload #13
    //   36: checkcast c/c/b/h/d0/c0
    //   39: getfield c : Lc/c/b/h/d0/z;
    //   42: getfield b : Ljava/lang/String;
    //   45: invokevirtual equals : (Ljava/lang/Object;)Z
    //   48: ifeq -> 57
    //   51: iconst_1
    //   52: istore #5
    //   54: goto -> 60
    //   57: iconst_0
    //   58: istore #5
    //   60: iload #5
    //   62: ifne -> 71
    //   65: iload #4
    //   67: ifeq -> 71
    //   70: return
    //   71: aload_0
    //   72: getfield f : Lc/c/b/h/o;
    //   75: astore #13
    //   77: aload #13
    //   79: ifnonnull -> 91
    //   82: iconst_1
    //   83: istore #5
    //   85: iconst_1
    //   86: istore #6
    //   88: goto -> 146
    //   91: aload #13
    //   93: checkcast c/c/b/h/d0/c0
    //   96: getfield b : Lc/c/a/a/f/c/a1;
    //   99: getfield c : Ljava/lang/String;
    //   102: aload_2
    //   103: getfield c : Ljava/lang/String;
    //   106: invokevirtual equals : (Ljava/lang/Object;)Z
    //   109: istore #4
    //   111: iload #5
    //   113: ifeq -> 129
    //   116: iload #4
    //   118: iconst_1
    //   119: ixor
    //   120: ifne -> 129
    //   123: iconst_0
    //   124: istore #6
    //   126: goto -> 132
    //   129: iconst_1
    //   130: istore #6
    //   132: iload #5
    //   134: ifne -> 143
    //   137: iconst_1
    //   138: istore #5
    //   140: goto -> 146
    //   143: iconst_0
    //   144: istore #5
    //   146: aload_1
    //   147: invokestatic f : (Ljava/lang/Object;)Ljava/lang/Object;
    //   150: pop
    //   151: aload_0
    //   152: getfield f : Lc/c/b/h/o;
    //   155: astore #13
    //   157: aload #13
    //   159: ifnonnull -> 170
    //   162: aload_0
    //   163: aload_1
    //   164: putfield f : Lc/c/b/h/o;
    //   167: goto -> 293
    //   170: aload_1
    //   171: checkcast c/c/b/h/d0/c0
    //   174: astore #14
    //   176: aload #13
    //   178: aload #14
    //   180: getfield f : Ljava/util/List;
    //   183: invokevirtual j : (Ljava/util/List;)Lc/c/b/h/o;
    //   186: pop
    //   187: aload_1
    //   188: invokevirtual i : ()Z
    //   191: ifne -> 207
    //   194: aload_0
    //   195: getfield f : Lc/c/b/h/o;
    //   198: checkcast c/c/b/h/d0/c0
    //   201: getstatic java/lang/Boolean.FALSE : Ljava/lang/Boolean;
    //   204: putfield i : Ljava/lang/Boolean;
    //   207: aload #14
    //   209: invokestatic f : (Ljava/lang/Object;)Ljava/lang/Object;
    //   212: pop
    //   213: aload #14
    //   215: getfield m : Lc/c/b/h/d0/m;
    //   218: astore #13
    //   220: aload #13
    //   222: ifnull -> 279
    //   225: new java/util/ArrayList
    //   228: dup
    //   229: invokespecial <init> : ()V
    //   232: astore #14
    //   234: aload #13
    //   236: getfield b : Ljava/util/List;
    //   239: invokeinterface iterator : ()Ljava/util/Iterator;
    //   244: astore #15
    //   246: aload #14
    //   248: astore #13
    //   250: aload #15
    //   252: invokeinterface hasNext : ()Z
    //   257: ifeq -> 284
    //   260: aload #14
    //   262: aload #15
    //   264: invokeinterface next : ()Ljava/lang/Object;
    //   269: checkcast c/c/b/h/y
    //   272: invokevirtual add : (Ljava/lang/Object;)Z
    //   275: pop
    //   276: goto -> 246
    //   279: invokestatic h : ()Lc/c/a/a/f/c/n;
    //   282: astore #13
    //   284: aload_0
    //   285: getfield f : Lc/c/b/h/o;
    //   288: aload #13
    //   290: invokevirtual l : (Ljava/util/List;)V
    //   293: iload_3
    //   294: ifeq -> 837
    //   297: aload_0
    //   298: getfield i : Lc/c/b/h/d0/p;
    //   301: astore #13
    //   303: aload_0
    //   304: getfield f : Lc/c/b/h/o;
    //   307: astore #14
    //   309: aload #13
    //   311: ifnull -> 835
    //   314: aload #14
    //   316: invokestatic f : (Ljava/lang/Object;)Ljava/lang/Object;
    //   319: pop
    //   320: new org/json/JSONObject
    //   323: dup
    //   324: invokespecial <init> : ()V
    //   327: astore #16
    //   329: ldc c/c/b/h/d0/c0
    //   331: aload #14
    //   333: invokevirtual getClass : ()Ljava/lang/Class;
    //   336: invokevirtual isAssignableFrom : (Ljava/lang/Class;)Z
    //   339: ifeq -> 793
    //   342: aload #14
    //   344: checkcast c/c/b/h/d0/c0
    //   347: astore #14
    //   349: aload #16
    //   351: ldc_w 'cachedTokenState'
    //   354: aload #14
    //   356: invokevirtual m : ()Ljava/lang/String;
    //   359: invokevirtual put : (Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;
    //   362: pop
    //   363: aload #14
    //   365: getfield d : Ljava/lang/String;
    //   368: invokestatic d : (Ljava/lang/String;)Lc/c/b/b;
    //   371: astore #15
    //   373: aload #15
    //   375: invokevirtual a : ()V
    //   378: aload #16
    //   380: ldc_w 'applicationName'
    //   383: aload #15
    //   385: getfield b : Ljava/lang/String;
    //   388: invokevirtual put : (Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;
    //   391: pop
    //   392: aload #16
    //   394: ldc 'type'
    //   396: ldc 'com.google.firebase.auth.internal.DefaultFirebaseUser'
    //   398: invokevirtual put : (Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;
    //   401: pop
    //   402: aload #14
    //   404: getfield f : Ljava/util/List;
    //   407: ifnull -> 480
    //   410: new org/json/JSONArray
    //   413: astore #17
    //   415: aload #17
    //   417: invokespecial <init> : ()V
    //   420: aload #14
    //   422: getfield f : Ljava/util/List;
    //   425: astore #15
    //   427: iconst_0
    //   428: istore #7
    //   430: iload #7
    //   432: aload #15
    //   434: invokeinterface size : ()I
    //   439: if_icmpge -> 469
    //   442: aload #17
    //   444: aload #15
    //   446: iload #7
    //   448: invokeinterface get : (I)Ljava/lang/Object;
    //   453: checkcast c/c/b/h/d0/z
    //   456: invokevirtual i : ()Ljava/lang/String;
    //   459: invokevirtual put : (Ljava/lang/Object;)Lorg/json/JSONArray;
    //   462: pop
    //   463: iinc #7, 1
    //   466: goto -> 430
    //   469: aload #16
    //   471: ldc_w 'userInfos'
    //   474: aload #17
    //   476: invokevirtual put : (Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;
    //   479: pop
    //   480: aload #16
    //   482: ldc_w 'anonymous'
    //   485: aload #14
    //   487: invokevirtual i : ()Z
    //   490: invokevirtual put : (Ljava/lang/String;Z)Lorg/json/JSONObject;
    //   493: pop
    //   494: aload #16
    //   496: ldc_w 'version'
    //   499: ldc_w '2'
    //   502: invokevirtual put : (Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;
    //   505: pop
    //   506: aload #14
    //   508: getfield j : Lc/c/b/h/d0/e0;
    //   511: ifnull -> 583
    //   514: aload #14
    //   516: getfield j : Lc/c/b/h/d0/e0;
    //   519: astore #17
    //   521: aload #17
    //   523: ifnull -> 581
    //   526: new org/json/JSONObject
    //   529: astore #15
    //   531: aload #15
    //   533: invokespecial <init> : ()V
    //   536: aload #15
    //   538: ldc_w 'lastSignInTimestamp'
    //   541: aload #17
    //   543: getfield b : J
    //   546: invokevirtual put : (Ljava/lang/String;J)Lorg/json/JSONObject;
    //   549: pop
    //   550: aload #15
    //   552: ldc_w 'creationTimestamp'
    //   555: aload #17
    //   557: getfield c : J
    //   560: invokevirtual put : (Ljava/lang/String;J)Lorg/json/JSONObject;
    //   563: pop
    //   564: goto -> 567
    //   567: aload #16
    //   569: ldc_w 'userMetadata'
    //   572: aload #15
    //   574: invokevirtual put : (Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;
    //   577: pop
    //   578: goto -> 583
    //   581: aconst_null
    //   582: athrow
    //   583: aload #14
    //   585: invokestatic f : (Ljava/lang/Object;)Ljava/lang/Object;
    //   588: pop
    //   589: aload #14
    //   591: getfield m : Lc/c/b/h/d0/m;
    //   594: astore #14
    //   596: aload #14
    //   598: ifnull -> 656
    //   601: new java/util/ArrayList
    //   604: astore #15
    //   606: aload #15
    //   608: invokespecial <init> : ()V
    //   611: aload #14
    //   613: getfield b : Ljava/util/List;
    //   616: invokeinterface iterator : ()Ljava/util/Iterator;
    //   621: astore #17
    //   623: aload #15
    //   625: astore #14
    //   627: aload #17
    //   629: invokeinterface hasNext : ()Z
    //   634: ifeq -> 661
    //   637: aload #15
    //   639: aload #17
    //   641: invokeinterface next : ()Ljava/lang/Object;
    //   646: checkcast c/c/b/h/y
    //   649: invokevirtual add : (Ljava/lang/Object;)Z
    //   652: pop
    //   653: goto -> 623
    //   656: invokestatic h : ()Lc/c/a/a/f/c/n;
    //   659: astore #14
    //   661: aload #14
    //   663: ifnull -> 739
    //   666: aload #14
    //   668: invokeinterface isEmpty : ()Z
    //   673: ifne -> 739
    //   676: new org/json/JSONArray
    //   679: astore #15
    //   681: aload #15
    //   683: invokespecial <init> : ()V
    //   686: iconst_0
    //   687: istore #7
    //   689: iload #7
    //   691: aload #14
    //   693: invokeinterface size : ()I
    //   698: if_icmpge -> 728
    //   701: aload #15
    //   703: aload #14
    //   705: iload #7
    //   707: invokeinterface get : (I)Ljava/lang/Object;
    //   712: checkcast c/c/b/h/s
    //   715: invokevirtual h : ()Lorg/json/JSONObject;
    //   718: invokevirtual put : (Ljava/lang/Object;)Lorg/json/JSONArray;
    //   721: pop
    //   722: iinc #7, 1
    //   725: goto -> 689
    //   728: aload #16
    //   730: ldc_w 'userMultiFactorInfo'
    //   733: aload #15
    //   735: invokevirtual put : (Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;
    //   738: pop
    //   739: aload #16
    //   741: invokevirtual toString : ()Ljava/lang/String;
    //   744: astore #14
    //   746: aload #13
    //   748: astore #15
    //   750: goto -> 800
    //   753: astore_1
    //   754: goto -> 758
    //   757: astore_1
    //   758: aload #13
    //   760: getfield d : Lc/c/a/a/c/m/a;
    //   763: astore_2
    //   764: aload_2
    //   765: getfield a : Ljava/lang/String;
    //   768: aload_2
    //   769: ldc_w 'Failed to turn object into JSON'
    //   772: iconst_0
    //   773: anewarray java/lang/Object
    //   776: invokevirtual a : (Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;
    //   779: aload_1
    //   780: invokestatic wtf : (Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I
    //   783: pop
    //   784: new c/c/b/h/c0/b
    //   787: dup
    //   788: aload_1
    //   789: invokespecial <init> : (Ljava/lang/Throwable;)V
    //   792: athrow
    //   793: aload #13
    //   795: astore #14
    //   797: aconst_null
    //   798: astore #14
    //   800: aload #14
    //   802: invokestatic isEmpty : (Ljava/lang/CharSequence;)Z
    //   805: ifne -> 837
    //   808: aload #13
    //   810: getfield c : Landroid/content/SharedPreferences;
    //   813: invokeinterface edit : ()Landroid/content/SharedPreferences$Editor;
    //   818: ldc 'com.google.firebase.auth.FIREBASE_USER'
    //   820: aload #14
    //   822: invokeinterface putString : (Ljava/lang/String;Ljava/lang/String;)Landroid/content/SharedPreferences$Editor;
    //   827: invokeinterface apply : ()V
    //   832: goto -> 837
    //   835: aconst_null
    //   836: athrow
    //   837: iload #6
    //   839: ifeq -> 867
    //   842: aload_0
    //   843: getfield f : Lc/c/b/h/o;
    //   846: astore #13
    //   848: aload #13
    //   850: ifnull -> 859
    //   853: aload #13
    //   855: aload_2
    //   856: invokevirtual k : (Lc/c/a/a/f/c/a1;)V
    //   859: aload_0
    //   860: aload_0
    //   861: getfield f : Lc/c/b/h/o;
    //   864: invokevirtual d : (Lc/c/b/h/o;)V
    //   867: iload #5
    //   869: ifeq -> 880
    //   872: aload_0
    //   873: aload_0
    //   874: getfield f : Lc/c/b/h/o;
    //   877: invokevirtual e : (Lc/c/b/h/o;)V
    //   880: iload_3
    //   881: ifeq -> 956
    //   884: aload_0
    //   885: getfield i : Lc/c/b/h/d0/p;
    //   888: astore #13
    //   890: aload #13
    //   892: ifnull -> 954
    //   895: aload_1
    //   896: invokestatic f : (Ljava/lang/Object;)Ljava/lang/Object;
    //   899: pop
    //   900: aload_2
    //   901: invokestatic f : (Ljava/lang/Object;)Ljava/lang/Object;
    //   904: pop
    //   905: aload #13
    //   907: getfield c : Landroid/content/SharedPreferences;
    //   910: invokeinterface edit : ()Landroid/content/SharedPreferences$Editor;
    //   915: ldc 'com.google.firebase.auth.GET_TOKEN_RESPONSE.%s'
    //   917: iconst_1
    //   918: anewarray java/lang/Object
    //   921: dup
    //   922: iconst_0
    //   923: aload_1
    //   924: checkcast c/c/b/h/d0/c0
    //   927: getfield c : Lc/c/b/h/d0/z;
    //   930: getfield b : Ljava/lang/String;
    //   933: aastore
    //   934: invokestatic format : (Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;
    //   937: aload_2
    //   938: invokevirtual i : ()Ljava/lang/String;
    //   941: invokeinterface putString : (Ljava/lang/String;Ljava/lang/String;)Landroid/content/SharedPreferences$Editor;
    //   946: invokeinterface apply : ()V
    //   951: goto -> 956
    //   954: aconst_null
    //   955: athrow
    //   956: aload_0
    //   957: monitorenter
    //   958: aload_0
    //   959: getfield k : Lc/c/b/h/d0/o;
    //   962: ifnonnull -> 994
    //   965: new c/c/b/h/d0/o
    //   968: astore_1
    //   969: aload_1
    //   970: aload_0
    //   971: getfield a : Lc/c/b/b;
    //   974: invokespecial <init> : (Lc/c/b/b;)V
    //   977: aload_0
    //   978: monitorenter
    //   979: aload_0
    //   980: aload_1
    //   981: putfield k : Lc/c/b/h/d0/o;
    //   984: aload_0
    //   985: monitorexit
    //   986: goto -> 994
    //   989: astore_1
    //   990: aload_0
    //   991: monitorexit
    //   992: aload_1
    //   993: athrow
    //   994: aload_0
    //   995: getfield k : Lc/c/b/h/d0/o;
    //   998: astore_1
    //   999: aload_0
    //   1000: monitorexit
    //   1001: aload_0
    //   1002: getfield f : Lc/c/b/h/o;
    //   1005: checkcast c/c/b/h/d0/c0
    //   1008: getfield b : Lc/c/a/a/f/c/a1;
    //   1011: astore_2
    //   1012: aload_1
    //   1013: ifnull -> 1135
    //   1016: aload_2
    //   1017: ifnonnull -> 1023
    //   1020: goto -> 1134
    //   1023: aload_2
    //   1024: getfield d : Ljava/lang/Long;
    //   1027: astore #13
    //   1029: aload #13
    //   1031: ifnonnull -> 1040
    //   1034: lconst_0
    //   1035: lstore #9
    //   1037: goto -> 1047
    //   1040: aload #13
    //   1042: invokevirtual longValue : ()J
    //   1045: lstore #9
    //   1047: lload #9
    //   1049: lstore #11
    //   1051: lload #9
    //   1053: lconst_0
    //   1054: lcmp
    //   1055: ifgt -> 1063
    //   1058: ldc2_w 3600
    //   1061: lstore #11
    //   1063: aload_2
    //   1064: getfield f : Ljava/lang/Long;
    //   1067: invokevirtual longValue : ()J
    //   1070: lstore #9
    //   1072: aload_1
    //   1073: getfield b : Lc/c/b/h/d0/c;
    //   1076: astore_2
    //   1077: aload_2
    //   1078: lload #11
    //   1080: ldc2_w 1000
    //   1083: lmul
    //   1084: lload #9
    //   1086: ladd
    //   1087: putfield b : J
    //   1090: aload_2
    //   1091: ldc2_w -1
    //   1094: putfield c : J
    //   1097: iload #8
    //   1099: istore #5
    //   1101: aload_1
    //   1102: getfield a : I
    //   1105: ifle -> 1122
    //   1108: iload #8
    //   1110: istore #5
    //   1112: aload_1
    //   1113: getfield c : Z
    //   1116: ifne -> 1122
    //   1119: iconst_1
    //   1120: istore #5
    //   1122: iload #5
    //   1124: ifeq -> 1134
    //   1127: aload_1
    //   1128: getfield b : Lc/c/b/h/d0/c;
    //   1131: invokevirtual a : ()V
    //   1134: return
    //   1135: aconst_null
    //   1136: athrow
    //   1137: astore_1
    //   1138: aload_0
    //   1139: monitorexit
    //   1140: aload_1
    //   1141: athrow
    //   1142: astore #17
    //   1144: goto -> 567
    //   1147: astore #17
    //   1149: goto -> 567
    // Exception table:
    //   from	to	target	type
    //   349	427	757	java/lang/Exception
    //   430	463	757	java/lang/Exception
    //   469	480	757	java/lang/Exception
    //   480	521	757	java/lang/Exception
    //   526	536	757	java/lang/Exception
    //   536	550	1142	org/json/JSONException
    //   536	550	757	java/lang/Exception
    //   550	564	1147	org/json/JSONException
    //   550	564	753	java/lang/Exception
    //   567	578	753	java/lang/Exception
    //   581	583	753	java/lang/Exception
    //   583	596	753	java/lang/Exception
    //   601	623	753	java/lang/Exception
    //   627	653	753	java/lang/Exception
    //   656	661	753	java/lang/Exception
    //   666	686	753	java/lang/Exception
    //   689	722	753	java/lang/Exception
    //   728	739	753	java/lang/Exception
    //   739	746	753	java/lang/Exception
    //   958	979	1137	finally
    //   979	984	989	finally
    //   984	986	1137	finally
    //   990	994	1137	finally
    //   994	999	1137	finally
  }
  
  public final boolean c(String paramString) {
    c.c.b.h.a a = c.c.b.h.a.a(paramString);
    return (a != null && !TextUtils.equals(this.h, a.d));
  }
  
  public final void d(o paramo) {
    String str;
    if (paramo != null) {
      String str1 = ((c0)paramo).c.b;
      StringBuilder stringBuilder = new StringBuilder(String.valueOf(str1).length() + 45);
      stringBuilder.append("Notifying id token listeners about user ( ");
      stringBuilder.append(str1);
      stringBuilder.append(" ).");
      str = stringBuilder.toString();
    } else {
      str = "Notifying id token listeners about a sign-out event.";
    } 
    Log.d("FirebaseAuth", str);
    if (paramo != null) {
      String str1 = ((c0)paramo).b.c;
    } else {
      paramo = null;
    } 
    c.c.b.m.a a = new c.c.b.m.a((String)paramo);
    q q1 = this.l;
    k0 k0 = new k0(this, a);
    q1.a.post((Runnable)k0);
  }
  
  public final void e(o paramo) {
    String str;
    if (paramo != null) {
      str = ((c0)paramo).c.b;
      StringBuilder stringBuilder = new StringBuilder(String.valueOf(str).length() + 47);
      stringBuilder.append("Notifying auth state listeners about user ( ");
      stringBuilder.append(str);
      stringBuilder.append(" ).");
      str = stringBuilder.toString();
    } else {
      str = "Notifying auth state listeners about a sign-out event.";
    } 
    Log.d("FirebaseAuth", str);
    q q1 = this.l;
    j0 j0 = new j0(this);
    q1.a.post((Runnable)j0);
  }
  
  public static interface a {
    void a(FirebaseAuth param1FirebaseAuth);
  }
  
  public static interface b {
    void a(FirebaseAuth param1FirebaseAuth);
  }
  
  public class c implements r {
    public final FirebaseAuth a;
    
    public c(FirebaseAuth this$0) {}
    
    public final void a(a1 param1a1, o param1o) {
      q.f(param1a1);
      q.f(param1o);
      param1o.k(param1a1);
      this.a.b(param1o, param1a1, true, false);
    }
  }
  
  public final class d implements f, r {
    public final FirebaseAuth a;
    
    public d(FirebaseAuth this$0) {}
    
    public final void a(a1 param1a1, o param1o) {
      q.f(param1a1);
      q.f(param1o);
      param1o.k(param1a1);
      this.a.b(param1o, param1a1, true, true);
    }
    
    public final void b(Status param1Status) {
      int i = param1Status.c;
      if (i == 17011 || i == 17021 || i == 17005 || i == 17091)
        this.a.a(); 
    }
  }
}


/* Location:              C:\Users\panch\Downloads\dvba_v1.1.0-dex2jar.jar!\com\google\firebase\auth\FirebaseAuth.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */