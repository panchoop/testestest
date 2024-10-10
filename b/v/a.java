package b.v;

import android.os.Parcelable;
import android.text.TextUtils;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public abstract class a {
  public final b.f.a<String, Method> a;
  
  public final b.f.a<String, Method> b;
  
  public final b.f.a<String, Class> c;
  
  public a(b.f.a<String, Method> parama1, b.f.a<String, Method> parama2, b.f.a<String, Class> parama) {
    this.a = parama1;
    this.b = parama2;
    this.c = parama;
  }
  
  public abstract void a();
  
  public abstract a b();
  
  public final Class c(Class<? extends c> paramClass) {
    Class<?> clazz2 = (Class)this.c.getOrDefault(paramClass.getName(), null);
    Class<?> clazz1 = clazz2;
    if (clazz2 == null) {
      clazz1 = Class.forName(String.format("%s.%sParcelizer", new Object[] { paramClass.getPackage().getName(), paramClass.getSimpleName() }), false, paramClass.getClassLoader());
      this.c.put(paramClass.getName(), clazz1);
    } 
    return clazz1;
  }
  
  public final Method d(String paramString) {
    Method method2 = (Method)this.a.getOrDefault(paramString, null);
    Method method1 = method2;
    if (method2 == null) {
      System.currentTimeMillis();
      method1 = Class.forName(paramString, true, a.class.getClassLoader()).getDeclaredMethod("read", new Class[] { a.class });
      this.a.put(paramString, method1);
    } 
    return method1;
  }
  
  public final Method e(Class<? extends c> paramClass) {
    Method method2 = (Method)this.b.getOrDefault(paramClass.getName(), null);
    Method method1 = method2;
    if (method2 == null) {
      Class clazz = c(paramClass);
      System.currentTimeMillis();
      method1 = clazz.getDeclaredMethod("write", new Class[] { paramClass, a.class });
      this.b.put(paramClass.getName(), method1);
    } 
    return method1;
  }
  
  public boolean f(boolean paramBoolean, int paramInt) {
    if (!h(paramInt))
      return paramBoolean; 
    if (((b)this).e.readInt() != 0) {
      paramBoolean = true;
    } else {
      paramBoolean = false;
    } 
    return paramBoolean;
  }
  
  public CharSequence g(CharSequence paramCharSequence, int paramInt) {
    if (!h(paramInt))
      return paramCharSequence; 
    b b = (b)this;
    return (CharSequence)TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(b.e);
  }
  
  public abstract boolean h(int paramInt);
  
  public int i(int paramInt1, int paramInt2) {
    return !h(paramInt2) ? paramInt1 : ((b)this).e.readInt();
  }
  
  public <T extends Parcelable> T j(T paramT, int paramInt) {
    return (T)(!h(paramInt) ? (Object)paramT : ((b)this).e.readParcelable(b.class.getClassLoader()));
  }
  
  public <T extends c> T k() {
    String str = ((b)this).e.readString();
    if (str == null)
      return null; 
    a a1 = b();
    try {
      return (T)d(str).invoke(null, new Object[] { a1 });
    } catch (IllegalAccessException illegalAccessException) {
      throw new RuntimeException("VersionedParcel encountered IllegalAccessException", illegalAccessException);
    } catch (InvocationTargetException invocationTargetException) {
      if (invocationTargetException.getCause() instanceof RuntimeException)
        throw (RuntimeException)invocationTargetException.getCause(); 
      throw new RuntimeException("VersionedParcel encountered InvocationTargetException", invocationTargetException);
    } catch (NoSuchMethodException noSuchMethodException) {
      throw new RuntimeException("VersionedParcel encountered NoSuchMethodException", noSuchMethodException);
    } catch (ClassNotFoundException classNotFoundException) {
      throw new RuntimeException("VersionedParcel encountered ClassNotFoundException", classNotFoundException);
    } 
  }
  
  public abstract void l(int paramInt);
  
  public void m(int paramInt1, int paramInt2) {
    l(paramInt2);
    ((b)this).e.writeInt(paramInt1);
  }
  
  public void n(Parcelable paramParcelable, int paramInt) {
    l(paramInt);
    ((b)this).e.writeParcelable(paramParcelable, 0);
  }
  
  public void o(c paramc) {
    if (paramc == null) {
      ((b)this).e.writeString(null);
      return;
    } 
    try {
      Class clazz = c((Class)paramc.getClass());
      String str = clazz.getName();
      ((b)this).e.writeString(str);
      a a1 = b();
      try {
        e(paramc.getClass()).invoke(null, new Object[] { paramc, a1 });
        a1.a();
        return;
      } catch (IllegalAccessException illegalAccessException) {
        throw new RuntimeException("VersionedParcel encountered IllegalAccessException", illegalAccessException);
      } catch (InvocationTargetException invocationTargetException) {
        if (invocationTargetException.getCause() instanceof RuntimeException)
          throw (RuntimeException)invocationTargetException.getCause(); 
        throw new RuntimeException("VersionedParcel encountered InvocationTargetException", invocationTargetException);
      } catch (NoSuchMethodException noSuchMethodException) {
        throw new RuntimeException("VersionedParcel encountered NoSuchMethodException", noSuchMethodException);
      } catch (ClassNotFoundException classNotFoundException) {
        throw new RuntimeException("VersionedParcel encountered ClassNotFoundException", classNotFoundException);
      } 
    } catch (ClassNotFoundException classNotFoundException1) {
      StringBuilder stringBuilder = new StringBuilder();
      stringBuilder.append(classNotFoundException.getClass().getSimpleName());
      stringBuilder.append(" does not have a Parcelizer");
      throw new RuntimeException(stringBuilder.toString(), classNotFoundException1);
    } 
  }
}


/* Location:              C:\Users\panch\Downloads\dvba_v1.1.0-dex2jar.jar!\b\v\a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */