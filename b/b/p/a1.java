package b.b.p;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.Resources;
import android.graphics.Rect;
import android.util.DisplayMetrics;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.view.accessibility.AccessibilityManager;
import b.b.d;
import b.i.m.l;
import b.i.m.p;

public class a1 implements View.OnLongClickListener, View.OnHoverListener, View.OnAttachStateChangeListener {
  public static a1 k;
  
  public static a1 l;
  
  public final View b;
  
  public final CharSequence c;
  
  public final int d;
  
  public final Runnable e = new a(this);
  
  public final Runnable f = new b(this);
  
  public int g;
  
  public int h;
  
  public b1 i;
  
  public boolean j;
  
  public a1(View paramView, CharSequence paramCharSequence) {
    this.b = paramView;
    this.c = paramCharSequence;
    this.d = p.c(ViewConfiguration.get(paramView.getContext()));
    a();
    this.b.setOnLongClickListener(this);
    this.b.setOnHoverListener(this);
  }
  
  public static void c(a1 parama1) {
    a1 a11 = k;
    if (a11 != null)
      a11.b.removeCallbacks(a11.e); 
    k = parama1;
    if (parama1 != null)
      parama1.b.postDelayed(parama1.e, ViewConfiguration.getLongPressTimeout()); 
  }
  
  public final void a() {
    this.g = Integer.MAX_VALUE;
    this.h = Integer.MAX_VALUE;
  }
  
  public void b() {
    if (l == this) {
      l = null;
      b1 b11 = this.i;
      if (b11 != null) {
        b11.a();
        this.i = null;
        a();
        this.b.removeOnAttachStateChangeListener(this);
      } else {
        Log.e("TooltipCompatHandler", "sActiveHandler.mPopup == null");
      } 
    } 
    if (k == this)
      c(null); 
    this.b.removeCallbacks(this.f);
  }
  
  public void d(boolean paramBoolean) {
    int i;
    long l;
    View view1;
    if (!l.D(this.b))
      return; 
    c(null);
    a1 a11 = l;
    if (a11 != null)
      a11.b(); 
    l = this;
    this.j = paramBoolean;
    b1 b11 = new b1(this.b.getContext());
    this.i = b11;
    View view3 = this.b;
    int j = this.g;
    int k = this.h;
    paramBoolean = this.j;
    CharSequence charSequence = this.c;
    if (b11.b.getParent() != null) {
      i = 1;
    } else {
      i = 0;
    } 
    if (i)
      b11.a(); 
    b11.c.setText(charSequence);
    WindowManager.LayoutParams layoutParams1 = b11.d;
    layoutParams1.token = view3.getApplicationWindowToken();
    int m = b11.a.getResources().getDimensionPixelOffset(d.tooltip_precise_anchor_threshold);
    if (view3.getWidth() >= m) {
      i = j;
    } else {
      i = view3.getWidth() / 2;
    } 
    if (view3.getHeight() >= m) {
      m = b11.a.getResources().getDimensionPixelOffset(d.tooltip_precise_anchor_extra_offset);
      j = k + m;
      k -= m;
    } else {
      j = view3.getHeight();
      k = 0;
    } 
    layoutParams1.gravity = 49;
    Resources resources = b11.a.getResources();
    if (paramBoolean) {
      m = d.tooltip_y_offset_touch;
    } else {
      m = d.tooltip_y_offset_non_touch;
    } 
    int n = resources.getDimensionPixelOffset(m);
    View view2 = view3.getRootView();
    ViewGroup.LayoutParams layoutParams = view2.getLayoutParams();
    if (layoutParams instanceof WindowManager.LayoutParams && ((WindowManager.LayoutParams)layoutParams).type == 2) {
      view1 = view2;
    } else {
      Context context = view3.getContext();
      while (true) {
        view1 = view2;
        if (context instanceof ContextWrapper) {
          if (context instanceof Activity) {
            view1 = ((Activity)context).getWindow().getDecorView();
            break;
          } 
          context = ((ContextWrapper)context).getBaseContext();
          continue;
        } 
        break;
      } 
    } 
    if (view1 == null) {
      Log.e("TooltipPopup", "Cannot find app view");
    } else {
      view1.getWindowVisibleDisplayFrame(b11.e);
      Rect rect = b11.e;
      if (rect.left < 0 && rect.top < 0) {
        Resources resources1 = b11.a.getResources();
        m = resources1.getIdentifier("status_bar_height", "dimen", "android");
        if (m != 0) {
          m = resources1.getDimensionPixelSize(m);
        } else {
          m = 0;
        } 
        DisplayMetrics displayMetrics = resources1.getDisplayMetrics();
        b11.e.set(0, m, displayMetrics.widthPixels, displayMetrics.heightPixels);
      } 
      view1.getLocationOnScreen(b11.g);
      view3.getLocationOnScreen(b11.f);
      int[] arrayOfInt3 = b11.f;
      m = arrayOfInt3[0];
      int[] arrayOfInt2 = b11.g;
      arrayOfInt3[0] = m - arrayOfInt2[0];
      arrayOfInt3[1] = arrayOfInt3[1] - arrayOfInt2[1];
      layoutParams1.x = arrayOfInt3[0] + i - view1.getWidth() / 2;
      i = View.MeasureSpec.makeMeasureSpec(0, 0);
      b11.b.measure(i, i);
      i = b11.b.getMeasuredHeight();
      int[] arrayOfInt1 = b11.f;
      k = arrayOfInt1[1] + k - n - i;
      j = arrayOfInt1[1] + j + n;
      if (paramBoolean ? (k >= 0) : (i + j > b11.e.height())) {
        layoutParams1.y = k;
      } else {
        layoutParams1.y = j;
      } 
    } 
    ((WindowManager)b11.a.getSystemService("window")).addView(b11.b, (ViewGroup.LayoutParams)b11.d);
    this.b.addOnAttachStateChangeListener(this);
    if (this.j) {
      l = 2500L;
    } else {
      if ((this.b.getWindowSystemUiVisibility() & 0x1) == 1) {
        l = 3000L;
      } else {
        l = 15000L;
      } 
      l -= ViewConfiguration.getLongPressTimeout();
    } 
    this.b.removeCallbacks(this.f);
    this.b.postDelayed(this.f, l);
  }
  
  public boolean onHover(View paramView, MotionEvent paramMotionEvent) {
    if (this.i != null && this.j)
      return false; 
    AccessibilityManager accessibilityManager = (AccessibilityManager)this.b.getContext().getSystemService("accessibility");
    if (accessibilityManager.isEnabled() && accessibilityManager.isTouchExplorationEnabled())
      return false; 
    int i = paramMotionEvent.getAction();
    if (i != 7) {
      if (i == 10) {
        a();
        b();
      } 
    } else if (this.b.isEnabled() && this.i == null) {
      int j = (int)paramMotionEvent.getX();
      i = (int)paramMotionEvent.getY();
      if (Math.abs(j - this.g) <= this.d && Math.abs(i - this.h) <= this.d) {
        i = 0;
      } else {
        this.g = j;
        this.h = i;
        i = 1;
      } 
      if (i != 0)
        c(this); 
    } 
    return false;
  }
  
  public boolean onLongClick(View paramView) {
    this.g = paramView.getWidth() / 2;
    this.h = paramView.getHeight() / 2;
    d(true);
    return true;
  }
  
  public void onViewAttachedToWindow(View paramView) {}
  
  public void onViewDetachedFromWindow(View paramView) {
    b();
  }
  
  public class a implements Runnable {
    public final a1 b;
    
    public a(a1 this$0) {}
    
    public void run() {
      this.b.d(false);
    }
  }
  
  public class b implements Runnable {
    public final a1 b;
    
    public b(a1 this$0) {}
    
    public void run() {
      this.b.b();
    }
  }
}


/* Location:              C:\Users\panch\Downloads\dvba_v1.1.0-dex2jar.jar!\b\b\p\a1.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */