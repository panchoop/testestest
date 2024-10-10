package androidx.cardview.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Color;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.widget.FrameLayout;
import b.e.b;
import b.e.c;
import b.e.d;
import b.e.e.b;
import b.e.e.c;
import b.e.e.d;

public class CardView extends FrameLayout {
  public static final int[] i = new int[] { 16842801 };
  
  public static final c j = (c)new b.e.e.a();
  
  public boolean b;
  
  public boolean c;
  
  public int d;
  
  public int e;
  
  public final Rect f;
  
  public final Rect g;
  
  public final b h;
  
  public CardView(Context paramContext, AttributeSet paramAttributeSet) {
    super(paramContext, paramAttributeSet, i);
    ColorStateList colorStateList;
    this.f = new Rect();
    this.g = new Rect();
    this.h = new a(this);
    TypedArray typedArray = paramContext.obtainStyledAttributes(paramAttributeSet, d.CardView, i, c.CardView);
    if (typedArray.hasValue(d.CardView_cardBackgroundColor)) {
      colorStateList = typedArray.getColorStateList(d.CardView_cardBackgroundColor);
    } else {
      Resources resources;
      TypedArray typedArray1 = getContext().obtainStyledAttributes(i);
      i = typedArray1.getColor(0, 0);
      typedArray1.recycle();
      float[] arrayOfFloat = new float[3];
      Color.colorToHSV(i, arrayOfFloat);
      if (arrayOfFloat[2] > 0.5F) {
        resources = getResources();
        i = b.cardview_light_background;
      } else {
        resources = getResources();
        i = b.cardview_dark_background;
      } 
      colorStateList = ColorStateList.valueOf(resources.getColor(i));
    } 
    float f4 = typedArray.getDimension(d.CardView_cardCornerRadius, 0.0F);
    float f2 = typedArray.getDimension(d.CardView_cardElevation, 0.0F);
    float f3 = typedArray.getDimension(d.CardView_cardMaxElevation, 0.0F);
    this.b = typedArray.getBoolean(d.CardView_cardUseCompatPadding, false);
    this.c = typedArray.getBoolean(d.CardView_cardPreventCornerOverlap, true);
    i = typedArray.getDimensionPixelSize(d.CardView_contentPadding, 0);
    this.f.left = typedArray.getDimensionPixelSize(d.CardView_contentPaddingLeft, i);
    this.f.top = typedArray.getDimensionPixelSize(d.CardView_contentPaddingTop, i);
    this.f.right = typedArray.getDimensionPixelSize(d.CardView_contentPaddingRight, i);
    this.f.bottom = typedArray.getDimensionPixelSize(d.CardView_contentPaddingBottom, i);
    float f1 = f3;
    if (f2 > f3)
      f1 = f2; 
    this.d = typedArray.getDimensionPixelSize(d.CardView_android_minWidth, 0);
    this.e = typedArray.getDimensionPixelSize(d.CardView_android_minHeight, 0);
    typedArray.recycle();
    c c1 = j;
    b b1 = this.h;
    b.e.e.a a = (b.e.e.a)c1;
    d d = new d(colorStateList, f4);
    a a1 = (a)b1;
    a1.a = (Drawable)d;
    a1.b.setBackgroundDrawable((Drawable)d);
    CardView cardView = a1.b;
    cardView.setClipToOutline(true);
    cardView.setElevation(f2);
    a.d(b1, f1);
  }
  
  public ColorStateList getCardBackgroundColor() {
    c c1 = j;
    b b1 = this.h;
    return (((b.e.e.a)c1).a(b1)).h;
  }
  
  public float getCardElevation() {
    return ((a)this.h).b.getElevation();
  }
  
  public int getContentPaddingBottom() {
    return this.f.bottom;
  }
  
  public int getContentPaddingLeft() {
    return this.f.left;
  }
  
  public int getContentPaddingRight() {
    return this.f.right;
  }
  
  public int getContentPaddingTop() {
    return this.f.top;
  }
  
  public float getMaxCardElevation() {
    c c1 = j;
    b b1 = this.h;
    return ((b.e.e.a)c1).b(b1);
  }
  
  public boolean getPreventCornerOverlap() {
    return this.c;
  }
  
  public float getRadius() {
    c c1 = j;
    b b1 = this.h;
    return ((b.e.e.a)c1).c(b1);
  }
  
  public boolean getUseCompatPadding() {
    return this.b;
  }
  
  public void onMeasure(int paramInt1, int paramInt2) {
    super.onMeasure(paramInt1, paramInt2);
  }
  
  public void setCardBackgroundColor(int paramInt) {
    c c1 = j;
    b b1 = this.h;
    ColorStateList colorStateList = ColorStateList.valueOf(paramInt);
    d d = ((b.e.e.a)c1).a(b1);
    d.b(colorStateList);
    d.invalidateSelf();
  }
  
  public void setCardBackgroundColor(ColorStateList paramColorStateList) {
    c c1 = j;
    b b1 = this.h;
    d d = ((b.e.e.a)c1).a(b1);
    d.b(paramColorStateList);
    d.invalidateSelf();
  }
  
  public void setCardElevation(float paramFloat) {
    ((a)this.h).b.setElevation(paramFloat);
  }
  
  public void setMaxCardElevation(float paramFloat) {
    c c1 = j;
    b b1 = this.h;
    ((b.e.e.a)c1).d(b1, paramFloat);
  }
  
  public void setMinimumHeight(int paramInt) {
    this.e = paramInt;
    super.setMinimumHeight(paramInt);
  }
  
  public void setMinimumWidth(int paramInt) {
    this.d = paramInt;
    super.setMinimumWidth(paramInt);
  }
  
  public void setPadding(int paramInt1, int paramInt2, int paramInt3, int paramInt4) {}
  
  public void setPaddingRelative(int paramInt1, int paramInt2, int paramInt3, int paramInt4) {}
  
  public void setPreventCornerOverlap(boolean paramBoolean) {
    if (paramBoolean != this.c) {
      this.c = paramBoolean;
      c c1 = j;
      b b1 = this.h;
      b.e.e.a a = (b.e.e.a)c1;
      a.d(b1, (a.a(b1)).e);
    } 
  }
  
  public void setRadius(float paramFloat) {
    c c1 = j;
    b b1 = this.h;
    d d = ((b.e.e.a)c1).a(b1);
    if (paramFloat != d.a) {
      d.a = paramFloat;
      d.c(null);
      d.invalidateSelf();
    } 
  }
  
  public void setUseCompatPadding(boolean paramBoolean) {
    if (this.b != paramBoolean) {
      this.b = paramBoolean;
      c c1 = j;
      b b1 = this.h;
      b.e.e.a a = (b.e.e.a)c1;
      a.d(b1, (a.a(b1)).e);
    } 
  }
  
  public class a implements b {
    public Drawable a;
    
    public final CardView b;
    
    public a(CardView this$0) {}
    
    public boolean a() {
      return this.b.getPreventCornerOverlap();
    }
    
    public void b(int param1Int1, int param1Int2, int param1Int3, int param1Int4) {
      this.b.g.set(param1Int1, param1Int2, param1Int3, param1Int4);
      CardView cardView = this.b;
      Rect rect = cardView.f;
      CardView.c(cardView, param1Int1 + rect.left, param1Int2 + rect.top, param1Int3 + rect.right, param1Int4 + rect.bottom);
    }
  }
}


/* Location:              C:\Users\panch\Downloads\dvba_v1.1.0-dex2jar.jar!\androidx\cardview\widget\CardView.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */