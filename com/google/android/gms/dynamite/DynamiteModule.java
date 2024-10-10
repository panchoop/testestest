package com.google.android.gms.dynamite;

import android.content.Context;
import android.database.Cursor;
import android.os.IBinder;
import android.os.IInterface;
import android.util.Log;
import c.c.a.a.e.c;
import c.c.a.a.e.e;
import com.google.android.gms.common.util.DynamiteApi;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import javax.annotation.concurrent.GuardedBy;

public final class DynamiteModule {
  @GuardedBy("DynamiteModule.class")
  public static Boolean a;
  
  @GuardedBy("DynamiteModule.class")
  public static c b;
  
  @GuardedBy("DynamiteModule.class")
  public static String c;
  
  public static final ThreadLocal<b> d = new ThreadLocal<b>();
  
  public static int a(Context paramContext, String paramString) {
    try {
      StringBuilder stringBuilder2;
      ClassLoader classLoader = paramContext.getApplicationContext().getClassLoader();
      null = paramString.length();
      StringBuilder stringBuilder1 = new StringBuilder();
      this(null + 61);
      stringBuilder1.append("com.google.android.gms.dynamite.descriptors.");
      stringBuilder1.append(paramString);
      stringBuilder1.append(".ModuleDescriptor");
      Class<?> clazz = classLoader.loadClass(stringBuilder1.toString());
      Field field1 = clazz.getDeclaredField("MODULE_ID");
      Field field2 = clazz.getDeclaredField("MODULE_VERSION");
      if (!field1.get(null).equals(paramString)) {
        String str = String.valueOf(field1.get(null));
        null = str.length();
        int i = paramString.length();
        stringBuilder2 = new StringBuilder();
        this(null + 51 + i);
        stringBuilder2.append("Module descriptor id '");
        stringBuilder2.append(str);
        stringBuilder2.append("' didn't match expected id '");
        stringBuilder2.append(paramString);
        stringBuilder2.append("'");
        Log.e("DynamiteModule", stringBuilder2.toString());
        return 0;
      } 
      return stringBuilder2.getInt(null);
    } catch (ClassNotFoundException classNotFoundException) {
      StringBuilder stringBuilder = new StringBuilder(paramString.length() + 45);
      stringBuilder.append("Local module descriptor class for ");
      stringBuilder.append(paramString);
      stringBuilder.append(" not found.");
      Log.w("DynamiteModule", stringBuilder.toString());
    } catch (Exception exception) {
      String str = String.valueOf(exception.getMessage());
      if (str.length() != 0) {
        str = "Failed to load module descriptor class: ".concat(str);
      } else {
        str = new String("Failed to load module descriptor class: ");
      } 
      Log.e("DynamiteModule", str);
    } 
    return 0;
  }
  
  @GuardedBy("DynamiteModule.class")
  public static void b(ClassLoader paramClassLoader) {
    try {
      IBinder iBinder = paramClassLoader.loadClass("com.google.android.gms.dynamiteloader.DynamiteLoaderV2").getConstructor(new Class[0]).newInstance(new Object[0]);
      if (iBinder != null) {
        IInterface iInterface = iBinder.queryLocalInterface("com.google.android.gms.dynamite.IDynamiteLoaderV2");
        if (iInterface instanceof e)
          e e = (e)iInterface; 
      } 
      return;
    } catch (ClassNotFoundException classNotFoundException) {
    
    } catch (IllegalAccessException illegalAccessException) {
    
    } catch (InstantiationException instantiationException) {
    
    } catch (InvocationTargetException invocationTargetException) {
    
    } catch (NoSuchMethodException noSuchMethodException) {}
    throw new a("Failed to instantiate dynamite loader", noSuchMethodException, null);
  }
  
  public static int c(Context paramContext, String paramString, boolean paramBoolean) {
    // Byte code:
    //   0: ldc com/google/android/gms/dynamite/DynamiteModule
    //   2: monitorenter
    //   3: getstatic com/google/android/gms/dynamite/DynamiteModule.b : Lc/c/a/a/e/c;
    //   6: ifnull -> 20
    //   9: getstatic com/google/android/gms/dynamite/DynamiteModule.b : Lc/c/a/a/e/c;
    //   12: astore #4
    //   14: ldc com/google/android/gms/dynamite/DynamiteModule
    //   16: monitorexit
    //   17: goto -> 180
    //   20: getstatic c/c/a/a/c/e.b : Lc/c/a/a/c/e;
    //   23: aload_0
    //   24: invokevirtual b : (Landroid/content/Context;)I
    //   27: ifeq -> 39
    //   30: ldc com/google/android/gms/dynamite/DynamiteModule
    //   32: monitorexit
    //   33: aconst_null
    //   34: astore #4
    //   36: goto -> 180
    //   39: aload_0
    //   40: ldc 'com.google.android.gms'
    //   42: iconst_3
    //   43: invokevirtual createPackageContext : (Ljava/lang/String;I)Landroid/content/Context;
    //   46: invokevirtual getClassLoader : ()Ljava/lang/ClassLoader;
    //   49: ldc 'com.google.android.gms.chimera.container.DynamiteLoaderImpl'
    //   51: invokevirtual loadClass : (Ljava/lang/String;)Ljava/lang/Class;
    //   54: invokevirtual newInstance : ()Ljava/lang/Object;
    //   57: checkcast android/os/IBinder
    //   60: astore #4
    //   62: aload #4
    //   64: ifnonnull -> 73
    //   67: aconst_null
    //   68: astore #4
    //   70: goto -> 113
    //   73: aload #4
    //   75: ldc 'com.google.android.gms.dynamite.IDynamiteLoader'
    //   77: invokeinterface queryLocalInterface : (Ljava/lang/String;)Landroid/os/IInterface;
    //   82: astore #5
    //   84: aload #5
    //   86: instanceof c/c/a/a/e/c
    //   89: ifeq -> 102
    //   92: aload #5
    //   94: checkcast c/c/a/a/e/c
    //   97: astore #4
    //   99: goto -> 113
    //   102: new c/c/a/a/e/d
    //   105: dup
    //   106: aload #4
    //   108: invokespecial <init> : (Landroid/os/IBinder;)V
    //   111: astore #4
    //   113: aload #4
    //   115: ifnull -> 30
    //   118: aload #4
    //   120: putstatic com/google/android/gms/dynamite/DynamiteModule.b : Lc/c/a/a/e/c;
    //   123: goto -> 14
    //   126: astore #4
    //   128: aload #4
    //   130: invokevirtual getMessage : ()Ljava/lang/String;
    //   133: invokestatic valueOf : (Ljava/lang/Object;)Ljava/lang/String;
    //   136: astore #4
    //   138: aload #4
    //   140: invokevirtual length : ()I
    //   143: ifeq -> 158
    //   146: ldc 'Failed to load IDynamiteLoader from GmsCore: '
    //   148: aload #4
    //   150: invokevirtual concat : (Ljava/lang/String;)Ljava/lang/String;
    //   153: astore #4
    //   155: goto -> 169
    //   158: new java/lang/String
    //   161: dup
    //   162: ldc 'Failed to load IDynamiteLoader from GmsCore: '
    //   164: invokespecial <init> : (Ljava/lang/String;)V
    //   167: astore #4
    //   169: ldc 'DynamiteModule'
    //   171: aload #4
    //   173: invokestatic e : (Ljava/lang/String;Ljava/lang/String;)I
    //   176: pop
    //   177: goto -> 30
    //   180: aload #4
    //   182: ifnonnull -> 187
    //   185: iconst_0
    //   186: ireturn
    //   187: aload #4
    //   189: invokeinterface g : ()I
    //   194: iconst_2
    //   195: if_icmplt -> 221
    //   198: new c/c/a/a/d/b
    //   201: astore #5
    //   203: aload #5
    //   205: aload_0
    //   206: invokespecial <init> : (Ljava/lang/Object;)V
    //   209: aload #4
    //   211: aload #5
    //   213: aload_1
    //   214: iload_2
    //   215: invokeinterface d : (Lc/c/a/a/d/a;Ljava/lang/String;Z)I
    //   220: ireturn
    //   221: ldc 'DynamiteModule'
    //   223: ldc 'IDynamite loader version < 2, falling back to getModuleVersion2'
    //   225: invokestatic w : (Ljava/lang/String;Ljava/lang/String;)I
    //   228: pop
    //   229: new c/c/a/a/d/b
    //   232: astore #5
    //   234: aload #5
    //   236: aload_0
    //   237: invokespecial <init> : (Ljava/lang/Object;)V
    //   240: aload #4
    //   242: aload #5
    //   244: aload_1
    //   245: iload_2
    //   246: invokeinterface f : (Lc/c/a/a/d/a;Ljava/lang/String;Z)I
    //   251: istore_3
    //   252: iload_3
    //   253: ireturn
    //   254: astore_0
    //   255: aload_0
    //   256: invokevirtual getMessage : ()Ljava/lang/String;
    //   259: invokestatic valueOf : (Ljava/lang/Object;)Ljava/lang/String;
    //   262: astore_0
    //   263: aload_0
    //   264: invokevirtual length : ()I
    //   267: ifeq -> 280
    //   270: ldc 'Failed to retrieve remote module version: '
    //   272: aload_0
    //   273: invokevirtual concat : (Ljava/lang/String;)Ljava/lang/String;
    //   276: astore_0
    //   277: goto -> 290
    //   280: new java/lang/String
    //   283: dup
    //   284: ldc 'Failed to retrieve remote module version: '
    //   286: invokespecial <init> : (Ljava/lang/String;)V
    //   289: astore_0
    //   290: ldc 'DynamiteModule'
    //   292: aload_0
    //   293: invokestatic w : (Ljava/lang/String;Ljava/lang/String;)I
    //   296: pop
    //   297: iconst_0
    //   298: ireturn
    //   299: astore_0
    //   300: ldc com/google/android/gms/dynamite/DynamiteModule
    //   302: monitorexit
    //   303: aload_0
    //   304: athrow
    // Exception table:
    //   from	to	target	type
    //   3	14	299	finally
    //   14	17	299	finally
    //   20	30	299	finally
    //   30	33	299	finally
    //   39	62	126	java/lang/Exception
    //   39	62	299	finally
    //   73	99	126	java/lang/Exception
    //   73	99	299	finally
    //   102	113	126	java/lang/Exception
    //   102	113	299	finally
    //   118	123	126	java/lang/Exception
    //   118	123	299	finally
    //   128	155	299	finally
    //   158	169	299	finally
    //   169	177	299	finally
    //   187	221	254	android/os/RemoteException
    //   221	252	254	android/os/RemoteException
    //   300	303	299	finally
  }
  
  public static int d(Context paramContext, String paramString, boolean paramBoolean) {
    // Byte code:
    //   0: aconst_null
    //   1: astore #5
    //   3: aconst_null
    //   4: astore #6
    //   6: aload_0
    //   7: invokevirtual getContentResolver : ()Landroid/content/ContentResolver;
    //   10: astore #7
    //   12: iload_2
    //   13: ifeq -> 22
    //   16: ldc 'api_force_staging'
    //   18: astore_0
    //   19: goto -> 25
    //   22: ldc 'api'
    //   24: astore_0
    //   25: aload_0
    //   26: invokevirtual length : ()I
    //   29: istore_3
    //   30: aload_1
    //   31: invokestatic valueOf : (Ljava/lang/Object;)Ljava/lang/String;
    //   34: invokevirtual length : ()I
    //   37: istore #4
    //   39: new java/lang/StringBuilder
    //   42: astore #8
    //   44: aload #8
    //   46: iload_3
    //   47: bipush #42
    //   49: iadd
    //   50: iload #4
    //   52: iadd
    //   53: invokespecial <init> : (I)V
    //   56: aload #8
    //   58: ldc 'content://com.google.android.gms.chimera/'
    //   60: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   63: pop
    //   64: aload #8
    //   66: aload_0
    //   67: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   70: pop
    //   71: aload #8
    //   73: ldc '/'
    //   75: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   78: pop
    //   79: aload #8
    //   81: aload_1
    //   82: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   85: pop
    //   86: aload #7
    //   88: aload #8
    //   90: invokevirtual toString : ()Ljava/lang/String;
    //   93: invokestatic parse : (Ljava/lang/String;)Landroid/net/Uri;
    //   96: aconst_null
    //   97: aconst_null
    //   98: aconst_null
    //   99: aconst_null
    //   100: invokevirtual query : (Landroid/net/Uri;[Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;)Landroid/database/Cursor;
    //   103: astore_1
    //   104: aload_1
    //   105: ifnull -> 240
    //   108: aload_1
    //   109: astore_0
    //   110: aload_1
    //   111: invokeinterface moveToFirst : ()Z
    //   116: ifeq -> 240
    //   119: aload_1
    //   120: astore_0
    //   121: aload_1
    //   122: iconst_0
    //   123: invokeinterface getInt : (I)I
    //   128: istore_3
    //   129: iload_3
    //   130: ifle -> 228
    //   133: aload_1
    //   134: astore_0
    //   135: ldc com/google/android/gms/dynamite/DynamiteModule
    //   137: monitorenter
    //   138: aload_1
    //   139: iconst_2
    //   140: invokeinterface getString : (I)Ljava/lang/String;
    //   145: putstatic com/google/android/gms/dynamite/DynamiteModule.c : Ljava/lang/String;
    //   148: aload_1
    //   149: ldc_w 'loaderVersion'
    //   152: invokeinterface getColumnIndex : (Ljava/lang/String;)I
    //   157: istore #4
    //   159: iload #4
    //   161: iflt -> 173
    //   164: aload_1
    //   165: iload #4
    //   167: invokeinterface getInt : (I)I
    //   172: pop
    //   173: ldc com/google/android/gms/dynamite/DynamiteModule
    //   175: monitorexit
    //   176: aload_1
    //   177: astore_0
    //   178: getstatic com/google/android/gms/dynamite/DynamiteModule.d : Ljava/lang/ThreadLocal;
    //   181: invokevirtual get : ()Ljava/lang/Object;
    //   184: checkcast com/google/android/gms/dynamite/DynamiteModule$b
    //   187: astore #5
    //   189: aload #5
    //   191: ifnull -> 228
    //   194: aload_1
    //   195: astore_0
    //   196: aload #5
    //   198: getfield a : Landroid/database/Cursor;
    //   201: ifnonnull -> 228
    //   204: aload_1
    //   205: astore_0
    //   206: aload #5
    //   208: aload_1
    //   209: putfield a : Landroid/database/Cursor;
    //   212: aload #6
    //   214: astore_1
    //   215: goto -> 228
    //   218: astore #5
    //   220: ldc com/google/android/gms/dynamite/DynamiteModule
    //   222: monitorexit
    //   223: aload_1
    //   224: astore_0
    //   225: aload #5
    //   227: athrow
    //   228: aload_1
    //   229: ifnull -> 238
    //   232: aload_1
    //   233: invokeinterface close : ()V
    //   238: iload_3
    //   239: ireturn
    //   240: aload_1
    //   241: astore_0
    //   242: ldc 'DynamiteModule'
    //   244: ldc_w 'Failed to retrieve remote module version.'
    //   247: invokestatic w : (Ljava/lang/String;Ljava/lang/String;)I
    //   250: pop
    //   251: aload_1
    //   252: astore_0
    //   253: new com/google/android/gms/dynamite/DynamiteModule$a
    //   256: astore #5
    //   258: aload_1
    //   259: astore_0
    //   260: aload #5
    //   262: ldc_w 'Failed to connect to dynamite module ContentResolver.'
    //   265: aconst_null
    //   266: invokespecial <init> : (Ljava/lang/String;Lc/c/a/a/e/a;)V
    //   269: aload_1
    //   270: astore_0
    //   271: aload #5
    //   273: athrow
    //   274: astore #5
    //   276: goto -> 290
    //   279: astore_1
    //   280: aload #5
    //   282: astore_0
    //   283: goto -> 331
    //   286: astore #5
    //   288: aconst_null
    //   289: astore_1
    //   290: aload_1
    //   291: astore_0
    //   292: aload #5
    //   294: instanceof com/google/android/gms/dynamite/DynamiteModule$a
    //   297: ifeq -> 305
    //   300: aload_1
    //   301: astore_0
    //   302: aload #5
    //   304: athrow
    //   305: aload_1
    //   306: astore_0
    //   307: new com/google/android/gms/dynamite/DynamiteModule$a
    //   310: astore #6
    //   312: aload_1
    //   313: astore_0
    //   314: aload #6
    //   316: ldc_w 'V2 version check failed'
    //   319: aload #5
    //   321: aconst_null
    //   322: invokespecial <init> : (Ljava/lang/String;Ljava/lang/Throwable;Lc/c/a/a/e/a;)V
    //   325: aload_1
    //   326: astore_0
    //   327: aload #6
    //   329: athrow
    //   330: astore_1
    //   331: aload_0
    //   332: ifnull -> 341
    //   335: aload_0
    //   336: invokeinterface close : ()V
    //   341: aload_1
    //   342: athrow
    // Exception table:
    //   from	to	target	type
    //   6	12	286	java/lang/Exception
    //   6	12	279	finally
    //   25	104	286	java/lang/Exception
    //   25	104	279	finally
    //   110	119	274	java/lang/Exception
    //   110	119	330	finally
    //   121	129	274	java/lang/Exception
    //   121	129	330	finally
    //   135	138	274	java/lang/Exception
    //   135	138	330	finally
    //   138	159	218	finally
    //   164	173	218	finally
    //   173	176	218	finally
    //   178	189	274	java/lang/Exception
    //   178	189	330	finally
    //   196	204	274	java/lang/Exception
    //   196	204	330	finally
    //   206	212	274	java/lang/Exception
    //   206	212	330	finally
    //   220	223	218	finally
    //   225	228	274	java/lang/Exception
    //   225	228	330	finally
    //   242	251	274	java/lang/Exception
    //   242	251	330	finally
    //   253	258	274	java/lang/Exception
    //   253	258	330	finally
    //   260	269	274	java/lang/Exception
    //   260	269	330	finally
    //   271	274	274	java/lang/Exception
    //   271	274	330	finally
    //   292	300	330	finally
    //   302	305	330	finally
    //   307	312	330	finally
    //   314	325	330	finally
    //   327	330	330	finally
  }
  
  @DynamiteApi
  public static class DynamiteLoaderClassLoader {
    @GuardedBy("DynamiteLoaderClassLoader.class")
    public static ClassLoader sClassLoader;
  }
  
  public static class a extends Exception {
    public a(String param1String, c.c.a.a.e.a param1a) {
      super(param1String);
    }
    
    public a(String param1String, Throwable param1Throwable, c.c.a.a.e.a param1a) {
      super(param1String, param1Throwable);
    }
  }
  
  public static final class b {
    public Cursor a;
  }
}


/* Location:              C:\Users\panch\Downloads\dvba_v1.1.0-dex2jar.jar!\com\google\android\gms\dynamite\DynamiteModule.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */