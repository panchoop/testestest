package c.c.a.a.f.c;

import android.os.Parcel;
import android.os.Parcelable;
import c.c.a.a.c.l.q;
import c.c.b.h.g0;
import java.util.ArrayList;

public final class u0 implements Parcelable.Creator<v0> {
  public final Object createFromParcel(Parcel paramParcel) {
    int i = q.b0(paramParcel);
    String str = null;
    ArrayList<b1> arrayList = null;
    g0 g0 = null;
    while (paramParcel.dataPosition() < i) {
      int k = paramParcel.readInt();
      int j = 0xFFFF & k;
      if (j != 1) {
        if (j != 2) {
          if (j != 3) {
            q.Z(paramParcel, k);
            continue;
          } 
          g0 = (g0)q.n(paramParcel, k, g0.CREATOR);
          continue;
        } 
        arrayList = q.r(paramParcel, k, b1.CREATOR);
        continue;
      } 
      str = q.o(paramParcel, k);
    } 
    q.v(paramParcel, i);
    return new v0(str, arrayList, g0);
  }
}


/* Location:              C:\Users\panch\Downloads\dvba_v1.1.0-dex2jar.jar!\c\c\a\a\f\\\u0.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */