package b.r.d;

import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;

public final class s extends t {
  public s(RecyclerView.o paramo) {
    super(paramo, null);
  }
  
  public int b(View paramView) {
    RecyclerView.p p = (RecyclerView.p)paramView.getLayoutParams();
    return this.a.B(paramView) + ((ViewGroup.MarginLayoutParams)p).bottomMargin;
  }
  
  public int c(View paramView) {
    RecyclerView.p p = (RecyclerView.p)paramView.getLayoutParams();
    return this.a.D(paramView) + ((ViewGroup.MarginLayoutParams)p).topMargin + ((ViewGroup.MarginLayoutParams)p).bottomMargin;
  }
  
  public int d(View paramView) {
    RecyclerView.p p = (RecyclerView.p)paramView.getLayoutParams();
    return this.a.E(paramView) + ((ViewGroup.MarginLayoutParams)p).leftMargin + ((ViewGroup.MarginLayoutParams)p).rightMargin;
  }
  
  public int e(View paramView) {
    RecyclerView.p p = (RecyclerView.p)paramView.getLayoutParams();
    return this.a.G(paramView) - ((ViewGroup.MarginLayoutParams)p).topMargin;
  }
  
  public int f() {
    return this.a.r;
  }
  
  public int g() {
    RecyclerView.o o = this.a;
    return o.r - o.L();
  }
  
  public int h() {
    return this.a.L();
  }
  
  public int i() {
    return this.a.p;
  }
  
  public int j() {
    return this.a.o;
  }
  
  public int k() {
    return this.a.O();
  }
  
  public int l() {
    RecyclerView.o o = this.a;
    return o.r - o.O() - this.a.L();
  }
  
  public int n(View paramView) {
    this.a.T(paramView, true, this.c);
    return this.c.bottom;
  }
  
  public int o(View paramView) {
    this.a.T(paramView, true, this.c);
    return this.c.top;
  }
  
  public void p(int paramInt) {
    this.a.a0(paramInt);
  }
}


/* Location:              C:\Users\panch\Downloads\dvba_v1.1.0-dex2jar.jar!\b\r\d\s.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */