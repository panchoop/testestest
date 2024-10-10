package c.c.a.a.f.c;

import android.os.Parcel;
import android.os.Parcelable;
import c.c.a.a.c.l.q;
import c.c.b.h.g0;
import com.google.android.gms.common.api.Status;

public final class s0 implements Parcelable.Creator<t0> {
  public final Object createFromParcel(Parcel paramParcel) {
    int i = q.b0(paramParcel);
    Status status = null;
    g0 g0 = null;
    String str2 = null;
    String str1 = str2;
    while (paramParcel.dataPosition() < i) {
      int k = paramParcel.readInt();
      int j = 0xFFFF & k;
      if (j != 1) {
        if (j != 2) {
          if (j != 3) {
            if (j != 4) {
              q.Z(paramParcel, k);
              continue;
            } 
            str1 = q.o(paramParcel, k);
            continue;
          } 
          str2 = q.o(paramParcel, k);
          continue;
        } 
        g0 = (g0)q.n(paramParcel, k, g0.CREATOR);
        continue;
      } 
      status = (Status)q.n(paramParcel, k, Status.CREATOR);
    } 
    q.v(paramParcel, i);
    return new t0(status, g0, str2, str1);
  }
}


/* Location:              C:\Users\panch\Downloads\dvba_v1.1.0-dex2jar.jar!\c\c\a\a\f\c\s0.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */