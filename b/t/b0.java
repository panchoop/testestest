package b.t;

import android.graphics.Matrix;
import android.util.Log;
import android.view.View;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class b0 {
  public static Method a;
  
  public static boolean b;
  
  public static Field c;
  
  public static boolean d;
  
  public abstract void a(View paramView);
  
  public abstract float b(View paramView);
  
  public abstract void c(View paramView);
  
  public void d(View paramView, int paramInt1, int paramInt2, int paramInt3, int paramInt4) {
    if (!b) {
      try {
        Method method1 = View.class.getDeclaredMethod("setFrame", new Class[] { int.class, int.class, int.class, int.class });
        a = method1;
        method1.setAccessible(true);
      } catch (NoSuchMethodException noSuchMethodException) {
        Log.i("ViewUtilsBase", "Failed to retrieve setFrame method", noSuchMethodException);
      } 
      b = true;
    } 
    Method method = a;
    if (method != null)
      try {
        method.invoke(paramView, new Object[] { Integer.valueOf(paramInt1), Integer.valueOf(paramInt2), Integer.valueOf(paramInt3), Integer.valueOf(paramInt4) });
      } catch (IllegalAccessException illegalAccessException) {
      
      } catch (InvocationTargetException invocationTargetException) {
        throw new RuntimeException(invocationTargetException.getCause());
      }  
  }
  
  public abstract void e(View paramView, float paramFloat);
  
  public void f(View paramView, int paramInt) {
    if (!d) {
      try {
        Field field1 = View.class.getDeclaredField("mViewFlags");
        c = field1;
        field1.setAccessible(true);
      } catch (NoSuchFieldException noSuchFieldException) {
        Log.i("ViewUtilsBase", "fetchViewFlagsField: ");
      } 
      d = true;
    } 
    Field field = c;
    if (field != null)
      try {
        int i = field.getInt(paramView);
        c.setInt(paramView, paramInt | i & 0xFFFFFFF3);
      } catch (IllegalAccessException illegalAccessException) {} 
  }
  
  public abstract void g(View paramView, Matrix paramMatrix);
  
  public abstract void h(View paramView, Matrix paramMatrix);
}


/* Location:              C:\Users\panch\Downloads\dvba_v1.1.0-dex2jar.jar!\b\t\b0.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */