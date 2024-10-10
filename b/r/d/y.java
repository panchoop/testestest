package b.r.d;

import android.view.View;

public class y {
  public final b a;
  
  public a b;
  
  public y(b paramb) {
    this.a = paramb;
    this.b = new a();
  }
  
  public View a(int paramInt1, int paramInt2, int paramInt3, int paramInt4) {
    byte b1;
    View view;
    int j = this.a.b();
    int i = this.a.a();
    if (paramInt2 > paramInt1) {
      b1 = 1;
    } else {
      b1 = -1;
    } 
    a a1 = null;
    while (paramInt1 != paramInt2) {
      View view1;
      View view2 = this.a.e(paramInt1);
      int k = this.a.d(view2);
      int m = this.a.c(view2);
      a a2 = this.b;
      a2.b = j;
      a2.c = i;
      a2.d = k;
      a2.e = m;
      if (paramInt3 != 0) {
        a2.a = 0;
        a2.a = paramInt3 | 0x0;
        if (a2.a())
          return view2; 
      } 
      a2 = a1;
      if (paramInt4 != 0) {
        a a3 = this.b;
        a3.a = 0;
        a3.a = paramInt4 | 0x0;
        a2 = a1;
        if (a3.a())
          view1 = view2; 
      } 
      paramInt1 += b1;
      view = view1;
    } 
    return view;
  }
  
  public boolean b(View paramView, int paramInt) {
    a a1 = this.b;
    int k = this.a.b();
    int i = this.a.a();
    int m = this.a.d(paramView);
    int j = this.a.c(paramView);
    a1.b = k;
    a1.c = i;
    a1.d = m;
    a1.e = j;
    boolean bool = false;
    if (paramInt != 0) {
      a a2 = this.b;
      a2.a = 0;
      a2.a = 0x0 | paramInt;
      bool = a2.a();
    } 
    return bool;
  }
  
  public static class a {
    public int a = 0;
    
    public int b;
    
    public int c;
    
    public int d;
    
    public int e;
    
    public boolean a() {
      int i = this.a;
      if ((i & 0x7) != 0 && (i & b(this.d, this.b) << 0) == 0)
        return false; 
      i = this.a;
      if ((i & 0x70) != 0 && (i & b(this.d, this.c) << 4) == 0)
        return false; 
      i = this.a;
      if ((i & 0x700) != 0 && (i & b(this.e, this.b) << 8) == 0)
        return false; 
      i = this.a;
      return !((i & 0x7000) != 0 && (i & b(this.e, this.c) << 12) == 0);
    }
    
    public int b(int param1Int1, int param1Int2) {
      return (param1Int1 > param1Int2) ? 1 : ((param1Int1 == param1Int2) ? 2 : 4);
    }
  }
  
  public static interface b {
    int a();
    
    int b();
    
    int c(View param1View);
    
    int d(View param1View);
    
    View e(int param1Int);
  }
}


/* Location:              C:\Users\panch\Downloads\dvba_v1.1.0-dex2jar.jar!\b\r\d\y.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */