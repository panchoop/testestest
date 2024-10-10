package b.e.e;

import android.graphics.drawable.Drawable;

public class e extends Drawable {
  public static final double a = Math.cos(Math.toRadians(45.0D));
  
  public static float a(float paramFloat1, float paramFloat2, boolean paramBoolean) {
    float f = paramFloat1;
    if (paramBoolean) {
      double d = paramFloat1;
      f = (float)((1.0D - a) * paramFloat2 + d);
    } 
    return f;
  }
  
  public static float b(float paramFloat1, float paramFloat2, boolean paramBoolean) {
    float f = paramFloat1 * 1.5F;
    paramFloat1 = f;
    if (paramBoolean) {
      double d = f;
      paramFloat1 = (float)((1.0D - a) * paramFloat2 + d);
    } 
    return paramFloat1;
  }
}


/* Location:              C:\Users\panch\Downloads\dvba_v1.1.0-dex2jar.jar!\b\e\e\e.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */