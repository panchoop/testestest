package c.a.b;

import android.util.Log;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

public class v {
  public static boolean a = Log.isLoggable("Volley", 2);
  
  public static final String b = v.class.getName();
  
  public static String a(String paramString, Object... paramVarArgs) {
    String str;
    if (paramVarArgs != null)
      paramString = String.format(Locale.US, paramString, paramVarArgs); 
    StackTraceElement[] arrayOfStackTraceElement = (new Throwable()).fillInStackTrace().getStackTrace();
    byte b = 2;
    while (true) {
      if (b < arrayOfStackTraceElement.length) {
        if (!arrayOfStackTraceElement[b].getClassName().equals(b)) {
          String str2 = arrayOfStackTraceElement[b].getClassName();
          str2 = str2.substring(str2.lastIndexOf('.') + 1);
          str2 = str2.substring(str2.lastIndexOf('$') + 1);
          StringBuilder stringBuilder = new StringBuilder();
          stringBuilder.append(str2);
          stringBuilder.append(".");
          stringBuilder.append(arrayOfStackTraceElement[b].getMethodName());
          String str1 = stringBuilder.toString();
          break;
        } 
        b++;
        continue;
      } 
      str = "<unknown>";
      break;
    } 
    return String.format(Locale.US, "[%d] %s: %s", new Object[] { Long.valueOf(Thread.currentThread().getId()), str, paramString });
  }
  
  public static void b(String paramString, Object... paramVarArgs) {
    Log.d("Volley", a(paramString, paramVarArgs));
  }
  
  public static void c(String paramString, Object... paramVarArgs) {
    Log.e("Volley", a(paramString, paramVarArgs));
  }
  
  public static void d(String paramString, Object... paramVarArgs) {
    if (a)
      Log.v("Volley", a(paramString, paramVarArgs)); 
  }
  
  public static class a {
    public static final boolean c = v.a;
    
    public final List<a> a = new ArrayList<a>();
    
    public boolean b = false;
    
    public void a(String param1String, long param1Long) {
      // Byte code:
      //   0: aload_0
      //   1: monitorenter
      //   2: aload_0
      //   3: getfield b : Z
      //   6: ifne -> 43
      //   9: aload_0
      //   10: getfield a : Ljava/util/List;
      //   13: astore #4
      //   15: new c/a/b/v$a$a
      //   18: astore #5
      //   20: aload #5
      //   22: aload_1
      //   23: lload_2
      //   24: invokestatic elapsedRealtime : ()J
      //   27: invokespecial <init> : (Ljava/lang/String;JJ)V
      //   30: aload #4
      //   32: aload #5
      //   34: invokeinterface add : (Ljava/lang/Object;)Z
      //   39: pop
      //   40: aload_0
      //   41: monitorexit
      //   42: return
      //   43: new java/lang/IllegalStateException
      //   46: astore_1
      //   47: aload_1
      //   48: ldc 'Marker added to finished log'
      //   50: invokespecial <init> : (Ljava/lang/String;)V
      //   53: aload_1
      //   54: athrow
      //   55: astore_1
      //   56: aload_0
      //   57: monitorexit
      //   58: aload_1
      //   59: athrow
      // Exception table:
      //   from	to	target	type
      //   2	40	55	finally
      //   43	55	55	finally
    }
    
    public void b(String param1String) {
      // Byte code:
      //   0: aload_0
      //   1: monitorenter
      //   2: aload_0
      //   3: iconst_1
      //   4: putfield b : Z
      //   7: aload_0
      //   8: getfield a : Ljava/util/List;
      //   11: invokeinterface size : ()I
      //   16: ifne -> 24
      //   19: lconst_0
      //   20: lstore_2
      //   21: goto -> 76
      //   24: aload_0
      //   25: getfield a : Ljava/util/List;
      //   28: iconst_0
      //   29: invokeinterface get : (I)Ljava/lang/Object;
      //   34: checkcast c/a/b/v$a$a
      //   37: getfield c : J
      //   40: lstore_2
      //   41: aload_0
      //   42: getfield a : Ljava/util/List;
      //   45: astore #6
      //   47: aload #6
      //   49: aload #6
      //   51: invokeinterface size : ()I
      //   56: iconst_1
      //   57: isub
      //   58: invokeinterface get : (I)Ljava/lang/Object;
      //   63: checkcast c/a/b/v$a$a
      //   66: getfield c : J
      //   69: lstore #4
      //   71: lload #4
      //   73: lload_2
      //   74: lsub
      //   75: lstore_2
      //   76: lload_2
      //   77: lconst_0
      //   78: lcmp
      //   79: ifgt -> 85
      //   82: aload_0
      //   83: monitorexit
      //   84: return
      //   85: aload_0
      //   86: getfield a : Ljava/util/List;
      //   89: iconst_0
      //   90: invokeinterface get : (I)Ljava/lang/Object;
      //   95: checkcast c/a/b/v$a$a
      //   98: getfield c : J
      //   101: lstore #4
      //   103: ldc '(%-4d ms) %s'
      //   105: iconst_2
      //   106: anewarray java/lang/Object
      //   109: dup
      //   110: iconst_0
      //   111: lload_2
      //   112: invokestatic valueOf : (J)Ljava/lang/Long;
      //   115: aastore
      //   116: dup
      //   117: iconst_1
      //   118: aload_1
      //   119: aastore
      //   120: invokestatic b : (Ljava/lang/String;[Ljava/lang/Object;)V
      //   123: aload_0
      //   124: getfield a : Ljava/util/List;
      //   127: invokeinterface iterator : ()Ljava/util/Iterator;
      //   132: astore #6
      //   134: lload #4
      //   136: lstore_2
      //   137: aload #6
      //   139: invokeinterface hasNext : ()Z
      //   144: ifeq -> 206
      //   147: aload #6
      //   149: invokeinterface next : ()Ljava/lang/Object;
      //   154: checkcast c/a/b/v$a$a
      //   157: astore_1
      //   158: aload_1
      //   159: getfield c : J
      //   162: lstore #4
      //   164: ldc '(+%-4d) [%2d] %s'
      //   166: iconst_3
      //   167: anewarray java/lang/Object
      //   170: dup
      //   171: iconst_0
      //   172: lload #4
      //   174: lload_2
      //   175: lsub
      //   176: invokestatic valueOf : (J)Ljava/lang/Long;
      //   179: aastore
      //   180: dup
      //   181: iconst_1
      //   182: aload_1
      //   183: getfield b : J
      //   186: invokestatic valueOf : (J)Ljava/lang/Long;
      //   189: aastore
      //   190: dup
      //   191: iconst_2
      //   192: aload_1
      //   193: getfield a : Ljava/lang/String;
      //   196: aastore
      //   197: invokestatic b : (Ljava/lang/String;[Ljava/lang/Object;)V
      //   200: lload #4
      //   202: lstore_2
      //   203: goto -> 137
      //   206: aload_0
      //   207: monitorexit
      //   208: return
      //   209: astore_1
      //   210: aload_0
      //   211: monitorexit
      //   212: aload_1
      //   213: athrow
      // Exception table:
      //   from	to	target	type
      //   2	19	209	finally
      //   24	71	209	finally
      //   85	134	209	finally
      //   137	200	209	finally
    }
    
    public void finalize() {
      if (!this.b) {
        b("Request on the loose");
        v.c("Marker log finalized without finish() - uncaught exit point for request", new Object[0]);
      } 
    }
    
    public static class a {
      public final String a;
      
      public final long b;
      
      public final long c;
      
      public a(String param2String, long param2Long1, long param2Long2) {
        this.a = param2String;
        this.b = param2Long1;
        this.c = param2Long2;
      }
    }
  }
  
  public static class a {
    public final String a;
    
    public final long b;
    
    public final long c;
    
    public a(String param1String, long param1Long1, long param1Long2) {
      this.a = param1String;
      this.b = param1Long1;
      this.c = param1Long2;
    }
  }
}


/* Location:              C:\Users\panch\Downloads\dvba_v1.1.0-dex2jar.jar!\c\a\b\v.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */