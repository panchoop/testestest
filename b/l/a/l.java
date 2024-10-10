package b.l.a;

import android.view.ViewGroup;
import android.view.animation.Animation;
import androidx.fragment.app.Fragment;

public class l implements Animation.AnimationListener {
  public final ViewGroup a;
  
  public final Fragment b;
  
  public final k c;
  
  public l(k paramk, ViewGroup paramViewGroup, Fragment paramFragment) {}
  
  public void onAnimationEnd(Animation paramAnimation) {
    this.a.post(new a(this));
  }
  
  public void onAnimationRepeat(Animation paramAnimation) {}
  
  public void onAnimationStart(Animation paramAnimation) {}
  
  public class a implements Runnable {
    public final l b;
    
    public a(l this$0) {}
    
    public void run() {
      if (this.b.b.h() != null) {
        this.b.b.R(null);
        l l1 = this.b;
        k k = l1.c;
        Fragment fragment = l1.b;
        k.d0(fragment, fragment.s(), 0, 0, false);
      } 
    }
  }
}


/* Location:              C:\Users\panch\Downloads\dvba_v1.1.0-dex2jar.jar!\b\l\a\l.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */