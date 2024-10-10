package c.c.a.b.u;

import a.a.a.a.a;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.InsetDrawable;
import android.graphics.drawable.RippleDrawable;
import android.view.View;
import android.widget.TextView;
import b.i.m.l;
import c.c.a.a.c.l.q;
import c.c.a.b.d0.a;
import c.c.a.b.d0.c;
import c.c.a.b.d0.g;
import c.c.a.b.d0.j;
import c.c.a.b.k;

public final class b {
  public final Rect a;
  
  public final ColorStateList b;
  
  public final ColorStateList c;
  
  public final ColorStateList d;
  
  public final int e;
  
  public final j f;
  
  public b(ColorStateList paramColorStateList1, ColorStateList paramColorStateList2, ColorStateList paramColorStateList3, int paramInt, j paramj, Rect paramRect) {
    a.f(paramRect.left);
    a.f(paramRect.top);
    a.f(paramRect.right);
    a.f(paramRect.bottom);
    this.a = paramRect;
    this.b = paramColorStateList2;
    this.c = paramColorStateList1;
    this.d = paramColorStateList3;
    this.e = paramInt;
    this.f = paramj;
  }
  
  public static b a(Context paramContext, int paramInt) {
    boolean bool;
    if (paramInt != 0) {
      bool = true;
    } else {
      bool = false;
    } 
    if (bool) {
      TypedArray typedArray = paramContext.obtainStyledAttributes(paramInt, k.MaterialCalendarItem);
      Rect rect = new Rect(typedArray.getDimensionPixelOffset(k.MaterialCalendarItem_android_insetLeft, 0), typedArray.getDimensionPixelOffset(k.MaterialCalendarItem_android_insetTop, 0), typedArray.getDimensionPixelOffset(k.MaterialCalendarItem_android_insetRight, 0), typedArray.getDimensionPixelOffset(k.MaterialCalendarItem_android_insetBottom, 0));
      ColorStateList colorStateList3 = q.z(paramContext, typedArray, k.MaterialCalendarItem_itemFillColor);
      ColorStateList colorStateList2 = q.z(paramContext, typedArray, k.MaterialCalendarItem_itemTextColor);
      ColorStateList colorStateList1 = q.z(paramContext, typedArray, k.MaterialCalendarItem_itemStrokeColor);
      paramInt = typedArray.getDimensionPixelSize(k.MaterialCalendarItem_itemStrokeWidth, 0);
      j j1 = j.a(paramContext, typedArray.getResourceId(k.MaterialCalendarItem_itemShapeAppearance, 0), typedArray.getResourceId(k.MaterialCalendarItem_itemShapeAppearanceOverlay, 0), (c)new a(false)).a();
      typedArray.recycle();
      return new b(colorStateList3, colorStateList2, colorStateList1, paramInt, j1, rect);
    } 
    throw new IllegalArgumentException("Cannot create a CalendarItemStyle with a styleResId of 0");
  }
  
  public void b(TextView paramTextView) {
    g g2 = new g();
    g g1 = new g();
    g2.setShapeAppearanceModel(this.f);
    g1.setShapeAppearanceModel(this.f);
    g2.q(this.c);
    g2.t(this.e, this.d);
    paramTextView.setTextColor(this.b);
    RippleDrawable rippleDrawable = new RippleDrawable(this.b.withAlpha(30), (Drawable)g2, (Drawable)g1);
    Rect rect = this.a;
    l.Z((View)paramTextView, (Drawable)new InsetDrawable((Drawable)rippleDrawable, rect.left, rect.top, rect.right, rect.bottom));
  }
}


/* Location:              C:\Users\panch\Downloads\dvba_v1.1.0-dex2jar.jar!\c\c\a\\\u\b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */