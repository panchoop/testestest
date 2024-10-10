package androidx.core.graphics.drawable;

import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.BitmapShader;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.Shader;
import android.graphics.drawable.Icon;
import android.net.Uri;
import android.os.Build;
import android.os.Parcelable;
import android.util.Log;
import androidx.versionedparcelable.CustomVersionedParcelable;
import java.lang.reflect.InvocationTargetException;

public class IconCompat extends CustomVersionedParcelable {
  public static final PorterDuff.Mode j = PorterDuff.Mode.SRC_IN;
  
  public int a = -1;
  
  public Object b;
  
  public byte[] c = null;
  
  public Parcelable d = null;
  
  public int e = 0;
  
  public int f = 0;
  
  public ColorStateList g = null;
  
  public PorterDuff.Mode h = j;
  
  public String i = null;
  
  public IconCompat() {}
  
  public IconCompat(int paramInt) {
    this.a = paramInt;
  }
  
  public static Bitmap a(Bitmap paramBitmap, boolean paramBoolean) {
    int i = (int)(Math.min(paramBitmap.getWidth(), paramBitmap.getHeight()) * 0.6666667F);
    Bitmap bitmap = Bitmap.createBitmap(i, i, Bitmap.Config.ARGB_8888);
    Canvas canvas = new Canvas(bitmap);
    Paint paint = new Paint(3);
    float f1 = i;
    float f2 = 0.5F * f1;
    float f3 = 0.9166667F * f2;
    if (paramBoolean) {
      float f = 0.010416667F * f1;
      paint.setColor(0);
      paint.setShadowLayer(f, 0.0F, f1 * 0.020833334F, 1023410176);
      canvas.drawCircle(f2, f2, f3, paint);
      paint.setShadowLayer(f, 0.0F, 0.0F, 503316480);
      canvas.drawCircle(f2, f2, f3, paint);
      paint.clearShadowLayer();
    } 
    paint.setColor(-16777216);
    Shader.TileMode tileMode = Shader.TileMode.CLAMP;
    BitmapShader bitmapShader = new BitmapShader(paramBitmap, tileMode, tileMode);
    Matrix matrix = new Matrix();
    matrix.setTranslate((-(paramBitmap.getWidth() - i) / 2), (-(paramBitmap.getHeight() - i) / 2));
    bitmapShader.setLocalMatrix(matrix);
    paint.setShader((Shader)bitmapShader);
    canvas.drawCircle(f2, f2, f3, paint);
    canvas.setBitmap(null);
    return bitmap;
  }
  
  public static IconCompat b(Resources paramResources, String paramString, int paramInt) {
    if (paramInt != 0) {
      IconCompat iconCompat = new IconCompat(2);
      iconCompat.e = paramInt;
      iconCompat.b = paramString;
      return iconCompat;
    } 
    throw new IllegalArgumentException("Drawable resource ID must not be 0");
  }
  
  public int c() {
    if (this.a == -1) {
      int i = Build.VERSION.SDK_INT;
      if (i >= 23) {
        Icon icon = (Icon)this.b;
        if (i >= 28) {
          i = icon.getResId();
        } else {
          boolean bool = false;
          try {
            i = ((Integer)icon.getClass().getMethod("getResId", new Class[0]).invoke(icon, new Object[0])).intValue();
          } catch (IllegalAccessException illegalAccessException) {
            Log.e("IconCompat", "Unable to get icon resource", illegalAccessException);
            i = bool;
          } catch (InvocationTargetException invocationTargetException) {
          
          } catch (NoSuchMethodException noSuchMethodException) {}
        } 
        return i;
      } 
    } 
    if (this.a == 2)
      return this.e; 
    StringBuilder stringBuilder = new StringBuilder();
    stringBuilder.append("called getResId() on ");
    stringBuilder.append(this);
    throw new IllegalStateException(stringBuilder.toString());
  }
  
  public String d() {
    if (this.a == -1) {
      int i = Build.VERSION.SDK_INT;
      if (i >= 23) {
        String str;
        Icon icon = (Icon)this.b;
        if (i >= 28) {
          str = icon.getResPackage();
        } else {
          IllegalAccessException illegalAccessException = null;
          try {
            str = (String)str.getClass().getMethod("getResPackage", new Class[0]).invoke(str, new Object[0]);
          } catch (IllegalAccessException illegalAccessException1) {
            Log.e("IconCompat", "Unable to get icon package", illegalAccessException1);
            illegalAccessException1 = illegalAccessException;
          } catch (InvocationTargetException invocationTargetException) {
          
          } catch (NoSuchMethodException noSuchMethodException) {}
        } 
        return (String)noSuchMethodException;
      } 
    } 
    if (this.a == 2)
      return ((String)this.b).split(":", -1)[0]; 
    StringBuilder stringBuilder = new StringBuilder();
    stringBuilder.append("called getResPackage() on ");
    stringBuilder.append(this);
    throw new IllegalStateException(stringBuilder.toString());
  }
  
  public Uri e() {
    if (this.a == -1) {
      int j = Build.VERSION.SDK_INT;
      if (j >= 23) {
        Uri uri;
        Icon icon = (Icon)this.b;
        if (j >= 28) {
          uri = icon.getUri();
        } else {
          IllegalAccessException illegalAccessException = null;
          try {
            uri = (Uri)uri.getClass().getMethod("getUri", new Class[0]).invoke(uri, new Object[0]);
          } catch (IllegalAccessException illegalAccessException1) {
            Log.e("IconCompat", "Unable to get icon uri", illegalAccessException1);
            illegalAccessException1 = illegalAccessException;
          } catch (InvocationTargetException invocationTargetException) {
          
          } catch (NoSuchMethodException noSuchMethodException) {}
        } 
        return (Uri)noSuchMethodException;
      } 
    } 
    int i = this.a;
    if (i == 4 || i == 6)
      return Uri.parse((String)this.b); 
    StringBuilder stringBuilder = new StringBuilder();
    stringBuilder.append("called getUri() on ");
    stringBuilder.append(this);
    throw new IllegalStateException(stringBuilder.toString());
  }
  
  @Deprecated
  public Icon f() {
    // Byte code:
    //   0: aload_0
    //   1: getfield a : I
    //   4: tableswitch default -> 52, -1 -> 230, 0 -> 52, 1 -> 177, 2 -> 162, 3 -> 140, 4 -> 126, 5 -> 89, 6 -> 62
    //   52: new java/lang/IllegalArgumentException
    //   55: dup
    //   56: ldc 'Unknown type'
    //   58: invokespecial <init> : (Ljava/lang/String;)V
    //   61: athrow
    //   62: ldc 'Context is required to resolve the file uri of the icon: '
    //   64: invokestatic e : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   67: astore_1
    //   68: aload_1
    //   69: aload_0
    //   70: invokevirtual e : ()Landroid/net/Uri;
    //   73: invokevirtual append : (Ljava/lang/Object;)Ljava/lang/StringBuilder;
    //   76: pop
    //   77: new java/lang/IllegalArgumentException
    //   80: dup
    //   81: aload_1
    //   82: invokevirtual toString : ()Ljava/lang/String;
    //   85: invokespecial <init> : (Ljava/lang/String;)V
    //   88: athrow
    //   89: getstatic android/os/Build$VERSION.SDK_INT : I
    //   92: bipush #26
    //   94: if_icmplt -> 111
    //   97: aload_0
    //   98: getfield b : Ljava/lang/Object;
    //   101: checkcast android/graphics/Bitmap
    //   104: invokestatic createWithAdaptiveBitmap : (Landroid/graphics/Bitmap;)Landroid/graphics/drawable/Icon;
    //   107: astore_1
    //   108: goto -> 190
    //   111: aload_0
    //   112: getfield b : Ljava/lang/Object;
    //   115: checkcast android/graphics/Bitmap
    //   118: iconst_0
    //   119: invokestatic a : (Landroid/graphics/Bitmap;Z)Landroid/graphics/Bitmap;
    //   122: astore_1
    //   123: goto -> 185
    //   126: aload_0
    //   127: getfield b : Ljava/lang/Object;
    //   130: checkcast java/lang/String
    //   133: invokestatic createWithContentUri : (Ljava/lang/String;)Landroid/graphics/drawable/Icon;
    //   136: astore_1
    //   137: goto -> 190
    //   140: aload_0
    //   141: getfield b : Ljava/lang/Object;
    //   144: checkcast [B
    //   147: aload_0
    //   148: getfield e : I
    //   151: aload_0
    //   152: getfield f : I
    //   155: invokestatic createWithData : ([BII)Landroid/graphics/drawable/Icon;
    //   158: astore_1
    //   159: goto -> 190
    //   162: aload_0
    //   163: invokevirtual d : ()Ljava/lang/String;
    //   166: aload_0
    //   167: getfield e : I
    //   170: invokestatic createWithResource : (Ljava/lang/String;I)Landroid/graphics/drawable/Icon;
    //   173: astore_1
    //   174: goto -> 190
    //   177: aload_0
    //   178: getfield b : Ljava/lang/Object;
    //   181: checkcast android/graphics/Bitmap
    //   184: astore_1
    //   185: aload_1
    //   186: invokestatic createWithBitmap : (Landroid/graphics/Bitmap;)Landroid/graphics/drawable/Icon;
    //   189: astore_1
    //   190: aload_0
    //   191: getfield g : Landroid/content/res/ColorStateList;
    //   194: astore_2
    //   195: aload_2
    //   196: ifnull -> 205
    //   199: aload_1
    //   200: aload_2
    //   201: invokevirtual setTintList : (Landroid/content/res/ColorStateList;)Landroid/graphics/drawable/Icon;
    //   204: pop
    //   205: aload_0
    //   206: getfield h : Landroid/graphics/PorterDuff$Mode;
    //   209: astore_3
    //   210: aload_1
    //   211: astore_2
    //   212: aload_3
    //   213: getstatic androidx/core/graphics/drawable/IconCompat.j : Landroid/graphics/PorterDuff$Mode;
    //   216: if_acmpeq -> 238
    //   219: aload_1
    //   220: aload_3
    //   221: invokevirtual setTintMode : (Landroid/graphics/PorterDuff$Mode;)Landroid/graphics/drawable/Icon;
    //   224: pop
    //   225: aload_1
    //   226: astore_2
    //   227: goto -> 238
    //   230: aload_0
    //   231: getfield b : Ljava/lang/Object;
    //   234: checkcast android/graphics/drawable/Icon
    //   237: astore_2
    //   238: aload_2
    //   239: areturn
  }
  
  public String toString() {
    int i;
    String str;
    if (this.a == -1)
      return String.valueOf(this.b); 
    StringBuilder stringBuilder = new StringBuilder("Icon(typ=");
    switch (this.a) {
      default:
        str = "UNKNOWN";
        break;
      case 6:
        str = "URI_MASKABLE";
        break;
      case 5:
        str = "BITMAP_MASKABLE";
        break;
      case 4:
        str = "URI";
        break;
      case 3:
        str = "DATA";
        break;
      case 2:
        str = "RESOURCE";
        break;
      case 1:
        str = "BITMAP";
        break;
    } 
    stringBuilder.append(str);
    switch (this.a) {
      case 4:
      case 6:
        stringBuilder.append(" uri=");
        stringBuilder.append(this.b);
        break;
      case 3:
        stringBuilder.append(" len=");
        stringBuilder.append(this.e);
        if (this.f != 0) {
          stringBuilder.append(" off=");
          i = this.f;
        } else {
          break;
        } 
        stringBuilder.append(i);
        break;
      case 2:
        stringBuilder.append(" pkg=");
        stringBuilder.append(d());
        stringBuilder.append(" id=");
        stringBuilder.append(String.format("0x%08x", new Object[] { Integer.valueOf(c()) }));
        break;
      case 1:
      case 5:
        stringBuilder.append(" size=");
        stringBuilder.append(((Bitmap)this.b).getWidth());
        stringBuilder.append("x");
        i = ((Bitmap)this.b).getHeight();
        stringBuilder.append(i);
        break;
    } 
    if (this.g != null) {
      stringBuilder.append(" tint=");
      stringBuilder.append(this.g);
    } 
    if (this.h != j) {
      stringBuilder.append(" mode=");
      stringBuilder.append(this.h);
    } 
    stringBuilder.append(")");
    return stringBuilder.toString();
  }
}


/* Location:              C:\Users\panch\Downloads\dvba_v1.1.0-dex2jar.jar!\androidx\core\graphics\drawable\IconCompat.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */