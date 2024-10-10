package c.c.a.a.f.c;

import android.os.Parcel;
import android.os.Parcelable;
import c.c.a.a.c.l.q;

public final class m1 implements Parcelable.Creator<n1> {
  public final Object createFromParcel(Parcel paramParcel) {
    int i = q.b0(paramParcel);
    String str13 = null;
    String str12 = null;
    String str1 = str12;
    String str2 = str1;
    String str3 = str2;
    String str4 = str3;
    String str5 = str4;
    String str6 = str5;
    String str7 = str6;
    String str8 = str7;
    String str9 = str8;
    String str10 = str9;
    String str11 = str10;
    boolean bool3 = false;
    boolean bool2 = false;
    boolean bool1 = false;
    while (paramParcel.dataPosition() < i) {
      int j = paramParcel.readInt();
      switch (0xFFFF & j) {
        default:
          q.Z(paramParcel, j);
          continue;
        case 17:
          str11 = q.o(paramParcel, j);
          continue;
        case 16:
          bool1 = q.O(paramParcel, j);
          continue;
        case 15:
          str10 = q.o(paramParcel, j);
          continue;
        case 14:
          str9 = q.o(paramParcel, j);
          continue;
        case 13:
          str8 = q.o(paramParcel, j);
          continue;
        case 12:
          str7 = q.o(paramParcel, j);
          continue;
        case 11:
          bool2 = q.O(paramParcel, j);
          continue;
        case 10:
          bool3 = q.O(paramParcel, j);
          continue;
        case 9:
          str6 = q.o(paramParcel, j);
          continue;
        case 8:
          str5 = q.o(paramParcel, j);
          continue;
        case 7:
          str4 = q.o(paramParcel, j);
          continue;
        case 6:
          str3 = q.o(paramParcel, j);
          continue;
        case 5:
          str2 = q.o(paramParcel, j);
          continue;
        case 4:
          str1 = q.o(paramParcel, j);
          continue;
        case 3:
          str12 = q.o(paramParcel, j);
          continue;
        case 2:
          break;
      } 
      str13 = q.o(paramParcel, j);
    } 
    q.v(paramParcel, i);
    return new n1(str13, str12, str1, str2, str3, str4, str5, str6, bool3, bool2, str7, str8, str9, str10, bool1, str11);
  }
}


/* Location:              C:\Users\panch\Downloads\dvba_v1.1.0-dex2jar.jar!\c\c\a\a\f\c\m1.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */