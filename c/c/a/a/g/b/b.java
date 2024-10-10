package c.c.a.a.g.b;

import android.content.Intent;
import android.os.Parcel;
import android.os.Parcelable;
import c.c.a.a.c.l.q;

public final class b implements Parcelable.Creator<c> {
  public final Object createFromParcel(Parcel paramParcel) {
    int k = q.b0(paramParcel);
    int j = 0;
    Intent intent = null;
    int i = 0;
    while (paramParcel.dataPosition() < k) {
      int n = paramParcel.readInt();
      int m = 0xFFFF & n;
      if (m != 1) {
        if (m != 2) {
          if (m != 3) {
            q.Z(paramParcel, n);
            continue;
          } 
          intent = (Intent)q.n(paramParcel, n, Intent.CREATOR);
          continue;
        } 
        i = q.Q(paramParcel, n);
        continue;
      } 
      j = q.Q(paramParcel, n);
    } 
    q.v(paramParcel, k);
    return new c(j, i, intent);
  }
}


/* Location:              C:\Users\panch\Downloads\dvba_v1.1.0-dex2jar.jar!\c\c\a\a\g\b\b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */