package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import android.widget.LinearLayout;
import b.b.f;
import b.b.j;
import b.i.m.l;

public class ButtonBarLayout extends LinearLayout {
  public boolean b;
  
  public int c = -1;
  
  public int d = 0;
  
  public ButtonBarLayout(Context paramContext, AttributeSet paramAttributeSet) {
    super(paramContext, paramAttributeSet);
    TypedArray typedArray = paramContext.obtainStyledAttributes(paramAttributeSet, j.ButtonBarLayout);
    l.V((View)this, paramContext, j.ButtonBarLayout, paramAttributeSet, typedArray, 0, 0);
    this.b = typedArray.getBoolean(j.ButtonBarLayout_allowStacking, true);
    typedArray.recycle();
  }
  
  private void setStacked(boolean paramBoolean) {
    byte b;
    setOrientation(paramBoolean);
    if (paramBoolean) {
      b = 5;
    } else {
      b = 80;
    } 
    setGravity(b);
    View view = findViewById(f.spacer);
    if (view != null) {
      byte b1;
      if (paramBoolean) {
        b1 = 8;
      } else {
        b1 = 4;
      } 
      view.setVisibility(b1);
    } 
    for (int i = getChildCount() - 2; i >= 0; i--)
      bringChildToFront(getChildAt(i)); 
  }
  
  public final int a(int paramInt) {
    int i = getChildCount();
    while (paramInt < i) {
      if (getChildAt(paramInt).getVisibility() == 0)
        return paramInt; 
      paramInt++;
    } 
    return -1;
  }
  
  public final boolean b() {
    int i = getOrientation();
    boolean bool = true;
    if (i != 1)
      bool = false; 
    return bool;
  }
  
  public int getMinimumHeight() {
    return Math.max(this.d, super.getMinimumHeight());
  }
  
  public void onMeasure(int paramInt1, int paramInt2) {
    int j;
    int i = View.MeasureSpec.getSize(paramInt1);
    boolean bool1 = this.b;
    boolean bool = false;
    if (bool1) {
      if (i > this.c && b())
        setStacked(false); 
      this.c = i;
    } 
    if (!b() && View.MeasureSpec.getMode(paramInt1) == 1073741824) {
      j = View.MeasureSpec.makeMeasureSpec(i, -2147483648);
      i = 1;
    } else {
      j = paramInt1;
      i = 0;
    } 
    super.onMeasure(j, paramInt2);
    int k = i;
    if (this.b) {
      k = i;
      if (!b()) {
        if ((getMeasuredWidthAndState() & 0xFF000000) == 16777216) {
          j = 1;
        } else {
          j = 0;
        } 
        k = i;
        if (j != 0) {
          setStacked(true);
          k = 1;
        } 
      } 
    } 
    if (k != 0)
      super.onMeasure(paramInt1, paramInt2); 
    paramInt2 = a(0);
    paramInt1 = bool;
    if (paramInt2 >= 0) {
      View view = getChildAt(paramInt2);
      LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams)view.getLayoutParams();
      paramInt1 = getPaddingTop();
      paramInt1 = view.getMeasuredHeight() + paramInt1 + layoutParams.topMargin + layoutParams.bottomMargin + 0;
      if (b()) {
        paramInt2 = a(paramInt2 + 1);
        if (paramInt2 >= 0)
          paramInt1 = getChildAt(paramInt2).getPaddingTop() + (int)((getResources().getDisplayMetrics()).density * 16.0F) + paramInt1; 
      } else {
        paramInt1 = getPaddingBottom() + paramInt1;
      } 
    } 
    if (l.s((View)this) != paramInt1)
      setMinimumHeight(paramInt1); 
  }
  
  public void setAllowStacking(boolean paramBoolean) {
    if (this.b != paramBoolean) {
      this.b = paramBoolean;
      if (!paramBoolean && getOrientation() == 1)
        setStacked(false); 
      requestLayout();
    } 
  }
}


/* Location:              C:\Users\panch\Downloads\dvba_v1.1.0-dex2jar.jar!\androidx\appcompat\widget\ButtonBarLayout.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */