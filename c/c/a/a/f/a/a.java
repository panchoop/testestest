package c.c.a.a.f.a;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

public class a extends Binder implements IInterface {
  public a(String paramString) {
    attachInterface(this, paramString);
  }
  
  public abstract boolean C(int paramInt1, Parcel paramParcel1, Parcel paramParcel2, int paramInt2);
  
  public IBinder asBinder() {
    return (IBinder)this;
  }
  
  public boolean onTransact(int paramInt1, Parcel paramParcel1, Parcel paramParcel2, int paramInt2) {
    boolean bool;
    if (paramInt1 > 16777215) {
      bool = super.onTransact(paramInt1, paramParcel1, paramParcel2, paramInt2);
    } else {
      paramParcel1.enforceInterface(getInterfaceDescriptor());
      bool = false;
    } 
    return bool ? true : C(paramInt1, paramParcel1, paramParcel2, paramInt2);
  }
}


/* Location:              C:\Users\panch\Downloads\dvba_v1.1.0-dex2jar.jar!\c\c\a\a\f\a\a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */