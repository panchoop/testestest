package b.i.m;

import android.view.View;

public class m extends l.b<Boolean> {
  public m(int paramInt1, Class<Boolean> paramClass, int paramInt2) {
    super(paramInt1, paramClass, paramInt2);
  }
  
  public Object b(View paramView) {
    return Boolean.valueOf(paramView.isScreenReaderFocusable());
  }
  
  public void c(View paramView, Object paramObject) {
    paramView.setScreenReaderFocusable(((Boolean)paramObject).booleanValue());
  }
  
  public boolean e(Object paramObject1, Object paramObject2) {
    return a((Boolean)paramObject1, (Boolean)paramObject2) ^ true;
  }
}


/* Location:              C:\Users\panch\Downloads\dvba_v1.1.0-dex2jar.jar!\b\i\m\m.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */