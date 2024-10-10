package c.c.a.a.c.k.k;

import c.c.a.a.c.c;
import c.c.a.a.c.k.a;
import c.c.a.a.h.e;

public abstract class k<A extends a.b, ResultT> {
  public final c[] a;
  
  public final boolean b;
  
  public k(c[] paramArrayOfc, boolean paramBoolean, c0 paramc0) {
    this.a = paramArrayOfc;
    this.b = paramBoolean;
  }
  
  public static <A extends a.b, ResultT> a<A, ResultT> a() {
    return new a<A, ResultT>(null);
  }
  
  public static class a<A extends a.b, ResultT> {
    public i<A, e<ResultT>> a;
    
    public boolean b = true;
    
    public c[] c;
    
    public a(c0 param1c0) {}
    
    public k<A, ResultT> a() {
      boolean bool;
      if (this.a != null) {
        bool = true;
      } else {
        bool = false;
      } 
      if (bool)
        return new d0(this, this.c, this.b); 
      throw new IllegalArgumentException("execute parameter required");
    }
  }
}


/* Location:              C:\Users\panch\Downloads\dvba_v1.1.0-dex2jar.jar!\c\c\a\a\c\k\k\k.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */