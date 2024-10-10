package b.b.p;

import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.AttributeSet;
import android.view.View;
import b.i.m.l;

public class e {
  public final View a;
  
  public final j b;
  
  public int c = -1;
  
  public v0 d;
  
  public v0 e;
  
  public v0 f;
  
  public e(View paramView) {
    this.a = paramView;
    this.b = j.a();
  }
  
  public void a() {
    Drawable drawable = this.a.getBackground();
    if (drawable != null) {
      int i = Build.VERSION.SDK_INT;
      boolean bool = true;
      if ((i > 21) ? (this.d != null) : (i == 21)) {
        i = 1;
      } else {
        i = 0;
      } 
      if (i != 0) {
        if (this.f == null)
          this.f = new v0(); 
        v0 v02 = this.f;
        v02.a = null;
        v02.d = false;
        v02.b = null;
        v02.c = false;
        ColorStateList colorStateList = l.j(this.a);
        if (colorStateList != null) {
          v02.d = true;
          v02.a = colorStateList;
        } 
        PorterDuff.Mode mode = this.a.getBackgroundTintMode();
        if (mode != null) {
          v02.c = true;
          v02.b = mode;
        } 
        if (v02.d || v02.c) {
          j.f(drawable, v02, this.a.getDrawableState());
          i = bool;
        } else {
          i = 0;
        } 
        if (i != 0)
          return; 
      } 
      v0 v01 = this.e;
      if (v01 != null) {
        j.f(drawable, v01, this.a.getDrawableState());
      } else {
        v01 = this.d;
        if (v01 != null)
          j.f(drawable, v01, this.a.getDrawableState()); 
      } 
    } 
  }
  
  public ColorStateList b() {
    v0 v01 = this.e;
    if (v01 != null) {
      ColorStateList colorStateList = v01.a;
    } else {
      v01 = null;
    } 
    return (ColorStateList)v01;
  }
  
  public PorterDuff.Mode c() {
    v0 v01 = this.e;
    if (v01 != null) {
      PorterDuff.Mode mode = v01.b;
    } else {
      v01 = null;
    } 
    return (PorterDuff.Mode)v01;
  }
  
  public void d(AttributeSet paramAttributeSet, int paramInt) {
    // Byte code:
    //   0: aload_0
    //   1: getfield a : Landroid/view/View;
    //   4: invokevirtual getContext : ()Landroid/content/Context;
    //   7: astore #4
    //   9: getstatic b/b/j.ViewBackgroundHelper : [I
    //   12: astore #5
    //   14: iconst_0
    //   15: istore_3
    //   16: aload #4
    //   18: aload_1
    //   19: aload #5
    //   21: iload_2
    //   22: iconst_0
    //   23: invokestatic q : (Landroid/content/Context;Landroid/util/AttributeSet;[III)Lb/b/p/x0;
    //   26: astore #4
    //   28: aload_0
    //   29: getfield a : Landroid/view/View;
    //   32: astore #5
    //   34: aload #5
    //   36: aload #5
    //   38: invokevirtual getContext : ()Landroid/content/Context;
    //   41: getstatic b/b/j.ViewBackgroundHelper : [I
    //   44: aload_1
    //   45: aload #4
    //   47: getfield b : Landroid/content/res/TypedArray;
    //   50: iload_2
    //   51: iconst_0
    //   52: invokestatic V : (Landroid/view/View;Landroid/content/Context;[ILandroid/util/AttributeSet;Landroid/content/res/TypedArray;II)V
    //   55: aload #4
    //   57: getstatic b/b/j.ViewBackgroundHelper_android_background : I
    //   60: invokevirtual o : (I)Z
    //   63: ifeq -> 107
    //   66: aload_0
    //   67: aload #4
    //   69: getstatic b/b/j.ViewBackgroundHelper_android_background : I
    //   72: iconst_m1
    //   73: invokevirtual l : (II)I
    //   76: putfield c : I
    //   79: aload_0
    //   80: getfield b : Lb/b/p/j;
    //   83: aload_0
    //   84: getfield a : Landroid/view/View;
    //   87: invokevirtual getContext : ()Landroid/content/Context;
    //   90: aload_0
    //   91: getfield c : I
    //   94: invokevirtual d : (Landroid/content/Context;I)Landroid/content/res/ColorStateList;
    //   97: astore_1
    //   98: aload_1
    //   99: ifnull -> 107
    //   102: aload_0
    //   103: aload_1
    //   104: invokevirtual g : (Landroid/content/res/ColorStateList;)V
    //   107: aload #4
    //   109: getstatic b/b/j.ViewBackgroundHelper_backgroundTint : I
    //   112: invokevirtual o : (I)Z
    //   115: ifeq -> 213
    //   118: aload_0
    //   119: getfield a : Landroid/view/View;
    //   122: astore_1
    //   123: aload_1
    //   124: aload #4
    //   126: getstatic b/b/j.ViewBackgroundHelper_backgroundTint : I
    //   129: invokevirtual c : (I)Landroid/content/res/ColorStateList;
    //   132: invokevirtual setBackgroundTintList : (Landroid/content/res/ColorStateList;)V
    //   135: getstatic android/os/Build$VERSION.SDK_INT : I
    //   138: bipush #21
    //   140: if_icmpne -> 213
    //   143: aload_1
    //   144: invokevirtual getBackground : ()Landroid/graphics/drawable/Drawable;
    //   147: astore #5
    //   149: aload_1
    //   150: invokevirtual getBackgroundTintList : ()Landroid/content/res/ColorStateList;
    //   153: ifnonnull -> 171
    //   156: aload_1
    //   157: invokevirtual getBackgroundTintMode : ()Landroid/graphics/PorterDuff$Mode;
    //   160: ifnull -> 166
    //   163: goto -> 171
    //   166: iconst_0
    //   167: istore_2
    //   168: goto -> 173
    //   171: iconst_1
    //   172: istore_2
    //   173: aload #5
    //   175: ifnull -> 213
    //   178: iload_2
    //   179: ifeq -> 213
    //   182: aload #5
    //   184: invokevirtual isStateful : ()Z
    //   187: ifeq -> 207
    //   190: aload #5
    //   192: aload_1
    //   193: invokevirtual getDrawableState : ()[I
    //   196: invokevirtual setState : ([I)Z
    //   199: pop
    //   200: goto -> 207
    //   203: astore_1
    //   204: goto -> 322
    //   207: aload_1
    //   208: aload #5
    //   210: invokevirtual setBackground : (Landroid/graphics/drawable/Drawable;)V
    //   213: aload #4
    //   215: getstatic b/b/j.ViewBackgroundHelper_backgroundTintMode : I
    //   218: invokevirtual o : (I)Z
    //   221: ifeq -> 313
    //   224: aload_0
    //   225: getfield a : Landroid/view/View;
    //   228: astore #5
    //   230: aload #5
    //   232: aload #4
    //   234: getstatic b/b/j.ViewBackgroundHelper_backgroundTintMode : I
    //   237: iconst_m1
    //   238: invokevirtual j : (II)I
    //   241: aconst_null
    //   242: invokestatic c : (ILandroid/graphics/PorterDuff$Mode;)Landroid/graphics/PorterDuff$Mode;
    //   245: invokevirtual setBackgroundTintMode : (Landroid/graphics/PorterDuff$Mode;)V
    //   248: getstatic android/os/Build$VERSION.SDK_INT : I
    //   251: bipush #21
    //   253: if_icmpne -> 313
    //   256: aload #5
    //   258: invokevirtual getBackground : ()Landroid/graphics/drawable/Drawable;
    //   261: astore_1
    //   262: aload #5
    //   264: invokevirtual getBackgroundTintList : ()Landroid/content/res/ColorStateList;
    //   267: ifnonnull -> 280
    //   270: iload_3
    //   271: istore_2
    //   272: aload #5
    //   274: invokevirtual getBackgroundTintMode : ()Landroid/graphics/PorterDuff$Mode;
    //   277: ifnull -> 282
    //   280: iconst_1
    //   281: istore_2
    //   282: aload_1
    //   283: ifnull -> 313
    //   286: iload_2
    //   287: ifeq -> 313
    //   290: aload_1
    //   291: invokevirtual isStateful : ()Z
    //   294: ifeq -> 307
    //   297: aload_1
    //   298: aload #5
    //   300: invokevirtual getDrawableState : ()[I
    //   303: invokevirtual setState : ([I)Z
    //   306: pop
    //   307: aload #5
    //   309: aload_1
    //   310: invokevirtual setBackground : (Landroid/graphics/drawable/Drawable;)V
    //   313: aload #4
    //   315: getfield b : Landroid/content/res/TypedArray;
    //   318: invokevirtual recycle : ()V
    //   321: return
    //   322: aload #4
    //   324: getfield b : Landroid/content/res/TypedArray;
    //   327: invokevirtual recycle : ()V
    //   330: aload_1
    //   331: athrow
    // Exception table:
    //   from	to	target	type
    //   55	98	203	finally
    //   102	107	203	finally
    //   107	163	203	finally
    //   182	200	203	finally
    //   207	213	203	finally
    //   213	270	203	finally
    //   272	280	203	finally
    //   290	307	203	finally
    //   307	313	203	finally
  }
  
  public void e() {
    this.c = -1;
    g(null);
    a();
  }
  
  public void f(int paramInt) {
    this.c = paramInt;
    j j1 = this.b;
    if (j1 != null) {
      ColorStateList colorStateList = j1.d(this.a.getContext(), paramInt);
    } else {
      j1 = null;
    } 
    g((ColorStateList)j1);
    a();
  }
  
  public void g(ColorStateList paramColorStateList) {
    if (paramColorStateList != null) {
      if (this.d == null)
        this.d = new v0(); 
      v0 v01 = this.d;
      v01.a = paramColorStateList;
      v01.d = true;
    } else {
      this.d = null;
    } 
    a();
  }
  
  public void h(ColorStateList paramColorStateList) {
    if (this.e == null)
      this.e = new v0(); 
    v0 v01 = this.e;
    v01.a = paramColorStateList;
    v01.d = true;
    a();
  }
  
  public void i(PorterDuff.Mode paramMode) {
    if (this.e == null)
      this.e = new v0(); 
    v0 v01 = this.e;
    v01.b = paramMode;
    v01.c = true;
    a();
  }
}


/* Location:              C:\Users\panch\Downloads\dvba_v1.1.0-dex2jar.jar!\b\b\p\e.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */