package b.f;

import java.util.ConcurrentModificationException;
import java.util.Map;

public class h<K, V> {
  public static Object[] e;
  
  public static int f;
  
  public static Object[] g;
  
  public static int h;
  
  public int[] b;
  
  public Object[] c;
  
  public int d;
  
  public h() {
    this.b = d.a;
    this.c = d.c;
    this.d = 0;
  }
  
  public h(int paramInt) {
    if (paramInt == 0) {
      this.b = d.a;
      this.c = d.c;
    } else {
      a(paramInt);
    } 
    this.d = 0;
  }
  
  public static void c(int[] paramArrayOfint, Object[] paramArrayOfObject, int paramInt) {
    // Byte code:
    //   0: aload_0
    //   1: arraylength
    //   2: bipush #8
    //   4: if_icmpne -> 73
    //   7: ldc b/f/h
    //   9: monitorenter
    //   10: getstatic b/f/h.h : I
    //   13: bipush #10
    //   15: if_icmpge -> 61
    //   18: aload_1
    //   19: iconst_0
    //   20: getstatic b/f/h.g : [Ljava/lang/Object;
    //   23: aastore
    //   24: aload_1
    //   25: iconst_1
    //   26: aload_0
    //   27: aastore
    //   28: iload_2
    //   29: iconst_1
    //   30: ishl
    //   31: iconst_1
    //   32: isub
    //   33: istore_2
    //   34: iload_2
    //   35: iconst_2
    //   36: if_icmplt -> 49
    //   39: aload_1
    //   40: iload_2
    //   41: aconst_null
    //   42: aastore
    //   43: iinc #2, -1
    //   46: goto -> 34
    //   49: aload_1
    //   50: putstatic b/f/h.g : [Ljava/lang/Object;
    //   53: getstatic b/f/h.h : I
    //   56: iconst_1
    //   57: iadd
    //   58: putstatic b/f/h.h : I
    //   61: ldc b/f/h
    //   63: monitorexit
    //   64: goto -> 145
    //   67: astore_0
    //   68: ldc b/f/h
    //   70: monitorexit
    //   71: aload_0
    //   72: athrow
    //   73: aload_0
    //   74: arraylength
    //   75: iconst_4
    //   76: if_icmpne -> 145
    //   79: ldc b/f/h
    //   81: monitorenter
    //   82: getstatic b/f/h.f : I
    //   85: bipush #10
    //   87: if_icmpge -> 133
    //   90: aload_1
    //   91: iconst_0
    //   92: getstatic b/f/h.e : [Ljava/lang/Object;
    //   95: aastore
    //   96: aload_1
    //   97: iconst_1
    //   98: aload_0
    //   99: aastore
    //   100: iload_2
    //   101: iconst_1
    //   102: ishl
    //   103: iconst_1
    //   104: isub
    //   105: istore_2
    //   106: iload_2
    //   107: iconst_2
    //   108: if_icmplt -> 121
    //   111: aload_1
    //   112: iload_2
    //   113: aconst_null
    //   114: aastore
    //   115: iinc #2, -1
    //   118: goto -> 106
    //   121: aload_1
    //   122: putstatic b/f/h.e : [Ljava/lang/Object;
    //   125: getstatic b/f/h.f : I
    //   128: iconst_1
    //   129: iadd
    //   130: putstatic b/f/h.f : I
    //   133: ldc b/f/h
    //   135: monitorexit
    //   136: goto -> 145
    //   139: astore_0
    //   140: ldc b/f/h
    //   142: monitorexit
    //   143: aload_0
    //   144: athrow
    //   145: return
    // Exception table:
    //   from	to	target	type
    //   10	24	67	finally
    //   49	61	67	finally
    //   61	64	67	finally
    //   68	71	67	finally
    //   82	96	139	finally
    //   121	133	139	finally
    //   133	136	139	finally
    //   140	143	139	finally
  }
  
  public final void a(int paramInt) {
    // Byte code:
    //   0: iload_1
    //   1: bipush #8
    //   3: if_icmpne -> 75
    //   6: ldc b/f/h
    //   8: monitorenter
    //   9: getstatic b/f/h.g : [Ljava/lang/Object;
    //   12: ifnull -> 63
    //   15: getstatic b/f/h.g : [Ljava/lang/Object;
    //   18: astore_2
    //   19: aload_0
    //   20: aload_2
    //   21: putfield c : [Ljava/lang/Object;
    //   24: aload_2
    //   25: iconst_0
    //   26: aaload
    //   27: checkcast [Ljava/lang/Object;
    //   30: putstatic b/f/h.g : [Ljava/lang/Object;
    //   33: aload_0
    //   34: aload_2
    //   35: iconst_1
    //   36: aaload
    //   37: checkcast [I
    //   40: putfield b : [I
    //   43: aload_2
    //   44: iconst_1
    //   45: aconst_null
    //   46: aastore
    //   47: aload_2
    //   48: iconst_0
    //   49: aconst_null
    //   50: aastore
    //   51: getstatic b/f/h.h : I
    //   54: iconst_1
    //   55: isub
    //   56: putstatic b/f/h.h : I
    //   59: ldc b/f/h
    //   61: monitorexit
    //   62: return
    //   63: ldc b/f/h
    //   65: monitorexit
    //   66: goto -> 149
    //   69: astore_2
    //   70: ldc b/f/h
    //   72: monitorexit
    //   73: aload_2
    //   74: athrow
    //   75: iload_1
    //   76: iconst_4
    //   77: if_icmpne -> 149
    //   80: ldc b/f/h
    //   82: monitorenter
    //   83: getstatic b/f/h.e : [Ljava/lang/Object;
    //   86: ifnull -> 137
    //   89: getstatic b/f/h.e : [Ljava/lang/Object;
    //   92: astore_2
    //   93: aload_0
    //   94: aload_2
    //   95: putfield c : [Ljava/lang/Object;
    //   98: aload_2
    //   99: iconst_0
    //   100: aaload
    //   101: checkcast [Ljava/lang/Object;
    //   104: putstatic b/f/h.e : [Ljava/lang/Object;
    //   107: aload_0
    //   108: aload_2
    //   109: iconst_1
    //   110: aaload
    //   111: checkcast [I
    //   114: putfield b : [I
    //   117: aload_2
    //   118: iconst_1
    //   119: aconst_null
    //   120: aastore
    //   121: aload_2
    //   122: iconst_0
    //   123: aconst_null
    //   124: aastore
    //   125: getstatic b/f/h.f : I
    //   128: iconst_1
    //   129: isub
    //   130: putstatic b/f/h.f : I
    //   133: ldc b/f/h
    //   135: monitorexit
    //   136: return
    //   137: ldc b/f/h
    //   139: monitorexit
    //   140: goto -> 149
    //   143: astore_2
    //   144: ldc b/f/h
    //   146: monitorexit
    //   147: aload_2
    //   148: athrow
    //   149: aload_0
    //   150: iload_1
    //   151: newarray int
    //   153: putfield b : [I
    //   156: aload_0
    //   157: iload_1
    //   158: iconst_1
    //   159: ishl
    //   160: anewarray java/lang/Object
    //   163: putfield c : [Ljava/lang/Object;
    //   166: return
    // Exception table:
    //   from	to	target	type
    //   9	43	69	finally
    //   51	62	69	finally
    //   63	66	69	finally
    //   70	73	69	finally
    //   83	117	143	finally
    //   125	136	143	finally
    //   137	140	143	finally
    //   144	147	143	finally
  }
  
  public void b(int paramInt) {
    int i = this.d;
    int[] arrayOfInt = this.b;
    if (arrayOfInt.length < paramInt) {
      Object[] arrayOfObject = this.c;
      a(paramInt);
      if (this.d > 0) {
        System.arraycopy(arrayOfInt, 0, this.b, 0, i);
        System.arraycopy(arrayOfObject, 0, this.c, 0, i << 1);
      } 
      c(arrayOfInt, arrayOfObject, i);
    } 
    if (this.d == i)
      return; 
    throw new ConcurrentModificationException();
  }
  
  public void clear() {
    int i = this.d;
    if (i > 0) {
      int[] arrayOfInt = this.b;
      Object[] arrayOfObject = this.c;
      this.b = d.a;
      this.c = d.c;
      this.d = 0;
      c(arrayOfInt, arrayOfObject, i);
    } 
    if (this.d <= 0)
      return; 
    throw new ConcurrentModificationException();
  }
  
  public boolean containsKey(Object paramObject) {
    boolean bool;
    if (e(paramObject) >= 0) {
      bool = true;
    } else {
      bool = false;
    } 
    return bool;
  }
  
  public boolean containsValue(Object paramObject) {
    boolean bool;
    if (g(paramObject) >= 0) {
      bool = true;
    } else {
      bool = false;
    } 
    return bool;
  }
  
  public int d(Object paramObject, int paramInt) {
    int i = this.d;
    if (i == 0)
      return -1; 
    int[] arrayOfInt = this.b;
    try {
      int k = d.a(arrayOfInt, i, paramInt);
      if (k < 0)
        return k; 
      if (paramObject.equals(this.c[k << 1]))
        return k; 
      int j;
      for (j = k + 1; j < i && this.b[j] == paramInt; j++) {
        if (paramObject.equals(this.c[j << 1]))
          return j; 
      } 
      for (i = k - 1; i >= 0 && this.b[i] == paramInt; i--) {
        if (paramObject.equals(this.c[i << 1]))
          return i; 
      } 
      return j ^ 0xFFFFFFFF;
    } catch (ArrayIndexOutOfBoundsException arrayIndexOutOfBoundsException) {
      throw new ConcurrentModificationException();
    } 
  }
  
  public int e(Object paramObject) {
    int i;
    if (paramObject == null) {
      i = f();
    } else {
      i = d(paramObject, paramObject.hashCode());
    } 
    return i;
  }
  
  public boolean equals(Object paramObject) {
    if (this == paramObject)
      return true; 
    if (paramObject instanceof h) {
      h h1 = (h)paramObject;
      if (this.d != h1.d)
        return false; 
      byte b = 0;
      try {
        while (b < this.d) {
          K k = h(b);
          V v = k(b);
          paramObject = h1.get(k);
          if (v == null) {
            if (paramObject != null || !h1.containsKey(k))
              return false; 
          } else {
            boolean bool = v.equals(paramObject);
            if (!bool)
              return false; 
          } 
          b++;
        } 
        return true;
      } catch (NullPointerException|ClassCastException nullPointerException) {
        return false;
      } 
    } 
    if (nullPointerException instanceof Map) {
      Map map = (Map)nullPointerException;
      if (this.d != map.size())
        return false; 
      byte b = 0;
      try {
        while (b < this.d) {
          nullPointerException = (NullPointerException)h(b);
          V v = k(b);
          Object object = map.get(nullPointerException);
          if (v == null) {
            if (object != null || !map.containsKey(nullPointerException))
              return false; 
          } else {
            boolean bool = v.equals(object);
            if (!bool)
              return false; 
          } 
          b++;
        } 
        return true;
      } catch (NullPointerException|ClassCastException nullPointerException1) {}
    } 
    return false;
  }
  
  public int f() {
    int i = this.d;
    if (i == 0)
      return -1; 
    int[] arrayOfInt = this.b;
    try {
      int k = d.a(arrayOfInt, i, 0);
      if (k < 0)
        return k; 
      if (this.c[k << 1] == null)
        return k; 
      int j;
      for (j = k + 1; j < i && this.b[j] == 0; j++) {
        if (this.c[j << 1] == null)
          return j; 
      } 
      for (i = k - 1; i >= 0 && this.b[i] == 0; i--) {
        if (this.c[i << 1] == null)
          return i; 
      } 
      return j ^ 0xFFFFFFFF;
    } catch (ArrayIndexOutOfBoundsException arrayIndexOutOfBoundsException) {
      throw new ConcurrentModificationException();
    } 
  }
  
  public int g(Object paramObject) {
    int i = this.d * 2;
    Object[] arrayOfObject = this.c;
    if (paramObject == null) {
      for (byte b = 1; b < i; b += 2) {
        if (arrayOfObject[b] == null)
          return b >> 1; 
      } 
    } else {
      for (byte b = 1; b < i; b += 2) {
        if (paramObject.equals(arrayOfObject[b]))
          return b >> 1; 
      } 
    } 
    return -1;
  }
  
  public V get(Object paramObject) {
    return getOrDefault(paramObject, null);
  }
  
  public V getOrDefault(Object paramObject, V paramV) {
    int i = e(paramObject);
    if (i >= 0)
      paramV = (V)this.c[(i << 1) + 1]; 
    return paramV;
  }
  
  public K h(int paramInt) {
    return (K)this.c[paramInt << 1];
  }
  
  public int hashCode() {
    int[] arrayOfInt = this.b;
    Object[] arrayOfObject = this.c;
    int j = this.d;
    boolean bool = true;
    byte b = 0;
    int i = 0;
    while (b < j) {
      int k;
      Object object = arrayOfObject[bool];
      int m = arrayOfInt[b];
      if (object == null) {
        k = 0;
      } else {
        k = object.hashCode();
      } 
      i += k ^ m;
      b++;
      bool += true;
    } 
    return i;
  }
  
  public V i(int paramInt) {
    Object[] arrayOfObject = this.c;
    int k = paramInt << 1;
    Object object = arrayOfObject[k + 1];
    int j = this.d;
    int i = 0;
    if (j <= 1) {
      c(this.b, arrayOfObject, j);
      this.b = d.a;
      this.c = d.c;
      paramInt = i;
    } else {
      int m = j - 1;
      int[] arrayOfInt = this.b;
      int n = arrayOfInt.length;
      i = 8;
      if (n > 8 && j < arrayOfInt.length / 3) {
        if (j > 8)
          i = j + (j >> 1); 
        int[] arrayOfInt1 = this.b;
        Object[] arrayOfObject1 = this.c;
        a(i);
        if (j == this.d) {
          if (paramInt > 0) {
            System.arraycopy(arrayOfInt1, 0, this.b, 0, paramInt);
            System.arraycopy(arrayOfObject1, 0, this.c, 0, k);
          } 
          if (paramInt < m) {
            i = paramInt + 1;
            arrayOfInt = this.b;
            n = m - paramInt;
            System.arraycopy(arrayOfInt1, i, arrayOfInt, paramInt, n);
            System.arraycopy(arrayOfObject1, i << 1, this.c, k, n << 1);
          } 
        } else {
          throw new ConcurrentModificationException();
        } 
      } else {
        if (paramInt < m) {
          arrayOfInt = this.b;
          n = paramInt + 1;
          i = m - paramInt;
          System.arraycopy(arrayOfInt, n, arrayOfInt, paramInt, i);
          Object[] arrayOfObject2 = this.c;
          System.arraycopy(arrayOfObject2, n << 1, arrayOfObject2, k, i << 1);
        } 
        Object[] arrayOfObject1 = this.c;
        paramInt = m << 1;
        arrayOfObject1[paramInt] = null;
        arrayOfObject1[paramInt + 1] = null;
      } 
      paramInt = m;
    } 
    if (j == this.d) {
      this.d = paramInt;
      return (V)object;
    } 
    throw new ConcurrentModificationException();
  }
  
  public boolean isEmpty() {
    boolean bool;
    if (this.d <= 0) {
      bool = true;
    } else {
      bool = false;
    } 
    return bool;
  }
  
  public V j(int paramInt, V paramV) {
    paramInt = (paramInt << 1) + 1;
    Object[] arrayOfObject = this.c;
    Object object = arrayOfObject[paramInt];
    arrayOfObject[paramInt] = paramV;
    return (V)object;
  }
  
  public V k(int paramInt) {
    return (V)this.c[(paramInt << 1) + 1];
  }
  
  public V put(K paramK, V paramV) {
    int j;
    int k = this.d;
    if (paramK == null) {
      i = f();
      j = 0;
    } else {
      j = paramK.hashCode();
      i = d(paramK, j);
    } 
    if (i >= 0) {
      i = (i << 1) + 1;
      Object[] arrayOfObject = this.c;
      paramK = (K)arrayOfObject[i];
      arrayOfObject[i] = paramV;
      return (V)paramK;
    } 
    int m = i ^ 0xFFFFFFFF;
    if (k >= this.b.length) {
      i = 4;
      if (k >= 8) {
        i = (k >> 1) + k;
      } else if (k >= 4) {
        i = 8;
      } 
      int[] arrayOfInt = this.b;
      Object[] arrayOfObject = this.c;
      a(i);
      if (k == this.d) {
        int[] arrayOfInt1 = this.b;
        if (arrayOfInt1.length > 0) {
          System.arraycopy(arrayOfInt, 0, arrayOfInt1, 0, arrayOfInt.length);
          System.arraycopy(arrayOfObject, 0, this.c, 0, arrayOfObject.length);
        } 
        c(arrayOfInt, arrayOfObject, k);
      } else {
        throw new ConcurrentModificationException();
      } 
    } 
    if (m < k) {
      int[] arrayOfInt = this.b;
      i = m + 1;
      System.arraycopy(arrayOfInt, m, arrayOfInt, i, k - m);
      Object[] arrayOfObject = this.c;
      System.arraycopy(arrayOfObject, m << 1, arrayOfObject, i << 1, this.d - m << 1);
    } 
    int i = this.d;
    if (k == i) {
      int[] arrayOfInt = this.b;
      if (m < arrayOfInt.length) {
        arrayOfInt[m] = j;
        Object[] arrayOfObject = this.c;
        j = m << 1;
        arrayOfObject[j] = paramK;
        arrayOfObject[j + 1] = paramV;
        this.d = i + 1;
        return null;
      } 
    } 
    throw new ConcurrentModificationException();
  }
  
  public V putIfAbsent(K paramK, V paramV) {
    V v2 = getOrDefault(paramK, null);
    V v1 = v2;
    if (v2 == null)
      v1 = put(paramK, paramV); 
    return v1;
  }
  
  public V remove(Object paramObject) {
    int i = e(paramObject);
    return (i >= 0) ? i(i) : null;
  }
  
  public boolean remove(Object paramObject1, Object paramObject2) {
    int i = e(paramObject1);
    if (i >= 0) {
      paramObject1 = k(i);
      if (paramObject2 == paramObject1 || (paramObject2 != null && paramObject2.equals(paramObject1))) {
        i(i);
        return true;
      } 
    } 
    return false;
  }
  
  public V replace(K paramK, V paramV) {
    int i = e(paramK);
    return (i >= 0) ? j(i, paramV) : null;
  }
  
  public boolean replace(K paramK, V paramV1, V paramV2) {
    int i = e(paramK);
    if (i >= 0) {
      paramK = (K)k(i);
      if (paramK == paramV1 || (paramV1 != null && paramV1.equals(paramK))) {
        j(i, paramV2);
        return true;
      } 
    } 
    return false;
  }
  
  public int size() {
    return this.d;
  }
  
  public String toString() {
    if (isEmpty())
      return "{}"; 
    StringBuilder stringBuilder = new StringBuilder(this.d * 28);
    stringBuilder.append('{');
    for (byte b = 0; b < this.d; b++) {
      if (b > 0)
        stringBuilder.append(", "); 
      V v = (V)h(b);
      if (v != this) {
        stringBuilder.append(v);
      } else {
        stringBuilder.append("(this Map)");
      } 
      stringBuilder.append('=');
      v = k(b);
      if (v != this) {
        stringBuilder.append(v);
      } else {
        stringBuilder.append("(this Map)");
      } 
    } 
    stringBuilder.append('}');
    return stringBuilder.toString();
  }
}


/* Location:              C:\Users\panch\Downloads\dvba_v1.1.0-dex2jar.jar!\b\f\h.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */