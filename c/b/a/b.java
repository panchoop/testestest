package c.b.a;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import java.util.List;

public class b extends RecyclerView.g<b.b> {
  public LayoutInflater c;
  
  public List<c> d;
  
  public a e;
  
  public b(Context paramContext, List<c> paramList) {
    this.c = LayoutInflater.from(paramContext);
    this.d = paramList;
  }
  
  public int a() {
    return this.d.size();
  }
  
  public void c(RecyclerView.d0 paramd0, int paramInt) {
    paramd0 = paramd0;
    ((b)paramd0).t.setText(((c)this.d.get(paramInt)).a);
    ((b)paramd0).u.setText(((c)this.d.get(paramInt)).b);
  }
  
  public RecyclerView.d0 d(ViewGroup paramViewGroup, int paramInt) {
    return new b(this, this.c.inflate(2131558443, paramViewGroup, false));
  }
  
  public static interface a {
    void c(int param1Int);
  }
  
  public class b extends RecyclerView.d0 {
    public TextView t;
    
    public TextView u;
    
    public final b v;
    
    public b(b this$0, View param1View) {
      super(param1View);
      this.t = (TextView)param1View.findViewById(2131361887);
      this.u = (TextView)param1View.findViewById(2131361999);
      param1View.setOnClickListener(new a(this, this$0));
    }
    
    public class a implements View.OnClickListener {
      public final b.b b;
      
      public a(b.b this$0, b param2b) {}
      
      public void onClick(View param2View) {
        b.b b1 = this.b;
        if (b1.v.e != null) {
          int i = b1.e();
          if (i != -1)
            this.b.v.e.c(i); 
        } 
      }
    }
  }
  
  public class a implements View.OnClickListener {
    public final b.b b;
    
    public a(b this$0, b param1b) {}
    
    public void onClick(View param1View) {
      b.b b1 = this.b;
      if (b1.v.e != null) {
        int i = b1.e();
        if (i != -1)
          this.b.v.e.c(i); 
      } 
    }
  }
}


/* Location:              C:\Users\panch\Downloads\dvba_v1.1.0-dex2jar.jar!\c\b\a\b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */