package c.b.a;

import android.util.Base64;

public class e {
  public static int a = "amazing".length();
  
  public static String a(String paramString) {
    return c(new String(Base64.decode(paramString, 0)));
  }
  
  public static String b(String paramString) {
    return Base64.encodeToString(c(paramString).getBytes(), 0);
  }
  
  public static String c(String paramString) {
    String str = "";
    for (byte b = 0; b < paramString.length(); b++) {
      char c = (char)(paramString.charAt(b) ^ "amazing".charAt(b % a));
      StringBuilder stringBuilder = new StringBuilder();
      stringBuilder.append(str);
      stringBuilder.append(c);
      str = stringBuilder.toString();
    } 
    return str;
  }
}


/* Location:              C:\Users\panch\Downloads\dvba_v1.1.0-dex2jar.jar!\c\b\a\e.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */