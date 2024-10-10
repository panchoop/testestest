package android.support.v4.media;

import android.os.Parcel;
import android.os.Parcelable;

public final class RatingCompat implements Parcelable {
  public static final Parcelable.Creator<RatingCompat> CREATOR = new a();
  
  public final int b;
  
  public final float c;
  
  public RatingCompat(int paramInt, float paramFloat) {
    this.b = paramInt;
    this.c = paramFloat;
  }
  
  public int describeContents() {
    return this.b;
  }
  
  public String toString() {
    String str;
    StringBuilder stringBuilder = c.a.a.a.a.e("Rating:style=");
    stringBuilder.append(this.b);
    stringBuilder.append(" rating=");
    float f = this.c;
    if (f < 0.0F) {
      str = "unrated";
    } else {
      str = String.valueOf(f);
    } 
    stringBuilder.append(str);
    return stringBuilder.toString();
  }
  
  public void writeToParcel(Parcel paramParcel, int paramInt) {
    paramParcel.writeInt(this.b);
    paramParcel.writeFloat(this.c);
  }
  
  public static final class a implements Parcelable.Creator<RatingCompat> {
    public Object createFromParcel(Parcel param1Parcel) {
      return new RatingCompat(param1Parcel.readInt(), param1Parcel.readFloat());
    }
    
    public Object[] newArray(int param1Int) {
      return (Object[])new RatingCompat[param1Int];
    }
  }
}


/* Location:              C:\Users\panch\Downloads\dvba_v1.1.0-dex2jar.jar!\android\support\v4\media\RatingCompat.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */