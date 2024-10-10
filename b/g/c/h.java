package b.g.c;

import android.content.Context;
import android.graphics.Canvas;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;

public class h extends View {
  public h(Context paramContext) {
    super(paramContext);
    super.setVisibility(8);
  }
  
  public void draw(Canvas paramCanvas) {}
  
  public void onMeasure(int paramInt1, int paramInt2) {
    setMeasuredDimension(0, 0);
  }
  
  public void setGuidelineBegin(int paramInt) {
    ConstraintLayout.a a = (ConstraintLayout.a)getLayoutParams();
    a.a = paramInt;
    setLayoutParams((ViewGroup.LayoutParams)a);
  }
  
  public void setGuidelineEnd(int paramInt) {
    ConstraintLayout.a a = (ConstraintLayout.a)getLayoutParams();
    a.b = paramInt;
    setLayoutParams((ViewGroup.LayoutParams)a);
  }
  
  public void setGuidelinePercent(float paramFloat) {
    ConstraintLayout.a a = (ConstraintLayout.a)getLayoutParams();
    a.c = paramFloat;
    setLayoutParams((ViewGroup.LayoutParams)a);
  }
  
  public void setVisibility(int paramInt) {}
}


/* Location:              C:\Users\panch\Downloads\dvba_v1.1.0-dex2jar.jar!\b\g\c\h.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */