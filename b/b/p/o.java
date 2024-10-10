package b.b.p;

import a.a.a.a.a;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.widget.MultiAutoCompleteTextView;
import android.widget.TextView;
import b.b.l.a.a;

public class o extends MultiAutoCompleteTextView {
  public static final int[] d = new int[] { 16843126 };
  
  public final e b;
  
  public final y c;
  
  public o(Context paramContext, AttributeSet paramAttributeSet) {
    super(paramContext, paramAttributeSet, i);
    s0.a((View)this, getContext());
    x0 x0 = x0.q(getContext(), paramAttributeSet, d, i, 0);
    if (x0.o(0))
      setDropDownBackgroundDrawable(x0.g(0)); 
    x0.b.recycle();
    e e1 = new e((View)this);
    this.b = e1;
    e1.d(paramAttributeSet, i);
    y y1 = new y((TextView)this);
    this.c = y1;
    y1.e(paramAttributeSet, i);
    this.c.b();
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
  
  public void setDropDownBackgroundResource(int paramInt) {
    setDropDownBackgroundDrawable(a.b(getContext(), paramInt));
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
}


/* Location:              C:\Users\panch\Downloads\dvba_v1.1.0-dex2jar.jar!\b\b\p\o.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */