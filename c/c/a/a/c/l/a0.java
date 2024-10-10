package c.c.a.a.c.l;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import c.c.a.a.c.c;
import c.c.a.a.c.l.u.a;

public final class a0 extends a {
  public static final Parcelable.Creator<a0> CREATOR = new b0();
  
  public Bundle b;
  
  public c[] c;
  
  public a0() {}
  
  public a0(Bundle paramBundle, c[] paramArrayOfc) {
    this.b = paramBundle;
    this.c = paramArrayOfc;
  }
  
  public final void writeToParcel(Parcel paramParcel, int paramInt) {
    int i = q.a(paramParcel);
    Bundle bundle = this.b;
    if (bundle != null) {
      int j = q.n0(paramParcel, 1);
      paramParcel.writeBundle(bundle);
      q.C0(paramParcel, j);
    } 
    q.j0(paramParcel, 2, this.c, paramInt, false);
    q.C0(paramParcel, i);
  }
}


/* Location:              C:\Users\panch\Downloads\dvba_v1.1.0-dex2jar.jar!\c\c\a\a\c\l\a0.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */