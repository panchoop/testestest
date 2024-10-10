package b.l.a;

import android.util.SparseArray;
import android.view.View;
import androidx.fragment.app.Fragment;
import b.f.g;
import b.f.h;
import b.i.m.l;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Map;

public class w {
  public static final int[] a = new int[] { 
      0, 3, 0, 1, 5, 4, 7, 6, 9, 8, 
      10 };
  
  public static final b0 b = new x();
  
  public static final b0 c;
  
  static {
    try {
      b0 b01 = Class.forName("b.t.d").getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
    } catch (Exception exception) {
      exception = null;
    } 
    c = (b0)exception;
  }
  
  public static void a(ArrayList<View> paramArrayList, b.f.a<String, View> parama, Collection<String> paramCollection) {
    for (int i = ((h)parama).d - 1; i >= 0; i--) {
      View view = (View)parama.k(i);
      if (paramCollection.contains(l.x(view)))
        paramArrayList.add(view); 
    } 
  }
  
  public static void b(a parama, r.a parama1, SparseArray<a> paramSparseArray, boolean paramBoolean1, boolean paramBoolean2) {
    // Byte code:
    //   0: aload_1
    //   1: getfield b : Landroidx/fragment/app/Fragment;
    //   4: astore #12
    //   6: aload #12
    //   8: ifnonnull -> 12
    //   11: return
    //   12: aload #12
    //   14: getfield x : I
    //   17: istore #8
    //   19: iload #8
    //   21: ifne -> 25
    //   24: return
    //   25: iload_3
    //   26: ifeq -> 42
    //   29: getstatic b/l/a/w.a : [I
    //   32: aload_1
    //   33: getfield a : I
    //   36: iaload
    //   37: istore #5
    //   39: goto -> 48
    //   42: aload_1
    //   43: getfield a : I
    //   46: istore #5
    //   48: iconst_0
    //   49: istore #9
    //   51: iload #5
    //   53: iconst_1
    //   54: if_icmpeq -> 273
    //   57: iload #5
    //   59: iconst_3
    //   60: if_icmpeq -> 191
    //   63: iload #5
    //   65: iconst_4
    //   66: if_icmpeq -> 140
    //   69: iload #5
    //   71: iconst_5
    //   72: if_icmpeq -> 98
    //   75: iload #5
    //   77: bipush #6
    //   79: if_icmpeq -> 191
    //   82: iload #5
    //   84: bipush #7
    //   86: if_icmpeq -> 273
    //   89: iconst_0
    //   90: istore #9
    //   92: iconst_0
    //   93: istore #5
    //   95: goto -> 316
    //   98: iload #4
    //   100: ifeq -> 130
    //   103: aload #12
    //   105: getfield M : Z
    //   108: ifeq -> 310
    //   111: aload #12
    //   113: getfield z : Z
    //   116: ifne -> 310
    //   119: aload #12
    //   121: getfield l : Z
    //   124: ifeq -> 310
    //   127: goto -> 304
    //   130: aload #12
    //   132: getfield z : Z
    //   135: istore #9
    //   137: goto -> 313
    //   140: iload #4
    //   142: ifeq -> 172
    //   145: aload #12
    //   147: getfield M : Z
    //   150: ifeq -> 257
    //   153: aload #12
    //   155: getfield l : Z
    //   158: ifeq -> 257
    //   161: aload #12
    //   163: getfield z : Z
    //   166: ifeq -> 257
    //   169: goto -> 251
    //   172: aload #12
    //   174: getfield l : Z
    //   177: ifeq -> 257
    //   180: aload #12
    //   182: getfield z : Z
    //   185: ifne -> 257
    //   188: goto -> 251
    //   191: aload #12
    //   193: getfield l : Z
    //   196: istore #10
    //   198: iload #4
    //   200: ifeq -> 238
    //   203: iload #10
    //   205: ifne -> 257
    //   208: aload #12
    //   210: getfield G : Landroid/view/View;
    //   213: astore_1
    //   214: aload_1
    //   215: ifnull -> 257
    //   218: aload_1
    //   219: invokevirtual getVisibility : ()I
    //   222: ifne -> 257
    //   225: aload #12
    //   227: getfield N : F
    //   230: fconst_0
    //   231: fcmpl
    //   232: iflt -> 257
    //   235: goto -> 251
    //   238: iload #10
    //   240: ifeq -> 257
    //   243: aload #12
    //   245: getfield z : Z
    //   248: ifne -> 257
    //   251: iconst_1
    //   252: istore #5
    //   254: goto -> 260
    //   257: iconst_0
    //   258: istore #5
    //   260: iload #5
    //   262: istore #7
    //   264: iconst_1
    //   265: istore #6
    //   267: iconst_0
    //   268: istore #5
    //   270: goto -> 322
    //   273: iload #4
    //   275: ifeq -> 288
    //   278: aload #12
    //   280: getfield L : Z
    //   283: istore #9
    //   285: goto -> 313
    //   288: aload #12
    //   290: getfield l : Z
    //   293: ifne -> 310
    //   296: aload #12
    //   298: getfield z : Z
    //   301: ifne -> 310
    //   304: iconst_1
    //   305: istore #9
    //   307: goto -> 313
    //   310: iconst_0
    //   311: istore #9
    //   313: iconst_1
    //   314: istore #5
    //   316: iconst_0
    //   317: istore #6
    //   319: iconst_0
    //   320: istore #7
    //   322: aload_2
    //   323: iload #8
    //   325: invokevirtual get : (I)Ljava/lang/Object;
    //   328: checkcast b/l/a/w$a
    //   331: astore #11
    //   333: aload #11
    //   335: astore_1
    //   336: iload #9
    //   338: ifeq -> 380
    //   341: aload #11
    //   343: astore_1
    //   344: aload #11
    //   346: ifnonnull -> 364
    //   349: new b/l/a/w$a
    //   352: dup
    //   353: invokespecial <init> : ()V
    //   356: astore_1
    //   357: aload_2
    //   358: iload #8
    //   360: aload_1
    //   361: invokevirtual put : (ILjava/lang/Object;)V
    //   364: aload_1
    //   365: aload #12
    //   367: putfield a : Landroidx/fragment/app/Fragment;
    //   370: aload_1
    //   371: iload_3
    //   372: putfield b : Z
    //   375: aload_1
    //   376: aload_0
    //   377: putfield c : Lb/l/a/a;
    //   380: iload #4
    //   382: ifne -> 457
    //   385: iload #5
    //   387: ifeq -> 457
    //   390: aload_1
    //   391: ifnull -> 408
    //   394: aload_1
    //   395: getfield d : Landroidx/fragment/app/Fragment;
    //   398: aload #12
    //   400: if_acmpne -> 408
    //   403: aload_1
    //   404: aconst_null
    //   405: putfield d : Landroidx/fragment/app/Fragment;
    //   408: aload_0
    //   409: getfield r : Lb/l/a/k;
    //   412: astore #11
    //   414: aload #12
    //   416: getfield b : I
    //   419: iconst_1
    //   420: if_icmpge -> 457
    //   423: aload #11
    //   425: getfield p : I
    //   428: iconst_1
    //   429: if_icmplt -> 457
    //   432: aload_0
    //   433: getfield p : Z
    //   436: ifne -> 457
    //   439: aload #11
    //   441: aload #12
    //   443: invokevirtual Z : (Landroidx/fragment/app/Fragment;)V
    //   446: aload #11
    //   448: aload #12
    //   450: iconst_1
    //   451: iconst_0
    //   452: iconst_0
    //   453: iconst_0
    //   454: invokevirtual d0 : (Landroidx/fragment/app/Fragment;IIIZ)V
    //   457: aload_1
    //   458: astore #11
    //   460: iload #7
    //   462: ifeq -> 522
    //   465: aload_1
    //   466: ifnull -> 479
    //   469: aload_1
    //   470: astore #11
    //   472: aload_1
    //   473: getfield d : Landroidx/fragment/app/Fragment;
    //   476: ifnonnull -> 522
    //   479: aload_1
    //   480: astore #11
    //   482: aload_1
    //   483: ifnonnull -> 503
    //   486: new b/l/a/w$a
    //   489: dup
    //   490: invokespecial <init> : ()V
    //   493: astore #11
    //   495: aload_2
    //   496: iload #8
    //   498: aload #11
    //   500: invokevirtual put : (ILjava/lang/Object;)V
    //   503: aload #11
    //   505: aload #12
    //   507: putfield d : Landroidx/fragment/app/Fragment;
    //   510: aload #11
    //   512: iload_3
    //   513: putfield e : Z
    //   516: aload #11
    //   518: aload_0
    //   519: putfield f : Lb/l/a/a;
    //   522: iload #4
    //   524: ifne -> 553
    //   527: iload #6
    //   529: ifeq -> 553
    //   532: aload #11
    //   534: ifnull -> 553
    //   537: aload #11
    //   539: getfield a : Landroidx/fragment/app/Fragment;
    //   542: aload #12
    //   544: if_acmpne -> 553
    //   547: aload #11
    //   549: aconst_null
    //   550: putfield a : Landroidx/fragment/app/Fragment;
    //   553: return
  }
  
  public static void c(Fragment paramFragment1, Fragment paramFragment2, boolean paramBoolean1, b.f.a<String, View> parama, boolean paramBoolean2) {
    Fragment.b b;
    if (paramBoolean1) {
      b = paramFragment2.K;
    } else {
      b = ((Fragment)b).K;
    } 
  }
  
  public static boolean d(b0 paramb0, List<Object> paramList) {
    int i = paramList.size();
    for (byte b = 0; b < i; b++) {
      if (!paramb0.e(paramList.get(b)))
        return false; 
    } 
    return true;
  }
  
  public static b.f.a<String, View> e(b0 paramb0, b.f.a<String, String> parama, Object paramObject, a parama1) {
    ArrayList<String> arrayList;
    View view = parama1.a.G;
    if (parama.isEmpty() || paramObject == null || view == null) {
      parama.clear();
      return null;
    } 
    paramObject = new b.f.a();
    paramb0.i((Map<String, View>)paramObject, view);
    a a1 = parama1.c;
    if (parama1.b) {
      arrayList = a1.n;
    } else {
      arrayList = ((r)arrayList).o;
    } 
    if (arrayList != null) {
      g.k((Map)paramObject, arrayList);
      g.k((Map)paramObject, parama.values());
    } 
    int i = ((h)parama).d;
    while (true) {
      int j = i - 1;
      if (j >= 0) {
        i = j;
        if (!paramObject.containsKey(parama.k(j))) {
          parama.i(j);
          i = j;
        } 
        continue;
      } 
      return (b.f.a<String, View>)paramObject;
    } 
  }
  
  public static b.f.a<String, View> f(b0 paramb0, b.f.a<String, String> parama, Object paramObject, a parama1) {
    ArrayList<String> arrayList;
    if (parama.isEmpty() || paramObject == null) {
      parama.clear();
      return null;
    } 
    Fragment fragment = parama1.d;
    paramObject = new b.f.a();
    paramb0.i((Map<String, View>)paramObject, fragment.Q());
    a a1 = parama1.f;
    if (parama1.e) {
      arrayList = a1.o;
    } else {
      arrayList = ((r)arrayList).n;
    } 
    g.k((Map)paramObject, arrayList);
    g.k((Map)parama, paramObject.keySet());
    return (b.f.a<String, View>)paramObject;
  }
  
  public static b0 g(Fragment paramFragment1, Fragment paramFragment2) {
    ArrayList<Object> arrayList = new ArrayList();
    if (paramFragment1 != null) {
      Object object = paramFragment1.m();
      if (object != null)
        arrayList.add(object); 
      object = paramFragment1.K;
      if (object == null) {
        object = null;
      } else {
        Object object1 = ((Fragment.b)object).h;
        object = object1;
        if (object1 == Fragment.V)
          object = paramFragment1.l(); 
      } 
      if (object != null)
        arrayList.add(object); 
      object = paramFragment1.K;
      if (object == null) {
        object = null;
      } else {
        Object object1 = ((Fragment.b)object).l;
        object = object1;
        if (object1 == Fragment.V)
          object = paramFragment1.r(); 
      } 
      if (object != null)
        arrayList.add(object); 
    } 
    if (paramFragment2 != null) {
      Object object = paramFragment2.l();
      if (object != null)
        arrayList.add(object); 
      object = paramFragment2.K;
      if (object == null) {
        object = null;
      } else {
        Object object1 = ((Fragment.b)object).j;
        object = object1;
        if (object1 == Fragment.V)
          object = paramFragment2.m(); 
      } 
      if (object != null)
        arrayList.add(object); 
      object = paramFragment2.r();
      if (object != null)
        arrayList.add(object); 
    } 
    if (arrayList.isEmpty())
      return null; 
    if (d(b, arrayList))
      return b; 
    b0 b01 = c;
    if (b01 != null && d(b01, arrayList))
      return c; 
    throw new IllegalArgumentException("Invalid Transition types");
  }
  
  public static ArrayList<View> h(b0 paramb0, Object paramObject, Fragment paramFragment, ArrayList<View> paramArrayList, View paramView) {
    if (paramObject != null) {
      ArrayList<View> arrayList2 = new ArrayList();
      View view = paramFragment.G;
      if (view != null)
        paramb0.f(arrayList2, view); 
      if (paramArrayList != null)
        arrayList2.removeAll(paramArrayList); 
      ArrayList<View> arrayList1 = arrayList2;
      if (!arrayList2.isEmpty()) {
        arrayList2.add(paramView);
        paramb0.b(paramObject, arrayList2);
        arrayList1 = arrayList2;
      } 
    } else {
      paramFragment = null;
    } 
    return (ArrayList<View>)paramFragment;
  }
  
  public static Object i(b0 paramb0, Fragment paramFragment, boolean paramBoolean) {
    Object object = null;
    if (paramFragment == null)
      return null; 
    if (paramBoolean) {
      Fragment.b b = paramFragment.K;
      if (b != null) {
        Object object1 = b.j;
        object = object1;
        if (object1 == Fragment.V)
          object = paramFragment.m(); 
      } 
    } else {
      object = paramFragment.l();
    } 
    return paramb0.g(object);
  }
  
  public static Object j(b0 paramb0, Fragment paramFragment, boolean paramBoolean) {
    Object object = null;
    if (paramFragment == null)
      return null; 
    if (paramBoolean) {
      Fragment.b b = paramFragment.K;
      if (b != null) {
        Object object1 = b.h;
        object = object1;
        if (object1 == Fragment.V)
          object = paramFragment.l(); 
      } 
    } else {
      object = paramFragment.m();
    } 
    return paramb0.g(object);
  }
  
  public static View k(b.f.a<String, View> parama, a parama1, Object<String> paramObject, boolean paramBoolean) {
    a a1 = parama1.c;
    if (paramObject != null && parama != null) {
      paramObject = (Object<String>)a1.n;
      if (paramObject != null && !paramObject.isEmpty()) {
        ArrayList<String> arrayList;
        if (paramBoolean) {
          arrayList = a1.n;
        } else {
          arrayList = ((r)arrayList).o;
        } 
        return (View)parama.get(arrayList.get(0));
      } 
    } 
    return null;
  }
  
  public static Object l(b0 paramb0, Fragment paramFragment1, Fragment paramFragment2, boolean paramBoolean) {
    Object object;
    if (paramBoolean) {
      object = paramFragment2.K;
      if (object == null) {
        object = null;
      } else {
        Object object1 = ((Fragment.b)object).l;
        object = object1;
        if (object1 == Fragment.V)
          object = paramFragment2.r(); 
      } 
    } else {
      object = object.r();
    } 
    return paramb0.v(paramb0.g(object));
  }
  
  public static Object m(b0 paramb0, Object paramObject1, Object paramObject2, Object paramObject3, Fragment paramFragment, boolean paramBoolean) {
    // Byte code:
    //   0: aload_1
    //   1: ifnull -> 92
    //   4: aload_2
    //   5: ifnull -> 92
    //   8: aload #4
    //   10: ifnull -> 92
    //   13: iload #5
    //   15: ifeq -> 55
    //   18: aload #4
    //   20: getfield K : Landroidx/fragment/app/Fragment$b;
    //   23: astore #4
    //   25: aload #4
    //   27: ifnull -> 92
    //   30: aload #4
    //   32: getfield m : Ljava/lang/Boolean;
    //   35: astore #4
    //   37: aload #4
    //   39: ifnonnull -> 45
    //   42: goto -> 92
    //   45: aload #4
    //   47: invokevirtual booleanValue : ()Z
    //   50: istore #5
    //   52: goto -> 95
    //   55: aload #4
    //   57: getfield K : Landroidx/fragment/app/Fragment$b;
    //   60: astore #4
    //   62: aload #4
    //   64: ifnull -> 92
    //   67: aload #4
    //   69: getfield n : Ljava/lang/Boolean;
    //   72: astore #4
    //   74: aload #4
    //   76: ifnonnull -> 82
    //   79: goto -> 92
    //   82: aload #4
    //   84: invokevirtual booleanValue : ()Z
    //   87: istore #5
    //   89: goto -> 95
    //   92: iconst_1
    //   93: istore #5
    //   95: iload #5
    //   97: ifeq -> 111
    //   100: aload_0
    //   101: aload_2
    //   102: aload_1
    //   103: aload_3
    //   104: invokevirtual m : (Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    //   107: astore_0
    //   108: goto -> 119
    //   111: aload_0
    //   112: aload_2
    //   113: aload_1
    //   114: aload_3
    //   115: invokevirtual l : (Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    //   118: astore_0
    //   119: aload_0
    //   120: areturn
  }
  
  public static void n(b0 paramb0, Object paramObject1, Object paramObject2, b.f.a<String, View> parama, boolean paramBoolean, a parama1) {
    ArrayList<String> arrayList = parama1.n;
    if (arrayList != null && !arrayList.isEmpty()) {
      ArrayList<String> arrayList1;
      if (paramBoolean) {
        arrayList1 = parama1.o;
      } else {
        arrayList1 = ((r)arrayList1).n;
      } 
      View view = (View)parama.get(arrayList1.get(0));
      paramb0.s(paramObject1, view);
      if (paramObject2 != null)
        paramb0.s(paramObject2, view); 
    } 
  }
  
  public static void o(ArrayList<View> paramArrayList, int paramInt) {
    if (paramArrayList == null)
      return; 
    for (int i = paramArrayList.size() - 1; i >= 0; i--)
      ((View)paramArrayList.get(i)).setVisibility(paramInt); 
  }
  
  public static void p(k paramk, ArrayList<a> paramArrayList, ArrayList<Boolean> paramArrayList1, int paramInt1, int paramInt2, boolean paramBoolean) {
    // Byte code:
    //   0: aload_0
    //   1: getfield p : I
    //   4: iconst_1
    //   5: if_icmpge -> 9
    //   8: return
    //   9: new android/util/SparseArray
    //   12: dup
    //   13: invokespecial <init> : ()V
    //   16: astore #16
    //   18: iload_3
    //   19: istore #6
    //   21: iload #6
    //   23: iload #4
    //   25: if_icmpge -> 172
    //   28: aload_1
    //   29: iload #6
    //   31: invokevirtual get : (I)Ljava/lang/Object;
    //   34: checkcast b/l/a/a
    //   37: astore #14
    //   39: aload_2
    //   40: iload #6
    //   42: invokevirtual get : (I)Ljava/lang/Object;
    //   45: checkcast java/lang/Boolean
    //   48: invokevirtual booleanValue : ()Z
    //   51: ifeq -> 117
    //   54: aload #14
    //   56: getfield r : Lb/l/a/k;
    //   59: getfield r : Lb/l/a/f;
    //   62: invokevirtual c : ()Z
    //   65: ifne -> 71
    //   68: goto -> 166
    //   71: aload #14
    //   73: getfield a : Ljava/util/ArrayList;
    //   76: invokevirtual size : ()I
    //   79: iconst_1
    //   80: isub
    //   81: istore #7
    //   83: iload #7
    //   85: iflt -> 166
    //   88: aload #14
    //   90: aload #14
    //   92: getfield a : Ljava/util/ArrayList;
    //   95: iload #7
    //   97: invokevirtual get : (I)Ljava/lang/Object;
    //   100: checkcast b/l/a/r$a
    //   103: aload #16
    //   105: iconst_1
    //   106: iload #5
    //   108: invokestatic b : (Lb/l/a/a;Lb/l/a/r$a;Landroid/util/SparseArray;ZZ)V
    //   111: iinc #7, -1
    //   114: goto -> 83
    //   117: aload #14
    //   119: getfield a : Ljava/util/ArrayList;
    //   122: invokevirtual size : ()I
    //   125: istore #8
    //   127: iconst_0
    //   128: istore #7
    //   130: iload #7
    //   132: iload #8
    //   134: if_icmpge -> 166
    //   137: aload #14
    //   139: aload #14
    //   141: getfield a : Ljava/util/ArrayList;
    //   144: iload #7
    //   146: invokevirtual get : (I)Ljava/lang/Object;
    //   149: checkcast b/l/a/r$a
    //   152: aload #16
    //   154: iconst_0
    //   155: iload #5
    //   157: invokestatic b : (Lb/l/a/a;Lb/l/a/r$a;Landroid/util/SparseArray;ZZ)V
    //   160: iinc #7, 1
    //   163: goto -> 130
    //   166: iinc #6, 1
    //   169: goto -> 21
    //   172: aload #16
    //   174: invokevirtual size : ()I
    //   177: ifeq -> 1909
    //   180: new android/view/View
    //   183: dup
    //   184: aload_0
    //   185: getfield q : Lb/l/a/i;
    //   188: getfield c : Landroid/content/Context;
    //   191: invokespecial <init> : (Landroid/content/Context;)V
    //   194: astore #22
    //   196: aload #16
    //   198: invokevirtual size : ()I
    //   201: istore #7
    //   203: iconst_0
    //   204: istore #6
    //   206: iload #6
    //   208: iload #7
    //   210: if_icmpge -> 1909
    //   213: aload #16
    //   215: iload #6
    //   217: invokevirtual keyAt : (I)I
    //   220: istore #11
    //   222: new b/f/a
    //   225: dup
    //   226: invokespecial <init> : ()V
    //   229: astore #20
    //   231: iload #4
    //   233: iconst_1
    //   234: isub
    //   235: istore #8
    //   237: iload #8
    //   239: iload_3
    //   240: if_icmplt -> 420
    //   243: aload_1
    //   244: iload #8
    //   246: invokevirtual get : (I)Ljava/lang/Object;
    //   249: checkcast b/l/a/a
    //   252: astore #14
    //   254: aload #14
    //   256: iload #11
    //   258: invokevirtual m : (I)Z
    //   261: ifne -> 267
    //   264: goto -> 414
    //   267: aload_2
    //   268: iload #8
    //   270: invokevirtual get : (I)Ljava/lang/Object;
    //   273: checkcast java/lang/Boolean
    //   276: invokevirtual booleanValue : ()Z
    //   279: istore #12
    //   281: aload #14
    //   283: getfield n : Ljava/util/ArrayList;
    //   286: astore #15
    //   288: aload #15
    //   290: ifnull -> 414
    //   293: aload #15
    //   295: invokevirtual size : ()I
    //   298: istore #9
    //   300: aload #14
    //   302: getfield n : Ljava/util/ArrayList;
    //   305: astore #15
    //   307: aload #14
    //   309: getfield o : Ljava/util/ArrayList;
    //   312: astore #14
    //   314: iload #12
    //   316: ifeq -> 322
    //   319: goto -> 334
    //   322: aload #14
    //   324: astore #17
    //   326: aload #15
    //   328: astore #14
    //   330: aload #17
    //   332: astore #15
    //   334: iconst_0
    //   335: istore #10
    //   337: iload #10
    //   339: iload #9
    //   341: if_icmpge -> 414
    //   344: aload #14
    //   346: iload #10
    //   348: invokevirtual get : (I)Ljava/lang/Object;
    //   351: checkcast java/lang/String
    //   354: astore #19
    //   356: aload #15
    //   358: iload #10
    //   360: invokevirtual get : (I)Ljava/lang/Object;
    //   363: checkcast java/lang/String
    //   366: astore #18
    //   368: aload #20
    //   370: aload #18
    //   372: invokevirtual remove : (Ljava/lang/Object;)Ljava/lang/Object;
    //   375: checkcast java/lang/String
    //   378: astore #17
    //   380: aload #17
    //   382: ifnull -> 398
    //   385: aload #20
    //   387: aload #19
    //   389: aload #17
    //   391: invokevirtual put : (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    //   394: pop
    //   395: goto -> 408
    //   398: aload #20
    //   400: aload #19
    //   402: aload #18
    //   404: invokevirtual put : (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    //   407: pop
    //   408: iinc #10, 1
    //   411: goto -> 337
    //   414: iinc #8, -1
    //   417: goto -> 237
    //   420: aload #16
    //   422: iload #6
    //   424: invokevirtual valueAt : (I)Ljava/lang/Object;
    //   427: checkcast b/l/a/w$a
    //   430: astore #23
    //   432: iload #5
    //   434: ifeq -> 1304
    //   437: aload_0
    //   438: getfield r : Lb/l/a/f;
    //   441: invokevirtual c : ()Z
    //   444: ifeq -> 464
    //   447: aload_0
    //   448: getfield r : Lb/l/a/f;
    //   451: iload #11
    //   453: invokevirtual b : (I)Landroid/view/View;
    //   456: checkcast android/view/ViewGroup
    //   459: astore #15
    //   461: goto -> 467
    //   464: aconst_null
    //   465: astore #15
    //   467: aload #15
    //   469: ifnonnull -> 475
    //   472: goto -> 503
    //   475: aload #23
    //   477: getfield a : Landroidx/fragment/app/Fragment;
    //   480: astore #29
    //   482: aload #23
    //   484: getfield d : Landroidx/fragment/app/Fragment;
    //   487: astore #28
    //   489: aload #28
    //   491: aload #29
    //   493: invokestatic g : (Landroidx/fragment/app/Fragment;Landroidx/fragment/app/Fragment;)Lb/l/a/b0;
    //   496: astore #24
    //   498: aload #24
    //   500: ifnonnull -> 506
    //   503: goto -> 1301
    //   506: aload #23
    //   508: getfield b : Z
    //   511: istore #12
    //   513: aload #23
    //   515: getfield e : Z
    //   518: istore #13
    //   520: new java/util/ArrayList
    //   523: dup
    //   524: invokespecial <init> : ()V
    //   527: astore #21
    //   529: new java/util/ArrayList
    //   532: dup
    //   533: invokespecial <init> : ()V
    //   536: astore #25
    //   538: aload #24
    //   540: aload #29
    //   542: iload #12
    //   544: invokestatic i : (Lb/l/a/b0;Landroidx/fragment/app/Fragment;Z)Ljava/lang/Object;
    //   547: astore #27
    //   549: aload #24
    //   551: aload #28
    //   553: iload #13
    //   555: invokestatic j : (Lb/l/a/b0;Landroidx/fragment/app/Fragment;Z)Ljava/lang/Object;
    //   558: astore #26
    //   560: aload #23
    //   562: getfield a : Landroidx/fragment/app/Fragment;
    //   565: astore #30
    //   567: aload #23
    //   569: getfield d : Landroidx/fragment/app/Fragment;
    //   572: astore #31
    //   574: aload #30
    //   576: ifnull -> 588
    //   579: aload #30
    //   581: invokevirtual Q : ()Landroid/view/View;
    //   584: iconst_0
    //   585: invokevirtual setVisibility : (I)V
    //   588: aload #30
    //   590: ifnull -> 877
    //   593: aload #31
    //   595: ifnonnull -> 601
    //   598: goto -> 877
    //   601: aload #23
    //   603: getfield b : Z
    //   606: istore #13
    //   608: aload #20
    //   610: invokevirtual isEmpty : ()Z
    //   613: ifeq -> 622
    //   616: aconst_null
    //   617: astore #14
    //   619: goto -> 635
    //   622: aload #24
    //   624: aload #30
    //   626: aload #31
    //   628: iload #13
    //   630: invokestatic l : (Lb/l/a/b0;Landroidx/fragment/app/Fragment;Landroidx/fragment/app/Fragment;Z)Ljava/lang/Object;
    //   633: astore #14
    //   635: aload #24
    //   637: aload #20
    //   639: aload #14
    //   641: aload #23
    //   643: invokestatic f : (Lb/l/a/b0;Lb/f/a;Ljava/lang/Object;Lb/l/a/w$a;)Lb/f/a;
    //   646: astore #17
    //   648: aload #24
    //   650: aload #20
    //   652: aload #14
    //   654: aload #23
    //   656: invokestatic e : (Lb/l/a/b0;Lb/f/a;Ljava/lang/Object;Lb/l/a/w$a;)Lb/f/a;
    //   659: astore #32
    //   661: aload #20
    //   663: invokevirtual isEmpty : ()Z
    //   666: ifeq -> 695
    //   669: aload #17
    //   671: ifnull -> 679
    //   674: aload #17
    //   676: invokevirtual clear : ()V
    //   679: aload #32
    //   681: ifnull -> 689
    //   684: aload #32
    //   686: invokevirtual clear : ()V
    //   689: aconst_null
    //   690: astore #14
    //   692: goto -> 719
    //   695: aload #25
    //   697: aload #17
    //   699: aload #20
    //   701: invokevirtual keySet : ()Ljava/util/Set;
    //   704: invokestatic a : (Ljava/util/ArrayList;Lb/f/a;Ljava/util/Collection;)V
    //   707: aload #21
    //   709: aload #32
    //   711: aload #20
    //   713: invokevirtual values : ()Ljava/util/Collection;
    //   716: invokestatic a : (Ljava/util/ArrayList;Lb/f/a;Ljava/util/Collection;)V
    //   719: aload #27
    //   721: ifnonnull -> 737
    //   724: aload #26
    //   726: ifnonnull -> 737
    //   729: aload #14
    //   731: ifnonnull -> 737
    //   734: goto -> 880
    //   737: aload #30
    //   739: aload #31
    //   741: iload #13
    //   743: aload #17
    //   745: iconst_1
    //   746: invokestatic c : (Landroidx/fragment/app/Fragment;Landroidx/fragment/app/Fragment;ZLb/f/a;Z)V
    //   749: aload #14
    //   751: ifnull -> 841
    //   754: aload #21
    //   756: aload #22
    //   758: invokevirtual add : (Ljava/lang/Object;)Z
    //   761: pop
    //   762: aload #24
    //   764: aload #14
    //   766: aload #22
    //   768: aload #25
    //   770: invokevirtual t : (Ljava/lang/Object;Landroid/view/View;Ljava/util/ArrayList;)V
    //   773: aload #24
    //   775: aload #14
    //   777: aload #26
    //   779: aload #17
    //   781: aload #23
    //   783: getfield e : Z
    //   786: aload #23
    //   788: getfield f : Lb/l/a/a;
    //   791: invokestatic n : (Lb/l/a/b0;Ljava/lang/Object;Ljava/lang/Object;Lb/f/a;ZLb/l/a/a;)V
    //   794: new android/graphics/Rect
    //   797: dup
    //   798: invokespecial <init> : ()V
    //   801: astore #19
    //   803: aload #32
    //   805: aload #23
    //   807: aload #27
    //   809: iload #13
    //   811: invokestatic k : (Lb/f/a;Lb/l/a/w$a;Ljava/lang/Object;Z)Landroid/view/View;
    //   814: astore #17
    //   816: aload #17
    //   818: ifnull -> 830
    //   821: aload #24
    //   823: aload #27
    //   825: aload #19
    //   827: invokevirtual r : (Ljava/lang/Object;Landroid/graphics/Rect;)V
    //   830: aload #17
    //   832: astore #18
    //   834: aload #19
    //   836: astore #17
    //   838: goto -> 847
    //   841: aconst_null
    //   842: astore #18
    //   844: aconst_null
    //   845: astore #17
    //   847: aload #15
    //   849: new b/l/a/u
    //   852: dup
    //   853: aload #30
    //   855: aload #31
    //   857: iload #13
    //   859: aload #32
    //   861: aload #18
    //   863: aload #24
    //   865: aload #17
    //   867: invokespecial <init> : (Landroidx/fragment/app/Fragment;Landroidx/fragment/app/Fragment;ZLb/f/a;Landroid/view/View;Lb/l/a/b0;Landroid/graphics/Rect;)V
    //   870: invokestatic a : (Landroid/view/View;Ljava/lang/Runnable;)Lb/i/m/k;
    //   873: pop
    //   874: goto -> 883
    //   877: goto -> 734
    //   880: aconst_null
    //   881: astore #14
    //   883: aload #20
    //   885: astore #17
    //   887: aload #27
    //   889: ifnonnull -> 905
    //   892: aload #14
    //   894: ifnonnull -> 905
    //   897: aload #26
    //   899: ifnonnull -> 905
    //   902: goto -> 503
    //   905: aload #24
    //   907: aload #26
    //   909: aload #28
    //   911: aload #25
    //   913: aload #22
    //   915: invokestatic h : (Lb/l/a/b0;Ljava/lang/Object;Landroidx/fragment/app/Fragment;Ljava/util/ArrayList;Landroid/view/View;)Ljava/util/ArrayList;
    //   918: astore #20
    //   920: aload #24
    //   922: aload #27
    //   924: aload #29
    //   926: aload #21
    //   928: aload #22
    //   930: invokestatic h : (Lb/l/a/b0;Ljava/lang/Object;Landroidx/fragment/app/Fragment;Ljava/util/ArrayList;Landroid/view/View;)Ljava/util/ArrayList;
    //   933: astore #18
    //   935: aload #18
    //   937: iconst_4
    //   938: invokestatic o : (Ljava/util/ArrayList;I)V
    //   941: aload #24
    //   943: aload #27
    //   945: aload #26
    //   947: aload #14
    //   949: aload #29
    //   951: iload #12
    //   953: invokestatic m : (Lb/l/a/b0;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Landroidx/fragment/app/Fragment;Z)Ljava/lang/Object;
    //   956: astore #23
    //   958: aload #23
    //   960: ifnull -> 503
    //   963: aload #28
    //   965: ifnull -> 1035
    //   968: aload #26
    //   970: ifnull -> 1035
    //   973: aload #28
    //   975: getfield l : Z
    //   978: ifeq -> 1035
    //   981: aload #28
    //   983: getfield z : Z
    //   986: ifeq -> 1035
    //   989: aload #28
    //   991: getfield M : Z
    //   994: ifeq -> 1035
    //   997: aload #28
    //   999: iconst_1
    //   1000: invokevirtual U : (Z)V
    //   1003: aload #24
    //   1005: aload #26
    //   1007: aload #28
    //   1009: getfield G : Landroid/view/View;
    //   1012: aload #20
    //   1014: invokevirtual p : (Ljava/lang/Object;Landroid/view/View;Ljava/util/ArrayList;)V
    //   1017: aload #28
    //   1019: getfield F : Landroid/view/ViewGroup;
    //   1022: new b/l/a/s
    //   1025: dup
    //   1026: aload #20
    //   1028: invokespecial <init> : (Ljava/util/ArrayList;)V
    //   1031: invokestatic a : (Landroid/view/View;Ljava/lang/Runnable;)Lb/i/m/k;
    //   1034: pop
    //   1035: new java/util/ArrayList
    //   1038: dup
    //   1039: invokespecial <init> : ()V
    //   1042: astore #19
    //   1044: aload #21
    //   1046: invokevirtual size : ()I
    //   1049: istore #9
    //   1051: iconst_0
    //   1052: istore #8
    //   1054: iload #8
    //   1056: iload #9
    //   1058: if_icmpge -> 1096
    //   1061: aload #21
    //   1063: iload #8
    //   1065: invokevirtual get : (I)Ljava/lang/Object;
    //   1068: checkcast android/view/View
    //   1071: astore #28
    //   1073: aload #19
    //   1075: aload #28
    //   1077: invokestatic x : (Landroid/view/View;)Ljava/lang/String;
    //   1080: invokevirtual add : (Ljava/lang/Object;)Z
    //   1083: pop
    //   1084: aload #28
    //   1086: aconst_null
    //   1087: invokevirtual setTransitionName : (Ljava/lang/String;)V
    //   1090: iinc #8, 1
    //   1093: goto -> 1054
    //   1096: aload #24
    //   1098: aload #23
    //   1100: aload #27
    //   1102: aload #18
    //   1104: aload #26
    //   1106: aload #20
    //   1108: aload #14
    //   1110: aload #21
    //   1112: invokevirtual q : (Ljava/lang/Object;Ljava/lang/Object;Ljava/util/ArrayList;Ljava/lang/Object;Ljava/util/ArrayList;Ljava/lang/Object;Ljava/util/ArrayList;)V
    //   1115: aload #24
    //   1117: aload #15
    //   1119: aload #23
    //   1121: invokevirtual c : (Landroid/view/ViewGroup;Ljava/lang/Object;)V
    //   1124: aload #21
    //   1126: invokevirtual size : ()I
    //   1129: istore #10
    //   1131: new java/util/ArrayList
    //   1134: dup
    //   1135: invokespecial <init> : ()V
    //   1138: astore #20
    //   1140: iconst_0
    //   1141: istore #8
    //   1143: iload #8
    //   1145: iload #10
    //   1147: if_icmpge -> 1259
    //   1150: aload #25
    //   1152: iload #8
    //   1154: invokevirtual get : (I)Ljava/lang/Object;
    //   1157: checkcast android/view/View
    //   1160: astore #26
    //   1162: aload #26
    //   1164: invokestatic x : (Landroid/view/View;)Ljava/lang/String;
    //   1167: astore #23
    //   1169: aload #20
    //   1171: aload #23
    //   1173: invokevirtual add : (Ljava/lang/Object;)Z
    //   1176: pop
    //   1177: aload #23
    //   1179: ifnonnull -> 1185
    //   1182: goto -> 1253
    //   1185: aload #26
    //   1187: aconst_null
    //   1188: invokevirtual setTransitionName : (Ljava/lang/String;)V
    //   1191: aload #17
    //   1193: aload #23
    //   1195: aconst_null
    //   1196: invokevirtual getOrDefault : (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    //   1199: checkcast java/lang/String
    //   1202: astore #26
    //   1204: iconst_0
    //   1205: istore #9
    //   1207: iload #9
    //   1209: iload #10
    //   1211: if_icmpge -> 1253
    //   1214: aload #26
    //   1216: aload #19
    //   1218: iload #9
    //   1220: invokevirtual get : (I)Ljava/lang/Object;
    //   1223: invokevirtual equals : (Ljava/lang/Object;)Z
    //   1226: ifeq -> 1247
    //   1229: aload #21
    //   1231: iload #9
    //   1233: invokevirtual get : (I)Ljava/lang/Object;
    //   1236: checkcast android/view/View
    //   1239: aload #23
    //   1241: invokevirtual setTransitionName : (Ljava/lang/String;)V
    //   1244: goto -> 1253
    //   1247: iinc #9, 1
    //   1250: goto -> 1207
    //   1253: iinc #8, 1
    //   1256: goto -> 1143
    //   1259: aload #15
    //   1261: new b/l/a/y
    //   1264: dup
    //   1265: aload #24
    //   1267: iload #10
    //   1269: aload #21
    //   1271: aload #19
    //   1273: aload #25
    //   1275: aload #20
    //   1277: invokespecial <init> : (Lb/l/a/b0;ILjava/util/ArrayList;Ljava/util/ArrayList;Ljava/util/ArrayList;Ljava/util/ArrayList;)V
    //   1280: invokestatic a : (Landroid/view/View;Ljava/lang/Runnable;)Lb/i/m/k;
    //   1283: pop
    //   1284: aload #18
    //   1286: iconst_0
    //   1287: invokestatic o : (Ljava/util/ArrayList;I)V
    //   1290: aload #24
    //   1292: aload #14
    //   1294: aload #25
    //   1296: aload #21
    //   1298: invokevirtual u : (Ljava/lang/Object;Ljava/util/ArrayList;Ljava/util/ArrayList;)V
    //   1301: goto -> 1370
    //   1304: aload_0
    //   1305: getfield r : Lb/l/a/f;
    //   1308: invokevirtual c : ()Z
    //   1311: ifeq -> 1331
    //   1314: aload_0
    //   1315: getfield r : Lb/l/a/f;
    //   1318: iload #11
    //   1320: invokevirtual b : (I)Landroid/view/View;
    //   1323: checkcast android/view/ViewGroup
    //   1326: astore #17
    //   1328: goto -> 1334
    //   1331: aconst_null
    //   1332: astore #17
    //   1334: aload #17
    //   1336: ifnonnull -> 1342
    //   1339: goto -> 1370
    //   1342: aload #23
    //   1344: getfield a : Landroidx/fragment/app/Fragment;
    //   1347: astore #24
    //   1349: aload #23
    //   1351: getfield d : Landroidx/fragment/app/Fragment;
    //   1354: astore #28
    //   1356: aload #28
    //   1358: aload #24
    //   1360: invokestatic g : (Landroidx/fragment/app/Fragment;Landroidx/fragment/app/Fragment;)Lb/l/a/b0;
    //   1363: astore #26
    //   1365: aload #26
    //   1367: ifnonnull -> 1381
    //   1370: iload #6
    //   1372: istore #8
    //   1374: iload #7
    //   1376: istore #8
    //   1378: goto -> 1903
    //   1381: aload #23
    //   1383: getfield b : Z
    //   1386: istore #13
    //   1388: aload #23
    //   1390: getfield e : Z
    //   1393: istore #12
    //   1395: aload #26
    //   1397: aload #24
    //   1399: iload #13
    //   1401: invokestatic i : (Lb/l/a/b0;Landroidx/fragment/app/Fragment;Z)Ljava/lang/Object;
    //   1404: astore #25
    //   1406: aload #26
    //   1408: aload #28
    //   1410: iload #12
    //   1412: invokestatic j : (Lb/l/a/b0;Landroidx/fragment/app/Fragment;Z)Ljava/lang/Object;
    //   1415: astore #19
    //   1417: new java/util/ArrayList
    //   1420: dup
    //   1421: invokespecial <init> : ()V
    //   1424: astore #27
    //   1426: new java/util/ArrayList
    //   1429: dup
    //   1430: invokespecial <init> : ()V
    //   1433: astore #14
    //   1435: aload #23
    //   1437: getfield a : Landroidx/fragment/app/Fragment;
    //   1440: astore #29
    //   1442: aload #23
    //   1444: getfield d : Landroidx/fragment/app/Fragment;
    //   1447: astore #30
    //   1449: aload #29
    //   1451: ifnull -> 1682
    //   1454: aload #30
    //   1456: ifnonnull -> 1462
    //   1459: goto -> 1682
    //   1462: aload #23
    //   1464: getfield b : Z
    //   1467: istore #12
    //   1469: aload #20
    //   1471: invokevirtual isEmpty : ()Z
    //   1474: ifeq -> 1483
    //   1477: aconst_null
    //   1478: astore #15
    //   1480: goto -> 1496
    //   1483: aload #26
    //   1485: aload #29
    //   1487: aload #30
    //   1489: iload #12
    //   1491: invokestatic l : (Lb/l/a/b0;Landroidx/fragment/app/Fragment;Landroidx/fragment/app/Fragment;Z)Ljava/lang/Object;
    //   1494: astore #15
    //   1496: aload #26
    //   1498: aload #20
    //   1500: aload #15
    //   1502: aload #23
    //   1504: invokestatic f : (Lb/l/a/b0;Lb/f/a;Ljava/lang/Object;Lb/l/a/w$a;)Lb/f/a;
    //   1507: astore #18
    //   1509: aload #20
    //   1511: invokevirtual isEmpty : ()Z
    //   1514: ifeq -> 1523
    //   1517: aconst_null
    //   1518: astore #15
    //   1520: goto -> 1534
    //   1523: aload #27
    //   1525: aload #18
    //   1527: invokevirtual values : ()Ljava/util/Collection;
    //   1530: invokevirtual addAll : (Ljava/util/Collection;)Z
    //   1533: pop
    //   1534: aload #25
    //   1536: ifnonnull -> 1552
    //   1539: aload #19
    //   1541: ifnonnull -> 1552
    //   1544: aload #15
    //   1546: ifnonnull -> 1552
    //   1549: goto -> 1682
    //   1552: aload #29
    //   1554: aload #30
    //   1556: iload #12
    //   1558: aload #18
    //   1560: iconst_1
    //   1561: invokestatic c : (Landroidx/fragment/app/Fragment;Landroidx/fragment/app/Fragment;ZLb/f/a;Z)V
    //   1564: aload #15
    //   1566: ifnull -> 1635
    //   1569: new android/graphics/Rect
    //   1572: dup
    //   1573: invokespecial <init> : ()V
    //   1576: astore #21
    //   1578: aload #26
    //   1580: aload #15
    //   1582: aload #22
    //   1584: aload #27
    //   1586: invokevirtual t : (Ljava/lang/Object;Landroid/view/View;Ljava/util/ArrayList;)V
    //   1589: aload #26
    //   1591: aload #15
    //   1593: aload #19
    //   1595: aload #18
    //   1597: aload #23
    //   1599: getfield e : Z
    //   1602: aload #23
    //   1604: getfield f : Lb/l/a/a;
    //   1607: invokestatic n : (Lb/l/a/b0;Ljava/lang/Object;Ljava/lang/Object;Lb/f/a;ZLb/l/a/a;)V
    //   1610: aload #21
    //   1612: astore #18
    //   1614: aload #25
    //   1616: ifnull -> 1638
    //   1619: aload #26
    //   1621: aload #25
    //   1623: aload #21
    //   1625: invokevirtual r : (Ljava/lang/Object;Landroid/graphics/Rect;)V
    //   1628: aload #21
    //   1630: astore #18
    //   1632: goto -> 1638
    //   1635: aconst_null
    //   1636: astore #18
    //   1638: aload #14
    //   1640: astore #21
    //   1642: aload #17
    //   1644: new b/l/a/v
    //   1647: dup
    //   1648: aload #26
    //   1650: aload #20
    //   1652: aload #15
    //   1654: aload #23
    //   1656: aload #14
    //   1658: aload #22
    //   1660: aload #29
    //   1662: aload #30
    //   1664: iload #12
    //   1666: aload #27
    //   1668: aload #25
    //   1670: aload #18
    //   1672: invokespecial <init> : (Lb/l/a/b0;Lb/f/a;Ljava/lang/Object;Lb/l/a/w$a;Ljava/util/ArrayList;Landroid/view/View;Landroidx/fragment/app/Fragment;Landroidx/fragment/app/Fragment;ZLjava/util/ArrayList;Ljava/lang/Object;Landroid/graphics/Rect;)V
    //   1675: invokestatic a : (Landroid/view/View;Ljava/lang/Runnable;)Lb/i/m/k;
    //   1678: pop
    //   1679: goto -> 1689
    //   1682: aload #14
    //   1684: astore #15
    //   1686: aconst_null
    //   1687: astore #15
    //   1689: aload #14
    //   1691: astore #18
    //   1693: iload #7
    //   1695: istore #8
    //   1697: aconst_null
    //   1698: astore #21
    //   1700: iload #6
    //   1702: istore #8
    //   1704: aload #25
    //   1706: ifnonnull -> 1722
    //   1709: aload #15
    //   1711: ifnonnull -> 1722
    //   1714: aload #19
    //   1716: ifnonnull -> 1722
    //   1719: goto -> 1903
    //   1722: aload #26
    //   1724: aload #19
    //   1726: aload #28
    //   1728: aload #27
    //   1730: aload #22
    //   1732: invokestatic h : (Lb/l/a/b0;Ljava/lang/Object;Landroidx/fragment/app/Fragment;Ljava/util/ArrayList;Landroid/view/View;)Ljava/util/ArrayList;
    //   1735: astore #27
    //   1737: aload #21
    //   1739: astore #14
    //   1741: aload #27
    //   1743: ifnull -> 1765
    //   1746: aload #27
    //   1748: invokevirtual isEmpty : ()Z
    //   1751: ifeq -> 1761
    //   1754: aload #21
    //   1756: astore #14
    //   1758: goto -> 1765
    //   1761: aload #19
    //   1763: astore #14
    //   1765: aload #26
    //   1767: aload #25
    //   1769: aload #22
    //   1771: invokevirtual a : (Ljava/lang/Object;Landroid/view/View;)V
    //   1774: aload #26
    //   1776: aload #25
    //   1778: aload #14
    //   1780: aload #15
    //   1782: aload #24
    //   1784: aload #23
    //   1786: getfield b : Z
    //   1789: invokestatic m : (Lb/l/a/b0;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Landroidx/fragment/app/Fragment;Z)Ljava/lang/Object;
    //   1792: astore #21
    //   1794: aload #21
    //   1796: ifnull -> 1903
    //   1799: new java/util/ArrayList
    //   1802: dup
    //   1803: invokespecial <init> : ()V
    //   1806: astore #19
    //   1808: aload #26
    //   1810: aload #21
    //   1812: aload #25
    //   1814: aload #19
    //   1816: aload #14
    //   1818: aload #27
    //   1820: aload #15
    //   1822: aload #18
    //   1824: invokevirtual q : (Ljava/lang/Object;Ljava/lang/Object;Ljava/util/ArrayList;Ljava/lang/Object;Ljava/util/ArrayList;Ljava/lang/Object;Ljava/util/ArrayList;)V
    //   1827: aload #17
    //   1829: new b/l/a/t
    //   1832: dup
    //   1833: aload #25
    //   1835: aload #26
    //   1837: aload #22
    //   1839: aload #24
    //   1841: aload #18
    //   1843: aload #19
    //   1845: aload #27
    //   1847: aload #14
    //   1849: invokespecial <init> : (Ljava/lang/Object;Lb/l/a/b0;Landroid/view/View;Landroidx/fragment/app/Fragment;Ljava/util/ArrayList;Ljava/util/ArrayList;Ljava/util/ArrayList;Ljava/lang/Object;)V
    //   1852: invokestatic a : (Landroid/view/View;Ljava/lang/Runnable;)Lb/i/m/k;
    //   1855: pop
    //   1856: aload #17
    //   1858: new b/l/a/z
    //   1861: dup
    //   1862: aload #26
    //   1864: aload #18
    //   1866: aload #20
    //   1868: invokespecial <init> : (Lb/l/a/b0;Ljava/util/ArrayList;Ljava/util/Map;)V
    //   1871: invokestatic a : (Landroid/view/View;Ljava/lang/Runnable;)Lb/i/m/k;
    //   1874: pop
    //   1875: aload #26
    //   1877: aload #17
    //   1879: aload #21
    //   1881: invokevirtual c : (Landroid/view/ViewGroup;Ljava/lang/Object;)V
    //   1884: aload #17
    //   1886: new b/l/a/a0
    //   1889: dup
    //   1890: aload #26
    //   1892: aload #18
    //   1894: aload #20
    //   1896: invokespecial <init> : (Lb/l/a/b0;Ljava/util/ArrayList;Ljava/util/Map;)V
    //   1899: invokestatic a : (Landroid/view/View;Ljava/lang/Runnable;)Lb/i/m/k;
    //   1902: pop
    //   1903: iinc #6, 1
    //   1906: goto -> 206
    //   1909: return
  }
  
  public static class a {
    public Fragment a;
    
    public boolean b;
    
    public a c;
    
    public Fragment d;
    
    public boolean e;
    
    public a f;
  }
}


/* Location:              C:\Users\panch\Downloads\dvba_v1.1.0-dex2jar.jar!\b\l\a\w.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */