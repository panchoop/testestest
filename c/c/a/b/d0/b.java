package c.c.a.b.d0;

import android.graphics.RectF;
import java.util.Arrays;

public final class b implements c {
  public final c a;
  
  public final float b;
  
  public b(float paramFloat, c paramc) {
    while (paramc instanceof b) {
      paramc = ((b)paramc).a;
      paramFloat += ((b)paramc).b;
    } 
    this.a = paramc;
    this.b = paramFloat;
  }
  
  public float a(RectF paramRectF) {
    return Math.max(0.0F, this.a.a(paramRectF) + this.b);
  }
  
  public boolean equals(Object paramObject) {
    boolean bool = true;
    if (this == paramObject)
      return true; 
    if (!(paramObject instanceof b))
      return false; 
    paramObject = paramObject;
    if (!this.a.equals(((b)paramObject).a) || this.b != ((b)paramObject).b)
      bool = false; 
    return bool;
  }
  
  public int hashCode() {
    return Arrays.hashCode(new Object[] { this.a, Float.valueOf(this.b) });
  }
}


/* Location:              C:\Users\panch\Downloads\dvba_v1.1.0-dex2jar.jar!\c\c\a\b\d0\b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */