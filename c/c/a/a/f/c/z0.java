package c.c.a.a.f.c;

import android.os.Parcel;
import android.os.Parcelable;
import c.c.a.a.c.l.q;
import c.c.a.a.c.l.u.a;
import c.c.b.h.g0;
import java.util.List;

public final class z0 extends a {
  public static final Parcelable.Creator<z0> CREATOR = new y0();
  
  public String b;
  
  public String c;
  
  public boolean d;
  
  public String e;
  
  public String f;
  
  public f1 g;
  
  public String h;
  
  public String i;
  
  public long j;
  
  public long k;
  
  public boolean l;
  
  public g0 m;
  
  public List<b1> n;
  
  public z0() {
    this.g = new f1();
  }
  
  public z0(String paramString1, String paramString2, boolean paramBoolean1, String paramString3, String paramString4, f1 paramf1, String paramString5, String paramString6, long paramLong1, long paramLong2, boolean paramBoolean2, g0 paramg0, List<b1> paramList) {
    f1 f11;
    this.b = paramString1;
    this.c = paramString2;
    this.d = paramBoolean1;
    this.e = paramString3;
    this.f = paramString4;
    if (paramf1 == null) {
      f11 = new f1();
    } else {
      List<d1> list1 = paramf1.b;
      f11 = new f1();
      if (list1 != null)
        f11.b.addAll(list1); 
    } 
    this.g = f11;
    this.h = paramString5;
    this.i = paramString6;
    this.j = paramLong1;
    this.k = paramLong2;
    this.l = paramBoolean2;
    this.m = paramg0;
    List<b1> list = paramList;
    if (paramList == null)
      list = n.h(); 
    this.n = list;
  }
  
  public final void writeToParcel(Parcel paramParcel, int paramInt) {
    int i = q.a(paramParcel);
    q.h0(paramParcel, 2, this.b, false);
    q.h0(paramParcel, 3, this.c, false);
    q.c0(paramParcel, 4, this.d);
    q.h0(paramParcel, 5, this.e, false);
    q.h0(paramParcel, 6, this.f, false);
    q.g0(paramParcel, 7, (Parcelable)this.g, paramInt, false);
    q.h0(paramParcel, 8, this.h, false);
    q.h0(paramParcel, 9, this.i, false);
    q.e0(paramParcel, 10, this.j);
    q.e0(paramParcel, 11, this.k);
    q.c0(paramParcel, 12, this.l);
    q.g0(paramParcel, 13, (Parcelable)this.m, paramInt, false);
    q.k0(paramParcel, 14, this.n, false);
    q.C0(paramParcel, i);
  }
}


/* Location:              C:\Users\panch\Downloads\dvba_v1.1.0-dex2jar.jar!\c\c\a\a\f\c\z0.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */