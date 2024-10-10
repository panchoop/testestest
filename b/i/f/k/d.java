package b.i.f.k;

import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.Outline;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.Log;
import java.lang.reflect.Method;

public class d extends c {
  public static Method i;
  
  public d(Drawable paramDrawable) {
    super(paramDrawable);
    e();
  }
  
  public d(e parame, Resources paramResources) {
    super(parame, paramResources);
    e();
  }
  
  public boolean c() {
    int i = Build.VERSION.SDK_INT;
    boolean bool = false;
    null = bool;
    if (i == 21) {
      Drawable drawable = this.g;
      if (!(drawable instanceof android.graphics.drawable.GradientDrawable) && !(drawable instanceof android.graphics.drawable.DrawableContainer) && !(drawable instanceof android.graphics.drawable.InsetDrawable)) {
        null = bool;
        return (drawable instanceof android.graphics.drawable.RippleDrawable) ? true : null;
      } 
    } else {
      return null;
    } 
    return true;
  }
  
  public final void e() {
    if (i == null)
      try {
        i = Drawable.class.getDeclaredMethod("isProjected", new Class[0]);
      } catch (Exception exception) {
        Log.w("WrappedDrawableApi21", "Failed to retrieve Drawable#isProjected() method", exception);
      }  
  }
  
  public Rect getDirtyBounds() {
    return this.g.getDirtyBounds();
  }
  
  public void getOutline(Outline paramOutline) {
    this.g.getOutline(paramOutline);
  }
  
  public boolean isProjected() {
    Drawable drawable = this.g;
    if (drawable != null) {
      Method method = i;
      if (method != null)
        try {
          return ((Boolean)method.invoke(drawable, new Object[0])).booleanValue();
        } catch (Exception exception) {
          Log.w("WrappedDrawableApi21", "Error calling Drawable#isProjected() method", exception);
        }  
    } 
    return false;
  }
  
  public void setHotspot(float paramFloat1, float paramFloat2) {
    this.g.setHotspot(paramFloat1, paramFloat2);
  }
  
  public void setHotspotBounds(int paramInt1, int paramInt2, int paramInt3, int paramInt4) {
    this.g.setHotspotBounds(paramInt1, paramInt2, paramInt3, paramInt4);
  }
  
  public boolean setState(int[] paramArrayOfint) {
    if (super.setState(paramArrayOfint)) {
      invalidateSelf();
      return true;
    } 
    return false;
  }
  
  public void setTint(int paramInt) {
    if (c()) {
      super.setTint(paramInt);
    } else {
      this.g.setTint(paramInt);
    } 
  }
  
  public void setTintList(ColorStateList paramColorStateList) {
    if (c()) {
      this.e.c = paramColorStateList;
      d(getState());
    } else {
      this.g.setTintList(paramColorStateList);
    } 
  }
  
  public void setTintMode(PorterDuff.Mode paramMode) {
    if (c()) {
      this.e.d = paramMode;
      d(getState());
    } else {
      this.g.setTintMode(paramMode);
    } 
  }
}


/* Location:              C:\Users\panch\Downloads\dvba_v1.1.0-dex2jar.jar!\b\i\f\k\d.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */