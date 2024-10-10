package c.c.b.h;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import c.c.a.a.c.l.q;

public class c extends b {
  public static final Parcelable.Creator<c> CREATOR = new h0();
  
  public String b;
  
  public String c;
  
  public final String d;
  
  public String e;
  
  public boolean f;
  
  public c(String paramString1, String paramString2, String paramString3, String paramString4, boolean paramBoolean) {
    q.d(paramString1);
    this.b = paramString1;
    if (!TextUtils.isEmpty(paramString2) || !TextUtils.isEmpty(paramString3)) {
      this.c = paramString2;
      this.d = paramString3;
      this.e = paramString4;
      this.f = paramBoolean;
      return;
    } 
    throw new IllegalArgumentException("Cannot create an EmailAuthCredential without a password or emailLink.");
  }
  
  public final b h() {
    return new c(this.b, this.c, this.d, this.e, this.f);
  }
  
  public void writeToParcel(Parcel paramParcel, int paramInt) {
    paramInt = q.a(paramParcel);
    q.h0(paramParcel, 1, this.b, false);
    q.h0(paramParcel, 2, this.c, false);
    q.h0(paramParcel, 3, this.d, false);
    q.h0(paramParcel, 4, this.e, false);
    q.c0(paramParcel, 5, this.f);
    q.C0(paramParcel, paramInt);
  }
}


/* Location:              C:\Users\panch\Downloads\dvba_v1.1.0-dex2jar.jar!\c\c\b\h\c.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */