package b.g.b.i.l;

import b.g.b.i.a;
import b.g.b.i.d;
import b.g.b.i.h;
import java.util.Iterator;

public class i extends m {
  public i(d paramd) {
    super(paramd);
  }
  
  public void a(d paramd) {
    Object object1;
    Object object2;
    a a = (a)this.b;
    int j = a.h0;
    byte b1 = 0;
    Iterator<f> iterator = this.h.l.iterator();
    byte b = -1;
    while (true) {
      while (true)
        break; 
      if (b1 < SYNTHETIC_LOCAL_VARIABLE_3) {
        object2 = SYNTHETIC_LOCAL_VARIABLE_3;
        object1 = SYNTHETIC_LOCAL_VARIABLE_4;
      } 
    } 
    if (j == 0 || j == 2) {
      this.h.c(object1 + a.j0);
      return;
    } 
    this.h.c(object2 + a.j0);
  }
  
  public void d() {
    d d = this.b;
    if (d instanceof a) {
      j j1;
      f f = this.h;
      f.b = true;
      a a = (a)d;
      int j = a.h0;
      boolean bool = a.i0;
      boolean bool2 = false;
      boolean bool1 = false;
      byte b1 = 0;
      byte b2 = 0;
      if (j != 0) {
        l l;
        f f1;
        if (j != 1) {
          if (j != 2) {
            if (j != 3)
              return; 
            f.e = f.a.h;
            for (b1 = b2; b1 < ((h)a).g0; b1++) {
              d d1 = ((h)a).f0[b1];
              if (bool || d1.X != 8) {
                f1 = d1.e.i;
                f1.k.add(this.h);
                this.h.l.add(f1);
              } 
            } 
          } else {
            f1.e = f.a.g;
            for (b1 = bool2; b1 < ((h)a).g0; b1++) {
              d d1 = ((h)a).f0[b1];
              if (bool || d1.X != 8) {
                f1 = d1.e.h;
                f1.k.add(this.h);
                this.h.l.add(f1);
              } 
            } 
          } 
          m(this.b.e.h);
          l = this.b.e;
        } else {
          f1.e = f.a.f;
          for (b1 = bool1; b1 < ((h)l).g0; b1++) {
            d d1 = ((h)l).f0[b1];
            if (bool || d1.X != 8) {
              f = d1.d.i;
              f.k.add(this.h);
              this.h.l.add(f);
            } 
          } 
          m(this.b.d.h);
          j1 = this.b.d;
        } 
      } else {
        f.e = f.a.e;
        while (b1 < ((h)j1).g0) {
          d d1 = ((h)j1).f0[b1];
          if (bool || d1.X != 8) {
            f f1 = d1.d.h;
            f1.k.add(this.h);
            this.h.l.add(f1);
          } 
          b1++;
        } 
        m(this.b.d.h);
        j1 = this.b.d;
      } 
      m(j1.i);
    } 
  }
  
  public void e() {
    d d = this.b;
    if (d instanceof a) {
      int j = ((a)d).h0;
      if (j == 0 || j == 1) {
        this.b.P = this.h.g;
        return;
      } 
      d.Q = this.h.g;
    } 
  }
  
  public void f() {
    this.c = null;
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


/* Location:              C:\Users\panch\Downloads\dvba_v1.1.0-dex2jar.jar!\b\g\b\i\l\i.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */