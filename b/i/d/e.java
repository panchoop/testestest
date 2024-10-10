package b.i.d;

import android.app.PendingIntent;
import android.os.Bundle;
import androidx.core.graphics.drawable.IconCompat;

public class e {
  public final Bundle a;
  
  public IconCompat b;
  
  public final k[] c;
  
  public final k[] d;
  
  public boolean e;
  
  public boolean f;
  
  public final int g;
  
  public final boolean h;
  
  @Deprecated
  public int i;
  
  public CharSequence j;
  
  public PendingIntent k;
  
  public e(int paramInt, CharSequence paramCharSequence, PendingIntent paramPendingIntent) {
    // Byte code:
    //   0: iload_1
    //   1: ifne -> 10
    //   4: aconst_null
    //   5: astore #7
    //   7: goto -> 19
    //   10: aconst_null
    //   11: ldc ''
    //   13: iload_1
    //   14: invokestatic b : (Landroid/content/res/Resources;Ljava/lang/String;I)Landroidx/core/graphics/drawable/IconCompat;
    //   17: astore #7
    //   19: new android/os/Bundle
    //   22: dup
    //   23: invokespecial <init> : ()V
    //   26: astore #9
    //   28: aload_0
    //   29: invokespecial <init> : ()V
    //   32: aload_0
    //   33: iconst_1
    //   34: putfield f : Z
    //   37: aload_0
    //   38: aload #7
    //   40: putfield b : Landroidx/core/graphics/drawable/IconCompat;
    //   43: aload #7
    //   45: ifnull -> 229
    //   48: aload #7
    //   50: getfield a : I
    //   53: istore #4
    //   55: iconst_m1
    //   56: istore_1
    //   57: iload #4
    //   59: iconst_m1
    //   60: if_icmpne -> 209
    //   63: getstatic android/os/Build$VERSION.SDK_INT : I
    //   66: istore #4
    //   68: iload #4
    //   70: bipush #23
    //   72: if_icmplt -> 209
    //   75: aload #7
    //   77: getfield b : Ljava/lang/Object;
    //   80: checkcast android/graphics/drawable/Icon
    //   83: astore #8
    //   85: iload #4
    //   87: bipush #28
    //   89: if_icmplt -> 101
    //   92: aload #8
    //   94: invokevirtual getType : ()I
    //   97: istore_1
    //   98: goto -> 215
    //   101: aload #8
    //   103: invokevirtual getClass : ()Ljava/lang/Class;
    //   106: ldc 'getType'
    //   108: iconst_0
    //   109: anewarray java/lang/Class
    //   112: invokevirtual getMethod : (Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;
    //   115: aload #8
    //   117: iconst_0
    //   118: anewarray java/lang/Object
    //   121: invokevirtual invoke : (Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
    //   124: checkcast java/lang/Integer
    //   127: invokevirtual intValue : ()I
    //   130: istore #4
    //   132: iload #4
    //   134: istore_1
    //   135: goto -> 215
    //   138: astore #5
    //   140: new java/lang/StringBuilder
    //   143: dup
    //   144: invokespecial <init> : ()V
    //   147: astore #6
    //   149: goto -> 177
    //   152: astore #5
    //   154: new java/lang/StringBuilder
    //   157: dup
    //   158: invokespecial <init> : ()V
    //   161: astore #6
    //   163: goto -> 177
    //   166: astore #5
    //   168: new java/lang/StringBuilder
    //   171: dup
    //   172: invokespecial <init> : ()V
    //   175: astore #6
    //   177: aload #6
    //   179: ldc 'Unable to get icon type '
    //   181: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   184: pop
    //   185: aload #6
    //   187: aload #8
    //   189: invokevirtual append : (Ljava/lang/Object;)Ljava/lang/StringBuilder;
    //   192: pop
    //   193: ldc 'IconCompat'
    //   195: aload #6
    //   197: invokevirtual toString : ()Ljava/lang/String;
    //   200: aload #5
    //   202: invokestatic e : (Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I
    //   205: pop
    //   206: goto -> 215
    //   209: aload #7
    //   211: getfield a : I
    //   214: istore_1
    //   215: iload_1
    //   216: iconst_2
    //   217: if_icmpne -> 229
    //   220: aload_0
    //   221: aload #7
    //   223: invokevirtual c : ()I
    //   226: putfield i : I
    //   229: aload_0
    //   230: aload_2
    //   231: invokestatic a : (Ljava/lang/CharSequence;)Ljava/lang/CharSequence;
    //   234: putfield j : Ljava/lang/CharSequence;
    //   237: aload_0
    //   238: aload_3
    //   239: putfield k : Landroid/app/PendingIntent;
    //   242: aload_0
    //   243: aload #9
    //   245: putfield a : Landroid/os/Bundle;
    //   248: aload_0
    //   249: aconst_null
    //   250: putfield c : [Lb/i/d/k;
    //   253: aload_0
    //   254: aconst_null
    //   255: putfield d : [Lb/i/d/k;
    //   258: aload_0
    //   259: iconst_1
    //   260: putfield e : Z
    //   263: aload_0
    //   264: iconst_0
    //   265: putfield g : I
    //   268: aload_0
    //   269: iconst_1
    //   270: putfield f : Z
    //   273: aload_0
    //   274: iconst_0
    //   275: putfield h : Z
    //   278: return
    // Exception table:
    //   from	to	target	type
    //   101	132	166	java/lang/IllegalAccessException
    //   101	132	152	java/lang/reflect/InvocationTargetException
    //   101	132	138	java/lang/NoSuchMethodException
  }
  
  public IconCompat a() {
    if (this.b == null) {
      int i = this.i;
      if (i != 0)
        this.b = IconCompat.b(null, "", i); 
    } 
    return this.b;
  }
}


/* Location:              C:\Users\panch\Downloads\dvba_v1.1.0-dex2jar.jar!\b\i\d\e.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */