package c.c.a.b.u;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import c.c.a.a.c.l.q;
import c.c.a.b.h;
import c.c.a.b.i;
import java.util.Calendar;
import java.util.Iterator;
import java.util.Locale;

public class w extends RecyclerView.g<w.a> {
  public final f<?> c;
  
  public w(f<?> paramf) {
    this.c = paramf;
  }
  
  public int a() {
    return this.c.Z.f;
  }
  
  public void c(RecyclerView.d0 paramd0, int paramInt) {
    b b;
    a a = (a)paramd0;
    paramInt = this.c.Z.b.e + paramInt;
    String str = a.t.getContext().getString(i.mtrl_picker_navigate_to_year_description);
    a.t.setText(String.format(Locale.getDefault(), "%d", new Object[] { Integer.valueOf(paramInt) }));
    a.t.setContentDescription(String.format(str, new Object[] { Integer.valueOf(paramInt) }));
    c c = this.c.c0;
    Calendar calendar = q.E();
    if (calendar.get(1) == paramInt) {
      b = c.f;
    } else {
      b = c.d;
    } 
    Iterator<Long> iterator = this.c.Y.e().iterator();
    while (iterator.hasNext()) {
      calendar.setTimeInMillis(((Long)iterator.next()).longValue());
      if (calendar.get(1) == paramInt)
        b = c.e; 
    } 
    b.b(a.t);
    a.t.setOnClickListener(new v(this, paramInt));
  }
  
  public RecyclerView.d0 d(ViewGroup paramViewGroup, int paramInt) {
    return new a((TextView)LayoutInflater.from(paramViewGroup.getContext()).inflate(h.mtrl_calendar_year, paramViewGroup, false));
  }
  
  public int e(int paramInt) {
    return paramInt - this.c.Z.b.e;
  }
  
  public static class a extends RecyclerView.d0 {
    public final TextView t;
    
    public a(TextView param1TextView) {
      super((View)param1TextView);
      this.t = param1TextView;
    }
  }
}


/* Location:              C:\Users\panch\Downloads\dvba_v1.1.0-dex2jar.jar!\c\c\a\\\u\w.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */