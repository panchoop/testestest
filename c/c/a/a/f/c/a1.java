package c.c.a.a.f.c;

import android.os.Parcel;
import android.os.Parcelable;
import android.util.Log;
import c.c.a.a.c.l.q;
import c.c.a.a.c.l.u.a;
import c.c.b.h.c0.b;
import org.json.JSONException;
import org.json.JSONObject;

public final class a1 extends a implements Object<a1, Object> {
  public static final Parcelable.Creator<a1> CREATOR = new c1();
  
  public String b;
  
  public String c;
  
  public Long d;
  
  public String e;
  
  public Long f;
  
  public a1() {
    this.f = Long.valueOf(System.currentTimeMillis());
  }
  
  public a1(String paramString1, String paramString2, Long paramLong1, String paramString3, Long paramLong2) {
    this.b = paramString1;
    this.c = paramString2;
    this.d = paramLong1;
    this.e = paramString3;
    this.f = paramLong2;
  }
  
  public static a1 h(String paramString) {
    try {
      JSONObject jSONObject = new JSONObject();
      this(paramString);
      a1 a11 = new a1();
      this();
      a11.b = jSONObject.optString("refresh_token", null);
      a11.c = jSONObject.optString("access_token", null);
      a11.d = Long.valueOf(jSONObject.optLong("expires_in"));
      a11.e = jSONObject.optString("token_type", null);
      a11.f = Long.valueOf(jSONObject.optLong("issued_at"));
      return a11;
    } catch (JSONException jSONException) {
      Log.d("GetTokenResponse", "Failed to read GetTokenResponse from JSONObject");
      throw new b(jSONException);
    } 
  }
  
  public final String i() {
    JSONObject jSONObject = new JSONObject();
    try {
      jSONObject.put("refresh_token", this.b);
      jSONObject.put("access_token", this.c);
      jSONObject.put("expires_in", this.d);
      jSONObject.put("token_type", this.e);
      jSONObject.put("issued_at", this.f);
      return jSONObject.toString();
    } catch (JSONException jSONException) {
      Log.d("GetTokenResponse", "Failed to convert GetTokenResponse to JSON");
      throw new b(jSONException);
    } 
  }
  
  public final void writeToParcel(Parcel paramParcel, int paramInt) {
    long l;
    paramInt = q.a(paramParcel);
    q.h0(paramParcel, 2, this.b, false);
    q.h0(paramParcel, 3, this.c, false);
    Long long_ = this.d;
    if (long_ == null) {
      l = 0L;
    } else {
      l = long_.longValue();
    } 
    q.f0(paramParcel, 4, Long.valueOf(l), false);
    q.h0(paramParcel, 5, this.e, false);
    q.f0(paramParcel, 6, Long.valueOf(this.f.longValue()), false);
    q.C0(paramParcel, paramInt);
  }
}


/* Location:              C:\Users\panch\Downloads\dvba_v1.1.0-dex2jar.jar!\c\c\a\a\f\c\a1.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */