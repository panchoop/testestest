package b.g.b.i.l;

import b.g.b.i.d;
import b.g.b.i.f;

public class h extends m {
  public h(d paramd) {
    super(paramd);
    paramd.d.f();
    paramd.e.f();
    this.f = ((f)paramd).j0;
  }
  
  public void a(d paramd) {
    paramd = this.h;
    if (!((f)paramd).c)
      return; 
    if (((f)paramd).j)
      return; 
    paramd = ((f)paramd).l.get(0);
    f f = (f)this.b;
    int i = (int)(((f)paramd).g * f.f0 + 0.5F);
    this.h.c(i);
  }
  
  public void d() {
    j j1;
    l l;
    d d = this.b;
    f f = (f)d;
    int i = f.g0;
    int j = f.h0;
    if (f.j0 == 1) {
      f f1 = this.h;
      if (i != -1) {
        f1.l.add(d.K.d.h);
        this.b.K.d.h.k.add(this.h);
        this.h.f = i;
      } else if (j != -1) {
        f1.l.add(d.K.d.i);
        this.b.K.d.i.k.add(this.h);
        this.h.f = -j;
      } else {
        f1.b = true;
        f1.l.add(d.K.d.i);
        this.b.K.d.i.k.add(this.h);
      } 
      m(this.b.d.h);
      j1 = this.b.d;
    } else {
      f f1 = this.h;
      if (i != -1) {
        f1.l.add(((d)j1).K.e.h);
        this.b.K.e.h.k.add(this.h);
        this.h.f = i;
      } else if (j != -1) {
        f1.l.add(((d)j1).K.e.i);
        this.b.K.e.i.k.add(this.h);
        this.h.f = -j;
      } else {
        f1.b = true;
        f1.l.add(((d)j1).K.e.i);
        this.b.K.e.i.k.add(this.h);
      } 
      m(this.b.e.h);
      l = this.b.e;
    } 
    m(l.i);
  }
  
  public void e() {
    d d = this.b;
    if (((f)d).j0 == 1) {
      d.P = this.h.g;
    } else {
      d.Q = this.h.g;
    } 
  }
  
  public void f() {
    this.h.b();
  }
  
  public boolean k() {
    return false;
  }
  
  public final void m(f paramf) {
    this.h.k.add(paramf);
    paramf.l.add(this.h);
  }
}


/* Location:              C:\Users\panch\Downloads\dvba_v1.1.0-dex2jar.jar!\b\g\b\i\l\h.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */