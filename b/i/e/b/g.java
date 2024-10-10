package b.i.e.b;

import android.graphics.Typeface;
import android.os.Handler;
import android.os.Looper;

public abstract class g {
  public final void a(int paramInt, Handler paramHandler) {
    Handler handler = paramHandler;
    if (paramHandler == null)
      handler = new Handler(Looper.getMainLooper()); 
    handler.post(new b(this, paramInt));
  }
  
  public final void b(Typeface paramTypeface, Handler paramHandler) {
    Handler handler = paramHandler;
    if (paramHandler == null)
      handler = new Handler(Looper.getMainLooper()); 
    handler.post(new a(this, paramTypeface));
  }
  
  public abstract void c(int paramInt);
  
  public abstract void d(Typeface paramTypeface);
  
  public class a implements Runnable {
    public final Typeface b;
    
    public final g c;
    
    public a(g this$0, Typeface param1Typeface) {}
    
    public void run() {
      this.c.d(this.b);
    }
  }
  
  public class b implements Runnable {
    public final int b;
    
    public final g c;
    
    public b(g this$0, int param1Int) {}
    
    public void run() {
      this.c.c(this.b);
    }
  }
}


/* Location:              C:\Users\panch\Downloads\dvba_v1.1.0-dex2jar.jar!\b\i\e\b\g.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */