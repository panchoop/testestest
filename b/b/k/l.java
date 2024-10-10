package b.b.k;

import android.os.Build;
import android.view.View;
import b.i.f.b;
import b.i.m.j;
import b.i.m.u;

public class l implements j {
  public final k a;
  
  public l(k paramk) {}
  
  public u a(View paramView, u paramu) {
    int m = paramu.d();
    int i = this.a.N(paramu, null);
    u u1 = paramu;
    if (m != i) {
      u.b b;
      u.a a;
      int n = paramu.b();
      m = paramu.c();
      int i1 = paramu.a();
      if (Build.VERSION.SDK_INT >= 29) {
        b = new u.b(paramu);
      } else {
        a = new u.a((u)b);
      } 
      a.c(b.a(n, i, m, i1));
      u1 = a.a();
    } 
    return b.i.m.l.L(paramView, u1);
  }
}


/* Location:              C:\Users\panch\Downloads\dvba_v1.1.0-dex2jar.jar!\b\b\k\l.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */