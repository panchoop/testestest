package c.c.a.b.y;

import android.annotation.SuppressLint;
import android.widget.ImageButton;

@SuppressLint({"AppCompatCustomView"})
public class j extends ImageButton {
  public int b;
  
  public final void b(int paramInt, boolean paramBoolean) {
    super.setVisibility(paramInt);
    if (paramBoolean)
      this.b = paramInt; 
  }
  
  public final int getUserSetVisibility() {
    return this.b;
  }
  
  public void setVisibility(int paramInt) {
    super.setVisibility(paramInt);
    this.b = paramInt;
  }
}


/* Location:              C:\Users\panch\Downloads\dvba_v1.1.0-dex2jar.jar!\c\c\a\b\y\j.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */