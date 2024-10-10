package b.b.m.a;

import android.animation.ObjectAnimator;
import android.animation.TimeInterpolator;
import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.AnimationDrawable;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.util.StateSet;
import b.f.i;
import b.i.f.k.a;
import org.xmlpull.v1.XmlPullParser;

@SuppressLint({"RestrictedAPI"})
public class a extends d implements a {
  public c p;
  
  public g q;
  
  public int r = -1;
  
  public int s = -1;
  
  public boolean t;
  
  public a() {
    this(null, null);
  }
  
  public a(c paramc, Resources paramResources) {
    super(null);
    paramc = new c(paramc, this, paramResources);
    super.f(paramc);
    this.p = paramc;
    onStateChange(getState());
    jumpToCurrentState();
  }
  
  public static a h(Context paramContext, Resources paramResources, XmlPullParser paramXmlPullParser, AttributeSet paramAttributeSet, Resources.Theme paramTheme) {
    // Byte code:
    //   0: aload_2
    //   1: invokeinterface getName : ()Ljava/lang/String;
    //   6: astore #13
    //   8: aload #13
    //   10: ldc 'animated-selector'
    //   12: invokevirtual equals : (Ljava/lang/Object;)Z
    //   15: ifeq -> 906
    //   18: new b/b/m/a/a
    //   21: dup
    //   22: aconst_null
    //   23: aconst_null
    //   24: invokespecial <init> : (Lb/b/m/a/a$c;Landroid/content/res/Resources;)V
    //   27: astore #15
    //   29: aload_1
    //   30: aload #4
    //   32: aload_3
    //   33: getstatic b/b/n/b.AnimatedStateListDrawableCompat : [I
    //   36: invokestatic a0 : (Landroid/content/res/Resources;Landroid/content/res/Resources$Theme;Landroid/util/AttributeSet;[I)Landroid/content/res/TypedArray;
    //   39: astore #14
    //   41: aload #15
    //   43: aload #14
    //   45: getstatic b/b/n/b.AnimatedStateListDrawableCompat_android_visible : I
    //   48: iconst_1
    //   49: invokevirtual getBoolean : (IZ)Z
    //   52: iconst_1
    //   53: invokevirtual setVisible : (ZZ)Z
    //   56: pop
    //   57: aload #15
    //   59: getfield p : Lb/b/m/a/a$c;
    //   62: astore #13
    //   64: aload #13
    //   66: aload #13
    //   68: getfield d : I
    //   71: aload #14
    //   73: invokevirtual getChangingConfigurations : ()I
    //   76: ior
    //   77: putfield d : I
    //   80: aload #13
    //   82: aload #14
    //   84: getstatic b/b/n/b.AnimatedStateListDrawableCompat_android_variablePadding : I
    //   87: aload #13
    //   89: getfield i : Z
    //   92: invokevirtual getBoolean : (IZ)Z
    //   95: putfield i : Z
    //   98: aload #13
    //   100: aload #14
    //   102: getstatic b/b/n/b.AnimatedStateListDrawableCompat_android_constantSize : I
    //   105: aload #13
    //   107: getfield l : Z
    //   110: invokevirtual getBoolean : (IZ)Z
    //   113: putfield l : Z
    //   116: aload #13
    //   118: aload #14
    //   120: getstatic b/b/n/b.AnimatedStateListDrawableCompat_android_enterFadeDuration : I
    //   123: aload #13
    //   125: getfield A : I
    //   128: invokevirtual getInt : (II)I
    //   131: putfield A : I
    //   134: aload #13
    //   136: aload #14
    //   138: getstatic b/b/n/b.AnimatedStateListDrawableCompat_android_exitFadeDuration : I
    //   141: aload #13
    //   143: getfield B : I
    //   146: invokevirtual getInt : (II)I
    //   149: putfield B : I
    //   152: aload #15
    //   154: aload #14
    //   156: getstatic b/b/n/b.AnimatedStateListDrawableCompat_android_dither : I
    //   159: aload #13
    //   161: getfield x : Z
    //   164: invokevirtual getBoolean : (IZ)Z
    //   167: invokevirtual setDither : (Z)V
    //   170: aload #15
    //   172: getfield b : Lb/b/m/a/b$c;
    //   175: aload_1
    //   176: invokevirtual f : (Landroid/content/res/Resources;)V
    //   179: aload #14
    //   181: invokevirtual recycle : ()V
    //   184: aload_2
    //   185: invokeinterface getDepth : ()I
    //   190: iconst_1
    //   191: iadd
    //   192: istore #9
    //   194: aconst_null
    //   195: astore #13
    //   197: aload_2
    //   198: invokeinterface next : ()I
    //   203: istore #5
    //   205: iload #5
    //   207: iconst_1
    //   208: if_icmpeq -> 892
    //   211: aload_2
    //   212: invokeinterface getDepth : ()I
    //   217: istore #6
    //   219: iload #6
    //   221: iload #9
    //   223: if_icmpge -> 232
    //   226: iload #5
    //   228: iconst_3
    //   229: if_icmpeq -> 892
    //   232: iload #5
    //   234: iconst_2
    //   235: if_icmpeq -> 241
    //   238: goto -> 194
    //   241: iload #6
    //   243: iload #9
    //   245: if_icmple -> 251
    //   248: goto -> 194
    //   251: aload_2
    //   252: invokeinterface getName : ()Ljava/lang/String;
    //   257: ldc 'item'
    //   259: invokevirtual equals : (Ljava/lang/Object;)Z
    //   262: ifeq -> 607
    //   265: aload_1
    //   266: aload #4
    //   268: aload_3
    //   269: getstatic b/b/n/b.AnimatedStateListDrawableItem : [I
    //   272: invokestatic a0 : (Landroid/content/res/Resources;Landroid/content/res/Resources$Theme;Landroid/util/AttributeSet;[I)Landroid/content/res/TypedArray;
    //   275: astore #14
    //   277: aload #14
    //   279: getstatic b/b/n/b.AnimatedStateListDrawableItem_android_id : I
    //   282: iconst_0
    //   283: invokevirtual getResourceId : (II)I
    //   286: istore #10
    //   288: aload #14
    //   290: getstatic b/b/n/b.AnimatedStateListDrawableItem_android_drawable : I
    //   293: iconst_m1
    //   294: invokevirtual getResourceId : (II)I
    //   297: istore #5
    //   299: iload #5
    //   301: ifle -> 315
    //   304: invokestatic d : ()Lb/b/p/n0;
    //   307: aload_0
    //   308: iload #5
    //   310: invokevirtual f : (Landroid/content/Context;I)Landroid/graphics/drawable/Drawable;
    //   313: astore #13
    //   315: aload #14
    //   317: invokevirtual recycle : ()V
    //   320: aload_3
    //   321: invokeinterface getAttributeCount : ()I
    //   326: istore #11
    //   328: iload #11
    //   330: newarray int
    //   332: astore #14
    //   334: iconst_0
    //   335: istore #6
    //   337: iconst_0
    //   338: istore #5
    //   340: iload #5
    //   342: iload #11
    //   344: if_icmpge -> 435
    //   347: aload_3
    //   348: iload #5
    //   350: invokeinterface getAttributeNameResource : (I)I
    //   355: istore #8
    //   357: iload #6
    //   359: istore #7
    //   361: iload #8
    //   363: ifeq -> 425
    //   366: iload #6
    //   368: istore #7
    //   370: iload #8
    //   372: ldc 16842960
    //   374: if_icmpeq -> 425
    //   377: iload #6
    //   379: istore #7
    //   381: iload #8
    //   383: ldc 16843161
    //   385: if_icmpeq -> 425
    //   388: aload_3
    //   389: iload #5
    //   391: iconst_0
    //   392: invokeinterface getAttributeBooleanValue : (IZ)Z
    //   397: ifeq -> 407
    //   400: iload #8
    //   402: istore #7
    //   404: goto -> 412
    //   407: iload #8
    //   409: ineg
    //   410: istore #7
    //   412: aload #14
    //   414: iload #6
    //   416: iload #7
    //   418: iastore
    //   419: iload #6
    //   421: iconst_1
    //   422: iadd
    //   423: istore #7
    //   425: iinc #5, 1
    //   428: iload #7
    //   430: istore #6
    //   432: goto -> 340
    //   435: aload #14
    //   437: iload #6
    //   439: invokestatic trimStateSet : ([II)[I
    //   442: astore #16
    //   444: aload #13
    //   446: astore #14
    //   448: aload #13
    //   450: ifnonnull -> 537
    //   453: aload_2
    //   454: invokeinterface next : ()I
    //   459: istore #5
    //   461: iload #5
    //   463: iconst_4
    //   464: if_icmpne -> 470
    //   467: goto -> 453
    //   470: iload #5
    //   472: iconst_2
    //   473: if_icmpne -> 516
    //   476: aload_2
    //   477: invokeinterface getName : ()Ljava/lang/String;
    //   482: ldc 'vector'
    //   484: invokevirtual equals : (Ljava/lang/Object;)Z
    //   487: ifeq -> 503
    //   490: aload_1
    //   491: aload_2
    //   492: aload_3
    //   493: aload #4
    //   495: invokestatic c : (Landroid/content/res/Resources;Lorg/xmlpull/v1/XmlPullParser;Landroid/util/AttributeSet;Landroid/content/res/Resources$Theme;)Lb/u/a/a/f;
    //   498: astore #14
    //   500: goto -> 537
    //   503: aload_1
    //   504: aload_2
    //   505: aload_3
    //   506: aload #4
    //   508: invokestatic createFromXmlInner : (Landroid/content/res/Resources;Lorg/xmlpull/v1/XmlPullParser;Landroid/util/AttributeSet;Landroid/content/res/Resources$Theme;)Landroid/graphics/drawable/Drawable;
    //   511: astore #14
    //   513: goto -> 537
    //   516: new org/xmlpull/v1/XmlPullParserException
    //   519: dup
    //   520: aload_2
    //   521: new java/lang/StringBuilder
    //   524: dup
    //   525: invokespecial <init> : ()V
    //   528: ldc ': <item> tag requires a 'drawable' attribute or child tag defining a drawable'
    //   530: invokestatic d : (Lorg/xmlpull/v1/XmlPullParser;Ljava/lang/StringBuilder;Ljava/lang/String;)Ljava/lang/String;
    //   533: invokespecial <init> : (Ljava/lang/String;)V
    //   536: athrow
    //   537: aload #14
    //   539: ifnull -> 586
    //   542: aload #15
    //   544: getfield p : Lb/b/m/a/a$c;
    //   547: astore #13
    //   549: aload #13
    //   551: aload #14
    //   553: invokevirtual a : (Landroid/graphics/drawable/Drawable;)I
    //   556: istore #5
    //   558: aload #13
    //   560: getfield J : [[I
    //   563: iload #5
    //   565: aload #16
    //   567: aastore
    //   568: aload #13
    //   570: getfield L : Lb/f/i;
    //   573: iload #5
    //   575: iload #10
    //   577: invokestatic valueOf : (I)Ljava/lang/Integer;
    //   580: invokevirtual g : (ILjava/lang/Object;)V
    //   583: goto -> 889
    //   586: new org/xmlpull/v1/XmlPullParserException
    //   589: dup
    //   590: aload_2
    //   591: new java/lang/StringBuilder
    //   594: dup
    //   595: invokespecial <init> : ()V
    //   598: ldc ': <item> tag requires a 'drawable' attribute or child tag defining a drawable'
    //   600: invokestatic d : (Lorg/xmlpull/v1/XmlPullParser;Ljava/lang/StringBuilder;Ljava/lang/String;)Ljava/lang/String;
    //   603: invokespecial <init> : (Ljava/lang/String;)V
    //   606: athrow
    //   607: aload_2
    //   608: invokeinterface getName : ()Ljava/lang/String;
    //   613: ldc_w 'transition'
    //   616: invokevirtual equals : (Ljava/lang/Object;)Z
    //   619: ifeq -> 889
    //   622: aload_1
    //   623: aload #4
    //   625: aload_3
    //   626: getstatic b/b/n/b.AnimatedStateListDrawableTransition : [I
    //   629: invokestatic a0 : (Landroid/content/res/Resources;Landroid/content/res/Resources$Theme;Landroid/util/AttributeSet;[I)Landroid/content/res/TypedArray;
    //   632: astore #14
    //   634: aload #14
    //   636: getstatic b/b/n/b.AnimatedStateListDrawableTransition_android_fromId : I
    //   639: iconst_m1
    //   640: invokevirtual getResourceId : (II)I
    //   643: istore #5
    //   645: aload #14
    //   647: getstatic b/b/n/b.AnimatedStateListDrawableTransition_android_toId : I
    //   650: iconst_m1
    //   651: invokevirtual getResourceId : (II)I
    //   654: istore #6
    //   656: aload #14
    //   658: getstatic b/b/n/b.AnimatedStateListDrawableTransition_android_drawable : I
    //   661: iconst_m1
    //   662: invokevirtual getResourceId : (II)I
    //   665: istore #7
    //   667: iload #7
    //   669: ifle -> 686
    //   672: invokestatic d : ()Lb/b/p/n0;
    //   675: aload_0
    //   676: iload #7
    //   678: invokevirtual f : (Landroid/content/Context;I)Landroid/graphics/drawable/Drawable;
    //   681: astore #13
    //   683: goto -> 689
    //   686: aconst_null
    //   687: astore #13
    //   689: aload #14
    //   691: getstatic b/b/n/b.AnimatedStateListDrawableTransition_android_reversible : I
    //   694: iconst_0
    //   695: invokevirtual getBoolean : (IZ)Z
    //   698: istore #12
    //   700: aload #14
    //   702: invokevirtual recycle : ()V
    //   705: aload #13
    //   707: ifnonnull -> 808
    //   710: aload_2
    //   711: invokeinterface next : ()I
    //   716: istore #7
    //   718: iload #7
    //   720: iconst_4
    //   721: if_icmpne -> 727
    //   724: goto -> 710
    //   727: iload #7
    //   729: iconst_2
    //   730: if_icmpne -> 786
    //   733: aload_2
    //   734: invokeinterface getName : ()Ljava/lang/String;
    //   739: ldc_w 'animated-vector'
    //   742: invokevirtual equals : (Ljava/lang/Object;)Z
    //   745: ifeq -> 773
    //   748: new b/u/a/a/b
    //   751: dup
    //   752: aload_0
    //   753: aconst_null
    //   754: aconst_null
    //   755: invokespecial <init> : (Landroid/content/Context;Lb/u/a/a/b$b;Landroid/content/res/Resources;)V
    //   758: astore #13
    //   760: aload #13
    //   762: aload_1
    //   763: aload_2
    //   764: aload_3
    //   765: aload #4
    //   767: invokevirtual inflate : (Landroid/content/res/Resources;Lorg/xmlpull/v1/XmlPullParser;Landroid/util/AttributeSet;Landroid/content/res/Resources$Theme;)V
    //   770: goto -> 808
    //   773: aload_1
    //   774: aload_2
    //   775: aload_3
    //   776: aload #4
    //   778: invokestatic createFromXmlInner : (Landroid/content/res/Resources;Lorg/xmlpull/v1/XmlPullParser;Landroid/util/AttributeSet;Landroid/content/res/Resources$Theme;)Landroid/graphics/drawable/Drawable;
    //   781: astore #13
    //   783: goto -> 808
    //   786: new org/xmlpull/v1/XmlPullParserException
    //   789: dup
    //   790: aload_2
    //   791: new java/lang/StringBuilder
    //   794: dup
    //   795: invokespecial <init> : ()V
    //   798: ldc_w ': <transition> tag requires a 'drawable' attribute or child tag defining a drawable'
    //   801: invokestatic d : (Lorg/xmlpull/v1/XmlPullParser;Ljava/lang/StringBuilder;Ljava/lang/String;)Ljava/lang/String;
    //   804: invokespecial <init> : (Ljava/lang/String;)V
    //   807: athrow
    //   808: aload #13
    //   810: ifnull -> 867
    //   813: iload #5
    //   815: iconst_m1
    //   816: if_icmpeq -> 845
    //   819: iload #6
    //   821: iconst_m1
    //   822: if_icmpeq -> 845
    //   825: aload #15
    //   827: getfield p : Lb/b/m/a/a$c;
    //   830: iload #5
    //   832: iload #6
    //   834: aload #13
    //   836: iload #12
    //   838: invokevirtual h : (IILandroid/graphics/drawable/Drawable;Z)I
    //   841: pop
    //   842: goto -> 889
    //   845: new org/xmlpull/v1/XmlPullParserException
    //   848: dup
    //   849: aload_2
    //   850: new java/lang/StringBuilder
    //   853: dup
    //   854: invokespecial <init> : ()V
    //   857: ldc_w ': <transition> tag requires 'fromId' & 'toId' attributes'
    //   860: invokestatic d : (Lorg/xmlpull/v1/XmlPullParser;Ljava/lang/StringBuilder;Ljava/lang/String;)Ljava/lang/String;
    //   863: invokespecial <init> : (Ljava/lang/String;)V
    //   866: athrow
    //   867: new org/xmlpull/v1/XmlPullParserException
    //   870: dup
    //   871: aload_2
    //   872: new java/lang/StringBuilder
    //   875: dup
    //   876: invokespecial <init> : ()V
    //   879: ldc_w ': <transition> tag requires a 'drawable' attribute or child tag defining a drawable'
    //   882: invokestatic d : (Lorg/xmlpull/v1/XmlPullParser;Ljava/lang/StringBuilder;Ljava/lang/String;)Ljava/lang/String;
    //   885: invokespecial <init> : (Ljava/lang/String;)V
    //   888: athrow
    //   889: goto -> 194
    //   892: aload #15
    //   894: aload #15
    //   896: invokevirtual getState : ()[I
    //   899: invokevirtual onStateChange : ([I)Z
    //   902: pop
    //   903: aload #15
    //   905: areturn
    //   906: new java/lang/StringBuilder
    //   909: dup
    //   910: invokespecial <init> : ()V
    //   913: astore_0
    //   914: aload_0
    //   915: aload_2
    //   916: invokeinterface getPositionDescription : ()Ljava/lang/String;
    //   921: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   924: pop
    //   925: aload_0
    //   926: ldc_w ': invalid animated-selector tag '
    //   929: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   932: pop
    //   933: aload_0
    //   934: aload #13
    //   936: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   939: pop
    //   940: new org/xmlpull/v1/XmlPullParserException
    //   943: dup
    //   944: aload_0
    //   945: invokevirtual toString : ()Ljava/lang/String;
    //   948: invokespecial <init> : (Ljava/lang/String;)V
    //   951: athrow
  }
  
  public b.c b() {
    return new c(this.p, this, null);
  }
  
  public void f(b.c paramc) {
    super.f(paramc);
    if (paramc instanceof c)
      this.p = (c)paramc; 
  }
  
  public d.a g() {
    return new c(this.p, this, null);
  }
  
  public boolean isStateful() {
    return true;
  }
  
  public void jumpToCurrentState() {
    super.jumpToCurrentState();
    g g1 = this.q;
    if (g1 != null) {
      g1.d();
      this.q = null;
      e(this.r);
      this.r = -1;
      this.s = -1;
    } 
  }
  
  public Drawable mutate() {
    if (!this.t) {
      super.mutate();
      this.p.e();
      this.t = true;
    } 
    return this;
  }
  
  public boolean onStateChange(int[] paramArrayOfint) {
    // Byte code:
    //   0: aload_0
    //   1: getfield p : Lb/b/m/a/a$c;
    //   4: aload_1
    //   5: invokevirtual k : ([I)I
    //   8: istore_3
    //   9: aload_0
    //   10: getfield h : I
    //   13: istore_2
    //   14: iconst_0
    //   15: istore #11
    //   17: iload #11
    //   19: istore #9
    //   21: iload_3
    //   22: iload_2
    //   23: if_icmpeq -> 421
    //   26: aload_0
    //   27: getfield q : Lb/b/m/a/a$g;
    //   30: astore #12
    //   32: aload #12
    //   34: ifnull -> 97
    //   37: iload_3
    //   38: aload_0
    //   39: getfield r : I
    //   42: if_icmpne -> 50
    //   45: iconst_1
    //   46: istore_2
    //   47: goto -> 402
    //   50: iload_3
    //   51: aload_0
    //   52: getfield s : I
    //   55: if_icmpne -> 87
    //   58: aload #12
    //   60: invokevirtual a : ()Z
    //   63: ifeq -> 87
    //   66: aload #12
    //   68: invokevirtual b : ()V
    //   71: aload_0
    //   72: aload_0
    //   73: getfield s : I
    //   76: putfield r : I
    //   79: aload_0
    //   80: iload_3
    //   81: putfield s : I
    //   84: goto -> 45
    //   87: aload_0
    //   88: getfield r : I
    //   91: istore_2
    //   92: aload #12
    //   94: invokevirtual d : ()V
    //   97: aload_0
    //   98: aconst_null
    //   99: putfield q : Lb/b/m/a/a$g;
    //   102: aload_0
    //   103: iconst_m1
    //   104: putfield s : I
    //   107: aload_0
    //   108: iconst_m1
    //   109: putfield r : I
    //   112: aload_0
    //   113: getfield p : Lb/b/m/a/a$c;
    //   116: astore #12
    //   118: aload #12
    //   120: iload_2
    //   121: invokevirtual j : (I)I
    //   124: istore #4
    //   126: aload #12
    //   128: iload_3
    //   129: invokevirtual j : (I)I
    //   132: istore #5
    //   134: iload #5
    //   136: ifeq -> 400
    //   139: iload #4
    //   141: ifne -> 147
    //   144: goto -> 400
    //   147: iload #4
    //   149: iload #5
    //   151: invokestatic i : (II)J
    //   154: lstore #7
    //   156: aload #12
    //   158: getfield K : Lb/f/e;
    //   161: lload #7
    //   163: ldc2_w -1
    //   166: invokestatic valueOf : (J)Ljava/lang/Long;
    //   169: invokevirtual f : (JLjava/lang/Object;)Ljava/lang/Object;
    //   172: checkcast java/lang/Long
    //   175: invokevirtual longValue : ()J
    //   178: l2i
    //   179: istore #6
    //   181: iload #6
    //   183: ifge -> 189
    //   186: goto -> 400
    //   189: iload #4
    //   191: iload #5
    //   193: invokestatic i : (II)J
    //   196: lstore #7
    //   198: aload #12
    //   200: getfield K : Lb/f/e;
    //   203: lload #7
    //   205: ldc2_w -1
    //   208: invokestatic valueOf : (J)Ljava/lang/Long;
    //   211: invokevirtual f : (JLjava/lang/Object;)Ljava/lang/Object;
    //   214: checkcast java/lang/Long
    //   217: invokevirtual longValue : ()J
    //   220: ldc2_w 8589934592
    //   223: land
    //   224: lconst_0
    //   225: lcmp
    //   226: ifeq -> 235
    //   229: iconst_1
    //   230: istore #9
    //   232: goto -> 238
    //   235: iconst_0
    //   236: istore #9
    //   238: aload_0
    //   239: iload #6
    //   241: invokevirtual e : (I)Z
    //   244: pop
    //   245: aload_0
    //   246: getfield d : Landroid/graphics/drawable/Drawable;
    //   249: astore #13
    //   251: aload #13
    //   253: instanceof android/graphics/drawable/AnimationDrawable
    //   256: ifeq -> 329
    //   259: iload #4
    //   261: iload #5
    //   263: invokestatic i : (II)J
    //   266: lstore #7
    //   268: aload #12
    //   270: getfield K : Lb/f/e;
    //   273: lload #7
    //   275: ldc2_w -1
    //   278: invokestatic valueOf : (J)Ljava/lang/Long;
    //   281: invokevirtual f : (JLjava/lang/Object;)Ljava/lang/Object;
    //   284: checkcast java/lang/Long
    //   287: invokevirtual longValue : ()J
    //   290: ldc2_w 4294967296
    //   293: land
    //   294: lconst_0
    //   295: lcmp
    //   296: ifeq -> 305
    //   299: iconst_1
    //   300: istore #10
    //   302: goto -> 308
    //   305: iconst_0
    //   306: istore #10
    //   308: new b/b/m/a/a$e
    //   311: dup
    //   312: aload #13
    //   314: checkcast android/graphics/drawable/AnimationDrawable
    //   317: iload #10
    //   319: iload #9
    //   321: invokespecial <init> : (Landroid/graphics/drawable/AnimationDrawable;ZZ)V
    //   324: astore #12
    //   326: goto -> 376
    //   329: aload #13
    //   331: instanceof b/u/a/a/b
    //   334: ifeq -> 354
    //   337: new b/b/m/a/a$d
    //   340: dup
    //   341: aload #13
    //   343: checkcast b/u/a/a/b
    //   346: invokespecial <init> : (Lb/u/a/a/b;)V
    //   349: astore #12
    //   351: goto -> 376
    //   354: aload #13
    //   356: instanceof android/graphics/drawable/Animatable
    //   359: ifeq -> 400
    //   362: new b/b/m/a/a$b
    //   365: dup
    //   366: aload #13
    //   368: checkcast android/graphics/drawable/Animatable
    //   371: invokespecial <init> : (Landroid/graphics/drawable/Animatable;)V
    //   374: astore #12
    //   376: aload #12
    //   378: invokevirtual c : ()V
    //   381: aload_0
    //   382: aload #12
    //   384: putfield q : Lb/b/m/a/a$g;
    //   387: aload_0
    //   388: iload_2
    //   389: putfield s : I
    //   392: aload_0
    //   393: iload_3
    //   394: putfield r : I
    //   397: goto -> 45
    //   400: iconst_0
    //   401: istore_2
    //   402: iload_2
    //   403: ifne -> 418
    //   406: iload #11
    //   408: istore #9
    //   410: aload_0
    //   411: iload_3
    //   412: invokevirtual e : (I)Z
    //   415: ifeq -> 421
    //   418: iconst_1
    //   419: istore #9
    //   421: aload_0
    //   422: getfield d : Landroid/graphics/drawable/Drawable;
    //   425: astore #12
    //   427: iload #9
    //   429: istore #10
    //   431: aload #12
    //   433: ifnull -> 447
    //   436: iload #9
    //   438: aload #12
    //   440: aload_1
    //   441: invokevirtual setState : ([I)Z
    //   444: ior
    //   445: istore #10
    //   447: iload #10
    //   449: ireturn
  }
  
  public boolean setVisible(boolean paramBoolean1, boolean paramBoolean2) {
    boolean bool = super.setVisible(paramBoolean1, paramBoolean2);
    if (this.q != null && (bool || paramBoolean2))
      if (paramBoolean1) {
        this.q.c();
      } else {
        jumpToCurrentState();
      }  
    return bool;
  }
  
  public static class b extends g {
    public final Animatable a;
    
    public b(Animatable param1Animatable) {
      super(null);
      this.a = param1Animatable;
    }
    
    public void c() {
      this.a.start();
    }
    
    public void d() {
      this.a.stop();
    }
  }
  
  public static class c extends d.a {
    public b.f.e<Long> K;
    
    public i<Integer> L;
    
    public c(c param1c, a param1a, Resources param1Resources) {
      super(param1c, param1a, param1Resources);
      i<Integer> i1;
      if (param1c != null) {
        this.K = param1c.K;
        i1 = param1c.L;
      } else {
        this.K = new b.f.e();
        i1 = new i(10);
      } 
      this.L = i1;
    }
    
    public static long i(int param1Int1, int param1Int2) {
      long l = param1Int1;
      return param1Int2 | l << 32L;
    }
    
    public void e() {
      this.K = this.K.c();
      this.L = this.L.b();
    }
    
    public int h(int param1Int1, int param1Int2, Drawable param1Drawable, boolean param1Boolean) {
      long l1;
      int j = a(param1Drawable);
      long l2 = i(param1Int1, param1Int2);
      if (param1Boolean) {
        l1 = 8589934592L;
      } else {
        l1 = 0L;
      } 
      b.f.e<Long> e1 = this.K;
      long l3 = j;
      e1.a(l2, Long.valueOf(l3 | l1));
      if (param1Boolean) {
        l2 = i(param1Int2, param1Int1);
        this.K.a(l2, Long.valueOf(0x100000000L | l3 | l1));
      } 
      return j;
    }
    
    public int j(int param1Int) {
      boolean bool = false;
      if (param1Int < 0) {
        param1Int = bool;
      } else {
        param1Int = ((Integer)this.L.e(param1Int, Integer.valueOf(0))).intValue();
      } 
      return param1Int;
    }
    
    public int k(int[] param1ArrayOfint) {
      int j = g(param1ArrayOfint);
      return (j >= 0) ? j : g(StateSet.WILD_CARD);
    }
    
    public Drawable newDrawable() {
      return new a(this, null);
    }
    
    public Drawable newDrawable(Resources param1Resources) {
      return new a(this, param1Resources);
    }
  }
  
  public static class d extends g {
    public final b.u.a.a.b a;
    
    public d(b.u.a.a.b param1b) {
      super(null);
      this.a = param1b;
    }
    
    public void c() {
      this.a.start();
    }
    
    public void d() {
      this.a.stop();
    }
  }
  
  public static class e extends g {
    public final ObjectAnimator a;
    
    public final boolean b;
    
    public e(AnimationDrawable param1AnimationDrawable, boolean param1Boolean1, boolean param1Boolean2) {
      super(null);
      boolean bool;
      int i = param1AnimationDrawable.getNumberOfFrames();
      if (param1Boolean1) {
        bool = i - 1;
      } else {
        bool = false;
      } 
      if (param1Boolean1) {
        i = 0;
      } else {
        i--;
      } 
      a.f f = new a.f(param1AnimationDrawable, param1Boolean1);
      ObjectAnimator objectAnimator = ObjectAnimator.ofInt(param1AnimationDrawable, "currentIndex", new int[] { bool, i });
      objectAnimator.setAutoCancel(true);
      objectAnimator.setDuration(f.c);
      objectAnimator.setInterpolator(f);
      this.b = param1Boolean2;
      this.a = objectAnimator;
    }
    
    public boolean a() {
      return this.b;
    }
    
    public void b() {
      this.a.reverse();
    }
    
    public void c() {
      this.a.start();
    }
    
    public void d() {
      this.a.cancel();
    }
  }
  
  public static class f implements TimeInterpolator {
    public int[] a;
    
    public int b;
    
    public int c;
    
    public f(AnimationDrawable param1AnimationDrawable, boolean param1Boolean) {
      int j = param1AnimationDrawable.getNumberOfFrames();
      this.b = j;
      int[] arrayOfInt = this.a;
      if (arrayOfInt == null || arrayOfInt.length < j)
        this.a = new int[j]; 
      arrayOfInt = this.a;
      byte b = 0;
      int i = 0;
      while (b < j) {
        if (param1Boolean) {
          k = j - b - 1;
        } else {
          k = b;
        } 
        int k = param1AnimationDrawable.getDuration(k);
        arrayOfInt[b] = k;
        i += k;
        b++;
      } 
      this.c = i;
    }
    
    public float getInterpolation(float param1Float) {
      int i = (int)(param1Float * this.c + 0.5F);
      int j = this.b;
      int[] arrayOfInt = this.a;
      byte b;
      for (b = 0; b < j && i >= arrayOfInt[b]; b++)
        i -= arrayOfInt[b]; 
      if (b < j) {
        param1Float = i / this.c;
      } else {
        param1Float = 0.0F;
      } 
      return b / j + param1Float;
    }
  }
  
  public static abstract class g {
    public g(a.a param1a) {}
    
    public boolean a() {
      return false;
    }
    
    public void b() {}
    
    public abstract void c();
    
    public abstract void d();
  }
}


/* Location:              C:\Users\panch\Downloads\dvba_v1.1.0-dex2jar.jar!\b\b\m\a\a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */