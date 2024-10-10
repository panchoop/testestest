package c.c.a.a.c.l;

import android.accounts.Account;
import android.content.Context;
import android.os.IInterface;
import android.os.Looper;
import c.c.a.a.c.e;
import c.c.a.a.c.k.a;
import c.c.a.a.c.k.k.c;
import c.c.a.a.c.k.k.h;
import com.google.android.gms.common.api.Scope;
import java.util.Collections;
import java.util.Set;

public abstract class g<T extends IInterface> extends b<T> implements a.f, Object {
  public final Set<Scope> v;
  
  public final Account w;
  
  public g(Context paramContext, Looper paramLooper, int paramInt, c paramc, c paramc1, h paramh) {}
  
  public Set<Scope> m() {
    return j() ? this.v : Collections.emptySet();
  }
  
  public int o() {
    return e.a;
  }
}


/* Location:              C:\Users\panch\Downloads\dvba_v1.1.0-dex2jar.jar!\c\c\a\a\c\l\g.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */