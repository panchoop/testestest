package b.n;

import androidx.lifecycle.CompositeGeneratedAdaptersObserver;
import androidx.lifecycle.FullLifecycleObserverAdapter;
import androidx.lifecycle.ReflectiveGenericLifecycleObserver;
import androidx.lifecycle.SingleGeneratedAdapterObserver;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class j {
  public static Map<Class, Integer> a = (Map)new HashMap<Class<?>, Integer>();
  
  public static Map<Class, List<Constructor<? extends c>>> b = (Map)new HashMap<Class<?>, List<Constructor<? extends c>>>();
  
  public static c a(Constructor<? extends c> paramConstructor, Object paramObject) {
    try {
      return paramConstructor.newInstance(new Object[] { paramObject });
    } catch (IllegalAccessException illegalAccessException) {
      throw new RuntimeException(illegalAccessException);
    } catch (InstantiationException instantiationException) {
      throw new RuntimeException(instantiationException);
    } catch (InvocationTargetException invocationTargetException) {
      throw new RuntimeException(invocationTargetException);
    } 
  }
  
  public static String b(String paramString) {
    StringBuilder stringBuilder = new StringBuilder();
    stringBuilder.append(paramString.replace(".", "_"));
    stringBuilder.append("_LifecycleAdapter");
    return stringBuilder.toString();
  }
  
  public static int c(Class<?> paramClass) {
    // Byte code:
    //   0: getstatic b/n/j.a : Ljava/util/Map;
    //   3: aload_0
    //   4: invokeinterface get : (Ljava/lang/Object;)Ljava/lang/Object;
    //   9: checkcast java/lang/Integer
    //   12: astore #6
    //   14: aload #6
    //   16: ifnull -> 25
    //   19: aload #6
    //   21: invokevirtual intValue : ()I
    //   24: ireturn
    //   25: aload_0
    //   26: invokevirtual getCanonicalName : ()Ljava/lang/String;
    //   29: astore #6
    //   31: iconst_1
    //   32: istore_3
    //   33: aload #6
    //   35: ifnonnull -> 43
    //   38: iload_3
    //   39: istore_1
    //   40: goto -> 574
    //   43: aconst_null
    //   44: astore #8
    //   46: aload_0
    //   47: invokevirtual getPackage : ()Ljava/lang/Package;
    //   50: astore #6
    //   52: aload_0
    //   53: invokevirtual getCanonicalName : ()Ljava/lang/String;
    //   56: astore #7
    //   58: aload #6
    //   60: ifnull -> 73
    //   63: aload #6
    //   65: invokevirtual getName : ()Ljava/lang/String;
    //   68: astore #6
    //   70: goto -> 77
    //   73: ldc ''
    //   75: astore #6
    //   77: aload #6
    //   79: invokevirtual isEmpty : ()Z
    //   82: ifeq -> 88
    //   85: goto -> 102
    //   88: aload #7
    //   90: aload #6
    //   92: invokevirtual length : ()I
    //   95: iconst_1
    //   96: iadd
    //   97: invokevirtual substring : (I)Ljava/lang/String;
    //   100: astore #7
    //   102: aload #7
    //   104: invokestatic b : (Ljava/lang/String;)Ljava/lang/String;
    //   107: astore #7
    //   109: aload #6
    //   111: invokevirtual isEmpty : ()Z
    //   114: ifeq -> 124
    //   117: aload #7
    //   119: astore #6
    //   121: goto -> 165
    //   124: new java/lang/StringBuilder
    //   127: astore #9
    //   129: aload #9
    //   131: invokespecial <init> : ()V
    //   134: aload #9
    //   136: aload #6
    //   138: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   141: pop
    //   142: aload #9
    //   144: ldc '.'
    //   146: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   149: pop
    //   150: aload #9
    //   152: aload #7
    //   154: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   157: pop
    //   158: aload #9
    //   160: invokevirtual toString : ()Ljava/lang/String;
    //   163: astore #6
    //   165: aload #6
    //   167: invokestatic forName : (Ljava/lang/String;)Ljava/lang/Class;
    //   170: iconst_1
    //   171: anewarray java/lang/Class
    //   174: dup
    //   175: iconst_0
    //   176: aload_0
    //   177: aastore
    //   178: invokevirtual getDeclaredConstructor : ([Ljava/lang/Class;)Ljava/lang/reflect/Constructor;
    //   181: astore #7
    //   183: aload #7
    //   185: astore #6
    //   187: aload #7
    //   189: invokevirtual isAccessible : ()Z
    //   192: ifne -> 223
    //   195: aload #7
    //   197: iconst_1
    //   198: invokevirtual setAccessible : (Z)V
    //   201: aload #7
    //   203: astore #6
    //   205: goto -> 223
    //   208: astore_0
    //   209: new java/lang/RuntimeException
    //   212: dup
    //   213: aload_0
    //   214: invokespecial <init> : (Ljava/lang/Throwable;)V
    //   217: athrow
    //   218: astore #6
    //   220: aconst_null
    //   221: astore #6
    //   223: aload #6
    //   225: ifnull -> 243
    //   228: getstatic b/n/j.b : Ljava/util/Map;
    //   231: astore #7
    //   233: aload #6
    //   235: invokestatic singletonList : (Ljava/lang/Object;)Ljava/util/List;
    //   238: astore #6
    //   240: goto -> 561
    //   243: getstatic b/n/a.c : Lb/n/a;
    //   246: astore #6
    //   248: aload #6
    //   250: getfield b : Ljava/util/Map;
    //   253: aload_0
    //   254: invokeinterface get : (Ljava/lang/Object;)Ljava/lang/Object;
    //   259: checkcast java/lang/Boolean
    //   262: astore #7
    //   264: aload #7
    //   266: ifnull -> 279
    //   269: aload #7
    //   271: invokevirtual booleanValue : ()Z
    //   274: istore #5
    //   276: goto -> 350
    //   279: aload_0
    //   280: invokevirtual getDeclaredMethods : ()[Ljava/lang/reflect/Method;
    //   283: astore #7
    //   285: aload #7
    //   287: arraylength
    //   288: istore_2
    //   289: iconst_0
    //   290: istore_1
    //   291: iload_1
    //   292: iload_2
    //   293: if_icmpge -> 332
    //   296: aload #7
    //   298: iload_1
    //   299: aaload
    //   300: ldc b/n/n
    //   302: invokevirtual getAnnotation : (Ljava/lang/Class;)Ljava/lang/annotation/Annotation;
    //   305: checkcast b/n/n
    //   308: ifnull -> 326
    //   311: aload #6
    //   313: aload_0
    //   314: aload #7
    //   316: invokevirtual a : (Ljava/lang/Class;[Ljava/lang/reflect/Method;)Lb/n/a$a;
    //   319: pop
    //   320: iconst_1
    //   321: istore #5
    //   323: goto -> 350
    //   326: iinc #1, 1
    //   329: goto -> 291
    //   332: aload #6
    //   334: getfield b : Ljava/util/Map;
    //   337: aload_0
    //   338: getstatic java/lang/Boolean.FALSE : Ljava/lang/Boolean;
    //   341: invokeinterface put : (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    //   346: pop
    //   347: iconst_0
    //   348: istore #5
    //   350: iload #5
    //   352: ifeq -> 360
    //   355: iload_3
    //   356: istore_1
    //   357: goto -> 574
    //   360: aload_0
    //   361: invokevirtual getSuperclass : ()Ljava/lang/Class;
    //   364: astore #7
    //   366: aload #7
    //   368: ifnull -> 386
    //   371: ldc b/n/f
    //   373: aload #7
    //   375: invokevirtual isAssignableFrom : (Ljava/lang/Class;)Z
    //   378: ifeq -> 386
    //   381: iconst_1
    //   382: istore_1
    //   383: goto -> 388
    //   386: iconst_0
    //   387: istore_1
    //   388: aload #8
    //   390: astore #6
    //   392: iload_1
    //   393: ifeq -> 432
    //   396: aload #7
    //   398: invokestatic c : (Ljava/lang/Class;)I
    //   401: iconst_1
    //   402: if_icmpne -> 410
    //   405: iload_3
    //   406: istore_1
    //   407: goto -> 574
    //   410: new java/util/ArrayList
    //   413: dup
    //   414: getstatic b/n/j.b : Ljava/util/Map;
    //   417: aload #7
    //   419: invokeinterface get : (Ljava/lang/Object;)Ljava/lang/Object;
    //   424: checkcast java/util/Collection
    //   427: invokespecial <init> : (Ljava/util/Collection;)V
    //   430: astore #6
    //   432: aload_0
    //   433: invokevirtual getInterfaces : ()[Ljava/lang/Class;
    //   436: astore #8
    //   438: aload #8
    //   440: arraylength
    //   441: istore #4
    //   443: iconst_0
    //   444: istore_1
    //   445: iload_1
    //   446: iload #4
    //   448: if_icmpge -> 549
    //   451: aload #8
    //   453: iload_1
    //   454: aaload
    //   455: astore #9
    //   457: aload #9
    //   459: ifnull -> 477
    //   462: ldc b/n/f
    //   464: aload #9
    //   466: invokevirtual isAssignableFrom : (Ljava/lang/Class;)Z
    //   469: ifeq -> 477
    //   472: iconst_1
    //   473: istore_2
    //   474: goto -> 479
    //   477: iconst_0
    //   478: istore_2
    //   479: iload_2
    //   480: ifne -> 486
    //   483: goto -> 543
    //   486: aload #9
    //   488: invokestatic c : (Ljava/lang/Class;)I
    //   491: iconst_1
    //   492: if_icmpne -> 500
    //   495: iload_3
    //   496: istore_1
    //   497: goto -> 574
    //   500: aload #6
    //   502: astore #7
    //   504: aload #6
    //   506: ifnonnull -> 518
    //   509: new java/util/ArrayList
    //   512: dup
    //   513: invokespecial <init> : ()V
    //   516: astore #7
    //   518: aload #7
    //   520: getstatic b/n/j.b : Ljava/util/Map;
    //   523: aload #9
    //   525: invokeinterface get : (Ljava/lang/Object;)Ljava/lang/Object;
    //   530: checkcast java/util/Collection
    //   533: invokeinterface addAll : (Ljava/util/Collection;)Z
    //   538: pop
    //   539: aload #7
    //   541: astore #6
    //   543: iinc #1, 1
    //   546: goto -> 445
    //   549: iload_3
    //   550: istore_1
    //   551: aload #6
    //   553: ifnull -> 574
    //   556: getstatic b/n/j.b : Ljava/util/Map;
    //   559: astore #7
    //   561: aload #7
    //   563: aload_0
    //   564: aload #6
    //   566: invokeinterface put : (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    //   571: pop
    //   572: iconst_2
    //   573: istore_1
    //   574: getstatic b/n/j.a : Ljava/util/Map;
    //   577: aload_0
    //   578: iload_1
    //   579: invokestatic valueOf : (I)Ljava/lang/Integer;
    //   582: invokeinterface put : (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    //   587: pop
    //   588: iload_1
    //   589: ireturn
    //   590: astore_0
    //   591: new java/lang/IllegalArgumentException
    //   594: dup
    //   595: ldc 'The observer class has some methods that use newer APIs which are not available in the current OS version. Lifecycles cannot access even other methods so you should make sure that your observer classes only access framework classes that are available in your min API level OR use lifecycle:compiler annotation processor.'
    //   597: aload_0
    //   598: invokespecial <init> : (Ljava/lang/String;Ljava/lang/Throwable;)V
    //   601: athrow
    // Exception table:
    //   from	to	target	type
    //   46	58	218	java/lang/ClassNotFoundException
    //   46	58	208	java/lang/NoSuchMethodException
    //   63	70	218	java/lang/ClassNotFoundException
    //   63	70	208	java/lang/NoSuchMethodException
    //   77	85	218	java/lang/ClassNotFoundException
    //   77	85	208	java/lang/NoSuchMethodException
    //   88	102	218	java/lang/ClassNotFoundException
    //   88	102	208	java/lang/NoSuchMethodException
    //   102	117	218	java/lang/ClassNotFoundException
    //   102	117	208	java/lang/NoSuchMethodException
    //   124	165	218	java/lang/ClassNotFoundException
    //   124	165	208	java/lang/NoSuchMethodException
    //   165	183	218	java/lang/ClassNotFoundException
    //   165	183	208	java/lang/NoSuchMethodException
    //   187	201	218	java/lang/ClassNotFoundException
    //   187	201	208	java/lang/NoSuchMethodException
    //   279	285	590	java/lang/NoClassDefFoundError
  }
  
  public static e d(Object paramObject) {
    boolean bool1 = paramObject instanceof e;
    boolean bool2 = paramObject instanceof b;
    if (bool1 && bool2)
      return (e)new FullLifecycleObserverAdapter((b)paramObject, (e)paramObject); 
    if (bool2)
      return (e)new FullLifecycleObserverAdapter((b)paramObject, null); 
    if (bool1)
      return (e)paramObject; 
    Class<?> clazz = paramObject.getClass();
    if (c(clazz) == 2) {
      List<Constructor<? extends c>> list = b.get(clazz);
      int i = list.size();
      byte b = 0;
      if (i == 1)
        return (e)new SingleGeneratedAdapterObserver(a(list.get(0), paramObject)); 
      c[] arrayOfC = new c[list.size()];
      while (b < list.size()) {
        arrayOfC[b] = a(list.get(b), paramObject);
        b++;
      } 
      return (e)new CompositeGeneratedAdaptersObserver(arrayOfC);
    } 
    return (e)new ReflectiveGenericLifecycleObserver(paramObject);
  }
}


/* Location:              C:\Users\panch\Downloads\dvba_v1.1.0-dex2jar.jar!\b\n\j.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */