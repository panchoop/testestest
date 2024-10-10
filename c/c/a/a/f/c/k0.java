package c.c.a.a.f.c;

import android.os.Parcel;
import android.os.Parcelable;
import c.c.a.a.c.l.q;
import c.c.a.a.c.l.u.a;

public final class k0 extends a {
  public static final Parcelable.Creator<k0> CREATOR = new j0();
  
  public final n1 b;
  
  public k0(n1 paramn1) {
    this.b = paramn1;
  }
  
  public final void writeToParcel(Parcel paramParcel, int paramInt) {
    int i = q.a(paramParcel);
    q.g0(paramParcel, 1, (Parcelable)this.b, paramInt, false);
    q.C0(paramParcel, i);
  }
}


/* Location:              C:\Users\panch\Downloads\dvba_v1.1.0-dex2jar.jar!\c\c\a\a\f\c\k0.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */