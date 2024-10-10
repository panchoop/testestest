package c.c.a.a.f.c;

import android.os.Parcel;
import android.os.Parcelable;
import c.c.a.a.c.l.q;
import c.c.a.a.c.l.u.a;
import c.c.a.a.c.o.d;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public final class l1 extends a {
  public static final Parcelable.Creator<l1> CREATOR = new k1();
  
  public final int b;
  
  public List<String> c;
  
  public l1() {
    this(null);
  }
  
  public l1(int paramInt, List<String> paramList) {
    this.b = paramInt;
    if (paramList == null || paramList.isEmpty()) {
      paramList = Collections.emptyList();
    } else {
      for (paramInt = 0; paramInt < paramList.size(); paramInt++)
        paramList.set(paramInt, d.a(paramList.get(paramInt))); 
      paramList = Collections.unmodifiableList(paramList);
    } 
    this.c = paramList;
  }
  
  public l1(List<String> paramList) {
    this.b = 1;
    this.c = new ArrayList<String>();
    if (paramList != null && !paramList.isEmpty())
      this.c.addAll(paramList); 
  }
  
  public final void writeToParcel(Parcel paramParcel, int paramInt) {
    paramInt = q.a(paramParcel);
    q.d0(paramParcel, 1, this.b);
    q.i0(paramParcel, 2, this.c, false);
    q.C0(paramParcel, paramInt);
  }
}


/* Location:              C:\Users\panch\Downloads\dvba_v1.1.0-dex2jar.jar!\c\c\a\a\f\c\l1.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */