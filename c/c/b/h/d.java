package c.c.b.h;

import android.os.Parcel;
import android.os.Parcelable;
import c.c.a.a.c.l.q;

public class d extends b {
  public static final Parcelable.Creator<d> CREATOR = new i0();
  
  public final String b;
  
  public d(String paramString) {
    q.d(paramString);
    this.b = paramString;
  }
  
  public final b h() {
    return new d(this.b);
  }
  
  public void writeToParcel(Parcel paramParcel, int paramInt) {
    paramInt = q.a(paramParcel);
    q.h0(paramParcel, 1, this.b, false);
    q.C0(paramParcel, paramInt);
  }
}


/* Location:              C:\Users\panch\Downloads\dvba_v1.1.0-dex2jar.jar!\c\c\b\h\d.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */