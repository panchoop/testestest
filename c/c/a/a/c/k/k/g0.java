package c.c.a.a.c.k.k;

import android.os.DeadObjectException;
import android.os.RemoteException;
import c.c.a.a.c.k.b;
import c.c.a.a.h.e;
import com.google.android.gms.common.api.Status;

public abstract class g0<T> extends o {
  public final e<T> a;
  
  public g0(int paramInt, e<T> parame) {
    super(paramInt);
    this.a = parame;
  }
  
  public void a(Status paramStatus) {
    this.a.a((Exception)new b(paramStatus));
  }
  
  public void c(RuntimeException paramRuntimeException) {
    this.a.a(paramRuntimeException);
  }
  
  public final void e(d.a<?> parama) {
    try {
      h(parama);
      return;
    } catch (DeadObjectException deadObjectException) {
      Status status = x.d((RemoteException)deadObjectException);
      this.a.a((Exception)new b(status));
      throw deadObjectException;
    } catch (RemoteException remoteException) {
      Status status = x.d(remoteException);
      this.a.a((Exception)new b(status));
      return;
    } catch (RuntimeException runtimeException) {
      this.a.a(runtimeException);
      return;
    } 
  }
  
  public abstract void h(d.a<?> parama);
}


/* Location:              C:\Users\panch\Downloads\dvba_v1.1.0-dex2jar.jar!\c\c\a\a\c\k\k\g0.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */