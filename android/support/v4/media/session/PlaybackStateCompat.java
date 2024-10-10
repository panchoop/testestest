package android.support.v4.media.session;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import java.util.List;

public final class PlaybackStateCompat implements Parcelable {
  public static final Parcelable.Creator<PlaybackStateCompat> CREATOR = new a();
  
  public final int b;
  
  public final long c;
  
  public final long d;
  
  public final float e;
  
  public final long f;
  
  public final int g;
  
  public final CharSequence h;
  
  public final long i;
  
  public List<CustomAction> j;
  
  public final long k;
  
  public final Bundle l;
  
  public PlaybackStateCompat(Parcel paramParcel) {
    this.b = paramParcel.readInt();
    this.c = paramParcel.readLong();
    this.e = paramParcel.readFloat();
    this.i = paramParcel.readLong();
    this.d = paramParcel.readLong();
    this.f = paramParcel.readLong();
    this.h = (CharSequence)TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(paramParcel);
    this.j = paramParcel.createTypedArrayList(CustomAction.CREATOR);
    this.k = paramParcel.readLong();
    this.l = paramParcel.readBundle(MediaSessionCompat.class.getClassLoader());
    this.g = paramParcel.readInt();
  }
  
  public int describeContents() {
    return 0;
  }
  
  public String toString() {
    StringBuilder stringBuilder = new StringBuilder("PlaybackState {");
    stringBuilder.append("state=");
    stringBuilder.append(this.b);
    stringBuilder.append(", position=");
    stringBuilder.append(this.c);
    stringBuilder.append(", buffered position=");
    stringBuilder.append(this.d);
    stringBuilder.append(", speed=");
    stringBuilder.append(this.e);
    stringBuilder.append(", updated=");
    stringBuilder.append(this.i);
    stringBuilder.append(", actions=");
    stringBuilder.append(this.f);
    stringBuilder.append(", error code=");
    stringBuilder.append(this.g);
    stringBuilder.append(", error message=");
    stringBuilder.append(this.h);
    stringBuilder.append(", custom actions=");
    stringBuilder.append(this.j);
    stringBuilder.append(", active item id=");
    stringBuilder.append(this.k);
    stringBuilder.append("}");
    return stringBuilder.toString();
  }
  
  public void writeToParcel(Parcel paramParcel, int paramInt) {
    paramParcel.writeInt(this.b);
    paramParcel.writeLong(this.c);
    paramParcel.writeFloat(this.e);
    paramParcel.writeLong(this.i);
    paramParcel.writeLong(this.d);
    paramParcel.writeLong(this.f);
    TextUtils.writeToParcel(this.h, paramParcel, paramInt);
    paramParcel.writeTypedList(this.j);
    paramParcel.writeLong(this.k);
    paramParcel.writeBundle(this.l);
    paramParcel.writeInt(this.g);
  }
  
  public static final class CustomAction implements Parcelable {
    public static final Parcelable.Creator<CustomAction> CREATOR = new a();
    
    public final String b;
    
    public final CharSequence c;
    
    public final int d;
    
    public final Bundle e;
    
    public CustomAction(Parcel param1Parcel) {
      this.b = param1Parcel.readString();
      this.c = (CharSequence)TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(param1Parcel);
      this.d = param1Parcel.readInt();
      this.e = param1Parcel.readBundle(MediaSessionCompat.class.getClassLoader());
    }
    
    public int describeContents() {
      return 0;
    }
    
    public String toString() {
      StringBuilder stringBuilder = c.a.a.a.a.e("Action:mName='");
      stringBuilder.append(this.c);
      stringBuilder.append(", mIcon=");
      stringBuilder.append(this.d);
      stringBuilder.append(", mExtras=");
      stringBuilder.append(this.e);
      return stringBuilder.toString();
    }
    
    public void writeToParcel(Parcel param1Parcel, int param1Int) {
      param1Parcel.writeString(this.b);
      TextUtils.writeToParcel(this.c, param1Parcel, param1Int);
      param1Parcel.writeInt(this.d);
      param1Parcel.writeBundle(this.e);
    }
    
    public static final class a implements Parcelable.Creator<CustomAction> {
      public Object createFromParcel(Parcel param2Parcel) {
        return new PlaybackStateCompat.CustomAction(param2Parcel);
      }
      
      public Object[] newArray(int param2Int) {
        return (Object[])new PlaybackStateCompat.CustomAction[param2Int];
      }
    }
  }
  
  public static final class a implements Parcelable.Creator<CustomAction> {
    public Object createFromParcel(Parcel param1Parcel) {
      return new PlaybackStateCompat.CustomAction(param1Parcel);
    }
    
    public Object[] newArray(int param1Int) {
      return (Object[])new PlaybackStateCompat.CustomAction[param1Int];
    }
  }
  
  public static final class a implements Parcelable.Creator<PlaybackStateCompat> {
    public Object createFromParcel(Parcel param1Parcel) {
      return new PlaybackStateCompat(param1Parcel);
    }
    
    public Object[] newArray(int param1Int) {
      return (Object[])new PlaybackStateCompat[param1Int];
    }
  }
}


/* Location:              C:\Users\panch\Downloads\dvba_v1.1.0-dex2jar.jar!\android\support\v4\media\session\PlaybackStateCompat.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */