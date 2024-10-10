package b.r.d;

import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import androidx.recyclerview.widget.RecyclerView;
import b.i.m.a;
import b.i.m.v.b;
import b.i.m.v.c;
import java.util.Map;
import java.util.WeakHashMap;

public class u extends a {
  public final RecyclerView d;
  
  public final a e;
  
  public u(RecyclerView paramRecyclerView) {
    this.d = paramRecyclerView;
    a a1 = this.e;
    if (a1 == null)
      a1 = new a(this); 
    this.e = a1;
  }
  
  public void c(View paramView, AccessibilityEvent paramAccessibilityEvent) {
    this.a.onInitializeAccessibilityEvent(paramView, paramAccessibilityEvent);
    if (paramView instanceof RecyclerView && !j()) {
      RecyclerView recyclerView = (RecyclerView)paramView;
      if (recyclerView.getLayoutManager() != null)
        recyclerView.getLayoutManager().h0(paramAccessibilityEvent); 
    } 
  }
  
  public void d(View paramView, b paramb) {
    this.a.onInitializeAccessibilityNodeInfo(paramView, paramb.a);
    if (!j() && this.d.getLayoutManager() != null) {
      RecyclerView.o o = this.d.getLayoutManager();
      RecyclerView recyclerView = o.b;
      RecyclerView.v v = recyclerView.mRecycler;
      RecyclerView.a0 a0 = recyclerView.mState;
      if (recyclerView.canScrollVertically(-1) || o.b.canScrollHorizontally(-1)) {
        paramb.a.addAction(8192);
        paramb.a.setScrollable(true);
      } 
      if (o.b.canScrollVertically(1) || o.b.canScrollHorizontally(1)) {
        paramb.a.addAction(4096);
        paramb.a.setScrollable(true);
      } 
      paramb.i(new b.b(AccessibilityNodeInfo.CollectionInfo.obtain(o.R(v, a0), o.A(v, a0), o.V(), o.S())));
    } 
  }
  
  public boolean g(View paramView, int paramInt, Bundle paramBundle) {
    if (super.g(paramView, paramInt, paramBundle))
      return true; 
    if (!j() && this.d.getLayoutManager() != null) {
      RecyclerView.o o = this.d.getLayoutManager();
      RecyclerView.v v = o.b.mRecycler;
      return o.A0(paramInt);
    } 
    return false;
  }
  
  public boolean j() {
    return this.d.hasPendingAdapterUpdates();
  }
  
  public static class a extends a {
    public final u d;
    
    public Map<View, a> e = new WeakHashMap<View, a>();
    
    public a(u param1u) {
      this.d = param1u;
    }
    
    public boolean a(View param1View, AccessibilityEvent param1AccessibilityEvent) {
      a a1 = this.e.get(param1View);
      return (a1 != null) ? a1.a(param1View, param1AccessibilityEvent) : this.a.dispatchPopulateAccessibilityEvent(param1View, param1AccessibilityEvent);
    }
    
    public c b(View param1View) {
      a a1 = this.e.get(param1View);
      return (a1 != null) ? a1.b(param1View) : super.b(param1View);
    }
    
    public void c(View param1View, AccessibilityEvent param1AccessibilityEvent) {
      a a1 = this.e.get(param1View);
      if (a1 != null) {
        a1.c(param1View, param1AccessibilityEvent);
      } else {
        this.a.onInitializeAccessibilityEvent(param1View, param1AccessibilityEvent);
      } 
    }
    
    public void d(View param1View, b param1b) {
      if (!this.d.j() && this.d.d.getLayoutManager() != null) {
        this.d.d.getLayoutManager().j0(param1View, param1b);
        a a1 = this.e.get(param1View);
        if (a1 != null) {
          a1.d(param1View, param1b);
          return;
        } 
      } 
      this.a.onInitializeAccessibilityNodeInfo(param1View, param1b.a);
    }
    
    public void e(View param1View, AccessibilityEvent param1AccessibilityEvent) {
      a a1 = this.e.get(param1View);
      if (a1 != null) {
        a1.e(param1View, param1AccessibilityEvent);
      } else {
        this.a.onPopulateAccessibilityEvent(param1View, param1AccessibilityEvent);
      } 
    }
    
    public boolean f(ViewGroup param1ViewGroup, View param1View, AccessibilityEvent param1AccessibilityEvent) {
      a a1 = this.e.get(param1ViewGroup);
      return (a1 != null) ? a1.f(param1ViewGroup, param1View, param1AccessibilityEvent) : this.a.onRequestSendAccessibilityEvent(param1ViewGroup, param1View, param1AccessibilityEvent);
    }
    
    public boolean g(View param1View, int param1Int, Bundle param1Bundle) {
      RecyclerView.v v;
      RecyclerView.o o;
      if (!this.d.j() && this.d.d.getLayoutManager() != null) {
        a a1 = this.e.get(param1View);
        if (a1 != null) {
          if (a1.g(param1View, param1Int, param1Bundle))
            return true; 
        } else if (super.g(param1View, param1Int, param1Bundle)) {
          return true;
        } 
        o = this.d.d.getLayoutManager();
        v = o.b.mRecycler;
        return o.B0();
      } 
      return super.g((View)v, param1Int, (Bundle)o);
    }
    
    public void h(View param1View, int param1Int) {
      a a1 = this.e.get(param1View);
      if (a1 != null) {
        a1.h(param1View, param1Int);
      } else {
        this.a.sendAccessibilityEvent(param1View, param1Int);
      } 
    }
    
    public void i(View param1View, AccessibilityEvent param1AccessibilityEvent) {
      a a1 = this.e.get(param1View);
      if (a1 != null) {
        a1.i(param1View, param1AccessibilityEvent);
      } else {
        this.a.sendAccessibilityEventUnchecked(param1View, param1AccessibilityEvent);
      } 
    }
  }
}


/* Location:              C:\Users\panch\Downloads\dvba_v1.1.0-dex2jar.jar!\b\r\\\u.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */