package b.b.p;

import android.view.MenuItem;
import android.view.View;
import android.view.Window;
import b.b.o.i.a;

public class y0 implements View.OnClickListener {
  public final a b = new a(this.c.a.getContext(), 0, 16908332, 0, this.c.i);
  
  public final z0 c;
  
  public y0(z0 paramz0) {}
  
  public void onClick(View paramView) {
    z0 z01 = this.c;
    Window.Callback callback = z01.l;
    if (callback != null && z01.m)
      callback.onMenuItemSelected(0, (MenuItem)this.b); 
  }
}


/* Location:              C:\Users\panch\Downloads\dvba_v1.1.0-dex2jar.jar!\b\b\p\y0.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */