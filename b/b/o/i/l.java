package b.b.o.i;

import android.content.Context;
import android.graphics.Point;
import android.graphics.Rect;
import android.view.Display;
import android.view.Gravity;
import android.view.View;
import android.view.WindowManager;
import android.widget.PopupWindow;
import b.b.d;

public class l {
  public final Context a;
  
  public final g b;
  
  public final boolean c;
  
  public final int d;
  
  public final int e;
  
  public View f;
  
  public int g = 8388611;
  
  public boolean h;
  
  public m.a i;
  
  public k j;
  
  public PopupWindow.OnDismissListener k;
  
  public final PopupWindow.OnDismissListener l = new a(this);
  
  public l(Context paramContext, g paramg, View paramView, boolean paramBoolean, int paramInt1, int paramInt2) {
    this.a = paramContext;
    this.b = paramg;
    this.f = paramView;
    this.c = paramBoolean;
    this.d = paramInt1;
    this.e = paramInt2;
  }
  
  public k a() {
    if (this.j == null) {
      boolean bool;
      q q;
      Display display = ((WindowManager)this.a.getSystemService("window")).getDefaultDisplay();
      Point point = new Point();
      display.getRealSize(point);
      if (Math.min(point.x, point.y) >= this.a.getResources().getDimensionPixelSize(d.abc_cascading_menus_min_smallest_width)) {
        bool = true;
      } else {
        bool = false;
      } 
      if (bool) {
        d d = new d(this.a, this.f, this.d, this.e, this.c);
      } else {
        q = new q(this.a, this.b, this.f, this.d, this.e, this.c);
      } 
      q.l(this.b);
      q.s(this.l);
      q.o(this.f);
      q.d(this.i);
      q.p(this.h);
      q.q(this.g);
      this.j = q;
    } 
    return this.j;
  }
  
  public boolean b() {
    boolean bool;
    k k1 = this.j;
    if (k1 != null && k1.a()) {
      bool = true;
    } else {
      bool = false;
    } 
    return bool;
  }
  
  public void c() {
    this.j = null;
    PopupWindow.OnDismissListener onDismissListener = this.k;
    if (onDismissListener != null)
      onDismissListener.onDismiss(); 
  }
  
  public void d(m.a parama) {
    this.i = parama;
    k k1 = this.j;
    if (k1 != null)
      k1.d(parama); 
  }
  
  public final void e(int paramInt1, int paramInt2, boolean paramBoolean1, boolean paramBoolean2) {
    k k1 = a();
    k1.t(paramBoolean2);
    if (paramBoolean1) {
      int i = paramInt1;
      if ((Gravity.getAbsoluteGravity(this.g, b.i.m.l.r(this.f)) & 0x7) == 5)
        i = paramInt1 - this.f.getWidth(); 
      k1.r(i);
      k1.u(paramInt2);
      paramInt1 = (int)((this.a.getResources().getDisplayMetrics()).density * 48.0F / 2.0F);
      k1.b = new Rect(i - paramInt1, paramInt2 - paramInt1, i + paramInt1, paramInt2 + paramInt1);
    } 
    k1.i();
  }
  
  public boolean f() {
    if (b())
      return true; 
    if (this.f == null)
      return false; 
    e(0, 0, false, false);
    return true;
  }
  
  public class a implements PopupWindow.OnDismissListener {
    public final l b;
    
    public a(l this$0) {}
    
    public void onDismiss() {
      this.b.c();
    }
  }
}


/* Location:              C:\Users\panch\Downloads\dvba_v1.1.0-dex2jar.jar!\b\b\o\i\l.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */