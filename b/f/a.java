package b.f;

import java.util.Collection;
import java.util.Map;
import java.util.Set;

public class a<K, V> extends h<K, V> implements Map<K, V> {
  public g<K, V> i;
  
  public a() {}
  
  public a(int paramInt) {
    super(paramInt);
  }
  
  public a(h paramh) {
    if (paramh != null) {
      int i = paramh.d;
      b(this.d + i);
      int j = this.d;
      byte b = 0;
      if (j == 0) {
        if (i > 0) {
          System.arraycopy(paramh.b, 0, this.b, 0, i);
          System.arraycopy(paramh.c, 0, this.c, 0, i << 1);
          this.d = i;
        } 
      } else {
        while (b < i) {
          put((K)paramh.h(b), (V)paramh.k(b));
          b++;
        } 
      } 
    } 
  }
  
  public Set<Map.Entry<K, V>> entrySet() {
    g<K, V> g1 = l();
    if (g1.a == null)
      g1.a = new g.b(g1); 
    return g1.a;
  }
  
  public Set<K> keySet() {
    g<K, V> g1 = l();
    if (g1.b == null)
      g1.b = new g.c(g1); 
    return g1.b;
  }
  
  public final g<K, V> l() {
    if (this.i == null)
      this.i = new a(this); 
    return this.i;
  }
  
  public void putAll(Map<? extends K, ? extends V> paramMap) {
    int i = this.d;
    b(paramMap.size() + i);
    for (Map.Entry<? extends K, ? extends V> entry : paramMap.entrySet())
      put((K)entry.getKey(), (V)entry.getValue()); 
  }
  
  public Collection<V> values() {
    g<K, V> g1 = l();
    if (g1.c == null)
      g1.c = new g.e(g1); 
    return g1.c;
  }
  
  public class a extends g<K, V> {
    public final a d;
    
    public a(a this$0) {}
    
    public void a() {
      this.d.clear();
    }
    
    public Object b(int param1Int1, int param1Int2) {
      return this.d.c[(param1Int1 << 1) + param1Int2];
    }
    
    public Map<K, V> c() {
      return this.d;
    }
    
    public int d() {
      return this.d.d;
    }
    
    public int e(Object param1Object) {
      return this.d.e(param1Object);
    }
    
    public int f(Object param1Object) {
      return this.d.g(param1Object);
    }
    
    public void g(K param1K, V param1V) {
      this.d.put(param1K, param1V);
    }
    
    public void h(int param1Int) {
      this.d.i(param1Int);
    }
    
    public V i(int param1Int, V param1V) {
      a a1 = this.d;
      param1Int = (param1Int << 1) + 1;
      Object[] arrayOfObject = a1.c;
      Object object = arrayOfObject[param1Int];
      arrayOfObject[param1Int] = param1V;
      return (V)object;
    }
  }
}


/* Location:              C:\Users\panch\Downloads\dvba_v1.1.0-dex2jar.jar!\b\f\a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */