package b.b.o;

import android.animation.TimeInterpolator;
import android.view.View;
import android.view.animation.Interpolator;
import b.i.m.q;
import b.i.m.r;
import b.i.m.s;
import java.util.ArrayList;
import java.util.Iterator;

public class g {
  public final ArrayList<q> a = new ArrayList<q>();
  
  public long b = -1L;
  
  public Interpolator c;
  
  public r d;
  
  public boolean e;
  
  public final s f = new a(this);
  
  public void a() {
    if (!this.e)
      return; 
    Iterator<q> iterator = this.a.iterator();
    while (iterator.hasNext())
      ((q)iterator.next()).b(); 
    this.e = false;
  }
  
  public void b() {
    if (this.e)
      return; 
    for (q q : this.a) {
      long l = this.b;
      if (l >= 0L)
        q.c(l); 
      Interpolator interpolator = this.c;
      if (interpolator != null) {
        View view1 = q.a.get();
        if (view1 != null)
          view1.animate().setInterpolator((TimeInterpolator)interpolator); 
      } 
      if (this.d != null)
        q.d((r)this.f); 
      View view = q.a.get();
      if (view != null)
        view.animate().start(); 
    } 
    this.e = true;
  }
  
  public class a extends s {
    public boolean a = false;
    
    public int b = 0;
    
    public final g c;
    
    public a(g this$0) {}
    
    public void a(View param1View) {
      int i = this.b + 1;
      this.b = i;
      if (i == this.c.a.size()) {
        r r = this.c.d;
        if (r != null)
          r.a(null); 
        this.b = 0;
        this.a = false;
        this.c.e = false;
      } 
    }
    
    public void b(View param1View) {
      if (this.a)
        return; 
      this.a = true;
      r r = this.c.d;
      if (r != null)
        r.b(null); 
    }
  }
}


/* Location:              C:\Users\panch\Downloads\dvba_v1.1.0-dex2jar.jar!\b\b\o\g.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */