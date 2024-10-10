package com.google.android.material.datepicker;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.View;
import android.widget.Adapter;
import android.widget.GridView;
import android.widget.ListAdapter;
import b.i.l.b;
import b.i.m.a;
import b.i.m.l;
import c.c.a.a.c.l.q;
import c.c.a.b.f;
import c.c.a.b.u.c;
import c.c.a.b.u.d;
import c.c.a.b.u.m;
import c.c.a.b.u.n;
import c.c.a.b.u.p;
import java.util.Calendar;

public final class MaterialCalendarGridView extends GridView {
  public final Calendar b = q.F();
  
  public MaterialCalendarGridView(Context paramContext, AttributeSet paramAttributeSet) {
    super(paramContext, paramAttributeSet, 0);
    if (n.c0(getContext())) {
      setNextFocusLeftId(f.cancel_button);
      setNextFocusRightId(f.confirm_button);
    } 
    l.W((View)this, (a)new m(this));
  }
  
  public p a() {
    return (p)super.getAdapter();
  }
  
  public void onAttachedToWindow() {
    super.onAttachedToWindow();
    a().notifyDataSetChanged();
  }
  
  public final void onDraw(Canvas paramCanvas) {
    super.onDraw(paramCanvas);
    p p = a();
    d d = p.c;
    c c = p.d;
    Long long_1 = p.b(p.a());
    Long long_2 = p.b(p.c());
    for (b b : d.d()) {
      int i;
      int j;
      int k;
      int m;
      Object object = b.a;
      if (object == null || b.b == null)
        continue; 
      long l2 = ((Long)object).longValue();
      long l1 = ((Long)b.b).longValue();
      object = Long.valueOf(l2);
      Long long_ = Long.valueOf(l1);
      if (long_1 == null || long_2 == null || object == null || long_ == null || object.longValue() > long_2.longValue() || long_.longValue() < long_1.longValue()) {
        i = 1;
      } else {
        i = 0;
      } 
      if (i)
        return; 
      if (l2 < long_1.longValue()) {
        k = p.a();
        if (k % p.b.f == 0) {
          i = 1;
        } else {
          i = 0;
        } 
        if (i) {
          i = 0;
        } else {
          i = getChildAt(k - 1).getRight();
        } 
      } else {
        this.b.setTimeInMillis(l2);
        k = this.b.get(5) - 1 + p.a();
        object = getChildAt(k);
        i = object.getLeft();
        i = object.getWidth() / 2 + i;
      } 
      if (l1 > long_2.longValue()) {
        m = p.c();
        if ((m + 1) % p.b.f == 0) {
          j = 1;
        } else {
          j = 0;
        } 
        if (j) {
          j = getWidth();
        } else {
          j = getChildAt(m).getRight();
        } 
      } else {
        this.b.setTimeInMillis(l1);
        m = this.b.get(5) - 1 + p.a();
        object = getChildAt(m);
        j = object.getLeft();
        j = object.getWidth() / 2 + j;
      } 
      int n = (int)p.getItemId(k);
      int i1 = (int)p.getItemId(m);
      while (n <= i1) {
        int i2;
        int i8 = getNumColumns() * n;
        int i3 = getNumColumns();
        object = getChildAt(i8);
        int i5 = object.getTop();
        int i6 = c.a.a.top;
        int i4 = object.getBottom();
        int i7 = c.a.a.bottom;
        if (i8 > k) {
          i2 = 0;
        } else {
          i2 = i;
        } 
        if (m > i3 + i8 - 1) {
          i3 = getWidth();
        } else {
          i3 = j;
        } 
        paramCanvas.drawRect(i2, (i5 + i6), i3, (i4 - i7), c.h);
        n++;
      } 
    } 
  }
  
  public void onFocusChanged(boolean paramBoolean, int paramInt, Rect paramRect) {
    if (paramBoolean) {
      if (paramInt == 33) {
        paramInt = a().c();
      } else if (paramInt == 130) {
        paramInt = a().a();
      } else {
        super.onFocusChanged(true, paramInt, paramRect);
        return;
      } 
      setSelection(paramInt);
    } else {
      super.onFocusChanged(false, paramInt, paramRect);
    } 
  }
  
  public boolean onKeyDown(int paramInt, KeyEvent paramKeyEvent) {
    if (!super.onKeyDown(paramInt, paramKeyEvent))
      return false; 
    if (getSelectedItemPosition() == -1 || getSelectedItemPosition() >= a().a())
      return true; 
    if (19 == paramInt) {
      setSelection(a().a());
      return true;
    } 
    return false;
  }
  
  public final void setAdapter(ListAdapter paramListAdapter) {
    if (paramListAdapter instanceof p) {
      super.setAdapter(paramListAdapter);
      return;
    } 
    throw new IllegalArgumentException(String.format("%1$s must have its Adapter set to a %2$s", new Object[] { MaterialCalendarGridView.class.getCanonicalName(), p.class.getCanonicalName() }));
  }
  
  public void setSelection(int paramInt) {
    int i = paramInt;
    if (paramInt < a().a())
      i = a().a(); 
    super.setSelection(i);
  }
}


/* Location:              C:\Users\panch\Downloads\dvba_v1.1.0-dex2jar.jar!\com\google\android\material\datepicker\MaterialCalendarGridView.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */