package c.c.a.a.c.k;

import android.app.PendingIntent;
import android.os.Parcel;
import android.os.Parcelable;
import c.c.a.a.c.l.q;
import com.google.android.gms.common.api.Status;

public final class m implements Parcelable.Creator<Status> {
  public final Object createFromParcel(Parcel paramParcel) {
    int k = q.b0(paramParcel);
    int j = 0;
    String str = null;
    PendingIntent pendingIntent = null;
    int i;
    for (i = 0; paramParcel.dataPosition() < k; i = q.Q(paramParcel, n)) {
      int n = paramParcel.readInt();
      int i1 = 0xFFFF & n;
      if (i1 != 1) {
        if (i1 != 2) {
          if (i1 != 3) {
            if (i1 != 1000) {
              q.Z(paramParcel, n);
              continue;
            } 
            j = q.Q(paramParcel, n);
            continue;
          } 
          pendingIntent = (PendingIntent)q.n(paramParcel, n, PendingIntent.CREATOR);
          continue;
        } 
        str = q.o(paramParcel, n);
        continue;
      } 
    } 
    q.v(paramParcel, k);
    return new Status(j, i, str, pendingIntent);
  }
}


/* Location:              C:\Users\panch\Downloads\dvba_v1.1.0-dex2jar.jar!\c\c\a\a\c\k\m.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */