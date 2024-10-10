package b.c.a.b;

import java.util.HashMap;

public class a<K, V> extends b<K, V> {
  public HashMap<K, b.c<K, V>> f = new HashMap<K, b.c<K, V>>();
  
  public b.c<K, V> a(K paramK) {
    return this.f.get(paramK);
  }
  
  public boolean contains(K paramK) {
    return this.f.containsKey(paramK);
  }
  
  public V d(K paramK) {
    V v = super.d(paramK);
    this.f.remove(paramK);
    return v;
  }
  
  public V e(K paramK, V paramV) {
    b.c c = this.f.get(paramK);
    if (c != null)
      return c.c; 
    this.f.put(paramK, c(paramK, paramV));
    return null;
  }
}


/* Location:              C:\Users\panch\Downloads\dvba_v1.1.0-dex2jar.jar!\b\c\a\b\a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */