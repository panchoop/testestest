package c.c.a.a.c.l;

import android.accounts.Account;
import android.os.Binder;
import android.os.RemoteException;
import android.util.Log;

public class a extends k.a {
  public static Account y(k paramk) {
    if (paramk != null) {
      long l = Binder.clearCallingIdentity();
      try {
        Account account = paramk.a();
        Binder.restoreCallingIdentity(l);
      } catch (RemoteException remoteException) {
        Log.w("AccountAccessor", "Remote account accessor probably died");
        Binder.restoreCallingIdentity(l);
        remoteException = null;
      } finally {}
      return (Account)paramk;
    } 
    paramk = null;
  }
}


/* Location:              C:\Users\panch\Downloads\dvba_v1.1.0-dex2jar.jar!\c\c\a\a\c\l\a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */