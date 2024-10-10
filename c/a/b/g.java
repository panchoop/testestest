package c.a.b;

import android.os.Handler;
import java.util.concurrent.Executor;

public class g implements r {
  public final Executor a;
  
  public g(Handler paramHandler) {
    this.a = new a(this, paramHandler);
  }
  
  public void a(o<?> paramo, q<?> paramq, Runnable paramRunnable) {
    synchronized (paramo.f) {
      paramo.l = true;
      paramo.a("post-response");
      this.a.execute(new b(paramo, paramq, paramRunnable));
      return;
    } 
  }
  
  public class a implements Executor {
    public final Handler a;
    
    public a(g this$0, Handler param1Handler) {}
    
    public void execute(Runnable param1Runnable) {
      this.a.post(param1Runnable);
    }
  }
  
  public static class b implements Runnable {
    public final o b;
    
    public final q c;
    
    public final Runnable d;
    
    public b(o param1o, q param1q, Runnable param1Runnable) {
      this.b = param1o;
      this.c = param1q;
      this.d = param1Runnable;
    }
    
    public void run() {
      // Byte code:
      //   0: aload_0
      //   1: getfield b : Lc/a/b/o;
      //   4: invokevirtual i : ()Z
      //   7: ifeq -> 20
      //   10: aload_0
      //   11: getfield b : Lc/a/b/o;
      //   14: ldc 'canceled-at-delivery'
      //   16: invokevirtual c : (Ljava/lang/String;)V
      //   19: return
      //   20: aload_0
      //   21: getfield c : Lc/a/b/q;
      //   24: getfield c : Lc/a/b/u;
      //   27: ifnonnull -> 35
      //   30: iconst_1
      //   31: istore_1
      //   32: goto -> 37
      //   35: iconst_0
      //   36: istore_1
      //   37: iload_1
      //   38: ifeq -> 58
      //   41: aload_0
      //   42: getfield b : Lc/a/b/o;
      //   45: aload_0
      //   46: getfield c : Lc/a/b/q;
      //   49: getfield a : Ljava/lang/Object;
      //   52: invokevirtual b : (Ljava/lang/Object;)V
      //   55: goto -> 102
      //   58: aload_0
      //   59: getfield b : Lc/a/b/o;
      //   62: astore #4
      //   64: aload_0
      //   65: getfield c : Lc/a/b/q;
      //   68: getfield c : Lc/a/b/u;
      //   71: astore_3
      //   72: aload #4
      //   74: getfield f : Ljava/lang/Object;
      //   77: astore_2
      //   78: aload_2
      //   79: monitorenter
      //   80: aload #4
      //   82: getfield g : Lc/a/b/q$a;
      //   85: astore #4
      //   87: aload_2
      //   88: monitorexit
      //   89: aload #4
      //   91: ifnull -> 102
      //   94: aload #4
      //   96: aload_3
      //   97: invokeinterface a : (Lc/a/b/u;)V
      //   102: aload_0
      //   103: getfield c : Lc/a/b/q;
      //   106: getfield d : Z
      //   109: ifeq -> 124
      //   112: aload_0
      //   113: getfield b : Lc/a/b/o;
      //   116: ldc 'intermediate-response'
      //   118: invokevirtual a : (Ljava/lang/String;)V
      //   121: goto -> 133
      //   124: aload_0
      //   125: getfield b : Lc/a/b/o;
      //   128: ldc 'done'
      //   130: invokevirtual c : (Ljava/lang/String;)V
      //   133: aload_0
      //   134: getfield d : Ljava/lang/Runnable;
      //   137: astore_2
      //   138: aload_2
      //   139: ifnull -> 148
      //   142: aload_2
      //   143: invokeinterface run : ()V
      //   148: return
      //   149: astore_3
      //   150: aload_2
      //   151: monitorexit
      //   152: aload_3
      //   153: athrow
      // Exception table:
      //   from	to	target	type
      //   80	89	149	finally
      //   150	152	149	finally
    }
  }
}


/* Location:              C:\Users\panch\Downloads\dvba_v1.1.0-dex2jar.jar!\c\a\b\g.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */