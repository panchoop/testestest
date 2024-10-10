package c.c.a.a.f.c;

import android.os.Parcel;
import android.os.Parcelable;
import c.c.a.a.c.l.q;
import c.c.a.a.c.l.u.a;

public final class d1 extends a {
  public static final Parcelable.Creator<d1> CREATOR = new g1();
  
  public String b;
  
  public String c;
  
  public String d;
  
  public String e;
  
  public String f;
  
  public String g;
  
  public String h;
  
  public d1() {}
  
  public d1(String paramString1, String paramString2, String paramString3, String paramString4, String paramString5, String paramString6, String paramString7) {
    this.b = paramString1;
    this.c = paramString2;
    this.d = paramString3;
    this.e = paramString4;
    this.f = paramString5;
    this.g = paramString6;
    this.h = paramString7;
  }
  
  public final void writeToParcel(Parcel paramParcel, int paramInt) {
    paramInt = q.a(paramParcel);
    q.h0(paramParcel, 2, this.b, false);
    q.h0(paramParcel, 3, this.c, false);
    q.h0(paramParcel, 4, this.d, false);
    q.h0(paramParcel, 5, this.e, false);
    q.h0(paramParcel, 6, this.f, false);
    q.h0(paramParcel, 7, this.g, false);
    q.h0(paramParcel, 8, this.h, false);
    q.C0(paramParcel, paramInt);
  }
}


/* Location:              C:\Users\panch\Downloads\dvba_v1.1.0-dex2jar.jar!\c\c\a\a\f\c\d1.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */