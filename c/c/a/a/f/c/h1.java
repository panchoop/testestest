package c.c.a.a.f.c;

import android.os.Parcel;
import android.os.Parcelable;
import c.c.a.a.c.l.q;
import java.util.ArrayList;

public final class h1 implements Parcelable.Creator<f1> {
  public final Object createFromParcel(Parcel paramParcel) {
    int i = q.b0(paramParcel);
    ArrayList<d1> arrayList;
    for (arrayList = null; paramParcel.dataPosition() < i; arrayList = q.r(paramParcel, j, d1.CREATOR)) {
      int j = paramParcel.readInt();
      if ((0xFFFF & j) != 2) {
        q.Z(paramParcel, j);
        continue;
      } 
    } 
    q.v(paramParcel, i);
    return new f1(arrayList);
  }
}


/* Location:              C:\Users\panch\Downloads\dvba_v1.1.0-dex2jar.jar!\c\c\a\a\f\c\h1.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */