package c.c.b.h;

import c.c.b.h.d0.a;
import c.c.b.m.a;
import com.google.firebase.auth.FirebaseAuth;
import java.util.Iterator;

public final class k0 implements Runnable {
  public final a b;
  
  public final FirebaseAuth c;
  
  public k0(FirebaseAuth paramFirebaseAuth, a parama) {}
  
  public final void run() {
    Iterator<a> iterator = this.c.c.iterator();
    while (iterator.hasNext())
      ((a)iterator.next()).a(this.b); 
    iterator = this.c.b.iterator();
    while (iterator.hasNext())
      ((FirebaseAuth.b)iterator.next()).a(this.c); 
  }
}


/* Location:              C:\Users\panch\Downloads\dvba_v1.1.0-dex2jar.jar!\c\c\b\h\k0.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */