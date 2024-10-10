package com.google.android.material.textfield;

import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseArray;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStructure;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import b.b.p.x0;
import b.b.p.z;
import b.i.m.l;
import c.c.a.a.c.l.q;
import c.c.a.b.d0.j;
import c.c.a.b.g0.n;
import c.c.a.b.g0.o;
import c.c.a.b.g0.p;
import c.c.a.b.g0.q;
import c.c.a.b.i;
import c.c.a.b.j;
import c.c.a.b.k;
import c.c.a.b.y.i;
import com.google.android.material.internal.CheckableImageButton;
import java.util.Iterator;
import java.util.LinkedHashSet;

public class TextInputLayout extends LinearLayout {
  public static final int s0 = j.Widget_Design_TextInputLayout;
  
  public int A;
  
  public int B;
  
  public final Rect C = new Rect();
  
  public final Rect D = new Rect();
  
  public final RectF E = new RectF();
  
  public Typeface F;
  
  public final CheckableImageButton G;
  
  public ColorStateList H;
  
  public boolean I;
  
  public PorterDuff.Mode J;
  
  public boolean K;
  
  public Drawable L;
  
  public View.OnLongClickListener M;
  
  public final LinkedHashSet<f> N = new LinkedHashSet<f>();
  
  public int O = 0;
  
  public final SparseArray<n> P = new SparseArray();
  
  public final CheckableImageButton Q;
  
  public final LinkedHashSet<g> R = new LinkedHashSet<g>();
  
  public ColorStateList S;
  
  public boolean T;
  
  public PorterDuff.Mode U;
  
  public boolean V;
  
  public Drawable W;
  
  public Drawable a0;
  
  public final FrameLayout b;
  
  public final CheckableImageButton b0;
  
  public final FrameLayout c;
  
  public View.OnLongClickListener c0;
  
  public EditText d;
  
  public ColorStateList d0;
  
  public CharSequence e;
  
  public ColorStateList e0;
  
  public final o f = new o(this);
  
  public final int f0;
  
  public boolean g;
  
  public final int g0;
  
  public int h;
  
  public int h0;
  
  public boolean i;
  
  public int i0;
  
  public TextView j;
  
  public final int j0;
  
  public int k;
  
  public final int k0;
  
  public int l;
  
  public final int l0;
  
  public ColorStateList m;
  
  public boolean m0;
  
  public ColorStateList n;
  
  public final c.c.a.b.y.c n0 = new c.c.a.b.y.c((View)this);
  
  public boolean o;
  
  public boolean o0;
  
  public CharSequence p;
  
  public ValueAnimator p0;
  
  public boolean q;
  
  public boolean q0;
  
  public c.c.a.b.d0.g r;
  
  public boolean r0;
  
  public c.c.a.b.d0.g s;
  
  public j t;
  
  public final int u;
  
  public int v;
  
  public final int w;
  
  public int x;
  
  public final int y;
  
  public final int z;
  
  public TextInputLayout(Context paramContext, AttributeSet paramAttributeSet) {
    super(i.d(paramContext, paramAttributeSet, i2, s0), paramAttributeSet, i2);
    paramContext = getContext();
    setOrientation(1);
    setWillNotDraw(false);
    setAddStatesFromChildren(true);
    FrameLayout frameLayout = new FrameLayout(paramContext);
    this.b = frameLayout;
    frameLayout.setAddStatesFromChildren(true);
    addView((View)this.b);
    frameLayout = new FrameLayout(paramContext);
    this.c = frameLayout;
    frameLayout.setLayoutParams((ViewGroup.LayoutParams)new FrameLayout.LayoutParams(-2, -2, 8388629));
    this.b.addView((View)this.c);
    c.c.a.b.y.c c1 = this.n0;
    c1.L = c.c.a.b.l.a.a;
    c1.k();
    c1 = this.n0;
    c1.K = c.c.a.b.l.a.a;
    c1.k();
    c1 = this.n0;
    if (c1.h != 8388659) {
      c1.h = 8388659;
      c1.k();
    } 
    int[] arrayOfInt = k.TextInputLayout;
    int i1 = s0;
    int k = k.TextInputLayout_counterTextAppearance;
    int n = k.TextInputLayout_counterOverflowTextAppearance;
    int m = k.TextInputLayout_errorTextAppearance;
    int i = k.TextInputLayout_helperTextTextAppearance;
    int i3 = k.TextInputLayout_hintTextAppearance;
    i.a(paramContext, paramAttributeSet, i2, i1);
    i.b(paramContext, paramAttributeSet, arrayOfInt, i2, i1, new int[] { k, n, m, i, i3 });
    x0 x0 = new x0(paramContext, paramContext.obtainStyledAttributes(paramAttributeSet, arrayOfInt, i2, i1));
    this.o = x0.a(k.TextInputLayout_hintEnabled, true);
    setHint(x0.n(k.TextInputLayout_android_hint));
    this.o0 = x0.a(k.TextInputLayout_hintAnimationEnabled, true);
    this.t = j.b(paramContext, paramAttributeSet, i2, s0).a();
    this.u = paramContext.getResources().getDimensionPixelOffset(c.c.a.b.d.mtrl_textinput_box_label_cutout_padding);
    this.w = x0.e(k.TextInputLayout_boxCollapsedPaddingTop, 0);
    this.y = x0.f(k.TextInputLayout_boxStrokeWidth, paramContext.getResources().getDimensionPixelSize(c.c.a.b.d.mtrl_textinput_box_stroke_width_default));
    this.z = x0.f(k.TextInputLayout_boxStrokeWidthFocused, paramContext.getResources().getDimensionPixelSize(c.c.a.b.d.mtrl_textinput_box_stroke_width_focused));
    this.x = this.y;
    float f2 = x0.d(k.TextInputLayout_boxCornerRadiusTopStart, -1.0F);
    float f4 = x0.d(k.TextInputLayout_boxCornerRadiusTopEnd, -1.0F);
    float f1 = x0.d(k.TextInputLayout_boxCornerRadiusBottomEnd, -1.0F);
    float f3 = x0.d(k.TextInputLayout_boxCornerRadiusBottomStart, -1.0F);
    j j1 = this.t;
    if (j1 != null) {
      j.b b = new j.b(j1);
      if (f2 >= 0.0F)
        b.e(f2); 
      if (f4 >= 0.0F)
        b.f(f4); 
      if (f1 >= 0.0F)
        b.d(f1); 
      if (f3 >= 0.0F)
        b.c(f3); 
      this.t = b.a();
      ColorStateList colorStateList = q.A(paramContext, x0, k.TextInputLayout_boxBackgroundColor);
      if (colorStateList != null) {
        i = colorStateList.getDefaultColor();
        this.i0 = i;
        this.B = i;
        if (colorStateList.isStateful()) {
          this.j0 = colorStateList.getColorForState(new int[] { -16842910 }, -1);
          i = colorStateList.getColorForState(new int[] { 16843623 }, -1);
        } else {
          colorStateList = b.b.l.a.a.a(paramContext, c.c.a.b.c.mtrl_filled_background_color);
          this.j0 = colorStateList.getColorForState(new int[] { -16842910 }, -1);
          i = colorStateList.getColorForState(new int[] { 16843623 }, -1);
        } 
        this.k0 = i;
      } else {
        this.B = 0;
        this.i0 = 0;
        this.j0 = 0;
        this.k0 = 0;
      } 
      if (x0.o(k.TextInputLayout_android_textColorHint)) {
        colorStateList = x0.c(k.TextInputLayout_android_textColorHint);
        this.e0 = colorStateList;
        this.d0 = colorStateList;
      } 
      colorStateList = q.A(paramContext, x0, k.TextInputLayout_boxStrokeColor);
      if (colorStateList != null && colorStateList.isStateful()) {
        this.f0 = colorStateList.getDefaultColor();
        this.l0 = colorStateList.getColorForState(new int[] { -16842910 }, -1);
        this.g0 = colorStateList.getColorForState(new int[] { 16843623 }, -1);
        this.h0 = colorStateList.getColorForState(new int[] { 16842908 }, -1);
      } else {
        this.h0 = x0.b(k.TextInputLayout_boxStrokeColor, 0);
        this.f0 = b.i.e.a.a(paramContext, c.c.a.b.c.mtrl_textinput_default_box_stroke_color);
        this.l0 = b.i.e.a.a(paramContext, c.c.a.b.c.mtrl_textinput_disabled_color);
        this.g0 = b.i.e.a.a(paramContext, c.c.a.b.c.mtrl_textinput_hovered_box_stroke_color);
      } 
      if (x0.l(k.TextInputLayout_hintTextAppearance, -1) != -1)
        setHintTextAppearance(x0.l(k.TextInputLayout_hintTextAppearance, 0)); 
      k = x0.l(k.TextInputLayout_errorTextAppearance, 0);
      boolean bool1 = x0.a(k.TextInputLayout_errorEnabled, false);
      CheckableImageButton checkableImageButton2 = (CheckableImageButton)LayoutInflater.from(getContext()).inflate(c.c.a.b.h.design_text_input_end_icon, (ViewGroup)this.b, false);
      this.b0 = checkableImageButton2;
      this.b.addView((View)checkableImageButton2);
      this.b0.setVisibility(8);
      if (x0.o(k.TextInputLayout_errorIconDrawable))
        setErrorIconDrawable(x0.g(k.TextInputLayout_errorIconDrawable)); 
      if (x0.o(k.TextInputLayout_errorIconTint))
        setErrorIconTintList(q.A(paramContext, x0, k.TextInputLayout_errorIconTint)); 
      if (x0.o(k.TextInputLayout_errorIconTintMode))
        setErrorIconTintMode(q.M(x0.j(k.TextInputLayout_errorIconTintMode, -1), null)); 
      this.b0.setContentDescription(getResources().getText(i.error_icon_content_description));
      l.d0((View)this.b0, 2);
      this.b0.setClickable(false);
      this.b0.setPressable(false);
      this.b0.setFocusable(false);
      i = x0.l(k.TextInputLayout_helperTextTextAppearance, 0);
      boolean bool3 = x0.a(k.TextInputLayout_helperTextEnabled, false);
      CharSequence charSequence = x0.n(k.TextInputLayout_helperText);
      boolean bool2 = x0.a(k.TextInputLayout_counterEnabled, false);
      setCounterMaxLength(x0.j(k.TextInputLayout_counterMaxLength, -1));
      this.l = x0.l(k.TextInputLayout_counterTextAppearance, 0);
      this.k = x0.l(k.TextInputLayout_counterOverflowTextAppearance, 0);
      CheckableImageButton checkableImageButton3 = (CheckableImageButton)LayoutInflater.from(getContext()).inflate(c.c.a.b.h.design_text_input_start_icon, (ViewGroup)this.b, false);
      this.G = checkableImageButton3;
      this.b.addView((View)checkableImageButton3);
      this.G.setVisibility(8);
      setStartIconOnClickListener(null);
      setStartIconOnLongClickListener(null);
      if (x0.o(k.TextInputLayout_startIconDrawable)) {
        setStartIconDrawable(x0.g(k.TextInputLayout_startIconDrawable));
        if (x0.o(k.TextInputLayout_startIconContentDescription))
          setStartIconContentDescription(x0.n(k.TextInputLayout_startIconContentDescription)); 
        setStartIconCheckable(x0.a(k.TextInputLayout_startIconCheckable, true));
      } 
      if (x0.o(k.TextInputLayout_startIconTint))
        setStartIconTintList(q.A(paramContext, x0, k.TextInputLayout_startIconTint)); 
      if (x0.o(k.TextInputLayout_startIconTintMode))
        setStartIconTintMode(q.M(x0.j(k.TextInputLayout_startIconTintMode, -1), null)); 
      setHelperTextEnabled(bool3);
      setHelperText(charSequence);
      setHelperTextTextAppearance(i);
      setErrorEnabled(bool1);
      setErrorTextAppearance(k);
      setCounterTextAppearance(this.l);
      setCounterOverflowTextAppearance(this.k);
      if (x0.o(k.TextInputLayout_errorTextColor))
        setErrorTextColor(x0.c(k.TextInputLayout_errorTextColor)); 
      if (x0.o(k.TextInputLayout_helperTextTextColor))
        setHelperTextColor(x0.c(k.TextInputLayout_helperTextTextColor)); 
      if (x0.o(k.TextInputLayout_hintTextColor))
        setHintTextColor(x0.c(k.TextInputLayout_hintTextColor)); 
      if (x0.o(k.TextInputLayout_counterTextColor))
        setCounterTextColor(x0.c(k.TextInputLayout_counterTextColor)); 
      if (x0.o(k.TextInputLayout_counterOverflowTextColor))
        setCounterOverflowTextColor(x0.c(k.TextInputLayout_counterOverflowTextColor)); 
      setCounterEnabled(bool2);
      setBoxBackgroundMode(x0.j(k.TextInputLayout_boxBackgroundMode, 0));
      CheckableImageButton checkableImageButton1 = (CheckableImageButton)LayoutInflater.from(getContext()).inflate(c.c.a.b.h.design_text_input_end_icon, (ViewGroup)this.c, false);
      this.Q = checkableImageButton1;
      this.c.addView((View)checkableImageButton1);
      this.Q.setVisibility(8);
      this.P.append(-1, new c.c.a.b.g0.f(this));
      this.P.append(0, new p(this));
      this.P.append(1, new q(this));
      this.P.append(2, new c.c.a.b.g0.a(this));
      this.P.append(3, new c.c.a.b.g0.h(this));
      if (x0.o(k.TextInputLayout_endIconMode)) {
        setEndIconMode(x0.j(k.TextInputLayout_endIconMode, 0));
        if (x0.o(k.TextInputLayout_endIconDrawable))
          setEndIconDrawable(x0.g(k.TextInputLayout_endIconDrawable)); 
        if (x0.o(k.TextInputLayout_endIconContentDescription))
          setEndIconContentDescription(x0.n(k.TextInputLayout_endIconContentDescription)); 
        setEndIconCheckable(x0.a(k.TextInputLayout_endIconCheckable, true));
      } else if (x0.o(k.TextInputLayout_passwordToggleEnabled)) {
        setEndIconMode(x0.a(k.TextInputLayout_passwordToggleEnabled, false));
        setEndIconDrawable(x0.g(k.TextInputLayout_passwordToggleDrawable));
        setEndIconContentDescription(x0.n(k.TextInputLayout_passwordToggleContentDescription));
        if (x0.o(k.TextInputLayout_passwordToggleTint))
          setEndIconTintList(q.A(paramContext, x0, k.TextInputLayout_passwordToggleTint)); 
        if (x0.o(k.TextInputLayout_passwordToggleTintMode))
          setEndIconTintMode(q.M(x0.j(k.TextInputLayout_passwordToggleTintMode, -1), null)); 
      } 
      if (!x0.o(k.TextInputLayout_passwordToggleEnabled)) {
        if (x0.o(k.TextInputLayout_endIconTint))
          setEndIconTintList(q.A(paramContext, x0, k.TextInputLayout_endIconTint)); 
        if (x0.o(k.TextInputLayout_endIconTintMode))
          setEndIconTintMode(q.M(x0.j(k.TextInputLayout_endIconTintMode, -1), null)); 
      } 
      x0.b.recycle();
      setImportantForAccessibility(2);
      return;
    } 
    throw null;
  }
  
  private n getEndIconDelegate() {
    n n = (n)this.P.get(this.O);
    if (n == null)
      n = (n)this.P.get(0); 
    return n;
  }
  
  private CheckableImageButton getEndIconToUpdateDummyDrawable() {
    return (this.b0.getVisibility() == 0) ? this.b0 : ((i() && j()) ? this.Q : null);
  }
  
  public static void m(ViewGroup paramViewGroup, boolean paramBoolean) {
    int i = paramViewGroup.getChildCount();
    for (byte b = 0; b < i; b++) {
      View view = paramViewGroup.getChildAt(b);
      view.setEnabled(paramBoolean);
      if (view instanceof ViewGroup)
        m((ViewGroup)view, paramBoolean); 
    } 
  }
  
  public static void n(CheckableImageButton paramCheckableImageButton, View.OnLongClickListener paramOnLongClickListener) {
    boolean bool1;
    boolean bool = l.A((View)paramCheckableImageButton);
    boolean bool2 = false;
    byte b = 1;
    if (paramOnLongClickListener != null) {
      bool1 = true;
    } else {
      bool1 = false;
    } 
    if (bool || bool1)
      bool2 = true; 
    paramCheckableImageButton.setFocusable(bool2);
    paramCheckableImageButton.setClickable(bool);
    paramCheckableImageButton.setPressable(bool);
    paramCheckableImageButton.setLongClickable(bool1);
    if (!bool2)
      b = 2; 
    paramCheckableImageButton.setImportantForAccessibility(b);
  }
  
  private void setEditText(EditText paramEditText) {
    if (this.d == null) {
      if (this.O != 3 && !(paramEditText instanceof TextInputEditText))
        Log.i("TextInputLayout", "EditText added is not a TextInputEditText. Please switch to using that class instead."); 
      this.d = paramEditText;
      k();
      setTextInputAccessibilityDelegate(new e(this));
      this.n0.p(this.d.getTypeface());
      c.c.a.b.y.c c1 = this.n0;
      float f = this.d.getTextSize();
      if (c1.i != f) {
        c1.i = f;
        c1.k();
      } 
      int k = this.d.getGravity();
      c1 = this.n0;
      int i = k & 0xFFFFFF8F | 0x30;
      if (c1.h != i) {
        c1.h = i;
        c1.k();
      } 
      c1 = this.n0;
      if (c1.g != k) {
        c1.g = k;
        c1.k();
      } 
      this.d.addTextChangedListener(new a(this));
      if (this.d0 == null)
        this.d0 = this.d.getHintTextColors(); 
      if (this.o) {
        if (TextUtils.isEmpty(this.p)) {
          CharSequence charSequence = this.d.getHint();
          this.e = charSequence;
          setHint(charSequence);
          this.d.setHint(null);
        } 
        this.q = true;
      } 
      if (this.j != null)
        q(this.d.getText().length()); 
      s();
      this.f.b();
      this.G.bringToFront();
      this.c.bringToFront();
      this.b0.bringToFront();
      Iterator<f> iterator = this.N.iterator();
      while (iterator.hasNext())
        ((f)iterator.next()).a(this); 
      v(false, true);
      return;
    } 
    throw new IllegalArgumentException("We already have an EditText, can only have one");
  }
  
  private void setErrorIconVisible(boolean paramBoolean) {
    CheckableImageButton checkableImageButton = this.b0;
    boolean bool = false;
    if (paramBoolean) {
      b = 0;
    } else {
      b = 8;
    } 
    checkableImageButton.setVisibility(b);
    FrameLayout frameLayout = this.c;
    byte b = bool;
    if (paramBoolean)
      b = 8; 
    frameLayout.setVisibility(b);
    if (!i())
      t(); 
  }
  
  private void setHintInternal(CharSequence paramCharSequence) {
    if (!TextUtils.equals(paramCharSequence, this.p)) {
      this.p = paramCharSequence;
      c.c.a.b.y.c c1 = this.n0;
      if (paramCharSequence == null || !TextUtils.equals(c1.w, paramCharSequence)) {
        c1.w = paramCharSequence;
        c1.x = null;
        Bitmap bitmap = c1.A;
        if (bitmap != null) {
          bitmap.recycle();
          c1.A = null;
        } 
        c1.k();
      } 
      if (!this.m0)
        l(); 
    } 
  }
  
  public void a(f paramf) {
    this.N.add(paramf);
    if (this.d != null)
      paramf.a(this); 
  }
  
  public void addView(View paramView, int paramInt, ViewGroup.LayoutParams paramLayoutParams) {
    if (paramView instanceof EditText) {
      FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(paramLayoutParams);
      layoutParams.gravity = layoutParams.gravity & 0xFFFFFF8F | 0x10;
      this.b.addView(paramView, (ViewGroup.LayoutParams)layoutParams);
      this.b.setLayoutParams(paramLayoutParams);
      u();
      setEditText((EditText)paramView);
    } else {
      super.addView(paramView, paramInt, paramLayoutParams);
    } 
  }
  
  public void b(float paramFloat) {
    if (this.n0.c == paramFloat)
      return; 
    if (this.p0 == null) {
      ValueAnimator valueAnimator = new ValueAnimator();
      this.p0 = valueAnimator;
      valueAnimator.setInterpolator(c.c.a.b.l.a.b);
      this.p0.setDuration(167L);
      this.p0.addUpdateListener(new d(this));
    } 
    this.p0.setFloatValues(new float[] { this.n0.c, paramFloat });
    this.p0.start();
  }
  
  public final void c() {
    // Byte code:
    //   0: aload_0
    //   1: getfield r : Lc/c/a/b/d0/g;
    //   4: astore_3
    //   5: aload_3
    //   6: ifnonnull -> 10
    //   9: return
    //   10: aload_3
    //   11: aload_0
    //   12: getfield t : Lc/c/a/b/d0/j;
    //   15: invokevirtual setShapeAppearanceModel : (Lc/c/a/b/d0/j;)V
    //   18: aload_0
    //   19: getfield v : I
    //   22: istore_1
    //   23: iconst_0
    //   24: istore_2
    //   25: iload_1
    //   26: iconst_2
    //   27: if_icmpne -> 61
    //   30: aload_0
    //   31: getfield x : I
    //   34: iconst_m1
    //   35: if_icmple -> 50
    //   38: aload_0
    //   39: getfield A : I
    //   42: ifeq -> 50
    //   45: iconst_1
    //   46: istore_1
    //   47: goto -> 52
    //   50: iconst_0
    //   51: istore_1
    //   52: iload_1
    //   53: ifeq -> 61
    //   56: iconst_1
    //   57: istore_1
    //   58: goto -> 63
    //   61: iconst_0
    //   62: istore_1
    //   63: iload_1
    //   64: ifeq -> 83
    //   67: aload_0
    //   68: getfield r : Lc/c/a/b/d0/g;
    //   71: aload_0
    //   72: getfield x : I
    //   75: i2f
    //   76: aload_0
    //   77: getfield A : I
    //   80: invokevirtual s : (FI)V
    //   83: aload_0
    //   84: getfield B : I
    //   87: istore_1
    //   88: aload_0
    //   89: getfield v : I
    //   92: iconst_1
    //   93: if_icmpne -> 119
    //   96: getstatic c/c/a/b/b.colorSurface : I
    //   99: istore_1
    //   100: aload_0
    //   101: invokevirtual getContext : ()Landroid/content/Context;
    //   104: iload_1
    //   105: iconst_0
    //   106: invokestatic x : (Landroid/content/Context;II)I
    //   109: istore_1
    //   110: aload_0
    //   111: getfield B : I
    //   114: iload_1
    //   115: invokestatic a : (II)I
    //   118: istore_1
    //   119: aload_0
    //   120: iload_1
    //   121: putfield B : I
    //   124: aload_0
    //   125: getfield r : Lc/c/a/b/d0/g;
    //   128: iload_1
    //   129: invokestatic valueOf : (I)Landroid/content/res/ColorStateList;
    //   132: invokevirtual q : (Landroid/content/res/ColorStateList;)V
    //   135: aload_0
    //   136: getfield O : I
    //   139: iconst_3
    //   140: if_icmpne -> 153
    //   143: aload_0
    //   144: getfield d : Landroid/widget/EditText;
    //   147: invokevirtual getBackground : ()Landroid/graphics/drawable/Drawable;
    //   150: invokevirtual invalidateSelf : ()V
    //   153: aload_0
    //   154: getfield s : Lc/c/a/b/d0/g;
    //   157: ifnonnull -> 163
    //   160: goto -> 206
    //   163: iload_2
    //   164: istore_1
    //   165: aload_0
    //   166: getfield x : I
    //   169: iconst_m1
    //   170: if_icmple -> 184
    //   173: iload_2
    //   174: istore_1
    //   175: aload_0
    //   176: getfield A : I
    //   179: ifeq -> 184
    //   182: iconst_1
    //   183: istore_1
    //   184: iload_1
    //   185: ifeq -> 202
    //   188: aload_0
    //   189: getfield s : Lc/c/a/b/d0/g;
    //   192: aload_0
    //   193: getfield A : I
    //   196: invokestatic valueOf : (I)Landroid/content/res/ColorStateList;
    //   199: invokevirtual q : (Landroid/content/res/ColorStateList;)V
    //   202: aload_0
    //   203: invokevirtual invalidate : ()V
    //   206: aload_0
    //   207: invokevirtual invalidate : ()V
    //   210: return
  }
  
  public final void d() {
    e(this.Q, this.T, this.S, this.V, this.U);
  }
  
  public void dispatchProvideAutofillStructure(ViewStructure paramViewStructure, int paramInt) {
    if (this.e != null) {
      EditText editText = this.d;
      if (editText != null) {
        boolean bool = this.q;
        this.q = false;
        CharSequence charSequence = editText.getHint();
        this.d.setHint(this.e);
        try {
          super.dispatchProvideAutofillStructure(paramViewStructure, paramInt);
          return;
        } finally {
          this.d.setHint(charSequence);
          this.q = bool;
        } 
      } 
    } 
    super.dispatchProvideAutofillStructure(paramViewStructure, paramInt);
  }
  
  public void dispatchRestoreInstanceState(SparseArray<Parcelable> paramSparseArray) {
    this.r0 = true;
    super.dispatchRestoreInstanceState(paramSparseArray);
    this.r0 = false;
  }
  
  public void draw(Canvas paramCanvas) {
    super.draw(paramCanvas);
    if (this.o) {
      c.c.a.b.y.c c1 = this.n0;
      if (c1 != null) {
        int i = paramCanvas.save();
        if (c1.x != null && c1.b) {
          boolean bool;
          float f4 = c1.q;
          float f3 = c1.r;
          if (c1.z && c1.A != null) {
            bool = true;
          } else {
            bool = false;
          } 
          if (bool) {
            f2 = c1.C * c1.E;
          } else {
            f2 = c1.I.ascent() * c1.E;
            c1.I.descent();
          } 
          float f1 = f3;
          if (bool)
            f1 = f3 + f2; 
          float f2 = c1.E;
          if (f2 != 1.0F)
            paramCanvas.scale(f2, f2, f4, f1); 
          if (bool) {
            paramCanvas.drawBitmap(c1.A, f4, f1, c1.B);
          } else {
            CharSequence charSequence = c1.x;
            paramCanvas.drawText(charSequence, 0, charSequence.length(), f4, f1, (Paint)c1.I);
          } 
        } 
        paramCanvas.restoreToCount(i);
      } else {
        throw null;
      } 
    } 
    c.c.a.b.d0.g g1 = this.s;
    if (g1 != null) {
      Rect rect = g1.getBounds();
      rect.top = rect.bottom - this.x;
      this.s.draw(paramCanvas);
    } 
  }
  
  public void drawableStateChanged() {
    // Byte code:
    //   0: aload_0
    //   1: getfield q0 : Z
    //   4: ifeq -> 8
    //   7: return
    //   8: iconst_1
    //   9: istore_2
    //   10: aload_0
    //   11: iconst_1
    //   12: putfield q0 : Z
    //   15: aload_0
    //   16: invokespecial drawableStateChanged : ()V
    //   19: aload_0
    //   20: invokevirtual getDrawableState : ()[I
    //   23: astore #4
    //   25: aload_0
    //   26: getfield n0 : Lc/c/a/b/y/c;
    //   29: astore_3
    //   30: aload_3
    //   31: ifnull -> 107
    //   34: aload_3
    //   35: aload #4
    //   37: putfield G : [I
    //   40: aload_3
    //   41: getfield l : Landroid/content/res/ColorStateList;
    //   44: astore #4
    //   46: aload #4
    //   48: ifnull -> 59
    //   51: aload #4
    //   53: invokevirtual isStateful : ()Z
    //   56: ifne -> 78
    //   59: aload_3
    //   60: getfield k : Landroid/content/res/ColorStateList;
    //   63: astore #4
    //   65: aload #4
    //   67: ifnull -> 83
    //   70: aload #4
    //   72: invokevirtual isStateful : ()Z
    //   75: ifeq -> 83
    //   78: iconst_1
    //   79: istore_1
    //   80: goto -> 85
    //   83: iconst_0
    //   84: istore_1
    //   85: iload_1
    //   86: ifeq -> 98
    //   89: aload_3
    //   90: invokevirtual k : ()V
    //   93: iconst_1
    //   94: istore_1
    //   95: goto -> 100
    //   98: iconst_0
    //   99: istore_1
    //   100: iload_1
    //   101: iconst_0
    //   102: ior
    //   103: istore_1
    //   104: goto -> 109
    //   107: iconst_0
    //   108: istore_1
    //   109: aload_0
    //   110: invokestatic E : (Landroid/view/View;)Z
    //   113: ifeq -> 126
    //   116: aload_0
    //   117: invokevirtual isEnabled : ()Z
    //   120: ifeq -> 126
    //   123: goto -> 128
    //   126: iconst_0
    //   127: istore_2
    //   128: aload_0
    //   129: iload_2
    //   130: iconst_0
    //   131: invokevirtual v : (ZZ)V
    //   134: aload_0
    //   135: invokevirtual s : ()V
    //   138: aload_0
    //   139: invokevirtual w : ()V
    //   142: iload_1
    //   143: ifeq -> 150
    //   146: aload_0
    //   147: invokevirtual invalidate : ()V
    //   150: aload_0
    //   151: iconst_0
    //   152: putfield q0 : Z
    //   155: return
  }
  
  public final void e(CheckableImageButton paramCheckableImageButton, boolean paramBoolean1, ColorStateList paramColorStateList, boolean paramBoolean2, PorterDuff.Mode paramMode) {
    // Byte code:
    //   0: aload_1
    //   1: invokevirtual getDrawable : ()Landroid/graphics/drawable/Drawable;
    //   4: astore #7
    //   6: aload #7
    //   8: astore #6
    //   10: aload #7
    //   12: ifnull -> 68
    //   15: iload_2
    //   16: ifne -> 28
    //   19: aload #7
    //   21: astore #6
    //   23: iload #4
    //   25: ifeq -> 68
    //   28: aload #7
    //   30: invokestatic C0 : (Landroid/graphics/drawable/Drawable;)Landroid/graphics/drawable/Drawable;
    //   33: invokevirtual mutate : ()Landroid/graphics/drawable/Drawable;
    //   36: astore #7
    //   38: iload_2
    //   39: ifeq -> 48
    //   42: aload #7
    //   44: aload_3
    //   45: invokevirtual setTintList : (Landroid/content/res/ColorStateList;)V
    //   48: aload #7
    //   50: astore #6
    //   52: iload #4
    //   54: ifeq -> 68
    //   57: aload #7
    //   59: aload #5
    //   61: invokevirtual setTintMode : (Landroid/graphics/PorterDuff$Mode;)V
    //   64: aload #7
    //   66: astore #6
    //   68: aload_1
    //   69: invokevirtual getDrawable : ()Landroid/graphics/drawable/Drawable;
    //   72: aload #6
    //   74: if_acmpeq -> 83
    //   77: aload_1
    //   78: aload #6
    //   80: invokevirtual setImageDrawable : (Landroid/graphics/drawable/Drawable;)V
    //   83: return
  }
  
  public final void f() {
    e(this.G, this.I, this.H, this.K, this.J);
  }
  
  public final int g() {
    if (!this.o)
      return 0; 
    int i = this.v;
    if (i != 0 && i != 1) {
      if (i != 2)
        return 0; 
      float f1 = this.n0.f() / 2.0F;
      return (int)f1;
    } 
    float f = this.n0.f();
    return (int)f;
  }
  
  public int getBaseline() {
    EditText editText = this.d;
    if (editText != null) {
      int k = editText.getBaseline();
      int i = getPaddingTop();
      return g() + i + k;
    } 
    return super.getBaseline();
  }
  
  public c.c.a.b.d0.g getBoxBackground() {
    int i = this.v;
    if (i == 1 || i == 2)
      return this.r; 
    throw new IllegalStateException();
  }
  
  public int getBoxBackgroundColor() {
    return this.B;
  }
  
  public int getBoxBackgroundMode() {
    return this.v;
  }
  
  public float getBoxCornerRadiusBottomEnd() {
    c.c.a.b.d0.g g1 = this.r;
    return g1.b.a.h.a(g1.h());
  }
  
  public float getBoxCornerRadiusBottomStart() {
    c.c.a.b.d0.g g1 = this.r;
    return g1.b.a.g.a(g1.h());
  }
  
  public float getBoxCornerRadiusTopEnd() {
    c.c.a.b.d0.g g1 = this.r;
    return g1.b.a.f.a(g1.h());
  }
  
  public float getBoxCornerRadiusTopStart() {
    return this.r.m();
  }
  
  public int getBoxStrokeColor() {
    return this.h0;
  }
  
  public int getCounterMaxLength() {
    return this.h;
  }
  
  public CharSequence getCounterOverflowDescription() {
    if (this.g && this.i) {
      TextView textView = this.j;
      if (textView != null)
        return textView.getContentDescription(); 
    } 
    return null;
  }
  
  public ColorStateList getCounterOverflowTextColor() {
    return this.m;
  }
  
  public ColorStateList getCounterTextColor() {
    return this.m;
  }
  
  public ColorStateList getDefaultHintTextColor() {
    return this.d0;
  }
  
  public EditText getEditText() {
    return this.d;
  }
  
  public CharSequence getEndIconContentDescription() {
    return this.Q.getContentDescription();
  }
  
  public Drawable getEndIconDrawable() {
    return this.Q.getDrawable();
  }
  
  public int getEndIconMode() {
    return this.O;
  }
  
  public CheckableImageButton getEndIconView() {
    return this.Q;
  }
  
  public CharSequence getError() {
    o o1 = this.f;
    if (o1.l) {
      CharSequence charSequence = o1.k;
    } else {
      o1 = null;
    } 
    return (CharSequence)o1;
  }
  
  public int getErrorCurrentTextColors() {
    return this.f.g();
  }
  
  public Drawable getErrorIconDrawable() {
    return this.b0.getDrawable();
  }
  
  public final int getErrorTextCurrentColor() {
    return this.f.g();
  }
  
  public CharSequence getHelperText() {
    o o1 = this.f;
    if (o1.q) {
      CharSequence charSequence = o1.p;
    } else {
      o1 = null;
    } 
    return (CharSequence)o1;
  }
  
  public int getHelperTextCurrentTextColor() {
    byte b;
    TextView textView = this.f.r;
    if (textView != null) {
      b = textView.getCurrentTextColor();
    } else {
      b = -1;
    } 
    return b;
  }
  
  public CharSequence getHint() {
    CharSequence charSequence;
    if (this.o) {
      charSequence = this.p;
    } else {
      charSequence = null;
    } 
    return charSequence;
  }
  
  public final float getHintCollapsedTextHeight() {
    return this.n0.f();
  }
  
  public final int getHintCurrentCollapsedTextColor() {
    return this.n0.g();
  }
  
  public ColorStateList getHintTextColor() {
    return this.e0;
  }
  
  @Deprecated
  public CharSequence getPasswordVisibilityToggleContentDescription() {
    return this.Q.getContentDescription();
  }
  
  @Deprecated
  public Drawable getPasswordVisibilityToggleDrawable() {
    return this.Q.getDrawable();
  }
  
  public CharSequence getStartIconContentDescription() {
    return this.G.getContentDescription();
  }
  
  public Drawable getStartIconDrawable() {
    return this.G.getDrawable();
  }
  
  public Typeface getTypeface() {
    return this.F;
  }
  
  public final boolean h() {
    boolean bool;
    if (this.o && !TextUtils.isEmpty(this.p) && this.r instanceof c.c.a.b.g0.g) {
      bool = true;
    } else {
      bool = false;
    } 
    return bool;
  }
  
  public final boolean i() {
    boolean bool;
    if (this.O != 0) {
      bool = true;
    } else {
      bool = false;
    } 
    return bool;
  }
  
  public boolean j() {
    boolean bool;
    if (this.c.getVisibility() == 0 && this.Q.getVisibility() == 0) {
      bool = true;
    } else {
      bool = false;
    } 
    return bool;
  }
  
  public final void k() {
    int i = this.v;
    boolean bool = true;
    if (i != 0) {
      if (i != 1) {
        if (i == 2) {
          c.c.a.b.d0.g g1;
          if (this.o && !(this.r instanceof c.c.a.b.g0.g)) {
            c.c.a.b.g0.g g2 = new c.c.a.b.g0.g(this.t);
          } else {
            g1 = new c.c.a.b.d0.g(this.t);
          } 
          this.r = g1;
        } else {
          StringBuilder stringBuilder = new StringBuilder();
          stringBuilder.append(this.v);
          stringBuilder.append(" is illegal; only @BoxBackgroundMode constants are supported.");
          throw new IllegalArgumentException(stringBuilder.toString());
        } 
      } else {
        this.r = new c.c.a.b.d0.g(this.t);
        this.s = new c.c.a.b.d0.g();
        EditText editText1 = this.d;
      } 
    } else {
      this.r = null;
    } 
    this.s = null;
    EditText editText = this.d;
  }
  
  public final void l() {
    if (!h())
      return; 
    RectF rectF = this.E;
    c.c.a.b.y.c c1 = this.n0;
    boolean bool = c1.c(c1.w);
    Rect rect = c1.e;
    if (!bool) {
      f1 = rect.left;
    } else {
      f1 = rect.right - c1.b();
    } 
    rectF.left = f1;
    rect = c1.e;
    rectF.top = rect.top;
    if (!bool) {
      f1 = c1.b() + f1;
    } else {
      f1 = rect.right;
    } 
    rectF.right = f1;
    float f1 = c1.e.top;
    f1 = c1.f() + f1;
    rectF.bottom = f1;
    float f2 = rectF.left;
    float f3 = this.u;
    rectF.left = f2 - f3;
    rectF.top -= f3;
    rectF.right += f3;
    rectF.bottom = f1 + f3;
    rectF.offset(-getPaddingLeft(), 0.0F);
    c.c.a.b.g0.g g1 = (c.c.a.b.g0.g)this.r;
    if (g1 != null) {
      g1.y(rectF.left, rectF.top, rectF.right, rectF.bottom);
      return;
    } 
    throw null;
  }
  
  public void o(TextView paramTextView, int paramInt) {
    // Byte code:
    //   0: iconst_1
    //   1: istore_3
    //   2: aload_1
    //   3: iload_2
    //   4: invokestatic s0 : (Landroid/widget/TextView;I)V
    //   7: getstatic android/os/Build$VERSION.SDK_INT : I
    //   10: bipush #23
    //   12: if_icmplt -> 35
    //   15: aload_1
    //   16: invokevirtual getTextColors : ()Landroid/content/res/ColorStateList;
    //   19: invokevirtual getDefaultColor : ()I
    //   22: istore_2
    //   23: iload_2
    //   24: ldc_w -65281
    //   27: if_icmpne -> 35
    //   30: iload_3
    //   31: istore_2
    //   32: goto -> 44
    //   35: iconst_0
    //   36: istore_2
    //   37: goto -> 44
    //   40: astore #4
    //   42: iload_3
    //   43: istore_2
    //   44: iload_2
    //   45: ifeq -> 69
    //   48: aload_1
    //   49: getstatic c/c/a/b/j.TextAppearance_AppCompat_Caption : I
    //   52: invokestatic s0 : (Landroid/widget/TextView;I)V
    //   55: aload_1
    //   56: aload_0
    //   57: invokevirtual getContext : ()Landroid/content/Context;
    //   60: getstatic c/c/a/b/c.design_error : I
    //   63: invokestatic a : (Landroid/content/Context;I)I
    //   66: invokevirtual setTextColor : (I)V
    //   69: return
    // Exception table:
    //   from	to	target	type
    //   2	23	40	java/lang/Exception
  }
  
  public void onLayout(boolean paramBoolean, int paramInt1, int paramInt2, int paramInt3, int paramInt4) {
    Rect rect;
    super.onLayout(paramBoolean, paramInt1, paramInt2, paramInt3, paramInt4);
    EditText editText = this.d;
    if (editText != null) {
      Rect rect1 = this.C;
      c.c.a.b.y.d.a((ViewGroup)this, (View)editText, rect1);
      c.c.a.b.d0.g g1 = this.s;
      if (g1 != null) {
        paramInt1 = rect1.bottom;
        paramInt2 = this.z;
        g1.setBounds(rect1.left, paramInt1 - paramInt2, rect1.right, paramInt1);
      } 
      if (this.o) {
        c.c.a.b.y.c c1 = this.n0;
        EditText editText1 = this.d;
        if (editText1 != null) {
          rect = this.D;
          rect.bottom = rect1.bottom;
          paramInt1 = this.v;
          if (paramInt1 != 1) {
            if (paramInt1 != 2) {
              paramInt1 = rect1.left;
              rect.left = editText1.getCompoundPaddingLeft() + paramInt1;
              paramInt1 = getPaddingTop();
            } else {
              paramInt1 = rect1.left;
              rect.left = editText1.getPaddingLeft() + paramInt1;
              rect1.top -= g();
              paramInt2 = rect1.right;
              paramInt1 = this.d.getPaddingRight();
              paramInt3 = paramInt2 - paramInt1;
              rect.right = paramInt3;
            } 
          } else {
            paramInt1 = rect1.left;
            rect.left = editText1.getCompoundPaddingLeft() + paramInt1;
            paramInt1 = rect1.top + this.w;
          } 
          rect.top = paramInt1;
          paramInt2 = rect1.right;
          paramInt1 = this.d.getCompoundPaddingRight();
        } else {
          throw new IllegalStateException();
        } 
      } else {
        return;
      } 
    } else {
      return;
    } 
    paramInt3 = paramInt2 - paramInt1;
    rect.right = paramInt3;
  }
  
  public void onMeasure(int paramInt1, int paramInt2) {
    super.onMeasure(paramInt1, paramInt2);
    EditText editText = this.d;
    paramInt1 = 0;
    if (editText != null) {
      paramInt2 = Math.max(this.Q.getMeasuredHeight(), this.G.getMeasuredHeight());
      if (this.d.getMeasuredHeight() < paramInt2) {
        this.d.setMinimumHeight(paramInt2);
        paramInt1 = 1;
      } 
    } 
    boolean bool = t();
    if (paramInt1 != 0 || bool)
      this.d.post(new c(this)); 
  }
  
  public void onRestoreInstanceState(Parcelable paramParcelable) {
    if (!(paramParcelable instanceof h)) {
      super.onRestoreInstanceState(paramParcelable);
      return;
    } 
    h h = (h)paramParcelable;
    super.onRestoreInstanceState(h.b);
    setError(h.d);
    if (h.e)
      this.Q.post(new b(this)); 
    requestLayout();
  }
  
  public Parcelable onSaveInstanceState() {
    boolean bool;
    h h = new h(super.onSaveInstanceState());
    if (this.f.e())
      h.d = getError(); 
    if (i() && this.Q.isChecked()) {
      bool = true;
    } else {
      bool = false;
    } 
    h.e = bool;
    return (Parcelable)h;
  }
  
  public final void p() {
    if (this.j != null) {
      int i;
      EditText editText = this.d;
      if (editText == null) {
        i = 0;
      } else {
        i = editText.getText().length();
      } 
      q(i);
    } 
  }
  
  public void q(int paramInt) {
    boolean bool = this.i;
    if (this.h == -1) {
      this.j.setText(String.valueOf(paramInt));
      this.j.setContentDescription(null);
      this.i = false;
    } else {
      int i;
      boolean bool1;
      if (l.i((View)this.j) == 1)
        this.j.setAccessibilityLiveRegion(0); 
      if (paramInt > this.h) {
        bool1 = true;
      } else {
        bool1 = false;
      } 
      this.i = bool1;
      Context context = getContext();
      TextView textView = this.j;
      int k = this.h;
      if (this.i) {
        i = i.character_counter_overflowed_content_description;
      } else {
        i = i.character_counter_content_description;
      } 
      textView.setContentDescription(context.getString(i, new Object[] { Integer.valueOf(paramInt), Integer.valueOf(k) }));
      if (bool != this.i) {
        r();
        if (this.i)
          this.j.setAccessibilityLiveRegion(1); 
      } 
      this.j.setText(getContext().getString(i.character_counter_pattern, new Object[] { Integer.valueOf(paramInt), Integer.valueOf(this.h) }));
    } 
    if (this.d != null && bool != this.i) {
      v(false, false);
      w();
      s();
    } 
  }
  
  public final void r() {
    TextView textView = this.j;
    if (textView != null) {
      int i;
      if (this.i) {
        i = this.k;
      } else {
        i = this.l;
      } 
      o(textView, i);
      if (!this.i) {
        ColorStateList colorStateList = this.m;
        if (colorStateList != null)
          this.j.setTextColor(colorStateList); 
      } 
      if (this.i) {
        ColorStateList colorStateList = this.n;
        if (colorStateList != null)
          this.j.setTextColor(colorStateList); 
      } 
    } 
  }
  
  public void s() {
    // Byte code:
    //   0: aload_0
    //   1: getfield d : Landroid/widget/EditText;
    //   4: astore_2
    //   5: aload_2
    //   6: ifnull -> 110
    //   9: aload_0
    //   10: getfield v : I
    //   13: ifeq -> 19
    //   16: goto -> 110
    //   19: aload_2
    //   20: invokevirtual getBackground : ()Landroid/graphics/drawable/Drawable;
    //   23: astore_3
    //   24: aload_3
    //   25: ifnonnull -> 29
    //   28: return
    //   29: aload_3
    //   30: astore_2
    //   31: aload_3
    //   32: invokestatic a : (Landroid/graphics/drawable/Drawable;)Z
    //   35: ifeq -> 43
    //   38: aload_3
    //   39: invokevirtual mutate : ()Landroid/graphics/drawable/Drawable;
    //   42: astore_2
    //   43: aload_0
    //   44: getfield f : Lc/c/a/b/g0/o;
    //   47: invokevirtual e : ()Z
    //   50: ifeq -> 75
    //   53: aload_0
    //   54: getfield f : Lc/c/a/b/g0/o;
    //   57: invokevirtual g : ()I
    //   60: istore_1
    //   61: aload_2
    //   62: iload_1
    //   63: getstatic android/graphics/PorterDuff$Mode.SRC_IN : Landroid/graphics/PorterDuff$Mode;
    //   66: invokestatic c : (ILandroid/graphics/PorterDuff$Mode;)Landroid/graphics/PorterDuffColorFilter;
    //   69: invokevirtual setColorFilter : (Landroid/graphics/ColorFilter;)V
    //   72: goto -> 110
    //   75: aload_0
    //   76: getfield i : Z
    //   79: ifeq -> 99
    //   82: aload_0
    //   83: getfield j : Landroid/widget/TextView;
    //   86: astore_3
    //   87: aload_3
    //   88: ifnull -> 99
    //   91: aload_3
    //   92: invokevirtual getCurrentTextColor : ()I
    //   95: istore_1
    //   96: goto -> 61
    //   99: aload_2
    //   100: invokestatic k : (Landroid/graphics/drawable/Drawable;)V
    //   103: aload_0
    //   104: getfield d : Landroid/widget/EditText;
    //   107: invokevirtual refreshDrawableState : ()V
    //   110: return
  }
  
  public void setBoxBackgroundColor(int paramInt) {
    if (this.B != paramInt) {
      this.B = paramInt;
      this.i0 = paramInt;
      c();
    } 
  }
  
  public void setBoxBackgroundColorResource(int paramInt) {
    setBoxBackgroundColor(b.i.e.a.a(getContext(), paramInt));
  }
  
  public void setBoxBackgroundMode(int paramInt) {
    if (paramInt == this.v)
      return; 
    this.v = paramInt;
    if (this.d != null)
      k(); 
  }
  
  public void setBoxStrokeColor(int paramInt) {
    if (this.h0 != paramInt) {
      this.h0 = paramInt;
      w();
    } 
  }
  
  public void setCounterEnabled(boolean paramBoolean) {
    if (this.g != paramBoolean) {
      if (paramBoolean) {
        z z = new z(getContext(), null);
        this.j = (TextView)z;
        z.setId(c.c.a.b.f.textinput_counter);
        Typeface typeface = this.F;
        if (typeface != null)
          this.j.setTypeface(typeface); 
        this.j.setMaxLines(1);
        this.f.a(this.j, 2);
        r();
        p();
      } else {
        this.f.i(this.j, 2);
        this.j = null;
      } 
      this.g = paramBoolean;
    } 
  }
  
  public void setCounterMaxLength(int paramInt) {
    if (this.h != paramInt) {
      if (paramInt <= 0)
        paramInt = -1; 
      this.h = paramInt;
      if (this.g)
        p(); 
    } 
  }
  
  public void setCounterOverflowTextAppearance(int paramInt) {
    if (this.k != paramInt) {
      this.k = paramInt;
      r();
    } 
  }
  
  public void setCounterOverflowTextColor(ColorStateList paramColorStateList) {
    if (this.n != paramColorStateList) {
      this.n = paramColorStateList;
      r();
    } 
  }
  
  public void setCounterTextAppearance(int paramInt) {
    if (this.l != paramInt) {
      this.l = paramInt;
      r();
    } 
  }
  
  public void setCounterTextColor(ColorStateList paramColorStateList) {
    if (this.m != paramColorStateList) {
      this.m = paramColorStateList;
      r();
    } 
  }
  
  public void setDefaultHintTextColor(ColorStateList paramColorStateList) {
    this.d0 = paramColorStateList;
    this.e0 = paramColorStateList;
    if (this.d != null)
      v(false, false); 
  }
  
  public void setEnabled(boolean paramBoolean) {
    m((ViewGroup)this, paramBoolean);
    super.setEnabled(paramBoolean);
  }
  
  public void setEndIconActivated(boolean paramBoolean) {
    this.Q.setActivated(paramBoolean);
  }
  
  public void setEndIconCheckable(boolean paramBoolean) {
    this.Q.setCheckable(paramBoolean);
  }
  
  public void setEndIconContentDescription(int paramInt) {
    CharSequence charSequence;
    if (paramInt != 0) {
      charSequence = getResources().getText(paramInt);
    } else {
      charSequence = null;
    } 
    setEndIconContentDescription(charSequence);
  }
  
  public void setEndIconContentDescription(CharSequence paramCharSequence) {
    if (getEndIconContentDescription() != paramCharSequence)
      this.Q.setContentDescription(paramCharSequence); 
  }
  
  public void setEndIconDrawable(int paramInt) {
    Drawable drawable;
    if (paramInt != 0) {
      drawable = b.b.l.a.a.b(getContext(), paramInt);
    } else {
      drawable = null;
    } 
    setEndIconDrawable(drawable);
  }
  
  public void setEndIconDrawable(Drawable paramDrawable) {
    this.Q.setImageDrawable(paramDrawable);
  }
  
  public void setEndIconMode(int paramInt) {
    boolean bool;
    int i = this.O;
    this.O = paramInt;
    if (paramInt != 0) {
      bool = true;
    } else {
      bool = false;
    } 
    setEndIconVisible(bool);
    if (getEndIconDelegate().b(this.v)) {
      getEndIconDelegate().a();
      d();
      Iterator<g> iterator = this.R.iterator();
      while (iterator.hasNext())
        ((g)iterator.next()).a(this, i); 
      return;
    } 
    StringBuilder stringBuilder = c.a.a.a.a.e("The current box background mode ");
    stringBuilder.append(this.v);
    stringBuilder.append(" is not supported by the end icon mode ");
    stringBuilder.append(paramInt);
    throw new IllegalStateException(stringBuilder.toString());
  }
  
  public void setEndIconOnClickListener(View.OnClickListener paramOnClickListener) {
    CheckableImageButton checkableImageButton = this.Q;
    View.OnLongClickListener onLongClickListener = this.c0;
    checkableImageButton.setOnClickListener(paramOnClickListener);
    n(checkableImageButton, onLongClickListener);
  }
  
  public void setEndIconOnLongClickListener(View.OnLongClickListener paramOnLongClickListener) {
    this.c0 = paramOnLongClickListener;
    CheckableImageButton checkableImageButton = this.Q;
    checkableImageButton.setOnLongClickListener(paramOnLongClickListener);
    n(checkableImageButton, paramOnLongClickListener);
  }
  
  public void setEndIconTintList(ColorStateList paramColorStateList) {
    if (this.S != paramColorStateList) {
      this.S = paramColorStateList;
      this.T = true;
      d();
    } 
  }
  
  public void setEndIconTintMode(PorterDuff.Mode paramMode) {
    if (this.U != paramMode) {
      this.U = paramMode;
      this.V = true;
      d();
    } 
  }
  
  public void setEndIconVisible(boolean paramBoolean) {
    if (j() != paramBoolean) {
      byte b;
      CheckableImageButton checkableImageButton = this.Q;
      if (paramBoolean) {
        b = 0;
      } else {
        b = 4;
      } 
      checkableImageButton.setVisibility(b);
      t();
    } 
  }
  
  public void setError(CharSequence paramCharSequence) {
    if (!this.f.l) {
      if (TextUtils.isEmpty(paramCharSequence))
        return; 
      setErrorEnabled(true);
    } 
    if (!TextUtils.isEmpty(paramCharSequence)) {
      o o1 = this.f;
      o1.c();
      o1.k = paramCharSequence;
      o1.m.setText(paramCharSequence);
      if (o1.i != 1)
        o1.j = 1; 
      o1.k(o1.i, o1.j, o1.j(o1.m, paramCharSequence));
    } else {
      this.f.h();
    } 
  }
  
  public void setErrorEnabled(boolean paramBoolean) {
    o o1 = this.f;
    if (o1.l != paramBoolean) {
      o1.c();
      if (paramBoolean) {
        z z = new z(o1.a, null);
        o1.m = (TextView)z;
        z.setId(c.c.a.b.f.textinput_error);
        Typeface typeface = o1.u;
        if (typeface != null)
          o1.m.setTypeface(typeface); 
        int i = o1.n;
        o1.n = i;
        TextView textView = o1.m;
        if (textView != null)
          o1.b.o(textView, i); 
        ColorStateList colorStateList = o1.o;
        o1.o = colorStateList;
        textView = o1.m;
        if (textView != null && colorStateList != null)
          textView.setTextColor(colorStateList); 
        o1.m.setVisibility(4);
        l.Y((View)o1.m, 1);
        o1.a(o1.m, 0);
      } else {
        o1.h();
        o1.i(o1.m, 0);
        o1.m = null;
        o1.b.s();
        o1.b.w();
      } 
      o1.l = paramBoolean;
    } 
  }
  
  public void setErrorIconDrawable(int paramInt) {
    Drawable drawable;
    if (paramInt != 0) {
      drawable = b.b.l.a.a.b(getContext(), paramInt);
    } else {
      drawable = null;
    } 
    setErrorIconDrawable(drawable);
  }
  
  public void setErrorIconDrawable(Drawable paramDrawable) {
    boolean bool;
    this.b0.setImageDrawable(paramDrawable);
    if (paramDrawable != null && this.f.l) {
      bool = true;
    } else {
      bool = false;
    } 
    setErrorIconVisible(bool);
  }
  
  public void setErrorIconTintList(ColorStateList paramColorStateList) {
    Drawable drawable2 = this.b0.getDrawable();
    Drawable drawable1 = drawable2;
    if (drawable2 != null) {
      drawable1 = a.a.a.a.a.C0(drawable2).mutate();
      drawable1.setTintList(paramColorStateList);
    } 
    if (this.b0.getDrawable() != drawable1)
      this.b0.setImageDrawable(drawable1); 
  }
  
  public void setErrorIconTintMode(PorterDuff.Mode paramMode) {
    Drawable drawable2 = this.b0.getDrawable();
    Drawable drawable1 = drawable2;
    if (drawable2 != null) {
      drawable1 = a.a.a.a.a.C0(drawable2).mutate();
      drawable1.setTintMode(paramMode);
    } 
    if (this.b0.getDrawable() != drawable1)
      this.b0.setImageDrawable(drawable1); 
  }
  
  public void setErrorTextAppearance(int paramInt) {
    o o1 = this.f;
    o1.n = paramInt;
    TextView textView = o1.m;
    if (textView != null)
      o1.b.o(textView, paramInt); 
  }
  
  public void setErrorTextColor(ColorStateList paramColorStateList) {
    o o1 = this.f;
    o1.o = paramColorStateList;
    TextView textView = o1.m;
    if (textView != null && paramColorStateList != null)
      textView.setTextColor(paramColorStateList); 
  }
  
  public void setHelperText(CharSequence paramCharSequence) {
    if (TextUtils.isEmpty(paramCharSequence)) {
      if (this.f.q)
        setHelperTextEnabled(false); 
    } else {
      if (!this.f.q)
        setHelperTextEnabled(true); 
      o o1 = this.f;
      o1.c();
      o1.p = paramCharSequence;
      o1.r.setText(paramCharSequence);
      if (o1.i != 2)
        o1.j = 2; 
      o1.k(o1.i, o1.j, o1.j(o1.r, paramCharSequence));
    } 
  }
  
  public void setHelperTextColor(ColorStateList paramColorStateList) {
    o o1 = this.f;
    o1.t = paramColorStateList;
    TextView textView = o1.r;
    if (textView != null && paramColorStateList != null)
      textView.setTextColor(paramColorStateList); 
  }
  
  public void setHelperTextEnabled(boolean paramBoolean) {
    o o1 = this.f;
    if (o1.q != paramBoolean) {
      o1.c();
      if (paramBoolean) {
        z z = new z(o1.a, null);
        o1.r = (TextView)z;
        z.setId(c.c.a.b.f.textinput_helper_text);
        Typeface typeface = o1.u;
        if (typeface != null)
          o1.r.setTypeface(typeface); 
        o1.r.setVisibility(4);
        l.Y((View)o1.r, 1);
        int i = o1.s;
        o1.s = i;
        TextView textView = o1.r;
        if (textView != null)
          a.a.a.a.a.s0(textView, i); 
        ColorStateList colorStateList = o1.t;
        o1.t = colorStateList;
        textView = o1.r;
        if (textView != null && colorStateList != null)
          textView.setTextColor(colorStateList); 
        o1.a(o1.r, 1);
      } else {
        o1.c();
        if (o1.i == 2)
          o1.j = 0; 
        o1.k(o1.i, o1.j, o1.j(o1.r, null));
        o1.i(o1.r, 1);
        o1.r = null;
        o1.b.s();
        o1.b.w();
      } 
      o1.q = paramBoolean;
    } 
  }
  
  public void setHelperTextTextAppearance(int paramInt) {
    o o1 = this.f;
    o1.s = paramInt;
    TextView textView = o1.r;
    if (textView != null)
      a.a.a.a.a.s0(textView, paramInt); 
  }
  
  public void setHint(CharSequence paramCharSequence) {
    if (this.o) {
      setHintInternal(paramCharSequence);
      sendAccessibilityEvent(2048);
    } 
  }
  
  public void setHintAnimationEnabled(boolean paramBoolean) {
    this.o0 = paramBoolean;
  }
  
  public void setHintEnabled(boolean paramBoolean) {
    if (paramBoolean != this.o) {
      this.o = paramBoolean;
      if (!paramBoolean) {
        this.q = false;
        if (!TextUtils.isEmpty(this.p) && TextUtils.isEmpty(this.d.getHint()))
          this.d.setHint(this.p); 
        setHintInternal(null);
      } else {
        CharSequence charSequence = this.d.getHint();
        if (!TextUtils.isEmpty(charSequence)) {
          if (TextUtils.isEmpty(this.p))
            setHint(charSequence); 
          this.d.setHint(null);
        } 
        this.q = true;
      } 
      if (this.d != null)
        u(); 
    } 
  }
  
  public void setHintTextAppearance(int paramInt) {
    c.c.a.b.y.c c1 = this.n0;
    c.c.a.b.a0.b b = new c.c.a.b.a0.b(c1.a.getContext(), paramInt);
    ColorStateList colorStateList = b.b;
    if (colorStateList != null)
      c1.l = colorStateList; 
    float f = b.a;
    if (f != 0.0F)
      c1.j = f; 
    colorStateList = b.f;
    if (colorStateList != null)
      c1.P = colorStateList; 
    c1.N = b.g;
    c1.O = b.h;
    c1.M = b.i;
    c.c.a.b.a0.a a = c1.v;
    if (a != null)
      a.c = true; 
    c.c.a.b.y.b b1 = new c.c.a.b.y.b(c1);
    b.a();
    c1.v = new c.c.a.b.a0.a((c.c.a.b.a0.a.a)b1, b.l);
    b.b(c1.a.getContext(), (c.c.a.b.a0.d)c1.v);
    c1.k();
    this.e0 = this.n0.l;
    if (this.d != null) {
      v(false, false);
      u();
    } 
  }
  
  public void setHintTextColor(ColorStateList paramColorStateList) {
    if (this.e0 != paramColorStateList) {
      if (this.d0 == null) {
        c.c.a.b.y.c c1 = this.n0;
        if (c1.l != paramColorStateList) {
          c1.l = paramColorStateList;
          c1.k();
        } 
      } 
      this.e0 = paramColorStateList;
      if (this.d != null)
        v(false, false); 
    } 
  }
  
  @Deprecated
  public void setPasswordVisibilityToggleContentDescription(int paramInt) {
    CharSequence charSequence;
    if (paramInt != 0) {
      charSequence = getResources().getText(paramInt);
    } else {
      charSequence = null;
    } 
    setPasswordVisibilityToggleContentDescription(charSequence);
  }
  
  @Deprecated
  public void setPasswordVisibilityToggleContentDescription(CharSequence paramCharSequence) {
    this.Q.setContentDescription(paramCharSequence);
  }
  
  @Deprecated
  public void setPasswordVisibilityToggleDrawable(int paramInt) {
    Drawable drawable;
    if (paramInt != 0) {
      drawable = b.b.l.a.a.b(getContext(), paramInt);
    } else {
      drawable = null;
    } 
    setPasswordVisibilityToggleDrawable(drawable);
  }
  
  @Deprecated
  public void setPasswordVisibilityToggleDrawable(Drawable paramDrawable) {
    this.Q.setImageDrawable(paramDrawable);
  }
  
  @Deprecated
  public void setPasswordVisibilityToggleEnabled(boolean paramBoolean) {
    if (paramBoolean && this.O != 1) {
      setEndIconMode(1);
    } else if (!paramBoolean) {
      setEndIconMode(0);
    } 
  }
  
  @Deprecated
  public void setPasswordVisibilityToggleTintList(ColorStateList paramColorStateList) {
    this.S = paramColorStateList;
    this.T = true;
    d();
  }
  
  @Deprecated
  public void setPasswordVisibilityToggleTintMode(PorterDuff.Mode paramMode) {
    this.U = paramMode;
    this.V = true;
    d();
  }
  
  public void setStartIconCheckable(boolean paramBoolean) {
    this.G.setCheckable(paramBoolean);
  }
  
  public void setStartIconContentDescription(int paramInt) {
    CharSequence charSequence;
    if (paramInt != 0) {
      charSequence = getResources().getText(paramInt);
    } else {
      charSequence = null;
    } 
    setStartIconContentDescription(charSequence);
  }
  
  public void setStartIconContentDescription(CharSequence paramCharSequence) {
    if (getStartIconContentDescription() != paramCharSequence)
      this.G.setContentDescription(paramCharSequence); 
  }
  
  public void setStartIconDrawable(int paramInt) {
    Drawable drawable;
    if (paramInt != 0) {
      drawable = b.b.l.a.a.b(getContext(), paramInt);
    } else {
      drawable = null;
    } 
    setStartIconDrawable(drawable);
  }
  
  public void setStartIconDrawable(Drawable paramDrawable) {
    this.G.setImageDrawable(paramDrawable);
    if (paramDrawable != null) {
      setStartIconVisible(true);
      f();
    } else {
      setStartIconVisible(false);
      setStartIconOnClickListener(null);
      setStartIconOnLongClickListener(null);
      setStartIconContentDescription((CharSequence)null);
    } 
  }
  
  public void setStartIconOnClickListener(View.OnClickListener paramOnClickListener) {
    CheckableImageButton checkableImageButton = this.G;
    View.OnLongClickListener onLongClickListener = this.M;
    checkableImageButton.setOnClickListener(paramOnClickListener);
    n(checkableImageButton, onLongClickListener);
  }
  
  public void setStartIconOnLongClickListener(View.OnLongClickListener paramOnLongClickListener) {
    this.M = paramOnLongClickListener;
    CheckableImageButton checkableImageButton = this.G;
    checkableImageButton.setOnLongClickListener(paramOnLongClickListener);
    n(checkableImageButton, paramOnLongClickListener);
  }
  
  public void setStartIconTintList(ColorStateList paramColorStateList) {
    if (this.H != paramColorStateList) {
      this.H = paramColorStateList;
      this.I = true;
      f();
    } 
  }
  
  public void setStartIconTintMode(PorterDuff.Mode paramMode) {
    if (this.J != paramMode) {
      this.J = paramMode;
      this.K = true;
      f();
    } 
  }
  
  public void setStartIconVisible(boolean paramBoolean) {
    boolean bool;
    int i = this.G.getVisibility();
    byte b = 0;
    if (i == 0) {
      bool = true;
    } else {
      bool = false;
    } 
    if (bool != paramBoolean) {
      CheckableImageButton checkableImageButton = this.G;
      if (!paramBoolean)
        b = 8; 
      checkableImageButton.setVisibility(b);
      t();
    } 
  }
  
  public void setTextInputAccessibilityDelegate(e parame) {
    EditText editText = this.d;
    if (editText != null)
      l.W((View)editText, parame); 
  }
  
  public void setTypeface(Typeface paramTypeface) {
    if (paramTypeface != this.F) {
      this.F = paramTypeface;
      this.n0.p(paramTypeface);
      o o1 = this.f;
      if (paramTypeface != o1.u) {
        o1.u = paramTypeface;
        TextView textView2 = o1.m;
        if (textView2 != null)
          textView2.setTypeface(paramTypeface); 
        TextView textView1 = o1.r;
        if (textView1 != null)
          textView1.setTypeface(paramTypeface); 
      } 
      TextView textView = this.j;
      if (textView != null)
        textView.setTypeface(paramTypeface); 
    } 
  }
  
  public final boolean t() {
    // Byte code:
    //   0: aload_0
    //   1: getfield d : Landroid/widget/EditText;
    //   4: ifnonnull -> 9
    //   7: iconst_0
    //   8: ireturn
    //   9: aload_0
    //   10: invokevirtual getStartIconDrawable : ()Landroid/graphics/drawable/Drawable;
    //   13: astore #7
    //   15: iconst_1
    //   16: istore #5
    //   18: iconst_1
    //   19: istore #6
    //   21: aload #7
    //   23: ifnull -> 31
    //   26: iconst_1
    //   27: istore_1
    //   28: goto -> 33
    //   31: iconst_0
    //   32: istore_1
    //   33: iload_1
    //   34: ifeq -> 183
    //   37: aload_0
    //   38: getfield G : Lcom/google/android/material/internal/CheckableImageButton;
    //   41: invokevirtual getVisibility : ()I
    //   44: ifne -> 52
    //   47: iconst_1
    //   48: istore_1
    //   49: goto -> 54
    //   52: iconst_0
    //   53: istore_1
    //   54: iload_1
    //   55: ifeq -> 183
    //   58: aload_0
    //   59: getfield G : Lcom/google/android/material/internal/CheckableImageButton;
    //   62: invokevirtual getMeasuredWidth : ()I
    //   65: ifle -> 183
    //   68: aload_0
    //   69: getfield L : Landroid/graphics/drawable/Drawable;
    //   72: ifnonnull -> 131
    //   75: aload_0
    //   76: new android/graphics/drawable/ColorDrawable
    //   79: dup
    //   80: invokespecial <init> : ()V
    //   83: putfield L : Landroid/graphics/drawable/Drawable;
    //   86: aload_0
    //   87: getfield G : Lcom/google/android/material/internal/CheckableImageButton;
    //   90: invokevirtual getMeasuredWidth : ()I
    //   93: istore_3
    //   94: aload_0
    //   95: getfield d : Landroid/widget/EditText;
    //   98: invokevirtual getPaddingLeft : ()I
    //   101: istore_2
    //   102: aload_0
    //   103: getfield G : Lcom/google/android/material/internal/CheckableImageButton;
    //   106: invokevirtual getLayoutParams : ()Landroid/view/ViewGroup$LayoutParams;
    //   109: checkcast android/view/ViewGroup$MarginLayoutParams
    //   112: invokevirtual getMarginEnd : ()I
    //   115: istore_1
    //   116: aload_0
    //   117: getfield L : Landroid/graphics/drawable/Drawable;
    //   120: iconst_0
    //   121: iconst_0
    //   122: iload_3
    //   123: iload_2
    //   124: isub
    //   125: iload_1
    //   126: iadd
    //   127: iconst_1
    //   128: invokevirtual setBounds : (IIII)V
    //   131: aload_0
    //   132: getfield d : Landroid/widget/EditText;
    //   135: invokevirtual getCompoundDrawablesRelative : ()[Landroid/graphics/drawable/Drawable;
    //   138: astore #8
    //   140: aload #8
    //   142: iconst_0
    //   143: aaload
    //   144: astore #7
    //   146: aload_0
    //   147: getfield L : Landroid/graphics/drawable/Drawable;
    //   150: astore #9
    //   152: aload #7
    //   154: aload #9
    //   156: if_acmpeq -> 230
    //   159: aload_0
    //   160: getfield d : Landroid/widget/EditText;
    //   163: aload #9
    //   165: aload #8
    //   167: iconst_1
    //   168: aaload
    //   169: aload #8
    //   171: iconst_2
    //   172: aaload
    //   173: aload #8
    //   175: iconst_3
    //   176: aaload
    //   177: invokevirtual setCompoundDrawablesRelative : (Landroid/graphics/drawable/Drawable;Landroid/graphics/drawable/Drawable;Landroid/graphics/drawable/Drawable;Landroid/graphics/drawable/Drawable;)V
    //   180: goto -> 224
    //   183: aload_0
    //   184: getfield L : Landroid/graphics/drawable/Drawable;
    //   187: ifnull -> 230
    //   190: aload_0
    //   191: getfield d : Landroid/widget/EditText;
    //   194: invokevirtual getCompoundDrawablesRelative : ()[Landroid/graphics/drawable/Drawable;
    //   197: astore #7
    //   199: aload_0
    //   200: getfield d : Landroid/widget/EditText;
    //   203: aconst_null
    //   204: aload #7
    //   206: iconst_1
    //   207: aaload
    //   208: aload #7
    //   210: iconst_2
    //   211: aaload
    //   212: aload #7
    //   214: iconst_3
    //   215: aaload
    //   216: invokevirtual setCompoundDrawablesRelative : (Landroid/graphics/drawable/Drawable;Landroid/graphics/drawable/Drawable;Landroid/graphics/drawable/Drawable;Landroid/graphics/drawable/Drawable;)V
    //   219: aload_0
    //   220: aconst_null
    //   221: putfield L : Landroid/graphics/drawable/Drawable;
    //   224: iconst_1
    //   225: istore #4
    //   227: goto -> 233
    //   230: iconst_0
    //   231: istore #4
    //   233: aload_0
    //   234: invokespecial getEndIconToUpdateDummyDrawable : ()Lcom/google/android/material/internal/CheckableImageButton;
    //   237: astore #7
    //   239: aload #7
    //   241: ifnull -> 378
    //   244: aload #7
    //   246: invokevirtual getMeasuredWidth : ()I
    //   249: ifle -> 378
    //   252: aload_0
    //   253: getfield W : Landroid/graphics/drawable/Drawable;
    //   256: ifnonnull -> 311
    //   259: aload_0
    //   260: new android/graphics/drawable/ColorDrawable
    //   263: dup
    //   264: invokespecial <init> : ()V
    //   267: putfield W : Landroid/graphics/drawable/Drawable;
    //   270: aload #7
    //   272: invokevirtual getMeasuredWidth : ()I
    //   275: istore_3
    //   276: aload_0
    //   277: getfield d : Landroid/widget/EditText;
    //   280: invokevirtual getPaddingRight : ()I
    //   283: istore_2
    //   284: aload #7
    //   286: invokevirtual getLayoutParams : ()Landroid/view/ViewGroup$LayoutParams;
    //   289: checkcast android/view/ViewGroup$MarginLayoutParams
    //   292: invokevirtual getMarginStart : ()I
    //   295: istore_1
    //   296: aload_0
    //   297: getfield W : Landroid/graphics/drawable/Drawable;
    //   300: iconst_0
    //   301: iconst_0
    //   302: iload_3
    //   303: iload_2
    //   304: isub
    //   305: iload_1
    //   306: iadd
    //   307: iconst_1
    //   308: invokevirtual setBounds : (IIII)V
    //   311: aload_0
    //   312: getfield d : Landroid/widget/EditText;
    //   315: invokevirtual getCompoundDrawablesRelative : ()[Landroid/graphics/drawable/Drawable;
    //   318: astore #8
    //   320: aload #8
    //   322: iconst_2
    //   323: aaload
    //   324: astore #7
    //   326: aload_0
    //   327: getfield W : Landroid/graphics/drawable/Drawable;
    //   330: astore #9
    //   332: aload #7
    //   334: aload #9
    //   336: if_acmpeq -> 375
    //   339: aload_0
    //   340: aload #8
    //   342: iconst_2
    //   343: aaload
    //   344: putfield a0 : Landroid/graphics/drawable/Drawable;
    //   347: aload_0
    //   348: getfield d : Landroid/widget/EditText;
    //   351: aload #8
    //   353: iconst_0
    //   354: aaload
    //   355: aload #8
    //   357: iconst_1
    //   358: aaload
    //   359: aload #9
    //   361: aload #8
    //   363: iconst_3
    //   364: aaload
    //   365: invokevirtual setCompoundDrawablesRelative : (Landroid/graphics/drawable/Drawable;Landroid/graphics/drawable/Drawable;Landroid/graphics/drawable/Drawable;Landroid/graphics/drawable/Drawable;)V
    //   368: iload #5
    //   370: istore #4
    //   372: goto -> 444
    //   375: goto -> 444
    //   378: iload #4
    //   380: istore #5
    //   382: aload_0
    //   383: getfield W : Landroid/graphics/drawable/Drawable;
    //   386: ifnull -> 448
    //   389: aload_0
    //   390: getfield d : Landroid/widget/EditText;
    //   393: invokevirtual getCompoundDrawablesRelative : ()[Landroid/graphics/drawable/Drawable;
    //   396: astore #7
    //   398: aload #7
    //   400: iconst_2
    //   401: aaload
    //   402: aload_0
    //   403: getfield W : Landroid/graphics/drawable/Drawable;
    //   406: if_acmpne -> 439
    //   409: aload_0
    //   410: getfield d : Landroid/widget/EditText;
    //   413: aload #7
    //   415: iconst_0
    //   416: aaload
    //   417: aload #7
    //   419: iconst_1
    //   420: aaload
    //   421: aload_0
    //   422: getfield a0 : Landroid/graphics/drawable/Drawable;
    //   425: aload #7
    //   427: iconst_3
    //   428: aaload
    //   429: invokevirtual setCompoundDrawablesRelative : (Landroid/graphics/drawable/Drawable;Landroid/graphics/drawable/Drawable;Landroid/graphics/drawable/Drawable;Landroid/graphics/drawable/Drawable;)V
    //   432: iload #6
    //   434: istore #4
    //   436: goto -> 439
    //   439: aload_0
    //   440: aconst_null
    //   441: putfield W : Landroid/graphics/drawable/Drawable;
    //   444: iload #4
    //   446: istore #5
    //   448: iload #5
    //   450: ireturn
  }
  
  public final void u() {
    if (this.v != 1) {
      LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams)this.b.getLayoutParams();
      int i = g();
      if (i != layoutParams.topMargin) {
        layoutParams.topMargin = i;
        this.b.requestLayout();
      } 
    } 
  }
  
  public final void v(boolean paramBoolean1, boolean paramBoolean2) {
    // Byte code:
    //   0: aload_0
    //   1: invokevirtual isEnabled : ()Z
    //   4: istore #5
    //   6: aload_0
    //   7: getfield d : Landroid/widget/EditText;
    //   10: astore #7
    //   12: aload #7
    //   14: ifnull -> 33
    //   17: aload #7
    //   19: invokevirtual getText : ()Landroid/text/Editable;
    //   22: invokestatic isEmpty : (Ljava/lang/CharSequence;)Z
    //   25: ifne -> 33
    //   28: iconst_1
    //   29: istore_3
    //   30: goto -> 35
    //   33: iconst_0
    //   34: istore_3
    //   35: aload_0
    //   36: getfield d : Landroid/widget/EditText;
    //   39: astore #7
    //   41: aload #7
    //   43: ifnull -> 60
    //   46: aload #7
    //   48: invokevirtual hasFocus : ()Z
    //   51: ifeq -> 60
    //   54: iconst_1
    //   55: istore #4
    //   57: goto -> 63
    //   60: iconst_0
    //   61: istore #4
    //   63: aload_0
    //   64: getfield f : Lc/c/a/b/g0/o;
    //   67: invokevirtual e : ()Z
    //   70: istore #6
    //   72: aload_0
    //   73: getfield d0 : Landroid/content/res/ColorStateList;
    //   76: astore #8
    //   78: aload #8
    //   80: ifnull -> 145
    //   83: aload_0
    //   84: getfield n0 : Lc/c/a/b/y/c;
    //   87: astore #7
    //   89: aload #7
    //   91: getfield l : Landroid/content/res/ColorStateList;
    //   94: aload #8
    //   96: if_acmpeq -> 111
    //   99: aload #7
    //   101: aload #8
    //   103: putfield l : Landroid/content/res/ColorStateList;
    //   106: aload #7
    //   108: invokevirtual k : ()V
    //   111: aload_0
    //   112: getfield n0 : Lc/c/a/b/y/c;
    //   115: astore #8
    //   117: aload_0
    //   118: getfield d0 : Landroid/content/res/ColorStateList;
    //   121: astore #7
    //   123: aload #8
    //   125: getfield k : Landroid/content/res/ColorStateList;
    //   128: aload #7
    //   130: if_acmpeq -> 145
    //   133: aload #8
    //   135: aload #7
    //   137: putfield k : Landroid/content/res/ColorStateList;
    //   140: aload #8
    //   142: invokevirtual k : ()V
    //   145: iload #5
    //   147: ifne -> 204
    //   150: aload_0
    //   151: getfield n0 : Lc/c/a/b/y/c;
    //   154: aload_0
    //   155: getfield l0 : I
    //   158: invokestatic valueOf : (I)Landroid/content/res/ColorStateList;
    //   161: invokevirtual m : (Landroid/content/res/ColorStateList;)V
    //   164: aload_0
    //   165: getfield n0 : Lc/c/a/b/y/c;
    //   168: astore #8
    //   170: aload_0
    //   171: getfield l0 : I
    //   174: invokestatic valueOf : (I)Landroid/content/res/ColorStateList;
    //   177: astore #7
    //   179: aload #8
    //   181: getfield k : Landroid/content/res/ColorStateList;
    //   184: aload #7
    //   186: if_acmpeq -> 315
    //   189: aload #8
    //   191: aload #7
    //   193: putfield k : Landroid/content/res/ColorStateList;
    //   196: aload #8
    //   198: invokevirtual k : ()V
    //   201: goto -> 315
    //   204: iload #6
    //   206: ifeq -> 252
    //   209: aload_0
    //   210: getfield n0 : Lc/c/a/b/y/c;
    //   213: astore #8
    //   215: aload_0
    //   216: getfield f : Lc/c/a/b/g0/o;
    //   219: getfield m : Landroid/widget/TextView;
    //   222: astore #7
    //   224: aload #7
    //   226: ifnull -> 239
    //   229: aload #7
    //   231: invokevirtual getTextColors : ()Landroid/content/res/ColorStateList;
    //   234: astore #7
    //   236: goto -> 242
    //   239: aconst_null
    //   240: astore #7
    //   242: aload #8
    //   244: aload #7
    //   246: invokevirtual m : (Landroid/content/res/ColorStateList;)V
    //   249: goto -> 315
    //   252: aload_0
    //   253: getfield i : Z
    //   256: ifeq -> 286
    //   259: aload_0
    //   260: getfield j : Landroid/widget/TextView;
    //   263: astore #7
    //   265: aload #7
    //   267: ifnull -> 286
    //   270: aload_0
    //   271: getfield n0 : Lc/c/a/b/y/c;
    //   274: astore #8
    //   276: aload #7
    //   278: invokevirtual getTextColors : ()Landroid/content/res/ColorStateList;
    //   281: astore #7
    //   283: goto -> 308
    //   286: iload #4
    //   288: ifeq -> 315
    //   291: aload_0
    //   292: getfield e0 : Landroid/content/res/ColorStateList;
    //   295: astore #7
    //   297: aload #7
    //   299: ifnull -> 315
    //   302: aload_0
    //   303: getfield n0 : Lc/c/a/b/y/c;
    //   306: astore #8
    //   308: aload #8
    //   310: aload #7
    //   312: invokevirtual m : (Landroid/content/res/ColorStateList;)V
    //   315: iload_3
    //   316: ifne -> 457
    //   319: aload_0
    //   320: invokevirtual isEnabled : ()Z
    //   323: ifeq -> 339
    //   326: iload #4
    //   328: ifne -> 457
    //   331: iload #6
    //   333: ifeq -> 339
    //   336: goto -> 457
    //   339: iload_2
    //   340: ifne -> 350
    //   343: aload_0
    //   344: getfield m0 : Z
    //   347: ifne -> 537
    //   350: aload_0
    //   351: getfield p0 : Landroid/animation/ValueAnimator;
    //   354: astore #7
    //   356: aload #7
    //   358: ifnull -> 376
    //   361: aload #7
    //   363: invokevirtual isRunning : ()Z
    //   366: ifeq -> 376
    //   369: aload_0
    //   370: getfield p0 : Landroid/animation/ValueAnimator;
    //   373: invokevirtual cancel : ()V
    //   376: iload_1
    //   377: ifeq -> 395
    //   380: aload_0
    //   381: getfield o0 : Z
    //   384: ifeq -> 395
    //   387: aload_0
    //   388: fconst_0
    //   389: invokevirtual b : (F)V
    //   392: goto -> 403
    //   395: aload_0
    //   396: getfield n0 : Lc/c/a/b/y/c;
    //   399: fconst_0
    //   400: invokevirtual n : (F)V
    //   403: aload_0
    //   404: invokevirtual h : ()Z
    //   407: ifeq -> 449
    //   410: aload_0
    //   411: getfield r : Lc/c/a/b/d0/g;
    //   414: checkcast c/c/a/b/g0/g
    //   417: getfield y : Landroid/graphics/RectF;
    //   420: invokevirtual isEmpty : ()Z
    //   423: iconst_1
    //   424: ixor
    //   425: ifeq -> 449
    //   428: aload_0
    //   429: invokevirtual h : ()Z
    //   432: ifeq -> 449
    //   435: aload_0
    //   436: getfield r : Lc/c/a/b/d0/g;
    //   439: checkcast c/c/a/b/g0/g
    //   442: fconst_0
    //   443: fconst_0
    //   444: fconst_0
    //   445: fconst_0
    //   446: invokevirtual y : (FFFF)V
    //   449: aload_0
    //   450: iconst_1
    //   451: putfield m0 : Z
    //   454: goto -> 537
    //   457: iload_2
    //   458: ifne -> 468
    //   461: aload_0
    //   462: getfield m0 : Z
    //   465: ifeq -> 537
    //   468: aload_0
    //   469: getfield p0 : Landroid/animation/ValueAnimator;
    //   472: astore #7
    //   474: aload #7
    //   476: ifnull -> 494
    //   479: aload #7
    //   481: invokevirtual isRunning : ()Z
    //   484: ifeq -> 494
    //   487: aload_0
    //   488: getfield p0 : Landroid/animation/ValueAnimator;
    //   491: invokevirtual cancel : ()V
    //   494: iload_1
    //   495: ifeq -> 513
    //   498: aload_0
    //   499: getfield o0 : Z
    //   502: ifeq -> 513
    //   505: aload_0
    //   506: fconst_1
    //   507: invokevirtual b : (F)V
    //   510: goto -> 521
    //   513: aload_0
    //   514: getfield n0 : Lc/c/a/b/y/c;
    //   517: fconst_1
    //   518: invokevirtual n : (F)V
    //   521: aload_0
    //   522: iconst_0
    //   523: putfield m0 : Z
    //   526: aload_0
    //   527: invokevirtual h : ()Z
    //   530: ifeq -> 537
    //   533: aload_0
    //   534: invokevirtual l : ()V
    //   537: return
  }
  
  public void w() {
    // Byte code:
    //   0: aload_0
    //   1: getfield r : Lc/c/a/b/d0/g;
    //   4: ifnull -> 409
    //   7: aload_0
    //   8: getfield v : I
    //   11: ifne -> 17
    //   14: goto -> 409
    //   17: aload_0
    //   18: invokevirtual isFocused : ()Z
    //   21: istore #4
    //   23: iconst_0
    //   24: istore #5
    //   26: iload #4
    //   28: ifne -> 58
    //   31: aload_0
    //   32: getfield d : Landroid/widget/EditText;
    //   35: astore #6
    //   37: aload #6
    //   39: ifnull -> 53
    //   42: aload #6
    //   44: invokevirtual hasFocus : ()Z
    //   47: ifeq -> 53
    //   50: goto -> 58
    //   53: iconst_0
    //   54: istore_3
    //   55: goto -> 60
    //   58: iconst_1
    //   59: istore_3
    //   60: aload_0
    //   61: invokevirtual isHovered : ()Z
    //   64: ifne -> 94
    //   67: aload_0
    //   68: getfield d : Landroid/widget/EditText;
    //   71: astore #6
    //   73: aload #6
    //   75: ifnull -> 89
    //   78: aload #6
    //   80: invokevirtual isHovered : ()Z
    //   83: ifeq -> 89
    //   86: goto -> 94
    //   89: iconst_0
    //   90: istore_2
    //   91: goto -> 96
    //   94: iconst_1
    //   95: istore_2
    //   96: aload_0
    //   97: invokevirtual isEnabled : ()Z
    //   100: ifne -> 116
    //   103: aload_0
    //   104: getfield l0 : I
    //   107: istore_1
    //   108: aload_0
    //   109: iload_1
    //   110: putfield A : I
    //   113: goto -> 196
    //   116: aload_0
    //   117: getfield f : Lc/c/a/b/g0/o;
    //   120: invokevirtual e : ()Z
    //   123: ifeq -> 137
    //   126: aload_0
    //   127: getfield f : Lc/c/a/b/g0/o;
    //   130: invokevirtual g : ()I
    //   133: istore_1
    //   134: goto -> 108
    //   137: aload_0
    //   138: getfield i : Z
    //   141: ifeq -> 164
    //   144: aload_0
    //   145: getfield j : Landroid/widget/TextView;
    //   148: astore #6
    //   150: aload #6
    //   152: ifnull -> 164
    //   155: aload #6
    //   157: invokevirtual getCurrentTextColor : ()I
    //   160: istore_1
    //   161: goto -> 108
    //   164: iload_3
    //   165: ifeq -> 176
    //   168: aload_0
    //   169: getfield h0 : I
    //   172: istore_1
    //   173: goto -> 108
    //   176: iload_2
    //   177: ifeq -> 188
    //   180: aload_0
    //   181: getfield g0 : I
    //   184: istore_1
    //   185: goto -> 108
    //   188: aload_0
    //   189: getfield f0 : I
    //   192: istore_1
    //   193: goto -> 108
    //   196: aload_0
    //   197: getfield f : Lc/c/a/b/g0/o;
    //   200: invokevirtual e : ()Z
    //   203: ifeq -> 221
    //   206: aload_0
    //   207: invokespecial getEndIconDelegate : ()Lc/c/a/b/g0/n;
    //   210: invokevirtual c : ()Z
    //   213: ifeq -> 221
    //   216: iconst_1
    //   217: istore_1
    //   218: goto -> 223
    //   221: iconst_0
    //   222: istore_1
    //   223: iload_1
    //   224: ifeq -> 270
    //   227: aload_0
    //   228: invokevirtual getEndIconDrawable : ()Landroid/graphics/drawable/Drawable;
    //   231: ifnull -> 270
    //   234: aload_0
    //   235: invokevirtual getEndIconDrawable : ()Landroid/graphics/drawable/Drawable;
    //   238: invokestatic C0 : (Landroid/graphics/drawable/Drawable;)Landroid/graphics/drawable/Drawable;
    //   241: invokevirtual mutate : ()Landroid/graphics/drawable/Drawable;
    //   244: astore #6
    //   246: aload #6
    //   248: aload_0
    //   249: getfield f : Lc/c/a/b/g0/o;
    //   252: invokevirtual g : ()I
    //   255: invokevirtual setTint : (I)V
    //   258: aload_0
    //   259: getfield Q : Lcom/google/android/material/internal/CheckableImageButton;
    //   262: aload #6
    //   264: invokevirtual setImageDrawable : (Landroid/graphics/drawable/Drawable;)V
    //   267: goto -> 274
    //   270: aload_0
    //   271: invokevirtual d : ()V
    //   274: iload #5
    //   276: istore #4
    //   278: aload_0
    //   279: invokevirtual getErrorIconDrawable : ()Landroid/graphics/drawable/Drawable;
    //   282: ifnull -> 318
    //   285: aload_0
    //   286: getfield f : Lc/c/a/b/g0/o;
    //   289: astore #6
    //   291: iload #5
    //   293: istore #4
    //   295: aload #6
    //   297: getfield l : Z
    //   300: ifeq -> 318
    //   303: iload #5
    //   305: istore #4
    //   307: aload #6
    //   309: invokevirtual e : ()Z
    //   312: ifeq -> 318
    //   315: iconst_1
    //   316: istore #4
    //   318: aload_0
    //   319: iload #4
    //   321: invokespecial setErrorIconVisible : (Z)V
    //   324: iload_2
    //   325: ifne -> 332
    //   328: iload_3
    //   329: ifeq -> 347
    //   332: aload_0
    //   333: invokevirtual isEnabled : ()Z
    //   336: ifeq -> 347
    //   339: aload_0
    //   340: getfield z : I
    //   343: istore_1
    //   344: goto -> 352
    //   347: aload_0
    //   348: getfield y : I
    //   351: istore_1
    //   352: aload_0
    //   353: iload_1
    //   354: putfield x : I
    //   357: aload_0
    //   358: getfield v : I
    //   361: iconst_1
    //   362: if_icmpne -> 405
    //   365: aload_0
    //   366: invokevirtual isEnabled : ()Z
    //   369: ifne -> 385
    //   372: aload_0
    //   373: getfield j0 : I
    //   376: istore_1
    //   377: aload_0
    //   378: iload_1
    //   379: putfield B : I
    //   382: goto -> 405
    //   385: iload_2
    //   386: ifeq -> 397
    //   389: aload_0
    //   390: getfield k0 : I
    //   393: istore_1
    //   394: goto -> 377
    //   397: aload_0
    //   398: getfield i0 : I
    //   401: istore_1
    //   402: goto -> 377
    //   405: aload_0
    //   406: invokevirtual c : ()V
    //   409: return
  }
  
  public class a implements TextWatcher {
    public final TextInputLayout b;
    
    public a(TextInputLayout this$0) {}
    
    public void afterTextChanged(Editable param1Editable) {
      TextInputLayout textInputLayout = this.b;
      textInputLayout.v(textInputLayout.r0 ^ true, false);
      textInputLayout = this.b;
      if (textInputLayout.g)
        textInputLayout.q(param1Editable.length()); 
    }
    
    public void beforeTextChanged(CharSequence param1CharSequence, int param1Int1, int param1Int2, int param1Int3) {}
    
    public void onTextChanged(CharSequence param1CharSequence, int param1Int1, int param1Int2, int param1Int3) {}
  }
  
  public class b implements Runnable {
    public final TextInputLayout b;
    
    public b(TextInputLayout this$0) {}
    
    public void run() {
      this.b.Q.performClick();
      this.b.Q.jumpDrawablesToCurrentState();
    }
  }
  
  public class c implements Runnable {
    public final TextInputLayout b;
    
    public c(TextInputLayout this$0) {}
    
    public void run() {
      this.b.d.requestLayout();
    }
  }
  
  public class d implements ValueAnimator.AnimatorUpdateListener {
    public final TextInputLayout a;
    
    public d(TextInputLayout this$0) {}
    
    public void onAnimationUpdate(ValueAnimator param1ValueAnimator) {
      this.a.n0.n(((Float)param1ValueAnimator.getAnimatedValue()).floatValue());
    }
  }
  
  public static class e extends b.i.m.a {
    public final TextInputLayout d;
    
    public e(TextInputLayout param1TextInputLayout) {
      this.d = param1TextInputLayout;
    }
    
    public void d(View param1View, b.i.m.v.b param1b) {
      boolean bool1;
      this.a.onInitializeAccessibilityNodeInfo(param1View, param1b.a);
      EditText editText = this.d.getEditText();
      if (editText != null) {
        Editable editable = editText.getText();
      } else {
        editText = null;
      } 
      CharSequence charSequence3 = this.d.getHint();
      CharSequence charSequence2 = this.d.getError();
      CharSequence charSequence1 = this.d.getCounterOverflowDescription();
      int k = TextUtils.isEmpty((CharSequence)editText) ^ true;
      int j = TextUtils.isEmpty(charSequence3) ^ true;
      int i = TextUtils.isEmpty(charSequence2) ^ true;
      boolean bool2 = false;
      if (i != 0 || !TextUtils.isEmpty(charSequence1)) {
        bool1 = true;
      } else {
        bool1 = false;
      } 
      if (k != 0) {
        param1b.a.setText((CharSequence)editText);
      } else if (j != 0) {
        param1b.a.setText(charSequence3);
      } 
      if (j != 0) {
        param1b.k(charSequence3);
        boolean bool = bool2;
        if (k == 0) {
          bool = bool2;
          if (j != 0)
            bool = true; 
        } 
        if (Build.VERSION.SDK_INT >= 26) {
          param1b.a.setShowingHintText(bool);
        } else {
          param1b.h(4, bool);
        } 
      } 
      if (bool1) {
        CharSequence charSequence;
        if (i != 0) {
          charSequence = charSequence2;
        } else {
          charSequence = charSequence1;
        } 
        param1b.a.setError(charSequence);
        param1b.a.setContentInvalid(true);
      } 
    }
  }
  
  public static interface f {
    void a(TextInputLayout param1TextInputLayout);
  }
  
  public static interface g {
    void a(TextInputLayout param1TextInputLayout, int param1Int);
  }
  
  public static class h extends b.k.a.a {
    public static final Parcelable.Creator<h> CREATOR = (Parcelable.Creator<h>)new a();
    
    public CharSequence d;
    
    public boolean e;
    
    public h(Parcel param1Parcel, ClassLoader param1ClassLoader) {
      super(param1Parcel, param1ClassLoader);
      this.d = (CharSequence)TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(param1Parcel);
      int i = param1Parcel.readInt();
      boolean bool = true;
      if (i != 1)
        bool = false; 
      this.e = bool;
    }
    
    public h(Parcelable param1Parcelable) {
      super(param1Parcelable);
    }
    
    public String toString() {
      StringBuilder stringBuilder = c.a.a.a.a.e("TextInputLayout.SavedState{");
      stringBuilder.append(Integer.toHexString(System.identityHashCode(this)));
      stringBuilder.append(" error=");
      stringBuilder.append(this.d);
      stringBuilder.append("}");
      return stringBuilder.toString();
    }
    
    public void writeToParcel(Parcel param1Parcel, int param1Int) {
      param1Parcel.writeParcelable(this.b, param1Int);
      TextUtils.writeToParcel(this.d, param1Parcel, param1Int);
      param1Parcel.writeInt(this.e);
    }
    
    public static final class a implements Parcelable.ClassLoaderCreator<h> {
      public Object createFromParcel(Parcel param2Parcel) {
        return new TextInputLayout.h(param2Parcel, null);
      }
      
      public Object createFromParcel(Parcel param2Parcel, ClassLoader param2ClassLoader) {
        return new TextInputLayout.h(param2Parcel, param2ClassLoader);
      }
      
      public Object[] newArray(int param2Int) {
        return (Object[])new TextInputLayout.h[param2Int];
      }
    }
  }
  
  public static final class a implements Parcelable.ClassLoaderCreator<h> {
    public Object createFromParcel(Parcel param1Parcel) {
      return new TextInputLayout.h(param1Parcel, null);
    }
    
    public Object createFromParcel(Parcel param1Parcel, ClassLoader param1ClassLoader) {
      return new TextInputLayout.h(param1Parcel, param1ClassLoader);
    }
    
    public Object[] newArray(int param1Int) {
      return (Object[])new TextInputLayout.h[param1Int];
    }
  }
}


/* Location:              C:\Users\panch\Downloads\dvba_v1.1.0-dex2jar.jar!\com\google\android\material\textfield\TextInputLayout.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */