package b.i.f;

import a.a.a.a.a;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.os.CancellationSignal;
import android.util.Log;
import b.i.e.b.c;
import b.i.e.b.d;
import b.i.j.b;
import java.io.File;
import java.lang.reflect.Array;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class e extends j {
  public static Class<?> b;
  
  public static Constructor<?> c;
  
  public static Method d;
  
  public static Method e;
  
  public static boolean f = false;
  
  public static boolean g(Object paramObject, String paramString, int paramInt, boolean paramBoolean) {
    h();
    try {
      return ((Boolean)d.invoke(paramObject, new Object[] { paramString, Integer.valueOf(paramInt), Boolean.valueOf(paramBoolean) })).booleanValue();
    } catch (IllegalAccessException illegalAccessException) {
    
    } catch (InvocationTargetException invocationTargetException) {}
    throw new RuntimeException(invocationTargetException);
  }
  
  public static void h() {
    Class clazz1;
    Class clazz2;
    if (f)
      return; 
    f = true;
    Method method = null;
    try {
      clazz2 = Class.forName("android.graphics.FontFamily");
      Constructor<?> constructor = clazz2.getConstructor(new Class[0]);
      Method method1 = clazz2.getMethod("addFontWeightStyle", new Class[] { String.class, int.class, boolean.class });
      Method method2 = Typeface.class.getMethod("createFromFamiliesWithDefault", new Class[] { Array.newInstance(clazz2, 1).getClass() });
      method = method2;
    } catch (ClassNotFoundException classNotFoundException) {
      Log.e("TypefaceCompatApi21Impl", classNotFoundException.getClass().getName(), classNotFoundException);
      Method method2 = null;
      clazz2 = null;
      clazz1 = clazz2;
      Method method1 = method;
      method = method2;
    } catch (NoSuchMethodException noSuchMethodException) {}
    c = (Constructor<?>)noSuchMethodException;
    b = clazz2;
    d = (Method)clazz1;
    e = method;
  }
  
  public Typeface a(Context paramContext, c paramc, Resources paramResources, int paramInt) {
    h();
    try {
      Object object = c.newInstance(new Object[0]);
      d[] arrayOfD = paramc.a;
      int i = arrayOfD.length;
      paramInt = 0;
      while (paramInt < i) {
        d d = arrayOfD[paramInt];
        File file = a.L(paramContext);
        if (file == null)
          return null; 
        try {
          boolean bool = a.p(file, paramResources, d.f);
          if (!bool)
            return null; 
          bool = g(object, file.getPath(), d.b, d.c);
          file.delete();
          if (!bool)
            return null; 
        } catch (RuntimeException runtimeException) {
          return null;
        } finally {
          file.delete();
        } 
      } 
      h();
      try {
        null = Array.newInstance(b, 1);
        Array.set(null, 0, object);
        return (Typeface)e.invoke(null, new Object[] { null });
      } catch (IllegalAccessException illegalAccessException) {
      
      } catch (InvocationTargetException null) {}
      throw new RuntimeException(invocationTargetException);
    } catch (IllegalAccessException illegalAccessException) {
    
    } catch (InstantiationException instantiationException) {
    
    } catch (InvocationTargetException invocationTargetException) {}
    throw new RuntimeException(invocationTargetException);
  }
  
  public Typeface b(Context paramContext, CancellationSignal paramCancellationSignal, b.f[] paramArrayOff, int paramInt) {
    // Byte code:
    //   0: aload_3
    //   1: arraylength
    //   2: iconst_1
    //   3: if_icmpge -> 8
    //   6: aconst_null
    //   7: areturn
    //   8: aload_0
    //   9: aload_3
    //   10: iload #4
    //   12: invokevirtual f : ([Lb/i/j/b$f;I)Lb/i/j/b$f;
    //   15: astore_3
    //   16: aload_1
    //   17: invokevirtual getContentResolver : ()Landroid/content/ContentResolver;
    //   20: astore #5
    //   22: aload #5
    //   24: aload_3
    //   25: getfield a : Landroid/net/Uri;
    //   28: ldc 'r'
    //   30: aload_2
    //   31: invokevirtual openFileDescriptor : (Landroid/net/Uri;Ljava/lang/String;Landroid/os/CancellationSignal;)Landroid/os/ParcelFileDescriptor;
    //   34: astore_3
    //   35: aload_3
    //   36: ifnonnull -> 49
    //   39: aload_3
    //   40: ifnull -> 47
    //   43: aload_3
    //   44: invokevirtual close : ()V
    //   47: aconst_null
    //   48: areturn
    //   49: new java/lang/StringBuilder
    //   52: astore_2
    //   53: aload_2
    //   54: invokespecial <init> : ()V
    //   57: aload_2
    //   58: ldc '/proc/self/fd/'
    //   60: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   63: pop
    //   64: aload_2
    //   65: aload_3
    //   66: invokevirtual getFd : ()I
    //   69: invokevirtual append : (I)Ljava/lang/StringBuilder;
    //   72: pop
    //   73: aload_2
    //   74: invokevirtual toString : ()Ljava/lang/String;
    //   77: invokestatic readlink : (Ljava/lang/String;)Ljava/lang/String;
    //   80: astore #5
    //   82: aload #5
    //   84: invokestatic stat : (Ljava/lang/String;)Landroid/system/StructStat;
    //   87: getfield st_mode : I
    //   90: invokestatic S_ISREG : (I)Z
    //   93: ifeq -> 113
    //   96: new java/io/File
    //   99: astore_2
    //   100: aload_2
    //   101: aload #5
    //   103: invokespecial <init> : (Ljava/lang/String;)V
    //   106: goto -> 115
    //   109: astore_1
    //   110: goto -> 185
    //   113: aconst_null
    //   114: astore_2
    //   115: aload_2
    //   116: ifnull -> 140
    //   119: aload_2
    //   120: invokevirtual canRead : ()Z
    //   123: ifne -> 129
    //   126: goto -> 140
    //   129: aload_2
    //   130: invokestatic createFromFile : (Ljava/io/File;)Landroid/graphics/Typeface;
    //   133: astore_1
    //   134: aload_3
    //   135: invokevirtual close : ()V
    //   138: aload_1
    //   139: areturn
    //   140: new java/io/FileInputStream
    //   143: astore_2
    //   144: aload_2
    //   145: aload_3
    //   146: invokevirtual getFileDescriptor : ()Ljava/io/FileDescriptor;
    //   149: invokespecial <init> : (Ljava/io/FileDescriptor;)V
    //   152: aload_0
    //   153: aload_1
    //   154: aload_2
    //   155: invokespecial c : (Landroid/content/Context;Ljava/io/InputStream;)Landroid/graphics/Typeface;
    //   158: astore_1
    //   159: aload_2
    //   160: invokevirtual close : ()V
    //   163: aload_3
    //   164: invokevirtual close : ()V
    //   167: aload_1
    //   168: areturn
    //   169: astore_1
    //   170: aload_2
    //   171: invokevirtual close : ()V
    //   174: goto -> 183
    //   177: astore_2
    //   178: aload_1
    //   179: aload_2
    //   180: invokevirtual addSuppressed : (Ljava/lang/Throwable;)V
    //   183: aload_1
    //   184: athrow
    //   185: aload_3
    //   186: invokevirtual close : ()V
    //   189: goto -> 198
    //   192: astore_2
    //   193: aload_1
    //   194: aload_2
    //   195: invokevirtual addSuppressed : (Ljava/lang/Throwable;)V
    //   198: aload_1
    //   199: athrow
    //   200: astore_1
    //   201: aconst_null
    //   202: areturn
    //   203: astore_2
    //   204: goto -> 113
    // Exception table:
    //   from	to	target	type
    //   22	35	200	java/io/IOException
    //   43	47	200	java/io/IOException
    //   49	106	203	android/system/ErrnoException
    //   49	106	109	finally
    //   119	126	109	finally
    //   129	134	109	finally
    //   134	138	200	java/io/IOException
    //   140	152	109	finally
    //   152	159	169	finally
    //   159	163	109	finally
    //   163	167	200	java/io/IOException
    //   170	174	177	finally
    //   178	183	109	finally
    //   183	185	109	finally
    //   185	189	192	finally
    //   193	198	200	java/io/IOException
    //   198	200	200	java/io/IOException
  }
}


/* Location:              C:\Users\panch\Downloads\dvba_v1.1.0-dex2jar.jar!\b\i\f\e.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */