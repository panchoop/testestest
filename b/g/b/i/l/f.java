package b.g.b.i.l;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class f implements d {
  public d a = null;
  
  public boolean b = false;
  
  public boolean c = false;
  
  public m d;
  
  public a e = a.b;
  
  public int f;
  
  public int g;
  
  public int h = 1;
  
  public g i = null;
  
  public boolean j = false;
  
  public List<d> k = new ArrayList<d>();
  
  public List<f> l = new ArrayList<f>();
  
  public f(m paramm) {
    this.d = paramm;
  }
  
  public void a(d paramd) {
    Iterator<f> iterator = this.l.iterator();
    while (iterator.hasNext()) {
      if (!((f)iterator.next()).j)
        return; 
    } 
    this.c = true;
    d d1 = this.a;
    if (d1 != null)
      d1.a(this); 
    if (this.b) {
      this.d.a(this);
      return;
    } 
    d1 = null;
    byte b = 0;
    for (f f1 : this.l) {
      if (f1 instanceof g)
        continue; 
      b++;
      d1 = f1;
    } 
    if (d1 != null && b == 1 && ((f)d1).j) {
      g g1 = this.i;
      if (g1 != null)
        if (g1.j) {
          this.f = this.h * g1.g;
        } else {
          return;
        }  
      c(((f)d1).g + this.f);
    } 
    d1 = this.a;
    if (d1 != null)
      d1.a(this); 
  }
  
  public void b() {
    this.l.clear();
    this.k.clear();
    this.j = false;
    this.g = 0;
    this.c = false;
    this.b = false;
  }
  
  public void c(int paramInt) {
    if (this.j)
      return; 
    this.j = true;
    this.g = paramInt;
    for (d d1 : this.k)
      d1.a(d1); 
  }
  
  public String toString() {
    String str;
    StringBuilder stringBuilder = new StringBuilder();
    stringBuilder.append(this.d.b.Y);
    stringBuilder.append(":");
    stringBuilder.append(this.e);
    stringBuilder.append("(");
    if (this.j) {
      Integer integer = Integer.valueOf(this.g);
    } else {
      str = "unresolved";
    } 
    stringBuilder.append(str);
    stringBuilder.append(") <t=");
    stringBuilder.append(this.l.size());
    stringBuilder.append(":d=");
    stringBuilder.append(this.k.size());
    stringBuilder.append(">");
    return stringBuilder.toString();
  }
  
  public enum a {
    b, c, d, e, f, g, h, i;
    
    public static final a[] j;
    
    static {
      a a1 = new a("BASELINE", 7);
      i = a1;
      j = new a[] { b, c, d, e, f, g, h, a1 };
    }
  }
}


/* Location:              C:\Users\panch\Downloads\dvba_v1.1.0-dex2jar.jar!\b\g\b\i\l\f.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */