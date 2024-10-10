package b.b.p;

import a.a.a.a.a;
import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.ActionMode;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.Button;
import android.widget.TextView;
import b.b.a;
import b.i.n.b;
import b.i.n.e;

public class f extends Button implements b, e {
  public final e b;
  
  public final y c;
  
  public f(Context paramContext, AttributeSet paramAttributeSet) {
    this(paramContext, paramAttributeSet, a.buttonStyle);
  }
  
  public f(Context paramContext, AttributeSet paramAttributeSet, int paramInt) {
    super(paramContext, paramAttributeSet, paramInt);
    s0.a((View)this, getContext());
    e e1 = new e((View)this);
    this.b = e1;
    e1.d(paramAttributeSet, paramInt);
    y y1 = new y((TextView)this);
    this.c = y1;
    y1.e(paramAttributeSet, paramInt);
    this.c.b();
  }
  
  public void drawableStateChanged() {
    super.drawableStateChanged();
    e e1 = this.b;
    if (e1 != null)
      e1.a(); 
    y y1 = this.c;
    if (y1 != null)
      y1.b(); 
  }
  
  public int getAutoSizeMaxTextSize() {
    if (b.a)
      return super.getAutoSizeMaxTextSize(); 
    y y1 = this.c;
    return (y1 != null) ? Math.round(y1.i.e) : -1;
  }
  
  public int getAutoSizeMinTextSize() {
    if (b.a)
      return super.getAutoSizeMinTextSize(); 
    y y1 = this.c;
    return (y1 != null) ? Math.round(y1.i.d) : -1;
  }
  
  public int getAutoSizeStepGranularity() {
    if (b.a)
      return super.getAutoSizeStepGranularity(); 
    y y1 = this.c;
    return (y1 != null) ? Math.round(y1.i.c) : -1;
  }
  
  public int[] getAutoSizeTextAvailableSizes() {
    if (b.a)
      return super.getAutoSizeTextAvailableSizes(); 
    y y1 = this.c;
    return (y1 != null) ? y1.i.f : new int[0];
  }
  
  @SuppressLint({"WrongConstant"})
  public int getAutoSizeTextType() {
    boolean bool1 = b.a;
    boolean bool = false;
    if (bool1) {
      if (super.getAutoSizeTextType() == 1)
        bool = true; 
      return bool;
    } 
    y y1 = this.c;
    return (y1 != null) ? y1.i.a : 0;
  }
  
  public ColorStateList getSupportBackgroundTintList() {
    e e1 = this.b;
    if (e1 != null) {
      ColorStateList colorStateList = e1.b();
    } else {
      e1 = null;
    } 
    return (ColorStateList)e1;
  }
  
  public PorterDuff.Mode getSupportBackgroundTintMode() {
    e e1 = this.b;
    if (e1 != null) {
      PorterDuff.Mode mode = e1.c();
    } else {
      e1 = null;
    } 
    return (PorterDuff.Mode)e1;
  }
  
  public ColorStateList getSupportCompoundDrawablesTintList() {
    v0 v0 = this.c.h;
    if (v0 != null) {
      ColorStateList colorStateList = v0.a;
    } else {
      v0 = null;
    } 
    return (ColorStateList)v0;
  }
  
  public PorterDuff.Mode getSupportCompoundDrawablesTintMode() {
    v0 v0 = this.c.h;
    if (v0 != null) {
      PorterDuff.Mode mode = v0.b;
    } else {
      v0 = null;
    } 
    return (PorterDuff.Mode)v0;
  }
  
  public void onInitializeAccessibilityEvent(AccessibilityEvent paramAccessibilityEvent) {
    super.onInitializeAccessibilityEvent(paramAccessibilityEvent);
    paramAccessibilityEvent.setClassName(Button.class.getName());
  }
  
  public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo paramAccessibilityNodeInfo) {
    super.onInitializeAccessibilityNodeInfo(paramAccessibilityNodeInfo);
    paramAccessibilityNodeInfo.setClassName(Button.class.getName());
  }
  
  public void onLayout(boolean paramBoolean, int paramInt1, int paramInt2, int paramInt3, int paramInt4) {
    super.onLayout(paramBoolean, paramInt1, paramInt2, paramInt3, paramInt4);
    y y1 = this.c;
    if (y1 != null && !b.a)
      y1.i.a(); 
  }
  
  public void onTextChanged(CharSequence paramCharSequence, int paramInt1, int paramInt2, int paramInt3) {
    super.onTextChanged(paramCharSequence, paramInt1, paramInt2, paramInt3);
    y y1 = this.c;
    if (y1 != null && !b.a && y1.d())
      this.c.i.a(); 
  }
  
  public void setAutoSizeTextTypeUniformWithConfiguration(int paramInt1, int paramInt2, int paramInt3, int paramInt4) {
    if (b.a) {
      super.setAutoSizeTextTypeUniformWithConfiguration(paramInt1, paramInt2, paramInt3, paramInt4);
    } else {
      y y1 = this.c;
      if (y1 != null)
        y1.g(paramInt1, paramInt2, paramInt3, paramInt4); 
    } 
  }
  
  public void setAutoSizeTextTypeUniformWithPresetSizes(int[] paramArrayOfint, int paramInt) {
    if (b.a) {
      super.setAutoSizeTextTypeUniformWithPresetSizes(paramArrayOfint, paramInt);
    } else {
      y y1 = this.c;
      if (y1 != null)
        y1.h(paramArrayOfint, paramInt); 
    } 
  }
  
  public void setAutoSizeTextTypeWithDefaults(int paramInt) {
    if (b.a) {
      super.setAutoSizeTextTypeWithDefaults(paramInt);
    } else {
      y y1 = this.c;
      if (y1 != null)
        y1.i(paramInt); 
    } 
  }
  
  public void setBackgroundDrawable(Drawable paramDrawable) {
    super.setBackgroundDrawable(paramDrawable);
    e e1 = this.b;
    if (e1 != null)
      e1.e(); 
  }
  
  public void setBackgroundResource(int paramInt) {
    super.setBackgroundResource(paramInt);
    e e1 = this.b;
    if (e1 != null)
      e1.f(paramInt); 
  }
  
  public void setCustomSelectionActionModeCallback(ActionMode.Callback paramCallback) {
    super.setCustomSelectionActionModeCallback(a.D0((TextView)this, paramCallback));
  }
  
  public void setSupportAllCaps(boolean paramBoolean) {
    y y1 = this.c;
    if (y1 != null)
      y1.a.setAllCaps(paramBoolean); 
  }
  
  public void setSupportBackgroundTintList(ColorStateList paramColorStateList) {
    e e1 = this.b;
    if (e1 != null)
      e1.h(paramColorStateList); 
  }
  
  public void setSupportBackgroundTintMode(PorterDuff.Mode paramMode) {
    e e1 = this.b;
    if (e1 != null)
      e1.i(paramMode); 
  }
  
  public void setSupportCompoundDrawablesTintList(ColorStateList paramColorStateList) {
    this.c.j(paramColorStateList);
    this.c.b();
  }
  
  public void setSupportCompoundDrawablesTintMode(PorterDuff.Mode paramMode) {
    this.c.k(paramMode);
    this.c.b();
  }
  
  public void setTextAppearance(Context paramContext, int paramInt) {
    super.setTextAppearance(paramContext, paramInt);
    y y1 = this.c;
    if (y1 != null)
      y1.f(paramContext, paramInt); 
  }
  
  public void setTextSize(int paramInt, float paramFloat) {
    boolean bool = b.a;
    if (bool) {
      super.setTextSize(paramInt, paramFloat);
    } else {
      y y1 = this.c;
      if (y1 != null && !bool && !y1.d())
        y1.i.f(paramInt, paramFloat); 
    } 
  }
}


/* Location:              C:\Users\panch\Downloads\dvba_v1.1.0-dex2jar.jar!\b\b\p\f.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */