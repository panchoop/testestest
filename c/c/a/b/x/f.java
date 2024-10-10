package c.c.a.b.x;

import android.animation.FloatEvaluator;
import android.animation.TypeEvaluator;

public class f implements TypeEvaluator<Float> {
  public FloatEvaluator a = new FloatEvaluator();
  
  public f(e parame) {}
  
  public Object evaluate(float paramFloat, Object paramObject1, Object paramObject2) {
    paramObject1 = paramObject1;
    paramObject2 = paramObject2;
    float f1 = this.a.evaluate(paramFloat, (Number)paramObject1, (Number)paramObject2).floatValue();
    paramFloat = f1;
    if (f1 < 0.1F)
      paramFloat = 0.0F; 
    return Float.valueOf(paramFloat);
  }
}


/* Location:              C:\Users\panch\Downloads\dvba_v1.1.0-dex2jar.jar!\c\c\a\b\x\f.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */