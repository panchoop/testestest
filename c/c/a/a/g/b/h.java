package c.c.a.a.g.b;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import c.c.a.a.f.a.b;

public final class h implements f, IInterface {
  public final IBinder a;
  
  public final String b;
  
  public h(IBinder paramIBinder) {
    this.a = paramIBinder;
    this.b = "com.google.android.gms.signin.internal.ISignInService";
  }
  
  public IBinder asBinder() {
    return this.a;
  }
  
  public final void m(j paramj, d paramd) {
    Parcel parcel2 = Parcel.obtain();
    parcel2.writeInterfaceToken(this.b);
    b.b(parcel2, (Parcelable)paramj);
    parcel2.writeStrongBinder(paramd.asBinder());
    Parcel parcel1 = Parcel.obtain();
    try {
      this.a.transact(12, parcel2, parcel1, 0);
      parcel1.readException();
      return;
    } finally {
      parcel2.recycle();
      parcel1.recycle();
    } 
  }
}


/* Location:              C:\Users\panch\Downloads\dvba_v1.1.0-dex2jar.jar!\c\c\a\a\g\b\h.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */