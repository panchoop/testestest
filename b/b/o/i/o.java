package b.b.o.i;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.MenuItem;
import android.view.SubMenu;
import b.f.h;
import b.i.h.a.a;
import b.i.h.a.b;
import b.i.h.a.c;

public class o extends c implements Menu {
  public final a d;
  
  public o(Context paramContext, a parama) {
    super(paramContext);
    if (parama != null) {
      this.d = parama;
      return;
    } 
    throw new IllegalArgumentException("Wrapped Object can not be null.");
  }
  
  public MenuItem add(int paramInt) {
    return c(this.d.add(paramInt));
  }
  
  public MenuItem add(int paramInt1, int paramInt2, int paramInt3, int paramInt4) {
    return c(this.d.add(paramInt1, paramInt2, paramInt3, paramInt4));
  }
  
  public MenuItem add(int paramInt1, int paramInt2, int paramInt3, CharSequence paramCharSequence) {
    return c(this.d.add(paramInt1, paramInt2, paramInt3, paramCharSequence));
  }
  
  public MenuItem add(CharSequence paramCharSequence) {
    return c(this.d.add(paramCharSequence));
  }
  
  public int addIntentOptions(int paramInt1, int paramInt2, int paramInt3, ComponentName paramComponentName, Intent[] paramArrayOfIntent, Intent paramIntent, int paramInt4, MenuItem[] paramArrayOfMenuItem) {
    MenuItem[] arrayOfMenuItem;
    if (paramArrayOfMenuItem != null) {
      arrayOfMenuItem = new MenuItem[paramArrayOfMenuItem.length];
    } else {
      arrayOfMenuItem = null;
    } 
    paramInt2 = this.d.addIntentOptions(paramInt1, paramInt2, paramInt3, paramComponentName, paramArrayOfIntent, paramIntent, paramInt4, arrayOfMenuItem);
    if (arrayOfMenuItem != null) {
      paramInt1 = 0;
      paramInt3 = arrayOfMenuItem.length;
      while (paramInt1 < paramInt3) {
        paramArrayOfMenuItem[paramInt1] = c(arrayOfMenuItem[paramInt1]);
        paramInt1++;
      } 
    } 
    return paramInt2;
  }
  
  public SubMenu addSubMenu(int paramInt) {
    return d(this.d.addSubMenu(paramInt));
  }
  
  public SubMenu addSubMenu(int paramInt1, int paramInt2, int paramInt3, int paramInt4) {
    return d(this.d.addSubMenu(paramInt1, paramInt2, paramInt3, paramInt4));
  }
  
  public SubMenu addSubMenu(int paramInt1, int paramInt2, int paramInt3, CharSequence paramCharSequence) {
    return d(this.d.addSubMenu(paramInt1, paramInt2, paramInt3, paramCharSequence));
  }
  
  public SubMenu addSubMenu(CharSequence paramCharSequence) {
    return d(this.d.addSubMenu(paramCharSequence));
  }
  
  public void clear() {
    h<b, MenuItem> h1 = this.b;
    if (h1 != null)
      h1.clear(); 
    h<c, SubMenu> h = this.c;
    if (h != null)
      h.clear(); 
    this.d.clear();
  }
  
  public void close() {
    this.d.close();
  }
  
  public MenuItem findItem(int paramInt) {
    return c(this.d.findItem(paramInt));
  }
  
  public MenuItem getItem(int paramInt) {
    return c(this.d.getItem(paramInt));
  }
  
  public boolean hasVisibleItems() {
    return this.d.hasVisibleItems();
  }
  
  public boolean isShortcutKey(int paramInt, KeyEvent paramKeyEvent) {
    return this.d.isShortcutKey(paramInt, paramKeyEvent);
  }
  
  public boolean performIdentifierAction(int paramInt1, int paramInt2) {
    return this.d.performIdentifierAction(paramInt1, paramInt2);
  }
  
  public boolean performShortcut(int paramInt1, KeyEvent paramKeyEvent, int paramInt2) {
    return this.d.performShortcut(paramInt1, paramKeyEvent, paramInt2);
  }
  
  public void removeGroup(int paramInt) {
    if (this.b != null) {
      int i = 0;
      while (true) {
        h<b, MenuItem> h = this.b;
        if (i < h.d) {
          int j = i;
          if (((b)h.h(i)).getGroupId() == paramInt) {
            this.b.i(i);
            j = i - 1;
          } 
          i = j + 1;
          continue;
        } 
        break;
      } 
    } 
    this.d.removeGroup(paramInt);
  }
  
  public void removeItem(int paramInt) {
    if (this.b != null) {
      byte b = 0;
      while (true) {
        h<b, MenuItem> h = this.b;
        if (b < h.d) {
          if (((b)h.h(b)).getItemId() == paramInt) {
            this.b.i(b);
            break;
          } 
          b++;
          continue;
        } 
        break;
      } 
    } 
    this.d.removeItem(paramInt);
  }
  
  public void setGroupCheckable(int paramInt, boolean paramBoolean1, boolean paramBoolean2) {
    this.d.setGroupCheckable(paramInt, paramBoolean1, paramBoolean2);
  }
  
  public void setGroupEnabled(int paramInt, boolean paramBoolean) {
    this.d.setGroupEnabled(paramInt, paramBoolean);
  }
  
  public void setGroupVisible(int paramInt, boolean paramBoolean) {
    this.d.setGroupVisible(paramInt, paramBoolean);
  }
  
  public void setQwertyMode(boolean paramBoolean) {
    this.d.setQwertyMode(paramBoolean);
  }
  
  public int size() {
    return this.d.size();
  }
}


/* Location:              C:\Users\panch\Downloads\dvba_v1.1.0-dex2jar.jar!\b\b\o\i\o.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */