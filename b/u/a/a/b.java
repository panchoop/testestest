package b.u.a.a;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ArgbEvaluator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.AnimatedVectorDrawable;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.AttributeSet;
import java.util.ArrayList;
import org.xmlpull.v1.XmlPullParser;

public class b extends e implements Animatable {
  public b c;
  
  public Context d;
  
  public ArgbEvaluator e = null;
  
  public final Drawable.Callback f = new a(this);
  
  public b() {
    this(null, null, null);
  }
  
  public b(Context paramContext, b paramb, Resources paramResources) {
    this.d = paramContext;
    this.c = new b(null, this.f, null);
  }
  
  public void applyTheme(Resources.Theme paramTheme) {
    Drawable drawable = this.b;
    if (drawable != null)
      drawable.applyTheme(paramTheme); 
  }
  
  public boolean canApplyTheme() {
    Drawable drawable = this.b;
    return (drawable != null) ? drawable.canApplyTheme() : false;
  }
  
  public void draw(Canvas paramCanvas) {
    Drawable drawable = this.b;
    if (drawable != null) {
      drawable.draw(paramCanvas);
      return;
    } 
    this.c.b.draw(paramCanvas);
    if (this.c.c.isStarted())
      invalidateSelf(); 
  }
  
  public int getAlpha() {
    Drawable drawable = this.b;
    return (drawable != null) ? drawable.getAlpha() : this.c.b.getAlpha();
  }
  
  public int getChangingConfigurations() {
    Drawable drawable = this.b;
    return (drawable != null) ? drawable.getChangingConfigurations() : (super.getChangingConfigurations() | this.c.a);
  }
  
  public ColorFilter getColorFilter() {
    Drawable drawable = this.b;
    return (drawable != null) ? drawable.getColorFilter() : this.c.b.getColorFilter();
  }
  
  public Drawable.ConstantState getConstantState() {
    return (this.b != null && Build.VERSION.SDK_INT >= 24) ? new c(this.b.getConstantState()) : null;
  }
  
  public int getIntrinsicHeight() {
    Drawable drawable = this.b;
    return (drawable != null) ? drawable.getIntrinsicHeight() : this.c.b.getIntrinsicHeight();
  }
  
  public int getIntrinsicWidth() {
    Drawable drawable = this.b;
    return (drawable != null) ? drawable.getIntrinsicWidth() : this.c.b.getIntrinsicWidth();
  }
  
  public int getOpacity() {
    Drawable drawable = this.b;
    return (drawable != null) ? drawable.getOpacity() : this.c.b.getOpacity();
  }
  
  public void inflate(Resources paramResources, XmlPullParser paramXmlPullParser, AttributeSet paramAttributeSet) {
    inflate(paramResources, paramXmlPullParser, paramAttributeSet, null);
  }
  
  public void inflate(Resources paramResources, XmlPullParser paramXmlPullParser, AttributeSet paramAttributeSet, Resources.Theme paramTheme) {
    // Byte code:
    //   0: aload_0
    //   1: getfield b : Landroid/graphics/drawable/Drawable;
    //   4: astore #8
    //   6: aload #8
    //   8: ifnull -> 22
    //   11: aload #8
    //   13: aload_1
    //   14: aload_2
    //   15: aload_3
    //   16: aload #4
    //   18: invokevirtual inflate : (Landroid/content/res/Resources;Lorg/xmlpull/v1/XmlPullParser;Landroid/util/AttributeSet;Landroid/content/res/Resources$Theme;)V
    //   21: return
    //   22: aload_2
    //   23: invokeinterface getEventType : ()I
    //   28: istore #5
    //   30: aload_2
    //   31: invokeinterface getDepth : ()I
    //   36: istore #6
    //   38: iload #5
    //   40: iconst_1
    //   41: if_icmpeq -> 669
    //   44: aload_2
    //   45: invokeinterface getDepth : ()I
    //   50: iload #6
    //   52: iconst_1
    //   53: iadd
    //   54: if_icmpge -> 63
    //   57: iload #5
    //   59: iconst_3
    //   60: if_icmpeq -> 669
    //   63: iload #5
    //   65: iconst_2
    //   66: if_icmpne -> 658
    //   69: aload_2
    //   70: invokeinterface getName : ()Ljava/lang/String;
    //   75: astore #8
    //   77: ldc 'animated-vector'
    //   79: aload #8
    //   81: invokevirtual equals : (Ljava/lang/Object;)Z
    //   84: istore #7
    //   86: aconst_null
    //   87: astore #12
    //   89: aconst_null
    //   90: astore #11
    //   92: aconst_null
    //   93: astore #9
    //   95: iload #7
    //   97: ifeq -> 191
    //   100: aload_1
    //   101: aload #4
    //   103: aload_3
    //   104: getstatic b/u/a/a/a.e : [I
    //   107: invokestatic a0 : (Landroid/content/res/Resources;Landroid/content/res/Resources$Theme;Landroid/util/AttributeSet;[I)Landroid/content/res/TypedArray;
    //   110: astore #9
    //   112: aload #9
    //   114: iconst_0
    //   115: iconst_0
    //   116: invokevirtual getResourceId : (II)I
    //   119: istore #5
    //   121: aload #9
    //   123: astore #8
    //   125: iload #5
    //   127: ifeq -> 653
    //   130: aload_1
    //   131: iload #5
    //   133: aload #4
    //   135: invokestatic b : (Landroid/content/res/Resources;ILandroid/content/res/Resources$Theme;)Lb/u/a/a/f;
    //   138: astore #8
    //   140: aload #8
    //   142: iconst_0
    //   143: putfield g : Z
    //   146: aload #8
    //   148: aload_0
    //   149: getfield f : Landroid/graphics/drawable/Drawable$Callback;
    //   152: invokevirtual setCallback : (Landroid/graphics/drawable/Drawable$Callback;)V
    //   155: aload_0
    //   156: getfield c : Lb/u/a/a/b$b;
    //   159: getfield b : Lb/u/a/a/f;
    //   162: astore #10
    //   164: aload #10
    //   166: ifnull -> 175
    //   169: aload #10
    //   171: aconst_null
    //   172: invokevirtual setCallback : (Landroid/graphics/drawable/Drawable$Callback;)V
    //   175: aload_0
    //   176: getfield c : Lb/u/a/a/b$b;
    //   179: aload #8
    //   181: putfield b : Lb/u/a/a/f;
    //   184: aload #9
    //   186: astore #8
    //   188: goto -> 653
    //   191: ldc 'target'
    //   193: aload #8
    //   195: invokevirtual equals : (Ljava/lang/Object;)Z
    //   198: ifeq -> 658
    //   201: aload_1
    //   202: aload_3
    //   203: getstatic b/u/a/a/a.f : [I
    //   206: invokevirtual obtainAttributes : (Landroid/util/AttributeSet;[I)Landroid/content/res/TypedArray;
    //   209: astore #10
    //   211: aload #10
    //   213: iconst_0
    //   214: invokevirtual getString : (I)Ljava/lang/String;
    //   217: astore #13
    //   219: aload #10
    //   221: iconst_1
    //   222: iconst_0
    //   223: invokevirtual getResourceId : (II)I
    //   226: istore #5
    //   228: aload #10
    //   230: astore #8
    //   232: iload #5
    //   234: ifeq -> 653
    //   237: aload_0
    //   238: getfield d : Landroid/content/Context;
    //   241: astore #15
    //   243: aload #15
    //   245: ifnull -> 637
    //   248: getstatic android/os/Build$VERSION.SDK_INT : I
    //   251: bipush #24
    //   253: if_icmplt -> 268
    //   256: aload #15
    //   258: iload #5
    //   260: invokestatic loadAnimator : (Landroid/content/Context;I)Landroid/animation/Animator;
    //   263: astore #8
    //   265: goto -> 327
    //   268: aload #15
    //   270: invokevirtual getResources : ()Landroid/content/res/Resources;
    //   273: astore #14
    //   275: aload #15
    //   277: invokevirtual getTheme : ()Landroid/content/res/Resources$Theme;
    //   280: astore #16
    //   282: aload #9
    //   284: astore #8
    //   286: aload #14
    //   288: iload #5
    //   290: invokevirtual getAnimation : (I)Landroid/content/res/XmlResourceParser;
    //   293: astore #9
    //   295: aload #9
    //   297: invokestatic asAttributeSet : (Lorg/xmlpull/v1/XmlPullParser;)Landroid/util/AttributeSet;
    //   300: astore #8
    //   302: aload #15
    //   304: aload #14
    //   306: aload #16
    //   308: aload #9
    //   310: aload #8
    //   312: aconst_null
    //   313: iconst_0
    //   314: fconst_1
    //   315: invokestatic r : (Landroid/content/Context;Landroid/content/res/Resources;Landroid/content/res/Resources$Theme;Lorg/xmlpull/v1/XmlPullParser;Landroid/util/AttributeSet;Landroid/animation/AnimatorSet;IF)Landroid/animation/Animator;
    //   318: astore #8
    //   320: aload #9
    //   322: invokeinterface close : ()V
    //   327: aload #8
    //   329: aload_0
    //   330: getfield c : Lb/u/a/a/b$b;
    //   333: getfield b : Lb/u/a/a/f;
    //   336: getfield c : Lb/u/a/a/f$h;
    //   339: getfield b : Lb/u/a/a/f$g;
    //   342: getfield p : Lb/f/a;
    //   345: aload #13
    //   347: aconst_null
    //   348: invokevirtual getOrDefault : (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    //   351: invokevirtual setTarget : (Ljava/lang/Object;)V
    //   354: aload_0
    //   355: getfield c : Lb/u/a/a/b$b;
    //   358: astore #9
    //   360: aload #9
    //   362: getfield d : Ljava/util/ArrayList;
    //   365: ifnonnull -> 394
    //   368: aload #9
    //   370: new java/util/ArrayList
    //   373: dup
    //   374: invokespecial <init> : ()V
    //   377: putfield d : Ljava/util/ArrayList;
    //   380: aload_0
    //   381: getfield c : Lb/u/a/a/b$b;
    //   384: new b/f/a
    //   387: dup
    //   388: invokespecial <init> : ()V
    //   391: putfield e : Lb/f/a;
    //   394: aload_0
    //   395: getfield c : Lb/u/a/a/b$b;
    //   398: getfield d : Ljava/util/ArrayList;
    //   401: aload #8
    //   403: invokevirtual add : (Ljava/lang/Object;)Z
    //   406: pop
    //   407: aload_0
    //   408: getfield c : Lb/u/a/a/b$b;
    //   411: getfield e : Lb/f/a;
    //   414: aload #8
    //   416: aload #13
    //   418: invokevirtual put : (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    //   421: pop
    //   422: aload #10
    //   424: astore #8
    //   426: goto -> 653
    //   429: astore_1
    //   430: goto -> 442
    //   433: astore_1
    //   434: goto -> 451
    //   437: astore_1
    //   438: goto -> 623
    //   441: astore_1
    //   442: aload_1
    //   443: astore_2
    //   444: aload #9
    //   446: astore_1
    //   447: goto -> 467
    //   450: astore_1
    //   451: aload_1
    //   452: astore_2
    //   453: aload #9
    //   455: astore_1
    //   456: goto -> 545
    //   459: astore_1
    //   460: goto -> 619
    //   463: astore_2
    //   464: aload #12
    //   466: astore_1
    //   467: aload_1
    //   468: astore #8
    //   470: new android/content/res/Resources$NotFoundException
    //   473: astore #4
    //   475: aload_1
    //   476: astore #8
    //   478: new java/lang/StringBuilder
    //   481: astore_3
    //   482: aload_1
    //   483: astore #8
    //   485: aload_3
    //   486: invokespecial <init> : ()V
    //   489: aload_1
    //   490: astore #8
    //   492: aload_3
    //   493: ldc_w 'Can't load animation resource ID #0x'
    //   496: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   499: pop
    //   500: aload_1
    //   501: astore #8
    //   503: aload_3
    //   504: iload #5
    //   506: invokestatic toHexString : (I)Ljava/lang/String;
    //   509: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   512: pop
    //   513: aload_1
    //   514: astore #8
    //   516: aload #4
    //   518: aload_3
    //   519: invokevirtual toString : ()Ljava/lang/String;
    //   522: invokespecial <init> : (Ljava/lang/String;)V
    //   525: aload_1
    //   526: astore #8
    //   528: aload #4
    //   530: aload_2
    //   531: invokevirtual initCause : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   534: pop
    //   535: aload_1
    //   536: astore #8
    //   538: aload #4
    //   540: athrow
    //   541: astore_2
    //   542: aload #11
    //   544: astore_1
    //   545: aload_1
    //   546: astore #8
    //   548: new android/content/res/Resources$NotFoundException
    //   551: astore #4
    //   553: aload_1
    //   554: astore #8
    //   556: new java/lang/StringBuilder
    //   559: astore_3
    //   560: aload_1
    //   561: astore #8
    //   563: aload_3
    //   564: invokespecial <init> : ()V
    //   567: aload_1
    //   568: astore #8
    //   570: aload_3
    //   571: ldc_w 'Can't load animation resource ID #0x'
    //   574: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   577: pop
    //   578: aload_1
    //   579: astore #8
    //   581: aload_3
    //   582: iload #5
    //   584: invokestatic toHexString : (I)Ljava/lang/String;
    //   587: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   590: pop
    //   591: aload_1
    //   592: astore #8
    //   594: aload #4
    //   596: aload_3
    //   597: invokevirtual toString : ()Ljava/lang/String;
    //   600: invokespecial <init> : (Ljava/lang/String;)V
    //   603: aload_1
    //   604: astore #8
    //   606: aload #4
    //   608: aload_2
    //   609: invokevirtual initCause : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   612: pop
    //   613: aload_1
    //   614: astore #8
    //   616: aload #4
    //   618: athrow
    //   619: aload #8
    //   621: astore #9
    //   623: aload #9
    //   625: ifnull -> 635
    //   628: aload #9
    //   630: invokeinterface close : ()V
    //   635: aload_1
    //   636: athrow
    //   637: aload #10
    //   639: invokevirtual recycle : ()V
    //   642: new java/lang/IllegalStateException
    //   645: dup
    //   646: ldc_w 'Context can't be null when inflating animators'
    //   649: invokespecial <init> : (Ljava/lang/String;)V
    //   652: athrow
    //   653: aload #8
    //   655: invokevirtual recycle : ()V
    //   658: aload_2
    //   659: invokeinterface next : ()I
    //   664: istore #5
    //   666: goto -> 38
    //   669: aload_0
    //   670: getfield c : Lb/u/a/a/b$b;
    //   673: astore_1
    //   674: aload_1
    //   675: getfield c : Landroid/animation/AnimatorSet;
    //   678: ifnonnull -> 692
    //   681: aload_1
    //   682: new android/animation/AnimatorSet
    //   685: dup
    //   686: invokespecial <init> : ()V
    //   689: putfield c : Landroid/animation/AnimatorSet;
    //   692: aload_1
    //   693: getfield c : Landroid/animation/AnimatorSet;
    //   696: aload_1
    //   697: getfield d : Ljava/util/ArrayList;
    //   700: invokevirtual playTogether : (Ljava/util/Collection;)V
    //   703: return
    // Exception table:
    //   from	to	target	type
    //   286	295	541	org/xmlpull/v1/XmlPullParserException
    //   286	295	463	java/io/IOException
    //   286	295	459	finally
    //   295	302	450	org/xmlpull/v1/XmlPullParserException
    //   295	302	441	java/io/IOException
    //   295	302	437	finally
    //   302	320	433	org/xmlpull/v1/XmlPullParserException
    //   302	320	429	java/io/IOException
    //   302	320	437	finally
    //   470	475	459	finally
    //   478	482	459	finally
    //   485	489	459	finally
    //   492	500	459	finally
    //   503	513	459	finally
    //   516	525	459	finally
    //   528	535	459	finally
    //   538	541	459	finally
    //   548	553	459	finally
    //   556	560	459	finally
    //   563	567	459	finally
    //   570	578	459	finally
    //   581	591	459	finally
    //   594	603	459	finally
    //   606	613	459	finally
    //   616	619	459	finally
  }
  
  public boolean isAutoMirrored() {
    Drawable drawable = this.b;
    return (drawable != null) ? drawable.isAutoMirrored() : this.c.b.isAutoMirrored();
  }
  
  public boolean isRunning() {
    Drawable drawable = this.b;
    return (drawable != null) ? ((AnimatedVectorDrawable)drawable).isRunning() : this.c.c.isRunning();
  }
  
  public boolean isStateful() {
    Drawable drawable = this.b;
    return (drawable != null) ? drawable.isStateful() : this.c.b.isStateful();
  }
  
  public Drawable mutate() {
    Drawable drawable = this.b;
    if (drawable != null)
      drawable.mutate(); 
    return this;
  }
  
  public void onBoundsChange(Rect paramRect) {
    Drawable drawable = this.b;
    if (drawable != null) {
      drawable.setBounds(paramRect);
      return;
    } 
    this.c.b.setBounds(paramRect);
  }
  
  public boolean onLevelChange(int paramInt) {
    Drawable drawable = this.b;
    return (drawable != null) ? drawable.setLevel(paramInt) : this.c.b.setLevel(paramInt);
  }
  
  public boolean onStateChange(int[] paramArrayOfint) {
    Drawable drawable = this.b;
    return (drawable != null) ? drawable.setState(paramArrayOfint) : this.c.b.setState(paramArrayOfint);
  }
  
  public void setAlpha(int paramInt) {
    Drawable drawable = this.b;
    if (drawable != null) {
      drawable.setAlpha(paramInt);
      return;
    } 
    this.c.b.setAlpha(paramInt);
  }
  
  public void setAutoMirrored(boolean paramBoolean) {
    Drawable drawable1 = this.b;
    if (drawable1 != null) {
      drawable1.setAutoMirrored(paramBoolean);
      return;
    } 
    drawable1 = this.c.b;
    Drawable drawable2 = ((e)drawable1).b;
    if (drawable2 != null) {
      drawable2.setAutoMirrored(paramBoolean);
    } else {
      ((f)drawable1).c.e = paramBoolean;
    } 
  }
  
  public void setColorFilter(ColorFilter paramColorFilter) {
    Drawable drawable = this.b;
    if (drawable != null) {
      drawable.setColorFilter(paramColorFilter);
      return;
    } 
    f f = this.c.b;
    drawable = f.b;
    if (drawable != null) {
      drawable.setColorFilter(paramColorFilter);
    } else {
      f.e = paramColorFilter;
      f.invalidateSelf();
    } 
  }
  
  public void setTint(int paramInt) {
    Drawable drawable = this.b;
    if (drawable != null) {
      a.a.a.a.a.t0(drawable, paramInt);
      return;
    } 
    this.c.b.setTint(paramInt);
  }
  
  public void setTintList(ColorStateList paramColorStateList) {
    Drawable drawable = this.b;
    if (drawable != null) {
      a.a.a.a.a.u0(drawable, paramColorStateList);
      return;
    } 
    this.c.b.setTintList(paramColorStateList);
  }
  
  public void setTintMode(PorterDuff.Mode paramMode) {
    Drawable drawable = this.b;
    if (drawable != null) {
      a.a.a.a.a.v0(drawable, paramMode);
      return;
    } 
    this.c.b.setTintMode(paramMode);
  }
  
  public boolean setVisible(boolean paramBoolean1, boolean paramBoolean2) {
    Drawable drawable = this.b;
    if (drawable != null)
      return drawable.setVisible(paramBoolean1, paramBoolean2); 
    this.c.b.setVisible(paramBoolean1, paramBoolean2);
    return super.setVisible(paramBoolean1, paramBoolean2);
  }
  
  public void start() {
    Drawable drawable = this.b;
    if (drawable != null) {
      ((AnimatedVectorDrawable)drawable).start();
      return;
    } 
    if (this.c.c.isStarted())
      return; 
    this.c.c.start();
    invalidateSelf();
  }
  
  public void stop() {
    Drawable drawable = this.b;
    if (drawable != null) {
      ((AnimatedVectorDrawable)drawable).stop();
      return;
    } 
    this.c.c.end();
  }
  
  public class a implements Drawable.Callback {
    public final b b;
    
    public a(b this$0) {}
    
    public void invalidateDrawable(Drawable param1Drawable) {
      this.b.invalidateSelf();
    }
    
    public void scheduleDrawable(Drawable param1Drawable, Runnable param1Runnable, long param1Long) {
      this.b.scheduleSelf(param1Runnable, param1Long);
    }
    
    public void unscheduleDrawable(Drawable param1Drawable, Runnable param1Runnable) {
      this.b.unscheduleSelf(param1Runnable);
    }
  }
  
  public static class b extends Drawable.ConstantState {
    public int a;
    
    public f b;
    
    public AnimatorSet c;
    
    public ArrayList<Animator> d;
    
    public b.f.a<Animator, String> e;
    
    public b(b param1b, Drawable.Callback param1Callback, Resources param1Resources) {
      if (param1b != null) {
        this.a = param1b.a;
        f f1 = param1b.b;
        byte b1 = 0;
        if (f1 != null) {
          Drawable.ConstantState constantState = f1.getConstantState();
          if (param1Resources != null) {
            drawable = constantState.newDrawable(param1Resources);
          } else {
            drawable = constantState.newDrawable();
          } 
          Drawable drawable = drawable;
          this.b = (f)drawable;
          drawable.mutate();
          this.b = (f)drawable;
          drawable.setCallback(param1Callback);
          this.b.setBounds(param1b.b.getBounds());
          this.b.g = false;
        } 
        ArrayList<Animator> arrayList = param1b.d;
        if (arrayList != null) {
          int i = arrayList.size();
          this.d = new ArrayList<Animator>(i);
          this.e = new b.f.a(i);
          while (b1 < i) {
            Animator animator2 = param1b.d.get(b1);
            Animator animator1 = animator2.clone();
            String str = (String)param1b.e.getOrDefault(animator2, null);
            animator1.setTarget(this.b.c.b.p.getOrDefault(str, null));
            this.d.add(animator1);
            this.e.put(animator1, str);
            b1++;
          } 
          if (this.c == null)
            this.c = new AnimatorSet(); 
          this.c.playTogether(this.d);
        } 
      } 
    }
    
    public int getChangingConfigurations() {
      return this.a;
    }
    
    public Drawable newDrawable() {
      throw new IllegalStateException("No constant state support for SDK < 24.");
    }
    
    public Drawable newDrawable(Resources param1Resources) {
      throw new IllegalStateException("No constant state support for SDK < 24.");
    }
  }
  
  public static class c extends Drawable.ConstantState {
    public final Drawable.ConstantState a;
    
    public c(Drawable.ConstantState param1ConstantState) {
      this.a = param1ConstantState;
    }
    
    public boolean canApplyTheme() {
      return this.a.canApplyTheme();
    }
    
    public int getChangingConfigurations() {
      return this.a.getChangingConfigurations();
    }
    
    public Drawable newDrawable() {
      b b = new b(null, null, null);
      Drawable drawable = this.a.newDrawable();
      b.b = drawable;
      drawable.setCallback(b.f);
      return b;
    }
    
    public Drawable newDrawable(Resources param1Resources) {
      b b = new b(null, null, null);
      Drawable drawable = this.a.newDrawable(param1Resources);
      b.b = drawable;
      drawable.setCallback(b.f);
      return b;
    }
    
    public Drawable newDrawable(Resources param1Resources, Resources.Theme param1Theme) {
      b b = new b(null, null, null);
      Drawable drawable = this.a.newDrawable(param1Resources, param1Theme);
      b.b = drawable;
      drawable.setCallback(b.f);
      return b;
    }
  }
}


/* Location:              C:\Users\panch\Downloads\dvba_v1.1.0-dex2jar.jar!\\\u\a\a\b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */