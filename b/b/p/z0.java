package b.b.p;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.Window;
import android.widget.TextView;
import androidx.appcompat.widget.ActionMenuView;
import androidx.appcompat.widget.Toolbar;
import b.b.j;
import b.b.o.i.g;
import b.b.o.i.i;
import b.b.o.i.m;
import b.i.m.l;
import b.i.m.q;
import b.i.m.r;
import b.i.m.s;

public class z0 implements d0 {
  public Toolbar a;
  
  public int b;
  
  public View c;
  
  public View d;
  
  public Drawable e;
  
  public Drawable f;
  
  public Drawable g;
  
  public boolean h;
  
  public CharSequence i;
  
  public CharSequence j;
  
  public CharSequence k;
  
  public Window.Callback l;
  
  public boolean m;
  
  public c n;
  
  public int o;
  
  public int p;
  
  public Drawable q;
  
  public z0(Toolbar paramToolbar, boolean paramBoolean) {
    boolean bool;
    this.o = 0;
    this.p = 0;
    this.a = paramToolbar;
    this.i = paramToolbar.getTitle();
    this.j = paramToolbar.getSubtitle();
    if (this.i != null) {
      bool = true;
    } else {
      bool = false;
    } 
    this.h = bool;
    this.g = paramToolbar.getNavigationIcon();
    Context context = paramToolbar.getContext();
    int[] arrayOfInt = j.ActionBar;
    int i = b.b.a.actionBarStyle;
    paramToolbar = null;
    x0 x0 = x0.q(context, null, arrayOfInt, i, 0);
    this.q = x0.g(j.ActionBar_homeAsUpIndicator);
    if (paramBoolean) {
      CharSequence charSequence = x0.n(j.ActionBar_title);
      if (!TextUtils.isEmpty(charSequence)) {
        this.h = true;
        this.i = charSequence;
        if ((this.b & 0x8) != 0)
          this.a.setTitle(charSequence); 
      } 
      charSequence = x0.n(j.ActionBar_subtitle);
      if (!TextUtils.isEmpty(charSequence)) {
        this.j = charSequence;
        if ((this.b & 0x8) != 0)
          this.a.setSubtitle(charSequence); 
      } 
      Drawable drawable = x0.g(j.ActionBar_logo);
      if (drawable != null) {
        this.f = drawable;
        y();
      } 
      drawable = x0.g(j.ActionBar_icon);
      if (drawable != null) {
        this.e = drawable;
        y();
      } 
      if (this.g == null) {
        drawable = this.q;
        if (drawable != null) {
          this.g = drawable;
          x();
        } 
      } 
      u(x0.j(j.ActionBar_displayOptions, 0));
      i = x0.l(j.ActionBar_customNavigationLayout, 0);
      if (i != 0) {
        View view2 = LayoutInflater.from(this.a.getContext()).inflate(i, (ViewGroup)this.a, false);
        View view1 = this.d;
        if (view1 != null && (this.b & 0x10) != 0)
          this.a.removeView(view1); 
        this.d = view2;
        if (view2 != null && (this.b & 0x10) != 0)
          this.a.addView(view2); 
        u(this.b | 0x10);
      } 
      i = x0.k(j.ActionBar_height, 0);
      if (i > 0) {
        ViewGroup.LayoutParams layoutParams = this.a.getLayoutParams();
        layoutParams.height = i;
        this.a.setLayoutParams(layoutParams);
      } 
      i = x0.e(j.ActionBar_contentInsetStart, -1);
      int k = x0.e(j.ActionBar_contentInsetEnd, -1);
      if (i >= 0 || k >= 0) {
        Toolbar toolbar = this.a;
        i = Math.max(i, 0);
        k = Math.max(k, 0);
        toolbar.d();
        toolbar.u.a(i, k);
      } 
      i = x0.l(j.ActionBar_titleTextStyle, 0);
      if (i != 0) {
        Toolbar toolbar = this.a;
        Context context1 = toolbar.getContext();
        toolbar.m = i;
        TextView textView = toolbar.c;
        if (textView != null)
          textView.setTextAppearance(context1, i); 
      } 
      i = x0.l(j.ActionBar_subtitleTextStyle, 0);
      if (i != 0) {
        Toolbar toolbar = this.a;
        Context context1 = toolbar.getContext();
        toolbar.n = i;
        TextView textView = toolbar.d;
        if (textView != null)
          textView.setTextAppearance(context1, i); 
      } 
      i = x0.l(j.ActionBar_popupTheme, 0);
      if (i != 0)
        this.a.setPopupTheme(i); 
    } else {
      if (this.a.getNavigationIcon() != null) {
        i = 15;
        this.q = this.a.getNavigationIcon();
      } else {
        i = 11;
      } 
      this.b = i;
    } 
    x0.b.recycle();
    if (j != this.p) {
      this.p = j;
      if (TextUtils.isEmpty(this.a.getNavigationContentDescription())) {
        String str;
        i = this.p;
        if (i != 0)
          str = t().getString(i); 
        this.k = str;
        w();
      } 
    } 
    this.k = this.a.getNavigationContentDescription();
    this.a.setNavigationOnClickListener(new y0(this));
  }
  
  public boolean a() {
    return this.a.u();
  }
  
  public void b(Menu paramMenu, m.a parama) {
    if (this.n == null) {
      c c2 = new c(this.a.getContext());
      this.n = c2;
      if (c2 == null)
        throw null; 
    } 
    c c1 = this.n;
    c1.f = parama;
    Toolbar toolbar = this.a;
    g g = (g)paramMenu;
    if (g != null || toolbar.b != null) {
      toolbar.f();
      g g1 = toolbar.b.q;
      if (g1 != g) {
        if (g1 != null) {
          g1.u((m)toolbar.K);
          g1.u((m)toolbar.L);
        } 
        if (toolbar.L == null)
          toolbar.L = new Toolbar.d(toolbar); 
        c1.r = true;
        if (g != null) {
          g.b((m)c1, toolbar.k);
          g.b((m)toolbar.L, toolbar.k);
        } else {
          c1.j(toolbar.k, null);
          Toolbar.d d = toolbar.L;
          g = d.b;
          if (g != null) {
            i i = d.c;
            if (i != null)
              g.d(i); 
          } 
          d.b = null;
          c1.h(true);
          toolbar.L.h(true);
        } 
        toolbar.b.setPopupTheme(toolbar.l);
        toolbar.b.setPresenter(c1);
        toolbar.K = c1;
      } 
    } 
  }
  
  public boolean c() {
    // Byte code:
    //   0: aload_0
    //   1: getfield a : Landroidx/appcompat/widget/Toolbar;
    //   4: getfield b : Landroidx/appcompat/widget/ActionMenuView;
    //   7: astore #4
    //   9: iconst_0
    //   10: istore_3
    //   11: iload_3
    //   12: istore_2
    //   13: aload #4
    //   15: ifnull -> 75
    //   18: aload #4
    //   20: getfield u : Lb/b/p/c;
    //   23: astore #4
    //   25: aload #4
    //   27: ifnull -> 65
    //   30: aload #4
    //   32: getfield w : Lb/b/p/c$c;
    //   35: ifnonnull -> 54
    //   38: aload #4
    //   40: invokevirtual m : ()Z
    //   43: ifeq -> 49
    //   46: goto -> 54
    //   49: iconst_0
    //   50: istore_1
    //   51: goto -> 56
    //   54: iconst_1
    //   55: istore_1
    //   56: iload_1
    //   57: ifeq -> 65
    //   60: iconst_1
    //   61: istore_1
    //   62: goto -> 67
    //   65: iconst_0
    //   66: istore_1
    //   67: iload_3
    //   68: istore_2
    //   69: iload_1
    //   70: ifeq -> 75
    //   73: iconst_1
    //   74: istore_2
    //   75: iload_2
    //   76: ireturn
  }
  
  public void collapseActionView() {
    i i;
    Toolbar.d d = this.a.L;
    if (d == null) {
      d = null;
    } else {
      i = d.c;
    } 
    if (i != null)
      i.collapseActionView(); 
  }
  
  public void d() {
    this.m = true;
  }
  
  public boolean e() {
    return this.a.o();
  }
  
  public boolean f() {
    Toolbar toolbar = this.a;
    if (toolbar.getVisibility() == 0) {
      ActionMenuView actionMenuView = toolbar.b;
      if (actionMenuView != null && actionMenuView.t)
        return true; 
    } 
    return false;
  }
  
  public boolean g() {
    ActionMenuView actionMenuView = this.a.b;
    boolean bool2 = false;
    boolean bool1 = bool2;
    if (actionMenuView != null) {
      boolean bool;
      c c1 = actionMenuView.u;
      if (c1 != null && c1.i()) {
        bool = true;
      } else {
        bool = false;
      } 
      bool1 = bool2;
      if (bool)
        bool1 = true; 
    } 
    return bool1;
  }
  
  public CharSequence getTitle() {
    return this.a.getTitle();
  }
  
  public void h() {
    ActionMenuView actionMenuView = this.a.b;
    if (actionMenuView != null) {
      c c1 = actionMenuView.u;
      if (c1 != null)
        c1.e(); 
    } 
  }
  
  public q i(int paramInt, long paramLong) {
    float f;
    q q = l.a((View)this.a);
    if (paramInt == 0) {
      f = 1.0F;
    } else {
      f = 0.0F;
    } 
    q.a(f);
    q.c(paramLong);
    a a = new a(this, paramInt);
    View view = q.a.get();
    if (view != null)
      q.e(view, (r)a); 
    return q;
  }
  
  public int j() {
    return this.b;
  }
  
  public void k(int paramInt) {
    this.a.setVisibility(paramInt);
  }
  
  public void l() {
    Log.i("ToolbarWidgetWrapper", "Progress display unsupported");
  }
  
  public boolean m() {
    boolean bool;
    Toolbar.d d = this.a.L;
    if (d != null && d.c != null) {
      bool = true;
    } else {
      bool = false;
    } 
    return bool;
  }
  
  public void n(int paramInt) {
    Drawable drawable;
    if (paramInt != 0) {
      drawable = b.b.l.a.a.b(t(), paramInt);
    } else {
      drawable = null;
    } 
    this.f = drawable;
    y();
  }
  
  public void o(q0 paramq0) {
    View view = this.c;
    if (view != null) {
      ViewParent viewParent = view.getParent();
      Toolbar toolbar = this.a;
      if (viewParent == toolbar)
        toolbar.removeView(this.c); 
    } 
    this.c = null;
  }
  
  public ViewGroup p() {
    return (ViewGroup)this.a;
  }
  
  public void q(boolean paramBoolean) {}
  
  public void r() {
    Log.i("ToolbarWidgetWrapper", "Progress display unsupported");
  }
  
  public void s(boolean paramBoolean) {
    this.a.setCollapsible(paramBoolean);
  }
  
  public void setIcon(int paramInt) {
    Drawable drawable;
    if (paramInt != 0) {
      drawable = b.b.l.a.a.b(t(), paramInt);
    } else {
      drawable = null;
    } 
    this.e = drawable;
    y();
  }
  
  public void setIcon(Drawable paramDrawable) {
    this.e = paramDrawable;
    y();
  }
  
  public void setWindowCallback(Window.Callback paramCallback) {
    this.l = paramCallback;
  }
  
  public void setWindowTitle(CharSequence paramCharSequence) {
    if (!this.h) {
      this.i = paramCharSequence;
      if ((this.b & 0x8) != 0)
        this.a.setTitle(paramCharSequence); 
    } 
  }
  
  public Context t() {
    return this.a.getContext();
  }
  
  public void u(int paramInt) {
    int i = this.b ^ paramInt;
    this.b = paramInt;
    if (i != 0) {
      if ((i & 0x4) != 0) {
        if ((paramInt & 0x4) != 0)
          w(); 
        x();
      } 
      if ((i & 0x3) != 0)
        y(); 
      if ((i & 0x8) != 0) {
        Toolbar toolbar;
        CharSequence charSequence;
        if ((paramInt & 0x8) != 0) {
          this.a.setTitle(this.i);
          toolbar = this.a;
          charSequence = this.j;
        } else {
          toolbar = this.a;
          charSequence = null;
          toolbar.setTitle(null);
          toolbar = this.a;
        } 
        toolbar.setSubtitle(charSequence);
      } 
      if ((i & 0x10) != 0) {
        View view = this.d;
        if (view != null)
          if ((paramInt & 0x10) != 0) {
            this.a.addView(view);
          } else {
            this.a.removeView(view);
          }  
      } 
    } 
  }
  
  public int v() {
    return this.o;
  }
  
  public final void w() {
    if ((this.b & 0x4) != 0)
      if (TextUtils.isEmpty(this.k)) {
        this.a.setNavigationContentDescription(this.p);
      } else {
        this.a.setNavigationContentDescription(this.k);
      }  
  }
  
  public final void x() {
    Drawable drawable;
    Toolbar toolbar;
    if ((this.b & 0x4) != 0) {
      toolbar = this.a;
      drawable = this.g;
      if (drawable == null)
        drawable = this.q; 
    } else {
      toolbar = this.a;
      drawable = null;
    } 
    toolbar.setNavigationIcon(drawable);
  }
  
  public final void y() {
    Drawable drawable;
    int i = this.b;
    if ((i & 0x2) != 0) {
      if ((i & 0x1) != 0) {
        Drawable drawable1 = this.f;
        if (drawable1 != null) {
          this.a.setLogo(drawable1);
          return;
        } 
      } 
      drawable = this.e;
    } else {
      drawable = null;
    } 
    this.a.setLogo(drawable);
  }
  
  public class a extends s {
    public boolean a = false;
    
    public final int b;
    
    public final z0 c;
    
    public a(z0 this$0, int param1Int) {}
    
    public void a(View param1View) {
      if (!this.a)
        this.c.a.setVisibility(this.b); 
    }
    
    public void b(View param1View) {
      this.c.a.setVisibility(0);
    }
    
    public void c(View param1View) {
      this.a = true;
    }
  }
}


/* Location:              C:\Users\panch\Downloads\dvba_v1.1.0-dex2jar.jar!\b\b\p\z0.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */