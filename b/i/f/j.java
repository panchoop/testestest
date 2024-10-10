package b.i.f;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.os.CancellationSignal;
import b.i.e.b.c;
import java.io.File;
import java.io.InputStream;
import java.util.concurrent.ConcurrentHashMap;

public class j {
  public ConcurrentHashMap<Long, c> a = new ConcurrentHashMap<Long, c>();
  
  public static <T> T e(T[] paramArrayOfT, int paramInt, b<T> paramb) {
    // Byte code:
    //   0: iload_1
    //   1: iconst_1
    //   2: iand
    //   3: ifne -> 13
    //   6: sipush #400
    //   9: istore_3
    //   10: goto -> 17
    //   13: sipush #700
    //   16: istore_3
    //   17: iload_1
    //   18: iconst_2
    //   19: iand
    //   20: ifeq -> 29
    //   23: iconst_1
    //   24: istore #8
    //   26: goto -> 32
    //   29: iconst_0
    //   30: istore #8
    //   32: aconst_null
    //   33: astore #9
    //   35: ldc 2147483647
    //   37: istore #4
    //   39: aload_0
    //   40: arraylength
    //   41: istore #7
    //   43: iconst_0
    //   44: istore_1
    //   45: iload_1
    //   46: iload #7
    //   48: if_icmpge -> 136
    //   51: aload_0
    //   52: iload_1
    //   53: aaload
    //   54: astore #10
    //   56: aload_2
    //   57: aload #10
    //   59: invokeinterface a : (Ljava/lang/Object;)I
    //   64: iload_3
    //   65: isub
    //   66: invokestatic abs : (I)I
    //   69: istore #6
    //   71: aload_2
    //   72: aload #10
    //   74: invokeinterface b : (Ljava/lang/Object;)Z
    //   79: iload #8
    //   81: if_icmpne -> 90
    //   84: iconst_0
    //   85: istore #5
    //   87: goto -> 93
    //   90: iconst_1
    //   91: istore #5
    //   93: iload #6
    //   95: iconst_2
    //   96: imul
    //   97: iload #5
    //   99: iadd
    //   100: istore #6
    //   102: aload #9
    //   104: ifnull -> 118
    //   107: iload #4
    //   109: istore #5
    //   111: iload #4
    //   113: iload #6
    //   115: if_icmple -> 126
    //   118: aload #10
    //   120: astore #9
    //   122: iload #6
    //   124: istore #5
    //   126: iinc #1, 1
    //   129: iload #5
    //   131: istore #4
    //   133: goto -> 45
    //   136: aload #9
    //   138: areturn
  }
  
  public abstract Typeface a(Context paramContext, c paramc, Resources paramResources, int paramInt);
  
  public abstract Typeface b(Context paramContext, CancellationSignal paramCancellationSignal, b.i.j.b.f[] paramArrayOff, int paramInt);
  
  public Typeface c(Context paramContext, InputStream paramInputStream) {
    File file = a.a.a.a.a.L(paramContext);
    if (file == null)
      return null; 
    try {
      boolean bool = a.a.a.a.a.q(file, paramInputStream);
      if (!bool)
        return null; 
      return Typeface.createFromFile(file.getPath());
    } catch (RuntimeException runtimeException) {
      return null;
    } finally {
      file.delete();
    } 
  }
  
  public Typeface d(Context paramContext, Resources paramResources, int paramInt1, String paramString, int paramInt2) {
    File file = a.a.a.a.a.L(paramContext);
    if (file == null)
      return null; 
    try {
      boolean bool = a.a.a.a.a.p(file, paramResources, paramInt1);
      if (!bool)
        return null; 
      return Typeface.createFromFile(file.getPath());
    } catch (RuntimeException runtimeException) {
      return null;
    } finally {
      file.delete();
    } 
  }
  
  public b.i.j.b.f f(b.i.j.b.f[] paramArrayOff, int paramInt) {
    return e(paramArrayOff, paramInt, new a(this));
  }
  
  public class a implements b<b.i.j.b.f> {
    public a(j this$0) {}
    
    public int a(Object param1Object) {
      return ((b.i.j.b.f)param1Object).c;
    }
    
    public boolean b(Object param1Object) {
      return ((b.i.j.b.f)param1Object).d;
    }
  }
  
  public static interface b<T> {
    int a(T param1T);
    
    boolean b(T param1T);
  }
}


/* Location:              C:\Users\panch\Downloads\dvba_v1.1.0-dex2jar.jar!\b\i\f\j.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */