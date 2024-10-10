package b.b.p;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Outline;
import android.graphics.drawable.Drawable;
import androidx.appcompat.widget.ActionBarContainer;

public class b extends Drawable {
  public final ActionBarContainer a;
  
  public b(ActionBarContainer paramActionBarContainer) {
    this.a = paramActionBarContainer;
  }
  
  public void draw(Canvas paramCanvas) {
    Drawable drawable;
    ActionBarContainer actionBarContainer = this.a;
    if (actionBarContainer.i) {
      drawable = actionBarContainer.h;
      if (drawable != null)
        drawable.draw(paramCanvas); 
    } else {
      drawable = ((ActionBarContainer)drawable).f;
      if (drawable != null)
        drawable.draw(paramCanvas); 
      ActionBarContainer actionBarContainer1 = this.a;
      drawable = actionBarContainer1.g;
      if (drawable != null && actionBarContainer1.j)
        drawable.draw(paramCanvas); 
    } 
  }
  
  public int getOpacity() {
    return 0;
  }
  
  public void getOutline(Outline paramOutline) {
    Drawable drawable;
    ActionBarContainer actionBarContainer = this.a;
    if (actionBarContainer.i) {
      drawable = actionBarContainer.h;
      if (drawable != null) {
        drawable.getOutline(paramOutline);
        return;
      } 
    } else {
      drawable = ((ActionBarContainer)drawable).f;
      if (drawable != null) {
        drawable.getOutline(paramOutline);
        return;
      } 
    } 
  }
  
  public void setAlpha(int paramInt) {}
  
  public void setColorFilter(ColorFilter paramColorFilter) {}
}


/* Location:              C:\Users\panch\Downloads\dvba_v1.1.0-dex2jar.jar!\b\b\p\b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */