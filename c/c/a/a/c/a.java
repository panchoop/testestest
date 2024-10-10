package c.c.a.a.c;

import android.app.PendingIntent;
import android.os.Parcel;
import android.os.Parcelable;
import c.c.a.a.c.l.p;
import c.c.a.a.c.l.q;
import c.c.a.a.c.l.u.a;
import java.util.Arrays;

public final class a extends a {
  public static final Parcelable.Creator<a> CREATOR;
  
  public static final a f = new a(0);
  
  public final int b = 1;
  
  public final int c;
  
  public final PendingIntent d;
  
  public final String e;
  
  static {
    CREATOR = new q();
  }
  
  public a(int paramInt) {
    this.c = paramInt;
    this.d = null;
    this.e = null;
  }
  
  public a(int paramInt1, int paramInt2, PendingIntent paramPendingIntent, String paramString) {
    this.c = paramInt2;
    this.d = paramPendingIntent;
    this.e = paramString;
  }
  
  public a(int paramInt, PendingIntent paramPendingIntent) {
    this.c = paramInt;
    this.d = paramPendingIntent;
    this.e = null;
  }
  
  public static String i(int paramInt) {
    if (paramInt != 99) {
      if (paramInt != 1500) {
        StringBuilder stringBuilder;
        switch (paramInt) {
          default:
            switch (paramInt) {
              default:
                stringBuilder = new StringBuilder(31);
                stringBuilder.append("UNKNOWN_ERROR_CODE(");
                stringBuilder.append(paramInt);
                stringBuilder.append(")");
                return stringBuilder.toString();
              case 21:
                return "API_VERSION_UPDATE_REQUIRED";
              case 20:
                return "RESTRICTED_PROFILE";
              case 19:
                return "SERVICE_MISSING_PERMISSION";
              case 18:
                return "SERVICE_UPDATING";
              case 17:
                return "SIGN_IN_FAILED";
              case 16:
                return "API_UNAVAILABLE";
              case 15:
                return "INTERRUPTED";
              case 14:
                return "TIMEOUT";
              case 13:
                break;
            } 
            return "CANCELED";
          case 11:
            return "LICENSE_CHECK_FAILED";
          case 10:
            return "DEVELOPER_ERROR";
          case 9:
            return "SERVICE_INVALID";
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
          case 1:
            return "SERVICE_MISSING";
          case 0:
            return "SUCCESS";
          case -1:
            break;
        } 
        return "UNKNOWN";
      } 
      return "DRIVE_EXTERNAL_STORAGE_REQUIRED";
    } 
    return "UNFINISHED";
  }
  
  public final boolean equals(Object paramObject) {
    if (paramObject == this)
      return true; 
    if (!(paramObject instanceof a))
      return false; 
    paramObject = paramObject;
    return (this.c == ((a)paramObject).c && a.a.a.a.a.y(this.d, ((a)paramObject).d) && a.a.a.a.a.y(this.e, ((a)paramObject).e));
  }
  
  public final boolean h() {
    return (this.c == 0);
  }
  
  public final int hashCode() {
    return Arrays.hashCode(new Object[] { Integer.valueOf(this.c), this.d, this.e });
  }
  
  public final String toString() {
    p p = a.a.a.a.a.B0(this);
    p.a("statusCode", i(this.c));
    p.a("resolution", this.d);
    p.a("message", this.e);
    return p.toString();
  }
  
  public final void writeToParcel(Parcel paramParcel, int paramInt) {
    int i = q.a(paramParcel);
    q.d0(paramParcel, 1, this.b);
    q.d0(paramParcel, 2, this.c);
    q.g0(paramParcel, 3, (Parcelable)this.d, paramInt, false);
    q.h0(paramParcel, 4, this.e, false);
    q.C0(paramParcel, i);
  }
}


/* Location:              C:\Users\panch\Downloads\dvba_v1.1.0-dex2jar.jar!\c\c\a\a\c\a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */