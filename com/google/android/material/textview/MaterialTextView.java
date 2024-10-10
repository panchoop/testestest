package com.google.android.material.textview;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.util.TypedValue;
import b.b.p.z;
import c.c.a.a.c.l.q;
import c.c.a.b.b;
import c.c.a.b.k;

public class MaterialTextView extends z {
  public MaterialTextView(Context paramContext, AttributeSet paramAttributeSet) {
    super(paramContext, paramAttributeSet, 16842884);
    int j = b.textAppearanceLineHeightEnabled;
    int i = 1;
    if (q.V(paramContext, j, true)) {
      Resources.Theme theme = paramContext.getTheme();
      TypedArray typedArray = theme.obtainStyledAttributes(paramAttributeSet, k.MaterialTextView, 16842884, 0);
      j = f(paramContext, typedArray, new int[] { k.MaterialTextView_android_lineHeight, k.MaterialTextView_lineHeight });
      typedArray.recycle();
      if (j == -1)
        i = 0; 
      if (!i) {
        TypedArray typedArray1 = theme.obtainStyledAttributes(paramAttributeSet, k.MaterialTextView, 16842884, 0);
        i = typedArray1.getResourceId(k.MaterialTextView_android_textAppearance, -1);
        typedArray1.recycle();
        if (i != -1)
          d(theme, i); 
      } 
    } 
  }
  
  public static int f(Context paramContext, TypedArray paramTypedArray, int... paramVarArgs) {
    byte b = 0;
    int i = -1;
    while (b < paramVarArgs.length && i < 0) {
      i = paramVarArgs[b];
      TypedValue typedValue = new TypedValue();
      if (!paramTypedArray.getValue(i, typedValue) || typedValue.type != 2) {
        i = paramTypedArray.getDimensionPixelSize(i, -1);
      } else {
        TypedArray typedArray = paramContext.getTheme().obtainStyledAttributes(new int[] { typedValue.data });
        i = typedArray.getDimensionPixelSize(0, -1);
        typedArray.recycle();
      } 
      b++;
    } 
    return i;
  }
  
  public final void d(Resources.Theme paramTheme, int paramInt) {
    TypedArray typedArray = paramTheme.obtainStyledAttributes(paramInt, k.MaterialTextAppearance);
    paramInt = f(getContext(), typedArray, new int[] { k.MaterialTextAppearance_android_lineHeight, k.MaterialTextAppearance_lineHeight });
    typedArray.recycle();
    if (paramInt >= 0)
      setLineHeight(paramInt); 
  }
  
  public void setTextAppearance(Context paramContext, int paramInt) {
    super.setTextAppearance(paramContext, paramInt);
    if (q.V(paramContext, b.textAppearanceLineHeightEnabled, true))
      d(paramContext.getTheme(), paramInt); 
  }
}


/* Location:              C:\Users\panch\Downloads\dvba_v1.1.0-dex2jar.jar!\com\google\android\material\textview\MaterialTextView.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */