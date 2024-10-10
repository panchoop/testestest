package c.c.a.a.f.c;

import java.io.Serializable;
import java.lang.reflect.Array;
import java.util.AbstractCollection;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import org.checkerframework.checker.nullness.compatqual.NullableDecl;

public abstract class l<E> extends AbstractCollection<E> implements Serializable {
  public static final Object[] b = new Object[0];
  
  public int a(Object[] paramArrayOfObject, int paramInt) {
    y y = (y)iterator();
    while (y.hasNext()) {
      paramArrayOfObject[paramInt] = y.next();
      paramInt++;
    } 
    return paramInt;
  }
  
  @Deprecated
  public final boolean add(E paramE) {
    throw new UnsupportedOperationException();
  }
  
  @Deprecated
  public final boolean addAll(Collection<? extends E> paramCollection) {
    throw new UnsupportedOperationException();
  }
  
  public abstract y<E> b();
  
  @NullableDecl
  public Object[] c() {
    return null;
  }
  
  @Deprecated
  public final void clear() {
    throw new UnsupportedOperationException();
  }
  
  public abstract boolean contains(@NullableDecl Object paramObject);
  
  public int d() {
    throw new UnsupportedOperationException();
  }
  
  public int e() {
    throw new UnsupportedOperationException();
  }
  
  @Deprecated
  public final boolean remove(Object paramObject) {
    throw new UnsupportedOperationException();
  }
  
  @Deprecated
  public final boolean removeAll(Collection<?> paramCollection) {
    throw new UnsupportedOperationException();
  }
  
  @Deprecated
  public final boolean retainAll(Collection<?> paramCollection) {
    throw new UnsupportedOperationException();
  }
  
  public final Object[] toArray() {
    return toArray(b);
  }
  
  public final <T> T[] toArray(T[] paramArrayOfT) {
    if (paramArrayOfT != null) {
      T[] arrayOfT;
      int i = size();
      if (paramArrayOfT.length < i) {
        Object[] arrayOfObject = c();
        if (arrayOfObject != null)
          return Arrays.copyOfRange(arrayOfObject, d(), e(), (Class)paramArrayOfT.getClass()); 
        arrayOfObject = (Object[])Array.newInstance(paramArrayOfT.getClass().getComponentType(), i);
      } else {
        arrayOfT = paramArrayOfT;
        if (paramArrayOfT.length > i) {
          paramArrayOfT[i] = null;
          arrayOfT = paramArrayOfT;
        } 
      } 
      a((Object[])arrayOfT, 0);
      return arrayOfT;
    } 
    throw null;
  }
}


/* Location:              C:\Users\panch\Downloads\dvba_v1.1.0-dex2jar.jar!\c\c\a\a\f\c\l.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */