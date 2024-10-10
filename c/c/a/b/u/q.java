package c.c.a.b.u;

import android.view.View;
import android.widget.AdapterView;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.datepicker.MaterialCalendarGridView;
import java.util.Iterator;

public class q implements AdapterView.OnItemClickListener {
  public final MaterialCalendarGridView b;
  
  public final r c;
  
  public q(r paramr, MaterialCalendarGridView paramMaterialCalendarGridView) {}
  
  public void onItemClick(AdapterView<?> paramAdapterView, View paramView, int paramInt, long paramLong) {
    boolean bool;
    p p = this.b.a();
    if (paramInt >= p.a() && paramInt <= p.c()) {
      bool = true;
    } else {
      bool = false;
    } 
    if (bool) {
      f.f f = this.c.e;
      paramLong = this.b.a().b(paramInt).longValue();
      f = f;
      if (((f.d)f).a.Z.e.g(paramLong)) {
        ((f.d)f).a.Y.b(paramLong);
        Iterator<s> iterator = ((f.d)f).a.W.iterator();
        while (iterator.hasNext())
          ((s)iterator.next()).a(((f.d)f).a.Y.a()); 
        (((f.d)f).a.e0.getAdapter()).a.b();
        RecyclerView recyclerView = ((f.d)f).a.d0;
        if (recyclerView != null)
          (recyclerView.getAdapter()).a.b(); 
      } 
    } 
  }
}


/* Location:              C:\Users\panch\Downloads\dvba_v1.1.0-dex2jar.jar!\c\c\a\\\u\q.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */