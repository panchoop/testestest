package b.r.d;

import android.graphics.Rect;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;

public abstract class t {
  public final RecyclerView.o a;
  
  public int b = Integer.MIN_VALUE;
  
  public final Rect c = new Rect();
  
  public t(RecyclerView.o paramo, r paramr) {
    this.a = paramo;
  }
  
  public static t a(RecyclerView.o paramo, int paramInt) {
    if (paramInt != 0) {
      if (paramInt == 1)
        return new s(paramo); 
      throw new IllegalArgumentException("invalid orientation");
    } 
    return new r(paramo);
  }
  
  public abstract int b(View paramView);
  
  public abstract int c(View paramView);
  
  public abstract int d(View paramView);
  
  public abstract int e(View paramView);
  
  public abstract int f();
  
  public abstract int g();
  
  public abstract int h();
  
  public abstract int i();
  
  public abstract int j();
  
  public abstract int k();
  
  public abstract int l();
  
  public int m() {
    int i;
    if (Integer.MIN_VALUE == this.b) {
      i = 0;
    } else {
      i = l() - this.b;
    } 
    return i;
  }
  
  public abstract int n(View paramView);
  
  public abstract int o(View paramView);
  
  public abstract void p(int paramInt);
}


/* Location:              C:\Users\panch\Downloads\dvba_v1.1.0-dex2jar.jar!\b\r\d\t.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */