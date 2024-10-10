package b.r.d;

import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.List;

public class k extends v {
  public static TimeInterpolator s;
  
  public ArrayList<RecyclerView.d0> h = new ArrayList<RecyclerView.d0>();
  
  public ArrayList<RecyclerView.d0> i = new ArrayList<RecyclerView.d0>();
  
  public ArrayList<b> j = new ArrayList<b>();
  
  public ArrayList<a> k = new ArrayList<a>();
  
  public ArrayList<ArrayList<RecyclerView.d0>> l = new ArrayList<ArrayList<RecyclerView.d0>>();
  
  public ArrayList<ArrayList<b>> m = new ArrayList<ArrayList<b>>();
  
  public ArrayList<ArrayList<a>> n = new ArrayList<ArrayList<a>>();
  
  public ArrayList<RecyclerView.d0> o = new ArrayList<RecyclerView.d0>();
  
  public ArrayList<RecyclerView.d0> p = new ArrayList<RecyclerView.d0>();
  
  public ArrayList<RecyclerView.d0> q = new ArrayList<RecyclerView.d0>();
  
  public ArrayList<RecyclerView.d0> r = new ArrayList<RecyclerView.d0>();
  
  public boolean c(RecyclerView.d0 paramd0, List<Object> paramList) {
    return (!paramList.isEmpty() || super.c(paramd0, paramList));
  }
  
  public void f(RecyclerView.d0 paramd0) {
    View view = paramd0.a;
    view.animate().cancel();
    int i = this.j.size();
    while (true) {
      int j = i - 1;
      if (j >= 0) {
        i = j;
        if (((b)this.j.get(j)).a == paramd0) {
          view.setTranslationY(0.0F);
          view.setTranslationX(0.0F);
          d(paramd0);
          this.j.remove(j);
          i = j;
        } 
        continue;
      } 
      m(this.k, paramd0);
      if (this.h.remove(paramd0)) {
        view.setAlpha(1.0F);
        d(paramd0);
      } 
      if (this.i.remove(paramd0)) {
        view.setAlpha(1.0F);
        d(paramd0);
      } 
      i = this.n.size();
      while (--i >= 0) {
        ArrayList<a> arrayList = this.n.get(i);
        m(arrayList, paramd0);
        if (arrayList.isEmpty())
          this.n.remove(i); 
      } 
      i = this.m.size();
      while (true) {
        j = i - 1;
        if (j >= 0) {
          ArrayList arrayList = this.m.get(j);
          i = arrayList.size();
          while (--i >= 0) {
            if (((b)arrayList.get(i)).a == paramd0) {
              view.setTranslationY(0.0F);
              view.setTranslationX(0.0F);
              d(paramd0);
              arrayList.remove(i);
              if (arrayList.isEmpty())
                this.m.remove(j); 
              break;
            } 
          } 
          i = j;
          continue;
        } 
        i = this.l.size();
        while (--i >= 0) {
          ArrayList arrayList = this.l.get(i);
          if (arrayList.remove(paramd0)) {
            view.setAlpha(1.0F);
            d(paramd0);
            if (arrayList.isEmpty())
              this.l.remove(i); 
          } 
        } 
        this.q.remove(paramd0);
        this.o.remove(paramd0);
        this.r.remove(paramd0);
        this.p.remove(paramd0);
        l();
        return;
      } 
      break;
    } 
  }
  
  public void g() {
    int i = this.j.size();
    while (--i >= 0) {
      b b = this.j.get(i);
      View view = b.a.a;
      view.setTranslationY(0.0F);
      view.setTranslationX(0.0F);
      d(b.a);
      this.j.remove(i);
    } 
    i = this.h.size();
    while (--i >= 0) {
      d(this.h.get(i));
      this.h.remove(i);
    } 
    i = this.i.size();
    while (--i >= 0) {
      RecyclerView.d0 d0 = this.i.get(i);
      d0.a.setAlpha(1.0F);
      d(d0);
      this.i.remove(i);
    } 
    i = this.k.size();
    while (--i >= 0) {
      a a = this.k.get(i);
      RecyclerView.d0 d0 = a.a;
      if (d0 != null)
        n(a, d0); 
      d0 = a.b;
      if (d0 != null)
        n(a, d0); 
    } 
    this.k.clear();
    if (!h())
      return; 
    i = this.m.size();
    while (true) {
      int j = i - 1;
      if (j >= 0) {
        ArrayList<b> arrayList = this.m.get(j);
        i = arrayList.size();
        while (--i >= 0) {
          b b = arrayList.get(i);
          View view = b.a.a;
          view.setTranslationY(0.0F);
          view.setTranslationX(0.0F);
          d(b.a);
          arrayList.remove(i);
          if (arrayList.isEmpty())
            this.m.remove(arrayList); 
        } 
        i = j;
        continue;
      } 
      i = this.l.size();
      while (true) {
        j = i - 1;
        if (j >= 0) {
          ArrayList<RecyclerView.d0> arrayList = this.l.get(j);
          i = arrayList.size();
          while (--i >= 0) {
            RecyclerView.d0 d0 = arrayList.get(i);
            d0.a.setAlpha(1.0F);
            d(d0);
            arrayList.remove(i);
            if (arrayList.isEmpty())
              this.l.remove(arrayList); 
          } 
          i = j;
          continue;
        } 
        i = this.n.size();
        while (true) {
          j = i - 1;
          if (j >= 0) {
            ArrayList<a> arrayList = this.n.get(j);
            i = arrayList.size();
            while (--i >= 0) {
              a a = arrayList.get(i);
              RecyclerView.d0 d0 = a.a;
              if (d0 != null)
                n(a, d0); 
              d0 = a.b;
              if (d0 != null)
                n(a, d0); 
              if (arrayList.isEmpty())
                this.n.remove(arrayList); 
            } 
            i = j;
            continue;
          } 
          k(this.q);
          k(this.p);
          k(this.o);
          k(this.r);
          e();
          return;
        } 
        break;
      } 
      break;
    } 
  }
  
  public boolean h() {
    return (!this.i.isEmpty() || !this.k.isEmpty() || !this.j.isEmpty() || !this.h.isEmpty() || !this.p.isEmpty() || !this.q.isEmpty() || !this.o.isEmpty() || !this.r.isEmpty() || !this.m.isEmpty() || !this.l.isEmpty() || !this.n.isEmpty());
  }
  
  public boolean j(RecyclerView.d0 paramd0, int paramInt1, int paramInt2, int paramInt3, int paramInt4) {
    View view = paramd0.a;
    paramInt1 += (int)view.getTranslationX();
    paramInt2 += (int)paramd0.a.getTranslationY();
    o(paramd0);
    int i = paramInt3 - paramInt1;
    int j = paramInt4 - paramInt2;
    if (i == 0 && j == 0) {
      d(paramd0);
      return false;
    } 
    if (i != 0)
      view.setTranslationX(-i); 
    if (j != 0)
      view.setTranslationY(-j); 
    this.j.add(new b(paramd0, paramInt1, paramInt2, paramInt3, paramInt4));
    return true;
  }
  
  public void k(List<RecyclerView.d0> paramList) {
    int i = paramList.size();
    while (--i >= 0)
      ((RecyclerView.d0)paramList.get(i)).a.animate().cancel(); 
  }
  
  public void l() {
    if (!h())
      e(); 
  }
  
  public final void m(List<a> paramList, RecyclerView.d0 paramd0) {
    int i = paramList.size();
    while (true) {
      int j = i - 1;
      if (j >= 0) {
        a a = paramList.get(j);
        i = j;
        if (n(a, paramd0)) {
          i = j;
          if (a.a == null) {
            i = j;
            if (a.b == null) {
              paramList.remove(a);
              i = j;
            } 
          } 
        } 
        continue;
      } 
      break;
    } 
  }
  
  public final boolean n(a parama, RecyclerView.d0 paramd0) {
    if (parama.b == paramd0) {
      parama.b = null;
    } else {
      if (parama.a == paramd0) {
        parama.a = null;
        paramd0.a.setAlpha(1.0F);
        paramd0.a.setTranslationX(0.0F);
        paramd0.a.setTranslationY(0.0F);
        d(paramd0);
        return true;
      } 
      return false;
    } 
    paramd0.a.setAlpha(1.0F);
    paramd0.a.setTranslationX(0.0F);
    paramd0.a.setTranslationY(0.0F);
    d(paramd0);
    return true;
  }
  
  public final void o(RecyclerView.d0 paramd0) {
    if (s == null)
      s = (new ValueAnimator()).getInterpolator(); 
    paramd0.a.animate().setInterpolator(s);
    f(paramd0);
  }
  
  public static class a {
    public RecyclerView.d0 a;
    
    public RecyclerView.d0 b;
    
    public int c;
    
    public int d;
    
    public int e;
    
    public int f;
    
    public a(RecyclerView.d0 param1d01, RecyclerView.d0 param1d02, int param1Int1, int param1Int2, int param1Int3, int param1Int4) {
      this.a = param1d01;
      this.b = param1d02;
      this.c = param1Int1;
      this.d = param1Int2;
      this.e = param1Int3;
      this.f = param1Int4;
    }
    
    public String toString() {
      StringBuilder stringBuilder = c.a.a.a.a.e("ChangeInfo{oldHolder=");
      stringBuilder.append(this.a);
      stringBuilder.append(", newHolder=");
      stringBuilder.append(this.b);
      stringBuilder.append(", fromX=");
      stringBuilder.append(this.c);
      stringBuilder.append(", fromY=");
      stringBuilder.append(this.d);
      stringBuilder.append(", toX=");
      stringBuilder.append(this.e);
      stringBuilder.append(", toY=");
      stringBuilder.append(this.f);
      stringBuilder.append('}');
      return stringBuilder.toString();
    }
  }
  
  public static class b {
    public RecyclerView.d0 a;
    
    public int b;
    
    public int c;
    
    public int d;
    
    public int e;
    
    public b(RecyclerView.d0 param1d0, int param1Int1, int param1Int2, int param1Int3, int param1Int4) {
      this.a = param1d0;
      this.b = param1Int1;
      this.c = param1Int2;
      this.d = param1Int3;
      this.e = param1Int4;
    }
  }
}


/* Location:              C:\Users\panch\Downloads\dvba_v1.1.0-dex2jar.jar!\b\r\d\k.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */