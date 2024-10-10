package c.a.b;

import android.os.Process;
import java.util.concurrent.BlockingQueue;

public class j extends Thread {
  public final BlockingQueue<o<?>> b;
  
  public final i c;
  
  public final b d;
  
  public final r e;
  
  public volatile boolean f = false;
  
  public j(BlockingQueue<o<?>> paramBlockingQueue, i parami, b paramb, r paramr) {
    this.b = paramBlockingQueue;
    this.c = parami;
    this.d = paramb;
    this.e = paramr;
  }
  
  public final void a() {
    // Byte code:
    //   0: aload_0
    //   1: getfield b : Ljava/util/concurrent/BlockingQueue;
    //   4: invokeinterface take : ()Ljava/lang/Object;
    //   9: checkcast c/a/b/o
    //   12: astore_2
    //   13: invokestatic elapsedRealtime : ()J
    //   16: pop2
    //   17: aload_2
    //   18: ldc 'network-queue-take'
    //   20: invokevirtual a : (Ljava/lang/String;)V
    //   23: aload_2
    //   24: invokevirtual i : ()Z
    //   27: ifeq -> 43
    //   30: aload_2
    //   31: ldc 'network-discard-cancelled'
    //   33: invokevirtual c : (Ljava/lang/String;)V
    //   36: aload_2
    //   37: invokevirtual j : ()V
    //   40: goto -> 381
    //   43: aload_2
    //   44: getfield e : I
    //   47: invokestatic setThreadStatsTag : (I)V
    //   50: aload_0
    //   51: getfield c : Lc/a/b/i;
    //   54: astore_3
    //   55: aload_3
    //   56: checkcast c/a/b/w/b
    //   59: astore_3
    //   60: aload_3
    //   61: aload_2
    //   62: invokevirtual f : (Lc/a/b/o;)Lc/a/b/l;
    //   65: astore #4
    //   67: aload_2
    //   68: ldc 'network-http-complete'
    //   70: invokevirtual a : (Ljava/lang/String;)V
    //   73: aload #4
    //   75: getfield d : Z
    //   78: ifeq -> 115
    //   81: aload_2
    //   82: getfield f : Ljava/lang/Object;
    //   85: astore_3
    //   86: aload_3
    //   87: monitorenter
    //   88: aload_2
    //   89: getfield l : Z
    //   92: istore_1
    //   93: aload_3
    //   94: monitorexit
    //   95: iload_1
    //   96: ifeq -> 115
    //   99: aload_2
    //   100: ldc 'not-modified'
    //   102: invokevirtual c : (Ljava/lang/String;)V
    //   105: goto -> 36
    //   108: astore #4
    //   110: aload_3
    //   111: monitorexit
    //   112: aload #4
    //   114: athrow
    //   115: aload_2
    //   116: aload #4
    //   118: invokevirtual l : (Lc/a/b/l;)Lc/a/b/q;
    //   121: astore_3
    //   122: aload_2
    //   123: ldc 'network-parse-complete'
    //   125: invokevirtual a : (Ljava/lang/String;)V
    //   128: aload_2
    //   129: getfield j : Z
    //   132: ifeq -> 182
    //   135: aload_3
    //   136: getfield b : Lc/a/b/b$a;
    //   139: ifnull -> 182
    //   142: aload_0
    //   143: getfield d : Lc/a/b/b;
    //   146: astore #6
    //   148: aload_2
    //   149: invokevirtual f : ()Ljava/lang/String;
    //   152: astore #5
    //   154: aload_3
    //   155: getfield b : Lc/a/b/b$a;
    //   158: astore #4
    //   160: aload #6
    //   162: checkcast c/a/b/w/d
    //   165: astore #6
    //   167: aload #6
    //   169: aload #5
    //   171: aload #4
    //   173: invokevirtual e : (Ljava/lang/String;Lc/a/b/b$a;)V
    //   176: aload_2
    //   177: ldc 'network-cache-written'
    //   179: invokevirtual a : (Ljava/lang/String;)V
    //   182: aload_2
    //   183: getfield f : Ljava/lang/Object;
    //   186: astore #4
    //   188: aload #4
    //   190: monitorenter
    //   191: aload_2
    //   192: iconst_1
    //   193: putfield l : Z
    //   196: aload #4
    //   198: monitorexit
    //   199: aload_0
    //   200: getfield e : Lc/a/b/r;
    //   203: checkcast c/a/b/g
    //   206: aload_2
    //   207: aload_3
    //   208: aconst_null
    //   209: invokevirtual a : (Lc/a/b/o;Lc/a/b/q;Ljava/lang/Runnable;)V
    //   212: aload_2
    //   213: aload_3
    //   214: invokevirtual k : (Lc/a/b/q;)V
    //   217: goto -> 381
    //   220: astore_3
    //   221: aload #4
    //   223: monitorexit
    //   224: aload_3
    //   225: athrow
    //   226: astore_3
    //   227: ldc 'Volley'
    //   229: ldc 'Unhandled exception %s'
    //   231: iconst_1
    //   232: anewarray java/lang/Object
    //   235: dup
    //   236: iconst_0
    //   237: aload_3
    //   238: invokevirtual toString : ()Ljava/lang/String;
    //   241: aastore
    //   242: invokestatic a : (Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;
    //   245: aload_3
    //   246: invokestatic e : (Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I
    //   249: pop
    //   250: new c/a/b/u
    //   253: dup
    //   254: aload_3
    //   255: invokespecial <init> : (Ljava/lang/Throwable;)V
    //   258: astore #4
    //   260: invokestatic elapsedRealtime : ()J
    //   263: pop2
    //   264: aload_0
    //   265: getfield e : Lc/a/b/r;
    //   268: checkcast c/a/b/g
    //   271: astore_3
    //   272: aload_3
    //   273: ifnull -> 316
    //   276: aload_2
    //   277: ldc 'post-error'
    //   279: invokevirtual a : (Ljava/lang/String;)V
    //   282: new c/a/b/q
    //   285: dup
    //   286: aload #4
    //   288: invokespecial <init> : (Lc/a/b/u;)V
    //   291: astore #4
    //   293: aload_3
    //   294: getfield a : Ljava/util/concurrent/Executor;
    //   297: new c/a/b/g$b
    //   300: dup
    //   301: aload_2
    //   302: aload #4
    //   304: aconst_null
    //   305: invokespecial <init> : (Lc/a/b/o;Lc/a/b/q;Ljava/lang/Runnable;)V
    //   308: invokeinterface execute : (Ljava/lang/Runnable;)V
    //   313: goto -> 377
    //   316: aconst_null
    //   317: athrow
    //   318: astore #4
    //   320: invokestatic elapsedRealtime : ()J
    //   323: pop2
    //   324: aload_2
    //   325: ifnull -> 384
    //   328: aload_0
    //   329: getfield e : Lc/a/b/r;
    //   332: checkcast c/a/b/g
    //   335: astore_3
    //   336: aload_3
    //   337: ifnull -> 382
    //   340: aload_2
    //   341: ldc 'post-error'
    //   343: invokevirtual a : (Ljava/lang/String;)V
    //   346: new c/a/b/q
    //   349: dup
    //   350: aload #4
    //   352: invokespecial <init> : (Lc/a/b/u;)V
    //   355: astore #4
    //   357: aload_3
    //   358: getfield a : Ljava/util/concurrent/Executor;
    //   361: new c/a/b/g$b
    //   364: dup
    //   365: aload_2
    //   366: aload #4
    //   368: aconst_null
    //   369: invokespecial <init> : (Lc/a/b/o;Lc/a/b/q;Ljava/lang/Runnable;)V
    //   372: invokeinterface execute : (Ljava/lang/Runnable;)V
    //   377: aload_2
    //   378: invokevirtual j : ()V
    //   381: return
    //   382: aconst_null
    //   383: athrow
    //   384: aconst_null
    //   385: athrow
    // Exception table:
    //   from	to	target	type
    //   17	36	318	c/a/b/u
    //   17	36	226	java/lang/Exception
    //   36	40	318	c/a/b/u
    //   36	40	226	java/lang/Exception
    //   43	55	318	c/a/b/u
    //   43	55	226	java/lang/Exception
    //   60	88	318	c/a/b/u
    //   60	88	226	java/lang/Exception
    //   88	95	108	finally
    //   99	105	318	c/a/b/u
    //   99	105	226	java/lang/Exception
    //   110	112	108	finally
    //   112	115	318	c/a/b/u
    //   112	115	226	java/lang/Exception
    //   115	160	318	c/a/b/u
    //   115	160	226	java/lang/Exception
    //   167	182	318	c/a/b/u
    //   167	182	226	java/lang/Exception
    //   182	191	318	c/a/b/u
    //   182	191	226	java/lang/Exception
    //   191	199	220	finally
    //   199	217	318	c/a/b/u
    //   199	217	226	java/lang/Exception
    //   221	224	220	finally
    //   224	226	318	c/a/b/u
    //   224	226	226	java/lang/Exception
  }
  
  public void run() {
    Process.setThreadPriority(10);
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
        v.c("Ignoring spurious interrupt of NetworkDispatcher thread; use quit() to terminate it", new Object[0]);
      } 
    } 
  }
}


/* Location:              C:\Users\panch\Downloads\dvba_v1.1.0-dex2jar.jar!\c\a\b\j.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */