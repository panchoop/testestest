package b.t;

import android.annotation.SuppressLint;
import android.graphics.Matrix;
import android.view.View;

public class x extends w {
  public static boolean f = true;
  
  public static boolean g = true;
  
  @SuppressLint({"NewApi"})
  public void g(View paramView, Matrix paramMatrix) {
    if (f)
      try {
        paramView.transformMatrixToGlobal(paramMatrix);
      } catch (NoSuchMethodError noSuchMethodError) {
        f = false;
      }  
  }
  
  @SuppressLint({"NewApi"})
  public void h(View paramView, Matrix paramMatrix) {
    if (g)
      try {
        paramView.transformMatrixToLocal(paramMatrix);
      } catch (NoSuchMethodError noSuchMethodError) {
        g = false;
      }  
  }
}


/* Location:              C:\Users\panch\Downloads\dvba_v1.1.0-dex2jar.jar!\b\t\x.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */