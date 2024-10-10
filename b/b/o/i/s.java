package b.b.o.i;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;
import b.i.h.a.a;
import b.i.h.a.c;

public class s extends o implements SubMenu {
  public final c e;
  
  public s(Context paramContext, c paramc) {
    super(paramContext, (a)paramc);
    this.e = paramc;
  }
  
  public void clearHeader() {
    this.e.clearHeader();
  }
  
  public MenuItem getItem() {
    return c(this.e.getItem());
  }
  
  public SubMenu setHeaderIcon(int paramInt) {
    this.e.setHeaderIcon(paramInt);
    return this;
  }
  
  public SubMenu setHeaderIcon(Drawable paramDrawable) {
    this.e.setHeaderIcon(paramDrawable);
    return this;
  }
  
  public SubMenu setHeaderTitle(int paramInt) {
    this.e.setHeaderTitle(paramInt);
    return this;
  }
  
  public SubMenu setHeaderTitle(CharSequence paramCharSequence) {
    this.e.setHeaderTitle(paramCharSequence);
    return this;
  }
  
  public SubMenu setHeaderView(View paramView) {
    this.e.setHeaderView(paramView);
    return this;
  }
  
  public SubMenu setIcon(int paramInt) {
    this.e.setIcon(paramInt);
    return this;
  }
  
  public SubMenu setIcon(Drawable paramDrawable) {
    this.e.setIcon(paramDrawable);
    return this;
  }
}


/* Location:              C:\Users\panch\Downloads\dvba_v1.1.0-dex2jar.jar!\b\b\o\i\s.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */