package c.c.b.h.d0;

import android.os.Parcel;
import android.os.Parcelable;
import c.c.a.a.c.l.q;

public final class d0 implements Parcelable.Creator<e0> {
  public final Object createFromParcel(Parcel paramParcel) {
    int i = q.b0(paramParcel);
    long l2 = 0L;
    long l1 = 0L;
    while (paramParcel.dataPosition() < i) {
      int j = paramParcel.readInt();
      int k = 0xFFFF & j;
      if (k != 1) {
        if (k != 2) {
          q.Z(paramParcel, j);
          continue;
        } 
        l1 = q.R(paramParcel, j);
        continue;
      } 
      l2 = q.R(paramParcel, j);
    } 
    q.v(paramParcel, i);
    return new e0(l2, l1);
  }
}


/* Location:              C:\Users\panch\Downloads\dvba_v1.1.0-dex2jar.jar!\c\c\b\h\d0\d0.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */