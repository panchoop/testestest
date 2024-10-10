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
import c.b.a.b;
import c.b.a.c;
import c.b.a.r;
import c.b.a.s;
import c.b.a.t;
import java.util.ArrayList;
import java.util.List;

public class ViewBeneficiary extends h implements b.a {
  public RecyclerView p;
  
  public List<c> q;
  
  public b r;
  
  public TextView s;
  
  public void c(int paramInt) {}
  
  public void onCreate(Bundle paramBundle) {
    super.onCreate(paramBundle);
    setContentView(2131558442);
    this.p = (RecyclerView)findViewById(2131361887);
    this.s = (TextView)findViewById(2131361953);
    this.q = new ArrayList<c>();
    String str = a.c(getSharedPreferences("apiurl", 0).getString("apiurl", null), "/api/beneficiary/view");
    p p = a.Z((Context)this);
    p.a((o)new t(this, 1, str, null, (q.b)new r(this), (q.a)new s(this)));
    ((d)p.e).a();
  }
}


/* Location:              C:\Users\panch\Downloads\dvba_v1.1.0-dex2jar.jar!\com\app\damnvulnerablebank\ViewBeneficiary.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */