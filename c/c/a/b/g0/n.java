package c.c.a.b.g0;

import android.content.Context;
import com.google.android.material.internal.CheckableImageButton;
import com.google.android.material.textfield.TextInputLayout;

public abstract class n {
  public TextInputLayout a;
  
  public Context b;
  
  public CheckableImageButton c;
  
  public n(TextInputLayout paramTextInputLayout) {
    this.a = paramTextInputLayout;
    this.b = paramTextInputLayout.getContext();
    this.c = paramTextInputLayout.getEndIconView();
  }
  
  public abstract void a();
  
  public boolean b(int paramInt) {
    return true;
  }
  
  public boolean c() {
    return false;
  }
}


/* Location:              C:\Users\panch\Downloads\dvba_v1.1.0-dex2jar.jar!\c\c\a\b\g0\n.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */