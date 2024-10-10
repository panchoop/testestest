package c.c.a.a.c;

import android.os.Parcel;
import android.os.Parcelable;
import c.c.a.a.c.l.q;

public final class r implements Parcelable.Creator<c> {
  public final Object createFromParcel(Parcel paramParcel) {
    int j = q.b0(paramParcel);
    String str = null;
    int i = 0;
    long l = -1L;
    while (paramParcel.dataPosition() < j) {
      int k = paramParcel.readInt();
      int m = 0xFFFF & k;
      if (m != 1) {
        if (m != 2) {
          if (m != 3) {
            q.Z(paramParcel, k);
            continue;
          } 
          l = q.R(paramParcel, k);
          continue;
        } 
        i = q.Q(paramParcel, k);
        continue;
      } 
      str = q.o(paramParcel, k);
    } 
    q.v(paramParcel, j);
    return new c(str, i, l);
  }
}


/* Location:              C:\Users\panch\Downloads\dvba_v1.1.0-dex2jar.jar!\c\c\a\a\c\r.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */