package b.n;

import b.c.a.b.b;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Map;

public class h extends d {
  public b.c.a.b.a<f, a> a = new b.c.a.b.a();
  
  public d.b b;
  
  public final WeakReference<g> c;
  
  public int d = 0;
  
  public boolean e = false;
  
  public boolean f = false;
  
  public ArrayList<d.b> g = new ArrayList<d.b>();
  
  public h(g paramg) {
    this.c = new WeakReference<g>(paramg);
    this.b = d.b.c;
  }
  
  public static d.b c(d.a parama) {
    int i = parama.ordinal();
    if (i != 0)
      if (i != 1) {
        if (i != 2) {
          if (i != 3) {
            if (i != 4) {
              if (i == 5)
                return d.b.b; 
              StringBuilder stringBuilder = new StringBuilder();
              stringBuilder.append("Unexpected event value ");
              stringBuilder.append(parama);
              throw new IllegalArgumentException(stringBuilder.toString());
            } 
          } else {
            return d.b.e;
          } 
        } else {
          return d.b.f;
        } 
      } else {
        return d.b.e;
      }  
    return d.b.d;
  }
  
  public static d.b e(d.b paramb1, d.b paramb2) {
    d.b b1 = paramb1;
    if (paramb2 != null) {
      b1 = paramb1;
      if (paramb2.compareTo(paramb1) < 0)
        b1 = paramb2; 
    } 
    return b1;
  }
  
  public static d.a i(d.b paramb) {
    int i = paramb.ordinal();
    if (i != 0 && i != 1) {
      if (i != 2) {
        if (i != 3) {
          if (i != 4) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("Unexpected state value ");
            stringBuilder.append(paramb);
            throw new IllegalArgumentException(stringBuilder.toString());
          } 
          throw new IllegalArgumentException();
        } 
        return d.a.ON_RESUME;
      } 
      return d.a.ON_START;
    } 
    return d.a.ON_CREATE;
  }
  
  public void a(f paramf) {
    boolean bool;
    d.b b2 = this.b;
    d.b b1 = d.b.b;
    if (b2 != b1)
      b1 = d.b.c; 
    a a1 = new a(paramf, b1);
    if ((a)this.a.e(paramf, a1) != null)
      return; 
    g g = this.c.get();
    if (g == null)
      return; 
    if (this.d != 0 || this.e) {
      bool = true;
    } else {
      bool = false;
    } 
    b1 = b(paramf);
    this.d++;
    while (a1.a.compareTo(b1) < 0 && this.a.f.containsKey(paramf)) {
      b1 = a1.a;
      this.g.add(b1);
      a1.a(g, i(a1.a));
      g();
      b1 = b(paramf);
    } 
    if (!bool)
      h(); 
    this.d--;
  }
  
  public final d.b b(f paramf) {
    d.b b1;
    b.c.a.b.a<f, a> a1 = this.a;
    boolean bool = a1.f.containsKey(paramf);
    ArrayList<d.b> arrayList = null;
    if (bool) {
      b.c c = ((b.c)a1.f.get(paramf)).e;
    } else {
      paramf = null;
    } 
    if (paramf != null) {
      d.b b2 = ((a)paramf.getValue()).a;
    } else {
      paramf = null;
    } 
    if (!this.g.isEmpty()) {
      arrayList = this.g;
      b1 = arrayList.get(arrayList.size() - 1);
    } 
    return e(e(this.b, (d.b)paramf), b1);
  }
  
  public void d(d.a parama) {
    f(c(parama));
  }
  
  public final void f(d.b paramb) {
    if (this.b == paramb)
      return; 
    this.b = paramb;
    if (this.e || this.d != 0) {
      this.f = true;
      return;
    } 
    this.e = true;
    h();
    this.e = false;
  }
  
  public final void g() {
    ArrayList<d.b> arrayList = this.g;
    arrayList.remove(arrayList.size() - 1);
  }
  
  public final void h() {
    g g = this.c.get();
    if (g != null) {
      while (true) {
        while (true) {
          b.c.a.b.a<f, a> a1 = this.a;
          break;
        } 
        if (!this.f && SYNTHETIC_LOCAL_VARIABLE_2 != null && this.b.compareTo(((a)((b.c)SYNTHETIC_LOCAL_VARIABLE_2).c).a) > 0) {
          b.d d1 = this.a.b();
          while (d1.hasNext() && !this.f) {
            Map.Entry entry = (Map.Entry)d1.next();
            a a1 = (a)entry.getValue();
            while (a1.a.compareTo(this.b) < 0 && !this.f && this.a.contains(entry.getKey())) {
              d.b b1 = a1.a;
              this.g.add(b1);
              a1.a(g, i(a1.a));
              g();
            } 
          } 
        } 
      } 
      return;
    } 
    throw new IllegalStateException("LifecycleOwner of this LifecycleRegistry is alreadygarbage collected. It is too late to change lifecycle state.");
  }
  
  public static class a {
    public d.b a;
    
    public e b;
    
    public a(f param1f, d.b param1b) {
      this.b = j.d(param1f);
      this.a = param1b;
    }
    
    public void a(g param1g, d.a param1a) {
      d.b b1 = h.c(param1a);
      this.a = h.e(this.a, b1);
      this.b.g(param1g, param1a);
      this.a = b1;
    }
  }
}


/* Location:              C:\Users\panch\Downloads\dvba_v1.1.0-dex2jar.jar!\b\n\h.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */