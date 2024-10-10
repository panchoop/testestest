package b.c.a.a;

import android.os.Looper;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;

public class b extends c {
  public final Object a = new Object();
  
  public final ExecutorService b = Executors.newFixedThreadPool(2, new a(this));
  
  public boolean a() {
    boolean bool;
    if (Looper.getMainLooper().getThread() == Thread.currentThread()) {
      bool = true;
    } else {
      bool = false;
    } 
    return bool;
  }
  
  public class a implements ThreadFactory {
    public final AtomicInteger a = new AtomicInteger(0);
    
    public a(b this$0) {}
    
    public Thread newThread(Runnable param1Runnable) {
      param1Runnable = new Thread(param1Runnable);
      param1Runnable.setName(String.format("arch_disk_io_%d", new Object[] { Integer.valueOf(this.a.getAndIncrement()) }));
      return (Thread)param1Runnable;
    }
  }
}


/* Location:              C:\Users\panch\Downloads\dvba_v1.1.0-dex2jar.jar!\b\c\a\a\b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */