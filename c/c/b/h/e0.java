package c.c.b.h;

import android.os.Parcel;
import android.os.Parcelable;
import c.c.a.a.c.l.q;

public final class e0 implements Parcelable.Creator<a0> {
  public final Object createFromParcel(Parcel paramParcel) {
    int i = q.b0(paramParcel);
    String str2 = null;
    String str1 = null;
    while (paramParcel.dataPosition() < i) {
      int k = paramParcel.readInt();
      int j = 0xFFFF & k;
      if (j != 1) {
        if (j != 2) {
          q.Z(paramParcel, k);
          continue;
        } 
        str1 = q.o(paramParcel, k);
        continue;
      } 
      str2 = q.o(paramParcel, k);
    } 
    q.v(paramParcel, i);
    return new a0(str2, str1);
  }
}


/* Location:              C:\Users\panch\Downloads\dvba_v1.1.0-dex2jar.jar!\c\c\b\h\e0.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */