package c.c.a.a.h;

import java.util.concurrent.Executor;
import javax.annotation.concurrent.GuardedBy;

public final class i<TResult> implements q<TResult> {
  public final Executor a;
  
  public final Object b = new Object();
  
  @GuardedBy("mLock")
  public g c;
  
  public i(Executor paramExecutor, g paramg) {
    this.a = paramExecutor;
    this.c = paramg;
  }
  
  public final void a(d paramd) {
    if (((t)paramd).d)
      synchronized (this.b) {
        if (this.c == null)
          return; 
        this.a.execute(new j(this));
      }  
  }
}


/* Location:              C:\Users\panch\Downloads\dvba_v1.1.0-dex2jar.jar!\c\c\a\a\h\i.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */