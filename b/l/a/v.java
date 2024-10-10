package b.l.a;

import android.graphics.Rect;
import android.view.View;
import androidx.fragment.app.Fragment;
import b.f.a;
import java.util.ArrayList;

public final class v implements Runnable {
  public final b0 b;
  
  public final a c;
  
  public final Object d;
  
  public final w.a e;
  
  public final ArrayList f;
  
  public final View g;
  
  public final Fragment h;
  
  public final Fragment i;
  
  public final boolean j;
  
  public final ArrayList k;
  
  public final Object l;
  
  public final Rect m;
  
  public v(b0 paramb0, a parama, Object paramObject1, w.a parama1, ArrayList paramArrayList1, View paramView, Fragment paramFragment1, Fragment paramFragment2, boolean paramBoolean, ArrayList paramArrayList2, Object paramObject2, Rect paramRect) {}
  
  public void run() {
    a<String, View> a1 = w.e(this.b, this.c, this.d, this.e);
    if (a1 != null) {
      this.f.addAll(a1.values());
      this.f.add(this.g);
    } 
    w.c(this.h, this.i, this.j, a1, false);
    Object object = this.d;
    if (object != null) {
      this.b.u(object, this.k, this.f);
      View view = w.k(a1, this.e, this.l, this.j);
      if (view != null)
        this.b.j(view, this.m); 
    } 
  }
}


/* Location:              C:\Users\panch\Downloads\dvba_v1.1.0-dex2jar.jar!\b\l\a\v.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */