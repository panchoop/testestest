package c.c.b.h.c0.a;

import c.c.a.a.c.c;
import c.c.a.a.c.k.k.k;
import c.c.a.a.c.l.q;
import c.c.a.a.f.c.r0;
import c.c.b.h.c;
import c.c.b.h.d0.c0;
import c.c.b.h.d0.r;
import c.c.b.h.d0.x;
import c.c.b.h.o;

public final class j extends u0<Object, r> {
  public final c w;
  
  public j(c paramc) {
    super(2);
    q.g(paramc, "credential cannot be null");
    this.w = paramc;
    q.e(paramc.b, "email cannot be null");
    q.e(paramc.c, "password cannot be null");
  }
  
  public final String a() {
    return "linkEmailAuthCredential";
  }
  
  public final k<l0, Object> b() {
    k.a a = k.a();
    a.b = false;
    if (this.t || this.u) {
      c[] arrayOfC1 = null;
      a.c = arrayOfC1;
      a.a = new m(this);
      return a.a();
    } 
    c[] arrayOfC = new c[1];
    arrayOfC[0] = r0.b;
    a.c = arrayOfC;
    a.a = new m(this);
    return a.a();
  }
  
  public final void h() {
    c0 c0 = g.f(this.c, this.k);
    ((r)this.e).a(this.j, (o)c0);
    x x = new x(c0);
    this.v = true;
    this.g.a((ResultT)x, null);
  }
}


/* Location:              C:\Users\panch\Downloads\dvba_v1.1.0-dex2jar.jar!\c\c\b\h\c0\a\j.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */