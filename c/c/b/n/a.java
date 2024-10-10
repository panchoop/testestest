package c.c.b.n;

public final class a extends e {
  public final String a;
  
  public final String b;
  
  public a(String paramString1, String paramString2) {
    if (paramString1 != null) {
      this.a = paramString1;
      if (paramString2 != null) {
        this.b = paramString2;
        return;
      } 
      throw new NullPointerException("Null version");
    } 
    throw new NullPointerException("Null libraryName");
  }
  
  public boolean equals(Object paramObject) {
    boolean bool = true;
    if (paramObject == this)
      return true; 
    if (paramObject instanceof e) {
      e e1 = (e)paramObject;
      paramObject = this.a;
      e1 = e1;
      if (!paramObject.equals(((a)e1).a) || !this.b.equals(((a)e1).b))
        bool = false; 
      return bool;
    } 
    return false;
  }
  
  public int hashCode() {
    return (this.a.hashCode() ^ 0xF4243) * 1000003 ^ this.b.hashCode();
  }
  
  public String toString() {
    StringBuilder stringBuilder = c.a.a.a.a.e("LibraryVersion{libraryName=");
    stringBuilder.append(this.a);
    stringBuilder.append(", version=");
    stringBuilder.append(this.b);
    stringBuilder.append("}");
    return stringBuilder.toString();
  }
}


/* Location:              C:\Users\panch\Downloads\dvba_v1.1.0-dex2jar.jar!\c\c\b\n\a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */