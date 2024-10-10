package c.c.b.h;

import android.os.Parcel;
import android.os.Parcelable;
import c.c.a.a.c.l.q;

public class a0 extends b {
  public static final Parcelable.Creator<a0> CREATOR = new e0();
  
  public String b;
  
  public String c;
  
  public a0(String paramString1, String paramString2) {
    q.d(paramString1);
    this.b = paramString1;
    q.d(paramString2);
    this.c = paramString2;
  }
  
  public final b h() {
    return new a0(this.b, this.c);
  }
  
  public void writeToParcel(Parcel paramParcel, int paramInt) {
    paramInt = q.a(paramParcel);
    q.h0(paramParcel, 1, this.b, false);
    q.h0(paramParcel, 2, this.c, false);
    q.C0(paramParcel, paramInt);
  }
}


/* Location:              C:\Users\panch\Downloads\dvba_v1.1.0-dex2jar.jar!\c\c\b\h\a0.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */