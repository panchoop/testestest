package c.c.b.h;

import android.annotation.SuppressLint;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.Log;
import c.c.a.a.c.l.q;
import c.c.b.h.c0.b;
import javax.annotation.Nullable;
import org.json.JSONException;
import org.json.JSONObject;

public class y extends s {
  public static final Parcelable.Creator<y> CREATOR = new q0();
  
  public final String b;
  
  @Nullable
  public final String c;
  
  public final long d;
  
  public final String e;
  
  public y(String paramString1, @Nullable String paramString2, long paramLong, String paramString3) {
    q.d(paramString1);
    this.b = paramString1;
    this.c = paramString2;
    this.d = paramLong;
    q.d(paramString3);
    this.e = paramString3;
  }
  
  public static y i(JSONObject paramJSONObject) {
    if (paramJSONObject.has("enrollmentTimestamp"))
      return new y(paramJSONObject.optString("uid"), paramJSONObject.optString("displayName"), paramJSONObject.optLong("enrollmentTimestamp"), paramJSONObject.optString("phoneNumber")); 
    throw new IllegalArgumentException("An enrollment timestamp in seconds of UTC time since Unix epoch is required to build a PhoneMultiFactorInfo instance.");
  }
  
  @Nullable
  public JSONObject h() {
    JSONObject jSONObject = new JSONObject();
    try {
      jSONObject.putOpt("factorIdKey", "phone");
      jSONObject.putOpt("uid", this.b);
      jSONObject.putOpt("displayName", this.c);
      jSONObject.putOpt("enrollmentTimestamp", Long.valueOf(this.d));
      jSONObject.putOpt("phoneNumber", this.e);
      return jSONObject;
    } catch (JSONException jSONException) {
      Log.d("PhoneMultiFactorInfo", "Failed to jsonify this object");
      throw new b(jSONException);
    } 
  }
  
  @SuppressLint({"FirebaseUnknownNullness"})
  public void writeToParcel(Parcel paramParcel, int paramInt) {
    paramInt = q.a(paramParcel);
    q.h0(paramParcel, 1, this.b, false);
    q.h0(paramParcel, 2, this.c, false);
    q.e0(paramParcel, 3, this.d);
    q.h0(paramParcel, 4, this.e, false);
    q.C0(paramParcel, paramInt);
  }
}


/* Location:              C:\Users\panch\Downloads\dvba_v1.1.0-dex2jar.jar!\c\c\b\h\y.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */