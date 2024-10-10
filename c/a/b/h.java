package c.a.b;

import android.text.TextUtils;
import c.a.a.a.a;

public final class h {
  public final String a;
  
  public final String b;
  
  public h(String paramString1, String paramString2) {
    this.a = paramString1;
    this.b = paramString2;
  }
  
  public boolean equals(Object paramObject) {
    boolean bool = true;
    if (this == paramObject)
      return true; 
    if (paramObject == null || h.class != paramObject.getClass())
      return false; 
    paramObject = paramObject;
    if (!TextUtils.equals(this.a, ((h)paramObject).a) || !TextUtils.equals(this.b, ((h)paramObject).b))
      bool = false; 
    return bool;
  }
  
  public int hashCode() {
    int i = this.a.hashCode();
    return this.b.hashCode() + i * 31;
  }
  
  public String toString() {
    StringBuilder stringBuilder = a.e("Header[name=");
    stringBuilder.append(this.a);
    stringBuilder.append(",value=");
    stringBuilder.append(this.b);
    stringBuilder.append("]");
    return stringBuilder.toString();
  }
}


/* Location:              C:\Users\panch\Downloads\dvba_v1.1.0-dex2jar.jar!\c\a\b\h.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */