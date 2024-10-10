package c.c.a.b.g0;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ValueAnimator;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import android.widget.EditText;
import c.c.a.b.e;
import c.c.a.b.i;
import com.google.android.material.textfield.TextInputLayout;

public class a extends n {
  public final TextWatcher d = new a(this);
  
  public final TextInputLayout.f e = new b(this);
  
  public AnimatorSet f;
  
  public ValueAnimator g;
  
  public a(TextInputLayout paramTextInputLayout) {
    super(paramTextInputLayout);
  }
  
  public void a() {
    this.a.setEndIconDrawable(b.b.l.a.a.b(this.b, e.mtrl_ic_cancel));
    TextInputLayout textInputLayout = this.a;
    textInputLayout.setEndIconContentDescription(textInputLayout.getResources().getText(i.clear_text_end_icon_content_description));
    this.a.setEndIconOnClickListener(new c(this));
    this.a.a(this.e);
    ValueAnimator valueAnimator2 = ValueAnimator.ofFloat(new float[] { 0.8F, 1.0F });
    valueAnimator2.setInterpolator(c.c.a.b.l.a.d);
    valueAnimator2.setDuration(150L);
    valueAnimator2.addUpdateListener(new e(this));
    ValueAnimator valueAnimator3 = ValueAnimator.ofFloat(new float[] { 0.0F, 1.0F });
    valueAnimator3.setInterpolator(c.c.a.b.l.a.a);
    valueAnimator3.setDuration(100L);
    valueAnimator3.addUpdateListener(new d(this));
    AnimatorSet animatorSet = new AnimatorSet();
    this.f = animatorSet;
    animatorSet.playTogether(new Animator[] { (Animator)valueAnimator2, (Animator)valueAnimator3 });
    this.f.addListener((Animator.AnimatorListener)new b(this));
    ValueAnimator valueAnimator1 = ValueAnimator.ofFloat(new float[] { 1.0F, 0.0F });
    valueAnimator1.setInterpolator(c.c.a.b.l.a.a);
    valueAnimator1.setDuration(100L);
    valueAnimator1.addUpdateListener(new d(this));
    this.g = valueAnimator1;
    valueAnimator1.addListener((Animator.AnimatorListener)new c(this));
  }
  
  public class a implements TextWatcher {
    public final a b;
    
    public a(a this$0) {}
    
    public void afterTextChanged(Editable param1Editable) {
      boolean bool;
      if (param1Editable.length() > 0) {
        bool = true;
      } else {
        bool = false;
      } 
      if (bool) {
        if (!this.b.a.j()) {
          this.b.g.cancel();
          this.b.f.start();
        } 
      } else {
        this.b.f.cancel();
        this.b.g.start();
      } 
    }
    
    public void beforeTextChanged(CharSequence param1CharSequence, int param1Int1, int param1Int2, int param1Int3) {}
    
    public void onTextChanged(CharSequence param1CharSequence, int param1Int1, int param1Int2, int param1Int3) {}
  }
  
  public class b implements TextInputLayout.f {
    public final a a;
    
    public b(a this$0) {}
    
    public void a(TextInputLayout param1TextInputLayout) {
      boolean bool;
      EditText editText = param1TextInputLayout.getEditText();
      if (editText.getText().length() > 0) {
        bool = true;
      } else {
        bool = false;
      } 
      param1TextInputLayout.setEndIconVisible(bool);
      param1TextInputLayout.setEndIconCheckable(false);
      editText.removeTextChangedListener(this.a.d);
      editText.addTextChangedListener(this.a.d);
    }
  }
  
  public class c implements View.OnClickListener {
    public final a b;
    
    public c(a this$0) {}
    
    public void onClick(View param1View) {
      this.b.a.getEditText().setText(null);
    }
  }
}


/* Location:              C:\Users\panch\Downloads\dvba_v1.1.0-dex2jar.jar!\c\c\a\b\g0\a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */