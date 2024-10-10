package b.i.m;

import c.a.a.a.a;

public final class c {
  public final Object a;
  
  public c(Object paramObject) {
    this.a = paramObject;
  }
  
  public boolean equals(Object paramObject) {
    boolean bool = true;
    if (this == paramObject)
      return true; 
    if (paramObject == null || c.class != paramObject.getClass())
      return false; 
    c c1 = (c)paramObject;
    paramObject = this.a;
    Object object = c1.a;
    if (paramObject == null) {
      if (object != null)
        bool = false; 
    } else {
      bool = paramObject.equals(object);
    } 
    return bool;
  }
  
  public int hashCode() {
    int i;
    Object object = this.a;
    if (object == null) {
      i = 0;
    } else {
      i = object.hashCode();
    } 
    return i;
  }
  
  public String toString() {
    StringBuilder stringBuilder = a.e("DisplayCutoutCompat{");
    stringBuilder.append(this.a);
    stringBuilder.append("}");
    return stringBuilder.toString();
  }
}


/* Location:              C:\Users\panch\Downloads\dvba_v1.1.0-dex2jar.jar!\b\i\m\c.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */