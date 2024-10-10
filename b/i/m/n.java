package b.i.m;

import android.text.TextUtils;
import android.view.View;

public class n extends l.b<CharSequence> {
  public n(int paramInt1, Class<CharSequence> paramClass, int paramInt2, int paramInt3) {
    super(paramInt1, paramClass, paramInt2, paramInt3);
  }
  
  public Object b(View paramView) {
    return paramView.getAccessibilityPaneTitle();
  }
  
  public void c(View paramView, Object paramObject) {
    paramView.setAccessibilityPaneTitle((CharSequence)paramObject);
  }
  
  public boolean e(Object paramObject1, Object paramObject2) {
    return TextUtils.equals((CharSequence)paramObject1, (CharSequence)paramObject2) ^ true;
  }
}


/* Location:              C:\Users\panch\Downloads\dvba_v1.1.0-dex2jar.jar!\b\i\m\n.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */