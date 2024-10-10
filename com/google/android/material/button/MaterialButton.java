package com.google.android.material.button;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.InsetDrawable;
import android.graphics.drawable.LayerDrawable;
import android.graphics.drawable.RippleDrawable;
import android.os.Build;
import android.text.TextPaint;
import android.util.AttributeSet;
import android.util.Log;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.Button;
import android.widget.Checkable;
import android.widget.CompoundButton;
import b.b.p.f;
import b.i.m.l;
import c.c.a.a.c.l.q;
import c.c.a.b.d0.g;
import c.c.a.b.d0.j;
import c.c.a.b.d0.n;
import c.c.a.b.j;
import c.c.a.b.k;
import c.c.a.b.y.i;
import java.util.Iterator;
import java.util.LinkedHashSet;

public class MaterialButton extends f implements Checkable, n {
  public static final int[] p = new int[] { 16842911 };
  
  public static final int[] q = new int[] { 16842912 };
  
  public static final int r = j.Widget_MaterialComponents_Button;
  
  public final c.c.a.b.p.a d;
  
  public final LinkedHashSet<a> e;
  
  public b f;
  
  public PorterDuff.Mode g;
  
  public ColorStateList h;
  
  public Drawable i;
  
  public int j;
  
  public int k;
  
  public int l;
  
  public boolean m;
  
  public boolean n;
  
  public int o;
  
  public MaterialButton(Context paramContext, AttributeSet paramAttributeSet) {
    super(i.d(paramContext, paramAttributeSet, i, r), paramAttributeSet, i);
    boolean bool;
    this.e = new LinkedHashSet<a>();
    this.m = false;
    this.n = false;
    Context context = getContext();
    TypedArray typedArray = i.e(context, paramAttributeSet, k.MaterialButton, i, r, new int[0]);
    this.l = typedArray.getDimensionPixelSize(k.MaterialButton_iconPadding, 0);
    this.g = q.M(typedArray.getInt(k.MaterialButton_iconTintMode, -1), PorterDuff.Mode.SRC_IN);
    this.h = q.z(getContext(), typedArray, k.MaterialButton_iconTint);
    this.i = q.C(getContext(), typedArray, k.MaterialButton_icon);
    this.o = typedArray.getInteger(k.MaterialButton_iconGravity, 1);
    this.j = typedArray.getDimensionPixelSize(k.MaterialButton_iconSize, 0);
    c.c.a.b.p.a a1 = new c.c.a.b.p.a(this, j.b(context, paramAttributeSet, i, r).a());
    this.d = a1;
    a1.c = typedArray.getDimensionPixelOffset(k.MaterialButton_android_insetLeft, 0);
    a1.d = typedArray.getDimensionPixelOffset(k.MaterialButton_android_insetRight, 0);
    a1.e = typedArray.getDimensionPixelOffset(k.MaterialButton_android_insetTop, 0);
    a1.f = typedArray.getDimensionPixelOffset(k.MaterialButton_android_insetBottom, 0);
    if (typedArray.hasValue(k.MaterialButton_cornerRadius)) {
      i = typedArray.getDimensionPixelSize(k.MaterialButton_cornerRadius, -1);
      a1.g = i;
      a1.e(a1.b.e(i));
      a1.p = true;
    } 
    a1.h = typedArray.getDimensionPixelSize(k.MaterialButton_strokeWidth, 0);
    a1.i = q.M(typedArray.getInt(k.MaterialButton_backgroundTintMode, -1), PorterDuff.Mode.SRC_IN);
    a1.j = q.z(a1.a.getContext(), typedArray, k.MaterialButton_backgroundTint);
    a1.k = q.z(a1.a.getContext(), typedArray, k.MaterialButton_strokeColor);
    a1.l = q.z(a1.a.getContext(), typedArray, k.MaterialButton_rippleColor);
    a1.q = typedArray.getBoolean(k.MaterialButton_android_checkable, false);
    int m = typedArray.getDimensionPixelSize(k.MaterialButton_elevation, 0);
    int i2 = l.v((View)a1.a);
    int k = a1.a.getPaddingTop();
    int j = a1.a.getPaddingEnd();
    int i1 = a1.a.getPaddingBottom();
    MaterialButton materialButton = a1.a;
    g g2 = new g(a1.b);
    g2.o(a1.a.getContext());
    g2.setTintList(a1.j);
    PorterDuff.Mode mode = a1.i;
    if (mode != null)
      g2.setTintMode(mode); 
    g2.t(a1.h, a1.k);
    g g4 = new g(a1.b);
    g4.setTint(0);
    float f1 = a1.h;
    if (a1.n) {
      i = q.y((View)a1.a, c.c.a.b.b.colorSurface);
    } else {
      i = 0;
    } 
    g4.s(f1, i);
    g g3 = new g(a1.b);
    a1.m = (Drawable)g3;
    g3.setTint(-1);
    RippleDrawable rippleDrawable = new RippleDrawable(c.c.a.b.b0.a.a(a1.l), (Drawable)new InsetDrawable((Drawable)new LayerDrawable(new Drawable[] { (Drawable)g4, (Drawable)g2 }, ), a1.c, a1.e, a1.d, a1.f), a1.m);
    a1.r = (LayerDrawable)rippleDrawable;
    materialButton.setInternalBackground((Drawable)rippleDrawable);
    g g1 = a1.b();
    if (g1 != null)
      g1.p(m); 
    a1.a.setPaddingRelative(i2 + a1.c, k + a1.e, j + a1.d, i1 + a1.f);
    typedArray.recycle();
    setCompoundDrawablePadding(this.l);
    if (this.i != null) {
      bool = true;
    } else {
      bool = false;
    } 
    c(bool);
  }
  
  private String getA11yClassName() {
    Class<Button> clazz;
    if (a()) {
      Class<CompoundButton> clazz1 = CompoundButton.class;
    } else {
      clazz = Button.class;
    } 
    return clazz.getName();
  }
  
  public boolean a() {
    boolean bool;
    c.c.a.b.p.a a1 = this.d;
    if (a1 != null && a1.q) {
      bool = true;
    } else {
      bool = false;
    } 
    return bool;
  }
  
  public final boolean b() {
    boolean bool;
    c.c.a.b.p.a a1 = this.d;
    if (a1 != null && !a1.o) {
      bool = true;
    } else {
      bool = false;
    } 
    return bool;
  }
  
  public final void c(boolean paramBoolean) {
    // Byte code:
    //   0: aload_0
    //   1: getfield i : Landroid/graphics/drawable/Drawable;
    //   4: astore #6
    //   6: iconst_0
    //   7: istore #4
    //   9: aload #6
    //   11: ifnull -> 124
    //   14: aload #6
    //   16: invokestatic C0 : (Landroid/graphics/drawable/Drawable;)Landroid/graphics/drawable/Drawable;
    //   19: invokevirtual mutate : ()Landroid/graphics/drawable/Drawable;
    //   22: astore #6
    //   24: aload_0
    //   25: aload #6
    //   27: putfield i : Landroid/graphics/drawable/Drawable;
    //   30: aload #6
    //   32: aload_0
    //   33: getfield h : Landroid/content/res/ColorStateList;
    //   36: invokevirtual setTintList : (Landroid/content/res/ColorStateList;)V
    //   39: aload_0
    //   40: getfield g : Landroid/graphics/PorterDuff$Mode;
    //   43: astore #6
    //   45: aload #6
    //   47: ifnull -> 59
    //   50: aload_0
    //   51: getfield i : Landroid/graphics/drawable/Drawable;
    //   54: aload #6
    //   56: invokevirtual setTintMode : (Landroid/graphics/PorterDuff$Mode;)V
    //   59: aload_0
    //   60: getfield j : I
    //   63: istore_2
    //   64: iload_2
    //   65: ifeq -> 71
    //   68: goto -> 79
    //   71: aload_0
    //   72: getfield i : Landroid/graphics/drawable/Drawable;
    //   75: invokevirtual getIntrinsicWidth : ()I
    //   78: istore_2
    //   79: aload_0
    //   80: getfield j : I
    //   83: istore_3
    //   84: iload_3
    //   85: ifeq -> 91
    //   88: goto -> 99
    //   91: aload_0
    //   92: getfield i : Landroid/graphics/drawable/Drawable;
    //   95: invokevirtual getIntrinsicHeight : ()I
    //   98: istore_3
    //   99: aload_0
    //   100: getfield i : Landroid/graphics/drawable/Drawable;
    //   103: astore #6
    //   105: aload_0
    //   106: getfield k : I
    //   109: istore #5
    //   111: aload #6
    //   113: iload #5
    //   115: iconst_0
    //   116: iload_2
    //   117: iload #5
    //   119: iadd
    //   120: iload_3
    //   121: invokevirtual setBounds : (IIII)V
    //   124: aload_0
    //   125: getfield o : I
    //   128: istore_2
    //   129: iload_2
    //   130: iconst_1
    //   131: if_icmpeq -> 147
    //   134: iload_2
    //   135: iconst_2
    //   136: if_icmpne -> 142
    //   139: goto -> 147
    //   142: iconst_0
    //   143: istore_2
    //   144: goto -> 149
    //   147: iconst_1
    //   148: istore_2
    //   149: iload_1
    //   150: ifeq -> 185
    //   153: aload_0
    //   154: getfield i : Landroid/graphics/drawable/Drawable;
    //   157: astore #6
    //   159: iload_2
    //   160: ifeq -> 175
    //   163: aload_0
    //   164: aload #6
    //   166: aconst_null
    //   167: aconst_null
    //   168: aconst_null
    //   169: invokevirtual setCompoundDrawablesRelative : (Landroid/graphics/drawable/Drawable;Landroid/graphics/drawable/Drawable;Landroid/graphics/drawable/Drawable;Landroid/graphics/drawable/Drawable;)V
    //   172: goto -> 184
    //   175: aload_0
    //   176: aconst_null
    //   177: aconst_null
    //   178: aload #6
    //   180: aconst_null
    //   181: invokevirtual setCompoundDrawablesRelative : (Landroid/graphics/drawable/Drawable;Landroid/graphics/drawable/Drawable;Landroid/graphics/drawable/Drawable;Landroid/graphics/drawable/Drawable;)V
    //   184: return
    //   185: aload_0
    //   186: invokevirtual getCompoundDrawablesRelative : ()[Landroid/graphics/drawable/Drawable;
    //   189: astore #7
    //   191: aload #7
    //   193: iconst_0
    //   194: aaload
    //   195: astore #6
    //   197: aload #7
    //   199: iconst_2
    //   200: aaload
    //   201: astore #7
    //   203: iload_2
    //   204: ifeq -> 216
    //   207: aload #6
    //   209: aload_0
    //   210: getfield i : Landroid/graphics/drawable/Drawable;
    //   213: if_acmpne -> 235
    //   216: iload #4
    //   218: istore_3
    //   219: iload_2
    //   220: ifne -> 237
    //   223: iload #4
    //   225: istore_3
    //   226: aload #7
    //   228: aload_0
    //   229: getfield i : Landroid/graphics/drawable/Drawable;
    //   232: if_acmpeq -> 237
    //   235: iconst_1
    //   236: istore_3
    //   237: iload_3
    //   238: ifeq -> 272
    //   241: aload_0
    //   242: getfield i : Landroid/graphics/drawable/Drawable;
    //   245: astore #6
    //   247: iload_2
    //   248: ifeq -> 263
    //   251: aload_0
    //   252: aload #6
    //   254: aconst_null
    //   255: aconst_null
    //   256: aconst_null
    //   257: invokevirtual setCompoundDrawablesRelative : (Landroid/graphics/drawable/Drawable;Landroid/graphics/drawable/Drawable;Landroid/graphics/drawable/Drawable;Landroid/graphics/drawable/Drawable;)V
    //   260: goto -> 272
    //   263: aload_0
    //   264: aconst_null
    //   265: aconst_null
    //   266: aload #6
    //   268: aconst_null
    //   269: invokevirtual setCompoundDrawablesRelative : (Landroid/graphics/drawable/Drawable;Landroid/graphics/drawable/Drawable;Landroid/graphics/drawable/Drawable;Landroid/graphics/drawable/Drawable;)V
    //   272: return
  }
  
  public final void d() {
    if (this.i != null && getLayout() != null) {
      int i = this.o;
      byte b1 = 1;
      if (i == 1 || i == 3) {
        this.k = 0;
        c(false);
        return;
      } 
      TextPaint textPaint = getPaint();
      String str2 = getText().toString();
      String str1 = str2;
      if (getTransformationMethod() != null)
        str1 = getTransformationMethod().getTransformation(str2, (View)this).toString(); 
      int k = Math.min((int)textPaint.measureText(str1), getLayout().getEllipsizedWidth());
      int j = this.j;
      i = j;
      if (j == 0)
        i = this.i.getIntrinsicWidth(); 
      k = (getMeasuredWidth() - k - l.u((View)this) - i - this.l - getPaddingStart()) / 2;
      if (l.r((View)this) == 1) {
        i = 1;
      } else {
        i = 0;
      } 
      if (this.o != 4)
        b1 = 0; 
      j = k;
      if (i != b1)
        j = -k; 
      if (this.k != j) {
        this.k = j;
        c(false);
      } 
      return;
    } 
  }
  
  public ColorStateList getBackgroundTintList() {
    return getSupportBackgroundTintList();
  }
  
  public PorterDuff.Mode getBackgroundTintMode() {
    return getSupportBackgroundTintMode();
  }
  
  public int getCornerRadius() {
    boolean bool;
    if (b()) {
      bool = this.d.g;
    } else {
      bool = false;
    } 
    return bool;
  }
  
  public Drawable getIcon() {
    return this.i;
  }
  
  public int getIconGravity() {
    return this.o;
  }
  
  public int getIconPadding() {
    return this.l;
  }
  
  public int getIconSize() {
    return this.j;
  }
  
  public ColorStateList getIconTint() {
    return this.h;
  }
  
  public PorterDuff.Mode getIconTintMode() {
    return this.g;
  }
  
  public ColorStateList getRippleColor() {
    ColorStateList colorStateList;
    if (b()) {
      colorStateList = this.d.l;
    } else {
      colorStateList = null;
    } 
    return colorStateList;
  }
  
  public j getShapeAppearanceModel() {
    if (b())
      return this.d.b; 
    throw new IllegalStateException("Attempted to get ShapeAppearanceModel from a MaterialButton which has an overwritten background.");
  }
  
  public ColorStateList getStrokeColor() {
    ColorStateList colorStateList;
    if (b()) {
      colorStateList = this.d.k;
    } else {
      colorStateList = null;
    } 
    return colorStateList;
  }
  
  public int getStrokeWidth() {
    boolean bool;
    if (b()) {
      bool = this.d.h;
    } else {
      bool = false;
    } 
    return bool;
  }
  
  public ColorStateList getSupportBackgroundTintList() {
    return b() ? this.d.j : super.getSupportBackgroundTintList();
  }
  
  public PorterDuff.Mode getSupportBackgroundTintMode() {
    return b() ? this.d.i : super.getSupportBackgroundTintMode();
  }
  
  public boolean isChecked() {
    return this.m;
  }
  
  public void onAttachedToWindow() {
    super.onAttachedToWindow();
    q.Y((View)this, this.d.b());
  }
  
  public int[] onCreateDrawableState(int paramInt) {
    int[] arrayOfInt = super.onCreateDrawableState(paramInt + 2);
    if (a())
      Button.mergeDrawableStates(arrayOfInt, p); 
    if (isChecked())
      Button.mergeDrawableStates(arrayOfInt, q); 
    return arrayOfInt;
  }
  
  public void onInitializeAccessibilityEvent(AccessibilityEvent paramAccessibilityEvent) {
    super.onInitializeAccessibilityEvent(paramAccessibilityEvent);
    paramAccessibilityEvent.setClassName(getA11yClassName());
    paramAccessibilityEvent.setChecked(isChecked());
  }
  
  public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo paramAccessibilityNodeInfo) {
    super.onInitializeAccessibilityNodeInfo(paramAccessibilityNodeInfo);
    paramAccessibilityNodeInfo.setClassName(getA11yClassName());
    paramAccessibilityNodeInfo.setCheckable(a());
    paramAccessibilityNodeInfo.setChecked(isChecked());
    paramAccessibilityNodeInfo.setClickable(isClickable());
  }
  
  public void onLayout(boolean paramBoolean, int paramInt1, int paramInt2, int paramInt3, int paramInt4) {
    super.onLayout(paramBoolean, paramInt1, paramInt2, paramInt3, paramInt4);
    if (Build.VERSION.SDK_INT == 21) {
      c.c.a.b.p.a a1 = this.d;
      if (a1 != null) {
        Drawable drawable = a1.m;
        if (drawable != null)
          drawable.setBounds(a1.c, a1.e, paramInt3 - paramInt1 - a1.d, paramInt4 - paramInt2 - a1.f); 
      } 
    } 
  }
  
  public void onMeasure(int paramInt1, int paramInt2) {
    super.onMeasure(paramInt1, paramInt2);
    d();
  }
  
  public void onTextChanged(CharSequence paramCharSequence, int paramInt1, int paramInt2, int paramInt3) {
    super.onTextChanged(paramCharSequence, paramInt1, paramInt2, paramInt3);
    d();
  }
  
  public boolean performClick() {
    toggle();
    return super.performClick();
  }
  
  public void setBackground(Drawable paramDrawable) {
    setBackgroundDrawable(paramDrawable);
  }
  
  public void setBackgroundColor(int paramInt) {
    if (b()) {
      c.c.a.b.p.a a1 = this.d;
      if (a1.b() != null)
        a1.b().setTint(paramInt); 
    } else {
      super.setBackgroundColor(paramInt);
    } 
  }
  
  public void setBackgroundDrawable(Drawable paramDrawable) {
    if (b())
      if (paramDrawable != getBackground()) {
        Log.w("MaterialButton", "Do not set the background; MaterialButton manages its own background drawable.");
        c.c.a.b.p.a a1 = this.d;
        a1.o = true;
        a1.a.setSupportBackgroundTintList(a1.j);
        a1.a.setSupportBackgroundTintMode(a1.i);
      } else {
        getBackground().setState(paramDrawable.getState());
        return;
      }  
    super.setBackgroundDrawable(paramDrawable);
  }
  
  public void setBackgroundResource(int paramInt) {
    Drawable drawable;
    if (paramInt != 0) {
      drawable = b.b.l.a.a.b(getContext(), paramInt);
    } else {
      drawable = null;
    } 
    setBackgroundDrawable(drawable);
  }
  
  public void setBackgroundTintList(ColorStateList paramColorStateList) {
    setSupportBackgroundTintList(paramColorStateList);
  }
  
  public void setBackgroundTintMode(PorterDuff.Mode paramMode) {
    setSupportBackgroundTintMode(paramMode);
  }
  
  public void setCheckable(boolean paramBoolean) {
    if (b())
      this.d.q = paramBoolean; 
  }
  
  public void setChecked(boolean paramBoolean) {
    if (a() && isEnabled() && this.m != paramBoolean) {
      this.m = paramBoolean;
      refreshDrawableState();
      if (this.n)
        return; 
      this.n = true;
      Iterator<a> iterator = this.e.iterator();
      while (iterator.hasNext())
        ((a)iterator.next()).a(this, this.m); 
      this.n = false;
    } 
  }
  
  public void setCornerRadius(int paramInt) {
    if (b()) {
      c.c.a.b.p.a a1 = this.d;
      if (!a1.p || a1.g != paramInt) {
        a1.g = paramInt;
        a1.p = true;
        a1.e(a1.b.e(paramInt));
      } 
    } 
  }
  
  public void setCornerRadiusResource(int paramInt) {
    if (b())
      setCornerRadius(getResources().getDimensionPixelSize(paramInt)); 
  }
  
  public void setElevation(float paramFloat) {
    super.setElevation(paramFloat);
    if (b()) {
      g g = this.d.b();
      g.b b1 = g.b;
      if (b1.o != paramFloat) {
        b1.o = paramFloat;
        g.x();
      } 
    } 
  }
  
  public void setIcon(Drawable paramDrawable) {
    if (this.i != paramDrawable) {
      this.i = paramDrawable;
      c(true);
    } 
  }
  
  public void setIconGravity(int paramInt) {
    if (this.o != paramInt) {
      this.o = paramInt;
      d();
    } 
  }
  
  public void setIconPadding(int paramInt) {
    if (this.l != paramInt) {
      this.l = paramInt;
      setCompoundDrawablePadding(paramInt);
    } 
  }
  
  public void setIconResource(int paramInt) {
    Drawable drawable;
    if (paramInt != 0) {
      drawable = b.b.l.a.a.b(getContext(), paramInt);
    } else {
      drawable = null;
    } 
    setIcon(drawable);
  }
  
  public void setIconSize(int paramInt) {
    if (paramInt >= 0) {
      if (this.j != paramInt) {
        this.j = paramInt;
        c(true);
      } 
      return;
    } 
    throw new IllegalArgumentException("iconSize cannot be less than 0");
  }
  
  public void setIconTint(ColorStateList paramColorStateList) {
    if (this.h != paramColorStateList) {
      this.h = paramColorStateList;
      c(false);
    } 
  }
  
  public void setIconTintMode(PorterDuff.Mode paramMode) {
    if (this.g != paramMode) {
      this.g = paramMode;
      c(false);
    } 
  }
  
  public void setIconTintResource(int paramInt) {
    setIconTint(b.b.l.a.a.a(getContext(), paramInt));
  }
  
  public void setInternalBackground(Drawable paramDrawable) {
    super.setBackgroundDrawable(paramDrawable);
  }
  
  public void setOnPressedChangeListenerInternal(b paramb) {
    this.f = paramb;
  }
  
  public void setPressed(boolean paramBoolean) {
    b b1 = this.f;
    if (b1 != null)
      b1.a(this, paramBoolean); 
    super.setPressed(paramBoolean);
  }
  
  public void setRippleColor(ColorStateList paramColorStateList) {
    if (b()) {
      c.c.a.b.p.a a1 = this.d;
      if (a1.l != paramColorStateList) {
        a1.l = paramColorStateList;
        if (a1.a.getBackground() instanceof RippleDrawable)
          ((RippleDrawable)a1.a.getBackground()).setColor(c.c.a.b.b0.a.a(paramColorStateList)); 
      } 
    } 
  }
  
  public void setRippleColorResource(int paramInt) {
    if (b())
      setRippleColor(b.b.l.a.a.a(getContext(), paramInt)); 
  }
  
  public void setShapeAppearanceModel(j paramj) {
    if (b()) {
      this.d.e(paramj);
      return;
    } 
    throw new IllegalStateException("Attempted to set ShapeAppearanceModel on a MaterialButton which has an overwritten background.");
  }
  
  public void setShouldDrawSurfaceColorStroke(boolean paramBoolean) {
    if (b()) {
      c.c.a.b.p.a a1 = this.d;
      a1.n = paramBoolean;
      a1.f();
    } 
  }
  
  public void setStrokeColor(ColorStateList paramColorStateList) {
    if (b()) {
      c.c.a.b.p.a a1 = this.d;
      if (a1.k != paramColorStateList) {
        a1.k = paramColorStateList;
        a1.f();
      } 
    } 
  }
  
  public void setStrokeColorResource(int paramInt) {
    if (b())
      setStrokeColor(b.b.l.a.a.a(getContext(), paramInt)); 
  }
  
  public void setStrokeWidth(int paramInt) {
    if (b()) {
      c.c.a.b.p.a a1 = this.d;
      if (a1.h != paramInt) {
        a1.h = paramInt;
        a1.f();
      } 
    } 
  }
  
  public void setStrokeWidthResource(int paramInt) {
    if (b())
      setStrokeWidth(getResources().getDimensionPixelSize(paramInt)); 
  }
  
  public void setSupportBackgroundTintList(ColorStateList paramColorStateList) {
    if (b()) {
      c.c.a.b.p.a a1 = this.d;
      if (a1.j != paramColorStateList) {
        a1.j = paramColorStateList;
        if (a1.b() != null)
          a1.b().setTintList(a1.j); 
      } 
    } else {
      super.setSupportBackgroundTintList(paramColorStateList);
    } 
  }
  
  public void setSupportBackgroundTintMode(PorterDuff.Mode paramMode) {
    if (b()) {
      c.c.a.b.p.a a1 = this.d;
      if (a1.i != paramMode) {
        a1.i = paramMode;
        if (a1.b() != null && a1.i != null)
          a1.b().setTintMode(a1.i); 
      } 
    } else {
      super.setSupportBackgroundTintMode(paramMode);
    } 
  }
  
  public void toggle() {
    setChecked(this.m ^ true);
  }
  
  public static interface a {
    void a(MaterialButton param1MaterialButton, boolean param1Boolean);
  }
  
  public static interface b {
    void a(MaterialButton param1MaterialButton, boolean param1Boolean);
  }
}


/* Location:              C:\Users\panch\Downloads\dvba_v1.1.0-dex2jar.jar!\com\google\android\material\button\MaterialButton.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */