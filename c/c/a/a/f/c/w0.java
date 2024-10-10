package c.c.a.a.f.c;

import android.os.Parcel;
import android.os.Parcelable;
import c.c.a.a.c.l.q;
import java.util.ArrayList;

public final class w0 implements Parcelable.Creator<x0> {
  public final Object createFromParcel(Parcel paramParcel) {
    l1 l1;
    String str1;
    int i = q.b0(paramParcel);
    String str2 = null;
    ArrayList<String> arrayList3 = null;
    ArrayList<String> arrayList1 = arrayList3;
    ArrayList<String> arrayList2 = arrayList1;
    boolean bool2 = false;
    boolean bool1 = false;
    while (paramParcel.dataPosition() < i) {
      int j = paramParcel.readInt();
      switch (0xFFFF & j) {
        default:
          q.Z(paramParcel, j);
          continue;
        case 7:
          arrayList2 = q.p(paramParcel, j);
          continue;
        case 6:
          l1 = (l1)q.n(paramParcel, j, l1.CREATOR);
          continue;
        case 5:
          bool1 = q.O(paramParcel, j);
          continue;
        case 4:
          str1 = q.o(paramParcel, j);
          continue;
        case 3:
          bool2 = q.O(paramParcel, j);
          continue;
        case 2:
          break;
      } 
      str2 = q.o(paramParcel, j);
    } 
    q.v(paramParcel, i);
    return new x0(str2, bool2, str1, bool1, l1, arrayList2);
  }
}


/* Location:              C:\Users\panch\Downloads\dvba_v1.1.0-dex2jar.jar!\c\c\a\a\f\c\w0.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */