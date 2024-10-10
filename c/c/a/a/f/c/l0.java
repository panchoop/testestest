package c.c.a.a.f.c;

import android.os.Parcel;
import android.os.Parcelable;
import c.c.a.a.c.l.q;

public final class l0 implements Parcelable.Creator<m0> {
  public final Object createFromParcel(Parcel paramParcel) {
    int i = q.b0(paramParcel);
    String str3 = null;
    String str2 = null;
    String str1 = null;
    while (paramParcel.dataPosition() < i) {
      int k = paramParcel.readInt();
      int j = 0xFFFF & k;
      if (j != 1) {
        if (j != 2) {
          if (j != 3) {
            q.Z(paramParcel, k);
            continue;
          } 
          str1 = q.o(paramParcel, k);
          continue;
        } 
        str2 = q.o(paramParcel, k);
        continue;
      } 
      str3 = q.o(paramParcel, k);
    } 
    q.v(paramParcel, i);
    return new m0(str3, str2, str1);
  }
}


/* Location:              C:\Users\panch\Downloads\dvba_v1.1.0-dex2jar.jar!\c\c\a\a\f\c\l0.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */