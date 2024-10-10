package b.f;

import java.lang.reflect.Array;
import java.util.Collection;
import java.util.Iterator;
import java.util.Set;

public final class c<E> implements Collection<E>, Set<E> {
  public static final int[] f = new int[0];
  
  public static final Object[] g = new Object[0];
  
  public static Object[] h;
  
  public static int i;
  
  public static Object[] j;
  
  public static int k;
  
  public int[] b = f;
  
  public Object[] c = g;
  
  public int d = 0;
  
  public g<E, E> e;
  
  public static void b(int[] paramArrayOfint, Object[] paramArrayOfObject, int paramInt) {
    // Byte code:
    //   0: aload_0
    //   1: arraylength
    //   2: bipush #8
    //   4: if_icmpne -> 70
    //   7: ldc b/f/c
    //   9: monitorenter
    //   10: getstatic b/f/c.k : I
    //   13: bipush #10
    //   15: if_icmpge -> 58
    //   18: aload_1
    //   19: iconst_0
    //   20: getstatic b/f/c.j : [Ljava/lang/Object;
    //   23: aastore
    //   24: aload_1
    //   25: iconst_1
    //   26: aload_0
    //   27: aastore
    //   28: iinc #2, -1
    //   31: iload_2
    //   32: iconst_2
    //   33: if_icmplt -> 46
    //   36: aload_1
    //   37: iload_2
    //   38: aconst_null
    //   39: aastore
    //   40: iinc #2, -1
    //   43: goto -> 31
    //   46: aload_1
    //   47: putstatic b/f/c.j : [Ljava/lang/Object;
    //   50: getstatic b/f/c.k : I
    //   53: iconst_1
    //   54: iadd
    //   55: putstatic b/f/c.k : I
    //   58: ldc b/f/c
    //   60: monitorexit
    //   61: goto -> 139
    //   64: astore_0
    //   65: ldc b/f/c
    //   67: monitorexit
    //   68: aload_0
    //   69: athrow
    //   70: aload_0
    //   71: arraylength
    //   72: iconst_4
    //   73: if_icmpne -> 139
    //   76: ldc b/f/c
    //   78: monitorenter
    //   79: getstatic b/f/c.i : I
    //   82: bipush #10
    //   84: if_icmpge -> 127
    //   87: aload_1
    //   88: iconst_0
    //   89: getstatic b/f/c.h : [Ljava/lang/Object;
    //   92: aastore
    //   93: aload_1
    //   94: iconst_1
    //   95: aload_0
    //   96: aastore
    //   97: iinc #2, -1
    //   100: iload_2
    //   101: iconst_2
    //   102: if_icmplt -> 115
    //   105: aload_1
    //   106: iload_2
    //   107: aconst_null
    //   108: aastore
    //   109: iinc #2, -1
    //   112: goto -> 100
    //   115: aload_1
    //   116: putstatic b/f/c.h : [Ljava/lang/Object;
    //   119: getstatic b/f/c.i : I
    //   122: iconst_1
    //   123: iadd
    //   124: putstatic b/f/c.i : I
    //   127: ldc b/f/c
    //   129: monitorexit
    //   130: goto -> 139
    //   133: astore_0
    //   134: ldc b/f/c
    //   136: monitorexit
    //   137: aload_0
    //   138: athrow
    //   139: return
    // Exception table:
    //   from	to	target	type
    //   10	24	64	finally
    //   46	58	64	finally
    //   58	61	64	finally
    //   65	68	64	finally
    //   79	93	133	finally
    //   115	127	133	finally
    //   127	130	133	finally
    //   134	137	133	finally
  }
  
  public final void a(int paramInt) {
    // Byte code:
    //   0: iload_1
    //   1: bipush #8
    //   3: if_icmpne -> 75
    //   6: ldc b/f/c
    //   8: monitorenter
    //   9: getstatic b/f/c.j : [Ljava/lang/Object;
    //   12: ifnull -> 63
    //   15: getstatic b/f/c.j : [Ljava/lang/Object;
    //   18: astore_2
    //   19: aload_0
    //   20: aload_2
    //   21: putfield c : [Ljava/lang/Object;
    //   24: aload_2
    //   25: iconst_0
    //   26: aaload
    //   27: checkcast [Ljava/lang/Object;
    //   30: putstatic b/f/c.j : [Ljava/lang/Object;
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
    //   51: getstatic b/f/c.k : I
    //   54: iconst_1
    //   55: isub
    //   56: putstatic b/f/c.k : I
    //   59: ldc b/f/c
    //   61: monitorexit
    //   62: return
    //   63: ldc b/f/c
    //   65: monitorexit
    //   66: goto -> 149
    //   69: astore_2
    //   70: ldc b/f/c
    //   72: monitorexit
    //   73: aload_2
    //   74: athrow
    //   75: iload_1
    //   76: iconst_4
    //   77: if_icmpne -> 149
    //   80: ldc b/f/c
    //   82: monitorenter
    //   83: getstatic b/f/c.h : [Ljava/lang/Object;
    //   86: ifnull -> 137
    //   89: getstatic b/f/c.h : [Ljava/lang/Object;
    //   92: astore_2
    //   93: aload_0
    //   94: aload_2
    //   95: putfield c : [Ljava/lang/Object;
    //   98: aload_2
    //   99: iconst_0
    //   100: aaload
    //   101: checkcast [Ljava/lang/Object;
    //   104: putstatic b/f/c.h : [Ljava/lang/Object;
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
    //   125: getstatic b/f/c.i : I
    //   128: iconst_1
    //   129: isub
    //   130: putstatic b/f/c.i : I
    //   133: ldc b/f/c
    //   135: monitorexit
    //   136: return
    //   137: ldc b/f/c
    //   139: monitorexit
    //   140: goto -> 149
    //   143: astore_2
    //   144: ldc b/f/c
    //   146: monitorexit
    //   147: aload_2
    //   148: athrow
    //   149: aload_0
    //   150: iload_1
    //   151: newarray int
    //   153: putfield b : [I
    //   156: aload_0
    //   157: iload_1
    //   158: anewarray java/lang/Object
    //   161: putfield c : [Ljava/lang/Object;
    //   164: return
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
  
  public boolean add(E paramE) {
    int j;
    if (paramE == null) {
      i = d();
      j = 0;
    } else {
      j = paramE.hashCode();
      i = c(paramE, j);
    } 
    if (i >= 0)
      return false; 
    int k = i ^ 0xFFFFFFFF;
    int m = this.d;
    if (m >= this.b.length) {
      i = 4;
      if (m >= 8) {
        i = (m >> 1) + m;
      } else if (m >= 4) {
        i = 8;
      } 
      int[] arrayOfInt2 = this.b;
      Object[] arrayOfObject = this.c;
      a(i);
      int[] arrayOfInt1 = this.b;
      if (arrayOfInt1.length > 0) {
        System.arraycopy(arrayOfInt2, 0, arrayOfInt1, 0, arrayOfInt2.length);
        System.arraycopy(arrayOfObject, 0, this.c, 0, arrayOfObject.length);
      } 
      b(arrayOfInt2, arrayOfObject, this.d);
    } 
    int i = this.d;
    if (k < i) {
      int[] arrayOfInt = this.b;
      m = k + 1;
      System.arraycopy(arrayOfInt, k, arrayOfInt, m, i - k);
      Object[] arrayOfObject = this.c;
      System.arraycopy(arrayOfObject, k, arrayOfObject, m, this.d - k);
    } 
    this.b[k] = j;
    this.c[k] = paramE;
    this.d++;
    return true;
  }
  
  public boolean addAll(Collection<? extends E> paramCollection) {
    int i = this.d;
    int j = paramCollection.size() + i;
    int[] arrayOfInt = this.b;
    i = arrayOfInt.length;
    boolean bool = false;
    if (i < j) {
      Object[] arrayOfObject = this.c;
      a(j);
      i = this.d;
      if (i > 0) {
        System.arraycopy(arrayOfInt, 0, this.b, 0, i);
        System.arraycopy(arrayOfObject, 0, this.c, 0, this.d);
      } 
      b(arrayOfInt, arrayOfObject, this.d);
    } 
    Iterator<? extends E> iterator = paramCollection.iterator();
    while (iterator.hasNext())
      bool |= add(iterator.next()); 
    return bool;
  }
  
  public final int c(Object paramObject, int paramInt) {
    int j = this.d;
    if (j == 0)
      return -1; 
    int k = d.a(this.b, j, paramInt);
    if (k < 0)
      return k; 
    if (paramObject.equals(this.c[k]))
      return k; 
    int i;
    for (i = k + 1; i < j && this.b[i] == paramInt; i++) {
      if (paramObject.equals(this.c[i]))
        return i; 
    } 
    for (j = k - 1; j >= 0 && this.b[j] == paramInt; j--) {
      if (paramObject.equals(this.c[j]))
        return j; 
    } 
    return i ^ 0xFFFFFFFF;
  }
  
  public void clear() {
    int i = this.d;
    if (i != 0) {
      b(this.b, this.c, i);
      this.b = f;
      this.c = g;
      this.d = 0;
    } 
  }
  
  public boolean contains(Object paramObject) {
    boolean bool;
    if (indexOf(paramObject) >= 0) {
      bool = true;
    } else {
      bool = false;
    } 
    return bool;
  }
  
  public boolean containsAll(Collection<?> paramCollection) {
    Iterator<?> iterator = paramCollection.iterator();
    while (iterator.hasNext()) {
      if (!contains(iterator.next()))
        return false; 
    } 
    return true;
  }
  
  public final int d() {
    int j = this.d;
    if (j == 0)
      return -1; 
    int k = d.a(this.b, j, 0);
    if (k < 0)
      return k; 
    if (this.c[k] == null)
      return k; 
    int i;
    for (i = k + 1; i < j && this.b[i] == 0; i++) {
      if (this.c[i] == null)
        return i; 
    } 
    for (j = k - 1; j >= 0 && this.b[j] == 0; j--) {
      if (this.c[j] == null)
        return j; 
    } 
    return i ^ 0xFFFFFFFF;
  }
  
  public E e(int paramInt) {
    Object[] arrayOfObject = this.c;
    Object object = arrayOfObject[paramInt];
    int i = this.d;
    if (i <= 1) {
      b(this.b, arrayOfObject, i);
      this.b = f;
      this.c = g;
      this.d = 0;
    } else {
      int[] arrayOfInt = this.b;
      int k = arrayOfInt.length;
      int j = 8;
      if (k > 8 && i < arrayOfInt.length / 3) {
        if (i > 8)
          j = i + (i >> 1); 
        arrayOfInt = this.b;
        Object[] arrayOfObject1 = this.c;
        a(j);
        this.d--;
        if (paramInt > 0) {
          System.arraycopy(arrayOfInt, 0, this.b, 0, paramInt);
          System.arraycopy(arrayOfObject1, 0, this.c, 0, paramInt);
        } 
        i = this.d;
        if (paramInt < i) {
          j = paramInt + 1;
          System.arraycopy(arrayOfInt, j, this.b, paramInt, i - paramInt);
          System.arraycopy(arrayOfObject1, j, this.c, paramInt, this.d - paramInt);
        } 
      } else {
        j = this.d - 1;
        this.d = j;
        if (paramInt < j) {
          arrayOfInt = this.b;
          i = paramInt + 1;
          System.arraycopy(arrayOfInt, i, arrayOfInt, paramInt, j - paramInt);
          Object[] arrayOfObject1 = this.c;
          System.arraycopy(arrayOfObject1, i, arrayOfObject1, paramInt, this.d - paramInt);
        } 
        this.c[this.d] = null;
      } 
    } 
    return (E)object;
  }
  
  public boolean equals(Object paramObject) {
    if (this == paramObject)
      return true; 
    if (paramObject instanceof Set) {
      paramObject = paramObject;
      if (this.d != paramObject.size())
        return false; 
      byte b = 0;
      try {
        while (b < this.d) {
          boolean bool = paramObject.contains(this.c[b]);
          if (!bool)
            return false; 
          b++;
        } 
        return true;
      } catch (NullPointerException|ClassCastException nullPointerException) {}
    } 
    return false;
  }
  
  public int hashCode() {
    int[] arrayOfInt = this.b;
    int j = this.d;
    byte b = 0;
    int i = 0;
    while (b < j) {
      i += arrayOfInt[b];
      b++;
    } 
    return i;
  }
  
  public int indexOf(Object paramObject) {
    int i;
    if (paramObject == null) {
      i = d();
    } else {
      i = c(paramObject, paramObject.hashCode());
    } 
    return i;
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
  
  public Iterator<E> iterator() {
    if (this.e == null)
      this.e = new b(this); 
    g<E, E> g1 = this.e;
    if (g1.b == null)
      g1.b = new g.c(g1); 
    return g1.b.iterator();
  }
  
  public boolean remove(Object paramObject) {
    int i = indexOf(paramObject);
    if (i >= 0) {
      e(i);
      return true;
    } 
    return false;
  }
  
  public boolean removeAll(Collection<?> paramCollection) {
    Iterator<?> iterator = paramCollection.iterator();
    boolean bool;
    for (bool = false; iterator.hasNext(); bool |= remove(iterator.next()));
    return bool;
  }
  
  public boolean retainAll(Collection<?> paramCollection) {
    int i = this.d - 1;
    boolean bool = false;
    while (i >= 0) {
      if (!paramCollection.contains(this.c[i])) {
        e(i);
        bool = true;
      } 
      i--;
    } 
    return bool;
  }
  
  public int size() {
    return this.d;
  }
  
  public Object[] toArray() {
    int i = this.d;
    Object[] arrayOfObject = new Object[i];
    System.arraycopy(this.c, 0, arrayOfObject, 0, i);
    return arrayOfObject;
  }
  
  public <T> T[] toArray(T[] paramArrayOfT) {
    T[] arrayOfT = paramArrayOfT;
    if (paramArrayOfT.length < this.d)
      arrayOfT = (T[])Array.newInstance(paramArrayOfT.getClass().getComponentType(), this.d); 
    System.arraycopy(this.c, 0, arrayOfT, 0, this.d);
    int i = arrayOfT.length;
    int j = this.d;
    if (i > j)
      arrayOfT[j] = null; 
    return arrayOfT;
  }
  
  public String toString() {
    if (isEmpty())
      return "{}"; 
    StringBuilder stringBuilder = new StringBuilder(this.d * 14);
    stringBuilder.append('{');
    for (byte b = 0; b < this.d; b++) {
      if (b > 0)
        stringBuilder.append(", "); 
      Object object = this.c[b];
      if (object != this) {
        stringBuilder.append(object);
      } else {
        stringBuilder.append("(this Set)");
      } 
    } 
    stringBuilder.append('}');
    return stringBuilder.toString();
  }
}


/* Location:              C:\Users\panch\Downloads\dvba_v1.1.0-dex2jar.jar!\b\f\c.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */