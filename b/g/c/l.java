package b.g.c;

import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewParent;
import androidx.constraintlayout.widget.ConstraintLayout;

public abstract class l extends c {
  public boolean i;
  
  public boolean j;
  
  public void e(AttributeSet paramAttributeSet) {
    super.e(paramAttributeSet);
    if (paramAttributeSet != null) {
      TypedArray typedArray = getContext().obtainStyledAttributes(paramAttributeSet, k.ConstraintLayout_Layout);
      int i = typedArray.getIndexCount();
      for (byte b = 0; b < i; b++) {
        int j = typedArray.getIndex(b);
        if (j == k.ConstraintLayout_Layout_android_visibility) {
          this.i = true;
        } else if (j == k.ConstraintLayout_Layout_android_elevation) {
          this.j = true;
        } 
      } 
    } 
  }
  
  public void j() {}
  
  public void onAttachedToWindow() {
    super.onAttachedToWindow();
    if (this.i || this.j) {
      ViewParent viewParent = getParent();
      if (viewParent != null && viewParent instanceof ConstraintLayout) {
        ConstraintLayout constraintLayout = (ConstraintLayout)viewParent;
        int i = getVisibility();
        float f = getElevation();
        for (byte b = 0; b < this.c; b++) {
          View view = constraintLayout.d(this.b[b]);
          if (view != null) {
            if (this.i)
              view.setVisibility(i); 
            if (this.j && f > 0.0F)
              view.setTranslationZ(view.getTranslationZ() + f); 
          } 
        } 
      } 
    } 
  }
  
  public void setElevation(float paramFloat) {
    super.setElevation(paramFloat);
    c();
  }
  
  public void setVisibility(int paramInt) {
    super.setVisibility(paramInt);
    c();
  }
}


/* Location:              C:\Users\panch\Downloads\dvba_v1.1.0-dex2jar.jar!\b\g\c\l.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */