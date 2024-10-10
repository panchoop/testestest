package b.g.b.i;

import b.g.b.c;
import java.util.ArrayList;

public class k extends d {
  public ArrayList<d> f0 = new ArrayList<d>();
  
  public void E() {
    ArrayList<d> arrayList = this.f0;
    if (arrayList == null)
      return; 
    int i = arrayList.size();
    for (byte b = 0; b < i; b++) {
      d d1 = this.f0.get(b);
      if (d1 instanceof k)
        ((k)d1).E(); 
    } 
  }
  
  public void u() {
    this.f0.clear();
    super.u();
  }
  
  public void v(c paramc) {
    super.v(paramc);
    int i = this.f0.size();
    for (byte b = 0; b < i; b++)
      ((d)this.f0.get(b)).v(paramc); 
  }
}


/* Location:              C:\Users\panch\Downloads\dvba_v1.1.0-dex2jar.jar!\b\g\b\i\k.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */