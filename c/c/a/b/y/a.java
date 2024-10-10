package c.c.a.b.y;

import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import b.i.m.a;
import b.i.m.v.b;
import com.google.android.material.internal.CheckableImageButton;

public class a extends a {
  public final CheckableImageButton d;
  
  public a(CheckableImageButton paramCheckableImageButton) {}
  
  public void c(View paramView, AccessibilityEvent paramAccessibilityEvent) {
    this.a.onInitializeAccessibilityEvent(paramView, paramAccessibilityEvent);
    paramAccessibilityEvent.setChecked(this.d.isChecked());
  }
  
  public void d(View paramView, b paramb) {
    this.a.onInitializeAccessibilityNodeInfo(paramView, paramb.a);
    boolean bool = this.d.e;
    paramb.a.setCheckable(bool);
    bool = this.d.isChecked();
    paramb.a.setChecked(bool);
  }
}


/* Location:              C:\Users\panch\Downloads\dvba_v1.1.0-dex2jar.jar!\c\c\a\b\y\a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */