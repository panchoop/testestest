package c.c.a.a.f.c;

import android.os.Parcel;
import android.os.Parcelable;
import c.c.a.a.c.l.q;
import java.util.ArrayList;

public final class k1 implements Parcelable.Creator<l1> {
  public final Object createFromParcel(Parcel paramParcel) {
    int j = q.b0(paramParcel);
    int i = 0;
    ArrayList<String> arrayList = null;
    while (paramParcel.dataPosition() < j) {
      int k = paramParcel.readInt();
      int m = 0xFFFF & k;
      if (m != 1) {
        if (m != 2) {
          q.Z(paramParcel, k);
          continue;
        } 
        arrayList = q.p(paramParcel, k);
        continue;
      } 
      i = q.Q(paramParcel, k);
    } 
    q.v(paramParcel, j);
    return new l1(i, arrayList);
  }
}


/* Location:              C:\Users\panch\Downloads\dvba_v1.1.0-dex2jar.jar!\c\c\a\a\f\c\k1.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */