package c.c.a.a.f.c;

import android.os.Parcel;
import android.os.Parcelable;
import c.c.a.a.c.l.q;
import c.c.a.a.c.l.u.a;
import c.c.b.h.g0;
import com.google.android.gms.common.api.Status;

public final class t0 extends a {
  public static final Parcelable.Creator<t0> CREATOR = new s0();
  
  public final Status b;
  
  public final g0 c;
  
  public final String d;
  
  public final String e;
  
  public t0(Status paramStatus, g0 paramg0, String paramString1, String paramString2) {
    this.b = paramStatus;
    this.c = paramg0;
    this.d = paramString1;
    this.e = paramString2;
  }
  
  public final void writeToParcel(Parcel paramParcel, int paramInt) {
    int i = q.a(paramParcel);
    q.g0(paramParcel, 1, (Parcelable)this.b, paramInt, false);
    q.g0(paramParcel, 2, (Parcelable)this.c, paramInt, false);
    q.h0(paramParcel, 3, this.d, false);
    q.h0(paramParcel, 4, this.e, false);
    q.C0(paramParcel, i);
  }
}


/* Location:              C:\Users\panch\Downloads\dvba_v1.1.0-dex2jar.jar!\c\c\a\a\f\c\t0.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */