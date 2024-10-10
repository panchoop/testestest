package c.c.a.a.g.b;

import android.content.Intent;
import android.os.Parcel;
import android.os.Parcelable;
import c.c.a.a.c.k.h;
import c.c.a.a.c.l.q;
import c.c.a.a.c.l.u.a;
import com.google.android.gms.common.api.Status;

public final class c extends a implements h {
  public static final Parcelable.Creator<c> CREATOR = new b();
  
  public final int b = 2;
  
  public int c = 0;
  
  public Intent d = null;
  
  public c() {}
  
  public c(int paramInt1, int paramInt2, Intent paramIntent) {}
  
  public final Status f() {
    return (this.c == 0) ? Status.f : Status.h;
  }
  
  public final void writeToParcel(Parcel paramParcel, int paramInt) {
    int i = q.a(paramParcel);
    q.d0(paramParcel, 1, this.b);
    q.d0(paramParcel, 2, this.c);
    q.g0(paramParcel, 3, (Parcelable)this.d, paramInt, false);
    q.C0(paramParcel, i);
  }
}


/* Location:              C:\Users\panch\Downloads\dvba_v1.1.0-dex2jar.jar!\c\c\a\a\g\b\c.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */