package c.c.a.a.f.c;

import android.os.Parcel;
import android.os.Parcelable;
import c.c.a.a.c.l.q;

public final class j0 implements Parcelable.Creator<k0> {
  public final Object createFromParcel(Parcel paramParcel) {
    int i = q.b0(paramParcel);
    n1 n1;
    for (n1 = null; paramParcel.dataPosition() < i; n1 = (n1)q.n(paramParcel, j, n1.CREATOR)) {
      int j = paramParcel.readInt();
      if ((0xFFFF & j) != 1) {
        q.Z(paramParcel, j);
        continue;
      } 
    } 
    q.v(paramParcel, i);
    return new k0(n1);
  }
}


/* Location:              C:\Users\panch\Downloads\dvba_v1.1.0-dex2jar.jar!\c\c\a\a\f\c\j0.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */