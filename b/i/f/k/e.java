package b.i.f.k;

import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;

public final class e extends Drawable.ConstantState {
  public int a;
  
  public Drawable.ConstantState b;
  
  public ColorStateList c = null;
  
  public PorterDuff.Mode d = c.h;
  
  public e(e parame) {
    if (parame != null) {
      this.a = parame.a;
      this.b = parame.b;
      this.c = parame.c;
      this.d = parame.d;
    } 
  }
  
  public int getChangingConfigurations() {
    byte b;
    int i = this.a;
    Drawable.ConstantState constantState = this.b;
    if (constantState != null) {
      b = constantState.getChangingConfigurations();
    } else {
      b = 0;
    } 
    return i | b;
  }
  
  public Drawable newDrawable() {
    return new d(this, null);
  }
  
  public Drawable newDrawable(Resources paramResources) {
    return new d(this, paramResources);
  }
}


/* Location:              C:\Users\panch\Downloads\dvba_v1.1.0-dex2jar.jar!\b\i\f\k\e.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */