package b.b.k;

import android.view.View;
import b.i.m.l;
import b.i.m.q;
import b.i.m.r;
import b.i.m.s;

public class o implements Runnable {
  public final k b;
  
  public o(k paramk) {}
  
  public void run() {
    k k1 = this.b;
    k1.q.showAtLocation((View)k1.p, 55, 0, 0);
    this.b.y();
    if (this.b.L()) {
      this.b.p.setAlpha(0.0F);
      k1 = this.b;
      q q = l.a((View)k1.p);
      q.a(1.0F);
      k1.s = q;
      q = this.b.s;
      a a = new a(this);
      View view = q.a.get();
      if (view != null)
        q.e(view, (r)a); 
    } else {
      this.b.p.setAlpha(1.0F);
      this.b.p.setVisibility(0);
    } 
  }
  
  public class a extends s {
    public final o a;
    
    public a(o this$0) {}
    
    public void a(View param1View) {
      this.a.b.p.setAlpha(1.0F);
      this.a.b.s.d(null);
      this.a.b.s = null;
    }
    
    public void b(View param1View) {
      this.a.b.p.setVisibility(0);
    }
  }
}


/* Location:              C:\Users\panch\Downloads\dvba_v1.1.0-dex2jar.jar!\b\b\k\o.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */