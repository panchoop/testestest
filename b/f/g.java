package b.f;

import java.lang.reflect.Array;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Set;

public abstract class g<K, V> {
  public b a;
  
  public c b;
  
  public e c;
  
  public static <T> boolean j(Set<T> paramSet, Object paramObject) {
    boolean bool = true;
    if (paramSet == paramObject)
      return true; 
    if (paramObject instanceof Set) {
      paramObject = paramObject;
      try {
        if (paramSet.size() == paramObject.size()) {
          boolean bool1 = paramSet.containsAll((Collection<?>)paramObject);
          if (bool1)
            return bool; 
        } 
        return false;
      } catch (NullPointerException|ClassCastException nullPointerException) {}
    } 
    return false;
  }
  
  public static <K, V> boolean k(Map<K, V> paramMap, Collection<?> paramCollection) {
    boolean bool;
    int i = paramMap.size();
    Iterator iterator = paramMap.keySet().iterator();
    while (iterator.hasNext()) {
      if (!paramCollection.contains(iterator.next()))
        iterator.remove(); 
    } 
    if (i != paramMap.size()) {
      bool = true;
    } else {
      bool = false;
    } 
    return bool;
  }
  
  public abstract void a();
  
  public abstract Object b(int paramInt1, int paramInt2);
  
  public abstract Map<K, V> c();
  
  public abstract int d();
  
  public abstract int e(Object paramObject);
  
  public abstract int f(Object paramObject);
  
  public abstract void g(K paramK, V paramV);
  
  public abstract void h(int paramInt);
  
  public abstract V i(int paramInt, V paramV);
  
  public Object[] l(int paramInt) {
    int i = d();
    Object[] arrayOfObject = new Object[i];
    for (byte b1 = 0; b1 < i; b1++)
      arrayOfObject[b1] = b(b1, paramInt); 
    return arrayOfObject;
  }
  
  public <T> T[] m(T[] paramArrayOfT, int paramInt) {
    int i = d();
    T[] arrayOfT = paramArrayOfT;
    if (paramArrayOfT.length < i)
      arrayOfT = (T[])Array.newInstance(paramArrayOfT.getClass().getComponentType(), i); 
    for (byte b1 = 0; b1 < i; b1++)
      arrayOfT[b1] = (T)b(b1, paramInt); 
    if (arrayOfT.length > i)
      arrayOfT[i] = null; 
    return arrayOfT;
  }
  
  public final class a<T> implements Iterator<T> {
    public final int b;
    
    public int c;
    
    public int d;
    
    public boolean e = false;
    
    public final g f;
    
    public a(g this$0, int param1Int) {
      this.b = param1Int;
      this.c = this$0.d();
    }
    
    public boolean hasNext() {
      boolean bool;
      if (this.d < this.c) {
        bool = true;
      } else {
        bool = false;
      } 
      return bool;
    }
    
    public T next() {
      if (hasNext()) {
        Object object = this.f.b(this.d, this.b);
        this.d++;
        this.e = true;
        return (T)object;
      } 
      throw new NoSuchElementException();
    }
    
    public void remove() {
      if (this.e) {
        int i = this.d - 1;
        this.d = i;
        this.c--;
        this.e = false;
        this.f.h(i);
        return;
      } 
      throw new IllegalStateException();
    }
  }
  
  public final class b implements Set<Map.Entry<K, V>> {
    public final g b;
    
    public b(g this$0) {}
    
    public boolean add(Object param1Object) {
      param1Object = param1Object;
      throw new UnsupportedOperationException();
    }
    
    public boolean addAll(Collection<? extends Map.Entry<K, V>> param1Collection) {
      boolean bool;
      int i = this.b.d();
      for (Map.Entry<K, V> entry : param1Collection)
        this.b.g(entry.getKey(), entry.getValue()); 
      if (i != this.b.d()) {
        bool = true;
      } else {
        bool = false;
      } 
      return bool;
    }
    
    public void clear() {
      this.b.a();
    }
    
    public boolean contains(Object param1Object) {
      if (!(param1Object instanceof Map.Entry))
        return false; 
      param1Object = param1Object;
      int i = this.b.e(param1Object.getKey());
      return (i < 0) ? false : d.c(this.b.b(i, 1), param1Object.getValue());
    }
    
    public boolean containsAll(Collection<?> param1Collection) {
      Iterator<?> iterator = param1Collection.iterator();
      while (iterator.hasNext()) {
        if (!contains(iterator.next()))
          return false; 
      } 
      return true;
    }
    
    public boolean equals(Object param1Object) {
      return g.j(this, param1Object);
    }
    
    public int hashCode() {
      int i = this.b.d() - 1;
      int j = 0;
      while (i >= 0) {
        int k;
        int m;
        Object object2 = this.b.b(i, 0);
        Object object1 = this.b.b(i, 1);
        if (object2 == null) {
          k = 0;
        } else {
          k = object2.hashCode();
        } 
        if (object1 == null) {
          m = 0;
        } else {
          m = object1.hashCode();
        } 
        j += k ^ m;
        i--;
      } 
      return j;
    }
    
    public boolean isEmpty() {
      boolean bool;
      if (this.b.d() == 0) {
        bool = true;
      } else {
        bool = false;
      } 
      return bool;
    }
    
    public Iterator<Map.Entry<K, V>> iterator() {
      return new g.d(this.b);
    }
    
    public boolean remove(Object param1Object) {
      throw new UnsupportedOperationException();
    }
    
    public boolean removeAll(Collection<?> param1Collection) {
      throw new UnsupportedOperationException();
    }
    
    public boolean retainAll(Collection<?> param1Collection) {
      throw new UnsupportedOperationException();
    }
    
    public int size() {
      return this.b.d();
    }
    
    public Object[] toArray() {
      throw new UnsupportedOperationException();
    }
    
    public <T> T[] toArray(T[] param1ArrayOfT) {
      throw new UnsupportedOperationException();
    }
  }
  
  public final class c implements Set<K> {
    public final g b;
    
    public c(g this$0) {}
    
    public boolean add(K param1K) {
      throw new UnsupportedOperationException();
    }
    
    public boolean addAll(Collection<? extends K> param1Collection) {
      throw new UnsupportedOperationException();
    }
    
    public void clear() {
      this.b.a();
    }
    
    public boolean contains(Object param1Object) {
      boolean bool;
      if (this.b.e(param1Object) >= 0) {
        bool = true;
      } else {
        bool = false;
      } 
      return bool;
    }
    
    public boolean containsAll(Collection<?> param1Collection) {
      // Byte code:
      //   0: aload_0
      //   1: getfield b : Lb/f/g;
      //   4: invokevirtual c : ()Ljava/util/Map;
      //   7: astore_3
      //   8: aload_1
      //   9: invokeinterface iterator : ()Ljava/util/Iterator;
      //   14: astore_1
      //   15: aload_1
      //   16: invokeinterface hasNext : ()Z
      //   21: ifeq -> 44
      //   24: aload_3
      //   25: aload_1
      //   26: invokeinterface next : ()Ljava/lang/Object;
      //   31: invokeinterface containsKey : (Ljava/lang/Object;)Z
      //   36: ifne -> 15
      //   39: iconst_0
      //   40: istore_2
      //   41: goto -> 46
      //   44: iconst_1
      //   45: istore_2
      //   46: iload_2
      //   47: ireturn
    }
    
    public boolean equals(Object param1Object) {
      return g.j(this, param1Object);
    }
    
    public int hashCode() {
      int i = this.b.d() - 1;
      int j = 0;
      while (i >= 0) {
        int k;
        Object object = this.b.b(i, 0);
        if (object == null) {
          k = 0;
        } else {
          k = object.hashCode();
        } 
        j += k;
        i--;
      } 
      return j;
    }
    
    public boolean isEmpty() {
      boolean bool;
      if (this.b.d() == 0) {
        bool = true;
      } else {
        bool = false;
      } 
      return bool;
    }
    
    public Iterator<K> iterator() {
      return new g.a<K>(this.b, 0);
    }
    
    public boolean remove(Object param1Object) {
      int i = this.b.e(param1Object);
      if (i >= 0) {
        this.b.h(i);
        return true;
      } 
      return false;
    }
    
    public boolean removeAll(Collection<?> param1Collection) {
      boolean bool;
      Map map = this.b.c();
      int i = map.size();
      Iterator<?> iterator = param1Collection.iterator();
      while (iterator.hasNext())
        map.remove(iterator.next()); 
      if (i != map.size()) {
        bool = true;
      } else {
        bool = false;
      } 
      return bool;
    }
    
    public boolean retainAll(Collection<?> param1Collection) {
      return g.k(this.b.c(), param1Collection);
    }
    
    public int size() {
      return this.b.d();
    }
    
    public Object[] toArray() {
      return this.b.l(0);
    }
    
    public <T> T[] toArray(T[] param1ArrayOfT) {
      return (T[])this.b.m((Object[])param1ArrayOfT, 0);
    }
  }
  
  public final class d implements Iterator<Map.Entry<K, V>>, Map.Entry<K, V> {
    public int b;
    
    public int c;
    
    public boolean d = false;
    
    public final g e;
    
    public d(g this$0) {
      this.b = this$0.d() - 1;
      this.c = -1;
    }
    
    public boolean equals(Object param1Object) {
      if (this.d) {
        boolean bool = param1Object instanceof Map.Entry;
        boolean bool1 = false;
        if (!bool)
          return false; 
        param1Object = param1Object;
        bool = bool1;
        if (d.c(param1Object.getKey(), this.e.b(this.c, 0))) {
          bool = bool1;
          if (d.c(param1Object.getValue(), this.e.b(this.c, 1)))
            bool = true; 
        } 
        return bool;
      } 
      throw new IllegalStateException("This container does not support retaining Map.Entry objects");
    }
    
    public K getKey() {
      if (this.d)
        return (K)this.e.b(this.c, 0); 
      throw new IllegalStateException("This container does not support retaining Map.Entry objects");
    }
    
    public V getValue() {
      if (this.d)
        return (V)this.e.b(this.c, 1); 
      throw new IllegalStateException("This container does not support retaining Map.Entry objects");
    }
    
    public boolean hasNext() {
      boolean bool;
      if (this.c < this.b) {
        bool = true;
      } else {
        bool = false;
      } 
      return bool;
    }
    
    public int hashCode() {
      if (this.d) {
        g g1 = this.e;
        int i = this.c;
        int j = 0;
        Object object1 = g1.b(i, 0);
        Object object2 = this.e.b(this.c, 1);
        if (object1 == null) {
          i = 0;
        } else {
          i = object1.hashCode();
        } 
        if (object2 != null)
          j = object2.hashCode(); 
        return i ^ j;
      } 
      throw new IllegalStateException("This container does not support retaining Map.Entry objects");
    }
    
    public Object next() {
      if (hasNext()) {
        this.c++;
        this.d = true;
        return this;
      } 
      throw new NoSuchElementException();
    }
    
    public void remove() {
      if (this.d) {
        this.e.h(this.c);
        this.c--;
        this.b--;
        this.d = false;
        return;
      } 
      throw new IllegalStateException();
    }
    
    public V setValue(V param1V) {
      if (this.d)
        return (V)this.e.i(this.c, param1V); 
      throw new IllegalStateException("This container does not support retaining Map.Entry objects");
    }
    
    public String toString() {
      StringBuilder stringBuilder = new StringBuilder();
      stringBuilder.append(getKey());
      stringBuilder.append("=");
      stringBuilder.append(getValue());
      return stringBuilder.toString();
    }
  }
  
  public final class e implements Collection<V> {
    public final g b;
    
    public e(g this$0) {}
    
    public boolean add(V param1V) {
      throw new UnsupportedOperationException();
    }
    
    public boolean addAll(Collection<? extends V> param1Collection) {
      throw new UnsupportedOperationException();
    }
    
    public void clear() {
      this.b.a();
    }
    
    public boolean contains(Object param1Object) {
      boolean bool;
      if (this.b.f(param1Object) >= 0) {
        bool = true;
      } else {
        bool = false;
      } 
      return bool;
    }
    
    public boolean containsAll(Collection<?> param1Collection) {
      Iterator<?> iterator = param1Collection.iterator();
      while (iterator.hasNext()) {
        if (!contains(iterator.next()))
          return false; 
      } 
      return true;
    }
    
    public boolean isEmpty() {
      boolean bool;
      if (this.b.d() == 0) {
        bool = true;
      } else {
        bool = false;
      } 
      return bool;
    }
    
    public Iterator<V> iterator() {
      return new g.a<V>(this.b, 1);
    }
    
    public boolean remove(Object param1Object) {
      int i = this.b.f(param1Object);
      if (i >= 0) {
        this.b.h(i);
        return true;
      } 
      return false;
    }
    
    public boolean removeAll(Collection<?> param1Collection) {
      int j = this.b.d();
      int i = 0;
      boolean bool = false;
      while (i < j) {
        int k = j;
        int m = i;
        if (param1Collection.contains(this.b.b(i, 1))) {
          this.b.h(i);
          m = i - 1;
          k = j - 1;
          bool = true;
        } 
        i = m + 1;
        j = k;
      } 
      return bool;
    }
    
    public boolean retainAll(Collection<?> param1Collection) {
      int j = this.b.d();
      int i = 0;
      boolean bool = false;
      while (i < j) {
        int k = j;
        int m = i;
        if (!param1Collection.contains(this.b.b(i, 1))) {
          this.b.h(i);
          m = i - 1;
          k = j - 1;
          bool = true;
        } 
        i = m + 1;
        j = k;
      } 
      return bool;
    }
    
    public int size() {
      return this.b.d();
    }
    
    public Object[] toArray() {
      return this.b.l(1);
    }
    
    public <T> T[] toArray(T[] param1ArrayOfT) {
      return (T[])this.b.m((Object[])param1ArrayOfT, 1);
    }
  }
}


/* Location:              C:\Users\panch\Downloads\dvba_v1.1.0-dex2jar.jar!\b\f\g.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */