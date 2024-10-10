package c.c.a.a.g.b;

import android.os.Parcel;
import android.os.Parcelable;
import c.c.a.a.c.l.q;
import c.c.a.a.c.l.r;

public final class i implements Parcelable.Creator<j> {
  public final Object createFromParcel(Parcel paramParcel) {
    int k = q.b0(paramParcel);
    int j = 0;
    r r = null;
    while (paramParcel.dataPosition() < k) {
      int m = paramParcel.readInt();
      int n = 0xFFFF & m;
      if (n != 1) {
        if (n != 2) {
          q.Z(paramParcel, m);
          continue;
        } 
        r = (r)q.n(paramParcel, m, r.CREATOR);
        continue;
      } 
      j = q.Q(paramParcel, m);
    } 
    q.v(paramParcel, k);
    return new j(j, r);
  }
}


/* Location:              C:\Users\panch\Downloads\dvba_v1.1.0-dex2jar.jar!\c\c\a\a\g\b\i.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */