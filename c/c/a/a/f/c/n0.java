package c.c.a.a.f.c;

import android.os.Parcel;
import android.os.Parcelable;
import c.c.a.a.c.l.q;
import c.c.b.h.c;

public final class n0 implements Parcelable.Creator<o0> {
  public final Object createFromParcel(Parcel paramParcel) {
    int i = q.b0(paramParcel);
    c c;
    for (c = null; paramParcel.dataPosition() < i; c = (c)q.n(paramParcel, j, c.CREATOR)) {
      int j = paramParcel.readInt();
      if ((0xFFFF & j) != 1) {
        q.Z(paramParcel, j);
        continue;
      } 
    } 
    q.v(paramParcel, i);
    return new o0(c);
  }
}


/* Location:              C:\Users\panch\Downloads\dvba_v1.1.0-dex2jar.jar!\c\c\a\a\f\c\n0.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */