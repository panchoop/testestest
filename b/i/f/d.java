package b.i.f;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.os.Handler;
import b.f.f;
import b.i.e.b.b;
import b.i.e.b.c;
import b.i.e.b.e;
import b.i.e.b.g;
import b.i.j.b;

@SuppressLint({"NewApi"})
public class d {
  public static final j a;
  
  public static final f<String, Typeface> b;
  
  static {
    // Byte code:
    //   0: getstatic android/os/Build$VERSION.SDK_INT : I
    //   3: istore_0
    //   4: iload_0
    //   5: bipush #29
    //   7: if_icmplt -> 21
    //   10: new b/i/f/i
    //   13: dup
    //   14: invokespecial <init> : ()V
    //   17: astore_1
    //   18: goto -> 111
    //   21: iload_0
    //   22: bipush #28
    //   24: if_icmplt -> 38
    //   27: new b/i/f/h
    //   30: dup
    //   31: invokespecial <init> : ()V
    //   34: astore_1
    //   35: goto -> 111
    //   38: iload_0
    //   39: bipush #26
    //   41: if_icmplt -> 55
    //   44: new b/i/f/g
    //   47: dup
    //   48: invokespecial <init> : ()V
    //   51: astore_1
    //   52: goto -> 111
    //   55: iload_0
    //   56: bipush #24
    //   58: if_icmplt -> 103
    //   61: getstatic b/i/f/f.d : Ljava/lang/reflect/Method;
    //   64: ifnonnull -> 75
    //   67: ldc 'TypefaceCompatApi24Impl'
    //   69: ldc 'Unable to collect necessary private methods.Fallback to legacy implementation.'
    //   71: invokestatic w : (Ljava/lang/String;Ljava/lang/String;)I
    //   74: pop
    //   75: getstatic b/i/f/f.d : Ljava/lang/reflect/Method;
    //   78: ifnull -> 86
    //   81: iconst_1
    //   82: istore_0
    //   83: goto -> 88
    //   86: iconst_0
    //   87: istore_0
    //   88: iload_0
    //   89: ifeq -> 103
    //   92: new b/i/f/f
    //   95: dup
    //   96: invokespecial <init> : ()V
    //   99: astore_1
    //   100: goto -> 111
    //   103: new b/i/f/e
    //   106: dup
    //   107: invokespecial <init> : ()V
    //   110: astore_1
    //   111: aload_1
    //   112: putstatic b/i/f/d.a : Lb/i/f/j;
    //   115: new b/f/f
    //   118: dup
    //   119: bipush #16
    //   121: invokespecial <init> : (I)V
    //   124: putstatic b/i/f/d.b : Lb/f/f;
    //   127: return
  }
  
  public static Typeface a(Context paramContext, Typeface paramTypeface, int paramInt) {
    if (paramContext != null)
      return Typeface.create(paramTypeface, paramInt); 
    throw new IllegalArgumentException("Context cannot be null");
  }
  
  public static Typeface b(Context paramContext, b paramb, Resources paramResources, int paramInt1, int paramInt2, g paramg, Handler paramHandler, boolean paramBoolean) {
    Typeface typeface;
    e e;
    if (paramb instanceof e) {
      byte b1;
      boolean bool;
      e = (e)paramb;
      if (paramBoolean ? (e.c == 0) : (paramg == null)) {
        bool = true;
      } else {
        bool = false;
      } 
      if (paramBoolean) {
        b1 = e.b;
      } else {
        b1 = -1;
      } 
      typeface = b.c(paramContext, e.a, paramg, paramHandler, bool, b1, paramInt2);
    } else {
      Typeface typeface1 = a.a((Context)typeface, (c)e, paramResources, paramInt2);
      typeface = typeface1;
      if (paramg != null)
        if (typeface1 != null) {
          paramg.b(typeface1, paramHandler);
          typeface = typeface1;
        } else {
          paramg.a(-3, paramHandler);
          typeface = typeface1;
        }  
    } 
    if (typeface != null)
      b.b(d(paramResources, paramInt1, paramInt2), typeface); 
    return typeface;
  }
  
  public static Typeface c(Context paramContext, Resources paramResources, int paramInt1, String paramString, int paramInt2) {
    Typeface typeface = a.d(paramContext, paramResources, paramInt1, paramString, paramInt2);
    if (typeface != null) {
      String str = d(paramResources, paramInt1, paramInt2);
      b.b(str, typeface);
    } 
    return typeface;
  }
  
  public static String d(Resources paramResources, int paramInt1, int paramInt2) {
    StringBuilder stringBuilder = new StringBuilder();
    stringBuilder.append(paramResources.getResourcePackageName(paramInt1));
    stringBuilder.append("-");
    stringBuilder.append(paramInt1);
    stringBuilder.append("-");
    stringBuilder.append(paramInt2);
    return stringBuilder.toString();
  }
}


/* Location:              C:\Users\panch\Downloads\dvba_v1.1.0-dex2jar.jar!\b\i\f\d.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */