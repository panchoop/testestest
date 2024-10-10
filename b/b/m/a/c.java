package b.b.m.a;

import android.content.res.ColorStateList;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.Region;
import android.graphics.drawable.Drawable;

public class c extends Drawable implements Drawable.Callback {
  public Drawable b;
  
  public c(Drawable paramDrawable) {
    Drawable drawable = this.b;
    if (drawable != null)
      drawable.setCallback(null); 
    this.b = paramDrawable;
    if (paramDrawable != null)
      paramDrawable.setCallback(this); 
  }
  
  public void draw(Canvas paramCanvas) {
    this.b.draw(paramCanvas);
  }
  
  public int getChangingConfigurations() {
    return this.b.getChangingConfigurations();
  }
  
  public Drawable getCurrent() {
    return this.b.getCurrent();
  }
  
  public int getIntrinsicHeight() {
    return this.b.getIntrinsicHeight();
  }
  
  public int getIntrinsicWidth() {
    return this.b.getIntrinsicWidth();
  }
  
  public int getMinimumHeight() {
    return this.b.getMinimumHeight();
  }
  
  public int getMinimumWidth() {
    return this.b.getMinimumWidth();
  }
  
  public int getOpacity() {
    return this.b.getOpacity();
  }
  
  public boolean getPadding(Rect paramRect) {
    return this.b.getPadding(paramRect);
  }
  
  public int[] getState() {
    return this.b.getState();
  }
  
  public Region getTransparentRegion() {
    return this.b.getTransparentRegion();
  }
  
  public void invalidateDrawable(Drawable paramDrawable) {
    invalidateSelf();
  }
  
  public boolean isAutoMirrored() {
    return this.b.isAutoMirrored();
  }
  
  public boolean isStateful() {
    return this.b.isStateful();
  }
  
  public void jumpToCurrentState() {
    this.b.jumpToCurrentState();
  }
  
  public void onBoundsChange(Rect paramRect) {
    this.b.setBounds(paramRect);
  }
  
  public boolean onLevelChange(int paramInt) {
    return this.b.setLevel(paramInt);
  }
  
  public void scheduleDrawable(Drawable paramDrawable, Runnable paramRunnable, long paramLong) {
    scheduleSelf(paramRunnable, paramLong);
  }
  
  public void setAlpha(int paramInt) {
    this.b.setAlpha(paramInt);
  }
  
  public void setAutoMirrored(boolean paramBoolean) {
    this.b.setAutoMirrored(paramBoolean);
  }
  
  public void setChangingConfigurations(int paramInt) {
    this.b.setChangingConfigurations(paramInt);
  }
  
  public void setColorFilter(ColorFilter paramColorFilter) {
    this.b.setColorFilter(paramColorFilter);
  }
  
  public void setDither(boolean paramBoolean) {
    this.b.setDither(paramBoolean);
  }
  
  public void setFilterBitmap(boolean paramBoolean) {
    this.b.setFilterBitmap(paramBoolean);
  }
  
  public void setHotspot(float paramFloat1, float paramFloat2) {
    this.b.setHotspot(paramFloat1, paramFloat2);
  }
  
  public void setHotspotBounds(int paramInt1, int paramInt2, int paramInt3, int paramInt4) {
    this.b.setHotspotBounds(paramInt1, paramInt2, paramInt3, paramInt4);
  }
  
  public boolean setState(int[] paramArrayOfint) {
    return this.b.setState(paramArrayOfint);
  }
  
  public void setTint(int paramInt) {
    this.b.setTint(paramInt);
  }
  
  public void setTintList(ColorStateList paramColorStateList) {
    this.b.setTintList(paramColorStateList);
  }
  
  public void setTintMode(PorterDuff.Mode paramMode) {
    this.b.setTintMode(paramMode);
  }
  
  public boolean setVisible(boolean paramBoolean1, boolean paramBoolean2) {
    return (super.setVisible(paramBoolean1, paramBoolean2) || this.b.setVisible(paramBoolean1, paramBoolean2));
  }
  
  public void unscheduleDrawable(Drawable paramDrawable, Runnable paramRunnable) {
    unscheduleSelf(paramRunnable);
  }
}


/* Location:              C:\Users\panch\Downloads\dvba_v1.1.0-dex2jar.jar!\b\b\m\a\c.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */