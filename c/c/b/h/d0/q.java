package c.c.b.h.d0;

import android.os.Handler;
import android.os.Looper;
import c.c.a.a.f.c.o1;
import java.util.concurrent.Executor;

public final class q implements Executor {
  public static q b = new q();
  
  public Handler a = (Handler)new o1(Looper.getMainLooper());
  
  public final void execute(Runnable paramRunnable) {
    this.a.post(paramRunnable);
  }
}


/* Location:              C:\Users\panch\Downloads\dvba_v1.1.0-dex2jar.jar!\c\c\b\h\d0\q.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */