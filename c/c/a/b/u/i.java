package c.c.a.b.u;

import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.button.MaterialButton;

public class i extends RecyclerView.t {
  public final r a;
  
  public final MaterialButton b;
  
  public final f c;
  
  public i(f paramf, r paramr, MaterialButton paramMaterialButton) {}
  
  public void a(RecyclerView paramRecyclerView, int paramInt) {
    if (paramInt == 0)
      paramRecyclerView.announceForAccessibility(this.b.getText()); 
  }
  
  public void b(RecyclerView paramRecyclerView, int paramInt1, int paramInt2) {
    LinearLayoutManager linearLayoutManager = this.c.a0();
    if (paramInt1 < 0) {
      paramInt1 = linearLayoutManager.i1();
    } else {
      paramInt1 = linearLayoutManager.k1();
    } 
    this.c.a0 = this.a.e(paramInt1);
    this.b.setText((this.a.c.b.h(paramInt1)).c);
  }
}


/* Location:              C:\Users\panch\Downloads\dvba_v1.1.0-dex2jar.jar!\c\c\a\\\u\i.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */