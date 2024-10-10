package c.c.a.b.g0;

import android.animation.Animator;
import android.animation.ValueAnimator;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.StateListDrawable;
import android.os.Build;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityManager;
import android.widget.AutoCompleteTextView;
import android.widget.EditText;
import android.widget.Spinner;
import b.i.m.l;
import c.c.a.b.d0.g;
import c.c.a.b.d0.j;
import c.c.a.b.e;
import c.c.a.b.i;
import com.google.android.material.textfield.TextInputLayout;

public class h extends n {
  public final TextWatcher d = new a(this);
  
  public final TextInputLayout.e e = new b(this, this.a);
  
  public final TextInputLayout.f f = new c(this);
  
  public boolean g = false;
  
  public boolean h = false;
  
  public long i = Long.MAX_VALUE;
  
  public StateListDrawable j;
  
  public g k;
  
  public AccessibilityManager l;
  
  public ValueAnimator m;
  
  public ValueAnimator n;
  
  public h(TextInputLayout paramTextInputLayout) {
    super(paramTextInputLayout);
  }
  
  public static AutoCompleteTextView d(h paramh, EditText paramEditText) {
    if (paramh != null) {
      if (paramEditText instanceof AutoCompleteTextView)
        return (AutoCompleteTextView)paramEditText; 
      throw new RuntimeException("EditText needs to be an AutoCompleteTextView if an Exposed Dropdown Menu is being used.");
    } 
    throw null;
  }
  
  public static void e(h paramh, boolean paramBoolean) {
    if (paramh.h != paramBoolean) {
      paramh.h = paramBoolean;
      paramh.n.cancel();
      paramh.m.start();
    } 
  }
  
  public static void f(h paramh, AutoCompleteTextView paramAutoCompleteTextView) {
    if (paramh != null) {
      if (paramAutoCompleteTextView != null) {
        if (paramh.h())
          paramh.g = false; 
        if (!paramh.g) {
          int i = paramh.h;
          int j = i ^ 0x1;
          if (i != j) {
            paramh.h = j;
            paramh.n.cancel();
            paramh.m.start();
          } 
          if (paramh.h) {
            paramAutoCompleteTextView.requestFocus();
            paramAutoCompleteTextView.showDropDown();
          } else {
            paramAutoCompleteTextView.dismissDropDown();
          } 
        } else {
          paramh.g = false;
        } 
      } 
      return;
    } 
    throw null;
  }
  
  public void a() {
    float f2 = this.b.getResources().getDimensionPixelOffset(c.c.a.b.d.mtrl_shape_corner_size_small_component);
    float f1 = this.b.getResources().getDimensionPixelOffset(c.c.a.b.d.mtrl_exposed_dropdown_menu_popup_elevation);
    int i = this.b.getResources().getDimensionPixelOffset(c.c.a.b.d.mtrl_exposed_dropdown_menu_popup_vertical_padding);
    g g2 = g(f2, f2, f1, i);
    g g1 = g(0.0F, f2, f1, i);
    this.k = g2;
    StateListDrawable stateListDrawable = new StateListDrawable();
    this.j = stateListDrawable;
    stateListDrawable.addState(new int[] { 16842922 }, (Drawable)g2);
    this.j.addState(new int[0], (Drawable)g1);
    i = e.mtrl_dropdown_arrow;
    this.a.setEndIconDrawable(b.b.l.a.a.b(this.b, i));
    TextInputLayout textInputLayout = this.a;
    textInputLayout.setEndIconContentDescription(textInputLayout.getResources().getText(i.exposed_dropdown_menu_content_description));
    this.a.setEndIconOnClickListener(new d(this));
    this.a.a(this.f);
    ValueAnimator valueAnimator = ValueAnimator.ofFloat(new float[] { 0.0F, 1.0F });
    valueAnimator.setInterpolator(c.c.a.b.l.a.a);
    valueAnimator.setDuration(67L);
    valueAnimator.addUpdateListener(new m(this));
    this.n = valueAnimator;
    valueAnimator = ValueAnimator.ofFloat(new float[] { 1.0F, 0.0F });
    valueAnimator.setInterpolator(c.c.a.b.l.a.a);
    valueAnimator.setDuration(50L);
    valueAnimator.addUpdateListener(new m(this));
    this.m = valueAnimator;
    valueAnimator.addListener((Animator.AnimatorListener)new l(this));
    l.d0((View)this.c, 2);
    this.l = (AccessibilityManager)this.b.getSystemService("accessibility");
  }
  
  public boolean b(int paramInt) {
    boolean bool;
    if (paramInt != 0) {
      bool = true;
    } else {
      bool = false;
    } 
    return bool;
  }
  
  public boolean c() {
    return true;
  }
  
  public final g g(float paramFloat1, float paramFloat2, float paramFloat3, int paramInt) {
    j.b b = new j.b();
    b.e = (c.c.a.b.d0.c)new c.c.a.b.d0.a(paramFloat1);
    b.f = (c.c.a.b.d0.c)new c.c.a.b.d0.a(paramFloat1);
    b.h = (c.c.a.b.d0.c)new c.c.a.b.d0.a(paramFloat2);
    b.g = (c.c.a.b.d0.c)new c.c.a.b.d0.a(paramFloat2);
    j j = b.a();
    g g1 = g.f(this.b, paramFloat3);
    g1.b.a = j;
    g1.invalidateSelf();
    g.b b1 = g1.b;
    if (b1.i == null)
      b1.i = new Rect(); 
    g1.b.i.set(0, paramInt, 0, paramInt);
    g1.u = g1.b.i;
    g1.invalidateSelf();
    return g1;
  }
  
  public final boolean h() {
    long l = System.currentTimeMillis() - this.i;
    return (l < 0L || l > 300L);
  }
  
  public class a implements TextWatcher {
    public final h b;
    
    public a(h this$0) {}
    
    public void afterTextChanged(Editable param1Editable) {
      h h1 = this.b;
      AutoCompleteTextView autoCompleteTextView = h.d(h1, h1.a.getEditText());
      autoCompleteTextView.post(new a(this, autoCompleteTextView));
    }
    
    public void beforeTextChanged(CharSequence param1CharSequence, int param1Int1, int param1Int2, int param1Int3) {}
    
    public void onTextChanged(CharSequence param1CharSequence, int param1Int1, int param1Int2, int param1Int3) {}
    
    public class a implements Runnable {
      public final AutoCompleteTextView b;
      
      public final h.a c;
      
      public a(h.a this$0, AutoCompleteTextView param2AutoCompleteTextView) {}
      
      public void run() {
        boolean bool = this.b.isPopupShowing();
        h.e(this.c.b, bool);
        this.c.b.g = bool;
      }
    }
  }
  
  public class a implements Runnable {
    public final AutoCompleteTextView b;
    
    public final h.a c;
    
    public a(h this$0, AutoCompleteTextView param1AutoCompleteTextView) {}
    
    public void run() {
      boolean bool = this.b.isPopupShowing();
      h.e(this.c.b, bool);
      this.c.b.g = bool;
    }
  }
  
  public class b extends TextInputLayout.e {
    public final h e;
    
    public b(h this$0, TextInputLayout param1TextInputLayout) {
      super(param1TextInputLayout);
    }
    
    public void d(View param1View, b.i.m.v.b param1b) {
      boolean bool;
      super.d(param1View, param1b);
      String str = Spinner.class.getName();
      param1b.a.setClassName(str);
      if (Build.VERSION.SDK_INT >= 26) {
        bool = param1b.a.isShowingHintText();
      } else {
        Bundle bundle = param1b.f();
        if (bundle != null && (bundle.getInt("androidx.view.accessibility.AccessibilityNodeInfoCompat.BOOLEAN_PROPERTY_KEY", 0) & 0x4) == 4) {
          bool = true;
        } else {
          bool = false;
        } 
      } 
      if (bool)
        param1b.k(null); 
    }
    
    public void e(View param1View, AccessibilityEvent param1AccessibilityEvent) {
      ((b.i.m.a)this).a.onPopulateAccessibilityEvent(param1View, param1AccessibilityEvent);
      h h1 = this.e;
      AutoCompleteTextView autoCompleteTextView = h.d(h1, h1.a.getEditText());
      if (param1AccessibilityEvent.getEventType() == 1 && this.e.l.isTouchExplorationEnabled())
        h.f(this.e, autoCompleteTextView); 
    }
  }
  
  public class c implements TextInputLayout.f {
    public final h a;
    
    public c(h this$0) {}
    
    public void a(TextInputLayout param1TextInputLayout) {
      // Byte code:
      //   0: aload_0
      //   1: getfield a : Lc/c/a/b/g0/h;
      //   4: aload_1
      //   5: invokevirtual getEditText : ()Landroid/widget/EditText;
      //   8: invokestatic d : (Lc/c/a/b/g0/h;Landroid/widget/EditText;)Landroid/widget/AutoCompleteTextView;
      //   11: astore #5
      //   13: aload_0
      //   14: getfield a : Lc/c/a/b/g0/h;
      //   17: astore #4
      //   19: aload #4
      //   21: getfield a : Lcom/google/android/material/textfield/TextInputLayout;
      //   24: invokevirtual getBoxBackgroundMode : ()I
      //   27: istore_2
      //   28: iload_2
      //   29: iconst_2
      //   30: if_icmpne -> 43
      //   33: aload #4
      //   35: getfield k : Lc/c/a/b/d0/g;
      //   38: astore #4
      //   40: goto -> 55
      //   43: iload_2
      //   44: iconst_1
      //   45: if_icmpne -> 62
      //   48: aload #4
      //   50: getfield j : Landroid/graphics/drawable/StateListDrawable;
      //   53: astore #4
      //   55: aload #5
      //   57: aload #4
      //   59: invokevirtual setDropDownBackgroundDrawable : (Landroid/graphics/drawable/Drawable;)V
      //   62: aload_0
      //   63: getfield a : Lc/c/a/b/g0/h;
      //   66: astore #6
      //   68: aload #6
      //   70: ifnull -> 457
      //   73: aload #5
      //   75: invokevirtual getKeyListener : ()Landroid/text/method/KeyListener;
      //   78: ifnull -> 84
      //   81: goto -> 348
      //   84: aload #6
      //   86: getfield a : Lcom/google/android/material/textfield/TextInputLayout;
      //   89: invokevirtual getBoxBackgroundMode : ()I
      //   92: istore_3
      //   93: aload #6
      //   95: getfield a : Lcom/google/android/material/textfield/TextInputLayout;
      //   98: invokevirtual getBoxBackground : ()Lc/c/a/b/d0/g;
      //   101: astore #4
      //   103: aload #5
      //   105: getstatic c/c/a/b/b.colorControlHighlight : I
      //   108: invokestatic y : (Landroid/view/View;I)I
      //   111: istore_2
      //   112: iconst_2
      //   113: anewarray [I
      //   116: astore #7
      //   118: aload #7
      //   120: iconst_0
      //   121: iconst_1
      //   122: newarray int
      //   124: dup
      //   125: iconst_0
      //   126: ldc 16842919
      //   128: iastore
      //   129: aastore
      //   130: aload #7
      //   132: iconst_1
      //   133: iconst_0
      //   134: newarray int
      //   136: aastore
      //   137: iload_3
      //   138: iconst_2
      //   139: if_icmpne -> 292
      //   142: aload #5
      //   144: getstatic c/c/a/b/b.colorSurface : I
      //   147: invokestatic y : (Landroid/view/View;I)I
      //   150: istore_3
      //   151: new c/c/a/b/d0/g
      //   154: dup
      //   155: aload #4
      //   157: getfield b : Lc/c/a/b/d0/g$b;
      //   160: getfield a : Lc/c/a/b/d0/j;
      //   163: invokespecial <init> : (Lc/c/a/b/d0/j;)V
      //   166: astore #6
      //   168: iload_2
      //   169: iload_3
      //   170: ldc 0.1
      //   172: invokestatic K : (IIF)I
      //   175: istore_2
      //   176: aload #6
      //   178: new android/content/res/ColorStateList
      //   181: dup
      //   182: aload #7
      //   184: iconst_2
      //   185: newarray int
      //   187: dup
      //   188: iconst_0
      //   189: iload_2
      //   190: iastore
      //   191: dup
      //   192: iconst_1
      //   193: iconst_0
      //   194: iastore
      //   195: invokespecial <init> : ([[I[I)V
      //   198: invokevirtual q : (Landroid/content/res/ColorStateList;)V
      //   201: aload #6
      //   203: iload_3
      //   204: invokevirtual setTint : (I)V
      //   207: new android/content/res/ColorStateList
      //   210: dup
      //   211: aload #7
      //   213: iconst_2
      //   214: newarray int
      //   216: dup
      //   217: iconst_0
      //   218: iload_2
      //   219: iastore
      //   220: dup
      //   221: iconst_1
      //   222: iload_3
      //   223: iastore
      //   224: invokespecial <init> : ([[I[I)V
      //   227: astore #7
      //   229: new c/c/a/b/d0/g
      //   232: dup
      //   233: aload #4
      //   235: getfield b : Lc/c/a/b/d0/g$b;
      //   238: getfield a : Lc/c/a/b/d0/j;
      //   241: invokespecial <init> : (Lc/c/a/b/d0/j;)V
      //   244: astore #8
      //   246: aload #8
      //   248: iconst_m1
      //   249: invokevirtual setTint : (I)V
      //   252: aload #5
      //   254: new android/graphics/drawable/LayerDrawable
      //   257: dup
      //   258: iconst_2
      //   259: anewarray android/graphics/drawable/Drawable
      //   262: dup
      //   263: iconst_0
      //   264: new android/graphics/drawable/RippleDrawable
      //   267: dup
      //   268: aload #7
      //   270: aload #6
      //   272: aload #8
      //   274: invokespecial <init> : (Landroid/content/res/ColorStateList;Landroid/graphics/drawable/Drawable;Landroid/graphics/drawable/Drawable;)V
      //   277: aastore
      //   278: dup
      //   279: iconst_1
      //   280: aload #4
      //   282: aastore
      //   283: invokespecial <init> : ([Landroid/graphics/drawable/Drawable;)V
      //   286: invokestatic Z : (Landroid/view/View;Landroid/graphics/drawable/Drawable;)V
      //   289: goto -> 348
      //   292: iload_3
      //   293: iconst_1
      //   294: if_icmpne -> 348
      //   297: aload #6
      //   299: getfield a : Lcom/google/android/material/textfield/TextInputLayout;
      //   302: invokevirtual getBoxBackgroundColor : ()I
      //   305: istore_3
      //   306: aload #5
      //   308: new android/graphics/drawable/RippleDrawable
      //   311: dup
      //   312: new android/content/res/ColorStateList
      //   315: dup
      //   316: aload #7
      //   318: iconst_2
      //   319: newarray int
      //   321: dup
      //   322: iconst_0
      //   323: iload_2
      //   324: iload_3
      //   325: ldc 0.1
      //   327: invokestatic K : (IIF)I
      //   330: iastore
      //   331: dup
      //   332: iconst_1
      //   333: iload_3
      //   334: iastore
      //   335: invokespecial <init> : ([[I[I)V
      //   338: aload #4
      //   340: aload #4
      //   342: invokespecial <init> : (Landroid/content/res/ColorStateList;Landroid/graphics/drawable/Drawable;Landroid/graphics/drawable/Drawable;)V
      //   345: invokestatic Z : (Landroid/view/View;Landroid/graphics/drawable/Drawable;)V
      //   348: aload_0
      //   349: getfield a : Lc/c/a/b/g0/h;
      //   352: astore #4
      //   354: aload #4
      //   356: ifnull -> 455
      //   359: aload #5
      //   361: new c/c/a/b/g0/i
      //   364: dup
      //   365: aload #4
      //   367: aload #5
      //   369: invokespecial <init> : (Lc/c/a/b/g0/h;Landroid/widget/AutoCompleteTextView;)V
      //   372: invokevirtual setOnTouchListener : (Landroid/view/View$OnTouchListener;)V
      //   375: aload #5
      //   377: new c/c/a/b/g0/j
      //   380: dup
      //   381: aload #4
      //   383: invokespecial <init> : (Lc/c/a/b/g0/h;)V
      //   386: invokevirtual setOnFocusChangeListener : (Landroid/view/View$OnFocusChangeListener;)V
      //   389: aload #5
      //   391: new c/c/a/b/g0/k
      //   394: dup
      //   395: aload #4
      //   397: invokespecial <init> : (Lc/c/a/b/g0/h;)V
      //   400: invokevirtual setOnDismissListener : (Landroid/widget/AutoCompleteTextView$OnDismissListener;)V
      //   403: aload #5
      //   405: iconst_0
      //   406: invokevirtual setThreshold : (I)V
      //   409: aload #5
      //   411: aload_0
      //   412: getfield a : Lc/c/a/b/g0/h;
      //   415: getfield d : Landroid/text/TextWatcher;
      //   418: invokevirtual removeTextChangedListener : (Landroid/text/TextWatcher;)V
      //   421: aload #5
      //   423: aload_0
      //   424: getfield a : Lc/c/a/b/g0/h;
      //   427: getfield d : Landroid/text/TextWatcher;
      //   430: invokevirtual addTextChangedListener : (Landroid/text/TextWatcher;)V
      //   433: aload_1
      //   434: aconst_null
      //   435: invokevirtual setErrorIconDrawable : (Landroid/graphics/drawable/Drawable;)V
      //   438: aload_1
      //   439: aload_0
      //   440: getfield a : Lc/c/a/b/g0/h;
      //   443: getfield e : Lcom/google/android/material/textfield/TextInputLayout$e;
      //   446: invokevirtual setTextInputAccessibilityDelegate : (Lcom/google/android/material/textfield/TextInputLayout$e;)V
      //   449: aload_1
      //   450: iconst_1
      //   451: invokevirtual setEndIconVisible : (Z)V
      //   454: return
      //   455: aconst_null
      //   456: athrow
      //   457: aconst_null
      //   458: athrow
    }
  }
  
  public class d implements View.OnClickListener {
    public final h b;
    
    public d(h this$0) {}
    
    public void onClick(View param1View) {
      AutoCompleteTextView autoCompleteTextView = (AutoCompleteTextView)this.b.a.getEditText();
      h.f(this.b, autoCompleteTextView);
    }
  }
}


/* Location:              C:\Users\panch\Downloads\dvba_v1.1.0-dex2jar.jar!\c\c\a\b\g0\h.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */