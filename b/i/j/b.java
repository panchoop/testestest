package b.i.j;

import android.content.Context;
import android.content.pm.PackageManager;
import android.graphics.Typeface;
import android.net.Uri;
import android.os.CancellationSignal;
import android.os.Handler;
import b.f.h;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.Callable;

public class b {
  public static final b.f.f<String, Typeface> a = new b.f.f(16);
  
  public static final c b = new c("fonts", 10, 10000);
  
  public static final Object c = new Object();
  
  public static final h<String, ArrayList<c.c<g>>> d = new h();
  
  public static final Comparator<byte[]> e = new d();
  
  public static e a(Context paramContext, CancellationSignal paramCancellationSignal, a parama) {
    // Byte code:
    //   0: aload_0
    //   1: invokevirtual getPackageManager : ()Landroid/content/pm/PackageManager;
    //   4: astore #15
    //   6: aload_0
    //   7: invokevirtual getResources : ()Landroid/content/res/Resources;
    //   10: astore #13
    //   12: aload_2
    //   13: getfield a : Ljava/lang/String;
    //   16: astore_1
    //   17: aload #15
    //   19: aload_1
    //   20: iconst_0
    //   21: invokevirtual resolveContentProvider : (Ljava/lang/String;I)Landroid/content/pm/ProviderInfo;
    //   24: astore #14
    //   26: aload #14
    //   28: ifnull -> 808
    //   31: aload #14
    //   33: getfield packageName : Ljava/lang/String;
    //   36: aload_2
    //   37: getfield b : Ljava/lang/String;
    //   40: invokevirtual equals : (Ljava/lang/Object;)Z
    //   43: ifeq -> 757
    //   46: aload #15
    //   48: aload #14
    //   50: getfield packageName : Ljava/lang/String;
    //   53: bipush #64
    //   55: invokevirtual getPackageInfo : (Ljava/lang/String;I)Landroid/content/pm/PackageInfo;
    //   58: getfield signatures : [Landroid/content/pm/Signature;
    //   61: astore_1
    //   62: new java/util/ArrayList
    //   65: dup
    //   66: invokespecial <init> : ()V
    //   69: astore #15
    //   71: iconst_0
    //   72: istore_3
    //   73: iload_3
    //   74: aload_1
    //   75: arraylength
    //   76: if_icmpge -> 97
    //   79: aload #15
    //   81: aload_1
    //   82: iload_3
    //   83: aaload
    //   84: invokevirtual toByteArray : ()[B
    //   87: invokevirtual add : (Ljava/lang/Object;)Z
    //   90: pop
    //   91: iinc #3, 1
    //   94: goto -> 73
    //   97: aload #15
    //   99: getstatic b/i/j/b.e : Ljava/util/Comparator;
    //   102: invokestatic sort : (Ljava/util/List;Ljava/util/Comparator;)V
    //   105: aload_2
    //   106: getfield d : Ljava/util/List;
    //   109: astore_1
    //   110: aload_1
    //   111: ifnull -> 117
    //   114: goto -> 127
    //   117: aload #13
    //   119: aload_2
    //   120: getfield e : I
    //   123: invokestatic l0 : (Landroid/content/res/Resources;I)Ljava/util/List;
    //   126: astore_1
    //   127: iconst_0
    //   128: istore_3
    //   129: aload_1
    //   130: invokeinterface size : ()I
    //   135: istore #4
    //   137: aconst_null
    //   138: astore #13
    //   140: iload_3
    //   141: iload #4
    //   143: if_icmpge -> 260
    //   146: new java/util/ArrayList
    //   149: dup
    //   150: aload_1
    //   151: iload_3
    //   152: invokeinterface get : (I)Ljava/lang/Object;
    //   157: checkcast java/util/Collection
    //   160: invokespecial <init> : (Ljava/util/Collection;)V
    //   163: astore #16
    //   165: aload #16
    //   167: getstatic b/i/j/b.e : Ljava/util/Comparator;
    //   170: invokestatic sort : (Ljava/util/List;Ljava/util/Comparator;)V
    //   173: aload #15
    //   175: invokevirtual size : ()I
    //   178: aload #16
    //   180: invokevirtual size : ()I
    //   183: if_icmpeq -> 189
    //   186: goto -> 228
    //   189: iconst_0
    //   190: istore #4
    //   192: iload #4
    //   194: aload #15
    //   196: invokevirtual size : ()I
    //   199: if_icmpge -> 240
    //   202: aload #15
    //   204: iload #4
    //   206: invokevirtual get : (I)Ljava/lang/Object;
    //   209: checkcast [B
    //   212: aload #16
    //   214: iload #4
    //   216: invokevirtual get : (I)Ljava/lang/Object;
    //   219: checkcast [B
    //   222: invokestatic equals : ([B[B)Z
    //   225: ifne -> 234
    //   228: iconst_0
    //   229: istore #4
    //   231: goto -> 243
    //   234: iinc #4, 1
    //   237: goto -> 192
    //   240: iconst_1
    //   241: istore #4
    //   243: iload #4
    //   245: ifeq -> 254
    //   248: aload #14
    //   250: astore_1
    //   251: goto -> 262
    //   254: iinc #3, 1
    //   257: goto -> 129
    //   260: aconst_null
    //   261: astore_1
    //   262: aload_1
    //   263: ifnonnull -> 276
    //   266: new b/i/j/b$e
    //   269: dup
    //   270: iconst_1
    //   271: aconst_null
    //   272: invokespecial <init> : (I[Lb/i/j/b$f;)V
    //   275: areturn
    //   276: aload_1
    //   277: getfield authority : Ljava/lang/String;
    //   280: astore_1
    //   281: new java/util/ArrayList
    //   284: dup
    //   285: invokespecial <init> : ()V
    //   288: astore #14
    //   290: new android/net/Uri$Builder
    //   293: dup
    //   294: invokespecial <init> : ()V
    //   297: ldc 'content'
    //   299: invokevirtual scheme : (Ljava/lang/String;)Landroid/net/Uri$Builder;
    //   302: aload_1
    //   303: invokevirtual authority : (Ljava/lang/String;)Landroid/net/Uri$Builder;
    //   306: invokevirtual build : ()Landroid/net/Uri;
    //   309: astore #15
    //   311: new android/net/Uri$Builder
    //   314: dup
    //   315: invokespecial <init> : ()V
    //   318: ldc 'content'
    //   320: invokevirtual scheme : (Ljava/lang/String;)Landroid/net/Uri$Builder;
    //   323: aload_1
    //   324: invokevirtual authority : (Ljava/lang/String;)Landroid/net/Uri$Builder;
    //   327: ldc 'file'
    //   329: invokevirtual appendPath : (Ljava/lang/String;)Landroid/net/Uri$Builder;
    //   332: invokevirtual build : ()Landroid/net/Uri;
    //   335: astore #16
    //   337: aload #13
    //   339: astore_1
    //   340: aload_0
    //   341: invokevirtual getContentResolver : ()Landroid/content/ContentResolver;
    //   344: astore_0
    //   345: aload #13
    //   347: astore_1
    //   348: aload_2
    //   349: getfield c : Ljava/lang/String;
    //   352: astore_2
    //   353: aload #13
    //   355: astore_1
    //   356: aload_0
    //   357: aload #15
    //   359: bipush #7
    //   361: anewarray java/lang/String
    //   364: dup
    //   365: iconst_0
    //   366: ldc '_id'
    //   368: aastore
    //   369: dup
    //   370: iconst_1
    //   371: ldc 'file_id'
    //   373: aastore
    //   374: dup
    //   375: iconst_2
    //   376: ldc 'font_ttc_index'
    //   378: aastore
    //   379: dup
    //   380: iconst_3
    //   381: ldc 'font_variation_settings'
    //   383: aastore
    //   384: dup
    //   385: iconst_4
    //   386: ldc 'font_weight'
    //   388: aastore
    //   389: dup
    //   390: iconst_5
    //   391: ldc 'font_italic'
    //   393: aastore
    //   394: dup
    //   395: bipush #6
    //   397: ldc 'result_code'
    //   399: aastore
    //   400: ldc 'query = ?'
    //   402: iconst_1
    //   403: anewarray java/lang/String
    //   406: dup
    //   407: iconst_0
    //   408: aload_2
    //   409: aastore
    //   410: aconst_null
    //   411: aconst_null
    //   412: invokevirtual query : (Landroid/net/Uri;[Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;Landroid/os/CancellationSignal;)Landroid/database/Cursor;
    //   415: astore_2
    //   416: aload #14
    //   418: astore_0
    //   419: aload_2
    //   420: ifnull -> 714
    //   423: aload #14
    //   425: astore_0
    //   426: aload_2
    //   427: astore_1
    //   428: aload_2
    //   429: invokeinterface getCount : ()I
    //   434: ifle -> 714
    //   437: aload_2
    //   438: astore_1
    //   439: aload_2
    //   440: ldc 'result_code'
    //   442: invokeinterface getColumnIndex : (Ljava/lang/String;)I
    //   447: istore #9
    //   449: aload_2
    //   450: astore_1
    //   451: new java/util/ArrayList
    //   454: astore #13
    //   456: aload_2
    //   457: astore_1
    //   458: aload #13
    //   460: invokespecial <init> : ()V
    //   463: aload_2
    //   464: astore_1
    //   465: aload_2
    //   466: ldc '_id'
    //   468: invokeinterface getColumnIndex : (Ljava/lang/String;)I
    //   473: istore #10
    //   475: aload_2
    //   476: astore_1
    //   477: aload_2
    //   478: ldc 'file_id'
    //   480: invokeinterface getColumnIndex : (Ljava/lang/String;)I
    //   485: istore #8
    //   487: aload_2
    //   488: astore_1
    //   489: aload_2
    //   490: ldc 'font_ttc_index'
    //   492: invokeinterface getColumnIndex : (Ljava/lang/String;)I
    //   497: istore #7
    //   499: aload_2
    //   500: astore_1
    //   501: aload_2
    //   502: ldc 'font_weight'
    //   504: invokeinterface getColumnIndex : (Ljava/lang/String;)I
    //   509: istore #11
    //   511: aload_2
    //   512: astore_1
    //   513: aload_2
    //   514: ldc 'font_italic'
    //   516: invokeinterface getColumnIndex : (Ljava/lang/String;)I
    //   521: istore #6
    //   523: aload #13
    //   525: astore_0
    //   526: aload_2
    //   527: astore_1
    //   528: aload_2
    //   529: invokeinterface moveToNext : ()Z
    //   534: ifeq -> 714
    //   537: iload #9
    //   539: iconst_m1
    //   540: if_icmpeq -> 557
    //   543: aload_2
    //   544: astore_1
    //   545: aload_2
    //   546: iload #9
    //   548: invokeinterface getInt : (I)I
    //   553: istore_3
    //   554: goto -> 559
    //   557: iconst_0
    //   558: istore_3
    //   559: iload #7
    //   561: iconst_m1
    //   562: if_icmpeq -> 580
    //   565: aload_2
    //   566: astore_1
    //   567: aload_2
    //   568: iload #7
    //   570: invokeinterface getInt : (I)I
    //   575: istore #4
    //   577: goto -> 583
    //   580: iconst_0
    //   581: istore #4
    //   583: iload #8
    //   585: iconst_m1
    //   586: if_icmpne -> 608
    //   589: aload_2
    //   590: astore_1
    //   591: aload #15
    //   593: aload_2
    //   594: iload #10
    //   596: invokeinterface getLong : (I)J
    //   601: invokestatic withAppendedId : (Landroid/net/Uri;J)Landroid/net/Uri;
    //   604: astore_0
    //   605: goto -> 624
    //   608: aload_2
    //   609: astore_1
    //   610: aload #16
    //   612: aload_2
    //   613: iload #8
    //   615: invokeinterface getLong : (I)J
    //   620: invokestatic withAppendedId : (Landroid/net/Uri;J)Landroid/net/Uri;
    //   623: astore_0
    //   624: iload #11
    //   626: iconst_m1
    //   627: if_icmpeq -> 645
    //   630: aload_2
    //   631: astore_1
    //   632: aload_2
    //   633: iload #11
    //   635: invokeinterface getInt : (I)I
    //   640: istore #5
    //   642: goto -> 650
    //   645: sipush #400
    //   648: istore #5
    //   650: iload #6
    //   652: iconst_m1
    //   653: if_icmpeq -> 676
    //   656: aload_2
    //   657: astore_1
    //   658: aload_2
    //   659: iload #6
    //   661: invokeinterface getInt : (I)I
    //   666: iconst_1
    //   667: if_icmpne -> 676
    //   670: iconst_1
    //   671: istore #12
    //   673: goto -> 679
    //   676: iconst_0
    //   677: istore #12
    //   679: aload_2
    //   680: astore_1
    //   681: new b/i/j/b$f
    //   684: astore #14
    //   686: aload_2
    //   687: astore_1
    //   688: aload #14
    //   690: aload_0
    //   691: iload #4
    //   693: iload #5
    //   695: iload #12
    //   697: iload_3
    //   698: invokespecial <init> : (Landroid/net/Uri;IIZI)V
    //   701: aload_2
    //   702: astore_1
    //   703: aload #13
    //   705: aload #14
    //   707: invokevirtual add : (Ljava/lang/Object;)Z
    //   710: pop
    //   711: goto -> 523
    //   714: aload_2
    //   715: ifnull -> 724
    //   718: aload_2
    //   719: invokeinterface close : ()V
    //   724: new b/i/j/b$e
    //   727: dup
    //   728: iconst_0
    //   729: aload_0
    //   730: iconst_0
    //   731: anewarray b/i/j/b$f
    //   734: invokevirtual toArray : ([Ljava/lang/Object;)[Ljava/lang/Object;
    //   737: checkcast [Lb/i/j/b$f;
    //   740: invokespecial <init> : (I[Lb/i/j/b$f;)V
    //   743: areturn
    //   744: astore_0
    //   745: aload_1
    //   746: ifnull -> 755
    //   749: aload_1
    //   750: invokeinterface close : ()V
    //   755: aload_0
    //   756: athrow
    //   757: new java/lang/StringBuilder
    //   760: dup
    //   761: invokespecial <init> : ()V
    //   764: astore_0
    //   765: aload_0
    //   766: ldc_w 'Found content provider '
    //   769: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   772: pop
    //   773: aload_0
    //   774: aload_1
    //   775: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   778: pop
    //   779: aload_0
    //   780: ldc_w ', but package was not '
    //   783: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   786: pop
    //   787: aload_0
    //   788: aload_2
    //   789: getfield b : Ljava/lang/String;
    //   792: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   795: pop
    //   796: new android/content/pm/PackageManager$NameNotFoundException
    //   799: dup
    //   800: aload_0
    //   801: invokevirtual toString : ()Ljava/lang/String;
    //   804: invokespecial <init> : (Ljava/lang/String;)V
    //   807: athrow
    //   808: new android/content/pm/PackageManager$NameNotFoundException
    //   811: dup
    //   812: ldc_w 'No package found for authority: '
    //   815: aload_1
    //   816: invokestatic c : (Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    //   819: invokespecial <init> : (Ljava/lang/String;)V
    //   822: athrow
    // Exception table:
    //   from	to	target	type
    //   340	345	744	finally
    //   348	353	744	finally
    //   356	416	744	finally
    //   428	437	744	finally
    //   439	449	744	finally
    //   451	456	744	finally
    //   458	463	744	finally
    //   465	475	744	finally
    //   477	487	744	finally
    //   489	499	744	finally
    //   501	511	744	finally
    //   513	523	744	finally
    //   528	537	744	finally
    //   545	554	744	finally
    //   567	577	744	finally
    //   591	605	744	finally
    //   610	624	744	finally
    //   632	642	744	finally
    //   658	670	744	finally
    //   681	686	744	finally
    //   688	701	744	finally
    //   703	711	744	finally
  }
  
  public static g b(Context paramContext, a parama, int paramInt) {
    try {
      e e = a(paramContext, null, parama);
      int i = e.a;
      byte b1 = -3;
      if (i == 0) {
        f[] arrayOfF = e.b;
        Typeface typeface = b.i.f.d.a.b(paramContext, null, arrayOfF, paramInt);
        if (typeface != null)
          b1 = 0; 
        return new g(typeface, b1);
      } 
      if (i == 1)
        b1 = -2; 
      return new g(null, b1);
    } catch (android.content.pm.PackageManager.NameNotFoundException nameNotFoundException) {
      return new g(null, -1);
    } 
  }
  
  public static Typeface c(Context paramContext, a parama, b.i.e.b.g paramg, Handler paramHandler, boolean paramBoolean, int paramInt1, int paramInt2) {
    StringBuilder stringBuilder = new StringBuilder();
    stringBuilder.append(parama.f);
    stringBuilder.append("-");
    stringBuilder.append(paramInt2);
    String str = stringBuilder.toString();
    Typeface typeface = (Typeface)a.a(str);
    if (typeface != null) {
      if (paramg != null)
        paramg.d(typeface); 
      return typeface;
    } 
    if (paramBoolean && paramInt1 == -1) {
      g1 = b(paramContext, parama, paramInt2);
      if (paramg != null) {
        paramInt1 = g1.b;
        if (paramInt1 == 0) {
          paramg.b(g1.a, paramHandler);
        } else {
          paramg.a(paramInt1, paramHandler);
        } 
      } 
      return g1.a;
    } 
    a a1 = new a((Context)g1, parama, paramInt2, str);
    g g1 = null;
    if (paramBoolean) {
      Typeface typeface1;
      try {
        Typeface typeface2 = ((g)b.b(a1, paramInt1)).a;
        typeface1 = typeface2;
      } catch (InterruptedException interruptedException) {}
      return typeface1;
    } 
    if (paramg == null) {
      g1 = null;
    } else {
      null = new b(paramg, paramHandler);
    } 
    synchronized (c) {
      ArrayList<b> arrayList = (ArrayList)d.getOrDefault(str, null);
      if (arrayList != null) {
        if (null != null)
          arrayList.add(null); 
        return null;
      } 
      if (null != null) {
        arrayList = new ArrayList<b>();
        this();
        arrayList.add(null);
        d.put(str, arrayList);
      } 
      c c1 = b;
      null = new c(str);
      if (c1 != null) {
        c1.a(new d(c1, (Callable)interruptedException, new Handler(), (c.c)null));
        return null;
      } 
      throw null;
    } 
  }
  
  public static Map<Uri, ByteBuffer> d(Context paramContext, f[] paramArrayOff, CancellationSignal paramCancellationSignal) {
    HashMap<Object, Object> hashMap = new HashMap<Object, Object>();
    int i = paramArrayOff.length;
    for (byte b1 = 0; b1 < i; b1++) {
      f f1 = paramArrayOff[b1];
      if (f1.e == 0) {
        Uri uri = f1.a;
        if (!hashMap.containsKey(uri))
          hashMap.put(uri, a.a.a.a.a.Y(paramContext, paramCancellationSignal, uri)); 
      } 
    } 
    return (Map)Collections.unmodifiableMap(hashMap);
  }
  
  public class a implements Callable<g> {
    public final Context a;
    
    public final a b;
    
    public final int c;
    
    public final String d;
    
    public a(b this$0, a param1a, int param1Int, String param1String) {}
    
    public Object call() {
      b.g g = b.b(this.a, this.b, this.c);
      Typeface typeface = g.a;
      if (typeface != null)
        b.a.b(this.d, typeface); 
      return g;
    }
  }
  
  public class b implements c.c<g> {
    public final b.i.e.b.g a;
    
    public final Handler b;
    
    public b(b this$0, Handler param1Handler) {}
    
    public void a(Object param1Object) {
      int i;
      param1Object = param1Object;
      if (param1Object == null) {
        param1Object = this.a;
        i = 1;
      } else {
        i = ((b.g)param1Object).b;
        if (i == 0) {
          this.a.b(((b.g)param1Object).a, this.b);
        } else {
          param1Object = this.a;
          param1Object.a(i, this.b);
        } 
        return;
      } 
      param1Object.a(i, this.b);
    }
  }
  
  public class c implements c.c<g> {
    public final String a;
    
    public c(b this$0) {}
    
    public void b(b.g param1g) {
      synchronized (b.c) {
        ArrayList<c.c<b.g>> arrayList = (ArrayList)b.d.get(this.a);
        if (arrayList == null)
          return; 
        b.d.remove(this.a);
        for (byte b = 0; b < arrayList.size(); b++)
          ((c.c<b.g>)arrayList.get(b)).a(param1g); 
        return;
      } 
    }
  }
  
  public class d implements Comparator<byte[]> {
    public int compare(Object param1Object1, Object param1Object2) {
      Object object;
      param1Object1 = param1Object1;
      param1Object2 = param1Object2;
      int j = param1Object1.length;
      int i = param1Object2.length;
      boolean bool = false;
      if (j != i) {
        i = param1Object1.length;
        j = param1Object2.length;
      } else {
        i = 0;
        while (true) {
          Object object1;
          j = bool;
          if (i < param1Object1.length) {
            if (param1Object1[i] != param1Object2[i]) {
              Object object2 = param1Object1[i];
              object1 = param1Object2[i];
              object = object2;
            } else {
              object++;
              continue;
            } 
          } else {
            break;
          } 
          j = object - object1;
          break;
        } 
        return j;
      } 
      j = object - j;
      break;
    }
  }
  
  public static class e {
    public final int a;
    
    public final b.f[] b;
    
    public e(int param1Int, b.f[] param1ArrayOff) {
      this.a = param1Int;
      this.b = param1ArrayOff;
    }
  }
  
  public static class f {
    public final Uri a;
    
    public final int b;
    
    public final int c;
    
    public final boolean d;
    
    public final int e;
    
    public f(Uri param1Uri, int param1Int1, int param1Int2, boolean param1Boolean, int param1Int3) {
      if (param1Uri != null) {
        this.a = param1Uri;
        this.b = param1Int1;
        this.c = param1Int2;
        this.d = param1Boolean;
        this.e = param1Int3;
        return;
      } 
      throw null;
    }
  }
  
  public static final class g {
    public final Typeface a;
    
    public final int b;
    
    public g(Typeface param1Typeface, int param1Int) {
      this.a = param1Typeface;
      this.b = param1Int;
    }
  }
}


/* Location:              C:\Users\panch\Downloads\dvba_v1.1.0-dex2jar.jar!\b\i\j\b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */