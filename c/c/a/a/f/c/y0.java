package c.c.a.a.f.c;

import android.os.Parcel;
import android.os.Parcelable;
import c.c.a.a.c.l.q;
import c.c.b.h.g0;
import java.util.ArrayList;

public final class y0 implements Parcelable.Creator<z0> {
  public final Object createFromParcel(Parcel paramParcel) {
    String str1;
    String str2;
    f1 f1;
    String str3;
    String str4;
    g0 g0;
    String str5;
    int i = q.b0(paramParcel);
    long l2 = 0L;
    long l1 = 0L;
    String str6 = null;
    ArrayList<b1> arrayList8 = null;
    ArrayList<b1> arrayList1 = arrayList8;
    ArrayList<b1> arrayList2 = arrayList1;
    ArrayList<b1> arrayList3 = arrayList2;
    ArrayList<b1> arrayList4 = arrayList3;
    ArrayList<b1> arrayList5 = arrayList4;
    ArrayList<b1> arrayList6 = arrayList5;
    ArrayList<b1> arrayList7 = arrayList6;
    boolean bool2 = false;
    boolean bool1 = false;
    while (paramParcel.dataPosition() < i) {
      int j = paramParcel.readInt();
      switch (0xFFFF & j) {
        default:
          q.Z(paramParcel, j);
          continue;
        case 14:
          arrayList7 = q.r(paramParcel, j, b1.CREATOR);
          continue;
        case 13:
          g0 = (g0)q.n(paramParcel, j, g0.CREATOR);
          continue;
        case 12:
          bool1 = q.O(paramParcel, j);
          continue;
        case 11:
          l1 = q.R(paramParcel, j);
          continue;
        case 10:
          l2 = q.R(paramParcel, j);
          continue;
        case 9:
          str4 = q.o(paramParcel, j);
          continue;
        case 8:
          str3 = q.o(paramParcel, j);
          continue;
        case 7:
          f1 = (f1)q.n(paramParcel, j, f1.CREATOR);
          continue;
        case 6:
          str2 = q.o(paramParcel, j);
          continue;
        case 5:
          str1 = q.o(paramParcel, j);
          continue;
        case 4:
          bool2 = q.O(paramParcel, j);
          continue;
        case 3:
          str5 = q.o(paramParcel, j);
          continue;
        case 2:
          break;
      } 
      str6 = q.o(paramParcel, j);
    } 
    q.v(paramParcel, i);
    return new z0(str6, str5, bool2, str1, str2, f1, str3, str4, l2, l1, bool1, g0, arrayList7);
  }
}


/* Location:              C:\Users\panch\Downloads\dvba_v1.1.0-dex2jar.jar!\c\c\a\a\f\c\y0.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */