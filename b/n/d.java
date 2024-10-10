package b.n;

import java.util.concurrent.atomic.AtomicReference;

public abstract class d {
  public d() {
    new AtomicReference();
  }
  
  public abstract void a(f paramf);
  
  public enum a {
    ON_ANY, ON_CREATE, ON_DESTROY, ON_PAUSE, ON_RESUME, ON_START, ON_STOP;
    
    public static final a[] $VALUES;
    
    static {
      ON_PAUSE = new a("ON_PAUSE", 3);
      ON_STOP = new a("ON_STOP", 4);
      ON_DESTROY = new a("ON_DESTROY", 5);
      a a1 = new a("ON_ANY", 6);
      ON_ANY = a1;
      $VALUES = new a[] { ON_CREATE, ON_START, ON_RESUME, ON_PAUSE, ON_STOP, ON_DESTROY, a1 };
    }
  }
  
  public enum b {
    b, c, d, e, f;
    
    public static final b[] g;
    
    static {
      b b1 = new b("RESUMED", 4);
      f = b1;
      g = new b[] { b, c, d, e, b1 };
    }
  }
}


/* Location:              C:\Users\panch\Downloads\dvba_v1.1.0-dex2jar.jar!\b\n\d.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */