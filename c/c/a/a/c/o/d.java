package c.c.a.a.c.o;

import android.text.TextUtils;
import java.util.regex.Pattern;

public class d {
  static {
    Pattern.compile("\\$\\{(.*?)\\}");
  }
  
  public static String a(String paramString) {
    String str = paramString;
    if (TextUtils.isEmpty(paramString))
      str = null; 
    return str;
  }
  
  public static boolean b(String paramString) {
    return (paramString == null || paramString.trim().isEmpty());
  }
}


/* Location:              C:\Users\panch\Downloads\dvba_v1.1.0-dex2jar.jar!\c\c\a\a\c\o\d.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */