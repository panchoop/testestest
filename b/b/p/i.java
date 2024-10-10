package b.b.p;

import a.a.a.a.a;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.widget.CompoundButton;

public class i {
  public final CompoundButton a;
  
  public ColorStateList b = null;
  
  public PorterDuff.Mode c = null;
  
  public boolean d = false;
  
  public boolean e = false;
  
  public boolean f;
  
  public i(CompoundButton paramCompoundButton) {
    this.a = paramCompoundButton;
  }
  
  public void a() {
    Drawable drawable = a.A(this.a);
    if (drawable != null && (this.d || this.e)) {
      drawable = a.C0(drawable).mutate();
      if (this.d)
        drawable.setTintList(this.b); 
      if (this.e)
        drawable.setTintMode(this.c); 
      if (drawable.isStateful())
        drawable.setState(this.a.getDrawableState()); 
      this.a.setButtonDrawable(drawable);
    } 
  }
  
  public void b(AttributeSet paramAttributeSet, int paramInt) {
    // Byte code:
    //   0: aload_0
    //   1: getfield a : Landroid/widget/CompoundButton;
    //   4: invokevirtual getContext : ()Landroid/content/Context;
    //   7: aload_1
    //   8: getstatic b/b/j.CompoundButton : [I
    //   11: iload_2
    //   12: iconst_0
    //   13: invokestatic q : (Landroid/content/Context;Landroid/util/AttributeSet;[III)Lb/b/p/x0;
    //   16: astore_3
    //   17: aload_0
    //   18: getfield a : Landroid/widget/CompoundButton;
    //   21: astore #4
    //   23: aload #4
    //   25: aload #4
    //   27: invokevirtual getContext : ()Landroid/content/Context;
    //   30: getstatic b/b/j.CompoundButton : [I
    //   33: aload_1
    //   34: aload_3
    //   35: getfield b : Landroid/content/res/TypedArray;
    //   38: iload_2
    //   39: iconst_0
    //   40: invokestatic V : (Landroid/view/View;Landroid/content/Context;[ILandroid/util/AttributeSet;Landroid/content/res/TypedArray;II)V
    //   43: aload_3
    //   44: getstatic b/b/j.CompoundButton_buttonCompat : I
    //   47: invokevirtual o : (I)Z
    //   50: ifeq -> 89
    //   53: aload_3
    //   54: getstatic b/b/j.CompoundButton_buttonCompat : I
    //   57: iconst_0
    //   58: invokevirtual l : (II)I
    //   61: istore_2
    //   62: iload_2
    //   63: ifeq -> 89
    //   66: aload_0
    //   67: getfield a : Landroid/widget/CompoundButton;
    //   70: aload_0
    //   71: getfield a : Landroid/widget/CompoundButton;
    //   74: invokevirtual getContext : ()Landroid/content/Context;
    //   77: iload_2
    //   78: invokestatic b : (Landroid/content/Context;I)Landroid/graphics/drawable/Drawable;
    //   81: invokevirtual setButtonDrawable : (Landroid/graphics/drawable/Drawable;)V
    //   84: iconst_1
    //   85: istore_2
    //   86: goto -> 91
    //   89: iconst_0
    //   90: istore_2
    //   91: iload_2
    //   92: ifne -> 136
    //   95: aload_3
    //   96: getstatic b/b/j.CompoundButton_android_button : I
    //   99: invokevirtual o : (I)Z
    //   102: ifeq -> 136
    //   105: aload_3
    //   106: getstatic b/b/j.CompoundButton_android_button : I
    //   109: iconst_0
    //   110: invokevirtual l : (II)I
    //   113: istore_2
    //   114: iload_2
    //   115: ifeq -> 136
    //   118: aload_0
    //   119: getfield a : Landroid/widget/CompoundButton;
    //   122: aload_0
    //   123: getfield a : Landroid/widget/CompoundButton;
    //   126: invokevirtual getContext : ()Landroid/content/Context;
    //   129: iload_2
    //   130: invokestatic b : (Landroid/content/Context;I)Landroid/graphics/drawable/Drawable;
    //   133: invokevirtual setButtonDrawable : (Landroid/graphics/drawable/Drawable;)V
    //   136: aload_3
    //   137: getstatic b/b/j.CompoundButton_buttonTint : I
    //   140: invokevirtual o : (I)Z
    //   143: ifeq -> 167
    //   146: aload_0
    //   147: getfield a : Landroid/widget/CompoundButton;
    //   150: aload_3
    //   151: getstatic b/b/j.CompoundButton_buttonTint : I
    //   154: invokevirtual c : (I)Landroid/content/res/ColorStateList;
    //   157: invokevirtual setButtonTintList : (Landroid/content/res/ColorStateList;)V
    //   160: goto -> 167
    //   163: astore_1
    //   164: goto -> 204
    //   167: aload_3
    //   168: getstatic b/b/j.CompoundButton_buttonTintMode : I
    //   171: invokevirtual o : (I)Z
    //   174: ifeq -> 196
    //   177: aload_0
    //   178: getfield a : Landroid/widget/CompoundButton;
    //   181: aload_3
    //   182: getstatic b/b/j.CompoundButton_buttonTintMode : I
    //   185: iconst_m1
    //   186: invokevirtual j : (II)I
    //   189: aconst_null
    //   190: invokestatic c : (ILandroid/graphics/PorterDuff$Mode;)Landroid/graphics/PorterDuff$Mode;
    //   193: invokevirtual setButtonTintMode : (Landroid/graphics/PorterDuff$Mode;)V
    //   196: aload_3
    //   197: getfield b : Landroid/content/res/TypedArray;
    //   200: invokevirtual recycle : ()V
    //   203: return
    //   204: aload_3
    //   205: getfield b : Landroid/content/res/TypedArray;
    //   208: invokevirtual recycle : ()V
    //   211: aload_1
    //   212: athrow
    //   213: astore_1
    //   214: goto -> 89
    // Exception table:
    //   from	to	target	type
    //   43	62	163	finally
    //   66	84	213	android/content/res/Resources$NotFoundException
    //   66	84	163	finally
    //   95	114	163	finally
    //   118	136	163	finally
    //   136	160	163	finally
    //   167	196	163	finally
  }
}


/* Location:              C:\Users\panch\Downloads\dvba_v1.1.0-dex2jar.jar!\b\b\p\i.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */