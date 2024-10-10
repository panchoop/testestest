package b.l.a;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.fragment.app.Fragment;

@SuppressLint({"BanParcelableUsage"})
public final class q implements Parcelable {
  public static final Parcelable.Creator<q> CREATOR = new a();
  
  public final String b;
  
  public final String c;
  
  public final boolean d;
  
  public final int e;
  
  public final int f;
  
  public final String g;
  
  public final boolean h;
  
  public final boolean i;
  
  public final boolean j;
  
  public final Bundle k;
  
  public final boolean l;
  
  public final int m;
  
  public Bundle n;
  
  public Fragment o;
  
  public q(Parcel paramParcel) {
    boolean bool1;
    this.b = paramParcel.readString();
    this.c = paramParcel.readString();
    int i = paramParcel.readInt();
    boolean bool2 = true;
    if (i != 0) {
      bool1 = true;
    } else {
      bool1 = false;
    } 
    this.d = bool1;
    this.e = paramParcel.readInt();
    this.f = paramParcel.readInt();
    this.g = paramParcel.readString();
    if (paramParcel.readInt() != 0) {
      bool1 = true;
    } else {
      bool1 = false;
    } 
    this.h = bool1;
    if (paramParcel.readInt() != 0) {
      bool1 = true;
    } else {
      bool1 = false;
    } 
    this.i = bool1;
    if (paramParcel.readInt() != 0) {
      bool1 = true;
    } else {
      bool1 = false;
    } 
    this.j = bool1;
    this.k = paramParcel.readBundle();
    if (paramParcel.readInt() != 0) {
      bool1 = bool2;
    } else {
      bool1 = false;
    } 
    this.l = bool1;
    this.n = paramParcel.readBundle();
    this.m = paramParcel.readInt();
  }
  
  public q(Fragment paramFragment) {
    this.b = paramFragment.getClass().getName();
    this.c = paramFragment.f;
    this.d = paramFragment.n;
    this.e = paramFragment.w;
    this.f = paramFragment.x;
    this.g = paramFragment.y;
    this.h = paramFragment.B;
    this.i = paramFragment.m;
    this.j = paramFragment.A;
    this.k = paramFragment.g;
    this.l = paramFragment.z;
    this.m = paramFragment.Q.ordinal();
  }
  
  public int describeContents() {
    return 0;
  }
  
  public String toString() {
    StringBuilder stringBuilder = new StringBuilder(128);
    stringBuilder.append("FragmentState{");
    stringBuilder.append(this.b);
    stringBuilder.append(" (");
    stringBuilder.append(this.c);
    stringBuilder.append(")}:");
    if (this.d)
      stringBuilder.append(" fromLayout"); 
    if (this.f != 0) {
      stringBuilder.append(" id=0x");
      stringBuilder.append(Integer.toHexString(this.f));
    } 
    String str = this.g;
    if (str != null && !str.isEmpty()) {
      stringBuilder.append(" tag=");
      stringBuilder.append(this.g);
    } 
    if (this.h)
      stringBuilder.append(" retainInstance"); 
    if (this.i)
      stringBuilder.append(" removing"); 
    if (this.j)
      stringBuilder.append(" detached"); 
    if (this.l)
      stringBuilder.append(" hidden"); 
    return stringBuilder.toString();
  }
  
  public void writeToParcel(Parcel paramParcel, int paramInt) {
    paramParcel.writeString(this.b);
    paramParcel.writeString(this.c);
    paramParcel.writeInt(this.d);
    paramParcel.writeInt(this.e);
    paramParcel.writeInt(this.f);
    paramParcel.writeString(this.g);
    paramParcel.writeInt(this.h);
    paramParcel.writeInt(this.i);
    paramParcel.writeInt(this.j);
    paramParcel.writeBundle(this.k);
    paramParcel.writeInt(this.l);
    paramParcel.writeBundle(this.n);
    paramParcel.writeInt(this.m);
  }
  
  public static final class a implements Parcelable.Creator<q> {
    public Object createFromParcel(Parcel param1Parcel) {
      return new q(param1Parcel);
    }
    
    public Object[] newArray(int param1Int) {
      return (Object[])new q[param1Int];
    }
  }
}


/* Location:              C:\Users\panch\Downloads\dvba_v1.1.0-dex2jar.jar!\b\l\a\q.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */