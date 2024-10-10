package c.b.a;

import android.content.Context;
import android.widget.Toast;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import c.a.b.q;
import com.app.damnvulnerablebank.GetTransactions;
import org.json.JSONException;
import org.json.JSONObject;

public class f implements q.b<JSONObject> {
  public final GetTransactions a;
  
  public f(GetTransactions paramGetTransactions) {}
  
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
          q q = new q();
          this();
          String str = jSONObject1.getString("from_account").toString();
          StringBuilder stringBuilder2 = new StringBuilder();
          this();
          stringBuilder2.append("From Account Number\t\t:");
          stringBuilder2.append(str);
          q.a = stringBuilder2.toString();
          str = jSONObject1.getString("to_account").toString();
          stringBuilder2 = new StringBuilder();
          this();
          stringBuilder2.append("To    Account Number\t\t:");
          stringBuilder2.append(str);
          q.b = stringBuilder2.toString();
          str = jSONObject1.getString("amount").toString();
          StringBuilder stringBuilder1 = new StringBuilder();
          this();
          stringBuilder1.append("Amount Sent\t\t:$");
          stringBuilder1.append(str);
          q.c = stringBuilder1.toString();
          this.a.q.add(q);
        } 
        paramObject = this.a;
        ((GetTransactions)paramObject).p.setLayoutManager((RecyclerView.o)new LinearLayoutManager(paramObject.getApplicationContext()));
        paramObject = this.a;
        ((GetTransactions)paramObject).s = new a(paramObject.getApplicationContext(), this.a.q);
        paramObject = this.a;
        ((GetTransactions)paramObject).p.setAdapter(((GetTransactions)paramObject).s);
      } 
    } catch (JSONException jSONException) {
      jSONException.printStackTrace();
      GetTransactions getTransactions = this.a;
      getTransactions.p.setLayoutManager((RecyclerView.o)new LinearLayoutManager(getTransactions.getApplicationContext()));
      getTransactions = this.a;
      getTransactions.s = new a(getTransactions.getApplicationContext(), this.a.q);
      getTransactions = this.a;
      getTransactions.p.setAdapter(getTransactions.s);
    } 
  }
}


/* Location:              C:\Users\panch\Downloads\dvba_v1.1.0-dex2jar.jar!\c\b\a\f.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */