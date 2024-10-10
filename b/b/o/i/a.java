package b.b.o.i;

import android.content.Context;
import android.content.Intent;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.view.ActionProvider;
import android.view.ContextMenu;
import android.view.KeyEvent;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;
import b.i.h.a.b;
import b.i.m.b;

public class a implements b {
  public final int a;
  
  public final int b;
  
  public final int c;
  
  public CharSequence d;
  
  public CharSequence e;
  
  public Intent f;
  
  public char g;
  
  public int h = 4096;
  
  public char i;
  
  public int j = 4096;
  
  public Drawable k;
  
  public Context l;
  
  public CharSequence m;
  
  public CharSequence n;
  
  public ColorStateList o = null;
  
  public PorterDuff.Mode p = null;
  
  public boolean q = false;
  
  public boolean r = false;
  
  public int s = 16;
  
  public a(Context paramContext, int paramInt1, int paramInt2, int paramInt3, CharSequence paramCharSequence) {
    this.l = paramContext;
    this.a = paramInt2;
    this.b = paramInt1;
    this.c = paramInt3;
    this.d = paramCharSequence;
  }
  
  public b a() {
    return null;
  }
  
  public b b(b paramb) {
    throw new UnsupportedOperationException();
  }
  
  public final void c() {
    if (this.k != null && (this.q || this.r)) {
      Drawable drawable = a.a.a.a.a.C0(this.k);
      this.k = drawable;
      drawable = drawable.mutate();
      this.k = drawable;
      if (this.q)
        drawable.setTintList(this.o); 
      if (this.r)
        this.k.setTintMode(this.p); 
    } 
  }
  
  public boolean collapseActionView() {
    return false;
  }
  
  public boolean expandActionView() {
    return false;
  }
  
  public ActionProvider getActionProvider() {
    throw new UnsupportedOperationException();
  }
  
  public View getActionView() {
    return null;
  }
  
  public int getAlphabeticModifiers() {
    return this.j;
  }
  
  public char getAlphabeticShortcut() {
    return this.i;
  }
  
  public CharSequence getContentDescription() {
    return this.m;
  }
  
  public int getGroupId() {
    return this.b;
  }
  
  public Drawable getIcon() {
    return this.k;
  }
  
  public ColorStateList getIconTintList() {
    return this.o;
  }
  
  public PorterDuff.Mode getIconTintMode() {
    return this.p;
  }
  
  public Intent getIntent() {
    return this.f;
  }
  
  public int getItemId() {
    return this.a;
  }
  
  public ContextMenu.ContextMenuInfo getMenuInfo() {
    return null;
  }
  
  public int getNumericModifiers() {
    return this.h;
  }
  
  public char getNumericShortcut() {
    return this.g;
  }
  
  public int getOrder() {
    return this.c;
  }
  
  public SubMenu getSubMenu() {
    return null;
  }
  
  public CharSequence getTitle() {
    return this.d;
  }
  
  public CharSequence getTitleCondensed() {
    CharSequence charSequence = this.e;
    if (charSequence == null)
      charSequence = this.d; 
    return charSequence;
  }
  
  public CharSequence getTooltipText() {
    return this.n;
  }
  
  public boolean hasSubMenu() {
    return false;
  }
  
  public boolean isActionViewExpanded() {
    return false;
  }
  
  public boolean isCheckable() {
    int i = this.s;
    boolean bool = true;
    if ((i & 0x1) == 0)
      bool = false; 
    return bool;
  }
  
  public boolean isChecked() {
    boolean bool;
    if ((this.s & 0x2) != 0) {
      bool = true;
    } else {
      bool = false;
    } 
    return bool;
  }
  
  public boolean isEnabled() {
    boolean bool;
    if ((this.s & 0x10) != 0) {
      bool = true;
    } else {
      bool = false;
    } 
    return bool;
  }
  
  public boolean isVisible() {
    boolean bool;
    if ((this.s & 0x8) == 0) {
      bool = true;
    } else {
      bool = false;
    } 
    return bool;
  }
  
  public MenuItem setActionProvider(ActionProvider paramActionProvider) {
    throw new UnsupportedOperationException();
  }
  
  public MenuItem setActionView(int paramInt) {
    throw new UnsupportedOperationException();
  }
  
  public MenuItem setActionView(View paramView) {
    throw new UnsupportedOperationException();
  }
  
  public MenuItem setAlphabeticShortcut(char paramChar) {
    this.i = Character.toLowerCase(paramChar);
    return (MenuItem)this;
  }
  
  public MenuItem setAlphabeticShortcut(char paramChar, int paramInt) {
    this.i = Character.toLowerCase(paramChar);
    this.j = KeyEvent.normalizeMetaState(paramInt);
    return (MenuItem)this;
  }
  
  public MenuItem setCheckable(boolean paramBoolean) {
    this.s = paramBoolean | this.s & 0xFFFFFFFE;
    return (MenuItem)this;
  }
  
  public MenuItem setChecked(boolean paramBoolean) {
    boolean bool;
    int i = this.s;
    if (paramBoolean) {
      bool = true;
    } else {
      bool = false;
    } 
    this.s = bool | i & 0xFFFFFFFD;
    return (MenuItem)this;
  }
  
  public MenuItem setContentDescription(CharSequence paramCharSequence) {
    this.m = paramCharSequence;
    return (MenuItem)this;
  }
  
  public b setContentDescription(CharSequence paramCharSequence) {
    this.m = paramCharSequence;
    return this;
  }
  
  public MenuItem setEnabled(boolean paramBoolean) {
    boolean bool;
    int i = this.s;
    if (paramBoolean) {
      bool = true;
    } else {
      bool = false;
    } 
    this.s = bool | i & 0xFFFFFFEF;
    return (MenuItem)this;
  }
  
  public MenuItem setIcon(int paramInt) {
    this.k = b.i.e.a.c(this.l, paramInt);
    c();
    return (MenuItem)this;
  }
  
  public MenuItem setIcon(Drawable paramDrawable) {
    this.k = paramDrawable;
    c();
    return (MenuItem)this;
  }
  
  public MenuItem setIconTintList(ColorStateList paramColorStateList) {
    this.o = paramColorStateList;
    this.q = true;
    c();
    return (MenuItem)this;
  }
  
  public MenuItem setIconTintMode(PorterDuff.Mode paramMode) {
    this.p = paramMode;
    this.r = true;
    c();
    return (MenuItem)this;
  }
  
  public MenuItem setIntent(Intent paramIntent) {
    this.f = paramIntent;
    return (MenuItem)this;
  }
  
  public MenuItem setNumericShortcut(char paramChar) {
    this.g = paramChar;
    return (MenuItem)this;
  }
  
  public MenuItem setNumericShortcut(char paramChar, int paramInt) {
    this.g = paramChar;
    this.h = KeyEvent.normalizeMetaState(paramInt);
    return (MenuItem)this;
  }
  
  public MenuItem setOnActionExpandListener(MenuItem.OnActionExpandListener paramOnActionExpandListener) {
    throw new UnsupportedOperationException();
  }
  
  public MenuItem setOnMenuItemClickListener(MenuItem.OnMenuItemClickListener paramOnMenuItemClickListener) {
    return (MenuItem)this;
  }
  
  public MenuItem setShortcut(char paramChar1, char paramChar2) {
    this.g = paramChar1;
    this.i = Character.toLowerCase(paramChar2);
    return (MenuItem)this;
  }
  
  public MenuItem setShortcut(char paramChar1, char paramChar2, int paramInt1, int paramInt2) {
    this.g = paramChar1;
    this.h = KeyEvent.normalizeMetaState(paramInt1);
    this.i = Character.toLowerCase(paramChar2);
    this.j = KeyEvent.normalizeMetaState(paramInt2);
    return (MenuItem)this;
  }
  
  public void setShowAsAction(int paramInt) {}
  
  public MenuItem setShowAsActionFlags(int paramInt) {
    return (MenuItem)this;
  }
  
  public MenuItem setTitle(int paramInt) {
    this.d = this.l.getResources().getString(paramInt);
    return (MenuItem)this;
  }
  
  public MenuItem setTitle(CharSequence paramCharSequence) {
    this.d = paramCharSequence;
    return (MenuItem)this;
  }
  
  public MenuItem setTitleCondensed(CharSequence paramCharSequence) {
    this.e = paramCharSequence;
    return (MenuItem)this;
  }
  
  public MenuItem setTooltipText(CharSequence paramCharSequence) {
    this.n = paramCharSequence;
    return (MenuItem)this;
  }
  
  public b setTooltipText(CharSequence paramCharSequence) {
    this.n = paramCharSequence;
    return this;
  }
  
  public MenuItem setVisible(boolean paramBoolean) {
    int i = this.s;
    byte b1 = 8;
    if (paramBoolean)
      b1 = 0; 
    this.s = i & 0x8 | b1;
    return (MenuItem)this;
  }
}


/* Location:              C:\Users\panch\Downloads\dvba_v1.1.0-dex2jar.jar!\b\b\o\i\a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */