package b.l.a;

import android.view.View;
import androidx.fragment.app.Fragment;

public class d extends f {
  public final Fragment a;
  
  public d(Fragment paramFragment) {}
  
  public View b(int paramInt) {
    View view = this.a.G;
    if (view != null)
      return view.findViewById(paramInt); 
    StringBuilder stringBuilder = new StringBuilder();
    stringBuilder.append("Fragment ");
    stringBuilder.append(this);
    stringBuilder.append(" does not have a view");
    throw new IllegalStateException(stringBuilder.toString());
  }
  
  public boolean c() {
    boolean bool;
    if (this.a.G != null) {
      bool = true;
    } else {
      bool = false;
    } 
    return bool;
  }
}


/* Location:              C:\Users\panch\Downloads\dvba_v1.1.0-dex2jar.jar!\b\l\a\d.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */