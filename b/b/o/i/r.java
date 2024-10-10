package b.b.o.i;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;

public class r extends g implements SubMenu {
  public g A;
  
  public i B;
  
  public r(Context paramContext, g paramg, i parami) {
    super(paramContext);
    this.A = paramg;
    this.B = parami;
  }
  
  public boolean d(i parami) {
    return this.A.d(parami);
  }
  
  public boolean e(g paramg, MenuItem paramMenuItem) {
    return (super.e(paramg, paramMenuItem) || this.A.e(paramg, paramMenuItem));
  }
  
  public boolean f(i parami) {
    return this.A.f(parami);
  }
  
  public MenuItem getItem() {
    return (MenuItem)this.B;
  }
  
  public String j() {
    boolean bool;
    i i1 = this.B;
    if (i1 != null) {
      bool = i1.a;
    } else {
      bool = false;
    } 
    if (!bool)
      return null; 
    StringBuilder stringBuilder = new StringBuilder();
    stringBuilder.append("android:menu:actionviewstates");
    stringBuilder.append(":");
    stringBuilder.append(bool);
    return stringBuilder.toString();
  }
  
  public g k() {
    return this.A.k();
  }
  
  public boolean m() {
    return this.A.m();
  }
  
  public boolean n() {
    return this.A.n();
  }
  
  public boolean o() {
    return this.A.o();
  }
  
  public void setGroupDividerEnabled(boolean paramBoolean) {
    this.A.setGroupDividerEnabled(paramBoolean);
  }
  
  public SubMenu setHeaderIcon(int paramInt) {
    x(0, null, paramInt, null, null);
    return this;
  }
  
  public SubMenu setHeaderIcon(Drawable paramDrawable) {
    x(0, null, 0, paramDrawable, null);
    return this;
  }
  
  public SubMenu setHeaderTitle(int paramInt) {
    x(paramInt, null, 0, null, null);
    return this;
  }
  
  public SubMenu setHeaderTitle(CharSequence paramCharSequence) {
    x(0, paramCharSequence, 0, null, null);
    return this;
  }
  
  public SubMenu setHeaderView(View paramView) {
    x(0, null, 0, null, paramView);
    return this;
  }
  
  public SubMenu setIcon(int paramInt) {
    this.B.setIcon(paramInt);
    return this;
  }
  
  public SubMenu setIcon(Drawable paramDrawable) {
    this.B.setIcon(paramDrawable);
    return this;
  }
  
  public void setQwertyMode(boolean paramBoolean) {
    this.A.setQwertyMode(paramBoolean);
  }
}


/* Location:              C:\Users\panch\Downloads\dvba_v1.1.0-dex2jar.jar!\b\b\o\i\r.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */