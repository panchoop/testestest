package b.i.n;

import android.os.Build;

public interface b {
  public static final boolean a;
  
  static {
    boolean bool;
    if (Build.VERSION.SDK_INT >= 27) {
      bool = true;
    } else {
      bool = false;
    } 
    a = bool;
  }
}


/* Location:              C:\Users\panch\Downloads\dvba_v1.1.0-dex2jar.jar!\b\i\n\b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */