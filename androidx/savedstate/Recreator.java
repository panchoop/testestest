package androidx.savedstate;

import android.annotation.SuppressLint;
import android.os.Bundle;
import b.n.d;
import b.n.e;
import b.n.g;
import b.n.h;
import b.s.a;
import b.s.c;
import c.a.a.a.a;
import java.lang.reflect.Constructor;
import java.util.ArrayList;
import java.util.Iterator;

@SuppressLint({"RestrictedApi"})
public final class Recreator implements e {
  public final c a;
  
  public Recreator(c paramc) {
    this.a = paramc;
  }
  
  public void g(g paramg, d.a parama) {
    if (parama == d.a.ON_CREATE) {
      ((h)paramg.a()).a.d(this);
      a a1 = this.a.e();
      if (a1.c) {
        Bundle bundle1;
        Bundle bundle2 = a1.b;
        paramg = null;
        if (bundle2 != null) {
          bundle1 = bundle2.getBundle("androidx.savedstate.Restarter");
          a1.b.remove("androidx.savedstate.Restarter");
          if (a1.b.isEmpty())
            a1.b = null; 
        } 
        if (bundle1 == null)
          return; 
        ArrayList arrayList = bundle1.getStringArrayList("classes_to_restore");
        if (arrayList != null) {
          Iterator<String> iterator = arrayList.iterator();
          while (iterator.hasNext()) {
            String str = iterator.next();
            try {
              Class<? extends a.a> clazz = Class.forName(str, false, Recreator.class.getClassLoader()).asSubclass(a.a.class);
              try {
                Constructor<? extends a.a> constructor = clazz.getDeclaredConstructor(new Class[0]);
                constructor.setAccessible(true);
                try {
                  a.a a2 = constructor.newInstance(new Object[0]);
                  a2.a(this.a);
                } catch (Exception exception) {
                  throw new RuntimeException(a.c("Failed to instantiate ", str), exception);
                } 
              } catch (NoSuchMethodException noSuchMethodException) {
                StringBuilder stringBuilder = a.e("Class");
                stringBuilder.append(exception.getSimpleName());
                stringBuilder.append(" must have default constructor in order to be automatically recreated");
                throw new IllegalStateException(stringBuilder.toString(), noSuchMethodException);
              } 
            } catch (ClassNotFoundException classNotFoundException) {
              StringBuilder stringBuilder = new StringBuilder();
              stringBuilder.append("Class ");
              stringBuilder.append((String)noSuchMethodException);
              stringBuilder.append(" wasn't found");
              throw new RuntimeException(stringBuilder.toString(), classNotFoundException);
            } 
          } 
          return;
        } 
        throw new IllegalStateException("Bundle with restored state for the component \"androidx.savedstate.Restarter\" must contain list of strings by the key \"classes_to_restore\"");
      } 
      throw new IllegalStateException("You can consumeRestoredStateForKey only after super.onCreate of corresponding component");
    } 
    throw new AssertionError("Next event must be ON_CREATE");
  }
}


/* Location:              C:\Users\panch\Downloads\dvba_v1.1.0-dex2jar.jar!\androidx\savedstate\Recreator.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */