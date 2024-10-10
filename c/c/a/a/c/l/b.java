package c.c.a.a.c.l;

import android.accounts.Account;
import android.app.PendingIntent;
import android.content.ComponentName;
import android.content.Context;
import android.content.ServiceConnection;
import android.os.Bundle;
import android.os.DeadObjectException;
import android.os.Handler;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import android.os.Message;
import android.os.RemoteException;
import android.text.TextUtils;
import android.util.Log;
import c.c.a.a.c.k.k.s;
import c.c.a.a.c.k.k.t;
import com.google.android.gms.common.api.Scope;
import java.util.ArrayList;
import java.util.Set;
import java.util.concurrent.atomic.AtomicInteger;
import javax.annotation.concurrent.GuardedBy;

public abstract class b<T extends IInterface> {
  public static final c.c.a.a.c.c[] u = new c.c.a.a.c.c[0];
  
  public g0 a;
  
  public final Context b;
  
  public final h c;
  
  public final Handler d;
  
  public final Object e = new Object();
  
  public final Object f = new Object();
  
  @GuardedBy("mServiceBrokerLock")
  public n g;
  
  public c h;
  
  @GuardedBy("mLock")
  public T i;
  
  public final ArrayList<h<?>> j = new ArrayList<h<?>>();
  
  @GuardedBy("mLock")
  public j k;
  
  @GuardedBy("mLock")
  public int l = 1;
  
  public final a m;
  
  public final b n;
  
  public final int o;
  
  public final String p;
  
  public c.c.a.a.c.a q = null;
  
  public boolean r = false;
  
  public volatile a0 s = null;
  
  public AtomicInteger t = new AtomicInteger(0);
  
  public b(Context paramContext, Looper paramLooper, h paramh, c.c.a.a.c.e parame, int paramInt, a parama, b paramb, String paramString) {
    q.g(paramContext, "Context must not be null");
    this.b = paramContext;
    q.g(paramLooper, "Looper must not be null");
    q.g(paramh, "Supervisor must not be null");
    this.c = paramh;
    q.g(parame, "API availability must not be null");
    this.d = (Handler)new g(this, paramLooper);
    this.o = paramInt;
    this.m = parama;
    this.n = paramb;
    this.p = paramString;
  }
  
  public static boolean A(b paramb) {
    boolean bool1 = paramb.r;
    boolean bool = false;
    if (!bool1 && !TextUtils.isEmpty(paramb.t()) && !TextUtils.isEmpty(null))
      try {
        Class.forName(paramb.t());
        bool = true;
      } catch (ClassNotFoundException classNotFoundException) {} 
    return bool;
  }
  
  public static void y(b paramb) {
    synchronized (paramb.e) {
      byte b1;
      if (paramb.l == 3) {
        b1 = 1;
      } else {
        b1 = 0;
      } 
      if (b1) {
        b1 = 5;
        paramb.r = true;
      } else {
        b1 = 4;
      } 
      null = paramb.d;
      null.sendMessage(null.obtainMessage(b1, paramb.t.get(), 16));
      return;
    } 
  }
  
  public static boolean z(b<IInterface> paramb, int paramInt1, int paramInt2, IInterface paramIInterface) {
    synchronized (paramb.e) {
      boolean bool;
      if (paramb.l != paramInt1) {
        bool = false;
      } else {
        paramb.x(paramInt2, paramIInterface);
        bool = true;
      } 
      return bool;
    } 
  }
  
  public final String B() {
    String str2 = this.p;
    String str1 = str2;
    if (str2 == null)
      str1 = this.b.getClass().getName(); 
    return str1;
  }
  
  public void b(e parame) {
    t t = (t)parame;
    t.a.m.m.post((Runnable)new s(t));
  }
  
  public void c(c paramc) {
    q.g(paramc, "Connection progress callbacks cannot be null.");
    this.h = paramc;
    x(2, null);
  }
  
  public boolean d() {
    synchronized (this.e) {
      if (this.l == 2 || this.l == 3)
        return true; 
      return false;
    } 
  }
  
  public final c.c.a.a.c.c[] e() {
    a0 a01 = this.s;
    return (a01 == null) ? null : a01.c;
  }
  
  public boolean f() {
    synchronized (this.e) {
      boolean bool;
      if (this.l == 4) {
        bool = true;
      } else {
        bool = false;
      } 
      return bool;
    } 
  }
  
  public void g() {
    this.t.incrementAndGet();
    synchronized (this.j) {
      int i = this.j.size();
      byte b1 = 0;
      while (b1 < i) {
        synchronized ((h)this.j.get(b1)) {
          null.a = null;
          b1++;
        } 
      } 
      this.j.clear();
      synchronized (this.f) {
        this.g = null;
        x(1, null);
        return;
      } 
    } 
  }
  
  public String i() {
    if (f()) {
      g0 g01 = this.a;
      if (g01 != null)
        return g01.b; 
    } 
    throw new RuntimeException("Failed to connect when checking package");
  }
  
  public boolean j() {
    return false;
  }
  
  public boolean l() {
    return true;
  }
  
  public void n(k paramk, Set<Scope> paramSet) {
    Bundle bundle = r();
    f f = new f(this.o);
    f.e = this.b.getPackageName();
    f.h = bundle;
    if (paramSet != null)
      f.g = paramSet.<Scope>toArray(new Scope[paramSet.size()]); 
    if (j()) {
      Account account = ((g)this).w;
      if (account == null)
        account = new Account("<<default account>>", "com.google"); 
      f.i = account;
      if (paramk != null)
        f.f = paramk.asBinder(); 
    } 
    f.j = u;
    f.k = q();
    try {
      synchronized (this.f) {
        if (this.g != null) {
          n n1 = this.g;
          i i = new i();
          this(this, this.t.get());
          n1.q(i, f);
        } else {
          Log.w("GmsClient", "mServiceBroker is null, client disconnected");
        } 
        return;
      } 
    } catch (DeadObjectException deadObjectException) {
      Log.w("GmsClient", "IGmsServiceBroker.getService failed", (Throwable)deadObjectException);
      Handler handler = this.d;
      handler.sendMessage(handler.obtainMessage(6, this.t.get(), 1));
      return;
    } catch (SecurityException securityException) {
      throw securityException;
    } catch (RemoteException remoteException) {
      Log.w("GmsClient", "IGmsServiceBroker.getService failed", (Throwable)remoteException);
      int i = this.t.get();
      Handler handler = this.d;
      handler.sendMessage(handler.obtainMessage(1, i, -1, new k(this, 8, null, null)));
      return;
    } catch (RuntimeException runtimeException) {
      Log.w("GmsClient", "IGmsServiceBroker.getService failed", runtimeException);
      int i = this.t.get();
      Handler handler = this.d;
      handler.sendMessage(handler.obtainMessage(1, i, -1, new k(this, 8, null, null)));
      return;
    } 
  }
  
  public abstract T p(IBinder paramIBinder);
  
  public c.c.a.a.c.c[] q() {
    return u;
  }
  
  public Bundle r() {
    return new Bundle();
  }
  
  public final T s() {
    synchronized (this.e) {
      if (this.l != 5) {
        if (f()) {
          boolean bool;
          if (this.i != null) {
            bool = true;
          } else {
            bool = false;
          } 
          q.i(bool, "Client is connected but service is null");
          return this.i;
        } 
        IllegalStateException illegalStateException = new IllegalStateException();
        this("Not connected. Call connect() and wait for onConnected() to be called.");
        throw illegalStateException;
      } 
      DeadObjectException deadObjectException = new DeadObjectException();
      this();
      throw deadObjectException;
    } 
  }
  
  public abstract String t();
  
  public abstract String u();
  
  public String v() {
    return "com.google.android.gms";
  }
  
  public void w(int paramInt, T paramT) {}
  
  public final void x(int paramInt, T paramT) {
    int i;
    byte b1;
    boolean bool;
    if (paramInt == 4) {
      i = 1;
    } else {
      i = 0;
    } 
    if (paramT != null) {
      b1 = 1;
    } else {
      b1 = 0;
    } 
    if (i == b1) {
      bool = true;
    } else {
      bool = false;
    } 
    q.b(bool);
    synchronized (this.e) {
      this.l = paramInt;
      this.i = paramT;
      w(paramInt, paramT);
      if (paramInt != 1) {
        if (paramInt != 2 && paramInt != 3) {
          if (paramInt == 4)
            System.currentTimeMillis(); 
        } else {
          if (this.k != null && this.a != null) {
            String str4 = this.a.a;
            String str5 = this.a.b;
            paramInt = String.valueOf(str4).length();
            i = String.valueOf(str5).length();
            StringBuilder stringBuilder = new StringBuilder();
            this(paramInt + 70 + i);
            stringBuilder.append("Calling connect() while still connected, missing disconnect() for ");
            stringBuilder.append(str4);
            stringBuilder.append(" on ");
            stringBuilder.append(str5);
            Log.e("GmsClient", stringBuilder.toString());
            this.c.a(this.a.a, this.a.b, this.a.c, this.k, B());
            this.t.incrementAndGet();
          } 
          j j1 = new j();
          this(this, this.t.get());
          this.k = j1;
          g0 g01 = new g0();
          this(v(), u(), false);
          this.a = g01;
          h h1 = this.c;
          String str2 = g01.a;
          String str1 = g01.b;
          paramInt = g01.c;
          j j2 = this.k;
          String str3 = B();
          h.a a1 = new h.a();
          this(str2, str1, paramInt);
          if (!h1.b(a1, j2, str3)) {
            str2 = this.a.a;
            str1 = this.a.b;
            paramInt = String.valueOf(str2).length();
            i = String.valueOf(str1).length();
            StringBuilder stringBuilder = new StringBuilder();
            this(paramInt + 34 + i);
            stringBuilder.append("unable to connect to service: ");
            stringBuilder.append(str2);
            stringBuilder.append(" on ");
            stringBuilder.append(str1);
            Log.e("GmsClient", stringBuilder.toString());
            paramInt = this.t.get();
            Handler handler = this.d;
            l l = new l();
            this(this, 16);
            handler.sendMessage(handler.obtainMessage(7, paramInt, -1, l));
          } 
        } 
      } else if (this.k != null) {
        this.c.a(this.a.a, this.a.b, this.a.c, this.k, B());
        this.k = null;
      } 
      return;
    } 
  }
  
  public static interface a {}
  
  public static interface b {}
  
  public static interface c {
    void a(c.c.a.a.c.a param1a);
  }
  
  public class d implements c {
    public final b a;
    
    public d(b this$0) {}
    
    public void a(c.c.a.a.c.a param1a) {
      b b1;
      if (param1a.h()) {
        b1 = this.a;
        b1.n(null, ((g)b1).v);
        return;
      } 
      b.b b2 = this.a.n;
      if (b2 != null)
        ((x)b2).a.t((c.c.a.a.c.a)b1); 
    }
  }
  
  public static interface e {}
  
  public abstract class f extends h<Boolean> {
    public final int d;
    
    public final Bundle e;
    
    public final b f;
    
    public f(b this$0, int param1Int, Bundle param1Bundle) {
      super(this$0, Boolean.TRUE);
      this.d = param1Int;
      this.e = param1Bundle;
    }
    
    public abstract void c(c.c.a.a.c.a param1a);
    
    public abstract boolean d();
  }
  
  public final class g extends c.c.a.a.f.b.d {
    public final b a;
    
    public g(b this$0, Looper param1Looper) {
      super(param1Looper);
    }
    
    public static void a(Message param1Message) {
      b.h h = (b.h)param1Message.obj;
      if ((b.f)h != null) {
        h.a();
        return;
      } 
      throw null;
    }
    
    public static boolean b(Message param1Message) {
      int i = param1Message.what;
      return (i == 2 || i == 1 || i == 7);
    }
    
    public final void handleMessage(Message param1Message) {
      // Byte code:
      //   0: aload_0
      //   1: getfield a : Lc/c/a/a/c/l/b;
      //   4: getfield t : Ljava/util/concurrent/atomic/AtomicInteger;
      //   7: invokevirtual get : ()I
      //   10: aload_1
      //   11: getfield arg1 : I
      //   14: if_icmpeq -> 29
      //   17: aload_1
      //   18: invokestatic b : (Landroid/os/Message;)Z
      //   21: ifeq -> 28
      //   24: aload_1
      //   25: invokestatic a : (Landroid/os/Message;)V
      //   28: return
      //   29: aload_1
      //   30: getfield what : I
      //   33: istore_2
      //   34: iload_2
      //   35: iconst_1
      //   36: if_icmpeq -> 67
      //   39: iload_2
      //   40: bipush #7
      //   42: if_icmpeq -> 67
      //   45: iload_2
      //   46: iconst_4
      //   47: if_icmpne -> 62
      //   50: aload_0
      //   51: getfield a : Lc/c/a/a/c/l/b;
      //   54: ifnull -> 60
      //   57: goto -> 67
      //   60: aconst_null
      //   61: athrow
      //   62: iload_2
      //   63: iconst_5
      //   64: if_icmpne -> 82
      //   67: aload_0
      //   68: getfield a : Lc/c/a/a/c/l/b;
      //   71: invokevirtual d : ()Z
      //   74: ifne -> 82
      //   77: aload_1
      //   78: invokestatic a : (Landroid/os/Message;)V
      //   81: return
      //   82: aload_1
      //   83: getfield what : I
      //   86: istore_2
      //   87: iload_2
      //   88: iconst_4
      //   89: if_icmpne -> 191
      //   92: aload_0
      //   93: getfield a : Lc/c/a/a/c/l/b;
      //   96: new c/c/a/a/c/a
      //   99: dup
      //   100: aload_1
      //   101: getfield arg2 : I
      //   104: invokespecial <init> : (I)V
      //   107: putfield q : Lc/c/a/a/c/a;
      //   110: aload_0
      //   111: getfield a : Lc/c/a/a/c/l/b;
      //   114: invokestatic A : (Lc/c/a/a/c/l/b;)Z
      //   117: ifeq -> 139
      //   120: aload_0
      //   121: getfield a : Lc/c/a/a/c/l/b;
      //   124: astore_1
      //   125: aload_1
      //   126: getfield r : Z
      //   129: ifne -> 139
      //   132: aload_1
      //   133: iconst_3
      //   134: aconst_null
      //   135: invokevirtual x : (ILandroid/os/IInterface;)V
      //   138: return
      //   139: aload_0
      //   140: getfield a : Lc/c/a/a/c/l/b;
      //   143: getfield q : Lc/c/a/a/c/a;
      //   146: astore_1
      //   147: aload_1
      //   148: ifnull -> 154
      //   151: goto -> 164
      //   154: new c/c/a/a/c/a
      //   157: dup
      //   158: bipush #8
      //   160: invokespecial <init> : (I)V
      //   163: astore_1
      //   164: aload_0
      //   165: getfield a : Lc/c/a/a/c/l/b;
      //   168: getfield h : Lc/c/a/a/c/l/b$c;
      //   171: aload_1
      //   172: invokeinterface a : (Lc/c/a/a/c/a;)V
      //   177: aload_0
      //   178: getfield a : Lc/c/a/a/c/l/b;
      //   181: ifnull -> 189
      //   184: invokestatic currentTimeMillis : ()J
      //   187: pop2
      //   188: return
      //   189: aconst_null
      //   190: athrow
      //   191: iload_2
      //   192: iconst_5
      //   193: if_icmpne -> 248
      //   196: aload_0
      //   197: getfield a : Lc/c/a/a/c/l/b;
      //   200: getfield q : Lc/c/a/a/c/a;
      //   203: astore_1
      //   204: aload_1
      //   205: ifnull -> 211
      //   208: goto -> 221
      //   211: new c/c/a/a/c/a
      //   214: dup
      //   215: bipush #8
      //   217: invokespecial <init> : (I)V
      //   220: astore_1
      //   221: aload_0
      //   222: getfield a : Lc/c/a/a/c/l/b;
      //   225: getfield h : Lc/c/a/a/c/l/b$c;
      //   228: aload_1
      //   229: invokeinterface a : (Lc/c/a/a/c/a;)V
      //   234: aload_0
      //   235: getfield a : Lc/c/a/a/c/l/b;
      //   238: ifnull -> 246
      //   241: invokestatic currentTimeMillis : ()J
      //   244: pop2
      //   245: return
      //   246: aconst_null
      //   247: athrow
      //   248: iload_2
      //   249: iconst_3
      //   250: if_icmpne -> 315
      //   253: aload_1
      //   254: getfield obj : Ljava/lang/Object;
      //   257: astore_3
      //   258: aload_3
      //   259: instanceof android/app/PendingIntent
      //   262: ifeq -> 273
      //   265: aload_3
      //   266: checkcast android/app/PendingIntent
      //   269: astore_3
      //   270: goto -> 275
      //   273: aconst_null
      //   274: astore_3
      //   275: new c/c/a/a/c/a
      //   278: dup
      //   279: aload_1
      //   280: getfield arg2 : I
      //   283: aload_3
      //   284: invokespecial <init> : (ILandroid/app/PendingIntent;)V
      //   287: astore_1
      //   288: aload_0
      //   289: getfield a : Lc/c/a/a/c/l/b;
      //   292: getfield h : Lc/c/a/a/c/l/b$c;
      //   295: aload_1
      //   296: invokeinterface a : (Lc/c/a/a/c/a;)V
      //   301: aload_0
      //   302: getfield a : Lc/c/a/a/c/l/b;
      //   305: ifnull -> 313
      //   308: invokestatic currentTimeMillis : ()J
      //   311: pop2
      //   312: return
      //   313: aconst_null
      //   314: athrow
      //   315: iload_2
      //   316: bipush #6
      //   318: if_icmpne -> 385
      //   321: aload_0
      //   322: getfield a : Lc/c/a/a/c/l/b;
      //   325: iconst_5
      //   326: aconst_null
      //   327: invokevirtual x : (ILandroid/os/IInterface;)V
      //   330: aload_0
      //   331: getfield a : Lc/c/a/a/c/l/b;
      //   334: getfield m : Lc/c/a/a/c/l/b$a;
      //   337: astore_3
      //   338: aload_3
      //   339: ifnull -> 360
      //   342: aload_1
      //   343: getfield arg2 : I
      //   346: istore_2
      //   347: aload_3
      //   348: checkcast c/c/a/a/c/l/w
      //   351: getfield a : Lc/c/a/a/c/k/k/c;
      //   354: iload_2
      //   355: invokeinterface c : (I)V
      //   360: aload_0
      //   361: getfield a : Lc/c/a/a/c/l/b;
      //   364: ifnull -> 383
      //   367: invokestatic currentTimeMillis : ()J
      //   370: pop2
      //   371: aload_0
      //   372: getfield a : Lc/c/a/a/c/l/b;
      //   375: iconst_5
      //   376: iconst_1
      //   377: aconst_null
      //   378: invokestatic z : (Lc/c/a/a/c/l/b;IILandroid/os/IInterface;)Z
      //   381: pop
      //   382: return
      //   383: aconst_null
      //   384: athrow
      //   385: iload_2
      //   386: iconst_2
      //   387: if_icmpne -> 405
      //   390: aload_0
      //   391: getfield a : Lc/c/a/a/c/l/b;
      //   394: invokevirtual f : ()Z
      //   397: ifne -> 405
      //   400: aload_1
      //   401: invokestatic a : (Landroid/os/Message;)V
      //   404: return
      //   405: aload_1
      //   406: invokestatic b : (Landroid/os/Message;)Z
      //   409: ifeq -> 533
      //   412: aload_1
      //   413: getfield obj : Ljava/lang/Object;
      //   416: checkcast c/c/a/a/c/l/b$h
      //   419: astore_1
      //   420: aload_1
      //   421: monitorenter
      //   422: aload_1
      //   423: getfield a : Ljava/lang/Object;
      //   426: astore #5
      //   428: aload_1
      //   429: getfield b : Z
      //   432: ifeq -> 490
      //   435: aload_1
      //   436: invokestatic valueOf : (Ljava/lang/Object;)Ljava/lang/String;
      //   439: astore #4
      //   441: aload #4
      //   443: invokevirtual length : ()I
      //   446: istore_2
      //   447: new java/lang/StringBuilder
      //   450: astore_3
      //   451: aload_3
      //   452: iload_2
      //   453: bipush #47
      //   455: iadd
      //   456: invokespecial <init> : (I)V
      //   459: aload_3
      //   460: ldc 'Callback proxy '
      //   462: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
      //   465: pop
      //   466: aload_3
      //   467: aload #4
      //   469: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
      //   472: pop
      //   473: aload_3
      //   474: ldc ' being reused. This is not safe.'
      //   476: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
      //   479: pop
      //   480: ldc 'GmsClient'
      //   482: aload_3
      //   483: invokevirtual toString : ()Ljava/lang/String;
      //   486: invokestatic w : (Ljava/lang/String;Ljava/lang/String;)I
      //   489: pop
      //   490: aload_1
      //   491: monitorexit
      //   492: aload #5
      //   494: ifnull -> 509
      //   497: aload_1
      //   498: aload #5
      //   500: invokevirtual b : (Ljava/lang/Object;)V
      //   503: goto -> 509
      //   506: astore_1
      //   507: aload_1
      //   508: athrow
      //   509: aload_1
      //   510: monitorenter
      //   511: aload_1
      //   512: iconst_1
      //   513: putfield b : Z
      //   516: aload_1
      //   517: monitorexit
      //   518: aload_1
      //   519: invokevirtual a : ()V
      //   522: return
      //   523: astore_3
      //   524: aload_1
      //   525: monitorexit
      //   526: aload_3
      //   527: athrow
      //   528: astore_3
      //   529: aload_1
      //   530: monitorexit
      //   531: aload_3
      //   532: athrow
      //   533: aload_1
      //   534: getfield what : I
      //   537: istore_2
      //   538: new java/lang/StringBuilder
      //   541: dup
      //   542: bipush #45
      //   544: invokespecial <init> : (I)V
      //   547: astore_1
      //   548: aload_1
      //   549: ldc 'Don't know how to handle message: '
      //   551: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
      //   554: pop
      //   555: aload_1
      //   556: iload_2
      //   557: invokevirtual append : (I)Ljava/lang/StringBuilder;
      //   560: pop
      //   561: ldc 'GmsClient'
      //   563: aload_1
      //   564: invokevirtual toString : ()Ljava/lang/String;
      //   567: new java/lang/Exception
      //   570: dup
      //   571: invokespecial <init> : ()V
      //   574: invokestatic wtf : (Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I
      //   577: pop
      //   578: return
      // Exception table:
      //   from	to	target	type
      //   422	490	528	finally
      //   490	492	528	finally
      //   497	503	506	java/lang/RuntimeException
      //   511	518	523	finally
      //   524	526	523	finally
      //   529	531	528	finally
    }
  }
  
  public abstract class h<TListener> {
    public TListener a;
    
    public boolean b;
    
    public final b c;
    
    public h(b this$0, TListener param1TListener) {
      this.a = param1TListener;
      this.b = false;
    }
    
    public final void a() {
      // Byte code:
      //   0: aload_0
      //   1: monitorenter
      //   2: aload_0
      //   3: aconst_null
      //   4: putfield a : Ljava/lang/Object;
      //   7: aload_0
      //   8: monitorexit
      //   9: aload_0
      //   10: getfield c : Lc/c/a/a/c/l/b;
      //   13: getfield j : Ljava/util/ArrayList;
      //   16: astore_1
      //   17: aload_1
      //   18: monitorenter
      //   19: aload_0
      //   20: getfield c : Lc/c/a/a/c/l/b;
      //   23: getfield j : Ljava/util/ArrayList;
      //   26: aload_0
      //   27: invokevirtual remove : (Ljava/lang/Object;)Z
      //   30: pop
      //   31: aload_1
      //   32: monitorexit
      //   33: return
      //   34: astore_2
      //   35: aload_1
      //   36: monitorexit
      //   37: aload_2
      //   38: athrow
      //   39: astore_1
      //   40: aload_0
      //   41: monitorexit
      //   42: aload_1
      //   43: athrow
      // Exception table:
      //   from	to	target	type
      //   2	9	39	finally
      //   19	33	34	finally
      //   35	37	34	finally
      //   40	42	39	finally
    }
    
    public abstract void b(TListener param1TListener);
  }
  
  public static final class i extends l.a {
    public b a;
    
    public final int b;
    
    public i(b param1b, int param1Int) {
      this.a = param1b;
      this.b = param1Int;
    }
    
    public final void t(int param1Int, IBinder param1IBinder, Bundle param1Bundle) {
      q.g(this.a, "onPostInitComplete can be called only once per call to getRemoteService");
      b b1 = this.a;
      int j = this.b;
      Handler handler = b1.d;
      handler.sendMessage(handler.obtainMessage(1, j, -1, new b.k(b1, param1Int, param1IBinder, param1Bundle)));
      this.a = null;
    }
  }
  
  public final class j implements ServiceConnection {
    public final int a;
    
    public final b b;
    
    public j(b this$0, int param1Int) {
      this.a = param1Int;
    }
    
    public final void onServiceConnected(ComponentName param1ComponentName, IBinder param1IBinder) {
      null = this.b;
      if (param1IBinder == null) {
        b.y(null);
        return;
      } 
      synchronized (null.f) {
        b b2 = this.b;
        IInterface iInterface = param1IBinder.queryLocalInterface("com.google.android.gms.common.internal.IGmsServiceBroker");
        if (iInterface != null && iInterface instanceof n) {
          iInterface = iInterface;
        } else {
          iInterface = new m(param1IBinder);
        } 
        b2.g = (n)iInterface;
        b b1 = this.b;
        int i = this.a;
        Handler handler = b1.d;
        handler.sendMessage(handler.obtainMessage(7, i, -1, new b.l(b1, 0)));
        return;
      } 
    }
    
    public final void onServiceDisconnected(ComponentName param1ComponentName) {
      synchronized (this.b.f) {
        this.b.g = null;
        null = this.b.d;
        null.sendMessage(null.obtainMessage(6, this.a, 1));
        return;
      } 
    }
  }
  
  public final class k extends f {
    public final IBinder g;
    
    public final b h;
    
    public k(b this$0, int param1Int, IBinder param1IBinder, Bundle param1Bundle) {
      super(this$0, param1Int, param1Bundle);
      this.g = param1IBinder;
    }
    
    public final void c(c.c.a.a.c.a param1a) {
      b.b b1 = this.h.n;
      if (b1 != null)
        ((x)b1).a.t(param1a); 
      if (this.h != null) {
        System.currentTimeMillis();
        return;
      } 
      throw null;
    }
    
    public final boolean d() {
      try {
        String str = this.g.getInterfaceDescriptor();
        if (!this.h.t().equals(str)) {
          String str1 = this.h.t();
          int i = String.valueOf(str1).length();
          StringBuilder stringBuilder = new StringBuilder(String.valueOf(str).length() + i + 34);
          stringBuilder.append("service descriptor mismatch: ");
          stringBuilder.append(str1);
          stringBuilder.append(" vs. ");
          stringBuilder.append(str);
          Log.e("GmsClient", stringBuilder.toString());
          return false;
        } 
        IInterface iInterface = (IInterface)this.h.p(this.g);
        if (iInterface != null && (b.z(this.h, 2, 4, iInterface) || b.z(this.h, 3, 4, iInterface))) {
          b b1 = this.h;
          b1.q = null;
          b.a a = b1.m;
          if (a != null)
            ((w)a).a.y(null); 
          return true;
        } 
        return false;
      } catch (RemoteException remoteException) {
        Log.w("GmsClient", "service probably died");
        return false;
      } 
    }
  }
  
  public final class l extends f {
    public final b g;
    
    public l(b this$0, int param1Int) {
      super(this$0, param1Int, null);
    }
    
    public final void c(c.c.a.a.c.a param1a) {
      b b1 = this.g;
      if (b1 != null) {
        b1.h.a(param1a);
        if (this.g != null) {
          System.currentTimeMillis();
          return;
        } 
        throw null;
      } 
      throw null;
    }
    
    public final boolean d() {
      this.g.h.a(c.c.a.a.c.a.f);
      return true;
    }
  }
}


/* Location:              C:\Users\panch\Downloads\dvba_v1.1.0-dex2jar.jar!\c\c\a\a\c\l\b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */