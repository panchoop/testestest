package b.b.p;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Bitmap;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.util.AttributeSet;
import android.view.View;
import android.widget.ImageButton;
import android.widget.ImageView;
import b.b.a;

public class l extends ImageButton {
  public final e b;
  
  public final m c;
  
  public l(Context paramContext, AttributeSet paramAttributeSet) {
    this(paramContext, paramAttributeSet, a.imageButtonStyle);
  }
  
  public l(Context paramContext, AttributeSet paramAttributeSet, int paramInt) {
    super(paramContext, paramAttributeSet, paramInt);
    s0.a((View)this, getContext());
    e e1 = new e((View)this);
    this.b = e1;
    e1.d(paramAttributeSet, paramInt);
    m m1 = new m((ImageView)this);
    this.c = m1;
    m1.b(paramAttributeSet, paramInt);
  }
  
  public void drawableStateChanged() {
    super.drawableStateChanged();
    e e1 = this.b;
    if (e1 != null)
      e1.a(); 
    m m1 = this.c;
    if (m1 != null)
      m1.a(); 
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
  
  public ColorStateList getSupportImageTintList() {
    null = this.c;
    if (null != null) {
      v0 v0 = null.b;
      if (v0 != null)
        return v0.a; 
    } 
    return null;
  }
  
  public PorterDuff.Mode getSupportImageTintMode() {
    null = this.c;
    if (null != null) {
      v0 v0 = null.b;
      if (v0 != null)
        return v0.b; 
    } 
    return null;
  }
  
  public boolean hasOverlappingRendering() {
    boolean bool1 = this.c.a.getBackground() instanceof android.graphics.drawable.RippleDrawable;
    boolean bool = true;
    if ((bool1 ^ true) == 0 || !super.hasOverlappingRendering())
      bool = false; 
    return bool;
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
  
  public void setImageBitmap(Bitmap paramBitmap) {
    super.setImageBitmap(paramBitmap);
    m m1 = this.c;
    if (m1 != null)
      m1.a(); 
  }
  
  public void setImageDrawable(Drawable paramDrawable) {
    super.setImageDrawable(paramDrawable);
    m m1 = this.c;
    if (m1 != null)
      m1.a(); 
  }
  
  public void setImageResource(int paramInt) {
    this.c.c(paramInt);
  }
  
  public void setImageURI(Uri paramUri) {
    super.setImageURI(paramUri);
    m m1 = this.c;
    if (m1 != null)
      m1.a(); 
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
  
  public void setSupportImageTintList(ColorStateList paramColorStateList) {
    m m1 = this.c;
    if (m1 != null)
      m1.d(paramColorStateList); 
  }
  
  public void setSupportImageTintMode(PorterDuff.Mode paramMode) {
    m m1 = this.c;
    if (m1 != null)
      m1.e(paramMode); 
  }
}


/* Location:              C:\Users\panch\Downloads\dvba_v1.1.0-dex2jar.jar!\b\b\p\l.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */