package c.c.a.b.g0;

import android.view.MotionEvent;
import android.view.View;
import android.widget.AutoCompleteTextView;

public class i implements View.OnTouchListener {
  public final AutoCompleteTextView b;
  
  public final h c;
  
  public i(h paramh, AutoCompleteTextView paramAutoCompleteTextView) {}
  
  public boolean onTouch(View paramView, MotionEvent paramMotionEvent) {
    if (paramMotionEvent.getAction() == 1) {
      if (this.c.h())
        this.c.g = false; 
      h.f(this.c, this.b);
      paramView.performClick();
    } 
    return false;
  }
}


/* Location:              C:\Users\panch\Downloads\dvba_v1.1.0-dex2jar.jar!\c\c\a\b\g0\i.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */