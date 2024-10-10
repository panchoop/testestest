package c.c.a.a.f.c;

import c.c.a.a.c.l.q;

public final class w extends n<Object> {
  public final transient Object[] d;
  
  public final transient int e;
  
  public final transient int f;
  
  public w(Object[] paramArrayOfObject, int paramInt1, int paramInt2) {
    this.d = paramArrayOfObject;
    this.e = paramInt1;
    this.f = paramInt2;
  }
  
  public final Object get(int paramInt) {
    q.m0(paramInt, this.f);
    return this.d[paramInt * 2 + this.e];
  }
  
  public final int size() {
    return this.f;
  }
}


/* Location:              C:\Users\panch\Downloads\dvba_v1.1.0-dex2jar.jar!\c\c\a\a\f\c\w.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */