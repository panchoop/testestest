package c.c.a.b.g0;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Typeface;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.Space;
import android.widget.TextView;
import b.i.m.l;
import c.c.a.a.c.l.q;
import c.c.a.b.d;
import com.google.android.material.textfield.TextInputLayout;
import java.util.ArrayList;
import java.util.List;

public final class o {
  public final Context a;
  
  public final TextInputLayout b;
  
  public LinearLayout c;
  
  public int d;
  
  public FrameLayout e;
  
  public int f;
  
  public Animator g;
  
  public final float h;
  
  public int i;
  
  public int j;
  
  public CharSequence k;
  
  public boolean l;
  
  public TextView m;
  
  public int n;
  
  public ColorStateList o;
  
  public CharSequence p;
  
  public boolean q;
  
  public TextView r;
  
  public int s;
  
  public ColorStateList t;
  
  public Typeface u;
  
  public o(TextInputLayout paramTextInputLayout) {
    Context context = paramTextInputLayout.getContext();
    this.a = context;
    this.b = paramTextInputLayout;
    this.h = context.getResources().getDimensionPixelSize(d.design_textinput_caption_translate_y);
  }
  
  public void a(TextView paramTextView, int paramInt) {
    boolean bool;
    if (this.c == null && this.e == null) {
      LinearLayout linearLayout = new LinearLayout(this.a);
      this.c = linearLayout;
      linearLayout.setOrientation(0);
      this.b.addView((View)this.c, -1, -2);
      FrameLayout frameLayout = new FrameLayout(this.a);
      this.e = frameLayout;
      this.c.addView((View)frameLayout, -1, (ViewGroup.LayoutParams)new FrameLayout.LayoutParams(-2, -2));
      Space space = new Space(this.a);
      LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(0, 0, 1.0F);
      this.c.addView((View)space, (ViewGroup.LayoutParams)layoutParams);
      if (this.b.getEditText() != null)
        b(); 
    } 
    if (paramInt == 0 || paramInt == 1) {
      bool = true;
    } else {
      bool = false;
    } 
    if (bool) {
      this.e.setVisibility(0);
      this.e.addView((View)paramTextView);
      this.f++;
    } else {
      this.c.addView((View)paramTextView, paramInt);
    } 
    this.c.setVisibility(0);
    this.d++;
  }
  
  public void b() {
    boolean bool;
    if (this.c != null && this.b.getEditText() != null) {
      bool = true;
    } else {
      bool = false;
    } 
    if (bool)
      this.c.setPaddingRelative(l.v((View)this.b.getEditText()), 0, this.b.getEditText().getPaddingEnd(), 0); 
  }
  
  public void c() {
    Animator animator = this.g;
    if (animator != null)
      animator.cancel(); 
  }
  
  public final void d(List<Animator> paramList, boolean paramBoolean, TextView paramTextView, int paramInt1, int paramInt2, int paramInt3) {
    if (paramTextView != null && paramBoolean && (paramInt1 == paramInt3 || paramInt1 == paramInt2)) {
      float f;
      if (paramInt3 == paramInt1) {
        paramInt2 = 1;
      } else {
        paramInt2 = 0;
      } 
      if (paramInt2 != 0) {
        f = 1.0F;
      } else {
        f = 0.0F;
      } 
      ObjectAnimator objectAnimator = ObjectAnimator.ofFloat(paramTextView, View.ALPHA, new float[] { f });
      objectAnimator.setDuration(167L);
      objectAnimator.setInterpolator(c.c.a.b.l.a.a);
      paramList.add(objectAnimator);
      if (paramInt3 == paramInt1) {
        ObjectAnimator objectAnimator1 = ObjectAnimator.ofFloat(paramTextView, View.TRANSLATION_Y, new float[] { -this.h, 0.0F });
        objectAnimator1.setDuration(217L);
        objectAnimator1.setInterpolator(c.c.a.b.l.a.d);
        paramList.add(objectAnimator1);
      } 
    } 
  }
  
  public boolean e() {
    int i = this.j;
    boolean bool = true;
    if (i != 1 || this.m == null || TextUtils.isEmpty(this.k))
      bool = false; 
    return bool;
  }
  
  public final TextView f(int paramInt) {
    return (paramInt != 1) ? ((paramInt != 2) ? null : this.r) : this.m;
  }
  
  public int g() {
    byte b;
    TextView textView = this.m;
    if (textView != null) {
      b = textView.getCurrentTextColor();
    } else {
      b = -1;
    } 
    return b;
  }
  
  public void h() {
    this.k = null;
    c();
    if (this.i == 1) {
      boolean bool;
      if (this.q && !TextUtils.isEmpty(this.p)) {
        bool = true;
      } else {
        bool = false;
      } 
      this.j = bool;
    } 
    k(this.i, this.j, j(this.m, null));
  }
  
  public void i(TextView paramTextView, int paramInt) {
    // Byte code:
    //   0: aload_0
    //   1: getfield c : Landroid/widget/LinearLayout;
    //   4: ifnonnull -> 8
    //   7: return
    //   8: iload_2
    //   9: ifeq -> 25
    //   12: iload_2
    //   13: iconst_1
    //   14: if_icmpne -> 20
    //   17: goto -> 25
    //   20: iconst_0
    //   21: istore_2
    //   22: goto -> 27
    //   25: iconst_1
    //   26: istore_2
    //   27: iload_2
    //   28: ifeq -> 73
    //   31: aload_0
    //   32: getfield e : Landroid/widget/FrameLayout;
    //   35: astore_3
    //   36: aload_3
    //   37: ifnull -> 73
    //   40: aload_0
    //   41: getfield f : I
    //   44: iconst_1
    //   45: isub
    //   46: istore_2
    //   47: aload_0
    //   48: iload_2
    //   49: putfield f : I
    //   52: iload_2
    //   53: ifne -> 62
    //   56: aload_3
    //   57: bipush #8
    //   59: invokevirtual setVisibility : (I)V
    //   62: aload_0
    //   63: getfield e : Landroid/widget/FrameLayout;
    //   66: aload_1
    //   67: invokevirtual removeView : (Landroid/view/View;)V
    //   70: goto -> 81
    //   73: aload_0
    //   74: getfield c : Landroid/widget/LinearLayout;
    //   77: aload_1
    //   78: invokevirtual removeView : (Landroid/view/View;)V
    //   81: aload_0
    //   82: getfield d : I
    //   85: iconst_1
    //   86: isub
    //   87: istore_2
    //   88: aload_0
    //   89: iload_2
    //   90: putfield d : I
    //   93: aload_0
    //   94: getfield c : Landroid/widget/LinearLayout;
    //   97: astore_1
    //   98: iload_2
    //   99: ifne -> 108
    //   102: aload_1
    //   103: bipush #8
    //   105: invokevirtual setVisibility : (I)V
    //   108: return
  }
  
  public final boolean j(TextView paramTextView, CharSequence paramCharSequence) {
    boolean bool;
    if (l.E((View)this.b) && this.b.isEnabled() && (this.j != this.i || paramTextView == null || !TextUtils.equals(paramTextView.getText(), paramCharSequence))) {
      bool = true;
    } else {
      bool = false;
    } 
    return bool;
  }
  
  public final void k(int paramInt1, int paramInt2, boolean paramBoolean) {
    if (paramBoolean) {
      AnimatorSet animatorSet = new AnimatorSet();
      this.g = (Animator)animatorSet;
      ArrayList<Animator> arrayList = new ArrayList();
      d(arrayList, this.q, this.r, 2, paramInt1, paramInt2);
      d(arrayList, this.l, this.m, 1, paramInt1, paramInt2);
      q.N(animatorSet, arrayList);
      animatorSet.addListener((Animator.AnimatorListener)new a(this, paramInt2, f(paramInt1), paramInt1, f(paramInt2)));
      animatorSet.start();
    } else if (paramInt1 != paramInt2) {
      if (paramInt2 != 0) {
        TextView textView = f(paramInt2);
        if (textView != null) {
          textView.setVisibility(0);
          textView.setAlpha(1.0F);
        } 
      } 
      if (paramInt1 != 0) {
        TextView textView = f(paramInt1);
        if (textView != null) {
          textView.setVisibility(4);
          if (paramInt1 == 1)
            textView.setText(null); 
        } 
      } 
      this.i = paramInt2;
    } 
    this.b.s();
    this.b.v(paramBoolean, false);
    this.b.w();
  }
  
  public class a extends AnimatorListenerAdapter {
    public final int a;
    
    public final TextView b;
    
    public final int c;
    
    public final TextView d;
    
    public final o e;
    
    public a(o this$0, int param1Int1, TextView param1TextView1, int param1Int2, TextView param1TextView2) {}
    
    public void onAnimationEnd(Animator param1Animator) {
      o o1 = this.e;
      o1.i = this.a;
      o1.g = null;
      TextView textView = this.b;
      if (textView != null) {
        textView.setVisibility(4);
        if (this.c == 1) {
          textView = this.e.m;
          if (textView != null)
            textView.setText(null); 
        } 
        textView = this.d;
        if (textView != null) {
          textView.setTranslationY(0.0F);
          this.d.setAlpha(1.0F);
        } 
      } 
    }
    
    public void onAnimationStart(Animator param1Animator) {
      TextView textView = this.d;
      if (textView != null)
        textView.setVisibility(0); 
    }
  }
}


/* Location:              C:\Users\panch\Downloads\dvba_v1.1.0-dex2jar.jar!\c\c\a\b\g0\o.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */