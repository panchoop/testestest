package c.c.a.a.g.b;

import android.os.Parcel;
import android.os.Parcelable;
import c.c.a.a.c.l.q;
import c.c.a.a.c.l.r;
import c.c.a.a.c.l.u.a;

public final class j extends a {
  public static final Parcelable.Creator<j> CREATOR = new i();
  
  public final int b;
  
  public final r c;
  
  public j(int paramInt, r paramr) {
    this.b = paramInt;
    this.c = paramr;
  }
  
  public j(r paramr) {
    this.b = 1;
    this.c = paramr;
  }
  
  public final void writeToParcel(Parcel paramParcel, int paramInt) {
    int i = q.a(paramParcel);
    q.d0(paramParcel, 1, this.b);
    q.g0(paramParcel, 2, (Parcelable)this.c, paramInt, false);
    q.C0(paramParcel, i);
  }
}


/* Location:              C:\Users\panch\Downloads\dvba_v1.1.0-dex2jar.jar!\c\c\a\a\g\b\j.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */