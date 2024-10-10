package c.c.a.a.f.c;

import android.os.Parcel;
import android.os.Parcelable;
import c.c.a.a.c.l.q;
import c.c.a.a.c.l.u.a;

public final class b0 extends a {
  public static final Parcelable.Creator<b0> CREATOR = new a0();
  
  public final String b;
  
  public b0(String paramString) {
    this.b = paramString;
  }
  
  public final void writeToParcel(Parcel paramParcel, int paramInt) {
    paramInt = q.a(paramParcel);
    q.h0(paramParcel, 1, this.b, false);
    q.C0(paramParcel, paramInt);
  }
}


/* Location:              C:\Users\panch\Downloads\dvba_v1.1.0-dex2jar.jar!\c\c\a\a\f\c\b0.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */