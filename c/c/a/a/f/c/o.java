package c.c.a.a.f.c;

import c.c.a.a.c.l.q;
import java.io.Serializable;
import java.util.Collection;
import java.util.Map;
import java.util.Set;
import org.checkerframework.checker.nullness.compatqual.NullableDecl;

public abstract class o<K, V> implements Serializable, Map<K, V> {
  public transient q<Map.Entry<K, V>> b;
  
  public transient q<K> c;
  
  public transient l<V> d;
  
  @Deprecated
  public final void clear() {
    throw new UnsupportedOperationException();
  }
  
  public boolean containsKey(@NullableDecl Object paramObject) {
    return (get(paramObject) != null);
  }
  
  public boolean containsValue(@NullableDecl Object paramObject) {
    return ((l)values()).contains(paramObject);
  }
  
  public Set entrySet() {
    v<Object, Object> v;
    q<Map.Entry<K, V>> q1 = this.b;
    if (q1 == null) {
      s s = (s)this;
      v = new v<Object, Object>(s, s.f, s.g);
      this.b = (q)v;
      return v;
    } 
    return v;
  }
  
  public boolean equals(@NullableDecl Object paramObject) {
    if (this == paramObject)
      return true; 
    if (paramObject instanceof Map) {
      paramObject = paramObject;
      return super.entrySet().equals(paramObject.entrySet());
    } 
    return false;
  }
  
  public abstract V get(@NullableDecl Object paramObject);
  
  public final V getOrDefault(@NullableDecl Object paramObject, @NullableDecl V paramV) {
    paramObject = get(paramObject);
    return (V)((paramObject != null) ? paramObject : (Object)paramV);
  }
  
  public int hashCode() {
    return q.o0(entrySet());
  }
  
  public boolean isEmpty() {
    return (size() == 0);
  }
  
  public Set keySet() {
    q<K> q1 = this.c;
    if (q1 == null) {
      s<?, ?> s = (s)this;
      q1 = new x(s, new w(s.f, 0, s.g));
      this.c = q1;
      return q1;
    } 
    return q1;
  }
  
  @Deprecated
  public final V put(K paramK, V paramV) {
    throw new UnsupportedOperationException();
  }
  
  @Deprecated
  public final void putAll(Map<? extends K, ? extends V> paramMap) {
    throw new UnsupportedOperationException();
  }
  
  @Deprecated
  public final V remove(Object paramObject) {
    throw new UnsupportedOperationException();
  }
  
  public String toString() {
    int i = size();
    if (i >= 0) {
      StringBuilder stringBuilder1 = new StringBuilder((int)Math.min(i << 3L, 1073741824L));
      stringBuilder1.append('{');
      i = 1;
      for (Map.Entry<?, ?> entry : super.entrySet()) {
        if (i == 0)
          stringBuilder1.append(", "); 
        i = 0;
        stringBuilder1.append(entry.getKey());
        stringBuilder1.append('=');
        stringBuilder1.append(entry.getValue());
      } 
      stringBuilder1.append('}');
      return stringBuilder1.toString();
    } 
    StringBuilder stringBuilder = new StringBuilder("size".length() + 40);
    stringBuilder.append("size");
    stringBuilder.append(" cannot be negative but was: ");
    stringBuilder.append(i);
    throw new IllegalArgumentException(stringBuilder.toString());
  }
  
  public Collection values() {
    l<V> l1 = this.d;
    if (l1 == null) {
      s s = (s)this;
      l1 = new w(s.f, 1, s.g);
      this.d = l1;
      return l1;
    } 
    return l1;
  }
}


/* Location:              C:\Users\panch\Downloads\dvba_v1.1.0-dex2jar.jar!\c\c\a\a\f\c\o.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */