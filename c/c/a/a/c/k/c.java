package c.c.a.a.c.k;

import android.accounts.Account;
import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import c.c.a.a.c.k.k.a;
import c.c.a.a.c.k.k.d;
import c.c.a.a.c.k.k.h0;
import c.c.a.a.c.k.k.j;
import c.c.a.a.c.k.k.k;
import c.c.a.a.c.k.k.v;
import c.c.a.a.c.k.k.x;
import c.c.a.a.c.l.q;
import c.c.a.a.h.d;
import c.c.a.a.h.e;

public class c<O extends a.d> implements Object<O> {
  public final Context a;
  
  public final a<O> b;
  
  public final O c;
  
  public final a<O> d;
  
  public final int e;
  
  public final j f;
  
  public final d g;
  
  @Deprecated
  public c(Context paramContext, a<O> parama, O paramO, j paramj) {
    q.g(paramContext, "Null context is not permitted.");
    q.g(parama, "Api must not be null.");
    q.g(a1, "Settings must not be null; use Settings.DEFAULT_SETTINGS instead.");
    this.a = paramContext.getApplicationContext();
    this.b = parama;
    this.c = paramO;
    this.d = new a(parama, (a.d)paramO);
    d d1 = d.a(this.a);
    this.g = d1;
    this.e = d1.g.getAndIncrement();
    this.f = a1.a;
    Handler handler = this.g.m;
    handler.sendMessage(handler.obtainMessage(7, this));
  }
  
  public c.c.a.a.c.l.c.a a() {
    // Byte code:
    //   0: new c/c/a/a/c/l/c$a
    //   3: dup
    //   4: invokespecial <init> : ()V
    //   7: astore_3
    //   8: aload_0
    //   9: getfield c : Lc/c/a/a/c/k/a$d;
    //   12: astore #4
    //   14: aload #4
    //   16: instanceof c/c/a/a/c/k/a$d$b
    //   19: istore_1
    //   20: aconst_null
    //   21: astore_2
    //   22: iload_1
    //   23: ifeq -> 72
    //   26: aload #4
    //   28: checkcast c/c/a/a/c/k/a$d$b
    //   31: invokeinterface b : ()Lcom/google/android/gms/auth/api/signin/GoogleSignInAccount;
    //   36: astore #4
    //   38: aload #4
    //   40: ifnull -> 72
    //   43: aload #4
    //   45: getfield e : Ljava/lang/String;
    //   48: ifnonnull -> 54
    //   51: goto -> 97
    //   54: new android/accounts/Account
    //   57: dup
    //   58: aload #4
    //   60: getfield e : Ljava/lang/String;
    //   63: ldc 'com.google'
    //   65: invokespecial <init> : (Ljava/lang/String;Ljava/lang/String;)V
    //   68: astore_2
    //   69: goto -> 97
    //   72: aload_0
    //   73: getfield c : Lc/c/a/a/c/k/a$d;
    //   76: astore #4
    //   78: aload #4
    //   80: instanceof c/c/a/a/c/k/a$d$a
    //   83: ifeq -> 97
    //   86: aload #4
    //   88: checkcast c/c/a/a/c/k/a$d$a
    //   91: invokeinterface a : ()Landroid/accounts/Account;
    //   96: astore_2
    //   97: aload_3
    //   98: aload_2
    //   99: putfield a : Landroid/accounts/Account;
    //   102: aload_0
    //   103: getfield c : Lc/c/a/a/c/k/a$d;
    //   106: astore_2
    //   107: aload_2
    //   108: instanceof c/c/a/a/c/k/a$d$b
    //   111: ifeq -> 136
    //   114: aload_2
    //   115: checkcast c/c/a/a/c/k/a$d$b
    //   118: invokeinterface b : ()Lcom/google/android/gms/auth/api/signin/GoogleSignInAccount;
    //   123: astore_2
    //   124: aload_2
    //   125: ifnull -> 136
    //   128: aload_2
    //   129: invokevirtual h : ()Ljava/util/Set;
    //   132: astore_2
    //   133: goto -> 140
    //   136: invokestatic emptySet : ()Ljava/util/Set;
    //   139: astore_2
    //   140: aload_3
    //   141: getfield b : Lb/f/c;
    //   144: ifnonnull -> 158
    //   147: aload_3
    //   148: new b/f/c
    //   151: dup
    //   152: invokespecial <init> : ()V
    //   155: putfield b : Lb/f/c;
    //   158: aload_3
    //   159: getfield b : Lb/f/c;
    //   162: aload_2
    //   163: invokevirtual addAll : (Ljava/util/Collection;)Z
    //   166: pop
    //   167: aload_3
    //   168: aload_0
    //   169: getfield a : Landroid/content/Context;
    //   172: invokevirtual getClass : ()Ljava/lang/Class;
    //   175: invokevirtual getName : ()Ljava/lang/String;
    //   178: putfield e : Ljava/lang/String;
    //   181: aload_3
    //   182: aload_0
    //   183: getfield a : Landroid/content/Context;
    //   186: invokevirtual getPackageName : ()Ljava/lang/String;
    //   189: putfield d : Ljava/lang/String;
    //   192: aload_3
    //   193: areturn
  }
  
  public final <TResult, A extends a.b> d<TResult> b(int paramInt, k<A, TResult> paramk) {
    e e = new e();
    d d1 = this.g;
    h0 h0 = new h0(paramInt, paramk, e, this.f);
    Handler handler = d1.m;
    handler.sendMessage(handler.obtainMessage(4, new v((x)h0, d1.h.get(), this)));
    return (d<TResult>)e.a;
  }
  
  public static class a {
    public final j a;
    
    public final Looper b;
    
    static {
      Looper.getMainLooper();
    }
    
    public a(j param1j, Account param1Account, Looper param1Looper) {
      this.a = param1j;
      this.b = param1Looper;
    }
  }
}


/* Location:              C:\Users\panch\Downloads\dvba_v1.1.0-dex2jar.jar!\c\c\a\a\c\k\c.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */