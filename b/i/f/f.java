package b.i.f;

import a.a.a.a.a;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.net.Uri;
import android.os.CancellationSignal;
import android.util.Log;
import b.f.h;
import b.i.e.b.c;
import b.i.j.b;
import java.lang.reflect.Array;
import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import java.nio.ByteBuffer;
import java.util.List;

public class f extends j {
  public static final Class<?> b;
  
  public static final Constructor<?> c;
  
  public static final Method d;
  
  public static final Method e;
  
  static {
    ClassNotFoundException classNotFoundException;
    Class clazz;
    Constructor<?> constructor = null;
    try {
      clazz = Class.forName("android.graphics.FontFamily");
      Constructor<?> constructor1 = clazz.getConstructor(new Class[0]);
      Method method3 = clazz.getMethod("addFontWeightStyle", new Class[] { ByteBuffer.class, int.class, List.class, int.class, boolean.class });
      Method method1 = Typeface.class.getMethod("createFromFamiliesWithDefault", new Class[] { Array.newInstance(clazz, 1).getClass() });
      constructor = constructor1;
      Method method2 = method1;
      method1 = method3;
    } catch (ClassNotFoundException classNotFoundException1) {
      Log.e("TypefaceCompatApi24Impl", classNotFoundException1.getClass().getName(), classNotFoundException1);
      clazz = null;
      classNotFoundException = null;
      classNotFoundException1 = classNotFoundException;
    } catch (NoSuchMethodException noSuchMethodException) {}
    c = constructor;
    b = clazz;
    d = (Method)noSuchMethodException;
    e = (Method)classNotFoundException;
  }
  
  public static boolean g(Object paramObject, ByteBuffer paramByteBuffer, int paramInt1, int paramInt2, boolean paramBoolean) {
    try {
      return ((Boolean)d.invoke(paramObject, new Object[] { paramByteBuffer, Integer.valueOf(paramInt1), null, Integer.valueOf(paramInt2), Boolean.valueOf(paramBoolean) })).booleanValue();
    } catch (IllegalAccessException|java.lang.reflect.InvocationTargetException illegalAccessException) {
      return false;
    } 
  }
  
  public static Typeface h(Object paramObject) {
    try {
      Object object = Array.newInstance(b, 1);
      Array.set(object, 0, paramObject);
      return (Typeface)e.invoke(null, new Object[] { object });
    } catch (IllegalAccessException|java.lang.reflect.InvocationTargetException illegalAccessException) {
      return null;
    } 
  }
  
  public Typeface a(Context paramContext, c paramc, Resources paramResources, int paramInt) {
    // Byte code:
    //   0: getstatic b/i/f/f.c : Ljava/lang/reflect/Constructor;
    //   3: iconst_0
    //   4: anewarray java/lang/Object
    //   7: invokevirtual newInstance : ([Ljava/lang/Object;)Ljava/lang/Object;
    //   10: astore #10
    //   12: goto -> 20
    //   15: astore #10
    //   17: aconst_null
    //   18: astore #10
    //   20: aload #10
    //   22: ifnonnull -> 27
    //   25: aconst_null
    //   26: areturn
    //   27: aload_2
    //   28: getfield a : [Lb/i/e/b/d;
    //   31: astore #11
    //   33: aload #11
    //   35: arraylength
    //   36: istore #5
    //   38: iconst_0
    //   39: istore #4
    //   41: iload #4
    //   43: iload #5
    //   45: if_icmpge -> 220
    //   48: aload #11
    //   50: iload #4
    //   52: aaload
    //   53: astore #12
    //   55: aload #12
    //   57: getfield f : I
    //   60: istore #6
    //   62: aload_1
    //   63: invokestatic L : (Landroid/content/Context;)Ljava/io/File;
    //   66: astore #13
    //   68: aload #13
    //   70: ifnonnull -> 76
    //   73: goto -> 97
    //   76: aload #13
    //   78: aload_3
    //   79: iload #6
    //   81: invokestatic p : (Ljava/io/File;Landroid/content/res/Resources;I)Z
    //   84: istore #7
    //   86: iload #7
    //   88: ifne -> 102
    //   91: aload #13
    //   93: invokevirtual delete : ()Z
    //   96: pop
    //   97: aconst_null
    //   98: astore_2
    //   99: goto -> 173
    //   102: new java/io/FileInputStream
    //   105: astore #14
    //   107: aload #14
    //   109: aload #13
    //   111: invokespecial <init> : (Ljava/io/File;)V
    //   114: aload #14
    //   116: invokevirtual getChannel : ()Ljava/nio/channels/FileChannel;
    //   119: astore_2
    //   120: aload_2
    //   121: invokevirtual size : ()J
    //   124: lstore #8
    //   126: aload_2
    //   127: getstatic java/nio/channels/FileChannel$MapMode.READ_ONLY : Ljava/nio/channels/FileChannel$MapMode;
    //   130: lconst_0
    //   131: lload #8
    //   133: invokevirtual map : (Ljava/nio/channels/FileChannel$MapMode;JJ)Ljava/nio/MappedByteBuffer;
    //   136: astore_2
    //   137: aload #14
    //   139: invokevirtual close : ()V
    //   142: goto -> 167
    //   145: astore_2
    //   146: aload #14
    //   148: invokevirtual close : ()V
    //   151: goto -> 162
    //   154: astore #14
    //   156: aload_2
    //   157: aload #14
    //   159: invokevirtual addSuppressed : (Ljava/lang/Throwable;)V
    //   162: aload_2
    //   163: athrow
    //   164: astore_2
    //   165: aconst_null
    //   166: astore_2
    //   167: aload #13
    //   169: invokevirtual delete : ()Z
    //   172: pop
    //   173: aload_2
    //   174: ifnonnull -> 179
    //   177: aconst_null
    //   178: areturn
    //   179: aload #10
    //   181: aload_2
    //   182: aload #12
    //   184: getfield e : I
    //   187: aload #12
    //   189: getfield b : I
    //   192: aload #12
    //   194: getfield c : Z
    //   197: invokestatic g : (Ljava/lang/Object;Ljava/nio/ByteBuffer;IIZ)Z
    //   200: ifne -> 205
    //   203: aconst_null
    //   204: areturn
    //   205: iinc #4, 1
    //   208: goto -> 41
    //   211: astore_1
    //   212: aload #13
    //   214: invokevirtual delete : ()Z
    //   217: pop
    //   218: aload_1
    //   219: athrow
    //   220: aload #10
    //   222: invokestatic h : (Ljava/lang/Object;)Landroid/graphics/Typeface;
    //   225: areturn
    // Exception table:
    //   from	to	target	type
    //   0	12	15	java/lang/IllegalAccessException
    //   0	12	15	java/lang/InstantiationException
    //   0	12	15	java/lang/reflect/InvocationTargetException
    //   76	86	211	finally
    //   102	114	164	java/io/IOException
    //   102	114	211	finally
    //   114	137	145	finally
    //   137	142	164	java/io/IOException
    //   137	142	211	finally
    //   146	151	154	finally
    //   156	162	164	java/io/IOException
    //   156	162	211	finally
    //   162	164	164	java/io/IOException
    //   162	164	211	finally
  }
  
  public Typeface b(Context paramContext, CancellationSignal paramCancellationSignal, b.f[] paramArrayOff, int paramInt) {
    byte b = 0;
    try {
      object = c.newInstance(new Object[0]);
    } catch (IllegalAccessException|InstantiationException|java.lang.reflect.InvocationTargetException object) {
      object = null;
    } 
    if (object == null)
      return null; 
    h h = new h();
    int i = paramArrayOff.length;
    while (b < i) {
      b.f f1 = paramArrayOff[b];
      Uri uri = f1.a;
      ByteBuffer byteBuffer2 = (ByteBuffer)h.get(uri);
      ByteBuffer byteBuffer1 = byteBuffer2;
      if (byteBuffer2 == null) {
        byteBuffer1 = a.Y(paramContext, paramCancellationSignal, uri);
        h.put(uri, byteBuffer1);
      } 
      if (byteBuffer1 == null)
        return null; 
      if (!g(object, byteBuffer1, f1.b, f1.c, f1.d))
        return null; 
      b++;
    } 
    Typeface typeface = h(object);
    return (typeface == null) ? null : Typeface.create(typeface, paramInt);
  }
}


/* Location:              C:\Users\panch\Downloads\dvba_v1.1.0-dex2jar.jar!\b\i\f\f.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */