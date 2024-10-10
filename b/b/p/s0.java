package b.b.p;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Color;
import android.util.Log;
import android.util.TypedValue;
import android.view.View;
import b.b.j;
import b.b.l.a.a;
import b.i.f.a;

public class s0 {
  public static final ThreadLocal<TypedValue> a = new ThreadLocal<TypedValue>();
  
  public static final int[] b = new int[] { -16842910 };
  
  public static final int[] c = new int[] { 16842908 };
  
  public static final int[] d = new int[] { 16842919 };
  
  public static final int[] e = new int[] { 16842912 };
  
  public static final int[] f = new int[0];
  
  public static final int[] g = new int[1];
  
  public static void a(View paramView, Context paramContext) {
    TypedArray typedArray = paramContext.obtainStyledAttributes(j.AppCompatTheme);
    try {
      if (!typedArray.hasValue(j.AppCompatTheme_windowActionBar)) {
        StringBuilder stringBuilder = new StringBuilder();
        this();
        stringBuilder.append("View ");
        stringBuilder.append(paramView.getClass());
        stringBuilder.append(" is an AppCompat widget that can only be used with a Theme.AppCompat theme (or descendant).");
        Log.e("ThemeUtils", stringBuilder.toString());
      } 
      return;
    } finally {
      typedArray.recycle();
    } 
  }
  
  public static int b(Context paramContext, int paramInt) {
    ColorStateList colorStateList = d(paramContext, paramInt);
    if (colorStateList != null && colorStateList.isStateful())
      return colorStateList.getColorForState(b, colorStateList.getDefaultColor()); 
    TypedValue typedValue2 = a.get();
    TypedValue typedValue1 = typedValue2;
    if (typedValue2 == null) {
      typedValue1 = new TypedValue();
      a.set(typedValue1);
    } 
    paramContext.getTheme().resolveAttribute(16842803, typedValue1, true);
    float f = typedValue1.getFloat();
    paramInt = c(paramContext, paramInt);
    return a.c(paramInt, Math.round(Color.alpha(paramInt) * f));
  }
  
  public static int c(Context paramContext, int paramInt) {
    null = g;
    null[0] = paramInt;
    TypedArray typedArray = paramContext.obtainStyledAttributes(null, null);
    try {
      paramInt = typedArray.getColor(0, 0);
      return paramInt;
    } finally {
      typedArray.recycle();
    } 
  }
  
  public static ColorStateList d(Context paramContext, int paramInt) {
    int[] arrayOfInt = g;
    arrayOfInt[0] = paramInt;
    TypedArray typedArray = paramContext.obtainStyledAttributes(null, arrayOfInt);
    try {
      if (typedArray.hasValue(0)) {
        paramInt = typedArray.getResourceId(0, 0);
        if (paramInt != 0) {
          ColorStateList colorStateList1 = a.a(paramContext, paramInt);
          if (colorStateList1 != null) {
            typedArray.recycle();
            return colorStateList1;
          } 
        } 
      } 
    } finally {}
    ColorStateList colorStateList = typedArray.getColorStateList(0);
    typedArray.recycle();
    return colorStateList;
  }
}


/* Location:              C:\Users\panch\Downloads\dvba_v1.1.0-dex2jar.jar!\b\b\p\s0.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */