package c.c.b.h.d0;

import android.os.Parcel;
import android.os.Parcelable;
import c.c.a.a.c.l.q;

public final class y implements Parcelable.Creator<z> {
  public final Object createFromParcel(Parcel paramParcel) {
    int i = q.b0(paramParcel);
    String str7 = null;
    String str6 = null;
    String str1 = str6;
    String str2 = str1;
    String str3 = str2;
    String str4 = str3;
    String str5 = str4;
    boolean bool = false;
    while (paramParcel.dataPosition() < i) {
      int j = paramParcel.readInt();
      switch (0xFFFF & j) {
        default:
          q.Z(paramParcel, j);
          continue;
        case 8:
          str5 = q.o(paramParcel, j);
          continue;
        case 7:
          bool = q.O(paramParcel, j);
          continue;
        case 6:
          str4 = q.o(paramParcel, j);
          continue;
        case 5:
          str1 = q.o(paramParcel, j);
          continue;
        case 4:
          str2 = q.o(paramParcel, j);
          continue;
        case 3:
          str3 = q.o(paramParcel, j);
          continue;
        case 2:
          str6 = q.o(paramParcel, j);
          continue;
        case 1:
          break;
      } 
      str7 = q.o(paramParcel, j);
    } 
    q.v(paramParcel, i);
    return new z(str7, str6, str1, str2, str3, str4, bool, str5);
  }
}


/* Location:              C:\Users\panch\Downloads\dvba_v1.1.0-dex2jar.jar!\c\c\b\h\d0\y.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */