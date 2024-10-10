package c.c.a.a.c.k.k;

import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.DeadObjectException;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.os.Message;
import c.c.a.a.c.e;
import c.c.a.a.c.k.e;
import c.c.a.a.c.k.j;
import c.c.a.a.c.l.j;
import c.c.a.a.c.l.k;
import c.c.a.a.c.l.p;
import c.c.a.a.c.l.q;
import c.c.a.a.c.l.t;
import c.c.a.a.g.e;
import c.c.a.a.h.e;
import com.google.android.gms.common.api.GoogleApiActivity;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.api.Status;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Queue;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicInteger;
import javax.annotation.concurrent.GuardedBy;

public class d implements Handler.Callback {
  public static final Status n = new Status(4, "Sign-out occurred while this API call was in progress.");
  
  public static final Status o = new Status(4, "The user must be signed in to make this API call.");
  
  public static final Object p = new Object();
  
  @GuardedBy("lock")
  public static d q;
  
  public long a = 5000L;
  
  public long b = 120000L;
  
  public long c = 10000L;
  
  public final Context d;
  
  public final c.c.a.a.c.d e;
  
  public final j f;
  
  public final AtomicInteger g = new AtomicInteger(1);
  
  public final AtomicInteger h = new AtomicInteger(0);
  
  public final Map<a<?>, a<?>> i = new ConcurrentHashMap<a<?>, a<?>>(5, 0.75F, 1);
  
  @GuardedBy("lock")
  public m j = null;
  
  @GuardedBy("lock")
  public final Set<a<?>> k = (Set<a<?>>)new b.f.c();
  
  public final Set<a<?>> l = (Set<a<?>>)new b.f.c();
  
  public final Handler m;
  
  public d(Context paramContext, Looper paramLooper, c.c.a.a.c.d paramd) {
    this.d = paramContext;
    this.m = (Handler)new c.c.a.a.f.a.c(paramLooper, this);
    this.e = paramd;
    this.f = new j((e)paramd);
    Handler handler = this.m;
    handler.sendMessage(handler.obtainMessage(6));
  }
  
  public static d a(Context paramContext) {
    synchronized (p) {
      if (q == null) {
        HandlerThread handlerThread = new HandlerThread();
        this("GoogleApiHandler", 9);
        handlerThread.start();
        Looper looper = handlerThread.getLooper();
        d d1 = new d();
        this(paramContext.getApplicationContext(), looper, c.c.a.a.c.d.d);
        q = d1;
      } 
      return q;
    } 
  }
  
  public final void b(c.c.a.a.c.k.c<?> paramc) {
    a<?> a = paramc.d;
    a<?> a2 = this.i.get(a);
    a<?> a1 = a2;
    if (a2 == null) {
      a1 = new a(this, paramc);
      this.i.put(a, a1);
    } 
    if (a1.b())
      this.l.add(a); 
    a1.a();
  }
  
  public final boolean c(c.c.a.a.c.a parama, int paramInt) {
    c.c.a.a.c.d d1 = this.e;
    Context context = this.d;
    PendingIntent pendingIntent = null;
    if (d1 != null) {
      int i = parama.c;
      boolean bool = false;
      if (i != 0 && parama.d != null) {
        i = 1;
      } else {
        i = 0;
      } 
      if (i != 0) {
        pendingIntent = parama.d;
      } else {
        Intent intent = d1.a(context, parama.c, null);
        if (intent != null)
          pendingIntent = PendingIntent.getActivity(context, 0, intent, 134217728); 
      } 
      if (pendingIntent != null) {
        d1.e(context, parama.c, GoogleApiActivity.a(context, pendingIntent, paramInt));
        bool = true;
      } 
      return bool;
    } 
    throw null;
  }
  
  public boolean handleMessage(Message paramMessage) {
    // Byte code:
    //   0: aload_1
    //   1: getfield what : I
    //   4: istore_2
    //   5: iconst_0
    //   6: istore_3
    //   7: ldc2_w 300000
    //   10: lstore #5
    //   12: iload_2
    //   13: tableswitch default -> 92, 1 -> 1398, 2 -> 1388, 3 -> 1340, 4 -> 1219, 5 -> 981, 6 -> 862, 7 -> 848, 8 -> 1219, 9 -> 791, 10 -> 728, 11 -> 600, 12 -> 560, 13 -> 1219, 14 -> 513, 15 -> 419, 16 -> 127
    //   92: new java/lang/StringBuilder
    //   95: dup
    //   96: bipush #31
    //   98: invokespecial <init> : (I)V
    //   101: astore_1
    //   102: aload_1
    //   103: ldc 'Unknown message id: '
    //   105: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   108: pop
    //   109: aload_1
    //   110: iload_2
    //   111: invokevirtual append : (I)Ljava/lang/StringBuilder;
    //   114: pop
    //   115: ldc 'GoogleApiManager'
    //   117: aload_1
    //   118: invokevirtual toString : ()Ljava/lang/String;
    //   121: invokestatic w : (Ljava/lang/String;Ljava/lang/String;)I
    //   124: pop
    //   125: iconst_0
    //   126: ireturn
    //   127: aload_1
    //   128: getfield obj : Ljava/lang/Object;
    //   131: checkcast c/c/a/a/c/k/k/d$c
    //   134: astore #7
    //   136: aload_0
    //   137: getfield i : Ljava/util/Map;
    //   140: aload #7
    //   142: getfield a : Lc/c/a/a/c/k/k/a;
    //   145: invokeinterface containsKey : (Ljava/lang/Object;)Z
    //   150: ifeq -> 1495
    //   153: aload_0
    //   154: getfield i : Ljava/util/Map;
    //   157: aload #7
    //   159: getfield a : Lc/c/a/a/c/k/k/a;
    //   162: invokeinterface get : (Ljava/lang/Object;)Ljava/lang/Object;
    //   167: checkcast c/c/a/a/c/k/k/d$a
    //   170: astore_1
    //   171: aload_1
    //   172: getfield k : Ljava/util/List;
    //   175: aload #7
    //   177: invokeinterface remove : (Ljava/lang/Object;)Z
    //   182: ifeq -> 1495
    //   185: aload_1
    //   186: getfield m : Lc/c/a/a/c/k/k/d;
    //   189: getfield m : Landroid/os/Handler;
    //   192: bipush #15
    //   194: aload #7
    //   196: invokevirtual removeMessages : (ILjava/lang/Object;)V
    //   199: aload_1
    //   200: getfield m : Lc/c/a/a/c/k/k/d;
    //   203: getfield m : Landroid/os/Handler;
    //   206: bipush #16
    //   208: aload #7
    //   210: invokevirtual removeMessages : (ILjava/lang/Object;)V
    //   213: aload #7
    //   215: getfield b : Lc/c/a/a/c/c;
    //   218: astore #7
    //   220: new java/util/ArrayList
    //   223: dup
    //   224: aload_1
    //   225: getfield a : Ljava/util/Queue;
    //   228: invokeinterface size : ()I
    //   233: invokespecial <init> : (I)V
    //   236: astore #8
    //   238: aload_1
    //   239: getfield a : Ljava/util/Queue;
    //   242: invokeinterface iterator : ()Ljava/util/Iterator;
    //   247: astore #10
    //   249: aload #10
    //   251: invokeinterface hasNext : ()Z
    //   256: ifeq -> 357
    //   259: aload #10
    //   261: invokeinterface next : ()Ljava/lang/Object;
    //   266: checkcast c/c/a/a/c/k/k/x
    //   269: astore #11
    //   271: aload #11
    //   273: instanceof c/c/a/a/c/k/k/o
    //   276: ifeq -> 249
    //   279: aload #11
    //   281: checkcast c/c/a/a/c/k/k/o
    //   284: aload_1
    //   285: invokevirtual f : (Lc/c/a/a/c/k/k/d$a;)[Lc/c/a/a/c/c;
    //   288: astore #9
    //   290: aload #9
    //   292: ifnull -> 249
    //   295: aload #9
    //   297: arraylength
    //   298: istore #4
    //   300: iconst_0
    //   301: istore_2
    //   302: iload_2
    //   303: iload #4
    //   305: if_icmpge -> 329
    //   308: aload #9
    //   310: iload_2
    //   311: aaload
    //   312: aload #7
    //   314: invokestatic y : (Ljava/lang/Object;Ljava/lang/Object;)Z
    //   317: ifeq -> 323
    //   320: goto -> 331
    //   323: iinc #2, 1
    //   326: goto -> 302
    //   329: iconst_m1
    //   330: istore_2
    //   331: iload_2
    //   332: iflt -> 340
    //   335: iconst_1
    //   336: istore_2
    //   337: goto -> 342
    //   340: iconst_0
    //   341: istore_2
    //   342: iload_2
    //   343: ifeq -> 249
    //   346: aload #8
    //   348: aload #11
    //   350: invokevirtual add : (Ljava/lang/Object;)Z
    //   353: pop
    //   354: goto -> 249
    //   357: aload #8
    //   359: invokevirtual size : ()I
    //   362: istore #4
    //   364: iload_3
    //   365: istore_2
    //   366: iload_2
    //   367: iload #4
    //   369: if_icmpge -> 1495
    //   372: aload #8
    //   374: iload_2
    //   375: invokevirtual get : (I)Ljava/lang/Object;
    //   378: astore #9
    //   380: iinc #2, 1
    //   383: aload #9
    //   385: checkcast c/c/a/a/c/k/k/x
    //   388: astore #9
    //   390: aload_1
    //   391: getfield a : Ljava/util/Queue;
    //   394: aload #9
    //   396: invokeinterface remove : (Ljava/lang/Object;)Z
    //   401: pop
    //   402: aload #9
    //   404: new c/c/a/a/c/k/j
    //   407: dup
    //   408: aload #7
    //   410: invokespecial <init> : (Lc/c/a/a/c/c;)V
    //   413: invokevirtual c : (Ljava/lang/RuntimeException;)V
    //   416: goto -> 366
    //   419: aload_1
    //   420: getfield obj : Ljava/lang/Object;
    //   423: checkcast c/c/a/a/c/k/k/d$c
    //   426: astore #7
    //   428: aload_0
    //   429: getfield i : Ljava/util/Map;
    //   432: aload #7
    //   434: getfield a : Lc/c/a/a/c/k/k/a;
    //   437: invokeinterface containsKey : (Ljava/lang/Object;)Z
    //   442: ifeq -> 1495
    //   445: aload_0
    //   446: getfield i : Ljava/util/Map;
    //   449: aload #7
    //   451: getfield a : Lc/c/a/a/c/k/k/a;
    //   454: invokeinterface get : (Ljava/lang/Object;)Ljava/lang/Object;
    //   459: checkcast c/c/a/a/c/k/k/d$a
    //   462: astore_1
    //   463: aload_1
    //   464: getfield k : Ljava/util/List;
    //   467: aload #7
    //   469: invokeinterface contains : (Ljava/lang/Object;)Z
    //   474: ifne -> 480
    //   477: goto -> 1495
    //   480: aload_1
    //   481: getfield j : Z
    //   484: ifne -> 1495
    //   487: aload_1
    //   488: getfield b : Lc/c/a/a/c/k/a$f;
    //   491: invokeinterface f : ()Z
    //   496: ifne -> 506
    //   499: aload_1
    //   500: invokevirtual a : ()V
    //   503: goto -> 1495
    //   506: aload_1
    //   507: invokevirtual i : ()V
    //   510: goto -> 1495
    //   513: aload_1
    //   514: getfield obj : Ljava/lang/Object;
    //   517: checkcast c/c/a/a/c/k/k/n
    //   520: ifnull -> 558
    //   523: aload_0
    //   524: getfield i : Ljava/util/Map;
    //   527: aconst_null
    //   528: invokeinterface containsKey : (Ljava/lang/Object;)Z
    //   533: ifne -> 538
    //   536: aconst_null
    //   537: athrow
    //   538: aload_0
    //   539: getfield i : Ljava/util/Map;
    //   542: aconst_null
    //   543: invokeinterface get : (Ljava/lang/Object;)Ljava/lang/Object;
    //   548: checkcast c/c/a/a/c/k/k/d$a
    //   551: iconst_0
    //   552: invokevirtual p : (Z)Z
    //   555: pop
    //   556: aconst_null
    //   557: athrow
    //   558: aconst_null
    //   559: athrow
    //   560: aload_0
    //   561: getfield i : Ljava/util/Map;
    //   564: aload_1
    //   565: getfield obj : Ljava/lang/Object;
    //   568: invokeinterface containsKey : (Ljava/lang/Object;)Z
    //   573: ifeq -> 1495
    //   576: aload_0
    //   577: getfield i : Ljava/util/Map;
    //   580: aload_1
    //   581: getfield obj : Ljava/lang/Object;
    //   584: invokeinterface get : (Ljava/lang/Object;)Ljava/lang/Object;
    //   589: checkcast c/c/a/a/c/k/k/d$a
    //   592: iconst_1
    //   593: invokevirtual p : (Z)Z
    //   596: pop
    //   597: goto -> 1495
    //   600: aload_0
    //   601: getfield i : Ljava/util/Map;
    //   604: aload_1
    //   605: getfield obj : Ljava/lang/Object;
    //   608: invokeinterface containsKey : (Ljava/lang/Object;)Z
    //   613: ifeq -> 1495
    //   616: aload_0
    //   617: getfield i : Ljava/util/Map;
    //   620: aload_1
    //   621: getfield obj : Ljava/lang/Object;
    //   624: invokeinterface get : (Ljava/lang/Object;)Ljava/lang/Object;
    //   629: checkcast c/c/a/a/c/k/k/d$a
    //   632: astore #7
    //   634: aload #7
    //   636: getfield m : Lc/c/a/a/c/k/k/d;
    //   639: getfield m : Landroid/os/Handler;
    //   642: invokestatic c : (Landroid/os/Handler;)V
    //   645: aload #7
    //   647: getfield j : Z
    //   650: ifeq -> 1495
    //   653: aload #7
    //   655: invokevirtual l : ()V
    //   658: aload #7
    //   660: getfield m : Lc/c/a/a/c/k/k/d;
    //   663: astore_1
    //   664: aload_1
    //   665: getfield e : Lc/c/a/a/c/d;
    //   668: aload_1
    //   669: getfield d : Landroid/content/Context;
    //   672: invokevirtual b : (Landroid/content/Context;)I
    //   675: bipush #18
    //   677: if_icmpne -> 696
    //   680: new com/google/android/gms/common/api/Status
    //   683: dup
    //   684: bipush #8
    //   686: ldc_w 'Connection timed out while waiting for Google Play services update to complete.'
    //   689: invokespecial <init> : (ILjava/lang/String;)V
    //   692: astore_1
    //   693: goto -> 709
    //   696: new com/google/android/gms/common/api/Status
    //   699: dup
    //   700: bipush #8
    //   702: ldc_w 'API failed to connect while resuming due to an unknown error.'
    //   705: invokespecial <init> : (ILjava/lang/String;)V
    //   708: astore_1
    //   709: aload #7
    //   711: aload_1
    //   712: invokevirtual n : (Lcom/google/android/gms/common/api/Status;)V
    //   715: aload #7
    //   717: getfield b : Lc/c/a/a/c/k/a$f;
    //   720: invokeinterface g : ()V
    //   725: goto -> 1495
    //   728: aload_0
    //   729: getfield l : Ljava/util/Set;
    //   732: invokeinterface iterator : ()Ljava/util/Iterator;
    //   737: astore #7
    //   739: aload #7
    //   741: invokeinterface hasNext : ()Z
    //   746: ifeq -> 779
    //   749: aload #7
    //   751: invokeinterface next : ()Ljava/lang/Object;
    //   756: checkcast c/c/a/a/c/k/k/a
    //   759: astore_1
    //   760: aload_0
    //   761: getfield i : Ljava/util/Map;
    //   764: aload_1
    //   765: invokeinterface remove : (Ljava/lang/Object;)Ljava/lang/Object;
    //   770: checkcast c/c/a/a/c/k/k/d$a
    //   773: invokevirtual j : ()V
    //   776: goto -> 739
    //   779: aload_0
    //   780: getfield l : Ljava/util/Set;
    //   783: invokeinterface clear : ()V
    //   788: goto -> 1495
    //   791: aload_0
    //   792: getfield i : Ljava/util/Map;
    //   795: aload_1
    //   796: getfield obj : Ljava/lang/Object;
    //   799: invokeinterface containsKey : (Ljava/lang/Object;)Z
    //   804: ifeq -> 1495
    //   807: aload_0
    //   808: getfield i : Ljava/util/Map;
    //   811: aload_1
    //   812: getfield obj : Ljava/lang/Object;
    //   815: invokeinterface get : (Ljava/lang/Object;)Ljava/lang/Object;
    //   820: checkcast c/c/a/a/c/k/k/d$a
    //   823: astore_1
    //   824: aload_1
    //   825: getfield m : Lc/c/a/a/c/k/k/d;
    //   828: getfield m : Landroid/os/Handler;
    //   831: invokestatic c : (Landroid/os/Handler;)V
    //   834: aload_1
    //   835: getfield j : Z
    //   838: ifeq -> 1495
    //   841: aload_1
    //   842: invokevirtual a : ()V
    //   845: goto -> 1495
    //   848: aload_0
    //   849: aload_1
    //   850: getfield obj : Ljava/lang/Object;
    //   853: checkcast c/c/a/a/c/k/c
    //   856: invokevirtual b : (Lc/c/a/a/c/k/c;)V
    //   859: goto -> 1495
    //   862: aload_0
    //   863: getfield d : Landroid/content/Context;
    //   866: invokevirtual getApplicationContext : ()Landroid/content/Context;
    //   869: instanceof android/app/Application
    //   872: ifeq -> 1495
    //   875: aload_0
    //   876: getfield d : Landroid/content/Context;
    //   879: invokevirtual getApplicationContext : ()Landroid/content/Context;
    //   882: checkcast android/app/Application
    //   885: invokestatic b : (Landroid/app/Application;)V
    //   888: getstatic c/c/a/a/c/k/k/b.f : Lc/c/a/a/c/k/k/b;
    //   891: new c/c/a/a/c/k/k/p
    //   894: dup
    //   895: aload_0
    //   896: invokespecial <init> : (Lc/c/a/a/c/k/k/d;)V
    //   899: invokevirtual a : (Lc/c/a/a/c/k/k/b$a;)V
    //   902: getstatic c/c/a/a/c/k/k/b.f : Lc/c/a/a/c/k/k/b;
    //   905: astore #7
    //   907: aload #7
    //   909: getfield c : Ljava/util/concurrent/atomic/AtomicBoolean;
    //   912: invokevirtual get : ()Z
    //   915: ifne -> 960
    //   918: new android/app/ActivityManager$RunningAppProcessInfo
    //   921: dup
    //   922: invokespecial <init> : ()V
    //   925: astore_1
    //   926: aload_1
    //   927: invokestatic getMyMemoryState : (Landroid/app/ActivityManager$RunningAppProcessInfo;)V
    //   930: aload #7
    //   932: getfield c : Ljava/util/concurrent/atomic/AtomicBoolean;
    //   935: iconst_1
    //   936: invokevirtual getAndSet : (Z)Z
    //   939: ifne -> 960
    //   942: aload_1
    //   943: getfield importance : I
    //   946: bipush #100
    //   948: if_icmple -> 960
    //   951: aload #7
    //   953: getfield b : Ljava/util/concurrent/atomic/AtomicBoolean;
    //   956: iconst_1
    //   957: invokevirtual set : (Z)V
    //   960: aload #7
    //   962: getfield b : Ljava/util/concurrent/atomic/AtomicBoolean;
    //   965: invokevirtual get : ()Z
    //   968: ifne -> 1495
    //   971: aload_0
    //   972: ldc2_w 300000
    //   975: putfield c : J
    //   978: goto -> 1495
    //   981: aload_1
    //   982: getfield arg1 : I
    //   985: istore_2
    //   986: aload_1
    //   987: getfield obj : Ljava/lang/Object;
    //   990: checkcast c/c/a/a/c/a
    //   993: astore #7
    //   995: aload_0
    //   996: getfield i : Ljava/util/Map;
    //   999: invokeinterface values : ()Ljava/util/Collection;
    //   1004: invokeinterface iterator : ()Ljava/util/Iterator;
    //   1009: astore #8
    //   1011: aload #8
    //   1013: invokeinterface hasNext : ()Z
    //   1018: ifeq -> 1043
    //   1021: aload #8
    //   1023: invokeinterface next : ()Ljava/lang/Object;
    //   1028: checkcast c/c/a/a/c/k/k/d$a
    //   1031: astore_1
    //   1032: aload_1
    //   1033: getfield h : I
    //   1036: iload_2
    //   1037: if_icmpne -> 1011
    //   1040: goto -> 1045
    //   1043: aconst_null
    //   1044: astore_1
    //   1045: aload_1
    //   1046: ifnull -> 1167
    //   1049: aload_0
    //   1050: getfield e : Lc/c/a/a/c/d;
    //   1053: astore #8
    //   1055: aload #7
    //   1057: getfield c : I
    //   1060: istore_2
    //   1061: aload #8
    //   1063: ifnull -> 1165
    //   1066: iload_2
    //   1067: invokestatic a : (I)Ljava/lang/String;
    //   1070: astore #8
    //   1072: aload #7
    //   1074: getfield e : Ljava/lang/String;
    //   1077: astore #9
    //   1079: aload #8
    //   1081: invokestatic valueOf : (Ljava/lang/Object;)Ljava/lang/String;
    //   1084: invokevirtual length : ()I
    //   1087: istore_2
    //   1088: new java/lang/StringBuilder
    //   1091: dup
    //   1092: aload #9
    //   1094: invokestatic valueOf : (Ljava/lang/Object;)Ljava/lang/String;
    //   1097: invokevirtual length : ()I
    //   1100: iload_2
    //   1101: bipush #69
    //   1103: iadd
    //   1104: iadd
    //   1105: invokespecial <init> : (I)V
    //   1108: astore #7
    //   1110: aload #7
    //   1112: ldc_w 'Error resolution was canceled by the user, original error message: '
    //   1115: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   1118: pop
    //   1119: aload #7
    //   1121: aload #8
    //   1123: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   1126: pop
    //   1127: aload #7
    //   1129: ldc_w ': '
    //   1132: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   1135: pop
    //   1136: aload #7
    //   1138: aload #9
    //   1140: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   1143: pop
    //   1144: aload_1
    //   1145: new com/google/android/gms/common/api/Status
    //   1148: dup
    //   1149: bipush #17
    //   1151: aload #7
    //   1153: invokevirtual toString : ()Ljava/lang/String;
    //   1156: invokespecial <init> : (ILjava/lang/String;)V
    //   1159: invokevirtual n : (Lcom/google/android/gms/common/api/Status;)V
    //   1162: goto -> 1495
    //   1165: aconst_null
    //   1166: athrow
    //   1167: new java/lang/StringBuilder
    //   1170: dup
    //   1171: bipush #76
    //   1173: invokespecial <init> : (I)V
    //   1176: astore_1
    //   1177: aload_1
    //   1178: ldc_w 'Could not find API instance '
    //   1181: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   1184: pop
    //   1185: aload_1
    //   1186: iload_2
    //   1187: invokevirtual append : (I)Ljava/lang/StringBuilder;
    //   1190: pop
    //   1191: aload_1
    //   1192: ldc_w ' while trying to fail enqueued calls.'
    //   1195: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   1198: pop
    //   1199: ldc 'GoogleApiManager'
    //   1201: aload_1
    //   1202: invokevirtual toString : ()Ljava/lang/String;
    //   1205: new java/lang/Exception
    //   1208: dup
    //   1209: invokespecial <init> : ()V
    //   1212: invokestatic wtf : (Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I
    //   1215: pop
    //   1216: goto -> 1495
    //   1219: aload_1
    //   1220: getfield obj : Ljava/lang/Object;
    //   1223: checkcast c/c/a/a/c/k/k/v
    //   1226: astore #8
    //   1228: aload_0
    //   1229: getfield i : Ljava/util/Map;
    //   1232: aload #8
    //   1234: getfield c : Lc/c/a/a/c/k/c;
    //   1237: getfield d : Lc/c/a/a/c/k/k/a;
    //   1240: invokeinterface get : (Ljava/lang/Object;)Ljava/lang/Object;
    //   1245: checkcast c/c/a/a/c/k/k/d$a
    //   1248: astore #7
    //   1250: aload #7
    //   1252: astore_1
    //   1253: aload #7
    //   1255: ifnonnull -> 1288
    //   1258: aload_0
    //   1259: aload #8
    //   1261: getfield c : Lc/c/a/a/c/k/c;
    //   1264: invokevirtual b : (Lc/c/a/a/c/k/c;)V
    //   1267: aload_0
    //   1268: getfield i : Ljava/util/Map;
    //   1271: aload #8
    //   1273: getfield c : Lc/c/a/a/c/k/c;
    //   1276: getfield d : Lc/c/a/a/c/k/k/a;
    //   1279: invokeinterface get : (Ljava/lang/Object;)Ljava/lang/Object;
    //   1284: checkcast c/c/a/a/c/k/k/d$a
    //   1287: astore_1
    //   1288: aload_1
    //   1289: invokevirtual b : ()Z
    //   1292: ifeq -> 1328
    //   1295: aload_0
    //   1296: getfield h : Ljava/util/concurrent/atomic/AtomicInteger;
    //   1299: invokevirtual get : ()I
    //   1302: aload #8
    //   1304: getfield b : I
    //   1307: if_icmpeq -> 1328
    //   1310: aload #8
    //   1312: getfield a : Lc/c/a/a/c/k/k/x;
    //   1315: getstatic c/c/a/a/c/k/k/d.n : Lcom/google/android/gms/common/api/Status;
    //   1318: invokevirtual a : (Lcom/google/android/gms/common/api/Status;)V
    //   1321: aload_1
    //   1322: invokevirtual j : ()V
    //   1325: goto -> 1495
    //   1328: aload_1
    //   1329: aload #8
    //   1331: getfield a : Lc/c/a/a/c/k/k/x;
    //   1334: invokevirtual e : (Lc/c/a/a/c/k/k/x;)V
    //   1337: goto -> 1495
    //   1340: aload_0
    //   1341: getfield i : Ljava/util/Map;
    //   1344: invokeinterface values : ()Ljava/util/Collection;
    //   1349: invokeinterface iterator : ()Ljava/util/Iterator;
    //   1354: astore_1
    //   1355: aload_1
    //   1356: invokeinterface hasNext : ()Z
    //   1361: ifeq -> 1495
    //   1364: aload_1
    //   1365: invokeinterface next : ()Ljava/lang/Object;
    //   1370: checkcast c/c/a/a/c/k/k/d$a
    //   1373: astore #7
    //   1375: aload #7
    //   1377: invokevirtual k : ()V
    //   1380: aload #7
    //   1382: invokevirtual a : ()V
    //   1385: goto -> 1355
    //   1388: aload_1
    //   1389: getfield obj : Ljava/lang/Object;
    //   1392: checkcast c/c/a/a/c/k/k/j0
    //   1395: astore_1
    //   1396: aconst_null
    //   1397: athrow
    //   1398: aload_1
    //   1399: getfield obj : Ljava/lang/Object;
    //   1402: checkcast java/lang/Boolean
    //   1405: invokevirtual booleanValue : ()Z
    //   1408: ifeq -> 1416
    //   1411: ldc2_w 10000
    //   1414: lstore #5
    //   1416: aload_0
    //   1417: lload #5
    //   1419: putfield c : J
    //   1422: aload_0
    //   1423: getfield m : Landroid/os/Handler;
    //   1426: bipush #12
    //   1428: invokevirtual removeMessages : (I)V
    //   1431: aload_0
    //   1432: getfield i : Ljava/util/Map;
    //   1435: invokeinterface keySet : ()Ljava/util/Set;
    //   1440: invokeinterface iterator : ()Ljava/util/Iterator;
    //   1445: astore #8
    //   1447: aload #8
    //   1449: invokeinterface hasNext : ()Z
    //   1454: ifeq -> 1495
    //   1457: aload #8
    //   1459: invokeinterface next : ()Ljava/lang/Object;
    //   1464: checkcast c/c/a/a/c/k/k/a
    //   1467: astore_1
    //   1468: aload_0
    //   1469: getfield m : Landroid/os/Handler;
    //   1472: astore #7
    //   1474: aload #7
    //   1476: aload #7
    //   1478: bipush #12
    //   1480: aload_1
    //   1481: invokevirtual obtainMessage : (ILjava/lang/Object;)Landroid/os/Message;
    //   1484: aload_0
    //   1485: getfield c : J
    //   1488: invokevirtual sendMessageDelayed : (Landroid/os/Message;J)Z
    //   1491: pop
    //   1492: goto -> 1447
    //   1495: iconst_1
    //   1496: ireturn
  }
  
  public final class a<O extends c.c.a.a.c.k.a.d> implements c.c.a.a.c.k.d, e, Object {
    public final Queue<x> a;
    
    public final c.c.a.a.c.k.a.f b;
    
    public final c.c.a.a.c.k.a.b c;
    
    public final a<O> d;
    
    public final m0 e;
    
    public final Set<j0> f;
    
    public final Map<g<?>, w> g;
    
    public final int h;
    
    public final z i;
    
    public boolean j;
    
    public final List<d.c> k;
    
    public c.c.a.a.c.a l;
    
    public final d m;
    
    public a(d this$0, c.c.a.a.c.k.c<O> param1c) {
      boolean bool;
      this.a = new LinkedList<x>();
      this.f = new HashSet<j0>();
      this.g = new HashMap<g<?>, w>();
      this.k = new ArrayList<d.c>();
      this.l = null;
      Looper looper = this$0.m.getLooper();
      c.c.a.a.c.l.c c1 = param1c.a().a();
      c.c.a.a.c.k.a a1 = param1c.b;
      if (a1.a != null) {
        bool = true;
      } else {
        bool = false;
      } 
      q.i(bool, "This API was constructed with a SimpleClientBuilder. Use getSimpleClientBuilder");
      c.c.a.a.c.k.a.f f1 = a1.a.a(param1c.a, looper, c1, param1c.c, this, this);
      this.b = f1;
      if (f1 instanceof t) {
        if ((t)f1 != null) {
          this.c = null;
        } else {
          throw null;
        } 
      } else {
        this.c = (c.c.a.a.c.k.a.b)f1;
      } 
      this.d = param1c.d;
      this.e = new m0();
      this.h = param1c.e;
      if (this.b.j()) {
        this.i = new z(this$0.d, this$0.m, param1c.a().a());
        return;
      } 
      this.i = null;
    }
    
    public final void a() {
      q.c(this.m.m);
      if (this.b.f() || this.b.d())
        return; 
      d d1 = this.m;
      j j = d1.f;
      Context context = d1.d;
      c.c.a.a.c.k.a.f f1 = this.b;
      if (j != null) {
        q.f(context);
        q.f(f1);
        boolean bool1 = f1.l();
        int i = 0;
        boolean bool = false;
        if (bool1) {
          int m = f1.o();
          int k = j.a.get(m, -1);
          if (k != -1) {
            i = k;
          } else {
            for (i = 0; i < j.a.size(); i++) {
              int n = j.a.keyAt(i);
              if (n > m && j.a.get(n) == 0) {
                k = bool;
                break;
              } 
            } 
            i = k;
            if (k == -1)
              i = j.b.c(context, m); 
            j.a.put(m, i);
          } 
        } 
        if (i != 0) {
          t(new c.c.a.a.c.a(i, null));
          return;
        } 
        d.b b1 = new d.b(this.m, this.b, this.d);
        if (this.b.j()) {
          z z1 = this.i;
          e e1 = z1.f;
          if (e1 != null)
            e1.g(); 
          z1.e.h = Integer.valueOf(System.identityHashCode(z1));
          c.c.a.a.c.k.a.a<? extends e, c.c.a.a.g.a> a1 = z1.c;
          Context context1 = z1.a;
          Looper looper = z1.b.getLooper();
          c.c.a.a.c.l.c c = z1.e;
          z1.f = (e)a1.a(context1, looper, c, c.g, z1, z1);
          z1.g = b1;
          Set<Scope> set = z1.d;
          if (set == null || set.isEmpty()) {
            z1.b.post(new y(z1));
          } else {
            z1.f.h();
          } 
        } 
        this.b.c(b1);
        return;
      } 
      throw null;
    }
    
    public final boolean b() {
      return this.b.j();
    }
    
    public final void c(int param1Int) {
      if (Looper.myLooper() == this.m.m.getLooper()) {
        h();
        return;
      } 
      this.m.m.post(new r(this));
    }
    
    public final c.c.a.a.c.c d(c.c.a.a.c.c[] param1ArrayOfc) {
      if (param1ArrayOfc != null && param1ArrayOfc.length != 0) {
        c.c.a.a.c.c[] arrayOfC2 = this.b.e();
        boolean bool = false;
        c.c.a.a.c.c[] arrayOfC1 = arrayOfC2;
        if (arrayOfC2 == null)
          arrayOfC1 = new c.c.a.a.c.c[0]; 
        b.f.a a1 = new b.f.a(arrayOfC1.length);
        int i = arrayOfC1.length;
        byte b1;
        for (b1 = 0; b1 < i; b1++) {
          c.c.a.a.c.c c1 = arrayOfC1[b1];
          a1.put(c1.b, Long.valueOf(c1.h()));
        } 
        i = param1ArrayOfc.length;
        for (b1 = bool; b1 < i; b1++) {
          c.c.a.a.c.c c1 = param1ArrayOfc[b1];
          if (!a1.containsKey(c1.b) || ((Long)a1.get(c1.b)).longValue() < c1.h())
            return c1; 
        } 
      } 
      return null;
    }
    
    public final void e(x param1x) {
      q.c(this.m.m);
      if (this.b.f()) {
        if (f(param1x)) {
          m();
          return;
        } 
        this.a.add(param1x);
        return;
      } 
      this.a.add(param1x);
      c.c.a.a.c.a a1 = this.l;
      if (a1 != null) {
        boolean bool;
        if (a1.c != 0 && a1.d != null) {
          bool = true;
        } else {
          bool = false;
        } 
        if (bool) {
          t(this.l);
          return;
        } 
      } 
      a();
    }
    
    public final boolean f(x param1x) {
      Context context;
      if (!(param1x instanceof o)) {
        o(param1x);
        return true;
      } 
      o o = (o)param1x;
      c.c.a.a.c.c c = d(o.f(this));
      if (c == null) {
        o(param1x);
        return true;
      } 
      if (o.g(this)) {
        Handler handler;
        a<O> a1 = this.d;
        param1x = null;
        d.c c1 = new d.c(a1, c, null);
        int i = this.k.indexOf(c1);
        if (i >= 0) {
          d.c c2 = this.k.get(i);
          this.m.m.removeMessages(15, c2);
          handler = this.m.m;
          handler.sendMessageDelayed(Message.obtain(handler, 15, c2), this.m.a);
        } else {
          this.k.add(handler);
          Handler handler1 = this.m.m;
          handler1.sendMessageDelayed(Message.obtain(handler1, 15, handler), this.m.a);
          handler1 = this.m.m;
          handler1.sendMessageDelayed(Message.obtain(handler1, 16, handler), this.m.b);
          synchronized (d.p) {
            d d1 = this.m;
            i = this.h;
            null = d1.e;
            context = d1.d;
            if (null != null) {
              PendingIntent pendingIntent;
              Intent intent = null.a(context, 2, null);
              if (intent != null)
                pendingIntent = PendingIntent.getActivity(context, 0, intent, 134217728); 
              if (pendingIntent != null)
                null.e(context, 2, GoogleApiActivity.a(context, pendingIntent, i)); 
            } else {
              throw null;
            } 
          } 
        } 
      } else {
        context.c((RuntimeException)new j(c));
      } 
      return false;
    }
    
    public final void g() {
      k();
      q(c.c.a.a.c.a.f);
      l();
      Iterator<w> iterator = this.g.values().iterator();
      if (!iterator.hasNext()) {
        i();
        m();
        return;
      } 
      w w = iterator.next();
      throw null;
    }
    
    public final void h() {
      k();
      this.j = true;
      this.e.a(true, e0.a);
      Handler handler = this.m.m;
      handler.sendMessageDelayed(Message.obtain(handler, 9, this.d), this.m.a);
      handler = this.m.m;
      handler.sendMessageDelayed(Message.obtain(handler, 11, this.d), this.m.b);
      this.m.f.a.clear();
    }
    
    public final void i() {
      ArrayList<x> arrayList = new ArrayList<x>(this.a);
      int j = arrayList.size();
      int i = 0;
      while (i < j) {
        x x = (x)arrayList.get(i);
        int k = i + 1;
        x = x;
        if (this.b.f()) {
          i = k;
          if (f(x)) {
            this.a.remove(x);
            i = k;
          } 
        } 
      } 
    }
    
    public final void j() {
      q.c(this.m.m);
      n(d.n);
      m0 m01 = this.e;
      if (m01 != null) {
        Status status = d.n;
        byte b1 = 0;
        m01.a(false, status);
        g[] arrayOfG = (g[])this.g.keySet().toArray((Object[])new g[this.g.size()]);
        int i = arrayOfG.length;
        while (b1 < i) {
          e(new i0(arrayOfG[b1], new e()));
          b1++;
        } 
        q(new c.c.a.a.c.a(4));
        if (this.b.f())
          this.b.b(new t(this)); 
        return;
      } 
      throw null;
    }
    
    public final void k() {
      q.c(this.m.m);
      this.l = null;
    }
    
    public final void l() {
      if (this.j) {
        this.m.m.removeMessages(11, this.d);
        this.m.m.removeMessages(9, this.d);
        this.j = false;
      } 
    }
    
    public final void m() {
      this.m.m.removeMessages(12, this.d);
      Handler handler = this.m.m;
      handler.sendMessageDelayed(handler.obtainMessage(12, this.d), this.m.c);
    }
    
    public final void n(Status param1Status) {
      q.c(this.m.m);
      Iterator<x> iterator = this.a.iterator();
      while (iterator.hasNext())
        ((x)iterator.next()).a(param1Status); 
      this.a.clear();
    }
    
    public final void o(x param1x) {
      param1x.b(this.e, b());
      try {
        param1x.e(this);
        return;
      } catch (DeadObjectException deadObjectException) {
        c(1);
        this.b.g();
        return;
      } 
    }
    
    public final boolean p(boolean param1Boolean) {
      q.c(this.m.m);
      if (this.b.f() && this.g.size() == 0) {
        boolean bool;
        m0 m01 = this.e;
        if (!m01.a.isEmpty() || !m01.b.isEmpty()) {
          bool = true;
        } else {
          bool = false;
        } 
        if (bool) {
          if (param1Boolean)
            m(); 
          return false;
        } 
        this.b.g();
        return true;
      } 
      return false;
    }
    
    public final void q(c.c.a.a.c.a param1a) {
      Iterator<j0> iterator = this.f.iterator();
      if (iterator.hasNext()) {
        j0 j0 = iterator.next();
        if (a.a.a.a.a.y(param1a, c.c.a.a.c.a.f))
          this.b.i(); 
        throw null;
      } 
      this.f.clear();
    }
    
    public final void t(c.c.a.a.c.a param1a) {
      q.c(this.m.m);
      z z1 = this.i;
      if (z1 != null) {
        e e1 = z1.f;
        if (e1 != null)
          e1.g(); 
      } 
      k();
      this.m.f.a.clear();
      q(param1a);
      if (param1a.c == 4) {
        n(d.o);
        return;
      } 
      if (this.a.isEmpty()) {
        this.l = param1a;
        return;
      } 
      synchronized (d.p) {
        if (!this.m.c(param1a, this.h)) {
          Handler handler;
          if (param1a.c == 18)
            this.j = true; 
          if (this.j) {
            handler = this.m.m;
            handler.sendMessageDelayed(Message.obtain(handler, 9, this.d), this.m.a);
            return;
          } 
          null = this.d.c.b;
          String str = String.valueOf(handler);
          int i = String.valueOf(null).length();
          StringBuilder stringBuilder = new StringBuilder(str.length() + i + 63);
          stringBuilder.append("API: ");
          stringBuilder.append((String)null);
          stringBuilder.append(" is not available on this device. Connection failed with: ");
          stringBuilder.append(str);
          n(new Status(17, stringBuilder.toString()));
        } 
        return;
      } 
    }
    
    public final void y(Bundle param1Bundle) {
      if (Looper.myLooper() == this.m.m.getLooper()) {
        g();
        return;
      } 
      this.m.m.post(new q(this));
    }
  }
  
  public final class b implements a0, c.c.a.a.c.l.b.c {
    public final c.c.a.a.c.k.a.f a;
    
    public final a<?> b;
    
    public k c = null;
    
    public Set<Scope> d = null;
    
    public boolean e = false;
    
    public final d f;
    
    public b(d this$0, c.c.a.a.c.k.a.f param1f, a<?> param1a) {
      this.a = param1f;
      this.b = param1a;
    }
    
    public final void a(c.c.a.a.c.a param1a) {
      this.f.m.post(new u(this, param1a));
    }
    
    public final void b(c.c.a.a.c.a param1a) {
      d.a a1 = this.f.i.get(this.b);
      q.c(a1.m.m);
      a1.b.g();
      a1.t(param1a);
    }
  }
  
  public static final class c {
    public final a<?> a;
    
    public final c.c.a.a.c.c b;
    
    public c(a<?> param1a, c.c.a.a.c.c param1c, p param1p) {
      this.a = param1a;
      this.b = param1c;
    }
    
    public final boolean equals(Object param1Object) {
      if (param1Object != null && param1Object instanceof c) {
        param1Object = param1Object;
        if (a.a.a.a.a.y(this.a, ((c)param1Object).a) && a.a.a.a.a.y(this.b, ((c)param1Object).b))
          return true; 
      } 
      return false;
    }
    
    public final int hashCode() {
      return Arrays.hashCode(new Object[] { this.a, this.b });
    }
    
    public final String toString() {
      p p = a.a.a.a.a.B0(this);
      p.a("key", this.a);
      p.a("feature", this.b);
      return p.toString();
    }
  }
}


/* Location:              C:\Users\panch\Downloads\dvba_v1.1.0-dex2jar.jar!\c\c\a\a\c\k\k\d.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */