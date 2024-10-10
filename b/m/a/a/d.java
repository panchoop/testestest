package b.m.a.a;

import android.view.animation.Interpolator;

public abstract class d implements Interpolator {
  public final float[] a;
  
  public final float b;
  
  public d(float[] paramArrayOffloat) {
    this.a = paramArrayOffloat;
    this.b = 1.0F / (paramArrayOffloat.length - 1);
  }
  
  public float getInterpolation(float paramFloat) {
    if (paramFloat >= 1.0F)
      return 1.0F; 
    if (paramFloat <= 0.0F)
      return 0.0F; 
    float[] arrayOfFloat = this.a;
    int i = Math.min((int)((arrayOfFloat.length - 1) * paramFloat), arrayOfFloat.length - 2);
    float f2 = i;
    float f1 = this.b;
    f1 = (paramFloat - f2 * f1) / f1;
    arrayOfFloat = this.a;
    paramFloat = arrayOfFloat[i];
    return (arrayOfFloat[i + 1] - arrayOfFloat[i]) * f1 + paramFloat;
  }
}


/* Location:              C:\Users\panch\Downloads\dvba_v1.1.0-dex2jar.jar!\b\m\a\a\d.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */