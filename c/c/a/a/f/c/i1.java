package c.c.a.a.f.c;

import android.os.Parcel;
import android.os.Parcelable;
import c.c.a.a.c.l.q;
import c.c.a.a.c.l.u.a;

public final class i1 extends a implements Object<i1, Object> {
  public static final Parcelable.Creator<i1> CREATOR = new j1();
  
  public String b;
  
  public String c;
  
  public String d;
  
  public b1 e;
  
  public i1() {}
  
  public i1(String paramString1, String paramString2, String paramString3, b1 paramb1) {
    this.b = paramString1;
    this.c = paramString2;
    this.d = paramString3;
    this.e = paramb1;
  }
  
  public final void writeToParcel(Parcel paramParcel, int paramInt) {
    int i = q.a(paramParcel);
    q.h0(paramParcel, 2, this.b, false);
    q.h0(paramParcel, 3, this.c, false);
    q.h0(paramParcel, 4, this.d, false);
    q.g0(paramParcel, 5, (Parcelable)this.e, paramInt, false);
    q.C0(paramParcel, i);
  }
}


/* Location:              C:\Users\panch\Downloads\dvba_v1.1.0-dex2jar.jar!\c\c\a\a\f\c\i1.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */