package c.c.a.a.g.b;

import android.os.Parcel;
import android.os.Parcelable;
import c.c.a.a.c.a;
import c.c.a.a.c.l.q;
import c.c.a.a.c.l.s;

public final class k implements Parcelable.Creator<l> {
  public final Object createFromParcel(Parcel paramParcel) {
    int j = q.b0(paramParcel);
    a a = null;
    s s = null;
    int i;
    for (i = 0; paramParcel.dataPosition() < j; i = q.Q(paramParcel, n)) {
      int n = paramParcel.readInt();
      int m = 0xFFFF & n;
      if (m != 1) {
        if (m != 2) {
          if (m != 3) {
            q.Z(paramParcel, n);
            continue;
          } 
          s = (s)q.n(paramParcel, n, s.CREATOR);
          continue;
        } 
        a = (a)q.n(paramParcel, n, a.CREATOR);
        continue;
      } 
    } 
    q.v(paramParcel, j);
    return new l(i, a, s);
  }
}


/* Location:              C:\Users\panch\Downloads\dvba_v1.1.0-dex2jar.jar!\c\c\a\a\g\b\k.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */