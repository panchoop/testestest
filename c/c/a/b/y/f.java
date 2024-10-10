package c.c.a.b.y;

import android.annotation.TargetApi;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.Gravity;
import b.b.p.i0;
import c.c.a.b.k;

public class f extends i0 {
  public Drawable q;
  
  public final Rect r = new Rect();
  
  public final Rect s = new Rect();
  
  public int t = 119;
  
  public boolean u = true;
  
  public boolean v = false;
  
  public f(Context paramContext, AttributeSet paramAttributeSet) {
    this(paramContext, paramAttributeSet, 0);
  }
  
  public f(Context paramContext, AttributeSet paramAttributeSet, int paramInt) {
    super(paramContext, paramAttributeSet, paramInt);
    TypedArray typedArray = i.e(paramContext, paramAttributeSet, k.ForegroundLinearLayout, paramInt, 0, new int[0]);
    this.t = typedArray.getInt(k.ForegroundLinearLayout_android_foregroundGravity, this.t);
    Drawable drawable = typedArray.getDrawable(k.ForegroundLinearLayout_android_foreground);
    if (drawable != null)
      setForeground(drawable); 
    this.u = typedArray.getBoolean(k.ForegroundLinearLayout_foregroundInsidePadding, true);
    typedArray.recycle();
  }
  
  public void draw(Canvas paramCanvas) {
    super.draw(paramCanvas);
    Drawable drawable = this.q;
    if (drawable != null) {
      if (this.v) {
        this.v = false;
        Rect rect1 = this.r;
        Rect rect2 = this.s;
        int i = getRight() - getLeft();
        int j = getBottom() - getTop();
        if (this.u) {
          rect1.set(0, 0, i, j);
        } else {
          rect1.set(getPaddingLeft(), getPaddingTop(), i - getPaddingRight(), j - getPaddingBottom());
        } 
        Gravity.apply(this.t, drawable.getIntrinsicWidth(), drawable.getIntrinsicHeight(), rect1, rect2);
        drawable.setBounds(rect2);
      } 
      drawable.draw(paramCanvas);
    } 
  }
  
  @TargetApi(21)
  public void drawableHotspotChanged(float paramFloat1, float paramFloat2) {
    super.drawableHotspotChanged(paramFloat1, paramFloat2);
    Drawable drawable = this.q;
    if (drawable != null)
      drawable.setHotspot(paramFloat1, paramFloat2); 
  }
  
  public void drawableStateChanged() {
    super.drawableStateChanged();
    Drawable drawable = this.q;
    if (drawable != null && drawable.isStateful())
      this.q.setState(getDrawableState()); 
  }
  
  public Drawable getForeground() {
    return this.q;
  }
  
  public int getForegroundGravity() {
    return this.t;
  }
  
  public void jumpDrawablesToCurrentState() {
    super.jumpDrawablesToCurrentState();
    Drawable drawable = this.q;
    if (drawable != null)
      drawable.jumpToCurrentState(); 
  }
  
  public void onLayout(boolean paramBoolean, int paramInt1, int paramInt2, int paramInt3, int paramInt4) {
    super.onLayout(paramBoolean, paramInt1, paramInt2, paramInt3, paramInt4);
    this.v = paramBoolean | this.v;
  }
  
  public void onSizeChanged(int paramInt1, int paramInt2, int paramInt3, int paramInt4) {
    super.onSizeChanged(paramInt1, paramInt2, paramInt3, paramInt4);
    this.v = true;
  }
  
  public void setForeground(Drawable paramDrawable) {
    Drawable drawable = this.q;
    if (drawable != paramDrawable) {
      if (drawable != null) {
        drawable.setCallback(null);
        unscheduleDrawable(this.q);
      } 
      this.q = paramDrawable;
      if (paramDrawable != null) {
        setWillNotDraw(false);
        paramDrawable.setCallback((Drawable.Callback)this);
        if (paramDrawable.isStateful())
          paramDrawable.setState(getDrawableState()); 
        if (this.t == 119)
          paramDrawable.getPadding(new Rect()); 
      } else {
        setWillNotDraw(true);
      } 
      requestLayout();
      invalidate();
    } 
  }
  
  public void setForegroundGravity(int paramInt) {
    if (this.t != paramInt) {
      int i = paramInt;
      if ((0x800007 & paramInt) == 0)
        i = paramInt | 0x800003; 
      paramInt = i;
      if ((i & 0x70) == 0)
        paramInt = i | 0x30; 
      this.t = paramInt;
      if (paramInt == 119 && this.q != null) {
        Rect rect = new Rect();
        this.q.getPadding(rect);
      } 
      requestLayout();
    } 
  }
  
  public boolean verifyDrawable(Drawable paramDrawable) {
    return (super.verifyDrawable(paramDrawable) || paramDrawable == this.q);
  }
}


/* Location:              C:\Users\panch\Downloads\dvba_v1.1.0-dex2jar.jar!\c\c\a\b\y\f.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */