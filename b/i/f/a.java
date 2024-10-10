package b.i.f;

import android.graphics.Color;

public final class a {
  static {
    new ThreadLocal();
  }
  
  public static int a(int paramInt1, int paramInt2) {
    int k = Color.alpha(paramInt2);
    int i = Color.alpha(paramInt1);
    int j = 255 - (255 - i) * (255 - k) / 255;
    return Color.argb(j, b(Color.red(paramInt1), i, Color.red(paramInt2), k, j), b(Color.green(paramInt1), i, Color.green(paramInt2), k, j), b(Color.blue(paramInt1), i, Color.blue(paramInt2), k, j));
  }
  
  public static int b(int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5) {
    return (paramInt5 == 0) ? 0 : (((255 - paramInt2) * paramInt3 * paramInt4 + paramInt1 * 255 * paramInt2) / paramInt5 * 255);
  }
  
  public static int c(int paramInt1, int paramInt2) {
    if (paramInt2 >= 0 && paramInt2 <= 255)
      return paramInt1 & 0xFFFFFF | paramInt2 << 24; 
    throw new IllegalArgumentException("alpha must be between 0 and 255.");
  }
}


/* Location:              C:\Users\panch\Downloads\dvba_v1.1.0-dex2jar.jar!\b\i\f\a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */