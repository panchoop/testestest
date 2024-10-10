package c.c.b.i;

public class o {
  public final Class<?> a;
  
  public final boolean b;
  
  public o(Class<?> paramClass, boolean paramBoolean, m paramm) {
    this.a = paramClass;
    this.b = paramBoolean;
  }
  
  public boolean equals(Object paramObject) {
    boolean bool = paramObject instanceof o;
    boolean bool2 = false;
    boolean bool1 = bool2;
    if (bool) {
      paramObject = paramObject;
      bool1 = bool2;
      if (((o)paramObject).a.equals(this.a)) {
        bool1 = bool2;
        if (((o)paramObject).b == this.b)
          bool1 = true; 
      } 
    } 
    return bool1;
  }
  
  public int hashCode() {
    return (this.a.hashCode() ^ 0xF4243) * 1000003 ^ Boolean.valueOf(this.b).hashCode();
  }
}


/* Location:              C:\Users\panch\Downloads\dvba_v1.1.0-dex2jar.jar!\c\c\b\i\o.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */