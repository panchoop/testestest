package b.b.p;

import a.a.a.a.a;
import android.content.Context;
import android.util.AttributeSet;
import android.view.ActionMode;
import android.view.View;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.widget.CheckedTextView;
import android.widget.TextView;
import b.b.l.a.a;

public class h extends CheckedTextView {
  public static final int[] c = new int[] { 16843016 };
  
  public final y b;
  
  public h(Context paramContext, AttributeSet paramAttributeSet) {
    super(paramContext, paramAttributeSet, 16843720);
    s0.a((View)this, getContext());
    y y1 = new y((TextView)this);
    this.b = y1;
    y1.e(paramAttributeSet, 16843720);
    this.b.b();
    x0 x0 = x0.q(getContext(), paramAttributeSet, c, 16843720, 0);
    setCheckMarkDrawable(x0.g(0));
    x0.b.recycle();
  }
  
  public void drawableStateChanged() {
    super.drawableStateChanged();
    y y1 = this.b;
    if (y1 != null)
      y1.b(); 
  }
  
  public InputConnection onCreateInputConnection(EditorInfo paramEditorInfo) {
    InputConnection inputConnection = super.onCreateInputConnection(paramEditorInfo);
    a.c0(inputConnection, paramEditorInfo, (View)this);
    return inputConnection;
  }
  
  public void setCheckMarkDrawable(int paramInt) {
    setCheckMarkDrawable(a.b(getContext(), paramInt));
  }
  
  public void setCustomSelectionActionModeCallback(ActionMode.Callback paramCallback) {
    super.setCustomSelectionActionModeCallback(a.D0((TextView)this, paramCallback));
  }
  
  public void setTextAppearance(Context paramContext, int paramInt) {
    super.setTextAppearance(paramContext, paramInt);
    y y1 = this.b;
    if (y1 != null)
      y1.f(paramContext, paramInt); 
  }
}


/* Location:              C:\Users\panch\Downloads\dvba_v1.1.0-dex2jar.jar!\b\b\p\h.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */