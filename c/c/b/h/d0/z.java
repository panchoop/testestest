package c.c.b.h.d0;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.Log;
import c.c.a.a.c.l.q;
import c.c.a.a.c.l.u.a;
import c.c.a.a.f.c.d1;
import c.c.a.a.f.c.z0;
import c.c.b.h.b0;
import c.c.b.h.c0.b;
import org.json.JSONException;
import org.json.JSONObject;

public final class z extends a implements b0 {
  public static final Parcelable.Creator<z> CREATOR = new y();
  
  public String b;
  
  public String c;
  
  public String d;
  
  public String e;
  
  public String f;
  
  public String g;
  
  public boolean h;
  
  public String i;
  
  public z(d1 paramd1) {
    q.f(paramd1);
    this.b = paramd1.b;
    String str = paramd1.e;
    q.d(str);
    this.c = str;
    this.d = paramd1.c;
    if (!TextUtils.isEmpty(paramd1.d)) {
      Uri uri = Uri.parse(paramd1.d);
    } else {
      str = null;
    } 
    if (str != null)
      this.e = str.toString(); 
    this.f = paramd1.h;
    this.g = paramd1.g;
    this.h = false;
    this.i = paramd1.f;
  }
  
  public z(z0 paramz0, String paramString) {
    q.f(paramz0);
    q.d(paramString);
    String str = paramz0.b;
    q.d(str);
    this.b = str;
    this.c = paramString;
    this.f = paramz0.c;
    this.d = paramz0.e;
    if (!TextUtils.isEmpty(paramz0.f)) {
      Uri uri = Uri.parse(paramz0.f);
    } else {
      paramString = null;
    } 
    if (paramString != null)
      this.e = paramString.toString(); 
    this.h = paramz0.d;
    this.i = null;
    this.g = paramz0.i;
  }
  
  public z(String paramString1, String paramString2, String paramString3, String paramString4, String paramString5, String paramString6, boolean paramBoolean, String paramString7) {
    this.b = paramString1;
    this.c = paramString2;
    this.f = paramString3;
    this.g = paramString4;
    this.d = paramString5;
    this.e = paramString6;
    if (!TextUtils.isEmpty(paramString6))
      Uri.parse(this.e); 
    this.h = paramBoolean;
    this.i = paramString7;
  }
  
  public static z h(String paramString) {
    try {
      JSONObject jSONObject = new JSONObject();
      this(paramString);
      return new z(jSONObject.optString("userId"), jSONObject.optString("providerId"), jSONObject.optString("email"), jSONObject.optString("phoneNumber"), jSONObject.optString("displayName"), jSONObject.optString("photoUrl"), jSONObject.optBoolean("isEmailVerified"), jSONObject.optString("rawUserInfo"));
    } catch (JSONException jSONException) {
      Log.d("DefaultAuthUserInfo", "Failed to unpack UserInfo from JSON");
      throw new b(jSONException);
    } 
  }
  
  public final String c() {
    return this.c;
  }
  
  public final String i() {
    JSONObject jSONObject = new JSONObject();
    try {
      jSONObject.putOpt("userId", this.b);
      jSONObject.putOpt("providerId", this.c);
      jSONObject.putOpt("displayName", this.d);
      jSONObject.putOpt("photoUrl", this.e);
      jSONObject.putOpt("email", this.f);
      jSONObject.putOpt("phoneNumber", this.g);
      jSONObject.putOpt("isEmailVerified", Boolean.valueOf(this.h));
      jSONObject.putOpt("rawUserInfo", this.i);
      return jSONObject.toString();
    } catch (JSONException jSONException) {
      Log.d("DefaultAuthUserInfo", "Failed to jsonify this object");
      throw new b(jSONException);
    } 
  }
  
  public final void writeToParcel(Parcel paramParcel, int paramInt) {
    paramInt = q.a(paramParcel);
    q.h0(paramParcel, 1, this.b, false);
    q.h0(paramParcel, 2, this.c, false);
    q.h0(paramParcel, 3, this.d, false);
    q.h0(paramParcel, 4, this.e, false);
    q.h0(paramParcel, 5, this.f, false);
    q.h0(paramParcel, 6, this.g, false);
    q.c0(paramParcel, 7, this.h);
    q.h0(paramParcel, 8, this.i, false);
    q.C0(paramParcel, paramInt);
  }
}


/* Location:              C:\Users\panch\Downloads\dvba_v1.1.0-dex2jar.jar!\c\c\b\h\d0\z.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */