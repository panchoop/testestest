package c.c.a.a.c.k;

import c.c.a.a.c.c;

public final class j extends UnsupportedOperationException {
  public final c b;
  
  public j(c paramc) {
    this.b = paramc;
  }
  
  public final String getMessage() {
    String str = String.valueOf(this.b);
    StringBuilder stringBuilder = new StringBuilder(str.length() + 8);
    stringBuilder.append("Missing ");
    stringBuilder.append(str);
    return stringBuilder.toString();
  }
}


/* Location:              C:\Users\panch\Downloads\dvba_v1.1.0-dex2jar.jar!\c\c\a\a\c\k\j.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */