package com.app.damnvulnerablebank;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
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

public class RegisterBank extends h {
  public void backToMain(View paramView) {
    startActivity(new Intent((Context)this, MainActivity.class));
  }
  
  public void onCreate(Bundle paramBundle) {
    super.onCreate(paramBundle);
    setContentView(2131558440);
  }
  
  public void register(View paramView) {
    EditText editText2 = (EditText)findViewById(2131362151);
    EditText editText1 = (EditText)findViewById(2131362150);
    String str2 = editText2.getText().toString().trim();
    String str3 = editText1.getText().toString().trim();
    String str1 = c.a.a.a.a.c(getSharedPreferences("apiurl", 0).getString("apiurl", null), "/api/user/register");
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
  
  public class a implements q.b<JSONObject> {
    public final RegisterBank a;
    
    public a(RegisterBank this$0) {}
    
    public void a(Object param1Object) {
      param1Object = param1Object;
      try {
        Context context = this.a.getApplicationContext();
        StringBuilder stringBuilder = new StringBuilder();
        this();
        stringBuilder.append("User created");
        stringBuilder.append(e.a(param1Object.get("enc_data").toString()));
        Toast.makeText(context, stringBuilder.toString(), 0).show();
      } catch (JSONException jSONException) {
        jSONException.printStackTrace();
      } 
      this.a.startActivity(new Intent((Context)this.a, BankLogin.class));
    }
  }
  
  public class b implements q.a {
    public final RegisterBank a;
    
    public b(RegisterBank this$0) {}
    
    public void a(u param1u) {
      Toast.makeText(this.a.getApplicationContext(), "You did something wrong", 0).show();
    }
  }
}


/* Location:              C:\Users\panch\Downloads\dvba_v1.1.0-dex2jar.jar!\com\app\damnvulnerablebank\RegisterBank.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */