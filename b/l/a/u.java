package b.l.a;

import android.graphics.Rect;
import android.view.View;
import androidx.fragment.app.Fragment;
import b.f.a;

public final class u implements Runnable {
  public final Fragment b;
  
  public final Fragment c;
  
  public final boolean d;
  
  public final a e;
  
  public final View f;
  
  public final b0 g;
  
  public final Rect h;
  
  public u(Fragment paramFragment1, Fragment paramFragment2, boolean paramBoolean, a parama, View paramView, b0 paramb0, Rect paramRect) {}
  
  public void run() {
    w.c(this.b, this.c, this.d, this.e, false);
    View view = this.f;
    if (view != null)
      this.g.j(view, this.h); 
  }
}


/* Location:              C:\Users\panch\Downloads\dvba_v1.1.0-dex2jar.jar!\b\l\\\u.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */