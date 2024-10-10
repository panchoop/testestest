package b.t;

import android.os.Build;
import android.view.ViewGroup;

public class s {
  public static boolean a = true;
  
  public static void a(ViewGroup paramViewGroup, boolean paramBoolean) {
    if (Build.VERSION.SDK_INT >= 29) {
      paramViewGroup.suppressLayout(paramBoolean);
    } else if (a) {
      try {
        paramViewGroup.suppressLayout(paramBoolean);
      } catch (NoSuchMethodError noSuchMethodError) {
        a = false;
      } 
    } 
  }
}


/* Location:              C:\Users\panch\Downloads\dvba_v1.1.0-dex2jar.jar!\b\t\s.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */