package c.c.a.a.c.l;

import android.accounts.Account;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import c.c.a.a.c.c;
import com.google.android.gms.common.api.Scope;

public final class c0 implements Parcelable.Creator<f> {
  public final Object createFromParcel(Parcel paramParcel) {
    Scope[] arrayOfScope;
    Bundle bundle;
    Account account;
    IBinder iBinder;
    int m = q.b0(paramParcel);
    String str = null;
    c[] arrayOfC6 = null;
    c[] arrayOfC1 = arrayOfC6;
    c[] arrayOfC2 = arrayOfC1;
    c[] arrayOfC3 = arrayOfC2;
    c[] arrayOfC4 = arrayOfC3;
    c[] arrayOfC5 = arrayOfC4;
    int k = 0;
    int j = 0;
    int i = 0;
    boolean bool = false;
    while (paramParcel.dataPosition() < m) {
      int n = paramParcel.readInt();
      switch (0xFFFF & n) {
        default:
          q.Z(paramParcel, n);
          continue;
        case 12:
          bool = q.O(paramParcel, n);
          continue;
        case 11:
          arrayOfC5 = q.<c>q(paramParcel, n, c.CREATOR);
          continue;
        case 10:
          arrayOfC4 = q.<c>q(paramParcel, n, c.CREATOR);
          continue;
        case 8:
          account = q.<Account>n(paramParcel, n, Account.CREATOR);
          continue;
        case 7:
          bundle = q.k(paramParcel, n);
          continue;
        case 6:
          arrayOfScope = q.<Scope>q(paramParcel, n, Scope.CREATOR);
          continue;
        case 5:
          iBinder = q.P(paramParcel, n);
          continue;
        case 4:
          str = q.o(paramParcel, n);
          continue;
        case 3:
          i = q.Q(paramParcel, n);
          continue;
        case 2:
          j = q.Q(paramParcel, n);
          continue;
        case 1:
          break;
      } 
      k = q.Q(paramParcel, n);
    } 
    q.v(paramParcel, m);
    return new f(k, j, i, str, iBinder, arrayOfScope, bundle, account, arrayOfC4, arrayOfC5, bool);
  }
}


/* Location:              C:\Users\panch\Downloads\dvba_v1.1.0-dex2jar.jar!\c\c\a\a\c\l\c0.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */