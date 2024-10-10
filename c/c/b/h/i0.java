package c.c.b.h;

import android.os.Parcel;
import android.os.Parcelable;
import c.c.a.a.c.l.q;

public final class i0 implements Parcelable.Creator<d> {
  public final Object createFromParcel(Parcel paramParcel) {
    int i = q.b0(paramParcel);
    String str;
    for (str = null; paramParcel.dataPosition() < i; str = q.o(paramParcel, j)) {
      int j = paramParcel.readInt();
      if ((0xFFFF & j) != 1) {
        q.Z(paramParcel, j);
        continue;
      } 
    } 
    q.v(paramParcel, i);
    return new d(str);
  }
}


/* Location:              C:\Users\panch\Downloads\dvba_v1.1.0-dex2jar.jar!\c\c\b\h\i0.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */