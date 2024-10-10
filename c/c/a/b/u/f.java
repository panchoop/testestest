package c.c.a.b.u;

import android.content.Context;
import android.os.Bundle;
import android.view.ContextThemeWrapper;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.Interpolator;
import android.widget.GridView;
import android.widget.ListAdapter;
import android.widget.Scroller;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import b.i.m.l;
import b.r.d.p;
import b.r.d.w;
import c.c.a.b.g;
import c.c.a.b.h;
import com.google.android.material.button.MaterialButton;

public final class f<S> extends t<S> {
  public static final Object h0 = "MONTHS_VIEW_GROUP_TAG";
  
  public static final Object i0 = "NAVIGATION_PREV_TAG";
  
  public static final Object j0 = "NAVIGATION_NEXT_TAG";
  
  public static final Object k0 = "SELECTOR_TOGGLE_TAG";
  
  public int X;
  
  public d<S> Y;
  
  public a Z;
  
  public o a0;
  
  public e b0;
  
  public c c0;
  
  public RecyclerView d0;
  
  public RecyclerView e0;
  
  public View f0;
  
  public View g0;
  
  public static int Z(Context paramContext) {
    return paramContext.getResources().getDimensionPixelSize(c.c.a.b.d.mtrl_calendar_day_height);
  }
  
  public void A(Bundle paramBundle) {
    super.A(paramBundle);
    Bundle bundle = paramBundle;
    if (paramBundle == null)
      bundle = this.g; 
    this.X = bundle.getInt("THEME_RES_ID_KEY");
    this.Y = (d<S>)bundle.getParcelable("GRID_SELECTOR_KEY");
    this.Z = (a)bundle.getParcelable("CALENDAR_CONSTRAINTS_KEY");
    this.a0 = (o)bundle.getParcelable("CURRENT_MONTH_KEY");
  }
  
  public View B(LayoutInflater paramLayoutInflater, ViewGroup paramViewGroup, Bundle paramBundle) {
    int j;
    ContextThemeWrapper contextThemeWrapper = new ContextThemeWrapper(k(), this.X);
    this.c0 = new c((Context)contextThemeWrapper);
    paramLayoutInflater = paramLayoutInflater.cloneInContext((Context)contextThemeWrapper);
    o o1 = this.Z.b;
    if (n.c0((Context)contextThemeWrapper)) {
      j = h.mtrl_calendar_vertical;
      i = 1;
    } else {
      j = h.mtrl_calendar_horizontal;
      i = 0;
    } 
    View view = paramLayoutInflater.inflate(j, paramViewGroup, false);
    GridView gridView = (GridView)view.findViewById(c.c.a.b.f.mtrl_calendar_days_of_week);
    l.W((View)gridView, new b(this));
    gridView.setAdapter((ListAdapter)new e());
    gridView.setNumColumns(o1.f);
    gridView.setEnabled(false);
    this.e0 = (RecyclerView)view.findViewById(c.c.a.b.f.mtrl_calendar_months);
    c c1 = new c(this, k(), i, false, i);
    this.e0.setLayoutManager((RecyclerView.o)c1);
    this.e0.setTag("MONTHS_VIEW_GROUP_TAG");
    r r = new r((Context)contextThemeWrapper, this.Y, this.Z, new d(this));
    this.e0.setAdapter(r);
    int i = contextThemeWrapper.getResources().getInteger(g.mtrl_calendar_year_selector_span);
    RecyclerView recyclerView = (RecyclerView)view.findViewById(c.c.a.b.f.mtrl_calendar_year_selector_frame);
    this.d0 = recyclerView;
    if (recyclerView != null) {
      recyclerView.setHasFixedSize(true);
      this.d0.setLayoutManager((RecyclerView.o)new GridLayoutManager((Context)contextThemeWrapper, i, 1, false));
      this.d0.setAdapter(new w(this));
      this.d0.addItemDecoration(new g(this));
    } 
    if (view.findViewById(c.c.a.b.f.month_navigation_fragment_toggle) != null) {
      MaterialButton materialButton3 = (MaterialButton)view.findViewById(c.c.a.b.f.month_navigation_fragment_toggle);
      materialButton3.setTag("SELECTOR_TOGGLE_TAG");
      l.W((View)materialButton3, new h(this));
      MaterialButton materialButton2 = (MaterialButton)view.findViewById(c.c.a.b.f.month_navigation_previous);
      materialButton2.setTag("NAVIGATION_PREV_TAG");
      MaterialButton materialButton1 = (MaterialButton)view.findViewById(c.c.a.b.f.month_navigation_next);
      materialButton1.setTag("NAVIGATION_NEXT_TAG");
      this.f0 = view.findViewById(c.c.a.b.f.mtrl_calendar_year_selector_frame);
      this.g0 = view.findViewById(c.c.a.b.f.mtrl_calendar_day_selector_frame);
      d0(e.b);
      materialButton3.setText(this.a0.c);
      this.e0.addOnScrollListener(new i(this, r, materialButton3));
      materialButton3.setOnClickListener(new j(this));
      materialButton1.setOnClickListener(new k(this, r));
      materialButton2.setOnClickListener(new l(this, r));
    } 
    if (!n.c0((Context)contextThemeWrapper)) {
      p p = new p();
      RecyclerView recyclerView1 = this.e0;
      recyclerView = ((w)p).a;
      if (recyclerView != recyclerView1) {
        if (recyclerView != null) {
          recyclerView.removeOnScrollListener(((w)p).c);
          ((w)p).a.setOnFlingListener(null);
        } 
        ((w)p).a = recyclerView1;
        if (recyclerView1 != null)
          if (recyclerView1.getOnFlingListener() == null) {
            ((w)p).a.addOnScrollListener(((w)p).c);
            ((w)p).a.setOnFlingListener((RecyclerView.r)p);
            ((w)p).b = new Scroller(((w)p).a.getContext(), (Interpolator)new DecelerateInterpolator());
            p.c();
          } else {
            throw new IllegalStateException("An instance of OnFlingListener already set.");
          }  
      } 
    } 
    this.e0.scrollToPosition(r.f(this.a0));
    return view;
  }
  
  public void I(Bundle paramBundle) {
    paramBundle.putInt("THEME_RES_ID_KEY", this.X);
    paramBundle.putParcelable("GRID_SELECTOR_KEY", this.Y);
    paramBundle.putParcelable("CALENDAR_CONSTRAINTS_KEY", this.Z);
    paramBundle.putParcelable("CURRENT_MONTH_KEY", this.a0);
  }
  
  public LinearLayoutManager a0() {
    return (LinearLayoutManager)this.e0.getLayoutManager();
  }
  
  public final void b0(int paramInt) {
    this.e0.post(new a(this, paramInt));
  }
  
  public void c0(o paramo) {
    // Byte code:
    //   0: aload_0
    //   1: getfield e0 : Landroidx/recyclerview/widget/RecyclerView;
    //   4: invokevirtual getAdapter : ()Landroidx/recyclerview/widget/RecyclerView$g;
    //   7: checkcast c/c/a/b/u/r
    //   10: astore #6
    //   12: aload #6
    //   14: getfield c : Lc/c/a/b/u/a;
    //   17: getfield b : Lc/c/a/b/u/o;
    //   20: aload_1
    //   21: invokevirtual i : (Lc/c/a/b/u/o;)I
    //   24: istore #4
    //   26: iload #4
    //   28: aload #6
    //   30: aload_0
    //   31: getfield a0 : Lc/c/a/b/u/o;
    //   34: invokevirtual f : (Lc/c/a/b/u/o;)I
    //   37: isub
    //   38: istore #5
    //   40: iload #5
    //   42: invokestatic abs : (I)I
    //   45: istore_2
    //   46: iconst_1
    //   47: istore_3
    //   48: iload_2
    //   49: iconst_3
    //   50: if_icmple -> 58
    //   53: iconst_1
    //   54: istore_2
    //   55: goto -> 60
    //   58: iconst_0
    //   59: istore_2
    //   60: iload #5
    //   62: ifle -> 68
    //   65: goto -> 70
    //   68: iconst_0
    //   69: istore_3
    //   70: aload_0
    //   71: aload_1
    //   72: putfield a0 : Lc/c/a/b/u/o;
    //   75: iload_2
    //   76: ifeq -> 96
    //   79: iload_3
    //   80: ifeq -> 96
    //   83: aload_0
    //   84: getfield e0 : Landroidx/recyclerview/widget/RecyclerView;
    //   87: astore_1
    //   88: iload #4
    //   90: iconst_3
    //   91: isub
    //   92: istore_2
    //   93: goto -> 110
    //   96: iload_2
    //   97: ifeq -> 115
    //   100: aload_0
    //   101: getfield e0 : Landroidx/recyclerview/widget/RecyclerView;
    //   104: astore_1
    //   105: iload #4
    //   107: iconst_3
    //   108: iadd
    //   109: istore_2
    //   110: aload_1
    //   111: iload_2
    //   112: invokevirtual scrollToPosition : (I)V
    //   115: aload_0
    //   116: iload #4
    //   118: invokevirtual b0 : (I)V
    //   121: return
  }
  
  public void d0(e parame) {
    this.b0 = parame;
    if (parame == e.c) {
      this.d0.getLayoutManager().K0(((w)this.d0.getAdapter()).e(this.a0.e));
      this.f0.setVisibility(0);
      this.g0.setVisibility(8);
    } else if (parame == e.b) {
      this.f0.setVisibility(8);
      this.g0.setVisibility(0);
      c0(this.a0);
    } 
  }
  
  public class a implements Runnable {
    public final int b;
    
    public final f c;
    
    public a(f this$0, int param1Int) {}
    
    public void run() {
      this.c.e0.smoothScrollToPosition(this.b);
    }
  }
  
  public class b extends b.i.m.a {
    public b(f this$0) {}
    
    public void d(View param1View, b.i.m.v.b param1b) {
      this.a.onInitializeAccessibilityNodeInfo(param1View, param1b.a);
      param1b.i(null);
    }
  }
  
  public class c extends u {
    public final int H;
    
    public final f I;
    
    public c(f this$0, Context param1Context, int param1Int1, boolean param1Boolean, int param1Int2) {
      super(param1Context, param1Int1, param1Boolean);
    }
    
    public void X0(RecyclerView.a0 param1a0, int[] param1ArrayOfint) {
      if (this.H == 0) {
        param1ArrayOfint[0] = this.I.e0.getWidth();
        param1ArrayOfint[1] = this.I.e0.getWidth();
      } else {
        param1ArrayOfint[0] = this.I.e0.getHeight();
        param1ArrayOfint[1] = this.I.e0.getHeight();
      } 
    }
  }
  
  public class d implements f {
    public final f a;
    
    public d(f this$0) {}
  }
  
  public enum e {
    b, c;
    
    public static final e[] d;
    
    static {
      e e1 = new e("YEAR", 1);
      c = e1;
      d = new e[] { b, e1 };
    }
  }
  
  public static interface f {}
}


/* Location:              C:\Users\panch\Downloads\dvba_v1.1.0-dex2jar.jar!\c\c\a\\\u\f.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */