package c.a.b;

import android.os.Process;
import c.a.b.w.d;
import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.BlockingQueue;

public class d extends Thread {
  public static final boolean h = v.a;
  
  public final BlockingQueue<o<?>> b;
  
  public final BlockingQueue<o<?>> c;
  
  public final b d;
  
  public final r e;
  
  public volatile boolean f = false;
  
  public final a g;
  
  public d(BlockingQueue<o<?>> paramBlockingQueue1, BlockingQueue<o<?>> paramBlockingQueue2, b paramb, r paramr) {
    this.b = paramBlockingQueue1;
    this.c = paramBlockingQueue2;
    this.d = paramb;
    this.e = paramr;
    this.g = new a(this);
  }
  
  public final void a() {
    // Byte code:
    //   0: aload_0
    //   1: getfield b : Ljava/util/concurrent/BlockingQueue;
    //   4: invokeinterface take : ()Ljava/lang/Object;
    //   9: checkcast c/a/b/o
    //   12: astore #6
    //   14: aload #6
    //   16: ldc 'cache-queue-take'
    //   18: invokevirtual a : (Ljava/lang/String;)V
    //   21: aload #6
    //   23: invokevirtual i : ()Z
    //   26: ifeq -> 39
    //   29: aload #6
    //   31: ldc 'cache-discard-canceled'
    //   33: invokevirtual c : (Ljava/lang/String;)V
    //   36: goto -> 671
    //   39: aload_0
    //   40: getfield d : Lc/a/b/b;
    //   43: astore_3
    //   44: aload #6
    //   46: invokevirtual f : ()Ljava/lang/String;
    //   49: astore #5
    //   51: aload_3
    //   52: checkcast c/a/b/w/d
    //   55: astore_3
    //   56: aload_3
    //   57: monitorenter
    //   58: aload_3
    //   59: getfield a : Ljava/util/Map;
    //   62: aload #5
    //   64: invokeinterface get : (Ljava/lang/Object;)Ljava/lang/Object;
    //   69: checkcast c/a/b/w/d$a
    //   72: astore #4
    //   74: iconst_0
    //   75: istore_2
    //   76: aload #4
    //   78: ifnonnull -> 84
    //   81: goto -> 302
    //   84: aload_3
    //   85: aload #5
    //   87: invokevirtual b : (Ljava/lang/String;)Ljava/io/File;
    //   90: astore #7
    //   92: new c/a/b/w/d$b
    //   95: astore #8
    //   97: new java/io/BufferedInputStream
    //   100: astore #9
    //   102: new java/io/FileInputStream
    //   105: astore #10
    //   107: aload #10
    //   109: aload #7
    //   111: invokespecial <init> : (Ljava/io/File;)V
    //   114: aload #9
    //   116: aload #10
    //   118: invokespecial <init> : (Ljava/io/InputStream;)V
    //   121: aload #8
    //   123: aload #9
    //   125: aload #7
    //   127: invokevirtual length : ()J
    //   130: invokespecial <init> : (Ljava/io/InputStream;J)V
    //   133: aload #8
    //   135: invokestatic a : (Lc/a/b/w/d$b;)Lc/a/b/w/d$a;
    //   138: astore #9
    //   140: aload #5
    //   142: aload #9
    //   144: getfield b : Ljava/lang/String;
    //   147: invokestatic equals : (Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Z
    //   150: ifne -> 226
    //   153: ldc '%s: key=%s, found=%s'
    //   155: iconst_3
    //   156: anewarray java/lang/Object
    //   159: dup
    //   160: iconst_0
    //   161: aload #7
    //   163: invokevirtual getAbsolutePath : ()Ljava/lang/String;
    //   166: aastore
    //   167: dup
    //   168: iconst_1
    //   169: aload #5
    //   171: aastore
    //   172: dup
    //   173: iconst_2
    //   174: aload #9
    //   176: getfield b : Ljava/lang/String;
    //   179: aastore
    //   180: invokestatic b : (Ljava/lang/String;[Ljava/lang/Object;)V
    //   183: aload_3
    //   184: getfield a : Ljava/util/Map;
    //   187: aload #5
    //   189: invokeinterface remove : (Ljava/lang/Object;)Ljava/lang/Object;
    //   194: checkcast c/a/b/w/d$a
    //   197: astore #4
    //   199: aload #4
    //   201: ifnull -> 218
    //   204: aload_3
    //   205: aload_3
    //   206: getfield b : J
    //   209: aload #4
    //   211: getfield a : J
    //   214: lsub
    //   215: putfield b : J
    //   218: aload #8
    //   220: invokevirtual close : ()V
    //   223: goto -> 302
    //   226: aload #4
    //   228: aload #8
    //   230: aload #8
    //   232: getfield b : J
    //   235: aload #8
    //   237: getfield c : J
    //   240: lsub
    //   241: invokestatic l : (Lc/a/b/w/d$b;J)[B
    //   244: invokevirtual b : ([B)Lc/a/b/b$a;
    //   247: astore #4
    //   249: aload #8
    //   251: invokevirtual close : ()V
    //   254: aload_3
    //   255: monitorexit
    //   256: goto -> 307
    //   259: astore #4
    //   261: aload #8
    //   263: invokevirtual close : ()V
    //   266: aload #4
    //   268: athrow
    //   269: astore #4
    //   271: ldc '%s: %s'
    //   273: iconst_2
    //   274: anewarray java/lang/Object
    //   277: dup
    //   278: iconst_0
    //   279: aload #7
    //   281: invokevirtual getAbsolutePath : ()Ljava/lang/String;
    //   284: aastore
    //   285: dup
    //   286: iconst_1
    //   287: aload #4
    //   289: invokevirtual toString : ()Ljava/lang/String;
    //   292: aastore
    //   293: invokestatic b : (Ljava/lang/String;[Ljava/lang/Object;)V
    //   296: aload_3
    //   297: aload #5
    //   299: invokevirtual k : (Ljava/lang/String;)V
    //   302: aload_3
    //   303: monitorexit
    //   304: aconst_null
    //   305: astore #4
    //   307: aload #4
    //   309: ifnonnull -> 345
    //   312: aload #6
    //   314: ldc 'cache-miss'
    //   316: invokevirtual a : (Ljava/lang/String;)V
    //   319: aload_0
    //   320: getfield g : Lc/a/b/d$a;
    //   323: aload #6
    //   325: invokestatic a : (Lc/a/b/d$a;Lc/a/b/o;)Z
    //   328: ifne -> 671
    //   331: aload_0
    //   332: getfield c : Ljava/util/concurrent/BlockingQueue;
    //   335: aload #6
    //   337: invokeinterface put : (Ljava/lang/Object;)V
    //   342: goto -> 671
    //   345: aload #4
    //   347: getfield e : J
    //   350: invokestatic currentTimeMillis : ()J
    //   353: lcmp
    //   354: ifge -> 362
    //   357: iconst_1
    //   358: istore_1
    //   359: goto -> 364
    //   362: iconst_0
    //   363: istore_1
    //   364: iload_1
    //   365: ifeq -> 397
    //   368: aload #6
    //   370: ldc 'cache-hit-expired'
    //   372: invokevirtual a : (Ljava/lang/String;)V
    //   375: aload #6
    //   377: aload #4
    //   379: putfield o : Lc/a/b/b$a;
    //   382: aload_0
    //   383: getfield g : Lc/a/b/d$a;
    //   386: aload #6
    //   388: invokestatic a : (Lc/a/b/d$a;Lc/a/b/o;)Z
    //   391: ifne -> 671
    //   394: goto -> 331
    //   397: aload #6
    //   399: ldc 'cache-hit'
    //   401: invokevirtual a : (Ljava/lang/String;)V
    //   404: aload #4
    //   406: getfield a : [B
    //   409: astore #7
    //   411: aload #4
    //   413: getfield g : Ljava/util/Map;
    //   416: astore #8
    //   418: aload #8
    //   420: ifnonnull -> 428
    //   423: aconst_null
    //   424: astore_3
    //   425: goto -> 533
    //   428: aload #8
    //   430: invokeinterface isEmpty : ()Z
    //   435: ifeq -> 445
    //   438: invokestatic emptyList : ()Ljava/util/List;
    //   441: astore_3
    //   442: goto -> 533
    //   445: new java/util/ArrayList
    //   448: dup
    //   449: aload #8
    //   451: invokeinterface size : ()I
    //   456: invokespecial <init> : (I)V
    //   459: astore #5
    //   461: aload #8
    //   463: invokeinterface entrySet : ()Ljava/util/Set;
    //   468: invokeinterface iterator : ()Ljava/util/Iterator;
    //   473: astore #9
    //   475: aload #5
    //   477: astore_3
    //   478: aload #9
    //   480: invokeinterface hasNext : ()Z
    //   485: ifeq -> 533
    //   488: aload #9
    //   490: invokeinterface next : ()Ljava/lang/Object;
    //   495: checkcast java/util/Map$Entry
    //   498: astore_3
    //   499: aload #5
    //   501: new c/a/b/h
    //   504: dup
    //   505: aload_3
    //   506: invokeinterface getKey : ()Ljava/lang/Object;
    //   511: checkcast java/lang/String
    //   514: aload_3
    //   515: invokeinterface getValue : ()Ljava/lang/Object;
    //   520: checkcast java/lang/String
    //   523: invokespecial <init> : (Ljava/lang/String;Ljava/lang/String;)V
    //   526: invokevirtual add : (Ljava/lang/Object;)Z
    //   529: pop
    //   530: goto -> 475
    //   533: aload #6
    //   535: new c/a/b/l
    //   538: dup
    //   539: sipush #200
    //   542: aload #7
    //   544: aload #8
    //   546: aload_3
    //   547: iconst_0
    //   548: lconst_0
    //   549: invokespecial <init> : (I[BLjava/util/Map;Ljava/util/List;ZJ)V
    //   552: invokevirtual l : (Lc/a/b/l;)Lc/a/b/q;
    //   555: astore_3
    //   556: aload #6
    //   558: ldc_w 'cache-hit-parsed'
    //   561: invokevirtual a : (Ljava/lang/String;)V
    //   564: iload_2
    //   565: istore_1
    //   566: aload #4
    //   568: getfield f : J
    //   571: invokestatic currentTimeMillis : ()J
    //   574: lcmp
    //   575: ifge -> 580
    //   578: iconst_1
    //   579: istore_1
    //   580: iload_1
    //   581: ifne -> 593
    //   584: aload_0
    //   585: getfield e : Lc/a/b/r;
    //   588: astore #4
    //   590: goto -> 659
    //   593: aload #6
    //   595: ldc_w 'cache-hit-refresh-needed'
    //   598: invokevirtual a : (Ljava/lang/String;)V
    //   601: aload #6
    //   603: aload #4
    //   605: putfield o : Lc/a/b/b$a;
    //   608: aload_3
    //   609: iconst_1
    //   610: putfield d : Z
    //   613: aload_0
    //   614: getfield g : Lc/a/b/d$a;
    //   617: aload #6
    //   619: invokestatic a : (Lc/a/b/d$a;Lc/a/b/o;)Z
    //   622: ifne -> 584
    //   625: aload_0
    //   626: getfield e : Lc/a/b/r;
    //   629: astore #4
    //   631: new c/a/b/c
    //   634: dup
    //   635: aload_0
    //   636: aload #6
    //   638: invokespecial <init> : (Lc/a/b/d;Lc/a/b/o;)V
    //   641: astore #5
    //   643: aload #4
    //   645: checkcast c/a/b/g
    //   648: aload #6
    //   650: aload_3
    //   651: aload #5
    //   653: invokevirtual a : (Lc/a/b/o;Lc/a/b/q;Ljava/lang/Runnable;)V
    //   656: goto -> 671
    //   659: aload #4
    //   661: checkcast c/a/b/g
    //   664: aload #6
    //   666: aload_3
    //   667: aconst_null
    //   668: invokevirtual a : (Lc/a/b/o;Lc/a/b/q;Ljava/lang/Runnable;)V
    //   671: return
    //   672: astore #4
    //   674: aload_3
    //   675: monitorexit
    //   676: aload #4
    //   678: athrow
    // Exception table:
    //   from	to	target	type
    //   58	74	672	finally
    //   84	92	672	finally
    //   92	133	269	java/io/IOException
    //   92	133	672	finally
    //   133	199	259	finally
    //   204	218	259	finally
    //   218	223	269	java/io/IOException
    //   218	223	672	finally
    //   226	249	259	finally
    //   249	254	269	java/io/IOException
    //   249	254	672	finally
    //   261	269	269	java/io/IOException
    //   261	269	672	finally
    //   271	302	672	finally
  }
  
  public void run() {
    d d1;
    if (h)
      v.d("start new dispatcher", new Object[0]); 
    Process.setThreadPriority(10);
    synchronized ((d)this.d) {
      if (!d1.c.exists()) {
        if (!d1.c.mkdirs())
          v.c("Unable to create cache dir %s", new Object[] { d1.c.getAbsolutePath() }); 
      } else {
        File[] arrayOfFile = d1.c.listFiles();
        if (arrayOfFile != null) {
          int i = arrayOfFile.length;
          byte b1 = 0;
          while (true) {
            if (b1 < i) {
              File file = arrayOfFile[b1];
              try {
                long l = file.length();
                d.b b2 = new d.b();
                BufferedInputStream bufferedInputStream = new BufferedInputStream();
                null = new FileInputStream();
                this(file);
                this(null);
                this(bufferedInputStream, l);
                try {
                  d.a a1 = d.a.a(b2);
                  a1.a = l;
                  d1.f(a1.b, a1);
                } finally {
                  b2.close();
                } 
              } catch (IOException iOException) {
                file.delete();
              } 
              b1++;
              continue;
            } 
          } 
          while (true) {
            try {
              while (true)
                a(); 
              break;
            } catch (InterruptedException interruptedException) {
              if (this.f) {
                Thread.currentThread().interrupt();
                return;
              } 
              v.c("Ignoring spurious interrupt of CacheDispatcher thread; use quit() to terminate it", new Object[0]);
            } 
          } 
        } 
      } 
      /* monitor exit ClassFileLocalVariableReferenceExpression{type=ObjectType{java/lang/InterruptedException}, name=null} */
    } 
    break;
  }
  
  public static class a implements o.b {
    public final Map<String, List<o<?>>> a = new HashMap<String, List<o<?>>>();
    
    public final d b;
    
    public a(d param1d) {
      this.b = param1d;
    }
    
    public static boolean a(a param1a, o param1o) {
      // Byte code:
      //   0: aload_0
      //   1: monitorenter
      //   2: aload_1
      //   3: invokevirtual f : ()Ljava/lang/String;
      //   6: astore #6
      //   8: aload_0
      //   9: getfield a : Ljava/util/Map;
      //   12: aload #6
      //   14: invokeinterface containsKey : (Ljava/lang/Object;)Z
      //   19: istore_3
      //   20: iconst_1
      //   21: istore_2
      //   22: iload_3
      //   23: ifeq -> 115
      //   26: aload_0
      //   27: getfield a : Ljava/util/Map;
      //   30: aload #6
      //   32: invokeinterface get : (Ljava/lang/Object;)Ljava/lang/Object;
      //   37: checkcast java/util/List
      //   40: astore #5
      //   42: aload #5
      //   44: astore #4
      //   46: aload #5
      //   48: ifnonnull -> 61
      //   51: new java/util/ArrayList
      //   54: astore #4
      //   56: aload #4
      //   58: invokespecial <init> : ()V
      //   61: aload_1
      //   62: ldc 'waiting-for-response'
      //   64: invokevirtual a : (Ljava/lang/String;)V
      //   67: aload #4
      //   69: aload_1
      //   70: invokeinterface add : (Ljava/lang/Object;)Z
      //   75: pop
      //   76: aload_0
      //   77: getfield a : Ljava/util/Map;
      //   80: aload #6
      //   82: aload #4
      //   84: invokeinterface put : (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
      //   89: pop
      //   90: getstatic c/a/b/v.a : Z
      //   93: ifeq -> 110
      //   96: ldc 'Request for cacheKey=%s is in flight, putting on hold.'
      //   98: iconst_1
      //   99: anewarray java/lang/Object
      //   102: dup
      //   103: iconst_0
      //   104: aload #6
      //   106: aastore
      //   107: invokestatic b : (Ljava/lang/String;[Ljava/lang/Object;)V
      //   110: aload_0
      //   111: monitorexit
      //   112: goto -> 169
      //   115: aload_0
      //   116: getfield a : Ljava/util/Map;
      //   119: aload #6
      //   121: aconst_null
      //   122: invokeinterface put : (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
      //   127: pop
      //   128: aload_1
      //   129: getfield f : Ljava/lang/Object;
      //   132: astore #4
      //   134: aload #4
      //   136: monitorenter
      //   137: aload_1
      //   138: aload_0
      //   139: putfield p : Lc/a/b/o$b;
      //   142: aload #4
      //   144: monitorexit
      //   145: getstatic c/a/b/v.a : Z
      //   148: ifeq -> 165
      //   151: ldc 'new request, sending to network %s'
      //   153: iconst_1
      //   154: anewarray java/lang/Object
      //   157: dup
      //   158: iconst_0
      //   159: aload #6
      //   161: aastore
      //   162: invokestatic b : (Ljava/lang/String;[Ljava/lang/Object;)V
      //   165: aload_0
      //   166: monitorexit
      //   167: iconst_0
      //   168: istore_2
      //   169: iload_2
      //   170: ireturn
      //   171: astore_1
      //   172: aload #4
      //   174: monitorexit
      //   175: aload_1
      //   176: athrow
      //   177: astore_1
      //   178: aload_0
      //   179: monitorexit
      //   180: aload_1
      //   181: athrow
      // Exception table:
      //   from	to	target	type
      //   2	20	177	finally
      //   26	42	177	finally
      //   51	61	177	finally
      //   61	110	177	finally
      //   115	137	177	finally
      //   137	145	171	finally
      //   145	165	177	finally
      //   172	175	171	finally
      //   175	177	177	finally
    }
    
    public void b(o<?> param1o) {
      // Byte code:
      //   0: aload_0
      //   1: monitorenter
      //   2: aload_1
      //   3: invokevirtual f : ()Ljava/lang/String;
      //   6: astore_3
      //   7: aload_0
      //   8: getfield a : Ljava/util/Map;
      //   11: aload_3
      //   12: invokeinterface remove : (Ljava/lang/Object;)Ljava/lang/Object;
      //   17: checkcast java/util/List
      //   20: astore_2
      //   21: aload_2
      //   22: ifnull -> 163
      //   25: aload_2
      //   26: invokeinterface isEmpty : ()Z
      //   31: ifne -> 163
      //   34: getstatic c/a/b/v.a : Z
      //   37: ifeq -> 65
      //   40: ldc '%d waiting requests for cacheKey=%s; resend to network'
      //   42: iconst_2
      //   43: anewarray java/lang/Object
      //   46: dup
      //   47: iconst_0
      //   48: aload_2
      //   49: invokeinterface size : ()I
      //   54: invokestatic valueOf : (I)Ljava/lang/Integer;
      //   57: aastore
      //   58: dup
      //   59: iconst_1
      //   60: aload_3
      //   61: aastore
      //   62: invokestatic d : (Ljava/lang/String;[Ljava/lang/Object;)V
      //   65: aload_2
      //   66: iconst_0
      //   67: invokeinterface remove : (I)Ljava/lang/Object;
      //   72: checkcast c/a/b/o
      //   75: astore_1
      //   76: aload_0
      //   77: getfield a : Ljava/util/Map;
      //   80: aload_3
      //   81: aload_2
      //   82: invokeinterface put : (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
      //   87: pop
      //   88: aload_1
      //   89: getfield f : Ljava/lang/Object;
      //   92: astore_2
      //   93: aload_2
      //   94: monitorenter
      //   95: aload_1
      //   96: aload_0
      //   97: putfield p : Lc/a/b/o$b;
      //   100: aload_2
      //   101: monitorexit
      //   102: aload_0
      //   103: getfield b : Lc/a/b/d;
      //   106: getfield c : Ljava/util/concurrent/BlockingQueue;
      //   109: aload_1
      //   110: invokeinterface put : (Ljava/lang/Object;)V
      //   115: goto -> 163
      //   118: astore_1
      //   119: ldc 'Couldn't add request to queue. %s'
      //   121: iconst_1
      //   122: anewarray java/lang/Object
      //   125: dup
      //   126: iconst_0
      //   127: aload_1
      //   128: invokevirtual toString : ()Ljava/lang/String;
      //   131: aastore
      //   132: invokestatic c : (Ljava/lang/String;[Ljava/lang/Object;)V
      //   135: invokestatic currentThread : ()Ljava/lang/Thread;
      //   138: invokevirtual interrupt : ()V
      //   141: aload_0
      //   142: getfield b : Lc/a/b/d;
      //   145: astore_1
      //   146: aload_1
      //   147: iconst_1
      //   148: putfield f : Z
      //   151: aload_1
      //   152: invokevirtual interrupt : ()V
      //   155: goto -> 163
      //   158: astore_1
      //   159: aload_2
      //   160: monitorexit
      //   161: aload_1
      //   162: athrow
      //   163: aload_0
      //   164: monitorexit
      //   165: return
      //   166: astore_1
      //   167: aload_0
      //   168: monitorexit
      //   169: aload_1
      //   170: athrow
      // Exception table:
      //   from	to	target	type
      //   2	21	166	finally
      //   25	65	166	finally
      //   65	95	166	finally
      //   95	102	158	finally
      //   102	115	118	java/lang/InterruptedException
      //   102	115	166	finally
      //   119	155	166	finally
      //   159	161	158	finally
      //   161	163	166	finally
    }
  }
}


/* Location:              C:\Users\panch\Downloads\dvba_v1.1.0-dex2jar.jar!\c\a\b\d.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */