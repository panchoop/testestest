package android.support.v4.media;

import android.graphics.Bitmap;
import android.media.MediaDescription;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.support.v4.media.session.MediaSessionCompat;

public final class MediaDescriptionCompat implements Parcelable {
  public static final Parcelable.Creator<MediaDescriptionCompat> CREATOR = new a();
  
  public final String b;
  
  public final CharSequence c;
  
  public final CharSequence d;
  
  public final CharSequence e;
  
  public final Bitmap f;
  
  public final Uri g;
  
  public final Bundle h;
  
  public final Uri i;
  
  public Object j;
  
  public MediaDescriptionCompat(String paramString, CharSequence paramCharSequence1, CharSequence paramCharSequence2, CharSequence paramCharSequence3, Bitmap paramBitmap, Uri paramUri1, Bundle paramBundle, Uri paramUri2) {
    this.b = paramString;
    this.c = paramCharSequence1;
    this.d = paramCharSequence2;
    this.e = paramCharSequence3;
    this.f = paramBitmap;
    this.g = paramUri1;
    this.h = paramBundle;
    this.i = paramUri2;
  }
  
  public static MediaDescriptionCompat c(Object paramObject) {
    MediaDescriptionCompat mediaDescriptionCompat;
    Uri uri1 = null;
    Uri uri2 = null;
    if (paramObject != null) {
      MediaDescription mediaDescription = (MediaDescription)paramObject;
      String str = mediaDescription.getMediaId();
      CharSequence charSequence2 = mediaDescription.getTitle();
      CharSequence charSequence3 = mediaDescription.getSubtitle();
      CharSequence charSequence1 = mediaDescription.getDescription();
      Bitmap bitmap = mediaDescription.getIconBitmap();
      Uri uri = mediaDescription.getIconUri();
      Bundle bundle = mediaDescription.getExtras();
      if (bundle != null) {
        MediaSessionCompat.a(bundle);
        uri1 = (Uri)bundle.getParcelable("android.support.v4.media.description.MEDIA_URI");
      } else {
        uri1 = null;
      } 
      if (uri1 != null)
        if (bundle.containsKey("android.support.v4.media.description.NULL_BUNDLE_FLAG") && bundle.size() == 2) {
          bundle = null;
        } else {
          bundle.remove("android.support.v4.media.description.MEDIA_URI");
          bundle.remove("android.support.v4.media.description.NULL_BUNDLE_FLAG");
        }  
      if (uri1 == null) {
        uri1 = uri2;
        if (Build.VERSION.SDK_INT >= 23)
          uri1 = mediaDescription.getMediaUri(); 
      } 
      mediaDescriptionCompat = new MediaDescriptionCompat(str, charSequence2, charSequence3, charSequence1, bitmap, uri, bundle, uri1);
      mediaDescriptionCompat.j = paramObject;
    } 
    return mediaDescriptionCompat;
  }
  
  public int describeContents() {
    return 0;
  }
  
  public String toString() {
    StringBuilder stringBuilder = new StringBuilder();
    stringBuilder.append(this.c);
    stringBuilder.append(", ");
    stringBuilder.append(this.d);
    stringBuilder.append(", ");
    stringBuilder.append(this.e);
    return stringBuilder.toString();
  }
  
  public void writeToParcel(Parcel paramParcel, int paramInt) {
    Object object2 = this.j;
    Object object1 = object2;
    if (object2 == null) {
      MediaDescription.Builder builder = new MediaDescription.Builder();
      builder.setMediaId(this.b);
      builder.setTitle(this.c);
      builder.setSubtitle(this.d);
      builder.setDescription(this.e);
      builder.setIconBitmap(this.f);
      builder.setIconUri(this.g);
      object2 = this.h;
      object1 = object2;
      if (Build.VERSION.SDK_INT < 23) {
        object1 = object2;
        if (this.i != null) {
          object1 = object2;
          if (object2 == null) {
            object1 = new Bundle();
            object1.putBoolean("android.support.v4.media.description.NULL_BUNDLE_FLAG", true);
          } 
          object1.putParcelable("android.support.v4.media.description.MEDIA_URI", (Parcelable)this.i);
        } 
      } 
      builder.setExtras((Bundle)object1);
      if (Build.VERSION.SDK_INT >= 23)
        builder.setMediaUri(this.i); 
      object1 = builder.build();
      this.j = object1;
    } 
    ((MediaDescription)object1).writeToParcel(paramParcel, paramInt);
  }
  
  public static final class a implements Parcelable.Creator<MediaDescriptionCompat> {
    public Object createFromParcel(Parcel param1Parcel) {
      return MediaDescriptionCompat.c(MediaDescription.CREATOR.createFromParcel(param1Parcel));
    }
    
    public Object[] newArray(int param1Int) {
      return (Object[])new MediaDescriptionCompat[param1Int];
    }
  }
}


/* Location:              C:\Users\panch\Downloads\dvba_v1.1.0-dex2jar.jar!\android\support\v4\media\MediaDescriptionCompat.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */