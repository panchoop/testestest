package android.support.v4.media.session;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.ResultReceiver;
import android.support.v4.media.MediaDescriptionCompat;

public class MediaSessionCompat {
  public static void a(Bundle paramBundle) {
    if (paramBundle != null)
      paramBundle.setClassLoader(MediaSessionCompat.class.getClassLoader()); 
  }
  
  public static final class QueueItem implements Parcelable {
    public static final Parcelable.Creator<QueueItem> CREATOR = new a();
    
    public final MediaDescriptionCompat b;
    
    public final long c;
    
    public QueueItem(Parcel param1Parcel) {
      this.b = (MediaDescriptionCompat)MediaDescriptionCompat.CREATOR.createFromParcel(param1Parcel);
      this.c = param1Parcel.readLong();
    }
    
    public int describeContents() {
      return 0;
    }
    
    public String toString() {
      StringBuilder stringBuilder = c.a.a.a.a.e("MediaSession.QueueItem {Description=");
      stringBuilder.append(this.b);
      stringBuilder.append(", Id=");
      stringBuilder.append(this.c);
      stringBuilder.append(" }");
      return stringBuilder.toString();
    }
    
    public void writeToParcel(Parcel param1Parcel, int param1Int) {
      this.b.writeToParcel(param1Parcel, param1Int);
      param1Parcel.writeLong(this.c);
    }
    
    public static final class a implements Parcelable.Creator<QueueItem> {
      public Object createFromParcel(Parcel param2Parcel) {
        return new MediaSessionCompat.QueueItem(param2Parcel);
      }
      
      public Object[] newArray(int param2Int) {
        return (Object[])new MediaSessionCompat.QueueItem[param2Int];
      }
    }
  }
  
  public static final class a implements Parcelable.Creator<QueueItem> {
    public Object createFromParcel(Parcel param1Parcel) {
      return new MediaSessionCompat.QueueItem(param1Parcel);
    }
    
    public Object[] newArray(int param1Int) {
      return (Object[])new MediaSessionCompat.QueueItem[param1Int];
    }
  }
  
  public static final class ResultReceiverWrapper implements Parcelable {
    public static final Parcelable.Creator<ResultReceiverWrapper> CREATOR = new a();
    
    public ResultReceiver b;
    
    public ResultReceiverWrapper(Parcel param1Parcel) {
      this.b = (ResultReceiver)ResultReceiver.CREATOR.createFromParcel(param1Parcel);
    }
    
    public int describeContents() {
      return 0;
    }
    
    public void writeToParcel(Parcel param1Parcel, int param1Int) {
      this.b.writeToParcel(param1Parcel, param1Int);
    }
    
    public static final class a implements Parcelable.Creator<ResultReceiverWrapper> {
      public Object createFromParcel(Parcel param2Parcel) {
        return new MediaSessionCompat.ResultReceiverWrapper(param2Parcel);
      }
      
      public Object[] newArray(int param2Int) {
        return (Object[])new MediaSessionCompat.ResultReceiverWrapper[param2Int];
      }
    }
  }
  
  public static final class a implements Parcelable.Creator<ResultReceiverWrapper> {
    public Object createFromParcel(Parcel param1Parcel) {
      return new MediaSessionCompat.ResultReceiverWrapper(param1Parcel);
    }
    
    public Object[] newArray(int param1Int) {
      return (Object[])new MediaSessionCompat.ResultReceiverWrapper[param1Int];
    }
  }
  
  public static final class Token implements Parcelable {
    public static final Parcelable.Creator<Token> CREATOR = new a();
    
    public final Object b;
    
    public a.a.a.a.b.a c;
    
    public Token(Object param1Object) {
      this.b = param1Object;
      this.c = null;
    }
    
    public int describeContents() {
      return 0;
    }
    
    public boolean equals(Object param1Object) {
      boolean bool = true;
      if (this == param1Object)
        return true; 
      if (!(param1Object instanceof Token))
        return false; 
      Token token = (Token)param1Object;
      param1Object = this.b;
      Object object = token.b;
      if (param1Object == null) {
        if (object != null)
          bool = false; 
        return bool;
      } 
      return (object == null) ? false : param1Object.equals(object);
    }
    
    public int hashCode() {
      Object object = this.b;
      return (object == null) ? 0 : object.hashCode();
    }
    
    public void writeToParcel(Parcel param1Parcel, int param1Int) {
      param1Parcel.writeParcelable((Parcelable)this.b, param1Int);
    }
    
    public static final class a implements Parcelable.Creator<Token> {
      public Object createFromParcel(Parcel param2Parcel) {
        return new MediaSessionCompat.Token(param2Parcel.readParcelable(null));
      }
      
      public Object[] newArray(int param2Int) {
        return (Object[])new MediaSessionCompat.Token[param2Int];
      }
    }
  }
  
  public static final class a implements Parcelable.Creator<Token> {
    public Object createFromParcel(Parcel param1Parcel) {
      return new MediaSessionCompat.Token(param1Parcel.readParcelable(null));
    }
    
    public Object[] newArray(int param1Int) {
      return (Object[])new MediaSessionCompat.Token[param1Int];
    }
  }
}


/* Location:              C:\Users\panch\Downloads\dvba_v1.1.0-dex2jar.jar!\android\support\v4\media\session\MediaSessionCompat.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */