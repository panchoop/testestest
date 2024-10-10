package c.c.b.h.d0;

import android.os.Handler;
import android.os.HandlerThread;
import c.c.a.a.c.l.q;
import c.c.a.a.c.m.a;
import c.c.a.a.f.c.o1;
import c.c.b.b;

public final class c {
  public static a h = new a("TokenRefresher", new String[] { "FirebaseAuth:" });
  
  public final b a;
  
  public volatile long b;
  
  public volatile long c;
  
  public long d;
  
  public HandlerThread e;
  
  public Handler f;
  
  public Runnable g;
  
  public c(b paramb) {
    h.c("Initializing TokenRefresher", new Object[0]);
    q.f(paramb);
    this.a = paramb;
    HandlerThread handlerThread = new HandlerThread("TokenRefresher", 10);
    this.e = handlerThread;
    handlerThread.start();
    this.f = (Handler)new o1(this.e.getLooper());
    b b1 = this.a;
    b1.a();
    this.g = new e(this, b1.b);
    this.d = 300000L;
  }
  
  public final void a() {
    a a1 = h;
    long l2 = this.b;
    long l1 = this.d;
    StringBuilder stringBuilder = new StringBuilder(43);
    stringBuilder.append("Scheduling refresh for ");
    stringBuilder.append(l2 - l1);
    a1.c(stringBuilder.toString(), new Object[0]);
    this.f.removeCallbacks(this.g);
    l1 = System.currentTimeMillis();
    this.c = Math.max(this.b - l1 - this.d, 0L) / 1000L;
    this.f.postDelayed(this.g, this.c * 1000L);
  }
}


/* Location:              C:\Users\panch\Downloads\dvba_v1.1.0-dex2jar.jar!\c\c\b\h\d0\c.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */