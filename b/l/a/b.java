package b.l.a;

import android.annotation.SuppressLint;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import androidx.fragment.app.Fragment;
import java.util.ArrayList;

@SuppressLint({"BanParcelableUsage"})
public final class b implements Parcelable {
  public static final Parcelable.Creator<b> CREATOR = new a();
  
  public final int[] b;
  
  public final ArrayList<String> c;
  
  public final int[] d;
  
  public final int[] e;
  
  public final int f;
  
  public final int g;
  
  public final String h;
  
  public final int i;
  
  public final int j;
  
  public final CharSequence k;
  
  public final int l;
  
  public final CharSequence m;
  
  public final ArrayList<String> n;
  
  public final ArrayList<String> o;
  
  public final boolean p;
  
  public b(Parcel paramParcel) {
    boolean bool;
    this.b = paramParcel.createIntArray();
    this.c = paramParcel.createStringArrayList();
    this.d = paramParcel.createIntArray();
    this.e = paramParcel.createIntArray();
    this.f = paramParcel.readInt();
    this.g = paramParcel.readInt();
    this.h = paramParcel.readString();
    this.i = paramParcel.readInt();
    this.j = paramParcel.readInt();
    this.k = (CharSequence)TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(paramParcel);
    this.l = paramParcel.readInt();
    this.m = (CharSequence)TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(paramParcel);
    this.n = paramParcel.createStringArrayList();
    this.o = paramParcel.createStringArrayList();
    if (paramParcel.readInt() != 0) {
      bool = true;
    } else {
      bool = false;
    } 
    this.p = bool;
  }
  
  public b(a parama) {
    int i = parama.a.size();
    this.b = new int[i * 5];
    if (parama.h) {
      this.c = new ArrayList<String>(i);
      this.d = new int[i];
      this.e = new int[i];
      byte b1 = 0;
      for (int j = 0; b1 < i; j++) {
        r.a a1 = parama.a.get(b1);
        int[] arrayOfInt2 = this.b;
        int k = j + 1;
        arrayOfInt2[j] = a1.a;
        ArrayList<String> arrayList = this.c;
        Fragment fragment = a1.b;
        if (fragment != null) {
          String str = fragment.f;
        } else {
          fragment = null;
        } 
        arrayList.add(fragment);
        int[] arrayOfInt1 = this.b;
        j = k + 1;
        arrayOfInt1[k] = a1.c;
        k = j + 1;
        arrayOfInt1[j] = a1.d;
        j = k + 1;
        arrayOfInt1[k] = a1.e;
        arrayOfInt1[j] = a1.f;
        this.d[b1] = a1.g.ordinal();
        this.e[b1] = a1.h.ordinal();
        b1++;
      } 
      this.f = parama.f;
      this.g = parama.g;
      this.h = parama.i;
      this.i = parama.t;
      this.j = parama.j;
      this.k = parama.k;
      this.l = parama.l;
      this.m = parama.m;
      this.n = parama.n;
      this.o = parama.o;
      this.p = parama.p;
      return;
    } 
    throw new IllegalStateException("Not on back stack");
  }
  
  public int describeContents() {
    return 0;
  }
  
  public void writeToParcel(Parcel paramParcel, int paramInt) {
    paramParcel.writeIntArray(this.b);
    paramParcel.writeStringList(this.c);
    paramParcel.writeIntArray(this.d);
    paramParcel.writeIntArray(this.e);
    paramParcel.writeInt(this.f);
    paramParcel.writeInt(this.g);
    paramParcel.writeString(this.h);
    paramParcel.writeInt(this.i);
    paramParcel.writeInt(this.j);
    TextUtils.writeToParcel(this.k, paramParcel, 0);
    paramParcel.writeInt(this.l);
    TextUtils.writeToParcel(this.m, paramParcel, 0);
    paramParcel.writeStringList(this.n);
    paramParcel.writeStringList(this.o);
    paramParcel.writeInt(this.p);
  }
  
  public static final class a implements Parcelable.Creator<b> {
    public Object createFromParcel(Parcel param1Parcel) {
      return new b(param1Parcel);
    }
    
    public Object[] newArray(int param1Int) {
      return (Object[])new b[param1Int];
    }
  }
}


/* Location:              C:\Users\panch\Downloads\dvba_v1.1.0-dex2jar.jar!\b\l\a\b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */