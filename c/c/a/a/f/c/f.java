package c.c.a.a.f.c;

import c.c.a.a.c.l.q;

public final class f extends g {
  public static final f b = new f();
  
  public f() {
    super("CharMatcher.none()");
  }
  
  public final int a(CharSequence paramCharSequence, int paramInt) {
    int i = paramCharSequence.length();
    if (paramInt >= 0 && paramInt <= i)
      return -1; 
    throw new IndexOutOfBoundsException(q.B0(paramInt, i, "index"));
  }
  
  public final boolean b(char paramChar) {
    return false;
  }
}


/* Location:              C:\Users\panch\Downloads\dvba_v1.1.0-dex2jar.jar!\c\c\a\a\f\c\f.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */