package b.v;

import android.os.Parcel;
import android.util.SparseIntArray;
import b.f.a;
import java.lang.reflect.Method;

public class b extends a {
  public final SparseIntArray d = new SparseIntArray();
  
  public final Parcel e;
  
  public final int f;
  
  public final int g;
  
  public final String h;
  
  public int i = -1;
  
  public int j = 0;
  
  public int k = -1;
  
  public b(Parcel paramParcel) {
    this(paramParcel, paramParcel.dataPosition(), paramParcel.dataSize(), "", new a(), new a(), new a());
  }
  
  public b(Parcel paramParcel, int paramInt1, int paramInt2, String paramString, a<String, Method> parama1, a<String, Method> parama2, a<String, Class> parama) {
    super(parama1, parama2, parama);
    this.e = paramParcel;
    this.f = paramInt1;
    this.g = paramInt2;
    this.j = paramInt1;
    this.h = paramString;
  }
  
  public void a() {
    int i = this.i;
    if (i >= 0) {
      i = this.d.get(i);
      int j = this.e.dataPosition();
      this.e.setDataPosition(i);
      this.e.writeInt(j - i);
      this.e.setDataPosition(j);
    } 
  }
  
  public a b() {
    Parcel parcel = this.e;
    int k = parcel.dataPosition();
    int j = this.j;
    int i = j;
    if (j == this.f)
      i = this.g; 
    StringBuilder stringBuilder = new StringBuilder();
    stringBuilder.append(this.h);
    stringBuilder.append("  ");
    return new b(parcel, k, i, stringBuilder.toString(), this.a, this.b, this.c);
  }
  
  public boolean h(int paramInt) {
    while (true) {
      int i = this.j;
      int j = this.g;
      boolean bool = true;
      if (i < j) {
        i = this.k;
        if (i == paramInt)
          return true; 
        if (String.valueOf(i).compareTo(String.valueOf(paramInt)) > 0)
          return false; 
        this.e.setDataPosition(this.j);
        i = this.e.readInt();
        this.k = this.e.readInt();
        this.j += i;
        continue;
      } 
      if (this.k != paramInt)
        bool = false; 
      return bool;
    } 
  }
  
  public void l(int paramInt) {
    a();
    this.i = paramInt;
    this.d.put(paramInt, this.e.dataPosition());
    this.e.writeInt(0);
    this.e.writeInt(paramInt);
  }
}


/* Location:              C:\Users\panch\Downloads\dvba_v1.1.0-dex2jar.jar!\b\v\b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */