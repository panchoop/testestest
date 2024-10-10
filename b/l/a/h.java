package b.l.a;

import androidx.fragment.app.Fragment;
import java.lang.reflect.InvocationTargetException;

public class h {
  public static final b.f.h<String, Class<?>> a = new b.f.h();
  
  public static boolean b(ClassLoader paramClassLoader, String paramString) {
    try {
      return Fragment.class.isAssignableFrom(c(paramClassLoader, paramString));
    } catch (ClassNotFoundException classNotFoundException) {
      return false;
    } 
  }
  
  public static Class<?> c(ClassLoader paramClassLoader, String paramString) {
    Class<?> clazz2 = (Class)a.getOrDefault(paramString, null);
    Class<?> clazz1 = clazz2;
    if (clazz2 == null) {
      clazz1 = Class.forName(paramString, false, paramClassLoader);
      a.put(paramString, clazz1);
    } 
    return clazz1;
  }
  
  public static Class<? extends Fragment> d(ClassLoader paramClassLoader, String paramString) {
    try {
      return (Class)c(paramClassLoader, paramString);
    } catch (ClassNotFoundException classNotFoundException) {
      StringBuilder stringBuilder = new StringBuilder();
      stringBuilder.append("Unable to instantiate fragment ");
      stringBuilder.append(paramString);
      stringBuilder.append(": make sure class name exists");
      throw new Fragment.c(stringBuilder.toString(), classNotFoundException);
    } catch (ClassCastException classCastException) {
      StringBuilder stringBuilder = new StringBuilder();
      stringBuilder.append("Unable to instantiate fragment ");
      stringBuilder.append(paramString);
      stringBuilder.append(": make sure class is a valid subclass of Fragment");
      throw new Fragment.c(stringBuilder.toString(), classCastException);
    } 
  }
  
  public Fragment a(ClassLoader paramClassLoader, String paramString) {
    try {
      return d(paramClassLoader, paramString).getConstructor(new Class[0]).newInstance(new Object[0]);
    } catch (InstantiationException instantiationException) {
      StringBuilder stringBuilder = new StringBuilder();
      stringBuilder.append("Unable to instantiate fragment ");
      stringBuilder.append(paramString);
      stringBuilder.append(": make sure class name exists, is public, and has an empty constructor that is public");
      throw new Fragment.c(stringBuilder.toString(), instantiationException);
    } catch (IllegalAccessException illegalAccessException) {
      StringBuilder stringBuilder = new StringBuilder();
      stringBuilder.append("Unable to instantiate fragment ");
      stringBuilder.append(paramString);
      stringBuilder.append(": make sure class name exists, is public, and has an empty constructor that is public");
      throw new Fragment.c(stringBuilder.toString(), illegalAccessException);
    } catch (NoSuchMethodException noSuchMethodException) {
      StringBuilder stringBuilder = new StringBuilder();
      stringBuilder.append("Unable to instantiate fragment ");
      stringBuilder.append(paramString);
      stringBuilder.append(": could not find Fragment constructor");
      throw new Fragment.c(stringBuilder.toString(), noSuchMethodException);
    } catch (InvocationTargetException invocationTargetException) {
      StringBuilder stringBuilder = new StringBuilder();
      stringBuilder.append("Unable to instantiate fragment ");
      stringBuilder.append(paramString);
      stringBuilder.append(": calling Fragment constructor caused an exception");
      throw new Fragment.c(stringBuilder.toString(), invocationTargetException);
    } 
  }
}


/* Location:              C:\Users\panch\Downloads\dvba_v1.1.0-dex2jar.jar!\b\l\a\h.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */