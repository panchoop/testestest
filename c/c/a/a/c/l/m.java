package c.c.a.a.c.l;

import android.os.IBinder;
import android.os.Parcel;

public final class m implements n {
  public final IBinder a;
  
  public m(IBinder paramIBinder) {
    this.a = paramIBinder;
  }
  
  public final IBinder asBinder() {
    return this.a;
  }
  
  public final void q(l paraml, f paramf) {
    Parcel parcel2 = Parcel.obtain();
    Parcel parcel1 = Parcel.obtain();
    try {
      parcel2.writeInterfaceToken("com.google.android.gms.common.internal.IGmsServiceBroker");
      parcel2.writeStrongBinder(paraml.asBinder());
      parcel2.writeInt(1);
      paramf.writeToParcel(parcel2, 0);
      this.a.transact(46, parcel2, parcel1, 0);
      parcel1.readException();
      return;
    } finally {
      parcel1.recycle();
      parcel2.recycle();
    } 
  }
}


/* Location:              C:\Users\panch\Downloads\dvba_v1.1.0-dex2jar.jar!\c\c\a\a\c\l\m.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */