package c.c.b.h.d0;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import c.c.a.a.c.l.q;
import c.c.a.a.c.l.u.c;
import c.c.b.h.g0;
import java.util.List;

public final class x implements c {
  public static final Parcelable.Creator<x> CREATOR = new w();
  
  public c0 b;
  
  public v c;
  
  public g0 d;
  
  public x(c0 paramc0) {
    q.f(paramc0);
    this.b = paramc0;
    List<z> list = paramc0.f;
    this.c = null;
    for (byte b = 0; b < list.size(); b++) {
      if (!TextUtils.isEmpty(((z)list.get(b)).i))
        this.c = new v(((z)list.get(b)).c, ((z)list.get(b)).i, paramc0.k); 
    } 
    if (this.c == null)
      this.c = new v(paramc0.k); 
    this.d = paramc0.l;
  }
  
  public x(c0 paramc0, v paramv, g0 paramg0) {
    this.b = paramc0;
    this.c = paramv;
    this.d = paramg0;
  }
  
  public final int describeContents() {
    return 0;
  }
  
  public final void writeToParcel(Parcel paramParcel, int paramInt) {
    int i = q.a(paramParcel);
    q.g0(paramParcel, 1, (Parcelable)this.b, paramInt, false);
    q.g0(paramParcel, 2, (Parcelable)this.c, paramInt, false);
    q.g0(paramParcel, 3, (Parcelable)this.d, paramInt, false);
    q.C0(paramParcel, i);
  }
}


/* Location:              C:\Users\panch\Downloads\dvba_v1.1.0-dex2jar.jar!\c\c\b\h\d0\x.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */