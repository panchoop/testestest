package b.t;

import android.view.View;
import android.view.ViewGroup;

public class c0 extends l {
  public final ViewGroup a;
  
  public final View b;
  
  public final View c;
  
  public final d0 d;
  
  public c0(d0 paramd0, ViewGroup paramViewGroup, View paramView1, View paramView2) {}
  
  public void c(i parami) {
    this.c.setTag(f.save_overlay_view, null);
    this.a.getOverlay().remove(this.b);
    parami.w(this);
  }
  
  public void d(i parami) {
    this.a.getOverlay().remove(this.b);
  }
  
  public void e(i parami) {
    if (this.b.getParent() == null) {
      this.a.getOverlay().add(this.b);
    } else {
      this.d.d();
    } 
  }
}


/* Location:              C:\Users\panch\Downloads\dvba_v1.1.0-dex2jar.jar!\b\t\c0.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */