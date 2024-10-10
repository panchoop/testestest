package c.c.b.h;

import android.os.Parcel;
import android.os.Parcelable;

public class q extends b {
  public static final Parcelable.Creator<q> CREATOR = new n0();
  
  public String b;
  
  public q(String paramString) {
    c.c.a.a.c.l.q.d(paramString);
    this.b = paramString;
  }
  
  public final b h() {
    return new q(this.b);
  }
  
  public void writeToParcel(Parcel paramParcel, int paramInt) {
    paramInt = c.c.a.a.c.l.q.a(paramParcel);
    c.c.a.a.c.l.q.h0(paramParcel, 1, this.b, false);
    c.c.a.a.c.l.q.C0(paramParcel, paramInt);
  }
}


/* Location:              C:\Users\panch\Downloads\dvba_v1.1.0-dex2jar.jar!\c\c\b\h\q.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */