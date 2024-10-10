package com.google.android.material.snackbar;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import c.c.a.b.e0.d;

public final class Snackbar$SnackbarLayout extends d {
  public Snackbar$SnackbarLayout(Context paramContext, AttributeSet paramAttributeSet) {
    super(paramContext, paramAttributeSet);
  }
  
  public void onMeasure(int paramInt1, int paramInt2) {
    super.onMeasure(paramInt1, paramInt2);
    int j = getChildCount();
    int k = getMeasuredWidth();
    int i = getPaddingLeft();
    paramInt2 = getPaddingRight();
    for (paramInt1 = 0; paramInt1 < j; paramInt1++) {
      View view = getChildAt(paramInt1);
      if ((view.getLayoutParams()).width == -1)
        view.measure(View.MeasureSpec.makeMeasureSpec(k - i - paramInt2, 1073741824), View.MeasureSpec.makeMeasureSpec(view.getMeasuredHeight(), 1073741824)); 
    } 
  }
}


/* Location:              C:\Users\panch\Downloads\dvba_v1.1.0-dex2jar.jar!\com\google\android\material\snackbar\Snackbar$SnackbarLayout.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */