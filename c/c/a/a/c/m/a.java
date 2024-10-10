package c.c.a.a.c.m;

import android.util.Log;
import c.c.a.a.c.l.i;
import java.util.Locale;

public class a {
  public final String a;
  
  public final String b;
  
  public final int c;
  
  public a(String paramString, String... paramVarArgs) {
    String str;
    this.b = str;
    this.a = paramString;
    new i(paramString, null);
    byte b;
    for (b = 2; 7 >= b && !Log.isLoggable(this.a, b); b++);
    this.c = b;
  }
  
  public final String a(String paramString, Object... paramVarArgs) {
    String str = paramString;
    if (paramVarArgs != null) {
      str = paramString;
      if (paramVarArgs.length > 0)
        str = String.format(Locale.US, paramString, paramVarArgs); 
    } 
    return this.b.concat(str);
  }
  
  public void b(String paramString, Object... paramVarArgs) {
    Log.i(this.a, a(paramString, paramVarArgs));
  }
  
  public void c(String paramString, Object... paramVarArgs) {
    boolean bool;
    if (this.c <= 2) {
      bool = true;
    } else {
      bool = false;
    } 
    if (bool)
      Log.v(this.a, a(paramString, paramVarArgs)); 
  }
}


/* Location:              C:\Users\panch\Downloads\dvba_v1.1.0-dex2jar.jar!\c\c\a\a\c\m\a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */