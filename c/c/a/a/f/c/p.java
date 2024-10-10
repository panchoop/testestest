package c.c.a.a.f.c;

import c.c.a.a.c.l.q;
import java.util.List;

public final class p extends n<E> {
  public final transient int d;
  
  public final transient int e;
  
  public final n f;
  
  public p(n paramn, int paramInt1, int paramInt2) {
    this.d = paramInt1;
    this.e = paramInt2;
  }
  
  public final Object[] c() {
    return this.f.c();
  }
  
  public final int d() {
    return this.f.d() + this.d;
  }
  
  public final int e() {
    return this.f.d() + this.d + this.e;
  }
  
  public final n<E> f(int paramInt1, int paramInt2) {
    q.u0(paramInt1, paramInt2, this.e);
    n n1 = this.f;
    int i = this.d;
    return (n<E>)n1.subList(paramInt1 + i, paramInt2 + i);
  }
  
  public final E get(int paramInt) {
    q.m0(paramInt, this.e);
    return this.f.get(paramInt + this.d);
  }
  
  public final int size() {
    return this.e;
  }
}


/* Location:              C:\Users\panch\Downloads\dvba_v1.1.0-dex2jar.jar!\c\c\a\a\f\c\p.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */