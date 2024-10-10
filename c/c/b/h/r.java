package c.c.b.h;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import c.c.a.a.c.l.q;

public class r extends b {
  public static final Parcelable.Creator<r> CREATOR = new o0();
  
  public final String b;
  
  public final String c;
  
  public r(String paramString1, String paramString2) {
    if (paramString1 != null || paramString2 != null) {
      i(paramString1, "idToken");
      this.b = paramString1;
      i(paramString2, "accessToken");
      this.c = paramString2;
      return;
    } 
    throw new IllegalArgumentException("Must specify an idToken or an accessToken.");
  }
  
  public static String i(String paramString1, String paramString2) {
    if (paramString1 == null || !TextUtils.isEmpty(paramString1))
      return paramString1; 
    throw new IllegalArgumentException(paramString2.concat(" must not be empty"));
  }
  
  public final b h() {
    return new r(this.b, this.c);
  }
  
  public void writeToParcel(Parcel paramParcel, int paramInt) {
    paramInt = q.a(paramParcel);
    q.h0(paramParcel, 1, this.b, false);
    q.h0(paramParcel, 2, this.c, false);
    q.C0(paramParcel, paramInt);
  }
}


/* Location:              C:\Users\panch\Downloads\dvba_v1.1.0-dex2jar.jar!\c\c\b\h\r.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */