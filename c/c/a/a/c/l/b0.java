package c.c.a.a.c.l;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import c.c.a.a.c.c;

public final class b0 implements Parcelable.Creator<a0> {
  public final Object createFromParcel(Parcel paramParcel) {
    int i = q.b0(paramParcel);
    Bundle bundle = null;
    c[] arrayOfC = null;
    while (paramParcel.dataPosition() < i) {
      int k = paramParcel.readInt();
      int j = 0xFFFF & k;
      if (j != 1) {
        if (j != 2) {
          q.Z(paramParcel, k);
          continue;
        } 
        arrayOfC = q.<c>q(paramParcel, k, c.CREATOR);
        continue;
      } 
      bundle = q.k(paramParcel, k);
    } 
    q.v(paramParcel, i);
    return new a0(bundle, arrayOfC);
  }
}


/* Location:              C:\Users\panch\Downloads\dvba_v1.1.0-dex2jar.jar!\c\c\a\a\c\l\b0.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */