package b.i.m.v;

import android.os.Bundle;
import android.view.accessibility.AccessibilityNodeInfo;
import android.view.accessibility.AccessibilityNodeProvider;
import java.util.List;

public class c {
  public final Object a = new b(this);
  
  public c() {}
  
  public c(Object paramObject) {}
  
  public b a(int paramInt) {
    return null;
  }
  
  public b b(int paramInt) {
    return null;
  }
  
  public boolean c(int paramInt1, int paramInt2, Bundle paramBundle) {
    return false;
  }
  
  public static class a extends AccessibilityNodeProvider {
    public final c a;
    
    public a(c param1c) {
      this.a = param1c;
    }
    
    public AccessibilityNodeInfo createAccessibilityNodeInfo(int param1Int) {
      b b = this.a.a(param1Int);
      return (b == null) ? null : b.a;
    }
    
    public List<AccessibilityNodeInfo> findAccessibilityNodeInfosByText(String param1String, int param1Int) {
      if (this.a != null)
        return null; 
      throw null;
    }
    
    public boolean performAction(int param1Int1, int param1Int2, Bundle param1Bundle) {
      return this.a.c(param1Int1, param1Int2, param1Bundle);
    }
  }
  
  public static class b extends a {
    public b(c param1c) {
      super(param1c);
    }
    
    public AccessibilityNodeInfo findFocus(int param1Int) {
      b b1 = this.a.b(param1Int);
      return (b1 == null) ? null : b1.a;
    }
  }
}


/* Location:              C:\Users\panch\Downloads\dvba_v1.1.0-dex2jar.jar!\b\i\m\v\c.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */