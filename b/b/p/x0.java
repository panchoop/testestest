package b.b.p;

import a.a.a.a.a;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.util.TypedValue;
import b.b.l.a.a;
import b.i.e.b.g;

public class x0 {
  public final Context a;
  
  public final TypedArray b;
  
  public TypedValue c;
  
  public x0(Context paramContext, TypedArray paramTypedArray) {
    this.a = paramContext;
    this.b = paramTypedArray;
  }
  
  public static x0 p(Context paramContext, AttributeSet paramAttributeSet, int[] paramArrayOfint) {
    return new x0(paramContext, paramContext.obtainStyledAttributes(paramAttributeSet, paramArrayOfint));
  }
  
  public static x0 q(Context paramContext, AttributeSet paramAttributeSet, int[] paramArrayOfint, int paramInt1, int paramInt2) {
    return new x0(paramContext, paramContext.obtainStyledAttributes(paramAttributeSet, paramArrayOfint, paramInt1, paramInt2));
  }
  
  public boolean a(int paramInt, boolean paramBoolean) {
    return this.b.getBoolean(paramInt, paramBoolean);
  }
  
  public int b(int paramInt1, int paramInt2) {
    return this.b.getColor(paramInt1, paramInt2);
  }
  
  public ColorStateList c(int paramInt) {
    if (this.b.hasValue(paramInt)) {
      int i = this.b.getResourceId(paramInt, 0);
      if (i != 0) {
        ColorStateList colorStateList = a.a(this.a, i);
        if (colorStateList != null)
          return colorStateList; 
      } 
    } 
    return this.b.getColorStateList(paramInt);
  }
  
  public float d(int paramInt, float paramFloat) {
    return this.b.getDimension(paramInt, paramFloat);
  }
  
  public int e(int paramInt1, int paramInt2) {
    return this.b.getDimensionPixelOffset(paramInt1, paramInt2);
  }
  
  public int f(int paramInt1, int paramInt2) {
    return this.b.getDimensionPixelSize(paramInt1, paramInt2);
  }
  
  public Drawable g(int paramInt) {
    if (this.b.hasValue(paramInt)) {
      int i = this.b.getResourceId(paramInt, 0);
      if (i != 0)
        return a.b(this.a, i); 
    } 
    return this.b.getDrawable(paramInt);
  }
  
  public Drawable h(int paramInt) {
    if (this.b.hasValue(paramInt)) {
      paramInt = this.b.getResourceId(paramInt, 0);
      if (paramInt != 0) {
        j j = j.a();
        synchronized (this.a) {
          Drawable drawable = j.a.g(null, paramInt, true);
          /* monitor exit ClassFileLocalVariableReferenceExpression{type=ObjectType{b/b/p/j}, name=null} */
          return drawable;
        } 
      } 
    } 
    return null;
  }
  
  public Typeface i(int paramInt1, int paramInt2, g paramg) {
    Typeface typeface;
    paramInt1 = this.b.getResourceId(paramInt1, 0);
    g g1 = null;
    if (paramInt1 == 0)
      return null; 
    if (this.c == null)
      this.c = new TypedValue(); 
    Context context = this.a;
    TypedValue typedValue = this.c;
    if (context.isRestricted()) {
      paramg = g1;
    } else {
      typeface = a.V(context, paramInt1, typedValue, paramInt2, paramg, null, true);
    } 
    return typeface;
  }
  
  public int j(int paramInt1, int paramInt2) {
    return this.b.getInt(paramInt1, paramInt2);
  }
  
  public int k(int paramInt1, int paramInt2) {
    return this.b.getLayoutDimension(paramInt1, paramInt2);
  }
  
  public int l(int paramInt1, int paramInt2) {
    return this.b.getResourceId(paramInt1, paramInt2);
  }
  
  public String m(int paramInt) {
    return this.b.getString(paramInt);
  }
  
  public CharSequence n(int paramInt) {
    return this.b.getText(paramInt);
  }
  
  public boolean o(int paramInt) {
    return this.b.hasValue(paramInt);
  }
}


/* Location:              C:\Users\panch\Downloads\dvba_v1.1.0-dex2jar.jar!\b\b\p\x0.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */