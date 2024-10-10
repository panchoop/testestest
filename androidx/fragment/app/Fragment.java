package androidx.fragment.app;

import android.animation.Animator;
import android.app.Activity;
import android.content.ComponentCallbacks;
import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.os.Bundle;
import android.os.Looper;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.SparseArray;
import android.view.ContextMenu;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.View;
import android.view.ViewGroup;
import b.i.d.l;
import b.l.a.c0;
import b.l.a.e;
import b.l.a.h;
import b.l.a.i;
import b.l.a.j;
import b.l.a.k;
import b.l.a.p;
import b.n.e;
import b.n.f;
import b.n.g;
import b.n.h;
import b.n.l;
import b.n.s;
import b.n.t;
import b.s.c;
import java.lang.reflect.InvocationTargetException;
import java.util.UUID;

public class Fragment implements ComponentCallbacks, View.OnCreateContextMenuListener, g, t, c {
  public static final Object V = new Object();
  
  public boolean A;
  
  public boolean B;
  
  public boolean C;
  
  public boolean D = true;
  
  public boolean E;
  
  public ViewGroup F;
  
  public View G;
  
  public View H;
  
  public boolean I;
  
  public boolean J = true;
  
  public b K;
  
  public boolean L;
  
  public boolean M;
  
  public float N;
  
  public LayoutInflater O;
  
  public boolean P;
  
  public b.n.d.b Q = b.n.d.b.f;
  
  public h R;
  
  public c0 S;
  
  public l<g> T = new l();
  
  public b.s.b U;
  
  public int b = 0;
  
  public Bundle c;
  
  public SparseArray<Parcelable> d;
  
  public Boolean e;
  
  public String f = UUID.randomUUID().toString();
  
  public Bundle g;
  
  public Fragment h;
  
  public String i = null;
  
  public int j;
  
  public Boolean k = null;
  
  public boolean l;
  
  public boolean m;
  
  public boolean n;
  
  public boolean o;
  
  public boolean p;
  
  public boolean q;
  
  public int r;
  
  public k s;
  
  public i t;
  
  public k u = new k();
  
  public Fragment v;
  
  public int w;
  
  public int x;
  
  public String y;
  
  public boolean z;
  
  public Fragment() {
    u();
  }
  
  @Deprecated
  public static Fragment v(Context paramContext, String paramString, Bundle paramBundle) {
    try {
      Fragment fragment = h.d(paramContext.getClassLoader(), paramString).getConstructor(new Class[0]).newInstance(new Object[0]);
      if (paramBundle != null) {
        paramBundle.setClassLoader(fragment.getClass().getClassLoader());
        fragment.T(paramBundle);
      } 
      return fragment;
    } catch (InstantiationException instantiationException) {
      StringBuilder stringBuilder = new StringBuilder();
      stringBuilder.append("Unable to instantiate fragment ");
      stringBuilder.append(paramString);
      stringBuilder.append(": make sure class name exists, is public, and has an empty constructor that is public");
      throw new c(stringBuilder.toString(), instantiationException);
    } catch (IllegalAccessException illegalAccessException) {
      StringBuilder stringBuilder = new StringBuilder();
      stringBuilder.append("Unable to instantiate fragment ");
      stringBuilder.append(paramString);
      stringBuilder.append(": make sure class name exists, is public, and has an empty constructor that is public");
      throw new c(stringBuilder.toString(), illegalAccessException);
    } catch (NoSuchMethodException noSuchMethodException) {
      StringBuilder stringBuilder = new StringBuilder();
      stringBuilder.append("Unable to instantiate fragment ");
      stringBuilder.append(paramString);
      stringBuilder.append(": could not find Fragment constructor");
      throw new c(stringBuilder.toString(), noSuchMethodException);
    } catch (InvocationTargetException invocationTargetException) {
      StringBuilder stringBuilder = new StringBuilder();
      stringBuilder.append("Unable to instantiate fragment ");
      stringBuilder.append(paramString);
      stringBuilder.append(": calling Fragment constructor caused an exception");
      throw new c(stringBuilder.toString(), invocationTargetException);
    } 
  }
  
  public void A(Bundle paramBundle) {
    boolean bool = true;
    this.E = true;
    if (paramBundle != null) {
      Parcelable parcelable = paramBundle.getParcelable("android:support:fragments");
      if (parcelable != null) {
        this.u.j0(parcelable);
        this.u.o();
      } 
    } 
    if (this.u.p < 1)
      bool = false; 
    if (!bool)
      this.u.o(); 
  }
  
  public View B(LayoutInflater paramLayoutInflater, ViewGroup paramViewGroup, Bundle paramBundle) {
    return null;
  }
  
  public void C() {
    this.E = true;
  }
  
  public void D() {
    this.E = true;
  }
  
  public LayoutInflater E(Bundle paramBundle) {
    i i1 = this.t;
    if (i1 != null) {
      e.a a = (e.a)i1;
      LayoutInflater layoutInflater = a.g.getLayoutInflater().cloneInContext((Context)a.g);
      k k1 = this.u;
      if (k1 != null) {
        layoutInflater.setFactory2((LayoutInflater.Factory2)k1);
        return layoutInflater;
      } 
      throw null;
    } 
    throw new IllegalStateException("onGetLayoutInflater() cannot be executed until the Fragment is attached to the FragmentManager.");
  }
  
  public void F(AttributeSet paramAttributeSet, Bundle paramBundle) {
    Activity activity;
    this.E = true;
    i i1 = this.t;
    if (i1 == null) {
      i1 = null;
    } else {
      activity = i1.b;
    } 
    if (activity != null) {
      this.E = false;
      this.E = true;
    } 
  }
  
  public void G() {
    this.E = true;
  }
  
  public void H() {
    this.E = true;
  }
  
  public void I(Bundle paramBundle) {}
  
  public void J() {
    this.E = true;
  }
  
  public void K() {
    this.E = true;
  }
  
  public boolean L(Menu paramMenu, MenuInflater paramMenuInflater) {
    boolean bool = this.z;
    int j = 0;
    if (!bool)
      j = false | this.u.p(paramMenu, paramMenuInflater); 
    return j;
  }
  
  public void M(LayoutInflater paramLayoutInflater, ViewGroup paramViewGroup, Bundle paramBundle) {
    this.u.e0();
    boolean bool = true;
    this.q = true;
    this.S = new c0();
    View view = B(paramLayoutInflater, paramViewGroup, paramBundle);
    this.G = view;
    if (view != null) {
      c0 c01 = this.S;
      if (c01.b == null)
        c01.b = new h((g)c01); 
      this.T.g(this.S);
    } else {
      if (this.S.b == null)
        bool = false; 
      if (!bool) {
        this.S = null;
        return;
      } 
      throw new IllegalStateException("Called getViewLifecycleOwner() but onCreateView() returned null");
    } 
  }
  
  public void N() {
    this.E = true;
    this.u.r();
  }
  
  public boolean O(Menu paramMenu) {
    boolean bool = this.z;
    int j = 0;
    if (!bool)
      j = false | this.u.L(paramMenu); 
    return j;
  }
  
  public final j P() {
    k k1 = this.s;
    if (k1 != null)
      return (j)k1; 
    throw new IllegalStateException(c.a.a.a.a.b("Fragment ", this, " not associated with a fragment manager."));
  }
  
  public final View Q() {
    View view = this.G;
    if (view != null)
      return view; 
    throw new IllegalStateException(c.a.a.a.a.b("Fragment ", this, " did not return a View from onCreateView() or this was called before onCreateView()."));
  }
  
  public void R(View paramView) {
    (c()).a = paramView;
  }
  
  public void S(Animator paramAnimator) {
    (c()).b = paramAnimator;
  }
  
  public void T(Bundle paramBundle) {
    k k1 = this.s;
    if (k1 != null) {
      boolean bool;
      if (k1 == null) {
        bool = false;
      } else {
        bool = k1.c();
      } 
      if (bool)
        throw new IllegalStateException("Fragment already added and state has been saved"); 
    } 
    this.g = paramBundle;
  }
  
  public void U(boolean paramBoolean) {
    (c()).s = paramBoolean;
  }
  
  public void V(int paramInt) {
    if (this.K == null && paramInt == 0)
      return; 
    (c()).d = paramInt;
  }
  
  public void W(d paramd) {
    c();
    d d1 = this.K.r;
    if (paramd == d1)
      return; 
    if (paramd == null || d1 == null) {
      b b1 = this.K;
      if (b1.q)
        b1.r = paramd; 
      if (paramd != null) {
        k.j j = (k.j)paramd;
        j.c++;
      } 
      return;
    } 
    StringBuilder stringBuilder = new StringBuilder();
    stringBuilder.append("Trying to set a replacement startPostponedEnterTransition on ");
    stringBuilder.append(this);
    throw new IllegalStateException(stringBuilder.toString());
  }
  
  public void X(boolean paramBoolean) {
    this.B = paramBoolean;
    k k1 = this.s;
    if (k1 != null) {
      if (paramBoolean) {
        if (!k1.c())
          k1.F.b.add(this); 
      } else {
        k1.i0(this);
      } 
    } else {
      this.C = true;
    } 
  }
  
  public void Y() {
    k k1 = this.s;
    if (k1 == null || k1.q == null) {
      (c()).q = false;
      return;
    } 
    if (Looper.myLooper() != this.s.q.d.getLooper()) {
      this.s.q.d.postAtFrontOfQueue(new a(this));
    } else {
      b();
    } 
  }
  
  public b.n.d a() {
    return (b.n.d)this.R;
  }
  
  public void b() {
    b b1 = this.K;
    d d = null;
    if (b1 != null) {
      b1.q = false;
      d = b1.r;
      b1.r = null;
    } 
    if (d != null) {
      k.j j1 = (k.j)d;
      int j = j1.c - 1;
      j1.c = j;
      if (j == 0)
        j1.b.r.n0(); 
    } 
  }
  
  public final b c() {
    if (this.K == null)
      this.K = new b(); 
    return this.K;
  }
  
  public final b.s.a e() {
    return this.U.b;
  }
  
  public final boolean equals(Object paramObject) {
    return super.equals(paramObject);
  }
  
  public s f() {
    k k1 = this.s;
    if (k1 != null) {
      p p = k1.F;
      s s2 = (s)p.d.get(this.f);
      s s1 = s2;
      if (s2 == null) {
        s1 = new s();
        p.d.put(this.f, s1);
      } 
      return s1;
    } 
    throw new IllegalStateException("Can't access ViewModels from detached fragment");
  }
  
  public final e g() {
    e e;
    i i1 = this.t;
    if (i1 == null) {
      i1 = null;
    } else {
      e = (e)i1.b;
    } 
    return e;
  }
  
  public View h() {
    b b1 = this.K;
    return (b1 == null) ? null : b1.a;
  }
  
  public final int hashCode() {
    return super.hashCode();
  }
  
  public Animator i() {
    b b1 = this.K;
    return (b1 == null) ? null : b1.b;
  }
  
  public final j j() {
    if (this.t != null)
      return (j)this.u; 
    throw new IllegalStateException(c.a.a.a.a.b("Fragment ", this, " has not been attached yet."));
  }
  
  public Context k() {
    Context context;
    i i1 = this.t;
    if (i1 == null) {
      i1 = null;
    } else {
      context = i1.c;
    } 
    return context;
  }
  
  public Object l() {
    b b1 = this.K;
    return (b1 == null) ? null : b1.g;
  }
  
  public Object m() {
    b b1 = this.K;
    return (b1 == null) ? null : b1.i;
  }
  
  public int n() {
    b b1 = this.K;
    return (b1 == null) ? 0 : b1.d;
  }
  
  public int o() {
    b b1 = this.K;
    return (b1 == null) ? 0 : b1.e;
  }
  
  public void onConfigurationChanged(Configuration paramConfiguration) {
    this.E = true;
  }
  
  public void onCreateContextMenu(ContextMenu paramContextMenu, View paramView, ContextMenu.ContextMenuInfo paramContextMenuInfo) {
    e e = g();
    if (e != null) {
      e.onCreateContextMenu(paramContextMenu, paramView, paramContextMenuInfo);
      return;
    } 
    throw new IllegalStateException(c.a.a.a.a.b("Fragment ", this, " not attached to an activity."));
  }
  
  public void onLowMemory() {
    this.E = true;
  }
  
  public int p() {
    b b1 = this.K;
    return (b1 == null) ? 0 : b1.f;
  }
  
  public final Resources q() {
    Context context = k();
    if (context != null)
      return context.getResources(); 
    throw new IllegalStateException(c.a.a.a.a.b("Fragment ", this, " not attached to a context."));
  }
  
  public Object r() {
    b b1 = this.K;
    return (b1 == null) ? null : b1.k;
  }
  
  public int s() {
    b b1 = this.K;
    return (b1 == null) ? 0 : b1.c;
  }
  
  public final String t(int paramInt) {
    return q().getString(paramInt);
  }
  
  public String toString() {
    StringBuilder stringBuilder = new StringBuilder(128);
    a.a.a.a.a.d(this, stringBuilder);
    stringBuilder.append(" (");
    stringBuilder.append(this.f);
    stringBuilder.append(")");
    if (this.w != 0) {
      stringBuilder.append(" id=0x");
      stringBuilder.append(Integer.toHexString(this.w));
    } 
    if (this.y != null) {
      stringBuilder.append(" ");
      stringBuilder.append(this.y);
    } 
    stringBuilder.append('}');
    return stringBuilder.toString();
  }
  
  public final void u() {
    this.R = new h(this);
    this.U = new b.s.b(this);
    this.R.a((f)new e(this) {
          public final Fragment a;
          
          public void g(g param1g, b.n.d.a param1a) {
            if (param1a == b.n.d.a.ON_STOP) {
              View view = this.a.G;
              if (view != null)
                view.cancelPendingInputEvents(); 
            } 
          }
        });
  }
  
  public boolean w() {
    b b1 = this.K;
    return (b1 == null) ? false : b1.s;
  }
  
  public final boolean x() {
    boolean bool;
    if (this.r > 0) {
      bool = true;
    } else {
      bool = false;
    } 
    return bool;
  }
  
  public void y(Bundle paramBundle) {
    this.E = true;
  }
  
  public void z(Context paramContext) {
    Activity activity;
    this.E = true;
    i i1 = this.t;
    if (i1 == null) {
      i1 = null;
    } else {
      activity = i1.b;
    } 
    if (activity != null) {
      this.E = false;
      this.E = true;
    } 
  }
  
  public class a implements Runnable {
    public final Fragment b;
    
    public a(Fragment this$0) {}
    
    public void run() {
      this.b.b();
    }
  }
  
  public static class b {
    public View a;
    
    public Animator b;
    
    public int c;
    
    public int d;
    
    public int e;
    
    public int f;
    
    public Object g = null;
    
    public Object h;
    
    public Object i;
    
    public Object j;
    
    public Object k;
    
    public Object l;
    
    public Boolean m;
    
    public Boolean n;
    
    public l o;
    
    public l p;
    
    public boolean q;
    
    public Fragment.d r;
    
    public boolean s;
    
    public b() {
      Object object = Fragment.V;
      this.h = object;
      this.i = null;
      this.j = object;
      this.k = null;
      this.l = object;
      this.o = null;
      this.p = null;
    }
  }
  
  public static class c extends RuntimeException {
    public c(String param1String, Exception param1Exception) {
      super(param1String, param1Exception);
    }
  }
  
  public static interface d {}
}


/* Location:              C:\Users\panch\Downloads\dvba_v1.1.0-dex2jar.jar!\androidx\fragment\app\Fragment.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */