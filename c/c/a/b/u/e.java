package c.c.a.b.u;

import android.annotation.SuppressLint;
import android.os.Build;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;
import c.c.a.a.c.l.q;
import c.c.a.b.h;
import c.c.a.b.i;
import java.util.Calendar;
import java.util.Locale;

public class e extends BaseAdapter {
  public static final int e;
  
  public final Calendar b;
  
  public final int c;
  
  public final int d;
  
  static {
    boolean bool;
    if (Build.VERSION.SDK_INT >= 26) {
      bool = true;
    } else {
      bool = true;
    } 
    e = bool;
  }
  
  public e() {
    Calendar calendar = q.F();
    this.b = calendar;
    this.c = calendar.getMaximum(7);
    this.d = this.b.getFirstDayOfWeek();
  }
  
  public int getCount() {
    return this.c;
  }
  
  public Object getItem(int paramInt) {
    Integer integer;
    int i = this.c;
    if (paramInt >= i) {
      integer = null;
    } else {
      int j = paramInt + this.d;
      paramInt = j;
      if (j > i)
        paramInt = j - i; 
      integer = Integer.valueOf(paramInt);
    } 
    return integer;
  }
  
  public long getItemId(int paramInt) {
    return 0L;
  }
  
  @SuppressLint({"WrongConstant"})
  public View getView(int paramInt, View paramView, ViewGroup paramViewGroup) {
    TextView textView = (TextView)paramView;
    if (paramView == null)
      textView = (TextView)LayoutInflater.from(paramViewGroup.getContext()).inflate(h.mtrl_calendar_day_of_week, paramViewGroup, false); 
    Calendar calendar = this.b;
    int i = paramInt + this.d;
    int j = this.c;
    paramInt = i;
    if (i > j)
      paramInt = i - j; 
    calendar.set(7, paramInt);
    textView.setText(this.b.getDisplayName(7, e, Locale.getDefault()));
    textView.setContentDescription(String.format(paramViewGroup.getContext().getString(i.mtrl_picker_day_of_week_column_header), new Object[] { this.b.getDisplayName(7, 2, Locale.getDefault()) }));
    return (View)textView;
  }
}


/* Location:              C:\Users\panch\Downloads\dvba_v1.1.0-dex2jar.jar!\c\c\a\\\u\e.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */