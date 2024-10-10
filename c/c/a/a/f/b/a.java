package c.c.a.a.f.b;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

public class a implements IInterface {
  public final IBinder a;
  
  public final String b;
  
  public a(IBinder paramIBinder, String paramString) {
    this.a = paramIBinder;
    this.b = paramString;
  }
  
  public IBinder asBinder() {
    return this.a;
  }
  
  public final Parcel c() {
    Parcel parcel = Parcel.obtain();
    parcel.writeInterfaceToken(this.b);
    return parcel;
  }
  
  public final Parcel t(int paramInt, Parcel paramParcel) {
    Exception exception;
    Parcel parcel = Parcel.obtain();
    try {
      this.a.transact(paramInt, paramParcel, parcel, 0);
      parcel.readException();
      paramParcel.recycle();
      return parcel;
    } catch (RuntimeException null) {
      parcel.recycle();
      throw exception;
    } finally {}
    paramParcel.recycle();
    throw exception;
  }
}


/* Location:              C:\Users\panch\Downloads\dvba_v1.1.0-dex2jar.jar!\c\c\a\a\f\b\a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */