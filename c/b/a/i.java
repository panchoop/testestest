package c.b.a;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.app.damnvulnerablebank.ApproveBeneficiary;
import com.app.damnvulnerablebank.PendingBeneficiary;
import java.util.List;

public class i extends RecyclerView.g<i.b> {
  public LayoutInflater c;
  
  public List<m> d;
  
  public a e;
  
  public i(Context paramContext, List<m> paramList) {
    this.c = LayoutInflater.from(paramContext);
    this.d = paramList;
  }
  
  public int a() {
    return this.d.size();
  }
  
  public void c(RecyclerView.d0 paramd0, int paramInt) {
    paramd0 = paramd0;
    ((b)paramd0).t.setText(((m)this.d.get(paramInt)).a);
    ((b)paramd0).u.setText(((m)this.d.get(paramInt)).b);
    ((b)paramd0).v.setText(((m)this.d.get(paramInt)).c);
  }
  
  public RecyclerView.d0 d(ViewGroup paramViewGroup, int paramInt) {
    return new b(this, this.c.inflate(2131558446, paramViewGroup, false));
  }
  
  public static interface a {}
  
  public class b extends RecyclerView.d0 {
    public TextView t;
    
    public TextView u;
    
    public TextView v;
    
    public final i w;
    
    public b(i this$0, View param1View) {
      super(param1View);
      this.t = (TextView)param1View.findViewById(2131361840);
      this.u = (TextView)param1View.findViewById(2131361884);
      this.v = (TextView)param1View.findViewById(2131361991);
      param1View.setOnClickListener(new a(this, this$0));
    }
    
    public class a implements View.OnClickListener {
      public final i.b b;
      
      public a(i.b this$0, i param2i) {}
      
      public void onClick(View param2View) {
        i.b b1 = this.b;
        if (b1.w.e != null) {
          int i = b1.e();
          if (i != -1) {
            PendingBeneficiary pendingBeneficiary = (PendingBeneficiary)this.b.w.e;
            if (pendingBeneficiary != null) {
              Intent intent = new Intent((Context)pendingBeneficiary, ApproveBeneficiary.class);
              intent.putExtra("id", ((m)pendingBeneficiary.q.get(i)).c);
              pendingBeneficiary.startActivity(intent);
            } else {
              throw null;
            } 
          } 
        } 
      }
    }
  }
  
  public class a implements View.OnClickListener {
    public final i.b b;
    
    public a(i this$0, i param1i) {}
    
    public void onClick(View param1View) {
      i.b b1 = this.b;
      if (b1.w.e != null) {
        int i = b1.e();
        if (i != -1) {
          PendingBeneficiary pendingBeneficiary = (PendingBeneficiary)this.b.w.e;
          if (pendingBeneficiary != null) {
            Intent intent = new Intent((Context)pendingBeneficiary, ApproveBeneficiary.class);
            intent.putExtra("id", ((m)pendingBeneficiary.q.get(i)).c);
            pendingBeneficiary.startActivity(intent);
          } else {
            throw null;
          } 
        } 
      } 
    }
  }
}


/* Location:              C:\Users\panch\Downloads\dvba_v1.1.0-dex2jar.jar!\c\b\a\i.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */