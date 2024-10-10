package b.b.p;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import android.widget.CompoundButton;
import android.widget.RadioButton;
import android.widget.TextView;
import b.b.l.a.a;

public class r extends RadioButton {
  public final i b;
  
  public final e c;
  
  public final y d;
  
  public r(Context paramContext, AttributeSet paramAttributeSet, int paramInt) {
    super(paramContext, paramAttributeSet, paramInt);
    s0.a((View)this, getContext());
    i i1 = new i((CompoundButton)this);
    this.b = i1;
    i1.b(paramAttributeSet, paramInt);
    e e1 = new e((View)this);
    this.c = e1;
    e1.d(paramAttributeSet, paramInt);
    y y1 = new y((TextView)this);
    this.d = y1;
    y1.e(paramAttributeSet, paramInt);
  }
  
  public void drawableStateChanged() {
    super.drawableStateChanged();
    e e1 = this.c;
    if (e1 != null)
      e1.a(); 
    y y1 = this.d;
    if (y1 != null)
      y1.b(); 
  }
  
  public int getCompoundPaddingLeft() {
    int j = super.getCompoundPaddingLeft();
    i i1 = this.b;
    return j;
  }
  
  public ColorStateList getSupportBackgroundTintList() {
    e e1 = this.c;
    if (e1 != null) {
      ColorStateList colorStateList = e1.b();
    } else {
      e1 = null;
    } 
    return (ColorStateList)e1;
  }
  
  public PorterDuff.Mode getSupportBackgroundTintMode() {
    e e1 = this.c;
    if (e1 != null) {
      PorterDuff.Mode mode = e1.c();
    } else {
      e1 = null;
    } 
    return (PorterDuff.Mode)e1;
  }
  
  public ColorStateList getSupportButtonTintList() {
    i i1 = this.b;
    if (i1 != null) {
      ColorStateList colorStateList = i1.b;
    } else {
      i1 = null;
    } 
    return (ColorStateList)i1;
  }
  
  public PorterDuff.Mode getSupportButtonTintMode() {
    i i1 = this.b;
    if (i1 != null) {
      PorterDuff.Mode mode = i1.c;
    } else {
      i1 = null;
    } 
    return (PorterDuff.Mode)i1;
  }
  
  public void setBackgroundDrawable(Drawable paramDrawable) {
    super.setBackgroundDrawable(paramDrawable);
    e e1 = this.c;
    if (e1 != null)
      e1.e(); 
  }
  
  public void setBackgroundResource(int paramInt) {
    super.setBackgroundResource(paramInt);
    e e1 = this.c;
    if (e1 != null)
      e1.f(paramInt); 
  }
  
  public void setButtonDrawable(int paramInt) {
    setButtonDrawable(a.b(getContext(), paramInt));
  }
  
  public void setButtonDrawable(Drawable paramDrawable) {
    super.setButtonDrawable(paramDrawable);
    i i1 = this.b;
    if (i1 != null)
      if (i1.f) {
        i1.f = false;
      } else {
        i1.f = true;
        i1.a();
      }  
  }
  
  public void setSupportBackgroundTintList(ColorStateList paramColorStateList) {
    e e1 = this.c;
    if (e1 != null)
      e1.h(paramColorStateList); 
  }
  
  public void setSupportBackgroundTintMode(PorterDuff.Mode paramMode) {
    e e1 = this.c;
    if (e1 != null)
      e1.i(paramMode); 
  }
  
  public void setSupportButtonTintList(ColorStateList paramColorStateList) {
    i i1 = this.b;
    if (i1 != null) {
      i1.b = paramColorStateList;
      i1.d = true;
      i1.a();
    } 
  }
  
  public void setSupportButtonTintMode(PorterDuff.Mode paramMode) {
    i i1 = this.b;
    if (i1 != null) {
      i1.c = paramMode;
      i1.e = true;
      i1.a();
    } 
  }
}


/* Location:              C:\Users\panch\Downloads\dvba_v1.1.0-dex2jar.jar!\b\b\p\r.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */