package c.c.a.a.h;

import java.util.concurrent.Executor;
import javax.annotation.concurrent.GuardedBy;

public final class m<TResult> implements q<TResult> {
  public final Executor a;
  
  public final Object b = new Object();
  
  @GuardedBy("mLock")
  public a c;
  
  public m(Executor paramExecutor, a parama) {
    this.a = paramExecutor;
    this.c = parama;
  }
  
  public final void a(d<TResult> paramd) {
    if (!paramd.b() && !((t)paramd).d)
      synchronized (this.b) {
        if (this.c == null)
          return; 
        this.a.execute(new n(this, paramd));
      }  
  }
}


/* Location:              C:\Users\panch\Downloads\dvba_v1.1.0-dex2jar.jar!\c\c\a\a\h\m.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */