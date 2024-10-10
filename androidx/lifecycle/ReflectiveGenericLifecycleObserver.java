package androidx.lifecycle;

import b.n.a;
import b.n.d;
import b.n.e;
import b.n.g;
import java.util.List;

public class ReflectiveGenericLifecycleObserver implements e {
  public final Object a;
  
  public final a.a b;
  
  public ReflectiveGenericLifecycleObserver(Object paramObject) {
    this.a = paramObject;
    this.b = a.c.b(paramObject.getClass());
  }
  
  public void g(g paramg, d.a parama) {
    a.a a1 = this.b;
    Object object = this.a;
    a.a.a((List)a1.a.get(parama), paramg, parama, object);
    a.a.a((List)a1.a.get(d.a.ON_ANY), paramg, parama, object);
  }
}


/* Location:              C:\Users\panch\Downloads\dvba_v1.1.0-dex2jar.jar!\androidx\lifecycle\ReflectiveGenericLifecycleObserver.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */