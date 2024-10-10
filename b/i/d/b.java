package b.i.d;

import android.app.Activity;
import android.app.Application;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

public final class b {
  public static final Class<?> a;
  
  public static final Field b;
  
  public static final Field c;
  
  public static final Method d;
  
  public static final Method e;
  
  public static final Method f;
  
  public static final Handler g;
  
  static {
    // Byte code:
    //   0: new android/os/Handler
    //   3: dup
    //   4: invokestatic getMainLooper : ()Landroid/os/Looper;
    //   7: invokespecial <init> : (Landroid/os/Looper;)V
    //   10: putstatic b/i/d/b.g : Landroid/os/Handler;
    //   13: aconst_null
    //   14: astore_1
    //   15: ldc 'android.app.ActivityThread'
    //   17: invokestatic forName : (Ljava/lang/String;)Ljava/lang/Class;
    //   20: astore_0
    //   21: goto -> 27
    //   24: astore_0
    //   25: aconst_null
    //   26: astore_0
    //   27: aload_0
    //   28: putstatic b/i/d/b.a : Ljava/lang/Class;
    //   31: ldc android/app/Activity
    //   33: ldc 'mMainThread'
    //   35: invokevirtual getDeclaredField : (Ljava/lang/String;)Ljava/lang/reflect/Field;
    //   38: astore_0
    //   39: aload_0
    //   40: iconst_1
    //   41: invokevirtual setAccessible : (Z)V
    //   44: goto -> 50
    //   47: astore_0
    //   48: aconst_null
    //   49: astore_0
    //   50: aload_0
    //   51: putstatic b/i/d/b.b : Ljava/lang/reflect/Field;
    //   54: ldc android/app/Activity
    //   56: ldc 'mToken'
    //   58: invokevirtual getDeclaredField : (Ljava/lang/String;)Ljava/lang/reflect/Field;
    //   61: astore_0
    //   62: aload_0
    //   63: iconst_1
    //   64: invokevirtual setAccessible : (Z)V
    //   67: goto -> 73
    //   70: astore_0
    //   71: aconst_null
    //   72: astore_0
    //   73: aload_0
    //   74: putstatic b/i/d/b.c : Ljava/lang/reflect/Field;
    //   77: getstatic b/i/d/b.a : Ljava/lang/Class;
    //   80: astore_0
    //   81: aload_0
    //   82: ifnonnull -> 90
    //   85: aconst_null
    //   86: astore_0
    //   87: goto -> 122
    //   90: aload_0
    //   91: ldc 'performStopActivity'
    //   93: iconst_3
    //   94: anewarray java/lang/Class
    //   97: dup
    //   98: iconst_0
    //   99: ldc android/os/IBinder
    //   101: aastore
    //   102: dup
    //   103: iconst_1
    //   104: getstatic java/lang/Boolean.TYPE : Ljava/lang/Class;
    //   107: aastore
    //   108: dup
    //   109: iconst_2
    //   110: ldc java/lang/String
    //   112: aastore
    //   113: invokevirtual getDeclaredMethod : (Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;
    //   116: astore_0
    //   117: aload_0
    //   118: iconst_1
    //   119: invokevirtual setAccessible : (Z)V
    //   122: aload_0
    //   123: putstatic b/i/d/b.d : Ljava/lang/reflect/Method;
    //   126: getstatic b/i/d/b.a : Ljava/lang/Class;
    //   129: astore_0
    //   130: aload_0
    //   131: ifnonnull -> 139
    //   134: aconst_null
    //   135: astore_0
    //   136: goto -> 166
    //   139: aload_0
    //   140: ldc 'performStopActivity'
    //   142: iconst_2
    //   143: anewarray java/lang/Class
    //   146: dup
    //   147: iconst_0
    //   148: ldc android/os/IBinder
    //   150: aastore
    //   151: dup
    //   152: iconst_1
    //   153: getstatic java/lang/Boolean.TYPE : Ljava/lang/Class;
    //   156: aastore
    //   157: invokevirtual getDeclaredMethod : (Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;
    //   160: astore_0
    //   161: aload_0
    //   162: iconst_1
    //   163: invokevirtual setAccessible : (Z)V
    //   166: aload_0
    //   167: putstatic b/i/d/b.e : Ljava/lang/reflect/Method;
    //   170: getstatic b/i/d/b.a : Ljava/lang/Class;
    //   173: astore_2
    //   174: aload_1
    //   175: astore_0
    //   176: invokestatic a : ()Z
    //   179: ifeq -> 260
    //   182: aload_2
    //   183: ifnonnull -> 191
    //   186: aload_1
    //   187: astore_0
    //   188: goto -> 260
    //   191: aload_2
    //   192: ldc 'requestRelaunchActivity'
    //   194: bipush #9
    //   196: anewarray java/lang/Class
    //   199: dup
    //   200: iconst_0
    //   201: ldc android/os/IBinder
    //   203: aastore
    //   204: dup
    //   205: iconst_1
    //   206: ldc java/util/List
    //   208: aastore
    //   209: dup
    //   210: iconst_2
    //   211: ldc java/util/List
    //   213: aastore
    //   214: dup
    //   215: iconst_3
    //   216: getstatic java/lang/Integer.TYPE : Ljava/lang/Class;
    //   219: aastore
    //   220: dup
    //   221: iconst_4
    //   222: getstatic java/lang/Boolean.TYPE : Ljava/lang/Class;
    //   225: aastore
    //   226: dup
    //   227: iconst_5
    //   228: ldc android/content/res/Configuration
    //   230: aastore
    //   231: dup
    //   232: bipush #6
    //   234: ldc android/content/res/Configuration
    //   236: aastore
    //   237: dup
    //   238: bipush #7
    //   240: getstatic java/lang/Boolean.TYPE : Ljava/lang/Class;
    //   243: aastore
    //   244: dup
    //   245: bipush #8
    //   247: getstatic java/lang/Boolean.TYPE : Ljava/lang/Class;
    //   250: aastore
    //   251: invokevirtual getDeclaredMethod : (Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;
    //   254: astore_0
    //   255: aload_0
    //   256: iconst_1
    //   257: invokevirtual setAccessible : (Z)V
    //   260: aload_0
    //   261: putstatic b/i/d/b.f : Ljava/lang/reflect/Method;
    //   264: return
    //   265: astore_0
    //   266: goto -> 85
    //   269: astore_0
    //   270: goto -> 134
    //   273: astore_0
    //   274: aload_1
    //   275: astore_0
    //   276: goto -> 260
    // Exception table:
    //   from	to	target	type
    //   15	21	24	finally
    //   31	44	47	finally
    //   54	67	70	finally
    //   90	122	265	finally
    //   139	166	269	finally
    //   191	260	273	finally
  }
  
  public static boolean a() {
    int i = Build.VERSION.SDK_INT;
    return (i == 26 || i == 27);
  }
  
  public static boolean b(Activity paramActivity) {
    if (Build.VERSION.SDK_INT >= 28) {
      paramActivity.recreate();
      return true;
    } 
    if (a() && f == null)
      return false; 
    if (e == null && d == null)
      return false; 
    try {
      Object object2 = c.get(paramActivity);
      if (object2 == null)
        return false; 
      Object object1 = b.get(paramActivity);
      if (object1 == null)
        return false; 
      Application application = paramActivity.getApplication();
      c c = new c();
      this(paramActivity);
      application.registerActivityLifecycleCallbacks(c);
      null = g;
      a a = new a();
      this(c, object2);
      null.post(a);
    } finally {
      paramActivity = null;
    } 
  }
  
  public class a implements Runnable {
    public final b.c b;
    
    public final Object c;
    
    public a(b this$0, Object param1Object) {}
    
    public void run() {
      this.b.b = this.c;
    }
  }
  
  public class b implements Runnable {
    public final Application b;
    
    public final b.c c;
    
    public b(b this$0, b.c param1c) {}
    
    public void run() {
      this.b.unregisterActivityLifecycleCallbacks(this.c);
    }
  }
  
  public static final class c implements Application.ActivityLifecycleCallbacks {
    public Object b;
    
    public Activity c;
    
    public boolean d = false;
    
    public boolean e = false;
    
    public boolean f = false;
    
    public c(Activity param1Activity) {
      this.c = param1Activity;
    }
    
    public void onActivityCreated(Activity param1Activity, Bundle param1Bundle) {}
    
    public void onActivityDestroyed(Activity param1Activity) {
      if (this.c == param1Activity) {
        this.c = null;
        this.e = true;
      } 
    }
    
    public void onActivityPaused(Activity param1Activity) {
      if (this.e && !this.f && !this.d) {
        Object object = this.b;
        boolean bool = false;
        try {
          Object object1 = b.c.get(param1Activity);
        } finally {
          param1Activity = null;
        } 
        if (bool) {
          this.f = true;
          this.b = null;
        } 
      } 
    }
    
    public void onActivityResumed(Activity param1Activity) {}
    
    public void onActivitySaveInstanceState(Activity param1Activity, Bundle param1Bundle) {}
    
    public void onActivityStarted(Activity param1Activity) {
      if (this.c == param1Activity)
        this.d = true; 
    }
    
    public void onActivityStopped(Activity param1Activity) {}
  }
}


/* Location:              C:\Users\panch\Downloads\dvba_v1.1.0-dex2jar.jar!\b\i\d\b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */