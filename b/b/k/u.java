package b.b.k;

import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.content.res.Configuration;
import android.content.res.TypedArray;
import android.util.TypedValue;
import android.view.ContextThemeWrapper;
import android.view.KeyCharacterMap;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.Interpolator;
import androidx.appcompat.widget.ActionBarContainer;
import androidx.appcompat.widget.ActionBarContextView;
import androidx.appcompat.widget.ActionBarOverlayLayout;
import androidx.appcompat.widget.Toolbar;
import b.b.f;
import b.b.j;
import b.b.o.f;
import b.b.o.g;
import b.b.o.i.g;
import b.b.p.d0;
import b.i.m.l;
import b.i.m.q;
import b.i.m.r;
import b.i.m.s;
import b.i.m.t;
import java.lang.ref.WeakReference;
import java.util.ArrayList;

public class u extends a implements ActionBarOverlayLayout.d {
  public static final Interpolator A = (Interpolator)new AccelerateInterpolator();
  
  public static final Interpolator B = (Interpolator)new DecelerateInterpolator();
  
  public Context a;
  
  public Context b;
  
  public ActionBarOverlayLayout c;
  
  public ActionBarContainer d;
  
  public d0 e;
  
  public ActionBarContextView f;
  
  public View g;
  
  public boolean h;
  
  public d i;
  
  public b.b.o.a j;
  
  public b.b.o.a.a k;
  
  public boolean l;
  
  public ArrayList<a.b> m;
  
  public boolean n;
  
  public int o;
  
  public boolean p;
  
  public boolean q;
  
  public boolean r;
  
  public boolean s;
  
  public boolean t;
  
  public g u;
  
  public boolean v;
  
  public boolean w;
  
  public final r x;
  
  public final r y;
  
  public final t z;
  
  public u(Activity paramActivity, boolean paramBoolean) {
    new ArrayList();
    this.m = new ArrayList<a.b>();
    this.o = 0;
    this.p = true;
    this.t = true;
    this.x = (r)new a(this);
    this.y = (r)new b(this);
    this.z = new c(this);
    View view = paramActivity.getWindow().getDecorView();
    l(view);
    if (!paramBoolean)
      this.g = view.findViewById(16908290); 
  }
  
  public u(Dialog paramDialog) {
    new ArrayList();
    this.m = new ArrayList<a.b>();
    this.o = 0;
    this.p = true;
    this.t = true;
    this.x = (r)new a(this);
    this.y = (r)new b(this);
    this.z = new c(this);
    l(paramDialog.getWindow().getDecorView());
  }
  
  public boolean a() {
    d0 d01 = this.e;
    if (d01 != null && d01.m()) {
      this.e.collapseActionView();
      return true;
    } 
    return false;
  }
  
  public void b(boolean paramBoolean) {
    if (paramBoolean == this.l)
      return; 
    this.l = paramBoolean;
    int i = this.m.size();
    for (byte b = 0; b < i; b++)
      ((a.b)this.m.get(b)).a(paramBoolean); 
  }
  
  public int c() {
    return this.e.j();
  }
  
  public Context d() {
    if (this.b == null) {
      TypedValue typedValue = new TypedValue();
      this.a.getTheme().resolveAttribute(b.b.a.actionBarWidgetTheme, typedValue, true);
      int i = typedValue.resourceId;
      if (i != 0) {
        this.b = (Context)new ContextThemeWrapper(this.a, i);
      } else {
        this.b = this.a;
      } 
    } 
    return this.b;
  }
  
  public void e(Configuration paramConfiguration) {
    m(this.a.getResources().getBoolean(b.b.b.abc_action_bar_embed_tabs));
  }
  
  public boolean f(int paramInt, KeyEvent paramKeyEvent) {
    d d1 = this.i;
    if (d1 == null)
      return false; 
    g g1 = d1.e;
    if (g1 != null) {
      if (paramKeyEvent != null) {
        i = paramKeyEvent.getDeviceId();
      } else {
        i = -1;
      } 
      int i = KeyCharacterMap.load(i).getKeyboardType();
      boolean bool = true;
      if (i == 1)
        bool = false; 
      g1.setQwertyMode(bool);
      return g1.performShortcut(paramInt, paramKeyEvent, 0);
    } 
    return false;
  }
  
  public void g(boolean paramBoolean) {
    if (!this.h) {
      boolean bool;
      if (paramBoolean) {
        bool = true;
      } else {
        bool = false;
      } 
      int i = this.e.j();
      this.h = true;
      this.e.u(bool & 0x4 | i & 0xFFFFFFFB);
    } 
  }
  
  public void h(boolean paramBoolean) {
    this.v = paramBoolean;
    if (!paramBoolean) {
      g g1 = this.u;
      if (g1 != null)
        g1.a(); 
    } 
  }
  
  public void i(CharSequence paramCharSequence) {
    this.e.setWindowTitle(paramCharSequence);
  }
  
  public b.b.o.a j(b.b.o.a.a parama) {
    null = this.i;
    if (null != null)
      null.c(); 
    this.c.setHideOnContentScrollEnabled(false);
    this.f.h();
    d d1 = new d(this, this.f.getContext(), parama);
    d1.e.z();
    try {
      boolean bool = d1.f.d(d1, (Menu)d1.e);
      d1.e.y();
      return null;
    } finally {
      d1.e.y();
    } 
  }
  
  public void k(boolean paramBoolean) {
    if (paramBoolean) {
      if (!this.s) {
        this.s = true;
        ActionBarOverlayLayout actionBarOverlayLayout = this.c;
        if (actionBarOverlayLayout != null)
          actionBarOverlayLayout.setShowingForActionMode(true); 
        n(false);
      } 
    } else if (this.s) {
      this.s = false;
      ActionBarOverlayLayout actionBarOverlayLayout = this.c;
      if (actionBarOverlayLayout != null)
        actionBarOverlayLayout.setShowingForActionMode(false); 
      n(false);
    } 
    if (l.E((View)this.d)) {
      long l;
      q q1;
      q q2;
      if (paramBoolean) {
        q2 = this.e.i(4, 100L);
        q1 = this.f.e(0, 200L);
      } else {
        q1 = this.e.i(0, 200L);
        q2 = this.f.e(8, 100L);
      } 
      g g1 = new g();
      g1.a.add(q2);
      View view = q2.a.get();
      if (view != null) {
        l = view.animate().getDuration();
      } else {
        l = 0L;
      } 
      view = q1.a.get();
      if (view != null)
        view.animate().setStartDelay(l); 
      g1.a.add(q1);
      g1.b();
    } else if (paramBoolean) {
      this.e.k(4);
      this.f.setVisibility(0);
    } else {
      this.e.k(0);
      this.f.setVisibility(8);
    } 
  }
  
  public final void l(View paramView) {
    String str;
    StringBuilder stringBuilder2;
    ActionBarOverlayLayout actionBarOverlayLayout = (ActionBarOverlayLayout)paramView.findViewById(f.decor_content_parent);
    this.c = actionBarOverlayLayout;
    if (actionBarOverlayLayout != null)
      actionBarOverlayLayout.setActionBarVisibilityCallback(this); 
    View view = paramView.findViewById(f.action_bar);
    if (view instanceof d0) {
      d0 d02 = (d0)view;
    } else if (view instanceof Toolbar) {
      d0 d02 = ((Toolbar)view).getWrapper();
    } else {
      stringBuilder2 = c.a.a.a.a.e("Can't make a decor toolbar out of ");
      if (view != null) {
        str = view.getClass().getSimpleName();
      } else {
        str = "null";
      } 
      stringBuilder2.append(str);
      throw new IllegalStateException(stringBuilder2.toString());
    } 
    this.e = (d0)stringBuilder2;
    this.f = (ActionBarContextView)str.findViewById(f.action_context_bar);
    ActionBarContainer actionBarContainer = (ActionBarContainer)str.findViewById(f.action_bar_container);
    this.d = actionBarContainer;
    d0 d01 = this.e;
    if (d01 != null && this.f != null && actionBarContainer != null) {
      boolean bool1;
      boolean bool2;
      this.a = d01.t();
      if ((this.e.j() & 0x4) != 0) {
        i = 1;
      } else {
        i = 0;
      } 
      if (i)
        this.h = true; 
      Context context = this.a;
      if ((context.getApplicationInfo()).targetSdkVersion < 14) {
        bool1 = true;
      } else {
        bool1 = false;
      } 
      if (bool1 || i) {
        bool2 = true;
      } else {
        bool2 = false;
      } 
      this.e.q(bool2);
      m(context.getResources().getBoolean(b.b.b.abc_action_bar_embed_tabs));
      TypedArray typedArray = this.a.obtainStyledAttributes(null, j.ActionBar, b.b.a.actionBarStyle, 0);
      if (typedArray.getBoolean(j.ActionBar_hideOnContentScroll, false)) {
        ActionBarOverlayLayout actionBarOverlayLayout1 = this.c;
        if (actionBarOverlayLayout1.i) {
          this.w = true;
          actionBarOverlayLayout1.setHideOnContentScrollEnabled(true);
        } else {
          throw new IllegalStateException("Action bar must be in overlay mode (Window.FEATURE_OVERLAY_ACTION_BAR) to enable hide on content scroll");
        } 
      } 
      int i = typedArray.getDimensionPixelSize(j.ActionBar_elevation, 0);
      if (i != 0) {
        float f = i;
        l.b0((View)this.d, f);
      } 
      typedArray.recycle();
      return;
    } 
    StringBuilder stringBuilder1 = new StringBuilder();
    stringBuilder1.append(u.class.getSimpleName());
    stringBuilder1.append(" can only be used with a compatible window decor layout");
    throw new IllegalStateException(stringBuilder1.toString());
  }
  
  public final void m(boolean paramBoolean) {
    this.n = paramBoolean;
    if (!paramBoolean) {
      this.e.o(null);
      this.d.setTabContainer(null);
    } else {
      this.d.setTabContainer(null);
      this.e.o(null);
    } 
    int i = this.e.v();
    boolean bool = true;
    if (i == 2) {
      i = 1;
    } else {
      i = 0;
    } 
    d0 d01 = this.e;
    if (!this.n && i != 0) {
      paramBoolean = true;
    } else {
      paramBoolean = false;
    } 
    d01.s(paramBoolean);
    ActionBarOverlayLayout actionBarOverlayLayout = this.c;
    if (!this.n && i != 0) {
      paramBoolean = bool;
    } else {
      paramBoolean = false;
    } 
    actionBarOverlayLayout.setHasNonEmbeddedTabs(paramBoolean);
  }
  
  public final void n(boolean paramBoolean) {
    boolean bool;
    boolean bool1 = this.r;
    if (!this.s && bool1) {
      bool = false;
    } else {
      bool = true;
    } 
    if (bool) {
      if (!this.t) {
        this.t = true;
        g g1 = this.u;
        if (g1 != null)
          g1.a(); 
        this.d.setVisibility(0);
        if (this.o == 0 && (this.v || paramBoolean)) {
          this.d.setTranslationY(0.0F);
          float f2 = -this.d.getHeight();
          float f1 = f2;
          if (paramBoolean) {
            int[] arrayOfInt = new int[2];
            arrayOfInt[0] = 0;
            arrayOfInt[1] = 0;
            this.d.getLocationInWindow(arrayOfInt);
            f1 = f2 - arrayOfInt[1];
          } 
          this.d.setTranslationY(f1);
          g1 = new g();
          q q = l.a((View)this.d);
          q.g(0.0F);
          q.f(this.z);
          if (!g1.e)
            g1.a.add(q); 
          if (this.p) {
            View view = this.g;
            if (view != null) {
              view.setTranslationY(f1);
              q q1 = l.a(this.g);
              q1.g(0.0F);
              if (!g1.e)
                g1.a.add(q1); 
            } 
          } 
          Interpolator interpolator = B;
          if (!g1.e)
            g1.c = interpolator; 
          if (!g1.e)
            g1.b = 250L; 
          r r1 = this.y;
          if (!g1.e)
            g1.d = r1; 
          this.u = g1;
          g1.b();
        } else {
          this.d.setAlpha(1.0F);
          this.d.setTranslationY(0.0F);
          if (this.p) {
            View view = this.g;
            if (view != null)
              view.setTranslationY(0.0F); 
          } 
          this.y.a(null);
        } 
        ActionBarOverlayLayout actionBarOverlayLayout = this.c;
        if (actionBarOverlayLayout != null)
          l.U((View)actionBarOverlayLayout); 
      } 
    } else if (this.t) {
      this.t = false;
      g g1 = this.u;
      if (g1 != null)
        g1.a(); 
      if (this.o == 0 && (this.v || paramBoolean)) {
        this.d.setAlpha(1.0F);
        this.d.setTransitioning(true);
        g1 = new g();
        float f2 = -this.d.getHeight();
        float f1 = f2;
        if (paramBoolean) {
          int[] arrayOfInt = new int[2];
          arrayOfInt[0] = 0;
          arrayOfInt[1] = 0;
          this.d.getLocationInWindow(arrayOfInt);
          f1 = f2 - arrayOfInt[1];
        } 
        q q = l.a((View)this.d);
        q.g(f1);
        q.f(this.z);
        if (!g1.e)
          g1.a.add(q); 
        if (this.p) {
          View view = this.g;
          if (view != null) {
            q q1 = l.a(view);
            q1.g(f1);
            if (!g1.e)
              g1.a.add(q1); 
          } 
        } 
        Interpolator interpolator = A;
        if (!g1.e)
          g1.c = interpolator; 
        if (!g1.e)
          g1.b = 250L; 
        r r1 = this.x;
        if (!g1.e)
          g1.d = r1; 
        this.u = g1;
        g1.b();
      } else {
        this.x.a(null);
      } 
    } 
  }
  
  public class a extends s {
    public final u a;
    
    public a(u this$0) {}
    
    public void a(View param1View) {
      u u1 = this.a;
      if (u1.p) {
        View view = u1.g;
        if (view != null) {
          view.setTranslationY(0.0F);
          this.a.d.setTranslationY(0.0F);
        } 
      } 
      this.a.d.setVisibility(8);
      this.a.d.setTransitioning(false);
      u1 = this.a;
      u1.u = null;
      b.b.o.a.a a1 = u1.k;
      if (a1 != null) {
        a1.b(u1.j);
        u1.j = null;
        u1.k = null;
      } 
      ActionBarOverlayLayout actionBarOverlayLayout = this.a.c;
      if (actionBarOverlayLayout != null)
        l.U((View)actionBarOverlayLayout); 
    }
  }
  
  public class b extends s {
    public final u a;
    
    public b(u this$0) {}
    
    public void a(View param1View) {
      u u1 = this.a;
      u1.u = null;
      u1.d.requestLayout();
    }
  }
  
  public class c implements t {
    public final u a;
    
    public c(u this$0) {}
  }
  
  public class d extends b.b.o.a implements g.a {
    public final Context d;
    
    public final g e;
    
    public b.b.o.a.a f;
    
    public WeakReference<View> g;
    
    public final u h;
    
    public d(u this$0, Context param1Context, b.b.o.a.a param1a) {
      this.d = param1Context;
      this.f = param1a;
      g g1 = new g(param1Context);
      g1.l = 1;
      this.e = g1;
      g1.e = this;
    }
    
    public void a(g param1g) {
      if (this.f == null)
        return; 
      i();
      b.b.p.c c = ((b.b.p.a)this.h.f).e;
      if (c != null)
        c.n(); 
    }
    
    public boolean b(g param1g, MenuItem param1MenuItem) {
      b.b.o.a.a a1 = this.f;
      return (a1 != null) ? a1.c(this, param1MenuItem) : false;
    }
    
    public void c() {
      u u2 = this.h;
      if (u2.i != this)
        return; 
      boolean bool2 = u2.q;
      boolean bool1 = u2.r;
      boolean bool = true;
      if (bool2 || bool1)
        bool = false; 
      if (!bool) {
        u2 = this.h;
        u2.j = this;
        u2.k = this.f;
      } else {
        this.f.b(this);
      } 
      this.f = null;
      this.h.k(false);
      ActionBarContextView actionBarContextView = this.h.f;
      if (actionBarContextView.l == null)
        actionBarContextView.h(); 
      this.h.e.p().sendAccessibilityEvent(32);
      u u1 = this.h;
      u1.c.setHideOnContentScrollEnabled(u1.w);
      this.h.i = null;
    }
    
    public View d() {
      WeakReference<View> weakReference = this.g;
      if (weakReference != null) {
        View view = weakReference.get();
      } else {
        weakReference = null;
      } 
      return (View)weakReference;
    }
    
    public Menu e() {
      return (Menu)this.e;
    }
    
    public MenuInflater f() {
      return (MenuInflater)new f(this.d);
    }
    
    public CharSequence g() {
      return this.h.f.getSubtitle();
    }
    
    public CharSequence h() {
      return this.h.f.getTitle();
    }
    
    public void i() {
      if (this.h.i != this)
        return; 
      this.e.z();
      try {
        this.f.a(this, (Menu)this.e);
        return;
      } finally {
        this.e.y();
      } 
    }
    
    public boolean j() {
      return this.h.f.s;
    }
    
    public void k(View param1View) {
      this.h.f.setCustomView(param1View);
      this.g = new WeakReference<View>(param1View);
    }
    
    public void l(int param1Int) {
      String str = this.h.a.getResources().getString(param1Int);
      this.h.f.setSubtitle(str);
    }
    
    public void m(CharSequence param1CharSequence) {
      this.h.f.setSubtitle(param1CharSequence);
    }
    
    public void n(int param1Int) {
      String str = this.h.a.getResources().getString(param1Int);
      this.h.f.setTitle(str);
    }
    
    public void o(CharSequence param1CharSequence) {
      this.h.f.setTitle(param1CharSequence);
    }
    
    public void p(boolean param1Boolean) {
      this.c = param1Boolean;
      this.h.f.setTitleOptional(param1Boolean);
    }
  }
}


/* Location:              C:\Users\panch\Downloads\dvba_v1.1.0-dex2jar.jar!\b\b\\\u.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */