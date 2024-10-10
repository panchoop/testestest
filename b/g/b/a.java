package b.g.b;

import java.util.Arrays;

public class a implements b.a {
  public int a = 0;
  
  public final b b;
  
  public final c c;
  
  public int d = 8;
  
  public g e = null;
  
  public int[] f = new int[8];
  
  public int[] g = new int[8];
  
  public float[] h = new float[8];
  
  public int i = -1;
  
  public int j = -1;
  
  public boolean k = false;
  
  public a(b paramb, c paramc) {
    this.b = paramb;
    this.c = paramc;
  }
  
  public float a(int paramInt) {
    int i = this.i;
    for (byte b1 = 0; i != -1 && b1 < this.a; b1++) {
      if (b1 == paramInt)
        return this.h[i]; 
      i = this.g[i];
    } 
    return 0.0F;
  }
  
  public final float b(g paramg, boolean paramBoolean) {
    if (this.e == paramg)
      this.e = null; 
    int i = this.i;
    if (i == -1)
      return 0.0F; 
    byte b1 = 0;
    int j = -1;
    while (i != -1 && b1 < this.a) {
      if (this.f[i] == paramg.c) {
        if (i == this.i) {
          this.i = this.g[i];
        } else {
          int[] arrayOfInt = this.g;
          arrayOfInt[j] = arrayOfInt[i];
        } 
        if (paramBoolean)
          paramg.b(this.b); 
        paramg.m--;
        this.a--;
        this.f[i] = -1;
        if (this.k)
          this.j = i; 
        return this.h[i];
      } 
      int k = this.g[i];
      b1++;
      j = i;
      i = k;
    } 
    return 0.0F;
  }
  
  public void c(g paramg, float paramFloat, boolean paramBoolean) {
    if (paramFloat > -0.001F && paramFloat < 0.001F)
      return; 
    int i = this.i;
    if (i == -1) {
      this.i = 0;
      this.h[0] = paramFloat;
      this.f[0] = paramg.c;
      this.g[0] = -1;
      paramg.m++;
      paramg.a(this.b);
      this.a++;
      if (!this.k) {
        i = this.j + 1;
        this.j = i;
        arrayOfInt1 = this.f;
        if (i >= arrayOfInt1.length) {
          this.k = true;
          this.j = arrayOfInt1.length - 1;
        } 
      } 
      return;
    } 
    int j = 0;
    int k = -1;
    while (i != -1 && j < this.a) {
      int[] arrayOfInt = this.f;
      int n = arrayOfInt[i];
      int m = ((g)arrayOfInt1).c;
      if (n == m) {
        float f = this.h[i] + paramFloat;
        paramFloat = f;
        if (f > -0.001F) {
          paramFloat = f;
          if (f < 0.001F)
            paramFloat = 0.0F; 
        } 
        this.h[i] = paramFloat;
        if (paramFloat == 0.0F) {
          if (i == this.i) {
            this.i = this.g[i];
          } else {
            arrayOfInt = this.g;
            arrayOfInt[k] = arrayOfInt[i];
          } 
          if (paramBoolean)
            arrayOfInt1.b(this.b); 
          if (this.k)
            this.j = i; 
          ((g)arrayOfInt1).m--;
          this.a--;
        } 
        return;
      } 
      if (arrayOfInt[i] < m)
        k = i; 
      i = this.g[i];
      j++;
    } 
    i = this.j;
    if (this.k) {
      int[] arrayOfInt = this.f;
      if (arrayOfInt[i] != -1)
        i = arrayOfInt.length; 
    } else {
      i++;
    } 
    int[] arrayOfInt2 = this.f;
    j = i;
    if (i >= arrayOfInt2.length) {
      j = i;
      if (this.a < arrayOfInt2.length) {
        byte b1 = 0;
        while (true) {
          arrayOfInt2 = this.f;
          j = i;
          if (b1 < arrayOfInt2.length) {
            if (arrayOfInt2[b1] == -1) {
              j = b1;
              break;
            } 
            b1++;
            continue;
          } 
          break;
        } 
      } 
    } 
    arrayOfInt2 = this.f;
    i = j;
    if (j >= arrayOfInt2.length) {
      i = arrayOfInt2.length;
      j = this.d * 2;
      this.d = j;
      this.k = false;
      this.j = i - 1;
      this.h = Arrays.copyOf(this.h, j);
      this.f = Arrays.copyOf(this.f, this.d);
      this.g = Arrays.copyOf(this.g, this.d);
    } 
    this.f[i] = ((g)arrayOfInt1).c;
    this.h[i] = paramFloat;
    arrayOfInt2 = this.g;
    if (k != -1) {
      arrayOfInt2[i] = arrayOfInt2[k];
      arrayOfInt2[k] = i;
    } else {
      arrayOfInt2[i] = this.i;
      this.i = i;
    } 
    ((g)arrayOfInt1).m++;
    arrayOfInt1.a(this.b);
    this.a++;
    if (!this.k)
      this.j++; 
    i = this.j;
    int[] arrayOfInt1 = this.f;
    if (i >= arrayOfInt1.length) {
      this.k = true;
      this.j = arrayOfInt1.length - 1;
    } 
  }
  
  public final void clear() {
    int i = this.i;
    for (byte b1 = 0; i != -1 && b1 < this.a; b1++) {
      g g1 = this.c.d[this.f[i]];
      if (g1 != null)
        g1.b(this.b); 
      i = this.g[i];
    } 
    this.i = -1;
    this.j = -1;
    this.k = false;
    this.a = 0;
  }
  
  public g d(int paramInt) {
    int i = this.i;
    for (byte b1 = 0; i != -1 && b1 < this.a; b1++) {
      if (b1 == paramInt)
        return this.c.d[this.f[i]]; 
      i = this.g[i];
    } 
    return null;
  }
  
  public final float e(g paramg) {
    int i = this.i;
    for (byte b1 = 0; i != -1 && b1 < this.a; b1++) {
      if (this.f[i] == paramg.c)
        return this.h[i]; 
      i = this.g[i];
    } 
    return 0.0F;
  }
  
  public float f(b paramb, boolean paramBoolean) {
    float f = e(paramb.a);
    b(paramb.a, paramBoolean);
    b.a a1 = paramb.e;
    int i = a1.k();
    for (byte b1 = 0; b1 < i; b1++) {
      g g1 = a1.d(b1);
      c(g1, a1.e(g1) * f, paramBoolean);
    } 
    return f;
  }
  
  public boolean g(g paramg) {
    int i = this.i;
    if (i == -1)
      return false; 
    for (byte b1 = 0; i != -1 && b1 < this.a; b1++) {
      if (this.f[i] == paramg.c)
        return true; 
      i = this.g[i];
    } 
    return false;
  }
  
  public void h(float paramFloat) {
    int i = this.i;
    for (byte b1 = 0; i != -1 && b1 < this.a; b1++) {
      float[] arrayOfFloat = this.h;
      arrayOfFloat[i] = arrayOfFloat[i] / paramFloat;
      i = this.g[i];
    } 
  }
  
  public void i() {
    int i = this.i;
    for (byte b1 = 0; i != -1 && b1 < this.a; b1++) {
      float[] arrayOfFloat = this.h;
      arrayOfFloat[i] = arrayOfFloat[i] * -1.0F;
      i = this.g[i];
    } 
  }
  
  public final void j(g paramg, float paramFloat) {
    if (paramFloat == 0.0F) {
      b(paramg, true);
      return;
    } 
    int i = this.i;
    if (i == -1) {
      this.i = 0;
      this.h[0] = paramFloat;
      this.f[0] = paramg.c;
      this.g[0] = -1;
      paramg.m++;
      paramg.a(this.b);
      this.a++;
      if (!this.k) {
        i = this.j + 1;
        this.j = i;
        arrayOfInt1 = this.f;
        if (i >= arrayOfInt1.length) {
          this.k = true;
          this.j = arrayOfInt1.length - 1;
        } 
      } 
      return;
    } 
    int j = 0;
    int k = -1;
    while (i != -1 && j < this.a) {
      int[] arrayOfInt = this.f;
      int n = arrayOfInt[i];
      int m = ((g)arrayOfInt1).c;
      if (n == m) {
        this.h[i] = paramFloat;
        return;
      } 
      if (arrayOfInt[i] < m)
        k = i; 
      i = this.g[i];
      j++;
    } 
    i = this.j;
    if (this.k) {
      int[] arrayOfInt = this.f;
      if (arrayOfInt[i] != -1)
        i = arrayOfInt.length; 
    } else {
      i++;
    } 
    int[] arrayOfInt2 = this.f;
    j = i;
    if (i >= arrayOfInt2.length) {
      j = i;
      if (this.a < arrayOfInt2.length) {
        byte b1 = 0;
        while (true) {
          arrayOfInt2 = this.f;
          j = i;
          if (b1 < arrayOfInt2.length) {
            if (arrayOfInt2[b1] == -1) {
              j = b1;
              break;
            } 
            b1++;
            continue;
          } 
          break;
        } 
      } 
    } 
    arrayOfInt2 = this.f;
    i = j;
    if (j >= arrayOfInt2.length) {
      i = arrayOfInt2.length;
      j = this.d * 2;
      this.d = j;
      this.k = false;
      this.j = i - 1;
      this.h = Arrays.copyOf(this.h, j);
      this.f = Arrays.copyOf(this.f, this.d);
      this.g = Arrays.copyOf(this.g, this.d);
    } 
    this.f[i] = ((g)arrayOfInt1).c;
    this.h[i] = paramFloat;
    arrayOfInt2 = this.g;
    if (k != -1) {
      arrayOfInt2[i] = arrayOfInt2[k];
      arrayOfInt2[k] = i;
    } else {
      arrayOfInt2[i] = this.i;
      this.i = i;
    } 
    ((g)arrayOfInt1).m++;
    arrayOfInt1.a(this.b);
    this.a++;
    if (!this.k)
      this.j++; 
    if (this.a >= this.f.length)
      this.k = true; 
    i = this.j;
    int[] arrayOfInt1 = this.f;
    if (i >= arrayOfInt1.length) {
      this.k = true;
      this.j = arrayOfInt1.length - 1;
    } 
  }
  
  public int k() {
    return this.a;
  }
  
  public String toString() {
    int i = this.i;
    String str = "";
    for (byte b1 = 0; i != -1 && b1 < this.a; b1++) {
      StringBuilder stringBuilder = c.a.a.a.a.e(c.a.a.a.a.c(str, " -> "));
      stringBuilder.append(this.h[i]);
      stringBuilder.append(" : ");
      stringBuilder = c.a.a.a.a.e(stringBuilder.toString());
      stringBuilder.append(this.c.d[this.f[i]]);
      str = stringBuilder.toString();
      i = this.g[i];
    } 
    return str;
  }
}


/* Location:              C:\Users\panch\Downloads\dvba_v1.1.0-dex2jar.jar!\b\g\b\a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */