package b.i.f.k;

import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.Region;
import android.graphics.drawable.Drawable;

public class c extends Drawable implements Drawable.Callback, b, a {
  public static final PorterDuff.Mode h = PorterDuff.Mode.SRC_IN;
  
  public int b;
  
  public PorterDuff.Mode c;
  
  public boolean d;
  
  public e e = new e(this.e);
  
  public boolean f;
  
  public Drawable g;
  
  public c(Drawable paramDrawable) {
    b(paramDrawable);
  }
  
  public c(e parame, Resources paramResources) {
    if (parame != null) {
      Drawable.ConstantState constantState = parame.b;
      if (constantState != null)
        b(constantState.newDrawable(paramResources)); 
    } 
  }
  
  public final Drawable a() {
    return this.g;
  }
  
  public final void b(Drawable paramDrawable) {
    Drawable drawable = this.g;
    if (drawable != null)
      drawable.setCallback(null); 
    this.g = paramDrawable;
    if (paramDrawable != null) {
      paramDrawable.setCallback(this);
      setVisible(paramDrawable.isVisible(), true);
      setState(paramDrawable.getState());
      setLevel(paramDrawable.getLevel());
      setBounds(paramDrawable.getBounds());
      e e1 = this.e;
      if (e1 != null)
        e1.b = paramDrawable.getConstantState(); 
    } 
    invalidateSelf();
  }
  
  public abstract boolean c();
  
  public final boolean d(int[] paramArrayOfint) {
    if (!c())
      return false; 
    e e1 = this.e;
    ColorStateList colorStateList = e1.c;
    PorterDuff.Mode mode = e1.d;
    if (colorStateList != null && mode != null) {
      int i = colorStateList.getColorForState(paramArrayOfint, colorStateList.getDefaultColor());
      if (!this.d || i != this.b || mode != this.c) {
        setColorFilter(i, mode);
        this.b = i;
        this.c = mode;
        this.d = true;
        return true;
      } 
    } else {
      this.d = false;
      clearColorFilter();
    } 
    return false;
  }
  
  public void draw(Canvas paramCanvas) {
    this.g.draw(paramCanvas);
  }
  
  public int getChangingConfigurations() {
    byte b1;
    int i = super.getChangingConfigurations();
    e e1 = this.e;
    if (e1 != null) {
      b1 = e1.getChangingConfigurations();
    } else {
      b1 = 0;
    } 
    return i | b1 | this.g.getChangingConfigurations();
  }
  
  public Drawable.ConstantState getConstantState() {
    e e1 = this.e;
    if (e1 != null) {
      boolean bool;
      if (e1.b != null) {
        bool = true;
      } else {
        bool = false;
      } 
      if (bool) {
        this.e.a = getChangingConfigurations();
        return this.e;
      } 
    } 
    return null;
  }
  
  public Drawable getCurrent() {
    return this.g.getCurrent();
  }
  
  public int getIntrinsicHeight() {
    return this.g.getIntrinsicHeight();
  }
  
  public int getIntrinsicWidth() {
    return this.g.getIntrinsicWidth();
  }
  
  public int getMinimumHeight() {
    return this.g.getMinimumHeight();
  }
  
  public int getMinimumWidth() {
    return this.g.getMinimumWidth();
  }
  
  public int getOpacity() {
    return this.g.getOpacity();
  }
  
  public boolean getPadding(Rect paramRect) {
    return this.g.getPadding(paramRect);
  }
  
  public int[] getState() {
    return this.g.getState();
  }
  
  public Region getTransparentRegion() {
    return this.g.getTransparentRegion();
  }
  
  public void invalidateDrawable(Drawable paramDrawable) {
    invalidateSelf();
  }
  
  public boolean isAutoMirrored() {
    return this.g.isAutoMirrored();
  }
  
  public boolean isStateful() {
    // Byte code:
    //   0: aload_0
    //   1: invokevirtual c : ()Z
    //   4: ifeq -> 24
    //   7: aload_0
    //   8: getfield e : Lb/i/f/k/e;
    //   11: astore_2
    //   12: aload_2
    //   13: ifnull -> 24
    //   16: aload_2
    //   17: getfield c : Landroid/content/res/ColorStateList;
    //   20: astore_2
    //   21: goto -> 26
    //   24: aconst_null
    //   25: astore_2
    //   26: aload_2
    //   27: ifnull -> 37
    //   30: aload_2
    //   31: invokevirtual isStateful : ()Z
    //   34: ifne -> 47
    //   37: aload_0
    //   38: getfield g : Landroid/graphics/drawable/Drawable;
    //   41: invokevirtual isStateful : ()Z
    //   44: ifeq -> 52
    //   47: iconst_1
    //   48: istore_1
    //   49: goto -> 54
    //   52: iconst_0
    //   53: istore_1
    //   54: iload_1
    //   55: ireturn
  }
  
  public void jumpToCurrentState() {
    this.g.jumpToCurrentState();
  }
  
  public Drawable mutate() {
    if (!this.f && super.mutate() == this) {
      this.e = new e(this.e);
      Drawable drawable = this.g;
      if (drawable != null)
        drawable.mutate(); 
      e e1 = this.e;
      if (e1 != null) {
        drawable = this.g;
        if (drawable != null) {
          Drawable.ConstantState constantState = drawable.getConstantState();
        } else {
          drawable = null;
        } 
        e1.b = (Drawable.ConstantState)drawable;
      } 
      this.f = true;
    } 
    return this;
  }
  
  public void onBoundsChange(Rect paramRect) {
    Drawable drawable = this.g;
    if (drawable != null)
      drawable.setBounds(paramRect); 
  }
  
  public boolean onLevelChange(int paramInt) {
    return this.g.setLevel(paramInt);
  }
  
  public void scheduleDrawable(Drawable paramDrawable, Runnable paramRunnable, long paramLong) {
    scheduleSelf(paramRunnable, paramLong);
  }
  
  public void setAlpha(int paramInt) {
    this.g.setAlpha(paramInt);
  }
  
  public void setAutoMirrored(boolean paramBoolean) {
    this.g.setAutoMirrored(paramBoolean);
  }
  
  public void setChangingConfigurations(int paramInt) {
    this.g.setChangingConfigurations(paramInt);
  }
  
  public void setColorFilter(ColorFilter paramColorFilter) {
    this.g.setColorFilter(paramColorFilter);
  }
  
  public void setDither(boolean paramBoolean) {
    this.g.setDither(paramBoolean);
  }
  
  public void setFilterBitmap(boolean paramBoolean) {
    this.g.setFilterBitmap(paramBoolean);
  }
  
  public boolean setState(int[] paramArrayOfint) {
    null = this.g.setState(paramArrayOfint);
    return (d(paramArrayOfint) || null);
  }
  
  public void setTint(int paramInt) {
    setTintList(ColorStateList.valueOf(paramInt));
  }
  
  public abstract void setTintList(ColorStateList paramColorStateList);
  
  public boolean setVisible(boolean paramBoolean1, boolean paramBoolean2) {
    return (super.setVisible(paramBoolean1, paramBoolean2) || this.g.setVisible(paramBoolean1, paramBoolean2));
  }
  
  public void unscheduleDrawable(Drawable paramDrawable, Runnable paramRunnable) {
    unscheduleSelf(paramRunnable);
  }
}


/* Location:              C:\Users\panch\Downloads\dvba_v1.1.0-dex2jar.jar!\b\i\f\k\c.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */