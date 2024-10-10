package c.c.a.b.u;

import android.graphics.Canvas;
import android.view.View;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import b.i.l.b;
import c.c.a.a.c.l.q;
import java.util.Calendar;

public class g extends RecyclerView.n {
  public final Calendar a = q.F();
  
  public final Calendar b = q.F();
  
  public final f c;
  
  public g(f paramf) {}
  
  public void d(Canvas paramCanvas, RecyclerView paramRecyclerView, RecyclerView.a0 parama0) {
    if (paramRecyclerView.getAdapter() instanceof w && paramRecyclerView.getLayoutManager() instanceof GridLayoutManager) {
      w w = (w)paramRecyclerView.getAdapter();
      GridLayoutManager gridLayoutManager = (GridLayoutManager)paramRecyclerView.getLayoutManager();
      for (b<Long, Long> b : this.c.Y.d()) {
        Object object = b.a;
        if (object == null || b.b == null)
          continue; 
        this.a.setTimeInMillis(((Long)object).longValue());
        this.b.setTimeInMillis(((Long)b.b).longValue());
        int k = w.e(this.a.get(1));
        int j = w.e(this.b.get(1));
        View view2 = gridLayoutManager.t(k);
        View view1 = gridLayoutManager.t(j);
        int i = gridLayoutManager.I;
        int m = k / i;
        int i1 = j / i;
        for (i = m; i <= i1; i++) {
          object = gridLayoutManager.t(gridLayoutManager.I * i);
          if (object != null) {
            int i3 = object.getTop();
            int i2 = this.c.c0.d.a.top;
            int i4 = object.getBottom();
            int i5 = this.c.c0.d.a.bottom;
            if (i == m) {
              j = view2.getLeft();
              j = view2.getWidth() / 2 + j;
            } else {
              j = 0;
            } 
            if (i == i1) {
              k = view1.getLeft();
              k = view1.getWidth() / 2 + k;
            } else {
              k = paramRecyclerView.getWidth();
            } 
            paramCanvas.drawRect(j, (i3 + i2), k, (i4 - i5), this.c.c0.h);
          } 
        } 
      } 
    } 
  }
}


/* Location:              C:\Users\panch\Downloads\dvba_v1.1.0-dex2jar.jar!\c\c\a\\\u\g.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */