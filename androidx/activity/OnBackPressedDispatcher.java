package androidx.activity;

import b.a.b;
import b.l.a.k;
import b.n.d;
import b.n.e;
import b.n.f;
import b.n.g;
import b.n.h;
import java.util.ArrayDeque;
import java.util.Iterator;

public final class OnBackPressedDispatcher {
  public final Runnable a;
  
  public final ArrayDeque<b> b = new ArrayDeque<b>();
  
  public OnBackPressedDispatcher(Runnable paramRunnable) {
    this.a = paramRunnable;
  }
  
  public void a() {
    Iterator<b> iterator = this.b.descendingIterator();
    while (iterator.hasNext()) {
      b b = iterator.next();
      if (b.a) {
        k k = ((k.a)b).c;
        k.P();
        if (k.l.a) {
          k.d();
        } else {
          k.k.a();
        } 
        return;
      } 
    } 
    Runnable runnable = this.a;
    if (runnable != null)
      runnable.run(); 
  }
  
  public class LifecycleOnBackPressedCancellable implements e, b.a.a {
    public final d a;
    
    public final b b;
    
    public b.a.a c;
    
    public final OnBackPressedDispatcher d;
    
    public LifecycleOnBackPressedCancellable(OnBackPressedDispatcher this$0, d param1d, b param1b) {
      this.a = param1d;
      this.b = param1b;
      param1d.a((f)this);
    }
    
    public void cancel() {
      ((h)this.a).a.d(this);
      this.b.b.remove(this);
      b.a.a a1 = this.c;
      if (a1 != null) {
        a1.cancel();
        this.c = null;
      } 
    }
    
    public void g(g param1g, d.a param1a) {
      OnBackPressedDispatcher.a a1;
      if (param1a == d.a.ON_START) {
        OnBackPressedDispatcher onBackPressedDispatcher = this.d;
        b b1 = this.b;
        onBackPressedDispatcher.b.add(b1);
        a1 = new OnBackPressedDispatcher.a(onBackPressedDispatcher, b1);
        b1.b.add(a1);
        this.c = a1;
      } else if (a1 == d.a.ON_STOP) {
        b.a.a a2 = this.c;
        if (a2 != null)
          a2.cancel(); 
      } else if (a1 == d.a.ON_DESTROY) {
        cancel();
      } 
    }
  }
  
  public class a implements b.a.a {
    public final b a;
    
    public final OnBackPressedDispatcher b;
    
    public a(OnBackPressedDispatcher this$0, b param1b) {
      this.a = param1b;
    }
    
    public void cancel() {
      this.b.b.remove(this.a);
      this.a.b.remove(this);
    }
  }
}


/* Location:              C:\Users\panch\Downloads\dvba_v1.1.0-dex2jar.jar!\androidx\activity\OnBackPressedDispatcher.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */