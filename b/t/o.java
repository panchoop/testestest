package b.t;

import android.animation.TimeInterpolator;
import android.util.AndroidRuntimeException;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import java.util.Iterator;

public class o extends i {
  public ArrayList<i> J = new ArrayList<i>();
  
  public boolean K = true;
  
  public int L;
  
  public boolean M = false;
  
  public int N = 0;
  
  public i A(long paramLong) {
    this.d = paramLong;
    if (paramLong >= 0L) {
      ArrayList<i> arrayList = this.J;
      if (arrayList != null) {
        int j = arrayList.size();
        for (byte b = 0; b < j; b++)
          ((i)this.J.get(b)).A(paramLong); 
      } 
    } 
    return this;
  }
  
  public void B(i.c paramc) {
    this.E = paramc;
    this.N |= 0x8;
    int j = this.J.size();
    for (byte b = 0; b < j; b++)
      ((i)this.J.get(b)).B(paramc); 
  }
  
  public i C(TimeInterpolator paramTimeInterpolator) {
    this.N |= 0x1;
    ArrayList<i> arrayList = this.J;
    if (arrayList != null) {
      int j = arrayList.size();
      for (byte b = 0; b < j; b++)
        ((i)this.J.get(b)).C(paramTimeInterpolator); 
    } 
    this.e = paramTimeInterpolator;
    return this;
  }
  
  public void D(e parame) {
    e e1;
    if (parame == null) {
      e1 = i.H;
    } else {
      e1 = parame;
    } 
    this.F = e1;
    this.N |= 0x4;
    if (this.J != null)
      for (byte b = 0; b < this.J.size(); b++)
        ((i)this.J.get(b)).D(parame);  
  }
  
  public void E(n paramn) {
    this.D = paramn;
    this.N |= 0x2;
    int j = this.J.size();
    for (byte b = 0; b < j; b++)
      ((i)this.J.get(b)).E(paramn); 
  }
  
  public i F(long paramLong) {
    this.c = paramLong;
    return this;
  }
  
  public String H(String paramString) {
    String str = super.H(paramString);
    for (byte b = 0; b < this.J.size(); b++) {
      StringBuilder stringBuilder1 = new StringBuilder();
      stringBuilder1.append(str);
      stringBuilder1.append("\n");
      i i1 = this.J.get(b);
      StringBuilder stringBuilder2 = new StringBuilder();
      stringBuilder2.append(paramString);
      stringBuilder2.append("  ");
      stringBuilder1.append(i1.H(stringBuilder2.toString()));
      str = stringBuilder1.toString();
    } 
    return str;
  }
  
  public o I(i parami) {
    this.J.add(parami);
    parami.s = this;
    long l = this.d;
    if (l >= 0L)
      parami.A(l); 
    if ((this.N & 0x1) != 0)
      parami.C(this.e); 
    if ((this.N & 0x2) != 0)
      parami.E(null); 
    if ((this.N & 0x4) != 0)
      parami.D(this.F); 
    if ((this.N & 0x8) != 0)
      parami.B(this.E); 
    return this;
  }
  
  public i J(int paramInt) {
    return (paramInt < 0 || paramInt >= this.J.size()) ? null : this.J.get(paramInt);
  }
  
  public o K(int paramInt) {
    if (paramInt != 0) {
      if (paramInt == 1) {
        this.K = false;
      } else {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Invalid parameter for TransitionSet ordering: ");
        stringBuilder.append(paramInt);
        throw new AndroidRuntimeException(stringBuilder.toString());
      } 
    } else {
      this.K = true;
    } 
    return this;
  }
  
  public i a(i.d paramd) {
    super.a(paramd);
    return this;
  }
  
  public i b(View paramView) {
    for (byte b = 0; b < this.J.size(); b++)
      ((i)this.J.get(b)).b(paramView); 
    this.g.add(paramView);
    return this;
  }
  
  public void d() {
    super.d();
    int j = this.J.size();
    for (byte b = 0; b < j; b++)
      ((i)this.J.get(b)).d(); 
  }
  
  public void e(q paramq) {
    if (t(paramq.b))
      for (i i1 : this.J) {
        if (i1.t(paramq.b)) {
          i1.e(paramq);
          paramq.c.add(i1);
        } 
      }  
  }
  
  public void g(q paramq) {
    int j = this.J.size();
    for (byte b = 0; b < j; b++)
      ((i)this.J.get(b)).g(paramq); 
  }
  
  public void h(q paramq) {
    if (t(paramq.b))
      for (i i1 : this.J) {
        if (i1.t(paramq.b)) {
          i1.h(paramq);
          paramq.c.add(i1);
        } 
      }  
  }
  
  public i k() {
    o o1 = (o)super.k();
    o1.J = new ArrayList<i>();
    int j = this.J.size();
    for (byte b = 0; b < j; b++) {
      i i1 = ((i)this.J.get(b)).k();
      o1.J.add(i1);
      i1.s = o1;
    } 
    return o1;
  }
  
  public void m(ViewGroup paramViewGroup, r paramr1, r paramr2, ArrayList<q> paramArrayList1, ArrayList<q> paramArrayList2) {
    long l = this.c;
    int j = this.J.size();
    for (byte b = 0; b < j; b++) {
      i i1 = this.J.get(b);
      if (l > 0L && (this.K || b == 0)) {
        long l1 = i1.c;
        if (l1 > 0L) {
          i1.F(l1 + l);
        } else {
          i1.F(l);
        } 
      } 
      i1.m(paramViewGroup, paramr1, paramr2, paramArrayList1, paramArrayList2);
    } 
  }
  
  public void v(View paramView) {
    super.v(paramView);
    int j = this.J.size();
    for (byte b = 0; b < j; b++)
      ((i)this.J.get(b)).v(paramView); 
  }
  
  public i w(i.d paramd) {
    super.w(paramd);
    return this;
  }
  
  public i x(View paramView) {
    for (byte b = 0; b < this.J.size(); b++)
      ((i)this.J.get(b)).x(paramView); 
    this.g.remove(paramView);
    return this;
  }
  
  public void y(View paramView) {
    super.y(paramView);
    int j = this.J.size();
    for (byte b = 0; b < j; b++)
      ((i)this.J.get(b)).y(paramView); 
  }
  
  public void z() {
    if (this.J.isEmpty()) {
      G();
      n();
      return;
    } 
    b b = new b(this);
    Iterator<i> iterator = this.J.iterator();
    while (iterator.hasNext())
      ((i)iterator.next()).a(b); 
    this.L = this.J.size();
    if (!this.K) {
      for (byte b1 = 1; b1 < this.J.size(); b1++)
        ((i)this.J.get(b1 - 1)).a(new a(this, this.J.get(b1))); 
      i i1 = this.J.get(0);
      if (i1 != null)
        i1.z(); 
    } else {
      Iterator<i> iterator1 = this.J.iterator();
      while (iterator1.hasNext())
        ((i)iterator1.next()).z(); 
    } 
  }
  
  public class a extends l {
    public final i a;
    
    public a(o this$0, i param1i) {}
    
    public void c(i param1i) {
      this.a.z();
      param1i.w(this);
    }
  }
  
  public static class b extends l {
    public o a;
    
    public b(o param1o) {
      this.a = param1o;
    }
    
    public void a(i param1i) {
      param1i = this.a;
      if (!((o)param1i).M) {
        param1i.G();
        this.a.M = true;
      } 
    }
    
    public void c(i param1i) {
      o o1 = this.a;
      int j = o1.L - 1;
      o1.L = j;
      if (j == 0) {
        o1.M = false;
        o1.n();
      } 
      param1i.w(this);
    }
  }
}


/* Location:              C:\Users\panch\Downloads\dvba_v1.1.0-dex2jar.jar!\b\t\o.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */