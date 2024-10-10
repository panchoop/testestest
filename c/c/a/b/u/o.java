package c.c.a.b.u;

import android.os.Parcel;
import android.os.Parcelable;
import c.c.a.a.c.l.q;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Locale;

public final class o implements Comparable<o>, Parcelable {
  public static final Parcelable.Creator<o> CREATOR = new a();
  
  public final Calendar b;
  
  public final String c;
  
  public final int d;
  
  public final int e;
  
  public final int f;
  
  public final int g;
  
  public o(Calendar paramCalendar) {
    paramCalendar.set(5, 1);
    paramCalendar = q.B(paramCalendar);
    this.b = paramCalendar;
    this.d = paramCalendar.get(2);
    this.e = this.b.get(1);
    this.f = this.b.getMaximum(7);
    this.g = this.b.getActualMaximum(5);
    SimpleDateFormat simpleDateFormat = new SimpleDateFormat("MMMM, yyyy", Locale.getDefault());
    simpleDateFormat.setTimeZone(q.D());
    this.c = simpleDateFormat.format(this.b.getTime());
    this.b.getTimeInMillis();
  }
  
  public int c(o paramo) {
    return this.b.compareTo(paramo.b);
  }
  
  public int describeContents() {
    return 0;
  }
  
  public boolean equals(Object paramObject) {
    boolean bool = true;
    if (this == paramObject)
      return true; 
    if (!(paramObject instanceof o))
      return false; 
    paramObject = paramObject;
    if (this.d != ((o)paramObject).d || this.e != ((o)paramObject).e)
      bool = false; 
    return bool;
  }
  
  public int f() {
    int j = this.b.get(7) - this.b.getFirstDayOfWeek();
    int i = j;
    if (j < 0)
      i = j + this.f; 
    return i;
  }
  
  public o h(int paramInt) {
    Calendar calendar = q.B(this.b);
    calendar.add(2, paramInt);
    return new o(calendar);
  }
  
  public int hashCode() {
    return Arrays.hashCode(new Object[] { Integer.valueOf(this.d), Integer.valueOf(this.e) });
  }
  
  public int i(o paramo) {
    if (this.b instanceof java.util.GregorianCalendar) {
      int j = paramo.e;
      int i = this.e;
      return paramo.d - this.d + (j - i) * 12;
    } 
    throw new IllegalArgumentException("Only Gregorian calendars are supported.");
  }
  
  public void writeToParcel(Parcel paramParcel, int paramInt) {
    paramParcel.writeInt(this.e);
    paramParcel.writeInt(this.d);
  }
  
  public static final class a implements Parcelable.Creator<o> {
    public Object createFromParcel(Parcel param1Parcel) {
      int i = param1Parcel.readInt();
      int j = param1Parcel.readInt();
      Calendar calendar = q.F();
      calendar.set(1, i);
      calendar.set(2, j);
      return new o(calendar);
    }
    
    public Object[] newArray(int param1Int) {
      return (Object[])new o[param1Int];
    }
  }
}


/* Location:              C:\Users\panch\Downloads\dvba_v1.1.0-dex2jar.jar!\c\c\a\\\u\o.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */