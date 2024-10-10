package androidx.savedstate;

import b.n.d;
import b.n.e;
import b.n.g;
import b.s.a;

public class SavedStateRegistry$1 implements e {
  public final a a;
  
  public SavedStateRegistry$1(a parama) {}
  
  public void g(g paramg, d.a parama) {
    a a1;
    boolean bool;
    if (parama == d.a.ON_START) {
      a1 = this.a;
      bool = true;
    } else if (parama == d.a.ON_STOP) {
      a1 = this.a;
      bool = false;
    } else {
      return;
    } 
    a1.d = bool;
  }
}


/* Location:              C:\Users\panch\Downloads\dvba_v1.1.0-dex2jar.jar!\androidx\savedstate\SavedStateRegistry$1.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */