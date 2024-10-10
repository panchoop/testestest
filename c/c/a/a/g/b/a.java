package c.c.a.a.g.b;

import android.accounts.Account;
import android.content.Context;
import android.os.Bundle;
import android.os.Handler;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import android.os.RemoteException;
import android.util.Log;
import c.c.a.a.c.k.d;
import c.c.a.a.c.k.e;
import c.c.a.a.c.k.k.b0;
import c.c.a.a.c.k.k.c;
import c.c.a.a.c.k.k.h;
import c.c.a.a.c.k.k.z;
import c.c.a.a.c.l.b;
import c.c.a.a.c.l.c;
import c.c.a.a.c.l.g;
import c.c.a.a.c.l.q;
import c.c.a.a.c.l.r;
import c.c.a.a.g.e;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;

public class a extends g<f> implements e {
  public Integer A;
  
  public final boolean x = true;
  
  public final c y;
  
  public final Bundle z;
  
  public a(Context paramContext, Looper paramLooper, c paramc, d paramd, e parame) {
    super(paramContext, paramLooper, 44, paramc, (c)paramd, (h)parame);
    this.y = paramc;
    this.z = bundle;
    this.A = paramc.h;
  }
  
  public final void h() {
    b.d d = new b.d((b)this);
    q.g(d, "Connection progress callbacks cannot be null.");
    ((b)this).h = (b.c)d;
    x(2, null);
  }
  
  public boolean j() {
    return this.x;
  }
  
  public final void k(d paramd) {
    q.g(paramd, "Expecting a valid ISignInCallbacks");
    try {
      Account account = this.y.a;
      if (account == null)
        account = new Account("<<default account>>", "com.google"); 
      GoogleSignInAccount googleSignInAccount = null;
      if ("<<default account>>".equals(account.name))
        googleSignInAccount = c.c.a.a.a.a.a.a.a.a(((b)this).b).b(); 
      r r = new r();
      this(account, this.A.intValue(), googleSignInAccount);
      f f = (f)s();
      j j = new j();
      this(r);
      f.m(j, paramd);
      return;
    } catch (RemoteException remoteException) {
      Log.w("SignInClientImpl", "Remote service probably died when signIn is called");
      try {
        l l = new l();
        this();
        z z = (z)paramd;
        Handler handler = z.b;
        b0 b0 = new b0();
        this(z, l);
        handler.post((Runnable)b0);
        return;
      } catch (RemoteException remoteException1) {
        Log.wtf("SignInClientImpl", "ISignInCallbacks#onSignInComplete should be executed from the same process, unexpected RemoteException.", (Throwable)remoteException);
        return;
      } 
    } 
  }
  
  public int o() {
    return 12451000;
  }
  
  public Bundle r() {
    String str = this.y.e;
    if (!((b)this).b.getPackageName().equals(str))
      this.z.putString("com.google.android.gms.signin.internal.realClientPackageName", this.y.e); 
    return this.z;
  }
  
  public String t() {
    return "com.google.android.gms.signin.internal.ISignInService";
  }
  
  public String u() {
    return "com.google.android.gms.signin.service.START";
  }
}


/* Location:              C:\Users\panch\Downloads\dvba_v1.1.0-dex2jar.jar!\c\c\a\a\g\b\a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */