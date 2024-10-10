package b.b.o.i;

import android.content.Context;
import android.content.Intent;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.view.ActionProvider;
import android.view.ContextMenu;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;
import android.view.ViewDebug.CapturedViewProperty;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import b.i.h.a.b;
import b.i.m.b;

public final class i implements b {
  public b A;
  
  public MenuItem.OnActionExpandListener B;
  
  public boolean C = false;
  
  public ContextMenu.ContextMenuInfo D;
  
  public final int a;
  
  public final int b;
  
  public final int c;
  
  public final int d;
  
  public CharSequence e;
  
  public CharSequence f;
  
  public Intent g;
  
  public char h;
  
  public int i = 4096;
  
  public char j;
  
  public int k = 4096;
  
  public Drawable l;
  
  public int m = 0;
  
  public g n;
  
  public r o;
  
  public MenuItem.OnMenuItemClickListener p;
  
  public CharSequence q;
  
  public CharSequence r;
  
  public ColorStateList s = null;
  
  public PorterDuff.Mode t = null;
  
  public boolean u = false;
  
  public boolean v = false;
  
  public boolean w = false;
  
  public int x = 16;
  
  public int y = 0;
  
  public View z;
  
  public i(g paramg, int paramInt1, int paramInt2, int paramInt3, int paramInt4, CharSequence paramCharSequence, int paramInt5) {
    this.n = paramg;
    this.a = paramInt2;
    this.b = paramInt1;
    this.c = paramInt3;
    this.d = paramInt4;
    this.e = paramCharSequence;
    this.y = paramInt5;
  }
  
  public static void c(StringBuilder paramStringBuilder, int paramInt1, int paramInt2, String paramString) {
    if ((paramInt1 & paramInt2) == paramInt2)
      paramStringBuilder.append(paramString); 
  }
  
  public b a() {
    return this.A;
  }
  
  public b b(b paramb) {
    b b1 = this.A;
    if (b1 != null)
      b1.a = null; 
    this.z = null;
    this.A = paramb;
    this.n.q(true);
    paramb = this.A;
    if (paramb != null)
      paramb.d(new a(this)); 
    return this;
  }
  
  public boolean collapseActionView() {
    if ((this.y & 0x8) == 0)
      return false; 
    if (this.z == null)
      return true; 
    MenuItem.OnActionExpandListener onActionExpandListener = this.B;
    return (onActionExpandListener == null || onActionExpandListener.onMenuItemActionCollapse((MenuItem)this)) ? this.n.d(this) : false;
  }
  
  public final Drawable d(Drawable paramDrawable) {
    // Byte code:
    //   0: aload_1
    //   1: astore_2
    //   2: aload_1
    //   3: ifnull -> 74
    //   6: aload_1
    //   7: astore_2
    //   8: aload_0
    //   9: getfield w : Z
    //   12: ifeq -> 74
    //   15: aload_0
    //   16: getfield u : Z
    //   19: ifne -> 31
    //   22: aload_1
    //   23: astore_2
    //   24: aload_0
    //   25: getfield v : Z
    //   28: ifeq -> 74
    //   31: aload_1
    //   32: invokestatic C0 : (Landroid/graphics/drawable/Drawable;)Landroid/graphics/drawable/Drawable;
    //   35: invokevirtual mutate : ()Landroid/graphics/drawable/Drawable;
    //   38: astore_2
    //   39: aload_0
    //   40: getfield u : Z
    //   43: ifeq -> 54
    //   46: aload_2
    //   47: aload_0
    //   48: getfield s : Landroid/content/res/ColorStateList;
    //   51: invokevirtual setTintList : (Landroid/content/res/ColorStateList;)V
    //   54: aload_0
    //   55: getfield v : Z
    //   58: ifeq -> 69
    //   61: aload_2
    //   62: aload_0
    //   63: getfield t : Landroid/graphics/PorterDuff$Mode;
    //   66: invokevirtual setTintMode : (Landroid/graphics/PorterDuff$Mode;)V
    //   69: aload_0
    //   70: iconst_0
    //   71: putfield w : Z
    //   74: aload_2
    //   75: areturn
  }
  
  public char e() {
    char c;
    if (this.n.n()) {
      c = this.j;
    } else {
      c = this.h;
    } 
    return c;
  }
  
  public boolean expandActionView() {
    if (!f())
      return false; 
    MenuItem.OnActionExpandListener onActionExpandListener = this.B;
    return (onActionExpandListener == null || onActionExpandListener.onMenuItemActionExpand((MenuItem)this)) ? this.n.f(this) : false;
  }
  
  public boolean f() {
    int j = this.y;
    boolean bool2 = false;
    boolean bool1 = bool2;
    if ((j & 0x8) != 0) {
      if (this.z == null) {
        b b1 = this.A;
        if (b1 != null)
          this.z = b1.b((MenuItem)this); 
      } 
      bool1 = bool2;
      if (this.z != null)
        bool1 = true; 
    } 
    return bool1;
  }
  
  public boolean g() {
    boolean bool;
    if ((this.x & 0x20) == 32) {
      bool = true;
    } else {
      bool = false;
    } 
    return bool;
  }
  
  public ActionProvider getActionProvider() {
    throw new UnsupportedOperationException("This is not supported, use MenuItemCompat.getActionProvider()");
  }
  
  public View getActionView() {
    View view = this.z;
    if (view != null)
      return view; 
    b b1 = this.A;
    if (b1 != null) {
      View view1 = b1.b((MenuItem)this);
      this.z = view1;
      return view1;
    } 
    return null;
  }
  
  public int getAlphabeticModifiers() {
    return this.k;
  }
  
  public char getAlphabeticShortcut() {
    return this.j;
  }
  
  public CharSequence getContentDescription() {
    return this.q;
  }
  
  public int getGroupId() {
    return this.b;
  }
  
  public Drawable getIcon() {
    Drawable drawable = this.l;
    if (drawable != null)
      return d(drawable); 
    int j = this.m;
    if (j != 0) {
      drawable = b.b.l.a.a.b(this.n.a, j);
      this.m = 0;
      this.l = drawable;
      return d(drawable);
    } 
    return null;
  }
  
  public ColorStateList getIconTintList() {
    return this.s;
  }
  
  public PorterDuff.Mode getIconTintMode() {
    return this.t;
  }
  
  public Intent getIntent() {
    return this.g;
  }
  
  @CapturedViewProperty
  public int getItemId() {
    return this.a;
  }
  
  public ContextMenu.ContextMenuInfo getMenuInfo() {
    return this.D;
  }
  
  public int getNumericModifiers() {
    return this.i;
  }
  
  public char getNumericShortcut() {
    return this.h;
  }
  
  public int getOrder() {
    return this.c;
  }
  
  public SubMenu getSubMenu() {
    return this.o;
  }
  
  @CapturedViewProperty
  public CharSequence getTitle() {
    return this.e;
  }
  
  public CharSequence getTitleCondensed() {
    CharSequence charSequence = this.f;
    if (charSequence == null)
      charSequence = this.e; 
    return charSequence;
  }
  
  public CharSequence getTooltipText() {
    return this.r;
  }
  
  public boolean h() {
    boolean bool;
    if ((this.x & 0x4) != 0) {
      bool = true;
    } else {
      bool = false;
    } 
    return bool;
  }
  
  public boolean hasSubMenu() {
    boolean bool;
    if (this.o != null) {
      bool = true;
    } else {
      bool = false;
    } 
    return bool;
  }
  
  public b i(View paramView) {
    this.z = paramView;
    this.A = null;
    if (paramView != null && paramView.getId() == -1) {
      int j = this.a;
      if (j > 0)
        paramView.setId(j); 
    } 
    this.n.p();
    return this;
  }
  
  public boolean isActionViewExpanded() {
    return this.C;
  }
  
  public boolean isCheckable() {
    int j = this.x;
    boolean bool = true;
    if ((j & 0x1) != 1)
      bool = false; 
    return bool;
  }
  
  public boolean isChecked() {
    boolean bool;
    if ((this.x & 0x2) == 2) {
      bool = true;
    } else {
      bool = false;
    } 
    return bool;
  }
  
  public boolean isEnabled() {
    boolean bool;
    if ((this.x & 0x10) != 0) {
      bool = true;
    } else {
      bool = false;
    } 
    return bool;
  }
  
  public boolean isVisible() {
    b b1 = this.A;
    boolean bool1 = true;
    boolean bool2 = true;
    if (b1 != null && b1.c()) {
      if ((this.x & 0x8) == 0 && this.A.a()) {
        bool1 = bool2;
      } else {
        bool1 = false;
      } 
      return bool1;
    } 
    if ((this.x & 0x8) != 0)
      bool1 = false; 
    return bool1;
  }
  
  public void j(boolean paramBoolean) {
    int j;
    int k = this.x;
    if (paramBoolean) {
      j = 2;
    } else {
      j = 0;
    } 
    j |= k & 0xFFFFFFFD;
    this.x = j;
    if (k != j)
      this.n.q(false); 
  }
  
  public void k(boolean paramBoolean) {
    int j;
    if (paramBoolean) {
      j = this.x | 0x20;
    } else {
      j = this.x & 0xFFFFFFDF;
    } 
    this.x = j;
  }
  
  public boolean l(boolean paramBoolean) {
    int j;
    int k = this.x;
    boolean bool = false;
    if (paramBoolean) {
      j = 0;
    } else {
      j = 8;
    } 
    j |= k & 0xFFFFFFF7;
    this.x = j;
    paramBoolean = bool;
    if (k != j)
      paramBoolean = true; 
    return paramBoolean;
  }
  
  public boolean m() {
    boolean bool;
    if (this.n.o() && e() != '\000') {
      bool = true;
    } else {
      bool = false;
    } 
    return bool;
  }
  
  public MenuItem setActionProvider(ActionProvider paramActionProvider) {
    throw new UnsupportedOperationException("This is not supported, use MenuItemCompat.setActionProvider()");
  }
  
  public MenuItem setActionView(int paramInt) {
    Context context = this.n.a;
    i(LayoutInflater.from(context).inflate(paramInt, (ViewGroup)new LinearLayout(context), false));
    return (MenuItem)this;
  }
  
  public MenuItem setAlphabeticShortcut(char paramChar) {
    if (this.j == paramChar)
      return (MenuItem)this; 
    this.j = Character.toLowerCase(paramChar);
    this.n.q(false);
    return (MenuItem)this;
  }
  
  public MenuItem setAlphabeticShortcut(char paramChar, int paramInt) {
    if (this.j == paramChar && this.k == paramInt)
      return (MenuItem)this; 
    this.j = Character.toLowerCase(paramChar);
    this.k = KeyEvent.normalizeMetaState(paramInt);
    this.n.q(false);
    return (MenuItem)this;
  }
  
  public MenuItem setCheckable(boolean paramBoolean) {
    int k = this.x;
    int j = paramBoolean | k & 0xFFFFFFFE;
    this.x = j;
    if (k != j)
      this.n.q(false); 
    return (MenuItem)this;
  }
  
  public MenuItem setChecked(boolean paramBoolean) {
    if ((this.x & 0x4) != 0) {
      g g1 = this.n;
      if (g1 != null) {
        int k = getGroupId();
        int j = g1.f.size();
        g1.z();
        for (byte b1 = 0; b1 < j; b1++) {
          i i1 = g1.f.get(b1);
          if (i1.b == k && i1.h() && i1.isCheckable()) {
            if (i1 == this) {
              paramBoolean = true;
            } else {
              paramBoolean = false;
            } 
            i1.j(paramBoolean);
          } 
        } 
        g1.y();
      } else {
        throw null;
      } 
    } else {
      j(paramBoolean);
    } 
    return (MenuItem)this;
  }
  
  public MenuItem setContentDescription(CharSequence paramCharSequence) {
    this.q = paramCharSequence;
    this.n.q(false);
    return (MenuItem)this;
  }
  
  public b setContentDescription(CharSequence paramCharSequence) {
    this.q = paramCharSequence;
    this.n.q(false);
    return this;
  }
  
  public MenuItem setEnabled(boolean paramBoolean) {
    int j;
    if (paramBoolean) {
      j = this.x | 0x10;
    } else {
      j = this.x & 0xFFFFFFEF;
    } 
    this.x = j;
    this.n.q(false);
    return (MenuItem)this;
  }
  
  public MenuItem setIcon(int paramInt) {
    this.l = null;
    this.m = paramInt;
    this.w = true;
    this.n.q(false);
    return (MenuItem)this;
  }
  
  public MenuItem setIcon(Drawable paramDrawable) {
    this.m = 0;
    this.l = paramDrawable;
    this.w = true;
    this.n.q(false);
    return (MenuItem)this;
  }
  
  public MenuItem setIconTintList(ColorStateList paramColorStateList) {
    this.s = paramColorStateList;
    this.u = true;
    this.w = true;
    this.n.q(false);
    return (MenuItem)this;
  }
  
  public MenuItem setIconTintMode(PorterDuff.Mode paramMode) {
    this.t = paramMode;
    this.v = true;
    this.w = true;
    this.n.q(false);
    return (MenuItem)this;
  }
  
  public MenuItem setIntent(Intent paramIntent) {
    this.g = paramIntent;
    return (MenuItem)this;
  }
  
  public MenuItem setNumericShortcut(char paramChar) {
    if (this.h == paramChar)
      return (MenuItem)this; 
    this.h = paramChar;
    this.n.q(false);
    return (MenuItem)this;
  }
  
  public MenuItem setNumericShortcut(char paramChar, int paramInt) {
    if (this.h == paramChar && this.i == paramInt)
      return (MenuItem)this; 
    this.h = paramChar;
    this.i = KeyEvent.normalizeMetaState(paramInt);
    this.n.q(false);
    return (MenuItem)this;
  }
  
  public MenuItem setOnActionExpandListener(MenuItem.OnActionExpandListener paramOnActionExpandListener) {
    this.B = paramOnActionExpandListener;
    return (MenuItem)this;
  }
  
  public MenuItem setOnMenuItemClickListener(MenuItem.OnMenuItemClickListener paramOnMenuItemClickListener) {
    this.p = paramOnMenuItemClickListener;
    return (MenuItem)this;
  }
  
  public MenuItem setShortcut(char paramChar1, char paramChar2) {
    this.h = paramChar1;
    this.j = Character.toLowerCase(paramChar2);
    this.n.q(false);
    return (MenuItem)this;
  }
  
  public MenuItem setShortcut(char paramChar1, char paramChar2, int paramInt1, int paramInt2) {
    this.h = paramChar1;
    this.i = KeyEvent.normalizeMetaState(paramInt1);
    this.j = Character.toLowerCase(paramChar2);
    this.k = KeyEvent.normalizeMetaState(paramInt2);
    this.n.q(false);
    return (MenuItem)this;
  }
  
  public void setShowAsAction(int paramInt) {
    int j = paramInt & 0x3;
    if (j == 0 || j == 1 || j == 2) {
      this.y = paramInt;
      this.n.p();
      return;
    } 
    throw new IllegalArgumentException("SHOW_AS_ACTION_ALWAYS, SHOW_AS_ACTION_IF_ROOM, and SHOW_AS_ACTION_NEVER are mutually exclusive.");
  }
  
  public MenuItem setShowAsActionFlags(int paramInt) {
    setShowAsAction(paramInt);
    return (MenuItem)this;
  }
  
  public MenuItem setTitle(int paramInt) {
    setTitle(this.n.a.getString(paramInt));
    return (MenuItem)this;
  }
  
  public MenuItem setTitle(CharSequence paramCharSequence) {
    this.e = paramCharSequence;
    this.n.q(false);
    r r1 = this.o;
    if (r1 != null)
      r1.setHeaderTitle(paramCharSequence); 
    return (MenuItem)this;
  }
  
  public MenuItem setTitleCondensed(CharSequence paramCharSequence) {
    this.f = paramCharSequence;
    this.n.q(false);
    return (MenuItem)this;
  }
  
  public MenuItem setTooltipText(CharSequence paramCharSequence) {
    this.r = paramCharSequence;
    this.n.q(false);
    return (MenuItem)this;
  }
  
  public b setTooltipText(CharSequence paramCharSequence) {
    this.r = paramCharSequence;
    this.n.q(false);
    return this;
  }
  
  public MenuItem setVisible(boolean paramBoolean) {
    if (l(paramBoolean)) {
      g g1 = this.n;
      g1.h = true;
      g1.q(true);
    } 
    return (MenuItem)this;
  }
  
  public String toString() {
    CharSequence charSequence = this.e;
    if (charSequence != null) {
      charSequence = charSequence.toString();
    } else {
      charSequence = null;
    } 
    return (String)charSequence;
  }
  
  public class a implements b.a {
    public final i a;
    
    public a(i this$0) {}
  }
}


/* Location:              C:\Users\panch\Downloads\dvba_v1.1.0-dex2jar.jar!\b\b\o\i\i.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */