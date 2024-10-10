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

public class AddBeneficiary extends h {
  public void addBeneficiary(View paramView) {
    String str1 = getSharedPreferences("jwt", 0).getString("accesstoken", null);
    String str3 = ((EditText)findViewById(2131361952)).getText().toString().trim();
    String str2 = c.a.a.a.a.c(getSharedPreferences("apiurl", 0).getString("apiurl", null), "/api/beneficiary/add");
    p p = a.a.a.a.a.Z(getApplicationContext());
    JSONObject jSONObject2 = new JSONObject();
    JSONObject jSONObject1 = new JSONObject();
    try {
      jSONObject2.put("account_number", str3);
      jSONObject1.put("enc_data", e.b(jSONObject2.toString()));
    } catch (JSONException jSONException) {
      jSONException.printStackTrace();
    } 
    p.a((o)new c(this, 1, str2, jSONObject1, new a(this), new b(this), str1));
  }
  
  public void onCreate(Bundle paramBundle) {
    super.onCreate(paramBundle);
    setContentView(2131558428);
  }
  
  public class a implements q.b<JSONObject> {
    public final AddBeneficiary a;
    
    public a(AddBeneficiary this$0) {}
    
    public void a(Object param1Object) {
      param1Object = param1Object;
      try {
        Toast.makeText(this.a.getApplicationContext(), e.a(param1Object.get("enc_data").toString()), 0).show();
      } catch (JSONException jSONException) {
        jSONException.printStackTrace();
      } 
      this.a.startActivity(new Intent((Context)this.a, Dashboard.class));
    }
  }
  
  public class b implements q.a {
    public final AddBeneficiary a;
    
    public b(AddBeneficiary this$0) {}
    
    public void a(u param1u) {
      Toast.makeText(this.a.getApplicationContext(), "Something went wrong", 0).show();
    }
  }
  
  public class c extends g {
    public final String u;
    
    public c(AddBeneficiary this$0, int param1Int, String param1String1, JSONObject param1JSONObject, q.b param1b, q.a param1a, String param1String2) {
      super(param1Int, param1String1, param1JSONObject, param1b, param1a);
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


/* Location:              C:\Users\panch\Downloads\dvba_v1.1.0-dex2jar.jar!\com\app\damnvulnerablebank\AddBeneficiary.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */