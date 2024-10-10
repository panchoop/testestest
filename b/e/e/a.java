package b.e.e;

import androidx.cardview.widget.CardView;

public class a implements c {
  public final d a(b paramb) {
    return (d)((CardView.a)paramb).a;
  }
  
  public float b(b paramb) {
    return (a(paramb)).e;
  }
  
  public float c(b paramb) {
    return (a(paramb)).a;
  }
  
  public void d(b paramb, float paramFloat) {
    d d = a(paramb);
    CardView.a a1 = (CardView.a)paramb;
    boolean bool2 = a1.b.getUseCompatPadding();
    boolean bool1 = a1.a();
    if (paramFloat != d.e || d.f != bool2 || d.g != bool1) {
      d.e = paramFloat;
      d.f = bool2;
      d.g = bool1;
      d.c(null);
      d.invalidateSelf();
    } 
    if (!a1.b.getUseCompatPadding()) {
      a1.b(0, 0, 0, 0);
    } else {
      paramFloat = (a(paramb)).e;
      float f = (a(paramb)).a;
      int j = (int)Math.ceil(e.a(paramFloat, f, a1.a()));
      int i = (int)Math.ceil(e.b(paramFloat, f, a1.a()));
      a1.b(j, i, j, i);
    } 
  }
}


/* Location:              C:\Users\panch\Downloads\dvba_v1.1.0-dex2jar.jar!\b\e\e\a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */