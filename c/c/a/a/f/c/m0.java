package c.c.a.a.f.c;

import android.os.Parcel;
import android.os.Parcelable;
import c.c.a.a.c.l.q;
import c.c.a.a.c.l.u.a;

public final class m0 extends a {
  public static final Parcelable.Creator<m0> CREATOR = new l0();
  
  public final String b;
  
  public final String c;
  
  public final String d;
  
  public m0(String paramString1, String paramString2, String paramString3) {
    this.b = paramString1;
    this.c = paramString2;
    this.d = paramString3;
  }
  
  public final void writeToParcel(Parcel paramParcel, int paramInt) {
    paramInt = q.a(paramParcel);
    q.h0(paramParcel, 1, this.b, false);
    q.h0(paramParcel, 2, this.c, false);
    q.h0(paramParcel, 3, this.d, false);
    q.C0(paramParcel, paramInt);
  }
}


/* Location:              C:\Users\panch\Downloads\dvba_v1.1.0-dex2jar.jar!\c\c\a\a\f\c\m0.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */