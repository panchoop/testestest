package c.c.a.a.f.c;

import android.os.Parcel;
import android.os.Parcelable;
import c.c.a.a.c.l.q;
import c.c.a.a.c.l.u.a;

public final class b1 extends a {
  public static final Parcelable.Creator<b1> CREATOR = new e1();
  
  public final String b;
  
  public final String c;
  
  public final String d;
  
  public final long e;
  
  public b1(String paramString1, String paramString2, String paramString3, long paramLong) {
    this.b = paramString1;
    q.d(paramString2);
    this.c = paramString2;
    this.d = paramString3;
    this.e = paramLong;
  }
  
  public final void writeToParcel(Parcel paramParcel, int paramInt) {
    paramInt = q.a(paramParcel);
    q.h0(paramParcel, 1, this.b, false);
    q.h0(paramParcel, 2, this.c, false);
    q.h0(paramParcel, 3, this.d, false);
    q.e0(paramParcel, 4, this.e);
    q.C0(paramParcel, paramInt);
  }
}


/* Location:              C:\Users\panch\Downloads\dvba_v1.1.0-dex2jar.jar!\c\c\a\a\f\c\b1.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */