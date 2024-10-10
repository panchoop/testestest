package c.c.a.a.d;

import android.os.IBinder;
import java.lang.reflect.Field;

public final class b<T> extends a.a {
  public final T a;
  
  public b(T paramT) {
    this.a = paramT;
  }
  
  public static <T> T t(a parama) {
    Field field;
    if (parama instanceof b)
      return ((b)parama).a; 
    IBinder iBinder = parama.asBinder();
    Field[] arrayOfField = iBinder.getClass().getDeclaredFields();
    parama = null;
    int k = arrayOfField.length;
    int i = 0;
    int j;
    for (j = 0; i < k; j = m) {
      Field field1 = arrayOfField[i];
      int m = j;
      if (!field1.isSynthetic()) {
        m = j + 1;
        field = field1;
      } 
      i++;
    } 
    if (j == 1) {
      if (!field.isAccessible()) {
        field.setAccessible(true);
        try {
          return (T)field.get(iBinder);
        } catch (NullPointerException nullPointerException) {
          throw new IllegalArgumentException("Binder object is null.", nullPointerException);
        } catch (IllegalAccessException illegalAccessException) {
          throw new IllegalArgumentException("Could not access the field in remoteBinder.", illegalAccessException);
        } 
      } 
      throw new IllegalArgumentException("IObjectWrapper declared field not private!");
    } 
    i = arrayOfField.length;
    StringBuilder stringBuilder = new StringBuilder(64);
    stringBuilder.append("Unexpected number of IObjectWrapper declared fields: ");
    stringBuilder.append(i);
    throw new IllegalArgumentException(stringBuilder.toString());
  }
}


/* Location:              C:\Users\panch\Downloads\dvba_v1.1.0-dex2jar.jar!\c\c\a\a\d\b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */