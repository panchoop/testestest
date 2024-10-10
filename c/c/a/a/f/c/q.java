package c.c.a.a.f.c;

import java.util.Collection;
import java.util.Iterator;
import java.util.Set;
import org.checkerframework.checker.nullness.compatqual.NullableDecl;

public abstract class q<E> extends l<E> implements Set<E> {
  @NullableDecl
  public transient n<E> c;
  
  public boolean equals(@NullableDecl Object paramObject) {
    boolean bool = true;
    if (paramObject == this)
      return true; 
    if (this != paramObject) {
      if (paramObject instanceof Set) {
        paramObject = paramObject;
        try {
          if (size() == paramObject.size()) {
            boolean bool1 = containsAll((Collection<?>)paramObject);
            if (bool1)
              return bool; 
          } 
        } catch (NullPointerException|ClassCastException nullPointerException) {}
      } 
      bool = false;
    } 
    return bool;
  }
  
  public n<E> f() {
    n<E> n2 = this.c;
    n<E> n1 = n2;
    if (n2 == null) {
      n1 = new u((v)this);
      this.c = n1;
    } 
    return n1;
  }
  
  public int hashCode() {
    return c.c.a.a.c.l.q.o0(this);
  }
}


/* Location:              C:\Users\panch\Downloads\dvba_v1.1.0-dex2jar.jar!\c\c\a\a\f\c\q.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */