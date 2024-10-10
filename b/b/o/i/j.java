package b.b.o.i;

import android.content.Context;
import android.content.Intent;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.view.ActionProvider;
import android.view.CollapsibleActionView;
import android.view.ContextMenu;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;
import android.widget.FrameLayout;
import java.lang.reflect.Method;

public class j extends c implements MenuItem {
  public final b.i.h.a.b d;
  
  public Method e;
  
  public j(Context paramContext, b.i.h.a.b paramb) {
    super(paramContext);
    if (paramb != null) {
      this.d = paramb;
      return;
    } 
    throw new IllegalArgumentException("Wrapped Object can not be null.");
  }
  
  public boolean collapseActionView() {
    return this.d.collapseActionView();
  }
  
  public boolean expandActionView() {
    return this.d.expandActionView();
  }
  
  public ActionProvider getActionProvider() {
    b.i.m.b b1 = this.d.a();
    return (b1 instanceof a) ? ((a)b1).b : null;
  }
  
  public View getActionView() {
    View view2 = this.d.getActionView();
    View view1 = view2;
    if (view2 instanceof c)
      view1 = (View)((c)view2).b; 
    return view1;
  }
  
  public int getAlphabeticModifiers() {
    return this.d.getAlphabeticModifiers();
  }
  
  public char getAlphabeticShortcut() {
    return this.d.getAlphabeticShortcut();
  }
  
  public CharSequence getContentDescription() {
    return this.d.getContentDescription();
  }
  
  public int getGroupId() {
    return this.d.getGroupId();
  }
  
  public Drawable getIcon() {
    return this.d.getIcon();
  }
  
  public ColorStateList getIconTintList() {
    return this.d.getIconTintList();
  }
  
  public PorterDuff.Mode getIconTintMode() {
    return this.d.getIconTintMode();
  }
  
  public Intent getIntent() {
    return this.d.getIntent();
  }
  
  public int getItemId() {
    return this.d.getItemId();
  }
  
  public ContextMenu.ContextMenuInfo getMenuInfo() {
    return this.d.getMenuInfo();
  }
  
  public int getNumericModifiers() {
    return this.d.getNumericModifiers();
  }
  
  public char getNumericShortcut() {
    return this.d.getNumericShortcut();
  }
  
  public int getOrder() {
    return this.d.getOrder();
  }
  
  public SubMenu getSubMenu() {
    return d(this.d.getSubMenu());
  }
  
  public CharSequence getTitle() {
    return this.d.getTitle();
  }
  
  public CharSequence getTitleCondensed() {
    return this.d.getTitleCondensed();
  }
  
  public CharSequence getTooltipText() {
    return this.d.getTooltipText();
  }
  
  public boolean hasSubMenu() {
    return this.d.hasSubMenu();
  }
  
  public boolean isActionViewExpanded() {
    return this.d.isActionViewExpanded();
  }
  
  public boolean isCheckable() {
    return this.d.isCheckable();
  }
  
  public boolean isChecked() {
    return this.d.isChecked();
  }
  
  public boolean isEnabled() {
    return this.d.isEnabled();
  }
  
  public boolean isVisible() {
    return this.d.isVisible();
  }
  
  public MenuItem setActionProvider(ActionProvider paramActionProvider) {
    b b1 = new b(this, this.a, paramActionProvider);
    b.i.h.a.b b2 = this.d;
    if (paramActionProvider != null) {
      b b3 = b1;
    } else {
      paramActionProvider = null;
    } 
    b2.b((b.i.m.b)paramActionProvider);
    return this;
  }
  
  public MenuItem setActionView(int paramInt) {
    this.d.setActionView(paramInt);
    View view = this.d.getActionView();
    if (view instanceof CollapsibleActionView)
      this.d.setActionView((View)new c(view)); 
    return this;
  }
  
  public MenuItem setActionView(View paramView) {
    c c1;
    View view = paramView;
    if (paramView instanceof CollapsibleActionView)
      c1 = new c(paramView); 
    this.d.setActionView((View)c1);
    return this;
  }
  
  public MenuItem setAlphabeticShortcut(char paramChar) {
    this.d.setAlphabeticShortcut(paramChar);
    return this;
  }
  
  public MenuItem setAlphabeticShortcut(char paramChar, int paramInt) {
    this.d.setAlphabeticShortcut(paramChar, paramInt);
    return this;
  }
  
  public MenuItem setCheckable(boolean paramBoolean) {
    this.d.setCheckable(paramBoolean);
    return this;
  }
  
  public MenuItem setChecked(boolean paramBoolean) {
    this.d.setChecked(paramBoolean);
    return this;
  }
  
  public MenuItem setContentDescription(CharSequence paramCharSequence) {
    this.d.setContentDescription(paramCharSequence);
    return this;
  }
  
  public MenuItem setEnabled(boolean paramBoolean) {
    this.d.setEnabled(paramBoolean);
    return this;
  }
  
  public MenuItem setIcon(int paramInt) {
    this.d.setIcon(paramInt);
    return this;
  }
  
  public MenuItem setIcon(Drawable paramDrawable) {
    this.d.setIcon(paramDrawable);
    return this;
  }
  
  public MenuItem setIconTintList(ColorStateList paramColorStateList) {
    this.d.setIconTintList(paramColorStateList);
    return this;
  }
  
  public MenuItem setIconTintMode(PorterDuff.Mode paramMode) {
    this.d.setIconTintMode(paramMode);
    return this;
  }
  
  public MenuItem setIntent(Intent paramIntent) {
    this.d.setIntent(paramIntent);
    return this;
  }
  
  public MenuItem setNumericShortcut(char paramChar) {
    this.d.setNumericShortcut(paramChar);
    return this;
  }
  
  public MenuItem setNumericShortcut(char paramChar, int paramInt) {
    this.d.setNumericShortcut(paramChar, paramInt);
    return this;
  }
  
  public MenuItem setOnActionExpandListener(MenuItem.OnActionExpandListener paramOnActionExpandListener) {
    b.i.h.a.b b1 = this.d;
    if (paramOnActionExpandListener != null) {
      paramOnActionExpandListener = new d(this, paramOnActionExpandListener);
    } else {
      paramOnActionExpandListener = null;
    } 
    b1.setOnActionExpandListener(paramOnActionExpandListener);
    return this;
  }
  
  public MenuItem setOnMenuItemClickListener(MenuItem.OnMenuItemClickListener paramOnMenuItemClickListener) {
    b.i.h.a.b b1 = this.d;
    if (paramOnMenuItemClickListener != null) {
      paramOnMenuItemClickListener = new e(this, paramOnMenuItemClickListener);
    } else {
      paramOnMenuItemClickListener = null;
    } 
    b1.setOnMenuItemClickListener(paramOnMenuItemClickListener);
    return this;
  }
  
  public MenuItem setShortcut(char paramChar1, char paramChar2) {
    this.d.setShortcut(paramChar1, paramChar2);
    return this;
  }
  
  public MenuItem setShortcut(char paramChar1, char paramChar2, int paramInt1, int paramInt2) {
    this.d.setShortcut(paramChar1, paramChar2, paramInt1, paramInt2);
    return this;
  }
  
  public void setShowAsAction(int paramInt) {
    this.d.setShowAsAction(paramInt);
  }
  
  public MenuItem setShowAsActionFlags(int paramInt) {
    this.d.setShowAsActionFlags(paramInt);
    return this;
  }
  
  public MenuItem setTitle(int paramInt) {
    this.d.setTitle(paramInt);
    return this;
  }
  
  public MenuItem setTitle(CharSequence paramCharSequence) {
    this.d.setTitle(paramCharSequence);
    return this;
  }
  
  public MenuItem setTitleCondensed(CharSequence paramCharSequence) {
    this.d.setTitleCondensed(paramCharSequence);
    return this;
  }
  
  public MenuItem setTooltipText(CharSequence paramCharSequence) {
    this.d.setTooltipText(paramCharSequence);
    return this;
  }
  
  public MenuItem setVisible(boolean paramBoolean) {
    return this.d.setVisible(paramBoolean);
  }
  
  public class a extends b.i.m.b {
    public final ActionProvider b;
    
    public final j c;
    
    public a(j this$0, Context param1Context, ActionProvider param1ActionProvider) {
      super(param1Context);
      this.b = param1ActionProvider;
    }
  }
  
  public class b extends a implements ActionProvider.VisibilityListener {
    public b.i.m.b.a d;
    
    public b(j this$0, Context param1Context, ActionProvider param1ActionProvider) {
      super(this$0, param1Context, param1ActionProvider);
    }
    
    public boolean a() {
      return this.b.isVisible();
    }
    
    public View b(MenuItem param1MenuItem) {
      return this.b.onCreateActionView(param1MenuItem);
    }
    
    public boolean c() {
      return this.b.overridesItemVisibility();
    }
    
    public void d(b.i.m.b.a param1a) {
      this.d = param1a;
      this.b.setVisibilityListener(this);
    }
    
    public void onActionProviderVisibilityChanged(boolean param1Boolean) {
      b.i.m.b.a a1 = this.d;
      if (a1 != null) {
        g g = ((i.a)a1).a.n;
        g.h = true;
        g.q(true);
      } 
    }
  }
  
  public static class c extends FrameLayout implements b.b.o.b {
    public final CollapsibleActionView b;
    
    public c(View param1View) {
      super(param1View.getContext());
      this.b = (CollapsibleActionView)param1View;
      addView(param1View);
    }
    
    public void a() {
      this.b.onActionViewExpanded();
    }
    
    public void f() {
      this.b.onActionViewCollapsed();
    }
  }
  
  public class d implements MenuItem.OnActionExpandListener {
    public final MenuItem.OnActionExpandListener a;
    
    public final j b;
    
    public d(j this$0, MenuItem.OnActionExpandListener param1OnActionExpandListener) {
      this.a = param1OnActionExpandListener;
    }
    
    public boolean onMenuItemActionCollapse(MenuItem param1MenuItem) {
      return this.a.onMenuItemActionCollapse(this.b.c(param1MenuItem));
    }
    
    public boolean onMenuItemActionExpand(MenuItem param1MenuItem) {
      return this.a.onMenuItemActionExpand(this.b.c(param1MenuItem));
    }
  }
  
  public class e implements MenuItem.OnMenuItemClickListener {
    public final MenuItem.OnMenuItemClickListener a;
    
    public final j b;
    
    public e(j this$0, MenuItem.OnMenuItemClickListener param1OnMenuItemClickListener) {
      this.a = param1OnMenuItemClickListener;
    }
    
    public boolean onMenuItemClick(MenuItem param1MenuItem) {
      return this.a.onMenuItemClick(this.b.c(param1MenuItem));
    }
  }
}


/* Location:              C:\Users\panch\Downloads\dvba_v1.1.0-dex2jar.jar!\b\b\o\i\j.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */