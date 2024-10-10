package c.c.a.a.e;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import c.c.a.a.d.a;
import c.c.a.a.f.b.a;
import c.c.a.a.f.b.c;

public final class d extends a implements c {
  public d(IBinder paramIBinder) {
    super(paramIBinder, "com.google.android.gms.dynamite.IDynamiteLoader");
  }
  
  public final int d(a parama, String paramString, boolean paramBoolean) {
    Parcel parcel2 = c();
    c.b(parcel2, (IInterface)parama);
    parcel2.writeString(paramString);
    parcel2.writeInt(paramBoolean);
    Parcel parcel1 = t(5, parcel2);
    int i = parcel1.readInt();
    parcel1.recycle();
    return i;
  }
  
  public final int f(a parama, String paramString, boolean paramBoolean) {
    Parcel parcel2 = c();
    c.b(parcel2, (IInterface)parama);
    parcel2.writeString(paramString);
    parcel2.writeInt(paramBoolean);
    Parcel parcel1 = t(3, parcel2);
    int i = parcel1.readInt();
    parcel1.recycle();
    return i;
  }
  
  public final int g() {
    Parcel parcel = t(6, c());
    int i = parcel.readInt();
    parcel.recycle();
    return i;
  }
}


/* Location:              C:\Users\panch\Downloads\dvba_v1.1.0-dex2jar.jar!\c\c\a\a\e\d.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */