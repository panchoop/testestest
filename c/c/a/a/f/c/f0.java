package c.c.a.a.f.c;

import android.os.Parcel;
import android.os.Parcelable;
import c.c.a.a.c.l.q;
import c.c.a.a.c.l.u.a;

public final class f0 extends a {
  public static final Parcelable.Creator<f0> CREATOR = new e0();
  
  public final String b;
  
  public final n1 c;
  
  public f0(String paramString, n1 paramn1) {
    this.b = paramString;
    this.c = paramn1;
  }
  
  public final void writeToParcel(Parcel paramParcel, int paramInt) {
    int i = q.a(paramParcel);
    q.h0(paramParcel, 1, this.b, false);
    q.g0(paramParcel, 2, (Parcelable)this.c, paramInt, false);
    q.C0(paramParcel, i);
  }
}


/* Location:              C:\Users\panch\Downloads\dvba_v1.1.0-dex2jar.jar!\c\c\a\a\f\c\f0.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */