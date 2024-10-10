package c.c.a.b.u;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;

public final class a implements Parcelable {
  public static final Parcelable.Creator<a> CREATOR = new a();
  
  public final o b;
  
  public final o c;
  
  public final o d;
  
  public final b e;
  
  public final int f;
  
  public final int g;
  
  public a(o paramo1, o paramo2, o paramo3, b paramb, a parama) {
    this.b = paramo1;
    this.c = paramo2;
    this.d = paramo3;
    this.e = paramb;
    if (paramo1.b.compareTo(paramo3.b) <= 0) {
      if (paramo3.b.compareTo(paramo2.b) <= 0) {
        this.g = paramo1.i(paramo2) + 1;
        this.f = paramo2.e - paramo1.e + 1;
        return;
      } 
      throw new IllegalArgumentException("current Month cannot be after end Month");
    } 
    throw new IllegalArgumentException("start Month cannot be after current Month");
  }
  
  public int describeContents() {
    return 0;
  }
  
  public boolean equals(Object paramObject) {
    boolean bool = true;
    if (this == paramObject)
      return true; 
    if (!(paramObject instanceof a))
      return false; 
    paramObject = paramObject;
    if (!this.b.equals(((a)paramObject).b) || !this.c.equals(((a)paramObject).c) || !this.d.equals(((a)paramObject).d) || !this.e.equals(((a)paramObject).e))
      bool = false; 
    return bool;
  }
  
  public int hashCode() {
    return Arrays.hashCode(new Object[] { this.b, this.c, this.d, this.e });
  }
  
  public void writeToParcel(Parcel paramParcel, int paramInt) {
    paramParcel.writeParcelable(this.b, 0);
    paramParcel.writeParcelable(this.c, 0);
    paramParcel.writeParcelable(this.d, 0);
    paramParcel.writeParcelable(this.e, 0);
  }
  
  public static final class a implements Parcelable.Creator<a> {
    public Object createFromParcel(Parcel param1Parcel) {
      return new a((o)param1Parcel.readParcelable(o.class.getClassLoader()), (o)param1Parcel.readParcelable(o.class.getClassLoader()), (o)param1Parcel.readParcelable(o.class.getClassLoader()), (a.b)param1Parcel.readParcelable(a.b.class.getClassLoader()), null);
    }
    
    public Object[] newArray(int param1Int) {
      return (Object[])new a[param1Int];
    }
  }
  
  public static interface b extends Parcelable {
    boolean g(long param1Long);
  }
}


/* Location:              C:\Users\panch\Downloads\dvba_v1.1.0-dex2jar.jar!\c\c\a\\\u\a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */