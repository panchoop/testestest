package b.r.d;

import androidx.recyclerview.widget.RecyclerView;
import b.f.e;
import b.f.h;
import b.i.l.c;

public class z {
  public final h<RecyclerView.d0, a> a = new h();
  
  public final e<RecyclerView.d0> b = new e();
  
  public void a(RecyclerView.d0 paramd0) {
    a a2 = (a)this.a.getOrDefault(paramd0, null);
    a a1 = a2;
    if (a2 == null) {
      a1 = a.a();
      this.a.put(paramd0, a1);
    } 
    a1.a |= 0x1;
  }
  
  public void b(RecyclerView.d0 paramd0, RecyclerView.l.c paramc) {
    a a2 = (a)this.a.getOrDefault(paramd0, null);
    a a1 = a2;
    if (a2 == null) {
      a1 = a.a();
      this.a.put(paramd0, a1);
    } 
    a1.c = paramc;
    a1.a |= 0x8;
  }
  
  public void c(RecyclerView.d0 paramd0, RecyclerView.l.c paramc) {
    a a2 = (a)this.a.getOrDefault(paramd0, null);
    a a1 = a2;
    if (a2 == null) {
      a1 = a.a();
      this.a.put(paramd0, a1);
    } 
    a1.b = paramc;
    a1.a |= 0x4;
  }
  
  public boolean d(RecyclerView.d0 paramd0) {
    a a = (a)this.a.getOrDefault(paramd0, null);
    boolean bool = true;
    if (a == null || (a.a & 0x1) == 0)
      bool = false; 
    return bool;
  }
  
  public final RecyclerView.l.c e(RecyclerView.d0 paramd0, int paramInt) {
    int i = this.a.e(paramd0);
    if (i < 0)
      return null; 
    a a = (a)this.a.k(i);
    if (a != null) {
      int j = a.a;
      if ((j & paramInt) != 0) {
        RecyclerView.l.c c;
        a.a = (paramInt ^ 0xFFFFFFFF) & j;
        if (paramInt == 4) {
          c = a.b;
        } else if (paramInt == 8) {
          c = a.c;
        } else {
          throw new IllegalArgumentException("Must provide flag PRE or POST");
        } 
        if ((a.a & 0xC) == 0) {
          this.a.i(i);
          a.b(a);
        } 
        return c;
      } 
    } 
    return null;
  }
  
  public void f(RecyclerView.d0 paramd0) {
    a a = (a)this.a.getOrDefault(paramd0, null);
    if (a == null)
      return; 
    a.a &= 0xFFFFFFFE;
  }
  
  public void g(RecyclerView.d0 paramd0) {
    for (int i = this.b.h() - 1; i >= 0; i--) {
      if (paramd0 == this.b.i(i)) {
        e<RecyclerView.d0> e1 = this.b;
        Object[] arrayOfObject = e1.d;
        Object object1 = arrayOfObject[i];
        Object object2 = e.f;
        if (object1 != object2) {
          arrayOfObject[i] = object2;
          e1.b = true;
        } 
        break;
      } 
    } 
    a a = (a)this.a.remove(paramd0);
    if (a != null)
      a.b(a); 
  }
  
  public static class a {
    public static c<a> d = new c(20);
    
    public int a;
    
    public RecyclerView.l.c b;
    
    public RecyclerView.l.c c;
    
    public static a a() {
      a a2 = (a)d.a();
      a a1 = a2;
      if (a2 == null)
        a1 = new a(); 
      return a1;
    }
    
    public static void b(a param1a) {
      param1a.a = 0;
      param1a.b = null;
      param1a.c = null;
      d.b(param1a);
    }
  }
  
  public static interface b {}
}


/* Location:              C:\Users\panch\Downloads\dvba_v1.1.0-dex2jar.jar!\b\r\d\z.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */