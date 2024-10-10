package c.c.a.a.h;

import c.c.a.a.c.k.k.l;
import java.util.concurrent.Executor;
import javax.annotation.concurrent.GuardedBy;

public final class k<TResult> implements q<TResult> {
  public final Executor a;
  
  public final Object b = new Object();
  
  @GuardedBy("mLock")
  public l<TResult> c;
  
  public k(Executor paramExecutor, l<TResult> paraml) {
    this.a = paramExecutor;
    this.c = paraml;
  }
  
  public final void a(d<TResult> paramd) {
    synchronized (this.b) {
      if (this.c == null)
        return; 
      this.a.execute(new l(this, paramd));
      return;
    } 
  }
}


/* Location:              C:\Users\panch\Downloads\dvba_v1.1.0-dex2jar.jar!\c\c\a\a\h\k.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */