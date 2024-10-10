package b.g.b.i.l;

import java.util.ArrayList;

public class k {
  public static int c;
  
  public m a = null;
  
  public ArrayList<m> b = new ArrayList<m>();
  
  public k(m paramm, int paramInt) {
    c++;
    this.a = paramm;
  }
  
  public final long a(f paramf, long paramLong) {
    m m1 = paramf.d;
    if (m1 instanceof i)
      return paramLong; 
    int i = paramf.k.size();
    byte b = 0;
    long l1;
    for (l1 = paramLong; b < i; l1 = l) {
      d d = paramf.k.get(b);
      long l = l1;
      if (d instanceof f) {
        d = d;
        if (((f)d).d == m1) {
          l = l1;
        } else {
          l = Math.min(l1, a((f)d, ((f)d).f + paramLong));
        } 
      } 
      b++;
    } 
    long l2 = l1;
    if (paramf == m1.i) {
      l2 = m1.j();
      paramf = m1.h;
      paramLong -= l2;
      l2 = Math.min(Math.min(l1, a(paramf, paramLong)), paramLong - m1.h.f);
    } 
    return l2;
  }
  
  public final long b(f paramf, long paramLong) {
    m m1 = paramf.d;
    if (m1 instanceof i)
      return paramLong; 
    int i = paramf.k.size();
    byte b = 0;
    long l1;
    for (l1 = paramLong; b < i; l1 = l) {
      d d = paramf.k.get(b);
      long l = l1;
      if (d instanceof f) {
        d = d;
        if (((f)d).d == m1) {
          l = l1;
        } else {
          l = Math.max(l1, b((f)d, ((f)d).f + paramLong));
        } 
      } 
      b++;
    } 
    long l2 = l1;
    if (paramf == m1.h) {
      l2 = m1.j();
      paramf = m1.i;
      paramLong += l2;
      l2 = Math.max(Math.max(l1, b(paramf, paramLong)), paramLong - m1.i.f);
    } 
    return l2;
  }
}


/* Location:              C:\Users\panch\Downloads\dvba_v1.1.0-dex2jar.jar!\b\g\b\i\l\k.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */