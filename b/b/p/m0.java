package b.b.p;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.AttributeSet;
import android.util.Log;
import android.view.KeyEvent;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.view.View;
import android.widget.HeaderViewListAdapter;
import android.widget.ListAdapter;
import android.widget.PopupWindow;
import androidx.appcompat.view.menu.ListMenuItemView;
import b.b.o.i.f;
import b.b.o.i.g;
import b.b.o.i.i;
import java.lang.reflect.Method;

public class m0 extends k0 implements l0 {
  public static Method H;
  
  public l0 G;
  
  static {
    try {
      if (Build.VERSION.SDK_INT <= 28)
        H = PopupWindow.class.getDeclaredMethod("setTouchModal", new Class[] { boolean.class }); 
    } catch (NoSuchMethodException noSuchMethodException) {
      Log.i("MenuPopupWindow", "Could not find method setTouchModal() on PopupWindow. Oh well.");
    } 
  }
  
  public m0(Context paramContext, AttributeSet paramAttributeSet, int paramInt1, int paramInt2) {
    super(paramContext, null, paramInt1, paramInt2);
  }
  
  public void g(g paramg, MenuItem paramMenuItem) {
    l0 l01 = this.G;
    if (l01 != null)
      l01.g(paramg, paramMenuItem); 
  }
  
  public void k(g paramg, MenuItem paramMenuItem) {
    l0 l01 = this.G;
    if (l01 != null)
      l01.k(paramg, paramMenuItem); 
  }
  
  public f0 q(Context paramContext, boolean paramBoolean) {
    a a = new a(paramContext, paramBoolean);
    a.setHoverListener(this);
    return a;
  }
  
  public static class a extends f0 {
    public final int p;
    
    public final int q;
    
    public l0 r;
    
    public MenuItem s;
    
    public a(Context param1Context, boolean param1Boolean) {
      super(param1Context, param1Boolean);
      if (1 == param1Context.getResources().getConfiguration().getLayoutDirection()) {
        this.p = 21;
        this.q = 22;
      } else {
        this.p = 22;
        this.q = 21;
      } 
    }
    
    public boolean onHoverEvent(MotionEvent param1MotionEvent) {
      if (this.r != null) {
        int i;
        i i1;
        ListAdapter listAdapter1 = getAdapter();
        if (listAdapter1 instanceof HeaderViewListAdapter) {
          HeaderViewListAdapter headerViewListAdapter = (HeaderViewListAdapter)listAdapter1;
          i = headerViewListAdapter.getHeadersCount();
          listAdapter1 = headerViewListAdapter.getWrappedAdapter();
        } else {
          i = 0;
        } 
        f f = (f)listAdapter1;
        ListAdapter listAdapter2 = null;
        listAdapter1 = listAdapter2;
        if (param1MotionEvent.getAction() != 10) {
          int j = pointToPosition((int)param1MotionEvent.getX(), (int)param1MotionEvent.getY());
          listAdapter1 = listAdapter2;
          if (j != -1) {
            i = j - i;
            listAdapter1 = listAdapter2;
            if (i >= 0) {
              listAdapter1 = listAdapter2;
              if (i < f.getCount())
                i1 = f.b(i); 
            } 
          } 
        } 
        MenuItem menuItem = this.s;
        if (menuItem != i1) {
          g g = f.b;
          if (menuItem != null)
            this.r.k(g, menuItem); 
          this.s = (MenuItem)i1;
          if (i1 != null)
            this.r.g(g, (MenuItem)i1); 
        } 
      } 
      return super.onHoverEvent(param1MotionEvent);
    }
    
    public boolean onKeyDown(int param1Int, KeyEvent param1KeyEvent) {
      ListMenuItemView listMenuItemView = (ListMenuItemView)getSelectedView();
      if (listMenuItemView != null && param1Int == this.p) {
        if (listMenuItemView.isEnabled() && listMenuItemView.getItemData().hasSubMenu())
          performItemClick((View)listMenuItemView, getSelectedItemPosition(), getSelectedItemId()); 
        return true;
      } 
      if (listMenuItemView != null && param1Int == this.q) {
        setSelection(-1);
        ((f)getAdapter()).b.c(false);
        return true;
      } 
      return super.onKeyDown(param1Int, param1KeyEvent);
    }
    
    public void setHoverListener(l0 param1l0) {
      this.r = param1l0;
    }
  }
}


/* Location:              C:\Users\panch\Downloads\dvba_v1.1.0-dex2jar.jar!\b\b\p\m0.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */