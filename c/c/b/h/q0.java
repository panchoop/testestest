package c.c.b.h;

import android.os.Parcel;
import android.os.Parcelable;
import c.c.a.a.c.l.q;

public final class q0 implements Parcelable.Creator<y> {
  public final Object createFromParcel(Parcel paramParcel) {
    int i = q.b0(paramParcel);
    String str3 = null;
    String str2 = null;
    String str1 = str2;
    long l = 0L;
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
          l = q.R(paramParcel, k);
          continue;
        } 
        str2 = q.o(paramParcel, k);
        continue;
      } 
      str3 = q.o(paramParcel, k);
    } 
    q.v(paramParcel, i);
    return new y(str3, str2, l, str1);
  }
}


/* Location:              C:\Users\panch\Downloads\dvba_v1.1.0-dex2jar.jar!\c\c\b\h\q0.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */