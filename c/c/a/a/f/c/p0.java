package c.c.a.a.f.c;

import android.os.Parcel;
import android.os.Parcelable;
import c.c.a.a.c.l.q;
import c.c.b.h.w;

public final class p0 implements Parcelable.Creator<q0> {
  public final Object createFromParcel(Parcel paramParcel) {
    int i = q.b0(paramParcel);
    w w = null;
    String str = null;
    while (paramParcel.dataPosition() < i) {
      int k = paramParcel.readInt();
      int j = 0xFFFF & k;
      if (j != 1) {
        if (j != 2) {
          q.Z(paramParcel, k);
          continue;
        } 
        str = q.o(paramParcel, k);
        continue;
      } 
      w = (w)q.n(paramParcel, k, w.CREATOR);
    } 
    q.v(paramParcel, i);
    return new q0(w, str);
  }
}


/* Location:              C:\Users\panch\Downloads\dvba_v1.1.0-dex2jar.jar!\c\c\a\a\f\c\p0.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */