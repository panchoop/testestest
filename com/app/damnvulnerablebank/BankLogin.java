package com.app.damnvulnerablebank;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.ProgressBar;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.widget.Toast;
import b.b.k.h;
import c.a.b.o;
import c.a.b.p;
import c.a.b.q;
import c.a.b.u;
import c.a.b.w.g;
import c.b.a.e;
import org.json.JSONException;
import org.json.JSONObject;

public class BankLogin extends h {
  public ProgressBar p;
  
  public RelativeLayout q;
  
  public void backToMain(View paramView) {
    startActivity(new Intent((Context)this, MainActivity.class));
  }
  
  public void bankLogin(View paramView) {
    TextView textView = (TextView)findViewById(2131362018);
    EditText editText2 = (EditText)findViewById(2131362025);
    EditText editText1 = (EditText)findViewById(2131362022);
    this.q = (RelativeLayout)findViewById(2131362111);
    this.p = (ProgressBar)findViewById(2131362107);
    this.q.setVisibility(0);
    this.p.setVisibility(0);
    String str2 = editText2.getText().toString().trim();
    String str3 = editText1.getText().toString().trim();
    String str1 = c.a.a.a.a.c(getSharedPreferences("apiurl", 0).getString("apiurl", null), "/api/user/login");
    p p = a.a.a.a.a.Z(getApplicationContext());
    JSONObject jSONObject2 = new JSONObject();
    JSONObject jSONObject1 = new JSONObject();
    try {
      jSONObject2.put("username", str2);
      jSONObject2.put("password", str3);
      jSONObject1.put("enc_data", e.b(jSONObject2.toString()));
    } catch (JSONException jSONException) {
      jSONException.printStackTrace();
    } 
    p.a((o)new g(1, str1, jSONObject1, new a(this), new b(this)));
  }
  
  public void onCreate(Bundle paramBundle) {
    super.onCreate(paramBundle);
    setContentView(2131558434);
  }
  
  public class a implements q.b<JSONObject> {
    public final BankLogin a;
    
    public a(BankLogin this$0) {}
    
    public void a(Object param1Object) {
      JSONObject jSONObject = (JSONObject)param1Object;
      try {
        Intent intent;
        param1Object = new JSONObject();
        super(e.a(jSONObject.get("enc_data").toString()));
        int i = param1Object.getJSONObject("status").getInt("code");
        if (i != 200) {
          Context context = this.a.getApplicationContext();
          StringBuilder stringBuilder = new StringBuilder();
          this();
          stringBuilder.append("Error: ");
          stringBuilder.append(param1Object.getJSONObject("data").getString("message"));
          Toast.makeText(context, stringBuilder.toString(), 0).show();
          param1Object = this.a;
          intent = new Intent();
          this((Context)this.a, BankLogin.class);
        } else {
          String str = param1Object.getJSONObject("data").getString("accessToken");
          param1Object = this.a.getSharedPreferences("jwt", 0);
          Log.d("accesstoken", str);
          param1Object.edit().putString("accesstoken", str).apply();
          param1Object.edit().putBoolean("isloggedin", true).apply();
          param1Object = this.a;
          intent = new Intent((Context)this.a, Dashboard.class);
        } 
        param1Object.startActivity(intent);
      } catch (JSONException jSONException) {
        jSONException.printStackTrace();
      } 
    }
  }
  
  public class b implements q.a {
    public final BankLogin a;
    
    public b(BankLogin this$0) {}
    
    public void a(u param1u) {
      Toast.makeText(this.a.getApplicationContext(), "Something went wrong", 0).show();
      this.a.startActivity(new Intent((Context)this.a, BankLogin.class));
    }
  }
}


/* Location:              C:\Users\panch\Downloads\dvba_v1.1.0-dex2jar.jar!\com\app\damnvulnerablebank\BankLogin.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */