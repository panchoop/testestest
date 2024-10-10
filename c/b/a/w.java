package c.b.a;

import c.a.b.q;
import c.a.b.w.g;
import com.app.damnvulnerablebank.ViewBeneficiaryAdmin;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONObject;

public class w extends g {
  public final ViewBeneficiaryAdmin u;
  
  public w(ViewBeneficiaryAdmin paramViewBeneficiaryAdmin, int paramInt, String paramString, JSONObject paramJSONObject, q.b paramb, q.a parama) {
    super(paramInt, paramString, null, paramb, parama);
  }
  
  public Map g() {
    String str = this.u.getSharedPreferences("jwt", 0).getString("accesstoken", null);
    HashMap<Object, Object> hashMap = new HashMap<Object, Object>();
    StringBuilder stringBuilder = new StringBuilder();
    stringBuilder.append("Bearer ");
    stringBuilder.append(str);
    hashMap.put("Authorization", stringBuilder.toString());
    return hashMap;
  }
}


/* Location:              C:\Users\panch\Downloads\dvba_v1.1.0-dex2jar.jar!\c\b\a\w.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */