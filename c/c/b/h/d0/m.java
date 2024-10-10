package c.c.b.h.d0;

import android.os.Parcel;
import android.os.Parcelable;
import c.c.a.a.c.l.q;
import c.c.a.a.c.l.u.a;
import c.c.a.a.f.c.n;
import c.c.b.h.y;
import java.util.List;

public final class m extends a {
  public static final Parcelable.Creator<m> CREATOR = new l();
  
  public final List<y> b;
  
  public m(List<y> paramList) {
    n n;
    List<y> list = paramList;
    if (paramList == null)
      n = n.h(); 
    this.b = (List<y>)n;
  }
  
  public final void writeToParcel(Parcel paramParcel, int paramInt) {
    paramInt = q.a(paramParcel);
    q.k0(paramParcel, 1, this.b, false);
    q.C0(paramParcel, paramInt);
  }
}


/* Location:              C:\Users\panch\Downloads\dvba_v1.1.0-dex2jar.jar!\c\c\b\h\d0\m.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */