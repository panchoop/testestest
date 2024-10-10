package c.c.b.h.d0;

import android.os.Parcel;
import android.os.Parcelable;
import c.c.a.a.c.l.q;
import c.c.b.h.g0;

public final class w implements Parcelable.Creator<x> {
  public final Object createFromParcel(Parcel paramParcel) {
    int i = q.b0(paramParcel);
    c0 c0 = null;
    v v = null;
    g0 g0 = null;
    while (paramParcel.dataPosition() < i) {
      int j = paramParcel.readInt();
      int k = 0xFFFF & j;
      if (k != 1) {
        if (k != 2) {
          if (k != 3) {
            q.Z(paramParcel, j);
            continue;
          } 
          g0 = (g0)q.n(paramParcel, j, g0.CREATOR);
          continue;
        } 
        v = (v)q.n(paramParcel, j, v.CREATOR);
        continue;
      } 
      c0 = (c0)q.n(paramParcel, j, c0.CREATOR);
    } 
    q.v(paramParcel, i);
    return new x(c0, v, g0);
  }
}


/* Location:              C:\Users\panch\Downloads\dvba_v1.1.0-dex2jar.jar!\c\c\b\h\d0\w.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */