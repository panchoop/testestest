package c.c.b.h.c0.a;

import android.util.Log;
import c.c.a.a.c.l.q;
import java.util.Map;

public final class e {
  public final int a;
  
  public final int b;
  
  public final Map<String, Integer> c;
  
  public e(int paramInt1, int paramInt2, Map<String, Integer> paramMap) {
    if (a())
      paramInt1 = 0; 
    this.a = paramInt1;
    this.b = paramInt2;
    q.f(paramMap);
    this.c = paramMap;
    a();
  }
  
  public static boolean a() {
    String str1;
    String str2 = null;
    try {
      Object object = Class.forName("android.os.SystemProperties").getDeclaredMethod("get", new Class[] { String.class }).invoke(null, new Object[] { "firebear.preference" });
      str1 = str2;
      if (object != null) {
        str1 = str2;
        if (String.class.isAssignableFrom(object.getClass()))
          str1 = (String)object; 
      } 
    } catch (Exception exception) {
      str1 = str2;
    } 
    boolean bool = "local".equals(str1);
    if (bool)
      Log.e("BiChannelGoogleApi", "Found local preference, will always use local service instance"); 
    return bool;
  }
}


/* Location:              C:\Users\panch\Downloads\dvba_v1.1.0-dex2jar.jar!\c\c\b\h\c0\a\e.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */