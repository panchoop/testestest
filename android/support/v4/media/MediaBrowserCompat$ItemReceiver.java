package android.support.v4.media;

import a.a.a.b.b;
import android.os.Bundle;
import android.os.Parcelable;
import android.support.v4.media.session.MediaSessionCompat;

public class MediaBrowserCompat$ItemReceiver extends b {
  public void c(int paramInt, Bundle paramBundle) {
    MediaSessionCompat.a(paramBundle);
    if (paramInt == 0 && paramBundle != null && paramBundle.containsKey("media_item")) {
      Parcelable parcelable = paramBundle.getParcelable("media_item");
      if (parcelable == null || parcelable instanceof MediaBrowserCompat$MediaItem) {
        parcelable = parcelable;
        throw null;
      } 
      throw null;
    } 
    throw null;
  }
}


/* Location:              C:\Users\panch\Downloads\dvba_v1.1.0-dex2jar.jar!\android\support\v4\media\MediaBrowserCompat$ItemReceiver.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */