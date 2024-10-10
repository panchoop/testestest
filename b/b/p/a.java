package b.b.p;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.ContextThemeWrapper;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.widget.ActionMenuView;
import b.b.j;
import b.b.o.i.g;
import b.i.m.l;
import b.i.m.q;
import b.i.m.r;

public abstract class a extends ViewGroup {
  public final a b = new a(this);
  
  public final Context c;
  
  public ActionMenuView d;
  
  public c e;
  
  public int f;
  
  public q g;
  
  public boolean h;
  
  public boolean i;
  
  public a(Context paramContext, AttributeSet paramAttributeSet) {
    this(paramContext, paramAttributeSet, 0);
  }
  
  public a(Context paramContext, AttributeSet paramAttributeSet, int paramInt) {
    super(paramContext, paramAttributeSet, paramInt);
    TypedValue typedValue = new TypedValue();
    if (paramContext.getTheme().resolveAttribute(b.b.a.actionBarPopupTheme, typedValue, true) && typedValue.resourceId != 0) {
      this.c = (Context)new ContextThemeWrapper(paramContext, typedValue.resourceId);
    } else {
      this.c = paramContext;
    } 
  }
  
  public int c(View paramView, int paramInt1, int paramInt2, int paramInt3) {
    paramView.measure(View.MeasureSpec.makeMeasureSpec(paramInt1, -2147483648), paramInt2);
    return Math.max(0, paramInt1 - paramView.getMeasuredWidth() - paramInt3);
  }
  
  public int d(View paramView, int paramInt1, int paramInt2, int paramInt3, boolean paramBoolean) {
    int i = paramView.getMeasuredWidth();
    int j = paramView.getMeasuredHeight();
    paramInt2 = (paramInt3 - j) / 2 + paramInt2;
    if (paramBoolean) {
      paramView.layout(paramInt1 - i, paramInt2, paramInt1, j + paramInt2);
    } else {
      paramView.layout(paramInt1, paramInt2, paramInt1 + i, j + paramInt2);
    } 
    paramInt1 = i;
    if (paramBoolean)
      paramInt1 = -i; 
    return paramInt1;
  }
  
  public q e(int paramInt, long paramLong) {
    q q1 = this.g;
    if (q1 != null)
      q1.b(); 
    if (paramInt == 0) {
      if (getVisibility() != 0)
        setAlpha(0.0F); 
      q q2 = l.a((View)this);
      q2.a(1.0F);
      q2.c(paramLong);
      a a2 = this.b;
      a2.c.g = q2;
      a2.b = paramInt;
      View view1 = q2.a.get();
      if (view1 != null)
        q2.e(view1, a2); 
      return q2;
    } 
    q1 = l.a((View)this);
    q1.a(0.0F);
    q1.c(paramLong);
    a a1 = this.b;
    a1.c.g = q1;
    a1.b = paramInt;
    View view = q1.a.get();
    if (view != null)
      q1.e(view, a1); 
    return q1;
  }
  
  public int getAnimatedVisibility() {
    return (this.g != null) ? this.b.b : getVisibility();
  }
  
  public int getContentHeight() {
    return this.f;
  }
  
  public void onConfigurationChanged(Configuration paramConfiguration) {
    super.onConfigurationChanged(paramConfiguration);
    TypedArray typedArray = getContext().obtainStyledAttributes(null, j.ActionBar, b.b.a.actionBarStyle, 0);
    setContentHeight(typedArray.getLayoutDimension(j.ActionBar_height, 0));
    typedArray.recycle();
    c c1 = this.e;
    if (c1 != null) {
      Configuration configuration = c1.c.getResources().getConfiguration();
      int i = configuration.screenWidthDp;
      int j = configuration.screenHeightDp;
      if (configuration.smallestScreenWidthDp > 600 || i > 600 || (i > 960 && j > 720) || (i > 720 && j > 960)) {
        i = 5;
      } else if (i >= 500 || (i > 640 && j > 480) || (i > 480 && j > 640)) {
        i = 4;
      } else if (i >= 360) {
        i = 3;
      } else {
        i = 2;
      } 
      c1.q = i;
      g g = c1.d;
      if (g != null)
        g.q(true); 
    } 
  }
  
  public boolean onHoverEvent(MotionEvent paramMotionEvent) {
    int i = paramMotionEvent.getActionMasked();
    if (i == 9)
      this.i = false; 
    if (!this.i) {
      boolean bool = super.onHoverEvent(paramMotionEvent);
      if (i == 9 && !bool)
        this.i = true; 
    } 
    if (i == 10 || i == 3)
      this.i = false; 
    return true;
  }
  
  public boolean onTouchEvent(MotionEvent paramMotionEvent) {
    int i = paramMotionEvent.getActionMasked();
    if (i == 0)
      this.h = false; 
    if (!this.h) {
      boolean bool = super.onTouchEvent(paramMotionEvent);
      if (i == 0 && !bool)
        this.h = true; 
    } 
    if (i == 1 || i == 3)
      this.h = false; 
    return true;
  }
  
  public abstract void setContentHeight(int paramInt);
  
  public void setVisibility(int paramInt) {
    if (paramInt != getVisibility()) {
      q q1 = this.g;
      if (q1 != null)
        q1.b(); 
      super.setVisibility(paramInt);
    } 
  }
  
  public class a implements r {
    public boolean a = false;
    
    public int b;
    
    public final a c;
    
    public a(a this$0) {}
    
    public void a(View param1View) {
      if (this.a)
        return; 
      a a1 = this.c;
      a1.g = null;
      a.b(a1, this.b);
    }
    
    public void b(View param1View) {
      a.a(this.c, 0);
      this.a = false;
    }
    
    public void c(View param1View) {
      this.a = true;
    }
  }
}


/* Location:              C:\Users\panch\Downloads\dvba_v1.1.0-dex2jar.jar!\b\b\p\a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */