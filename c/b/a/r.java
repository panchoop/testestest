package c.b.a;

import android.content.Context;
import android.widget.Toast;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import c.a.b.q;
import com.app.damnvulnerablebank.ViewBeneficiary;
import org.json.JSONException;
import org.json.JSONObject;

public class r implements q.b<JSONObject> {
  public final ViewBeneficiary a;
  
  public r(ViewBeneficiary paramViewBeneficiary) {}
  
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
        paramObject = paramObject.getJSONArray("data");
        for (i = 0; i < paramObject.length(); i++) {
          JSONObject jSONObject1 = paramObject.getJSONObject(i);
          c c = new c();
          this();
          c.a(jSONObject1.getString("beneficiary_account_number").toString());
          String str = jSONObject1.getString("approved").toString();
          StringBuilder stringBuilder = new StringBuilder();
          this();
          stringBuilder.append("\n\nAccount Approved By Admin\n");
          stringBuilder.append(str);
          c.b = stringBuilder.toString();
          this.a.q.add(c);
        } 
        paramObject = this.a;
        ((ViewBeneficiary)paramObject).p.setLayoutManager((RecyclerView.o)new LinearLayoutManager(paramObject.getApplicationContext()));
        paramObject = this.a;
        ((ViewBeneficiary)paramObject).r = new b(paramObject.getApplicationContext(), this.a.q);
        paramObject = this.a;
        ((ViewBeneficiary)paramObject).p.setAdapter(((ViewBeneficiary)paramObject).r);
      } 
    } catch (JSONException jSONException) {
      jSONException.printStackTrace();
      ViewBeneficiary viewBeneficiary = this.a;
      viewBeneficiary.p.setLayoutManager((RecyclerView.o)new LinearLayoutManager(viewBeneficiary.getApplicationContext()));
      viewBeneficiary = this.a;
      viewBeneficiary.r = new b(viewBeneficiary.getApplicationContext(), this.a.q);
      viewBeneficiary = this.a;
      viewBeneficiary.p.setAdapter(viewBeneficiary.r);
    } 
  }
}


/* Location:              C:\Users\panch\Downloads\dvba_v1.1.0-dex2jar.jar!\c\b\a\r.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */