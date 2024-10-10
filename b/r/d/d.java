package b.r.d;

import android.animation.Animator;
import android.view.View;
import android.view.ViewPropertyAnimator;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;

public class d implements Runnable {
  public final ArrayList b;
  
  public final k c;
  
  public d(k paramk, ArrayList paramArrayList) {}
  
  public void run() {
    for (k.a a : this.b) {
      k k1 = this.c;
      View view = null;
      if (k1 != null) {
        View view1;
        RecyclerView.d0 d01 = a.a;
        if (d01 == null) {
          d01 = null;
        } else {
          view1 = d01.a;
        } 
        RecyclerView.d0 d02 = a.b;
        if (d02 != null)
          view = d02.a; 
        if (view1 != null) {
          ViewPropertyAnimator viewPropertyAnimator = view1.animate().setDuration(k1.f);
          k1.r.add(a.a);
          viewPropertyAnimator.translationX((a.e - a.c));
          viewPropertyAnimator.translationY((a.f - a.d));
          viewPropertyAnimator.alpha(0.0F).setListener((Animator.AnimatorListener)new i(k1, a, viewPropertyAnimator, view1)).start();
        } 
        if (view != null) {
          ViewPropertyAnimator viewPropertyAnimator = view.animate();
          k1.r.add(a.b);
          viewPropertyAnimator.translationX(0.0F).translationY(0.0F).setDuration(k1.f).alpha(1.0F).setListener((Animator.AnimatorListener)new j(k1, a, viewPropertyAnimator, view)).start();
        } 
        continue;
      } 
      throw null;
    } 
    this.b.clear();
    this.c.n.remove(this.b);
  }
}


/* Location:              C:\Users\panch\Downloads\dvba_v1.1.0-dex2jar.jar!\b\r\d\d.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */