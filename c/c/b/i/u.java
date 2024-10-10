package c.c.b.i;

import c.c.b.l.a;

public class u<T> implements a<T> {
  public static final Object c = new Object();
  
  public volatile Object a = c;
  
  public volatile a<T> b;
  
  public u(a<T> parama) {
    this.b = parama;
  }
  
  public T a() {
    // Byte code:
    //   0: aload_0
    //   1: getfield a : Ljava/lang/Object;
    //   4: astore_2
    //   5: aload_2
    //   6: astore_1
    //   7: aload_2
    //   8: getstatic c/c/b/i/u.c : Ljava/lang/Object;
    //   11: if_acmpne -> 60
    //   14: aload_0
    //   15: monitorenter
    //   16: aload_0
    //   17: getfield a : Ljava/lang/Object;
    //   20: astore_2
    //   21: aload_2
    //   22: astore_1
    //   23: aload_2
    //   24: getstatic c/c/b/i/u.c : Ljava/lang/Object;
    //   27: if_acmpne -> 50
    //   30: aload_0
    //   31: getfield b : Lc/c/b/l/a;
    //   34: invokeinterface a : ()Ljava/lang/Object;
    //   39: astore_1
    //   40: aload_0
    //   41: aload_1
    //   42: putfield a : Ljava/lang/Object;
    //   45: aload_0
    //   46: aconst_null
    //   47: putfield b : Lc/c/b/l/a;
    //   50: aload_0
    //   51: monitorexit
    //   52: goto -> 60
    //   55: astore_1
    //   56: aload_0
    //   57: monitorexit
    //   58: aload_1
    //   59: athrow
    //   60: aload_1
    //   61: areturn
    // Exception table:
    //   from	to	target	type
    //   16	21	55	finally
    //   23	50	55	finally
    //   50	52	55	finally
    //   56	58	55	finally
  }
}


/* Location:              C:\Users\panch\Downloads\dvba_v1.1.0-dex2jar.jar!\c\c\b\\\u.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */