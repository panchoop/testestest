package c.c.a.b.u;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.ListAdapter;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import b.i.m.l;
import c.c.a.b.d;
import c.c.a.b.f;
import c.c.a.b.h;
import com.google.android.material.datepicker.MaterialCalendarGridView;

public class r extends RecyclerView.g<r.a> {
  public final a c;
  
  public final d<?> d;
  
  public final f.f e;
  
  public final int f;
  
  public r(Context paramContext, d<?> paramd, a parama, f.f paramf) {
    o o1 = parama.b;
    o o2 = parama.c;
    o o3 = parama.d;
    if (o1.c(o3) <= 0) {
      if (o3.c(o2) <= 0) {
        byte b;
        int i = p.f;
        int j = f.Z(paramContext);
        if (n.c0(paramContext)) {
          b = paramContext.getResources().getDimensionPixelSize(d.mtrl_calendar_day_height);
        } else {
          b = 0;
        } 
        this.f = j * i + b;
        this.c = parama;
        this.d = paramd;
        this.e = paramf;
        if (!this.a.a()) {
          this.b = true;
          return;
        } 
        throw new IllegalStateException("Cannot change whether this adapter has stable IDs while the adapter has registered observers.");
      } 
      throw new IllegalArgumentException("currentPage cannot be after lastPage");
    } 
    throw new IllegalArgumentException("firstPage cannot be after currentPage");
  }
  
  public int a() {
    return this.c.g;
  }
  
  public long b(int paramInt) {
    return (this.c.b.h(paramInt)).b.getTimeInMillis();
  }
  
  public void c(RecyclerView.d0 paramd0, int paramInt) {
    a a1 = (a)paramd0;
    o o = this.c.b.h(paramInt);
    a1.t.setText(o.c);
    MaterialCalendarGridView materialCalendarGridView = (MaterialCalendarGridView)a1.u.findViewById(f.month_grid);
    if (materialCalendarGridView.a() != null && o.equals((materialCalendarGridView.a()).b)) {
      materialCalendarGridView.a().notifyDataSetChanged();
    } else {
      p p = new p(o, this.d, this.c);
      materialCalendarGridView.setNumColumns(o.f);
      materialCalendarGridView.setAdapter((ListAdapter)p);
    } 
    materialCalendarGridView.setOnItemClickListener(new q(this, materialCalendarGridView));
  }
  
  public RecyclerView.d0 d(ViewGroup paramViewGroup, int paramInt) {
    a a1;
    LinearLayout linearLayout = (LinearLayout)LayoutInflater.from(paramViewGroup.getContext()).inflate(h.mtrl_calendar_month_labeled, paramViewGroup, false);
    if (n.c0(paramViewGroup.getContext())) {
      linearLayout.setLayoutParams((ViewGroup.LayoutParams)new RecyclerView.p(-1, this.f));
      a1 = new a(linearLayout, true);
    } else {
      a1 = new a(linearLayout, false);
    } 
    return a1;
  }
  
  public o e(int paramInt) {
    return this.c.b.h(paramInt);
  }
  
  public int f(o paramo) {
    return this.c.b.i(paramo);
  }
  
  public static class a extends RecyclerView.d0 {
    public final TextView t;
    
    public final MaterialCalendarGridView u;
    
    public a(LinearLayout param1LinearLayout, boolean param1Boolean) {
      super((View)param1LinearLayout);
      TextView textView = (TextView)param1LinearLayout.findViewById(f.month_title);
      this.t = textView;
      l.X((View)textView, true);
      this.u = (MaterialCalendarGridView)param1LinearLayout.findViewById(f.month_grid);
      if (!param1Boolean)
        this.t.setVisibility(8); 
    }
  }
}


/* Location:              C:\Users\panch\Downloads\dvba_v1.1.0-dex2jar.jar!\c\c\a\\\u\r.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */