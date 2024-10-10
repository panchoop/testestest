package b.b.p;

import android.annotation.SuppressLint;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.DrawableContainer;
import android.graphics.drawable.ScaleDrawable;
import android.os.Build;
import b.b.m.a.c;
import b.i.f.k.b;

@SuppressLint({"RestrictedAPI"})
public class e0 {
  public static final int[] a = new int[] { 16842912 };
  
  public static final int[] b = new int[0];
  
  static {
    new Rect();
    try {
      Class.forName("android.graphics.Insets");
    } catch (ClassNotFoundException classNotFoundException) {}
  }
  
  public static boolean a(Drawable paramDrawable) {
    Drawable[] arrayOfDrawable;
    if (paramDrawable instanceof DrawableContainer) {
      Drawable.ConstantState constantState = paramDrawable.getConstantState();
      if (constantState instanceof DrawableContainer.DrawableContainerState) {
        arrayOfDrawable = ((DrawableContainer.DrawableContainerState)constantState).getChildren();
        int i = arrayOfDrawable.length;
        for (byte b = 0; b < i; b++) {
          if (!a(arrayOfDrawable[b]))
            return false; 
        } 
      } 
    } else {
      Drawable drawable;
      if (arrayOfDrawable instanceof b) {
        drawable = ((b)arrayOfDrawable).a();
        return a(drawable);
      } 
      if (drawable instanceof c)
        return a(((c)drawable).b); 
      if (drawable instanceof ScaleDrawable) {
        drawable = ((ScaleDrawable)drawable).getDrawable();
        return a(drawable);
      } 
    } 
    return true;
  }
  
  public static void b(Drawable paramDrawable) {
    if (Build.VERSION.SDK_INT == 21 && "android.graphics.drawable.VectorDrawable".equals(paramDrawable.getClass().getName())) {
      int[] arrayOfInt = paramDrawable.getState();
      if (arrayOfInt == null || arrayOfInt.length == 0) {
        paramDrawable.setState(a);
      } else {
        paramDrawable.setState(b);
      } 
      paramDrawable.setState(arrayOfInt);
    } 
  }
  
  public static PorterDuff.Mode c(int paramInt, PorterDuff.Mode paramMode) {
    if (paramInt != 3) {
      if (paramInt != 5) {
        if (paramInt != 9) {
          switch (paramInt) {
            default:
              return paramMode;
            case 16:
              return PorterDuff.Mode.ADD;
            case 15:
              return PorterDuff.Mode.SCREEN;
            case 14:
              break;
          } 
          return PorterDuff.Mode.MULTIPLY;
        } 
        return PorterDuff.Mode.SRC_ATOP;
      } 
      return PorterDuff.Mode.SRC_IN;
    } 
    return PorterDuff.Mode.SRC_OVER;
  }
}


/* Location:              C:\Users\panch\Downloads\dvba_v1.1.0-dex2jar.jar!\b\b\p\e0.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */