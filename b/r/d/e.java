package b.r.d;

import android.animation.Animator;
import android.view.View;
import android.view.ViewPropertyAnimator;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;

public class e implements Runnable {
  public final ArrayList b;
  
  public final k c;
  
  public e(k paramk, ArrayList paramArrayList) {}
  
  public void run() {
    for (RecyclerView.d0 d0 : this.b) {
      k k1 = this.c;
      if (k1 != null) {
        View view = d0.a;
        ViewPropertyAnimator viewPropertyAnimator = view.animate();
        k1.o.add(d0);
        viewPropertyAnimator.alpha(1.0F).setDuration(k1.c).setListener((Animator.AnimatorListener)new g(k1, d0, view, viewPropertyAnimator)).start();
        continue;
      } 
      throw null;
    } 
    this.b.clear();
    this.c.l.remove(this.b);
  }
}


/* Location:              C:\Users\panch\Downloads\dvba_v1.1.0-dex2jar.jar!\b\r\d\e.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */