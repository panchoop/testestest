package c.c.a.b.g0;

import android.text.Editable;
import android.text.TextWatcher;
import android.text.method.PasswordTransformationMethod;
import android.text.method.TransformationMethod;
import android.view.View;
import android.widget.EditText;
import c.c.a.b.e;
import c.c.a.b.i;
import com.google.android.material.textfield.TextInputLayout;

public class q extends n {
  public final TextWatcher d = new a(this);
  
  public final TextInputLayout.f e = new b(this);
  
  public final TextInputLayout.g f = new c(this);
  
  public q(TextInputLayout paramTextInputLayout) {
    super(paramTextInputLayout);
  }
  
  public static boolean d(q paramq) {
    boolean bool;
    EditText editText = paramq.a.getEditText();
    if (editText != null && editText.getTransformationMethod() instanceof PasswordTransformationMethod) {
      bool = true;
    } else {
      bool = false;
    } 
    return bool;
  }
  
  public void a() {
    this.a.setEndIconDrawable(b.b.l.a.a.b(this.b, e.design_password_eye));
    TextInputLayout textInputLayout1 = this.a;
    textInputLayout1.setEndIconContentDescription(textInputLayout1.getResources().getText(i.password_toggle_content_description));
    this.a.setEndIconOnClickListener(new d(this));
    this.a.a(this.e);
    TextInputLayout textInputLayout2 = this.a;
    TextInputLayout.g g1 = this.f;
    textInputLayout2.R.add(g1);
  }
  
  public class a implements TextWatcher {
    public final q b;
    
    public a(q this$0) {}
    
    public void afterTextChanged(Editable param1Editable) {}
    
    public void beforeTextChanged(CharSequence param1CharSequence, int param1Int1, int param1Int2, int param1Int3) {
      q q1 = this.b;
      q1.c.setChecked(q.d(q1) ^ true);
    }
    
    public void onTextChanged(CharSequence param1CharSequence, int param1Int1, int param1Int2, int param1Int3) {}
  }
  
  public class b implements TextInputLayout.f {
    public final q a;
    
    public b(q this$0) {}
    
    public void a(TextInputLayout param1TextInputLayout) {
      EditText editText = param1TextInputLayout.getEditText();
      param1TextInputLayout.setEndIconVisible(true);
      q q1 = this.a;
      q1.c.setChecked(q.d(q1) ^ true);
      editText.removeTextChangedListener(this.a.d);
      editText.addTextChangedListener(this.a.d);
    }
  }
  
  public class c implements TextInputLayout.g {
    public c(q this$0) {}
    
    public void a(TextInputLayout param1TextInputLayout, int param1Int) {
      EditText editText = param1TextInputLayout.getEditText();
      if (editText != null && param1Int == 1)
        editText.setTransformationMethod((TransformationMethod)PasswordTransformationMethod.getInstance()); 
    }
  }
  
  public class d implements View.OnClickListener {
    public final q b;
    
    public d(q this$0) {}
    
    public void onClick(View param1View) {
      PasswordTransformationMethod passwordTransformationMethod;
      EditText editText = this.b.a.getEditText();
      if (editText == null)
        return; 
      int i = editText.getSelectionEnd();
      if (q.d(this.b)) {
        param1View = null;
      } else {
        passwordTransformationMethod = PasswordTransformationMethod.getInstance();
      } 
      editText.setTransformationMethod((TransformationMethod)passwordTransformationMethod);
      if (i >= 0)
        editText.setSelection(i); 
    }
  }
}


/* Location:              C:\Users\panch\Downloads\dvba_v1.1.0-dex2jar.jar!\c\c\a\b\g0\q.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */