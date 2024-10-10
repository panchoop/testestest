package android.support.v4.media;

import a.a.a.b.b;
import android.os.Bundle;
import android.os.Parcelable;
import android.support.v4.media.session.MediaSessionCompat;
import java.util.ArrayList;

public class MediaBrowserCompat$SearchResultReceiver extends b {
  public void c(int paramInt, Bundle paramBundle) {
    MediaSessionCompat.a(paramBundle);
    if (paramInt == 0 && paramBundle != null && paramBundle.containsKey("search_results")) {
      Parcelable[] arrayOfParcelable = paramBundle.getParcelableArray("search_results");
      if (arrayOfParcelable != null) {
        ArrayList<MediaBrowserCompat$MediaItem> arrayList = new ArrayList();
        int i = arrayOfParcelable.length;
        for (paramInt = 0; paramInt < i; paramInt++)
          arrayList.add((MediaBrowserCompat$MediaItem)arrayOfParcelable[paramInt]); 
      } 
      throw null;
    } 
    throw null;
  }
}


/* Location:              C:\Users\panch\Downloads\dvba_v1.1.0-dex2jar.jar!\android\support\v4\media\MediaBrowserCompat$SearchResultReceiver.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */