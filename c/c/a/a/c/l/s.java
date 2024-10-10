package c.c.a.a.c.l;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import c.c.a.a.c.a;
import c.c.a.a.c.l.u.a;

public class s extends a {
  public static final Parcelable.Creator<s> CREATOR = new z();
  
  public final int b;
  
  public IBinder c;
  
  public a d;
  
  public boolean e;
  
  public boolean f;
  
  public s(int paramInt, IBinder paramIBinder, a parama, boolean paramBoolean1, boolean paramBoolean2) {
    this.b = paramInt;
    this.c = paramIBinder;
    this.d = parama;
    this.e = paramBoolean1;
    this.f = paramBoolean2;
  }
  
  public boolean equals(Object paramObject) {
    if (this == paramObject)
      return true; 
    if (!(paramObject instanceof s))
      return false; 
    paramObject = paramObject;
    return (this.d.equals(((s)paramObject).d) && h().equals(paramObject.h()));
  }
  
  public k h() {
    return k.a.t(this.c);
  }
  
  public void writeToParcel(Parcel paramParcel, int paramInt) {
    int i = q.a(paramParcel);
    q.d0(paramParcel, 1, this.b);
    IBinder iBinder = this.c;
    if (iBinder != null) {
      int j = q.n0(paramParcel, 2);
      paramParcel.writeStrongBinder(iBinder);
      q.C0(paramParcel, j);
    } 
    q.g0(paramParcel, 3, (Parcelable)this.d, paramInt, false);
    q.c0(paramParcel, 4, this.e);
    q.c0(paramParcel, 5, this.f);
    q.C0(paramParcel, i);
  }
}


/* Location:              C:\Users\panch\Downloads\dvba_v1.1.0-dex2jar.jar!\c\c\a\a\c\l\s.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */