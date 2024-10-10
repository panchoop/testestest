package c.c.b.h.d0;

import android.util.Log;
import c.c.a.a.c.m.a;
import c.c.a.a.f.c.o;
import c.c.a.a.f.c.s;
import c.c.b.h.c0.b;
import c.c.b.h.p;
import java.util.Map;

public final class i {
  public static final a a = new a("GetTokenResultFactory", new String[0]);
  
  public static p a(String paramString) {
    o o;
    try {
      Map<String, Object> map = k.b(paramString);
    } catch (b b) {
      a a1 = a;
      Log.e(a1.a, a1.a("Error parsing token claims", new Object[0]), (Throwable)b);
      o = s.h;
    } 
    return new p(paramString, (Map)o);
  }
}


/* Location:              C:\Users\panch\Downloads\dvba_v1.1.0-dex2jar.jar!\c\c\b\h\d0\i.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */