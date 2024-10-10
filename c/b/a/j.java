package c.b.a;

import android.content.Context;
import android.util.Log;
import android.widget.Toast;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import c.a.b.q;
import com.app.damnvulnerablebank.PendingBeneficiary;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public class j implements q.b<JSONObject> {
  public final PendingBeneficiary a;
  
  public j(PendingBeneficiary paramPendingBeneficiary) {}
  
  public void a(Object paramObject) {
    JSONObject jSONObject = (JSONObject)paramObject;
    try {
      paramObject = new JSONObject();
      super(e.a(jSONObject.get("enc_data").toString()));
      Log.d("Pending Beneficiary", paramObject.toString());
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
          JSONObject jSONObject1 = jSONArray.getJSONObject(i);
          paramObject = new m();
          super();
          String str2 = jSONObject1.getString("account_number").toString();
          StringBuilder stringBuilder2 = new StringBuilder();
          this();
          stringBuilder2.append("Account Number\t\t:");
          stringBuilder2.append(str2);
          ((m)paramObject).a = stringBuilder2.toString();
          String str3 = jSONObject1.getString("beneficiary_account_number").toString();
          StringBuilder stringBuilder1 = new StringBuilder();
          this();
          stringBuilder1.append("Benificiary Account Number\t\t:");
          stringBuilder1.append(str3);
          stringBuilder1.append("\n");
          ((m)paramObject).b = stringBuilder1.toString();
          String str1 = jSONObject1.getString("id").toString();
          stringBuilder1 = new StringBuilder();
          this();
          stringBuilder1.append("ID\t\t:");
          stringBuilder1.append(str1);
          ((m)paramObject).c = stringBuilder1.toString();
          this.a.q.add(paramObject);
        } 
        paramObject = this.a;
        ((PendingBeneficiary)paramObject).p.setLayoutManager((RecyclerView.o)new LinearLayoutManager(paramObject.getApplicationContext()));
        paramObject = this.a;
        ((PendingBeneficiary)paramObject).s = new i(paramObject.getApplicationContext(), this.a.q);
        paramObject = this.a;
        ((PendingBeneficiary)paramObject).p.setAdapter(((PendingBeneficiary)paramObject).s);
        paramObject = this.a;
        i i1 = ((PendingBeneficiary)paramObject).s;
        i1.e = (i.a)paramObject;
      } 
    } catch (JSONException jSONException) {
      jSONException.printStackTrace();
      PendingBeneficiary pendingBeneficiary = this.a;
      pendingBeneficiary.p.setLayoutManager((RecyclerView.o)new LinearLayoutManager(pendingBeneficiary.getApplicationContext()));
      pendingBeneficiary = this.a;
      pendingBeneficiary.s = new i(pendingBeneficiary.getApplicationContext(), this.a.q);
      pendingBeneficiary = this.a;
      pendingBeneficiary.p.setAdapter(pendingBeneficiary.s);
      pendingBeneficiary = this.a;
      i i = pendingBeneficiary.s;
      i.e = (i.a)pendingBeneficiary;
    } 
  }
}


/* Location:              C:\Users\panch\Downloads\dvba_v1.1.0-dex2jar.jar!\c\b\a\j.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */