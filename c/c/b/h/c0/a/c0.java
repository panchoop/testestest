package c.c.b.h.c0.a;

import c.c.a.a.c.c;
import c.c.a.a.c.k.k.k;
import c.c.a.a.c.l.q;
import c.c.a.a.f.c.m0;
import c.c.a.a.f.c.r0;
import c.c.b.h.d0.r;
import c.c.b.h.d0.x;
import c.c.b.h.o;

public final class c0 extends u0<Object, r> {
  public final m0 w;
  
  public c0(String paramString1, String paramString2, String paramString3) {
    super(2);
    q.e(paramString1, "email cannot be null or empty");
    q.e(paramString2, "password cannot be null or empty");
    this.w = new m0(paramString1, paramString2, paramString3);
  }
  
  public final String a() {
    return "signInWithEmailAndPassword";
  }
  
  public final k<l0, Object> b() {
    k.a a = k.a();
    a.b = false;
    if (this.t || this.u) {
      c[] arrayOfC1 = null;
      a.c = arrayOfC1;
      a.a = new e0(this);
      return a.a();
    } 
    c[] arrayOfC = new c[1];
    arrayOfC[0] = r0.b;
    a.c = arrayOfC;
    a.a = new e0(this);
    return a.a();
  }
  
  public final void h() {
    c.c.b.h.d0.c0 c01 = g.f(this.c, this.k);
    ((r)this.e).a(this.j, (o)c01);
    x x = new x(c01);
    this.v = true;
    this.g.a((ResultT)x, null);
  }
}


/* Location:              C:\Users\panch\Downloads\dvba_v1.1.0-dex2jar.jar!\c\c\b\h\c0\a\c0.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */