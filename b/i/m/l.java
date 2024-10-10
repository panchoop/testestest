package b.i.m;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Bundle;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseArray;
import android.view.Display;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.WindowInsets;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityManager;
import b.i.m.v.b;
import b.i.m.v.d;
import java.lang.ref.WeakReference;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.WeakHashMap;
import java.util.concurrent.atomic.AtomicInteger;

public class l {
  public static WeakHashMap<View, q> a = null;
  
  public static Field b;
  
  public static boolean c = false;
  
  public static ThreadLocal<Rect> d;
  
  static {
    new WeakHashMap<Object, Object>();
  }
  
  public static boolean A(View paramView) {
    return paramView.hasOnClickListeners();
  }
  
  public static boolean B(View paramView) {
    return paramView.hasOverlappingRendering();
  }
  
  public static boolean C(View paramView) {
    return paramView.hasTransientState();
  }
  
  public static boolean D(View paramView) {
    return paramView.isAttachedToWindow();
  }
  
  public static boolean E(View paramView) {
    return paramView.isLaidOut();
  }
  
  public static boolean F(View paramView) {
    return paramView.isNestedScrollingEnabled();
  }
  
  public static boolean G(View paramView) {
    return paramView.isPaddingRelative();
  }
  
  public static boolean H(View paramView) {
    boolean bool1;
    Boolean bool = (new m(b.i.b.tag_screen_reader_focusable, Boolean.class, 28)).d(paramView);
    if (bool == null) {
      bool1 = false;
    } else {
      bool1 = bool.booleanValue();
    } 
    return bool1;
  }
  
  public static void I(View paramView, int paramInt) {
    char c;
    if (!((AccessibilityManager)paramView.getContext().getSystemService("accessibility")).isEnabled())
      return; 
    if ((CharSequence)(new n(b.i.b.tag_accessibility_pane_title, CharSequence.class, 8, 28)).d(paramView) != null) {
      c = '\001';
    } else {
      c = Character.MIN_VALUE;
    } 
    if (paramView.getAccessibilityLiveRegion() != 0 || (c && paramView.getVisibility() == 0)) {
      AccessibilityEvent accessibilityEvent = AccessibilityEvent.obtain();
      if (c) {
        c = ' ';
      } else {
        c = 'ࠀ';
      } 
      accessibilityEvent.setEventType(c);
      accessibilityEvent.setContentChangeTypes(paramInt);
      paramView.sendAccessibilityEventUnchecked(accessibilityEvent);
      return;
    } 
    if (paramView.getParent() != null)
      try {
        paramView.getParent().notifySubtreeAccessibilityStateChanged(paramView, paramView, paramInt);
      } catch (AbstractMethodError abstractMethodError) {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(paramView.getParent().getClass().getSimpleName());
        stringBuilder.append(" does not fully implement ViewParent");
        Log.e("ViewCompat", stringBuilder.toString(), abstractMethodError);
      }  
  }
  
  public static void J(View paramView, int paramInt) {
    if (Build.VERSION.SDK_INT >= 23) {
      paramView.offsetLeftAndRight(paramInt);
    } else {
      Rect rect = n();
      int i = 0;
      ViewParent viewParent = paramView.getParent();
      if (viewParent instanceof View) {
        View view = (View)viewParent;
        rect.set(view.getLeft(), view.getTop(), view.getRight(), view.getBottom());
        i = rect.intersects(paramView.getLeft(), paramView.getTop(), paramView.getRight(), paramView.getBottom()) ^ true;
      } 
      b(paramView, paramInt);
      if (i != 0 && rect.intersect(paramView.getLeft(), paramView.getTop(), paramView.getRight(), paramView.getBottom()))
        ((View)viewParent).invalidate(rect); 
    } 
  }
  
  public static void K(View paramView, int paramInt) {
    if (Build.VERSION.SDK_INT >= 23) {
      paramView.offsetTopAndBottom(paramInt);
    } else {
      Rect rect = n();
      int i = 0;
      ViewParent viewParent = paramView.getParent();
      if (viewParent instanceof View) {
        View view = (View)viewParent;
        rect.set(view.getLeft(), view.getTop(), view.getRight(), view.getBottom());
        i = rect.intersects(paramView.getLeft(), paramView.getTop(), paramView.getRight(), paramView.getBottom()) ^ true;
      } 
      c(paramView, paramInt);
      if (i != 0 && rect.intersect(paramView.getLeft(), paramView.getTop(), paramView.getRight(), paramView.getBottom()))
        ((View)viewParent).invalidate(rect); 
    } 
  }
  
  public static u L(View paramView, u paramu) {
    WindowInsets windowInsets = paramu.g();
    u u1 = paramu;
    if (windowInsets != null) {
      WindowInsets windowInsets1 = paramView.onApplyWindowInsets(windowInsets);
      u1 = paramu;
      if (!windowInsets1.equals(windowInsets))
        u1 = new u(windowInsets1); 
    } 
    return u1;
  }
  
  public static void M(View paramView, b paramb) {
    paramView.onInitializeAccessibilityNodeInfo(paramb.a);
  }
  
  public static boolean N(View paramView, int paramInt, Bundle paramBundle) {
    return paramView.performAccessibilityAction(paramInt, paramBundle);
  }
  
  public static void O(View paramView) {
    paramView.postInvalidateOnAnimation();
  }
  
  public static void P(View paramView, Runnable paramRunnable) {
    paramView.postOnAnimation(paramRunnable);
  }
  
  public static void Q(View paramView, Runnable paramRunnable, long paramLong) {
    paramView.postOnAnimationDelayed(paramRunnable, paramLong);
  }
  
  public static void R(View paramView, int paramInt) {
    S(paramInt, paramView);
    I(paramView, 0);
  }
  
  public static void S(int paramInt, View paramView) {
    ArrayList<b.a> arrayList2 = (ArrayList)paramView.getTag(b.i.b.tag_accessibility_actions);
    ArrayList<b.a> arrayList1 = arrayList2;
    if (arrayList2 == null) {
      arrayList1 = new ArrayList();
      paramView.setTag(b.i.b.tag_accessibility_actions, arrayList1);
    } 
    for (byte b = 0; b < arrayList1.size(); b++) {
      if (((b.a)arrayList1.get(b)).a() == paramInt) {
        arrayList1.remove(b);
        break;
      } 
    } 
  }
  
  public static void T(View paramView, b.a parama, CharSequence paramCharSequence, d paramd) {
    b.a a3 = new b.a(null, parama.b, null, paramd, parama.c);
    a a2 = g(paramView);
    a a1 = a2;
    if (a2 == null)
      a1 = new a(); 
    W(paramView, a1);
    S(a3.a(), paramView);
    ArrayList<b.a> arrayList2 = (ArrayList)paramView.getTag(b.i.b.tag_accessibility_actions);
    ArrayList<b.a> arrayList1 = arrayList2;
    if (arrayList2 == null) {
      arrayList1 = new ArrayList();
      paramView.setTag(b.i.b.tag_accessibility_actions, arrayList1);
    } 
    arrayList1.add(a3);
    I(paramView, 0);
  }
  
  public static void U(View paramView) {
    paramView.requestApplyInsets();
  }
  
  public static void V(View paramView, @SuppressLint({"ContextFirst"}) Context paramContext, int[] paramArrayOfint, AttributeSet paramAttributeSet, TypedArray paramTypedArray, int paramInt1, int paramInt2) {
    if (Build.VERSION.SDK_INT >= 29)
      paramView.saveAttributeDataForStyleable(paramContext, paramArrayOfint, paramAttributeSet, paramTypedArray, paramInt1, paramInt2); 
  }
  
  public static void W(View paramView, a parama) {
    View.AccessibilityDelegate accessibilityDelegate;
    a a1 = parama;
    if (parama == null) {
      a1 = parama;
      if (h(paramView) instanceof a.a)
        a1 = new a(); 
    } 
    if (a1 == null) {
      parama = null;
    } else {
      accessibilityDelegate = a1.b;
    } 
    paramView.setAccessibilityDelegate(accessibilityDelegate);
  }
  
  public static void X(View paramView, boolean paramBoolean) {
    boolean bool;
    o o = new o(b.i.b.tag_accessibility_heading, Boolean.class, 28);
    Boolean bool1 = Boolean.valueOf(paramBoolean);
    if (Build.VERSION.SDK_INT >= o.c) {
      bool = true;
    } else {
      bool = false;
    } 
    if (bool) {
      o.c(paramView, bool1);
    } else if (o.e(o.d(paramView), bool1)) {
      a a2 = g(paramView);
      a a1 = a2;
      if (a2 == null)
        a1 = new a(); 
      W(paramView, a1);
      paramView.setTag(o.a, bool1);
      I(paramView, 0);
    } 
  }
  
  public static void Y(View paramView, int paramInt) {
    paramView.setAccessibilityLiveRegion(paramInt);
  }
  
  public static void Z(View paramView, Drawable paramDrawable) {
    paramView.setBackground(paramDrawable);
  }
  
  public static q a(View paramView) {
    if (a == null)
      a = new WeakHashMap<View, q>(); 
    q q2 = a.get(paramView);
    q q1 = q2;
    if (q2 == null) {
      q1 = new q(paramView);
      a.put(paramView, q1);
    } 
    return q1;
  }
  
  public static void a0(View paramView, Rect paramRect) {
    paramView.setClipBounds(paramRect);
  }
  
  public static void b(View paramView, int paramInt) {
    paramView.offsetLeftAndRight(paramInt);
    if (paramView.getVisibility() == 0) {
      float f = paramView.getTranslationY();
      paramView.setTranslationY(1.0F + f);
      paramView.setTranslationY(f);
      ViewParent viewParent = paramView.getParent();
      if (viewParent instanceof View)
        j0((View)viewParent); 
    } 
  }
  
  public static void b0(View paramView, float paramFloat) {
    paramView.setElevation(paramFloat);
  }
  
  public static void c(View paramView, int paramInt) {
    paramView.offsetTopAndBottom(paramInt);
    if (paramView.getVisibility() == 0) {
      float f = paramView.getTranslationY();
      paramView.setTranslationY(1.0F + f);
      paramView.setTranslationY(f);
      ViewParent viewParent = paramView.getParent();
      if (viewParent instanceof View)
        j0((View)viewParent); 
    } 
  }
  
  public static void c0(View paramView, boolean paramBoolean) {
    paramView.setHasTransientState(paramBoolean);
  }
  
  public static u d(View paramView, u paramu, Rect paramRect) {
    WindowInsets windowInsets = paramu.g();
    if (windowInsets != null) {
      paramu = u.h(paramView.computeSystemWindowInsets(windowInsets, paramRect));
    } else {
      paramRect.setEmpty();
    } 
    return paramu;
  }
  
  public static void d0(View paramView, int paramInt) {
    paramView.setImportantForAccessibility(paramInt);
  }
  
  public static boolean e(View paramView, KeyEvent paramKeyEvent) {
    int i = Build.VERSION.SDK_INT;
    boolean bool = false;
    if (i >= 28)
      return false; 
    d d = d.a(paramView);
    if (paramKeyEvent.getAction() == 0) {
      WeakHashMap<View, Boolean> weakHashMap = d.a;
      if (weakHashMap != null)
        weakHashMap.clear(); 
      if (!d.d.isEmpty())
        synchronized (d.d) {
          if (d.a == null) {
            weakHashMap = new WeakHashMap<View, Boolean>();
            this();
            d.a = weakHashMap;
          } 
          i = d.d.size();
          label44: while (true) {
            int j = i - 1;
            if (j >= 0) {
              View view = ((WeakReference<View>)d.d.get(j)).get();
              if (view == null) {
                d.d.remove(j);
                i = j;
                continue;
              } 
              d.a.put(view, Boolean.TRUE);
              ViewParent viewParent = view.getParent();
              while (true) {
                i = j;
                if (viewParent instanceof View) {
                  d.a.put((View)viewParent, Boolean.TRUE);
                  viewParent = viewParent.getParent();
                  continue;
                } 
                continue label44;
              } 
            } 
            break;
          } 
        }  
    } 
    paramView = d.b(paramView, paramKeyEvent);
    if (paramKeyEvent.getAction() == 0) {
      i = paramKeyEvent.getKeyCode();
      if (paramView != null && !KeyEvent.isModifierKey(i)) {
        if (d.b == null)
          d.b = new SparseArray(); 
        d.b.put(i, new WeakReference<View>(paramView));
      } 
    } 
    if (paramView != null)
      bool = true; 
    return bool;
  }
  
  public static void e0(View paramView, j paramj) {
    if (paramj == null) {
      paramView.setOnApplyWindowInsetsListener(null);
      return;
    } 
    paramView.setOnApplyWindowInsetsListener(new a(paramj));
  }
  
  public static boolean f(View paramView, KeyEvent paramKeyEvent) {
    int i = Build.VERSION.SDK_INT;
    boolean bool = false;
    if (i >= 28)
      return false; 
    d d = d.a(paramView);
    WeakReference<KeyEvent> weakReference = d.c;
    if (weakReference == null || weakReference.get() != paramKeyEvent) {
      d.c = new WeakReference<KeyEvent>(paramKeyEvent);
      WeakReference<KeyEvent> weakReference1 = null;
      if (d.b == null)
        d.b = new SparseArray(); 
      SparseArray<WeakReference<View>> sparseArray = d.b;
      weakReference = weakReference1;
      if (paramKeyEvent.getAction() == 1) {
        i = sparseArray.indexOfKey(paramKeyEvent.getKeyCode());
        weakReference = weakReference1;
        if (i >= 0) {
          weakReference = (WeakReference<KeyEvent>)sparseArray.valueAt(i);
          sparseArray.removeAt(i);
        } 
      } 
      weakReference1 = weakReference;
      if (weakReference == null)
        weakReference1 = (WeakReference<KeyEvent>)sparseArray.get(paramKeyEvent.getKeyCode()); 
      if (weakReference1 != null) {
        View view = (View)weakReference1.get();
        if (view != null && view.isAttachedToWindow())
          d.c(view, paramKeyEvent); 
        bool = true;
      } 
    } 
    return bool;
  }
  
  public static void f0(View paramView, int paramInt1, int paramInt2, int paramInt3, int paramInt4) {
    paramView.setPaddingRelative(paramInt1, paramInt2, paramInt3, paramInt4);
  }
  
  public static a g(View paramView) {
    View.AccessibilityDelegate accessibilityDelegate = h(paramView);
    return (accessibilityDelegate == null) ? null : ((accessibilityDelegate instanceof a.a) ? ((a.a)accessibilityDelegate).a : new a(accessibilityDelegate));
  }
  
  public static void g0(View paramView, int paramInt1, int paramInt2) {
    if (Build.VERSION.SDK_INT >= 23)
      paramView.setScrollIndicators(paramInt1, paramInt2); 
  }
  
  public static View.AccessibilityDelegate h(View paramView) {
    if (Build.VERSION.SDK_INT >= 29)
      return paramView.getAccessibilityDelegate(); 
    boolean bool = c;
    View view = null;
    if (bool) {
      paramView = view;
    } else {
      if (b == null) {
        try {
          Field field = View.class.getDeclaredField("mAccessibilityDelegate");
          b = field;
          field.setAccessible(true);
        } finally {
          paramView = null;
          c = true;
        } 
        return (View.AccessibilityDelegate)paramView;
      } 
      Object object = b.get(paramView);
      paramView = view;
    } 
    return (View.AccessibilityDelegate)paramView;
  }
  
  public static void h0(View paramView, String paramString) {
    paramView.setTransitionName(paramString);
  }
  
  public static int i(View paramView) {
    return paramView.getAccessibilityLiveRegion();
  }
  
  public static void i0(View paramView) {
    paramView.stopNestedScroll();
  }
  
  public static ColorStateList j(View paramView) {
    return paramView.getBackgroundTintList();
  }
  
  public static void j0(View paramView) {
    float f = paramView.getTranslationY();
    paramView.setTranslationY(1.0F + f);
    paramView.setTranslationY(f);
  }
  
  public static Rect k(View paramView) {
    return paramView.getClipBounds();
  }
  
  public static Display l(View paramView) {
    return paramView.getDisplay();
  }
  
  public static float m(View paramView) {
    return paramView.getElevation();
  }
  
  public static Rect n() {
    if (d == null)
      d = new ThreadLocal<Rect>(); 
    Rect rect2 = d.get();
    Rect rect1 = rect2;
    if (rect2 == null) {
      rect1 = new Rect();
      d.set(rect1);
    } 
    rect1.setEmpty();
    return rect1;
  }
  
  public static boolean o(View paramView) {
    return paramView.getFitsSystemWindows();
  }
  
  public static int p(View paramView) {
    return paramView.getImportantForAccessibility();
  }
  
  @SuppressLint({"InlinedApi"})
  public static int q(View paramView) {
    return (Build.VERSION.SDK_INT >= 26) ? paramView.getImportantForAutofill() : 0;
  }
  
  public static int r(View paramView) {
    return paramView.getLayoutDirection();
  }
  
  public static int s(View paramView) {
    return paramView.getMinimumHeight();
  }
  
  public static int t(View paramView) {
    return paramView.getMinimumWidth();
  }
  
  public static int u(View paramView) {
    return paramView.getPaddingEnd();
  }
  
  public static int v(View paramView) {
    return paramView.getPaddingStart();
  }
  
  public static u w(View paramView) {
    return (Build.VERSION.SDK_INT >= 23) ? u.h(paramView.getRootWindowInsets()) : null;
  }
  
  public static String x(View paramView) {
    return paramView.getTransitionName();
  }
  
  public static int y(View paramView) {
    return paramView.getWindowSystemUiVisibility();
  }
  
  public static float z(View paramView) {
    return paramView.getZ();
  }
  
  static {
    new AtomicInteger(1);
  }
  
  public class a implements View.OnApplyWindowInsetsListener {
    public final j a;
    
    public a(l this$0) {}
    
    public WindowInsets onApplyWindowInsets(View param1View, WindowInsets param1WindowInsets) {
      if (param1WindowInsets != null) {
        u u = new u(param1WindowInsets);
        return this.a.a(param1View, u).g();
      } 
      throw null;
    }
  }
  
  public static abstract class b<T> {
    public final int a;
    
    public final Class<T> b;
    
    public final int c;
    
    public b(int param1Int1, Class<T> param1Class, int param1Int2) {
      this.a = param1Int1;
      this.b = param1Class;
      this.c = param1Int2;
    }
    
    public b(int param1Int1, Class<T> param1Class, int param1Int2, int param1Int3) {
      this.a = param1Int1;
      this.b = param1Class;
      this.c = param1Int3;
    }
    
    public boolean a(Boolean param1Boolean1, Boolean param1Boolean2) {
      boolean bool1;
      boolean bool2;
      boolean bool = false;
      if (param1Boolean1 == null) {
        bool1 = false;
      } else {
        bool1 = param1Boolean1.booleanValue();
      } 
      if (param1Boolean2 == null) {
        bool2 = false;
      } else {
        bool2 = param1Boolean2.booleanValue();
      } 
      if (bool1 == bool2)
        bool = true; 
      return bool;
    }
    
    public abstract T b(View param1View);
    
    public abstract void c(View param1View, T param1T);
    
    public T d(View param1View) {
      boolean bool;
      if (Build.VERSION.SDK_INT >= this.c) {
        bool = true;
      } else {
        bool = false;
      } 
      if (bool)
        return b(param1View); 
      Object object = param1View.getTag(this.a);
      return (T)(this.b.isInstance(object) ? object : null);
    }
    
    public abstract boolean e(T param1T1, T param1T2);
  }
  
  public static interface c {
    boolean a(View param1View, KeyEvent param1KeyEvent);
  }
  
  public static class d {
    public static final ArrayList<WeakReference<View>> d = new ArrayList<WeakReference<View>>();
    
    public WeakHashMap<View, Boolean> a = null;
    
    public SparseArray<WeakReference<View>> b = null;
    
    public WeakReference<KeyEvent> c = null;
    
    public static d a(View param1View) {
      d d2 = (d)param1View.getTag(b.i.b.tag_unhandled_key_event_manager);
      d d1 = d2;
      if (d2 == null) {
        d1 = new d();
        param1View.setTag(b.i.b.tag_unhandled_key_event_manager, d1);
      } 
      return d1;
    }
    
    public final View b(View param1View, KeyEvent param1KeyEvent) {
      WeakHashMap<View, Boolean> weakHashMap = this.a;
      if (weakHashMap != null && weakHashMap.containsKey(param1View)) {
        if (param1View instanceof ViewGroup) {
          ViewGroup viewGroup = (ViewGroup)param1View;
          for (int i = viewGroup.getChildCount() - 1; i >= 0; i--) {
            View view = b(viewGroup.getChildAt(i), param1KeyEvent);
            if (view != null)
              return view; 
          } 
        } 
        if (c(param1View, param1KeyEvent))
          return param1View; 
      } 
      return null;
    }
    
    public final boolean c(View param1View, KeyEvent param1KeyEvent) {
      ArrayList<l.c> arrayList = (ArrayList)param1View.getTag(b.i.b.tag_unhandled_key_listeners);
      if (arrayList != null)
        for (int i = arrayList.size() - 1; i >= 0; i--) {
          if (((l.c)arrayList.get(i)).a(param1View, param1KeyEvent))
            return true; 
        }  
      return false;
    }
  }
}


/* Location:              C:\Users\panch\Downloads\dvba_v1.1.0-dex2jar.jar!\b\i\m\l.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */