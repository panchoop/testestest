package c.c.a.a.f.c;

import android.os.Parcel;
import android.os.Parcelable;
import c.c.a.a.c.l.q;

public final class c0 implements Parcelable.Creator<d0> {
  public final Object createFromParcel(Parcel paramParcel) {
    int i = q.b0(paramParcel);
    String str3 = null;
    String str2 = null;
    String str1 = null;
    while (paramParcel.dataPosition() < i) {
      int j = paramParcel.readInt();
      int k = 0xFFFF & j;
      if (k != 1) {
        if (k != 2) {
          if (k != 3) {
            q.Z(paramParcel, j);
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
    return new d0(str3, str2, str1);
  }
}


/* Location:              C:\Users\panch\Downloads\dvba_v1.1.0-dex2jar.jar!\c\c\a\a\f\c\c0.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */