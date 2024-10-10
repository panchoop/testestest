package c.c.a.a.c.l;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.IBinder;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public final class e0 implements ServiceConnection {
  public final Set<ServiceConnection> a;
  
  public int b;
  
  public boolean c;
  
  public IBinder d;
  
  public final h.a e;
  
  public ComponentName f;
  
  public final d0 g;
  
  public e0(d0 paramd0, h.a parama) {
    this.e = parama;
    this.a = new HashSet<ServiceConnection>();
    this.b = 2;
  }
  
  public final void a(String paramString) {
    // Byte code:
    //   0: aload_0
    //   1: iconst_3
    //   2: putfield b : I
    //   5: aload_0
    //   6: getfield g : Lc/c/a/a/c/l/d0;
    //   9: astore_1
    //   10: aload_1
    //   11: getfield f : Lc/c/a/a/c/n/a;
    //   14: astore #6
    //   16: aload_1
    //   17: getfield d : Landroid/content/Context;
    //   20: astore_1
    //   21: aload_0
    //   22: getfield e : Lc/c/a/a/c/l/h$a;
    //   25: invokevirtual a : ()Landroid/content/Intent;
    //   28: astore #5
    //   30: aload_0
    //   31: getfield e : Lc/c/a/a/c/l/h$a;
    //   34: getfield d : I
    //   37: istore_3
    //   38: aload #6
    //   40: ifnull -> 220
    //   43: aload #5
    //   45: invokevirtual getComponent : ()Landroid/content/ComponentName;
    //   48: astore #6
    //   50: iconst_0
    //   51: istore #4
    //   53: aload #6
    //   55: ifnonnull -> 61
    //   58: goto -> 108
    //   61: aload #6
    //   63: invokevirtual getPackageName : ()Ljava/lang/String;
    //   66: astore #6
    //   68: ldc 'com.google.android.gms'
    //   70: aload #6
    //   72: invokevirtual equals : (Ljava/lang/Object;)Z
    //   75: pop
    //   76: aload_1
    //   77: invokestatic a : (Landroid/content/Context;)Lc/c/a/a/c/p/a;
    //   80: getfield a : Landroid/content/Context;
    //   83: invokevirtual getPackageManager : ()Landroid/content/pm/PackageManager;
    //   86: aload #6
    //   88: iconst_0
    //   89: invokevirtual getApplicationInfo : (Ljava/lang/String;I)Landroid/content/pm/ApplicationInfo;
    //   92: getfield flags : I
    //   95: istore_2
    //   96: iload_2
    //   97: ldc 2097152
    //   99: iand
    //   100: ifeq -> 108
    //   103: iconst_1
    //   104: istore_2
    //   105: goto -> 110
    //   108: iconst_0
    //   109: istore_2
    //   110: iload_2
    //   111: ifeq -> 125
    //   114: ldc 'ConnectionTracker'
    //   116: ldc 'Attempted to bind to a service in a STOPPED package.'
    //   118: invokestatic w : (Ljava/lang/String;Ljava/lang/String;)I
    //   121: pop
    //   122: goto -> 135
    //   125: aload_1
    //   126: aload #5
    //   128: aload_0
    //   129: iload_3
    //   130: invokevirtual bindService : (Landroid/content/Intent;Landroid/content/ServiceConnection;I)Z
    //   133: istore #4
    //   135: aload_0
    //   136: iload #4
    //   138: putfield c : Z
    //   141: iload #4
    //   143: ifeq -> 183
    //   146: aload_0
    //   147: getfield g : Lc/c/a/a/c/l/d0;
    //   150: getfield e : Landroid/os/Handler;
    //   153: iconst_1
    //   154: aload_0
    //   155: getfield e : Lc/c/a/a/c/l/h$a;
    //   158: invokevirtual obtainMessage : (ILjava/lang/Object;)Landroid/os/Message;
    //   161: astore #5
    //   163: aload_0
    //   164: getfield g : Lc/c/a/a/c/l/d0;
    //   167: astore_1
    //   168: aload_1
    //   169: getfield e : Landroid/os/Handler;
    //   172: aload #5
    //   174: aload_1
    //   175: getfield h : J
    //   178: invokevirtual sendMessageDelayed : (Landroid/os/Message;J)Z
    //   181: pop
    //   182: return
    //   183: aload_0
    //   184: iconst_2
    //   185: putfield b : I
    //   188: aload_0
    //   189: getfield g : Lc/c/a/a/c/l/d0;
    //   192: getfield f : Lc/c/a/a/c/n/a;
    //   195: astore_1
    //   196: aload_0
    //   197: getfield g : Lc/c/a/a/c/l/d0;
    //   200: getfield d : Landroid/content/Context;
    //   203: astore #5
    //   205: aload_1
    //   206: ifnull -> 216
    //   209: aload #5
    //   211: aload_0
    //   212: invokevirtual unbindService : (Landroid/content/ServiceConnection;)V
    //   215: return
    //   216: aconst_null
    //   217: athrow
    //   218: astore_1
    //   219: return
    //   220: aconst_null
    //   221: athrow
    //   222: astore #6
    //   224: goto -> 108
    // Exception table:
    //   from	to	target	type
    //   76	96	222	android/content/pm/PackageManager$NameNotFoundException
    //   188	205	218	java/lang/IllegalArgumentException
    //   209	215	218	java/lang/IllegalArgumentException
    //   216	218	218	java/lang/IllegalArgumentException
  }
  
  public final void onServiceConnected(ComponentName paramComponentName, IBinder paramIBinder) {
    synchronized (this.g.c) {
      this.g.e.removeMessages(1, this.e);
      this.d = paramIBinder;
      this.f = paramComponentName;
      Iterator<ServiceConnection> iterator = this.a.iterator();
      while (iterator.hasNext())
        ((ServiceConnection)iterator.next()).onServiceConnected(paramComponentName, paramIBinder); 
      this.b = 1;
      return;
    } 
  }
  
  public final void onServiceDisconnected(ComponentName paramComponentName) {
    synchronized (this.g.c) {
      this.g.e.removeMessages(1, this.e);
      this.d = null;
      this.f = paramComponentName;
      Iterator<ServiceConnection> iterator = this.a.iterator();
      while (iterator.hasNext())
        ((ServiceConnection)iterator.next()).onServiceDisconnected(paramComponentName); 
      this.b = 2;
      return;
    } 
  }
}


/* Location:              C:\Users\panch\Downloads\dvba_v1.1.0-dex2jar.jar!\c\c\a\a\c\l\e0.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */