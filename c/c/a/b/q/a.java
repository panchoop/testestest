package c.c.a.b.q;

import android.content.res.ColorStateList;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.Checkable;
import android.widget.FrameLayout;
import androidx.cardview.widget.CardView;
import c.c.a.b.b;
import c.c.a.b.d0.j;
import c.c.a.b.d0.n;

public class a extends CardView implements Checkable, n {
  public static final int[] n = new int[] { 16842911 };
  
  public static final int[] o = new int[] { 16842912 };
  
  public static final int[] p = new int[] { b.state_dragged };
  
  public boolean k;
  
  public boolean l;
  
  public a m;
  
  public ColorStateList getCardBackgroundColor() {
    throw null;
  }
  
  public float getCardViewRadius() {
    return super.getRadius();
  }
  
  public Drawable getCheckedIcon() {
    throw null;
  }
  
  public ColorStateList getCheckedIconTint() {
    throw null;
  }
  
  public int getContentPaddingBottom() {
    throw null;
  }
  
  public int getContentPaddingLeft() {
    throw null;
  }
  
  public int getContentPaddingRight() {
    throw null;
  }
  
  public int getContentPaddingTop() {
    throw null;
  }
  
  public float getProgress() {
    throw null;
  }
  
  public float getRadius() {
    throw null;
  }
  
  public ColorStateList getRippleColor() {
    throw null;
  }
  
  public j getShapeAppearanceModel() {
    throw null;
  }
  
  @Deprecated
  public int getStrokeColor() {
    throw null;
  }
  
  public ColorStateList getStrokeColorStateList() {
    throw null;
  }
  
  public int getStrokeWidth() {
    throw null;
  }
  
  public boolean isChecked() {
    return this.k;
  }
  
  public void onAttachedToWindow() {
    super.onAttachedToWindow();
    throw null;
  }
  
  public int[] onCreateDrawableState(int paramInt) {
    int[] arrayOfInt = super.onCreateDrawableState(paramInt + 3);
    if (isChecked())
      FrameLayout.mergeDrawableStates(arrayOfInt, o); 
    if (this.l)
      FrameLayout.mergeDrawableStates(arrayOfInt, p); 
    return arrayOfInt;
  }
  
  public void onInitializeAccessibilityEvent(AccessibilityEvent paramAccessibilityEvent) {
    super.onInitializeAccessibilityEvent(paramAccessibilityEvent);
    paramAccessibilityEvent.setClassName(CardView.class.getName());
    paramAccessibilityEvent.setChecked(isChecked());
  }
  
  public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo paramAccessibilityNodeInfo) {
    super.onInitializeAccessibilityNodeInfo(paramAccessibilityNodeInfo);
    paramAccessibilityNodeInfo.setClassName(CardView.class.getName());
    paramAccessibilityNodeInfo.setCheckable(false);
    paramAccessibilityNodeInfo.setClickable(isClickable());
    paramAccessibilityNodeInfo.setChecked(isChecked());
  }
  
  public void onMeasure(int paramInt1, int paramInt2) {
    super.onMeasure(paramInt1, paramInt2);
    getMeasuredWidth();
    getMeasuredHeight();
    throw null;
  }
  
  public void setBackground(Drawable paramDrawable) {
    setBackgroundDrawable(paramDrawable);
  }
  
  public void setBackgroundDrawable(Drawable paramDrawable) {}
  
  public void setBackgroundInternal(Drawable paramDrawable) {
    super.setBackgroundDrawable(paramDrawable);
  }
  
  public void setCardBackgroundColor(int paramInt) {
    ColorStateList.valueOf(paramInt);
    throw null;
  }
  
  public void setCardBackgroundColor(ColorStateList paramColorStateList) {
    throw null;
  }
  
  public void setCardElevation(float paramFloat) {
    super.setCardElevation(paramFloat);
    throw null;
  }
  
  public void setCheckable(boolean paramBoolean) {
    throw null;
  }
  
  public void setChecked(boolean paramBoolean) {
    if (this.k != paramBoolean)
      toggle(); 
  }
  
  public void setCheckedIcon(Drawable paramDrawable) {
    throw null;
  }
  
  public void setCheckedIconResource(int paramInt) {
    b.b.l.a.a.b(getContext(), paramInt);
    throw null;
  }
  
  public void setCheckedIconTint(ColorStateList paramColorStateList) {
    throw null;
  }
  
  public void setClickable(boolean paramBoolean) {
    super.setClickable(paramBoolean);
    throw null;
  }
  
  public void setDragged(boolean paramBoolean) {
    if (this.l != paramBoolean) {
      this.l = paramBoolean;
      refreshDrawableState();
      if (Build.VERSION.SDK_INT <= 26) {
        invalidate();
      } else {
        throw null;
      } 
    } 
  }
  
  public void setMaxCardElevation(float paramFloat) {
    super.setMaxCardElevation(paramFloat);
    throw null;
  }
  
  public void setOnCheckedChangeListener(a parama) {
    this.m = parama;
  }
  
  public void setPreventCornerOverlap(boolean paramBoolean) {
    super.setPreventCornerOverlap(paramBoolean);
    throw null;
  }
  
  public void setProgress(float paramFloat) {
    throw null;
  }
  
  public void setRadius(float paramFloat) {
    super.setRadius(paramFloat);
    throw null;
  }
  
  public void setRippleColor(ColorStateList paramColorStateList) {
    throw null;
  }
  
  public void setRippleColorResource(int paramInt) {
    b.b.l.a.a.a(getContext(), paramInt);
    throw null;
  }
  
  public void setShapeAppearanceModel(j paramj) {
    throw null;
  }
  
  public void setStrokeColor(int paramInt) {
    ColorStateList.valueOf(paramInt);
    throw null;
  }
  
  public void setStrokeColor(ColorStateList paramColorStateList) {
    throw null;
  }
  
  public void setStrokeWidth(int paramInt) {
    throw null;
  }
  
  public void setUseCompatPadding(boolean paramBoolean) {
    super.setUseCompatPadding(paramBoolean);
    throw null;
  }
  
  public void toggle() {}
  
  public static interface a {}
}


/* Location:              C:\Users\panch\Downloads\dvba_v1.1.0-dex2jar.jar!\c\c\a\b\q\a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */