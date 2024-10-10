package c.c.b.i;

import java.util.Set;

public abstract class a {
  public <T> T a(Class<T> paramClass) {
    c.c.b.l.a<T> a1 = b(paramClass);
    return (T)((a1 == null) ? null : a1.a());
  }
  
  public abstract <T> c.c.b.l.a<T> b(Class<T> paramClass);
  
  public <T> Set<T> c(Class<T> paramClass) {
    return (Set<T>)d(paramClass).a();
  }
  
  public abstract <T> c.c.b.l.a<Set<T>> d(Class<T> paramClass);
}


/* Location:              C:\Users\panch\Downloads\dvba_v1.1.0-dex2jar.jar!\c\c\b\i\a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */