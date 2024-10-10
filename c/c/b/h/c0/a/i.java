package c.c.b.h.c0.a;

import android.text.TextUtils;
import c.c.a.a.c.c;
import c.c.a.a.c.k.k.k;
import c.c.a.a.c.l.q;
import c.c.a.a.f.c.a1;
import c.c.a.a.f.c.b0;
import c.c.a.a.f.c.r0;
import c.c.b.h.d0.r;
import c.c.b.h.p;

public final class i extends u0<p, r> {
  public final b0 w;
  
  public i(String paramString) {
    super(1);
    q.e(paramString, "refresh token cannot be null");
    this.w = new b0(paramString);
  }
  
  public final String a() {
    return "getAccessToken";
  }
  
  public final k<l0, p> b() {
    k.a a = k.a();
    a.b = false;
    if (this.t || this.u) {
      c[] arrayOfC1 = null;
      a.c = arrayOfC1;
      a.a = new k(this);
      return a.a();
    } 
    c[] arrayOfC = new c[1];
    arrayOfC[0] = r0.b;
    a.c = arrayOfC;
    a.a = new k(this);
    return a.a();
  }
  
  public final void h() {
    if (TextUtils.isEmpty(this.j.b)) {
      a1 a1 = this.j;
      String str = this.w.b;
      if (a1 != null) {
        q.d(str);
        a1.b = str;
      } else {
        throw null;
      } 
    } 
    ((r)this.e).a(this.j, this.d);
    p p = c.c.b.h.d0.i.a(this.j.c);
    this.v = true;
    this.g.a((ResultT)p, null);
  }
}


/* Location:              C:\Users\panch\Downloads\dvba_v1.1.0-dex2jar.jar!\c\c\b\h\c0\a\i.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */