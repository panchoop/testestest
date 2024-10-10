package c.c.a.a.f.c;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import c.c.a.a.c.l.q;
import c.c.a.a.c.l.u.a;

public final class n1 extends a implements Object<Object> {
  public static final Parcelable.Creator<n1> CREATOR = new m1();
  
  public String b;
  
  public String c;
  
  public String d;
  
  public String e;
  
  public String f;
  
  public String g;
  
  public String h;
  
  public String i;
  
  public boolean j;
  
  public boolean k;
  
  public String l;
  
  public String m;
  
  public String n;
  
  public String o;
  
  public boolean p;
  
  public String q;
  
  public n1() {
    this.j = true;
    this.k = true;
  }
  
  public n1(String paramString1, String paramString2, String paramString3, String paramString4, String paramString5, String paramString6, String paramString7, String paramString8) {
    this.b = "http://localhost";
    this.d = paramString1;
    this.e = paramString2;
    this.i = paramString4;
    this.l = paramString5;
    this.o = paramString6;
    this.q = paramString7;
    this.j = true;
    if (!TextUtils.isEmpty(paramString1) || !TextUtils.isEmpty(this.e) || !TextUtils.isEmpty(this.l)) {
      q.d(paramString3);
      this.f = paramString3;
      this.g = null;
      StringBuilder stringBuilder = new StringBuilder();
      if (!TextUtils.isEmpty(this.d)) {
        stringBuilder.append("id_token=");
        stringBuilder.append(this.d);
        stringBuilder.append("&");
      } 
      if (!TextUtils.isEmpty(this.e)) {
        stringBuilder.append("access_token=");
        stringBuilder.append(this.e);
        stringBuilder.append("&");
      } 
      if (!TextUtils.isEmpty(this.g)) {
        stringBuilder.append("identifier=");
        stringBuilder.append(this.g);
        stringBuilder.append("&");
      } 
      if (!TextUtils.isEmpty(this.i)) {
        stringBuilder.append("oauth_token_secret=");
        stringBuilder.append(this.i);
        stringBuilder.append("&");
      } 
      if (!TextUtils.isEmpty(this.l)) {
        stringBuilder.append("code=");
        stringBuilder.append(this.l);
        stringBuilder.append("&");
      } 
      if (!TextUtils.isEmpty(paramString8)) {
        stringBuilder.append("nonce=");
        stringBuilder.append(paramString8);
        stringBuilder.append("&");
      } 
      stringBuilder.append("providerId=");
      stringBuilder.append(this.f);
      this.h = stringBuilder.toString();
      this.k = true;
      return;
    } 
    throw new IllegalArgumentException("idToken, accessToken and authCode cannot all be null");
  }
  
  public n1(String paramString1, String paramString2, String paramString3, String paramString4, String paramString5, String paramString6, String paramString7, String paramString8, boolean paramBoolean1, boolean paramBoolean2, String paramString9, String paramString10, String paramString11, String paramString12, boolean paramBoolean3, String paramString13) {
    this.b = paramString1;
    this.c = paramString2;
    this.d = paramString3;
    this.e = paramString4;
    this.f = paramString5;
    this.g = paramString6;
    this.h = paramString7;
    this.i = paramString8;
    this.j = paramBoolean1;
    this.k = paramBoolean2;
    this.l = paramString9;
    this.m = paramString10;
    this.n = paramString11;
    this.o = paramString12;
    this.p = paramBoolean3;
    this.q = paramString13;
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
    q.h0(paramParcel, 9, this.i, false);
    q.c0(paramParcel, 10, this.j);
    q.c0(paramParcel, 11, this.k);
    q.h0(paramParcel, 12, this.l, false);
    q.h0(paramParcel, 13, this.m, false);
    q.h0(paramParcel, 14, this.n, false);
    q.h0(paramParcel, 15, this.o, false);
    q.c0(paramParcel, 16, this.p);
    q.h0(paramParcel, 17, this.q, false);
    q.C0(paramParcel, paramInt);
  }
}


/* Location:              C:\Users\panch\Downloads\dvba_v1.1.0-dex2jar.jar!\c\c\a\a\f\c\n1.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */