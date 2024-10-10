package b.f;

import java.util.LinkedHashMap;

public class f<K, V> {
  public final LinkedHashMap<K, V> a;
  
  public int b;
  
  public int c;
  
  public int d;
  
  public int e;
  
  public int f;
  
  public int g;
  
  public f(int paramInt) {
    if (paramInt > 0) {
      this.c = paramInt;
      this.a = new LinkedHashMap<K, V>(0, 0.75F, true);
      return;
    } 
    throw new IllegalArgumentException("maxSize <= 0");
  }
  
  public final V a(K paramK) {
    // Byte code:
    //   0: aload_1
    //   1: ifnull -> 52
    //   4: aload_0
    //   5: monitorenter
    //   6: aload_0
    //   7: getfield a : Ljava/util/LinkedHashMap;
    //   10: aload_1
    //   11: invokevirtual get : (Ljava/lang/Object;)Ljava/lang/Object;
    //   14: astore_1
    //   15: aload_1
    //   16: ifnull -> 33
    //   19: aload_0
    //   20: aload_0
    //   21: getfield f : I
    //   24: iconst_1
    //   25: iadd
    //   26: putfield f : I
    //   29: aload_0
    //   30: monitorexit
    //   31: aload_1
    //   32: areturn
    //   33: aload_0
    //   34: aload_0
    //   35: getfield g : I
    //   38: iconst_1
    //   39: iadd
    //   40: putfield g : I
    //   43: aload_0
    //   44: monitorexit
    //   45: aconst_null
    //   46: areturn
    //   47: astore_1
    //   48: aload_0
    //   49: monitorexit
    //   50: aload_1
    //   51: athrow
    //   52: new java/lang/NullPointerException
    //   55: dup
    //   56: ldc 'key == null'
    //   58: invokespecial <init> : (Ljava/lang/String;)V
    //   61: athrow
    // Exception table:
    //   from	to	target	type
    //   6	15	47	finally
    //   19	31	47	finally
    //   33	45	47	finally
    //   48	50	47	finally
  }
  
  public final V b(K paramK, V paramV) {
    // Byte code:
    //   0: aload_1
    //   1: ifnull -> 71
    //   4: aload_2
    //   5: ifnull -> 71
    //   8: aload_0
    //   9: monitorenter
    //   10: aload_0
    //   11: aload_0
    //   12: getfield d : I
    //   15: iconst_1
    //   16: iadd
    //   17: putfield d : I
    //   20: aload_0
    //   21: aload_0
    //   22: getfield b : I
    //   25: iconst_1
    //   26: iadd
    //   27: putfield b : I
    //   30: aload_0
    //   31: getfield a : Ljava/util/LinkedHashMap;
    //   34: aload_1
    //   35: aload_2
    //   36: invokevirtual put : (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    //   39: astore_1
    //   40: aload_1
    //   41: ifnull -> 54
    //   44: aload_0
    //   45: aload_0
    //   46: getfield b : I
    //   49: iconst_1
    //   50: isub
    //   51: putfield b : I
    //   54: aload_0
    //   55: monitorexit
    //   56: aload_0
    //   57: aload_0
    //   58: getfield c : I
    //   61: invokevirtual c : (I)V
    //   64: aload_1
    //   65: areturn
    //   66: astore_1
    //   67: aload_0
    //   68: monitorexit
    //   69: aload_1
    //   70: athrow
    //   71: new java/lang/NullPointerException
    //   74: dup
    //   75: ldc 'key == null || value == null'
    //   77: invokespecial <init> : (Ljava/lang/String;)V
    //   80: athrow
    // Exception table:
    //   from	to	target	type
    //   10	40	66	finally
    //   44	54	66	finally
    //   54	56	66	finally
    //   67	69	66	finally
  }
  
  public void c(int paramInt) {
    // Byte code:
    //   0: aload_0
    //   1: monitorenter
    //   2: aload_0
    //   3: getfield b : I
    //   6: iflt -> 119
    //   9: aload_0
    //   10: getfield a : Ljava/util/LinkedHashMap;
    //   13: invokevirtual isEmpty : ()Z
    //   16: ifeq -> 26
    //   19: aload_0
    //   20: getfield b : I
    //   23: ifne -> 119
    //   26: aload_0
    //   27: getfield b : I
    //   30: iload_1
    //   31: if_icmple -> 116
    //   34: aload_0
    //   35: getfield a : Ljava/util/LinkedHashMap;
    //   38: invokevirtual isEmpty : ()Z
    //   41: ifeq -> 47
    //   44: goto -> 116
    //   47: aload_0
    //   48: getfield a : Ljava/util/LinkedHashMap;
    //   51: invokevirtual entrySet : ()Ljava/util/Set;
    //   54: invokeinterface iterator : ()Ljava/util/Iterator;
    //   59: invokeinterface next : ()Ljava/lang/Object;
    //   64: checkcast java/util/Map$Entry
    //   67: astore_2
    //   68: aload_2
    //   69: invokeinterface getKey : ()Ljava/lang/Object;
    //   74: astore_3
    //   75: aload_2
    //   76: invokeinterface getValue : ()Ljava/lang/Object;
    //   81: pop
    //   82: aload_0
    //   83: getfield a : Ljava/util/LinkedHashMap;
    //   86: aload_3
    //   87: invokevirtual remove : (Ljava/lang/Object;)Ljava/lang/Object;
    //   90: pop
    //   91: aload_0
    //   92: aload_0
    //   93: getfield b : I
    //   96: iconst_1
    //   97: isub
    //   98: putfield b : I
    //   101: aload_0
    //   102: aload_0
    //   103: getfield e : I
    //   106: iconst_1
    //   107: iadd
    //   108: putfield e : I
    //   111: aload_0
    //   112: monitorexit
    //   113: goto -> 0
    //   116: aload_0
    //   117: monitorexit
    //   118: return
    //   119: new java/lang/IllegalStateException
    //   122: astore_2
    //   123: new java/lang/StringBuilder
    //   126: astore_3
    //   127: aload_3
    //   128: invokespecial <init> : ()V
    //   131: aload_3
    //   132: aload_0
    //   133: invokevirtual getClass : ()Ljava/lang/Class;
    //   136: invokevirtual getName : ()Ljava/lang/String;
    //   139: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   142: pop
    //   143: aload_3
    //   144: ldc '.sizeOf() is reporting inconsistent results!'
    //   146: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   149: pop
    //   150: aload_2
    //   151: aload_3
    //   152: invokevirtual toString : ()Ljava/lang/String;
    //   155: invokespecial <init> : (Ljava/lang/String;)V
    //   158: aload_2
    //   159: athrow
    //   160: astore_2
    //   161: aload_0
    //   162: monitorexit
    //   163: aload_2
    //   164: athrow
    // Exception table:
    //   from	to	target	type
    //   2	26	160	finally
    //   26	44	160	finally
    //   47	113	160	finally
    //   116	118	160	finally
    //   119	160	160	finally
    //   161	163	160	finally
  }
  
  public final String toString() {
    // Byte code:
    //   0: aload_0
    //   1: monitorenter
    //   2: aload_0
    //   3: getfield f : I
    //   6: aload_0
    //   7: getfield g : I
    //   10: iadd
    //   11: istore_1
    //   12: iload_1
    //   13: ifeq -> 29
    //   16: aload_0
    //   17: getfield f : I
    //   20: bipush #100
    //   22: imul
    //   23: iload_1
    //   24: idiv
    //   25: istore_1
    //   26: goto -> 31
    //   29: iconst_0
    //   30: istore_1
    //   31: getstatic java/util/Locale.US : Ljava/util/Locale;
    //   34: ldc 'LruCache[maxSize=%d,hits=%d,misses=%d,hitRate=%d%%]'
    //   36: iconst_4
    //   37: anewarray java/lang/Object
    //   40: dup
    //   41: iconst_0
    //   42: aload_0
    //   43: getfield c : I
    //   46: invokestatic valueOf : (I)Ljava/lang/Integer;
    //   49: aastore
    //   50: dup
    //   51: iconst_1
    //   52: aload_0
    //   53: getfield f : I
    //   56: invokestatic valueOf : (I)Ljava/lang/Integer;
    //   59: aastore
    //   60: dup
    //   61: iconst_2
    //   62: aload_0
    //   63: getfield g : I
    //   66: invokestatic valueOf : (I)Ljava/lang/Integer;
    //   69: aastore
    //   70: dup
    //   71: iconst_3
    //   72: iload_1
    //   73: invokestatic valueOf : (I)Ljava/lang/Integer;
    //   76: aastore
    //   77: invokestatic format : (Ljava/util/Locale;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;
    //   80: astore_2
    //   81: aload_0
    //   82: monitorexit
    //   83: aload_2
    //   84: areturn
    //   85: astore_2
    //   86: aload_0
    //   87: monitorexit
    //   88: aload_2
    //   89: athrow
    // Exception table:
    //   from	to	target	type
    //   2	12	85	finally
    //   16	26	85	finally
    //   31	81	85	finally
  }
}


/* Location:              C:\Users\panch\Downloads\dvba_v1.1.0-dex2jar.jar!\b\f\f.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */