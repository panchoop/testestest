package c.c.a.a.f.c;

import android.os.Parcel;
import android.os.Parcelable;
import c.c.a.a.c.l.q;

public final class e0 implements Parcelable.Creator<f0> {
  public final Object createFromParcel(Parcel paramParcel) {
    int i = q.b0(paramParcel);
    String str = null;
    n1 n1 = null;
    while (paramParcel.dataPosition() < i) {
      int k = paramParcel.readInt();
      int j = 0xFFFF & k;
      if (j != 1) {
        if (j != 2) {
          q.Z(paramParcel, k);
          continue;
        } 
        n1 = (n1)q.n(paramParcel, k, n1.CREATOR);
        continue;
      } 
      str = q.o(paramParcel, k);
    } 
    q.v(paramParcel, i);
    return new f0(str, n1);
  }
}


/* Location:              C:\Users\panch\Downloads\dvba_v1.1.0-dex2jar.jar!\c\c\a\a\f\c\e0.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */