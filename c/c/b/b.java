package c.c.b;

import android.annotation.TargetApi;
import android.app.Application;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import android.util.Base64;
import android.util.Log;
import c.c.a.a.c.l.p;
import c.c.a.a.c.l.q;
import c.c.b.i.l;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;
import javax.annotation.concurrent.GuardedBy;

public class b {
  public static final Object h = new Object();
  
  public static final Executor i = new d(null);
  
  @GuardedBy("LOCK")
  public static final Map<String, b> j = (Map<String, b>)new b.f.a();
  
  public final Context a;
  
  public final String b;
  
  public final f c;
  
  public final l d;
  
  public final AtomicBoolean e;
  
  public final AtomicBoolean f;
  
  public final List<b> g;
  
  public b(Context paramContext, String paramString, f paramf) {
    // Byte code:
    //   0: aload_0
    //   1: invokespecial <init> : ()V
    //   4: aload_0
    //   5: new java/util/concurrent/atomic/AtomicBoolean
    //   8: dup
    //   9: iconst_0
    //   10: invokespecial <init> : (Z)V
    //   13: putfield e : Ljava/util/concurrent/atomic/AtomicBoolean;
    //   16: aload_0
    //   17: new java/util/concurrent/atomic/AtomicBoolean
    //   20: dup
    //   21: invokespecial <init> : ()V
    //   24: putfield f : Ljava/util/concurrent/atomic/AtomicBoolean;
    //   27: aload_0
    //   28: new java/util/concurrent/CopyOnWriteArrayList
    //   31: dup
    //   32: invokespecial <init> : ()V
    //   35: putfield g : Ljava/util/List;
    //   38: new java/util/concurrent/CopyOnWriteArrayList
    //   41: dup
    //   42: invokespecial <init> : ()V
    //   45: pop
    //   46: aload_1
    //   47: invokestatic f : (Ljava/lang/Object;)Ljava/lang/Object;
    //   50: pop
    //   51: aload_0
    //   52: aload_1
    //   53: putfield a : Landroid/content/Context;
    //   56: aload_2
    //   57: invokestatic d : (Ljava/lang/String;)Ljava/lang/String;
    //   60: pop
    //   61: aload_0
    //   62: aload_2
    //   63: putfield b : Ljava/lang/String;
    //   66: aload_3
    //   67: invokestatic f : (Ljava/lang/Object;)Ljava/lang/Object;
    //   70: pop
    //   71: aload_0
    //   72: aload_3
    //   73: putfield c : Lc/c/b/f;
    //   76: aconst_null
    //   77: astore #5
    //   79: new c/c/b/i/f
    //   82: dup
    //   83: ldc com/google/firebase/components/ComponentDiscoveryService
    //   85: aconst_null
    //   86: invokespecial <init> : (Ljava/lang/Class;Lc/c/b/i/e;)V
    //   89: astore_2
    //   90: aload_1
    //   91: invokevirtual getPackageManager : ()Landroid/content/pm/PackageManager;
    //   94: astore #4
    //   96: aload #4
    //   98: ifnonnull -> 107
    //   101: ldc 'Context has no PackageManager.'
    //   103: astore_2
    //   104: goto -> 173
    //   107: new android/content/ComponentName
    //   110: astore #6
    //   112: aload #6
    //   114: aload_1
    //   115: aload_2
    //   116: getfield a : Ljava/lang/Class;
    //   119: invokespecial <init> : (Landroid/content/Context;Ljava/lang/Class;)V
    //   122: aload #4
    //   124: aload #6
    //   126: sipush #128
    //   129: invokevirtual getServiceInfo : (Landroid/content/ComponentName;I)Landroid/content/pm/ServiceInfo;
    //   132: astore #4
    //   134: aload #4
    //   136: ifnonnull -> 183
    //   139: new java/lang/StringBuilder
    //   142: astore #4
    //   144: aload #4
    //   146: invokespecial <init> : ()V
    //   149: aload #4
    //   151: aload_2
    //   152: getfield a : Ljava/lang/Class;
    //   155: invokevirtual append : (Ljava/lang/Object;)Ljava/lang/StringBuilder;
    //   158: pop
    //   159: aload #4
    //   161: ldc ' has no service info.'
    //   163: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   166: pop
    //   167: aload #4
    //   169: invokevirtual toString : ()Ljava/lang/String;
    //   172: astore_2
    //   173: ldc 'ComponentDiscovery'
    //   175: aload_2
    //   176: invokestatic w : (Ljava/lang/String;Ljava/lang/String;)I
    //   179: pop
    //   180: goto -> 201
    //   183: aload #4
    //   185: getfield metaData : Landroid/os/Bundle;
    //   188: astore_2
    //   189: goto -> 203
    //   192: astore_2
    //   193: ldc 'ComponentDiscovery'
    //   195: ldc 'Application info not found.'
    //   197: invokestatic w : (Ljava/lang/String;Ljava/lang/String;)I
    //   200: pop
    //   201: aconst_null
    //   202: astore_2
    //   203: aload_2
    //   204: ifnonnull -> 222
    //   207: ldc 'ComponentDiscovery'
    //   209: ldc 'Could not retrieve metadata, returning empty list of registrars.'
    //   211: invokestatic w : (Ljava/lang/String;Ljava/lang/String;)I
    //   214: pop
    //   215: invokestatic emptyList : ()Ljava/util/List;
    //   218: astore_2
    //   219: goto -> 307
    //   222: new java/util/ArrayList
    //   225: dup
    //   226: invokespecial <init> : ()V
    //   229: astore #4
    //   231: aload_2
    //   232: invokevirtual keySet : ()Ljava/util/Set;
    //   235: invokeinterface iterator : ()Ljava/util/Iterator;
    //   240: astore #7
    //   242: aload #7
    //   244: invokeinterface hasNext : ()Z
    //   249: ifeq -> 304
    //   252: aload #7
    //   254: invokeinterface next : ()Ljava/lang/Object;
    //   259: checkcast java/lang/String
    //   262: astore #6
    //   264: ldc 'com.google.firebase.components.ComponentRegistrar'
    //   266: aload_2
    //   267: aload #6
    //   269: invokevirtual get : (Ljava/lang/String;)Ljava/lang/Object;
    //   272: invokevirtual equals : (Ljava/lang/Object;)Z
    //   275: ifeq -> 242
    //   278: aload #6
    //   280: ldc 'com.google.firebase.components:'
    //   282: invokevirtual startsWith : (Ljava/lang/String;)Z
    //   285: ifeq -> 242
    //   288: aload #4
    //   290: aload #6
    //   292: bipush #31
    //   294: invokevirtual substring : (I)Ljava/lang/String;
    //   297: invokevirtual add : (Ljava/lang/Object;)Z
    //   300: pop
    //   301: goto -> 242
    //   304: aload #4
    //   306: astore_2
    //   307: new java/util/ArrayList
    //   310: dup
    //   311: invokespecial <init> : ()V
    //   314: astore #6
    //   316: aload_2
    //   317: invokeinterface iterator : ()Ljava/util/Iterator;
    //   322: astore #7
    //   324: aload #7
    //   326: invokeinterface hasNext : ()Z
    //   331: ifeq -> 520
    //   334: aload #7
    //   336: invokeinterface next : ()Ljava/lang/Object;
    //   341: checkcast java/lang/String
    //   344: astore_2
    //   345: aload_2
    //   346: invokestatic forName : (Ljava/lang/String;)Ljava/lang/Class;
    //   349: astore #4
    //   351: ldc c/c/b/i/h
    //   353: aload #4
    //   355: invokevirtual isAssignableFrom : (Ljava/lang/Class;)Z
    //   358: ifne -> 388
    //   361: ldc 'ComponentDiscovery'
    //   363: ldc 'Class %s is not an instance of %s'
    //   365: iconst_2
    //   366: anewarray java/lang/Object
    //   369: dup
    //   370: iconst_0
    //   371: aload_2
    //   372: aastore
    //   373: dup
    //   374: iconst_1
    //   375: ldc 'com.google.firebase.components.ComponentRegistrar'
    //   377: aastore
    //   378: invokestatic format : (Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;
    //   381: invokestatic w : (Ljava/lang/String;Ljava/lang/String;)I
    //   384: pop
    //   385: goto -> 324
    //   388: aload #6
    //   390: aload #4
    //   392: iconst_0
    //   393: anewarray java/lang/Class
    //   396: invokevirtual getDeclaredConstructor : ([Ljava/lang/Class;)Ljava/lang/reflect/Constructor;
    //   399: iconst_0
    //   400: anewarray java/lang/Object
    //   403: invokevirtual newInstance : ([Ljava/lang/Object;)Ljava/lang/Object;
    //   406: checkcast c/c/b/i/h
    //   409: invokevirtual add : (Ljava/lang/Object;)Z
    //   412: pop
    //   413: goto -> 324
    //   416: astore #4
    //   418: ldc 'Could not instantiate %s'
    //   420: iconst_1
    //   421: anewarray java/lang/Object
    //   424: dup
    //   425: iconst_0
    //   426: aload_2
    //   427: aastore
    //   428: invokestatic format : (Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;
    //   431: astore_2
    //   432: goto -> 508
    //   435: astore #4
    //   437: ldc 'Could not instantiate %s'
    //   439: iconst_1
    //   440: anewarray java/lang/Object
    //   443: dup
    //   444: iconst_0
    //   445: aload_2
    //   446: aastore
    //   447: invokestatic format : (Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;
    //   450: astore_2
    //   451: goto -> 508
    //   454: astore #4
    //   456: ldc 'Could not instantiate %s.'
    //   458: iconst_1
    //   459: anewarray java/lang/Object
    //   462: dup
    //   463: iconst_0
    //   464: aload_2
    //   465: aastore
    //   466: invokestatic format : (Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;
    //   469: astore_2
    //   470: goto -> 508
    //   473: astore #4
    //   475: ldc 'Could not instantiate %s.'
    //   477: iconst_1
    //   478: anewarray java/lang/Object
    //   481: dup
    //   482: iconst_0
    //   483: aload_2
    //   484: aastore
    //   485: invokestatic format : (Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;
    //   488: astore_2
    //   489: goto -> 508
    //   492: astore #4
    //   494: ldc 'Class %s is not an found.'
    //   496: iconst_1
    //   497: anewarray java/lang/Object
    //   500: dup
    //   501: iconst_0
    //   502: aload_2
    //   503: aastore
    //   504: invokestatic format : (Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;
    //   507: astore_2
    //   508: ldc 'ComponentDiscovery'
    //   510: aload_2
    //   511: aload #4
    //   513: invokestatic w : (Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I
    //   516: pop
    //   517: goto -> 324
    //   520: invokestatic t : ()Ljava/lang/String;
    //   523: astore #10
    //   525: getstatic c/c/b/b.i : Ljava/util/concurrent/Executor;
    //   528: astore_2
    //   529: aload_1
    //   530: ldc android/content/Context
    //   532: iconst_0
    //   533: anewarray java/lang/Class
    //   536: invokestatic c : (Ljava/lang/Object;Ljava/lang/Class;[Ljava/lang/Class;)Lc/c/b/i/d;
    //   539: astore #4
    //   541: aload_0
    //   542: ldc c/c/b/b
    //   544: iconst_0
    //   545: anewarray java/lang/Class
    //   548: invokestatic c : (Ljava/lang/Object;Ljava/lang/Class;[Ljava/lang/Class;)Lc/c/b/i/d;
    //   551: astore #7
    //   553: aload_3
    //   554: ldc_w c/c/b/f
    //   557: iconst_0
    //   558: anewarray java/lang/Class
    //   561: invokestatic c : (Ljava/lang/Object;Ljava/lang/Class;[Ljava/lang/Class;)Lc/c/b/i/d;
    //   564: astore_3
    //   565: ldc_w 'fire-android'
    //   568: ldc_w ''
    //   571: invokestatic j : (Ljava/lang/String;Ljava/lang/String;)Lc/c/b/i/d;
    //   574: astore #9
    //   576: ldc_w 'fire-core'
    //   579: ldc_w '19.3.0'
    //   582: invokestatic j : (Ljava/lang/String;Ljava/lang/String;)Lc/c/b/i/d;
    //   585: astore #8
    //   587: aload #5
    //   589: astore_1
    //   590: aload #10
    //   592: ifnull -> 604
    //   595: ldc_w 'kotlin'
    //   598: aload #10
    //   600: invokestatic j : (Ljava/lang/String;Ljava/lang/String;)Lc/c/b/i/d;
    //   603: astore_1
    //   604: ldc_w c/c/b/n/f
    //   607: invokestatic a : (Ljava/lang/Class;)Lc/c/b/i/d$b;
    //   610: astore #5
    //   612: aload #5
    //   614: new c/c/b/i/p
    //   617: dup
    //   618: ldc_w c/c/b/n/e
    //   621: iconst_2
    //   622: iconst_0
    //   623: invokespecial <init> : (Ljava/lang/Class;II)V
    //   626: invokevirtual a : (Lc/c/b/i/p;)Lc/c/b/i/d$b;
    //   629: pop
    //   630: aload #5
    //   632: getstatic c/c/b/n/b.a : Lc/c/b/n/b;
    //   635: invokevirtual c : (Lc/c/b/i/g;)Lc/c/b/i/d$b;
    //   638: pop
    //   639: aload #5
    //   641: invokevirtual b : ()Lc/c/b/i/d;
    //   644: astore #10
    //   646: ldc_w c/c/b/k/c
    //   649: invokestatic a : (Ljava/lang/Class;)Lc/c/b/i/d$b;
    //   652: astore #5
    //   654: aload #5
    //   656: new c/c/b/i/p
    //   659: dup
    //   660: ldc android/content/Context
    //   662: iconst_1
    //   663: iconst_0
    //   664: invokespecial <init> : (Ljava/lang/Class;II)V
    //   667: invokevirtual a : (Lc/c/b/i/p;)Lc/c/b/i/d$b;
    //   670: pop
    //   671: aload #5
    //   673: getstatic c/c/b/k/a.a : Lc/c/b/k/a;
    //   676: invokevirtual c : (Lc/c/b/i/g;)Lc/c/b/i/d$b;
    //   679: pop
    //   680: aload_0
    //   681: new c/c/b/i/l
    //   684: dup
    //   685: aload_2
    //   686: aload #6
    //   688: bipush #8
    //   690: anewarray c/c/b/i/d
    //   693: dup
    //   694: iconst_0
    //   695: aload #4
    //   697: aastore
    //   698: dup
    //   699: iconst_1
    //   700: aload #7
    //   702: aastore
    //   703: dup
    //   704: iconst_2
    //   705: aload_3
    //   706: aastore
    //   707: dup
    //   708: iconst_3
    //   709: aload #9
    //   711: aastore
    //   712: dup
    //   713: iconst_4
    //   714: aload #8
    //   716: aastore
    //   717: dup
    //   718: iconst_5
    //   719: aload_1
    //   720: aastore
    //   721: dup
    //   722: bipush #6
    //   724: aload #10
    //   726: aastore
    //   727: dup
    //   728: bipush #7
    //   730: aload #5
    //   732: invokevirtual b : ()Lc/c/b/i/d;
    //   735: aastore
    //   736: invokespecial <init> : (Ljava/util/concurrent/Executor;Ljava/lang/Iterable;[Lc/c/b/i/d;)V
    //   739: putfield d : Lc/c/b/i/l;
    //   742: new c/c/b/i/u
    //   745: astore_1
    //   746: return
    // Exception table:
    //   from	to	target	type
    //   90	96	192	android/content/pm/PackageManager$NameNotFoundException
    //   107	134	192	android/content/pm/PackageManager$NameNotFoundException
    //   139	173	192	android/content/pm/PackageManager$NameNotFoundException
    //   173	180	192	android/content/pm/PackageManager$NameNotFoundException
    //   183	189	192	android/content/pm/PackageManager$NameNotFoundException
    //   345	385	492	java/lang/ClassNotFoundException
    //   345	385	473	java/lang/IllegalAccessException
    //   345	385	454	java/lang/InstantiationException
    //   345	385	435	java/lang/NoSuchMethodException
    //   345	385	416	java/lang/reflect/InvocationTargetException
    //   388	413	492	java/lang/ClassNotFoundException
    //   388	413	473	java/lang/IllegalAccessException
    //   388	413	454	java/lang/InstantiationException
    //   388	413	435	java/lang/NoSuchMethodException
    //   388	413	416	java/lang/reflect/InvocationTargetException
  }
  
  public static List<String> b() {
    ArrayList<String> arrayList = new ArrayList();
    synchronized (h) {
      for (b b1 : j.values()) {
        b1.a();
        arrayList.add(b1.b);
      } 
      Collections.sort(arrayList);
      return arrayList;
    } 
  }
  
  public static b c() {
    synchronized (h) {
      b b1 = j.get("[DEFAULT]");
      if (b1 != null)
        return b1; 
      IllegalStateException illegalStateException = new IllegalStateException();
      StringBuilder stringBuilder = new StringBuilder();
      this();
      stringBuilder.append("Default FirebaseApp is not initialized in this process ");
      stringBuilder.append(c.c.a.a.c.o.c.a());
      stringBuilder.append(". Make sure to call FirebaseApp.initializeApp(Context) first.");
      this(stringBuilder.toString());
      throw illegalStateException;
    } 
  }
  
  public static b d(String paramString) {
    synchronized (h) {
      b b1 = j.get(paramString.trim());
      if (b1 != null)
        return b1; 
      List<String> list = b();
      ArrayList arrayList = (ArrayList)list;
      if (arrayList.isEmpty()) {
        str = "";
      } else {
        StringBuilder stringBuilder = new StringBuilder();
        this();
        stringBuilder.append("Available app names: ");
        stringBuilder.append(TextUtils.join(", ", (Iterable)str));
        str = stringBuilder.toString();
      } 
      String str = String.format("FirebaseApp with name %s doesn't exist. %s", new Object[] { paramString, str });
      IllegalStateException illegalStateException = new IllegalStateException();
      this(str);
      throw illegalStateException;
    } 
  }
  
  public static b g(Context paramContext, f paramf) {
    c.b(paramContext);
    if (paramContext.getApplicationContext() != null)
      paramContext = paramContext.getApplicationContext(); 
    synchronized (h) {
      boolean bool;
      if (!j.containsKey("[DEFAULT]")) {
        bool = true;
      } else {
        bool = false;
      } 
      q.i(bool, "FirebaseApp name [DEFAULT] already exists!");
      q.g(paramContext, "Application context cannot be null.");
      b b1 = new b();
      this(paramContext, "[DEFAULT]", paramf);
      j.put("[DEFAULT]", b1);
      b1.f();
      return b1;
    } 
  }
  
  public final void a() {
    q.i(this.f.get() ^ true, "FirebaseApp was deleted");
  }
  
  public String e() {
    String str2;
    String str1;
    StringBuilder stringBuilder = new StringBuilder();
    a();
    byte[] arrayOfByte2 = this.b.getBytes(Charset.defaultCharset());
    byte[] arrayOfByte3 = null;
    if (arrayOfByte2 == null) {
      arrayOfByte2 = null;
    } else {
      str2 = Base64.encodeToString(arrayOfByte2, 11);
    } 
    stringBuilder.append(str2);
    stringBuilder.append("+");
    a();
    byte[] arrayOfByte1 = this.c.b.getBytes(Charset.defaultCharset());
    if (arrayOfByte1 == null) {
      arrayOfByte1 = arrayOfByte3;
    } else {
      str1 = Base64.encodeToString(arrayOfByte1, 11);
    } 
    stringBuilder.append(str1);
    return stringBuilder.toString();
  }
  
  public boolean equals(Object paramObject) {
    if (!(paramObject instanceof b))
      return false; 
    String str = this.b;
    paramObject = paramObject;
    paramObject.a();
    return str.equals(((b)paramObject).b);
  }
  
  public final void f() {
    // Byte code:
    //   0: aload_0
    //   1: getfield a : Landroid/content/Context;
    //   4: astore #4
    //   6: getstatic android/os/Build$VERSION.SDK_INT : I
    //   9: bipush #24
    //   11: if_icmplt -> 32
    //   14: aload #4
    //   16: ldc_w android/os/UserManager
    //   19: invokevirtual getSystemService : (Ljava/lang/Class;)Ljava/lang/Object;
    //   22: checkcast android/os/UserManager
    //   25: invokevirtual isUserUnlocked : ()Z
    //   28: istore_3
    //   29: goto -> 34
    //   32: iconst_1
    //   33: istore_3
    //   34: iload_3
    //   35: iconst_1
    //   36: ixor
    //   37: ifeq -> 99
    //   40: aload_0
    //   41: getfield a : Landroid/content/Context;
    //   44: astore #4
    //   46: getstatic c/c/b/b$e.b : Ljava/util/concurrent/atomic/AtomicReference;
    //   49: invokevirtual get : ()Ljava/lang/Object;
    //   52: ifnonnull -> 473
    //   55: new c/c/b/b$e
    //   58: dup
    //   59: aload #4
    //   61: invokespecial <init> : (Landroid/content/Context;)V
    //   64: astore #5
    //   66: getstatic c/c/b/b$e.b : Ljava/util/concurrent/atomic/AtomicReference;
    //   69: aconst_null
    //   70: aload #5
    //   72: invokevirtual compareAndSet : (Ljava/lang/Object;Ljava/lang/Object;)Z
    //   75: ifeq -> 473
    //   78: aload #4
    //   80: aload #5
    //   82: new android/content/IntentFilter
    //   85: dup
    //   86: ldc_w 'android.intent.action.USER_UNLOCKED'
    //   89: invokespecial <init> : (Ljava/lang/String;)V
    //   92: invokevirtual registerReceiver : (Landroid/content/BroadcastReceiver;Landroid/content/IntentFilter;)Landroid/content/Intent;
    //   95: pop
    //   96: goto -> 473
    //   99: aload_0
    //   100: getfield d : Lc/c/b/i/l;
    //   103: astore #4
    //   105: aload_0
    //   106: invokevirtual a : ()V
    //   109: ldc_w '[DEFAULT]'
    //   112: aload_0
    //   113: getfield b : Ljava/lang/String;
    //   116: invokevirtual equals : (Ljava/lang/Object;)Z
    //   119: istore_3
    //   120: aload #4
    //   122: getfield a : Ljava/util/Map;
    //   125: invokeinterface entrySet : ()Ljava/util/Set;
    //   130: invokeinterface iterator : ()Ljava/util/Iterator;
    //   135: astore #5
    //   137: aload #5
    //   139: invokeinterface hasNext : ()Z
    //   144: ifeq -> 237
    //   147: aload #5
    //   149: invokeinterface next : ()Ljava/lang/Object;
    //   154: checkcast java/util/Map$Entry
    //   157: astore #7
    //   159: aload #7
    //   161: invokeinterface getKey : ()Ljava/lang/Object;
    //   166: checkcast c/c/b/i/d
    //   169: astore #6
    //   171: aload #7
    //   173: invokeinterface getValue : ()Ljava/lang/Object;
    //   178: checkcast c/c/b/i/u
    //   181: astore #7
    //   183: aload #6
    //   185: getfield c : I
    //   188: istore_1
    //   189: iconst_0
    //   190: istore_2
    //   191: iload_1
    //   192: iconst_1
    //   193: if_icmpne -> 201
    //   196: iconst_1
    //   197: istore_1
    //   198: goto -> 203
    //   201: iconst_0
    //   202: istore_1
    //   203: iload_1
    //   204: ifne -> 228
    //   207: iload_2
    //   208: istore_1
    //   209: aload #6
    //   211: getfield c : I
    //   214: iconst_2
    //   215: if_icmpne -> 220
    //   218: iconst_1
    //   219: istore_1
    //   220: iload_1
    //   221: ifeq -> 137
    //   224: iload_3
    //   225: ifeq -> 137
    //   228: aload #7
    //   230: invokevirtual a : ()Ljava/lang/Object;
    //   233: pop
    //   234: goto -> 137
    //   237: aload #4
    //   239: getfield d : Lc/c/b/i/t;
    //   242: astore #5
    //   244: aload #5
    //   246: monitorenter
    //   247: aload #5
    //   249: getfield b : Ljava/util/Queue;
    //   252: ifnull -> 271
    //   255: aload #5
    //   257: getfield b : Ljava/util/Queue;
    //   260: astore #4
    //   262: aload #5
    //   264: aconst_null
    //   265: putfield b : Ljava/util/Queue;
    //   268: goto -> 274
    //   271: aconst_null
    //   272: astore #4
    //   274: aload #5
    //   276: monitorexit
    //   277: aload #4
    //   279: ifnull -> 473
    //   282: aload #4
    //   284: invokeinterface iterator : ()Ljava/util/Iterator;
    //   289: astore #7
    //   291: aload #7
    //   293: invokeinterface hasNext : ()Z
    //   298: ifeq -> 473
    //   301: aload #7
    //   303: invokeinterface next : ()Ljava/lang/Object;
    //   308: checkcast c/c/b/j/a
    //   311: astore #6
    //   313: aload #6
    //   315: ifnull -> 471
    //   318: aload #5
    //   320: monitorenter
    //   321: aload #5
    //   323: getfield b : Ljava/util/Queue;
    //   326: ifnull -> 348
    //   329: aload #5
    //   331: getfield b : Ljava/util/Queue;
    //   334: aload #6
    //   336: invokeinterface add : (Ljava/lang/Object;)Z
    //   341: pop
    //   342: aload #5
    //   344: monitorexit
    //   345: goto -> 291
    //   348: aload #5
    //   350: monitorexit
    //   351: aload #5
    //   353: monitorenter
    //   354: aload #5
    //   356: getfield a : Ljava/util/Map;
    //   359: aconst_null
    //   360: invokeinterface get : (Ljava/lang/Object;)Ljava/lang/Object;
    //   365: checkcast java/util/Map
    //   368: astore #4
    //   370: aload #4
    //   372: ifnonnull -> 383
    //   375: invokestatic emptySet : ()Ljava/util/Set;
    //   378: astore #4
    //   380: goto -> 392
    //   383: aload #4
    //   385: invokeinterface entrySet : ()Ljava/util/Set;
    //   390: astore #4
    //   392: aload #5
    //   394: monitorexit
    //   395: aload #4
    //   397: invokeinterface iterator : ()Ljava/util/Iterator;
    //   402: astore #8
    //   404: aload #8
    //   406: invokeinterface hasNext : ()Z
    //   411: ifeq -> 291
    //   414: aload #8
    //   416: invokeinterface next : ()Ljava/lang/Object;
    //   421: checkcast java/util/Map$Entry
    //   424: astore #4
    //   426: aload #4
    //   428: invokeinterface getValue : ()Ljava/lang/Object;
    //   433: checkcast java/util/concurrent/Executor
    //   436: new c/c/b/i/s
    //   439: dup
    //   440: aload #4
    //   442: aload #6
    //   444: invokespecial <init> : (Ljava/util/Map$Entry;Lc/c/b/j/a;)V
    //   447: invokeinterface execute : (Ljava/lang/Runnable;)V
    //   452: goto -> 404
    //   455: astore #4
    //   457: aload #5
    //   459: monitorexit
    //   460: aload #4
    //   462: athrow
    //   463: astore #4
    //   465: aload #5
    //   467: monitorexit
    //   468: aload #4
    //   470: athrow
    //   471: aconst_null
    //   472: athrow
    //   473: return
    //   474: astore #4
    //   476: aload #5
    //   478: monitorexit
    //   479: aload #4
    //   481: athrow
    // Exception table:
    //   from	to	target	type
    //   247	268	474	finally
    //   274	277	474	finally
    //   321	345	463	finally
    //   348	351	463	finally
    //   354	370	455	finally
    //   375	380	455	finally
    //   383	392	455	finally
    //   465	468	463	finally
    //   476	479	474	finally
  }
  
  public int hashCode() {
    return this.b.hashCode();
  }
  
  public String toString() {
    p p = a.a.a.a.a.B0(this);
    p.a("name", this.b);
    p.a("options", this.c);
    return p.toString();
  }
  
  public static interface b {
    void a(boolean param1Boolean);
  }
  
  @TargetApi(14)
  public static class c implements c.c.a.a.c.k.k.b.a {
    public static AtomicReference<c> a = new AtomicReference<c>();
    
    public static void b(Context param1Context) {
      if (param1Context.getApplicationContext() instanceof Application) {
        Application application = (Application)param1Context.getApplicationContext();
        if (a.get() == null) {
          c c1 = new c();
          if (a.compareAndSet(null, c1)) {
            c.c.a.a.c.k.k.b.b(application);
            c.c.a.a.c.k.k.b.f.a(c1);
          } 
        } 
      } 
    }
    
    public void a(boolean param1Boolean) {
      synchronized (b.h) {
        ArrayList arrayList = new ArrayList();
        this((Collection)b.j.values());
        for (b b : arrayList) {
          if (b.e.get()) {
            Log.d("FirebaseApp", "Notifying background state change listeners.");
            Iterator<b.b> iterator = b.g.iterator();
            while (iterator.hasNext())
              ((b.b)iterator.next()).a(param1Boolean); 
          } 
        } 
        return;
      } 
    }
  }
  
  public static class d implements Executor {
    public static final Handler a = new Handler(Looper.getMainLooper());
    
    public d(b.a param1a) {}
    
    public void execute(Runnable param1Runnable) {
      a.post(param1Runnable);
    }
  }
  
  @TargetApi(24)
  public static class e extends BroadcastReceiver {
    public static AtomicReference<e> b = new AtomicReference<e>();
    
    public final Context a;
    
    public e(Context param1Context) {
      this.a = param1Context;
    }
    
    public void onReceive(Context param1Context, Intent param1Intent) {
      synchronized (b.h) {
        Iterator<b> iterator = b.j.values().iterator();
        while (iterator.hasNext())
          ((b)iterator.next()).f(); 
        this.a.unregisterReceiver(this);
        return;
      } 
    }
  }
}


/* Location:              C:\Users\panch\Downloads\dvba_v1.1.0-dex2jar.jar!\c\c\b\b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */