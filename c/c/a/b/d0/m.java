package c.c.a.b.d0;

import android.graphics.Canvas;
import android.graphics.LinearGradient;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RadialGradient;
import android.graphics.RectF;
import android.graphics.Region;
import android.graphics.Shader;
import java.util.ArrayList;
import java.util.List;

public class m {
  @Deprecated
  public float a;
  
  @Deprecated
  public float b;
  
  @Deprecated
  public float c;
  
  @Deprecated
  public float d;
  
  @Deprecated
  public float e;
  
  @Deprecated
  public float f;
  
  public final List<e> g = new ArrayList<e>();
  
  public final List<f> h = new ArrayList<f>();
  
  public m() {
    e(0.0F, 0.0F, 270.0F, 0.0F);
  }
  
  public void a(float paramFloat1, float paramFloat2, float paramFloat3, float paramFloat4, float paramFloat5, float paramFloat6) {
    boolean bool;
    c c = new c(paramFloat1, paramFloat2, paramFloat3, paramFloat4);
    c.f = paramFloat5;
    c.g = paramFloat6;
    this.g.add(c);
    a a = new a(c);
    float f = paramFloat5 + paramFloat6;
    if (paramFloat6 < 0.0F) {
      bool = true;
    } else {
      bool = false;
    } 
    paramFloat6 = paramFloat5;
    if (bool)
      paramFloat6 = (paramFloat5 + 180.0F) % 360.0F; 
    if (bool) {
      paramFloat5 = (180.0F + f) % 360.0F;
    } else {
      paramFloat5 = f;
    } 
    b(paramFloat6);
    this.h.add(a);
    this.e = paramFloat5;
    paramFloat5 = (paramFloat3 - paramFloat1) / 2.0F;
    double d = f;
    this.c = paramFloat5 * (float)Math.cos(Math.toRadians(d)) + (paramFloat1 + paramFloat3) * 0.5F;
    this.d = (paramFloat4 - paramFloat2) / 2.0F * (float)Math.sin(Math.toRadians(d)) + (paramFloat2 + paramFloat4) * 0.5F;
  }
  
  public final void b(float paramFloat) {
    float f1 = this.e;
    if (f1 == paramFloat)
      return; 
    float f3 = (paramFloat - f1 + 360.0F) % 360.0F;
    if (f3 > 180.0F)
      return; 
    float f2 = this.c;
    f1 = this.d;
    c c = new c(f2, f1, f2, f1);
    c.f = this.e;
    c.g = f3;
    this.h.add(new a(c));
    this.e = paramFloat;
  }
  
  public void c(Matrix paramMatrix, Path paramPath) {
    int i = this.g.size();
    for (byte b = 0; b < i; b++)
      ((e)this.g.get(b)).a(paramMatrix, paramPath); 
  }
  
  public void d(float paramFloat1, float paramFloat2) {
    d d = new d();
    d.b = paramFloat1;
    d.c = paramFloat2;
    this.g.add(d);
    b b = new b(d, this.c, this.d);
    float f1 = b.b();
    float f2 = b.b();
    b(f1 + 270.0F);
    this.h.add(b);
    this.e = f2 + 270.0F;
    this.c = paramFloat1;
    this.d = paramFloat2;
  }
  
  public void e(float paramFloat1, float paramFloat2, float paramFloat3, float paramFloat4) {
    this.a = paramFloat1;
    this.b = paramFloat2;
    this.c = paramFloat1;
    this.d = paramFloat2;
    this.e = paramFloat3;
    this.f = (paramFloat3 + paramFloat4) % 360.0F;
    this.g.clear();
    this.h.clear();
  }
  
  public static class a extends f {
    public final m.c b;
    
    public a(m.c param1c) {
      this.b = param1c;
    }
    
    public void a(Matrix param1Matrix, c.c.a.b.c0.a param1a, int param1Int, Canvas param1Canvas) {
      boolean bool;
      m.c c1 = this.b;
      float f2 = c1.f;
      float f1 = c1.g;
      c1 = this.b;
      RectF rectF = new RectF(c1.b, c1.c, c1.d, c1.e);
      if (f1 < 0.0F) {
        bool = true;
      } else {
        bool = false;
      } 
      Path path = param1a.g;
      if (bool) {
        int[] arrayOfInt = c.c.a.b.c0.a.j;
        arrayOfInt[0] = 0;
        arrayOfInt[1] = param1a.f;
        arrayOfInt[2] = param1a.e;
        arrayOfInt[3] = param1a.d;
      } else {
        path.rewind();
        path.moveTo(rectF.centerX(), rectF.centerY());
        path.arcTo(rectF, f2, f1);
        path.close();
        float f5 = -param1Int;
        rectF.inset(f5, f5);
        int[] arrayOfInt = c.c.a.b.c0.a.j;
        arrayOfInt[0] = 0;
        arrayOfInt[1] = param1a.d;
        arrayOfInt[2] = param1a.e;
        arrayOfInt[3] = param1a.f;
      } 
      float f3 = 1.0F - param1Int / rectF.width() / 2.0F;
      float f4 = (1.0F - f3) / 2.0F;
      float[] arrayOfFloat = c.c.a.b.c0.a.k;
      arrayOfFloat[1] = f3;
      arrayOfFloat[2] = f4 + f3;
      param1a.b.setShader((Shader)new RadialGradient(rectF.centerX(), rectF.centerY(), rectF.width() / 2.0F, c.c.a.b.c0.a.j, c.c.a.b.c0.a.k, Shader.TileMode.CLAMP));
      param1Canvas.save();
      param1Canvas.concat(param1Matrix);
      if (!bool)
        param1Canvas.clipPath(path, Region.Op.DIFFERENCE); 
      param1Canvas.drawArc(rectF, f2, f1, true, param1a.b);
      param1Canvas.restore();
    }
  }
  
  public static class b extends f {
    public final m.d b;
    
    public final float c;
    
    public final float d;
    
    public b(m.d param1d, float param1Float1, float param1Float2) {
      this.b = param1d;
      this.c = param1Float1;
      this.d = param1Float2;
    }
    
    public void a(Matrix param1Matrix, c.c.a.b.c0.a param1a, int param1Int, Canvas param1Canvas) {
      m.d d1 = this.b;
      float f4 = d1.c;
      float f2 = this.d;
      float f1 = d1.b;
      float f3 = this.c;
      RectF rectF = new RectF(0.0F, 0.0F, (float)Math.hypot((f4 - f2), (f1 - f3)), 0.0F);
      param1Matrix = new Matrix(param1Matrix);
      param1Matrix.preTranslate(this.c, this.d);
      param1Matrix.preRotate(b());
      if (param1a != null) {
        rectF.bottom += param1Int;
        rectF.offset(0.0F, -param1Int);
        int[] arrayOfInt = c.c.a.b.c0.a.h;
        arrayOfInt[0] = param1a.f;
        arrayOfInt[1] = param1a.e;
        arrayOfInt[2] = param1a.d;
        Paint paint = param1a.c;
        f1 = rectF.left;
        paint.setShader((Shader)new LinearGradient(f1, rectF.top, f1, rectF.bottom, c.c.a.b.c0.a.h, c.c.a.b.c0.a.i, Shader.TileMode.CLAMP));
        param1Canvas.save();
        param1Canvas.concat(param1Matrix);
        param1Canvas.drawRect(rectF, param1a.c);
        param1Canvas.restore();
        return;
      } 
      throw null;
    }
    
    public float b() {
      m.d d1 = this.b;
      return (float)Math.toDegrees(Math.atan(((d1.c - this.d) / (d1.b - this.c))));
    }
  }
  
  public static class c extends e {
    public static final RectF h = new RectF();
    
    @Deprecated
    public float b;
    
    @Deprecated
    public float c;
    
    @Deprecated
    public float d;
    
    @Deprecated
    public float e;
    
    @Deprecated
    public float f;
    
    @Deprecated
    public float g;
    
    public c(float param1Float1, float param1Float2, float param1Float3, float param1Float4) {
      this.b = param1Float1;
      this.c = param1Float2;
      this.d = param1Float3;
      this.e = param1Float4;
    }
    
    public void a(Matrix param1Matrix, Path param1Path) {
      Matrix matrix = this.a;
      param1Matrix.invert(matrix);
      param1Path.transform(matrix);
      h.set(this.b, this.c, this.d, this.e);
      param1Path.arcTo(h, this.f, this.g, false);
      param1Path.transform(param1Matrix);
    }
  }
  
  public static class d extends e {
    public float b;
    
    public float c;
    
    public void a(Matrix param1Matrix, Path param1Path) {
      Matrix matrix = this.a;
      param1Matrix.invert(matrix);
      param1Path.transform(matrix);
      param1Path.lineTo(this.b, this.c);
      param1Path.transform(param1Matrix);
    }
  }
  
  public static abstract class e {
    public final Matrix a = new Matrix();
    
    public abstract void a(Matrix param1Matrix, Path param1Path);
  }
  
  public static abstract class f {
    public static final Matrix a = new Matrix();
    
    public abstract void a(Matrix param1Matrix, c.c.a.b.c0.a param1a, int param1Int, Canvas param1Canvas);
  }
}


/* Location:              C:\Users\panch\Downloads\dvba_v1.1.0-dex2jar.jar!\c\c\a\b\d0\m.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */