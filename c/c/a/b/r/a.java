package c.c.a.b.r;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import b.b.p.g;
import c.c.a.a.c.l.q;
import c.c.a.b.b;
import c.c.a.b.j;
import c.c.a.b.k;
import c.c.a.b.y.i;

public class a extends g {
  public static final int g = j.Widget_MaterialComponents_CompoundButton_CheckBox;
  
  public static final int[][] h = new int[][] { { 16842910, 16842912 }, { 16842910, -16842912 }, { -16842910, 16842912 }, { -16842910, -16842912 } };
  
  public ColorStateList e;
  
  public boolean f;
  
  public a(Context paramContext, AttributeSet paramAttributeSet) {
    super(i.d(paramContext, paramAttributeSet, i, g), paramAttributeSet, i);
    paramContext = getContext();
    TypedArray typedArray = i.e(paramContext, paramAttributeSet, k.MaterialCheckBox, i, g, new int[0]);
    if (typedArray.hasValue(k.MaterialCheckBox_buttonTint))
      setButtonTintList(q.z(paramContext, typedArray, k.MaterialCheckBox_buttonTint)); 
    this.f = typedArray.getBoolean(k.MaterialCheckBox_useMaterialThemeColors, false);
    typedArray.recycle();
  }
  
  private ColorStateList getMaterialThemeColorsTintList() {
    if (this.e == null) {
      int[] arrayOfInt = new int[h.length];
      int j = q.y((View)this, b.colorControlActivated);
      int i = q.y((View)this, b.colorSurface);
      int k = q.y((View)this, b.colorOnSurface);
      arrayOfInt[0] = q.K(i, j, 1.0F);
      arrayOfInt[1] = q.K(i, k, 0.54F);
      arrayOfInt[2] = q.K(i, k, 0.38F);
      arrayOfInt[3] = q.K(i, k, 0.38F);
      this.e = new ColorStateList(h, arrayOfInt);
    } 
    return this.e;
  }
  
  public void onAttachedToWindow() {
    super.onAttachedToWindow();
    if (this.f && getButtonTintList() == null)
      setUseMaterialThemeColors(true); 
  }
  
  public void setUseMaterialThemeColors(boolean paramBoolean) {
    ColorStateList colorStateList;
    this.f = paramBoolean;
    if (paramBoolean) {
      colorStateList = getMaterialThemeColorsTintList();
    } else {
      colorStateList = null;
    } 
    setButtonTintList(colorStateList);
  }
}


/* Location:              C:\Users\panch\Downloads\dvba_v1.1.0-dex2jar.jar!\c\c\a\b\r\a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */