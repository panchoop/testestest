package c.c.b.h.d0;

import android.os.Parcel;
import android.os.Parcelable;
import c.c.a.a.c.l.q;
import c.c.b.h.y;
import java.util.ArrayList;

public final class l implements Parcelable.Creator<m> {
  public final Object createFromParcel(Parcel paramParcel) {
    int i = q.b0(paramParcel);
    ArrayList<y> arrayList;
    for (arrayList = null; paramParcel.dataPosition() < i; arrayList = q.r(paramParcel, j, y.CREATOR)) {
      int j = paramParcel.readInt();
      if ((0xFFFF & j) != 1) {
        q.Z(paramParcel, j);
        continue;
      } 
    } 
    q.v(paramParcel, i);
    return new m(arrayList);
  }
}


/* Location:              C:\Users\panch\Downloads\dvba_v1.1.0-dex2jar.jar!\c\c\b\h\d0\l.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */