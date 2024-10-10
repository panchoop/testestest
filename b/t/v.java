package b.t;

import android.graphics.Rect;
import android.os.Build;
import android.util.Property;
import android.view.View;
import b.i.m.l;

public class v {
  public static final b0 a;
  
  public static final Property<View, Float> b = new a(Float.class, "translationAlpha");
  
  static {
    new b(Rect.class, "clipBounds");
  }
  
  public static u a(View paramView) {
    return new t(paramView);
  }
  
  public static float b(View paramView) {
    return a.b(paramView);
  }
  
  public static f0 c(View paramView) {
    return new e0(paramView);
  }
  
  public static void d(View paramView, int paramInt1, int paramInt2, int paramInt3, int paramInt4) {
    a.d(paramView, paramInt1, paramInt2, paramInt3, paramInt4);
  }
  
  static {
    x x;
    int i = Build.VERSION.SDK_INT;
    if (i >= 29) {
      x = new a0();
    } else if (i >= 23) {
      x = new z();
    } else if (i >= 22) {
      x = new y();
    } else {
      x = new x();
    } 
    a = x;
  }
  
  public static final class a extends Property<View, Float> {
    public a(Class param1Class, String param1String) {
      super(param1Class, param1String);
    }
    
    public Object get(Object param1Object) {
      return Float.valueOf(v.b((View)param1Object));
    }
    
    public void set(Object param1Object1, Object param1Object2) {
      param1Object1 = param1Object1;
      float f = ((Float)param1Object2).floatValue();
      v.a.e((View)param1Object1, f);
    }
  }
  
  public static final class b extends Property<View, Rect> {
    public b(Class param1Class, String param1String) {
      super(param1Class, param1String);
    }
    
    public Object get(Object param1Object) {
      return l.k((View)param1Object);
    }
    
    public void set(Object param1Object1, Object param1Object2) {
      l.a0((View)param1Object1, (Rect)param1Object2);
    }
  }
}


/* Location:              C:\Users\panch\Downloads\dvba_v1.1.0-dex2jar.jar!\b\t\v.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */