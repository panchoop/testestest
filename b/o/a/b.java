package b.o.a;

import b.f.i;
import b.n.g;
import b.n.l;
import b.n.m;
import b.n.p;
import b.n.q;
import b.n.r;
import b.n.s;
import java.io.FileDescriptor;
import java.io.PrintWriter;

public class b extends a {
  public final g a;
  
  public final c b;
  
  public b(g paramg, s params) {
    this.a = paramg;
    q q = c.c;
    String str = c.class.getCanonicalName();
    if (str != null) {
      p p2;
      String str1 = c.a.a.a.a.c("androidx.lifecycle.ViewModelProvider.DefaultKey:", str);
      p p1 = (p)params.a.get(str1);
      if (c.class.isInstance(p1)) {
        p2 = p1;
      } else {
        if (q instanceof r) {
          p1 = ((r)q).a(str1, c.class);
        } else {
          p1 = ((c.a)q).a((Class)c.class);
        } 
        p p = ((s)p2).a.put(str1, p1);
        p2 = p1;
        if (p != null) {
          p.a();
          p2 = p1;
        } 
      } 
      this.b = (c)p2;
      return;
    } 
    throw new IllegalArgumentException("Local and anonymous classes can not be ViewModels");
  }
  
  @Deprecated
  public void a(String paramString, FileDescriptor paramFileDescriptor, PrintWriter paramPrintWriter, String[] paramArrayOfString) {
    c c1 = this.b;
    if (c1.b.i() > 0) {
      paramPrintWriter.print(paramString);
      paramPrintWriter.println("Loaders:");
      StringBuilder stringBuilder = new StringBuilder();
      stringBuilder.append(paramString);
      stringBuilder.append("    ");
      String str = stringBuilder.toString();
      if (c1.b.i() > 0) {
        a a1 = (a)c1.b.j(0);
        paramPrintWriter.print(paramString);
        paramPrintWriter.print("  #");
        paramPrintWriter.print(c1.b.f(0));
        paramPrintWriter.print(": ");
        paramPrintWriter.println(a1.toString());
        paramPrintWriter.print(str);
        paramPrintWriter.print("mId=");
        paramPrintWriter.print(0);
        paramPrintWriter.print(" mArgs=");
        paramPrintWriter.println((Object)null);
        paramPrintWriter.print(str);
        paramPrintWriter.print("mLoader=");
        paramPrintWriter.println((Object)null);
        throw null;
      } 
    } 
  }
  
  public String toString() {
    StringBuilder stringBuilder = new StringBuilder(128);
    stringBuilder.append("LoaderManager{");
    stringBuilder.append(Integer.toHexString(System.identityHashCode(this)));
    stringBuilder.append(" in ");
    a.a.a.a.a.d(this.a, stringBuilder);
    stringBuilder.append("}}");
    return stringBuilder.toString();
  }
  
  public static class a<D> extends l<D> implements Object<D> {
    public g j;
    
    public b.b<D> k;
    
    public void d() {
      throw null;
    }
    
    public void e() {
      throw null;
    }
    
    public void f(m<? super D> param1m) {
      super.f(param1m);
      this.j = null;
      this.k = null;
    }
    
    public void g(D param1D) {
      super.g(param1D);
    }
    
    public String toString() {
      StringBuilder stringBuilder = new StringBuilder(64);
      stringBuilder.append("LoaderInfo{");
      stringBuilder.append(Integer.toHexString(System.identityHashCode(this)));
      stringBuilder.append(" #");
      stringBuilder.append(0);
      stringBuilder.append(" : ");
      a.a.a.a.a.d(null, stringBuilder);
      stringBuilder.append("}}");
      return stringBuilder.toString();
    }
  }
  
  public static class b<D> implements m<D> {}
  
  public static class c extends p {
    public static final q c = new a();
    
    public i<b.a> b = new i(10);
    
    public void a() {
      if (this.b.i() > 0) {
        b.a a = (b.a)this.b.j(0);
        throw null;
      } 
      i<b.a> i1 = this.b;
      int j = i1.e;
      Object[] arrayOfObject = i1.d;
      for (byte b = 0; b < j; b++)
        arrayOfObject[b] = null; 
      i1.e = 0;
      i1.b = false;
    }
    
    public static final class a implements q {
      public <T extends p> T a(Class<T> param2Class) {
        return (T)new b.c();
      }
    }
  }
  
  public static final class a implements q {
    public <T extends p> T a(Class<T> param1Class) {
      return (T)new b.c();
    }
  }
}


/* Location:              C:\Users\panch\Downloads\dvba_v1.1.0-dex2jar.jar!\b\o\a\b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */