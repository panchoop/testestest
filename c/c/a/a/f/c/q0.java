package c.c.a.a.f.c;

import android.os.Parcel;
import android.os.Parcelable;
import c.c.a.a.c.l.q;
import c.c.a.a.c.l.u.a;
import c.c.b.h.w;

public final class q0 extends a {
  public static final Parcelable.Creator<q0> CREATOR = new p0();
  
  public final w b;
  
  public final String c;
  
  public q0(w paramw, String paramString) {
    this.b = paramw;
    this.c = paramString;
  }
  
  public final void writeToParcel(Parcel paramParcel, int paramInt) {
    int i = q.a(paramParcel);
    q.g0(paramParcel, 1, (Parcelable)this.b, paramInt, false);
    q.h0(paramParcel, 2, this.c, false);
    q.C0(paramParcel, i);
  }
}


/* Location:              C:\Users\panch\Downloads\dvba_v1.1.0-dex2jar.jar!\c\c\a\a\f\c\q0.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */