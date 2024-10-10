package com.google.firebase.auth;

import androidx.annotation.Keep;
import c.c.a.a.c.l.q;
import c.c.b.b;
import c.c.b.h.d0.b;
import c.c.b.h.m0;
import c.c.b.i.d;
import c.c.b.i.h;
import c.c.b.i.p;
import java.util.Arrays;
import java.util.List;

@Keep
public class FirebaseAuthRegistrar implements h {
  @Keep
  public List<d<?>> getComponents() {
    boolean bool;
    d.b b = new d.b(FirebaseAuth.class, new Class[] { b.class }, null);
    b.a(new p(b.class, 1, 0));
    b.c(m0.a);
    if (b.c == 0) {
      bool = true;
    } else {
      bool = false;
    } 
    if (bool) {
      b.c = 2;
      return Arrays.asList((d<?>[])new d[] { b.b(), q.j("fire-auth", "19.4.0") });
    } 
    throw new IllegalStateException("Instantiation type has already been set.");
  }
}


/* Location:              C:\Users\panch\Downloads\dvba_v1.1.0-dex2jar.jar!\com\google\firebase\auth\FirebaseAuthRegistrar.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */