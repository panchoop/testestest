package c.c.b.h.d0;

import android.os.Parcel;
import android.os.Parcelable;
import c.c.a.a.c.l.q;
import c.c.a.a.c.l.u.c;
import org.json.JSONException;
import org.json.JSONObject;

public final class e0 implements c {
  public static final Parcelable.Creator<e0> CREATOR = new d0();
  
  public long b;
  
  public long c;
  
  public e0(long paramLong1, long paramLong2) {
    this.b = paramLong1;
    this.c = paramLong2;
  }
  
  public static e0 c(JSONObject paramJSONObject) {
    if (paramJSONObject == null)
      return null; 
    try {
      return new e0(paramJSONObject.getLong("lastSignInTimestamp"), paramJSONObject.getLong("creationTimestamp"));
    } catch (JSONException jSONException) {
      return null;
    } 
  }
  
  public final int describeContents() {
    return 0;
  }
  
  public final void writeToParcel(Parcel paramParcel, int paramInt) {
    paramInt = q.a(paramParcel);
    q.e0(paramParcel, 1, this.b);
    q.e0(paramParcel, 2, this.c);
    q.C0(paramParcel, paramInt);
  }
}


/* Location:              C:\Users\panch\Downloads\dvba_v1.1.0-dex2jar.jar!\c\c\b\h\d0\e0.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */