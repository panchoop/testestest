package b.i.d;

import android.app.Activity;
import android.os.Build;
import b.i.e.a;

public class a extends a {
  public static void f(Activity paramActivity) {
    paramActivity.finishAffinity();
  }
  
  public static a g() {
    return null;
  }
  
  public static void h(Activity paramActivity) {
    if (Build.VERSION.SDK_INT >= 28 || !b.b(paramActivity))
      paramActivity.recreate(); 
  }
  
  public static interface a {}
}


/* Location:              C:\Users\panch\Downloads\dvba_v1.1.0-dex2jar.jar!\b\i\d\a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */