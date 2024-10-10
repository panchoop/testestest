package c.c.b.h.c0.a;

import c.c.a.a.c.l.q;
import c.c.a.a.f.c.v0;
import c.c.a.a.h.e;
import c.c.b.c;
import c.c.b.h.b;
import c.c.b.h.j;
import c.c.b.h.o;
import com.google.android.gms.common.api.Status;
import com.google.firebase.auth.FirebaseAuth;

public final class b1<ResultT, CallbackT> implements b1<ResultT> {
  public final u0<ResultT, CallbackT> a;
  
  public final e<ResultT> b;
  
  public b1(u0<ResultT, CallbackT> paramu0, e<ResultT> parame) {
    this.a = paramu0;
    this.b = parame;
  }
  
  public final void a(ResultT paramResultT, Status paramStatus) {
    e<ResultT> e1;
    q.g(this.b, "completion source cannot be null");
    if (paramStatus != null) {
      e<ResultT> e2;
      FirebaseAuth firebaseAuth;
      u0<ResultT, CallbackT> u01 = this.a;
      if (u01.s != null) {
        e2 = this.b;
        firebaseAuth = FirebaseAuth.getInstance(u01.c);
        u0<ResultT, CallbackT> u02 = this.a;
        v0 v0 = u02.s;
        if ("reauthenticateWithCredential".equals(u02.a()) || "reauthenticateWithCredentialWithData".equals(this.a.a())) {
          o o = this.a.d;
        } else {
          u02 = null;
        } 
        j j = m0.c(firebaseAuth, v0, (o)u02);
        e2.a.c((Exception)j);
        return;
      } 
      b b = ((u0)firebaseAuth).p;
      if (b != null) {
        e<ResultT> e3 = this.b;
        c = m0.b((Status)e2, b, ((u0)firebaseAuth).q, ((u0)firebaseAuth).r);
        e3.a.c((Exception)c);
        return;
      } 
      e1 = this.b;
      c c = m0.a((Status)c);
      e1.a.c((Exception)c);
      return;
    } 
    this.b.a.d(e1);
  }
}


/* Location:              C:\Users\panch\Downloads\dvba_v1.1.0-dex2jar.jar!\c\c\b\h\c0\a\b1.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */