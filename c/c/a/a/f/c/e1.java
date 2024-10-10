package c.c.a.a.f.c;

import android.os.Parcel;
import android.os.Parcelable;
import c.c.a.a.c.l.q;

public final class e1 implements Parcelable.Creator<b1> {
  public final Object createFromParcel(Parcel paramParcel) {
    int i = q.b0(paramParcel);
    String str3 = null;
    String str2 = null;
    String str1 = str2;
    long l = 0L;
    while (paramParcel.dataPosition() < i) {
      int j = paramParcel.readInt();
      int k = 0xFFFF & j;
      if (k != 1) {
        if (k != 2) {
          if (k != 3) {
            if (k != 4) {
              q.Z(paramParcel, j);
              continue;
            } 
            l = q.R(paramParcel, j);
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
    return new b1(str3, str2, str1, l);
  }
}


/* Location:              C:\Users\panch\Downloads\dvba_v1.1.0-dex2jar.jar!\c\c\a\a\f\c\e1.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */