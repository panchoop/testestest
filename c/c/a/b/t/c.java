package c.c.a.b.t;

import android.animation.TypeEvaluator;
import android.graphics.drawable.Drawable;
import android.util.Property;
import c.c.a.a.c.l.q;

public interface c {
  void a();
  
  void b();
  
  int getCircularRevealScrimColor();
  
  e getRevealInfo();
  
  void setCircularRevealOverlayDrawable(Drawable paramDrawable);
  
  void setCircularRevealScrimColor(int paramInt);
  
  void setRevealInfo(e parame);
  
  public static class b implements TypeEvaluator<e> {
    public static final TypeEvaluator<c.e> b = new b();
    
    public final c.e a = new c.e(null);
    
    public Object evaluate(float param1Float, Object param1Object1, Object param1Object2) {
      param1Object1 = param1Object1;
      c.e e1 = (c.e)param1Object2;
      param1Object2 = this.a;
      float f2 = q.L(((c.e)param1Object1).a, e1.a, param1Float);
      float f1 = q.L(((c.e)param1Object1).b, e1.b, param1Float);
      param1Float = q.L(((c.e)param1Object1).c, e1.c, param1Float);
      ((c.e)param1Object2).a = f2;
      ((c.e)param1Object2).b = f1;
      ((c.e)param1Object2).c = param1Float;
      return this.a;
    }
  }
  
  public static class c extends Property<c, e> {
    public static final Property<c, c.e> a = new c("circularReveal");
    
    public c(String param1String) {
      super(c.e.class, param1String);
    }
    
    public Object get(Object param1Object) {
      return ((c)param1Object).getRevealInfo();
    }
    
    public void set(Object param1Object1, Object param1Object2) {
      ((c)param1Object1).setRevealInfo((c.e)param1Object2);
    }
  }
  
  public static class d extends Property<c, Integer> {
    public static final Property<c, Integer> a = new d("circularRevealScrimColor");
    
    public d(String param1String) {
      super(Integer.class, param1String);
    }
    
    public Object get(Object param1Object) {
      return Integer.valueOf(((c)param1Object).getCircularRevealScrimColor());
    }
    
    public void set(Object param1Object1, Object param1Object2) {
      ((c)param1Object1).setCircularRevealScrimColor(((Integer)param1Object2).intValue());
    }
  }
  
  public static class e {
    public float a;
    
    public float b;
    
    public float c;
    
    public e() {}
    
    public e(float param1Float1, float param1Float2, float param1Float3) {
      this.a = param1Float1;
      this.b = param1Float2;
      this.c = param1Float3;
    }
    
    public e(c.a param1a) {}
  }
}


/* Location:              C:\Users\panch\Downloads\dvba_v1.1.0-dex2jar.jar!\c\c\a\b\t\c.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */