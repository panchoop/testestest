package c.c.a.a.c;

import java.lang.ref.WeakReference;

public abstract class v extends t {
  public static final WeakReference<byte[]> c = (WeakReference)new WeakReference<byte>(null);
  
  public WeakReference<byte[]> b = c;
  
  public v(byte[] paramArrayOfbyte) {
    super(paramArrayOfbyte);
  }
  
  public abstract byte[] C();
  
  public final byte[] t() {
    // Byte code:
    //   0: aload_0
    //   1: monitorenter
    //   2: aload_0
    //   3: getfield b : Ljava/lang/ref/WeakReference;
    //   6: invokevirtual get : ()Ljava/lang/Object;
    //   9: checkcast [B
    //   12: astore_2
    //   13: aload_2
    //   14: astore_1
    //   15: aload_2
    //   16: ifnonnull -> 38
    //   19: aload_0
    //   20: invokevirtual C : ()[B
    //   23: astore_1
    //   24: new java/lang/ref/WeakReference
    //   27: astore_2
    //   28: aload_2
    //   29: aload_1
    //   30: invokespecial <init> : (Ljava/lang/Object;)V
    //   33: aload_0
    //   34: aload_2
    //   35: putfield b : Ljava/lang/ref/WeakReference;
    //   38: aload_0
    //   39: monitorexit
    //   40: aload_1
    //   41: areturn
    //   42: astore_1
    //   43: aload_0
    //   44: monitorexit
    //   45: aload_1
    //   46: athrow
    // Exception table:
    //   from	to	target	type
    //   2	13	42	finally
    //   19	38	42	finally
    //   38	40	42	finally
    //   43	45	42	finally
  }
}


/* Location:              C:\Users\panch\Downloads\dvba_v1.1.0-dex2jar.jar!\c\c\a\a\c\v.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */