package b.i.f;

import android.content.ContentResolver;
import android.content.Context;
import android.content.res.AssetManager;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.graphics.fonts.FontVariationAxis;
import android.os.CancellationSignal;
import android.os.ParcelFileDescriptor;
import android.util.Log;
import b.i.e.b.c;
import b.i.e.b.d;
import b.i.j.b;
import c.a.a.a.a;
import java.io.IOException;
import java.lang.reflect.Array;
import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import java.nio.ByteBuffer;
import java.util.Map;

public class g extends e {
  public final Class<?> g;
  
  public final Constructor<?> h;
  
  public final Method i;
  
  public final Method j;
  
  public final Method k;
  
  public final Method l;
  
  public final Method m;
  
  public g() {
    ClassNotFoundException classNotFoundException1;
    ClassNotFoundException classNotFoundException2;
    ClassNotFoundException classNotFoundException3;
    ClassNotFoundException classNotFoundException4;
    ClassNotFoundException classNotFoundException5;
    ClassNotFoundException classNotFoundException6;
    ClassNotFoundException classNotFoundException7 = null;
    try {
      Class<?> clazz = Class.forName("android.graphics.FontFamily");
      Constructor<?> constructor = clazz.getConstructor(new Class[0]);
      Method method2 = o(clazz);
      Method method3 = p(clazz);
      Method method5 = clazz.getMethod("freeze", new Class[0]);
      Method method1 = clazz.getMethod("abortCreation", new Class[0]);
      Method method4 = q(clazz);
    } catch (ClassNotFoundException classNotFoundException8) {
      StringBuilder stringBuilder = a.e("Unable to collect necessary methods for class ");
      stringBuilder.append(classNotFoundException8.getClass().getName());
      Log.e("TypefaceCompatApi26Impl", stringBuilder.toString(), classNotFoundException8);
      ClassNotFoundException classNotFoundException9 = null;
      classNotFoundException5 = null;
      classNotFoundException8 = classNotFoundException5;
      classNotFoundException1 = classNotFoundException8;
      classNotFoundException2 = classNotFoundException1;
      classNotFoundException6 = classNotFoundException2;
      classNotFoundException4 = classNotFoundException2;
      classNotFoundException3 = classNotFoundException1;
      classNotFoundException2 = classNotFoundException8;
      classNotFoundException1 = classNotFoundException5;
      classNotFoundException5 = classNotFoundException9;
      classNotFoundException8 = classNotFoundException7;
    } catch (NoSuchMethodException noSuchMethodException) {}
    this.g = (Class<?>)noSuchMethodException;
    this.h = (Constructor<?>)classNotFoundException2;
    this.i = (Method)classNotFoundException3;
    this.j = (Method)classNotFoundException4;
    this.k = (Method)classNotFoundException6;
    this.l = (Method)classNotFoundException1;
    this.m = (Method)classNotFoundException5;
  }
  
  private Object n() {
    try {
      return this.h.newInstance(new Object[0]);
    } catch (IllegalAccessException|InstantiationException|java.lang.reflect.InvocationTargetException illegalAccessException) {
      return null;
    } 
  }
  
  public Typeface a(Context paramContext, c paramc, Resources paramResources, int paramInt) {
    if (!m())
      return super.a(paramContext, paramc, paramResources, paramInt); 
    Object object = n();
    if (object == null)
      return null; 
    d[] arrayOfD = paramc.a;
    int i = arrayOfD.length;
    for (paramInt = 0; paramInt < i; paramInt++) {
      d d = arrayOfD[paramInt];
      if (!j(paramContext, object, d.a, d.e, d.b, d.c, FontVariationAxis.fromFontVariationSettings(d.d))) {
        i(object);
        return null;
      } 
    } 
    return !l(object) ? null : k(object);
  }
  
  public Typeface b(Context paramContext, CancellationSignal paramCancellationSignal, b.f[] paramArrayOff, int paramInt) {
    b.f f1;
    if (paramArrayOff.length < 1)
      return null; 
    if (!m()) {
      f1 = f(paramArrayOff, paramInt);
      ContentResolver contentResolver = paramContext.getContentResolver();
      try {
        ParcelFileDescriptor parcelFileDescriptor = contentResolver.openFileDescriptor(f1.a, "r", paramCancellationSignal);
        if (parcelFileDescriptor == null) {
          if (parcelFileDescriptor != null)
            parcelFileDescriptor.close(); 
          return null;
        } 
        try {
          Typeface.Builder builder = new Typeface.Builder();
          this(parcelFileDescriptor.getFileDescriptor());
          return builder.setWeight(f1.c).setItalic(f1.d).build();
        } finally {
          try {
            parcelFileDescriptor.close();
          } finally {
            parcelFileDescriptor = null;
          } 
        } 
      } catch (IOException iOException) {
        return null;
      } 
    } 
    Map map = b.d((Context)iOException, (b.f[])f1, paramCancellationSignal);
    Object object = n();
    if (object == null)
      return null; 
    int i = f1.length;
    byte b = 0;
    boolean bool = false;
    while (b < i) {
      b.f f2 = f1[b];
      ByteBuffer byteBuffer = (ByteBuffer)map.get(f2.a);
      if (byteBuffer != null) {
        boolean bool1;
        int k = f2.b;
        int j = f2.c;
        bool = f2.d;
        try {
          bool1 = ((Boolean)this.j.invoke(object, new Object[] { byteBuffer, Integer.valueOf(k), null, Integer.valueOf(j), Integer.valueOf(bool) })).booleanValue();
        } catch (IllegalAccessException|java.lang.reflect.InvocationTargetException illegalAccessException) {
          bool1 = false;
        } 
        if (!bool1) {
          i(object);
          return null;
        } 
        bool = true;
      } 
      b++;
    } 
    if (!bool) {
      i(object);
      return null;
    } 
    if (!l(object))
      return null; 
    Typeface typeface = k(object);
    return (typeface == null) ? null : Typeface.create(typeface, paramInt);
  }
  
  public Typeface d(Context paramContext, Resources paramResources, int paramInt1, String paramString, int paramInt2) {
    if (!m())
      return super.d(paramContext, paramResources, paramInt1, paramString, paramInt2); 
    Object object = n();
    if (object == null)
      return null; 
    if (!j(paramContext, object, paramString, 0, -1, -1, null)) {
      i(object);
      return null;
    } 
    return !l(object) ? null : k(object);
  }
  
  public final void i(Object paramObject) {
    try {
      this.l.invoke(paramObject, new Object[0]);
    } catch (IllegalAccessException|java.lang.reflect.InvocationTargetException illegalAccessException) {}
  }
  
  public final boolean j(Context paramContext, Object paramObject, String paramString, int paramInt1, int paramInt2, int paramInt3, FontVariationAxis[] paramArrayOfFontVariationAxis) {
    try {
      return ((Boolean)this.i.invoke(paramObject, new Object[] { paramContext.getAssets(), paramString, Integer.valueOf(0), Boolean.FALSE, Integer.valueOf(paramInt1), Integer.valueOf(paramInt2), Integer.valueOf(paramInt3), paramArrayOfFontVariationAxis })).booleanValue();
    } catch (IllegalAccessException|java.lang.reflect.InvocationTargetException illegalAccessException) {
      return false;
    } 
  }
  
  public Typeface k(Object paramObject) {
    try {
      Object object = Array.newInstance(this.g, 1);
      Array.set(object, 0, paramObject);
      return (Typeface)this.m.invoke((Object)null, new Object[] { object, Integer.valueOf(-1), Integer.valueOf(-1) });
    } catch (IllegalAccessException|java.lang.reflect.InvocationTargetException illegalAccessException) {
      return null;
    } 
  }
  
  public final boolean l(Object paramObject) {
    try {
      return ((Boolean)this.k.invoke(paramObject, new Object[0])).booleanValue();
    } catch (IllegalAccessException|java.lang.reflect.InvocationTargetException illegalAccessException) {
      return false;
    } 
  }
  
  public final boolean m() {
    boolean bool;
    if (this.i == null)
      Log.w("TypefaceCompatApi26Impl", "Unable to collect necessary private methods. Fallback to legacy implementation."); 
    if (this.i != null) {
      bool = true;
    } else {
      bool = false;
    } 
    return bool;
  }
  
  public Method o(Class<?> paramClass) {
    Class<int> clazz2 = int.class;
    Class<boolean> clazz = boolean.class;
    Class<int> clazz1 = int.class;
    return paramClass.getMethod("addFontFromAssetManager", new Class[] { AssetManager.class, String.class, clazz2, clazz, clazz1, clazz1, clazz1, FontVariationAxis[].class });
  }
  
  public Method p(Class<?> paramClass) {
    Class<int> clazz = int.class;
    return paramClass.getMethod("addFontFromBuffer", new Class[] { ByteBuffer.class, clazz, FontVariationAxis[].class, clazz, clazz });
  }
  
  public Method q(Class<?> paramClass) {
    paramClass = Array.newInstance(paramClass, 1).getClass();
    Class<int> clazz = int.class;
    Method method = Typeface.class.getDeclaredMethod("createFromFamiliesWithDefault", new Class[] { paramClass, clazz, clazz });
    method.setAccessible(true);
    return method;
  }
}


/* Location:              C:\Users\panch\Downloads\dvba_v1.1.0-dex2jar.jar!\b\i\f\g.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */