package c.c.a.a.a.a.a;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import c.c.a.a.c.l.q;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.common.api.Scope;
import java.util.ArrayList;

public final class b implements Parcelable.Creator<GoogleSignInAccount> {
  public final Object createFromParcel(Parcel paramParcel) {
    Uri uri;
    ArrayList arrayList;
    int j = q.b0(paramParcel);
    String str10 = null;
    String str9 = null;
    String str1 = str9;
    String str2 = str1;
    String str3 = str2;
    String str4 = str3;
    String str5 = str4;
    String str6 = str5;
    String str7 = str6;
    String str8 = str7;
    long l = 0L;
    int i;
    for (i = 0; paramParcel.dataPosition() < j; i = q.Q(paramParcel, k)) {
      int k = paramParcel.readInt();
      switch (0xFFFF & k) {
        default:
          q.Z(paramParcel, k);
          continue;
        case 12:
          str8 = q.o(paramParcel, k);
          continue;
        case 11:
          str7 = q.o(paramParcel, k);
          continue;
        case 10:
          arrayList = q.r(paramParcel, k, Scope.CREATOR);
          continue;
        case 9:
          str5 = q.o(paramParcel, k);
          continue;
        case 8:
          l = q.R(paramParcel, k);
          continue;
        case 7:
          str4 = q.o(paramParcel, k);
          continue;
        case 6:
          uri = (Uri)q.n(paramParcel, k, Uri.CREATOR);
          continue;
        case 5:
          str2 = q.o(paramParcel, k);
          continue;
        case 4:
          str1 = q.o(paramParcel, k);
          continue;
        case 3:
          str9 = q.o(paramParcel, k);
          continue;
        case 2:
          str10 = q.o(paramParcel, k);
          continue;
        case 1:
          break;
      } 
    } 
    q.v(paramParcel, j);
    return new GoogleSignInAccount(i, str10, str9, str1, str2, uri, str4, l, str5, arrayList, str7, str8);
  }
}


/* Location:              C:\Users\panch\Downloads\dvba_v1.1.0-dex2jar.jar!\c\c\a\a\a\a\a\b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */