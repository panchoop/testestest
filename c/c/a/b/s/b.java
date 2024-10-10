package c.c.a.b.s;

import android.annotation.TargetApi;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Outline;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PointF;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.RippleDrawable;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.OvalShape;
import android.graphics.drawable.shapes.Shape;
import android.os.Build;
import android.text.TextPaint;
import android.text.TextUtils;
import android.util.AttributeSet;
import b.i.f.k.a;
import c.c.a.a.c.l.q;
import c.c.a.b.a0.c;
import c.c.a.b.a0.d;
import c.c.a.b.d0.g;
import c.c.a.b.d0.j;
import c.c.a.b.l.g;
import c.c.a.b.y.h;
import java.lang.ref.WeakReference;
import java.util.Arrays;

public class b extends g implements a, Drawable.Callback, h.b {
  public static final int[] G0 = new int[] { 16842910 };
  
  public static final ShapeDrawable H0 = new ShapeDrawable((Shape)new OvalShape());
  
  public float A;
  
  public ColorStateList A0;
  
  public ColorStateList B;
  
  public WeakReference<a> B0 = new WeakReference<a>(null);
  
  public float C;
  
  public TextUtils.TruncateAt C0;
  
  public ColorStateList D;
  
  public boolean D0;
  
  public CharSequence E;
  
  public int E0;
  
  public boolean F;
  
  public boolean F0;
  
  public Drawable G;
  
  public ColorStateList H;
  
  public float I;
  
  public boolean J;
  
  public boolean K;
  
  public Drawable L;
  
  public Drawable M;
  
  public ColorStateList N;
  
  public float O;
  
  public CharSequence P;
  
  public boolean Q;
  
  public boolean R;
  
  public Drawable S;
  
  public g T;
  
  public g U;
  
  public float V;
  
  public float W;
  
  public float X;
  
  public float Y;
  
  public float Z;
  
  public float a0;
  
  public float b0;
  
  public float c0;
  
  public final Context d0;
  
  public final Paint e0 = new Paint(1);
  
  public final Paint f0;
  
  public final Paint.FontMetrics g0 = new Paint.FontMetrics();
  
  public final RectF h0 = new RectF();
  
  public final PointF i0 = new PointF();
  
  public final Path j0 = new Path();
  
  public final h k0;
  
  public int l0;
  
  public int m0;
  
  public int n0;
  
  public int o0;
  
  public int p0;
  
  public int q0;
  
  public boolean r0;
  
  public int s0;
  
  public int t0 = 255;
  
  public ColorFilter u0;
  
  public PorterDuffColorFilter v0;
  
  public ColorStateList w0;
  
  public ColorStateList x;
  
  public PorterDuff.Mode x0 = PorterDuff.Mode.SRC_IN;
  
  public ColorStateList y;
  
  public int[] y0;
  
  public float z;
  
  public boolean z0;
  
  public b(Context paramContext, AttributeSet paramAttributeSet, int paramInt1, int paramInt2) {
    super(j.b(paramContext, paramAttributeSet, paramInt1, paramInt2).a());
    this.b.b = new c.c.a.b.v.a(paramContext);
    x();
    this.d0 = paramContext;
    h h1 = new h(this);
    this.k0 = h1;
    this.E = "";
    h1.a.density = (paramContext.getResources().getDisplayMetrics()).density;
    this.f0 = null;
    if (false) {
      Paint.Style style = Paint.Style.STROKE;
      throw new NullPointerException();
    } 
    setState(G0);
    c0(G0);
    this.D0 = true;
    boolean bool = c.c.a.b.b0.a.a;
    H0.setTint(-1);
  }
  
  public static boolean G(ColorStateList paramColorStateList) {
    boolean bool;
    if (paramColorStateList != null && paramColorStateList.isStateful()) {
      bool = true;
    } else {
      bool = false;
    } 
    return bool;
  }
  
  public static boolean H(Drawable paramDrawable) {
    boolean bool;
    if (paramDrawable != null && paramDrawable.isStateful()) {
      bool = true;
    } else {
      bool = false;
    } 
    return bool;
  }
  
  public float A() {
    return (o0() || n0()) ? (this.W + this.I + this.X) : 0.0F;
  }
  
  public final void B(Rect paramRect, RectF paramRectF) {
    paramRectF.setEmpty();
    if (p0()) {
      float f1 = this.c0 + this.b0;
      if (a.a.a.a.a.B((Drawable)this) == 0) {
        f1 = paramRect.right - f1;
        paramRectF.right = f1;
        paramRectF.left = f1 - this.O;
      } else {
        f1 = paramRect.left + f1;
        paramRectF.left = f1;
        paramRectF.right = f1 + this.O;
      } 
      float f2 = paramRect.exactCenterY();
      f1 = this.O;
      f2 -= f1 / 2.0F;
      paramRectF.top = f2;
      paramRectF.bottom = f2 + f1;
    } 
  }
  
  public final void C(Rect paramRect, RectF paramRectF) {
    paramRectF.setEmpty();
    if (p0()) {
      float f = this.c0 + this.b0 + this.O + this.a0 + this.Z;
      if (a.a.a.a.a.B((Drawable)this) == 0) {
        float f1 = paramRect.right;
        paramRectF.right = f1;
        paramRectF.left = f1 - f;
      } else {
        int i = paramRect.left;
        paramRectF.left = i;
        paramRectF.right = i + f;
      } 
      paramRectF.top = paramRect.top;
      paramRectF.bottom = paramRect.bottom;
    } 
  }
  
  public float D() {
    return p0() ? (this.a0 + this.O + this.b0) : 0.0F;
  }
  
  public float E() {
    float f;
    if (this.F0) {
      f = m();
    } else {
      f = this.A;
    } 
    return f;
  }
  
  public Drawable F() {
    Drawable drawable1;
    Drawable drawable2 = this.L;
    if (drawable2 != null) {
      drawable1 = drawable2;
      if (drawable2 instanceof b.i.f.k.b)
        drawable1 = ((b.i.f.k.b)drawable2).a(); 
    } else {
      drawable1 = null;
    } 
    return drawable1;
  }
  
  public void I() {
    a a1 = this.B0.get();
    if (a1 != null)
      a1.a(); 
  }
  
  public final boolean J(int[] paramArrayOfint1, int[] paramArrayOfint2) {
    // Byte code:
    //   0: aload_0
    //   1: aload_1
    //   2: invokespecial onStateChange : ([I)Z
    //   5: istore #7
    //   7: aload_0
    //   8: getfield x : Landroid/content/res/ColorStateList;
    //   11: astore #11
    //   13: aload #11
    //   15: ifnull -> 33
    //   18: aload #11
    //   20: aload_1
    //   21: aload_0
    //   22: getfield l0 : I
    //   25: invokevirtual getColorForState : ([II)I
    //   28: istore #4
    //   30: goto -> 36
    //   33: iconst_0
    //   34: istore #4
    //   36: aload_0
    //   37: getfield l0 : I
    //   40: istore #5
    //   42: iconst_1
    //   43: istore #10
    //   45: iload #5
    //   47: iload #4
    //   49: if_icmpeq -> 61
    //   52: aload_0
    //   53: iload #4
    //   55: putfield l0 : I
    //   58: iconst_1
    //   59: istore #7
    //   61: aload_0
    //   62: getfield y : Landroid/content/res/ColorStateList;
    //   65: astore #11
    //   67: aload #11
    //   69: ifnull -> 87
    //   72: aload #11
    //   74: aload_1
    //   75: aload_0
    //   76: getfield m0 : I
    //   79: invokevirtual getColorForState : ([II)I
    //   82: istore #5
    //   84: goto -> 90
    //   87: iconst_0
    //   88: istore #5
    //   90: aload_0
    //   91: getfield m0 : I
    //   94: iload #5
    //   96: if_icmpeq -> 108
    //   99: aload_0
    //   100: iload #5
    //   102: putfield m0 : I
    //   105: iconst_1
    //   106: istore #7
    //   108: iload #5
    //   110: iload #4
    //   112: invokestatic a : (II)I
    //   115: istore #6
    //   117: aload_0
    //   118: getfield n0 : I
    //   121: iload #6
    //   123: if_icmpeq -> 132
    //   126: iconst_1
    //   127: istore #4
    //   129: goto -> 135
    //   132: iconst_0
    //   133: istore #4
    //   135: aload_0
    //   136: getfield b : Lc/c/a/b/d0/g$b;
    //   139: getfield d : Landroid/content/res/ColorStateList;
    //   142: ifnonnull -> 151
    //   145: iconst_1
    //   146: istore #5
    //   148: goto -> 154
    //   151: iconst_0
    //   152: istore #5
    //   154: iload #4
    //   156: iload #5
    //   158: ior
    //   159: ifeq -> 180
    //   162: aload_0
    //   163: iload #6
    //   165: putfield n0 : I
    //   168: aload_0
    //   169: iload #6
    //   171: invokestatic valueOf : (I)Landroid/content/res/ColorStateList;
    //   174: invokevirtual q : (Landroid/content/res/ColorStateList;)V
    //   177: iconst_1
    //   178: istore #7
    //   180: aload_0
    //   181: getfield B : Landroid/content/res/ColorStateList;
    //   184: astore #11
    //   186: aload #11
    //   188: ifnull -> 206
    //   191: aload #11
    //   193: aload_1
    //   194: aload_0
    //   195: getfield o0 : I
    //   198: invokevirtual getColorForState : ([II)I
    //   201: istore #4
    //   203: goto -> 209
    //   206: iconst_0
    //   207: istore #4
    //   209: aload_0
    //   210: getfield o0 : I
    //   213: iload #4
    //   215: if_icmpeq -> 227
    //   218: aload_0
    //   219: iload #4
    //   221: putfield o0 : I
    //   224: iconst_1
    //   225: istore #7
    //   227: aload_0
    //   228: getfield A0 : Landroid/content/res/ColorStateList;
    //   231: ifnull -> 258
    //   234: aload_1
    //   235: invokestatic b : ([I)Z
    //   238: ifeq -> 258
    //   241: aload_0
    //   242: getfield A0 : Landroid/content/res/ColorStateList;
    //   245: aload_1
    //   246: aload_0
    //   247: getfield p0 : I
    //   250: invokevirtual getColorForState : ([II)I
    //   253: istore #4
    //   255: goto -> 261
    //   258: iconst_0
    //   259: istore #4
    //   261: iload #7
    //   263: istore #8
    //   265: aload_0
    //   266: getfield p0 : I
    //   269: iload #4
    //   271: if_icmpeq -> 294
    //   274: aload_0
    //   275: iload #4
    //   277: putfield p0 : I
    //   280: iload #7
    //   282: istore #8
    //   284: aload_0
    //   285: getfield z0 : Z
    //   288: ifeq -> 294
    //   291: iconst_1
    //   292: istore #8
    //   294: aload_0
    //   295: getfield k0 : Lc/c/a/b/y/h;
    //   298: getfield f : Lc/c/a/b/a0/b;
    //   301: astore #11
    //   303: aload #11
    //   305: ifnull -> 335
    //   308: aload #11
    //   310: getfield b : Landroid/content/res/ColorStateList;
    //   313: astore #11
    //   315: aload #11
    //   317: ifnull -> 335
    //   320: aload #11
    //   322: aload_1
    //   323: aload_0
    //   324: getfield q0 : I
    //   327: invokevirtual getColorForState : ([II)I
    //   330: istore #4
    //   332: goto -> 338
    //   335: iconst_0
    //   336: istore #4
    //   338: iload #8
    //   340: istore #7
    //   342: aload_0
    //   343: getfield q0 : I
    //   346: iload #4
    //   348: if_icmpeq -> 360
    //   351: aload_0
    //   352: iload #4
    //   354: putfield q0 : I
    //   357: iconst_1
    //   358: istore #7
    //   360: aload_0
    //   361: invokevirtual getState : ()[I
    //   364: astore #11
    //   366: aload #11
    //   368: ifnonnull -> 377
    //   371: iconst_0
    //   372: istore #4
    //   374: goto -> 415
    //   377: aload #11
    //   379: arraylength
    //   380: istore #5
    //   382: iconst_0
    //   383: istore #4
    //   385: iload #4
    //   387: iload #5
    //   389: if_icmpge -> 371
    //   392: aload #11
    //   394: iload #4
    //   396: iaload
    //   397: ldc_w 16842912
    //   400: if_icmpne -> 409
    //   403: iconst_1
    //   404: istore #4
    //   406: goto -> 415
    //   409: iinc #4, 1
    //   412: goto -> 385
    //   415: iload #4
    //   417: ifeq -> 433
    //   420: aload_0
    //   421: getfield Q : Z
    //   424: ifeq -> 433
    //   427: iconst_1
    //   428: istore #9
    //   430: goto -> 436
    //   433: iconst_0
    //   434: istore #9
    //   436: iload #7
    //   438: istore #8
    //   440: aload_0
    //   441: getfield r0 : Z
    //   444: iload #9
    //   446: if_icmpeq -> 492
    //   449: iload #7
    //   451: istore #8
    //   453: aload_0
    //   454: getfield S : Landroid/graphics/drawable/Drawable;
    //   457: ifnull -> 492
    //   460: aload_0
    //   461: invokevirtual A : ()F
    //   464: fstore_3
    //   465: aload_0
    //   466: iload #9
    //   468: putfield r0 : Z
    //   471: fload_3
    //   472: aload_0
    //   473: invokevirtual A : ()F
    //   476: fcmpl
    //   477: ifeq -> 489
    //   480: iconst_1
    //   481: istore #8
    //   483: iconst_1
    //   484: istore #4
    //   486: goto -> 495
    //   489: iconst_1
    //   490: istore #8
    //   492: iconst_0
    //   493: istore #4
    //   495: aload_0
    //   496: getfield w0 : Landroid/content/res/ColorStateList;
    //   499: astore #11
    //   501: aload #11
    //   503: ifnull -> 521
    //   506: aload #11
    //   508: aload_1
    //   509: aload_0
    //   510: getfield s0 : I
    //   513: invokevirtual getColorForState : ([II)I
    //   516: istore #5
    //   518: goto -> 524
    //   521: iconst_0
    //   522: istore #5
    //   524: aload_0
    //   525: getfield s0 : I
    //   528: iload #5
    //   530: if_icmpeq -> 562
    //   533: aload_0
    //   534: iload #5
    //   536: putfield s0 : I
    //   539: aload_0
    //   540: aload_0
    //   541: aload_0
    //   542: getfield w0 : Landroid/content/res/ColorStateList;
    //   545: aload_0
    //   546: getfield x0 : Landroid/graphics/PorterDuff$Mode;
    //   549: invokestatic a0 : (Landroid/graphics/drawable/Drawable;Landroid/content/res/ColorStateList;Landroid/graphics/PorterDuff$Mode;)Landroid/graphics/PorterDuffColorFilter;
    //   552: putfield v0 : Landroid/graphics/PorterDuffColorFilter;
    //   555: iload #10
    //   557: istore #8
    //   559: goto -> 562
    //   562: iload #8
    //   564: istore #7
    //   566: aload_0
    //   567: getfield G : Landroid/graphics/drawable/Drawable;
    //   570: invokestatic H : (Landroid/graphics/drawable/Drawable;)Z
    //   573: ifeq -> 589
    //   576: iload #8
    //   578: aload_0
    //   579: getfield G : Landroid/graphics/drawable/Drawable;
    //   582: aload_1
    //   583: invokevirtual setState : ([I)Z
    //   586: ior
    //   587: istore #7
    //   589: iload #7
    //   591: istore #8
    //   593: aload_0
    //   594: getfield S : Landroid/graphics/drawable/Drawable;
    //   597: invokestatic H : (Landroid/graphics/drawable/Drawable;)Z
    //   600: ifeq -> 616
    //   603: iload #7
    //   605: aload_0
    //   606: getfield S : Landroid/graphics/drawable/Drawable;
    //   609: aload_1
    //   610: invokevirtual setState : ([I)Z
    //   613: ior
    //   614: istore #8
    //   616: iload #8
    //   618: istore #7
    //   620: aload_0
    //   621: getfield L : Landroid/graphics/drawable/Drawable;
    //   624: invokestatic H : (Landroid/graphics/drawable/Drawable;)Z
    //   627: ifeq -> 674
    //   630: aload_1
    //   631: arraylength
    //   632: aload_2
    //   633: arraylength
    //   634: iadd
    //   635: newarray int
    //   637: astore #11
    //   639: aload_1
    //   640: iconst_0
    //   641: aload #11
    //   643: iconst_0
    //   644: aload_1
    //   645: arraylength
    //   646: invokestatic arraycopy : (Ljava/lang/Object;ILjava/lang/Object;II)V
    //   649: aload_2
    //   650: iconst_0
    //   651: aload #11
    //   653: aload_1
    //   654: arraylength
    //   655: aload_2
    //   656: arraylength
    //   657: invokestatic arraycopy : (Ljava/lang/Object;ILjava/lang/Object;II)V
    //   660: iload #8
    //   662: aload_0
    //   663: getfield L : Landroid/graphics/drawable/Drawable;
    //   666: aload #11
    //   668: invokevirtual setState : ([I)Z
    //   671: ior
    //   672: istore #7
    //   674: getstatic c/c/a/b/b0/a.a : Z
    //   677: istore #8
    //   679: iload #7
    //   681: istore #8
    //   683: aload_0
    //   684: getfield M : Landroid/graphics/drawable/Drawable;
    //   687: invokestatic H : (Landroid/graphics/drawable/Drawable;)Z
    //   690: ifeq -> 706
    //   693: iload #7
    //   695: aload_0
    //   696: getfield M : Landroid/graphics/drawable/Drawable;
    //   699: aload_2
    //   700: invokevirtual setState : ([I)Z
    //   703: ior
    //   704: istore #8
    //   706: iload #8
    //   708: ifeq -> 715
    //   711: aload_0
    //   712: invokevirtual invalidateSelf : ()V
    //   715: iload #4
    //   717: ifeq -> 724
    //   720: aload_0
    //   721: invokevirtual I : ()V
    //   724: iload #8
    //   726: ireturn
  }
  
  public void K(boolean paramBoolean) {
    if (this.Q != paramBoolean) {
      this.Q = paramBoolean;
      float f1 = A();
      if (!paramBoolean && this.r0)
        this.r0 = false; 
      float f2 = A();
      invalidateSelf();
      if (f1 != f2)
        I(); 
    } 
  }
  
  public void L(Drawable paramDrawable) {
    if (this.S != paramDrawable) {
      float f1 = A();
      this.S = paramDrawable;
      float f2 = A();
      q0(this.S);
      y(this.S);
      invalidateSelf();
      if (f1 != f2)
        I(); 
    } 
  }
  
  public void M(boolean paramBoolean) {
    if (this.R != paramBoolean) {
      boolean bool;
      boolean bool1 = n0();
      this.R = paramBoolean;
      paramBoolean = n0();
      if (bool1 != paramBoolean) {
        bool = true;
      } else {
        bool = false;
      } 
      if (bool) {
        if (paramBoolean) {
          y(this.S);
        } else {
          q0(this.S);
        } 
        invalidateSelf();
        I();
      } 
    } 
  }
  
  public void N(ColorStateList paramColorStateList) {
    if (this.y != paramColorStateList) {
      this.y = paramColorStateList;
      onStateChange(getState());
    } 
  }
  
  @Deprecated
  public void O(float paramFloat) {
    if (this.A != paramFloat) {
      this.A = paramFloat;
      j j = this.b.a.e(paramFloat);
      this.b.a = j;
      invalidateSelf();
    } 
  }
  
  public void P(float paramFloat) {
    if (this.c0 != paramFloat) {
      this.c0 = paramFloat;
      invalidateSelf();
      I();
    } 
  }
  
  public void Q(Drawable paramDrawable) {
    Drawable drawable1;
    Drawable drawable3 = this.G;
    Drawable drawable2 = null;
    if (drawable3 != null) {
      drawable1 = drawable3;
      if (drawable3 instanceof b.i.f.k.b)
        drawable1 = ((b.i.f.k.b)drawable3).a(); 
    } else {
      drawable1 = null;
    } 
    if (drawable1 != paramDrawable) {
      float f1 = A();
      if (paramDrawable != null)
        drawable2 = a.a.a.a.a.C0(paramDrawable).mutate(); 
      this.G = drawable2;
      float f2 = A();
      q0(drawable1);
      if (o0())
        y(this.G); 
      invalidateSelf();
      if (f1 != f2)
        I(); 
    } 
  }
  
  public void R(float paramFloat) {
    if (this.I != paramFloat) {
      float f = A();
      this.I = paramFloat;
      paramFloat = A();
      invalidateSelf();
      if (f != paramFloat)
        I(); 
    } 
  }
  
  public void S(ColorStateList paramColorStateList) {
    this.J = true;
    if (this.H != paramColorStateList) {
      this.H = paramColorStateList;
      if (o0())
        this.G.setTintList(paramColorStateList); 
      onStateChange(getState());
    } 
  }
  
  public void T(boolean paramBoolean) {
    if (this.F != paramBoolean) {
      boolean bool;
      boolean bool1 = o0();
      this.F = paramBoolean;
      paramBoolean = o0();
      if (bool1 != paramBoolean) {
        bool = true;
      } else {
        bool = false;
      } 
      if (bool) {
        if (paramBoolean) {
          y(this.G);
        } else {
          q0(this.G);
        } 
        invalidateSelf();
        I();
      } 
    } 
  }
  
  public void U(float paramFloat) {
    if (this.z != paramFloat) {
      this.z = paramFloat;
      invalidateSelf();
      I();
    } 
  }
  
  public void V(float paramFloat) {
    if (this.V != paramFloat) {
      this.V = paramFloat;
      invalidateSelf();
      I();
    } 
  }
  
  public void W(ColorStateList paramColorStateList) {
    if (this.B != paramColorStateList) {
      this.B = paramColorStateList;
      if (this.F0)
        u(paramColorStateList); 
      onStateChange(getState());
    } 
  }
  
  public void X(float paramFloat) {
    if (this.C != paramFloat) {
      this.C = paramFloat;
      this.e0.setStrokeWidth(paramFloat);
      if (this.F0) {
        this.b.l = paramFloat;
        invalidateSelf();
      } 
      invalidateSelf();
    } 
  }
  
  public void Y(Drawable paramDrawable) {
    Drawable drawable = F();
    if (drawable != paramDrawable) {
      float f1 = D();
      if (paramDrawable != null) {
        paramDrawable = a.a.a.a.a.C0(paramDrawable).mutate();
      } else {
        paramDrawable = null;
      } 
      this.L = paramDrawable;
      boolean bool = c.c.a.b.b0.a.a;
      this.M = (Drawable)new RippleDrawable(c.c.a.b.b0.a.a(this.D), this.L, (Drawable)H0);
      float f2 = D();
      q0(drawable);
      if (p0())
        y(this.L); 
      invalidateSelf();
      if (f1 != f2)
        I(); 
    } 
  }
  
  public void Z(float paramFloat) {
    if (this.b0 != paramFloat) {
      this.b0 = paramFloat;
      invalidateSelf();
      if (p0())
        I(); 
    } 
  }
  
  public void a() {
    I();
    invalidateSelf();
  }
  
  public void a0(float paramFloat) {
    if (this.O != paramFloat) {
      this.O = paramFloat;
      invalidateSelf();
      if (p0())
        I(); 
    } 
  }
  
  public void b0(float paramFloat) {
    if (this.a0 != paramFloat) {
      this.a0 = paramFloat;
      invalidateSelf();
      if (p0())
        I(); 
    } 
  }
  
  public boolean c0(int[] paramArrayOfint) {
    if (!Arrays.equals(this.y0, paramArrayOfint)) {
      this.y0 = paramArrayOfint;
      if (p0())
        return J(getState(), paramArrayOfint); 
    } 
    return false;
  }
  
  public void d0(ColorStateList paramColorStateList) {
    if (this.N != paramColorStateList) {
      this.N = paramColorStateList;
      if (p0())
        this.L.setTintList(paramColorStateList); 
      onStateChange(getState());
    } 
  }
  
  public void draw(Canvas paramCanvas) {
    Rect rect = getBounds();
    if (!rect.isEmpty()) {
      int i = this.t0;
      if (i != 0) {
        if (i < 255) {
          float f3 = rect.left;
          float f1 = rect.top;
          float f2 = rect.right;
          float f4 = rect.bottom;
          if (Build.VERSION.SDK_INT > 21) {
            i = paramCanvas.saveLayerAlpha(f3, f1, f2, f4, i);
          } else {
            i = paramCanvas.saveLayerAlpha(f3, f1, f2, f4, i, 31);
          } 
        } else {
          i = 0;
        } 
        if (!this.F0) {
          this.e0.setColor(this.l0);
          this.e0.setStyle(Paint.Style.FILL);
          this.h0.set(rect);
          paramCanvas.drawRoundRect(this.h0, E(), E(), this.e0);
        } 
        if (!this.F0) {
          PorterDuffColorFilter porterDuffColorFilter;
          this.e0.setColor(this.m0);
          this.e0.setStyle(Paint.Style.FILL);
          Paint paint1 = this.e0;
          ColorFilter colorFilter = this.u0;
          if (colorFilter == null)
            porterDuffColorFilter = this.v0; 
          paint1.setColorFilter((ColorFilter)porterDuffColorFilter);
          this.h0.set(rect);
          paramCanvas.drawRoundRect(this.h0, E(), E(), this.e0);
        } 
        if (this.F0)
          super.draw(paramCanvas); 
        if (this.C > 0.0F && !this.F0) {
          this.e0.setColor(this.o0);
          this.e0.setStyle(Paint.Style.STROKE);
          if (!this.F0) {
            PorterDuffColorFilter porterDuffColorFilter;
            Paint paint1 = this.e0;
            ColorFilter colorFilter = this.u0;
            if (colorFilter == null)
              porterDuffColorFilter = this.v0; 
            paint1.setColorFilter((ColorFilter)porterDuffColorFilter);
          } 
          RectF rectF = this.h0;
          float f1 = rect.left;
          float f2 = this.C / 2.0F;
          rectF.set(f1 + f2, rect.top + f2, rect.right - f2, rect.bottom - f2);
          f1 = this.A - this.C / 2.0F;
          paramCanvas.drawRoundRect(this.h0, f1, f1, this.e0);
        } 
        this.e0.setColor(this.p0);
        this.e0.setStyle(Paint.Style.FILL);
        this.h0.set(rect);
        if (!this.F0) {
          paramCanvas.drawRoundRect(this.h0, E(), E(), this.e0);
        } else {
          c(new RectF(rect), this.j0);
          Paint paint1 = this.e0;
          Path path = this.j0;
          RectF rectF = h();
          g(paramCanvas, paint1, path, this.b.a, rectF);
        } 
        if (o0()) {
          z(rect, this.h0);
          RectF rectF = this.h0;
          float f1 = rectF.left;
          float f2 = rectF.top;
          paramCanvas.translate(f1, f2);
          this.G.setBounds(0, 0, (int)this.h0.width(), (int)this.h0.height());
          this.G.draw(paramCanvas);
          paramCanvas.translate(-f1, -f2);
        } 
        if (n0()) {
          z(rect, this.h0);
          RectF rectF = this.h0;
          float f1 = rectF.left;
          float f2 = rectF.top;
          paramCanvas.translate(f1, f2);
          this.S.setBounds(0, 0, (int)this.h0.width(), (int)this.h0.height());
          this.S.draw(paramCanvas);
          paramCanvas.translate(-f1, -f2);
        } 
        if (this.D0 && this.E != null) {
          boolean bool1;
          boolean bool2;
          PointF pointF2 = this.i0;
          pointF2.set(0.0F, 0.0F);
          Paint.Align align = Paint.Align.LEFT;
          if (this.E != null) {
            float f = this.V;
            f = A() + f + this.Y;
            if (a.a.a.a.a.B((Drawable)this) == 0) {
              pointF2.x = rect.left + f;
              align = Paint.Align.LEFT;
            } else {
              pointF2.x = rect.right - f;
              align = Paint.Align.RIGHT;
            } 
            f = rect.centerY();
            this.k0.a.getFontMetrics(this.g0);
            Paint.FontMetrics fontMetrics = this.g0;
            pointF2.y = f - (fontMetrics.descent + fontMetrics.ascent) / 2.0F;
          } 
          RectF rectF = this.h0;
          rectF.setEmpty();
          if (this.E != null) {
            float f1 = this.V;
            f1 = A() + f1 + this.Y;
            float f2 = this.c0;
            f2 = D() + f2 + this.Z;
            if (a.a.a.a.a.B((Drawable)this) == 0) {
              rectF.left = rect.left + f1;
              f1 = rect.right - f2;
            } else {
              rectF.left = rect.left + f2;
              f1 = rect.right - f1;
            } 
            rectF.right = f1;
            rectF.top = rect.top;
            rectF.bottom = rect.bottom;
          } 
          h h1 = this.k0;
          if (h1.f != null) {
            h1.a.drawableState = getState();
            h h2 = this.k0;
            Context context = this.d0;
            h2.f.c(context, h2.a, h2.b);
          } 
          this.k0.a.setTextAlign(align);
          if (Math.round(this.k0.a(this.E.toString())) > Math.round(this.h0.width())) {
            bool1 = true;
          } else {
            bool1 = false;
          } 
          if (bool1) {
            bool2 = paramCanvas.save();
            paramCanvas.clipRect(this.h0);
          } else {
            bool2 = false;
          } 
          CharSequence charSequence2 = this.E;
          CharSequence charSequence1 = charSequence2;
          if (bool1) {
            charSequence1 = charSequence2;
            if (this.C0 != null)
              charSequence1 = TextUtils.ellipsize(charSequence2, this.k0.a, this.h0.width(), this.C0); 
          } 
          int j = charSequence1.length();
          PointF pointF1 = this.i0;
          paramCanvas.drawText(charSequence1, 0, j, pointF1.x, pointF1.y, (Paint)this.k0.a);
          if (bool1)
            paramCanvas.restoreToCount(bool2); 
        } 
        if (p0()) {
          B(rect, this.h0);
          RectF rectF = this.h0;
          float f2 = rectF.left;
          float f1 = rectF.top;
          paramCanvas.translate(f2, f1);
          this.L.setBounds(0, 0, (int)this.h0.width(), (int)this.h0.height());
          boolean bool = c.c.a.b.b0.a.a;
          this.M.setBounds(this.L.getBounds());
          this.M.jumpToCurrentState();
          this.M.draw(paramCanvas);
          paramCanvas.translate(-f2, -f1);
        } 
        Paint paint = this.f0;
        if (paint != null) {
          paint.setColor(b.i.f.a.c(-16777216, 127));
          paramCanvas.drawRect(rect, this.f0);
          if (o0() || n0()) {
            z(rect, this.h0);
            paramCanvas.drawRect(this.h0, this.f0);
          } 
          if (this.E != null)
            paramCanvas.drawLine(rect.left, rect.exactCenterY(), rect.right, rect.exactCenterY(), this.f0); 
          if (p0()) {
            B(rect, this.h0);
            paramCanvas.drawRect(this.h0, this.f0);
          } 
          this.f0.setColor(b.i.f.a.c(-65536, 127));
          RectF rectF = this.h0;
          rectF.set(rect);
          if (p0()) {
            float f = this.c0 + this.b0 + this.O + this.a0 + this.Z;
            if (a.a.a.a.a.B((Drawable)this) == 0) {
              rectF.right = rect.right - f;
            } else {
              rectF.left = rect.left + f;
            } 
          } 
          paramCanvas.drawRect(this.h0, this.f0);
          this.f0.setColor(b.i.f.a.c(-16711936, 127));
          C(rect, this.h0);
          paramCanvas.drawRect(this.h0, this.f0);
        } 
        if (this.t0 < 255)
          paramCanvas.restoreToCount(i); 
      } 
    } 
  }
  
  public void e0(boolean paramBoolean) {
    if (this.K != paramBoolean) {
      boolean bool;
      boolean bool1 = p0();
      this.K = paramBoolean;
      paramBoolean = p0();
      if (bool1 != paramBoolean) {
        bool = true;
      } else {
        bool = false;
      } 
      if (bool) {
        if (paramBoolean) {
          y(this.L);
        } else {
          q0(this.L);
        } 
        invalidateSelf();
        I();
      } 
    } 
  }
  
  public void f0(float paramFloat) {
    if (this.X != paramFloat) {
      float f = A();
      this.X = paramFloat;
      paramFloat = A();
      invalidateSelf();
      if (f != paramFloat)
        I(); 
    } 
  }
  
  public void g0(float paramFloat) {
    if (this.W != paramFloat) {
      float f = A();
      this.W = paramFloat;
      paramFloat = A();
      invalidateSelf();
      if (f != paramFloat)
        I(); 
    } 
  }
  
  public int getAlpha() {
    return this.t0;
  }
  
  public ColorFilter getColorFilter() {
    return this.u0;
  }
  
  public int getIntrinsicHeight() {
    return (int)this.z;
  }
  
  public int getIntrinsicWidth() {
    float f2 = this.V;
    float f3 = A();
    float f5 = this.Y;
    float f1 = this.k0.a(this.E.toString());
    float f4 = this.Z;
    return Math.min(Math.round(D() + f1 + f3 + f2 + f5 + f4 + this.c0), this.E0);
  }
  
  public int getOpacity() {
    return -3;
  }
  
  @TargetApi(21)
  public void getOutline(Outline paramOutline) {
    if (this.F0) {
      super.getOutline(paramOutline);
      return;
    } 
    Rect rect = getBounds();
    if (!rect.isEmpty()) {
      paramOutline.setRoundRect(rect, this.A);
    } else {
      paramOutline.setRoundRect(0, 0, getIntrinsicWidth(), (int)this.z, this.A);
    } 
    paramOutline.setAlpha(this.t0 / 255.0F);
  }
  
  public void h0(ColorStateList paramColorStateList) {
    if (this.D != paramColorStateList) {
      this.D = paramColorStateList;
      if (this.z0) {
        paramColorStateList = c.c.a.b.b0.a.a(paramColorStateList);
      } else {
        paramColorStateList = null;
      } 
      this.A0 = paramColorStateList;
      onStateChange(getState());
    } 
  }
  
  public void i0(CharSequence paramCharSequence) {
    CharSequence charSequence = paramCharSequence;
    if (paramCharSequence == null)
      charSequence = ""; 
    if (!TextUtils.equals(this.E, charSequence)) {
      this.E = charSequence;
      this.k0.d = true;
      invalidateSelf();
      I();
    } 
  }
  
  public void invalidateDrawable(Drawable paramDrawable) {
    Drawable.Callback callback = getCallback();
    if (callback != null)
      callback.invalidateDrawable((Drawable)this); 
  }
  
  public boolean isStateful() {
    // Byte code:
    //   0: aload_0
    //   1: getfield x : Landroid/content/res/ColorStateList;
    //   4: invokestatic G : (Landroid/content/res/ColorStateList;)Z
    //   7: istore_3
    //   8: iconst_0
    //   9: istore_2
    //   10: iload_3
    //   11: ifne -> 158
    //   14: aload_0
    //   15: getfield y : Landroid/content/res/ColorStateList;
    //   18: invokestatic G : (Landroid/content/res/ColorStateList;)Z
    //   21: ifne -> 158
    //   24: aload_0
    //   25: getfield B : Landroid/content/res/ColorStateList;
    //   28: invokestatic G : (Landroid/content/res/ColorStateList;)Z
    //   31: ifne -> 158
    //   34: aload_0
    //   35: getfield z0 : Z
    //   38: ifeq -> 51
    //   41: aload_0
    //   42: getfield A0 : Landroid/content/res/ColorStateList;
    //   45: invokestatic G : (Landroid/content/res/ColorStateList;)Z
    //   48: ifne -> 158
    //   51: aload_0
    //   52: getfield k0 : Lc/c/a/b/y/h;
    //   55: getfield f : Lc/c/a/b/a0/b;
    //   58: astore #4
    //   60: aload #4
    //   62: ifnull -> 90
    //   65: aload #4
    //   67: getfield b : Landroid/content/res/ColorStateList;
    //   70: astore #4
    //   72: aload #4
    //   74: ifnull -> 90
    //   77: aload #4
    //   79: invokevirtual isStateful : ()Z
    //   82: ifeq -> 90
    //   85: iconst_1
    //   86: istore_1
    //   87: goto -> 92
    //   90: iconst_0
    //   91: istore_1
    //   92: iload_1
    //   93: ifne -> 158
    //   96: aload_0
    //   97: getfield R : Z
    //   100: ifeq -> 122
    //   103: aload_0
    //   104: getfield S : Landroid/graphics/drawable/Drawable;
    //   107: ifnull -> 122
    //   110: aload_0
    //   111: getfield Q : Z
    //   114: ifeq -> 122
    //   117: iconst_1
    //   118: istore_1
    //   119: goto -> 124
    //   122: iconst_0
    //   123: istore_1
    //   124: iload_1
    //   125: ifne -> 158
    //   128: aload_0
    //   129: getfield G : Landroid/graphics/drawable/Drawable;
    //   132: invokestatic H : (Landroid/graphics/drawable/Drawable;)Z
    //   135: ifne -> 158
    //   138: aload_0
    //   139: getfield S : Landroid/graphics/drawable/Drawable;
    //   142: invokestatic H : (Landroid/graphics/drawable/Drawable;)Z
    //   145: ifne -> 158
    //   148: aload_0
    //   149: getfield w0 : Landroid/content/res/ColorStateList;
    //   152: invokestatic G : (Landroid/content/res/ColorStateList;)Z
    //   155: ifeq -> 160
    //   158: iconst_1
    //   159: istore_2
    //   160: iload_2
    //   161: ireturn
  }
  
  public void j0(c.c.a.b.a0.b paramb) {
    h h1 = this.k0;
    Context context = this.d0;
    if (h1.f != paramb) {
      h1.f = paramb;
      if (paramb != null) {
        TextPaint textPaint = h1.a;
        d d = h1.b;
        paramb.a();
        paramb.d(textPaint, paramb.l);
        paramb.b(context, (d)new c(paramb, textPaint, d));
        h.b b2 = h1.e.get();
        if (b2 != null)
          h1.a.drawableState = b2.getState(); 
        paramb.c(context, h1.a, h1.b);
        h1.d = true;
      } 
      h.b b1 = h1.e.get();
      if (b1 != null) {
        b1.a();
        b1.onStateChange(b1.getState());
      } 
    } 
  }
  
  public void k0(float paramFloat) {
    if (this.Z != paramFloat) {
      this.Z = paramFloat;
      invalidateSelf();
      I();
    } 
  }
  
  public void l0(float paramFloat) {
    if (this.Y != paramFloat) {
      this.Y = paramFloat;
      invalidateSelf();
      I();
    } 
  }
  
  public void m0(boolean paramBoolean) {
    if (this.z0 != paramBoolean) {
      ColorStateList colorStateList;
      this.z0 = paramBoolean;
      if (paramBoolean) {
        colorStateList = c.c.a.b.b0.a.a(this.D);
      } else {
        colorStateList = null;
      } 
      this.A0 = colorStateList;
      onStateChange(getState());
    } 
  }
  
  public final boolean n0() {
    boolean bool;
    if (this.R && this.S != null && this.r0) {
      bool = true;
    } else {
      bool = false;
    } 
    return bool;
  }
  
  public final boolean o0() {
    boolean bool;
    if (this.F && this.G != null) {
      bool = true;
    } else {
      bool = false;
    } 
    return bool;
  }
  
  public boolean onLayoutDirectionChanged(int paramInt) {
    boolean bool1 = super.onLayoutDirectionChanged(paramInt);
    boolean bool2 = bool1;
    if (o0())
      bool2 = bool1 | a.a.a.a.a.o0(this.G, paramInt); 
    bool1 = bool2;
    if (n0())
      bool1 = bool2 | a.a.a.a.a.o0(this.S, paramInt); 
    bool2 = bool1;
    if (p0())
      bool2 = bool1 | a.a.a.a.a.o0(this.L, paramInt); 
    if (bool2)
      invalidateSelf(); 
    return true;
  }
  
  public boolean onLevelChange(int paramInt) {
    boolean bool1 = super.onLevelChange(paramInt);
    boolean bool2 = bool1;
    if (o0())
      bool2 = bool1 | this.G.setLevel(paramInt); 
    bool1 = bool2;
    if (n0())
      bool1 = bool2 | this.S.setLevel(paramInt); 
    bool2 = bool1;
    if (p0())
      bool2 = bool1 | this.L.setLevel(paramInt); 
    if (bool2)
      invalidateSelf(); 
    return bool2;
  }
  
  public boolean onStateChange(int[] paramArrayOfint) {
    if (this.F0)
      super.onStateChange(paramArrayOfint); 
    return J(paramArrayOfint, this.y0);
  }
  
  public final boolean p0() {
    boolean bool;
    if (this.K && this.L != null) {
      bool = true;
    } else {
      bool = false;
    } 
    return bool;
  }
  
  public final void q0(Drawable paramDrawable) {
    if (paramDrawable != null)
      paramDrawable.setCallback(null); 
  }
  
  public void scheduleDrawable(Drawable paramDrawable, Runnable paramRunnable, long paramLong) {
    Drawable.Callback callback = getCallback();
    if (callback != null)
      callback.scheduleDrawable((Drawable)this, paramRunnable, paramLong); 
  }
  
  public void setAlpha(int paramInt) {
    if (this.t0 != paramInt) {
      this.t0 = paramInt;
      invalidateSelf();
    } 
  }
  
  public void setColorFilter(ColorFilter paramColorFilter) {
    if (this.u0 != paramColorFilter) {
      this.u0 = paramColorFilter;
      invalidateSelf();
    } 
  }
  
  public void setTintList(ColorStateList paramColorStateList) {
    if (this.w0 != paramColorStateList) {
      this.w0 = paramColorStateList;
      onStateChange(getState());
    } 
  }
  
  public void setTintMode(PorterDuff.Mode paramMode) {
    if (this.x0 != paramMode) {
      this.x0 = paramMode;
      this.v0 = q.a0((Drawable)this, this.w0, paramMode);
      invalidateSelf();
    } 
  }
  
  public boolean setVisible(boolean paramBoolean1, boolean paramBoolean2) {
    boolean bool1 = super.setVisible(paramBoolean1, paramBoolean2);
    boolean bool2 = bool1;
    if (o0())
      bool2 = bool1 | this.G.setVisible(paramBoolean1, paramBoolean2); 
    bool1 = bool2;
    if (n0())
      bool1 = bool2 | this.S.setVisible(paramBoolean1, paramBoolean2); 
    bool2 = bool1;
    if (p0())
      bool2 = bool1 | this.L.setVisible(paramBoolean1, paramBoolean2); 
    if (bool2)
      invalidateSelf(); 
    return bool2;
  }
  
  public void unscheduleDrawable(Drawable paramDrawable, Runnable paramRunnable) {
    Drawable.Callback callback = getCallback();
    if (callback != null)
      callback.unscheduleDrawable((Drawable)this, paramRunnable); 
  }
  
  public final void y(Drawable paramDrawable) {
    if (paramDrawable == null)
      return; 
    paramDrawable.setCallback(this);
    a.a.a.a.a.o0(paramDrawable, a.a.a.a.a.B((Drawable)this));
    paramDrawable.setLevel(getLevel());
    paramDrawable.setVisible(isVisible(), false);
    if (paramDrawable == this.L) {
      if (paramDrawable.isStateful())
        paramDrawable.setState(this.y0); 
      paramDrawable.setTintList(this.N);
      return;
    } 
    if (paramDrawable.isStateful())
      paramDrawable.setState(getState()); 
    Drawable drawable = this.G;
    if (paramDrawable == drawable && this.J)
      drawable.setTintList(this.H); 
  }
  
  public final void z(Rect paramRect, RectF paramRectF) {
    paramRectF.setEmpty();
    if (o0() || n0()) {
      float f1 = this.V + this.W;
      if (a.a.a.a.a.B((Drawable)this) == 0) {
        f1 = paramRect.left + f1;
        paramRectF.left = f1;
        paramRectF.right = f1 + this.I;
      } else {
        f1 = paramRect.right - f1;
        paramRectF.right = f1;
        paramRectF.left = f1 - this.I;
      } 
      float f2 = paramRect.exactCenterY();
      f1 = this.I;
      f2 -= f1 / 2.0F;
      paramRectF.top = f2;
      paramRectF.bottom = f2 + f1;
    } 
  }
  
  public static interface a {
    void a();
  }
}


/* Location:              C:\Users\panch\Downloads\dvba_v1.1.0-dex2jar.jar!\c\c\a\b\s\b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */