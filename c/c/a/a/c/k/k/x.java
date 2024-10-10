package c.c.a.a.c.k.k;

import android.os.RemoteException;
import com.google.android.gms.common.api.Status;

public abstract class x {
  public x(int paramInt) {}
  
  public static Status d(RemoteException paramRemoteException) {
    StringBuilder stringBuilder = new StringBuilder();
    if (paramRemoteException instanceof android.os.TransactionTooLargeException)
      stringBuilder.append("TransactionTooLargeException: "); 
    stringBuilder.append(paramRemoteException.getLocalizedMessage());
    return new Status(8, stringBuilder.toString());
  }
  
  public abstract void a(Status paramStatus);
  
  public abstract void b(m0 paramm0, boolean paramBoolean);
  
  public abstract void c(RuntimeException paramRuntimeException);
  
  public abstract void e(d.a<?> parama);
}


/* Location:              C:\Users\panch\Downloads\dvba_v1.1.0-dex2jar.jar!\c\c\a\a\c\k\k\x.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */