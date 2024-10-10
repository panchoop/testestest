package c.c.a.b.d0;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.ContextThemeWrapper;
import c.c.a.a.c.l.q;
import c.c.a.b.k;

public class j {
  public d a = new i();
  
  public d b = new i();
  
  public d c = new i();
  
  public d d = new i();
  
  public c e = new a(0.0F);
  
  public c f = new a(0.0F);
  
  public c g = new a(0.0F);
  
  public c h = new a(0.0F);
  
  public f i = new f();
  
  public f j = new f();
  
  public f k = new f();
  
  public f l = new f();
  
  public j() {}
  
  public j(b paramb, a parama) {}
  
  public static b a(Context paramContext, int paramInt1, int paramInt2, c paramc) {
    ContextThemeWrapper contextThemeWrapper;
    Context context = paramContext;
    int i = paramInt1;
    if (paramInt2 != 0) {
      contextThemeWrapper = new ContextThemeWrapper(paramContext, paramInt1);
      i = paramInt2;
    } 
    TypedArray typedArray = contextThemeWrapper.obtainStyledAttributes(i, k.ShapeAppearance);
    try {
      int k = typedArray.getInt(k.ShapeAppearance_cornerFamily, 0);
      paramInt1 = typedArray.getInt(k.ShapeAppearance_cornerFamilyTopLeft, k);
      paramInt2 = typedArray.getInt(k.ShapeAppearance_cornerFamilyTopRight, k);
      i = typedArray.getInt(k.ShapeAppearance_cornerFamilyBottomRight, k);
      k = typedArray.getInt(k.ShapeAppearance_cornerFamilyBottomLeft, k);
      paramc = c(typedArray, k.ShapeAppearance_cornerSize, paramc);
      c c3 = c(typedArray, k.ShapeAppearance_cornerSizeTopLeft, paramc);
      c c2 = c(typedArray, k.ShapeAppearance_cornerSizeTopRight, paramc);
      c c1 = c(typedArray, k.ShapeAppearance_cornerSizeBottomRight, paramc);
      paramc = c(typedArray, k.ShapeAppearance_cornerSizeBottomLeft, paramc);
      b b = new b();
      this();
      d d4 = q.m(paramInt1);
      b.a = d4;
      float f1 = b.b(d4);
      if (f1 != -1.0F)
        b.e(f1); 
      b.e = c3;
      d d3 = q.m(paramInt2);
      b.b = d3;
      f1 = b.b(d3);
      if (f1 != -1.0F)
        b.f(f1); 
      b.f = c2;
      d d2 = q.m(i);
      b.c = d2;
      f1 = b.b(d2);
      if (f1 != -1.0F)
        b.d(f1); 
      b.g = c1;
      d d1 = q.m(k);
      b.d = d1;
      f1 = b.b(d1);
      if (f1 != -1.0F)
        b.c(f1); 
      b.h = paramc;
      return b;
    } finally {
      typedArray.recycle();
    } 
  }
  
  public static b b(Context paramContext, AttributeSet paramAttributeSet, int paramInt1, int paramInt2) {
    a a = new a(false);
    TypedArray typedArray = paramContext.obtainStyledAttributes(paramAttributeSet, k.MaterialShape, paramInt1, paramInt2);
    paramInt2 = typedArray.getResourceId(k.MaterialShape_shapeAppearance, 0);
    paramInt1 = typedArray.getResourceId(k.MaterialShape_shapeAppearanceOverlay, 0);
    typedArray.recycle();
    return a(paramContext, paramInt2, paramInt1, a);
  }
  
  public static c c(TypedArray paramTypedArray, int paramInt, c paramc) {
    TypedValue typedValue = paramTypedArray.peekValue(paramInt);
    if (typedValue == null)
      return paramc; 
    paramInt = typedValue.type;
    return (paramInt == 5) ? new a(TypedValue.complexToDimensionPixelSize(typedValue.data, paramTypedArray.getResources().getDisplayMetrics())) : ((paramInt == 6) ? new h(typedValue.getFraction(1.0F, 1.0F)) : paramc);
  }
  
  public boolean d(RectF paramRectF) {
    boolean bool1;
    boolean bool2;
    boolean bool3;
    boolean bool = this.l.getClass().equals(f.class);
    boolean bool4 = true;
    if (bool && this.j.getClass().equals(f.class) && this.i.getClass().equals(f.class) && this.k.getClass().equals(f.class)) {
      bool1 = true;
    } else {
      bool1 = false;
    } 
    float f1 = this.e.a(paramRectF);
    if (this.f.a(paramRectF) == f1 && this.h.a(paramRectF) == f1 && this.g.a(paramRectF) == f1) {
      bool2 = true;
    } else {
      bool2 = false;
    } 
    if (this.b instanceof i && this.a instanceof i && this.c instanceof i && this.d instanceof i) {
      bool3 = true;
    } else {
      bool3 = false;
    } 
    if (!bool1 || !bool2 || !bool3)
      bool4 = false; 
    return bool4;
  }
  
  public j e(float paramFloat) {
    b b = new b(this);
    b.e = new a(paramFloat);
    b.f = new a(paramFloat);
    b.g = new a(paramFloat);
    b.h = new a(paramFloat);
    return b.a();
  }
  
  public static final class b {
    public d a = new i();
    
    public d b = new i();
    
    public d c = new i();
    
    public d d = new i();
    
    public c e = new a(0.0F);
    
    public c f = new a(0.0F);
    
    public c g = new a(0.0F);
    
    public c h = new a(0.0F);
    
    public f i = new f();
    
    public f j = new f();
    
    public f k = new f();
    
    public f l = new f();
    
    public b() {}
    
    public b(j param1j) {
      this.a = param1j.a;
      this.b = param1j.b;
      this.c = param1j.c;
      this.d = param1j.d;
      this.e = param1j.e;
      this.f = param1j.f;
      this.g = param1j.g;
      this.h = param1j.h;
      this.i = param1j.i;
      this.j = param1j.j;
      this.k = param1j.k;
      this.l = param1j.l;
    }
    
    public static float b(d param1d) {
      return (param1d instanceof i) ? ((i)param1d).a : ((param1d instanceof e) ? ((e)param1d).a : -1.0F);
    }
    
    public j a() {
      return new j(this, null);
    }
    
    public b c(float param1Float) {
      this.h = new a(param1Float);
      return this;
    }
    
    public b d(float param1Float) {
      this.g = new a(param1Float);
      return this;
    }
    
    public b e(float param1Float) {
      this.e = new a(param1Float);
      return this;
    }
    
    public b f(float param1Float) {
      this.f = new a(param1Float);
      return this;
    }
  }
}


/* Location:              C:\Users\panch\Downloads\dvba_v1.1.0-dex2jar.jar!\c\c\a\b\d0\j.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */