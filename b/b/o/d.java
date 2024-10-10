package b.b.o;

import android.content.Context;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import androidx.appcompat.widget.ActionBarContextView;
import b.b.o.i.g;
import b.b.p.a;
import b.b.p.c;
import java.lang.ref.WeakReference;

public class d extends a implements g.a {
  public Context d;
  
  public ActionBarContextView e;
  
  public a.a f;
  
  public WeakReference<View> g;
  
  public boolean h;
  
  public g i;
  
  public d(Context paramContext, ActionBarContextView paramActionBarContextView, a.a parama, boolean paramBoolean) {
    this.d = paramContext;
    this.e = paramActionBarContextView;
    this.f = parama;
    g g1 = new g(paramActionBarContextView.getContext());
    g1.l = 1;
    this.i = g1;
    g1.e = this;
  }
  
  public void a(g paramg) {
    i();
    c c = ((a)this.e).e;
    if (c != null)
      c.n(); 
  }
  
  public boolean b(g paramg, MenuItem paramMenuItem) {
    return this.f.c(this, paramMenuItem);
  }
  
  public void c() {
    if (this.h)
      return; 
    this.h = true;
    this.e.sendAccessibilityEvent(32);
    this.f.b(this);
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
    return (Menu)this.i;
  }
  
  public MenuInflater f() {
    return new f(this.e.getContext());
  }
  
  public CharSequence g() {
    return this.e.getSubtitle();
  }
  
  public CharSequence h() {
    return this.e.getTitle();
  }
  
  public void i() {
    this.f.a(this, (Menu)this.i);
  }
  
  public boolean j() {
    return this.e.s;
  }
  
  public void k(View paramView) {
    this.e.setCustomView(paramView);
    if (paramView != null) {
      WeakReference<View> weakReference = new WeakReference<View>(paramView);
    } else {
      paramView = null;
    } 
    this.g = (WeakReference<View>)paramView;
  }
  
  public void l(int paramInt) {
    String str = this.d.getString(paramInt);
    this.e.setSubtitle(str);
  }
  
  public void m(CharSequence paramCharSequence) {
    this.e.setSubtitle(paramCharSequence);
  }
  
  public void n(int paramInt) {
    String str = this.d.getString(paramInt);
    this.e.setTitle(str);
  }
  
  public void o(CharSequence paramCharSequence) {
    this.e.setTitle(paramCharSequence);
  }
  
  public void p(boolean paramBoolean) {
    this.c = paramBoolean;
    this.e.setTitleOptional(paramBoolean);
  }
}


/* Location:              C:\Users\panch\Downloads\dvba_v1.1.0-dex2jar.jar!\b\b\o\d.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */