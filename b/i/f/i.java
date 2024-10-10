package b.i.f;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.graphics.fonts.Font;
import android.graphics.fonts.FontFamily;
import android.graphics.fonts.FontStyle;
import android.os.CancellationSignal;
import b.i.e.b.c;
import b.i.e.b.d;
import b.i.j.b;
import java.io.IOException;

public class i extends j {
  public Typeface a(Context paramContext, c paramc, Resources paramResources, int paramInt) {
    d[] arrayOfD = paramc.a;
    int k = arrayOfD.length;
    boolean bool = false;
    paramContext = null;
    char c1 = Character.MIN_VALUE;
    while (true) {
      FontFamily.Builder builder;
      boolean bool1 = true;
      if (c1 < k) {
        d d = arrayOfD[c1];
        try {
          Font.Builder builder1 = new Font.Builder();
          this(paramResources, d.f);
          builder1 = builder1.setWeight(d.b);
          if (!d.c)
            bool1 = false; 
          Font font = builder1.setSlant(bool1).setTtcIndex(d.e).setFontVariationSettings(d.d).build();
          if (paramContext == null) {
            FontFamily.Builder builder2 = new FontFamily.Builder();
            this(font);
            builder = builder2;
          } else {
            builder.addFont(font);
          } 
        } catch (IOException iOException) {}
        c1++;
        continue;
      } 
      if (builder == null)
        return null; 
      if ((paramInt & 0x1) != 0) {
        c1 = 'ʼ';
      } else {
        c1 = 'Ɛ';
      } 
      bool1 = bool;
      if ((paramInt & 0x2) != 0)
        bool1 = true; 
      FontStyle fontStyle = new FontStyle(c1, bool1);
      return (new Typeface.CustomFallbackBuilder(builder.build())).setStyle(fontStyle).build();
    } 
  }
  
  public Typeface b(Context paramContext, CancellationSignal paramCancellationSignal, b.f[] paramArrayOff, int paramInt) {
    // Byte code:
    //   0: aload_1
    //   1: invokevirtual getContentResolver : ()Landroid/content/ContentResolver;
    //   4: astore #10
    //   6: aload_3
    //   7: arraylength
    //   8: istore #8
    //   10: iconst_0
    //   11: istore #7
    //   13: aconst_null
    //   14: astore_1
    //   15: iconst_0
    //   16: istore #5
    //   18: iconst_1
    //   19: istore #6
    //   21: iload #5
    //   23: iload #8
    //   25: if_icmpge -> 205
    //   28: aload_3
    //   29: iload #5
    //   31: aaload
    //   32: astore #12
    //   34: aload_1
    //   35: astore #9
    //   37: aload #10
    //   39: aload #12
    //   41: getfield a : Landroid/net/Uri;
    //   44: ldc 'r'
    //   46: aload_2
    //   47: invokevirtual openFileDescriptor : (Landroid/net/Uri;Ljava/lang/String;Landroid/os/CancellationSignal;)Landroid/os/ParcelFileDescriptor;
    //   50: astore #11
    //   52: aload #11
    //   54: ifnonnull -> 79
    //   57: aload_1
    //   58: astore #9
    //   60: aload #11
    //   62: ifnull -> 196
    //   65: aload_1
    //   66: astore #9
    //   68: aload #11
    //   70: invokevirtual close : ()V
    //   73: aload_1
    //   74: astore #9
    //   76: goto -> 196
    //   79: new android/graphics/fonts/Font$Builder
    //   82: astore #9
    //   84: aload #9
    //   86: aload #11
    //   88: invokespecial <init> : (Landroid/os/ParcelFileDescriptor;)V
    //   91: aload #9
    //   93: aload #12
    //   95: getfield c : I
    //   98: invokevirtual setWeight : (I)Landroid/graphics/fonts/Font$Builder;
    //   101: astore #9
    //   103: aload #12
    //   105: getfield d : Z
    //   108: ifeq -> 114
    //   111: goto -> 117
    //   114: iconst_0
    //   115: istore #6
    //   117: aload #9
    //   119: iload #6
    //   121: invokevirtual setSlant : (I)Landroid/graphics/fonts/Font$Builder;
    //   124: aload #12
    //   126: getfield b : I
    //   129: invokevirtual setTtcIndex : (I)Landroid/graphics/fonts/Font$Builder;
    //   132: invokevirtual build : ()Landroid/graphics/fonts/Font;
    //   135: astore #9
    //   137: aload_1
    //   138: ifnonnull -> 158
    //   141: new android/graphics/fonts/FontFamily$Builder
    //   144: dup
    //   145: aload #9
    //   147: invokespecial <init> : (Landroid/graphics/fonts/Font;)V
    //   150: astore #9
    //   152: aload #9
    //   154: astore_1
    //   155: goto -> 65
    //   158: aload_1
    //   159: aload #9
    //   161: invokevirtual addFont : (Landroid/graphics/fonts/Font;)Landroid/graphics/fonts/FontFamily$Builder;
    //   164: pop
    //   165: goto -> 65
    //   168: astore #12
    //   170: aload #11
    //   172: invokevirtual close : ()V
    //   175: goto -> 190
    //   178: astore #11
    //   180: aload_1
    //   181: astore #9
    //   183: aload #12
    //   185: aload #11
    //   187: invokevirtual addSuppressed : (Ljava/lang/Throwable;)V
    //   190: aload_1
    //   191: astore #9
    //   193: aload #12
    //   195: athrow
    //   196: iinc #5, 1
    //   199: aload #9
    //   201: astore_1
    //   202: goto -> 18
    //   205: aload_1
    //   206: ifnonnull -> 211
    //   209: aconst_null
    //   210: areturn
    //   211: iload #4
    //   213: iconst_1
    //   214: iand
    //   215: ifeq -> 226
    //   218: sipush #700
    //   221: istore #5
    //   223: goto -> 231
    //   226: sipush #400
    //   229: istore #5
    //   231: iload #7
    //   233: istore #6
    //   235: iload #4
    //   237: iconst_2
    //   238: iand
    //   239: ifeq -> 245
    //   242: iconst_1
    //   243: istore #6
    //   245: new android/graphics/fonts/FontStyle
    //   248: dup
    //   249: iload #5
    //   251: iload #6
    //   253: invokespecial <init> : (II)V
    //   256: astore_2
    //   257: new android/graphics/Typeface$CustomFallbackBuilder
    //   260: dup
    //   261: aload_1
    //   262: invokevirtual build : ()Landroid/graphics/fonts/FontFamily;
    //   265: invokespecial <init> : (Landroid/graphics/fonts/FontFamily;)V
    //   268: aload_2
    //   269: invokevirtual setStyle : (Landroid/graphics/fonts/FontStyle;)Landroid/graphics/Typeface$CustomFallbackBuilder;
    //   272: invokevirtual build : ()Landroid/graphics/Typeface;
    //   275: areturn
    //   276: astore_1
    //   277: goto -> 196
    // Exception table:
    //   from	to	target	type
    //   37	52	276	java/io/IOException
    //   68	73	276	java/io/IOException
    //   79	111	168	finally
    //   117	137	168	finally
    //   141	152	168	finally
    //   158	165	168	finally
    //   170	175	178	finally
    //   183	190	276	java/io/IOException
    //   193	196	276	java/io/IOException
  }
  
  public Typeface d(Context paramContext, Resources paramResources, int paramInt1, String paramString, int paramInt2) {
    try {
      Font.Builder builder = new Font.Builder();
      this(paramResources, paramInt1);
      Font font = builder.build();
      FontFamily.Builder builder1 = new FontFamily.Builder();
      this(font);
      FontFamily fontFamily = builder1.build();
      return (new Typeface.CustomFallbackBuilder(fontFamily)).setStyle(font.getStyle()).build();
    } catch (IOException iOException) {
      return null;
    } 
  }
  
  public b.f f(b.f[] paramArrayOff, int paramInt) {
    throw new RuntimeException("Do not use this function in API 29 or later.");
  }
}


/* Location:              C:\Users\panch\Downloads\dvba_v1.1.0-dex2jar.jar!\b\i\f\i.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */