package b.t;

import android.animation.TypeEvaluator;
import android.graphics.Rect;

public class g implements TypeEvaluator<Rect> {
  public Object evaluate(float paramFloat, Object paramObject1, Object paramObject2) {
    paramObject1 = paramObject1;
    paramObject2 = paramObject2;
    int k = ((Rect)paramObject1).left;
    int i2 = (int)((((Rect)paramObject2).left - k) * paramFloat);
    int i1 = ((Rect)paramObject1).top;
    int m = (int)((((Rect)paramObject2).top - i1) * paramFloat);
    int j = ((Rect)paramObject1).right;
    int n = (int)((((Rect)paramObject2).right - j) * paramFloat);
    int i = ((Rect)paramObject1).bottom;
    return new Rect(k + i2, i1 + m, j + n, i + (int)((((Rect)paramObject2).bottom - i) * paramFloat));
  }
}


/* Location:              C:\Users\panch\Downloads\dvba_v1.1.0-dex2jar.jar!\b\t\g.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */