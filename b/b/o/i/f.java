package b.b.o.i;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import androidx.appcompat.view.menu.ListMenuItemView;
import java.util.ArrayList;

public class f extends BaseAdapter {
  public g b;
  
  public int c = -1;
  
  public boolean d;
  
  public final boolean e;
  
  public final LayoutInflater f;
  
  public final int g;
  
  public f(g paramg, LayoutInflater paramLayoutInflater, boolean paramBoolean, int paramInt) {
    this.e = paramBoolean;
    this.f = paramLayoutInflater;
    this.b = paramg;
    this.g = paramInt;
    a();
  }
  
  public void a() {
    g g1 = this.b;
    i i = g1.w;
    if (i != null) {
      g1.i();
      ArrayList<i> arrayList = g1.j;
      int j = arrayList.size();
      for (byte b = 0; b < j; b++) {
        if ((i)arrayList.get(b) == i) {
          this.c = b;
          return;
        } 
      } 
    } 
    this.c = -1;
  }
  
  public i b(int paramInt) {
    ArrayList<i> arrayList;
    if (this.e) {
      g g1 = this.b;
      g1.i();
      arrayList = g1.j;
    } else {
      arrayList = this.b.l();
    } 
    int j = this.c;
    int i = paramInt;
    if (j >= 0) {
      i = paramInt;
      if (paramInt >= j)
        i = paramInt + 1; 
    } 
    return arrayList.get(i);
  }
  
  public int getCount() {
    ArrayList<i> arrayList;
    if (this.e) {
      g g1 = this.b;
      g1.i();
      arrayList = g1.j;
    } else {
      arrayList = this.b.l();
    } 
    int j = this.c;
    int i = arrayList.size();
    return (j < 0) ? i : (i - 1);
  }
  
  public long getItemId(int paramInt) {
    return paramInt;
  }
  
  public View getView(int paramInt, View paramView, ViewGroup paramViewGroup) {
    boolean bool;
    View view = paramView;
    if (paramView == null)
      view = this.f.inflate(this.g, paramViewGroup, false); 
    int j = (b(paramInt)).b;
    int i = paramInt - 1;
    if (i >= 0) {
      i = (b(i)).b;
    } else {
      i = j;
    } 
    ListMenuItemView listMenuItemView = (ListMenuItemView)view;
    if (this.b.m() && j != i) {
      bool = true;
    } else {
      bool = false;
    } 
    listMenuItemView.setGroupDividerEnabled(bool);
    n.a a = (n.a)view;
    if (this.d)
      listMenuItemView.setForceShowIcon(true); 
    a.e(b(paramInt), 0);
    return view;
  }
  
  public void notifyDataSetChanged() {
    a();
    super.notifyDataSetChanged();
  }
}


/* Location:              C:\Users\panch\Downloads\dvba_v1.1.0-dex2jar.jar!\b\b\o\i\f.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */