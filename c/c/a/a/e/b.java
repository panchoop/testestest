package c.c.a.a.e;

import dalvik.system.PathClassLoader;

public final class b extends PathClassLoader {
  public b(String paramString, ClassLoader paramClassLoader) {
    super(paramString, paramClassLoader);
  }
  
  public final Class<?> loadClass(String paramString, boolean paramBoolean) {
    if (!paramString.startsWith("java.") && !paramString.startsWith("android."))
      try {
        return findClass(paramString);
      } catch (ClassNotFoundException classNotFoundException) {} 
    return super.loadClass(paramString, paramBoolean);
  }
}


/* Location:              C:\Users\panch\Downloads\dvba_v1.1.0-dex2jar.jar!\c\c\a\a\e\b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */