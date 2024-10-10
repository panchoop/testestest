package c.c.a.a.f.c;

import android.os.Parcel;
import android.os.Parcelable;
import c.c.a.a.c.l.q;
import c.c.a.a.c.l.u.a;
import java.util.List;

public final class x0 extends a implements Object<x0, Object> {
  public static final Parcelable.Creator<x0> CREATOR = new w0();
  
  public String b;
  
  public boolean c;
  
  public String d;
  
  public boolean e;
  
  public l1 f;
  
  public List<String> g;
  
  public x0() {
    this.f = new l1(null);
  }
  
  public x0(String paramString1, boolean paramBoolean1, String paramString2, boolean paramBoolean2, l1 paraml1, List<String> paramList) {
    l1 l11;
    this.b = paramString1;
    this.c = paramBoolean1;
    this.d = paramString2;
    this.e = paramBoolean2;
    if (paraml1 == null) {
      l11 = new l1(null);
    } else {
      l11 = new l1(paraml1.c);
    } 
    this.f = l11;
    this.g = paramList;
  }
  
  public final void writeToParcel(Parcel paramParcel, int paramInt) {
    int i = q.a(paramParcel);
    q.h0(paramParcel, 2, this.b, false);
    q.c0(paramParcel, 3, this.c);
    q.h0(paramParcel, 4, this.d, false);
    q.c0(paramParcel, 5, this.e);
    q.g0(paramParcel, 6, (Parcelable)this.f, paramInt, false);
    q.i0(paramParcel, 7, this.g, false);
    q.C0(paramParcel, i);
  }
}


/* Location:              C:\Users\panch\Downloads\dvba_v1.1.0-dex2jar.jar!\c\c\a\a\f\c\x0.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */