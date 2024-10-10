package b.h.d;

import b.f.h;
import b.i.l.c;
import java.util.ArrayList;
import java.util.HashSet;

public final class a<T> {
  public final c<ArrayList<T>> a = new c(10);
  
  public final h<T, ArrayList<T>> b = new h();
  
  public final ArrayList<T> c = new ArrayList<T>();
  
  public final HashSet<T> d = new HashSet<T>();
  
  public void a(T paramT) {
    boolean bool;
    if (this.b.e(paramT) >= 0) {
      bool = true;
    } else {
      bool = false;
    } 
    if (!bool)
      this.b.put(paramT, null); 
  }
  
  public final void b(T paramT, ArrayList<T> paramArrayList, HashSet<T> paramHashSet) {
    if (paramArrayList.contains(paramT))
      return; 
    if (!paramHashSet.contains(paramT)) {
      paramHashSet.add(paramT);
      ArrayList<T> arrayList = (ArrayList)this.b.getOrDefault(paramT, null);
      if (arrayList != null) {
        byte b = 0;
        int i = arrayList.size();
        while (b < i) {
          b(arrayList.get(b), paramArrayList, paramHashSet);
          b++;
        } 
      } 
      paramHashSet.remove(paramT);
      paramArrayList.add(paramT);
      return;
    } 
    throw new RuntimeException("This graph contains cyclic dependencies");
  }
}


/* Location:              C:\Users\panch\Downloads\dvba_v1.1.0-dex2jar.jar!\b\h\d\a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */