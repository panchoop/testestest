package c.c.b.h.c0.a;

import android.content.Context;
import c.c.a.a.c.k.c;
import c.c.a.a.c.k.k.j;
import c.c.b.d;
import java.util.concurrent.Callable;

public final class j0 implements Callable<c<t0>> {
  public final t0 a;
  
  public final Context b;
  
  public j0(t0 paramt0, Context paramContext) {
    this.a = paramt0;
    this.b = paramContext;
  }
  
  public final c<t0> a(boolean paramBoolean, Context paramContext) {
    t0 t01 = (t0)this.a.clone();
    t01.b = paramBoolean;
    return new d<t0>(paramContext, s0.c, t01, (j)new d());
  }
  
  public final Object call() {
    // Byte code:
    //   0: getstatic c/c/b/h/c0/a/i0.a : I
    //   3: istore_1
    //   4: aconst_null
    //   5: astore #5
    //   7: iload_1
    //   8: iconst_m1
    //   9: if_icmpeq -> 19
    //   12: getstatic c/c/b/h/c0/a/i0.b : I
    //   15: iconst_m1
    //   16: if_icmpne -> 456
    //   19: aload_0
    //   20: getfield b : Landroid/content/Context;
    //   23: ldc 'com.google.firebase.auth'
    //   25: invokestatic a : (Landroid/content/Context;Ljava/lang/String;)I
    //   28: istore_2
    //   29: iload_2
    //   30: ifne -> 38
    //   33: iconst_1
    //   34: istore_1
    //   35: goto -> 448
    //   38: getstatic c/c/a/a/c/d.d : Lc/c/a/a/c/d;
    //   41: aload_0
    //   42: getfield b : Landroid/content/Context;
    //   45: ldc 12451000
    //   47: invokevirtual c : (Landroid/content/Context;I)I
    //   50: istore_1
    //   51: iload_1
    //   52: ifeq -> 63
    //   55: iload_1
    //   56: iconst_2
    //   57: if_icmpeq -> 63
    //   60: goto -> 434
    //   63: aload_0
    //   64: getfield b : Landroid/content/Context;
    //   67: astore #7
    //   69: ldc com/google/android/gms/dynamite/DynamiteModule
    //   71: monitorenter
    //   72: getstatic com/google/android/gms/dynamite/DynamiteModule.a : Ljava/lang/Boolean;
    //   75: astore #6
    //   77: aload #6
    //   79: astore #4
    //   81: aload #6
    //   83: ifnonnull -> 358
    //   86: aload #7
    //   88: invokevirtual getApplicationContext : ()Landroid/content/Context;
    //   91: invokevirtual getClassLoader : ()Ljava/lang/ClassLoader;
    //   94: ldc com/google/android/gms/dynamite/DynamiteModule$DynamiteLoaderClassLoader
    //   96: invokevirtual getName : ()Ljava/lang/String;
    //   99: invokevirtual loadClass : (Ljava/lang/String;)Ljava/lang/Class;
    //   102: astore #6
    //   104: aload #6
    //   106: ldc 'sClassLoader'
    //   108: invokevirtual getDeclaredField : (Ljava/lang/String;)Ljava/lang/reflect/Field;
    //   111: astore #4
    //   113: aload #6
    //   115: monitorenter
    //   116: aload #4
    //   118: aconst_null
    //   119: invokevirtual get : (Ljava/lang/Object;)Ljava/lang/Object;
    //   122: checkcast java/lang/ClassLoader
    //   125: astore #8
    //   127: aload #8
    //   129: ifnull -> 160
    //   132: invokestatic getSystemClassLoader : ()Ljava/lang/ClassLoader;
    //   135: astore #4
    //   137: aload #8
    //   139: aload #4
    //   141: if_acmpne -> 147
    //   144: goto -> 263
    //   147: aload #8
    //   149: invokestatic b : (Ljava/lang/ClassLoader;)V
    //   152: getstatic java/lang/Boolean.TRUE : Ljava/lang/Boolean;
    //   155: astore #4
    //   157: goto -> 268
    //   160: ldc 'com.google.android.gms'
    //   162: aload #7
    //   164: invokevirtual getApplicationContext : ()Landroid/content/Context;
    //   167: invokevirtual getPackageName : ()Ljava/lang/String;
    //   170: invokevirtual equals : (Ljava/lang/Object;)Z
    //   173: ifeq -> 184
    //   176: invokestatic getSystemClassLoader : ()Ljava/lang/ClassLoader;
    //   179: astore #8
    //   181: goto -> 255
    //   184: aload #7
    //   186: ldc 'com.google.android.gms.firebase_auth'
    //   188: iconst_0
    //   189: invokestatic d : (Landroid/content/Context;Ljava/lang/String;Z)I
    //   192: istore_1
    //   193: getstatic com/google/android/gms/dynamite/DynamiteModule.c : Ljava/lang/String;
    //   196: ifnull -> 246
    //   199: getstatic com/google/android/gms/dynamite/DynamiteModule.c : Ljava/lang/String;
    //   202: invokevirtual isEmpty : ()Z
    //   205: ifeq -> 211
    //   208: goto -> 246
    //   211: new c/c/a/a/e/b
    //   214: astore #8
    //   216: aload #8
    //   218: getstatic com/google/android/gms/dynamite/DynamiteModule.c : Ljava/lang/String;
    //   221: invokestatic getSystemClassLoader : ()Ljava/lang/ClassLoader;
    //   224: invokespecial <init> : (Ljava/lang/String;Ljava/lang/ClassLoader;)V
    //   227: aload #8
    //   229: invokestatic b : (Ljava/lang/ClassLoader;)V
    //   232: aload #4
    //   234: aconst_null
    //   235: aload #8
    //   237: invokevirtual set : (Ljava/lang/Object;Ljava/lang/Object;)V
    //   240: getstatic java/lang/Boolean.TRUE : Ljava/lang/Boolean;
    //   243: putstatic com/google/android/gms/dynamite/DynamiteModule.a : Ljava/lang/Boolean;
    //   246: aload #6
    //   248: monitorexit
    //   249: ldc com/google/android/gms/dynamite/DynamiteModule
    //   251: monitorexit
    //   252: goto -> 448
    //   255: aload #4
    //   257: aconst_null
    //   258: aload #8
    //   260: invokevirtual set : (Ljava/lang/Object;Ljava/lang/Object;)V
    //   263: getstatic java/lang/Boolean.FALSE : Ljava/lang/Boolean;
    //   266: astore #4
    //   268: aload #6
    //   270: monitorexit
    //   271: goto -> 353
    //   274: astore #4
    //   276: aload #6
    //   278: monitorexit
    //   279: aload #4
    //   281: athrow
    //   282: astore #4
    //   284: goto -> 294
    //   287: astore #4
    //   289: goto -> 294
    //   292: astore #4
    //   294: aload #4
    //   296: invokestatic valueOf : (Ljava/lang/Object;)Ljava/lang/String;
    //   299: astore #6
    //   301: aload #6
    //   303: invokevirtual length : ()I
    //   306: istore_1
    //   307: new java/lang/StringBuilder
    //   310: astore #4
    //   312: aload #4
    //   314: iload_1
    //   315: bipush #30
    //   317: iadd
    //   318: invokespecial <init> : (I)V
    //   321: aload #4
    //   323: ldc 'Failed to load module via V2: '
    //   325: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   328: pop
    //   329: aload #4
    //   331: aload #6
    //   333: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   336: pop
    //   337: ldc 'DynamiteModule'
    //   339: aload #4
    //   341: invokevirtual toString : ()Ljava/lang/String;
    //   344: invokestatic w : (Ljava/lang/String;Ljava/lang/String;)I
    //   347: pop
    //   348: getstatic java/lang/Boolean.FALSE : Ljava/lang/Boolean;
    //   351: astore #4
    //   353: aload #4
    //   355: putstatic com/google/android/gms/dynamite/DynamiteModule.a : Ljava/lang/Boolean;
    //   358: ldc com/google/android/gms/dynamite/DynamiteModule
    //   360: monitorexit
    //   361: aload #4
    //   363: invokevirtual booleanValue : ()Z
    //   366: istore_3
    //   367: iload_3
    //   368: ifeq -> 439
    //   371: aload #7
    //   373: ldc 'com.google.android.gms.firebase_auth'
    //   375: iconst_0
    //   376: invokestatic d : (Landroid/content/Context;Ljava/lang/String;Z)I
    //   379: istore_1
    //   380: goto -> 448
    //   383: astore #4
    //   385: aload #4
    //   387: invokevirtual getMessage : ()Ljava/lang/String;
    //   390: invokestatic valueOf : (Ljava/lang/Object;)Ljava/lang/String;
    //   393: astore #4
    //   395: aload #4
    //   397: invokevirtual length : ()I
    //   400: ifeq -> 415
    //   403: ldc 'Failed to retrieve remote module version: '
    //   405: aload #4
    //   407: invokevirtual concat : (Ljava/lang/String;)Ljava/lang/String;
    //   410: astore #4
    //   412: goto -> 426
    //   415: new java/lang/String
    //   418: dup
    //   419: ldc 'Failed to retrieve remote module version: '
    //   421: invokespecial <init> : (Ljava/lang/String;)V
    //   424: astore #4
    //   426: ldc 'DynamiteModule'
    //   428: aload #4
    //   430: invokestatic w : (Ljava/lang/String;Ljava/lang/String;)I
    //   433: pop
    //   434: iconst_0
    //   435: istore_1
    //   436: goto -> 448
    //   439: aload #7
    //   441: ldc 'com.google.android.gms.firebase_auth'
    //   443: iconst_0
    //   444: invokestatic c : (Landroid/content/Context;Ljava/lang/String;Z)I
    //   447: istore_1
    //   448: iload_1
    //   449: putstatic c/c/b/h/c0/a/i0.a : I
    //   452: iload_2
    //   453: putstatic c/c/b/h/c0/a/i0.b : I
    //   456: getstatic c/c/b/h/c0/a/i0.b : I
    //   459: ifeq -> 476
    //   462: aload_0
    //   463: iconst_1
    //   464: aload_0
    //   465: getfield b : Landroid/content/Context;
    //   468: invokevirtual a : (ZLandroid/content/Context;)Lc/c/a/a/c/k/c;
    //   471: astore #4
    //   473: goto -> 479
    //   476: aconst_null
    //   477: astore #4
    //   479: getstatic c/c/b/h/c0/a/i0.a : I
    //   482: ifne -> 488
    //   485: goto -> 499
    //   488: aload_0
    //   489: iconst_0
    //   490: aload_0
    //   491: getfield b : Landroid/content/Context;
    //   494: invokevirtual a : (ZLandroid/content/Context;)Lc/c/a/a/c/k/c;
    //   497: astore #5
    //   499: new c/c/b/h/c0/a/c
    //   502: dup
    //   503: aload #5
    //   505: aload #4
    //   507: new c/c/b/h/c0/a/e
    //   510: dup
    //   511: getstatic c/c/b/h/c0/a/i0.a : I
    //   514: getstatic c/c/b/h/c0/a/i0.b : I
    //   517: invokestatic emptyMap : ()Ljava/util/Map;
    //   520: invokespecial <init> : (IILjava/util/Map;)V
    //   523: invokespecial <init> : (Lc/c/a/a/c/k/c;Lc/c/a/a/c/k/c;Lc/c/b/h/c0/a/e;)V
    //   526: areturn
    //   527: astore #4
    //   529: ldc com/google/android/gms/dynamite/DynamiteModule
    //   531: monitorexit
    //   532: aload #4
    //   534: athrow
    //   535: astore #4
    //   537: aload #7
    //   539: invokestatic f : (Ljava/lang/Object;)Ljava/lang/Object;
    //   542: pop
    //   543: aload #4
    //   545: invokestatic f : (Ljava/lang/Object;)Ljava/lang/Object;
    //   548: pop
    //   549: goto -> 564
    //   552: astore #5
    //   554: ldc 'CrashUtils'
    //   556: ldc 'Error adding exception to DropBox!'
    //   558: aload #5
    //   560: invokestatic e : (Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I
    //   563: pop
    //   564: aload #4
    //   566: athrow
    //   567: astore #4
    //   569: goto -> 152
    //   572: astore #8
    //   574: goto -> 176
    // Exception table:
    //   from	to	target	type
    //   69	72	535	finally
    //   72	77	527	finally
    //   86	116	292	java/lang/ClassNotFoundException
    //   86	116	287	java/lang/IllegalAccessException
    //   86	116	282	java/lang/NoSuchFieldException
    //   86	116	527	finally
    //   116	127	274	finally
    //   132	137	274	finally
    //   147	152	567	com/google/android/gms/dynamite/DynamiteModule$a
    //   147	152	274	finally
    //   152	157	274	finally
    //   160	176	274	finally
    //   176	181	274	finally
    //   184	208	572	com/google/android/gms/dynamite/DynamiteModule$a
    //   184	208	274	finally
    //   211	246	572	com/google/android/gms/dynamite/DynamiteModule$a
    //   211	246	274	finally
    //   246	249	274	finally
    //   249	252	527	finally
    //   255	263	274	finally
    //   263	268	274	finally
    //   268	271	274	finally
    //   276	279	274	finally
    //   279	282	292	java/lang/ClassNotFoundException
    //   279	282	287	java/lang/IllegalAccessException
    //   279	282	282	java/lang/NoSuchFieldException
    //   279	282	527	finally
    //   294	353	527	finally
    //   353	358	527	finally
    //   358	361	527	finally
    //   361	367	535	finally
    //   371	380	383	com/google/android/gms/dynamite/DynamiteModule$a
    //   371	380	535	finally
    //   385	412	535	finally
    //   415	426	535	finally
    //   426	434	535	finally
    //   439	448	535	finally
    //   529	532	527	finally
    //   532	535	535	finally
    //   537	549	552	java/lang/Exception
  }
}


/* Location:              C:\Users\panch\Downloads\dvba_v1.1.0-dex2jar.jar!\c\c\b\h\c0\a\j0.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */