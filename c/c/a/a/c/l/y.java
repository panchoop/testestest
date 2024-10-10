package c.c.a.a.c.l;

import android.accounts.Account;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;

public final class y implements Parcelable.Creator<r> {
  public final Object createFromParcel(Parcel paramParcel) {
    int k = q.b0(paramParcel);
    int j = 0;
    Account account = null;
    GoogleSignInAccount googleSignInAccount = null;
    int i = 0;
    while (paramParcel.dataPosition() < k) {
      int n = paramParcel.readInt();
      int m = 0xFFFF & n;
      if (m != 1) {
        if (m != 2) {
          if (m != 3) {
            if (m != 4) {
              q.Z(paramParcel, n);
              continue;
            } 
            googleSignInAccount = q.<GoogleSignInAccount>n(paramParcel, n, GoogleSignInAccount.CREATOR);
            continue;
          } 
          i = q.Q(paramParcel, n);
          continue;
        } 
        account = q.<Account>n(paramParcel, n, Account.CREATOR);
        continue;
      } 
      j = q.Q(paramParcel, n);
    } 
    q.v(paramParcel, k);
    return new r(j, account, i, googleSignInAccount);
  }
}


/* Location:              C:\Users\panch\Downloads\dvba_v1.1.0-dex2jar.jar!\c\c\a\a\c\l\y.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */