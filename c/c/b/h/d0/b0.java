package c.c.b.h.d0;

import android.os.Parcel;
import android.os.Parcelable;
import c.c.a.a.c.l.q;
import c.c.a.a.f.c.a1;
import c.c.b.h.g0;
import java.util.ArrayList;

public final class b0 implements Parcelable.Creator<c0> {
  public final Object createFromParcel(Parcel paramParcel) {
    Boolean bool1;
    String str1;
    String str2;
    ArrayList<z> arrayList;
    ArrayList<String> arrayList1;
    String str3;
    e0 e0;
    g0 g0;
    z z;
    int i = q.b0(paramParcel);
    a1 a1 = null;
    m m10 = null;
    m m2 = m10;
    m m3 = m2;
    m m4 = m3;
    m m5 = m4;
    m m6 = m5;
    m m1 = m6;
    m m7 = m1;
    m m8 = m7;
    m m9 = m8;
    boolean bool = false;
    while (paramParcel.dataPosition() < i) {
      boolean bool2;
      int j = paramParcel.readInt();
      switch (j & 0xFFFF) {
        default:
          q.Z(paramParcel, j);
          continue;
        case 12:
          m9 = (m)q.n(paramParcel, j, m.CREATOR);
          continue;
        case 11:
          g0 = (g0)q.n(paramParcel, j, g0.CREATOR);
          continue;
        case 10:
          bool = q.O(paramParcel, j);
          continue;
        case 9:
          e0 = (e0)q.n(paramParcel, j, e0.CREATOR);
          continue;
        case 8:
          j = q.T(paramParcel, j);
          if (j == 0) {
            m1 = null;
            continue;
          } 
          q.z0(paramParcel, j, 4);
          if (paramParcel.readInt() != 0) {
            bool2 = true;
          } else {
            bool2 = false;
          } 
          bool1 = Boolean.valueOf(bool2);
          continue;
        case 7:
          str3 = q.o(paramParcel, j);
          continue;
        case 6:
          arrayList1 = q.p(paramParcel, j);
          continue;
        case 5:
          arrayList = q.r(paramParcel, j, z.CREATOR);
          continue;
        case 4:
          str2 = q.o(paramParcel, j);
          continue;
        case 3:
          str1 = q.o(paramParcel, j);
          continue;
        case 2:
          z = (z)q.n(paramParcel, j, z.CREATOR);
          continue;
        case 1:
          break;
      } 
      a1 = (a1)q.n(paramParcel, j, a1.CREATOR);
    } 
    q.v(paramParcel, i);
    return new c0(a1, z, str1, str2, arrayList, arrayList1, str3, bool1, e0, bool, g0, m9);
  }
}


/* Location:              C:\Users\panch\Downloads\dvba_v1.1.0-dex2jar.jar!\c\c\b\h\d0\b0.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */