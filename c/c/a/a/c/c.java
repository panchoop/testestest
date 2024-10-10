package c.c.a.a.c;

import a.a.a.a.a;
import android.os.Parcel;
import android.os.Parcelable;
import c.c.a.a.c.l.p;
import c.c.a.a.c.l.q;
import c.c.a.a.c.l.u.a;
import java.util.Arrays;

public class c extends a {
  public static final Parcelable.Creator<c> CREATOR = new r();
  
  public final String b;
  
  @Deprecated
  public final int c;
  
  public final long d;
  
  public c(String paramString, int paramInt, long paramLong) {
    this.b = paramString;
    this.c = paramInt;
    this.d = paramLong;
  }
  
  public c(String paramString, long paramLong) {
    this.b = paramString;
    this.d = paramLong;
    this.c = -1;
  }
  
  public boolean equals(Object paramObject) {
    if (paramObject instanceof c) {
      c c1 = (c)paramObject;
      paramObject = this.b;
      if (((paramObject != null && paramObject.equals(c1.b)) || (this.b == null && c1.b == null)) && h() == c1.h())
        return true; 
    } 
    return false;
  }
  
  public long h() {
    long l2 = this.d;
    long l1 = l2;
    if (l2 == -1L)
      l1 = this.c; 
    return l1;
  }
  
  public int hashCode() {
    return Arrays.hashCode(new Object[] { this.b, Long.valueOf(h()) });
  }
  
  public String toString() {
    p p = a.B0(this);
    p.a("name", this.b);
    p.a("version", Long.valueOf(h()));
    return p.toString();
  }
  
  public void writeToParcel(Parcel paramParcel, int paramInt) {
    paramInt = q.a(paramParcel);
    q.h0(paramParcel, 1, this.b, false);
    q.d0(paramParcel, 2, this.c);
    q.e0(paramParcel, 3, h());
    q.C0(paramParcel, paramInt);
  }
}


/* Location:              C:\Users\panch\Downloads\dvba_v1.1.0-dex2jar.jar!\c\c\a\a\c\c.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */