package b.b.o.i;

import android.content.Context;
import android.graphics.Rect;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.FrameLayout;
import android.widget.HeaderViewListAdapter;
import android.widget.ListAdapter;
import android.widget.PopupWindow;

public abstract class k implements p, m, AdapterView.OnItemClickListener {
  public Rect b;
  
  public static int n(ListAdapter paramListAdapter, ViewGroup paramViewGroup, Context paramContext, int paramInt) {
    byte b = 0;
    int n = View.MeasureSpec.makeMeasureSpec(0, 0);
    int i1 = View.MeasureSpec.makeMeasureSpec(0, 0);
    int i2 = paramListAdapter.getCount();
    ViewGroup viewGroup = null;
    paramViewGroup = null;
    int i = 0;
    int j = 0;
    while (b < i2) {
      FrameLayout frameLayout1;
      int i4 = paramListAdapter.getItemViewType(b);
      int i3 = j;
      ViewGroup viewGroup1 = paramViewGroup;
      if (i4 != j) {
        viewGroup1 = null;
        i3 = i4;
      } 
      paramViewGroup = viewGroup;
      if (viewGroup == null)
        frameLayout1 = new FrameLayout(paramContext); 
      View view2 = paramListAdapter.getView(b, (View)viewGroup1, (ViewGroup)frameLayout1);
      view2.measure(n, i1);
      i4 = view2.getMeasuredWidth();
      if (i4 >= paramInt)
        return paramInt; 
      j = i;
      if (i4 > i)
        j = i4; 
      b++;
      i = j;
      j = i3;
      FrameLayout frameLayout2 = frameLayout1;
      View view1 = view2;
    } 
    return i;
  }
  
  public static boolean v(g paramg) {
    boolean bool1;
    int i = paramg.size();
    boolean bool2 = false;
    byte b = 0;
    while (true) {
      bool1 = bool2;
      if (b < i) {
        MenuItem menuItem = paramg.getItem(b);
        if (menuItem.isVisible() && menuItem.getIcon() != null) {
          bool1 = true;
          break;
        } 
        b++;
        continue;
      } 
      break;
    } 
    return bool1;
  }
  
  public boolean c(g paramg, i parami) {
    return false;
  }
  
  public void j(Context paramContext, g paramg) {}
  
  public boolean k(g paramg, i parami) {
    return false;
  }
  
  public abstract void l(g paramg);
  
  public boolean m() {
    return true;
  }
  
  public abstract void o(View paramView);
  
  public void onItemClick(AdapterView<?> paramAdapterView, View paramView, int paramInt, long paramLong) {
    f f;
    ListAdapter listAdapter = (ListAdapter)paramAdapterView.getAdapter();
    if (listAdapter instanceof HeaderViewListAdapter) {
      f = (f)((HeaderViewListAdapter)listAdapter).getWrappedAdapter();
    } else {
      f = (f)listAdapter;
    } 
    g g = f.b;
    MenuItem menuItem = (MenuItem)listAdapter.getItem(paramInt);
    if (m()) {
      paramInt = 0;
    } else {
      paramInt = 4;
    } 
    g.s(menuItem, this, paramInt);
  }
  
  public abstract void p(boolean paramBoolean);
  
  public abstract void q(int paramInt);
  
  public abstract void r(int paramInt);
  
  public abstract void s(PopupWindow.OnDismissListener paramOnDismissListener);
  
  public abstract void t(boolean paramBoolean);
  
  public abstract void u(int paramInt);
}


/* Location:              C:\Users\panch\Downloads\dvba_v1.1.0-dex2jar.jar!\b\b\o\i\k.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */