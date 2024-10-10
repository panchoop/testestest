package c.c.a.a.c.k;

import android.accounts.Account;
import android.content.Context;
import android.os.Looper;
import c.c.a.a.c.k.k.c;
import c.c.a.a.c.k.k.h;
import c.c.a.a.c.l.k;
import c.c.a.a.c.l.q;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.common.api.Scope;
import java.util.Set;

public final class a<O extends a.d> {
  public final a<?, O> a;
  
  public final String b;
  
  public <C extends f> a(String paramString, a<C, O> parama, g<C> paramg) {
    q.g(parama, "Cannot construct an Api with a null ClientBuilder");
    q.g(paramg, "Cannot construct an Api with a null ClientKey");
    this.b = paramString;
    this.a = parama;
  }
  
  public static class a<T extends f, O> extends e<T, O> {
    @Deprecated
    public T a(Context param1Context, Looper param1Looper, c.c.a.a.c.l.c param1c, O param1O, d param1d, e param1e) {
      return b(param1Context, param1Looper, param1c, param1O, param1d, param1e);
    }
    
    public T b(Context param1Context, Looper param1Looper, c.c.a.a.c.l.c param1c, O param1O, c param1c1, h param1h) {
      throw new UnsupportedOperationException("buildClient must be implemented");
    }
  }
  
  public static interface b {}
  
  public static class c<C extends b> {}
  
  public static interface d {
    public static interface a extends d {
      Account a();
    }
    
    public static interface b extends d {
      GoogleSignInAccount b();
    }
  }
  
  public static interface a extends d {
    Account a();
  }
  
  public static interface b extends d {
    GoogleSignInAccount b();
  }
  
  public static class e<T extends b, O> {}
  
  public static interface f extends b {
    void b(c.c.a.a.c.l.b.e param1e);
    
    void c(c.c.a.a.c.l.b.c param1c);
    
    boolean d();
    
    c.c.a.a.c.c[] e();
    
    boolean f();
    
    void g();
    
    String i();
    
    boolean j();
    
    boolean l();
    
    Set<Scope> m();
    
    void n(k param1k, Set<Scope> param1Set);
    
    int o();
  }
  
  public static final class g<C extends f> extends c<C> {}
}


/* Location:              C:\Users\panch\Downloads\dvba_v1.1.0-dex2jar.jar!\c\c\a\a\c\k\a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */