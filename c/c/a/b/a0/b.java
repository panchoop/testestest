package c.c.a.b.a0;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Typeface;
import android.text.TextPaint;
import android.util.Log;
import android.util.TypedValue;
import b.i.e.b.g;
import c.c.a.a.c.l.q;
import c.c.a.b.k;

public class b {
  public final float a;
  
  public final ColorStateList b;
  
  public final int c;
  
  public final int d;
  
  public final String e;
  
  public final ColorStateList f;
  
  public final float g;
  
  public final float h;
  
  public final float i;
  
  public final int j;
  
  public boolean k = false;
  
  public Typeface l;
  
  public b(Context paramContext, int paramInt) {
    TypedArray typedArray = paramContext.obtainStyledAttributes(paramInt, k.TextAppearance);
    this.a = typedArray.getDimension(k.TextAppearance_android_textSize, 0.0F);
    this.b = q.z(paramContext, typedArray, k.TextAppearance_android_textColor);
    q.z(paramContext, typedArray, k.TextAppearance_android_textColorHint);
    q.z(paramContext, typedArray, k.TextAppearance_android_textColorLink);
    this.c = typedArray.getInt(k.TextAppearance_android_textStyle, 0);
    this.d = typedArray.getInt(k.TextAppearance_android_typeface, 1);
    int i = k.TextAppearance_fontFamily;
    paramInt = k.TextAppearance_android_fontFamily;
    if (typedArray.hasValue(i))
      paramInt = i; 
    this.j = typedArray.getResourceId(paramInt, 0);
    this.e = typedArray.getString(paramInt);
    typedArray.getBoolean(k.TextAppearance_textAllCaps, false);
    this.f = q.z(paramContext, typedArray, k.TextAppearance_android_shadowColor);
    this.g = typedArray.getFloat(k.TextAppearance_android_shadowDx, 0.0F);
    this.h = typedArray.getFloat(k.TextAppearance_android_shadowDy, 0.0F);
    this.i = typedArray.getFloat(k.TextAppearance_android_shadowRadius, 0.0F);
    typedArray.recycle();
  }
  
  public final void a() {
    if (this.l == null) {
      String str = this.e;
      if (str != null)
        this.l = Typeface.create(str, this.c); 
    } 
    if (this.l == null) {
      Typeface typeface;
      int i = this.d;
      if (i != 1) {
        if (i != 2) {
          if (i != 3) {
            typeface = Typeface.DEFAULT;
          } else {
            typeface = Typeface.MONOSPACE;
          } 
        } else {
          typeface = Typeface.SERIF;
        } 
      } else {
        typeface = Typeface.SANS_SERIF;
      } 
      this.l = typeface;
      this.l = Typeface.create(this.l, this.c);
    } 
  }
  
  public void b(Context paramContext, d paramd) {
    a();
    if (this.j == 0)
      this.k = true; 
    if (this.k) {
      paramd.b(this.l, true);
      return;
    } 
    try {
      int i = this.j;
      a a = new a();
      this(this, paramd);
      if (paramContext.isRestricted()) {
        a.a(-4, null);
      } else {
        TypedValue typedValue = new TypedValue();
        this();
        a.a.a.a.a.V(paramContext, i, typedValue, 0, a, null, false);
      } 
    } catch (android.content.res.Resources.NotFoundException notFoundException) {
      this.k = true;
      paramd.a(1);
    } catch (Exception exception) {
      StringBuilder stringBuilder = c.a.a.a.a.e("Error loading font ");
      stringBuilder.append(this.e);
      Log.d("TextAppearance", stringBuilder.toString(), exception);
      this.k = true;
      paramd.a(-3);
    } 
  }
  
  public void c(Context paramContext, TextPaint paramTextPaint, d paramd) {
    int i;
    a();
    d(paramTextPaint, this.l);
    b(paramContext, new c(this, paramTextPaint, paramd));
    ColorStateList colorStateList = this.b;
    if (colorStateList != null) {
      i = colorStateList.getColorForState(paramTextPaint.drawableState, colorStateList.getDefaultColor());
    } else {
      i = -16777216;
    } 
    paramTextPaint.setColor(i);
    float f1 = this.i;
    float f2 = this.g;
    float f3 = this.h;
    colorStateList = this.f;
    if (colorStateList != null) {
      i = colorStateList.getColorForState(paramTextPaint.drawableState, colorStateList.getDefaultColor());
    } else {
      i = 0;
    } 
    paramTextPaint.setShadowLayer(f1, f2, f3, i);
  }
  
  public void d(TextPaint paramTextPaint, Typeface paramTypeface) {
    float f;
    boolean bool;
    paramTextPaint.setTypeface(paramTypeface);
    int i = this.c;
    i = (paramTypeface.getStyle() ^ 0xFFFFFFFF) & i;
    if ((i & 0x1) != 0) {
      bool = true;
    } else {
      bool = false;
    } 
    paramTextPaint.setFakeBoldText(bool);
    if ((i & 0x2) != 0) {
      f = -0.25F;
    } else {
      f = 0.0F;
    } 
    paramTextPaint.setTextSkewX(f);
    paramTextPaint.setTextSize(this.a);
  }
  
  public class a extends g {
    public final d a;
    
    public final b b;
    
    public a(b this$0, d param1d) {}
    
    public void c(int param1Int) {
      this.b.k = true;
      this.a.a(param1Int);
    }
    
    public void d(Typeface param1Typeface) {
      b b2 = this.b;
      b2.l = Typeface.create(param1Typeface, b2.c);
      b b1 = this.b;
      b1.k = true;
      this.a.b(b1.l, false);
    }
  }
}


/* Location:              C:\Users\panch\Downloads\dvba_v1.1.0-dex2jar.jar!\c\c\a\b\a0\b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */