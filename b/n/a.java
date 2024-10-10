package b.n;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class a {
  public static a c = new a();
  
  public final Map<Class, a> a = (Map)new HashMap<Class<?>, a>();
  
  public final Map<Class, Boolean> b = (Map)new HashMap<Class<?>, Boolean>();
  
  public final a a(Class paramClass, Method[] paramArrayOfMethod) {
    // Byte code:
    //   0: aload_1
    //   1: invokevirtual getSuperclass : ()Ljava/lang/Class;
    //   4: astore #8
    //   6: new java/util/HashMap
    //   9: dup
    //   10: invokespecial <init> : ()V
    //   13: astore #7
    //   15: aload #8
    //   17: ifnull -> 43
    //   20: aload_0
    //   21: aload #8
    //   23: invokevirtual b : (Ljava/lang/Class;)Lb/n/a$a;
    //   26: astore #8
    //   28: aload #8
    //   30: ifnull -> 43
    //   33: aload #7
    //   35: aload #8
    //   37: getfield b : Ljava/util/Map;
    //   40: invokevirtual putAll : (Ljava/util/Map;)V
    //   43: aload_1
    //   44: invokevirtual getInterfaces : ()[Ljava/lang/Class;
    //   47: astore #9
    //   49: aload #9
    //   51: arraylength
    //   52: istore #4
    //   54: iconst_0
    //   55: istore_3
    //   56: iload_3
    //   57: iload #4
    //   59: if_icmpge -> 143
    //   62: aload_0
    //   63: aload #9
    //   65: iload_3
    //   66: aaload
    //   67: invokevirtual b : (Ljava/lang/Class;)Lb/n/a$a;
    //   70: getfield b : Ljava/util/Map;
    //   73: invokeinterface entrySet : ()Ljava/util/Set;
    //   78: invokeinterface iterator : ()Ljava/util/Iterator;
    //   83: astore #10
    //   85: aload #10
    //   87: invokeinterface hasNext : ()Z
    //   92: ifeq -> 137
    //   95: aload #10
    //   97: invokeinterface next : ()Ljava/lang/Object;
    //   102: checkcast java/util/Map$Entry
    //   105: astore #8
    //   107: aload_0
    //   108: aload #7
    //   110: aload #8
    //   112: invokeinterface getKey : ()Ljava/lang/Object;
    //   117: checkcast b/n/a$b
    //   120: aload #8
    //   122: invokeinterface getValue : ()Ljava/lang/Object;
    //   127: checkcast b/n/d$a
    //   130: aload_1
    //   131: invokevirtual c : (Ljava/util/Map;Lb/n/a$b;Lb/n/d$a;Ljava/lang/Class;)V
    //   134: goto -> 85
    //   137: iinc #3, 1
    //   140: goto -> 56
    //   143: aload_2
    //   144: ifnull -> 150
    //   147: goto -> 155
    //   150: aload_1
    //   151: invokevirtual getDeclaredMethods : ()[Ljava/lang/reflect/Method;
    //   154: astore_2
    //   155: aload_2
    //   156: arraylength
    //   157: istore #5
    //   159: iconst_0
    //   160: istore #4
    //   162: iconst_0
    //   163: istore #6
    //   165: iload #4
    //   167: iload #5
    //   169: if_icmpge -> 346
    //   172: aload_2
    //   173: iload #4
    //   175: aaload
    //   176: astore #8
    //   178: aload #8
    //   180: ldc b/n/n
    //   182: invokevirtual getAnnotation : (Ljava/lang/Class;)Ljava/lang/annotation/Annotation;
    //   185: checkcast b/n/n
    //   188: astore #10
    //   190: aload #10
    //   192: ifnonnull -> 198
    //   195: goto -> 330
    //   198: aload #8
    //   200: invokevirtual getParameterTypes : ()[Ljava/lang/Class;
    //   203: astore #9
    //   205: aload #9
    //   207: arraylength
    //   208: ifle -> 238
    //   211: aload #9
    //   213: iconst_0
    //   214: aaload
    //   215: ldc b/n/g
    //   217: invokevirtual isAssignableFrom : (Ljava/lang/Class;)Z
    //   220: ifeq -> 228
    //   223: iconst_1
    //   224: istore_3
    //   225: goto -> 240
    //   228: new java/lang/IllegalArgumentException
    //   231: dup
    //   232: ldc 'invalid parameter type. Must be one and instanceof LifecycleOwner'
    //   234: invokespecial <init> : (Ljava/lang/String;)V
    //   237: athrow
    //   238: iconst_0
    //   239: istore_3
    //   240: aload #10
    //   242: invokeinterface value : ()Lb/n/d$a;
    //   247: astore #10
    //   249: aload #9
    //   251: arraylength
    //   252: iconst_1
    //   253: if_icmple -> 301
    //   256: aload #9
    //   258: iconst_1
    //   259: aaload
    //   260: ldc b/n/d$a
    //   262: invokevirtual isAssignableFrom : (Ljava/lang/Class;)Z
    //   265: ifeq -> 291
    //   268: aload #10
    //   270: getstatic b/n/d$a.ON_ANY : Lb/n/d$a;
    //   273: if_acmpne -> 281
    //   276: iconst_2
    //   277: istore_3
    //   278: goto -> 301
    //   281: new java/lang/IllegalArgumentException
    //   284: dup
    //   285: ldc 'Second arg is supported only for ON_ANY value'
    //   287: invokespecial <init> : (Ljava/lang/String;)V
    //   290: athrow
    //   291: new java/lang/IllegalArgumentException
    //   294: dup
    //   295: ldc 'invalid parameter type. second arg must be an event'
    //   297: invokespecial <init> : (Ljava/lang/String;)V
    //   300: athrow
    //   301: aload #9
    //   303: arraylength
    //   304: iconst_2
    //   305: if_icmpgt -> 336
    //   308: aload_0
    //   309: aload #7
    //   311: new b/n/a$b
    //   314: dup
    //   315: iload_3
    //   316: aload #8
    //   318: invokespecial <init> : (ILjava/lang/reflect/Method;)V
    //   321: aload #10
    //   323: aload_1
    //   324: invokevirtual c : (Ljava/util/Map;Lb/n/a$b;Lb/n/d$a;Ljava/lang/Class;)V
    //   327: iconst_1
    //   328: istore #6
    //   330: iinc #4, 1
    //   333: goto -> 165
    //   336: new java/lang/IllegalArgumentException
    //   339: dup
    //   340: ldc 'cannot have more than 2 params'
    //   342: invokespecial <init> : (Ljava/lang/String;)V
    //   345: athrow
    //   346: new b/n/a$a
    //   349: dup
    //   350: aload #7
    //   352: invokespecial <init> : (Ljava/util/Map;)V
    //   355: astore_2
    //   356: aload_0
    //   357: getfield a : Ljava/util/Map;
    //   360: aload_1
    //   361: aload_2
    //   362: invokeinterface put : (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    //   367: pop
    //   368: aload_0
    //   369: getfield b : Ljava/util/Map;
    //   372: aload_1
    //   373: iload #6
    //   375: invokestatic valueOf : (Z)Ljava/lang/Boolean;
    //   378: invokeinterface put : (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    //   383: pop
    //   384: aload_2
    //   385: areturn
    //   386: astore_1
    //   387: new java/lang/IllegalArgumentException
    //   390: dup
    //   391: ldc 'The observer class has some methods that use newer APIs which are not available in the current OS version. Lifecycles cannot access even other methods so you should make sure that your observer classes only access framework classes that are available in your min API level OR use lifecycle:compiler annotation processor.'
    //   393: aload_1
    //   394: invokespecial <init> : (Ljava/lang/String;Ljava/lang/Throwable;)V
    //   397: athrow
    // Exception table:
    //   from	to	target	type
    //   150	155	386	java/lang/NoClassDefFoundError
  }
  
  public a b(Class paramClass) {
    a a1 = this.a.get(paramClass);
    return (a1 != null) ? a1 : a(paramClass, null);
  }
  
  public final void c(Map<b, d.a> paramMap, b paramb, d.a parama, Class paramClass) {
    d.a a1 = paramMap.get(paramb);
    if (a1 == null || parama == a1) {
      if (a1 == null)
        paramMap.put(paramb, parama); 
      return;
    } 
    Method method = paramb.b;
    StringBuilder stringBuilder = c.a.a.a.a.e("Method ");
    stringBuilder.append(method.getName());
    stringBuilder.append(" in ");
    stringBuilder.append(paramClass.getName());
    stringBuilder.append(" already declared with different @OnLifecycleEvent value: previous value ");
    stringBuilder.append(a1);
    stringBuilder.append(", new value ");
    stringBuilder.append(parama);
    throw new IllegalArgumentException(stringBuilder.toString());
  }
  
  public static class a {
    public final Map<d.a, List<a.b>> a;
    
    public final Map<a.b, d.a> b;
    
    public a(Map<a.b, d.a> param1Map) {
      this.b = param1Map;
      this.a = new HashMap<d.a, List<a.b>>();
      for (Map.Entry<a.b, d.a> entry : param1Map.entrySet()) {
        d.a a1 = (d.a)entry.getValue();
        List<a.b> list2 = this.a.get(a1);
        List<a.b> list1 = list2;
        if (list2 == null) {
          list1 = new ArrayList();
          this.a.put(a1, list1);
        } 
        list1.add((a.b)entry.getKey());
      } 
    }
    
    public static void a(List<a.b> param1List, g param1g, d.a param1a, Object param1Object) {
      if (param1List != null) {
        int i = param1List.size() - 1;
        while (i >= 0) {
          a.b b = param1List.get(i);
          if (b != null) {
            try {
              int j = b.a;
              if (j != 0) {
                if (j != 1) {
                  if (j == 2)
                    b.b.invoke(param1Object, new Object[] { param1g, param1a }); 
                } else {
                  b.b.invoke(param1Object, new Object[] { param1g });
                } 
              } else {
                b.b.invoke(param1Object, new Object[0]);
              } 
              i--;
            } catch (InvocationTargetException invocationTargetException) {
              throw new RuntimeException("Failed to call observer method", invocationTargetException.getCause());
            } catch (IllegalAccessException illegalAccessException) {
              throw new RuntimeException(illegalAccessException);
            } 
            continue;
          } 
          throw null;
        } 
      } 
    }
  }
  
  public static class b {
    public final int a;
    
    public final Method b;
    
    public b(int param1Int, Method param1Method) {
      this.a = param1Int;
      this.b = param1Method;
      param1Method.setAccessible(true);
    }
    
    public boolean equals(Object param1Object) {
      boolean bool = true;
      if (this == param1Object)
        return true; 
      if (param1Object == null || b.class != param1Object.getClass())
        return false; 
      param1Object = param1Object;
      if (this.a != ((b)param1Object).a || !this.b.getName().equals(((b)param1Object).b.getName()))
        bool = false; 
      return bool;
    }
    
    public int hashCode() {
      int i = this.a;
      return this.b.getName().hashCode() + i * 31;
    }
  }
}


/* Location:              C:\Users\panch\Downloads\dvba_v1.1.0-dex2jar.jar!\b\n\a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */