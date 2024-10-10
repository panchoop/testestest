package b.r.d;

import android.content.Context;
import android.util.DisplayMetrics;
import android.view.View;
import android.view.animation.Interpolator;
import androidx.recyclerview.widget.RecyclerView;

public class x extends o {
  public final w q;
  
  public x(w paramw, Context paramContext) {
    super(paramContext);
  }
  
  public void c(View paramView, RecyclerView.a0 parama0, RecyclerView.z.a parama) {
    w w1 = this.q;
    RecyclerView recyclerView = w1.a;
    if (recyclerView == null)
      return; 
    int[] arrayOfInt = w1.a(recyclerView.getLayoutManager(), paramView);
    int i = arrayOfInt[0];
    int j = arrayOfInt[1];
    int k = (int)Math.ceil(g(Math.max(Math.abs(i), Math.abs(j))) / 0.3356D);
    if (k > 0)
      parama.b(i, j, k, (Interpolator)this.j); 
  }
  
  public float f(DisplayMetrics paramDisplayMetrics) {
    return 100.0F / paramDisplayMetrics.densityDpi;
  }
}


/* Location:              C:\Users\panch\Downloads\dvba_v1.1.0-dex2jar.jar!\b\r\d\x.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */