package c.c.a.a.f.b;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;

public class c {
  static {
    c.class.getClassLoader();
  }
  
  public static <T extends Parcelable> T a(Parcel paramParcel, Parcelable.Creator<T> paramCreator) {
    return (T)((paramParcel.readInt() == 0) ? null : (Parcelable)paramCreator.createFromParcel(paramParcel));
  }
  
  public static void b(Parcel paramParcel, IInterface paramIInterface) {
    IBinder iBinder;
    if (paramIInterface == null) {
      paramIInterface = null;
    } else {
      iBinder = paramIInterface.asBinder();
    } 
    paramParcel.writeStrongBinder(iBinder);
  }
}


/* Location:              C:\Users\panch\Downloads\dvba_v1.1.0-dex2jar.jar!\c\c\a\a\f\b\c.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */