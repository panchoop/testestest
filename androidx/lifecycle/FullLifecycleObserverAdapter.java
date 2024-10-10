package androidx.lifecycle;

import b.n.b;
import b.n.d;
import b.n.e;
import b.n.g;

public class FullLifecycleObserverAdapter implements e {
  public final b a;
  
  public final e b;
  
  public FullLifecycleObserverAdapter(b paramb, e parame) {
    this.a = paramb;
    this.b = parame;
  }
  
  public void g(g paramg, d.a parama) {
    switch (parama.ordinal()) {
      case 6:
        throw new IllegalArgumentException("ON_ANY must not been send by anybody");
      case 5:
        this.a.c(paramg);
        break;
      case 4:
        this.a.d(paramg);
        break;
      case 3:
        this.a.b(paramg);
        break;
      case 2:
        this.a.a(paramg);
        break;
      case 1:
        this.a.f(paramg);
        break;
      case 0:
        this.a.e(paramg);
        break;
    } 
    e e1 = this.b;
    if (e1 != null)
      e1.g(paramg, parama); 
  }
}


/* Location:              C:\Users\panch\Downloads\dvba_v1.1.0-dex2jar.jar!\androidx\lifecycle\FullLifecycleObserverAdapter.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */