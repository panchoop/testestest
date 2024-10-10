package com.google.android.material.appbar;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import androidx.appcompat.widget.Toolbar;
import b.i.m.l;
import c.c.a.a.c.l.q;
import c.c.a.b.d0.g;
import c.c.a.b.j;
import c.c.a.b.v.a;
import c.c.a.b.y.i;

public class MaterialToolbar extends Toolbar {
  public static final int O = j.Widget_MaterialComponents_Toolbar;
  
  public MaterialToolbar(Context paramContext, AttributeSet paramAttributeSet) {
    super(i.d(paramContext, paramAttributeSet, i, O), paramAttributeSet, i);
    paramContext = getContext();
    Drawable drawable = getBackground();
    if (drawable == null || drawable instanceof ColorDrawable) {
      g g = new g();
      if (drawable != null) {
        i = ((ColorDrawable)drawable).getColor();
      } else {
        i = 0;
      } 
      g.q(ColorStateList.valueOf(i));
      g.b.b = new a(paramContext);
      g.x();
      g.p(l.m((View)this));
      setBackground((Drawable)g);
    } 
  }
  
  public void onAttachedToWindow() {
    super.onAttachedToWindow();
    Drawable drawable = getBackground();
    if (drawable instanceof g)
      q.Y((View)this, (g)drawable); 
  }
  
  public void setElevation(float paramFloat) {
    super.setElevation(paramFloat);
    q.X((View)this, paramFloat);
  }
}


/* Location:              C:\Users\panch\Downloads\dvba_v1.1.0-dex2jar.jar!\com\google\android\material\appbar\MaterialToolbar.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */