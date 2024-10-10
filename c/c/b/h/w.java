package c.c.b.h;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import c.c.a.a.c.l.q;

public class w extends b implements Cloneable {
  public static final Parcelable.Creator<w> CREATOR = new p0();
  
  public String b;
  
  public String c;
  
  public boolean d;
  
  public String e;
  
  public boolean f;
  
  public String g;
  
  public String h;
  
  public w(String paramString1, String paramString2, boolean paramBoolean1, String paramString3, boolean paramBoolean2, String paramString4, String paramString5) {
    boolean bool;
    if ((paramBoolean1 && !TextUtils.isEmpty(paramString3) && TextUtils.isEmpty(paramString5)) || (paramBoolean1 && TextUtils.isEmpty(paramString3) && !TextUtils.isEmpty(paramString5)) || (!TextUtils.isEmpty(paramString1) && !TextUtils.isEmpty(paramString2)) || (!TextUtils.isEmpty(paramString3) && !TextUtils.isEmpty(paramString4))) {
      bool = true;
    } else {
      bool = false;
    } 
    if (bool) {
      this.b = paramString1;
      this.c = paramString2;
      this.d = paramBoolean1;
      this.e = paramString3;
      this.f = paramBoolean2;
      this.g = paramString4;
      this.h = paramString5;
      return;
    } 
    throw new IllegalArgumentException("Cannot create PhoneAuthCredential without either verificationProof, sessionInfo, temporary proof, or enrollment ID.");
  }
  
  public Object clone() {
    return new w(this.b, this.c, this.d, this.e, this.f, this.g, this.h);
  }
  
  public final b h() {
    return (w)clone();
  }
  
  public void writeToParcel(Parcel paramParcel, int paramInt) {
    paramInt = q.a(paramParcel);
    q.h0(paramParcel, 1, this.b, false);
    q.h0(paramParcel, 2, this.c, false);
    q.c0(paramParcel, 3, this.d);
    q.h0(paramParcel, 4, this.e, false);
    q.c0(paramParcel, 5, this.f);
    q.h0(paramParcel, 6, this.g, false);
    q.h0(paramParcel, 7, this.h, false);
    q.C0(paramParcel, paramInt);
  }
}


/* Location:              C:\Users\panch\Downloads\dvba_v1.1.0-dex2jar.jar!\c\c\b\h\w.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */