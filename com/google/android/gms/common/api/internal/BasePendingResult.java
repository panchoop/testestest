package com.google.android.gms.common.api.internal;

import android.os.Looper;
import android.os.Message;
import android.util.Log;
import android.util.Pair;
import c.c.a.a.c.k.f;
import c.c.a.a.c.k.g;
import c.c.a.a.c.k.h;
import c.c.a.a.c.k.i;
import c.c.a.a.c.k.k.f0;
import c.c.a.a.c.k.k.l0;
import c.c.a.a.c.l.q;
import c.c.a.a.f.a.c;
import com.google.android.gms.common.annotation.KeepName;
import com.google.android.gms.common.api.Status;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.atomic.AtomicReference;

@KeepName
public abstract class BasePendingResult<R extends h> extends f<R> {
  public final Object a = new Object();
  
  public final a<R> b = new a<R>(Looper.getMainLooper());
  
  public final CountDownLatch c = new CountDownLatch(1);
  
  public final ArrayList<f.a> d = new ArrayList<f.a>();
  
  public i<? super R> e;
  
  public final AtomicReference<f0> f = new AtomicReference<f0>();
  
  public R g;
  
  public Status h;
  
  public volatile boolean i;
  
  public boolean j;
  
  @KeepName
  public b mResultGuardian;
  
  static {
    new l0();
  }
  
  @Deprecated
  public BasePendingResult() {
    new WeakReference(null);
  }
  
  public static void e(h paramh) {
    if (paramh instanceof g)
      try {
        ((g)paramh).a();
        return;
      } catch (RuntimeException runtimeException) {
        String str = String.valueOf(paramh);
        StringBuilder stringBuilder = new StringBuilder(str.length() + 18);
        stringBuilder.append("Unable to release ");
        stringBuilder.append(str);
        Log.w("BasePendingResult", stringBuilder.toString(), runtimeException);
      }  
  }
  
  public abstract R a(Status paramStatus);
  
  public final boolean b() {
    return (this.c.getCount() == 0L);
  }
  
  public final void c(R paramR) {
    synchronized (this.a) {
      if (!this.j) {
        b();
        boolean bool = b();
        boolean bool1 = true;
        if (!bool) {
          bool = true;
        } else {
          bool = false;
        } 
        q.i(bool, "Results have already been set");
        if (!this.i) {
          bool = bool1;
        } else {
          bool = false;
        } 
        q.i(bool, "Result has already been consumed");
        d(paramR);
        return;
      } 
      e((h)paramR);
      return;
    } 
  }
  
  public final void d(R paramR) {
    // Byte code:
    //   0: aload_0
    //   1: aload_1
    //   2: putfield g : Lc/c/a/a/c/k/h;
    //   5: aload_0
    //   6: getfield c : Ljava/util/concurrent/CountDownLatch;
    //   9: invokevirtual countDown : ()V
    //   12: aload_0
    //   13: aload_0
    //   14: getfield g : Lc/c/a/a/c/k/h;
    //   17: invokeinterface f : ()Lcom/google/android/gms/common/api/Status;
    //   22: putfield h : Lcom/google/android/gms/common/api/Status;
    //   25: aload_0
    //   26: getfield e : Lc/c/a/a/c/k/i;
    //   29: astore_1
    //   30: iconst_0
    //   31: istore_2
    //   32: aload_1
    //   33: ifnonnull -> 62
    //   36: aload_0
    //   37: getfield g : Lc/c/a/a/c/k/h;
    //   40: instanceof c/c/a/a/c/k/g
    //   43: ifeq -> 197
    //   46: aload_0
    //   47: new com/google/android/gms/common/api/internal/BasePendingResult$b
    //   50: dup
    //   51: aload_0
    //   52: aconst_null
    //   53: invokespecial <init> : (Lcom/google/android/gms/common/api/internal/BasePendingResult;Lc/c/a/a/c/k/k/l0;)V
    //   56: putfield mResultGuardian : Lcom/google/android/gms/common/api/internal/BasePendingResult$b;
    //   59: goto -> 197
    //   62: aload_0
    //   63: getfield b : Lcom/google/android/gms/common/api/internal/BasePendingResult$a;
    //   66: iconst_2
    //   67: invokevirtual removeMessages : (I)V
    //   70: aload_0
    //   71: getfield b : Lcom/google/android/gms/common/api/internal/BasePendingResult$a;
    //   74: astore_1
    //   75: aload_0
    //   76: getfield e : Lc/c/a/a/c/k/i;
    //   79: astore #7
    //   81: aload_0
    //   82: getfield a : Ljava/lang/Object;
    //   85: astore #6
    //   87: aload #6
    //   89: monitorenter
    //   90: aload_0
    //   91: getfield i : Z
    //   94: ifne -> 103
    //   97: iconst_1
    //   98: istore #4
    //   100: goto -> 106
    //   103: iconst_0
    //   104: istore #4
    //   106: iload #4
    //   108: ldc 'Result has already been consumed.'
    //   110: invokestatic i : (ZLjava/lang/Object;)V
    //   113: aload_0
    //   114: invokevirtual b : ()Z
    //   117: ldc 'Result is not ready.'
    //   119: invokestatic i : (ZLjava/lang/Object;)V
    //   122: aload_0
    //   123: getfield g : Lc/c/a/a/c/k/h;
    //   126: astore #5
    //   128: aload_0
    //   129: aconst_null
    //   130: putfield g : Lc/c/a/a/c/k/h;
    //   133: aload_0
    //   134: aconst_null
    //   135: putfield e : Lc/c/a/a/c/k/i;
    //   138: aload_0
    //   139: iconst_1
    //   140: putfield i : Z
    //   143: aload #6
    //   145: monitorexit
    //   146: aload_0
    //   147: getfield f : Ljava/util/concurrent/atomic/AtomicReference;
    //   150: aconst_null
    //   151: invokevirtual getAndSet : (Ljava/lang/Object;)Ljava/lang/Object;
    //   154: checkcast c/c/a/a/c/k/k/f0
    //   157: astore #6
    //   159: aload #6
    //   161: ifnull -> 172
    //   164: aload #6
    //   166: aload_0
    //   167: invokeinterface a : (Lcom/google/android/gms/common/api/internal/BasePendingResult;)V
    //   172: aload_1
    //   173: ifnull -> 247
    //   176: aload_1
    //   177: aload_1
    //   178: iconst_1
    //   179: new android/util/Pair
    //   182: dup
    //   183: aload #7
    //   185: aload #5
    //   187: invokespecial <init> : (Ljava/lang/Object;Ljava/lang/Object;)V
    //   190: invokevirtual obtainMessage : (ILjava/lang/Object;)Landroid/os/Message;
    //   193: invokevirtual sendMessage : (Landroid/os/Message;)Z
    //   196: pop
    //   197: aload_0
    //   198: getfield d : Ljava/util/ArrayList;
    //   201: astore_1
    //   202: aload_1
    //   203: invokevirtual size : ()I
    //   206: istore_3
    //   207: iload_2
    //   208: iload_3
    //   209: if_icmpge -> 239
    //   212: aload_1
    //   213: iload_2
    //   214: invokevirtual get : (I)Ljava/lang/Object;
    //   217: astore #5
    //   219: iinc #2, 1
    //   222: aload #5
    //   224: checkcast c/c/a/a/c/k/f$a
    //   227: aload_0
    //   228: getfield h : Lcom/google/android/gms/common/api/Status;
    //   231: invokeinterface a : (Lcom/google/android/gms/common/api/Status;)V
    //   236: goto -> 207
    //   239: aload_0
    //   240: getfield d : Ljava/util/ArrayList;
    //   243: invokevirtual clear : ()V
    //   246: return
    //   247: aconst_null
    //   248: athrow
    //   249: astore_1
    //   250: aload #6
    //   252: monitorexit
    //   253: aload_1
    //   254: athrow
    // Exception table:
    //   from	to	target	type
    //   90	97	249	finally
    //   106	146	249	finally
    //   250	253	249	finally
  }
  
  public final void f(Status paramStatus) {
    synchronized (this.a) {
      if (!b()) {
        c(a(paramStatus));
        this.j = true;
      } 
      return;
    } 
  }
  
  public static class a<R extends h> extends c {
    public a(Looper param1Looper) {
      super(param1Looper);
    }
    
    public void handleMessage(Message param1Message) {
      StringBuilder stringBuilder;
      int j = param1Message.what;
      if (j != 1) {
        if (j != 2) {
          stringBuilder = new StringBuilder(45);
          stringBuilder.append("Don't know how to handle message: ");
          stringBuilder.append(j);
          Log.wtf("BasePendingResult", stringBuilder.toString(), new Exception());
          return;
        } 
        ((BasePendingResult)((Message)stringBuilder).obj).f(Status.g);
        return;
      } 
      Pair pair = (Pair)((Message)stringBuilder).obj;
      i i = (i)pair.first;
      h h = (h)pair.second;
      try {
        i.a(h);
        return;
      } catch (RuntimeException runtimeException) {
        BasePendingResult.e(h);
        throw runtimeException;
      } 
    }
  }
  
  public final class b {
    public final BasePendingResult a;
    
    public b(BasePendingResult this$0, l0 param1l0) {}
    
    public final void finalize() {
      BasePendingResult.e((h)this.a.g);
      super.finalize();
    }
  }
}


/* Location:              C:\Users\panch\Downloads\dvba_v1.1.0-dex2jar.jar!\com\google\android\gms\common\api\internal\BasePendingResult.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */