package c.c.a.a.f.c;

import android.os.Parcel;
import android.os.Parcelable;
import c.c.a.a.c.l.q;
import c.c.b.h.w;

public final class g0 implements Parcelable.Creator<h0> {
  public final Object createFromParcel(Parcel paramParcel) {
    int i = q.b0(paramParcel);
    String str = null;
    w w = null;
    while (paramParcel.dataPosition() < i) {
      int j = paramParcel.readInt();
      int k = 0xFFFF & j;
      if (k != 1) {
        if (k != 2) {
          q.Z(paramParcel, j);
          continue;
        } 
        w = (w)q.n(paramParcel, j, w.CREATOR);
        continue;
      } 
      str = q.o(paramParcel, j);
    } 
    q.v(paramParcel, i);
    return new h0(str, w);
  }
}


/* Location:              C:\Users\panch\Downloads\dvba_v1.1.0-dex2jar.jar!\c\c\a\a\f\c\g0.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */