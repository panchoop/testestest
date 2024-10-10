package android.support.v4.media;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.support.v4.media.session.MediaSessionCompat;

public final class MediaMetadataCompat implements Parcelable {
  public static final Parcelable.Creator<MediaMetadataCompat> CREATOR;
  
  public static final b.f.a<String, Integer> c;
  
  public final Bundle b;
  
  static {
    b.f.a<String, Integer> a1 = new b.f.a();
    c = a1;
    Integer integer1 = Integer.valueOf(1);
    a1.put("android.media.metadata.TITLE", integer1);
    c.put("android.media.metadata.ARTIST", integer1);
    b.f.a<String, Integer> a2 = c;
    Integer integer2 = Integer.valueOf(0);
    a2.put("android.media.metadata.DURATION", integer2);
    c.put("android.media.metadata.ALBUM", integer1);
    c.put("android.media.metadata.AUTHOR", integer1);
    c.put("android.media.metadata.WRITER", integer1);
    c.put("android.media.metadata.COMPOSER", integer1);
    c.put("android.media.metadata.COMPILATION", integer1);
    c.put("android.media.metadata.DATE", integer1);
    c.put("android.media.metadata.YEAR", integer2);
    c.put("android.media.metadata.GENRE", integer1);
    c.put("android.media.metadata.TRACK_NUMBER", integer2);
    c.put("android.media.metadata.NUM_TRACKS", integer2);
    c.put("android.media.metadata.DISC_NUMBER", integer2);
    c.put("android.media.metadata.ALBUM_ARTIST", integer1);
    b.f.a<String, Integer> a3 = c;
    Integer integer3 = Integer.valueOf(2);
    a3.put("android.media.metadata.ART", integer3);
    c.put("android.media.metadata.ART_URI", integer1);
    c.put("android.media.metadata.ALBUM_ART", integer3);
    c.put("android.media.metadata.ALBUM_ART_URI", integer1);
    b.f.a<String, Integer> a4 = c;
    Integer integer4 = Integer.valueOf(3);
    a4.put("android.media.metadata.USER_RATING", integer4);
    c.put("android.media.metadata.RATING", integer4);
    c.put("android.media.metadata.DISPLAY_TITLE", integer1);
    c.put("android.media.metadata.DISPLAY_SUBTITLE", integer1);
    c.put("android.media.metadata.DISPLAY_DESCRIPTION", integer1);
    c.put("android.media.metadata.DISPLAY_ICON", integer3);
    c.put("android.media.metadata.DISPLAY_ICON_URI", integer1);
    c.put("android.media.metadata.MEDIA_ID", integer1);
    c.put("android.media.metadata.BT_FOLDER_TYPE", integer2);
    c.put("android.media.metadata.MEDIA_URI", integer1);
    c.put("android.media.metadata.ADVERTISEMENT", integer2);
    c.put("android.media.metadata.DOWNLOAD_STATUS", integer2);
    CREATOR = new a();
  }
  
  public MediaMetadataCompat(Parcel paramParcel) {
    this.b = paramParcel.readBundle(MediaSessionCompat.class.getClassLoader());
  }
  
  public int describeContents() {
    return 0;
  }
  
  public void writeToParcel(Parcel paramParcel, int paramInt) {
    paramParcel.writeBundle(this.b);
  }
  
  public static final class a implements Parcelable.Creator<MediaMetadataCompat> {
    public Object createFromParcel(Parcel param1Parcel) {
      return new MediaMetadataCompat(param1Parcel);
    }
    
    public Object[] newArray(int param1Int) {
      return (Object[])new MediaMetadataCompat[param1Int];
    }
  }
}


/* Location:              C:\Users\panch\Downloads\dvba_v1.1.0-dex2jar.jar!\android\support\v4\media\MediaMetadataCompat.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */