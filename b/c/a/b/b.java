package b.c.a.b;

import java.util.Iterator;
import java.util.Map;
import java.util.WeakHashMap;

public class b<K, V> implements Iterable<Map.Entry<K, V>> {
  public c<K, V> b;
  
  public c<K, V> c;
  
  public WeakHashMap<f<K, V>, Boolean> d = new WeakHashMap<f<K, V>, Boolean>();
  
  public int e = 0;
  
  public c<K, V> a(K paramK) {
    c<K, V> c1;
    for (c1 = this.b; c1 != null && !c1.b.equals(paramK); c1 = c1.d);
    return c1;
  }
  
  public d b() {
    d d = new d(this);
    this.d.put(d, Boolean.FALSE);
    return d;
  }
  
  public c<K, V> c(K paramK, V paramV) {
    c<K, V> c1 = new c<K, V>(paramK, paramV);
    this.e++;
    c<K, V> c2 = this.c;
    if (c2 == null) {
      this.b = c1;
      this.c = c1;
      return c1;
    } 
    c2.d = c1;
    c1.e = c2;
    this.c = c1;
    return c1;
  }
  
  public V d(K paramK) {
    c<K, V> c1 = a(paramK);
    if (c1 == null)
      return null; 
    this.e--;
    if (!this.d.isEmpty()) {
      Iterator<f<K, V>> iterator = this.d.keySet().iterator();
      while (iterator.hasNext())
        ((f<K, V>)iterator.next()).a(c1); 
    } 
    c<K, V> c2 = c1.e;
    if (c2 != null) {
      c2.d = c1.d;
    } else {
      this.b = c1.d;
    } 
    c2 = c1.d;
    if (c2 != null) {
      c2.e = c1.e;
    } else {
      this.c = c1.e;
    } 
    c1.d = null;
    c1.e = null;
    return c1.c;
  }
  
  public boolean equals(Object<Map.Entry<K, V>> paramObject) {
    Map.Entry entry;
    boolean bool = true;
    if (paramObject == this)
      return true; 
    if (!(paramObject instanceof b))
      return false; 
    b b1 = (b)paramObject;
    if (this.e != b1.e)
      return false; 
    paramObject = (Object<Map.Entry<K, V>>)iterator();
    Iterator iterator = b1.iterator();
    while (true) {
      e e = (e)paramObject;
      if (e.hasNext()) {
        e e1 = (e)iterator;
        if (e1.hasNext()) {
          entry = (Map.Entry)e.next();
          Object object = e1.next();
          if ((entry == null && object != null) || (entry != null && !entry.equals(object)))
            return false; 
          continue;
        } 
      } 
      break;
    } 
    if (entry.hasNext() || ((e)iterator).hasNext())
      bool = false; 
    return bool;
  }
  
  public int hashCode() {
    Iterator<Map.Entry<K, V>> iterator = iterator();
    int i = 0;
    while (true) {
      e e = (e)iterator;
      if (e.hasNext()) {
        i += ((Map.Entry)e.next()).hashCode();
        continue;
      } 
      return i;
    } 
  }
  
  public Iterator<Map.Entry<K, V>> iterator() {
    a<K, V> a = new a<K, V>(this.b, this.c);
    this.d.put(a, Boolean.FALSE);
    return a;
  }
  
  public String toString() {
    StringBuilder stringBuilder = c.a.a.a.a.e("[");
    Iterator<Map.Entry<K, V>> iterator = iterator();
    while (true) {
      e e = (e)iterator;
      if (e.hasNext()) {
        stringBuilder.append(((Map.Entry)e.next()).toString());
        if (e.hasNext())
          stringBuilder.append(", "); 
        continue;
      } 
      stringBuilder.append("]");
      return stringBuilder.toString();
    } 
  }
  
  public static class a<K, V> extends e<K, V> {
    public a(b.c<K, V> param1c1, b.c<K, V> param1c2) {
      super(param1c1, param1c2);
    }
    
    public b.c<K, V> b(b.c<K, V> param1c) {
      return param1c.e;
    }
    
    public b.c<K, V> c(b.c<K, V> param1c) {
      return param1c.d;
    }
  }
  
  public static class b<K, V> extends e<K, V> {
    public b(b.c<K, V> param1c1, b.c<K, V> param1c2) {
      super(param1c1, param1c2);
    }
    
    public b.c<K, V> b(b.c<K, V> param1c) {
      return param1c.d;
    }
    
    public b.c<K, V> c(b.c<K, V> param1c) {
      return param1c.e;
    }
  }
  
  public static class c<K, V> implements Map.Entry<K, V> {
    public final K b;
    
    public final V c;
    
    public c<K, V> d;
    
    public c<K, V> e;
    
    public c(K param1K, V param1V) {
      this.b = param1K;
      this.c = param1V;
    }
    
    public boolean equals(Object param1Object) {
      boolean bool = true;
      if (param1Object == this)
        return true; 
      if (!(param1Object instanceof c))
        return false; 
      param1Object = param1Object;
      if (!this.b.equals(((c)param1Object).b) || !this.c.equals(((c)param1Object).c))
        bool = false; 
      return bool;
    }
    
    public K getKey() {
      return this.b;
    }
    
    public V getValue() {
      return this.c;
    }
    
    public int hashCode() {
      return this.b.hashCode() ^ this.c.hashCode();
    }
    
    public V setValue(V param1V) {
      throw new UnsupportedOperationException("An entry modification is not supported");
    }
    
    public String toString() {
      StringBuilder stringBuilder = new StringBuilder();
      stringBuilder.append(this.b);
      stringBuilder.append("=");
      stringBuilder.append(this.c);
      return stringBuilder.toString();
    }
  }
  
  public class d implements Iterator<Map.Entry<K, V>>, f<K, V> {
    public b.c<K, V> b;
    
    public boolean c = true;
    
    public final b d;
    
    public d(b this$0) {}
    
    public void a(b.c<K, V> param1c) {
      b.c<K, V> c1 = this.b;
      if (param1c == c1) {
        boolean bool;
        param1c = c1.e;
        this.b = param1c;
        if (param1c == null) {
          bool = true;
        } else {
          bool = false;
        } 
        this.c = bool;
      } 
    }
    
    public boolean hasNext() {
      boolean bool = this.c;
      boolean bool1 = true;
      boolean bool2 = true;
      if (bool) {
        if (this.d.b != null) {
          bool1 = bool2;
        } else {
          bool1 = false;
        } 
        return bool1;
      } 
      b.c<K, V> c1 = this.b;
      if (c1 == null || c1.d == null)
        bool1 = false; 
      return bool1;
    }
    
    public Object next() {
      b.c<K, V> c1;
      if (this.c) {
        this.c = false;
        c1 = this.d.b;
      } else {
        c1 = this.b;
        if (c1 != null) {
          c1 = c1.d;
        } else {
          c1 = null;
        } 
      } 
      this.b = c1;
      return c1;
    }
  }
  
  public static abstract class e<K, V> implements Iterator<Map.Entry<K, V>>, f<K, V> {
    public b.c<K, V> b;
    
    public b.c<K, V> c;
    
    public e(b.c<K, V> param1c1, b.c<K, V> param1c2) {
      this.b = param1c2;
      this.c = param1c1;
    }
    
    public void a(b.c<K, V> param1c) {
      b.c<K, V> c2 = this.b;
      b.c<K, V> c1 = null;
      if (c2 == param1c && param1c == this.c) {
        this.c = null;
        this.b = null;
      } 
      c2 = this.b;
      if (c2 == param1c)
        this.b = b(c2); 
      c2 = this.c;
      if (c2 == param1c) {
        b.c<K, V> c3 = this.b;
        param1c = c1;
        if (c2 != c3)
          if (c3 == null) {
            param1c = c1;
          } else {
            param1c = c(c2);
          }  
        this.c = param1c;
      } 
    }
    
    public abstract b.c<K, V> b(b.c<K, V> param1c);
    
    public abstract b.c<K, V> c(b.c<K, V> param1c);
    
    public boolean hasNext() {
      boolean bool;
      if (this.c != null) {
        bool = true;
      } else {
        bool = false;
      } 
      return bool;
    }
    
    public Object next() {
      b.c<K, V> c2 = this.c;
      b.c<K, V> c1 = this.b;
      if (c2 == c1 || c1 == null) {
        c1 = null;
        this.c = c1;
        return c2;
      } 
      c1 = c(c2);
      this.c = c1;
      return c2;
    }
  }
  
  public static interface f<K, V> {
    void a(b.c<K, V> param1c);
  }
}


/* Location:              C:\Users\panch\Downloads\dvba_v1.1.0-dex2jar.jar!\b\c\a\b\b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */