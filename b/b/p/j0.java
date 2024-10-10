package b.b.p;

import android.view.View;
import android.widget.AdapterView;

public class j0 implements AdapterView.OnItemSelectedListener {
  public final k0 b;
  
  public j0(k0 paramk0) {}
  
  public void onItemSelected(AdapterView<?> paramAdapterView, View paramView, int paramInt, long paramLong) {
    if (paramInt != -1) {
      f0 f0 = this.b.d;
      if (f0 != null)
        f0.setListSelectionHidden(false); 
    } 
  }
  
  public void onNothingSelected(AdapterView<?> paramAdapterView) {}
}


/* Location:              C:\Users\panch\Downloads\dvba_v1.1.0-dex2jar.jar!\b\b\p\j0.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */