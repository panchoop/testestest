package b.i.l;

import android.util.Log;
import java.io.Writer;

@Deprecated
public class a extends Writer {
  public final String b;
  
  public StringBuilder c = new StringBuilder(128);
  
  public a(String paramString) {
    this.b = paramString;
  }
  
  public final void a() {
    if (this.c.length() > 0) {
      Log.d(this.b, this.c.toString());
      StringBuilder stringBuilder = this.c;
      stringBuilder.delete(0, stringBuilder.length());
    } 
  }
  
  public void close() {
    a();
  }
  
  public void flush() {
    a();
  }
  
  public void write(char[] paramArrayOfchar, int paramInt1, int paramInt2) {
    for (byte b = 0; b < paramInt2; b++) {
      char c = paramArrayOfchar[paramInt1 + b];
      if (c == '\n') {
        a();
      } else {
        this.c.append(c);
      } 
    } 
  }
}


/* Location:              C:\Users\panch\Downloads\dvba_v1.1.0-dex2jar.jar!\b\i\l\a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */