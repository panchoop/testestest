package c.c.a.b.x;

import android.view.ViewTreeObserver;

public class g implements ViewTreeObserver.OnPreDrawListener {
  public final e b;
  
  public g(e parame) {}
  
  public boolean onPreDraw() {
    e e1 = this.b;
    float f = e1.t.getRotation();
    if (e1.n != f) {
      e1.n = f;
      e1.s();
    } 
    return true;
  }
}


/* Location:              C:\Users\panch\Downloads\dvba_v1.1.0-dex2jar.jar!\c\c\a\b\x\g.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */