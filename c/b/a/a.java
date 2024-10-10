package c.b.a;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import java.util.List;

public class a extends RecyclerView.g<a.a> {
  public LayoutInflater c;
  
  public List<q> d;
  
  public a(Context paramContext, List<q> paramList) {
    this.c = LayoutInflater.from(paramContext);
    this.d = paramList;
  }
  
  public int a() {
    return this.d.size();
  }
  
  public void c(RecyclerView.d0 paramd0, int paramInt) {
    paramd0 = paramd0;
    ((a)paramd0).t.setText(((q)this.d.get(paramInt)).a);
    ((a)paramd0).u.setText(((q)this.d.get(paramInt)).b);
    ((a)paramd0).v.setText(((q)this.d.get(paramInt)).c);
  }
  
  public RecyclerView.d0 d(ViewGroup paramViewGroup, int paramInt) {
    return new a(this, this.c.inflate(2131558445, paramViewGroup, false));
  }
  
  public class a extends RecyclerView.d0 {
    public TextView t;
    
    public TextView u;
    
    public TextView v;
    
    public a(a this$0, View param1View) {
      super(param1View);
      this.t = (TextView)param1View.findViewById(2131361975);
      this.u = (TextView)param1View.findViewById(2131362213);
      this.v = (TextView)param1View.findViewById(2131361871);
    }
  }
}


/* Location:              C:\Users\panch\Downloads\dvba_v1.1.0-dex2jar.jar!\c\b\a\a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */