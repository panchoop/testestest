package c.c.a.a.h;

import c.c.a.a.c.l.q;

public class e<TResult> {
  public final t<TResult> a = new t<TResult>();
  
  public boolean a(Exception paramException) {
    t<TResult> t1 = this.a;
    if (t1 != null) {
      q.g(paramException, "Exception must not be null");
      synchronized (t1.a) {
        boolean bool;
        if (t1.c) {
          bool = false;
        } else {
          t1.c = true;
          t1.f = paramException;
          t1.b.a(t1);
          bool = true;
        } 
        return bool;
      } 
    } 
    throw null;
  }
}


/* Location:              C:\Users\panch\Downloads\dvba_v1.1.0-dex2jar.jar!\c\c\a\a\h\e.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */