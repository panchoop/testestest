package c.c.a.a.f.c;

import android.os.Parcel;
import android.os.Parcelable;
import c.c.a.a.c.l.q;
import c.c.a.a.c.l.u.a;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public final class f1 extends a {
  public static final Parcelable.Creator<f1> CREATOR = new h1();
  
  public List<d1> b;
  
  public f1() {
    this.b = new ArrayList<d1>();
  }
  
  public f1(List<d1> paramList) {
    if (paramList != null && !paramList.isEmpty()) {
      paramList = Collections.unmodifiableList(paramList);
    } else {
      paramList = Collections.emptyList();
    } 
    this.b = paramList;
  }
  
  public final void writeToParcel(Parcel paramParcel, int paramInt) {
    paramInt = q.a(paramParcel);
    q.k0(paramParcel, 2, this.b, false);
    q.C0(paramParcel, paramInt);
  }
}


/* Location:              C:\Users\panch\Downloads\dvba_v1.1.0-dex2jar.jar!\c\c\a\a\f\c\f1.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */