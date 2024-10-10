package c.c.a.a.f.c;

import android.os.Parcel;
import android.os.Parcelable;
import c.c.a.a.c.l.q;

public final class c1 implements Parcelable.Creator<a1> {
  public final Object createFromParcel(Parcel paramParcel) {
    String str1;
    String str2;
    int i = q.b0(paramParcel);
    String str3 = null;
    Long long_4 = null;
    Long long_1 = long_4;
    Long long_2 = long_1;
    Long long_3 = long_2;
    while (paramParcel.dataPosition() < i) {
      int k = paramParcel.readInt();
      int j = 0xFFFF & k;
      if (j != 2) {
        if (j != 3) {
          if (j != 4) {
            if (j != 5) {
              if (j != 6) {
                q.Z(paramParcel, k);
                continue;
              } 
              long_3 = q.S(paramParcel, k);
              continue;
            } 
            str1 = q.o(paramParcel, k);
            continue;
          } 
          long_1 = q.S(paramParcel, k);
          continue;
        } 
        str2 = q.o(paramParcel, k);
        continue;
      } 
      str3 = q.o(paramParcel, k);
    } 
    q.v(paramParcel, i);
    return new a1(str3, str2, long_1, str1, long_3);
  }
}


/* Location:              C:\Users\panch\Downloads\dvba_v1.1.0-dex2jar.jar!\c\c\a\a\f\c\c1.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */