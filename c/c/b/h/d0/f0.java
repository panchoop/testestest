package c.c.b.h.d0;

import android.os.Parcel;
import android.os.Parcelable;
import c.c.a.a.c.l.q;
import c.c.b.h.g0;
import c.c.b.h.s;
import c.c.b.h.t;
import c.c.b.h.y;
import java.util.ArrayList;
import java.util.List;

public final class f0 extends t {
  public static final Parcelable.Creator<f0> CREATOR = new h0();
  
  public final List<y> b = new ArrayList<y>();
  
  public final g0 c;
  
  public final String d;
  
  public final g0 e;
  
  public final c0 f;
  
  public f0(List<y> paramList, g0 paramg0, String paramString, g0 paramg01, c0 paramc0) {
    for (s s : paramList) {
      if (s instanceof y)
        this.b.add((y)s); 
    } 
    q.f(paramg0);
    this.c = paramg0;
    q.d(paramString);
    this.d = paramString;
    this.e = paramg01;
    this.f = paramc0;
  }
  
  public final void writeToParcel(Parcel paramParcel, int paramInt) {
    int i = q.a(paramParcel);
    q.k0(paramParcel, 1, this.b, false);
    q.g0(paramParcel, 2, (Parcelable)this.c, paramInt, false);
    q.h0(paramParcel, 3, this.d, false);
    q.g0(paramParcel, 4, (Parcelable)this.e, paramInt, false);
    q.g0(paramParcel, 5, (Parcelable)this.f, paramInt, false);
    q.C0(paramParcel, i);
  }
}


/* Location:              C:\Users\panch\Downloads\dvba_v1.1.0-dex2jar.jar!\c\c\b\h\d0\f0.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */