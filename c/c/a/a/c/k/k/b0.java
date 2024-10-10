package c.c.a.a.c.k.k;

import android.util.Log;
import c.c.a.a.c.a;
import c.c.a.a.c.l.k;
import c.c.a.a.c.l.s;
import c.c.a.a.g.b.l;
import com.google.android.gms.common.api.Scope;
import java.util.Set;

public final class b0 implements Runnable {
  public final l b;
  
  public final z c;
  
  public b0(z paramz, l paraml) {}
  
  public final void run() {
    z z1 = this.c;
    l l1 = this.b;
    if (z1 != null) {
      Set<Scope> set;
      a a2 = l1.c;
      a a1 = a2;
      if (a2.h()) {
        StringBuilder stringBuilder;
        s s = l1.d;
        a1 = s.d;
        if (!a1.h()) {
          String str = String.valueOf(a1);
          stringBuilder = new StringBuilder(str.length() + 48);
          stringBuilder.append("Sign-in succeeded with resolve account failure: ");
          stringBuilder.append(str);
          Log.wtf("SignInCoordinator", stringBuilder.toString(), new Exception());
        } else {
          a0 a0 = z1.g;
          k k = stringBuilder.h();
          set = z1.d;
          a0 = a0;
          if (a0 != null) {
            if (k == null || set == null) {
              Log.wtf("GoogleApiManager", "Received null response from onSignInSuccess", new Exception());
              a0.b(new a(4));
            } else {
              ((d.b)a0).c = k;
              ((d.b)a0).d = set;
              if (((d.b)a0).e)
                ((d.b)a0).a.n(k, set); 
            } 
          } else {
            throw null;
          } 
          z1.f.g();
        } 
      } 
      ((d.b)z1.g).b((a)set);
    } else {
      throw null;
    } 
    z1.f.g();
  }
}


/* Location:              C:\Users\panch\Downloads\dvba_v1.1.0-dex2jar.jar!\c\c\a\a\c\k\k\b0.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */