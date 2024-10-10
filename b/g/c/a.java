package b.g.c;

import android.content.Context;
import android.util.AttributeSet;
import b.g.b.i.g;

public class a extends c {
  public int i;
  
  public int j;
  
  public b.g.b.i.a k;
  
  public a(Context paramContext) {
    super(paramContext);
    setVisibility(8);
  }
  
  public void e(AttributeSet paramAttributeSet) {
    super.e(null);
    b.g.b.i.a a1 = new b.g.b.i.a();
    this.k = a1;
    this.e = (g)a1;
    i();
  }
  
  public int getMargin() {
    return this.k.j0;
  }
  
  public int getType() {
    return this.i;
  }
  
  public void setAllowsGoneWidget(boolean paramBoolean) {
    this.k.i0 = paramBoolean;
  }
  
  public void setDpMargin(int paramInt) {
    float f = (getResources().getDisplayMetrics()).density;
    paramInt = (int)(paramInt * f + 0.5F);
    this.k.j0 = paramInt;
  }
  
  public void setMargin(int paramInt) {
    this.k.j0 = paramInt;
  }
  
  public void setType(int paramInt) {
    this.i = paramInt;
  }
}


/* Location:              C:\Users\panch\Downloads\dvba_v1.1.0-dex2jar.jar!\b\g\c\a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */