package b.l.a;

import android.view.View;
import androidx.fragment.app.Fragment;
import java.util.ArrayList;
import java.util.Collection;

public final class t implements Runnable {
  public final Object b;
  
  public final b0 c;
  
  public final View d;
  
  public final Fragment e;
  
  public final ArrayList f;
  
  public final ArrayList g;
  
  public final ArrayList h;
  
  public final Object i;
  
  public t(Object paramObject1, b0 paramb0, View paramView, Fragment paramFragment, ArrayList paramArrayList1, ArrayList paramArrayList2, ArrayList paramArrayList3, Object paramObject2) {}
  
  public void run() {
    Object<View> object = (Object<View>)this.b;
    if (object != null) {
      this.c.n(object, this.d);
      object = (Object<View>)w.h(this.c, this.b, this.e, this.f, this.d);
      this.g.addAll((Collection<? extends View>)object);
    } 
    if (this.h != null) {
      if (this.i != null) {
        object = (Object<View>)new ArrayList();
        object.add(this.d);
        this.c.o(this.i, this.h, (ArrayList<View>)object);
      } 
      this.h.clear();
      this.h.add(this.d);
    } 
  }
}


/* Location:              C:\Users\panch\Downloads\dvba_v1.1.0-dex2jar.jar!\b\l\a\t.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */