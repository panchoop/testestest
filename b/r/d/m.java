package b.r.d;

import android.annotation.SuppressLint;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.concurrent.TimeUnit;

public final class m implements Runnable {
  public static final ThreadLocal<m> f = new ThreadLocal<m>();
  
  public static Comparator<c> g = new a();
  
  public ArrayList<RecyclerView> b = new ArrayList<RecyclerView>();
  
  public long c;
  
  public long d;
  
  public ArrayList<c> e = new ArrayList<c>();
  
  public void a(RecyclerView paramRecyclerView, int paramInt1, int paramInt2) {
    if (paramRecyclerView.isAttachedToWindow() && this.c == 0L) {
      this.c = paramRecyclerView.getNanoTime();
      paramRecyclerView.post(this);
    } 
    b b = paramRecyclerView.mPrefetchRegistry;
    b.a = paramInt1;
    b.b = paramInt2;
  }
  
  public void b(long paramLong) {
    int k = this.b.size();
    byte b = 0;
    int j;
    for (j = 0; b < k; j = n) {
      RecyclerView recyclerView = this.b.get(b);
      int n = j;
      if (recyclerView.getWindowVisibility() == 0) {
        recyclerView.mPrefetchRegistry.b(recyclerView, false);
        n = j + recyclerView.mPrefetchRegistry.d;
      } 
      b++;
    } 
    this.e.ensureCapacity(j);
    b = 0;
    int i;
    for (i = 0; b < k; i = n) {
      int n;
      RecyclerView recyclerView = this.b.get(b);
      if (recyclerView.getWindowVisibility() != 0) {
        n = i;
      } else {
        b b1 = recyclerView.mPrefetchRegistry;
        j = Math.abs(b1.a);
        int i1 = Math.abs(b1.b) + j;
        j = 0;
        while (true) {
          n = i;
          if (j < b1.d * 2) {
            boolean bool;
            c c;
            if (i >= this.e.size()) {
              c = new c();
              this.e.add(c);
            } else {
              c = this.e.get(i);
            } 
            n = b1.c[j + 1];
            if (n <= i1) {
              bool = true;
            } else {
              bool = false;
            } 
            c.a = bool;
            c.b = i1;
            c.c = n;
            c.d = recyclerView;
            c.e = b1.c[j];
            i++;
            j += 2;
            continue;
          } 
          break;
        } 
      } 
      b++;
    } 
    Collections.sort(this.e, g);
    for (i = 0; i < this.e.size(); i++) {
      long l;
      c c = this.e.get(i);
      if (c.d == null)
        break; 
      if (c.a) {
        l = Long.MAX_VALUE;
      } else {
        l = paramLong;
      } 
      RecyclerView.d0 d0 = c(c.d, c.e, l);
      if (d0 != null && d0.b != null && d0.j() && !d0.k()) {
        RecyclerView recyclerView = d0.b.get();
        if (recyclerView != null) {
          if (recyclerView.mDataSetHasChangedAfterLayout && recyclerView.mChildHelper.h() != 0)
            recyclerView.removeAndRecycleViews(); 
          b b1 = recyclerView.mPrefetchRegistry;
          b1.b(recyclerView, true);
          if (b1.d != 0)
            try {
              b.i.i.b.a("RV Nested Prefetch");
              RecyclerView.a0 a0 = recyclerView.mState;
              RecyclerView.g g = recyclerView.mAdapter;
              a0.d = 1;
              a0.e = g.a();
              a0.g = false;
              a0.h = false;
              a0.i = false;
              for (b = 0; b < b1.d * 2; b += 2)
                c(recyclerView, b1.c[b], paramLong); 
            } finally {
              b.i.i.b.b();
            }  
        } 
      } 
      c.a = false;
      c.b = 0;
      c.c = 0;
      c.d = null;
      c.e = 0;
    } 
  }
  
  public final RecyclerView.d0 c(RecyclerView paramRecyclerView, int paramInt, long paramLong) {
    int i = paramRecyclerView.mChildHelper.h();
    byte b = 0;
    while (true) {
      if (b < i) {
        RecyclerView.d0 d0 = RecyclerView.getChildViewHolderInt(paramRecyclerView.mChildHelper.g(b));
        if (d0.c == paramInt && !d0.k()) {
          b = 1;
          break;
        } 
        b++;
        continue;
      } 
      b = 0;
      break;
    } 
    if (b != 0)
      return null; 
    RecyclerView.v v = paramRecyclerView.mRecycler;
    try {
      paramRecyclerView.onEnterLayoutOrScroll();
      RecyclerView.d0 d0 = v.k(paramInt, false, paramLong);
      if (d0 != null)
        if (d0.j() && !d0.k()) {
          v.h(d0.a);
        } else {
          v.a(d0, false);
        }  
      return d0;
    } finally {
      paramRecyclerView.onExitLayoutOrScroll(false);
    } 
  }
  
  public void run() {
    try {
      b.i.i.b.a("RV Prefetch");
      boolean bool = this.b.isEmpty();
      if (bool)
        return; 
      int i = this.b.size();
      byte b = 0;
      long l;
      for (l = 0L; b < i; l = l1) {
        RecyclerView recyclerView = this.b.get(b);
        long l1 = l;
        if (recyclerView.getWindowVisibility() == 0)
          l1 = Math.max(recyclerView.getDrawingTime(), l); 
        b++;
      } 
      if (l == 0L)
        return; 
      b(TimeUnit.MILLISECONDS.toNanos(l) + this.d);
      return;
    } finally {
      this.c = 0L;
      b.i.i.b.b();
    } 
  }
  
  public static final class a implements Comparator<c> {
    public int compare(Object param1Object1, Object param1Object2) {
      int i;
      param1Object1 = param1Object1;
      m.c c = (m.c)param1Object2;
      param1Object2 = ((m.c)param1Object1).d;
      byte b = 1;
      boolean bool = false;
      if (param1Object2 == null) {
        null = 1;
      } else {
        null = 0;
      } 
      if (c.d == null) {
        i = 1;
      } else {
        i = 0;
      } 
      if (null != i) {
        if (((m.c)param1Object1).d == null)
          return b; 
      } else {
        boolean bool1 = ((m.c)param1Object1).a;
        if (bool1 != c.a) {
          null = b;
          if (bool1)
            return -1; 
        } else {
          null = c.b - ((m.c)param1Object1).b;
          if (null == 0) {
            i = ((m.c)param1Object1).c - c.c;
            null = bool;
            if (i != 0)
              null = i; 
          } 
        } 
        return null;
      } 
      return -1;
    }
  }
  
  @SuppressLint({"VisibleForTests"})
  public static class b implements RecyclerView.o.c {
    public int a;
    
    public int b;
    
    public int[] c;
    
    public int d;
    
    public void a(int param1Int1, int param1Int2) {
      if (param1Int1 >= 0) {
        if (param1Int2 >= 0) {
          int i = this.d * 2;
          int[] arrayOfInt2 = this.c;
          if (arrayOfInt2 == null) {
            int[] arrayOfInt = new int[4];
            this.c = arrayOfInt;
            Arrays.fill(arrayOfInt, -1);
          } else if (i >= arrayOfInt2.length) {
            int[] arrayOfInt = new int[i * 2];
            this.c = arrayOfInt;
            System.arraycopy(arrayOfInt2, 0, arrayOfInt, 0, arrayOfInt2.length);
          } 
          int[] arrayOfInt1 = this.c;
          arrayOfInt1[i] = param1Int1;
          arrayOfInt1[i + 1] = param1Int2;
          this.d++;
          return;
        } 
        throw new IllegalArgumentException("Pixel distance must be non-negative");
      } 
      throw new IllegalArgumentException("Layout positions must be non-negative");
    }
    
    public void b(RecyclerView param1RecyclerView, boolean param1Boolean) {
      this.d = 0;
      int[] arrayOfInt = this.c;
      if (arrayOfInt != null)
        Arrays.fill(arrayOfInt, -1); 
      RecyclerView.o o = param1RecyclerView.mLayout;
      if (param1RecyclerView.mAdapter != null && o != null && o.l) {
        if (param1Boolean) {
          if (!param1RecyclerView.mAdapterHelper.g())
            o.j(param1RecyclerView.mAdapter.a(), this); 
        } else if (!param1RecyclerView.hasPendingAdapterUpdates()) {
          o.i(this.a, this.b, param1RecyclerView.mState, this);
        } 
        int i = this.d;
        if (i > o.m) {
          o.m = i;
          o.n = param1Boolean;
          param1RecyclerView.mRecycler.m();
        } 
      } 
    }
    
    public boolean c(int param1Int) {
      if (this.c != null) {
        int i = this.d;
        for (byte b1 = 0; b1 < i * 2; b1 += 2) {
          if (this.c[b1] == param1Int)
            return true; 
        } 
      } 
      return false;
    }
  }
  
  public static class c {
    public boolean a;
    
    public int b;
    
    public int c;
    
    public RecyclerView d;
    
    public int e;
  }
}


/* Location:              C:\Users\panch\Downloads\dvba_v1.1.0-dex2jar.jar!\b\r\d\m.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */