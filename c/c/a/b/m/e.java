package c.c.a.b.m;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import androidx.coordinatorlayout.widget.CoordinatorLayout;

public class e<V extends View> extends CoordinatorLayout.c<V> {
  public f a;
  
  public int b = 0;
  
  public int c = 0;
  
  public e() {}
  
  public e(Context paramContext, AttributeSet paramAttributeSet) {
    super(paramContext, paramAttributeSet);
  }
  
  public int B() {
    boolean bool;
    f f1 = this.a;
    if (f1 != null) {
      bool = f1.d;
    } else {
      bool = false;
    } 
    return bool;
  }
  
  public void C(CoordinatorLayout paramCoordinatorLayout, V paramV, int paramInt) {
    paramCoordinatorLayout.q((View)paramV, paramInt);
  }
  
  public boolean D(int paramInt) {
    f f1 = this.a;
    boolean bool = false;
    if (f1 != null) {
      boolean bool1 = bool;
      if (f1.f) {
        bool1 = bool;
        if (f1.d != paramInt) {
          f1.d = paramInt;
          f1.a();
          bool1 = true;
        } 
      } 
      return bool1;
    } 
    this.b = paramInt;
    return false;
  }
  
  public boolean k(CoordinatorLayout paramCoordinatorLayout, V paramV, int paramInt) {
    C(paramCoordinatorLayout, paramV, paramInt);
    if (this.a == null)
      this.a = new f((View)paramV); 
    f f1 = this.a;
    f1.b = f1.a.getTop();
    f1.c = f1.a.getLeft();
    this.a.a();
    paramInt = this.b;
    if (paramInt != 0) {
      f1 = this.a;
      if (f1.f && f1.d != paramInt) {
        f1.d = paramInt;
        f1.a();
      } 
      this.b = 0;
    } 
    paramInt = this.c;
    if (paramInt != 0) {
      f1 = this.a;
      if (f1.g && f1.e != paramInt) {
        f1.e = paramInt;
        f1.a();
      } 
      this.c = 0;
    } 
    return true;
  }
}


/* Location:              C:\Users\panch\Downloads\dvba_v1.1.0-dex2jar.jar!\c\c\a\b\m\e.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */