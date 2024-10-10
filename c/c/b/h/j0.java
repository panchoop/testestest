package c.c.b.h;

import com.google.firebase.auth.FirebaseAuth;
import java.util.Iterator;

public final class j0 implements Runnable {
  public final FirebaseAuth b;
  
  public j0(FirebaseAuth paramFirebaseAuth) {}
  
  public final void run() {
    Iterator<FirebaseAuth.a> iterator = this.b.d.iterator();
    while (iterator.hasNext())
      ((FirebaseAuth.a)iterator.next()).a(this.b); 
  }
}


/* Location:              C:\Users\panch\Downloads\dvba_v1.1.0-dex2jar.jar!\c\c\b\h\j0.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */