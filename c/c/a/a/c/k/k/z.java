package c.c.a.a.c.k.k;

import android.content.Context;
import android.os.Bundle;
import android.os.Handler;
import c.c.a.a.c.a;
import c.c.a.a.c.k.a;
import c.c.a.a.c.k.d;
import c.c.a.a.c.k.e;
import c.c.a.a.c.l.c;
import c.c.a.a.c.l.q;
import c.c.a.a.g.a;
import c.c.a.a.g.b.d;
import c.c.a.a.g.b.e;
import c.c.a.a.g.d;
import c.c.a.a.g.e;
import com.google.android.gms.common.api.Scope;
import java.util.Set;

public final class z extends e implements d, e {
  public static a.a<? extends e, a> h = d.c;
  
  public final Context a;
  
  public final Handler b;
  
  public final a.a<? extends e, a> c;
  
  public Set<Scope> d;
  
  public c e;
  
  public e f;
  
  public a0 g;
  
  public z(Context paramContext, Handler paramHandler, c paramc) {
    this.a = paramContext;
    this.b = paramHandler;
    q.g(paramc, "ClientSettings must not be null");
    this.e = paramc;
    this.d = paramc.b;
    this.c = a1;
  }
  
  public final void c(int paramInt) {
    this.f.g();
  }
  
  public final void t(a parama) {
    ((d.b)this.g).b(parama);
  }
  
  public final void y(Bundle paramBundle) {
    this.f.k((d)this);
  }
}


/* Location:              C:\Users\panch\Downloads\dvba_v1.1.0-dex2jar.jar!\c\c\a\a\c\k\k\z.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */