package c.c.a.a.c.l;

import android.accounts.Account;
import android.os.Parcel;
import android.os.Parcelable;
import c.c.a.a.c.l.u.a;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;

public class r extends a {
  public static final Parcelable.Creator<r> CREATOR = new y();
  
  public final int b;
  
  public final Account c;
  
  public final int d;
  
  public final GoogleSignInAccount e;
  
  public r(int paramInt1, Account paramAccount, int paramInt2, GoogleSignInAccount paramGoogleSignInAccount) {
    this.b = paramInt1;
    this.c = paramAccount;
    this.d = paramInt2;
    this.e = paramGoogleSignInAccount;
  }
  
  public r(Account paramAccount, int paramInt, GoogleSignInAccount paramGoogleSignInAccount) {
    this.b = 2;
    this.c = paramAccount;
    this.d = paramInt;
    this.e = paramGoogleSignInAccount;
  }
  
  public void writeToParcel(Parcel paramParcel, int paramInt) {
    int i = q.a(paramParcel);
    q.d0(paramParcel, 1, this.b);
    q.g0(paramParcel, 2, (Parcelable)this.c, paramInt, false);
    q.d0(paramParcel, 3, this.d);
    q.g0(paramParcel, 4, (Parcelable)this.e, paramInt, false);
    q.C0(paramParcel, i);
  }
}


/* Location:              C:\Users\panch\Downloads\dvba_v1.1.0-dex2jar.jar!\c\c\a\a\c\l\r.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */