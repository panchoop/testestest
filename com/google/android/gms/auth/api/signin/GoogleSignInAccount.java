package com.google.android.gms.auth.api.signin;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import c.c.a.a.a.a.a.b;
import c.c.a.a.c.l.q;
import c.c.a.a.c.l.u.a;
import c.c.a.a.c.o.a;
import c.c.a.a.c.o.b;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.internal.ReflectedParcelable;
import java.util.AbstractSet;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import org.json.JSONArray;
import org.json.JSONObject;

public class GoogleSignInAccount extends a implements ReflectedParcelable {
  public static final Parcelable.Creator<GoogleSignInAccount> CREATOR = (Parcelable.Creator<GoogleSignInAccount>)new b();
  
  public static a o = (a)b.a;
  
  public final int b;
  
  public String c;
  
  public String d;
  
  public String e;
  
  public String f;
  
  public Uri g;
  
  public String h;
  
  public long i;
  
  public String j;
  
  public List<Scope> k;
  
  public String l;
  
  public String m;
  
  public Set<Scope> n = new HashSet<Scope>();
  
  public GoogleSignInAccount(int paramInt, String paramString1, String paramString2, String paramString3, String paramString4, Uri paramUri, String paramString5, long paramLong, String paramString6, List<Scope> paramList, String paramString7, String paramString8) {
    this.b = paramInt;
    this.c = paramString1;
    this.d = paramString2;
    this.e = paramString3;
    this.f = paramString4;
    this.g = paramUri;
    this.h = paramString5;
    this.i = paramLong;
    this.j = paramString6;
    this.k = paramList;
    this.l = paramString7;
    this.m = paramString8;
  }
  
  public static GoogleSignInAccount i(String paramString) {
    if (TextUtils.isEmpty(paramString))
      return null; 
    JSONObject jSONObject = new JSONObject(paramString);
    paramString = jSONObject.optString("photoUrl", null);
    if (!TextUtils.isEmpty(paramString)) {
      Uri uri = Uri.parse(paramString);
    } else {
      paramString = null;
    } 
    long l = Long.parseLong(jSONObject.getString("expirationTime"));
    HashSet<Scope> hashSet = new HashSet();
    JSONArray jSONArray = jSONObject.getJSONArray("grantedScopes");
    int i = jSONArray.length();
    for (byte b = 0; b < i; b++)
      hashSet.add(new Scope(jSONArray.getString(b))); 
    String str4 = jSONObject.optString("id");
    String str1 = jSONObject.optString("tokenId", null);
    String str6 = jSONObject.optString("email", null);
    String str7 = jSONObject.optString("displayName", null);
    String str3 = jSONObject.optString("givenName", null);
    String str2 = jSONObject.optString("familyName", null);
    Long long_2 = Long.valueOf(l);
    String str5 = jSONObject.getString("obfuscatedIdentifier");
    Long long_1 = long_2;
    if (long_2 == null)
      long_1 = Long.valueOf(System.currentTimeMillis() / 1000L); 
    l = long_1.longValue();
    q.d(str5);
    q.f(hashSet);
    GoogleSignInAccount googleSignInAccount = new GoogleSignInAccount(3, str4, str1, str6, str7, (Uri)paramString, null, l, str5, new ArrayList<Scope>(hashSet), str3, str2);
    googleSignInAccount.h = jSONObject.optString("serverAuthCode", null);
    return googleSignInAccount;
  }
  
  public boolean equals(Object<Scope> paramObject) {
    if (paramObject == this)
      return true; 
    if (!(paramObject instanceof GoogleSignInAccount))
      return false; 
    paramObject = paramObject;
    if (((GoogleSignInAccount)paramObject).j.equals(this.j)) {
      Set<Scope> set = paramObject.h();
      paramObject = (Object<Scope>)h();
      if (((AbstractSet)set).equals(paramObject))
        return true; 
    } 
    return false;
  }
  
  public Set<Scope> h() {
    HashSet<Scope> hashSet = new HashSet<Scope>(this.k);
    hashSet.addAll(this.n);
    return hashSet;
  }
  
  public int hashCode() {
    int i = this.j.hashCode();
    return ((AbstractSet)h()).hashCode() + (i + 527) * 31;
  }
  
  public void writeToParcel(Parcel paramParcel, int paramInt) {
    int i = q.a(paramParcel);
    q.d0(paramParcel, 1, this.b);
    q.h0(paramParcel, 2, this.c, false);
    q.h0(paramParcel, 3, this.d, false);
    q.h0(paramParcel, 4, this.e, false);
    q.h0(paramParcel, 5, this.f, false);
    q.g0(paramParcel, 6, (Parcelable)this.g, paramInt, false);
    q.h0(paramParcel, 7, this.h, false);
    q.e0(paramParcel, 8, this.i);
    q.h0(paramParcel, 9, this.j, false);
    q.k0(paramParcel, 10, this.k, false);
    q.h0(paramParcel, 11, this.l, false);
    q.h0(paramParcel, 12, this.m, false);
    q.C0(paramParcel, i);
  }
}


/* Location:              C:\Users\panch\Downloads\dvba_v1.1.0-dex2jar.jar!\com\google\android\gms\auth\api\signin\GoogleSignInAccount.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */