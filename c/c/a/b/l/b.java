package c.c.a.b.l;

import android.animation.TypeEvaluator;

public class b implements TypeEvaluator<Integer> {
  public static final b a = new b();
  
  public Object evaluate(float paramFloat, Object paramObject1, Object paramObject2) {
    paramObject1 = paramObject1;
    paramObject2 = paramObject2;
    int i = paramObject1.intValue();
    float f1 = (i >> 24 & 0xFF) / 255.0F;
    float f3 = (i >> 16 & 0xFF) / 255.0F;
    float f5 = (i >> 8 & 0xFF) / 255.0F;
    float f6 = (i & 0xFF) / 255.0F;
    i = paramObject2.intValue();
    float f2 = (i >> 24 & 0xFF) / 255.0F;
    float f8 = (i >> 16 & 0xFF) / 255.0F;
    float f7 = (i >> 8 & 0xFF) / 255.0F;
    float f4 = (i & 0xFF) / 255.0F;
    f3 = (float)Math.pow(f3, 2.2D);
    f5 = (float)Math.pow(f5, 2.2D);
    f6 = (float)Math.pow(f6, 2.2D);
    f8 = (float)Math.pow(f8, 2.2D);
    f7 = (float)Math.pow(f7, 2.2D);
    f4 = (float)Math.pow(f4, 2.2D);
    f3 = (float)Math.pow(((f8 - f3) * paramFloat + f3), 0.45454545454545453D);
    f5 = (float)Math.pow(((f7 - f5) * paramFloat + f5), 0.45454545454545453D);
    f4 = (float)Math.pow(((f4 - f6) * paramFloat + f6), 0.45454545454545453D);
    i = Math.round(((f2 - f1) * paramFloat + f1) * 255.0F);
    return Integer.valueOf(Math.round(f3 * 255.0F) << 16 | i << 24 | Math.round(f5 * 255.0F) << 8 | Math.round(f4 * 255.0F));
  }
}


/* Location:              C:\Users\panch\Downloads\dvba_v1.1.0-dex2jar.jar!\c\c\a\b\l\b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */