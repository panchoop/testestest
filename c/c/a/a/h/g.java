package c.c.a.a.h;

import c.c.b.h.c0.a.h;
import java.util.concurrent.Executor;

public final class g<TResult, TContinuationResult> implements g, a, b<TContinuationResult>, q<TResult> {
  public final Executor a;
  
  public final h<TResult, d<TContinuationResult>> b;
  
  public final t<TContinuationResult> c;
  
  public g(Executor paramExecutor, h<TResult, d<TContinuationResult>> paramh, t<TContinuationResult> paramt) {
    this.a = paramExecutor;
    this.b = paramh;
    this.c = paramt;
  }
  
  public final void a(d<TResult> paramd) {
    this.a.execute(new h(this, paramd));
  }
  
  public final void b(Exception paramException) {
    this.c.c(paramException);
  }
}


/* Location:              C:\Users\panch\Downloads\dvba_v1.1.0-dex2jar.jar!\c\c\a\a\h\g.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */