package com.google.android.material.transformation;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewParent;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import b.i.m.l;
import java.util.HashMap;
import java.util.Map;

public class FabTransformationSheetBehavior extends FabTransformationBehavior {
  public Map<View, Integer> i;
  
  public FabTransformationSheetBehavior() {}
  
  public FabTransformationSheetBehavior(Context paramContext, AttributeSet paramAttributeSet) {
    super(paramContext, paramAttributeSet);
  }
  
  public boolean C(View paramView1, View paramView2, boolean paramBoolean1, boolean paramBoolean2) {
    ViewParent viewParent = paramView2.getParent();
    if (viewParent instanceof CoordinatorLayout) {
      CoordinatorLayout coordinatorLayout = (CoordinatorLayout)viewParent;
      int i = coordinatorLayout.getChildCount();
      if (paramBoolean1)
        this.i = new HashMap<View, Integer>(i); 
      for (byte b = 0; b < i; b++) {
        int j;
        View view = coordinatorLayout.getChildAt(b);
        if (view.getLayoutParams() instanceof CoordinatorLayout.f && ((CoordinatorLayout.f)view.getLayoutParams()).a instanceof FabTransformationScrimBehavior) {
          j = 1;
        } else {
          j = 0;
        } 
        if (view == paramView2 || j)
          continue; 
        Map<View, Integer> map = this.i;
        if (!paramBoolean1) {
          if (map != null && map.containsKey(view)) {
            j = ((Integer)this.i.get(view)).intValue();
          } else {
            continue;
          } 
        } else {
          map.put(view, Integer.valueOf(view.getImportantForAccessibility()));
          j = 4;
        } 
        l.d0(view, j);
        continue;
      } 
      if (!paramBoolean1)
        this.i = null; 
    } 
    super.C(paramView1, paramView2, paramBoolean1, paramBoolean2);
    return true;
  }
}


/* Location:              C:\Users\panch\Downloads\dvba_v1.1.0-dex2jar.jar!\com\google\android\material\transformation\FabTransformationSheetBehavior.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */