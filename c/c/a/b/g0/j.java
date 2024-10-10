package c.c.a.b.g0;

import android.view.View;

public class j implements View.OnFocusChangeListener {
  public final h b;
  
  public j(h paramh) {}
  
  public void onFocusChange(View paramView, boolean paramBoolean) {
    this.b.a.setEndIconActivated(paramBoolean);
    if (!paramBoolean) {
      h.e(this.b, false);
      this.b.g = false;
    } 
  }
}


/* Location:              C:\Users\panch\Downloads\dvba_v1.1.0-dex2jar.jar!\c\c\a\b\g0\j.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */