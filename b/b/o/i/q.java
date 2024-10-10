package b.b.o.i;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Rect;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.AdapterView;
import android.widget.FrameLayout;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.PopupWindow;
import android.widget.TextView;
import b.b.d;
import b.b.g;
import b.b.p.f0;
import b.b.p.k0;
import b.b.p.m0;

public final class q extends k implements PopupWindow.OnDismissListener, AdapterView.OnItemClickListener, m, View.OnKeyListener {
  public static final int w = g.abc_popup_menu_item_layout;
  
  public final Context c;
  
  public final g d;
  
  public final f e;
  
  public final boolean f;
  
  public final int g;
  
  public final int h;
  
  public final int i;
  
  public final m0 j;
  
  public final ViewTreeObserver.OnGlobalLayoutListener k = new a(this);
  
  public final View.OnAttachStateChangeListener l = new b(this);
  
  public PopupWindow.OnDismissListener m;
  
  public View n;
  
  public View o;
  
  public m.a p;
  
  public ViewTreeObserver q;
  
  public boolean r;
  
  public boolean s;
  
  public int t;
  
  public int u = 0;
  
  public boolean v;
  
  public q(Context paramContext, g paramg, View paramView, int paramInt1, int paramInt2, boolean paramBoolean) {
    this.c = paramContext;
    this.d = paramg;
    this.f = paramBoolean;
    this.e = new f(paramg, LayoutInflater.from(paramContext), this.f, w);
    this.h = paramInt1;
    this.i = paramInt2;
    Resources resources = paramContext.getResources();
    this.g = Math.max((resources.getDisplayMetrics()).widthPixels / 2, resources.getDimensionPixelSize(d.abc_config_prefDialogWidth));
    this.n = paramView;
    this.j = new m0(this.c, null, this.h, this.i);
    paramg.b(this, paramContext);
  }
  
  public boolean a() {
    boolean bool;
    if (!this.r && this.j.a()) {
      bool = true;
    } else {
      bool = false;
    } 
    return bool;
  }
  
  public void b(g paramg, boolean paramBoolean) {
    if (paramg != this.d)
      return; 
    dismiss();
    m.a a1 = this.p;
    if (a1 != null)
      a1.b(paramg, paramBoolean); 
  }
  
  public void d(m.a parama) {
    this.p = parama;
  }
  
  public void dismiss() {
    if (a())
      this.j.dismiss(); 
  }
  
  public ListView e() {
    return (ListView)((k0)this.j).d;
  }
  
  public boolean f(r paramr) {
    // Byte code:
    //   0: aload_1
    //   1: invokevirtual hasVisibleItems : ()Z
    //   4: ifeq -> 228
    //   7: new b/b/o/i/l
    //   10: dup
    //   11: aload_0
    //   12: getfield c : Landroid/content/Context;
    //   15: aload_1
    //   16: aload_0
    //   17: getfield o : Landroid/view/View;
    //   20: aload_0
    //   21: getfield f : Z
    //   24: aload_0
    //   25: getfield h : I
    //   28: aload_0
    //   29: getfield i : I
    //   32: invokespecial <init> : (Landroid/content/Context;Lb/b/o/i/g;Landroid/view/View;ZII)V
    //   35: astore #6
    //   37: aload #6
    //   39: aload_0
    //   40: getfield p : Lb/b/o/i/m$a;
    //   43: invokevirtual d : (Lb/b/o/i/m$a;)V
    //   46: aload_1
    //   47: invokestatic v : (Lb/b/o/i/g;)Z
    //   50: istore #5
    //   52: aload #6
    //   54: iload #5
    //   56: putfield h : Z
    //   59: aload #6
    //   61: getfield j : Lb/b/o/i/k;
    //   64: astore #7
    //   66: aload #7
    //   68: ifnull -> 78
    //   71: aload #7
    //   73: iload #5
    //   75: invokevirtual p : (Z)V
    //   78: aload #6
    //   80: aload_0
    //   81: getfield m : Landroid/widget/PopupWindow$OnDismissListener;
    //   84: putfield k : Landroid/widget/PopupWindow$OnDismissListener;
    //   87: aload_0
    //   88: aconst_null
    //   89: putfield m : Landroid/widget/PopupWindow$OnDismissListener;
    //   92: aload_0
    //   93: getfield d : Lb/b/o/i/g;
    //   96: iconst_0
    //   97: invokevirtual c : (Z)V
    //   100: aload_0
    //   101: getfield j : Lb/b/p/m0;
    //   104: astore #7
    //   106: aload #7
    //   108: getfield g : I
    //   111: istore #4
    //   113: aload #7
    //   115: getfield j : Z
    //   118: ifne -> 126
    //   121: iconst_0
    //   122: istore_2
    //   123: goto -> 132
    //   126: aload #7
    //   128: getfield h : I
    //   131: istore_2
    //   132: iload #4
    //   134: istore_3
    //   135: aload_0
    //   136: getfield u : I
    //   139: aload_0
    //   140: getfield n : Landroid/view/View;
    //   143: invokestatic r : (Landroid/view/View;)I
    //   146: invokestatic getAbsoluteGravity : (II)I
    //   149: bipush #7
    //   151: iand
    //   152: iconst_5
    //   153: if_icmpne -> 167
    //   156: iload #4
    //   158: aload_0
    //   159: getfield n : Landroid/view/View;
    //   162: invokevirtual getWidth : ()I
    //   165: iadd
    //   166: istore_3
    //   167: aload #6
    //   169: invokevirtual b : ()Z
    //   172: ifeq -> 178
    //   175: goto -> 200
    //   178: aload #6
    //   180: getfield f : Landroid/view/View;
    //   183: ifnonnull -> 191
    //   186: iconst_0
    //   187: istore_2
    //   188: goto -> 202
    //   191: aload #6
    //   193: iload_3
    //   194: iload_2
    //   195: iconst_1
    //   196: iconst_1
    //   197: invokevirtual e : (IIZZ)V
    //   200: iconst_1
    //   201: istore_2
    //   202: iload_2
    //   203: ifeq -> 228
    //   206: aload_0
    //   207: getfield p : Lb/b/o/i/m$a;
    //   210: astore #6
    //   212: aload #6
    //   214: ifnull -> 226
    //   217: aload #6
    //   219: aload_1
    //   220: invokeinterface c : (Lb/b/o/i/g;)Z
    //   225: pop
    //   226: iconst_1
    //   227: ireturn
    //   228: iconst_0
    //   229: ireturn
  }
  
  public boolean g() {
    return false;
  }
  
  public void h(boolean paramBoolean) {
    this.s = false;
    f f1 = this.e;
    if (f1 != null)
      f1.notifyDataSetChanged(); 
  }
  
  public void i() {
    boolean bool = a();
    boolean bool2 = false;
    if (!bool) {
      boolean bool3 = bool2;
      if (!this.r) {
        View view = this.n;
        if (view == null) {
          bool3 = bool2;
        } else {
          this.o = view;
          ((k0)this.j).C.setOnDismissListener(this);
          m0 m01 = this.j;
          ((k0)m01).t = this;
          m01.s(true);
          View view1 = this.o;
          if (this.q == null) {
            bool3 = true;
          } else {
            bool3 = false;
          } 
          ViewTreeObserver viewTreeObserver = view1.getViewTreeObserver();
          this.q = viewTreeObserver;
          if (bool3)
            viewTreeObserver.addOnGlobalLayoutListener(this.k); 
          view1.addOnAttachStateChangeListener(this.l);
          m0 m02 = this.j;
          ((k0)m02).s = view1;
          ((k0)m02).m = this.u;
          if (!this.s) {
            this.t = k.n((ListAdapter)this.e, null, this.c, this.g);
            this.s = true;
          } 
          this.j.r(this.t);
          ((k0)this.j).C.setInputMethodMode(2);
          m02 = this.j;
          Rect rect = this.b;
          if (m02 != null) {
            if (rect != null) {
              rect = new Rect(rect);
            } else {
              rect = null;
            } 
            ((k0)m02).A = rect;
            this.j.i();
            f0 f0 = ((k0)this.j).d;
            f0.setOnKeyListener(this);
            if (this.v && this.d.m != null) {
              FrameLayout frameLayout = (FrameLayout)LayoutInflater.from(this.c).inflate(g.abc_popup_menu_header_item_layout, (ViewGroup)f0, false);
              TextView textView = (TextView)frameLayout.findViewById(16908310);
              if (textView != null)
                textView.setText(this.d.m); 
              frameLayout.setEnabled(false);
              f0.addHeaderView((View)frameLayout, null, false);
            } 
            this.j.o((ListAdapter)this.e);
            this.j.i();
          } else {
            throw null;
          } 
          bool3 = true;
        } 
      } 
      if (bool3)
        return; 
      throw new IllegalStateException("StandardMenuPopup cannot be used without an anchor");
    } 
    boolean bool1 = true;
  }
  
  public void l(g paramg) {}
  
  public void o(View paramView) {
    this.n = paramView;
  }
  
  public void onDismiss() {
    this.r = true;
    this.d.c(true);
    ViewTreeObserver viewTreeObserver = this.q;
    if (viewTreeObserver != null) {
      if (!viewTreeObserver.isAlive())
        this.q = this.o.getViewTreeObserver(); 
      this.q.removeGlobalOnLayoutListener(this.k);
      this.q = null;
    } 
    this.o.removeOnAttachStateChangeListener(this.l);
    PopupWindow.OnDismissListener onDismissListener = this.m;
    if (onDismissListener != null)
      onDismissListener.onDismiss(); 
  }
  
  public boolean onKey(View paramView, int paramInt, KeyEvent paramKeyEvent) {
    if (paramKeyEvent.getAction() == 1 && paramInt == 82) {
      dismiss();
      return true;
    } 
    return false;
  }
  
  public void p(boolean paramBoolean) {
    this.e.d = paramBoolean;
  }
  
  public void q(int paramInt) {
    this.u = paramInt;
  }
  
  public void r(int paramInt) {
    ((k0)this.j).g = paramInt;
  }
  
  public void s(PopupWindow.OnDismissListener paramOnDismissListener) {
    this.m = paramOnDismissListener;
  }
  
  public void t(boolean paramBoolean) {
    this.v = paramBoolean;
  }
  
  public void u(int paramInt) {
    m0 m01 = this.j;
    ((k0)m01).h = paramInt;
    ((k0)m01).j = true;
  }
  
  public class a implements ViewTreeObserver.OnGlobalLayoutListener {
    public final q b;
    
    public a(q this$0) {}
    
    public void onGlobalLayout() {
      if (this.b.a()) {
        q q1 = this.b;
        if (!((k0)q1.j).B) {
          View view = q1.o;
          if (view == null || !view.isShown()) {
            this.b.dismiss();
            return;
          } 
          this.b.j.i();
        } 
      } 
    }
  }
  
  public class b implements View.OnAttachStateChangeListener {
    public final q b;
    
    public b(q this$0) {}
    
    public void onViewAttachedToWindow(View param1View) {}
    
    public void onViewDetachedFromWindow(View param1View) {
      ViewTreeObserver viewTreeObserver = this.b.q;
      if (viewTreeObserver != null) {
        if (!viewTreeObserver.isAlive())
          this.b.q = param1View.getViewTreeObserver(); 
        q q1 = this.b;
        q1.q.removeGlobalOnLayoutListener(q1.k);
      } 
      param1View.removeOnAttachStateChangeListener(this);
    }
  }
}


/* Location:              C:\Users\panch\Downloads\dvba_v1.1.0-dex2jar.jar!\b\b\o\i\q.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */