package androidx.lifecycle;

import b.c.a.b.b;
import b.n.d;
import b.n.g;
import b.n.h;
import b.n.m;
import java.util.Map;

public abstract class LiveData<T> {
  public static final Object i = new Object();
  
  public final Object a = new Object();
  
  public b<m<? super T>, a> b = new b();
  
  public int c = 0;
  
  public volatile Object d = i;
  
  public volatile Object e = i;
  
  public int f = -1;
  
  public boolean g;
  
  public boolean h;
  
  public static void a(String paramString) {
    if ((b.c.a.a.a.b()).a.a())
      return; 
    StringBuilder stringBuilder = new StringBuilder();
    stringBuilder.append("Cannot invoke ");
    stringBuilder.append(paramString);
    stringBuilder.append(" on a background");
    stringBuilder.append(" thread");
    throw new IllegalStateException(stringBuilder.toString());
  }
  
  public final void b(a parama) {
    if (!parama.b)
      return; 
    if (!parama.i()) {
      parama.h(false);
      return;
    } 
    int j = parama.c;
    int i = this.f;
    if (j >= i)
      return; 
    parama.c = i;
    parama.a.a(this.d);
  }
  
  public void c(a parama) {
    if (this.g) {
      this.h = true;
      return;
    } 
    this.g = true;
    a a1 = parama;
    while (true) {
      this.h = false;
      if (a1 != null) {
        b(a1);
        parama = null;
      } else {
        b.d d = this.b.b();
        while (true) {
          parama = a1;
          if (d.hasNext()) {
            b((a)((Map.Entry)d.next()).getValue());
            if (this.h) {
              parama = a1;
              break;
            } 
            continue;
          } 
          break;
        } 
      } 
      a1 = parama;
      if (!this.h) {
        this.g = false;
        return;
      } 
    } 
  }
  
  public void d() {}
  
  public void e() {}
  
  public void f(m<? super T> paramm) {
    a("removeObserver");
    a a = (a)this.b.d(paramm);
    if (a == null)
      return; 
    LifecycleBoundObserver lifecycleBoundObserver = (LifecycleBoundObserver)a;
    ((h)lifecycleBoundObserver.e.a()).a.d(lifecycleBoundObserver);
    a.h(false);
  }
  
  public class LifecycleBoundObserver extends a implements Object {
    public final g e;
    
    public final LiveData f;
    
    public void g(g param1g, d.a param1a) {
      if (((h)this.e.a()).b == d.b.b) {
        this.f.f(this.a);
        return;
      } 
      h(i());
    }
    
    public boolean i() {
      boolean bool;
      if (((h)this.e.a()).b.compareTo(d.b.e) >= 0) {
        bool = true;
      } else {
        bool = false;
      } 
      return bool;
    }
  }
  
  public abstract class a {
    public final m<? super T> a;
    
    public boolean b;
    
    public int c;
    
    public final LiveData d;
    
    public void h(boolean param1Boolean) {
      if (param1Boolean == this.b)
        return; 
      this.b = param1Boolean;
      int i = this.d.c;
      byte b = 1;
      if (i == 0) {
        i = 1;
      } else {
        i = 0;
      } 
      LiveData liveData = this.d;
      int j = liveData.c;
      if (!this.b)
        b = -1; 
      liveData.c = j + b;
      if (i != 0 && this.b)
        this.d.d(); 
      liveData = this.d;
      if (liveData.c == 0 && !this.b)
        liveData.e(); 
      if (this.b)
        this.d.c(this); 
    }
    
    public abstract boolean i();
  }
}


/* Location:              C:\Users\panch\Downloads\dvba_v1.1.0-dex2jar.jar!\androidx\lifecycle\LiveData.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */