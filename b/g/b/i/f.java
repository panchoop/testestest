package b.g.b.i;

import b.g.b.b;
import b.g.b.d;
import b.g.b.g;

public class f extends d {
  public float f0 = -1.0F;
  
  public int g0 = -1;
  
  public int h0 = -1;
  
  public c i0 = this.z;
  
  public int j0;
  
  public f() {
    byte b = 0;
    this.j0 = 0;
    this.H.clear();
    this.H.add(this.i0);
    int i = this.G.length;
    while (b < i) {
      this.G[b] = this.i0;
      b++;
    } 
  }
  
  public void D(d paramd) {
    if (this.K == null)
      return; 
    int i = paramd.o(this.i0);
    if (this.j0 == 1) {
      this.P = i;
      this.Q = 0;
      w(this.K.i());
      B(0);
    } else {
      this.P = 0;
      this.Q = i;
      B(this.K.o());
      w(0);
    } 
  }
  
  public void E(int paramInt) {
    c c1;
    if (this.j0 == paramInt)
      return; 
    this.j0 = paramInt;
    this.H.clear();
    if (this.j0 == 1) {
      c1 = this.y;
    } else {
      c1 = this.z;
    } 
    this.i0 = c1;
    this.H.add(this.i0);
    int i = this.G.length;
    for (paramInt = 0; paramInt < i; paramInt++)
      this.G[paramInt] = this.i0; 
  }
  
  public void b(d paramd) {
    boolean bool1;
    d.a a = d.a.c;
    e e = (e)this.K;
    if (e == null)
      return; 
    c c2 = e.f(c.a.c);
    c c1 = e.f(c.a.e);
    d d1 = this.K;
    boolean bool2 = true;
    if (d1 != null && d1.J[0] == a) {
      bool1 = true;
    } else {
      bool1 = false;
    } 
    if (this.j0 == 0) {
      c2 = e.f(c.a.d);
      c1 = e.f(c.a.f);
      d d2 = this.K;
      if (d2 != null && d2.J[1] == a) {
        bool1 = bool2;
      } else {
        bool1 = false;
      } 
    } 
    if (this.g0 != -1) {
      g g = paramd.l(this.i0);
      paramd.d(g, paramd.l(c2), this.g0, 8);
      if (bool1)
        paramd.f(paramd.l(c1), g, 0, 5); 
    } else {
      g g;
      if (this.h0 != -1) {
        g g1 = paramd.l(this.i0);
        g = paramd.l(c1);
        paramd.d(g1, g, -this.h0, 8);
        if (bool1) {
          paramd.f(g1, paramd.l(c2), 0, 5);
          paramd.f(g, g1, 0, 5);
        } 
      } else if (this.f0 != -1.0F) {
        g g1 = paramd.l(this.i0);
        g g2 = paramd.l(g);
        float f1 = this.f0;
        b b = paramd.m();
        b.e.j(g1, -1.0F);
        b.e.j(g2, f1);
        paramd.c(b);
      } 
    } 
  }
  
  public boolean c() {
    return true;
  }
  
  public c f(c.a parama) {
    switch (parama.ordinal()) {
      default:
        throw new AssertionError(parama.name());
      case 0:
      case 5:
      case 6:
      case 7:
      case 8:
        return null;
      case 2:
      case 4:
        if (this.j0 == 0)
          return this.i0; 
      case 1:
      case 3:
        break;
    } 
    if (this.j0 == 1)
      return this.i0; 
  }
}


/* Location:              C:\Users\panch\Downloads\dvba_v1.1.0-dex2jar.jar!\b\g\b\i\f.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */