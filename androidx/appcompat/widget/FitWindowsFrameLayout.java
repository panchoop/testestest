package androidx.appcompat.widget;

import android.content.Context;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.widget.FrameLayout;
import b.b.k.m;
import b.b.p.g0;

public class FitWindowsFrameLayout extends FrameLayout {
  public g0 b;
  
  public FitWindowsFrameLayout(Context paramContext, AttributeSet paramAttributeSet) {
    super(paramContext, paramAttributeSet);
  }
  
  public boolean fitSystemWindows(Rect paramRect) {
    g0 g01 = this.b;
    if (g01 != null)
      paramRect.top = ((m)g01).a.N(null, paramRect); 
    return super.fitSystemWindows(paramRect);
  }
  
  public void setOnFitSystemWindowsListener(g0 paramg0) {
    this.b = paramg0;
  }
}


/* Location:              C:\Users\panch\Downloads\dvba_v1.1.0-dex2jar.jar!\androidx\appcompat\widget\FitWindowsFrameLayout.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */