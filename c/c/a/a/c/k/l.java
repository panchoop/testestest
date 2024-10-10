package c.c.a.a.c.k;

import android.os.Parcel;
import android.os.Parcelable;
import c.c.a.a.c.l.q;
import com.google.android.gms.common.api.Scope;

public final class l implements Parcelable.Creator<Scope> {
  public final Object createFromParcel(Parcel paramParcel) {
    int j = q.b0(paramParcel);
    int i = 0;
    String str = null;
    while (paramParcel.dataPosition() < j) {
      int k = paramParcel.readInt();
      int m = 0xFFFF & k;
      if (m != 1) {
        if (m != 2) {
          q.Z(paramParcel, k);
          continue;
        } 
        str = q.o(paramParcel, k);
        continue;
      } 
      i = q.Q(paramParcel, k);
    } 
    q.v(paramParcel, j);
    return new Scope(i, str);
  }
}


/* Location:              C:\Users\panch\Downloads\dvba_v1.1.0-dex2jar.jar!\c\c\a\a\c\k\l.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */