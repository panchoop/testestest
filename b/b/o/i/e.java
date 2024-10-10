package b.b.o.i;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.widget.AdapterView;
import android.widget.BaseAdapter;
import android.widget.ListAdapter;
import androidx.appcompat.app.AlertController;
import androidx.appcompat.view.menu.ExpandedMenuView;
import b.b.g;
import b.b.k.g;
import java.util.ArrayList;

public class e implements m, AdapterView.OnItemClickListener {
  public Context b;
  
  public LayoutInflater c;
  
  public g d;
  
  public ExpandedMenuView e;
  
  public int f;
  
  public int g;
  
  public int h;
  
  public m.a i;
  
  public a j;
  
  public e(Context paramContext, int paramInt) {
    this.h = paramInt;
    this.g = 0;
    this.b = paramContext;
    this.c = LayoutInflater.from(paramContext);
  }
  
  public ListAdapter a() {
    if (this.j == null)
      this.j = new a(this); 
    return (ListAdapter)this.j;
  }
  
  public void b(g paramg, boolean paramBoolean) {
    m.a a1 = this.i;
    if (a1 != null)
      a1.b(paramg, paramBoolean); 
  }
  
  public boolean c(g paramg, i parami) {
    return false;
  }
  
  public void d(m.a parama) {
    this.i = parama;
  }
  
  public boolean f(r paramr) {
    if (!paramr.hasVisibleItems())
      return false; 
    h h = new h(paramr);
    g g2 = h.b;
    g.a a2 = new g.a(g2.a);
    e e1 = new e(a2.a.a, g.abc_list_menu_item_layout);
    h.d = e1;
    e1.i = h;
    g g3 = h.b;
    g3.b(e1, g3.a);
    ListAdapter listAdapter = h.d.a();
    AlertController.b b = a2.a;
    b.q = listAdapter;
    b.r = h;
    View view = g2.o;
    if (view != null) {
      b.g = view;
    } else {
      b.d = g2.n;
      b.f = g2.m;
    } 
    a2.a.p = h;
    g g1 = a2.a();
    h.c = g1;
    g1.setOnDismissListener(h);
    WindowManager.LayoutParams layoutParams = h.c.getWindow().getAttributes();
    layoutParams.type = 1003;
    layoutParams.flags |= 0x20000;
    h.c.show();
    m.a a1 = this.i;
    if (a1 != null)
      a1.c(paramr); 
    return true;
  }
  
  public boolean g() {
    return false;
  }
  
  public void h(boolean paramBoolean) {
    a a1 = this.j;
    if (a1 != null)
      a1.notifyDataSetChanged(); 
  }
  
  public void j(Context paramContext, g paramg) {
    // Byte code:
    //   0: aload_0
    //   1: getfield g : I
    //   4: ifeq -> 33
    //   7: new android/view/ContextThemeWrapper
    //   10: dup
    //   11: aload_1
    //   12: aload_0
    //   13: getfield g : I
    //   16: invokespecial <init> : (Landroid/content/Context;I)V
    //   19: astore_1
    //   20: aload_0
    //   21: aload_1
    //   22: putfield b : Landroid/content/Context;
    //   25: aload_1
    //   26: invokestatic from : (Landroid/content/Context;)Landroid/view/LayoutInflater;
    //   29: astore_1
    //   30: goto -> 57
    //   33: aload_0
    //   34: getfield b : Landroid/content/Context;
    //   37: ifnull -> 62
    //   40: aload_0
    //   41: aload_1
    //   42: putfield b : Landroid/content/Context;
    //   45: aload_0
    //   46: getfield c : Landroid/view/LayoutInflater;
    //   49: ifnonnull -> 62
    //   52: aload_1
    //   53: invokestatic from : (Landroid/content/Context;)Landroid/view/LayoutInflater;
    //   56: astore_1
    //   57: aload_0
    //   58: aload_1
    //   59: putfield c : Landroid/view/LayoutInflater;
    //   62: aload_0
    //   63: aload_2
    //   64: putfield d : Lb/b/o/i/g;
    //   67: aload_0
    //   68: getfield j : Lb/b/o/i/e$a;
    //   71: astore_1
    //   72: aload_1
    //   73: ifnull -> 80
    //   76: aload_1
    //   77: invokevirtual notifyDataSetChanged : ()V
    //   80: return
  }
  
  public boolean k(g paramg, i parami) {
    return false;
  }
  
  public void onItemClick(AdapterView<?> paramAdapterView, View paramView, int paramInt, long paramLong) {
    this.d.s((MenuItem)this.j.b(paramInt), this, 0);
  }
  
  public class a extends BaseAdapter {
    public int b = -1;
    
    public final e c;
    
    public a(e this$0) {
      a();
    }
    
    public void a() {
      g g = this.c.d;
      i i = g.w;
      if (i != null) {
        g.i();
        ArrayList<i> arrayList = g.j;
        int j = arrayList.size();
        for (byte b = 0; b < j; b++) {
          if ((i)arrayList.get(b) == i) {
            this.b = b;
            return;
          } 
        } 
      } 
      this.b = -1;
    }
    
    public i b(int param1Int) {
      g g = this.c.d;
      g.i();
      ArrayList<i> arrayList = g.j;
      int i = param1Int + this.c.f;
      int j = this.b;
      param1Int = i;
      if (j >= 0) {
        param1Int = i;
        if (i >= j)
          param1Int = i + 1; 
      } 
      return arrayList.get(param1Int);
    }
    
    public int getCount() {
      g g = this.c.d;
      g.i();
      int i = g.j.size() - this.c.f;
      return (this.b < 0) ? i : (i - 1);
    }
    
    public long getItemId(int param1Int) {
      return param1Int;
    }
    
    public View getView(int param1Int, View param1View, ViewGroup param1ViewGroup) {
      View view = param1View;
      if (param1View == null) {
        e e1 = this.c;
        view = e1.c.inflate(e1.h, param1ViewGroup, false);
      } 
      ((n.a)view).e(b(param1Int), 0);
      return view;
    }
    
    public void notifyDataSetChanged() {
      a();
      super.notifyDataSetChanged();
    }
  }
}


/* Location:              C:\Users\panch\Downloads\dvba_v1.1.0-dex2jar.jar!\b\b\o\i\e.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */