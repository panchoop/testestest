package b.b.o.i;

import android.content.Context;
import android.view.MenuItem;
import android.view.SubMenu;
import b.f.h;
import b.i.h.a.b;

public abstract class c {
  public final Context a;
  
  public h<b, MenuItem> b;
  
  public h<b.i.h.a.c, SubMenu> c;
  
  public c(Context paramContext) {
    this.a = paramContext;
  }
  
  public final MenuItem c(MenuItem paramMenuItem) {
    MenuItem menuItem = paramMenuItem;
    if (paramMenuItem instanceof b) {
      b b = (b)paramMenuItem;
      if (this.b == null)
        this.b = new h(); 
      paramMenuItem = (MenuItem)this.b.getOrDefault(paramMenuItem, null);
      menuItem = paramMenuItem;
      if (paramMenuItem == null) {
        menuItem = new j(this.a, b);
        this.b.put(b, menuItem);
      } 
    } 
    return menuItem;
  }
  
  public final SubMenu d(SubMenu paramSubMenu) {
    if (paramSubMenu instanceof b.i.h.a.c) {
      b.i.h.a.c c1 = (b.i.h.a.c)paramSubMenu;
      if (this.c == null)
        this.c = new h(); 
      SubMenu subMenu = (SubMenu)this.c.get(c1);
      paramSubMenu = subMenu;
      if (subMenu == null) {
        paramSubMenu = new s(this.a, c1);
        this.c.put(c1, paramSubMenu);
      } 
      return paramSubMenu;
    } 
    return paramSubMenu;
  }
}


/* Location:              C:\Users\panch\Downloads\dvba_v1.1.0-dex2jar.jar!\b\b\o\i\c.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */