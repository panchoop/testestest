package c.c.b.h.c0.a;

import c.c.a.a.c.l.q;
import c.c.a.a.f.c.a1;
import c.c.a.a.f.c.i1;
import c.c.a.a.f.c.v0;
import c.c.a.a.f.c.x0;
import c.c.a.a.f.c.z0;
import c.c.b.b;
import c.c.b.h.b;
import c.c.b.h.d0.f;
import c.c.b.h.o;
import c.c.b.h.x;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Executor;

public abstract class u0<ResultT, CallbackT> implements f<l0, ResultT> {
  public final int a;
  
  public final w0 b = new w0(this);
  
  public b c;
  
  public o d;
  
  public CallbackT e;
  
  public f f;
  
  public b1<ResultT> g;
  
  public final List<x> h = new ArrayList<x>();
  
  public Executor i;
  
  public a1 j;
  
  public z0 k;
  
  public x0 l;
  
  public i1 m;
  
  public String n;
  
  public String o;
  
  public b p;
  
  public String q;
  
  public String r;
  
  public v0 s;
  
  public boolean t;
  
  public boolean u;
  
  public boolean v;
  
  public u0(int paramInt) {
    this.a = paramInt;
  }
  
  public static void g(u0 paramu0) {
    paramu0.h();
    q.i(paramu0.v, "no success or failure set on method implementation");
  }
  
  public final u0<ResultT, CallbackT> c(b paramb) {
    q.g(paramb, "firebaseApp cannot be null");
    this.c = paramb;
    return this;
  }
  
  public final u0<ResultT, CallbackT> d(o paramo) {
    q.g(paramo, "firebaseUser cannot be null");
    this.d = paramo;
    return this;
  }
  
  public final u0<ResultT, CallbackT> e(f paramf) {
    q.g(paramf, "external failure callback cannot be null");
    this.f = paramf;
    return this;
  }
  
  public final u0<ResultT, CallbackT> f(CallbackT paramCallbackT) {
    q.g(paramCallbackT, "external callback cannot be null");
    this.e = paramCallbackT;
    return this;
  }
  
  public abstract void h();
}


/* Location:              C:\Users\panch\Downloads\dvba_v1.1.0-dex2jar.jar!\c\c\b\h\c0\\\u0.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */