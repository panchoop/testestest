package com.google.android.material.internal;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.StateListDrawable;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.widget.CheckedTextView;
import android.widget.FrameLayout;
import android.widget.TextView;
import b.b.o.i.i;
import b.b.o.i.n;
import b.b.p.i0;
import b.i.m.l;
import b.i.m.v.b;
import c.c.a.b.d;
import c.c.a.b.e;
import c.c.a.b.f;
import c.c.a.b.h;
import c.c.a.b.y.f;

public class NavigationMenuItemView extends f implements n.a {
  public static final int[] G = new int[] { 16842912 };
  
  public FrameLayout A;
  
  public i B;
  
  public ColorStateList C;
  
  public boolean D;
  
  public Drawable E;
  
  public final b.i.m.a F = new a(this);
  
  public int w;
  
  public boolean x;
  
  public boolean y;
  
  public final CheckedTextView z;
  
  public NavigationMenuItemView(Context paramContext, AttributeSet paramAttributeSet) {
    super(paramContext, paramAttributeSet, 0);
    setOrientation(0);
    LayoutInflater.from(paramContext).inflate(h.design_navigation_menu_item, (ViewGroup)this, true);
    setIconSize(paramContext.getResources().getDimensionPixelSize(d.design_navigation_icon_size));
    CheckedTextView checkedTextView = (CheckedTextView)findViewById(f.design_menu_item_text);
    this.z = checkedTextView;
    checkedTextView.setDuplicateParentStateEnabled(true);
    l.W((View)this.z, this.F);
  }
  
  private void setActionView(View paramView) {
    if (paramView != null) {
      if (this.A == null)
        this.A = (FrameLayout)((ViewStub)findViewById(f.design_menu_item_action_area_stub)).inflate(); 
      this.A.removeAllViews();
      this.A.addView(paramView);
    } 
  }
  
  public boolean c() {
    return false;
  }
  
  public void e(i parami, int paramInt) {
    i0.a a1;
    this.B = parami;
    if (parami.isVisible()) {
      paramInt = 0;
    } else {
      paramInt = 8;
    } 
    setVisibility(paramInt);
    Drawable drawable = getBackground();
    paramInt = 1;
    if (drawable == null) {
      TypedValue typedValue = new TypedValue();
      if (getContext().getTheme().resolveAttribute(b.b.a.colorControlHighlight, typedValue, true)) {
        StateListDrawable stateListDrawable = new StateListDrawable();
        stateListDrawable.addState(G, (Drawable)new ColorDrawable(typedValue.data));
        stateListDrawable.addState(ViewGroup.EMPTY_STATE_SET, (Drawable)new ColorDrawable(0));
      } else {
        drawable = null;
      } 
      l.Z((View)this, drawable);
    } 
    setCheckable(parami.isCheckable());
    setChecked(parami.isChecked());
    setEnabled(parami.isEnabled());
    setTitle(parami.e);
    setIcon(parami.getIcon());
    setActionView(parami.getActionView());
    setContentDescription(parami.q);
    a.a.a.a.a.w0((View)this, parami.r);
    parami = this.B;
    if (parami.e != null || parami.getIcon() != null || this.B.getActionView() == null)
      paramInt = 0; 
    if (paramInt != 0) {
      this.z.setVisibility(8);
      FrameLayout frameLayout = this.A;
      if (frameLayout != null) {
        a1 = (i0.a)frameLayout.getLayoutParams();
        paramInt = -1;
      } else {
        return;
      } 
    } else {
      this.z.setVisibility(0);
      FrameLayout frameLayout = this.A;
      if (frameLayout != null) {
        a1 = (i0.a)frameLayout.getLayoutParams();
        paramInt = -2;
      } else {
        return;
      } 
    } 
    ((ViewGroup.MarginLayoutParams)a1).width = paramInt;
    this.A.setLayoutParams((ViewGroup.LayoutParams)a1);
  }
  
  public i getItemData() {
    return this.B;
  }
  
  public int[] onCreateDrawableState(int paramInt) {
    int[] arrayOfInt = super.onCreateDrawableState(paramInt + 1);
    i i1 = this.B;
    if (i1 != null && i1.isCheckable() && this.B.isChecked())
      ViewGroup.mergeDrawableStates(arrayOfInt, G); 
    return arrayOfInt;
  }
  
  public void setCheckable(boolean paramBoolean) {
    refreshDrawableState();
    if (this.y != paramBoolean) {
      this.y = paramBoolean;
      this.F.h((View)this.z, 2048);
    } 
  }
  
  public void setChecked(boolean paramBoolean) {
    refreshDrawableState();
    this.z.setChecked(paramBoolean);
  }
  
  public void setHorizontalPadding(int paramInt) {
    setPadding(paramInt, 0, paramInt, 0);
  }
  
  public void setIcon(Drawable paramDrawable) {
    if (paramDrawable != null) {
      Drawable drawable = paramDrawable;
      if (this.D) {
        Drawable.ConstantState constantState = paramDrawable.getConstantState();
        if (constantState != null)
          paramDrawable = constantState.newDrawable(); 
        drawable = a.a.a.a.a.C0(paramDrawable).mutate();
        drawable.setTintList(this.C);
      } 
      int j = this.w;
      drawable.setBounds(0, 0, j, j);
      paramDrawable = drawable;
    } else if (this.x) {
      if (this.E == null) {
        paramDrawable = getResources().getDrawable(e.navigation_empty_icon, getContext().getTheme());
        this.E = paramDrawable;
        if (paramDrawable != null) {
          int j = this.w;
          paramDrawable.setBounds(0, 0, j, j);
        } 
      } 
      paramDrawable = this.E;
    } 
    this.z.setCompoundDrawablesRelative(paramDrawable, null, null, null);
  }
  
  public void setIconPadding(int paramInt) {
    this.z.setCompoundDrawablePadding(paramInt);
  }
  
  public void setIconSize(int paramInt) {
    this.w = paramInt;
  }
  
  public void setIconTintList(ColorStateList paramColorStateList) {
    boolean bool;
    this.C = paramColorStateList;
    if (paramColorStateList != null) {
      bool = true;
    } else {
      bool = false;
    } 
    this.D = bool;
    i i1 = this.B;
    if (i1 != null)
      setIcon(i1.getIcon()); 
  }
  
  public void setMaxLines(int paramInt) {
    this.z.setMaxLines(paramInt);
  }
  
  public void setNeedsEmptyIcon(boolean paramBoolean) {
    this.x = paramBoolean;
  }
  
  public void setTextAppearance(int paramInt) {
    a.a.a.a.a.s0((TextView)this.z, paramInt);
  }
  
  public void setTextColor(ColorStateList paramColorStateList) {
    this.z.setTextColor(paramColorStateList);
  }
  
  public void setTitle(CharSequence paramCharSequence) {
    this.z.setText(paramCharSequence);
  }
  
  public class a extends b.i.m.a {
    public final NavigationMenuItemView d;
    
    public a(NavigationMenuItemView this$0) {}
    
    public void d(View param1View, b param1b) {
      this.a.onInitializeAccessibilityNodeInfo(param1View, param1b.a);
      boolean bool = this.d.y;
      param1b.a.setCheckable(bool);
    }
  }
}


/* Location:              C:\Users\panch\Downloads\dvba_v1.1.0-dex2jar.jar!\com\google\android\material\internal\NavigationMenuItemView.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */