package b.b.p;

import a.a.a.a.a;
import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.text.TextDirectionHeuristic;
import android.text.TextDirectionHeuristics;
import android.util.AttributeSet;
import android.view.ActionMode;
import android.view.View;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.view.textclassifier.TextClassifier;
import android.widget.TextView;
import b.b.l.a.a;
import b.i.f.d;
import b.i.k.b;
import b.i.n.b;
import b.i.n.e;
import java.util.concurrent.Future;

public class z extends TextView implements e, b {
  public final e b;
  
  public final y c;
  
  public final x d;
  
  public Future<b> e;
  
  public z(Context paramContext, AttributeSet paramAttributeSet) {
    this(paramContext, paramAttributeSet, 16842884);
  }
  
  public z(Context paramContext, AttributeSet paramAttributeSet, int paramInt) {
    super(paramContext, paramAttributeSet, paramInt);
    s0.a((View)this, getContext());
    e e1 = new e((View)this);
    this.b = e1;
    e1.d(paramAttributeSet, paramInt);
    y y1 = new y(this);
    this.c = y1;
    y1.e(paramAttributeSet, paramInt);
    this.c.b();
    this.d = new x(this);
  }
  
  public void drawableStateChanged() {
    super.drawableStateChanged();
    e e1 = this.b;
    if (e1 != null)
      e1.a(); 
    y y1 = this.c;
    if (y1 != null)
      y1.b(); 
  }
  
  public int getAutoSizeMaxTextSize() {
    if (b.a)
      return super.getAutoSizeMaxTextSize(); 
    y y1 = this.c;
    return (y1 != null) ? Math.round(y1.i.e) : -1;
  }
  
  public int getAutoSizeMinTextSize() {
    if (b.a)
      return super.getAutoSizeMinTextSize(); 
    y y1 = this.c;
    return (y1 != null) ? Math.round(y1.i.d) : -1;
  }
  
  public int getAutoSizeStepGranularity() {
    if (b.a)
      return super.getAutoSizeStepGranularity(); 
    y y1 = this.c;
    return (y1 != null) ? Math.round(y1.i.c) : -1;
  }
  
  public int[] getAutoSizeTextAvailableSizes() {
    if (b.a)
      return super.getAutoSizeTextAvailableSizes(); 
    y y1 = this.c;
    return (y1 != null) ? y1.i.f : new int[0];
  }
  
  @SuppressLint({"WrongConstant"})
  public int getAutoSizeTextType() {
    boolean bool1 = b.a;
    boolean bool = false;
    if (bool1) {
      if (super.getAutoSizeTextType() == 1)
        bool = true; 
      return bool;
    } 
    y y1 = this.c;
    return (y1 != null) ? y1.i.a : 0;
  }
  
  public int getFirstBaselineToTopHeight() {
    return getPaddingTop() - (getPaint().getFontMetricsInt()).top;
  }
  
  public int getLastBaselineToBottomHeight() {
    return getPaddingBottom() + (getPaint().getFontMetricsInt()).bottom;
  }
  
  public ColorStateList getSupportBackgroundTintList() {
    e e1 = this.b;
    if (e1 != null) {
      ColorStateList colorStateList = e1.b();
    } else {
      e1 = null;
    } 
    return (ColorStateList)e1;
  }
  
  public PorterDuff.Mode getSupportBackgroundTintMode() {
    e e1 = this.b;
    if (e1 != null) {
      PorterDuff.Mode mode = e1.c();
    } else {
      e1 = null;
    } 
    return (PorterDuff.Mode)e1;
  }
  
  public ColorStateList getSupportCompoundDrawablesTintList() {
    v0 v0 = this.c.h;
    if (v0 != null) {
      ColorStateList colorStateList = v0.a;
    } else {
      v0 = null;
    } 
    return (ColorStateList)v0;
  }
  
  public PorterDuff.Mode getSupportCompoundDrawablesTintMode() {
    v0 v0 = this.c.h;
    if (v0 != null) {
      PorterDuff.Mode mode = v0.b;
    } else {
      v0 = null;
    } 
    return (PorterDuff.Mode)v0;
  }
  
  public CharSequence getText() {
    Future<b> future = this.e;
    if (future != null)
      try {
        this.e = null;
        a.r0(this, future.get());
      } catch (InterruptedException|java.util.concurrent.ExecutionException interruptedException) {} 
    return super.getText();
  }
  
  public TextClassifier getTextClassifier() {
    if (Build.VERSION.SDK_INT < 28) {
      x x1 = this.d;
      if (x1 != null)
        return x1.a(); 
    } 
    return super.getTextClassifier();
  }
  
  public b.a getTextMetricsParamsCompat() {
    return a.M(this);
  }
  
  public InputConnection onCreateInputConnection(EditorInfo paramEditorInfo) {
    InputConnection inputConnection = super.onCreateInputConnection(paramEditorInfo);
    a.c0(inputConnection, paramEditorInfo, (View)this);
    return inputConnection;
  }
  
  public void onLayout(boolean paramBoolean, int paramInt1, int paramInt2, int paramInt3, int paramInt4) {
    super.onLayout(paramBoolean, paramInt1, paramInt2, paramInt3, paramInt4);
    y y1 = this.c;
    if (y1 != null && !b.a)
      y1.i.a(); 
  }
  
  public void onMeasure(int paramInt1, int paramInt2) {
    Future<b> future = this.e;
    if (future != null)
      try {
        this.e = null;
        a.r0(this, future.get());
      } catch (InterruptedException|java.util.concurrent.ExecutionException interruptedException) {} 
    super.onMeasure(paramInt1, paramInt2);
  }
  
  public void onTextChanged(CharSequence paramCharSequence, int paramInt1, int paramInt2, int paramInt3) {
    super.onTextChanged(paramCharSequence, paramInt1, paramInt2, paramInt3);
    y y1 = this.c;
    if (y1 != null && !b.a && y1.d())
      this.c.i.a(); 
  }
  
  public void setAutoSizeTextTypeUniformWithConfiguration(int paramInt1, int paramInt2, int paramInt3, int paramInt4) {
    if (b.a) {
      super.setAutoSizeTextTypeUniformWithConfiguration(paramInt1, paramInt2, paramInt3, paramInt4);
    } else {
      y y1 = this.c;
      if (y1 != null)
        y1.g(paramInt1, paramInt2, paramInt3, paramInt4); 
    } 
  }
  
  public void setAutoSizeTextTypeUniformWithPresetSizes(int[] paramArrayOfint, int paramInt) {
    if (b.a) {
      super.setAutoSizeTextTypeUniformWithPresetSizes(paramArrayOfint, paramInt);
    } else {
      y y1 = this.c;
      if (y1 != null)
        y1.h(paramArrayOfint, paramInt); 
    } 
  }
  
  public void setAutoSizeTextTypeWithDefaults(int paramInt) {
    if (b.a) {
      super.setAutoSizeTextTypeWithDefaults(paramInt);
    } else {
      y y1 = this.c;
      if (y1 != null)
        y1.i(paramInt); 
    } 
  }
  
  public void setBackgroundDrawable(Drawable paramDrawable) {
    super.setBackgroundDrawable(paramDrawable);
    e e1 = this.b;
    if (e1 != null)
      e1.e(); 
  }
  
  public void setBackgroundResource(int paramInt) {
    super.setBackgroundResource(paramInt);
    e e1 = this.b;
    if (e1 != null)
      e1.f(paramInt); 
  }
  
  public void setCompoundDrawables(Drawable paramDrawable1, Drawable paramDrawable2, Drawable paramDrawable3, Drawable paramDrawable4) {
    super.setCompoundDrawables(paramDrawable1, paramDrawable2, paramDrawable3, paramDrawable4);
    y y1 = this.c;
    if (y1 != null)
      y1.b(); 
  }
  
  public void setCompoundDrawablesRelative(Drawable paramDrawable1, Drawable paramDrawable2, Drawable paramDrawable3, Drawable paramDrawable4) {
    super.setCompoundDrawablesRelative(paramDrawable1, paramDrawable2, paramDrawable3, paramDrawable4);
    y y1 = this.c;
    if (y1 != null)
      y1.b(); 
  }
  
  public void setCompoundDrawablesRelativeWithIntrinsicBounds(int paramInt1, int paramInt2, int paramInt3, int paramInt4) {
    Drawable drawable1;
    Drawable drawable2;
    Drawable drawable3;
    Context context = getContext();
    Drawable drawable4 = null;
    if (paramInt1 != 0) {
      drawable1 = a.b(context, paramInt1);
    } else {
      drawable1 = null;
    } 
    if (paramInt2 != 0) {
      drawable2 = a.b(context, paramInt2);
    } else {
      drawable2 = null;
    } 
    if (paramInt3 != 0) {
      drawable3 = a.b(context, paramInt3);
    } else {
      drawable3 = null;
    } 
    if (paramInt4 != 0)
      drawable4 = a.b(context, paramInt4); 
    setCompoundDrawablesRelativeWithIntrinsicBounds(drawable1, drawable2, drawable3, drawable4);
    y y1 = this.c;
    if (y1 != null)
      y1.b(); 
  }
  
  public void setCompoundDrawablesRelativeWithIntrinsicBounds(Drawable paramDrawable1, Drawable paramDrawable2, Drawable paramDrawable3, Drawable paramDrawable4) {
    super.setCompoundDrawablesRelativeWithIntrinsicBounds(paramDrawable1, paramDrawable2, paramDrawable3, paramDrawable4);
    y y1 = this.c;
    if (y1 != null)
      y1.b(); 
  }
  
  public void setCompoundDrawablesWithIntrinsicBounds(int paramInt1, int paramInt2, int paramInt3, int paramInt4) {
    Drawable drawable1;
    Drawable drawable2;
    Drawable drawable3;
    Context context = getContext();
    Drawable drawable4 = null;
    if (paramInt1 != 0) {
      drawable1 = a.b(context, paramInt1);
    } else {
      drawable1 = null;
    } 
    if (paramInt2 != 0) {
      drawable2 = a.b(context, paramInt2);
    } else {
      drawable2 = null;
    } 
    if (paramInt3 != 0) {
      drawable3 = a.b(context, paramInt3);
    } else {
      drawable3 = null;
    } 
    if (paramInt4 != 0)
      drawable4 = a.b(context, paramInt4); 
    setCompoundDrawablesWithIntrinsicBounds(drawable1, drawable2, drawable3, drawable4);
    y y1 = this.c;
    if (y1 != null)
      y1.b(); 
  }
  
  public void setCompoundDrawablesWithIntrinsicBounds(Drawable paramDrawable1, Drawable paramDrawable2, Drawable paramDrawable3, Drawable paramDrawable4) {
    super.setCompoundDrawablesWithIntrinsicBounds(paramDrawable1, paramDrawable2, paramDrawable3, paramDrawable4);
    y y1 = this.c;
    if (y1 != null)
      y1.b(); 
  }
  
  public void setCustomSelectionActionModeCallback(ActionMode.Callback paramCallback) {
    super.setCustomSelectionActionModeCallback(a.D0(this, paramCallback));
  }
  
  public void setFirstBaselineToTopHeight(int paramInt) {
    if (Build.VERSION.SDK_INT >= 28) {
      super.setFirstBaselineToTopHeight(paramInt);
    } else {
      a.m0(this, paramInt);
    } 
  }
  
  public void setLastBaselineToBottomHeight(int paramInt) {
    if (Build.VERSION.SDK_INT >= 28) {
      super.setLastBaselineToBottomHeight(paramInt);
    } else {
      a.n0(this, paramInt);
    } 
  }
  
  public void setLineHeight(int paramInt) {
    a.p0(this, paramInt);
  }
  
  public void setPrecomputedText(b paramb) {
    a.r0(this, paramb);
  }
  
  public void setSupportBackgroundTintList(ColorStateList paramColorStateList) {
    e e1 = this.b;
    if (e1 != null)
      e1.h(paramColorStateList); 
  }
  
  public void setSupportBackgroundTintMode(PorterDuff.Mode paramMode) {
    e e1 = this.b;
    if (e1 != null)
      e1.i(paramMode); 
  }
  
  public void setSupportCompoundDrawablesTintList(ColorStateList paramColorStateList) {
    this.c.j(paramColorStateList);
    this.c.b();
  }
  
  public void setSupportCompoundDrawablesTintMode(PorterDuff.Mode paramMode) {
    this.c.k(paramMode);
    this.c.b();
  }
  
  public void setTextAppearance(Context paramContext, int paramInt) {
    super.setTextAppearance(paramContext, paramInt);
    y y1 = this.c;
    if (y1 != null)
      y1.f(paramContext, paramInt); 
  }
  
  public void setTextClassifier(TextClassifier paramTextClassifier) {
    if (Build.VERSION.SDK_INT < 28) {
      x x1 = this.d;
      if (x1 != null) {
        x1.b = paramTextClassifier;
        return;
      } 
    } 
    super.setTextClassifier(paramTextClassifier);
  }
  
  public void setTextFuture(Future<b> paramFuture) {
    this.e = paramFuture;
    if (paramFuture != null)
      requestLayout(); 
  }
  
  public void setTextMetricsParamsCompat(b.a parama) {
    TextDirectionHeuristic textDirectionHeuristic2 = parama.b;
    TextDirectionHeuristic textDirectionHeuristic1 = TextDirectionHeuristics.FIRSTSTRONG_RTL;
    byte b1 = 1;
    if (textDirectionHeuristic2 != textDirectionHeuristic1 && textDirectionHeuristic2 != TextDirectionHeuristics.FIRSTSTRONG_LTR)
      if (textDirectionHeuristic2 == TextDirectionHeuristics.ANYRTL_LTR) {
        b1 = 2;
      } else if (textDirectionHeuristic2 == TextDirectionHeuristics.LTR) {
        b1 = 3;
      } else if (textDirectionHeuristic2 == TextDirectionHeuristics.RTL) {
        b1 = 4;
      } else if (textDirectionHeuristic2 == TextDirectionHeuristics.LOCALE) {
        b1 = 5;
      } else if (textDirectionHeuristic2 == TextDirectionHeuristics.FIRSTSTRONG_LTR) {
        b1 = 6;
      } else if (textDirectionHeuristic2 == TextDirectionHeuristics.FIRSTSTRONG_RTL) {
        b1 = 7;
      }  
    setTextDirection(b1);
    if (Build.VERSION.SDK_INT < 23) {
      float f = parama.a.getTextScaleX();
      getPaint().set(parama.a);
      if (f == getTextScaleX())
        setTextScaleX(f / 2.0F + 1.0F); 
      setTextScaleX(f);
    } else {
      getPaint().set(parama.a);
      setBreakStrategy(parama.c);
      setHyphenationFrequency(parama.d);
    } 
  }
  
  public void setTextSize(int paramInt, float paramFloat) {
    boolean bool = b.a;
    if (bool) {
      super.setTextSize(paramInt, paramFloat);
    } else {
      y y1 = this.c;
      if (y1 != null && !bool && !y1.d())
        y1.i.f(paramInt, paramFloat); 
    } 
  }
  
  public void setTypeface(Typeface paramTypeface, int paramInt) {
    Typeface typeface;
    if (paramTypeface != null && paramInt > 0) {
      typeface = d.a(getContext(), paramTypeface, paramInt);
    } else {
      typeface = null;
    } 
    if (typeface != null)
      paramTypeface = typeface; 
    super.setTypeface(paramTypeface, paramInt);
  }
}


/* Location:              C:\Users\panch\Downloads\dvba_v1.1.0-dex2jar.jar!\b\b\p\z.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */