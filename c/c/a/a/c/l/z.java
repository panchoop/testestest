package c.c.a.a.c.l;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import c.c.a.a.c.a;

public final class z implements Parcelable.Creator<s> {
  public final Object createFromParcel(Parcel paramParcel) {
    int j = q.b0(paramParcel);
    IBinder iBinder = null;
    a a = null;
    int i = 0;
    boolean bool2 = false;
    boolean bool1 = false;
    while (paramParcel.dataPosition() < j) {
      int k = paramParcel.readInt();
      int m = 0xFFFF & k;
      if (m != 1) {
        if (m != 2) {
          if (m != 3) {
            if (m != 4) {
              if (m != 5) {
                q.Z(paramParcel, k);
                continue;
              } 
              bool1 = q.O(paramParcel, k);
              continue;
            } 
            bool2 = q.O(paramParcel, k);
            continue;
          } 
          a = q.<a>n(paramParcel, k, a.CREATOR);
          continue;
        } 
        iBinder = q.P(paramParcel, k);
        continue;
      } 
      i = q.Q(paramParcel, k);
    } 
    q.v(paramParcel, j);
    return new s(i, iBinder, a, bool2, bool1);
  }
}


/* Location:              C:\Users\panch\Downloads\dvba_v1.1.0-dex2jar.jar!\c\c\a\a\c\l\z.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */