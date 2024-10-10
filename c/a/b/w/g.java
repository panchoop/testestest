package c.a.b.w;

import a.a.a.a.a;
import c.a.b.l;
import c.a.b.n;
import c.a.b.q;
import c.a.b.u;
import java.io.UnsupportedEncodingException;
import org.json.JSONException;
import org.json.JSONObject;

public class g extends h<JSONObject> {
  public g(int paramInt, String paramString, JSONObject paramJSONObject, q.b<JSONObject> paramb, q.a parama) {
    super(paramInt, paramString, str, paramb, parama);
  }
  
  public q<JSONObject> l(l paraml) {
    try {
      String str = new String();
      this(paraml.a, a.j0(paraml.b, "utf-8"));
      JSONObject jSONObject = new JSONObject();
      this(str);
      return new q(jSONObject, a.i0(paraml));
    } catch (UnsupportedEncodingException unsupportedEncodingException) {
      return new q((u)new n(unsupportedEncodingException));
    } catch (JSONException jSONException) {
      return new q((u)new n((Throwable)jSONException));
    } 
  }
}


/* Location:              C:\Users\panch\Downloads\dvba_v1.1.0-dex2jar.jar!\c\a\b\w\g.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */