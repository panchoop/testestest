package c.c.b.h.c0.a;

import c.c.a.a.c.c;
import c.c.a.a.c.k.k.k;
import c.c.a.a.c.l.q;
import c.c.a.a.f.c.q0;
import c.c.a.a.f.c.r0;
import c.c.b.h.d0.c0;
import c.c.b.h.d0.r;
import c.c.b.h.d0.x;
import c.c.b.h.o;
import c.c.b.h.w;
import com.google.android.gms.common.api.Status;

public final class y extends u0<Object, r> {
  public final q0 w;
  
  public y(w paramw, String paramString) {
    super(2);
    q.g(paramw, "credential cannot be null");
    paramw.f = false;
    this.w = new q0(paramw, paramString);
  }
  
  public final String a() {
    return "reauthenticateWithPhoneCredentialWithData";
  }
  
  public final k<l0, Object> b() {
    k.a a = k.a();
    a.b = false;
    if (this.t || this.u) {
      c[] arrayOfC1 = null;
      a.c = arrayOfC1;
      a.a = new z(this);
      return a.a();
    } 
    c[] arrayOfC = new c[1];
    arrayOfC[0] = r0.b;
    a.c = arrayOfC;
    a.a = new z(this);
    return a.a();
  }
  
  public final void h() {
    c0 c0 = g.f(this.c, this.k);
    if (((c0)this.d).c.b.equalsIgnoreCase(c0.c.b)) {
      ((r)this.e).a(this.j, (o)c0);
      x x = new x(c0);
      this.v = true;
      this.g.a((ResultT)x, null);
      return;
    } 
    Status status = new Status(17024, null);
    this.v = true;
    this.g.a(null, status);
  }
}


/* Location:              C:\Users\panch\Downloads\dvba_v1.1.0-dex2jar.jar!\c\c\b\h\c0\a\y.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */