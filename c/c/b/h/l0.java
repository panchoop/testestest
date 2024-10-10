package c.c.b.h;

import c.c.a.a.f.c.a1;
import c.c.b.h.d0.f;
import c.c.b.h.d0.r;
import com.google.android.gms.common.api.Status;
import com.google.firebase.auth.FirebaseAuth;

public final class l0 implements f, r {
  public final FirebaseAuth a;
  
  public l0(FirebaseAuth paramFirebaseAuth) {}
  
  public final void a(a1 parama1, o paramo) {
    this.a.b(paramo, parama1, true, true);
  }
  
  public final void b(Status paramStatus) {
    int i = paramStatus.c;
    if (i == 17011 || i == 17021 || i == 17005)
      this.a.a(); 
  }
}


/* Location:              C:\Users\panch\Downloads\dvba_v1.1.0-dex2jar.jar!\c\c\b\h\l0.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */