package b.b.p;

import a.a.a.a.a;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.text.Editable;
import android.util.AttributeSet;
import android.view.ActionMode;
import android.view.View;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.view.textclassifier.TextClassifier;
import android.widget.EditText;
import android.widget.TextView;
import b.b.a;

public class k extends EditText {
  public final e b;
  
  public final y c;
  
  public final x d;
  
  public k(Context paramContext, AttributeSet paramAttributeSet) {
    this(paramContext, paramAttributeSet, a.editTextStyle);
  }
  
  public k(Context paramContext, AttributeSet paramAttributeSet, int paramInt) {
    super(paramContext, paramAttributeSet, paramInt);
    s0.a((View)this, getContext());
    e e1 = new e((View)this);
    this.b = e1;
    e1.d(paramAttributeSet, paramInt);
    y y1 = new y((TextView)this);
    this.c = y1;
    y1.e(paramAttributeSet, paramInt);
    this.c.b();
    this.d = new x((TextView)this);
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
  
  public Editable getText() {
    return (Build.VERSION.SDK_INT >= 28) ? super.getText() : getEditableText();
  }
  
  public TextClassifier getTextClassifier() {
    if (Build.VERSION.SDK_INT < 28) {
      x x1 = this.d;
      if (x1 != null)
        return x1.a(); 
    } 
    return super.getTextClassifier();
  }
  
  public InputConnection onCreateInputConnection(EditorInfo paramEditorInfo) {
    InputConnection inputConnection = super.onCreateInputConnection(paramEditorInfo);
    a.c0(inputConnection, paramEditorInfo, (View)this);
    return inputConnection;
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
  
  public void setCustomSelectionActionModeCallback(ActionMode.Callback paramCallback) {
    super.setCustomSelectionActionModeCallback(a.D0((TextView)this, paramCallback));
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
}


/* Location:              C:\Users\panch\Downloads\dvba_v1.1.0-dex2jar.jar!\b\b\p\k.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */