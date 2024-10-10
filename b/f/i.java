package b.f;

public class i<E> implements Cloneable {
  public static final Object f = new Object();
  
  public boolean b = false;
  
  public int[] c;
  
  public Object[] d;
  
  public int e;
  
  public i() {
    this(10);
  }
  
  public i(int paramInt) {
    if (paramInt == 0) {
      this.c = d.a;
      this.d = d.c;
    } else {
      paramInt = d.e(paramInt);
      this.c = new int[paramInt];
      this.d = new Object[paramInt];
    } 
  }
  
  public void a(int paramInt, E paramE) {
    int j = this.e;
    if (j != 0 && paramInt <= this.c[j - 1]) {
      g(paramInt, paramE);
      return;
    } 
    if (this.b && this.e >= this.c.length)
      c(); 
    int k = this.e;
    if (k >= this.c.length) {
      j = d.e(k + 1);
      int[] arrayOfInt1 = new int[j];
      Object[] arrayOfObject1 = new Object[j];
      int[] arrayOfInt2 = this.c;
      System.arraycopy(arrayOfInt2, 0, arrayOfInt1, 0, arrayOfInt2.length);
      Object[] arrayOfObject2 = this.d;
      System.arraycopy(arrayOfObject2, 0, arrayOfObject1, 0, arrayOfObject2.length);
      this.c = arrayOfInt1;
      this.d = arrayOfObject1;
    } 
    this.c[k] = paramInt;
    this.d[k] = paramE;
    this.e = k + 1;
  }
  
  public i<E> b() {
    try {
      i<E> i1 = (i)super.clone();
      i1.c = (int[])this.c.clone();
      i1.d = (Object[])this.d.clone();
      return i1;
    } catch (CloneNotSupportedException cloneNotSupportedException) {
      throw new AssertionError(cloneNotSupportedException);
    } 
  }
  
  public final void c() {
    int m = this.e;
    int[] arrayOfInt = this.c;
    Object[] arrayOfObject = this.d;
    int k = 0;
    int j;
    for (j = 0; k < m; j = n) {
      Object object = arrayOfObject[k];
      int n = j;
      if (object != f) {
        if (k != j) {
          arrayOfInt[j] = arrayOfInt[k];
          arrayOfObject[j] = object;
          arrayOfObject[k] = null;
        } 
        n = j + 1;
      } 
      k++;
    } 
    this.b = false;
    this.e = j;
  }
  
  public E d(int paramInt) {
    return e(paramInt, null);
  }
  
  public E e(int paramInt, E paramE) {
    paramInt = d.a(this.c, this.e, paramInt);
    if (paramInt >= 0) {
      Object[] arrayOfObject = this.d;
      if (arrayOfObject[paramInt] != f)
        return (E)arrayOfObject[paramInt]; 
    } 
    return paramE;
  }
  
  public int f(int paramInt) {
    if (this.b)
      c(); 
    return this.c[paramInt];
  }
  
  public void g(int paramInt, E paramE) {
    int j = d.a(this.c, this.e, paramInt);
    if (j >= 0) {
      this.d[j] = paramE;
    } else {
      int k = j ^ 0xFFFFFFFF;
      if (k < this.e) {
        Object[] arrayOfObject = this.d;
        if (arrayOfObject[k] == f) {
          this.c[k] = paramInt;
          arrayOfObject[k] = paramE;
          return;
        } 
      } 
      j = k;
      if (this.b) {
        j = k;
        if (this.e >= this.c.length) {
          c();
          j = d.a(this.c, this.e, paramInt) ^ 0xFFFFFFFF;
        } 
      } 
      k = this.e;
      if (k >= this.c.length) {
        k = d.e(k + 1);
        int[] arrayOfInt1 = new int[k];
        Object[] arrayOfObject1 = new Object[k];
        int[] arrayOfInt2 = this.c;
        System.arraycopy(arrayOfInt2, 0, arrayOfInt1, 0, arrayOfInt2.length);
        Object[] arrayOfObject2 = this.d;
        System.arraycopy(arrayOfObject2, 0, arrayOfObject1, 0, arrayOfObject2.length);
        this.c = arrayOfInt1;
        this.d = arrayOfObject1;
      } 
      int m = this.e;
      if (m - j != 0) {
        int[] arrayOfInt = this.c;
        k = j + 1;
        System.arraycopy(arrayOfInt, j, arrayOfInt, k, m - j);
        Object[] arrayOfObject = this.d;
        System.arraycopy(arrayOfObject, j, arrayOfObject, k, this.e - j);
      } 
      this.c[j] = paramInt;
      this.d[j] = paramE;
      this.e++;
    } 
  }
  
  public void h(int paramInt) {
    paramInt = d.a(this.c, this.e, paramInt);
    if (paramInt >= 0) {
      Object[] arrayOfObject = this.d;
      Object object1 = arrayOfObject[paramInt];
      Object object2 = f;
      if (object1 != object2) {
        arrayOfObject[paramInt] = object2;
        this.b = true;
      } 
    } 
  }
  
  public int i() {
    if (this.b)
      c(); 
    return this.e;
  }
  
  public E j(int paramInt) {
    if (this.b)
      c(); 
    return (E)this.d[paramInt];
  }
  
  public String toString() {
    if (i() <= 0)
      return "{}"; 
    StringBuilder stringBuilder = new StringBuilder(this.e * 28);
    stringBuilder.append('{');
    for (byte b = 0; b < this.e; b++) {
      if (b > 0)
        stringBuilder.append(", "); 
      stringBuilder.append(f(b));
      stringBuilder.append('=');
      E e = j(b);
      if (e != this) {
        stringBuilder.append(e);
      } else {
        stringBuilder.append("(this Map)");
      } 
    } 
    stringBuilder.append('}');
    return stringBuilder.toString();
  }
}


/* Location:              C:\Users\panch\Downloads\dvba_v1.1.0-dex2jar.jar!\b\f\i.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */