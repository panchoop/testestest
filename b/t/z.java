package b.t;

import android.annotation.SuppressLint;
import android.os.Build;
import android.view.View;

public class z extends y {
  public static boolean i = true;
  
  @SuppressLint({"NewApi"})
  public void f(View paramView, int paramInt) {
    if (Build.VERSION.SDK_INT == 28) {
      super.f(paramView, paramInt);
    } else if (i) {
      try {
        paramView.setTransitionVisibility(paramInt);
      } catch (NoSuchMethodError noSuchMethodError) {
        i = false;
      } 
    } 
  }
}


/* Location:              C:\Users\panch\Downloads\dvba_v1.1.0-dex2jar.jar!\b\t\z.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */