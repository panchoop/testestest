package b.r.d;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;

public class p extends w {
  public t d;
  
  public t e;
  
  public int[] a(RecyclerView.o paramo, View paramView) {
    int[] arrayOfInt = new int[2];
    if (paramo.e()) {
      arrayOfInt[0] = d(paramView, g(paramo));
    } else {
      arrayOfInt[0] = 0;
    } 
    if (paramo.f()) {
      arrayOfInt[1] = d(paramView, h(paramo));
    } else {
      arrayOfInt[1] = 0;
    } 
    return arrayOfInt;
  }
  
  public View b(RecyclerView.o paramo) {
    t t1;
    if (paramo.f()) {
      t1 = h(paramo);
    } else {
      if (paramo.e()) {
        t1 = g(paramo);
        return f(paramo, t1);
      } 
      return null;
    } 
    return f(paramo, t1);
  }
  
  public final int d(View paramView, t paramt) {
    int i = paramt.e(paramView);
    int j = paramt.c(paramView) / 2;
    int k = paramt.k();
    return j + i - paramt.l() / 2 + k;
  }
  
  public final int e(RecyclerView.o paramo, t paramt, int paramInt1, int paramInt2) {
    float f1;
    int[] arrayOfInt = new int[2];
    this.b.fling(0, 0, paramInt1, paramInt2, -2147483648, 2147483647, -2147483648, 2147483647);
    arrayOfInt[0] = this.b.getFinalX();
    arrayOfInt[1] = this.b.getFinalY();
    int i = paramo.y();
    float f2 = 1.0F;
    if (i == 0) {
      f1 = f2;
    } else {
      View view1 = null;
      View view2 = null;
      paramInt1 = Integer.MAX_VALUE;
      int j = Integer.MIN_VALUE;
      byte b = 0;
      while (b < i) {
        int m;
        View view4;
        View view3 = paramo.x(b);
        int k = paramo.P(view3);
        if (k == -1) {
          view4 = view1;
          m = j;
        } else {
          paramInt2 = paramInt1;
          if (k < paramInt1) {
            view1 = view3;
            paramInt2 = k;
          } 
          view4 = view1;
          paramInt1 = paramInt2;
          m = j;
          if (k > j) {
            view2 = view3;
            m = k;
            paramInt1 = paramInt2;
            view4 = view1;
          } 
        } 
        b++;
        view1 = view4;
        j = m;
      } 
      f1 = f2;
      if (view1 != null)
        if (view2 == null) {
          f1 = f2;
        } else {
          paramInt2 = Math.min(paramt.e(view1), paramt.e(view2));
          paramInt2 = Math.max(paramt.b(view1), paramt.b(view2)) - paramInt2;
          if (paramInt2 == 0) {
            f1 = f2;
          } else {
            f1 = paramInt2 * 1.0F / (j - paramInt1 + 1);
          } 
        }  
    } 
    if (f1 <= 0.0F)
      return 0; 
    if (Math.abs(arrayOfInt[0]) > Math.abs(arrayOfInt[1])) {
      paramInt1 = arrayOfInt[0];
    } else {
      paramInt1 = arrayOfInt[1];
    } 
    return Math.round(paramInt1 / f1);
  }
  
  public final View f(RecyclerView.o paramo, t paramt) {
    int k = paramo.y();
    View view = null;
    if (k == 0)
      return null; 
    int j = paramt.k();
    int m = paramt.l() / 2;
    int i = Integer.MAX_VALUE;
    byte b = 0;
    while (b < k) {
      View view1 = paramo.x(b);
      int n = paramt.e(view1);
      int i1 = Math.abs(paramt.c(view1) / 2 + n - m + j);
      n = i;
      if (i1 < i) {
        view = view1;
        n = i1;
      } 
      b++;
      i = n;
    } 
    return view;
  }
  
  public final t g(RecyclerView.o paramo) {
    t t1 = this.e;
    if (t1 == null || t1.a != paramo)
      this.e = new r(paramo); 
    return this.e;
  }
  
  public final t h(RecyclerView.o paramo) {
    t t1 = this.d;
    if (t1 == null || t1.a != paramo)
      this.d = new s(paramo); 
    return this.d;
  }
}


/* Location:              C:\Users\panch\Downloads\dvba_v1.1.0-dex2jar.jar!\b\r\d\p.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */