package c.c.a.b.s;

import android.annotation.TargetApi;
import android.graphics.Outline;
import android.view.View;
import android.view.ViewOutlineProvider;
import com.google.android.material.chip.Chip;

public class a extends ViewOutlineProvider {
  public final Chip a;
  
  public a(Chip paramChip) {}
  
  @TargetApi(21)
  public void getOutline(View paramView, Outline paramOutline) {
    b b = this.a.e;
    if (b != null) {
      b.getOutline(paramOutline);
    } else {
      paramOutline.setAlpha(0.0F);
    } 
  }
}


/* Location:              C:\Users\panch\Downloads\dvba_v1.1.0-dex2jar.jar!\c\c\a\b\s\a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */