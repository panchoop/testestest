package c.c.b.h.d0;

import android.os.Parcel;
import android.os.Parcelable;
import c.c.a.a.c.l.q;
import c.c.b.h.g0;
import c.c.b.h.y;
import java.util.ArrayList;

public final class h0 implements Parcelable.Creator<f0> {
  public final Object createFromParcel(Parcel paramParcel) {
    String str;
    g0 g0;
    g0 g01;
    int i = q.b0(paramParcel);
    ArrayList<y> arrayList = null;
    c0 c04 = null;
    c0 c01 = c04;
    c0 c02 = c01;
    c0 c03 = c02;
    while (paramParcel.dataPosition() < i) {
      int k = paramParcel.readInt();
      int j = 0xFFFF & k;
      if (j != 1) {
        if (j != 2) {
          if (j != 3) {
            if (j != 4) {
              if (j != 5) {
                q.Z(paramParcel, k);
                continue;
              } 
              c03 = (c0)q.n(paramParcel, k, c0.CREATOR);
              continue;
            } 
            g0 = (g0)q.n(paramParcel, k, g0.CREATOR);
            continue;
          } 
          str = q.o(paramParcel, k);
          continue;
        } 
        g01 = (g0)q.n(paramParcel, k, g0.CREATOR);
        continue;
      } 
      arrayList = q.r(paramParcel, k, y.CREATOR);
    } 
    q.v(paramParcel, i);
    return new f0(arrayList, g01, str, g0, c03);
  }
}


/* Location:              C:\Users\panch\Downloads\dvba_v1.1.0-dex2jar.jar!\c\c\b\h\d0\h0.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */