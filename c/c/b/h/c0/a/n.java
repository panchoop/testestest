package c.c.b.h.c0.a;

import c.c.a.a.c.c;
import c.c.a.a.c.k.k.k;
import c.c.a.a.c.l.q;
import c.c.a.a.f.c.r0;
import c.c.b.h.d0.c0;
import c.c.b.h.d0.r;
import c.c.b.h.d0.x;
import c.c.b.h.o;
import c.c.b.h.w;

public final class n extends u0<Object, r> {
  public final w w;
  
  public n(w paramw) {
    super(2);
    q.g(paramw, "credential cannot be null");
    this.w = paramw;
  }
  
  public final String a() {
    return "linkPhoneAuthCredential";
  }
  
  public final k<l0, Object> b() {
    k.a a = k.a();
    a.b = false;
    if (this.t || this.u) {
      c[] arrayOfC1 = null;
      a.c = arrayOfC1;
      a.a = new q(this);
      return a.a();
    } 
    c[] arrayOfC = new c[1];
    arrayOfC[0] = r0.b;
    a.c = arrayOfC;
    a.a = new q(this);
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


/* Location:              C:\Users\panch\Downloads\dvba_v1.1.0-dex2jar.jar!\c\c\b\h\c0\a\n.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */