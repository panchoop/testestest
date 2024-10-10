package c.c.b.i;

import c.c.a.a.c.l.q;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

public final class d<T> {
  public final Set<Class<? super T>> a;
  
  public final Set<p> b;
  
  public final int c;
  
  public final int d;
  
  public final g<T> e;
  
  public final Set<Class<?>> f;
  
  public d(Set<? extends Class<? super T>> paramSet1, Set<? extends p> paramSet2, int paramInt1, int paramInt2, g<T> paramg, Set<? extends Class<?>> paramSet3, a parama) {
    this.a = Collections.unmodifiableSet(paramSet1);
    this.b = Collections.unmodifiableSet(paramSet2);
    this.c = paramInt1;
    this.d = paramInt2;
    this.e = paramg;
    this.f = Collections.unmodifiableSet(paramSet3);
  }
  
  public static <T> b<T> a(Class<T> paramClass) {
    return new b<T>(paramClass, new Class[0], null);
  }
  
  @SafeVarargs
  public static <T> d<T> c(T paramT, Class<T> paramClass, Class<? super T>... paramVarArgs) {
    b<T> b = new b(paramClass, (Class[])paramVarArgs, null);
    b.c(new b(paramT));
    return b.b();
  }
  
  public boolean b() {
    boolean bool;
    if (this.d == 0) {
      bool = true;
    } else {
      bool = false;
    } 
    return bool;
  }
  
  public String toString() {
    StringBuilder stringBuilder = new StringBuilder("Component<");
    stringBuilder.append(Arrays.toString(this.a.toArray()));
    stringBuilder.append(">{");
    stringBuilder.append(this.c);
    stringBuilder.append(", type=");
    stringBuilder.append(this.d);
    stringBuilder.append(", deps=");
    stringBuilder.append(Arrays.toString(this.b.toArray()));
    stringBuilder.append("}");
    return stringBuilder.toString();
  }
  
  public static class b<T> {
    public final Set<Class<? super T>> a = new HashSet<Class<? super T>>();
    
    public final Set<p> b = new HashSet<p>();
    
    public int c;
    
    public int d;
    
    public g<T> e;
    
    public Set<Class<?>> f;
    
    public b(Class<? super T> param1Class, Class[] param1ArrayOfClass, d.a param1a) {
      byte b1 = 0;
      this.c = 0;
      this.d = 0;
      this.f = new HashSet<Class<?>>();
      q.h(param1Class, "Null interface");
      this.a.add(param1Class);
      int i = param1ArrayOfClass.length;
      while (b1 < i) {
        q.h(param1ArrayOfClass[b1], "Null interface");
        b1++;
      } 
      Collections.addAll(this.a, (Class<? super T>[])param1ArrayOfClass);
    }
    
    public b<T> a(p param1p) {
      q.h(param1p, "Null dependency");
      Class<?> clazz = param1p.a;
      if ((this.a.contains(clazz) ^ true) != 0) {
        this.b.add(param1p);
        return this;
      } 
      throw new IllegalArgumentException("Components are not allowed to depend on interfaces they themselves provide.");
    }
    
    public d<T> b() {
      boolean bool;
      if (this.e != null) {
        bool = true;
      } else {
        bool = false;
      } 
      if (bool)
        return new d<T>(new HashSet<Class<? super T>>(this.a), new HashSet<p>(this.b), this.c, this.d, this.e, this.f, null); 
      throw new IllegalStateException("Missing required property: factory.");
    }
    
    public b<T> c(g<T> param1g) {
      q.h(param1g, "Null factory");
      this.e = param1g;
      return this;
    }
  }
}


/* Location:              C:\Users\panch\Downloads\dvba_v1.1.0-dex2jar.jar!\c\c\b\i\d.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */