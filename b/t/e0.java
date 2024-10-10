package b.t;

import android.view.View;
import android.view.WindowId;

public class e0 implements f0 {
  public final WindowId a;
  
  public e0(View paramView) {
    this.a = paramView.getWindowId();
  }
  
  public boolean equals(Object paramObject) {
    boolean bool;
    if (paramObject instanceof e0 && ((e0)paramObject).a.equals(this.a)) {
      bool = true;
    } else {
      bool = false;
    } 
    return bool;
  }
  
  public int hashCode() {
    return this.a.hashCode();
  }
}


/* Location:              C:\Users\panch\Downloads\dvba_v1.1.0-dex2jar.jar!\b\t\e0.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */