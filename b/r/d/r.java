package b.r.d;

import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;

public final class r extends t {
  public r(RecyclerView.o paramo) {
    super(paramo, null);
  }
  
  public int b(View paramView) {
    RecyclerView.p p = (RecyclerView.p)paramView.getLayoutParams();
    return this.a.F(paramView) + ((ViewGroup.MarginLayoutParams)p).rightMargin;
  }
  
  public int c(View paramView) {
    RecyclerView.p p = (RecyclerView.p)paramView.getLayoutParams();
    return this.a.E(paramView) + ((ViewGroup.MarginLayoutParams)p).leftMargin + ((ViewGroup.MarginLayoutParams)p).rightMargin;
  }
  
  public int d(View paramView) {
    RecyclerView.p p = (RecyclerView.p)paramView.getLayoutParams();
    return this.a.D(paramView) + ((ViewGroup.MarginLayoutParams)p).topMargin + ((ViewGroup.MarginLayoutParams)p).bottomMargin;
  }
  
  public int e(View paramView) {
    RecyclerView.p p = (RecyclerView.p)paramView.getLayoutParams();
    return this.a.C(paramView) - ((ViewGroup.MarginLayoutParams)p).leftMargin;
  }
  
  public int f() {
    return this.a.q;
  }
  
  public int g() {
    RecyclerView.o o = this.a;
    return o.q - o.N();
  }
  
  public int h() {
    return this.a.N();
  }
  
  public int i() {
    return this.a.o;
  }
  
  public int j() {
    return this.a.p;
  }
  
  public int k() {
    return this.a.M();
  }
  
  public int l() {
    RecyclerView.o o = this.a;
    return o.q - o.M() - this.a.N();
  }
  
  public int n(View paramView) {
    this.a.T(paramView, true, this.c);
    return this.c.right;
  }
  
  public int o(View paramView) {
    this.a.T(paramView, true, this.c);
    return this.c.left;
  }
  
  public void p(int paramInt) {
    this.a.Z(paramInt);
  }
}


/* Location:              C:\Users\panch\Downloads\dvba_v1.1.0-dex2jar.jar!\b\r\d\r.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */