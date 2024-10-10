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
import c.b.a.i;
import c.b.a.j;
import c.b.a.k;
import c.b.a.l;
import c.b.a.m;
import java.util.ArrayList;
import java.util.List;

public class PendingBeneficiary extends h implements i.a {
  public RecyclerView p;
  
  public List<m> q;
  
  public TextView r;
  
  public i s;
  
  public void onCreate(Bundle paramBundle) {
    super.onCreate(paramBundle);
    setContentView(2131558438);
    this.p = (RecyclerView)findViewById(2131362099);
    this.q = new ArrayList<m>();
    this.r = (TextView)findViewById(2131361953);
    String str = a.c(getSharedPreferences("apiurl", 0).getString("apiurl", null), "/api/beneficiary/pending");
    p p = a.Z((Context)this);
    p.a((o)new l(this, 1, str, null, (q.b)new j(this), (q.a)new k(this)));
    ((d)p.e).a();
  }
}


/* Location:              C:\Users\panch\Downloads\dvba_v1.1.0-dex2jar.jar!\com\app\damnvulnerablebank\PendingBeneficiary.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */