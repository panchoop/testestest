package c.c.b.i;

import c.c.a.a.c.l.q;

public final class p {
  public final Class<?> a;
  
  public final int b;
  
  public final int c;
  
  public p(Class<?> paramClass, int paramInt1, int paramInt2) {
    q.h(paramClass, "Null dependency anInterface.");
    this.a = paramClass;
    this.b = paramInt1;
    this.c = paramInt2;
  }
  
  public boolean a() {
    boolean bool;
    if (this.b == 2) {
      bool = true;
    } else {
      bool = false;
    } 
    return bool;
  }
  
  public boolean equals(Object paramObject) {
    boolean bool = paramObject instanceof p;
    boolean bool2 = false;
    boolean bool1 = bool2;
    if (bool) {
      paramObject = paramObject;
      bool1 = bool2;
      if (this.a == ((p)paramObject).a) {
        bool1 = bool2;
        if (this.b == ((p)paramObject).b) {
          bool1 = bool2;
          if (this.c == ((p)paramObject).c)
            bool1 = true; 
        } 
      } 
    } 
    return bool1;
  }
  
  public int hashCode() {
    return ((this.a.hashCode() ^ 0xF4243) * 1000003 ^ this.b) * 1000003 ^ this.c;
  }
  
  public String toString() {
    String str;
    StringBuilder stringBuilder = new StringBuilder("Dependency{anInterface=");
    stringBuilder.append(this.a);
    stringBuilder.append(", type=");
    int i = this.b;
    boolean bool = true;
    if (i == 1) {
      str = "required";
    } else if (i == 0) {
      str = "optional";
    } else {
      str = "set";
    } 
    stringBuilder.append(str);
    stringBuilder.append(", direct=");
    if (this.c != 0)
      bool = false; 
    stringBuilder.append(bool);
    stringBuilder.append("}");
    return stringBuilder.toString();
  }
}


/* Location:              C:\Users\panch\Downloads\dvba_v1.1.0-dex2jar.jar!\c\c\b\i\p.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */