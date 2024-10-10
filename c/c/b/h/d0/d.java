package c.c.b.h.d0;

import c.c.a.a.c.m.a;
import c.c.a.a.h.a;

public final class d implements a {
  public final e a;
  
  public d(e parame) {}
  
  public final void b(Exception paramException) {
    if (paramException instanceof c.c.b.e) {
      c.h.c("Failure to refresh token; scheduling refresh after failure", new Object[0]);
      c c = this.a.c;
      int i = (int)c.c;
      if (i != 30 && i != 60 && i != 120 && i != 240 && i != 480) {
        if (i != 960) {
          l = 30L;
        } else {
          l = 960L;
        } 
      } else {
        l = 2L * c.c;
      } 
      c.c = l;
      long l = System.currentTimeMillis();
      c.b = c.c * 1000L + l;
      a a1 = c.h;
      l = c.b;
      StringBuilder stringBuilder = new StringBuilder(43);
      stringBuilder.append("Scheduling refresh for ");
      stringBuilder.append(l);
      a1.c(stringBuilder.toString(), new Object[0]);
      c.f.postDelayed(c.g, c.c * 1000L);
    } 
  }
}


/* Location:              C:\Users\panch\Downloads\dvba_v1.1.0-dex2jar.jar!\c\c\b\h\d0\d.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */