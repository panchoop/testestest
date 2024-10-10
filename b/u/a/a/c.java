package b.u.a.a;

import a.a.a.a.a;
import android.animation.TypeEvaluator;
import b.i.f.c;

public class c implements TypeEvaluator<c[]> {
  public c[] a;
  
  public Object evaluate(float paramFloat, Object paramObject1, Object paramObject2) {
    paramObject1 = paramObject1;
    c[] arrayOfC = (c[])paramObject2;
    if (a.e((c[])paramObject1, arrayOfC)) {
      if (!a.e(this.a, (c[])paramObject1))
        this.a = a.x((c[])paramObject1); 
      byte b = 0;
      while (b < paramObject1.length) {
        c c2 = this.a[b];
        Object object = paramObject1[b];
        c c1 = arrayOfC[b];
        if (c2 != null) {
          c2.a = ((c)object).a;
          byte b1 = 0;
          while (true) {
            paramObject2 = ((c)object).b;
            if (b1 < paramObject2.length) {
              float[] arrayOfFloat = c2.b;
              Object object1 = paramObject2[b1];
              arrayOfFloat[b1] = c1.b[b1] * paramFloat + (1.0F - paramFloat) * object1;
              b1++;
              continue;
            } 
            b++;
          } 
        } 
        throw null;
      } 
      return this.a;
    } 
    throw new IllegalArgumentException("Can't interpolate between two incompatible pathData");
  }
}


/* Location:              C:\Users\panch\Downloads\dvba_v1.1.0-dex2jar.jar!\\\u\a\a\c.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */