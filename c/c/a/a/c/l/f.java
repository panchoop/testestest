package c.c.a.a.c.l;

import android.accounts.Account;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import c.c.a.a.c.c;
import c.c.a.a.c.e;
import c.c.a.a.c.l.u.a;
import com.google.android.gms.common.api.Scope;

public class f extends a {
  public static final Parcelable.Creator<f> CREATOR = new c0();
  
  public final int b = 4;
  
  public final int c;
  
  public int d;
  
  public String e;
  
  public IBinder f;
  
  public Scope[] g;
  
  public Bundle h;
  
  public Account i;
  
  public c[] j;
  
  public c[] k;
  
  public boolean l;
  
  public f(int paramInt) {
    this.d = e.a;
    this.c = paramInt;
    this.l = true;
  }
  
  public f(int paramInt1, int paramInt2, int paramInt3, String paramString, IBinder paramIBinder, Scope[] paramArrayOfScope, Bundle paramBundle, Account paramAccount, c[] paramArrayOfc1, c[] paramArrayOfc2, boolean paramBoolean) {
    this.c = paramInt2;
    this.d = paramInt3;
    if ("com.google.android.gms".equals(paramString)) {
      this.e = "com.google.android.gms";
    } else {
      this.e = paramString;
    } 
    if (paramInt1 < 2) {
      Account account;
      paramString = null;
      if (paramIBinder != null)
        account = a.y(k.a.t(paramIBinder)); 
      this.i = account;
    } else {
      this.f = paramIBinder;
      this.i = paramAccount;
    } 
    this.g = paramArrayOfScope;
    this.h = paramBundle;
    this.j = paramArrayOfc1;
    this.k = paramArrayOfc2;
    this.l = paramBoolean;
  }
  
  public void writeToParcel(Parcel paramParcel, int paramInt) {
    int i = q.a(paramParcel);
    q.d0(paramParcel, 1, this.b);
    q.d0(paramParcel, 2, this.c);
    q.d0(paramParcel, 3, this.d);
    q.h0(paramParcel, 4, this.e, false);
    IBinder iBinder = this.f;
    if (iBinder != null) {
      int j = q.n0(paramParcel, 5);
      paramParcel.writeStrongBinder(iBinder);
      q.C0(paramParcel, j);
    } 
    q.j0(paramParcel, 6, this.g, paramInt, false);
    Bundle bundle = this.h;
    if (bundle != null) {
      int j = q.n0(paramParcel, 7);
      paramParcel.writeBundle(bundle);
      q.C0(paramParcel, j);
    } 
    q.g0(paramParcel, 8, (Parcelable)this.i, paramInt, false);
    q.j0(paramParcel, 10, this.j, paramInt, false);
    q.j0(paramParcel, 11, this.k, paramInt, false);
    q.c0(paramParcel, 12, this.l);
    q.C0(paramParcel, i);
  }
}


/* Location:              C:\Users\panch\Downloads\dvba_v1.1.0-dex2jar.jar!\c\c\a\a\c\l\f.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */