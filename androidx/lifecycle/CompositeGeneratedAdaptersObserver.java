package androidx.lifecycle;

import b.n.c;
import b.n.d;
import b.n.e;
import b.n.g;
import b.n.k;

public class CompositeGeneratedAdaptersObserver implements e {
  public final c[] a;
  
  public CompositeGeneratedAdaptersObserver(c[] paramArrayOfc) {
    this.a = paramArrayOfc;
  }
  
  public void g(g paramg, d.a parama) {
    k k = new k();
    c[] arrayOfC = this.a;
    int i = arrayOfC.length;
    boolean bool = false;
    byte b;
    for (b = 0; b < i; b++)
      arrayOfC[b].a(paramg, parama, false, k); 
    arrayOfC = this.a;
    i = arrayOfC.length;
    for (b = bool; b < i; b++)
      arrayOfC[b].a(paramg, parama, true, k); 
  }
}


/* Location:              C:\Users\panch\Downloads\dvba_v1.1.0-dex2jar.jar!\androidx\lifecycle\CompositeGeneratedAdaptersObserver.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */