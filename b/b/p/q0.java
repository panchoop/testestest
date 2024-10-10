package b.b.p;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.view.animation.DecelerateInterpolator;
import android.widget.AdapterView;
import android.widget.HorizontalScrollView;
import android.widget.LinearLayout;
import b.b.b;
import b.b.d;
import b.b.j;

public class q0 extends HorizontalScrollView implements AdapterView.OnItemSelectedListener {
  public Runnable b;
  
  public boolean c;
  
  public int d;
  
  public int e;
  
  public int f;
  
  public int g;
  
  static {
    new DecelerateInterpolator();
  }
  
  public void onAttachedToWindow() {
    super.onAttachedToWindow();
    Runnable runnable = this.b;
    if (runnable != null)
      post(runnable); 
  }
  
  public void onConfigurationChanged(Configuration paramConfiguration) {
    super.onConfigurationChanged(paramConfiguration);
    Context context = getContext();
    TypedArray typedArray = context.obtainStyledAttributes(null, j.ActionBar, b.b.a.actionBarStyle, 0);
    int j = typedArray.getLayoutDimension(j.ActionBar_height, 0);
    Resources resources = context.getResources();
    int i = j;
    if (!context.getResources().getBoolean(b.abc_action_bar_embed_tabs))
      i = Math.min(j, resources.getDimensionPixelSize(d.abc_action_bar_stacked_max_height)); 
    typedArray.recycle();
    setContentHeight(i);
    this.e = context.getResources().getDimensionPixelSize(d.abc_action_bar_stacked_tab_max_width);
  }
  
  public void onDetachedFromWindow() {
    super.onDetachedFromWindow();
    Runnable runnable = this.b;
    if (runnable != null)
      removeCallbacks(runnable); 
  }
  
  public void onItemSelected(AdapterView<?> paramAdapterView, View paramView, int paramInt, long paramLong) {
    ((a)paramView).b.a();
  }
  
  public void onMeasure(int paramInt1, int paramInt2) {
    boolean bool;
    if (View.MeasureSpec.getMode(paramInt1) == 1073741824) {
      bool = true;
    } else {
      bool = false;
    } 
    setFillViewport(bool);
    throw null;
  }
  
  public void onNothingSelected(AdapterView<?> paramAdapterView) {}
  
  public void setAllowCollapse(boolean paramBoolean) {
    this.c = paramBoolean;
  }
  
  public void setContentHeight(int paramInt) {
    this.f = paramInt;
    requestLayout();
  }
  
  public void setTabSelected(int paramInt) {
    this.g = paramInt;
    throw null;
  }
  
  public class a extends LinearLayout {
    public b.b.k.a.c b;
    
    public final q0 c;
    
    public void onInitializeAccessibilityEvent(AccessibilityEvent param1AccessibilityEvent) {
      super.onInitializeAccessibilityEvent(param1AccessibilityEvent);
      param1AccessibilityEvent.setClassName("androidx.appcompat.app.ActionBar$Tab");
    }
    
    public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo param1AccessibilityNodeInfo) {
      super.onInitializeAccessibilityNodeInfo(param1AccessibilityNodeInfo);
      param1AccessibilityNodeInfo.setClassName("androidx.appcompat.app.ActionBar$Tab");
    }
    
    public void onMeasure(int param1Int1, int param1Int2) {
      super.onMeasure(param1Int1, param1Int2);
      if (this.c.d > 0) {
        int i = getMeasuredWidth();
        param1Int1 = this.c.d;
        if (i > param1Int1)
          super.onMeasure(View.MeasureSpec.makeMeasureSpec(param1Int1, 1073741824), param1Int2); 
      } 
    }
    
    public void setSelected(boolean param1Boolean) {
      boolean bool;
      if (isSelected() != param1Boolean) {
        bool = true;
      } else {
        bool = false;
      } 
      super.setSelected(param1Boolean);
      if (bool && param1Boolean)
        sendAccessibilityEvent(4); 
    }
  }
}


/* Location:              C:\Users\panch\Downloads\dvba_v1.1.0-dex2jar.jar!\b\b\p\q0.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */