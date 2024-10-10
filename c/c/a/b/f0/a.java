package c.c.a.b.f0;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import b.f.h;
import b.k.a.a;

public class a extends a {
  public static final Parcelable.Creator<a> CREATOR = (Parcelable.Creator<a>)new a();
  
  public final h<String, Bundle> d;
  
  public a(Parcel paramParcel, ClassLoader paramClassLoader, a parama) {
    super(paramParcel, paramClassLoader);
    int i = paramParcel.readInt();
    String[] arrayOfString = new String[i];
    paramParcel.readStringArray(arrayOfString);
    Bundle[] arrayOfBundle = new Bundle[i];
    paramParcel.readTypedArray((Object[])arrayOfBundle, Bundle.CREATOR);
    this.d = new h(i);
    for (byte b = 0; b < i; b++)
      this.d.put(arrayOfString[b], arrayOfBundle[b]); 
  }
  
  public String toString() {
    StringBuilder stringBuilder = c.a.a.a.a.e("ExtendableSavedState{");
    stringBuilder.append(Integer.toHexString(System.identityHashCode(this)));
    stringBuilder.append(" states=");
    stringBuilder.append(this.d);
    stringBuilder.append("}");
    return stringBuilder.toString();
  }
  
  public void writeToParcel(Parcel paramParcel, int paramInt) {
    paramParcel.writeParcelable(this.b, paramInt);
    int i = this.d.d;
    paramParcel.writeInt(i);
    String[] arrayOfString = new String[i];
    Bundle[] arrayOfBundle = new Bundle[i];
    for (paramInt = 0; paramInt < i; paramInt++) {
      arrayOfString[paramInt] = (String)this.d.h(paramInt);
      arrayOfBundle[paramInt] = (Bundle)this.d.k(paramInt);
    } 
    paramParcel.writeStringArray(arrayOfString);
    paramParcel.writeTypedArray((Parcelable[])arrayOfBundle, 0);
  }
  
  public static final class a implements Parcelable.ClassLoaderCreator<a> {
    public Object createFromParcel(Parcel param1Parcel) {
      return new a(param1Parcel, null, null);
    }
    
    public Object createFromParcel(Parcel param1Parcel, ClassLoader param1ClassLoader) {
      return new a(param1Parcel, param1ClassLoader, null);
    }
    
    public Object[] newArray(int param1Int) {
      return (Object[])new a[param1Int];
    }
  }
}


/* Location:              C:\Users\panch\Downloads\dvba_v1.1.0-dex2jar.jar!\c\c\a\b\f0\a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */