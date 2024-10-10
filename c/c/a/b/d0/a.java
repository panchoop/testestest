package c.c.a.b.d0;

import android.graphics.RectF;
import java.util.Arrays;

public final class a implements c {
  public final float a;
  
  public a(float paramFloat) {
    this.a = paramFloat;
  }
  
  public float a(RectF paramRectF) {
    return this.a;
  }
  
  public boolean equals(Object paramObject) {
    boolean bool = true;
    if (this == paramObject)
      return true; 
    if (!(paramObject instanceof a))
      return false; 
    paramObject = paramObject;
    if (this.a != ((a)paramObject).a)
      bool = false; 
    return bool;
  }
  
  public int hashCode() {
    return Arrays.hashCode(new Object[] { Float.valueOf(this.a) });
  }
}


/* Location:              C:\Users\panch\Downloads\dvba_v1.1.0-dex2jar.jar!\c\c\a\b\d0\a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */