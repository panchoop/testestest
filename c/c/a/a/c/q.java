package c.c.a.a.c;

import android.app.PendingIntent;
import android.os.Parcel;
import android.os.Parcelable;
import c.c.a.a.c.l.q;

public final class q implements Parcelable.Creator<a> {
  public final Object createFromParcel(Parcel paramParcel) {
    int k = q.b0(paramParcel);
    int j = 0;
    PendingIntent pendingIntent = null;
    String str = null;
    int i = 0;
    while (paramParcel.dataPosition() < k) {
      int n = paramParcel.readInt();
      int m = 0xFFFF & n;
      if (m != 1) {
        if (m != 2) {
          if (m != 3) {
            if (m != 4) {
              q.Z(paramParcel, n);
              continue;
            } 
            str = q.o(paramParcel, n);
            continue;
          } 
          pendingIntent = (PendingIntent)q.n(paramParcel, n, PendingIntent.CREATOR);
          continue;
        } 
        i = q.Q(paramParcel, n);
        continue;
      } 
      j = q.Q(paramParcel, n);
    } 
    q.v(paramParcel, k);
    return new a(j, i, pendingIntent, str);
  }
}


/* Location:              C:\Users\panch\Downloads\dvba_v1.1.0-dex2jar.jar!\c\c\a\a\c\q.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */