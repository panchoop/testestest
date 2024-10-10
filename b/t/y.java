package b.t;

import android.annotation.SuppressLint;
import android.view.View;

public class y extends x {
  public static boolean h = true;
  
  @SuppressLint({"NewApi"})
  public void d(View paramView, int paramInt1, int paramInt2, int paramInt3, int paramInt4) {
    if (h)
      try {
        paramView.setLeftTopRightBottom(paramInt1, paramInt2, paramInt3, paramInt4);
      } catch (NoSuchMethodError noSuchMethodError) {
        h = false;
      }  
  }
}


/* Location:              C:\Users\panch\Downloads\dvba_v1.1.0-dex2jar.jar!\b\t\y.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */