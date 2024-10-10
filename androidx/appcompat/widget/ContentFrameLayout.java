package androidx.appcompat.widget;

import android.content.Context;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.widget.FrameLayout;
import b.b.k.k;
import b.b.k.n;
import b.b.o.i.g;
import b.b.p.c0;

public class ContentFrameLayout extends FrameLayout {
  public TypedValue b;
  
  public TypedValue c;
  
  public TypedValue d;
  
  public TypedValue e;
  
  public TypedValue f;
  
  public TypedValue g;
  
  public final Rect h = new Rect();
  
  public a i;
  
  public ContentFrameLayout(Context paramContext, AttributeSet paramAttributeSet) {
    super(paramContext, paramAttributeSet, 0);
  }
  
  public TypedValue getFixedHeightMajor() {
    if (this.f == null)
      this.f = new TypedValue(); 
    return this.f;
  }
  
  public TypedValue getFixedHeightMinor() {
    if (this.g == null)
      this.g = new TypedValue(); 
    return this.g;
  }
  
  public TypedValue getFixedWidthMajor() {
    if (this.d == null)
      this.d = new TypedValue(); 
    return this.d;
  }
  
  public TypedValue getFixedWidthMinor() {
    if (this.e == null)
      this.e = new TypedValue(); 
    return this.e;
  }
  
  public TypedValue getMinWidthMajor() {
    if (this.b == null)
      this.b = new TypedValue(); 
    return this.b;
  }
  
  public TypedValue getMinWidthMinor() {
    if (this.c == null)
      this.c = new TypedValue(); 
    return this.c;
  }
  
  public void onAttachedToWindow() {
    super.onAttachedToWindow();
    a a1 = this.i;
    if (a1 == null || (n)a1 != null)
      return; 
    throw null;
  }
  
  public void onDetachedFromWindow() {
    super.onDetachedFromWindow();
    a a1 = this.i;
    if (a1 != null) {
      k k = ((n)a1).a;
      c0 c0 = k.l;
      if (c0 != null)
        c0.j(); 
      if (k.q != null) {
        k.f.getDecorView().removeCallbacks(k.r);
        if (k.q.isShowing())
          try {
            k.q.dismiss();
          } catch (IllegalArgumentException illegalArgumentException) {} 
        k.q = null;
      } 
      k.y();
      g g = (k.D(0)).h;
      if (g != null)
        g.c(true); 
    } 
  }
  
  public void onMeasure(int paramInt1, int paramInt2) {
    // Byte code:
    //   0: aload_0
    //   1: invokevirtual getContext : ()Landroid/content/Context;
    //   4: invokevirtual getResources : ()Landroid/content/res/Resources;
    //   7: invokevirtual getDisplayMetrics : ()Landroid/util/DisplayMetrics;
    //   10: astore #11
    //   12: aload #11
    //   14: getfield widthPixels : I
    //   17: istore #5
    //   19: aload #11
    //   21: getfield heightPixels : I
    //   24: istore #4
    //   26: iconst_1
    //   27: istore #8
    //   29: iload #5
    //   31: iload #4
    //   33: if_icmpge -> 42
    //   36: iconst_1
    //   37: istore #4
    //   39: goto -> 45
    //   42: iconst_0
    //   43: istore #4
    //   45: iload_1
    //   46: invokestatic getMode : (I)I
    //   49: istore #9
    //   51: iload_2
    //   52: invokestatic getMode : (I)I
    //   55: istore #7
    //   57: iload #9
    //   59: ldc -2147483648
    //   61: if_icmpne -> 198
    //   64: iload #4
    //   66: ifeq -> 78
    //   69: aload_0
    //   70: getfield e : Landroid/util/TypedValue;
    //   73: astore #10
    //   75: goto -> 84
    //   78: aload_0
    //   79: getfield d : Landroid/util/TypedValue;
    //   82: astore #10
    //   84: aload #10
    //   86: ifnull -> 198
    //   89: aload #10
    //   91: getfield type : I
    //   94: istore #5
    //   96: iload #5
    //   98: ifeq -> 198
    //   101: iload #5
    //   103: iconst_5
    //   104: if_icmpne -> 122
    //   107: aload #10
    //   109: aload #11
    //   111: invokevirtual getDimension : (Landroid/util/DisplayMetrics;)F
    //   114: fstore_3
    //   115: fload_3
    //   116: f2i
    //   117: istore #5
    //   119: goto -> 154
    //   122: iload #5
    //   124: bipush #6
    //   126: if_icmpne -> 151
    //   129: aload #11
    //   131: getfield widthPixels : I
    //   134: istore #5
    //   136: aload #10
    //   138: iload #5
    //   140: i2f
    //   141: iload #5
    //   143: i2f
    //   144: invokevirtual getFraction : (FF)F
    //   147: fstore_3
    //   148: goto -> 115
    //   151: iconst_0
    //   152: istore #5
    //   154: iload #5
    //   156: ifle -> 198
    //   159: aload_0
    //   160: getfield h : Landroid/graphics/Rect;
    //   163: astore #10
    //   165: iload #5
    //   167: aload #10
    //   169: getfield left : I
    //   172: aload #10
    //   174: getfield right : I
    //   177: iadd
    //   178: isub
    //   179: iload_1
    //   180: invokestatic getSize : (I)I
    //   183: invokestatic min : (II)I
    //   186: ldc 1073741824
    //   188: invokestatic makeMeasureSpec : (II)I
    //   191: istore #6
    //   193: iconst_1
    //   194: istore_1
    //   195: goto -> 207
    //   198: iconst_0
    //   199: istore #5
    //   201: iload_1
    //   202: istore #6
    //   204: iload #5
    //   206: istore_1
    //   207: iload_2
    //   208: istore #5
    //   210: iload #7
    //   212: ldc -2147483648
    //   214: if_icmpne -> 355
    //   217: iload #4
    //   219: ifeq -> 231
    //   222: aload_0
    //   223: getfield f : Landroid/util/TypedValue;
    //   226: astore #10
    //   228: goto -> 237
    //   231: aload_0
    //   232: getfield g : Landroid/util/TypedValue;
    //   235: astore #10
    //   237: iload_2
    //   238: istore #5
    //   240: aload #10
    //   242: ifnull -> 355
    //   245: aload #10
    //   247: getfield type : I
    //   250: istore #7
    //   252: iload_2
    //   253: istore #5
    //   255: iload #7
    //   257: ifeq -> 355
    //   260: iload #7
    //   262: iconst_5
    //   263: if_icmpne -> 281
    //   266: aload #10
    //   268: aload #11
    //   270: invokevirtual getDimension : (Landroid/util/DisplayMetrics;)F
    //   273: fstore_3
    //   274: fload_3
    //   275: f2i
    //   276: istore #7
    //   278: goto -> 313
    //   281: iload #7
    //   283: bipush #6
    //   285: if_icmpne -> 310
    //   288: aload #11
    //   290: getfield heightPixels : I
    //   293: istore #5
    //   295: aload #10
    //   297: iload #5
    //   299: i2f
    //   300: iload #5
    //   302: i2f
    //   303: invokevirtual getFraction : (FF)F
    //   306: fstore_3
    //   307: goto -> 274
    //   310: iconst_0
    //   311: istore #7
    //   313: iload_2
    //   314: istore #5
    //   316: iload #7
    //   318: ifle -> 355
    //   321: aload_0
    //   322: getfield h : Landroid/graphics/Rect;
    //   325: astore #10
    //   327: iload #7
    //   329: aload #10
    //   331: getfield top : I
    //   334: aload #10
    //   336: getfield bottom : I
    //   339: iadd
    //   340: isub
    //   341: iload_2
    //   342: invokestatic getSize : (I)I
    //   345: invokestatic min : (II)I
    //   348: ldc 1073741824
    //   350: invokestatic makeMeasureSpec : (II)I
    //   353: istore #5
    //   355: aload_0
    //   356: iload #6
    //   358: iload #5
    //   360: invokespecial onMeasure : (II)V
    //   363: aload_0
    //   364: invokevirtual getMeasuredWidth : ()I
    //   367: istore #7
    //   369: iload #7
    //   371: ldc 1073741824
    //   373: invokestatic makeMeasureSpec : (II)I
    //   376: istore #6
    //   378: iload_1
    //   379: ifne -> 515
    //   382: iload #9
    //   384: ldc -2147483648
    //   386: if_icmpne -> 515
    //   389: iload #4
    //   391: ifeq -> 403
    //   394: aload_0
    //   395: getfield c : Landroid/util/TypedValue;
    //   398: astore #10
    //   400: goto -> 409
    //   403: aload_0
    //   404: getfield b : Landroid/util/TypedValue;
    //   407: astore #10
    //   409: aload #10
    //   411: ifnull -> 515
    //   414: aload #10
    //   416: getfield type : I
    //   419: istore_1
    //   420: iload_1
    //   421: ifeq -> 515
    //   424: iload_1
    //   425: iconst_5
    //   426: if_icmpne -> 443
    //   429: aload #10
    //   431: aload #11
    //   433: invokevirtual getDimension : (Landroid/util/DisplayMetrics;)F
    //   436: fstore_3
    //   437: fload_3
    //   438: f2i
    //   439: istore_1
    //   440: goto -> 470
    //   443: iload_1
    //   444: bipush #6
    //   446: if_icmpne -> 468
    //   449: aload #11
    //   451: getfield widthPixels : I
    //   454: istore_1
    //   455: aload #10
    //   457: iload_1
    //   458: i2f
    //   459: iload_1
    //   460: i2f
    //   461: invokevirtual getFraction : (FF)F
    //   464: fstore_3
    //   465: goto -> 437
    //   468: iconst_0
    //   469: istore_1
    //   470: iload_1
    //   471: istore_2
    //   472: iload_1
    //   473: ifle -> 496
    //   476: aload_0
    //   477: getfield h : Landroid/graphics/Rect;
    //   480: astore #10
    //   482: iload_1
    //   483: aload #10
    //   485: getfield left : I
    //   488: aload #10
    //   490: getfield right : I
    //   493: iadd
    //   494: isub
    //   495: istore_2
    //   496: iload #7
    //   498: iload_2
    //   499: if_icmpge -> 515
    //   502: iload_2
    //   503: ldc 1073741824
    //   505: invokestatic makeMeasureSpec : (II)I
    //   508: istore_1
    //   509: iload #8
    //   511: istore_2
    //   512: goto -> 520
    //   515: iconst_0
    //   516: istore_2
    //   517: iload #6
    //   519: istore_1
    //   520: iload_2
    //   521: ifeq -> 531
    //   524: aload_0
    //   525: iload_1
    //   526: iload #5
    //   528: invokespecial onMeasure : (II)V
    //   531: return
  }
  
  public void setAttachListener(a parama) {
    this.i = parama;
  }
  
  public static interface a {}
}


/* Location:              C:\Users\panch\Downloads\dvba_v1.1.0-dex2jar.jar!\androidx\appcompat\widget\ContentFrameLayout.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */