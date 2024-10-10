package b.b.o.i;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.view.menu.ActionMenuItemView;
import androidx.appcompat.widget.ActionMenuView;
import b.b.p.c;
import java.util.ArrayList;

public abstract class b implements m {
  public Context b;
  
  public Context c;
  
  public g d;
  
  public LayoutInflater e;
  
  public m.a f;
  
  public int g;
  
  public int h;
  
  public n i;
  
  public b(Context paramContext, int paramInt1, int paramInt2) {
    this.b = paramContext;
    this.e = LayoutInflater.from(paramContext);
    this.g = paramInt1;
    this.h = paramInt2;
  }
  
  public View a(i parami, View paramView, ViewGroup paramViewGroup) {
    n.a a1;
    if (paramView instanceof n.a) {
      a1 = (n.a)paramView;
    } else {
      a1 = (n.a)this.e.inflate(this.h, paramViewGroup, false);
    } 
    c c = (c)this;
    a1.e(parami, 0);
    ActionMenuView actionMenuView = (ActionMenuView)((b)c).i;
    ActionMenuItemView actionMenuItemView = (ActionMenuItemView)a1;
    actionMenuItemView.setItemInvoker((g.b)actionMenuView);
    if (c.x == null)
      c.x = new c.b(c); 
    actionMenuItemView.setPopupCallback((ActionMenuItemView.b)c.x);
    return (View)a1;
  }
  
  public boolean c(g paramg, i parami) {
    return false;
  }
  
  public void d(m.a parama) {
    this.f = parama;
  }
  
  public boolean f(r paramr) {
    m.a a1 = this.f;
    if (a1 != null) {
      g g1;
      if (paramr == null)
        g1 = this.d; 
      return a1.c(g1);
    } 
    return false;
  }
  
  public void h(boolean paramBoolean) {
    byte b1;
    ViewGroup viewGroup = (ViewGroup)this.i;
    if (viewGroup == null)
      return; 
    g g1 = this.d;
    if (g1 != null) {
      g1.i();
      ArrayList<i> arrayList = this.d.l();
      int j = arrayList.size();
      byte b2 = 0;
      int i = 0;
      while (true) {
        b1 = i;
        if (b2 < j) {
          i i1 = arrayList.get(b2);
          b1 = i;
          if (i1.g()) {
            View view1 = viewGroup.getChildAt(i);
            if (view1 instanceof n.a) {
              i i2 = ((n.a)view1).getItemData();
            } else {
              g1 = null;
            } 
            View view2 = a(i1, view1, viewGroup);
            if (i1 != g1) {
              view2.setPressed(false);
              view2.jumpDrawablesToCurrentState();
            } 
            if (view2 != view1) {
              ViewGroup viewGroup1 = (ViewGroup)view2.getParent();
              if (viewGroup1 != null)
                viewGroup1.removeView(view2); 
              ((ViewGroup)this.i).addView(view2, i);
            } 
            b1 = i + 1;
          } 
          b2++;
          i = b1;
          continue;
        } 
        break;
      } 
    } else {
      b1 = 0;
    } 
    while (b1 < viewGroup.getChildCount()) {
      boolean bool;
      c c = (c)this;
      if (viewGroup.getChildAt(b1) == c.j) {
        bool = false;
      } else {
        viewGroup.removeViewAt(b1);
        bool = true;
      } 
      if (!bool)
        b1++; 
    } 
  }
  
  public boolean k(g paramg, i parami) {
    return false;
  }
}


/* Location:              C:\Users\panch\Downloads\dvba_v1.1.0-dex2jar.jar!\b\b\o\i\b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */