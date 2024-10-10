package com.google.android.material.textfield;

import android.content.Context;
import android.os.Build;
import android.util.AttributeSet;
import android.view.ViewParent;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import b.b.p.k;
import c.c.a.b.b;

public class TextInputEditText extends k {
  public TextInputEditText(Context paramContext, AttributeSet paramAttributeSet) {
    super(paramContext, paramAttributeSet, b.editTextStyle);
  }
  
  private CharSequence getHintFromLayout() {
    TextInputLayout textInputLayout = getTextInputLayout();
    if (textInputLayout != null) {
      CharSequence charSequence = textInputLayout.getHint();
    } else {
      textInputLayout = null;
    } 
    return (CharSequence)textInputLayout;
  }
  
  private TextInputLayout getTextInputLayout() {
    for (ViewParent viewParent = getParent(); viewParent instanceof android.view.View; viewParent = viewParent.getParent()) {
      if (viewParent instanceof TextInputLayout)
        return (TextInputLayout)viewParent; 
    } 
    return null;
  }
  
  public CharSequence getHint() {
    TextInputLayout textInputLayout = getTextInputLayout();
    return (textInputLayout != null && textInputLayout.q) ? textInputLayout.getHint() : super.getHint();
  }
  
  public void onAttachedToWindow() {
    super.onAttachedToWindow();
    TextInputLayout textInputLayout = getTextInputLayout();
    if (textInputLayout != null && textInputLayout.q && super.getHint() == null && Build.MANUFACTURER.equalsIgnoreCase("Meizu"))
      setHint(""); 
  }
  
  public InputConnection onCreateInputConnection(EditorInfo paramEditorInfo) {
    InputConnection inputConnection = super.onCreateInputConnection(paramEditorInfo);
    if (inputConnection != null && paramEditorInfo.hintText == null)
      paramEditorInfo.hintText = getHintFromLayout(); 
    return inputConnection;
  }
}


/* Location:              C:\Users\panch\Downloads\dvba_v1.1.0-dex2jar.jar!\com\google\android\material\textfield\TextInputEditText.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */