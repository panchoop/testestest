package b.b.p;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.XmlResourceParser;
import android.graphics.ColorFilter;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.os.Build;
import android.util.AttributeSet;
import android.util.Log;
import android.util.TypedValue;
import android.util.Xml;
import b.f.h;
import b.f.i;
import java.lang.ref.WeakReference;
import java.util.WeakHashMap;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

public final class n0 {
  public static final PorterDuff.Mode h = PorterDuff.Mode.SRC_IN;
  
  public static n0 i;
  
  public static final c j = new c(6);
  
  public WeakHashMap<Context, i<ColorStateList>> a;
  
  public h<String, d> b;
  
  public i<String> c;
  
  public final WeakHashMap<Context, b.f.e<WeakReference<Drawable.ConstantState>>> d = new WeakHashMap<Context, b.f.e<WeakReference<Drawable.ConstantState>>>(0);
  
  public TypedValue e;
  
  public boolean f;
  
  public e g;
  
  public static n0 d() {
    // Byte code:
    //   0: ldc b/b/p/n0
    //   2: monitorenter
    //   3: getstatic b/b/p/n0.i : Lb/b/p/n0;
    //   6: ifnonnull -> 74
    //   9: new b/b/p/n0
    //   12: astore_0
    //   13: aload_0
    //   14: invokespecial <init> : ()V
    //   17: aload_0
    //   18: putstatic b/b/p/n0.i : Lb/b/p/n0;
    //   21: getstatic android/os/Build$VERSION.SDK_INT : I
    //   24: bipush #24
    //   26: if_icmpge -> 74
    //   29: new b/b/p/n0$f
    //   32: astore_1
    //   33: aload_1
    //   34: invokespecial <init> : ()V
    //   37: aload_0
    //   38: ldc 'vector'
    //   40: aload_1
    //   41: invokevirtual a : (Ljava/lang/String;Lb/b/p/n0$d;)V
    //   44: new b/b/p/n0$b
    //   47: astore_1
    //   48: aload_1
    //   49: invokespecial <init> : ()V
    //   52: aload_0
    //   53: ldc 'animated-vector'
    //   55: aload_1
    //   56: invokevirtual a : (Ljava/lang/String;Lb/b/p/n0$d;)V
    //   59: new b/b/p/n0$a
    //   62: astore_1
    //   63: aload_1
    //   64: invokespecial <init> : ()V
    //   67: aload_0
    //   68: ldc 'animated-selector'
    //   70: aload_1
    //   71: invokevirtual a : (Ljava/lang/String;Lb/b/p/n0$d;)V
    //   74: getstatic b/b/p/n0.i : Lb/b/p/n0;
    //   77: astore_0
    //   78: ldc b/b/p/n0
    //   80: monitorexit
    //   81: aload_0
    //   82: areturn
    //   83: astore_0
    //   84: ldc b/b/p/n0
    //   86: monitorexit
    //   87: aload_0
    //   88: athrow
    // Exception table:
    //   from	to	target	type
    //   3	74	83	finally
    //   74	78	83	finally
  }
  
  public static PorterDuffColorFilter h(int paramInt, PorterDuff.Mode paramMode) {
    // Byte code:
    //   0: ldc b/b/p/n0
    //   2: monitorenter
    //   3: getstatic b/b/p/n0.j : Lb/b/p/n0$c;
    //   6: astore_3
    //   7: aload_3
    //   8: ifnull -> 94
    //   11: iload_0
    //   12: bipush #31
    //   14: iadd
    //   15: bipush #31
    //   17: imul
    //   18: istore_2
    //   19: aload_3
    //   20: aload_1
    //   21: invokevirtual hashCode : ()I
    //   24: iload_2
    //   25: iadd
    //   26: invokestatic valueOf : (I)Ljava/lang/Integer;
    //   29: invokevirtual a : (Ljava/lang/Object;)Ljava/lang/Object;
    //   32: checkcast android/graphics/PorterDuffColorFilter
    //   35: astore #4
    //   37: aload #4
    //   39: astore_3
    //   40: aload #4
    //   42: ifnonnull -> 89
    //   45: new android/graphics/PorterDuffColorFilter
    //   48: astore_3
    //   49: aload_3
    //   50: iload_0
    //   51: aload_1
    //   52: invokespecial <init> : (ILandroid/graphics/PorterDuff$Mode;)V
    //   55: getstatic b/b/p/n0.j : Lb/b/p/n0$c;
    //   58: astore #4
    //   60: aload #4
    //   62: ifnull -> 87
    //   65: aload #4
    //   67: aload_1
    //   68: invokevirtual hashCode : ()I
    //   71: iload_2
    //   72: iadd
    //   73: invokestatic valueOf : (I)Ljava/lang/Integer;
    //   76: aload_3
    //   77: invokevirtual b : (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    //   80: checkcast android/graphics/PorterDuffColorFilter
    //   83: astore_1
    //   84: goto -> 89
    //   87: aconst_null
    //   88: athrow
    //   89: ldc b/b/p/n0
    //   91: monitorexit
    //   92: aload_3
    //   93: areturn
    //   94: aconst_null
    //   95: athrow
    //   96: astore_1
    //   97: ldc b/b/p/n0
    //   99: monitorexit
    //   100: aload_1
    //   101: athrow
    // Exception table:
    //   from	to	target	type
    //   3	7	96	finally
    //   19	37	96	finally
    //   45	60	96	finally
    //   65	84	96	finally
    //   87	89	96	finally
    //   94	96	96	finally
  }
  
  public static void l(Drawable paramDrawable, v0 paramv0, int[] paramArrayOfint) {
    if (e0.a(paramDrawable) && paramDrawable.mutate() != paramDrawable) {
      Log.d("ResourceManagerInternal", "Mutated drawable is not the same instance as the input.");
      return;
    } 
    if (paramv0.d || paramv0.c) {
      PorterDuffColorFilter porterDuffColorFilter;
      ColorStateList colorStateList;
      PorterDuff.Mode mode;
      boolean bool = paramv0.d;
      v0 v01 = null;
      if (bool) {
        colorStateList = paramv0.a;
      } else {
        colorStateList = null;
      } 
      if (paramv0.c) {
        mode = paramv0.b;
      } else {
        mode = h;
      } 
      paramv0 = v01;
      if (colorStateList != null)
        if (mode == null) {
          paramv0 = v01;
        } else {
          porterDuffColorFilter = h(colorStateList.getColorForState(paramArrayOfint, 0), mode);
        }  
      paramDrawable.setColorFilter((ColorFilter)porterDuffColorFilter);
    } else {
      paramDrawable.clearColorFilter();
    } 
    if (Build.VERSION.SDK_INT <= 23)
      paramDrawable.invalidateSelf(); 
  }
  
  public final void a(String paramString, d paramd) {
    if (this.b == null)
      this.b = new h(); 
    this.b.put(paramString, paramd);
  }
  
  public final boolean b(Context paramContext, long paramLong, Drawable paramDrawable) {
    // Byte code:
    //   0: aload_0
    //   1: monitorenter
    //   2: aload #4
    //   4: invokevirtual getConstantState : ()Landroid/graphics/drawable/Drawable$ConstantState;
    //   7: astore #7
    //   9: aload #7
    //   11: ifnull -> 80
    //   14: aload_0
    //   15: getfield d : Ljava/util/WeakHashMap;
    //   18: aload_1
    //   19: invokevirtual get : (Ljava/lang/Object;)Ljava/lang/Object;
    //   22: checkcast b/f/e
    //   25: astore #6
    //   27: aload #6
    //   29: astore #4
    //   31: aload #6
    //   33: ifnonnull -> 57
    //   36: new b/f/e
    //   39: astore #4
    //   41: aload #4
    //   43: invokespecial <init> : ()V
    //   46: aload_0
    //   47: getfield d : Ljava/util/WeakHashMap;
    //   50: aload_1
    //   51: aload #4
    //   53: invokevirtual put : (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    //   56: pop
    //   57: new java/lang/ref/WeakReference
    //   60: astore_1
    //   61: aload_1
    //   62: aload #7
    //   64: invokespecial <init> : (Ljava/lang/Object;)V
    //   67: aload #4
    //   69: lload_2
    //   70: aload_1
    //   71: invokevirtual g : (JLjava/lang/Object;)V
    //   74: iconst_1
    //   75: istore #5
    //   77: goto -> 83
    //   80: iconst_0
    //   81: istore #5
    //   83: aload_0
    //   84: monitorexit
    //   85: iload #5
    //   87: ireturn
    //   88: astore_1
    //   89: aload_0
    //   90: monitorexit
    //   91: aload_1
    //   92: athrow
    // Exception table:
    //   from	to	target	type
    //   2	9	88	finally
    //   14	27	88	finally
    //   36	57	88	finally
    //   57	74	88	finally
  }
  
  public final Drawable c(Context paramContext, int paramInt) {
    LayerDrawable layerDrawable;
    if (this.e == null)
      this.e = new TypedValue(); 
    TypedValue typedValue = this.e;
    paramContext.getResources().getValue(paramInt, typedValue, true);
    long l = typedValue.assetCookie << 32L | typedValue.data;
    Drawable drawable = e(paramContext, l);
    if (drawable != null)
      return drawable; 
    e e1 = this.g;
    drawable = null;
    if (e1 != null) {
      e1 = e1;
      if (paramInt == b.b.e.abc_cab_background_top_material)
        layerDrawable = new LayerDrawable(new Drawable[] { f(paramContext, b.b.e.abc_cab_background_internal_bg), f(paramContext, b.b.e.abc_cab_background_top_mtrl_alpha) }); 
    } 
    if (layerDrawable != null) {
      layerDrawable.setChangingConfigurations(typedValue.changingConfigurations);
      b(paramContext, l, (Drawable)layerDrawable);
    } 
    return (Drawable)layerDrawable;
  }
  
  public final Drawable e(Context paramContext, long paramLong) {
    // Byte code:
    //   0: aload_0
    //   1: monitorenter
    //   2: aload_0
    //   3: getfield d : Ljava/util/WeakHashMap;
    //   6: aload_1
    //   7: invokevirtual get : (Ljava/lang/Object;)Ljava/lang/Object;
    //   10: checkcast b/f/e
    //   13: astore #5
    //   15: aload #5
    //   17: ifnonnull -> 24
    //   20: aload_0
    //   21: monitorexit
    //   22: aconst_null
    //   23: areturn
    //   24: aload #5
    //   26: lload_2
    //   27: aconst_null
    //   28: invokevirtual f : (JLjava/lang/Object;)Ljava/lang/Object;
    //   31: checkcast java/lang/ref/WeakReference
    //   34: astore #6
    //   36: aload #6
    //   38: ifnull -> 127
    //   41: aload #6
    //   43: invokevirtual get : ()Ljava/lang/Object;
    //   46: checkcast android/graphics/drawable/Drawable$ConstantState
    //   49: astore #6
    //   51: aload #6
    //   53: ifnull -> 70
    //   56: aload #6
    //   58: aload_1
    //   59: invokevirtual getResources : ()Landroid/content/res/Resources;
    //   62: invokevirtual newDrawable : (Landroid/content/res/Resources;)Landroid/graphics/drawable/Drawable;
    //   65: astore_1
    //   66: aload_0
    //   67: monitorexit
    //   68: aload_1
    //   69: areturn
    //   70: aload #5
    //   72: getfield c : [J
    //   75: aload #5
    //   77: getfield e : I
    //   80: lload_2
    //   81: invokestatic b : ([JIJ)I
    //   84: istore #4
    //   86: iload #4
    //   88: iflt -> 127
    //   91: aload #5
    //   93: getfield d : [Ljava/lang/Object;
    //   96: astore_1
    //   97: aload_1
    //   98: iload #4
    //   100: aaload
    //   101: astore #6
    //   103: getstatic b/f/e.f : Ljava/lang/Object;
    //   106: astore #7
    //   108: aload #6
    //   110: aload #7
    //   112: if_acmpeq -> 127
    //   115: aload_1
    //   116: iload #4
    //   118: aload #7
    //   120: aastore
    //   121: aload #5
    //   123: iconst_1
    //   124: putfield b : Z
    //   127: aload_0
    //   128: monitorexit
    //   129: aconst_null
    //   130: areturn
    //   131: astore_1
    //   132: aload_0
    //   133: monitorexit
    //   134: aload_1
    //   135: athrow
    // Exception table:
    //   from	to	target	type
    //   2	15	131	finally
    //   24	36	131	finally
    //   41	51	131	finally
    //   56	66	131	finally
    //   70	86	131	finally
    //   91	97	131	finally
    //   103	108	131	finally
    //   121	127	131	finally
  }
  
  public Drawable f(Context paramContext, int paramInt) {
    // Byte code:
    //   0: aload_0
    //   1: monitorenter
    //   2: aload_0
    //   3: aload_1
    //   4: iload_2
    //   5: iconst_0
    //   6: invokevirtual g : (Landroid/content/Context;IZ)Landroid/graphics/drawable/Drawable;
    //   9: astore_1
    //   10: aload_0
    //   11: monitorexit
    //   12: aload_1
    //   13: areturn
    //   14: astore_1
    //   15: aload_0
    //   16: monitorexit
    //   17: aload_1
    //   18: athrow
    // Exception table:
    //   from	to	target	type
    //   2	10	14	finally
  }
  
  public Drawable g(Context paramContext, int paramInt, boolean paramBoolean) {
    // Byte code:
    //   0: aload_0
    //   1: monitorenter
    //   2: aload_0
    //   3: getfield f : Z
    //   6: ifeq -> 12
    //   9: goto -> 79
    //   12: iconst_1
    //   13: istore #5
    //   15: aload_0
    //   16: iconst_1
    //   17: putfield f : Z
    //   20: aload_0
    //   21: aload_1
    //   22: getstatic b/b/n/a.abc_vector_test : I
    //   25: invokevirtual f : (Landroid/content/Context;I)Landroid/graphics/drawable/Drawable;
    //   28: astore #6
    //   30: aload #6
    //   32: ifnull -> 159
    //   35: iload #5
    //   37: istore #4
    //   39: aload #6
    //   41: instanceof b/u/a/a/f
    //   44: ifne -> 74
    //   47: ldc_w 'android.graphics.drawable.VectorDrawable'
    //   50: aload #6
    //   52: invokevirtual getClass : ()Ljava/lang/Class;
    //   55: invokevirtual getName : ()Ljava/lang/String;
    //   58: invokevirtual equals : (Ljava/lang/Object;)Z
    //   61: ifeq -> 71
    //   64: iload #5
    //   66: istore #4
    //   68: goto -> 74
    //   71: iconst_0
    //   72: istore #4
    //   74: iload #4
    //   76: ifeq -> 159
    //   79: aload_0
    //   80: aload_1
    //   81: iload_2
    //   82: invokevirtual j : (Landroid/content/Context;I)Landroid/graphics/drawable/Drawable;
    //   85: astore #7
    //   87: aload #7
    //   89: astore #6
    //   91: aload #7
    //   93: ifnonnull -> 104
    //   96: aload_0
    //   97: aload_1
    //   98: iload_2
    //   99: invokevirtual c : (Landroid/content/Context;I)Landroid/graphics/drawable/Drawable;
    //   102: astore #6
    //   104: aload #6
    //   106: astore #7
    //   108: aload #6
    //   110: ifnonnull -> 120
    //   113: aload_1
    //   114: iload_2
    //   115: invokestatic c : (Landroid/content/Context;I)Landroid/graphics/drawable/Drawable;
    //   118: astore #7
    //   120: aload #7
    //   122: astore #6
    //   124: aload #7
    //   126: ifnull -> 140
    //   129: aload_0
    //   130: aload_1
    //   131: iload_2
    //   132: iload_3
    //   133: aload #7
    //   135: invokevirtual k : (Landroid/content/Context;IZLandroid/graphics/drawable/Drawable;)Landroid/graphics/drawable/Drawable;
    //   138: astore #6
    //   140: aload #6
    //   142: ifnull -> 150
    //   145: aload #6
    //   147: invokestatic b : (Landroid/graphics/drawable/Drawable;)V
    //   150: aload_0
    //   151: monitorexit
    //   152: aload #6
    //   154: areturn
    //   155: astore_1
    //   156: goto -> 177
    //   159: aload_0
    //   160: iconst_0
    //   161: putfield f : Z
    //   164: new java/lang/IllegalStateException
    //   167: astore_1
    //   168: aload_1
    //   169: ldc_w 'This app has been built with an incorrect configuration. Please configure your build for VectorDrawableCompat.'
    //   172: invokespecial <init> : (Ljava/lang/String;)V
    //   175: aload_1
    //   176: athrow
    //   177: aload_0
    //   178: monitorexit
    //   179: aload_1
    //   180: athrow
    // Exception table:
    //   from	to	target	type
    //   2	9	155	finally
    //   15	30	155	finally
    //   39	64	155	finally
    //   79	87	155	finally
    //   96	104	155	finally
    //   113	120	155	finally
    //   129	140	155	finally
    //   145	150	155	finally
    //   159	177	155	finally
  }
  
  public ColorStateList i(Context paramContext, int paramInt) {
    // Byte code:
    //   0: aload_0
    //   1: monitorenter
    //   2: aload_0
    //   3: getfield a : Ljava/util/WeakHashMap;
    //   6: astore_3
    //   7: aconst_null
    //   8: astore #5
    //   10: aload_3
    //   11: ifnull -> 40
    //   14: aload_3
    //   15: aload_1
    //   16: invokevirtual get : (Ljava/lang/Object;)Ljava/lang/Object;
    //   19: checkcast b/f/i
    //   22: astore_3
    //   23: aload_3
    //   24: ifnull -> 40
    //   27: aload_3
    //   28: iload_2
    //   29: aconst_null
    //   30: invokevirtual e : (ILjava/lang/Object;)Ljava/lang/Object;
    //   33: checkcast android/content/res/ColorStateList
    //   36: astore_3
    //   37: goto -> 42
    //   40: aconst_null
    //   41: astore_3
    //   42: aload_3
    //   43: astore #4
    //   45: aload_3
    //   46: ifnonnull -> 168
    //   49: aload_0
    //   50: getfield g : Lb/b/p/n0$e;
    //   53: ifnonnull -> 62
    //   56: aload #5
    //   58: astore_3
    //   59: goto -> 79
    //   62: aload_0
    //   63: getfield g : Lb/b/p/n0$e;
    //   66: astore_3
    //   67: aload_3
    //   68: checkcast b/b/p/j$a
    //   71: astore_3
    //   72: aload_3
    //   73: aload_1
    //   74: iload_2
    //   75: invokevirtual c : (Landroid/content/Context;I)Landroid/content/res/ColorStateList;
    //   78: astore_3
    //   79: aload_3
    //   80: ifnull -> 158
    //   83: aload_0
    //   84: getfield a : Ljava/util/WeakHashMap;
    //   87: ifnonnull -> 106
    //   90: new java/util/WeakHashMap
    //   93: astore #4
    //   95: aload #4
    //   97: invokespecial <init> : ()V
    //   100: aload_0
    //   101: aload #4
    //   103: putfield a : Ljava/util/WeakHashMap;
    //   106: aload_0
    //   107: getfield a : Ljava/util/WeakHashMap;
    //   110: aload_1
    //   111: invokevirtual get : (Ljava/lang/Object;)Ljava/lang/Object;
    //   114: checkcast b/f/i
    //   117: astore #5
    //   119: aload #5
    //   121: astore #4
    //   123: aload #5
    //   125: ifnonnull -> 151
    //   128: new b/f/i
    //   131: astore #4
    //   133: aload #4
    //   135: bipush #10
    //   137: invokespecial <init> : (I)V
    //   140: aload_0
    //   141: getfield a : Ljava/util/WeakHashMap;
    //   144: aload_1
    //   145: aload #4
    //   147: invokevirtual put : (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    //   150: pop
    //   151: aload #4
    //   153: iload_2
    //   154: aload_3
    //   155: invokevirtual a : (ILjava/lang/Object;)V
    //   158: aload_3
    //   159: astore #4
    //   161: goto -> 168
    //   164: astore_1
    //   165: goto -> 173
    //   168: aload_0
    //   169: monitorexit
    //   170: aload #4
    //   172: areturn
    //   173: aload_0
    //   174: monitorexit
    //   175: aload_1
    //   176: athrow
    // Exception table:
    //   from	to	target	type
    //   2	7	164	finally
    //   14	23	164	finally
    //   27	37	164	finally
    //   49	56	164	finally
    //   62	67	164	finally
    //   72	79	164	finally
    //   83	106	164	finally
    //   106	119	164	finally
    //   128	151	164	finally
    //   151	158	164	finally
  }
  
  public final Drawable j(Context paramContext, int paramInt) {
    h<String, d> h1 = this.b;
    if (h1 != null && !h1.isEmpty()) {
      i<String> i1 = this.c;
      if (i1 != null) {
        String str = (String)i1.e(paramInt, null);
        if ("appcompat_skip_skip".equals(str) || (str != null && this.b.getOrDefault(str, null) == null))
          return null; 
      } else {
        this.c = new i(10);
      } 
      if (this.e == null)
        this.e = new TypedValue(); 
      TypedValue typedValue = this.e;
      Resources resources = paramContext.getResources();
      resources.getValue(paramInt, typedValue, true);
      long l = typedValue.assetCookie << 32L | typedValue.data;
      Drawable drawable2 = e(paramContext, l);
      if (drawable2 != null)
        return drawable2; 
      CharSequence charSequence = typedValue.string;
      Drawable drawable1 = drawable2;
      if (charSequence != null) {
        drawable1 = drawable2;
        if (charSequence.toString().endsWith(".xml")) {
          drawable1 = drawable2;
          try {
            int j;
            XmlResourceParser xmlResourceParser = resources.getXml(paramInt);
            drawable1 = drawable2;
            AttributeSet attributeSet = Xml.asAttributeSet((XmlPullParser)xmlResourceParser);
            while (true) {
              drawable1 = drawable2;
              j = xmlResourceParser.next();
              if (j != 2 && j != 1)
                continue; 
              break;
            } 
            if (j == 2) {
              drawable1 = drawable2;
              String str = xmlResourceParser.getName();
              drawable1 = drawable2;
              this.c.a(paramInt, str);
              drawable1 = drawable2;
              d d = (d)this.b.get(str);
              Drawable drawable = drawable2;
              if (d != null) {
                drawable1 = drawable2;
                drawable = d.a(paramContext, (XmlPullParser)xmlResourceParser, attributeSet, paramContext.getTheme());
              } 
              drawable1 = drawable;
              if (drawable != null) {
                drawable1 = drawable;
                drawable.setChangingConfigurations(typedValue.changingConfigurations);
                drawable1 = drawable;
                b(paramContext, l, drawable);
                drawable1 = drawable;
              } 
            } else {
              drawable1 = drawable2;
              XmlPullParserException xmlPullParserException = new XmlPullParserException();
              drawable1 = drawable2;
              this("No start tag found");
              drawable1 = drawable2;
              throw xmlPullParserException;
            } 
          } catch (Exception exception) {
            Log.e("ResourceManagerInternal", "Exception while inflating drawable", exception);
          } 
        } 
      } 
      if (drawable1 == null)
        this.c.a(paramInt, "appcompat_skip_skip"); 
      return drawable1;
    } 
    return null;
  }
  
  public final Drawable k(Context paramContext, int paramInt, boolean paramBoolean, Drawable paramDrawable) {
    // Byte code:
    //   0: aload_0
    //   1: aload_1
    //   2: iload_2
    //   3: invokevirtual i : (Landroid/content/Context;I)Landroid/content/res/ColorStateList;
    //   6: astore #8
    //   8: aconst_null
    //   9: astore #7
    //   11: aload #8
    //   13: ifnull -> 101
    //   16: aload #4
    //   18: astore_1
    //   19: aload #4
    //   21: invokestatic a : (Landroid/graphics/drawable/Drawable;)Z
    //   24: ifeq -> 33
    //   27: aload #4
    //   29: invokevirtual mutate : ()Landroid/graphics/drawable/Drawable;
    //   32: astore_1
    //   33: aload_1
    //   34: invokestatic C0 : (Landroid/graphics/drawable/Drawable;)Landroid/graphics/drawable/Drawable;
    //   37: astore #4
    //   39: aload #4
    //   41: aload #8
    //   43: invokevirtual setTintList : (Landroid/content/res/ColorStateList;)V
    //   46: aload_0
    //   47: getfield g : Lb/b/p/n0$e;
    //   50: astore_1
    //   51: aload_1
    //   52: ifnonnull -> 61
    //   55: aload #7
    //   57: astore_1
    //   58: goto -> 80
    //   61: aload_1
    //   62: checkcast b/b/p/j$a
    //   65: astore_1
    //   66: aload #7
    //   68: astore_1
    //   69: iload_2
    //   70: getstatic b/b/e.abc_switch_thumb_material : I
    //   73: if_icmpne -> 80
    //   76: getstatic android/graphics/PorterDuff$Mode.MULTIPLY : Landroid/graphics/PorterDuff$Mode;
    //   79: astore_1
    //   80: aload #4
    //   82: astore #7
    //   84: aload_1
    //   85: ifnull -> 347
    //   88: aload #4
    //   90: aload_1
    //   91: invokevirtual setTintMode : (Landroid/graphics/PorterDuff$Mode;)V
    //   94: aload #4
    //   96: astore #7
    //   98: goto -> 347
    //   101: aload_0
    //   102: getfield g : Lb/b/p/n0$e;
    //   105: astore #7
    //   107: aload #7
    //   109: ifnull -> 321
    //   112: aload #7
    //   114: checkcast b/b/p/j$a
    //   117: astore #9
    //   119: aload #9
    //   121: ifnull -> 319
    //   124: getstatic b/b/e.abc_seekbar_track_material : I
    //   127: istore #5
    //   129: iconst_1
    //   130: istore #6
    //   132: iload_2
    //   133: iload #5
    //   135: if_icmpne -> 229
    //   138: aload #4
    //   140: checkcast android/graphics/drawable/LayerDrawable
    //   143: astore #7
    //   145: aload #9
    //   147: aload #7
    //   149: ldc_w 16908288
    //   152: invokevirtual findDrawableByLayerId : (I)Landroid/graphics/drawable/Drawable;
    //   155: aload_1
    //   156: getstatic b/b/a.colorControlNormal : I
    //   159: invokestatic c : (Landroid/content/Context;I)I
    //   162: getstatic b/b/p/j.b : Landroid/graphics/PorterDuff$Mode;
    //   165: invokevirtual d : (Landroid/graphics/drawable/Drawable;ILandroid/graphics/PorterDuff$Mode;)V
    //   168: aload #7
    //   170: ldc_w 16908303
    //   173: invokevirtual findDrawableByLayerId : (I)Landroid/graphics/drawable/Drawable;
    //   176: astore #8
    //   178: getstatic b/b/a.colorControlNormal : I
    //   181: istore #5
    //   183: aload #9
    //   185: aload #8
    //   187: aload_1
    //   188: iload #5
    //   190: invokestatic c : (Landroid/content/Context;I)I
    //   193: getstatic b/b/p/j.b : Landroid/graphics/PorterDuff$Mode;
    //   196: invokevirtual d : (Landroid/graphics/drawable/Drawable;ILandroid/graphics/PorterDuff$Mode;)V
    //   199: aload #9
    //   201: aload #7
    //   203: ldc_w 16908301
    //   206: invokevirtual findDrawableByLayerId : (I)Landroid/graphics/drawable/Drawable;
    //   209: aload_1
    //   210: getstatic b/b/a.colorControlActivated : I
    //   213: invokestatic c : (Landroid/content/Context;I)I
    //   216: getstatic b/b/p/j.b : Landroid/graphics/PorterDuff$Mode;
    //   219: invokevirtual d : (Landroid/graphics/drawable/Drawable;ILandroid/graphics/PorterDuff$Mode;)V
    //   222: iload #6
    //   224: istore #5
    //   226: goto -> 307
    //   229: iload_2
    //   230: getstatic b/b/e.abc_ratingbar_material : I
    //   233: if_icmpeq -> 259
    //   236: iload_2
    //   237: getstatic b/b/e.abc_ratingbar_indicator_material : I
    //   240: if_icmpeq -> 259
    //   243: iload_2
    //   244: getstatic b/b/e.abc_ratingbar_small_material : I
    //   247: if_icmpne -> 253
    //   250: goto -> 259
    //   253: iconst_0
    //   254: istore #5
    //   256: goto -> 307
    //   259: aload #4
    //   261: checkcast android/graphics/drawable/LayerDrawable
    //   264: astore #7
    //   266: aload #9
    //   268: aload #7
    //   270: ldc_w 16908288
    //   273: invokevirtual findDrawableByLayerId : (I)Landroid/graphics/drawable/Drawable;
    //   276: aload_1
    //   277: getstatic b/b/a.colorControlNormal : I
    //   280: invokestatic b : (Landroid/content/Context;I)I
    //   283: getstatic b/b/p/j.b : Landroid/graphics/PorterDuff$Mode;
    //   286: invokevirtual d : (Landroid/graphics/drawable/Drawable;ILandroid/graphics/PorterDuff$Mode;)V
    //   289: aload #7
    //   291: ldc_w 16908303
    //   294: invokevirtual findDrawableByLayerId : (I)Landroid/graphics/drawable/Drawable;
    //   297: astore #8
    //   299: getstatic b/b/a.colorControlActivated : I
    //   302: istore #5
    //   304: goto -> 183
    //   307: iload #5
    //   309: ifeq -> 321
    //   312: aload #4
    //   314: astore #7
    //   316: goto -> 347
    //   319: aconst_null
    //   320: athrow
    //   321: aload #4
    //   323: astore #7
    //   325: aload_0
    //   326: aload_1
    //   327: iload_2
    //   328: aload #4
    //   330: invokevirtual m : (Landroid/content/Context;ILandroid/graphics/drawable/Drawable;)Z
    //   333: ifne -> 347
    //   336: aload #4
    //   338: astore #7
    //   340: iload_3
    //   341: ifeq -> 347
    //   344: aconst_null
    //   345: astore #7
    //   347: aload #7
    //   349: areturn
  }
  
  public boolean m(Context paramContext, int paramInt, Drawable paramDrawable) {
    // Byte code:
    //   0: aload_0
    //   1: getfield g : Lb/b/p/n0$e;
    //   4: astore #8
    //   6: iconst_1
    //   7: istore #6
    //   9: aload #8
    //   11: ifnull -> 221
    //   14: aload #8
    //   16: checkcast b/b/p/j$a
    //   19: astore #9
    //   21: aload #9
    //   23: ifnull -> 219
    //   26: getstatic b/b/p/j.b : Landroid/graphics/PorterDuff$Mode;
    //   29: astore #8
    //   31: aload #9
    //   33: aload #9
    //   35: getfield a : [I
    //   38: iload_2
    //   39: invokevirtual a : ([II)Z
    //   42: istore #7
    //   44: ldc_w 16842801
    //   47: istore #4
    //   49: iload #7
    //   51: ifeq -> 61
    //   54: getstatic b/b/a.colorControlNormal : I
    //   57: istore_2
    //   58: goto -> 139
    //   61: aload #9
    //   63: aload #9
    //   65: getfield c : [I
    //   68: iload_2
    //   69: invokevirtual a : ([II)Z
    //   72: ifeq -> 82
    //   75: getstatic b/b/a.colorControlActivated : I
    //   78: istore_2
    //   79: goto -> 139
    //   82: aload #9
    //   84: aload #9
    //   86: getfield d : [I
    //   89: iload_2
    //   90: invokevirtual a : ([II)Z
    //   93: ifeq -> 107
    //   96: getstatic android/graphics/PorterDuff$Mode.MULTIPLY : Landroid/graphics/PorterDuff$Mode;
    //   99: astore #8
    //   101: iload #4
    //   103: istore_2
    //   104: goto -> 139
    //   107: iload_2
    //   108: getstatic b/b/e.abc_list_divider_mtrl_alpha : I
    //   111: if_icmpne -> 129
    //   114: ldc_w 16842800
    //   117: istore_2
    //   118: ldc_w 40.8
    //   121: invokestatic round : (F)I
    //   124: istore #4
    //   126: goto -> 142
    //   129: iload_2
    //   130: getstatic b/b/e.abc_dialog_material_background : I
    //   133: if_icmpne -> 148
    //   136: iload #4
    //   138: istore_2
    //   139: iconst_m1
    //   140: istore #4
    //   142: iconst_1
    //   143: istore #5
    //   145: goto -> 156
    //   148: iconst_0
    //   149: istore_2
    //   150: iconst_m1
    //   151: istore #4
    //   153: iconst_0
    //   154: istore #5
    //   156: iload #5
    //   158: ifeq -> 210
    //   161: aload_3
    //   162: astore #9
    //   164: aload_3
    //   165: invokestatic a : (Landroid/graphics/drawable/Drawable;)Z
    //   168: ifeq -> 177
    //   171: aload_3
    //   172: invokevirtual mutate : ()Landroid/graphics/drawable/Drawable;
    //   175: astore #9
    //   177: aload #9
    //   179: aload_1
    //   180: iload_2
    //   181: invokestatic c : (Landroid/content/Context;I)I
    //   184: aload #8
    //   186: invokestatic c : (ILandroid/graphics/PorterDuff$Mode;)Landroid/graphics/PorterDuffColorFilter;
    //   189: invokevirtual setColorFilter : (Landroid/graphics/ColorFilter;)V
    //   192: iload #4
    //   194: iconst_m1
    //   195: if_icmpeq -> 205
    //   198: aload #9
    //   200: iload #4
    //   202: invokevirtual setAlpha : (I)V
    //   205: iconst_1
    //   206: istore_2
    //   207: goto -> 212
    //   210: iconst_0
    //   211: istore_2
    //   212: iload_2
    //   213: ifeq -> 221
    //   216: goto -> 224
    //   219: aconst_null
    //   220: athrow
    //   221: iconst_0
    //   222: istore #6
    //   224: iload #6
    //   226: ireturn
  }
  
  public static class a implements d {
    public Drawable a(Context param1Context, XmlPullParser param1XmlPullParser, AttributeSet param1AttributeSet, Resources.Theme param1Theme) {
      try {
        return (Drawable)b.b.m.a.a.h(param1Context, param1Context.getResources(), param1XmlPullParser, param1AttributeSet, param1Theme);
      } catch (Exception exception) {
        Log.e("AsldcInflateDelegate", "Exception while inflating <animated-selector>", exception);
        return null;
      } 
    }
  }
  
  public static class b implements d {
    public Drawable a(Context param1Context, XmlPullParser param1XmlPullParser, AttributeSet param1AttributeSet, Resources.Theme param1Theme) {
      try {
        Resources resources = param1Context.getResources();
        b.u.a.a.b b1 = new b.u.a.a.b();
        this(param1Context, null, null);
        b1.inflate(resources, param1XmlPullParser, param1AttributeSet, param1Theme);
        return (Drawable)b1;
      } catch (Exception exception) {
        Log.e("AvdcInflateDelegate", "Exception while inflating <animated-vector>", exception);
        return null;
      } 
    }
  }
  
  public static class c extends b.f.f<Integer, PorterDuffColorFilter> {
    public c(int param1Int) {
      super(param1Int);
    }
  }
  
  public static interface d {
    Drawable a(Context param1Context, XmlPullParser param1XmlPullParser, AttributeSet param1AttributeSet, Resources.Theme param1Theme);
  }
  
  public static interface e {}
  
  public static class f implements d {
    public Drawable a(Context param1Context, XmlPullParser param1XmlPullParser, AttributeSet param1AttributeSet, Resources.Theme param1Theme) {
      try {
        return (Drawable)b.u.a.a.f.c(param1Context.getResources(), param1XmlPullParser, param1AttributeSet, param1Theme);
      } catch (Exception exception) {
        Log.e("VdcInflateDelegate", "Exception while inflating <vector>", exception);
        return null;
      } 
    }
  }
}


/* Location:              C:\Users\panch\Downloads\dvba_v1.1.0-dex2jar.jar!\b\b\p\n0.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */