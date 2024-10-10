package c.c.a.b.b0;

import android.content.res.ColorStateList;
import android.graphics.Color;
import android.os.Build;
import android.util.Log;

public class a {
  public static final boolean a = true;
  
  public static final int[] b = new int[] { 16842910, 16842919 };
  
  public static final String c = a.class.getSimpleName();
  
  public static ColorStateList a(ColorStateList paramColorStateList) {
    if (paramColorStateList != null) {
      int i = Build.VERSION.SDK_INT;
      if (i >= 22 && i <= 27 && Color.alpha(paramColorStateList.getDefaultColor()) == 0 && Color.alpha(paramColorStateList.getColorForState(b, 0)) != 0)
        Log.w(c, "Use a non-transparent color for the default color as it will be used to finish ripple animations."); 
      return paramColorStateList;
    } 
    return ColorStateList.valueOf(0);
  }
  
  public static boolean b(int[] paramArrayOfint) {
    // Byte code:
    //   0: aload_0
    //   1: arraylength
    //   2: istore #5
    //   4: iconst_0
    //   5: istore #8
    //   7: iconst_0
    //   8: istore_2
    //   9: iconst_0
    //   10: istore_1
    //   11: iconst_0
    //   12: istore #4
    //   14: iload_2
    //   15: iload #5
    //   17: if_icmpge -> 82
    //   20: aload_0
    //   21: iload_2
    //   22: iaload
    //   23: istore #6
    //   25: iload #6
    //   27: ldc 16842910
    //   29: if_icmpne -> 37
    //   32: iconst_1
    //   33: istore_3
    //   34: goto -> 74
    //   37: iload #6
    //   39: ldc 16842908
    //   41: if_icmpne -> 52
    //   44: iconst_1
    //   45: istore #4
    //   47: iload_1
    //   48: istore_3
    //   49: goto -> 74
    //   52: iload #6
    //   54: ldc 16842919
    //   56: if_icmpne -> 62
    //   59: goto -> 44
    //   62: iload_1
    //   63: istore_3
    //   64: iload #6
    //   66: ldc 16843623
    //   68: if_icmpne -> 74
    //   71: goto -> 44
    //   74: iinc #2, 1
    //   77: iload_3
    //   78: istore_1
    //   79: goto -> 14
    //   82: iload #8
    //   84: istore #7
    //   86: iload_1
    //   87: ifeq -> 102
    //   90: iload #8
    //   92: istore #7
    //   94: iload #4
    //   96: ifeq -> 102
    //   99: iconst_1
    //   100: istore #7
    //   102: iload #7
    //   104: ireturn
  }
}


/* Location:              C:\Users\panch\Downloads\dvba_v1.1.0-dex2jar.jar!\c\c\a\b\b0\a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */