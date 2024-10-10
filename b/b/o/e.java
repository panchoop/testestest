package b.b.o;

import android.content.Context;
import android.view.ActionMode;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import b.b.o.i.j;
import b.b.o.i.o;
import b.f.h;
import b.i.h.a.b;
import java.util.ArrayList;

public class e extends ActionMode {
  public final Context a;
  
  public final a b;
  
  public e(Context paramContext, a parama) {
    this.a = paramContext;
    this.b = parama;
  }
  
  public void finish() {
    this.b.c();
  }
  
  public View getCustomView() {
    return this.b.d();
  }
  
  public Menu getMenu() {
    return (Menu)new o(this.a, (b.i.h.a.a)this.b.e());
  }
  
  public MenuInflater getMenuInflater() {
    return this.b.f();
  }
  
  public CharSequence getSubtitle() {
    return this.b.g();
  }
  
  public Object getTag() {
    return this.b.b;
  }
  
  public CharSequence getTitle() {
    return this.b.h();
  }
  
  public boolean getTitleOptionalHint() {
    return this.b.c;
  }
  
  public void invalidate() {
    this.b.i();
  }
  
  public boolean isTitleOptional() {
    return this.b.j();
  }
  
  public void setCustomView(View paramView) {
    this.b.k(paramView);
  }
  
  public void setSubtitle(int paramInt) {
    this.b.l(paramInt);
  }
  
  public void setSubtitle(CharSequence paramCharSequence) {
    this.b.m(paramCharSequence);
  }
  
  public void setTag(Object paramObject) {
    this.b.b = paramObject;
  }
  
  public void setTitle(int paramInt) {
    this.b.n(paramInt);
  }
  
  public void setTitle(CharSequence paramCharSequence) {
    this.b.o(paramCharSequence);
  }
  
  public void setTitleOptionalHint(boolean paramBoolean) {
    this.b.p(paramBoolean);
  }
  
  public static class a implements a.a {
    public final ActionMode.Callback a;
    
    public final Context b;
    
    public final ArrayList<e> c;
    
    public final h<Menu, Menu> d;
    
    public a(Context param1Context, ActionMode.Callback param1Callback) {
      this.b = param1Context;
      this.a = param1Callback;
      this.c = new ArrayList<e>();
      this.d = new h();
    }
    
    public boolean a(a param1a, Menu param1Menu) {
      return this.a.onPrepareActionMode(e(param1a), f(param1Menu));
    }
    
    public void b(a param1a) {
      this.a.onDestroyActionMode(e(param1a));
    }
    
    public boolean c(a param1a, MenuItem param1MenuItem) {
      return this.a.onActionItemClicked(e(param1a), (MenuItem)new j(this.b, (b)param1MenuItem));
    }
    
    public boolean d(a param1a, Menu param1Menu) {
      return this.a.onCreateActionMode(e(param1a), f(param1Menu));
    }
    
    public ActionMode e(a param1a) {
      int i = this.c.size();
      for (byte b = 0; b < i; b++) {
        e e1 = this.c.get(b);
        if (e1 != null && e1.b == param1a)
          return e1; 
      } 
      e e = new e(this.b, param1a);
      this.c.add(e);
      return e;
    }
    
    public final Menu f(Menu param1Menu) {
      o o;
      Menu menu2 = (Menu)this.d.getOrDefault(param1Menu, null);
      Menu menu1 = menu2;
      if (menu2 == null) {
        o = new o(this.b, (b.i.h.a.a)param1Menu);
        this.d.put(param1Menu, o);
      } 
      return (Menu)o;
    }
  }
}


/* Location:              C:\Users\panch\Downloads\dvba_v1.1.0-dex2jar.jar!\b\b\o\e.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */