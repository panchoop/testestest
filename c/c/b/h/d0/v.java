package c.c.b.h.d0;

import android.os.Parcel;
import android.os.Parcelable;
import c.c.a.a.c.l.q;
import c.c.a.a.c.l.u.c;

public final class v implements c {
  public static final Parcelable.Creator<v> CREATOR = new u();
  
  public final String b;
  
  public final String c;
  
  public boolean d;
  
  public v(String paramString1, String paramString2, boolean paramBoolean) {
    q.d(paramString1);
    q.d(paramString2);
    this.b = paramString1;
    this.c = paramString2;
    k.d(paramString2);
    this.d = paramBoolean;
  }
  
  public v(boolean paramBoolean) {
    this.d = paramBoolean;
    this.c = null;
    this.b = null;
  }
  
  public final int describeContents() {
    return 0;
  }
  
  public final void writeToParcel(Parcel paramParcel, int paramInt) {
    paramInt = q.a(paramParcel);
    q.h0(paramParcel, 1, this.b, false);
    q.h0(paramParcel, 2, this.c, false);
    q.c0(paramParcel, 3, this.d);
    q.C0(paramParcel, paramInt);
  }
}


/* Location:              C:\Users\panch\Downloads\dvba_v1.1.0-dex2jar.jar!\c\c\b\h\d0\v.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */