package c.c.b.i;

import c.c.b.j.c;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

public final class w extends a {
  public final Set<Class<?>> a;
  
  public final Set<Class<?>> b;
  
  public final Set<Class<?>> c;
  
  public final Set<Class<?>> d;
  
  public final Set<Class<?>> e;
  
  public final a f;
  
  public w(d<?> paramd, a parama) {
    HashSet<Class<?>> hashSet2 = new HashSet();
    HashSet<Class<?>> hashSet3 = new HashSet();
    HashSet<Class<?>> hashSet1 = new HashSet();
    HashSet<Class<?>> hashSet4 = new HashSet();
    for (p p : paramd.b) {
      boolean bool;
      if (p.c == 0) {
        bool = true;
      } else {
        bool = false;
      } 
      if (bool) {
        if (p.a()) {
          hashSet1.add(p.a);
          continue;
        } 
        hashSet2.add(p.a);
        continue;
      } 
      if (p.a()) {
        hashSet4.add(p.a);
        continue;
      } 
      hashSet3.add(p.a);
    } 
    if (!paramd.f.isEmpty())
      hashSet2.add(c.class); 
    this.a = Collections.unmodifiableSet(hashSet2);
    this.b = Collections.unmodifiableSet(hashSet3);
    this.c = Collections.unmodifiableSet(hashSet1);
    this.d = Collections.unmodifiableSet(hashSet4);
    this.e = paramd.f;
    this.f = parama;
  }
  
  public <T> T a(Class<T> paramClass) {
    if (this.a.contains(paramClass)) {
      T t = (T)this.f.a((Class)paramClass);
      return (T)(!paramClass.equals(c.class) ? (Object)t : new a(this.e, (c)t));
    } 
    throw new IllegalArgumentException(String.format("Attempting to request an undeclared dependency %s.", new Object[] { paramClass }));
  }
  
  public <T> c.c.b.l.a<T> b(Class<T> paramClass) {
    if (this.b.contains(paramClass))
      return this.f.b(paramClass); 
    throw new IllegalArgumentException(String.format("Attempting to request an undeclared dependency Provider<%s>.", new Object[] { paramClass }));
  }
  
  public <T> Set<T> c(Class<T> paramClass) {
    if (this.c.contains(paramClass))
      return this.f.c(paramClass); 
    throw new IllegalArgumentException(String.format("Attempting to request an undeclared dependency Set<%s>.", new Object[] { paramClass }));
  }
  
  public <T> c.c.b.l.a<Set<T>> d(Class<T> paramClass) {
    if (this.d.contains(paramClass))
      return this.f.d(paramClass); 
    throw new IllegalArgumentException(String.format("Attempting to request an undeclared dependency Provider<Set<%s>>.", new Object[] { paramClass }));
  }
  
  public static class a implements c {
    public a(Set<Class<?>> param1Set, c param1c) {}
  }
}


/* Location:              C:\Users\panch\Downloads\dvba_v1.1.0-dex2jar.jar!\c\c\b\i\w.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */