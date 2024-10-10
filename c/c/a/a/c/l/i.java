package c.c.a.a.c.l;

import android.util.Log;

public final class i {
  public final String a;
  
  public final String b;
  
  public i(String paramString1, String paramString2) {
    boolean bool;
    q.g(paramString1, "log tag cannot be null");
    if (paramString1.length() <= 23) {
      bool = true;
    } else {
      bool = false;
    } 
    if (bool) {
      this.a = paramString1;
      if (paramString2 == null || paramString2.length() <= 0) {
        this.b = null;
        return;
      } 
      this.b = paramString2;
      return;
    } 
    throw new IllegalArgumentException(String.format("tag \"%s\" is longer than the %d character maximum", new Object[] { paramString1, Integer.valueOf(23) }));
  }
  
  public final boolean a(int paramInt) {
    return Log.isLoggable(this.a, paramInt);
  }
}


/* Location:              C:\Users\panch\Downloads\dvba_v1.1.0-dex2jar.jar!\c\c\a\a\c\l\i.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */