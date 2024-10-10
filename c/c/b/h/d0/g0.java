package c.c.b.h.d0;

import android.os.Parcel;
import android.os.Parcelable;
import c.c.a.a.c.l.q;
import c.c.b.h.u;
import c.c.b.h.y;
import java.util.List;

public final class g0 extends u {
  public static final Parcelable.Creator<g0> CREATOR = new i0();
  
  public String b;
  
  public String c;
  
  public List<y> d;
  
  public g0() {}
  
  public g0(String paramString1, String paramString2, List<y> paramList) {
    this.b = paramString1;
    this.c = paramString2;
    this.d = paramList;
  }
  
  public final void writeToParcel(Parcel paramParcel, int paramInt) {
    paramInt = q.a(paramParcel);
    q.h0(paramParcel, 1, this.b, false);
    q.h0(paramParcel, 2, this.c, false);
    q.k0(paramParcel, 3, this.d, false);
    q.C0(paramParcel, paramInt);
  }
}


/* Location:              C:\Users\panch\Downloads\dvba_v1.1.0-dex2jar.jar!\c\c\b\h\d0\g0.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */