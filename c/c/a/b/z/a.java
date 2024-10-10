package c.c.a.b.z;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import b.b.p.r;
import c.c.a.a.c.l.q;
import c.c.a.b.b;
import c.c.a.b.j;
import c.c.a.b.k;
import c.c.a.b.y.i;

public class a extends r {
  public static final int g = j.Widget_MaterialComponents_CompoundButton_RadioButton;
  
  public static final int[][] h = new int[][] { { 16842910, 16842912 }, { 16842910, -16842912 }, { -16842910, 16842912 }, { -16842910, -16842912 } };
  
  public ColorStateList e;
  
  public boolean f;
  
  public a(Context paramContext, AttributeSet paramAttributeSet) {
    super(i.d(paramContext, paramAttributeSet, i, g), paramAttributeSet, i);
    TypedArray typedArray = i.e(getContext(), paramAttributeSet, k.MaterialRadioButton, i, g, new int[0]);
    this.f = typedArray.getBoolean(k.MaterialRadioButton_useMaterialThemeColors, false);
    typedArray.recycle();
  }
  
  private ColorStateList getMaterialThemeColorsTintList() {
    if (this.e == null) {
      int j = q.y((View)this, b.colorControlActivated);
      int i = q.y((View)this, b.colorOnSurface);
      int k = q.y((View)this, b.colorSurface);
      int[] arrayOfInt = new int[h.length];
      arrayOfInt[0] = q.K(k, j, 1.0F);
      arrayOfInt[1] = q.K(k, i, 0.54F);
      arrayOfInt[2] = q.K(k, i, 0.38F);
      arrayOfInt[3] = q.K(k, i, 0.38F);
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


/* Location:              C:\Users\panch\Downloads\dvba_v1.1.0-dex2jar.jar!\c\c\a\b\z\a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */