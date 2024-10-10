package c.c.b.i;

import c.c.a.a.c.l.q;
import c.c.b.j.c;
import c.c.b.j.d;
import c.c.b.l.a;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.Executor;

public class l extends a {
  public static final a<Set<Object>> e = k.a;
  
  public final Map<d<?>, u<?>> a = new HashMap<d<?>, u<?>>();
  
  public final Map<Class<?>, u<?>> b = new HashMap<Class<?>, u<?>>();
  
  public final Map<Class<?>, u<Set<?>>> c = new HashMap<Class<?>, u<Set<?>>>();
  
  public final t d;
  
  public l(Executor paramExecutor, Iterable<h> paramIterable, d<?>... paramVarArgs) {
    this.d = new t(paramExecutor);
    ArrayList<d<?>> arrayList = new ArrayList();
    arrayList.add(d.c(this.d, t.class, (Class<? super t>[])new Class[] { d.class, c.class }));
    Iterator<h> iterator1 = paramIterable.iterator();
    while (iterator1.hasNext())
      arrayList.addAll(((h)iterator1.next()).getComponents()); 
    int j = paramVarArgs.length;
    int i;
    for (i = 0; i < j; i++) {
      d<?> d1 = paramVarArgs[i];
      if (d1 != null)
        arrayList.add(d1); 
    } 
    HashMap<Object, Object> hashMap = new HashMap<Object, Object>(arrayList.size());
    for (d<?> d1 : arrayList) {
      n n = new n(d1);
      for (Class<?> clazz : d1.a) {
        o o = new o(clazz, d1.b() ^ true, null);
        if (!hashMap.containsKey(o))
          hashMap.put(o, new HashSet()); 
        Set<n> set1 = (Set)hashMap.get(o);
        if (set1.isEmpty() || o.b) {
          set1.add(n);
          continue;
        } 
        throw new IllegalArgumentException(String.format("Multiple components provide %s.", new Object[] { clazz }));
      } 
    } 
    null = hashMap.values().iterator();
    while (null.hasNext()) {
      for (n n : null.next()) {
        for (p p : n.a.b) {
          if (p.c == 0) {
            i = 1;
          } else {
            i = 0;
          } 
          if (i == 0)
            continue; 
          Set set1 = (Set)hashMap.get(new o(p.a, p.a(), null));
          if (set1 == null)
            continue; 
          for (n n1 : set1) {
            n.b.add(n1);
            n1.c.add(n);
          } 
        } 
      } 
    } 
    Set set = new HashSet();
    Iterator<Set> iterator = hashMap.values().iterator();
    while (iterator.hasNext())
      set.addAll(iterator.next()); 
    HashSet<n> hashSet = new HashSet();
    for (n n : set) {
      if (n.a())
        hashSet.add(n); 
    } 
    i = 0;
    label130: while (!hashSet.isEmpty()) {
      n n = hashSet.iterator().next();
      hashSet.remove(n);
      j = i + 1;
      Iterator<n> iterator2 = n.b.iterator();
      while (true) {
        i = j;
        if (iterator2.hasNext()) {
          n n1 = iterator2.next();
          n1.c.remove(n);
          if (n1.a())
            hashSet.add(n1); 
          continue;
        } 
        continue label130;
      } 
    } 
    if (i == arrayList.size()) {
      for (d<?> d1 : arrayList) {
        u<?> u = new u(new i(this, d1));
        this.a.put(d1, u);
      } 
      for (Map.Entry<d<?>, u<?>> entry : this.a.entrySet()) {
        d d1 = (d)entry.getKey();
        if (!d1.b())
          continue; 
        u<?> u = (u)entry.getValue();
        for (Class<?> clazz : (Iterable<Class<?>>)d1.a)
          this.b.put(clazz, u); 
      } 
      for (d<?> d1 : this.a.keySet()) {
        for (p p : d1.b) {
          if (p.b == 1) {
            i = 1;
          } else {
            i = 0;
          } 
          if (i == 0 || this.b.containsKey(p.a))
            continue; 
          throw new v(String.format("Unsatisfied dependency for component %s: %s", new Object[] { d1, p.a }));
        } 
      } 
      HashMap<Object, Object> hashMap1 = new HashMap<Object, Object>();
      for (Map.Entry<d<?>, u<?>> entry : this.a.entrySet()) {
        d d1 = (d)entry.getKey();
        if (d1.b())
          continue; 
        u u = (u)entry.getValue();
        for (Class clazz : d1.a) {
          if (!hashMap1.containsKey(clazz))
            hashMap1.put(clazz, new HashSet()); 
          ((Set<u>)hashMap1.get(clazz)).add(u);
        } 
      } 
      for (Map.Entry<Object, Object> entry : hashMap1.entrySet()) {
        set = (Set)entry.getValue();
        this.c.put((Class)entry.getKey(), new u<Set<?>>(new j(set)));
      } 
      return;
    } 
    arrayList = new ArrayList<d<?>>();
    for (n n : set) {
      if (!n.a() && !n.b.isEmpty())
        arrayList.add(n.a); 
    } 
    throw new q(arrayList);
  }
  
  public static Object e(l paraml, d<?> paramd) {
    return paramd.e.a(new w(paramd, paraml));
  }
  
  public <T> a<T> b(Class<T> paramClass) {
    q.h(paramClass, "Null interface requested.");
    return (a<T>)this.b.get(paramClass);
  }
  
  public <T> a<Set<T>> d(Class<T> paramClass) {
    u<Set<T>> u = (u)this.c.get(paramClass);
    return (a<Set<T>>)((u != null) ? u : e);
  }
}


/* Location:              C:\Users\panch\Downloads\dvba_v1.1.0-dex2jar.jar!\c\c\b\i\l.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */