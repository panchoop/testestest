package c.c.a.a.f.c;

import java.util.Iterator;
import org.checkerframework.checker.nullness.compatqual.NullableDecl;

public final class x<K> extends q<K> {
  public final transient o<K, ?> d;
  
  public final transient n<K> e;
  
  public x(o<K, ?> paramo, n<K> paramn) {
    this.d = paramo;
    this.e = paramn;
  }
  
  public final int a(Object[] paramArrayOfObject, int paramInt) {
    return this.e.a(paramArrayOfObject, paramInt);
  }
  
  public final y<K> b() {
    return (y<K>)this.e.iterator();
  }
  
  public final boolean contains(@NullableDecl Object paramObject) {
    return (this.d.get(paramObject) != null);
  }
  
  public final n<K> f() {
    return this.e;
  }
  
  public final int size() {
    return this.d.size();
  }
}


/* Location:              C:\Users\panch\Downloads\dvba_v1.1.0-dex2jar.jar!\c\c\a\a\f\c\x.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */