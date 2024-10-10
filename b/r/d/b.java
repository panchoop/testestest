package b.r.d;

import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import b.i.m.l;
import java.util.ArrayList;
import java.util.List;

public class b {
  public final b a;
  
  public final a b;
  
  public final List<View> c;
  
  public b(b paramb) {
    this.a = paramb;
    this.b = new a();
    this.c = new ArrayList<View>();
  }
  
  public void a(View paramView, int paramInt, boolean paramBoolean) {
    if (paramInt < 0) {
      paramInt = ((RecyclerView.e)this.a).b();
    } else {
      paramInt = f(paramInt);
    } 
    this.b.e(paramInt, paramBoolean);
    if (paramBoolean)
      i(paramView); 
    RecyclerView.e e = (RecyclerView.e)this.a;
    e.a.addView(paramView, paramInt);
    e.a.dispatchChildAttached(paramView);
  }
  
  public void b(View paramView, int paramInt, ViewGroup.LayoutParams paramLayoutParams, boolean paramBoolean) {
    if (paramInt < 0) {
      paramInt = ((RecyclerView.e)this.a).b();
    } else {
      paramInt = f(paramInt);
    } 
    this.b.e(paramInt, paramBoolean);
    if (paramBoolean)
      i(paramView); 
    RecyclerView.e e = (RecyclerView.e)this.a;
    if (e != null) {
      StringBuilder stringBuilder;
      RecyclerView.d0 d0 = RecyclerView.getChildViewHolderInt(paramView);
      if (d0 != null)
        if (d0.o() || d0.u()) {
          d0.j &= 0xFFFFFEFF;
        } else {
          stringBuilder = new StringBuilder();
          stringBuilder.append("Called attach on a child which is not detached: ");
          stringBuilder.append(d0);
          throw new IllegalArgumentException(c.a.a.a.a.a(e.a, stringBuilder));
        }  
      RecyclerView.access$000(e.a, (View)stringBuilder, paramInt, paramLayoutParams);
      return;
    } 
    throw null;
  }
  
  public void c(int paramInt) {
    paramInt = f(paramInt);
    this.b.f(paramInt);
    RecyclerView.e e = (RecyclerView.e)this.a;
    View view = e.a.getChildAt(paramInt);
    if (view != null) {
      RecyclerView.d0 d0 = RecyclerView.getChildViewHolderInt(view);
      if (d0 != null)
        if (!d0.o() || d0.u()) {
          d0.b(256);
        } else {
          StringBuilder stringBuilder = new StringBuilder();
          stringBuilder.append("called detach on an already detached child ");
          stringBuilder.append(d0);
          throw new IllegalArgumentException(c.a.a.a.a.a(e.a, stringBuilder));
        }  
    } 
    RecyclerView.access$100(e.a, paramInt);
  }
  
  public View d(int paramInt) {
    paramInt = f(paramInt);
    return ((RecyclerView.e)this.a).a(paramInt);
  }
  
  public int e() {
    return ((RecyclerView.e)this.a).b() - this.c.size();
  }
  
  public final int f(int paramInt) {
    if (paramInt < 0)
      return -1; 
    int j = ((RecyclerView.e)this.a).b();
    for (int i = paramInt; i < j; i += k) {
      int k = paramInt - i - this.b.b(i);
      if (k == 0) {
        while (this.b.d(i))
          i++; 
        return i;
      } 
    } 
    return -1;
  }
  
  public View g(int paramInt) {
    return ((RecyclerView.e)this.a).a.getChildAt(paramInt);
  }
  
  public int h() {
    return ((RecyclerView.e)this.a).b();
  }
  
  public final void i(View paramView) {
    this.c.add(paramView);
    RecyclerView.e e = (RecyclerView.e)this.a;
    if (e != null) {
      RecyclerView.d0 d0 = RecyclerView.getChildViewHolderInt(paramView);
      if (d0 != null) {
        RecyclerView recyclerView = e.a;
        int i = d0.q;
        if (i == -1)
          i = l.p(d0.a); 
        d0.p = i;
        recyclerView.setChildImportantForAccessibilityInternal(d0, 4);
      } 
      return;
    } 
    throw null;
  }
  
  public int j(View paramView) {
    int i = ((RecyclerView.e)this.a).a.indexOfChild(paramView);
    return (i == -1) ? -1 : (this.b.d(i) ? -1 : (i - this.b.b(i)));
  }
  
  public boolean k(View paramView) {
    return this.c.contains(paramView);
  }
  
  public final boolean l(View paramView) {
    if (this.c.remove(paramView)) {
      RecyclerView.e e = (RecyclerView.e)this.a;
      if (e != null) {
        RecyclerView.d0 d0 = RecyclerView.getChildViewHolderInt(paramView);
        if (d0 != null) {
          e.a.setChildImportantForAccessibilityInternal(d0, d0.p);
          d0.p = 0;
        } 
        return true;
      } 
      throw null;
    } 
    return false;
  }
  
  public String toString() {
    StringBuilder stringBuilder = new StringBuilder();
    stringBuilder.append(this.b.toString());
    stringBuilder.append(", hidden list:");
    stringBuilder.append(this.c.size());
    return stringBuilder.toString();
  }
  
  public static class a {
    public long a = 0L;
    
    public a b;
    
    public void a(int param1Int) {
      if (param1Int >= 64) {
        a a1 = this.b;
        if (a1 != null)
          a1.a(param1Int - 64); 
      } else {
        this.a &= 1L << param1Int ^ 0xFFFFFFFFFFFFFFFFL;
      } 
    }
    
    public int b(int param1Int) {
      a a1 = this.b;
      if (a1 == null) {
        if (param1Int >= 64) {
          long l1 = this.a;
          return Long.bitCount(l1);
        } 
      } else if (param1Int >= 64) {
        param1Int = a1.b(param1Int - 64);
        return Long.bitCount(this.a) + param1Int;
      } 
      long l = this.a & (1L << param1Int) - 1L;
      return Long.bitCount(l);
    }
    
    public final void c() {
      if (this.b == null)
        this.b = new a(); 
    }
    
    public boolean d(int param1Int) {
      boolean bool;
      if (param1Int >= 64) {
        c();
        return this.b.d(param1Int - 64);
      } 
      if ((this.a & 1L << param1Int) != 0L) {
        bool = true;
      } else {
        bool = false;
      } 
      return bool;
    }
    
    public void e(int param1Int, boolean param1Boolean) {
      if (param1Int >= 64) {
        c();
        this.b.e(param1Int - 64, param1Boolean);
      } else {
        boolean bool;
        if ((this.a & Long.MIN_VALUE) != 0L) {
          bool = true;
        } else {
          bool = false;
        } 
        long l2 = (1L << param1Int) - 1L;
        long l1 = this.a;
        this.a = (l1 & (l2 ^ 0xFFFFFFFFFFFFFFFFL)) << 1L | l1 & l2;
        if (param1Boolean) {
          h(param1Int);
        } else {
          a(param1Int);
        } 
        if (bool || this.b != null) {
          c();
          this.b.e(0, bool);
        } 
      } 
    }
    
    public boolean f(int param1Int) {
      boolean bool;
      if (param1Int >= 64) {
        c();
        return this.b.f(param1Int - 64);
      } 
      long l2 = 1L << param1Int;
      if ((this.a & l2) != 0L) {
        bool = true;
      } else {
        bool = false;
      } 
      long l1 = this.a & (l2 ^ 0xFFFFFFFFFFFFFFFFL);
      this.a = l1;
      l2--;
      this.a = l1 & l2 | Long.rotateRight((l2 ^ 0xFFFFFFFFFFFFFFFFL) & l1, 1);
      a a1 = this.b;
      if (a1 != null) {
        if (a1.d(0))
          h(63); 
        this.b.f(0);
      } 
      return bool;
    }
    
    public void g() {
      this.a = 0L;
      a a1 = this.b;
      if (a1 != null)
        a1.g(); 
    }
    
    public void h(int param1Int) {
      if (param1Int >= 64) {
        c();
        this.b.h(param1Int - 64);
      } else {
        this.a |= 1L << param1Int;
      } 
    }
    
    public String toString() {
      String str;
      if (this.b == null) {
        str = Long.toBinaryString(this.a);
      } else {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(this.b.toString());
        stringBuilder.append("xx");
        stringBuilder.append(Long.toBinaryString(this.a));
        str = stringBuilder.toString();
      } 
      return str;
    }
  }
  
  public static interface b {}
}


/* Location:              C:\Users\panch\Downloads\dvba_v1.1.0-dex2jar.jar!\b\r\d\b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */