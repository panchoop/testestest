package c.c.a.a.c.k.k;

import android.util.Log;
import c.c.a.a.c.a;
import c.c.a.a.c.l.k;

public final class u implements Runnable {
  public final a b;
  
  public final d.b c;
  
  public u(d.b paramb, a parama) {}
  
  public final void run() {
    a a1;
    k k;
    d.b b1 = this.c;
    d.a a2 = b1.f.i.get(b1.b);
    if (a2 == null)
      return; 
    if (this.b.h()) {
      b1 = this.c;
      b1.e = true;
      if (b1.a.j()) {
        b1 = this.c;
        if (b1.e) {
          k = b1.c;
          if (k != null)
            b1.a.n(k, b1.d); 
        } 
        return;
      } 
      try {
        this.c.a.n(null, this.c.a.m());
        return;
      } catch (SecurityException securityException) {
        Log.e("GoogleApiManager", "Failed to get service from broker. ", securityException);
        a1 = new a(10);
      } 
    } else {
      a1 = this.b;
    } 
    k.t(a1);
  }
}


/* Location:              C:\Users\panch\Downloads\dvba_v1.1.0-dex2jar.jar!\c\c\a\a\c\k\\\u.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */