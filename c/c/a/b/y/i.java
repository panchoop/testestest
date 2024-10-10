package c.c.a.b.y;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.util.TypedValue;
import c.c.a.b.b;
import c.c.a.b.k;

public final class i {
  public static final int[] a = new int[] { b.colorPrimary };
  
  public static final int[] b = new int[] { b.colorPrimaryVariant };
  
  public static final int[] c = new int[] { 16842752, b.theme };
  
  public static final int[] d = new int[] { b.materialThemeOverlay };
  
  public static void a(Context paramContext, AttributeSet paramAttributeSet, int paramInt1, int paramInt2) {
    TypedArray typedArray = paramContext.obtainStyledAttributes(paramAttributeSet, k.ThemeEnforcement, paramInt1, paramInt2);
    boolean bool = typedArray.getBoolean(k.ThemeEnforcement_enforceMaterialTheme, false);
    typedArray.recycle();
    if (bool) {
      TypedValue typedValue = new TypedValue();
      if (!paramContext.getTheme().resolveAttribute(b.isMaterialTheme, typedValue, true) || (typedValue.type == 18 && typedValue.data == 0))
        c(paramContext, b, "Theme.MaterialComponents"); 
    } 
    c(paramContext, a, "Theme.AppCompat");
  }
  
  public static void b(Context paramContext, AttributeSet paramAttributeSet, int[] paramArrayOfint1, int paramInt1, int paramInt2, int... paramVarArgs1) {
    // Byte code:
    //   0: aload_0
    //   1: aload_1
    //   2: getstatic c/c/a/b/k.ThemeEnforcement : [I
    //   5: iload_3
    //   6: iload #4
    //   8: invokevirtual obtainStyledAttributes : (Landroid/util/AttributeSet;[III)Landroid/content/res/TypedArray;
    //   11: astore #8
    //   13: getstatic c/c/a/b/k.ThemeEnforcement_enforceTextAppearance : I
    //   16: istore #7
    //   18: iconst_0
    //   19: istore #6
    //   21: aload #8
    //   23: iload #7
    //   25: iconst_0
    //   26: invokevirtual getBoolean : (IZ)Z
    //   29: ifne -> 38
    //   32: aload #8
    //   34: invokevirtual recycle : ()V
    //   37: return
    //   38: aload #5
    //   40: ifnull -> 111
    //   43: aload #5
    //   45: arraylength
    //   46: ifne -> 52
    //   49: goto -> 111
    //   52: aload_0
    //   53: aload_1
    //   54: aload_2
    //   55: iload_3
    //   56: iload #4
    //   58: invokevirtual obtainStyledAttributes : (Landroid/util/AttributeSet;[III)Landroid/content/res/TypedArray;
    //   61: astore_0
    //   62: aload #5
    //   64: arraylength
    //   65: istore #4
    //   67: iconst_0
    //   68: istore_3
    //   69: iload_3
    //   70: iload #4
    //   72: if_icmpge -> 104
    //   75: aload_0
    //   76: aload #5
    //   78: iload_3
    //   79: iaload
    //   80: iconst_m1
    //   81: invokevirtual getResourceId : (II)I
    //   84: iconst_m1
    //   85: if_icmpne -> 98
    //   88: aload_0
    //   89: invokevirtual recycle : ()V
    //   92: iload #6
    //   94: istore_3
    //   95: goto -> 129
    //   98: iinc #3, 1
    //   101: goto -> 69
    //   104: aload_0
    //   105: invokevirtual recycle : ()V
    //   108: goto -> 127
    //   111: iload #6
    //   113: istore_3
    //   114: aload #8
    //   116: getstatic c/c/a/b/k.ThemeEnforcement_android_textAppearance : I
    //   119: iconst_m1
    //   120: invokevirtual getResourceId : (II)I
    //   123: iconst_m1
    //   124: if_icmpeq -> 129
    //   127: iconst_1
    //   128: istore_3
    //   129: aload #8
    //   131: invokevirtual recycle : ()V
    //   134: iload_3
    //   135: ifeq -> 139
    //   138: return
    //   139: new java/lang/IllegalArgumentException
    //   142: dup
    //   143: ldc 'This component requires that you specify a valid TextAppearance attribute. Update your app theme to inherit from Theme.MaterialComponents (or a descendant).'
    //   145: invokespecial <init> : (Ljava/lang/String;)V
    //   148: athrow
  }
  
  public static void c(Context paramContext, int[] paramArrayOfint, String paramString) {
    TypedArray typedArray = paramContext.obtainStyledAttributes(paramArrayOfint);
    boolean bool = false;
    byte b = 0;
    while (true) {
      if (b < paramArrayOfint.length) {
        if (!typedArray.hasValue(b)) {
          typedArray.recycle();
          b = bool;
          break;
        } 
        b++;
        continue;
      } 
      typedArray.recycle();
      b = 1;
      break;
    } 
    if (b != 0)
      return; 
    StringBuilder stringBuilder = new StringBuilder();
    stringBuilder.append("The style on this component requires your app theme to be ");
    stringBuilder.append(paramString);
    stringBuilder.append(" (or a descendant).");
    throw new IllegalArgumentException(stringBuilder.toString());
  }
  
  public static Context d(Context paramContext, AttributeSet paramAttributeSet, int paramInt1, int paramInt2) {
    // Byte code:
    //   0: aload_0
    //   1: aload_1
    //   2: getstatic c/c/a/b/y/i.d : [I
    //   5: iload_2
    //   6: iload_3
    //   7: invokevirtual obtainStyledAttributes : (Landroid/util/AttributeSet;[III)Landroid/content/res/TypedArray;
    //   10: astore #4
    //   12: aload #4
    //   14: iconst_0
    //   15: iconst_0
    //   16: invokevirtual getResourceId : (II)I
    //   19: istore_2
    //   20: aload #4
    //   22: invokevirtual recycle : ()V
    //   25: aload_0
    //   26: astore #4
    //   28: iload_2
    //   29: ifeq -> 120
    //   32: aload_0
    //   33: instanceof b/b/o/c
    //   36: ifeq -> 53
    //   39: aload_0
    //   40: astore #4
    //   42: aload_0
    //   43: checkcast b/b/o/c
    //   46: getfield a : I
    //   49: iload_2
    //   50: if_icmpeq -> 120
    //   53: new b/b/o/c
    //   56: dup
    //   57: aload_0
    //   58: iload_2
    //   59: invokespecial <init> : (Landroid/content/Context;I)V
    //   62: astore #4
    //   64: aload #4
    //   66: aload_1
    //   67: getstatic c/c/a/b/y/i.c : [I
    //   70: invokevirtual obtainStyledAttributes : (Landroid/util/AttributeSet;[I)Landroid/content/res/TypedArray;
    //   73: astore_0
    //   74: aload_0
    //   75: iconst_0
    //   76: iconst_0
    //   77: invokevirtual getResourceId : (II)I
    //   80: istore_2
    //   81: aload_0
    //   82: iconst_1
    //   83: iconst_0
    //   84: invokevirtual getResourceId : (II)I
    //   87: istore_3
    //   88: aload_0
    //   89: invokevirtual recycle : ()V
    //   92: iload_2
    //   93: ifeq -> 99
    //   96: goto -> 101
    //   99: iload_3
    //   100: istore_2
    //   101: iload_2
    //   102: ifeq -> 120
    //   105: new b/b/o/c
    //   108: dup
    //   109: aload #4
    //   111: iload_2
    //   112: invokespecial <init> : (Landroid/content/Context;I)V
    //   115: astore #4
    //   117: goto -> 120
    //   120: aload #4
    //   122: areturn
  }
  
  public static TypedArray e(Context paramContext, AttributeSet paramAttributeSet, int[] paramArrayOfint1, int paramInt1, int paramInt2, int... paramVarArgs1) {
    a(paramContext, paramAttributeSet, paramInt1, paramInt2);
    b(paramContext, paramAttributeSet, paramArrayOfint1, paramInt1, paramInt2, paramVarArgs1);
    return paramContext.obtainStyledAttributes(paramAttributeSet, paramArrayOfint1, paramInt1, paramInt2);
  }
}


/* Location:              C:\Users\panch\Downloads\dvba_v1.1.0-dex2jar.jar!\c\c\a\b\y\i.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */