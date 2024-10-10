package c.c.a.a.h;

import java.util.ArrayDeque;
import java.util.Queue;
import javax.annotation.concurrent.GuardedBy;

public final class r<TResult> {
  public final Object a = new Object();
  
  @GuardedBy("mLock")
  public Queue<q<TResult>> b;
  
  @GuardedBy("mLock")
  public boolean c;
  
  public final void a(d<TResult> paramd) {
    synchronized (this.a) {
      if (this.b == null || this.c)
        return; 
      this.c = true;
      while (true) {
        synchronized (this.a) {
          q<TResult> q = this.b.poll();
          if (q == null) {
            this.c = false;
            return;
          } 
          q.a(paramd);
        } 
      } 
    } 
  }
  
  public final void b(q<TResult> paramq) {
    synchronized (this.a) {
      if (this.b == null) {
        ArrayDeque<q<TResult>> arrayDeque = new ArrayDeque();
        this();
        this.b = arrayDeque;
      } 
      this.b.add(paramq);
      return;
    } 
  }
}


/* Location:              C:\Users\panch\Downloads\dvba_v1.1.0-dex2jar.jar!\c\c\a\a\h\r.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */