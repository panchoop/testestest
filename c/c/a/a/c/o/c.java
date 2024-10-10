package c.c.a.a.c.o;

import android.os.Process;
import android.os.StrictMode;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import javax.annotation.Nullable;

public class c {
  public static String a;
  
  public static int b;
  
  @Nullable
  public static String a() {
    String str;
    if (a == null) {
      if (b == 0)
        b = Process.myPid(); 
      int i = b;
      String str2 = null;
      String str3 = null;
      String str1 = null;
      if (i <= 0) {
        str = str2;
      } else {
        try {
          StringBuilder stringBuilder = new StringBuilder();
          this(25);
          stringBuilder.append("/proc/");
          stringBuilder.append(i);
          stringBuilder.append("/cmdline");
        } catch (IOException iOException1) {
        
        } finally {
          String str4 = str1;
          if (str4 != null)
            try {
              str4.close();
            } catch (IOException iOException) {} 
        } 
        str = str2;
        if (iOException != null) {
          str = str3;
          iOException.close();
          str = str2;
        } 
      } 
    } else {
      return a;
    } 
    a = str;
    return a;
  }
  
  public static BufferedReader b(String paramString) {
    StrictMode.ThreadPolicy threadPolicy = StrictMode.allowThreadDiskReads();
    try {
      FileReader fileReader = new FileReader();
      this(paramString);
      return new BufferedReader(fileReader);
    } finally {
      StrictMode.setThreadPolicy(threadPolicy);
    } 
  }
}


/* Location:              C:\Users\panch\Downloads\dvba_v1.1.0-dex2jar.jar!\c\c\a\a\c\o\c.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */