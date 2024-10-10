package b.i.m;

import android.view.View;

public class o extends l.b<Boolean> {
  public o(int paramInt1, Class<Boolean> paramClass, int paramInt2) {
    super(paramInt1, paramClass, paramInt2);
  }
  
  public Object b(View paramView) {
    return Boolean.valueOf(paramView.isAccessibilityHeading());
  }
  
  public void c(View paramView, Object paramObject) {
    paramView.setAccessibilityHeading(((Boolean)paramObject).booleanValue());
  }
  
  public boolean e(Object paramObject1, Object paramObject2) {
    return a((Boolean)paramObject1, (Boolean)paramObject2) ^ true;
  }
}


/* Location:              C:\Users\panch\Downloads\dvba_v1.1.0-dex2jar.jar!\b\i\m\o.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */