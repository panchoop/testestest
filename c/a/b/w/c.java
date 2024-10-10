package c.a.b.w;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class c {
  public static final Comparator<byte[]> e = new a();
  
  public final List<byte[]> a = (List)new ArrayList<byte>();
  
  public final List<byte[]> b = (List)new ArrayList<byte>(64);
  
  public int c = 0;
  
  public final int d;
  
  public c(int paramInt) {
    this.d = paramInt;
  }
  
  public byte[] a(int paramInt) {
    // Byte code:
    //   0: aload_0
    //   1: monitorenter
    //   2: iconst_0
    //   3: istore_2
    //   4: iload_2
    //   5: aload_0
    //   6: getfield b : Ljava/util/List;
    //   9: invokeinterface size : ()I
    //   14: if_icmpge -> 80
    //   17: aload_0
    //   18: getfield b : Ljava/util/List;
    //   21: iload_2
    //   22: invokeinterface get : (I)Ljava/lang/Object;
    //   27: checkcast [B
    //   30: astore_3
    //   31: aload_3
    //   32: arraylength
    //   33: iload_1
    //   34: if_icmplt -> 74
    //   37: aload_0
    //   38: aload_0
    //   39: getfield c : I
    //   42: aload_3
    //   43: arraylength
    //   44: isub
    //   45: putfield c : I
    //   48: aload_0
    //   49: getfield b : Ljava/util/List;
    //   52: iload_2
    //   53: invokeinterface remove : (I)Ljava/lang/Object;
    //   58: pop
    //   59: aload_0
    //   60: getfield a : Ljava/util/List;
    //   63: aload_3
    //   64: invokeinterface remove : (Ljava/lang/Object;)Z
    //   69: pop
    //   70: aload_0
    //   71: monitorexit
    //   72: aload_3
    //   73: areturn
    //   74: iinc #2, 1
    //   77: goto -> 4
    //   80: iload_1
    //   81: newarray byte
    //   83: astore_3
    //   84: aload_0
    //   85: monitorexit
    //   86: aload_3
    //   87: areturn
    //   88: astore_3
    //   89: aload_0
    //   90: monitorexit
    //   91: aload_3
    //   92: athrow
    // Exception table:
    //   from	to	target	type
    //   4	70	88	finally
    //   80	84	88	finally
  }
  
  public void b(byte[] paramArrayOfbyte) {
    // Byte code:
    //   0: aload_0
    //   1: monitorenter
    //   2: aload_1
    //   3: ifnull -> 141
    //   6: aload_1
    //   7: arraylength
    //   8: aload_0
    //   9: getfield d : I
    //   12: if_icmple -> 18
    //   15: goto -> 141
    //   18: aload_0
    //   19: getfield a : Ljava/util/List;
    //   22: aload_1
    //   23: invokeinterface add : (Ljava/lang/Object;)Z
    //   28: pop
    //   29: aload_0
    //   30: getfield b : Ljava/util/List;
    //   33: aload_1
    //   34: getstatic c/a/b/w/c.e : Ljava/util/Comparator;
    //   37: invokestatic binarySearch : (Ljava/util/List;Ljava/lang/Object;Ljava/util/Comparator;)I
    //   40: istore_3
    //   41: iload_3
    //   42: istore_2
    //   43: iload_3
    //   44: ifge -> 52
    //   47: iload_3
    //   48: ineg
    //   49: iconst_1
    //   50: isub
    //   51: istore_2
    //   52: aload_0
    //   53: getfield b : Ljava/util/List;
    //   56: iload_2
    //   57: aload_1
    //   58: invokeinterface add : (ILjava/lang/Object;)V
    //   63: aload_0
    //   64: aload_0
    //   65: getfield c : I
    //   68: aload_1
    //   69: arraylength
    //   70: iadd
    //   71: putfield c : I
    //   74: aload_0
    //   75: monitorenter
    //   76: aload_0
    //   77: getfield c : I
    //   80: aload_0
    //   81: getfield d : I
    //   84: if_icmple -> 126
    //   87: aload_0
    //   88: getfield a : Ljava/util/List;
    //   91: iconst_0
    //   92: invokeinterface remove : (I)Ljava/lang/Object;
    //   97: checkcast [B
    //   100: astore_1
    //   101: aload_0
    //   102: getfield b : Ljava/util/List;
    //   105: aload_1
    //   106: invokeinterface remove : (Ljava/lang/Object;)Z
    //   111: pop
    //   112: aload_0
    //   113: aload_0
    //   114: getfield c : I
    //   117: aload_1
    //   118: arraylength
    //   119: isub
    //   120: putfield c : I
    //   123: goto -> 76
    //   126: aload_0
    //   127: monitorexit
    //   128: aload_0
    //   129: monitorexit
    //   130: return
    //   131: astore_1
    //   132: aload_0
    //   133: monitorexit
    //   134: aload_1
    //   135: athrow
    //   136: astore_1
    //   137: aload_0
    //   138: monitorexit
    //   139: aload_1
    //   140: athrow
    //   141: aload_0
    //   142: monitorexit
    //   143: return
    // Exception table:
    //   from	to	target	type
    //   6	15	136	finally
    //   18	41	136	finally
    //   52	76	136	finally
    //   76	123	131	finally
    //   126	128	136	finally
    //   132	136	136	finally
  }
  
  public class a implements Comparator<byte[]> {
    public int compare(Object param1Object1, Object param1Object2) {
      param1Object1 = param1Object1;
      param1Object2 = param1Object2;
      return param1Object1.length - param1Object2.length;
    }
  }
}


/* Location:              C:\Users\panch\Downloads\dvba_v1.1.0-dex2jar.jar!\c\a\b\w\c.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */