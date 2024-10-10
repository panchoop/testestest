package c.a.b.w;

import c.a.b.f;
import c.a.b.h;
import c.a.b.i;
import c.a.b.l;
import c.a.b.o;
import c.a.b.u;
import c.a.b.v;
import java.io.InputStream;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.TimeZone;
import java.util.TreeSet;

public class b implements i {
  public static final boolean c = v.a;
  
  public final a a;
  
  public final c b;
  
  public b(a parama) {
    this.a = parama;
    this.b = c1;
  }
  
  public static void a(String paramString, o<?> paramo, u paramu) {
    f f = paramo.n;
    int j = f.a;
    try {
      int k = f.b + 1;
      f.b = k;
      f.a = (int)(j * f.d) + j;
      int m = f.c;
      if (k <= m) {
        k = 1;
      } else {
        k = 0;
      } 
      if (k != 0) {
        paramo.a(String.format("%s-retry [timeout=%s]", new Object[] { paramString, Integer.valueOf(j) }));
        return;
      } 
      throw paramu;
    } catch (u u1) {
      paramo.a(String.format("%s-timeout-giveup [timeout=%s]", new Object[] { paramString, Integer.valueOf(j) }));
      throw u1;
    } 
  }
  
  public static List<h> b(List<h> paramList, c.a.b.b.a parama) {
    TreeSet<String> treeSet = new TreeSet<String>(String.CASE_INSENSITIVE_ORDER);
    if (!paramList.isEmpty()) {
      Iterator<h> iterator = paramList.iterator();
      while (iterator.hasNext())
        treeSet.add(((h)iterator.next()).a); 
    } 
    paramList = new ArrayList<h>(paramList);
    List list = parama.h;
    if (list != null) {
      if (!list.isEmpty())
        for (h h : parama.h) {
          if (!treeSet.contains(h.a))
            paramList.add(h); 
        }  
    } else if (!parama.g.isEmpty()) {
      for (Map.Entry entry : parama.g.entrySet()) {
        if (!treeSet.contains(entry.getKey()))
          paramList.add(new h((String)entry.getKey(), (String)entry.getValue())); 
      } 
    } 
    return paramList;
  }
  
  public final Map<String, String> c(c.a.b.b.a parama) {
    if (parama == null)
      return Collections.emptyMap(); 
    HashMap<Object, Object> hashMap = new HashMap<Object, Object>();
    String str = parama.b;
    if (str != null)
      hashMap.put("If-None-Match", str); 
    long l = parama.d;
    if (l > 0L) {
      SimpleDateFormat simpleDateFormat = new SimpleDateFormat("EEE, dd MMM yyyy HH:mm:ss zzz", Locale.US);
      simpleDateFormat.setTimeZone(TimeZone.getTimeZone("GMT"));
      hashMap.put("If-Modified-Since", simpleDateFormat.format(new Date(l)));
    } 
    return (Map)hashMap;
  }
  
  public final byte[] d(InputStream paramInputStream, int paramInt) {
    // Byte code:
    //   0: new c/a/b/w/i
    //   3: dup
    //   4: aload_0
    //   5: getfield b : Lc/a/b/w/c;
    //   8: iload_2
    //   9: invokespecial <init> : (Lc/a/b/w/c;I)V
    //   12: astore #5
    //   14: aconst_null
    //   15: astore_3
    //   16: aload_0
    //   17: getfield b : Lc/a/b/w/c;
    //   20: sipush #1024
    //   23: invokevirtual a : (I)[B
    //   26: astore #4
    //   28: aload #4
    //   30: astore_3
    //   31: aload_1
    //   32: aload #4
    //   34: invokevirtual read : ([B)I
    //   37: istore_2
    //   38: iload_2
    //   39: iconst_m1
    //   40: if_icmpeq -> 58
    //   43: aload #4
    //   45: astore_3
    //   46: aload #5
    //   48: aload #4
    //   50: iconst_0
    //   51: iload_2
    //   52: invokevirtual write : ([BII)V
    //   55: goto -> 28
    //   58: aload #4
    //   60: astore_3
    //   61: aload #5
    //   63: invokevirtual toByteArray : ()[B
    //   66: astore #6
    //   68: aload_1
    //   69: invokevirtual close : ()V
    //   72: goto -> 85
    //   75: astore_1
    //   76: ldc 'Error occurred when closing InputStream'
    //   78: iconst_0
    //   79: anewarray java/lang/Object
    //   82: invokestatic d : (Ljava/lang/String;[Ljava/lang/Object;)V
    //   85: aload_0
    //   86: getfield b : Lc/a/b/w/c;
    //   89: aload #4
    //   91: invokevirtual b : ([B)V
    //   94: aload #5
    //   96: invokevirtual close : ()V
    //   99: aload #6
    //   101: areturn
    //   102: astore #4
    //   104: aload_1
    //   105: invokevirtual close : ()V
    //   108: goto -> 121
    //   111: astore_1
    //   112: ldc 'Error occurred when closing InputStream'
    //   114: iconst_0
    //   115: anewarray java/lang/Object
    //   118: invokestatic d : (Ljava/lang/String;[Ljava/lang/Object;)V
    //   121: aload_0
    //   122: getfield b : Lc/a/b/w/c;
    //   125: aload_3
    //   126: invokevirtual b : ([B)V
    //   129: aload #5
    //   131: invokevirtual close : ()V
    //   134: aload #4
    //   136: athrow
    // Exception table:
    //   from	to	target	type
    //   16	28	102	finally
    //   31	38	102	finally
    //   46	55	102	finally
    //   61	68	102	finally
    //   68	72	75	java/io/IOException
    //   104	108	111	java/io/IOException
  }
  
  public final void e(long paramLong, o<?> paramo, byte[] paramArrayOfbyte, int paramInt) {
    if (c || paramLong > 3000L) {
      String str;
      if (paramArrayOfbyte != null) {
        Integer integer = Integer.valueOf(paramArrayOfbyte.length);
      } else {
        str = "null";
      } 
      v.b("HTTP response for request=<%s> [lifetime=%d], [size=%s], [rc=%d], [retryCount=%s]", new Object[] { paramo, Long.valueOf(paramLong), str, Integer.valueOf(paramInt), Integer.valueOf(paramo.n.b) });
    } 
  }
  
  public l f(o<?> paramo) {
    // Byte code:
    //   0: invokestatic elapsedRealtime : ()J
    //   3: lstore_3
    //   4: invokestatic emptyList : ()Ljava/util/List;
    //   7: astore #9
    //   9: aconst_null
    //   10: astore #8
    //   12: aload_0
    //   13: aload_1
    //   14: getfield o : Lc/a/b/b$a;
    //   17: invokevirtual c : (Lc/a/b/b$a;)Ljava/util/Map;
    //   20: astore #7
    //   22: aload_0
    //   23: getfield a : Lc/a/b/w/a;
    //   26: aload_1
    //   27: aload #7
    //   29: invokevirtual a : (Lc/a/b/o;Ljava/util/Map;)Lc/a/b/w/e;
    //   32: astore #7
    //   34: aload #7
    //   36: getfield a : I
    //   39: istore_2
    //   40: aload #7
    //   42: getfield b : Ljava/util/List;
    //   45: invokestatic unmodifiableList : (Ljava/util/List;)Ljava/util/List;
    //   48: astore #8
    //   50: iload_2
    //   51: sipush #304
    //   54: if_icmpne -> 130
    //   57: aload_1
    //   58: getfield o : Lc/a/b/b$a;
    //   61: astore #9
    //   63: aload #9
    //   65: ifnonnull -> 88
    //   68: new c/a/b/l
    //   71: dup
    //   72: sipush #304
    //   75: aconst_null
    //   76: iconst_1
    //   77: invokestatic elapsedRealtime : ()J
    //   80: lload_3
    //   81: lsub
    //   82: aload #8
    //   84: invokespecial <init> : (I[BZJLjava/util/List;)V
    //   87: areturn
    //   88: aload #8
    //   90: aload #9
    //   92: invokestatic b : (Ljava/util/List;Lc/a/b/b$a;)Ljava/util/List;
    //   95: astore #10
    //   97: new c/a/b/l
    //   100: dup
    //   101: sipush #304
    //   104: aload #9
    //   106: getfield a : [B
    //   109: iconst_1
    //   110: invokestatic elapsedRealtime : ()J
    //   113: lload_3
    //   114: lsub
    //   115: aload #10
    //   117: invokespecial <init> : (I[BZJLjava/util/List;)V
    //   120: astore #9
    //   122: aload #9
    //   124: areturn
    //   125: astore #11
    //   127: goto -> 158
    //   130: aload #7
    //   132: getfield d : Ljava/io/InputStream;
    //   135: astore #9
    //   137: aload #9
    //   139: ifnull -> 184
    //   142: aload_0
    //   143: aload #9
    //   145: aload #7
    //   147: getfield c : I
    //   150: invokevirtual d : (Ljava/io/InputStream;I)[B
    //   153: astore #9
    //   155: goto -> 189
    //   158: aconst_null
    //   159: astore #12
    //   161: aload #7
    //   163: astore #9
    //   165: aload #8
    //   167: astore #10
    //   169: aload #11
    //   171: astore #7
    //   173: aload #9
    //   175: astore #8
    //   177: aload #12
    //   179: astore #9
    //   181: goto -> 332
    //   184: iconst_0
    //   185: newarray byte
    //   187: astore #9
    //   189: aload_0
    //   190: invokestatic elapsedRealtime : ()J
    //   193: lload_3
    //   194: lsub
    //   195: aload_1
    //   196: aload #9
    //   198: iload_2
    //   199: invokevirtual e : (JLc/a/b/o;[BI)V
    //   202: iload_2
    //   203: sipush #200
    //   206: if_icmplt -> 239
    //   209: iload_2
    //   210: sipush #299
    //   213: if_icmpgt -> 239
    //   216: invokestatic elapsedRealtime : ()J
    //   219: lstore #5
    //   221: new c/a/b/l
    //   224: dup
    //   225: iload_2
    //   226: aload #9
    //   228: iconst_0
    //   229: lload #5
    //   231: lload_3
    //   232: lsub
    //   233: aload #8
    //   235: invokespecial <init> : (I[BZJLjava/util/List;)V
    //   238: areturn
    //   239: new java/io/IOException
    //   242: astore #10
    //   244: aload #10
    //   246: invokespecial <init> : ()V
    //   249: aload #10
    //   251: athrow
    //   252: astore #10
    //   254: goto -> 259
    //   257: astore #10
    //   259: aload #8
    //   261: astore #11
    //   263: aload #7
    //   265: astore #8
    //   267: aload #10
    //   269: astore #7
    //   271: aload #11
    //   273: astore #10
    //   275: goto -> 332
    //   278: astore #10
    //   280: aload #8
    //   282: astore #9
    //   284: aload #10
    //   286: astore #8
    //   288: goto -> 293
    //   291: astore #8
    //   293: aload #9
    //   295: astore #10
    //   297: aconst_null
    //   298: astore #11
    //   300: aload #7
    //   302: astore #9
    //   304: aload #8
    //   306: astore #7
    //   308: aload #9
    //   310: astore #8
    //   312: aload #11
    //   314: astore #9
    //   316: goto -> 332
    //   319: astore #7
    //   321: aconst_null
    //   322: astore #11
    //   324: aload #9
    //   326: astore #10
    //   328: aload #11
    //   330: astore #9
    //   332: aload #8
    //   334: ifnull -> 532
    //   337: aload #8
    //   339: getfield a : I
    //   342: istore_2
    //   343: ldc_w 'Unexpected response code %d for %s'
    //   346: iconst_2
    //   347: anewarray java/lang/Object
    //   350: dup
    //   351: iconst_0
    //   352: iload_2
    //   353: invokestatic valueOf : (I)Ljava/lang/Integer;
    //   356: aastore
    //   357: dup
    //   358: iconst_1
    //   359: aload_1
    //   360: getfield d : Ljava/lang/String;
    //   363: aastore
    //   364: invokestatic c : (Ljava/lang/String;[Ljava/lang/Object;)V
    //   367: aload #9
    //   369: ifnull -> 515
    //   372: new c/a/b/l
    //   375: dup
    //   376: iload_2
    //   377: aload #9
    //   379: iconst_0
    //   380: invokestatic elapsedRealtime : ()J
    //   383: lload_3
    //   384: lsub
    //   385: aload #10
    //   387: invokespecial <init> : (I[BZJLjava/util/List;)V
    //   390: astore #7
    //   392: iload_2
    //   393: sipush #401
    //   396: if_icmpeq -> 496
    //   399: iload_2
    //   400: sipush #403
    //   403: if_icmpne -> 409
    //   406: goto -> 496
    //   409: iload_2
    //   410: sipush #400
    //   413: if_icmplt -> 436
    //   416: iload_2
    //   417: sipush #499
    //   420: if_icmple -> 426
    //   423: goto -> 436
    //   426: new c/a/b/e
    //   429: dup
    //   430: aload #7
    //   432: invokespecial <init> : (Lc/a/b/l;)V
    //   435: athrow
    //   436: iload_2
    //   437: sipush #500
    //   440: if_icmplt -> 486
    //   443: iload_2
    //   444: sipush #599
    //   447: if_icmpgt -> 486
    //   450: aload_1
    //   451: getfield m : Z
    //   454: ifeq -> 476
    //   457: new c/a/b/s
    //   460: dup
    //   461: aload #7
    //   463: invokespecial <init> : (Lc/a/b/l;)V
    //   466: astore #7
    //   468: ldc_w 'server'
    //   471: astore #8
    //   473: goto -> 593
    //   476: new c/a/b/s
    //   479: dup
    //   480: aload #7
    //   482: invokespecial <init> : (Lc/a/b/l;)V
    //   485: athrow
    //   486: new c/a/b/s
    //   489: dup
    //   490: aload #7
    //   492: invokespecial <init> : (Lc/a/b/l;)V
    //   495: athrow
    //   496: new c/a/b/a
    //   499: dup
    //   500: aload #7
    //   502: invokespecial <init> : (Lc/a/b/l;)V
    //   505: astore #7
    //   507: ldc_w 'auth'
    //   510: astore #8
    //   512: goto -> 593
    //   515: new c/a/b/k
    //   518: dup
    //   519: invokespecial <init> : ()V
    //   522: astore #7
    //   524: ldc_w 'network'
    //   527: astore #8
    //   529: goto -> 593
    //   532: new c/a/b/m
    //   535: dup
    //   536: aload #7
    //   538: invokespecial <init> : (Ljava/lang/Throwable;)V
    //   541: athrow
    //   542: astore #7
    //   544: ldc_w 'Bad URL '
    //   547: invokestatic e : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   550: astore #8
    //   552: aload #8
    //   554: aload_1
    //   555: getfield d : Ljava/lang/String;
    //   558: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   561: pop
    //   562: new java/lang/RuntimeException
    //   565: dup
    //   566: aload #8
    //   568: invokevirtual toString : ()Ljava/lang/String;
    //   571: aload #7
    //   573: invokespecial <init> : (Ljava/lang/String;Ljava/lang/Throwable;)V
    //   576: athrow
    //   577: astore #7
    //   579: new c/a/b/t
    //   582: dup
    //   583: invokespecial <init> : ()V
    //   586: astore #7
    //   588: ldc_w 'socket'
    //   591: astore #8
    //   593: aload #8
    //   595: aload_1
    //   596: aload #7
    //   598: invokestatic a : (Ljava/lang/String;Lc/a/b/o;Lc/a/b/u;)V
    //   601: goto -> 4
    // Exception table:
    //   from	to	target	type
    //   12	34	577	java/net/SocketTimeoutException
    //   12	34	542	java/net/MalformedURLException
    //   12	34	319	java/io/IOException
    //   34	50	577	java/net/SocketTimeoutException
    //   34	50	542	java/net/MalformedURLException
    //   34	50	291	java/io/IOException
    //   57	63	577	java/net/SocketTimeoutException
    //   57	63	542	java/net/MalformedURLException
    //   57	63	125	java/io/IOException
    //   68	88	577	java/net/SocketTimeoutException
    //   68	88	542	java/net/MalformedURLException
    //   68	88	125	java/io/IOException
    //   88	122	577	java/net/SocketTimeoutException
    //   88	122	542	java/net/MalformedURLException
    //   88	122	125	java/io/IOException
    //   130	137	577	java/net/SocketTimeoutException
    //   130	137	542	java/net/MalformedURLException
    //   130	137	278	java/io/IOException
    //   142	155	577	java/net/SocketTimeoutException
    //   142	155	542	java/net/MalformedURLException
    //   142	155	125	java/io/IOException
    //   184	189	577	java/net/SocketTimeoutException
    //   184	189	542	java/net/MalformedURLException
    //   184	189	278	java/io/IOException
    //   189	202	577	java/net/SocketTimeoutException
    //   189	202	542	java/net/MalformedURLException
    //   189	202	257	java/io/IOException
    //   216	221	577	java/net/SocketTimeoutException
    //   216	221	542	java/net/MalformedURLException
    //   216	221	257	java/io/IOException
    //   221	239	577	java/net/SocketTimeoutException
    //   221	239	542	java/net/MalformedURLException
    //   221	239	252	java/io/IOException
    //   239	252	577	java/net/SocketTimeoutException
    //   239	252	542	java/net/MalformedURLException
    //   239	252	252	java/io/IOException
  }
}


/* Location:              C:\Users\panch\Downloads\dvba_v1.1.0-dex2jar.jar!\c\a\b\w\b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */