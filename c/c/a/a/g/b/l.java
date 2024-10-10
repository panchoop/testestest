package c.c.a.a.g.b;

import android.os.Parcel;
import android.os.Parcelable;
import c.c.a.a.c.a;
import c.c.a.a.c.l.q;
import c.c.a.a.c.l.s;
import c.c.a.a.c.l.u.a;

public final class l extends a {
  public static final Parcelable.Creator<l> CREATOR = new k();
  
  public final int b = 1;
  
  public final a c;
  
  public final s d;
  
  public l() {
    this.c = a1;
    this.d = null;
  }
  
  public l(int paramInt, a parama, s params) {
    this.c = parama;
    this.d = params;
  }
  
  public final void writeToParcel(Parcel paramParcel, int paramInt) {
    int i = q.a(paramParcel);
    q.d0(paramParcel, 1, this.b);
    q.g0(paramParcel, 2, (Parcelable)this.c, paramInt, false);
    q.g0(paramParcel, 3, (Parcelable)this.d, paramInt, false);
    q.C0(paramParcel, i);
  }
}


/* Location:              C:\Users\panch\Downloads\dvba_v1.1.0-dex2jar.jar!\c\c\a\a\g\b\l.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */