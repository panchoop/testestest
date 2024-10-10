package b.g.b;

import java.util.Arrays;

public class g {
  public static int n = 1;
  
  public boolean a;
  
  public String b;
  
  public int c = -1;
  
  public int d = -1;
  
  public int e = 0;
  
  public float f;
  
  public boolean g = false;
  
  public float[] h = new float[9];
  
  public float[] i = new float[9];
  
  public a j;
  
  public b[] k = new b[16];
  
  public int l = 0;
  
  public int m = 0;
  
  public g(a parama) {
    this.j = parama;
  }
  
  public final void a(b paramb) {
    int i = 0;
    while (true) {
      int j = this.l;
      if (i < j) {
        if (this.k[i] == paramb)
          return; 
        i++;
        continue;
      } 
      b[] arrayOfB = this.k;
      if (j >= arrayOfB.length)
        this.k = Arrays.<b>copyOf(arrayOfB, arrayOfB.length * 2); 
      arrayOfB = this.k;
      i = this.l;
      arrayOfB[i] = paramb;
      this.l = i + 1;
      return;
    } 
  }
  
  public final void b(b paramb) {
    int j = this.l;
    for (int i = 0; i < j; i++) {
      if (this.k[i] == paramb) {
        while (i < j - 1) {
          b[] arrayOfB = this.k;
          int k = i + 1;
          arrayOfB[i] = arrayOfB[k];
          i = k;
        } 
        this.l--;
        return;
      } 
    } 
  }
  
  public void c() {
    this.b = null;
    this.j = a.f;
    this.e = 0;
    this.c = -1;
    this.d = -1;
    this.f = 0.0F;
    this.g = false;
    int i = this.l;
    for (byte b1 = 0; b1 < i; b1++)
      this.k[b1] = null; 
    this.l = 0;
    this.m = 0;
    this.a = false;
    Arrays.fill(this.i, 0.0F);
  }
  
  public void d(d paramd, float paramFloat) {
    this.f = paramFloat;
    this.g = true;
    int i = this.l;
    for (byte b1 = 0; b1 < i; b1++)
      this.k[b1].k(this, false); 
    this.l = 0;
  }
  
  public final void e(b paramb) {
    int i = this.l;
    for (byte b1 = 0; b1 < i; b1++)
      this.k[b1].l(paramb, false); 
    this.l = 0;
  }
  
  public String toString() {
    StringBuilder stringBuilder;
    if (this.b != null) {
      stringBuilder = c.a.a.a.a.e("");
      stringBuilder.append(this.b);
    } else {
      stringBuilder = c.a.a.a.a.e("");
      stringBuilder.append(this.c);
    } 
    return stringBuilder.toString();
  }
  
  public enum a {
    b, c, d, e, f;
    
    public static final a[] g;
    
    static {
      a a1 = new a("UNKNOWN", 4);
      f = a1;
      g = new a[] { b, c, d, e, a1 };
    }
  }
}


/* Location:              C:\Users\panch\Downloads\dvba_v1.1.0-dex2jar.jar!\b\g\b\g.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */