package b.i.m.v;

import android.os.Bundle;
import android.text.style.ClickableSpan;
import android.view.View;

public final class a extends ClickableSpan {
  public final int b;
  
  public final b c;
  
  public final int d;
  
  public a(int paramInt1, b paramb, int paramInt2) {
    this.b = paramInt1;
    this.c = paramb;
    this.d = paramInt2;
  }
  
  public void onClick(View paramView) {
    Bundle bundle = new Bundle();
    bundle.putInt("ACCESSIBILITY_CLICKABLE_SPAN_ID", this.b);
    b b1 = this.c;
    int i = this.d;
    b1.a.performAction(i, bundle);
  }
}


/* Location:              C:\Users\panch\Downloads\dvba_v1.1.0-dex2jar.jar!\b\i\m\v\a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */