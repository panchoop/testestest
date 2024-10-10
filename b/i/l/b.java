package b.i.l;

import java.util.Objects;

public class b<F, S> {
  public final F a;
  
  public final S b;
  
  public boolean equals(Object paramObject) {
    boolean bool = paramObject instanceof b;
    boolean bool1 = false;
    if (!bool)
      return false; 
    paramObject = paramObject;
    bool = bool1;
    if (Objects.equals(((b)paramObject).a, null)) {
      bool = bool1;
      if (Objects.equals(((b)paramObject).b, null))
        bool = true; 
    } 
    return bool;
  }
  
  public int hashCode() {
    return 0;
  }
  
  public String toString() {
    return "Pair{null null}";
  }
}


/* Location:              C:\Users\panch\Downloads\dvba_v1.1.0-dex2jar.jar!\b\i\l\b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */