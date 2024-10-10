package c.b.a;

import c.a.a.a.a;
import c.a.b.q;
import c.a.b.w.g;
import com.app.damnvulnerablebank.SendMoney;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONObject;

public class p extends g {
  public final String u;
  
  public p(SendMoney paramSendMoney, int paramInt, String paramString1, JSONObject paramJSONObject, q.b paramb, q.a parama, String paramString2) {
    super(paramInt, paramString1, paramJSONObject, paramb, parama);
  }
  
  public Map g() {
    HashMap<Object, Object> hashMap = new HashMap<Object, Object>();
    StringBuilder stringBuilder = a.e("Bearer ");
    stringBuilder.append(this.u);
    hashMap.put("Authorization", stringBuilder.toString());
    return hashMap;
  }
}


/* Location:              C:\Users\panch\Downloads\dvba_v1.1.0-dex2jar.jar!\c\b\a\p.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */