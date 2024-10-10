package c.c.a.b.e0;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.widget.FrameLayout;
import b.i.m.l;
import c.c.a.b.k;
import c.c.a.b.y.i;

public class d extends FrameLayout {
  public static final View.OnTouchListener g = new a();
  
  public c b;
  
  public b c;
  
  public int d;
  
  public final float e;
  
  public final float f;
  
  public d(Context paramContext, AttributeSet paramAttributeSet) {
    super(i.d(paramContext, paramAttributeSet, 0, 0), paramAttributeSet);
    TypedArray typedArray = getContext().obtainStyledAttributes(paramAttributeSet, k.SnackbarLayout);
    if (typedArray.hasValue(k.SnackbarLayout_elevation))
      l.b0((View)this, typedArray.getDimensionPixelSize(k.SnackbarLayout_elevation, 0)); 
    this.d = typedArray.getInt(k.SnackbarLayout_animationMode, 0);
    this.e = typedArray.getFloat(k.SnackbarLayout_backgroundOverlayColorAlpha, 1.0F);
    this.f = typedArray.getFloat(k.SnackbarLayout_actionTextColorAlpha, 1.0F);
    typedArray.recycle();
    setOnTouchListener(g);
    setFocusable(true);
  }
  
  public float getActionTextColorAlpha() {
    return this.f;
  }
  
  public int getAnimationMode() {
    return this.d;
  }
  
  public float getBackgroundOverlayColorAlpha() {
    return this.e;
  }
  
  public void onAttachedToWindow() {
    super.onAttachedToWindow();
    b b1 = this.c;
    if (b1 != null)
      b1.onViewAttachedToWindow((View)this); 
    l.U((View)this);
  }
  
  public void onDetachedFromWindow() {
    super.onDetachedFromWindow();
    b b1 = this.c;
    if (b1 != null)
      b1.onViewDetachedFromWindow((View)this); 
  }
  
  public void onLayout(boolean paramBoolean, int paramInt1, int paramInt2, int paramInt3, int paramInt4) {
    super.onLayout(paramBoolean, paramInt1, paramInt2, paramInt3, paramInt4);
    c c1 = this.b;
    if (c1 != null)
      c1.a((View)this, paramInt1, paramInt2, paramInt3, paramInt4); 
  }
  
  public void setAnimationMode(int paramInt) {
    this.d = paramInt;
  }
  
  public void setOnAttachStateChangeListener(b paramb) {
    this.c = paramb;
  }
  
  public void setOnClickListener(View.OnClickListener paramOnClickListener) {
    View.OnTouchListener onTouchListener;
    if (paramOnClickListener != null) {
      onTouchListener = null;
    } else {
      onTouchListener = g;
    } 
    setOnTouchListener(onTouchListener);
    super.setOnClickListener(paramOnClickListener);
  }
  
  public void setOnLayoutChangeListener(c paramc) {
    this.b = paramc;
  }
  
  public static final class a implements View.OnTouchListener {
    @SuppressLint({"ClickableViewAccessibility"})
    public boolean onTouch(View param1View, MotionEvent param1MotionEvent) {
      return true;
    }
  }
}


/* Location:              C:\Users\panch\Downloads\dvba_v1.1.0-dex2jar.jar!\c\c\a\b\e0\d.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */