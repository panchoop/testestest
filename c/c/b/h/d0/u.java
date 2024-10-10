package c.c.b.h.d0;

import android.os.Parcel;
import android.os.Parcelable;
import c.c.a.a.c.l.q;

public final class u implements Parcelable.Creator<v> {
  public final Object createFromParcel(Parcel paramParcel) {
    int i = q.b0(paramParcel);
    String str2 = null;
    String str1 = null;
    boolean bool = false;
    while (paramParcel.dataPosition() < i) {
      int k = paramParcel.readInt();
      int j = 0xFFFF & k;
      if (j != 1) {
        if (j != 2) {
          if (j != 3) {
            q.Z(paramParcel, k);
            continue;
          } 
          bool = q.O(paramParcel, k);
          continue;
        } 
        str1 = q.o(paramParcel, k);
        continue;
      } 
      str2 = q.o(paramParcel, k);
    } 
    q.v(paramParcel, i);
    return new v(str2, str1, bool);
  }
}


/* Location:              C:\Users\panch\Downloads\dvba_v1.1.0-dex2jar.jar!\c\c\b\h\d\\u.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */