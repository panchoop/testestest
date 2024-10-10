package b.t;

import android.annotation.SuppressLint;
import android.view.View;

public class w extends b0 {
  public static boolean e = true;
  
  public void a(View paramView) {}
  
  @SuppressLint({"NewApi"})
  public float b(View paramView) {
    if (e)
      try {
        return paramView.getTransitionAlpha();
      } catch (NoSuchMethodError noSuchMethodError) {
        e = false;
      }  
    return paramView.getAlpha();
  }
  
  public void c(View paramView) {}
  
  @SuppressLint({"NewApi"})
  public void e(View paramView, float paramFloat) {
    if (e)
      try {
        paramView.setTransitionAlpha(paramFloat);
        return;
      } catch (NoSuchMethodError noSuchMethodError) {
        e = false;
      }  
    paramView.setAlpha(paramFloat);
  }
}


/* Location:              C:\Users\panch\Downloads\dvba_v1.1.0-dex2jar.jar!\b\t\w.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */