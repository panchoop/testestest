package b.f;

public class e<E> implements Cloneable {
  public static final Object f = new Object();
  
  public boolean b = false;
  
  public long[] c;
  
  public Object[] d;
  
  public int e;
  
  public e() {
    int i = d.f(10);
    this.c = new long[i];
    this.d = new Object[i];
  }
  
  public void a(long paramLong, E paramE) {
    int i = this.e;
    if (i != 0 && paramLong <= this.c[i - 1]) {
      g(paramLong, paramE);
      return;
    } 
    if (this.b && this.e >= this.c.length)
      d(); 
    int j = this.e;
    if (j >= this.c.length) {
      i = d.f(j + 1);
      long[] arrayOfLong1 = new long[i];
      Object[] arrayOfObject1 = new Object[i];
      long[] arrayOfLong2 = this.c;
      System.arraycopy(arrayOfLong2, 0, arrayOfLong1, 0, arrayOfLong2.length);
      Object[] arrayOfObject2 = this.d;
      System.arraycopy(arrayOfObject2, 0, arrayOfObject1, 0, arrayOfObject2.length);
      this.c = arrayOfLong1;
      this.d = arrayOfObject1;
    } 
    this.c[j] = paramLong;
    this.d[j] = paramE;
    this.e = j + 1;
  }
  
  public void b() {
    int i = this.e;
    Object[] arrayOfObject = this.d;
    for (byte b = 0; b < i; b++)
      arrayOfObject[b] = null; 
    this.e = 0;
    this.b = false;
  }
  
  public e<E> c() {
    try {
      e<E> e1 = (e)super.clone();
      e1.c = (long[])this.c.clone();
      e1.d = (Object[])this.d.clone();
      return e1;
    } catch (CloneNotSupportedException cloneNotSupportedException) {
      throw new AssertionError(cloneNotSupportedException);
    } 
  }
  
  public final void d() {
    int k = this.e;
    long[] arrayOfLong = this.c;
    Object[] arrayOfObject = this.d;
    int j = 0;
    int i;
    for (i = 0; j < k; i = m) {
      Object object = arrayOfObject[j];
      int m = i;
      if (object != f) {
        if (j != i) {
          arrayOfLong[i] = arrayOfLong[j];
          arrayOfObject[i] = object;
          arrayOfObject[j] = null;
        } 
        m = i + 1;
      } 
      j++;
    } 
    this.b = false;
    this.e = i;
  }
  
  public E e(long paramLong) {
    return f(paramLong, null);
  }
  
  public E f(long paramLong, E paramE) {
    int i = d.b(this.c, this.e, paramLong);
    if (i >= 0) {
      Object[] arrayOfObject = this.d;
      if (arrayOfObject[i] != f)
        return (E)arrayOfObject[i]; 
    } 
    return paramE;
  }
  
  public void g(long paramLong, E paramE) {
    int i = d.b(this.c, this.e, paramLong);
    if (i >= 0) {
      this.d[i] = paramE;
    } else {
      int j = i ^ 0xFFFFFFFF;
      if (j < this.e) {
        Object[] arrayOfObject = this.d;
        if (arrayOfObject[j] == f) {
          this.c[j] = paramLong;
          arrayOfObject[j] = paramE;
          return;
        } 
      } 
      i = j;
      if (this.b) {
        i = j;
        if (this.e >= this.c.length) {
          d();
          i = d.b(this.c, this.e, paramLong) ^ 0xFFFFFFFF;
        } 
      } 
      j = this.e;
      if (j >= this.c.length) {
        j = d.f(j + 1);
        long[] arrayOfLong1 = new long[j];
        Object[] arrayOfObject1 = new Object[j];
        long[] arrayOfLong2 = this.c;
        System.arraycopy(arrayOfLong2, 0, arrayOfLong1, 0, arrayOfLong2.length);
        Object[] arrayOfObject2 = this.d;
        System.arraycopy(arrayOfObject2, 0, arrayOfObject1, 0, arrayOfObject2.length);
        this.c = arrayOfLong1;
        this.d = arrayOfObject1;
      } 
      int k = this.e;
      if (k - i != 0) {
        long[] arrayOfLong = this.c;
        j = i + 1;
        System.arraycopy(arrayOfLong, i, arrayOfLong, j, k - i);
        Object[] arrayOfObject = this.d;
        System.arraycopy(arrayOfObject, i, arrayOfObject, j, this.e - i);
      } 
      this.c[i] = paramLong;
      this.d[i] = paramE;
      this.e++;
    } 
  }
  
  public int h() {
    if (this.b)
      d(); 
    return this.e;
  }
  
  public E i(int paramInt) {
    if (this.b)
      d(); 
    return (E)this.d[paramInt];
  }
  
  public String toString() {
    if (h() <= 0)
      return "{}"; 
    StringBuilder stringBuilder = new StringBuilder(this.e * 28);
    stringBuilder.append('{');
    for (byte b = 0; b < this.e; b++) {
      if (b > 0)
        stringBuilder.append(", "); 
      if (this.b)
        d(); 
      stringBuilder.append(this.c[b]);
      stringBuilder.append('=');
      E e1 = i(b);
      if (e1 != this) {
        stringBuilder.append(e1);
      } else {
        stringBuilder.append("(this Map)");
      } 
    } 
    stringBuilder.append('}');
    return stringBuilder.toString();
  }
}


/* Location:              C:\Users\panch\Downloads\dvba_v1.1.0-dex2jar.jar!\b\f\e.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */