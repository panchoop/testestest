package com.app.damnvulnerablebank;

import a.a.a.a.a;
import android.content.Context;
import android.os.Bundle;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import b.b.k.h;
import c.a.a.a.a;
import c.a.b.o;
import c.a.b.p;
import c.a.b.q;
import c.a.b.w.d;
import c.b.a.a;
import c.b.a.f;
import c.b.a.g;
import c.b.a.h;
import c.b.a.q;
import java.util.ArrayList;
import java.util.List;

public class GetTransactions extends h {
  public RecyclerView p;
  
  public List<q> q;
  
  public TextView r;
  
  public a s;
  
  public void onCreate(Bundle paramBundle) {
    super.onCreate(paramBundle);
    setContentView(2131558441);
    this.p = (RecyclerView)findViewById(2131362225);
    this.q = new ArrayList<q>();
    this.r = (TextView)findViewById(2131361953);
    String str = a.c(getSharedPreferences("apiurl", 0).getString("apiurl", null), "/api/transactions/view");
    p p = a.Z((Context)this);
    p.a((o)new h(this, 1, str, null, (q.b)new f(this), (q.a)new g(this)));
    ((d)p.e).a();
  }
}


/* Location:              C:\Users\panch\Downloads\dvba_v1.1.0-dex2jar.jar!\com\app\damnvulnerablebank\GetTransactions.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */