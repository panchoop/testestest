package c.c.b.h.c0.a;

import a.a.a.a.a;
import c.c.a.a.c.k.a;
import c.c.a.a.c.l.q;
import java.util.Arrays;

public final class t0 extends b implements a.d {
  public final String c;
  
  public t0(String paramString, r0 paramr0) {
    q.e(paramString, "A valid API key must be provided");
    this.c = paramString;
  }
  
  public final Object clone() {
    String str = this.c;
    q.d(str);
    return new t0(str, null);
  }
  
  public final boolean equals(Object paramObject) {
    if (paramObject == this)
      return true; 
    if (!(paramObject instanceof t0))
      return false; 
    paramObject = paramObject;
    return (a.y(this.c, ((t0)paramObject).c) && this.b == ((b)paramObject).b);
  }
  
  public final int hashCode() {
    return Arrays.hashCode(new Object[] { this.c }) + (true ^ this.b);
  }
}


/* Location:              C:\Users\panch\Downloads\dvba_v1.1.0-dex2jar.jar!\c\c\b\h\c0\a\t0.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */