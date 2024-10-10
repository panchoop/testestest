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
import java.util.HashMap;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

public class ResetPassword extends h {
  public void onCreate(Bundle paramBundle) {
    super.onCreate(paramBundle);
    setContentView(2131558437);
  }
  
  public void resetPassword(View paramView) {
    EditText editText1 = (EditText)findViewById(2131362086);
    EditText editText2 = (EditText)findViewById(2131362065);
    EditText editText3 = (EditText)findViewById(2131362063);
    String str1 = editText1.getText().toString().trim();
    String str2 = editText2.getText().toString().trim();
    if (!str2.equals(editText3.getText().toString().trim())) {
      Toast.makeText(getApplicationContext(), "Something Entered Password is Different", 0).show();
    } else {
      String str = c.a.a.a.a.c(getSharedPreferences("apiurl", 0).getString("apiurl", null), "/api/user/change-password");
      p p = a.a.a.a.a.Z(getApplicationContext());
      JSONObject jSONObject2 = new JSONObject();
      JSONObject jSONObject1 = new JSONObject();
      try {
        jSONObject2.put("password", str1);
        jSONObject2.put("new_password", str2);
        jSONObject1.put("enc_data", e.b(jSONObject2.toString()));
      } catch (JSONException jSONException) {
        jSONException.printStackTrace();
      } 
      p.a((o)new c(this, 1, str, jSONObject1, new a(this), new b(this)));
    } 
  }
  
  public class a implements q.b<JSONObject> {
    public final ResetPassword a;
    
    public a(ResetPassword this$0) {}
    
    public void a(Object param1Object) {
      param1Object = param1Object;
      Toast.makeText(this.a.getApplicationContext(), "Done", 0).show();
      this.a.getSharedPreferences("jwt", 0).edit().putBoolean("isloggedin", false).apply();
      this.a.startActivity(new Intent((Context)this.a, BankLogin.class));
    }
  }
  
  public class b implements q.a {
    public final ResetPassword a;
    
    public b(ResetPassword this$0) {}
    
    public void a(u param1u) {
      Toast.makeText(this.a.getApplicationContext(), "Something went wrong", 0).show();
    }
  }
  
  public class c extends g {
    public final ResetPassword u;
    
    public c(ResetPassword this$0, int param1Int, String param1String, JSONObject param1JSONObject, q.b param1b, q.a param1a) {
      super(param1Int, param1String, param1JSONObject, param1b, param1a);
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
}


/* Location:              C:\Users\panch\Downloads\dvba_v1.1.0-dex2jar.jar!\com\app\damnvulnerablebank\ResetPassword.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */