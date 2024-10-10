package b.s;

import android.os.Bundle;
import androidx.savedstate.Recreator;
import b.n.d;
import b.n.f;
import b.n.h;
import java.util.Map;

public final class b {
  public final c a;
  
  public final a b;
  
  public b(c paramc) {
    this.a = paramc;
    this.b = new a();
  }
  
  public void a(Bundle paramBundle) {
    d d = this.a.a();
    if (((h)d).b == d.b.c) {
      d.a((f)new Recreator(this.a));
      a a1 = this.b;
      if (!a1.c) {
        if (paramBundle != null)
          a1.b = paramBundle.getBundle("androidx.lifecycle.BundlableSavedStateRegistry.key"); 
        d.a((f)new Object(a1));
        a1.c = true;
        return;
      } 
      throw new IllegalStateException("SavedStateRegistry was already restored.");
    } 
    throw new IllegalStateException("Restarter must be created only during owner's initialization stage");
  }
  
  public void b(Bundle paramBundle) {
    a a1 = this.b;
    if (a1 != null) {
      Bundle bundle1 = new Bundle();
      Bundle bundle2 = a1.b;
      if (bundle2 != null)
        bundle1.putAll(bundle2); 
      b.c.a.b.b.d d = a1.a.b();
      while (d.hasNext()) {
        Map.Entry entry = (Map.Entry)d.next();
        bundle1.putBundle((String)entry.getKey(), ((a.b)entry.getValue()).a());
      } 
      paramBundle.putBundle("androidx.lifecycle.BundlableSavedStateRegistry.key", bundle1);
      return;
    } 
    throw null;
  }
}


/* Location:              C:\Users\panch\Downloads\dvba_v1.1.0-dex2jar.jar!\b\s\b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */