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

public class Myprofile extends h {
  public void onCreate(Bundle paramBundle) {
    super.onCreate(paramBundle);
    setContentView(2131558436);
    TextView textView2 = (TextView)findViewById(2131362200);
    TextView textView3 = (TextView)findViewById(2131362201);
    TextView textView1 = (TextView)findViewById(2131362202);
    TextView textView4 = (TextView)findViewById(2131362203);
    String str = getSharedPreferences("jwt", 0).getString("accesstoken", null);
    p p = a.a.a.a.a.Z((Context)this);
    p.a((o)new c(this, 1, c.a.a.a.a.c(getSharedPreferences("apiurl", 0).getString("apiurl", null), "/api/user/profile"), null, new a(this, textView2, textView3, textView1, textView4), new b(this), str));
    ((d)p.e).a();
  }
  
  public class a implements q.b<JSONObject> {
    public final TextView a;
    
    public final TextView b;
    
    public final TextView c;
    
    public final TextView d;
    
    public final Myprofile e;
    
    public a(Myprofile this$0, TextView param1TextView1, TextView param1TextView2, TextView param1TextView3, TextView param1TextView4) {}
    
    public void a(Object param1Object) {
      JSONObject jSONObject = (JSONObject)param1Object;
      try {
        param1Object = new JSONObject();
        super(e.a(jSONObject.get("enc_data").toString()));
        int i = param1Object.getJSONObject("status").getInt("code");
        if (i != 200) {
          Context context = this.e.getApplicationContext();
          StringBuilder stringBuilder = new StringBuilder();
          this();
          stringBuilder.append("Error: ");
          stringBuilder.append(param1Object.getJSONObject("data").getString("message"));
          Toast.makeText(context, stringBuilder.toString(), 0).show();
        } else {
          jSONObject = param1Object.getJSONObject("data");
          param1Object = jSONObject.getString("balance");
          String str2 = jSONObject.getString("account_number");
          String str3 = jSONObject.getString("username");
          String str1 = jSONObject.getString("is_admin");
          TextView textView2 = this.a;
          StringBuilder stringBuilder2 = new StringBuilder();
          this();
          stringBuilder2.append("Name:\t\t");
          stringBuilder2.append(str3);
          textView2.setText(stringBuilder2.toString());
          TextView textView1 = this.b;
          stringBuilder2 = new StringBuilder();
          this();
          stringBuilder2.append("Account Number:\t\t");
          stringBuilder2.append(str2);
          textView1.setText(stringBuilder2.toString());
          textView1 = this.c;
          StringBuilder stringBuilder1 = new StringBuilder();
          this();
          stringBuilder1.append("Balance:\t\t$");
          stringBuilder1.append((String)param1Object);
          textView1.setText(stringBuilder1.toString());
          if (str1 == "true") {
            param1Object = this.d;
            str1 = "Admin:\t\tYes";
          } else {
            param1Object = this.d;
            str1 = "Admin:\t\tNo";
          } 
          param1Object.setText(str1);
        } 
      } catch (JSONException jSONException) {
        jSONException.printStackTrace();
      } 
    }
  }
  
  public class b implements q.a {
    public b(Myprofile this$0) {}
    
    public void a(u param1u) {}
  }
  
  public class c extends g {
    public final String u;
    
    public c(Myprofile this$0, int param1Int, String param1String1, JSONObject param1JSONObject, q.b param1b, q.a param1a, String param1String2) {
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


/* Location:              C:\Users\panch\Downloads\dvba_v1.1.0-dex2jar.jar!\com\app\damnvulnerablebank\Myprofile.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */