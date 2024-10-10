package c.c.b.h;

import android.os.Parcel;
import android.os.Parcelable;
import c.c.a.a.c.l.q;
import c.c.a.a.f.c.n1;

public class g0 extends v {
  public static final Parcelable.Creator<g0> CREATOR = new f0();
  
  public final String b;
  
  public final String c;
  
  public final String d;
  
  public final n1 e;
  
  public final String f;
  
  public final String g;
  
  public final String h;
  
  public g0(String paramString1, String paramString2, String paramString3, n1 paramn1, String paramString4, String paramString5, String paramString6) {
    this.b = paramString1;
    this.c = paramString2;
    this.d = paramString3;
    this.e = paramn1;
    this.f = paramString4;
    this.g = paramString5;
    this.h = paramString6;
  }
  
  public static g0 i(n1 paramn1) {
    q.g(paramn1, "Must specify a non-null webSignInCredential");
    return new g0(null, null, null, paramn1, null, null, null);
  }
  
  public final b h() {
    return new g0(this.b, this.c, this.d, this.e, this.f, this.g, this.h);
  }
  
  public void writeToParcel(Parcel paramParcel, int paramInt) {
    int i = q.a(paramParcel);
    q.h0(paramParcel, 1, this.b, false);
    q.h0(paramParcel, 2, this.c, false);
    q.h0(paramParcel, 3, this.d, false);
    q.g0(paramParcel, 4, (Parcelable)this.e, paramInt, false);
    q.h0(paramParcel, 5, this.f, false);
    q.h0(paramParcel, 6, this.g, false);
    q.h0(paramParcel, 7, this.h, false);
    q.C0(paramParcel, i);
  }
}


/* Location:              C:\Users\panch\Downloads\dvba_v1.1.0-dex2jar.jar!\c\c\b\h\g0.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */