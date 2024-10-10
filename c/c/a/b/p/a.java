package c.c.a.b.p;

import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.InsetDrawable;
import android.graphics.drawable.LayerDrawable;
import android.view.View;
import c.c.a.a.c.l.q;
import c.c.a.b.b;
import c.c.a.b.d0.g;
import c.c.a.b.d0.j;
import c.c.a.b.d0.n;
import com.google.android.material.button.MaterialButton;

public class a {
  public final MaterialButton a;
  
  public j b;
  
  public int c;
  
  public int d;
  
  public int e;
  
  public int f;
  
  public int g;
  
  public int h;
  
  public PorterDuff.Mode i;
  
  public ColorStateList j;
  
  public ColorStateList k;
  
  public ColorStateList l;
  
  public Drawable m;
  
  public boolean n = false;
  
  public boolean o = false;
  
  public boolean p = false;
  
  public boolean q;
  
  public LayerDrawable r;
  
  public a(MaterialButton paramMaterialButton, j paramj) {
    this.a = paramMaterialButton;
    this.b = paramj;
  }
  
  public n a() {
    LayerDrawable layerDrawable = this.r;
    if (layerDrawable != null && layerDrawable.getNumberOfLayers() > 1) {
      if (this.r.getNumberOfLayers() > 2) {
        Drawable drawable1 = this.r.getDrawable(2);
        return (n)drawable1;
      } 
      Drawable drawable = this.r.getDrawable(1);
      return (n)drawable;
    } 
    return null;
  }
  
  public g b() {
    return c(false);
  }
  
  public final g c(boolean paramBoolean) {
    LayerDrawable layerDrawable = this.r;
    return (layerDrawable != null && layerDrawable.getNumberOfLayers() > 0) ? (g)((LayerDrawable)((InsetDrawable)this.r.getDrawable(0)).getDrawable()).getDrawable(paramBoolean ^ true) : null;
  }
  
  public final g d() {
    return c(true);
  }
  
  public void e(j paramj) {
    this.b = paramj;
    if (b() != null) {
      g g = b();
      g.b.a = paramj;
      g.invalidateSelf();
    } 
    if (d() != null) {
      g g = d();
      g.b.a = paramj;
      g.invalidateSelf();
    } 
    if (a() != null)
      a().setShapeAppearanceModel(paramj); 
  }
  
  public final void f() {
    g g2 = b();
    g g1 = d();
    if (g2 != null) {
      g2.t(this.h, this.k);
      if (g1 != null) {
        boolean bool;
        float f = this.h;
        if (this.n) {
          bool = q.y((View)this.a, b.colorSurface);
        } else {
          bool = false;
        } 
        g1.s(f, bool);
      } 
    } 
  }
}


/* Location:              C:\Users\panch\Downloads\dvba_v1.1.0-dex2jar.jar!\c\c\a\b\p\a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */