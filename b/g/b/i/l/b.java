package b.g.b.i.l;

import androidx.constraintlayout.widget.ConstraintLayout;
import b.g.b.i.d;
import b.g.b.i.e;
import java.util.ArrayList;

public class b {
  public final ArrayList<d> a = new ArrayList<d>();
  
  public a b = new a();
  
  public e c;
  
  public b(e parame) {
    this.c = parame;
  }
  
  public final boolean a(b paramb, d paramd, boolean paramBoolean) {
    boolean bool;
    d.a a4 = d.a.b;
    d.a a3 = d.a.d;
    this.b.a = paramd.j();
    this.b.b = paramd.n();
    this.b.c = paramd.o();
    this.b.d = paramd.i();
    a a6 = this.b;
    a6.i = false;
    a6.j = paramBoolean;
    d.a a5 = a6.a;
    paramBoolean = true;
    if (a5 == a3) {
      i = 1;
    } else {
      i = 0;
    } 
    if (this.b.b == a3) {
      bool = true;
    } else {
      bool = false;
    } 
    if (i && paramd.N > 0.0F) {
      i = 1;
    } else {
      i = 0;
    } 
    if (bool && paramd.N > 0.0F) {
      bool = true;
    } else {
      bool = false;
    } 
    if (i && paramd.l[0] == 4)
      this.b.a = a4; 
    if (bool && paramd.l[1] == 4)
      this.b.b = a4; 
    a a2 = this.b;
    ((ConstraintLayout.b)paramb).a(paramd, a2);
    paramd.B(this.b.e);
    paramd.w(this.b.f);
    a a1 = this.b;
    paramd.w = a1.h;
    int i = a1.g;
    paramd.R = i;
    if (i <= 0)
      paramBoolean = false; 
    paramd.w = paramBoolean;
    a1 = this.b;
    a1.j = false;
    return a1.i;
  }
  
  public final void b(e parame, int paramInt1, int paramInt2) {
    int j = ((d)parame).S;
    int i = ((d)parame).T;
    parame.z(0);
    parame.y(0);
    ((d)parame).L = paramInt1;
    int k = ((d)parame).S;
    if (paramInt1 < k)
      ((d)parame).L = k; 
    ((d)parame).M = paramInt2;
    paramInt1 = ((d)parame).T;
    if (paramInt2 < paramInt1)
      ((d)parame).M = paramInt1; 
    parame.z(j);
    parame.y(i);
    this.c.E();
  }
  
  public static class a {
    public d.a a;
    
    public d.a b;
    
    public int c;
    
    public int d;
    
    public int e;
    
    public int f;
    
    public int g;
    
    public boolean h;
    
    public boolean i;
    
    public boolean j;
  }
  
  public static interface b {}
}


/* Location:              C:\Users\panch\Downloads\dvba_v1.1.0-dex2jar.jar!\b\g\b\i\l\b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */