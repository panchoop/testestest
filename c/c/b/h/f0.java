package c.c.b.h;

import android.os.Parcel;
import android.os.Parcelable;
import c.c.a.a.c.l.q;
import c.c.a.a.f.c.n1;

public final class f0 implements Parcelable.Creator<g0> {
  public final Object createFromParcel(Parcel paramParcel) {
    n1 n1;
    int i = q.b0(paramParcel);
    String str7 = null;
    String str6 = null;
    String str1 = str6;
    String str2 = str1;
    String str3 = str2;
    String str4 = str3;
    String str5 = str4;
    while (paramParcel.dataPosition() < i) {
      int j = paramParcel.readInt();
      switch (0xFFFF & j) {
        default:
          q.Z(paramParcel, j);
          continue;
        case 7:
          str5 = q.o(paramParcel, j);
          continue;
        case 6:
          str4 = q.o(paramParcel, j);
          continue;
        case 5:
          str3 = q.o(paramParcel, j);
          continue;
        case 4:
          n1 = (n1)q.n(paramParcel, j, n1.CREATOR);
          continue;
        case 3:
          str1 = q.o(paramParcel, j);
          continue;
        case 2:
          str6 = q.o(paramParcel, j);
          continue;
        case 1:
          break;
      } 
      str7 = q.o(paramParcel, j);
    } 
    q.v(paramParcel, i);
    return new g0(str7, str6, str1, n1, str3, str4, str5);
  }
}


/* Location:              C:\Users\panch\Downloads\dvba_v1.1.0-dex2jar.jar!\c\c\b\h\f0.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */