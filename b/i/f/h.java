package b.i.f;

import android.graphics.Typeface;
import java.lang.reflect.Array;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class h extends g {
  public Typeface k(Object paramObject) {
    try {
      Object object = Array.newInstance(this.g, 1);
      Array.set(object, 0, paramObject);
      return (Typeface)this.m.invoke((Object)null, new Object[] { object, "sans-serif", Integer.valueOf(-1), Integer.valueOf(-1) });
    } catch (IllegalAccessException illegalAccessException) {
    
    } catch (InvocationTargetException invocationTargetException) {}
    throw new RuntimeException(invocationTargetException);
  }
  
  public Method q(Class<?> paramClass) {
    Class<?> clazz = Array.newInstance(paramClass, 1).getClass();
    paramClass = int.class;
    Method method = Typeface.class.getDeclaredMethod("createFromFamiliesWithDefault", new Class[] { clazz, String.class, paramClass, paramClass });
    method.setAccessible(true);
    return method;
  }
}


/* Location:              C:\Users\panch\Downloads\dvba_v1.1.0-dex2jar.jar!\b\i\f\h.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */