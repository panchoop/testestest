package c.c.a.a.f.c;

import android.os.Parcel;
import android.os.Parcelable;
import c.c.a.a.c.l.q;

public final class j1 implements Parcelable.Creator<i1> {
  public final Object createFromParcel(Parcel paramParcel) {
    String str1;
    int i = q.b0(paramParcel);
    String str3 = null;
    String str2 = null;
    b1 b12 = null;
    b1 b11 = b12;
    while (paramParcel.dataPosition() < i) {
      int j = paramParcel.readInt();
      int k = 0xFFFF & j;
      if (k != 2) {
        if (k != 3) {
          if (k != 4) {
            if (k != 5) {
              q.Z(paramParcel, j);
              continue;
            } 
            b11 = (b1)q.n(paramParcel, j, b1.CREATOR);
            continue;
          } 
          str1 = q.o(paramParcel, j);
          continue;
        } 
        str2 = q.o(paramParcel, j);
        continue;
      } 
      str3 = q.o(paramParcel, j);
    } 
    q.v(paramParcel, i);
    return new i1(str3, str2, str1, b11);
  }
}


/* Location:              C:\Users\panch\Downloads\dvba_v1.1.0-dex2jar.jar!\c\c\a\a\f\c\j1.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */