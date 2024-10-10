package b.k.a;

import android.os.Parcel;
import android.os.Parcelable;

public abstract class a implements Parcelable {
  public static final Parcelable.Creator<a> CREATOR;
  
  public static final a c = new a();
  
  public final Parcelable b;
  
  static {
    CREATOR = (Parcelable.Creator<a>)new b();
  }
  
  public a(Parcel paramParcel, ClassLoader paramClassLoader) {
    Parcelable parcelable = paramParcel.readParcelable(paramClassLoader);
    if (parcelable == null)
      parcelable = c; 
    this.b = parcelable;
  }
  
  public a(Parcelable paramParcelable) {
    if (paramParcelable != null) {
      if (paramParcelable == c)
        paramParcelable = null; 
      this.b = paramParcelable;
      return;
    } 
    throw new IllegalArgumentException("superState must not be null");
  }
  
  public a(a parama) {
    this.b = null;
  }
  
  public int describeContents() {
    return 0;
  }
  
  public void writeToParcel(Parcel paramParcel, int paramInt) {
    paramParcel.writeParcelable(this.b, paramInt);
  }
  
  public static final class a extends a {
    public a() {
      super((a)null);
    }
  }
  
  public static final class b implements Parcelable.ClassLoaderCreator<a> {
    public Object createFromParcel(Parcel param1Parcel) {
      if (param1Parcel.readParcelable(null) == null)
        return a.c; 
      throw new IllegalStateException("superState must be null");
    }
    
    public Object createFromParcel(Parcel param1Parcel, ClassLoader param1ClassLoader) {
      if (param1Parcel.readParcelable(param1ClassLoader) == null)
        return a.c; 
      throw new IllegalStateException("superState must be null");
    }
    
    public Object[] newArray(int param1Int) {
      return (Object[])new a[param1Int];
    }
  }
}


/* Location:              C:\Users\panch\Downloads\dvba_v1.1.0-dex2jar.jar!\b\k\a\a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */