package c.c.a.a.h;

import android.os.Handler;
import android.os.Looper;
import java.util.concurrent.Executor;

public final class f {
  public static final Executor a = new a();
  
  public static final Executor b = new s();
  
  public static final class a implements Executor {
    public final Handler a = new Handler(Looper.getMainLooper());
    
    public final void execute(Runnable param1Runnable) {
      this.a.post(param1Runnable);
    }
  }
}


/* Location:              C:\Users\panch\Downloads\dvba_v1.1.0-dex2jar.jar!\c\c\a\a\h\f.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */