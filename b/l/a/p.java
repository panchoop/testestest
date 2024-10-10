package b.l.a;

import androidx.fragment.app.Fragment;
import b.n.p;
import b.n.q;
import b.n.s;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;

public class p extends p {
  public static final q h = new a();
  
  public final HashSet<Fragment> b = new HashSet<Fragment>();
  
  public final HashMap<String, p> c = new HashMap<String, p>();
  
  public final HashMap<String, s> d = new HashMap<String, s>();
  
  public final boolean e;
  
  public boolean f = false;
  
  public boolean g = false;
  
  public p(boolean paramBoolean) {
    this.e = paramBoolean;
  }
  
  public void a() {
    boolean bool = k.H;
    this.f = true;
  }
  
  public boolean b(Fragment paramFragment) {
    return !this.b.contains(paramFragment) ? true : (this.e ? this.f : (this.g ^ true));
  }
  
  public boolean equals(Object paramObject) {
    boolean bool = true;
    if (this == paramObject)
      return true; 
    if (paramObject == null || p.class != paramObject.getClass())
      return false; 
    paramObject = paramObject;
    if (!this.b.equals(((p)paramObject).b) || !this.c.equals(((p)paramObject).c) || !this.d.equals(((p)paramObject).d))
      bool = false; 
    return bool;
  }
  
  public int hashCode() {
    int i = this.b.hashCode();
    int j = this.c.hashCode();
    return this.d.hashCode() + (j + i * 31) * 31;
  }
  
  public String toString() {
    StringBuilder stringBuilder = new StringBuilder("FragmentManagerViewModel{");
    stringBuilder.append(Integer.toHexString(System.identityHashCode(this)));
    stringBuilder.append("} Fragments (");
    Iterator<Fragment> iterator = this.b.iterator();
    while (iterator.hasNext()) {
      stringBuilder.append(iterator.next());
      if (iterator.hasNext())
        stringBuilder.append(", "); 
    } 
    stringBuilder.append(") Child Non Config (");
    iterator = this.c.keySet().iterator();
    while (iterator.hasNext()) {
      stringBuilder.append((String)iterator.next());
      if (iterator.hasNext())
        stringBuilder.append(", "); 
    } 
    stringBuilder.append(") ViewModelStores (");
    iterator = this.d.keySet().iterator();
    while (iterator.hasNext()) {
      stringBuilder.append((String)iterator.next());
      if (iterator.hasNext())
        stringBuilder.append(", "); 
    } 
    stringBuilder.append(')');
    return stringBuilder.toString();
  }
  
  public static final class a implements q {
    public <T extends p> T a(Class<T> param1Class) {
      return (T)new p(true);
    }
  }
}


/* Location:              C:\Users\panch\Downloads\dvba_v1.1.0-dex2jar.jar!\b\l\a\p.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */