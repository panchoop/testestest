package c.c.b.h.d0;

import android.content.Context;
import android.content.SharedPreferences;
import android.text.TextUtils;
import android.util.Log;
import c.c.a.a.c.l.q;
import c.c.a.a.c.m.a;
import c.c.a.a.f.c.a1;
import c.c.b.b;
import c.c.b.h.c0.b;
import c.c.b.h.y;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public final class p {
  public Context a;
  
  public String b;
  
  public SharedPreferences c;
  
  public a d;
  
  public p(Context paramContext, String paramString) {
    q.f(paramContext);
    q.d(paramString);
    this.b = paramString;
    this.a = paramContext.getApplicationContext();
    String str = String.format("com.google.firebase.auth.api.Store.%s", new Object[] { this.b });
    this.c = this.a.getSharedPreferences(str, 0);
    this.d = new a("StorageHelpers", new String[0]);
  }
  
  public final c0 a(JSONObject paramJSONObject) {
    try {
      String str3 = paramJSONObject.getString("cachedTokenState");
      String str4 = paramJSONObject.getString("applicationName");
      boolean bool1 = paramJSONObject.getBoolean("anonymous");
      String str1 = "2";
      String str2 = paramJSONObject.getString("version");
      if (str2 != null)
        str1 = str2; 
      JSONArray jSONArray = paramJSONObject.getJSONArray("userInfos");
      int i = jSONArray.length();
      ArrayList<z> arrayList = new ArrayList();
      this(i);
      boolean bool = false;
      byte b1;
      for (b1 = 0; b1 < i; b1++)
        arrayList.add(z.h(jSONArray.getString(b1))); 
      b b2 = b.d(str4);
      c0 c0 = new c0();
      this(b2, (List)arrayList);
      if (!TextUtils.isEmpty(str3))
        c0.k(a1.h(str3)); 
      if (!bool1)
        c0.i = Boolean.FALSE; 
      c0.h = str1;
      if (paramJSONObject.has("userMetadata")) {
        e0 e0 = e0.c(paramJSONObject.getJSONObject("userMetadata"));
        if (e0 != null)
          c0.j = e0; 
      } 
      if (paramJSONObject.has("userMultiFactorInfo")) {
        JSONArray jSONArray1 = paramJSONObject.getJSONArray("userMultiFactorInfo");
        if (jSONArray1 != null) {
          ArrayList<String> arrayList1 = new ArrayList();
          this();
          for (b1 = bool; b1 < jSONArray1.length(); b1++) {
            String str = jSONArray1.getString(b1);
            JSONObject jSONObject = new JSONObject();
            this(str);
            if ("phone".equals(jSONObject.optString("factorIdKey"))) {
              y y = y.i(jSONObject);
            } else {
              str = null;
            } 
            arrayList1.add(str);
          } 
          c0.l((List)arrayList1);
        } 
      } 
      return c0;
    } catch (JSONException jSONException) {
    
    } catch (ArrayIndexOutOfBoundsException arrayIndexOutOfBoundsException) {
    
    } catch (IllegalArgumentException illegalArgumentException) {
    
    } catch (b b) {}
    Log.wtf(this.d.a, (Throwable)b);
    return null;
  }
}


/* Location:              C:\Users\panch\Downloads\dvba_v1.1.0-dex2jar.jar!\c\c\b\h\d0\p.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */