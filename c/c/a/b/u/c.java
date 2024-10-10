package c.c.a.b.u;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Paint;
import c.c.a.a.c.l.q;
import c.c.a.b.b;
import c.c.a.b.k;

public final class c {
  public final b a;
  
  public final b b;
  
  public final b c;
  
  public final b d;
  
  public final b e;
  
  public final b f;
  
  public final b g;
  
  public final Paint h;
  
  public c(Context paramContext) {
    TypedArray typedArray = paramContext.obtainStyledAttributes(q.W(paramContext, b.materialCalendarStyle, f.class.getCanonicalName()), k.MaterialCalendar);
    this.a = b.a(paramContext, typedArray.getResourceId(k.MaterialCalendar_dayStyle, 0));
    this.g = b.a(paramContext, typedArray.getResourceId(k.MaterialCalendar_dayInvalidStyle, 0));
    this.b = b.a(paramContext, typedArray.getResourceId(k.MaterialCalendar_daySelectedStyle, 0));
    this.c = b.a(paramContext, typedArray.getResourceId(k.MaterialCalendar_dayTodayStyle, 0));
    ColorStateList colorStateList = q.z(paramContext, typedArray, k.MaterialCalendar_rangeFillColor);
    this.d = b.a(paramContext, typedArray.getResourceId(k.MaterialCalendar_yearStyle, 0));
    this.e = b.a(paramContext, typedArray.getResourceId(k.MaterialCalendar_yearSelectedStyle, 0));
    this.f = b.a(paramContext, typedArray.getResourceId(k.MaterialCalendar_yearTodayStyle, 0));
    Paint paint = new Paint();
    this.h = paint;
    paint.setColor(colorStateList.getDefaultColor());
    typedArray.recycle();
  }
}


/* Location:              C:\Users\panch\Downloads\dvba_v1.1.0-dex2jar.jar!\c\c\a\\\u\c.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */