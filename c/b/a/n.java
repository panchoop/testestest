package c.b.a;

import android.content.Context;
import android.content.Intent;
import android.util.Log;
import android.widget.Toast;
import c.a.b.q;
import com.app.damnvulnerablebank.Dashboard;
import com.app.damnvulnerablebank.SendMoney;
import org.json.JSONException;
import org.json.JSONObject;

public class n implements q.b<JSONObject> {
  public final SendMoney a;
  
  public n(SendMoney paramSendMoney) {}
  
  public void a(Object paramObject) {
    JSONObject jSONObject = (JSONObject)paramObject;
    try {
      Context context;
      paramObject = new JSONObject();
      super(e.a(jSONObject.get("enc_data").toString()));
      Log.d("Send Money", paramObject.toString());
      if (paramObject.getJSONObject("status").getInt("code") != 200) {
        context = this.a.getApplicationContext();
        StringBuilder stringBuilder = new StringBuilder();
        this();
        stringBuilder.append("Error: ");
        stringBuilder.append(paramObject.getJSONObject("data").getString("message"));
        Toast.makeText(context, stringBuilder.toString(), 0).show();
      } else {
        Context context1 = this.a.getApplicationContext();
        paramObject = new StringBuilder();
        super();
        paramObject.append("");
        paramObject.append(e.a(context.get("enc_data").toString()));
        Toast.makeText(context1, paramObject.toString(), 0).show();
        this.a.startActivity(new Intent((Context)this.a, Dashboard.class));
      } 
    } catch (JSONException jSONException) {
      jSONException.printStackTrace();
      this.a.startActivity(new Intent((Context)this.a, Dashboard.class));
    } 
  }
}


/* Location:              C:\Users\panch\Downloads\dvba_v1.1.0-dex2jar.jar!\c\b\a\n.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */