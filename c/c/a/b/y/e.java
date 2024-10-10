package c.c.a.b.y;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import b.i.m.l;
import c.c.a.b.k;

public class e extends ViewGroup {
  public int b;
  
  public int c;
  
  public boolean d = false;
  
  public e(Context paramContext, AttributeSet paramAttributeSet) {
    this(paramContext, paramAttributeSet, 0);
  }
  
  public e(Context paramContext, AttributeSet paramAttributeSet, int paramInt) {
    super(paramContext, paramAttributeSet, paramInt);
    TypedArray typedArray = paramContext.getTheme().obtainStyledAttributes(paramAttributeSet, k.FlowLayout, 0, 0);
    this.b = typedArray.getDimensionPixelSize(k.FlowLayout_lineSpacing, 0);
    this.c = typedArray.getDimensionPixelSize(k.FlowLayout_itemSpacing, 0);
    typedArray.recycle();
  }
  
  public boolean a() {
    return this.d;
  }
  
  public int getItemSpacing() {
    return this.c;
  }
  
  public int getLineSpacing() {
    return this.b;
  }
  
  public void onLayout(boolean paramBoolean, int paramInt1, int paramInt2, int paramInt3, int paramInt4) {
    if (getChildCount() == 0)
      return; 
    paramInt2 = l.r((View)this);
    boolean bool = true;
    if (paramInt2 != 1)
      bool = false; 
    if (bool) {
      paramInt2 = getPaddingRight();
    } else {
      paramInt2 = getPaddingLeft();
    } 
    if (bool) {
      paramInt4 = getPaddingLeft();
    } else {
      paramInt4 = getPaddingRight();
    } 
    int i = getPaddingTop();
    int j = paramInt3 - paramInt1 - paramInt4;
    paramInt4 = paramInt2;
    paramInt3 = i;
    byte b = 0;
    while (b < getChildCount()) {
      View view = getChildAt(b);
      if (view.getVisibility() == 8) {
        paramInt1 = paramInt3;
      } else {
        byte b1;
        byte b2;
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
          ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams)layoutParams;
          b1 = marginLayoutParams.getMarginStart();
          b2 = marginLayoutParams.getMarginEnd();
        } else {
          b2 = 0;
          b1 = 0;
        } 
        int m = view.getMeasuredWidth();
        int k = paramInt4;
        paramInt1 = paramInt3;
        if (!this.d) {
          k = paramInt4;
          paramInt1 = paramInt3;
          if (m + paramInt4 + b1 > j) {
            paramInt1 = this.b + i;
            k = paramInt2;
          } 
        } 
        paramInt4 = k + b1;
        m = view.getMeasuredWidth() + paramInt4;
        i = view.getMeasuredHeight() + paramInt1;
        paramInt3 = m;
        if (bool) {
          paramInt4 = j - m;
          paramInt3 = j - k - b1;
        } 
        view.layout(paramInt4, paramInt1, paramInt3, i);
        paramInt4 = k + view.getMeasuredWidth() + b1 + b2 + this.c;
      } 
      b++;
      paramInt3 = paramInt1;
    } 
  }
  
  public void onMeasure(int paramInt1, int paramInt2) {
    int n;
    int m = View.MeasureSpec.getSize(paramInt1);
    int i4 = View.MeasureSpec.getMode(paramInt1);
    int i2 = View.MeasureSpec.getSize(paramInt2);
    int i3 = View.MeasureSpec.getMode(paramInt2);
    if (i4 == Integer.MIN_VALUE || i4 == 1073741824) {
      n = m;
    } else {
      n = Integer.MAX_VALUE;
    } 
    int k = getPaddingLeft();
    int i1 = getPaddingTop();
    int i5 = getPaddingRight();
    int j = i1;
    byte b = 0;
    int i = 0;
    while (b < getChildCount()) {
      int i6;
      View view = getChildAt(b);
      if (view.getVisibility() == 8) {
        i6 = j;
      } else {
        byte b1;
        byte b2;
        measureChild(view, paramInt1, paramInt2);
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
          ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams)layoutParams;
          b2 = marginLayoutParams.leftMargin + 0;
          b1 = marginLayoutParams.rightMargin + 0;
        } else {
          b1 = 0;
          b2 = 0;
        } 
        int i7 = k;
        i6 = j;
        if (view.getMeasuredWidth() + k + b2 > n - i5) {
          i7 = k;
          i6 = j;
          if (!a()) {
            i7 = getPaddingLeft();
            i6 = i1 + this.b;
          } 
        } 
        k = view.getMeasuredWidth() + i7 + b2;
        i1 = view.getMeasuredHeight();
        j = i;
        if (k > i)
          j = k; 
        int i8 = view.getMeasuredWidth();
        k = this.c;
        i = j;
        if (b == getChildCount() - 1)
          i = j + b1; 
        k = i8 + b2 + b1 + k + i7;
        i1 += i6;
      } 
      b++;
      j = i6;
    } 
    paramInt2 = getPaddingRight() + i;
    i = getPaddingBottom() + i1;
    if (i4 != Integer.MIN_VALUE) {
      paramInt1 = m;
      if (i4 != 1073741824)
        paramInt1 = paramInt2; 
    } else {
      paramInt1 = Math.min(paramInt2, m);
    } 
    if (i3 != Integer.MIN_VALUE) {
      paramInt2 = i2;
      if (i3 != 1073741824)
        paramInt2 = i; 
    } else {
      paramInt2 = Math.min(i, i2);
    } 
    setMeasuredDimension(paramInt1, paramInt2);
  }
  
  public void setItemSpacing(int paramInt) {
    this.c = paramInt;
  }
  
  public void setLineSpacing(int paramInt) {
    this.b = paramInt;
  }
  
  public void setSingleLine(boolean paramBoolean) {
    this.d = paramBoolean;
  }
}


/* Location:              C:\Users\panch\Downloads\dvba_v1.1.0-dex2jar.jar!\c\c\a\b\y\e.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */