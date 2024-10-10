package c.c.b.h.c0.a;

import c.c.a.a.c.k.c;
import c.c.a.a.c.l.q;
import c.c.a.a.h.d;
import com.google.android.gms.common.api.Status;
import java.util.concurrent.Future;

public abstract class a<T extends b> {
  public static c.c.a.a.c.m.a b = new c.c.a.a.c.m.a("BiChannelGoogleApi", new String[] { "FirebaseAuth: " });
  
  public c<T> a;
  
  public final c<T> a(String paramString) {
    // Byte code:
    //   0: aload_0
    //   1: monitorenter
    //   2: aload_0
    //   3: getfield a : Lc/c/b/h/c0/a/c;
    //   6: astore #4
    //   8: aload #4
    //   10: ifnonnull -> 82
    //   13: aload_0
    //   14: aload_0
    //   15: invokevirtual c : ()Ljava/util/concurrent/Future;
    //   18: invokeinterface get : ()Ljava/lang/Object;
    //   23: checkcast c/c/b/h/c0/a/c
    //   26: putfield a : Lc/c/b/h/c0/a/c;
    //   29: goto -> 82
    //   32: astore_1
    //   33: new java/lang/RuntimeException
    //   36: astore #4
    //   38: aload_1
    //   39: invokevirtual getMessage : ()Ljava/lang/String;
    //   42: invokestatic valueOf : (Ljava/lang/Object;)Ljava/lang/String;
    //   45: astore_1
    //   46: aload_1
    //   47: invokevirtual length : ()I
    //   50: ifeq -> 63
    //   53: ldc 'There was an error while initializing the connection to Google Play Services: '
    //   55: aload_1
    //   56: invokevirtual concat : (Ljava/lang/String;)Ljava/lang/String;
    //   59: astore_1
    //   60: goto -> 73
    //   63: new java/lang/String
    //   66: dup
    //   67: ldc 'There was an error while initializing the connection to Google Play Services: '
    //   69: invokespecial <init> : (Ljava/lang/String;)V
    //   72: astore_1
    //   73: aload #4
    //   75: aload_1
    //   76: invokespecial <init> : (Ljava/lang/String;)V
    //   79: aload #4
    //   81: athrow
    //   82: aload_0
    //   83: getfield a : Lc/c/b/h/c0/a/c;
    //   86: astore #5
    //   88: aload_0
    //   89: monitorexit
    //   90: aload #5
    //   92: getfield c : Lc/c/b/h/c0/a/e;
    //   95: astore #6
    //   97: aload #6
    //   99: getfield a : I
    //   102: istore_3
    //   103: iconst_1
    //   104: istore_2
    //   105: iload_3
    //   106: ifne -> 112
    //   109: goto -> 179
    //   112: aload #6
    //   114: getfield b : I
    //   117: iload_3
    //   118: if_icmpgt -> 126
    //   121: iconst_0
    //   122: istore_2
    //   123: goto -> 179
    //   126: aload #6
    //   128: getfield c : Ljava/util/Map;
    //   131: aload_1
    //   132: invokeinterface get : (Ljava/lang/Object;)Ljava/lang/Object;
    //   137: checkcast java/lang/Integer
    //   140: astore #4
    //   142: aload #4
    //   144: astore_1
    //   145: aload #4
    //   147: ifnonnull -> 155
    //   150: iconst_0
    //   151: invokestatic valueOf : (I)Ljava/lang/Integer;
    //   154: astore_1
    //   155: aload_1
    //   156: invokevirtual intValue : ()I
    //   159: aload #6
    //   161: getfield a : I
    //   164: if_icmple -> 121
    //   167: aload #6
    //   169: getfield b : I
    //   172: aload_1
    //   173: invokevirtual intValue : ()I
    //   176: if_icmplt -> 121
    //   179: getstatic c/c/b/h/c0/a/a.b : Lc/c/a/a/c/m/a;
    //   182: astore_1
    //   183: iload_2
    //   184: ifeq -> 249
    //   187: aload #5
    //   189: getfield b : Lc/c/a/a/c/k/c;
    //   192: invokestatic valueOf : (Ljava/lang/Object;)Ljava/lang/String;
    //   195: astore #6
    //   197: new java/lang/StringBuilder
    //   200: dup
    //   201: aload #6
    //   203: invokevirtual length : ()I
    //   206: bipush #43
    //   208: iadd
    //   209: invokespecial <init> : (I)V
    //   212: astore #4
    //   214: aload #4
    //   216: ldc 'getGoogleApiForMethod() returned Fallback: '
    //   218: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   221: pop
    //   222: aload #4
    //   224: aload #6
    //   226: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   229: pop
    //   230: aload_1
    //   231: aload #4
    //   233: invokevirtual toString : ()Ljava/lang/String;
    //   236: iconst_0
    //   237: anewarray java/lang/Object
    //   240: invokevirtual b : (Ljava/lang/String;[Ljava/lang/Object;)V
    //   243: aload #5
    //   245: getfield b : Lc/c/a/a/c/k/c;
    //   248: areturn
    //   249: aload #5
    //   251: getfield a : Lc/c/a/a/c/k/c;
    //   254: invokestatic valueOf : (Ljava/lang/Object;)Ljava/lang/String;
    //   257: astore #6
    //   259: new java/lang/StringBuilder
    //   262: dup
    //   263: aload #6
    //   265: invokevirtual length : ()I
    //   268: bipush #38
    //   270: iadd
    //   271: invokespecial <init> : (I)V
    //   274: astore #4
    //   276: aload #4
    //   278: ldc 'getGoogleApiForMethod() returned Gms: '
    //   280: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   283: pop
    //   284: aload #4
    //   286: aload #6
    //   288: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   291: pop
    //   292: aload_1
    //   293: aload #4
    //   295: invokevirtual toString : ()Ljava/lang/String;
    //   298: iconst_0
    //   299: anewarray java/lang/Object
    //   302: invokevirtual b : (Ljava/lang/String;[Ljava/lang/Object;)V
    //   305: aload #5
    //   307: getfield a : Lc/c/a/a/c/k/c;
    //   310: areturn
    //   311: astore_1
    //   312: aload_0
    //   313: monitorexit
    //   314: aload_1
    //   315: athrow
    // Exception table:
    //   from	to	target	type
    //   2	8	311	finally
    //   13	29	32	java/lang/Exception
    //   13	29	311	finally
    //   33	60	311	finally
    //   63	73	311	finally
    //   73	82	311	finally
    //   82	90	311	finally
    //   312	314	311	finally
  }
  
  public final <ResultT, A extends c.c.a.a.c.k.a.b> d<ResultT> b(f<A, ResultT> paramf) {
    c<T> c1 = a(paramf.a());
    if (c1 == null)
      return q.w((Exception)m0.a(new Status(17499, "Unable to connect to GoogleApi instance - Google Play Services may be unavailable"))); 
    if (((b)c1.c).b)
      ((u0)paramf).u = true; 
    return c1.b(0, paramf.b());
  }
  
  public abstract Future<c<T>> c();
  
  public final <ResultT, A extends c.c.a.a.c.k.a.b> d<ResultT> d(f<A, ResultT> paramf) {
    c<T> c1 = a(paramf.a());
    if (c1 == null)
      return q.w((Exception)m0.a(new Status(17499, "Unable to connect to GoogleApi instance - Google Play Services may be unavailable"))); 
    if (((b)c1.c).b)
      ((u0)paramf).u = true; 
    return c1.b(1, paramf.b());
  }
}


/* Location:              C:\Users\panch\Downloads\dvba_v1.1.0-dex2jar.jar!\c\c\b\h\c0\a\a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */