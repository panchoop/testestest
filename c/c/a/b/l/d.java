package c.c.a.b.l;

import android.graphics.drawable.Drawable;
import android.util.Property;
import java.util.WeakHashMap;

public class d extends Property<Drawable, Integer> {
  public static final Property<Drawable, Integer> b = new d();
  
  public final WeakHashMap<Drawable, Integer> a = new WeakHashMap<Drawable, Integer>();
  
  public d() {
    super(Integer.class, "drawableAlphaCompat");
  }
  
  public Object get(Object paramObject) {
    return Integer.valueOf(((Drawable)paramObject).getAlpha());
  }
  
  public void set(Object paramObject1, Object paramObject2) {
    ((Drawable)paramObject1).setAlpha(((Integer)paramObject2).intValue());
  }
}


/* Location:              C:\Users\panch\Downloads\dvba_v1.1.0-dex2jar.jar!\c\c\a\b\l\d.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */