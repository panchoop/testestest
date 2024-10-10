package androidx.activity;

import android.app.Activity;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import b.a.c;
import b.i.d.d;
import b.n.d;
import b.n.e;
import b.n.f;
import b.n.g;
import b.n.h;
import b.n.o;
import b.n.s;
import b.n.t;
import b.s.c;

public class ComponentActivity extends d implements g, t, c, c {
  public final h c = new h(this);
  
  public final b.s.b d = new b.s.b(this);
  
  public s e;
  
  public final OnBackPressedDispatcher f = new OnBackPressedDispatcher(new a(this));
  
  public ComponentActivity() {
    h h1 = this.c;
    if (h1 != null) {
      h1.a((f)new e(this) {
            public final ComponentActivity a;
            
            public void g(g param1g, d.a param1a) {
              if (param1a == d.a.ON_STOP) {
                Window window = this.a.getWindow();
                if (window != null) {
                  View view = window.peekDecorView();
                } else {
                  window = null;
                } 
                if (window != null)
                  window.cancelPendingInputEvents(); 
              } 
            }
          });
      this.c.a((f)new e(this) {
            public final ComponentActivity a;
            
            public void g(g param1g, d.a param1a) {
              if (param1a == d.a.ON_DESTROY && !this.a.isChangingConfigurations())
                this.a.f().a(); 
            }
          });
      if (Build.VERSION.SDK_INT <= 23)
        this.c.a((f)new ImmLeaksCleaner((Activity)this)); 
      return;
    } 
    throw new IllegalStateException("getLifecycle() returned null in ComponentActivity's constructor. Please make sure you are lazily constructing your Lifecycle in the first call to getLifecycle() rather than relying on field initialization.");
  }
  
  public d a() {
    return (d)this.c;
  }
  
  public final OnBackPressedDispatcher d() {
    return this.f;
  }
  
  public final b.s.a e() {
    return this.d.b;
  }
  
  public s f() {
    if (getApplication() != null) {
      if (this.e == null) {
        b b1 = (b)getLastNonConfigurationInstance();
        if (b1 != null)
          this.e = b1.a; 
        if (this.e == null)
          this.e = new s(); 
      } 
      return this.e;
    } 
    throw new IllegalStateException("Your activity is not yet attached to the Application instance. You can't request ViewModel before onCreate call.");
  }
  
  public void onBackPressed() {
    this.f.a();
  }
  
  public void onCreate(Bundle paramBundle) {
    super.onCreate(paramBundle);
    this.d.a(paramBundle);
    o.b((Activity)this);
  }
  
  public final Object onRetainNonConfigurationInstance() {
    s s2 = this.e;
    s s1 = s2;
    if (s2 == null) {
      b b2 = (b)getLastNonConfigurationInstance();
      s1 = s2;
      if (b2 != null)
        s1 = b2.a; 
    } 
    if (s1 == null)
      return null; 
    b b1 = new b();
    b1.a = s1;
    return b1;
  }
  
  public void onSaveInstanceState(Bundle paramBundle) {
    h h1 = this.c;
    if (h1 instanceof h)
      h1.f(d.b.d); 
    super.onSaveInstanceState(paramBundle);
    this.d.b(paramBundle);
  }
  
  public class a implements Runnable {
    public final ComponentActivity b;
    
    public a(ComponentActivity this$0) {}
    
    public void run() {
      ComponentActivity.k(this.b);
    }
  }
  
  public static final class b {
    public s a;
  }
}


/* Location:              C:\Users\panch\Downloads\dvba_v1.1.0-dex2jar.jar!\androidx\activity\ComponentActivity.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */