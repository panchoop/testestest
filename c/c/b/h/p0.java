package c.c.b.h;

import android.os.Parcel;
import android.os.Parcelable;
import c.c.a.a.c.l.q;

public final class p0 implements Parcelable.Creator<w> {
  public final Object createFromParcel(Parcel paramParcel) {
    int i = q.b0(paramParcel);
    String str5 = null;
    String str4 = null;
    String str1 = str4;
    String str2 = str1;
    String str3 = str2;
    boolean bool2 = false;
    boolean bool1 = false;
    while (paramParcel.dataPosition() < i) {
      int j = paramParcel.readInt();
      switch (0xFFFF & j) {
        default:
          q.Z(paramParcel, j);
          continue;
        case 7:
          str3 = q.o(paramParcel, j);
          continue;
        case 6:
          str2 = q.o(paramParcel, j);
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
          str4 = q.o(paramParcel, j);
          continue;
        case 1:
          break;
      } 
      str5 = q.o(paramParcel, j);
    } 
    q.v(paramParcel, i);
    return new w(str5, str4, bool2, str1, bool1, str2, str3);
  }
}


/* Location:              C:\Users\panch\Downloads\dvba_v1.1.0-dex2jar.jar!\c\c\b\h\p0.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */