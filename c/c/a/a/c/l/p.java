package c.c.a.a.c.l;

import java.util.ArrayList;
import java.util.List;

public final class p {
  public final List<String> a;
  
  public final Object b;
  
  public p(Object paramObject, j0 paramj0) {
    q.f(paramObject);
    this.b = paramObject;
    this.a = new ArrayList<String>();
  }
  
  public final p a(String paramString, Object paramObject) {
    List<String> list = this.a;
    q.f(paramString);
    paramObject = String.valueOf(paramObject);
    int i = paramString.length();
    StringBuilder stringBuilder = new StringBuilder(paramObject.length() + i + 1);
    stringBuilder.append(paramString);
    stringBuilder.append("=");
    stringBuilder.append((String)paramObject);
    list.add(stringBuilder.toString());
    return this;
  }
  
  public final String toString() {
    StringBuilder stringBuilder = new StringBuilder(100);
    stringBuilder.append(this.b.getClass().getSimpleName());
    stringBuilder.append('{');
    int i = this.a.size();
    for (byte b = 0; b < i; b++) {
      stringBuilder.append(this.a.get(b));
      if (b < i - 1)
        stringBuilder.append(", "); 
    } 
    stringBuilder.append('}');
    return stringBuilder.toString();
  }
}


/* Location:              C:\Users\panch\Downloads\dvba_v1.1.0-dex2jar.jar!\c\c\a\a\c\l\p.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */