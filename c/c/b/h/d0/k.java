package c.c.b.h.d0;

import android.text.TextUtils;
import android.util.Base64;
import android.util.Log;
import b.f.a;
import c.c.a.a.c.l.q;
import c.c.a.a.c.m.a;
import c.c.a.a.f.c.d;
import c.c.a.a.f.c.e;
import c.c.a.a.f.c.h;
import c.c.a.a.f.c.i;
import c.c.a.a.f.c.j;
import c.c.a.a.f.c.o;
import c.c.a.a.f.c.s;
import c.c.b.h.c0.b;
import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONObject;

public final class k {
  public static final a a = new a("JSONParser", new String[0]);
  
  public static List<Object> a(JSONArray paramJSONArray) {
    ArrayList<Object<String, Object>> arrayList = new ArrayList();
    for (byte b = 0; b < paramJSONArray.length(); b++) {
      Object<String, Object> object1;
      Object<String, Object> object2 = (Object<String, Object>)paramJSONArray.get(b);
      if (object2 instanceof JSONArray) {
        List<Object> list = a((JSONArray)object2);
      } else {
        object1 = object2;
        if (object2 instanceof JSONObject)
          object1 = (Object<String, Object>)c((JSONObject)object2); 
      } 
      arrayList.add(object1);
    } 
    return (List)arrayList;
  }
  
  public static Map<String, Object> b(String paramString) {
    q.d(paramString);
    i i = new i(new h((e)new d()));
    a a1 = null;
    if (paramString != null) {
      h h = i.b;
      if (h != null) {
        j j = new j(h, i, paramString);
        ArrayList<String> arrayList = new ArrayList();
        while (j.hasNext())
          arrayList.add((String)j.next()); 
        List<String> list = Collections.unmodifiableList(arrayList);
        if (list.size() < 2) {
          a1 = a;
          if (paramString.length() != 0) {
            paramString = "Invalid idToken ".concat(paramString);
          } else {
            paramString = new String("Invalid idToken ");
          } 
          Log.e(a1.a, a1.a(paramString, new Object[0]));
          return (Map<String, Object>)s.h;
        } 
        paramString = list.get(1);
        try {
          a a2;
          byte[] arrayOfByte;
          o o;
          String str = new String();
          if (paramString == null) {
            a2 = a1;
          } else {
            arrayOfByte = Base64.decode((String)a2, 11);
          } 
          this(arrayOfByte, "UTF-8");
          Map<String, Object> map2 = d(str);
          Map<String, Object> map1 = map2;
          if (map2 == null)
            o = s.h; 
          return (Map<String, Object>)o;
        } catch (UnsupportedEncodingException unsupportedEncodingException) {
          a a2 = a;
          Log.e(a2.a, a2.a("Unable to decode token", new Object[0]), unsupportedEncodingException);
        } 
        return (Map<String, Object>)s.h;
      } 
      throw null;
    } 
    throw null;
  }
  
  public static Map<String, Object> c(JSONObject paramJSONObject) {
    a a1 = new a();
    Iterator<String> iterator = paramJSONObject.keys();
    while (iterator.hasNext()) {
      Object<String, Object> object1;
      String str = iterator.next();
      Object<String, Object> object2 = (Object<String, Object>)paramJSONObject.get(str);
      if (object2 instanceof JSONArray) {
        List<Object> list = a((JSONArray)object2);
      } else {
        object1 = object2;
        if (object2 instanceof JSONObject)
          object1 = (Object<String, Object>)c((JSONObject)object2); 
      } 
      a1.put(str, object1);
    } 
    return (Map<String, Object>)a1;
  }
  
  public static Map<String, Object> d(String paramString) {
    if (TextUtils.isEmpty(paramString))
      return null; 
    try {
      JSONObject jSONObject = new JSONObject();
      this(paramString);
      return (jSONObject != JSONObject.NULL) ? c(jSONObject) : null;
    } catch (Exception exception) {
      Log.d("JSONParser", "Failed to parse JSONObject into Map.");
      throw new b(exception);
    } 
  }
}


/* Location:              C:\Users\panch\Downloads\dvba_v1.1.0-dex2jar.jar!\c\c\b\h\d0\k.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */