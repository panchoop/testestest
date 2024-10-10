package b.r.d;

import android.animation.Animator;
import android.view.View;
import android.view.ViewPropertyAnimator;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;

public class c implements Runnable {
  public final ArrayList b;
  
  public final k c;
  
  public c(k paramk, ArrayList paramArrayList) {}
  
  public void run() {
    for (k.b b : this.b) {
      k k1 = this.c;
      RecyclerView.d0 d0 = b.a;
      int n = b.b;
      int j = b.c;
      int m = b.d;
      int i = b.e;
      if (k1 != null) {
        View view = d0.a;
        m -= n;
        i -= j;
        if (m != 0)
          view.animate().translationX(0.0F); 
        if (i != 0)
          view.animate().translationY(0.0F); 
        ViewPropertyAnimator viewPropertyAnimator = view.animate();
        k1.p.add(d0);
        viewPropertyAnimator.setDuration(k1.e).setListener((Animator.AnimatorListener)new h(k1, d0, m, view, i, viewPropertyAnimator)).start();
        continue;
      } 
      throw null;
    } 
    this.b.clear();
    this.c.m.remove(this.b);
  }
}


/* Location:              C:\Users\panch\Downloads\dvba_v1.1.0-dex2jar.jar!\b\r\d\c.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */