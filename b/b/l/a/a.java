package b.b.l.a;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.Log;
import android.util.SparseArray;
import android.util.TypedValue;
import b.b.p.n0;
import java.util.WeakHashMap;
import org.xmlpull.v1.XmlPullParser;

@SuppressLint({"RestrictedAPI"})
public final class a {
  public static final ThreadLocal<TypedValue> a = new ThreadLocal<TypedValue>();
  
  public static final WeakHashMap<Context, SparseArray<a>> b = new WeakHashMap<Context, SparseArray<a>>(0);
  
  public static final Object c = new Object();
  
  public static ColorStateList a(Context paramContext, int paramInt) {
    if (Build.VERSION.SDK_INT >= 23)
      return paramContext.getColorStateList(paramInt); 
    synchronized (c) {
      SparseArray sparseArray = b.get(paramContext);
      Exception exception = null;
      if (sparseArray != null && sparseArray.size() > 0) {
        a a1 = (a)sparseArray.get(paramInt);
        if (a1 != null) {
          ColorStateList colorStateList;
          if (a1.b.equals(paramContext.getResources().getConfiguration())) {
            colorStateList = a1.a;
          } else {
            colorStateList.remove(paramInt);
            colorStateList = null;
          } 
          if (colorStateList != null)
            return colorStateList; 
          Resources resources = paramContext.getResources();
          null = a.get();
          object = null;
          if (null == null) {
            object = new TypedValue();
            a.set(object);
          } 
          boolean bool = true;
          resources.getValue(paramInt, (TypedValue)object, true);
          int i = ((TypedValue)object).type;
          if (i < 28 || i > 31)
            bool = false; 
          if (bool) {
            object = exception;
          } else {
            object = paramContext.getResources();
            null = object.getXml(paramInt);
            try {
              object = a.a.a.a.a.s((Resources)object, (XmlPullParser)null, paramContext.getTheme());
            } catch (Exception object) {
              Log.e("AppCompatResources", "Failed to inflate ColorStateList, leaving it to the framework", (Throwable)object);
              object = exception;
            } 
          } 
          if (object != null)
            synchronized (c) {
              null = b.get(paramContext);
              Object object1 = null;
              if (null == null) {
                object1 = new SparseArray();
                super();
                b.put(paramContext, object1);
              } 
              null = new a();
              super((ColorStateList)object, paramContext.getResources().getConfiguration());
              object1.append(paramInt, null);
              return (ColorStateList)object;
            }  
          return b.i.e.a.b(paramContext, paramInt);
        } 
      } 
      sparseArray = null;
    } 
  }
  
  public static Drawable b(Context paramContext, int paramInt) {
    return n0.d().f(paramContext, paramInt);
  }
  
  public static class a {
    public final ColorStateList a;
    
    public final Configuration b;
    
    public a(ColorStateList param1ColorStateList, Configuration param1Configuration) {
      this.a = param1ColorStateList;
      this.b = param1Configuration;
    }
  }
}


/* Location:              C:\Users\panch\Downloads\dvba_v1.1.0-dex2jar.jar!\b\b\l\a\a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */