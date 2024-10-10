package c.c.b.h.d0;

import android.os.Parcel;
import android.os.Parcelable;
import c.c.a.a.c.l.q;
import c.c.b.h.y;
import java.util.ArrayList;

public final class i0 implements Parcelable.Creator<g0> {
  public final Object createFromParcel(Parcel paramParcel) {
    int i = q.b0(paramParcel);
    String str2 = null;
    String str1 = null;
    ArrayList<y> arrayList = null;
    while (paramParcel.dataPosition() < i) {
      int k = paramParcel.readInt();
      int j = 0xFFFF & k;
      if (j != 1) {
        if (j != 2) {
          if (j != 3) {
            q.Z(paramParcel, k);
            continue;
          } 
          arrayList = q.r(paramParcel, k, y.CREATOR);
          continue;
        } 
        str1 = q.o(paramParcel, k);
        continue;
      } 
      str2 = q.o(paramParcel, k);
    } 
    q.v(paramParcel, i);
    return new g0(str2, str1, arrayList);
  }
}


/* Location:              C:\Users\panch\Downloads\dvba_v1.1.0-dex2jar.jar!\c\c\b\h\d0\i0.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */