package c.c.a.a.f.c;

import c.c.a.a.c.l.q;

public final class t<E> extends n<E> {
  public static final n<Object> f = new t(new Object[0], 0);
  
  public final transient Object[] d;
  
  public final transient int e;
  
  public t(Object[] paramArrayOfObject, int paramInt) {
    this.d = paramArrayOfObject;
    this.e = paramInt;
  }
  
  public final int a(Object[] paramArrayOfObject, int paramInt) {
    System.arraycopy(this.d, 0, paramArrayOfObject, paramInt, this.e);
    return paramInt + this.e;
  }
  
  public final Object[] c() {
    return this.d;
  }
  
  public final int d() {
    return 0;
  }
  
  public final int e() {
    return this.e;
  }
  
  public final E get(int paramInt) {
    q.m0(paramInt, this.e);
    return (E)this.d[paramInt];
  }
  
  public final int size() {
    return this.e;
  }
}


/* Location:              C:\Users\panch\Downloads\dvba_v1.1.0-dex2jar.jar!\c\c\a\a\f\c\t.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */