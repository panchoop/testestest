package androidx.versionedparcelable;

import android.annotation.SuppressLint;
import android.os.Parcel;
import android.os.Parcelable;
import b.v.b;
import b.v.c;

@SuppressLint({"BanParcelableUsage"})
public class ParcelImpl implements Parcelable {
  public static final Parcelable.Creator<ParcelImpl> CREATOR = new a();
  
  public final c b;
  
  public ParcelImpl(Parcel paramParcel) {
    this.b = (new b(paramParcel)).k();
  }
  
  public int describeContents() {
    return 0;
  }
  
  public void writeToParcel(Parcel paramParcel, int paramInt) {
    (new b(paramParcel)).o(this.b);
  }
  
  public static final class a implements Parcelable.Creator<ParcelImpl> {
    public Object createFromParcel(Parcel param1Parcel) {
      return new ParcelImpl(param1Parcel);
    }
    
    public Object[] newArray(int param1Int) {
      return (Object[])new ParcelImpl[param1Int];
    }
  }
}


/* Location:              C:\Users\panch\Downloads\dvba_v1.1.0-dex2jar.jar!\androidx\versionedparcelable\ParcelImpl.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */