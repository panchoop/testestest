package c.c.a.a.f.c;

import c.c.a.a.c.l.q;
import java.util.NoSuchElementException;

public final class m<E> extends m<E> {
  public final int b;
  
  public int c;
  
  public final n<E> d;
  
  public m(n<E> paramn, int paramInt) {
    q.A0(paramInt, i);
    this.b = i;
    this.c = paramInt;
    this.d = paramn;
  }
  
  public final boolean hasNext() {
    boolean bool;
    if (this.c < this.b) {
      bool = true;
    } else {
      bool = false;
    } 
    return bool;
  }
  
  public final boolean hasPrevious() {
    boolean bool;
    if (this.c > 0) {
      bool = true;
    } else {
      bool = false;
    } 
    return bool;
  }
  
  public final Object next() {
    int i;
    if (this.c < this.b) {
      i = 1;
    } else {
      i = 0;
    } 
    if (i) {
      i = this.c;
      this.c = i + 1;
      return this.d.get(i);
    } 
    throw new NoSuchElementException();
  }
  
  public final int nextIndex() {
    return this.c;
  }
  
  public final Object previous() {
    int i;
    if (this.c > 0) {
      i = 1;
    } else {
      i = 0;
    } 
    if (i) {
      i = this.c - 1;
      this.c = i;
      return this.d.get(i);
    } 
    throw new NoSuchElementException();
  }
  
  public final int previousIndex() {
    return this.c - 1;
  }
}


/* Location:              C:\Users\panch\Downloads\dvba_v1.1.0-dex2jar.jar!\c\c\a\a\f\c\m.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */