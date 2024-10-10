package b.i.j;

import android.os.Handler;
import android.os.HandlerThread;
import android.os.Message;
import java.util.concurrent.Callable;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReentrantLock;

public class c {
  public final Object a = new Object();
  
  public HandlerThread b;
  
  public Handler c;
  
  public int d;
  
  public Handler.Callback e = new a(this);
  
  public final int f;
  
  public final int g;
  
  public final String h;
  
  public c(String paramString, int paramInt1, int paramInt2) {
    this.h = paramString;
    this.g = paramInt1;
    this.f = paramInt2;
    this.d = 0;
  }
  
  public final void a(Runnable paramRunnable) {
    synchronized (this.a) {
      if (this.b == null) {
        HandlerThread handlerThread = new HandlerThread();
        this(this.h, this.g);
        this.b = handlerThread;
        handlerThread.start();
        Handler handler = new Handler();
        this(this.b.getLooper(), this.e);
        this.c = handler;
        this.d++;
      } 
      this.c.removeMessages(0);
      this.c.sendMessage(this.c.obtainMessage(1, paramRunnable));
      return;
    } 
  }
  
  public <T> T b(Callable<T> paramCallable, int paramInt) {
    ReentrantLock reentrantLock = new ReentrantLock();
    Condition condition = reentrantLock.newCondition();
    AtomicReference<Callable<T>> atomicReference = new AtomicReference();
    AtomicBoolean atomicBoolean = new AtomicBoolean(true);
    a(new b(this, atomicReference, paramCallable, reentrantLock, atomicBoolean, condition));
    reentrantLock.lock();
    try {
      if (!atomicBoolean.get()) {
        paramCallable = atomicReference.get();
        return (T)paramCallable;
      } 
      long l = TimeUnit.MILLISECONDS.toNanos(paramInt);
      while (true) {
        try {
          long l1 = condition.awaitNanos(l);
          l = l1;
        } catch (InterruptedException interruptedException1) {}
        if (!atomicBoolean.get()) {
          paramCallable = atomicReference.get();
          return (T)paramCallable;
        } 
        if (l > 0L)
          continue; 
        InterruptedException interruptedException = new InterruptedException();
        this("timeout");
        throw interruptedException;
      } 
    } finally {
      reentrantLock.unlock();
    } 
  }
  
  public class a implements Handler.Callback {
    public final c a;
    
    public a(c this$0) {}
    
    public boolean handleMessage(Message param1Message) {
      int i = param1Message.what;
      if (i != 0) {
        if (i != 1)
          return true; 
        c c1 = this.a;
        Runnable runnable = (Runnable)param1Message.obj;
        if (c1 != null) {
          runnable.run();
          synchronized (c1.a) {
            c1.c.removeMessages(0);
            c1.c.sendMessageDelayed(c1.c.obtainMessage(0), c1.f);
            return true;
          } 
        } 
        throw null;
      } 
      null = this.a;
      synchronized (null.a) {
        if (!null.c.hasMessages(1)) {
          null.b.quit();
          null.b = null;
          null.c = null;
        } 
        return true;
      } 
    }
  }
  
  public class b implements Runnable {
    public final AtomicReference b;
    
    public final Callable c;
    
    public final ReentrantLock d;
    
    public final AtomicBoolean e;
    
    public final Condition f;
    
    public b(c this$0, AtomicReference param1AtomicReference, Callable param1Callable, ReentrantLock param1ReentrantLock, AtomicBoolean param1AtomicBoolean, Condition param1Condition) {}
    
    public void run() {
      try {
        this.b.set(this.c.call());
      } catch (Exception exception) {}
      this.d.lock();
      try {
        this.e.set(false);
        this.f.signal();
        return;
      } finally {
        this.d.unlock();
      } 
    }
  }
  
  public static interface c<T> {
    void a(T param1T);
  }
}


/* Location:              C:\Users\panch\Downloads\dvba_v1.1.0-dex2jar.jar!\b\i\j\c.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */