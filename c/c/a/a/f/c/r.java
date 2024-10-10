package c.c.a.a.f.c;

import c.c.a.a.c.l.q;
import java.util.Arrays;

public final class r<K, V> {
  public Object[] a = new Object[8];
  
  public int b = 0;
  
  public final r<K, V> a(K paramK, V paramV) {
    int k = this.b + 1 << 1;
    Object[] arrayOfObject = this.a;
    if (k > arrayOfObject.length) {
      int m = arrayOfObject.length;
      if (k >= 0) {
        int n = m + (m >> 1) + 1;
        m = n;
        if (n < k)
          m = Integer.highestOneBit(k - 1) << 1; 
        n = m;
        if (m < 0)
          n = Integer.MAX_VALUE; 
        this.a = Arrays.copyOf(arrayOfObject, n);
      } else {
        throw new AssertionError("cannot store more than MAX_VALUE elements");
      } 
    } 
    q.x0(paramK, paramV);
    arrayOfObject = this.a;
    int i = this.b;
    int j = i * 2;
    arrayOfObject[j] = paramK;
    arrayOfObject[j + 1] = paramV;
    this.b = i + 1;
    return this;
  }
}


/* Location:              C:\Users\panch\Downloads\dvba_v1.1.0-dex2jar.jar!\c\c\a\a\f\c\r.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */