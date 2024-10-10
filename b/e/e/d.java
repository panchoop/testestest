package b.e.e;

import android.content.res.ColorStateList;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Outline;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;

public class d extends Drawable {
  public float a;
  
  public final Paint b;
  
  public final RectF c;
  
  public final Rect d;
  
  public float e;
  
  public boolean f = false;
  
  public boolean g = true;
  
  public ColorStateList h;
  
  public PorterDuffColorFilter i;
  
  public ColorStateList j;
  
  public PorterDuff.Mode k = PorterDuff.Mode.SRC_IN;
  
  public d(ColorStateList paramColorStateList, float paramFloat) {
    this.a = paramFloat;
    this.b = new Paint(5);
    b(paramColorStateList);
    this.c = new RectF();
    this.d = new Rect();
  }
  
  public final PorterDuffColorFilter a(ColorStateList paramColorStateList, PorterDuff.Mode paramMode) {
    return (paramColorStateList == null || paramMode == null) ? null : new PorterDuffColorFilter(paramColorStateList.getColorForState(getState(), 0), paramMode);
  }
  
  public final void b(ColorStateList paramColorStateList) {
    ColorStateList colorStateList = paramColorStateList;
    if (paramColorStateList == null)
      colorStateList = ColorStateList.valueOf(0); 
    this.h = colorStateList;
    this.b.setColor(colorStateList.getColorForState(getState(), this.h.getDefaultColor()));
  }
  
  public final void c(Rect paramRect) {
    Rect rect = paramRect;
    if (paramRect == null)
      rect = getBounds(); 
    this.c.set(rect.left, rect.top, rect.right, rect.bottom);
    this.d.set(rect);
    if (this.f) {
      float f1 = e.b(this.e, this.a, this.g);
      float f2 = e.a(this.e, this.a, this.g);
      this.d.inset((int)Math.ceil(f2), (int)Math.ceil(f1));
      this.c.set(this.d);
    } 
  }
  
  public void draw(Canvas paramCanvas) {
    boolean bool;
    Paint paint = this.b;
    if (this.i != null && paint.getColorFilter() == null) {
      paint.setColorFilter((ColorFilter)this.i);
      bool = true;
    } else {
      bool = false;
    } 
    RectF rectF = this.c;
    float f = this.a;
    paramCanvas.drawRoundRect(rectF, f, f, paint);
    if (bool)
      paint.setColorFilter(null); 
  }
  
  public int getOpacity() {
    return -3;
  }
  
  public void getOutline(Outline paramOutline) {
    paramOutline.setRoundRect(this.d, this.a);
  }
  
  public boolean isStateful() {
    ColorStateList colorStateList = this.j;
    if (colorStateList == null || !colorStateList.isStateful()) {
      colorStateList = this.h;
      return ((colorStateList != null && colorStateList.isStateful()) || super.isStateful());
    } 
    return true;
  }
  
  public void onBoundsChange(Rect paramRect) {
    super.onBoundsChange(paramRect);
    c(paramRect);
  }
  
  public boolean onStateChange(int[] paramArrayOfint) {
    boolean bool;
    ColorStateList colorStateList2 = this.h;
    int i = colorStateList2.getColorForState(paramArrayOfint, colorStateList2.getDefaultColor());
    if (i != this.b.getColor()) {
      bool = true;
    } else {
      bool = false;
    } 
    if (bool)
      this.b.setColor(i); 
    ColorStateList colorStateList1 = this.j;
    if (colorStateList1 != null) {
      PorterDuff.Mode mode = this.k;
      if (mode != null) {
        this.i = a(colorStateList1, mode);
        return true;
      } 
    } 
    return bool;
  }
  
  public void setAlpha(int paramInt) {
    this.b.setAlpha(paramInt);
  }
  
  public void setColorFilter(ColorFilter paramColorFilter) {
    this.b.setColorFilter(paramColorFilter);
  }
  
  public void setTintList(ColorStateList paramColorStateList) {
    this.j = paramColorStateList;
    this.i = a(paramColorStateList, this.k);
    invalidateSelf();
  }
  
  public void setTintMode(PorterDuff.Mode paramMode) {
    this.k = paramMode;
    this.i = a(this.j, paramMode);
    invalidateSelf();
  }
}


/* Location:              C:\Users\panch\Downloads\dvba_v1.1.0-dex2jar.jar!\b\e\e\d.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */