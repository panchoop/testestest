package c.c.b.h.d0;

import c.c.a.a.c.l.q;
import c.c.a.a.f.c.a1;
import c.c.a.a.h.d;
import c.c.a.a.h.f;
import c.c.a.a.h.m;
import c.c.a.a.h.q;
import c.c.a.a.h.t;
import c.c.b.b;
import c.c.b.h.c0.a.f;
import c.c.b.h.c0.a.g;
import c.c.b.h.c0.a.i;
import c.c.b.h.l0;
import c.c.b.h.o;
import com.google.firebase.auth.FirebaseAuth;
import java.util.concurrent.Executor;

public final class e implements Runnable {
  public final String b;
  
  public final c c;
  
  public e(c paramc, String paramString) {
    q.d(paramString);
    this.b = paramString;
  }
  
  public final void run() {
    FirebaseAuth firebaseAuth = FirebaseAuth.getInstance(b.d(this.b));
    o o = firebaseAuth.f;
    if (o != null) {
      a1 a1 = ((c0)o).b;
      a1.f.longValue();
      a1.d.longValue();
      System.currentTimeMillis();
      g g = firebaseAuth.e;
      b b = firebaseAuth.a;
      String str = a1.b;
      l0 l0 = new l0(firebaseAuth);
      if (g != null) {
        i i = new i(str);
        i.c(b);
        i.d(o);
        i.f(l0);
        i.e((f)l0);
        d d1 = g.e(g.b((f)i), (f)i);
        c.h.c("Token refreshing started", new Object[0]);
        d d = new d(this);
        t t = (t)d1;
        Executor executor = f.a;
        t.b.b((q)new m(executor, d));
        t.e();
      } else {
        throw null;
      } 
    } 
  }
}


/* Location:              C:\Users\panch\Downloads\dvba_v1.1.0-dex2jar.jar!\c\c\b\h\d0\e.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */