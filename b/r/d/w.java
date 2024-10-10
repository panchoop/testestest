package b.r.d;

import android.view.View;
import android.widget.Scroller;
import androidx.recyclerview.widget.RecyclerView;

public abstract class w extends RecyclerView.r {
  public RecyclerView a;
  
  public Scroller b;
  
  public final RecyclerView.t c = new a(this);
  
  public abstract int[] a(RecyclerView.o paramo, View paramView);
  
  public abstract View b(RecyclerView.o paramo);
  
  public void c() {
    RecyclerView recyclerView = this.a;
    if (recyclerView == null)
      return; 
    RecyclerView.o o = recyclerView.getLayoutManager();
    if (o == null)
      return; 
    View view = b(o);
    if (view == null)
      return; 
    int[] arrayOfInt = a(o, view);
    if (arrayOfInt[0] != 0 || arrayOfInt[1] != 0)
      this.a.smoothScrollBy(arrayOfInt[0], arrayOfInt[1]); 
  }
  
  public class a extends RecyclerView.t {
    public boolean a = false;
    
    public final w b;
    
    public a(w this$0) {}
    
    public void a(RecyclerView param1RecyclerView, int param1Int) {
      if (param1Int == 0 && this.a) {
        this.a = false;
        this.b.c();
      } 
    }
    
    public void b(RecyclerView param1RecyclerView, int param1Int1, int param1Int2) {
      if (param1Int1 != 0 || param1Int2 != 0)
        this.a = true; 
    }
  }
}


/* Location:              C:\Users\panch\Downloads\dvba_v1.1.0-dex2jar.jar!\b\r\d\w.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */