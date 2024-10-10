package com.app.damnvulnerablebank;

import android.content.Context;
import android.os.Bundle;
import android.widget.TextView;
import android.widget.Toast;
import b.b.k.h;
import c.a.b.o;
import c.a.b.p;
import c.a.b.q;
import c.a.b.u;
import c.a.b.w.d;
import c.a.b.w.g;
import c.b.a.e;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

public class ViewBalance extends h {
  public void onCreate(Bundle paramBundle) {
    super.onCreate(paramBundle);
    setContentView(2131558430);
    TextView textView = (TextView)findViewById(2131362199);
    String str = getSharedPreferences("jwt", 0).getString("accesstoken", null);
    p p = a.a.a.a.a.Z((Context)this);
    p.a((o)new c(this, 1, c.a.a.a.a.c(getSharedPreferences("apiurl", 0).getString("apiurl", null), "/api/balance/view"), null, new a(this, textView), new b(this), str));
    ((d)p.e).a();
  }
  
  public class a implements q.b<JSONObject> {
    public final TextView a;
    
    public final ViewBalance b;
    
    public a(ViewBalance this$0, TextView param1TextView) {}
    
    public void a(Object param1Object) {
      JSONObject jSONObject = (JSONObject)param1Object;
      try {
        param1Object = new JSONObject();
        super(e.a(jSONObject.get("enc_data").toString()));
        int i = param1Object.getJSONObject("status").getInt("code");
        if (i != 200) {
          Context context = this.b.getApplicationContext();
          StringBuilder stringBuilder = new StringBuilder();
          this();
          stringBuilder.append("Error: ");
          stringBuilder.append(param1Object.getJSONObject("data").getString("message"));
          Toast.makeText(context, stringBuilder.toString(), 0).show();
        } else {
          param1Object = param1Object.getJSONObject("data");
          param1Object.getString("account_number");
          String str = param1Object.getString("balance");
          param1Object = this.a;
          StringBuilder stringBuilder = new StringBuilder();
          this();
          stringBuilder.append("Your Balance is $");
          stringBuilder.append(str);
          param1Object.setText(stringBuilder.toString());
        } 
      } catch (JSONException jSONException) {
        jSONException.printStackTrace();
      } 
    }
  }
  
  public class b implements q.a {
    public b(ViewBalance this$0) {}
    
    public void a(u param1u) {}
  }
  
  public class c extends g {
    public final String u;
    
    public c(ViewBalance this$0, int param1Int, String param1String1, JSONObject param1JSONObject, q.b param1b, q.a param1a, String param1String2) {
      super(param1Int, param1String1, null, param1b, param1a);
    }
    
    public Map g() {
      HashMap<Object, Object> hashMap = new HashMap<Object, Object>();
      StringBuilder stringBuilder = c.a.a.a.a.e("Bearer ");
      stringBuilder.append(this.u);
      hashMap.put("Authorization", stringBuilder.toString());
      return hashMap;
    }
  }
}


/* Location:              C:\Users\panch\Downloads\dvba_v1.1.0-dex2jar.jar!\com\app\damnvulnerablebank\ViewBalance.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */