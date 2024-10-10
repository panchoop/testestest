package b.t;

import android.graphics.Matrix;
import android.view.View;

public class a0 extends z {
  public float b(View paramView) {
    return paramView.getTransitionAlpha();
  }
  
  public void d(View paramView, int paramInt1, int paramInt2, int paramInt3, int paramInt4) {
    paramView.setLeftTopRightBottom(paramInt1, paramInt2, paramInt3, paramInt4);
  }
  
  public void e(View paramView, float paramFloat) {
    paramView.setTransitionAlpha(paramFloat);
  }
  
  public void f(View paramView, int paramInt) {
    paramView.setTransitionVisibility(paramInt);
  }
  
  public void g(View paramView, Matrix paramMatrix) {
    paramView.transformMatrixToGlobal(paramMatrix);
  }
  
  public void h(View paramView, Matrix paramMatrix) {
    paramView.transformMatrixToLocal(paramMatrix);
  }
}


/* Location:              C:\Users\panch\Downloads\dvba_v1.1.0-dex2jar.jar!\b\t\a0.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */