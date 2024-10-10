package b.l.a;

import android.annotation.SuppressLint;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;

@SuppressLint({"BanParcelableUsage"})
public final class o implements Parcelable {
  public static final Parcelable.Creator<o> CREATOR = new a();
  
  public ArrayList<q> b;
  
  public ArrayList<String> c;
  
  public b[] d;
  
  public String e = null;
  
  public int f;
  
  public o() {}
  
  public o(Parcel paramParcel) {
    this.b = paramParcel.createTypedArrayList(q.CREATOR);
    this.c = paramParcel.createStringArrayList();
    this.d = (b[])paramParcel.createTypedArray(b.CREATOR);
    this.e = paramParcel.readString();
    this.f = paramParcel.readInt();
  }
  
  public int describeContents() {
    return 0;
  }
  
  public void writeToParcel(Parcel paramParcel, int paramInt) {
    paramParcel.writeTypedList(this.b);
    paramParcel.writeStringList(this.c);
    paramParcel.writeTypedArray((Parcelable[])this.d, paramInt);
    paramParcel.writeString(this.e);
    paramParcel.writeInt(this.f);
  }
  
  public static final class a implements Parcelable.Creator<o> {
    public Object createFromParcel(Parcel param1Parcel) {
      return new o(param1Parcel);
    }
    
    public Object[] newArray(int param1Int) {
      return (Object[])new o[param1Int];
    }
  }
}


/* Location:              C:\Users\panch\Downloads\dvba_v1.1.0-dex2jar.jar!\b\l\a\o.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */