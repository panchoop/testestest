package c.c.a.a.h;

import java.util.concurrent.Executor;
import javax.annotation.concurrent.GuardedBy;

public final class o<TResult> implements q<TResult> {
  public final Executor a;
  
  public final Object b = new Object();
  
  @GuardedBy("mLock")
  public b<? super TResult> c;
  
  public o(Executor paramExecutor, b<? super TResult> paramb) {
    this.a = paramExecutor;
    this.c = paramb;
  }
  
  public final void a(d<TResult> paramd) {
    if (paramd.b())
      synchronized (this.b) {
        if (this.c == null)
          return; 
        this.a.execute(new p(this, paramd));
      }  
  }
}


/* Location:              C:\Users\panch\Downloads\dvba_v1.1.0-dex2jar.jar!\c\c\a\a\h\o.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */