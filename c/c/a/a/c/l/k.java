package c.c.a.a.c.l;

import android.accounts.Account;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import c.c.a.a.f.b.b;
import c.c.a.a.f.b.c;

public interface k extends IInterface {
  Account a();
  
  public static abstract class a extends b implements k {
    public static k t(IBinder param1IBinder) {
      if (param1IBinder == null)
        return null; 
      IInterface iInterface = param1IBinder.queryLocalInterface("com.google.android.gms.common.internal.IAccountAccessor");
      return (iInterface instanceof k) ? (k)iInterface : new a(param1IBinder);
    }
    
    public static final class a extends c.c.a.a.f.b.a implements k {
      public a(IBinder param2IBinder) {
        super(param2IBinder, "com.google.android.gms.common.internal.IAccountAccessor");
      }
      
      public final Account a() {
        Parcel parcel = t(2, c());
        Account account = (Account)c.a(parcel, Account.CREATOR);
        parcel.recycle();
        return account;
      }
    }
  }
  
  public static final class a extends c.c.a.a.f.b.a implements k {
    public a(IBinder param1IBinder) {
      super(param1IBinder, "com.google.android.gms.common.internal.IAccountAccessor");
    }
    
    public final Account a() {
      Parcel parcel = t(2, c());
      Account account = (Account)c.a(parcel, Account.CREATOR);
      parcel.recycle();
      return account;
    }
  }
}


/* Location:              C:\Users\panch\Downloads\dvba_v1.1.0-dex2jar.jar!\c\c\a\a\c\l\k.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */