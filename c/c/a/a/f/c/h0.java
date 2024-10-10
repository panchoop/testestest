package c.c.a.a.f.c;

import android.os.Parcel;
import android.os.Parcelable;
import c.c.a.a.c.l.q;
import c.c.a.a.c.l.u.a;
import c.c.b.h.w;

public final class h0 extends a {
  public static final Parcelable.Creator<h0> CREATOR = new g0();
  
  public final String b;
  
  public final w c;
  
  public h0(String paramString, w paramw) {
    this.b = paramString;
    this.c = paramw;
  }
  
  public final void writeToParcel(Parcel paramParcel, int paramInt) {
    int i = q.a(paramParcel);
    q.h0(paramParcel, 1, this.b, false);
    q.g0(paramParcel, 2, (Parcelable)this.c, paramInt, false);
    q.C0(paramParcel, i);
  }
}


/* Location:              C:\Users\panch\Downloads\dvba_v1.1.0-dex2jar.jar!\c\c\a\a\f\c\h0.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */