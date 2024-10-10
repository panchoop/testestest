package b.g.b.i;

import b.g.b.b;
import b.g.b.d;
import b.g.b.g;

public class a extends h {
  public int h0 = 0;
  
  public boolean i0 = true;
  
  public int j0 = 0;
  
  public void b(d paramd) {
    d.a a1 = d.a.d;
    c[] arrayOfC = this.G;
    arrayOfC[0] = this.y;
    arrayOfC[2] = this.z;
    arrayOfC[1] = this.A;
    arrayOfC[3] = this.B;
    for (int i = 0;; i++) {
      arrayOfC = this.G;
      if (i < arrayOfC.length)
        continue; 
      i = this.h0;
      if (i >= 0 && i < 4) {
        int j;
        g g;
        c c2;
        c c1 = arrayOfC[i];
        i = 0;
        while (true)
          i++; 
        if (this.y.c() || this.A.c()) {
          b = 1;
        } else {
          b = 0;
        } 
        if (this.z.c() || this.B.c()) {
          j = 1;
        } else {
          j = 0;
        } 
        if (i == 0 && ((this.h0 == 0 && b) || (this.h0 == 2 && j) || (this.h0 == 1 && b) || (this.h0 == 3 && j))) {
          b = 1;
        } else {
          b = 0;
        } 
        i = 5;
        if (!b)
          i = 4; 
        for (byte b = 0; b < this.g0; b++) {
          d d1 = this.f0[b];
          if (this.i0 || d1.c()) {
            g g1 = paramd.l(d1.G[this.h0]);
            c[] arrayOfC1 = d1.G;
            j = this.h0;
            (arrayOfC1[j]).g = g1;
            if ((arrayOfC1[j]).d != null && (arrayOfC1[j]).d.b == this) {
              j = (arrayOfC1[j]).e + 0;
            } else {
              j = 0;
            } 
            int k = this.h0;
            if (k == 0 || k == 2) {
              g g2 = c1.g;
              k = this.j0;
              b b1 = paramd.m();
              g g3 = paramd.n();
              g3.e = 0;
              b1.f(g2, g1, g3, k - j);
              paramd.c(b1);
            } else {
              g g3 = c1.g;
              k = this.j0;
              b b1 = paramd.m();
              g g2 = paramd.n();
              g2.e = 0;
              b1.e(g3, g1, g2, k + j);
              paramd.c(b1);
            } 
            paramd.d(c1.g, g1, this.j0 + j, i);
          } 
        } 
        i = this.h0;
        if (i == 0) {
          paramd.d(this.A.g, this.y.g, 0, 8);
          paramd.d(this.y.g, this.K.A.g, 0, 4);
          g = this.y.g;
          c2 = this.K.y;
        } else if (i == 1) {
          paramd.d(this.y.g, this.A.g, 0, 8);
          paramd.d(this.y.g, this.K.y.g, 0, 4);
          g = this.y.g;
          c2 = this.K.A;
        } else if (i == 2) {
          paramd.d(this.B.g, this.z.g, 0, 8);
          paramd.d(this.z.g, this.K.B.g, 0, 4);
          g = this.z.g;
          c2 = this.K.z;
        } else if (i == 3) {
          paramd.d(this.z.g, this.B.g, 0, 8);
          paramd.d(this.z.g, this.K.z.g, 0, 4);
          g = this.z.g;
          c2 = this.K.B;
        } else {
          return;
        } 
        paramd.d(g, c2.g, 0, 0);
      } 
      return;
      (arrayOfC[i]).g = paramd.l(arrayOfC[i]);
    } 
  }
  
  public boolean c() {
    return true;
  }
  
  public String toString() {
    StringBuilder stringBuilder = c.a.a.a.a.e("[Barrier] ");
    stringBuilder.append(this.Y);
    stringBuilder.append(" {");
    String str = stringBuilder.toString();
    for (byte b = 0; b < this.g0; b++) {
      d d = this.f0[b];
      String str1 = str;
      if (b > 0)
        str1 = c.a.a.a.a.c(str, ", "); 
      StringBuilder stringBuilder1 = c.a.a.a.a.e(str1);
      stringBuilder1.append(d.Y);
      str = stringBuilder1.toString();
    } 
    return c.a.a.a.a.c(str, "}");
  }
}


/* Location:              C:\Users\panch\Downloads\dvba_v1.1.0-dex2jar.jar!\b\g\b\i\a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */