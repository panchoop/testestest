package c.c.a.b.e0;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import java.lang.ref.WeakReference;

public class e {
  public static e c;
  
  public final Object a = new Object();
  
  public final Handler b = new Handler(Looper.getMainLooper(), new a(this));
  
  public class a implements Handler.Callback {
    public final e a;
    
    public a(e this$0) {}
    
    public boolean handleMessage(Message param1Message) {
      // Byte code:
      //   0: aload_1
      //   1: getfield what : I
      //   4: ifeq -> 9
      //   7: iconst_0
      //   8: ireturn
      //   9: aload_0
      //   10: getfield a : Lc/c/a/b/e0/e;
      //   13: astore_2
      //   14: aload_1
      //   15: getfield obj : Ljava/lang/Object;
      //   18: checkcast c/c/a/b/e0/e$c
      //   21: astore_3
      //   22: aload_2
      //   23: getfield a : Ljava/lang/Object;
      //   26: astore_1
      //   27: aload_1
      //   28: monitorenter
      //   29: aload_3
      //   30: ifnull -> 36
      //   33: goto -> 69
      //   36: aload_3
      //   37: getfield a : Ljava/lang/ref/WeakReference;
      //   40: invokevirtual get : ()Ljava/lang/Object;
      //   43: checkcast c/c/a/b/e0/e$b
      //   46: astore #4
      //   48: aload #4
      //   50: ifnull -> 69
      //   53: aload_2
      //   54: getfield b : Landroid/os/Handler;
      //   57: aload_3
      //   58: invokevirtual removeCallbacksAndMessages : (Ljava/lang/Object;)V
      //   61: aload #4
      //   63: iconst_2
      //   64: invokeinterface a : (I)V
      //   69: aload_1
      //   70: monitorexit
      //   71: iconst_1
      //   72: ireturn
      //   73: astore_2
      //   74: aload_1
      //   75: monitorexit
      //   76: aload_2
      //   77: athrow
      // Exception table:
      //   from	to	target	type
      //   36	48	73	finally
      //   53	69	73	finally
      //   69	71	73	finally
      //   74	76	73	finally
    }
  }
  
  public static interface b {
    void a(int param1Int);
  }
  
  public static class c {
    public final WeakReference<e.b> a;
  }
}


/* Location:              C:\Users\panch\Downloads\dvba_v1.1.0-dex2jar.jar!\c\c\a\b\e0\e.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */