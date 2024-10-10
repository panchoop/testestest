package c.c.a.b.u;

import android.content.Context;
import android.util.DisplayMetrics;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import b.r.d.o;

public class u extends LinearLayoutManager {
  public u(Context paramContext, int paramInt, boolean paramBoolean) {
    super(paramInt, paramBoolean);
  }
  
  public void U0(RecyclerView paramRecyclerView, RecyclerView.a0 parama0, int paramInt) {
    a a = new a(this, paramRecyclerView.getContext());
    ((RecyclerView.z)a).a = paramInt;
    V0((RecyclerView.z)a);
  }
  
  public class a extends o {
    public a(u this$0, Context param1Context) {
      super(param1Context);
    }
    
    public float f(DisplayMetrics param1DisplayMetrics) {
      return 100.0F / param1DisplayMetrics.densityDpi;
    }
  }
}


/* Location:              C:\Users\panch\Downloads\dvba_v1.1.0-dex2jar.jar!\c\c\a\\\u\u.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */