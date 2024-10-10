package c.c.a.a.f.c;

import android.os.Parcel;
import android.os.Parcelable;
import c.c.a.a.c.l.q;
import c.c.a.a.c.l.u.a;
import c.c.b.h.g0;
import java.util.List;

public final class v0 extends a {
  public static final Parcelable.Creator<v0> CREATOR = new u0();
  
  public String b;
  
  public List<b1> c;
  
  public g0 d;
  
  public v0(String paramString, List<b1> paramList, g0 paramg0) {
    this.b = paramString;
    this.c = paramList;
    this.d = paramg0;
  }
  
  public final void writeToParcel(Parcel paramParcel, int paramInt) {
    int i = q.a(paramParcel);
    q.h0(paramParcel, 1, this.b, false);
    q.k0(paramParcel, 2, this.c, false);
    q.g0(paramParcel, 3, (Parcelable)this.d, paramInt, false);
    q.C0(paramParcel, i);
  }
}


/* Location:              C:\Users\panch\Downloads\dvba_v1.1.0-dex2jar.jar!\c\c\a\a\f\c\v0.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */