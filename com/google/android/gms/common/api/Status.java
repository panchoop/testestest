package com.google.android.gms.common.api;

import a.a.a.a.a;
import android.app.PendingIntent;
import android.os.Parcel;
import android.os.Parcelable;
import c.c.a.a.c.k.h;
import c.c.a.a.c.k.m;
import c.c.a.a.c.l.p;
import c.c.a.a.c.l.q;
import c.c.a.a.c.l.u.a;
import com.google.android.gms.common.internal.ReflectedParcelable;
import java.util.Arrays;

public final class Status extends a implements h, ReflectedParcelable {
  public static final Parcelable.Creator<Status> CREATOR;
  
  public static final Status f = new Status(0, null);
  
  public static final Status g = new Status(15, null);
  
  public static final Status h = new Status(16, null);
  
  public final int b;
  
  public final int c;
  
  public final String d;
  
  public final PendingIntent e;
  
  static {
    CREATOR = (Parcelable.Creator<Status>)new m();
  }
  
  public Status(int paramInt1, int paramInt2, String paramString, PendingIntent paramPendingIntent) {
    this.b = paramInt1;
    this.c = paramInt2;
    this.d = paramString;
    this.e = paramPendingIntent;
  }
  
  public Status(int paramInt, String paramString) {
    this.b = 1;
    this.c = paramInt;
    this.d = paramString;
    this.e = null;
  }
  
  public final boolean equals(Object paramObject) {
    if (!(paramObject instanceof Status))
      return false; 
    paramObject = paramObject;
    return (this.b == ((Status)paramObject).b && this.c == ((Status)paramObject).c && a.y(this.d, ((Status)paramObject).d) && a.y(this.e, ((Status)paramObject).e));
  }
  
  public final Status f() {
    return this;
  }
  
  public final String h() {
    StringBuilder stringBuilder;
    String str = this.d;
    if (str != null)
      return str; 
    int i = this.c;
    switch (i) {
      default:
        stringBuilder = new StringBuilder(32);
        stringBuilder.append("unknown status code: ");
        stringBuilder.append(i);
        return stringBuilder.toString();
      case 18:
        return "DEAD_CLIENT";
      case 17:
        return "API_NOT_CONNECTED";
      case 16:
        return "CANCELED";
      case 15:
        return "TIMEOUT";
      case 14:
        return "INTERRUPTED";
      case 13:
        return "ERROR";
      case 10:
        return "DEVELOPER_ERROR";
      case 8:
        return "INTERNAL_ERROR";
      case 7:
        return "NETWORK_ERROR";
      case 6:
        return "RESOLUTION_REQUIRED";
      case 5:
        return "INVALID_ACCOUNT";
      case 4:
        return "SIGN_IN_REQUIRED";
      case 3:
        return "SERVICE_DISABLED";
      case 2:
        return "SERVICE_VERSION_UPDATE_REQUIRED";
      case 0:
        return "SUCCESS";
      case -1:
        break;
    } 
    return "SUCCESS_CACHE";
  }
  
  public final int hashCode() {
    return Arrays.hashCode(new Object[] { Integer.valueOf(this.b), Integer.valueOf(this.c), this.d, this.e });
  }
  
  public final String toString() {
    p p = a.B0(this);
    p.a("statusCode", h());
    p.a("resolution", this.e);
    return p.toString();
  }
  
  public final void writeToParcel(Parcel paramParcel, int paramInt) {
    int i = q.a(paramParcel);
    q.d0(paramParcel, 1, this.c);
    q.h0(paramParcel, 2, this.d, false);
    q.g0(paramParcel, 3, (Parcelable)this.e, paramInt, false);
    q.d0(paramParcel, 1000, this.b);
    q.C0(paramParcel, i);
  }
}


/* Location:              C:\Users\panch\Downloads\dvba_v1.1.0-dex2jar.jar!\com\google\android\gms\common\api\Status.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */