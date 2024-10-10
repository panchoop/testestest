package c.c.a.b.n;

import com.google.android.material.bottomappbar.BottomAppBar;
import com.google.android.material.floatingactionbutton.FloatingActionButton;

public class b extends FloatingActionButton.a {
  public final int a;
  
  public final BottomAppBar b;
  
  public b(BottomAppBar paramBottomAppBar, int paramInt) {}
  
  public void a(FloatingActionButton paramFloatingActionButton) {
    paramFloatingActionButton.setTranslationX(BottomAppBar.z(this.b, this.a));
    paramFloatingActionButton.n(new a(this), true);
  }
  
  public class a extends FloatingActionButton.a {
    public final b a;
    
    public a(b this$0) {}
    
    public void b(FloatingActionButton param1FloatingActionButton) {
      BottomAppBar.y(this.a.b);
    }
  }
}


/* Location:              C:\Users\panch\Downloads\dvba_v1.1.0-dex2jar.jar!\c\c\a\b\n\b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */