package com.google.android.material.chip;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CompoundButton;
import c.c.a.b.j;
import c.c.a.b.k;
import c.c.a.b.y.e;
import c.c.a.b.y.i;

public class ChipGroup extends e {
  public int e;
  
  public int f;
  
  public boolean g;
  
  public d h;
  
  public final b i = new b(this, null);
  
  public e j = new e(this, null);
  
  public int k = -1;
  
  public boolean l = false;
  
  public ChipGroup(Context paramContext, AttributeSet paramAttributeSet) {
    super(paramContext, paramAttributeSet, i);
    TypedArray typedArray = i.e(paramContext, paramAttributeSet, k.ChipGroup, i, j.Widget_MaterialComponents_ChipGroup, new int[0]);
    i = typedArray.getDimensionPixelOffset(k.ChipGroup_chipSpacing, 0);
    setChipSpacingHorizontal(typedArray.getDimensionPixelOffset(k.ChipGroup_chipSpacingHorizontal, i));
    setChipSpacingVertical(typedArray.getDimensionPixelOffset(k.ChipGroup_chipSpacingVertical, i));
    setSingleLine(typedArray.getBoolean(k.ChipGroup_singleLine, false));
    setSingleSelection(typedArray.getBoolean(k.ChipGroup_singleSelection, false));
    i = typedArray.getResourceId(k.ChipGroup_checkedChip, -1);
    if (i != -1)
      this.k = i; 
    typedArray.recycle();
    super.setOnHierarchyChangeListener(this.j);
  }
  
  private void setCheckedId(int paramInt) {
    this.k = paramInt;
    d d1 = this.h;
    if (d1 != null && this.g)
      d1.a(this, paramInt); 
  }
  
  public boolean a() {
    return this.d;
  }
  
  public void addView(View paramView, int paramInt, ViewGroup.LayoutParams paramLayoutParams) {
    if (paramView instanceof Chip) {
      Chip chip = (Chip)paramView;
      if (chip.isChecked()) {
        int i = this.k;
        if (i != -1 && this.g)
          c(i, false); 
        setCheckedId(chip.getId());
      } 
    } 
    super.addView(paramView, paramInt, paramLayoutParams);
  }
  
  public final void c(int paramInt, boolean paramBoolean) {
    View view = findViewById(paramInt);
    if (view instanceof Chip) {
      this.l = true;
      ((Chip)view).setChecked(paramBoolean);
      this.l = false;
    } 
  }
  
  public boolean checkLayoutParams(ViewGroup.LayoutParams paramLayoutParams) {
    boolean bool;
    if (super.checkLayoutParams(paramLayoutParams) && paramLayoutParams instanceof c) {
      bool = true;
    } else {
      bool = false;
    } 
    return bool;
  }
  
  public ViewGroup.LayoutParams generateDefaultLayoutParams() {
    return (ViewGroup.LayoutParams)new c(-2, -2);
  }
  
  public ViewGroup.LayoutParams generateLayoutParams(AttributeSet paramAttributeSet) {
    return (ViewGroup.LayoutParams)new c(getContext(), paramAttributeSet);
  }
  
  public ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams paramLayoutParams) {
    return (ViewGroup.LayoutParams)new c(paramLayoutParams);
  }
  
  public int getCheckedChipId() {
    byte b1;
    if (this.g) {
      b1 = this.k;
    } else {
      b1 = -1;
    } 
    return b1;
  }
  
  public int getChipSpacingHorizontal() {
    return this.e;
  }
  
  public int getChipSpacingVertical() {
    return this.f;
  }
  
  public void onFinishInflate() {
    super.onFinishInflate();
    int i = this.k;
    if (i != -1) {
      c(i, true);
      setCheckedId(this.k);
    } 
  }
  
  public void setChipSpacing(int paramInt) {
    setChipSpacingHorizontal(paramInt);
    setChipSpacingVertical(paramInt);
  }
  
  public void setChipSpacingHorizontal(int paramInt) {
    if (this.e != paramInt) {
      this.e = paramInt;
      setItemSpacing(paramInt);
      requestLayout();
    } 
  }
  
  public void setChipSpacingHorizontalResource(int paramInt) {
    setChipSpacingHorizontal(getResources().getDimensionPixelOffset(paramInt));
  }
  
  public void setChipSpacingResource(int paramInt) {
    setChipSpacing(getResources().getDimensionPixelOffset(paramInt));
  }
  
  public void setChipSpacingVertical(int paramInt) {
    if (this.f != paramInt) {
      this.f = paramInt;
      setLineSpacing(paramInt);
      requestLayout();
    } 
  }
  
  public void setChipSpacingVerticalResource(int paramInt) {
    setChipSpacingVertical(getResources().getDimensionPixelOffset(paramInt));
  }
  
  @Deprecated
  public void setDividerDrawableHorizontal(Drawable paramDrawable) {
    throw new UnsupportedOperationException("Changing divider drawables have no effect. ChipGroup do not use divider drawables as spacing.");
  }
  
  @Deprecated
  public void setDividerDrawableVertical(Drawable paramDrawable) {
    throw new UnsupportedOperationException("Changing divider drawables have no effect. ChipGroup do not use divider drawables as spacing.");
  }
  
  @Deprecated
  public void setFlexWrap(int paramInt) {
    throw new UnsupportedOperationException("Changing flex wrap not allowed. ChipGroup exposes a singleLine attribute instead.");
  }
  
  public void setOnCheckedChangeListener(d paramd) {
    this.h = paramd;
  }
  
  public void setOnHierarchyChangeListener(ViewGroup.OnHierarchyChangeListener paramOnHierarchyChangeListener) {
    this.j.b = paramOnHierarchyChangeListener;
  }
  
  @Deprecated
  public void setShowDividerHorizontal(int paramInt) {
    throw new UnsupportedOperationException("Changing divider modes has no effect. ChipGroup do not use divider drawables as spacing.");
  }
  
  @Deprecated
  public void setShowDividerVertical(int paramInt) {
    throw new UnsupportedOperationException("Changing divider modes has no effect. ChipGroup do not use divider drawables as spacing.");
  }
  
  public void setSingleLine(int paramInt) {
    setSingleLine(getResources().getBoolean(paramInt));
  }
  
  public void setSingleLine(boolean paramBoolean) {
    super.setSingleLine(paramBoolean);
  }
  
  public void setSingleSelection(int paramInt) {
    setSingleSelection(getResources().getBoolean(paramInt));
  }
  
  public void setSingleSelection(boolean paramBoolean) {
    if (this.g != paramBoolean) {
      this.g = paramBoolean;
      this.l = true;
      for (byte b1 = 0; b1 < getChildCount(); b1++) {
        View view = getChildAt(b1);
        if (view instanceof Chip)
          ((Chip)view).setChecked(false); 
      } 
      this.l = false;
      setCheckedId(-1);
    } 
  }
  
  public class b implements CompoundButton.OnCheckedChangeListener {
    public final ChipGroup a;
    
    public b(ChipGroup this$0, ChipGroup.a param1a) {}
    
    public void onCheckedChanged(CompoundButton param1CompoundButton, boolean param1Boolean) {
      if (this.a.l)
        return; 
      int i = param1CompoundButton.getId();
      if (param1Boolean) {
        ChipGroup chipGroup = this.a;
        int j = chipGroup.k;
        if (j != -1 && j != i && chipGroup.g)
          chipGroup.c(j, false); 
        ChipGroup.b(this.a, i);
      } else {
        ChipGroup chipGroup = this.a;
        if (chipGroup.k == i)
          ChipGroup.b(chipGroup, -1); 
      } 
    }
  }
  
  public static class c extends ViewGroup.MarginLayoutParams {
    public c(int param1Int1, int param1Int2) {
      super(param1Int1, param1Int2);
    }
    
    public c(Context param1Context, AttributeSet param1AttributeSet) {
      super(param1Context, param1AttributeSet);
    }
    
    public c(ViewGroup.LayoutParams param1LayoutParams) {
      super(param1LayoutParams);
    }
  }
  
  public static interface d {
    void a(ChipGroup param1ChipGroup, int param1Int);
  }
  
  public class e implements ViewGroup.OnHierarchyChangeListener {
    public ViewGroup.OnHierarchyChangeListener b;
    
    public final ChipGroup c;
    
    public e(ChipGroup this$0, ChipGroup.a param1a) {}
    
    public void onChildViewAdded(View param1View1, View param1View2) {
      if (param1View1 == this.c && param1View2 instanceof Chip) {
        if (param1View2.getId() == -1)
          param1View2.setId(View.generateViewId()); 
        ((Chip)param1View2).setOnCheckedChangeListenerInternal(this.c.i);
      } 
      ViewGroup.OnHierarchyChangeListener onHierarchyChangeListener = this.b;
      if (onHierarchyChangeListener != null)
        onHierarchyChangeListener.onChildViewAdded(param1View1, param1View2); 
    }
    
    public void onChildViewRemoved(View param1View1, View param1View2) {
      if (param1View1 == this.c && param1View2 instanceof Chip)
        ((Chip)param1View2).setOnCheckedChangeListenerInternal(null); 
      ViewGroup.OnHierarchyChangeListener onHierarchyChangeListener = this.b;
      if (onHierarchyChangeListener != null)
        onHierarchyChangeListener.onChildViewRemoved(param1View1, param1View2); 
    }
  }
}


/* Location:              C:\Users\panch\Downloads\dvba_v1.1.0-dex2jar.jar!\com\google\android\material\chip\ChipGroup.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */