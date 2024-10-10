package c.b.a;

import android.content.Context;
import android.widget.Toast;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import c.a.b.q;
import com.app.damnvulnerablebank.ViewBeneficiaryAdmin;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public class u implements q.b<JSONObject> {
  public final ViewBeneficiaryAdmin a;
  
  public u(ViewBeneficiaryAdmin paramViewBeneficiaryAdmin) {}
  
  public void a(Object paramObject) {
    JSONObject jSONObject = (JSONObject)paramObject;
    try {
      paramObject = new JSONObject();
      super(e.a(jSONObject.get("enc_data").toString()));
      int i = paramObject.getJSONObject("status").getInt("code");
      if (i != 200) {
        Context context = this.a.getApplicationContext();
        StringBuilder stringBuilder = new StringBuilder();
        this();
        stringBuilder.append("Error: ");
        stringBuilder.append(paramObject.getJSONObject("data").getString("message"));
        Toast.makeText(context, stringBuilder.toString(), 0).show();
      } else {
        JSONArray jSONArray = paramObject.getJSONArray("data");
        for (i = 0; i < jSONArray.length(); i++) {
          paramObject = jSONArray.getJSONObject(i);
          c c = new c();
          this();
          if (paramObject.getString("approved").toString() != "false") {
            c.a(paramObject.getString("beneficiary_account_number").toString());
            this.a.q.add(c);
          } 
        } 
        paramObject = this.a;
        ((ViewBeneficiaryAdmin)paramObject).p.setLayoutManager((RecyclerView.o)new LinearLayoutManager(paramObject.getApplicationContext()));
        paramObject = this.a;
        ((ViewBeneficiaryAdmin)paramObject).s = new b(paramObject.getApplicationContext(), this.a.q);
        paramObject = this.a;
        ((ViewBeneficiaryAdmin)paramObject).p.setAdapter(((ViewBeneficiaryAdmin)paramObject).s);
      } 
    } catch (JSONException jSONException) {
      jSONException.printStackTrace();
      ViewBeneficiaryAdmin viewBeneficiaryAdmin = this.a;
      viewBeneficiaryAdmin.p.setLayoutManager((RecyclerView.o)new LinearLayoutManager(viewBeneficiaryAdmin.getApplicationContext()));
      viewBeneficiaryAdmin = this.a;
      viewBeneficiaryAdmin.s = new b(viewBeneficiaryAdmin.getApplicationContext(), this.a.q);
      viewBeneficiaryAdmin = this.a;
      viewBeneficiaryAdmin.p.setAdapter(viewBeneficiaryAdmin.s);
    } 
  }
}


/* Location:              C:\Users\panch\Downloads\dvba_v1.1.0-dex2jar.jar!\c\b\\\u.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */