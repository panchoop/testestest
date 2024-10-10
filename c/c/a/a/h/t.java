package c.c.a.a.h;

import c.c.a.a.c.l.q;
import java.util.concurrent.CancellationException;
import javax.annotation.concurrent.GuardedBy;

public final class t<TResult> extends d<TResult> {
  public final Object a = new Object();
  
  public final r<TResult> b = new r<TResult>();
  
  @GuardedBy("mLock")
  public boolean c;
  
  public volatile boolean d;
  
  @GuardedBy("mLock")
  public TResult e;
  
  @GuardedBy("mLock")
  public Exception f;
  
  public final TResult a() {
    synchronized (this.a) {
      q.i(this.c, "Task is not yet complete");
      if (!this.d) {
        if (this.f == null)
          return this.e; 
        c c = new c();
        this(this.f);
        throw c;
      } 
      CancellationException cancellationException = new CancellationException();
      this("Task is already canceled.");
      throw cancellationException;
    } 
  }
  
  public final boolean b() {
    synchronized (this.a) {
      boolean bool;
      if (this.c && !this.d && this.f == null) {
        bool = true;
      } else {
        bool = false;
      } 
      return bool;
    } 
  }
  
  public final void c(Exception paramException) {
    q.g(paramException, "Exception must not be null");
    synchronized (this.a) {
      q.i(this.c ^ true, "Task is already complete");
      this.c = true;
      this.f = paramException;
      this.b.a(this);
      return;
    } 
  }
  
  public final void d(TResult paramTResult) {
    synchronized (this.a) {
      q.i(this.c ^ true, "Task is already complete");
      this.c = true;
      this.e = paramTResult;
      this.b.a(this);
      return;
    } 
  }
  
  public final void e() {
    synchronized (this.a) {
      if (!this.c)
        return; 
      this.b.a(this);
      return;
    } 
  }
}


/* Location:              C:\Users\panch\Downloads\dvba_v1.1.0-dex2jar.jar!\c\c\a\a\h\t.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */