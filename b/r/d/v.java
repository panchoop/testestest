package b.r.d;

import androidx.recyclerview.widget.RecyclerView;

public abstract class v extends RecyclerView.l {
  public boolean g = true;
  
  public boolean a(RecyclerView.d0 paramd01, RecyclerView.d0 paramd02, RecyclerView.l.c paramc1, RecyclerView.l.c paramc2) {
    int i;
    int j;
    boolean bool;
    int n = paramc1.a;
    int m = paramc1.b;
    if (paramd02.u()) {
      i = paramc1.a;
      j = paramc1.b;
    } else {
      i = paramc2.a;
      j = paramc2.b;
    } 
    k k = (k)this;
    if (paramd01 == paramd02) {
      bool = k.j(paramd01, n, m, i, j);
    } else {
      float f1 = paramd01.a.getTranslationX();
      float f2 = paramd01.a.getTranslationY();
      float f3 = paramd01.a.getAlpha();
      k.o(paramd01);
      int i1 = (int)((i - n) - f1);
      int i2 = (int)((j - m) - f2);
      paramd01.a.setTranslationX(f1);
      paramd01.a.setTranslationY(f2);
      paramd01.a.setAlpha(f3);
      k.o(paramd02);
      paramd02.a.setTranslationX(-i1);
      paramd02.a.setTranslationY(-i2);
      paramd02.a.setAlpha(0.0F);
      k.k.add(new k.a(paramd01, paramd02, n, m, i, j));
      bool = true;
    } 
    return bool;
  }
  
  public abstract boolean j(RecyclerView.d0 paramd0, int paramInt1, int paramInt2, int paramInt3, int paramInt4);
}


/* Location:              C:\Users\panch\Downloads\dvba_v1.1.0-dex2jar.jar!\b\r\d\v.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */