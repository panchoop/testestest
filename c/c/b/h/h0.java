package c.c.b.h;

import android.os.Parcel;
import android.os.Parcelable;
import c.c.a.a.c.l.q;

public final class h0 implements Parcelable.Creator<c> {
  public final Object createFromParcel(Parcel paramParcel) {
    int i = q.b0(paramParcel);
    String str4 = null;
    String str3 = null;
    String str1 = str3;
    String str2 = str1;
    boolean bool = false;
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
              bool = q.O(paramParcel, k);
              continue;
            } 
            str2 = q.o(paramParcel, k);
            continue;
          } 
          str1 = q.o(paramParcel, k);
          continue;
        } 
        str3 = q.o(paramParcel, k);
        continue;
      } 
      str4 = q.o(paramParcel, k);
    } 
    q.v(paramParcel, i);
    return new c(str4, str3, str1, str2, bool);
  }
}


/* Location:              C:\Users\panch\Downloads\dvba_v1.1.0-dex2jar.jar!\c\c\b\h\h0.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */