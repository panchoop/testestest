package c.c.a.b.x;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.StateListAnimator;
import android.content.res.ColorStateList;
import android.graphics.Rect;
import android.os.Build;
import android.view.View;
import c.c.a.b.c0.b;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import java.util.ArrayList;

public class h extends e {
  public h(FloatingActionButton paramFloatingActionButton, b paramb) {
    super(paramFloatingActionButton, paramb);
  }
  
  public float c() {
    return this.t.getElevation();
  }
  
  public void d(Rect paramRect) {
    if (((FloatingActionButton.b)this.u).a.k) {
      super.d(paramRect);
    } else {
      boolean bool = r();
      int i = 0;
      if (!bool)
        i = (0 - this.t.getSizeDimension()) / 2; 
      paramRect.set(i, i, i, i);
    } 
  }
  
  public void g() {}
  
  public void h() {
    t();
  }
  
  public void i(int[] paramArrayOfint) {
    // Byte code:
    //   0: getstatic android/os/Build$VERSION.SDK_INT : I
    //   3: bipush #21
    //   5: if_icmpne -> 107
    //   8: aload_0
    //   9: getfield t : Lcom/google/android/material/floatingactionbutton/FloatingActionButton;
    //   12: invokevirtual isEnabled : ()Z
    //   15: istore_3
    //   16: fconst_0
    //   17: fstore_2
    //   18: iload_3
    //   19: ifeq -> 89
    //   22: aload_0
    //   23: getfield t : Lcom/google/android/material/floatingactionbutton/FloatingActionButton;
    //   26: aload_0
    //   27: getfield e : F
    //   30: invokevirtual setElevation : (F)V
    //   33: aload_0
    //   34: getfield t : Lcom/google/android/material/floatingactionbutton/FloatingActionButton;
    //   37: invokevirtual isPressed : ()Z
    //   40: ifeq -> 56
    //   43: aload_0
    //   44: getfield t : Lcom/google/android/material/floatingactionbutton/FloatingActionButton;
    //   47: astore_1
    //   48: aload_0
    //   49: getfield g : F
    //   52: fstore_2
    //   53: goto -> 102
    //   56: aload_0
    //   57: getfield t : Lcom/google/android/material/floatingactionbutton/FloatingActionButton;
    //   60: invokevirtual isFocused : ()Z
    //   63: ifne -> 76
    //   66: aload_0
    //   67: getfield t : Lcom/google/android/material/floatingactionbutton/FloatingActionButton;
    //   70: invokevirtual isHovered : ()Z
    //   73: ifeq -> 97
    //   76: aload_0
    //   77: getfield t : Lcom/google/android/material/floatingactionbutton/FloatingActionButton;
    //   80: astore_1
    //   81: aload_0
    //   82: getfield f : F
    //   85: fstore_2
    //   86: goto -> 102
    //   89: aload_0
    //   90: getfield t : Lcom/google/android/material/floatingactionbutton/FloatingActionButton;
    //   93: fconst_0
    //   94: invokevirtual setElevation : (F)V
    //   97: aload_0
    //   98: getfield t : Lcom/google/android/material/floatingactionbutton/FloatingActionButton;
    //   101: astore_1
    //   102: aload_1
    //   103: fload_2
    //   104: invokevirtual setTranslationZ : (F)V
    //   107: return
  }
  
  public void j(float paramFloat1, float paramFloat2, float paramFloat3) {
    if (Build.VERSION.SDK_INT == 21) {
      this.t.refreshDrawableState();
    } else {
      StateListAnimator stateListAnimator = new StateListAnimator();
      stateListAnimator.addState(e.B, u(paramFloat1, paramFloat3));
      stateListAnimator.addState(e.C, u(paramFloat1, paramFloat2));
      stateListAnimator.addState(e.D, u(paramFloat1, paramFloat2));
      stateListAnimator.addState(e.E, u(paramFloat1, paramFloat2));
      AnimatorSet animatorSet = new AnimatorSet();
      ArrayList<ObjectAnimator> arrayList = new ArrayList();
      arrayList.add(ObjectAnimator.ofFloat(this.t, "elevation", new float[] { paramFloat1 }).setDuration(0L));
      int i = Build.VERSION.SDK_INT;
      if (i >= 22 && i <= 24) {
        FloatingActionButton floatingActionButton = this.t;
        arrayList.add(ObjectAnimator.ofFloat(floatingActionButton, View.TRANSLATION_Z, new float[] { floatingActionButton.getTranslationZ() }).setDuration(100L));
      } 
      arrayList.add(ObjectAnimator.ofFloat(this.t, View.TRANSLATION_Z, new float[] { 0.0F }).setDuration(100L));
      animatorSet.playSequentially(arrayList.<Animator>toArray(new Animator[0]));
      animatorSet.setInterpolator(e.A);
      stateListAnimator.addState(e.F, (Animator)animatorSet);
      stateListAnimator.addState(e.G, u(0.0F, 0.0F));
      this.t.setStateListAnimator(stateListAnimator);
    } 
    if (p())
      t(); 
  }
  
  public boolean m() {
    return false;
  }
  
  public void o(ColorStateList paramColorStateList) {}
  
  public boolean p() {
    return (((FloatingActionButton.b)this.u).a.k || !r());
  }
  
  public void s() {}
  
  public final Animator u(float paramFloat1, float paramFloat2) {
    AnimatorSet animatorSet = new AnimatorSet();
    animatorSet.play((Animator)ObjectAnimator.ofFloat(this.t, "elevation", new float[] { paramFloat1 }).setDuration(0L)).with((Animator)ObjectAnimator.ofFloat(this.t, View.TRANSLATION_Z, new float[] { paramFloat2 }).setDuration(100L));
    animatorSet.setInterpolator(e.A);
    return (Animator)animatorSet;
  }
}


/* Location:              C:\Users\panch\Downloads\dvba_v1.1.0-dex2jar.jar!\c\c\a\b\x\h.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */