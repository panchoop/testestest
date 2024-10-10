package android.support.v4.media;

import android.os.Parcel;
import android.os.Parcelable;

public class MediaBrowserCompat$MediaItem implements Parcelable {
  public static final Parcelable.Creator<MediaBrowserCompat$MediaItem> CREATOR = new a();
  
  public final int b;
  
  public final MediaDescriptionCompat c;
  
  public MediaBrowserCompat$MediaItem(Parcel paramParcel) {
    this.b = paramParcel.readInt();
    this.c = (MediaDescriptionCompat)MediaDescriptionCompat.CREATOR.createFromParcel(paramParcel);
  }
  
  public int describeContents() {
    return 0;
  }
  
  public String toString() {
    StringBuilder stringBuilder = new StringBuilder("MediaItem{");
    stringBuilder.append("mFlags=");
    stringBuilder.append(this.b);
    stringBuilder.append(", mDescription=");
    stringBuilder.append(this.c);
    stringBuilder.append('}');
    return stringBuilder.toString();
  }
  
  public void writeToParcel(Parcel paramParcel, int paramInt) {
    paramParcel.writeInt(this.b);
    this.c.writeToParcel(paramParcel, paramInt);
  }
  
  public static final class a implements Parcelable.Creator<MediaBrowserCompat$MediaItem> {
    public Object createFromParcel(Parcel param1Parcel) {
      return new MediaBrowserCompat$MediaItem(param1Parcel);
    }
    
    public Object[] newArray(int param1Int) {
      return (Object[])new MediaBrowserCompat$MediaItem[param1Int];
    }
  }
}


/* Location:              C:\Users\panch\Downloads\dvba_v1.1.0-dex2jar.jar!\android\support\v4\media\MediaBrowserCompat$MediaItem.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */